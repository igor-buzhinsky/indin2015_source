package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class Service_DIMeasure__Basic {
    private final Service_DIMeasure instance = new Service_DIMeasure();

    public void event_INIT(boolean DIH_, boolean DIL_) {
        instance.DIH.value = DIH_;
        instance.DIL.value = DIL_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean DIH_, boolean DIL_) {
        instance.DIH.value = DIH_;
        instance.DIL.value = DIL_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK Service_DIMeasure
     * @author wildai
     * @version 20150208/wildai
     */
    private class Service_DIMeasure extends FBInstance
    {
        /** VAR DIH */
        public BOOL DIH = new BOOL();
        /** VAR DIL */
        public BOOL DIL = new BOOL();
        /** VAR AlarmHH */
        public BOOL AlarmHH = new BOOL();
        /** VAR AlarmLL */
        public BOOL AlarmLL = new BOOL();
        /** VAR SensorFault */
        public BOOL SensorFault = new BOOL();
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
        /** Connect the given variable to the input variable DIH
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable DIL
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
            transition_Service_DIMeasure_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_Service_DIMeasure_1();
        }

        /** The default constructor. */
        public Service_DIMeasure() {
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
                transition_Service_DIMeasure_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_Service_DIMeasure_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            SensorFault.value = false;
            AlarmHH.value = false;
            AlarmLL.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;
            if (DIH.value & DIL.value) {
                SensorFault.value = true;
                AlarmHH.value = false;
                AlarmLL.value = false;
            }
            else {
                SensorFault.value = false;
                if (DIH.value) {
                    AlarmHH.value = true;
                    AlarmLL.value = false;
                }
                else if (DIL.value) {
                    AlarmHH.value = false;
                    AlarmLL.value = true;
                }
                else {
                    AlarmHH.value = false;
                    AlarmLL.value = false;
                };
            };
        }
    }
    private void transition_Service_DIMeasure_0() {
    }

    private void transition_Service_DIMeasure_1() {
    }

    private void transition_Service_DIMeasure_2() {
    }

    private void transition_Service_DIMeasure_3() {
    }
}