package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class Service_AOControl__Basic {
    private final Service_AOControl instance = new Service_AOControl();

    public void event_INIT(float AOValue_, boolean OM_, float OM_Value_) {
        instance.AOValue.value = AOValue_;
        instance.OM.value = OM_;
        instance.OM_Value.value = OM_Value_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(float AOValue_, boolean OM_, float OM_Value_) {
        instance.AOValue.value = AOValue_;
        instance.OM.value = OM_;
        instance.OM_Value.value = OM_Value_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK Service_AOControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class Service_AOControl extends FBInstance
    {
        /** VAR AOValue */
        public REAL AOValue = new REAL();
        /** VAR OM */
        public BOOL OM = new BOOL();
        /** VAR OM_Value */
        public REAL OM_Value = new REAL();
        /** VAR AO */
        public REAL AO = new REAL();
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
        /** Connect the given variable to the input variable AOValue
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable OM
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable OM_Value
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
            transition_Service_AOControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_Service_AOControl_1();
        }

        /** The default constructor. */
        public Service_AOControl() {
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
                transition_Service_AOControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_Service_AOControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;
            AO.value = (float) (0.0);
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            if (OM.value) {
                AO.value = (float) (OM_Value.value);
            }
            else {
                AO.value = (float) (AOValue.value);
            };
        }
    }
    private void transition_Service_AOControl_0() {
    }

    private void transition_Service_AOControl_1() {
    }

    private void transition_Service_AOControl_2() {
    }

    private void transition_Service_AOControl_3() {
    }
}