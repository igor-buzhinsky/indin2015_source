package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class WPMaster__Basic {
    private final WPMaster instance = new WPMaster();

    public void event_INIT(boolean pp0_, boolean pp1_, boolean pp2_, boolean pp3_) {
        instance.pp0.value = pp0_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean pp0_, boolean pp1_, boolean pp2_, boolean pp3_) {
        instance.pp0.value = pp0_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.REQ.serviceEvent(instance); 
    }

    public void event_LC_CONF(boolean LC_READY_) {
        instance.LC_READY.value = LC_READY_;
        instance.LC_CONF.serviceEvent(instance); 
    }

    public void event_RC_CONF(boolean RC_READY_) {
        instance.RC_READY.value = RC_READY_;
        instance.RC_CONF.serviceEvent(instance); 
    }

    public void event_VC_CONF(boolean VC_READY_) {
        instance.VC_READY.value = VC_READY_;
        instance.VC_CONF.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK WPMaster
     * @author JHC
     * @version 20150208/JHC
     */
    private class WPMaster extends FBInstance
    {
        /** VAR pp0 */
        public BOOL pp0 = new BOOL();
        /** VAR pp1 */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** VAR LC_READY */
        public BOOL LC_READY = new BOOL();
        /** VAR RC_READY */
        public BOOL RC_READY = new BOOL();
        /** VAR VC_READY */
        public BOOL VC_READY = new BOOL();
        /** VAR Flag */
        public BOOL Flag = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
        /** EVENT LC_CONF */
        public EventServer LC_CONF = new EventInput(this);
        /** EVENT RC_CONF */
        public EventServer RC_CONF = new EventInput(this);
        /** EVENT VC_CONF */
        public EventServer VC_CONF = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Execution Confirmation */
        public EventOutput CNF = new EventOutput();
        /** EVENT LC_Op1 */
        public EventOutput LC_Op1 = new EventOutput();
        /** EVENT LC_Op2 */
        public EventOutput LC_Op2 = new EventOutput();
        /** EVENT RC_Op1 */
        public EventOutput RC_Op1 = new EventOutput();
        /** EVENT RC_Op2 */
        public EventOutput RC_Op2 = new EventOutput();
        /** EVENT VC_Op1 */
        public EventOutput VC_Op1 = new EventOutput();
        /** EVENT VC_Op2 */
        public EventOutput VC_Op2 = new EventOutput();
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
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Connect the given variable to the input variable pp0
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable pp1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable pp2
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable pp3
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable LC_READY
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable RC_READY
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable VC_READY
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
            transition_WPMaster_0();
        }
        private static final int index_Pick1 = 2;
        private void state_Pick1() {
            eccState = index_Pick1;
            LC_Op1.serviceEvent(this);
        }
        private static final int index_Pick2 = 3;
        private void state_Pick2() {
            eccState = index_Pick2;
            RC_Op1.serviceEvent(this);
        }
        private static final int index_Pick3 = 4;
        private void state_Pick3() {
            eccState = index_Pick3;
            LC_Op1.serviceEvent(this);
            RC_Op1.serviceEvent(this);
        }
        private static final int index_VCDown = 5;
        private void state_VCDown() {
            eccState = index_VCDown;
            VC_Op1.serviceEvent(this);
        }
        private static final int index_VCUp = 6;
        private void state_VCUp() {
            eccState = index_VCUp;
            alg_ChangeFlag();
            VC_Op2.serviceEvent(this);
        }
        private static final int index_CylGoBack = 7;
        private void state_CylGoBack() {
            eccState = index_CylGoBack;
            LC_Op2.serviceEvent(this);
            RC_Op2.serviceEvent(this);
        }
        private static final int index_Temp1 = 8;
        private void state_Temp1() {
            eccState = index_Temp1;
        }
        private static final int index_Temp2 = 9;
        private void state_Temp2() {
            eccState = index_Temp2;
        }
        private static final int index_Temp3 = 10;
        private void state_Temp3() {
            eccState = index_Temp3;
        }
        private static final int index_Temp4 = 11;
        private void state_Temp4() {
            eccState = index_Temp4;
        }

        /** The default constructor. */
        public WPMaster() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == REQ) service_REQ();
            else if (e == LC_CONF) service_LC_CONF();
            else if (e == RC_CONF) service_RC_CONF();
            else if (e == VC_CONF) service_VC_CONF();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_WPMaster_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START) && (pp1.value)) {
                state_Pick1();
                transition_WPMaster_2(); 
            }
            else if ((eccState == index_START) && (pp2.value & !pp1.value)) {
                state_Pick2();
                transition_WPMaster_3(); 
            }
            else if ((eccState == index_START) && (pp3.value & !pp1.value & !pp2.value)) {
                state_Pick3();
                transition_WPMaster_4(); 
            }
        }

        /** Services the LC_CONF event. */
        public void service_LC_CONF() {
            if ((eccState == index_Pick1) && (LC_READY.value)) {
                state_VCDown();
                transition_WPMaster_5(); 
            }
            else if ((eccState == index_Pick3) && (LC_READY.value)) {
                state_Temp1();
                transition_WPMaster_6(); 
            }
            else if ((eccState == index_Temp2) && (LC_READY.value)) {
                state_VCDown();
                transition_WPMaster_7(); 
            }
            else if ((eccState == index_CylGoBack) && (LC_READY.value)) {
                state_Temp3();
                transition_WPMaster_8(); 
            }
            else if ((eccState == index_Temp4) && (LC_READY.value)) {
                state_VCDown();
                transition_WPMaster_9(); 
            }
        }

        /** Services the RC_CONF event. */
        public void service_RC_CONF() {
            if ((eccState == index_Pick2) && (RC_READY.value)) {
                state_VCDown();
                transition_WPMaster_10(); 
            }
            else if ((eccState == index_Pick3) && (RC_READY.value)) {
                state_Temp2();
                transition_WPMaster_11(); 
            }
            else if ((eccState == index_Temp1) && (RC_READY.value)) {
                state_VCDown();
                transition_WPMaster_12(); 
            }
            else if ((eccState == index_CylGoBack) && (RC_READY.value)) {
                state_Temp4();
                transition_WPMaster_13(); 
            }
            else if ((eccState == index_Temp3) && (RC_READY.value)) {
                state_VCDown();
                transition_WPMaster_14(); 
            }
        }

        /** Services the VC_CONF event. */
        public void service_VC_CONF() {
            if ((eccState == index_VCDown) && (VC_READY.value)) {
                state_VCUp();
                transition_WPMaster_15(); 
            }
            else if ((eccState == index_VCUp) && (VC_READY.value & Flag.value)) {
                state_CylGoBack();
                transition_WPMaster_16(); 
            }
            else if ((eccState == index_VCUp) && (VC_READY.value & !Flag.value)) {
                state_START();
                transition_WPMaster_17(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            Flag.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
        }

        /** ALGORITHM ChangeFlag IN ST*/
        public void alg_ChangeFlag() {
            if (Flag.value) {
                Flag.value = false;
            }
            else {
                Flag.value = true;
            }

            System.out.println("ChangeFlag!!" + Flag.value);
        }
    }
    private void transition_WPMaster_0() {
    }

    private void transition_WPMaster_1() {
    }

    private void transition_WPMaster_2() {
    }

    private void transition_WPMaster_3() {
    }

    private void transition_WPMaster_4() {
    }

    private void transition_WPMaster_5() {
    }

    private void transition_WPMaster_6() {
    }

    private void transition_WPMaster_7() {
    }

    private void transition_WPMaster_8() {
    }

    private void transition_WPMaster_9() {
    }

    private void transition_WPMaster_10() {
    }

    private void transition_WPMaster_11() {
    }

    private void transition_WPMaster_12() {
    }

    private void transition_WPMaster_13() {
    }

    private void transition_WPMaster_14() {
    }

    private void transition_WPMaster_15() {
    }

    private void transition_WPMaster_16() {
    }

    private void transition_WPMaster_17() {
    }
}