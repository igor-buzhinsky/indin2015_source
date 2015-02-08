package transformer;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import org.apache.commons.lang3.ArrayUtils;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import fb.tools.FBELibrarySpec;
import fb.tools.emit.FBJavaEmitter;
import fb.xml.XMLException;

/*
 * (c) Igor Buzhinsky
 */

public class FBDKTransformer {
	public static String transform(String xmlSource) throws IOException, XMLException {
		final ByteOutputStream bos = new ByteOutputStream();
		final PrintWriter boput = new PrintWriter(bos);
		final FBJavaEmitter emitter = new FBJavaEmitter(boput);
		final StringReader sr = new StringReader(xmlSource);		
		final FBELibrarySpec spec = FBELibrarySpec.loadXML(sr, true);
		emitter.emit(spec);
		boput.flush();
		final byte[] res = bos.getBytes();
		return new String(ArrayUtils.subarray(res, 0, bos.size()));
	}
}
