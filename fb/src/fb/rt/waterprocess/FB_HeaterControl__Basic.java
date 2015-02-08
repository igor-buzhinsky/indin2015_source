package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class FB_HeaterControl__Basic {
    private final FB_HeaterControl instance = new FB_HeaterControl();

    public void event_INIT(boolean RequestStart_, boolean ReadyToStart_) {
        instance.RequestStart.value = RequestStart_;
        instance.ReadyToStart.value = ReadyToStart_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean RequestStart_, boolean ReadyToStart_) {
        instance.RequestStart.value = RequestStart_;
        instance.ReadyToStart.value = ReadyToStart_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_HeaterControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_HeaterControl extends FBInstance
    {
        /** VAR RequestStart */
        public BOOL RequestStart = new BOOL();
        /** VAR ReadyToStart */
        public BOOL ReadyToStart = new BOOL();
        /** Output event qualifier */
        public BOOL HeaterOn = new BOOL();
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
        /** Connect the given variable to the input variable RequestStart
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable ReadyToStart
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
            transition_FB_HeaterControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_FB_HeaterControl_1();
        }

        /** The default constructor. */
        public FB_HeaterControl() {
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
                transition_FB_HeaterControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_FB_HeaterControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            HeaterOn.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            if (RequestStart.value & ReadyToStart.value) {
                HeaterOn.value = true;
            }
            else {
                HeaterOn.value = false;
            };
        }
    }
    private void transition_FB_HeaterControl_0() {
    }

    private void transition_FB_HeaterControl_1() {
    }

    private void transition_FB_HeaterControl_2() {
    }

    private void transition_FB_HeaterControl_3() {
    }
}