package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class NotGate__Basic {
    private final NotGate instance = new NotGate();

    public void event_INIT(boolean QI_) {
        instance.QI.value = QI_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean QI_) {
        instance.QI.value = QI_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 The University of Auckland. All rights reserved. */




    /** FUNCTION_BLOCK NotGate
     * @author Cheng Pang
     * @version 20150208/Cheng Pang
     */
    private class NotGate extends FBInstance
    {
        /** Input event qualifier */
        public BOOL QI = new BOOL();
        /** Output event qualifier */
        public BOOL QO = new BOOL();
        /** EVENT INIT */
        public EventServer INIT = new EventInput(this);
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
        /** EVENT INITO */
        public EventOutput INITO = new EventOutput();
        /** Execution Confirmation */
        public EventOutput CNF = new EventOutput();
        /** {@inheritDoc}
         * @param s {@inheritDoc}
         * @return {@inheritDoc}
         */
        /** {@inheritDoc}
         * @param s {@inheritDoc}
         * @return {@inheritDoc}
         */
        /** {@inheritDoc}
         * @param s {@inheritDoc}
         * @return {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc}
         */
        /** {@inheritDoc}
         * @param s {@inheritDoc}
         * @return {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc}
         */
        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Connect the given variable to the input variable QI
         * @param newIV The variable to connect
         */
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_REQ = 1;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_NotGate_0();
        }
        private static final int index_INIT = 2;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            INITO.serviceEvent(this);
            state_START();
            transition_NotGate_1();
        }

        /** The default constructor. */
        public NotGate() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == REQ) service_REQ();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_NotGate_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_NotGate_3(); 
            }
        }

        /** ALGORITHM REQ IN Java*/
        public void alg_REQ() {
            if (QI.value) {
                QO.value = false;
            }
            else {
                QO.value = true;
            }
            //System.out.println("  NotGate.REQ: ");
            //System.out.println("QI.value = "+QI.value);

        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            if (QI.value) {
                QO.value = false;
            }
            else {
                QO.value = true;
            }
            //System.out.println("  NotGate.INIT: ");
            //System.out.println("QI.value = "+QI.value);

        }
    }
    private void transition_NotGate_0() {
    }

    private void transition_NotGate_1() {
    }

    private void transition_NotGate_2() {
    }

    private void transition_NotGate_3() {
    }
}