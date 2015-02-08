package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class Service_DOControl__Basic {
    private final Service_DOControl instance = new Service_DOControl();

    public void event_INIT(boolean CMD_ON_, boolean OM_, boolean OM_ON_) {
        instance.CMD_ON.value = CMD_ON_;
        instance.OM.value = OM_;
        instance.OM_ON.value = OM_ON_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean CMD_ON_, boolean OM_, boolean OM_ON_) {
        instance.CMD_ON.value = CMD_ON_;
        instance.OM.value = OM_;
        instance.OM_ON.value = OM_ON_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK Service_DOControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class Service_DOControl extends FBInstance
    {
        /** VAR CMD_ON */
        public BOOL CMD_ON = new BOOL();
        /** VAR OM */
        public BOOL OM = new BOOL();
        /** VAR OM_ON */
        public BOOL OM_ON = new BOOL();
        /** VAR OUTPUT */
        public BOOL OUTPUT = new BOOL();
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
        /** Connect the given variable to the input variable CMD_ON
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable OM
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable OM_ON
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
            transition_Service_DOControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_Service_DOControl_1();
        }

        /** The default constructor. */
        public Service_DOControl() {
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
                transition_Service_DOControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_Service_DOControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;
            OUTPUT.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            if (((CMD_ON.value & !OM.value) | (OM.value & OM_ON.value))) {
                OUTPUT.value = true;
            }
            else {
                OUTPUT.value = false;
            };
        }
    }
    private void transition_Service_DOControl_0() {
    }

    private void transition_Service_DOControl_1() {
    }

    private void transition_Service_DOControl_2() {
    }

    private void transition_Service_DOControl_3() {
    }
}