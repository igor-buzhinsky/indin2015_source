package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class Service_ADIMeasure__Basic {
    private final Service_ADIMeasure instance = new Service_ADIMeasure();

    public void event_INIT(float AI_, boolean DIH_, boolean DIL_, float PRESET_HH_, float PRESET_H_, float PRESET_L_, float PRESET_LL_, float PRESET_MINAI_, float PRESET_MAXAI_) {
        instance.AI.value = AI_;
        instance.DIH.value = DIH_;
        instance.DIL.value = DIL_;
        instance.PRESET_HH.value = PRESET_HH_;
        instance.PRESET_H.value = PRESET_H_;
        instance.PRESET_L.value = PRESET_L_;
        instance.PRESET_LL.value = PRESET_LL_;
        instance.PRESET_MINAI.value = PRESET_MINAI_;
        instance.PRESET_MAXAI.value = PRESET_MAXAI_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(float AI_, boolean DIH_, boolean DIL_, float PRESET_HH_, float PRESET_H_, float PRESET_L_, float PRESET_LL_, float PRESET_MINAI_, float PRESET_MAXAI_) {
        instance.AI.value = AI_;
        instance.DIH.value = DIH_;
        instance.DIL.value = DIL_;
        instance.PRESET_HH.value = PRESET_HH_;
        instance.PRESET_H.value = PRESET_H_;
        instance.PRESET_L.value = PRESET_L_;
        instance.PRESET_LL.value = PRESET_LL_;
        instance.PRESET_MINAI.value = PRESET_MINAI_;
        instance.PRESET_MAXAI.value = PRESET_MAXAI_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK Service_ADIMeasure
     * @author wildai
     * @version 20150208/wildai
     */
    private class Service_ADIMeasure extends FBInstance
    {
        /** VAR AI */
        public REAL AI = new REAL();
        /** VAR DIH */
        public BOOL DIH = new BOOL();
        /** VAR DIL */
        public BOOL DIL = new BOOL();
        /** VAR PRESET_HH */
        public REAL PRESET_HH = new REAL();
        /** VAR PRESET_H */
        public REAL PRESET_H = new REAL();
        /** VAR PRESET_L */
        public REAL PRESET_L = new REAL();
        /** VAR PRESET_LL */
        public REAL PRESET_LL = new REAL();
        /** VAR PRESET_MINAI */
        public REAL PRESET_MINAI = new REAL();
        /** VAR PRESET_MAXAI */
        public REAL PRESET_MAXAI = new REAL();
        /** VAR AlarmHH */
        public BOOL AlarmHH = new BOOL();
        /** VAR AlarmH */
        public BOOL AlarmH = new BOOL();
        /** VAR AlarmL */
        public BOOL AlarmL = new BOOL();
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
        /** Connect the given variable to the input variable AI
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable DIH
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable DIL
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable PRESET_HH
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable PRESET_H
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable PRESET_L
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable PRESET_LL
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable PRESET_MINAI
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable PRESET_MAXAI
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
            transition_Service_ADIMeasure_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_Service_ADIMeasure_1();
        }

        /** The default constructor. */
        public Service_ADIMeasure() {
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
                transition_Service_ADIMeasure_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_Service_ADIMeasure_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            SensorFault.value = false;
            AlarmHH.value = false;
            AlarmH.value = false;
            AlarmL.value = false;
            AlarmLL.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;
            if (((DIH.value & DIL.value) | (AI.value >= PRESET_HH.value & !DIH.value) | (AI.value <= PRESET_LL.value & !DIL.value) | (AI.value > PRESET_MAXAI.value) | (AI.value < PRESET_MINAI.value))) {
                SensorFault.value = true;
                AlarmHH.value = false;
                AlarmH.value = false;
                AlarmL.value = false;
                AlarmLL.value = false;
            }
            else {
                SensorFault.value = false;
                if (AI.value >= PRESET_HH.value | DIH.value) {
                    AlarmHH.value = true;
                    AlarmH.value = false;
                    AlarmL.value = false;
                    AlarmLL.value = false;
                }
                else if (AI.value < PRESET_H.value & AI.value >= PRESET_H.value) {
                    AlarmHH.value = false;
                    AlarmH.value = true;
                    AlarmL.value = false;
                    AlarmLL.value = false;
                }
                else if (AI.value <= PRESET_L.value & AI.value > PRESET_LL.value) {
                    AlarmHH.value = false;
                    AlarmH.value = false;
                    AlarmL.value = true;
                    AlarmLL.value = false;
                }
                else if (AI.value <= PRESET_LL.value | DIL.value) {
                    AlarmHH.value = false;
                    AlarmH.value = false;
                    AlarmL.value = false;
                    AlarmLL.value = true;
                }
                else {
                    AlarmHH.value = false;
                    AlarmH.value = false;
                    AlarmL.value = false;
                    AlarmLL.value = false;
                };
            };
        }
    }
    private void transition_Service_ADIMeasure_0() {
    }

    private void transition_Service_ADIMeasure_1() {
    }

    private void transition_Service_ADIMeasure_2() {
    }

    private void transition_Service_ADIMeasure_3() {
    }
}