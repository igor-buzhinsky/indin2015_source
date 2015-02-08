package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class FB_ValveControl__Basic {
    private final FB_ValveControl instance = new FB_ValveControl();

    public void event_INIT(boolean IsControlValve_, float RangeOutMin_, float RangeOutMax_, boolean RequestStart_, boolean ReadyToStart_, float RequestValue_) {
        instance.IsControlValve.value = IsControlValve_;
        instance.RangeOutMin.value = RangeOutMin_;
        instance.RangeOutMax.value = RangeOutMax_;
        instance.RequestStart.value = RequestStart_;
        instance.ReadyToStart.value = ReadyToStart_;
        instance.RequestValue.value = RequestValue_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean IsControlValve_, float RangeOutMin_, float RangeOutMax_, boolean RequestStart_, boolean ReadyToStart_, float RequestValue_) {
        instance.IsControlValve.value = IsControlValve_;
        instance.RangeOutMin.value = RangeOutMin_;
        instance.RangeOutMax.value = RangeOutMax_;
        instance.RequestStart.value = RequestStart_;
        instance.ReadyToStart.value = ReadyToStart_;
        instance.RequestValue.value = RequestValue_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_ValveControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_ValveControl extends FBInstance
    {
        /** Input event qualifier */
        public BOOL IsControlValve = new BOOL();
        /** VAR RangeOutMin */
        public REAL RangeOutMin = new REAL();
        /** VAR RangeOutMax */
        public REAL RangeOutMax = new REAL();
        /** VAR RequestStart */
        public BOOL RequestStart = new BOOL();
        /** VAR ReadyToStart */
        public BOOL ReadyToStart = new BOOL();
        /** VAR RequestValue */
        public REAL RequestValue = new REAL();
        /** Output event qualifier */
        public BOOL ValveOn = new BOOL();
        /** VAR InvalidRange */
        public BOOL InvalidRange = new BOOL();
        /** VAR ValveValue */
        public REAL ValveValue = new REAL();
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
        /** Connect the given variable to the input variable IsControlValve
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable RangeOutMin
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable RangeOutMax
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable RequestStart
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable ReadyToStart
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable RequestValue
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
            transition_FB_ValveControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_FB_ValveControl_1();
        }

        /** The default constructor. */
        public FB_ValveControl() {
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
                transition_FB_ValveControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_FB_ValveControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            ValveOn.value = false;
            InvalidRange.value = false;
            ValveValue.value = (float) (0.0);
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            if (IsControlValve.value & RequestStart.value & ReadyToStart.value) {
                if (RequestValue.value >= RangeOutMin.value & RequestValue.value <= RangeOutMax.value) {
                    ValveValue.value = (float) (RequestValue.value);
                    InvalidRange.value = false;
                    ValveOn.value = true;
                }
                else {
                    ValveValue.value = (float) (0.0);
                    InvalidRange.value = true;
                    ValveOn.value = false;
                };
            }
            else {
                ValveOn.value = false;
                ValveValue.value = (float) (0.0);
            };
        }
    }
    private void transition_FB_ValveControl_0() {
    }

    private void transition_FB_ValveControl_1() {
    }

    private void transition_FB_ValveControl_2() {
    }

    private void transition_FB_ValveControl_3() {
    }
}