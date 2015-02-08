package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class OR__Basic {
    private final OR instance = new OR();

    public void event_INIT(boolean i1_, boolean i3_, boolean i2_) {
        instance.i1.value = i1_;
        instance.i3.value = i3_;
        instance.i2.value = i2_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean i1_, boolean i2_, boolean i3_) {
        instance.i1.value = i1_;
        instance.i2.value = i2_;
        instance.i3.value = i3_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK OR
     * @author JHC
     * @version 20150208/JHC
     */
    private class OR extends FBInstance
    {
        /** Input event qualifier */
        public BOOL i1 = new BOOL();
        /** VAR i2 */
        public BOOL i2 = new BOOL();
        /** VAR i3 */
        public BOOL i3 = new BOOL();
        /** Output event qualifier */
        public BOOL o = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
        /** Initialization Confirm */
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
        /** Connect the given variable to the input variable i1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable i2
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable i3
         * @param newIV The variable to connect
         */
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_INIT = 1;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            INITO.serviceEvent(this);
            state_START();
            transition_OR_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_OR_1();
        }

        /** The default constructor. */
        public OR() {
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
                transition_OR_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_OR_3(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            o.value = i1.value | i2.value | i3.value;

        }

        /** ALGORITHM REQ IN Java*/
        public void alg_REQ() {
            o.value = i1.value | i2.value | i3.value;

        }
    }
    private void transition_OR_0() {
    }

    private void transition_OR_1() {
    }

    private void transition_OR_2() {
    }

    private void transition_OR_3() {
    }
}