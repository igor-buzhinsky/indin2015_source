package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class NOT3__Basic {
    private final NOT3 instance = new NOT3();

    public void event_REQ(boolean IN1_, boolean IN2_, boolean IN3_) {
        instance.IN1.value = IN1_;
        instance.IN2.value = IN2_;
        instance.IN3.value = IN3_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK NOT3
     * @author Администратор
     * @version 20150208/Администратор
     */
    private class NOT3 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL IN1 = new BOOL();
        /** VAR IN2 */
        public BOOL IN2 = new BOOL();
        /** VAR IN3 */
        public BOOL IN3 = new BOOL();
        /** Output event qualifier */
        public BOOL OUT1 = new BOOL();
        /** VAR OUT2 */
        public BOOL OUT2 = new BOOL();
        /** VAR OUT3 */
        public BOOL OUT3 = new BOOL();
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
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
        /** Connect the given variable to the input variable IN1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN2
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN3
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
            transition_NOT3_0();
        }

        /** The default constructor. */
        public NOT3() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == REQ) service_REQ();
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_NOT3_1(); 
            }
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            OUT1.value = IN1.value;
            OUT2.value = IN2.value;
            OUT3.value = IN3.value;}
    }
    private void transition_NOT3_0() {
    }

    private void transition_NOT3_1() {
    }
}