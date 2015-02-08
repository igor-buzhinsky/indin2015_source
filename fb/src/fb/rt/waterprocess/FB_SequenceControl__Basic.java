package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class FB_SequenceControl__Basic {
    private final FB_SequenceControl instance = new FB_SequenceControl();

    public void event_INIT(boolean T100_Overflow_, boolean T100_Underflow_, boolean T100_Overheat_, boolean T200_Overflow_, boolean T200_Underflow_, boolean T300_Overflow_, boolean T300_Underflow_, boolean T300_Overheat_, boolean T300_OverPressure_, boolean T400_Overflow_, boolean T400_Underflow_, boolean FillingSeqEnable_, boolean StartSeqEnable_, boolean ShutdownSeqEnable_, boolean EmptyingSeqEnable_) {
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
        instance.FillingSeqEnable.value = FillingSeqEnable_;
        instance.StartSeqEnable.value = StartSeqEnable_;
        instance.ShutdownSeqEnable.value = ShutdownSeqEnable_;
        instance.EmptyingSeqEnable.value = EmptyingSeqEnable_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean T100_Overflow_, boolean T100_Underflow_, boolean T100_Overheat_, boolean T200_Overflow_, boolean T200_Underflow_, boolean T300_Overflow_, boolean T300_Underflow_, boolean T300_Overheat_, boolean T300_OverPressure_, boolean T400_Overflow_, boolean T400_Underflow_, boolean FillingSeqEnable_, boolean StartSeqEnable_, boolean ShutdownSeqEnable_, boolean EmptyingSeqEnable_) {
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
        instance.FillingSeqEnable.value = FillingSeqEnable_;
        instance.StartSeqEnable.value = StartSeqEnable_;
        instance.ShutdownSeqEnable.value = ShutdownSeqEnable_;
        instance.EmptyingSeqEnable.value = EmptyingSeqEnable_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_SequenceControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_SequenceControl extends FBInstance
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
        /** VAR FillingSeqEnable */
        public BOOL FillingSeqEnable = new BOOL();
        /** VAR StartSeqEnable */
        public BOOL StartSeqEnable = new BOOL();
        /** VAR ShutdownSeqEnable */
        public BOOL ShutdownSeqEnable = new BOOL();
        /** VAR EmptyingSeqEnable */
        public BOOL EmptyingSeqEnable = new BOOL();
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
        /** VAR FillingSeqComplete */
        public BOOL FillingSeqComplete = new BOOL();
        /** VAR StartSeqComplete */
        public BOOL StartSeqComplete = new BOOL();
        /** VAR EmptyingComplete */
        public BOOL EmptyingComplete = new BOOL();
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
        /** Connect the given variable to the input variable FillingSeqEnable
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable StartSeqEnable
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable ShutdownSeqEnable
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable EmptyingSeqEnable
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
            transition_FB_SequenceControl_0();
        }
        private static final int index_FillingSeq = 2;
        private void state_FillingSeq() {
            eccState = index_FillingSeq;
            alg_FillingSeq_Action();
            CNF.serviceEvent(this);
        }
        private static final int index_WAIT = 3;
        private void state_WAIT() {
            eccState = index_WAIT;
            alg_Wait_Action();
            CNF.serviceEvent(this);
        }
        private static final int index_StartupSeq = 4;
        private void state_StartupSeq() {
            eccState = index_StartupSeq;
            alg_StartupSeq_Action();
            CNF.serviceEvent(this);
        }
        private static final int index_SupplySeq = 5;
        private void state_SupplySeq() {
            eccState = index_SupplySeq;
            alg_SupplySeq_Action();
            CNF.serviceEvent(this);
        }
        private static final int index_ShutdownSeq = 6;
        private void state_ShutdownSeq() {
            eccState = index_ShutdownSeq;
            alg_ShutdownSeq_Action();
            CNF.serviceEvent(this);
        }
        private static final int index_EmptyingSeq = 7;
        private void state_EmptyingSeq() {
            eccState = index_EmptyingSeq;
            alg_EmptyingSeq_Action();
            CNF.serviceEvent(this);
        }

        /** The default constructor. */
        public FB_SequenceControl() {
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
                transition_FB_SequenceControl_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START) && (FillingSeqEnable.value)) {
                state_FillingSeq();
                transition_FB_SequenceControl_2(); 
            }
            else if ((eccState == index_FillingSeq) && (FillingSeqComplete.value)) {
                state_WAIT();
                transition_FB_SequenceControl_3(); 
            }
            else if ((eccState == index_WAIT) && (StartSeqEnable.value)) {
                state_StartupSeq();
                transition_FB_SequenceControl_4(); 
            }
            else if ((eccState == index_StartupSeq) && (StartSeqComplete.value)) {
                state_SupplySeq();
                transition_FB_SequenceControl_5(); 
            }
            else if ((eccState == index_SupplySeq) && (ShutdownSeqEnable.value)) {
                state_ShutdownSeq();
                transition_FB_SequenceControl_6(); 
            }
            else if ((eccState == index_ShutdownSeq) && (EmptyingSeqEnable.value)) {
                state_EmptyingSeq();
                transition_FB_SequenceControl_7(); 
            }
            else if ((eccState == index_EmptyingSeq) && (EmptyingComplete.value)) {
                state_START();
                transition_FB_SequenceControl_8(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            Y101_Open.value = false;
            Y102_Open.value = false;
            Y103_Open.value = false;
            Y105_Open.value = false;
            Y201_Open.value = false;
            Y202_Open.value = false;
            Y203_Open.value = false;
            Y204_Open.value = true;/*for(OverPressure*/
            Y301_Open.value = false;
            Y302_Open.value = false;
            Y303_Open.value = false;
            Y305_Open.value = false;
            Y401_Open.value = false;
            Y402_Open.value = false;
            Y403_Open.value = false;
            Y404_Open.value = false;
            Y501_Open.value = false;
            E100_On.value = false;
            M100_On.value = false;
            M200_On.value = false;
        }

        /** ALGORITHM FillingSeq_Action IN ST*/
        public void alg_FillingSeq_Action() {
            ;

            Y101_Open.value = true;
            Y102_Open.value = true;
            M100_On.value = true;
            Y203_Open.value = true;
            Y201_Open.value = true;
            M200_On.value = true;
            Y303_Open.value = true;
            Y301_Open.value = true;

            FillingSeqComplete.value = !(T100_Underflow.value | T200_Underflow.value | T300_Underflow.value | T400_Underflow.value);
        }

        /** ALGORITHM EmptyingSeq_Action IN ST*/
        public void alg_EmptyingSeq_Action() {
            ;

            if (!T400_Underflow.value) {
                Y105_Open.value = true;
            };

            if (!T200_Underflow.value) {
                Y201_Open.value = true;
                M200_On.value = true;
                Y303_Open.value = true;
                Y301_Open.value = true;
            };

            if (!T300_Underflow.value) {
                Y305_Open.value = true;
                Y501_Open.value = true;
            }

            if (!T400_Underflow.value) {
                Y101_Open.value = true;
            };

            EmptyingComplete.value = T100_Underflow.value & T200_Underflow.value & T300_Underflow.value & T400_Underflow.value;
        }

        /** ALGORITHM ShutdownSeq_Action IN ST*/
        public void alg_ShutdownSeq_Action() {
            ;

            Y501_Open.value = false;
            E100_On.value = false;
            Y102_Open.value = false;
            M100_On.value = false;
            Y203_Open.value = false;
            Y201_Open.value = false;
            M200_On.value = false;
            Y303_Open.value = false;
            Y301_Open.value = false;
            Y305_Open.value = false;
        }

        /** ALGORITHM StartupSeq_Action IN ST*/
        public void alg_StartupSeq_Action() {
            ;

            Y101_Open.value = false;
            Y102_Open.value = false;
            Y103_Open.value = false;
            Y105_Open.value = false;
            Y201_Open.value = false;
            Y202_Open.value = false;
            Y203_Open.value = false;
            Y204_Open.value = true;/*for(OverPressure*/
            Y301_Open.value = false;
            Y302_Open.value = false;
            Y303_Open.value = false;
            Y305_Open.value = false;
            Y401_Open.value = false;
            Y402_Open.value = false;
            Y403_Open.value = false;
            Y404_Open.value = false;
            Y501_Open.value = false;
            E100_On.value = false;
            M100_On.value = false;
            M200_On.value = false;
        }

        /** ALGORITHM SupplySeq_Action IN ST*/
        public void alg_SupplySeq_Action() {
            ;

            Y501_Open.value = true;
        }

        /** ALGORITHM Wait_Action IN ST*/
        public void alg_Wait_Action() {
            ;

            Y101_Open.value = false;
            Y102_Open.value = false;
            M100_On.value = false;
            Y203_Open.value = false;
            Y201_Open.value = false;
            M200_On.value = false;
            Y303_Open.value = false;
            Y301_Open.value = false;
        }
    }
    private void transition_FB_SequenceControl_0() {
    }

    private void transition_FB_SequenceControl_1() {
    }

    private void transition_FB_SequenceControl_2() {
    }

    private void transition_FB_SequenceControl_3() {
    }

    private void transition_FB_SequenceControl_4() {
    }

    private void transition_FB_SequenceControl_5() {
    }

    private void transition_FB_SequenceControl_6() {
    }

    private void transition_FB_SequenceControl_7() {
    }

    private void transition_FB_SequenceControl_8() {
    }
}