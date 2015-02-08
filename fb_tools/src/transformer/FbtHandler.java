package transformer;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * (c) Igor Buzhinsky
 */

public class FbtHandler extends DefaultHandler {
	private String fbName;
	private final String fbPackageName;
	private final FBInterface fbInterface = new FBInterface();
	private BasicFB basic;
	private CompositeFB composite;
	private OtherFB adapter;
	
	private Event currentEvent;
	private FBInstance currentFBInstance;
	private ReaderState state = ReaderState.NONE;
	
	public FbtHandler(String packageName) {
		fbPackageName = packageName;
	}
	
	private enum ReaderState {
		NONE,
		INPUT_EVENTS, OUTPUT_EVENTS,
		INPUT_VARS, OUTPUT_VARS
	}
	
	public FB result() {
		int initCount = (basic == null ? 0 : 1) + (composite == null ? 0 : 1)
				+ (adapter == null ? 0 : 1);
		if (initCount == 0) {
			createServiceOrAdapter();
			// this can happen for some E_* event blocks (pnp)
		}
		return basic != null
				? basic : composite != null
				? composite : adapter;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		String name;
        String type;
		switch (qName) {
		case "FBType":
		case "AdapterType":
			fbName = attributes.getValue("Name");
			break;
		case "EventInputs":
			state = ReaderState.INPUT_EVENTS;
			break;
		case "EventOutputs":
			state = ReaderState.OUTPUT_EVENTS;
			break;
		case "Event":
			name = attributes.getValue("Name");
			currentEvent = new Event(name);
			break;
		case "With":
			String varWith = attributes.getValue("Var");
			currentEvent.addWith(varWith);
			break;
		case "InputVars":
			state = ReaderState.INPUT_VARS;
			break;
		case "OutputVars":
			state = ReaderState.OUTPUT_VARS;
			break;
		case "VarDeclaration":
			name = attributes.getValue("Name");
			type = attributes.getValue("Type");
			final String sArraySize = attributes.getValue("ArraySize");
			final Variable var = new Variable(name, type, sArraySize != null ? Integer.parseInt(sArraySize) : 1);
			if (state == ReaderState.INPUT_VARS) {
				fbInterface.addInputVariable(var);
			} else if (state == ReaderState.OUTPUT_VARS) {
				fbInterface.addOutputVariable(var);
			}
			break;
		case "BasicFB":
			basic = new BasicFB(fbName, fbPackageName, fbInterface);
			break;
		case "FBNetwork":
		case "Sockets":
		case "Plugs":
			ensureCompositeCreated();
			break;
		case "FB":
		case "AdapterDeclaration":
			name = attributes.getValue("Name");
			type = attributes.getValue("Type");
			currentFBInstance = new FBInstance(name, type);
			break;
		case "Service":
			createServiceOrAdapter();
			break;
		}
    }
	
	private void createServiceOrAdapter() {
		adapter = new OtherFB(fbName, fbPackageName, fbInterface);
	}
	
	private void ensureCompositeCreated() {
		if (composite == null) {
			composite = new CompositeFB(fbName, fbPackageName, fbInterface);
		}
	}

	@Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
		switch (qName) {
		case "EventInputs": case "EventOutputs":
		case "InputVars": case "OutputVars": case "InternalVars":
		case "EventConnections": case "DataConnections":
			state = ReaderState.NONE;
			break;
		case "Event":
			assert state == ReaderState.INPUT_EVENTS || state == ReaderState.OUTPUT_EVENTS;
			if (state == ReaderState.INPUT_EVENTS) {
				fbInterface.addInputEvent(currentEvent);
			} else {
				fbInterface.addOutputEvent(currentEvent);
			}
			currentEvent = null;
			break;
		case "FB":
		case "AdapterDeclaration":
			composite.addNested(currentFBInstance);
			currentFBInstance = null;
			break;
		}
    }
}