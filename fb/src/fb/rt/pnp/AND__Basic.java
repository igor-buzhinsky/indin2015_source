package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class AND__Basic {
    private final AND instance = new AND();

    public void event_INIT(boolean Q1_, boolean Q2_) {
        instance.Q1.value = Q1_;
        instance.Q2.value = Q2_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean Q1_, boolean Q2_) {
        instance.Q1.value = Q1_;
        instance.Q2.value = Q2_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK AND
     * @author JHC
     * @version 20150208/JHC
     */
    private class AND extends FBInstance
    {
        /** Input event qualifier */
        public BOOL Q1 = new BOOL();
        /** VAR Q2 */
        public BOOL Q2 = new BOOL();
        /** Output event qualifier */
        public BOOL Q0 = new BOOL();
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
        /** Connect the given variable to the input variable Q1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Q2
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
            transition_AND_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_AND_1();
        }

        /** The default constructor. */
        public AND() {
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
                transition_AND_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_AND_3(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            Q0.value = Q1.value & Q2.value;

        }

        /** ALGORITHM REQ IN Java*/
        public void alg_REQ() {
            Q0.value = Q1.value & Q2.value;

        }
    }
    private void transition_AND_0() {
    }

    private void transition_AND_1() {
    }

    private void transition_AND_2() {
    }

    private void transition_AND_3() {
    }
}