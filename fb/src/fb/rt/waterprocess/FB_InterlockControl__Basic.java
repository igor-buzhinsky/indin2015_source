package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class FB_InterlockControl__Basic {
    private final FB_InterlockControl instance = new FB_InterlockControl();

    public void event_INIT(boolean T100_Overflow_, boolean T100_Underflow_, boolean T100_Overheat_, boolean T200_Overflow_, boolean T200_Underflow_, boolean T300_Overflow_, boolean T300_Underflow_, boolean T300_Overheat_, boolean T300_OverPressure_, boolean T400_Overflow_, boolean T400_Underflow_, boolean Y102_Closed_, boolean Y201_Closed_, boolean Y203_Closed_, boolean Y301_Closed_, boolean Y303_Closed_, boolean Y403_Closed_) {
        instance.T100_Overflow.value = T100_Overflow_;
        instance.T100_Underflow.value = T100_Underflow_;
        instance.T100_Overheat.value = T100_Overheat_;
        instance.T200_Overflow.value = T200_Overflow_;
        instance.T200_Underflow.value = T200_Underflow_;
        instance.T300_Overflow.value = T300_Overflow_;
        instance.T300_Underflow.value = T300_Underflow_;
        instance.T300_Overheat.value = T300_Overheat_;
        instance.T300_OverPressure.value = T300_OverPressure_;
        instance.T400_Overflow.value = T400_Overflow_;
        instance.T400_Underflow.value = T400_Underflow_;
        instance.Y102_Closed.value = Y102_Closed_;
        instance.Y201_Closed.value = Y201_Closed_;
        instance.Y203_Closed.value = Y203_Closed_;
        instance.Y301_Closed.value = Y301_Closed_;
        instance.Y303_Closed.value = Y303_Closed_;
        instance.Y403_Closed.value = Y403_Closed_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean T100_Overflow_, boolean T100_Underflow_, boolean T100_Overheat_, boolean T200_Overflow_, boolean T200_Underflow_, boolean T300_Overflow_, boolean T300_Underflow_, boolean T300_Overheat_, boolean T300_OverPressure_, boolean T400_Overflow_, boolean T400_Underflow_, boolean Y102_Closed_, boolean Y201_Closed_, boolean Y203_Closed_, boolean Y301_Closed_, boolean Y303_Closed_, boolean Y403_Closed_) {
        instance.T100_Overflow.value = T100_Overflow_;
        instance.T100_Underflow.value = T100_Underflow_;
        instance.T100_Overheat.value = T100_Overheat_;
        instance.T200_Overflow.value = T200_Overflow_;
        instance.T200_Underflow.value = T200_Underflow_;
        instance.T300_Overflow.value = T300_Overflow_;
        instance.T300_Underflow.value = T300_Underflow_;
        instance.T300_Overheat.value = T300_Overheat_;
        instance.T300_OverPressure.value = T300_OverPressure_;
        instance.T400_Overflow.value = T400_Overflow_;
        instance.T400_Underflow.value = T400_Underflow_;
        instance.Y102_Closed.value = Y102_Closed_;
        instance.Y201_Closed.value = Y201_Closed_;
        instance.Y203_Closed.value = Y203_Closed_;
        instance.Y301_Closed.value = Y301_Closed_;
        instance.Y303_Closed.value = Y303_Closed_;
        instance.Y403_Closed.value = Y403_Closed_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_InterlockControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_InterlockControl extends FBInstance
    {
        /** VAR T100_Overflow */
        public BOOL T100_Overflow = new BOOL();
        /** VAR T100_Underflow */
        public BOOL T100_Underflow = new BOOL();
        /** VAR T100_Overheat */
        public BOOL T100_Overheat = new BOOL();
        /** VAR T200_Overflow */
        public BOOL T200_Overflow = new BOOL();
        /** VAR T200_Underflow */
        public BOOL T200_Underflow = new BOOL();
        /** VAR T300_Overflow */
        public BOOL T300_Overflow = new BOOL();
        /** VAR T300_Underflow */
        public BOOL T300_Underflow = new BOOL();
        /** VAR T300_Overheat */
        public BOOL T300_Overheat = new BOOL();
        /** VAR T300_OverPressure */
        public BOOL T300_OverPressure = new BOOL();
        /** VAR T400_Overflow */
        public BOOL T400_Overflow = new BOOL();
        /** VAR T400_Underflow */
        public BOOL T400_Underflow = new BOOL();
        /** VAR Y102_Closed */
        public BOOL Y102_Closed = new BOOL();
        /** VAR Y201_Closed */
        public BOOL Y201_Closed = new BOOL();
        /** VAR Y203_Closed */
        public BOOL Y203_Closed = new BOOL();
        /** VAR Y301_Closed */
        public BOOL Y301_Closed = new BOOL();
        /** VAR Y303_Closed */
        public BOOL Y303_Closed = new BOOL();
        /** VAR Y403_Closed */
        public BOOL Y403_Closed = new BOOL();
        /** VAR Y101_Open */
        public BOOL Y101_Open = new BOOL();
        /** VAR Y102_Open */
        public BOOL Y102_Open = new BOOL();
        /** VAR Y103_Open */
        public BOOL Y103_Open = new BOOL();
        /** VAR Y105_Open */
        public BOOL Y105_Open = new BOOL();
        /** VAR Y201_Open */
        public BOOL Y201_Open = new BOOL();
        /** VAR Y202_Open */
        public BOOL Y202_Open = new BOOL();
        /** VAR Y203_Open */
        public BOOL Y203_Open = new BOOL();
        /** VAR Y204_Open */
        public BOOL Y204_Open = new BOOL();
        /** VAR Y301_Open */
        public BOOL Y301_Open = new BOOL();
        /** VAR Y302_Open */
        public BOOL Y302_Open = new BOOL();
        /** VAR Y303_Open */
        public BOOL Y303_Open = new BOOL();
        /** VAR Y305_Open */
        public BOOL Y305_Open = new BOOL();
        /** VAR Y401_Open */
        public BOOL Y401_Open = new BOOL();
        /** VAR Y402_Open */
        public BOOL Y402_Open = new BOOL();
        /** VAR Y403_Open */
        public BOOL Y403_Open = new BOOL();
        /** VAR Y404_Open */
        public BOOL Y404_Open = new BOOL();
        /** VAR Y501_Open */
        public BOOL Y501_Open = new BOOL();
        /** VAR E100_On */
        public BOOL E100_On = new BOOL();
        /** VAR M100_On */
        public BOOL M100_On = new BOOL();
        /** VAR M200_On */
        public BOOL M200_On = new BOOL();
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
        /** Connect the given variable to the input variable T100_Overflow
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable T100_Underflow
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable T100_Overheat
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable T200_Overflow
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable T200_Underflow
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable T300_Overflow
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable T300_Underflow
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable T300_Overheat
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable T300_OverPressure
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable T400_Overflow
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable T400_Underflow
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Y102_Closed
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Y201_Closed
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Y203_Closed
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Y301_Closed
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Y303_Closed
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Y403_Closed
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
            transition_FB_InterlockControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_FB_InterlockControl_1();
        }

        /** The default constructor. */
        public FB_InterlockControl() {
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
                transition_FB_InterlockControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_FB_InterlockControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            Y101_Open.value = true;
            Y102_Open.value = true;
            Y103_Open.value = true;
            Y105_Open.value = true;
            Y201_Open.value = true;
            Y202_Open.value = true;
            Y203_Open.value = true;
            Y204_Open.value = true;
            Y301_Open.value = true;
            Y302_Open.value = true;
            Y303_Open.value = true;
            Y305_Open.value = true;
            Y401_Open.value = true;
            Y402_Open.value = true;
            Y403_Open.value = false;
            Y404_Open.value = true;
            Y501_Open.value = true;
            E100_On.value = true;
            M100_On.value = true;
            M200_On.value = true;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            /*Interlocksfor(Valve,Heater&Pump*/
            Y101_Open.value = true;
            Y102_Open.value = true;
            Y103_Open.value = true;
            Y105_Open.value = true;
            Y201_Open.value = true;
            Y202_Open.value = true;
            Y203_Open.value = true;
            Y204_Open.value = true;
            Y301_Open.value = true;
            Y302_Open.value = true;
            Y303_Open.value = true;
            Y305_Open.value = true;
            Y401_Open.value = true;
            Y402_Open.value = true;
            Y403_Open.value = false;
            Y404_Open.value = true;
            Y501_Open.value = true;
            E100_On.value = true;
            M100_On.value = true;
            M200_On.value = true;

            if (T100_Overflow.value | T400_Underflow.value) {
                Y101_Open.value = false;
            };

            if (T100_Underflow.value) {
                Y102_Open.value = false;
            };

            if (T100_Underflow.value | T300_Overflow.value) {
                Y103_Open.value = false;
            };

            if (T100_Underflow.value) {
                Y105_Open.value = false;
            };

            if (T200_Underflow.value) {
                Y201_Open.value = false;
            };

            if (T200_Underflow.value) {
                Y202_Open.value = false;
            };

            if (T200_Overflow.value) {
                Y203_Open.value = false;
            };

            if (T200_Overflow.value | T300_Underflow.value) {
                Y204_Open.value = false;
            };
            if (T300_OverPressure.value) {
                Y204_Open.value = true;
            };

            if (T300_Overflow.value) {
                Y301_Open.value = false;
            };

            if (T300_Overflow.value) {
                Y302_Open.value = false;
            };

            if (T300_Underflow.value) {
                Y305_Open.value = false;
            };

            if (T300_Underflow.value) {
                Y401_Open.value = false;
            };

            if (T200_Underflow.value | T400_Overflow.value) {
                Y402_Open.value = false;
            };

            if (T400_Underflow.value) {
                Y404_Open.value = false;
            };

            if (T100_Overflow.value) {
                Y501_Open.value = false;
            };

            if (T100_Overheat.value | T100_Underflow.value) {
                E100_On.value = false;
            };

            if (Y102_Closed.value | (Y203_Closed.value & Y403_Closed.value)) {
                M100_On.value = false;
            };

            if (Y301_Closed.value | Y303_Closed.value | Y201_Closed.value) {
                M200_On.value = false;
            };
        }
    }
    private void transition_FB_InterlockControl_0() {
    }

    private void transition_FB_InterlockControl_1() {
    }

    private void transition_FB_InterlockControl_2() {
    }

    private void transition_FB_InterlockControl_3() {
    }
}