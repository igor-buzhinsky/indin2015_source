package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class Master_TEST__Basic {
    private final Master_TEST instance = new Master_TEST();

    public void event_INIT(boolean pp0_, boolean pp1_, boolean pp2_, boolean pp3_, boolean pp4_, boolean X_READY_, boolean Y_READY_, float X_POS_, float Y_POS_) {
        instance.pp0.value = pp0_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.pp4.value = pp4_;
        instance.X_READY.value = X_READY_;
        instance.Y_READY.value = Y_READY_;
        instance.X_POS.value = X_POS_;
        instance.Y_POS.value = Y_POS_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean pp0_, boolean pp1_, boolean pp2_, boolean pp3_, boolean pp4_, boolean X_READY_, boolean Y_READY_, float X_POS_, float Y_POS_) {
        instance.pp0.value = pp0_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.pp4.value = pp4_;
        instance.X_READY.value = X_READY_;
        instance.Y_READY.value = Y_READY_;
        instance.X_POS.value = X_POS_;
        instance.Y_POS.value = Y_POS_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK Master_TEST
     * @author JHC
     * @version 20150208/JHC
     */
    private class Master_TEST extends FBInstance
    {
        /** VAR pp0 */
        public BOOL pp0 = new BOOL();
        /** VAR pp1 */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** VAR pp4 */
        public BOOL pp4 = new BOOL();
        /** VAR X_READY */
        public BOOL X_READY = new BOOL();
        /** VAR Y_READY */
        public BOOL Y_READY = new BOOL();
        /** VAR X_POS */
        public REAL X_POS = new REAL();
        /** VAR Y_POS */
        public REAL Y_POS = new REAL();
        /** VAR X_ORDER */
        public REAL X_ORDER = new REAL();
        /** VAR Y_ORDER */
        public REAL Y_ORDER = new REAL();
        /** VAR Vacuum_ORDER */
        public BOOL Vacuum_ORDER = new BOOL();
        /** VAR Vacuum_nORDER */
        public BOOL Vacuum_nORDER = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Execution Confirmation */
        public EventOutput CNF = new EventOutput();
        /** EVENT Order */
        public EventOutput Order = new EventOutput();
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
        /** Connect the given variable to the input variable pp4
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X_READY
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Y_READY
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X_POS
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Y_POS
         * @param newIV The variable to connect
         */
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_Pick3_3 = 1;
        private void state_Pick3_3() {
            eccState = index_Pick3_3;
            alg_Go_4_0();
            alg_Vacuum_On();
            Order.serviceEvent(this);
        }
        private static final int index_Pick3_1 = 2;
        private void state_Pick3_1() {
            eccState = index_Pick3_1;
            alg_Go_4_0();
            Order.serviceEvent(this);
        }
        private static final int index_Pick3_2 = 3;
        private void state_Pick3_2() {
            eccState = index_Pick3_2;
            alg_Go_4_2();
            Order.serviceEvent(this);
        }
        private static final int index_Pick2_3 = 4;
        private void state_Pick2_3() {
            eccState = index_Pick2_3;
            alg_Go_3_0();
            alg_Vacuum_On();
            Order.serviceEvent(this);
        }
        private static final int index_Pick2_1 = 5;
        private void state_Pick2_1() {
            eccState = index_Pick2_1;
            alg_Go_3_0();
            Order.serviceEvent(this);
        }
        private static final int index_Pick2_2 = 6;
        private void state_Pick2_2() {
            eccState = index_Pick2_2;
            alg_Go_3_3();
            Order.serviceEvent(this);
        }
        private static final int index_Pick1_3 = 7;
        private void state_Pick1_3() {
            eccState = index_Pick1_3;
            alg_Go_2_0();
            alg_Vacuum_On();
            Order.serviceEvent(this);
        }
        private static final int index_Pick1_1 = 8;
        private void state_Pick1_1() {
            eccState = index_Pick1_1;
            alg_Go_2_0();
            Order.serviceEvent(this);
        }
        private static final int index_Pick1_2 = 9;
        private void state_Pick1_2() {
            eccState = index_Pick1_2;
            alg_Go_2_1();
            Order.serviceEvent(this);
        }
        private static final int index_Deposit_1 = 10;
        private void state_Deposit_1() {
            eccState = index_Deposit_1;
            alg_Go_1_0();
            Order.serviceEvent(this);
        }
        private static final int index_Deposit_2 = 11;
        private void state_Deposit_2() {
            eccState = index_Deposit_2;
            alg_Go_1_1();
            Order.serviceEvent(this);
        }
        private static final int index_Deposit_3 = 12;
        private void state_Deposit_3() {
            eccState = index_Deposit_3;
            alg_Go_1_0();
            alg_Vacuum_Off();
            Order.serviceEvent(this);
        }
        private static final int index_Go_sleep = 13;
        private void state_Go_sleep() {
            eccState = index_Go_sleep;
            alg_Go_0_0();
            Order.serviceEvent(this);
        }
        private static final int index_Init = 14;
        private void state_Init() {
            eccState = index_Init;
            INITO.serviceEvent(this);
            state_START();
            transition_Master_TEST_0();
        }

        /** The default constructor. */
        public Master_TEST() {
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
                state_Init();
                transition_Master_TEST_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START) && (pp1.value)) {
                state_Pick1_1();
                transition_Master_TEST_2(); 
            }
            else if ((eccState == index_Pick1_1) && (X_READY.value & Y_READY.value)) {
                state_Pick1_2();
                transition_Master_TEST_3(); 
            }
            else if ((eccState == index_Pick1_2) && (X_READY.value & Y_READY.value)) {
                state_Pick1_3();
                transition_Master_TEST_4(); 
            }
            else if ((eccState == index_Pick1_3) && (X_READY.value & Y_READY.value)) {
                state_Deposit_1();
                transition_Master_TEST_5(); 
            }
            else if ((eccState == index_Deposit_1) && (X_READY.value & Y_READY.value)) {
                state_Deposit_2();
                transition_Master_TEST_6(); 
            }
            else if ((eccState == index_Deposit_2) && (X_READY.value & Y_READY.value)) {
                state_Deposit_3();
                transition_Master_TEST_7(); 
            }
            else if ((eccState == index_Deposit_3) && (X_READY.value & Y_READY.value)) {
                state_START();
                transition_Master_TEST_8(); 
            }
            else if ((eccState == index_START) && (pp2.value & !pp1.value)) {
                state_Pick2_1();
                transition_Master_TEST_9(); 
            }
            else if ((eccState == index_START) && (pp3.value & !pp2.value & !pp1.value)) {
                state_Pick3_1();
                transition_Master_TEST_10(); 
            }
            else if ((eccState == index_Pick2_1) && (X_READY.value & Y_READY.value)) {
                state_Pick2_2();
                transition_Master_TEST_11(); 
            }
            else if ((eccState == index_Pick2_2) && (X_READY.value & Y_READY.value)) {
                state_Pick2_3();
                transition_Master_TEST_12(); 
            }
            else if ((eccState == index_Pick3_1) && (X_READY.value & Y_READY.value)) {
                state_Pick3_2();
                transition_Master_TEST_13(); 
            }
            else if ((eccState == index_Pick3_2) && (X_READY.value & Y_READY.value)) {
                state_Pick3_3();
                transition_Master_TEST_14(); 
            }
            else if ((eccState == index_Pick3_3) && (X_READY.value & Y_READY.value)) {
                state_Deposit_1();
                transition_Master_TEST_15(); 
            }
            else if ((eccState == index_Pick2_3) && (X_READY.value & Y_READY.value)) {
                state_Deposit_1();
                transition_Master_TEST_16(); 
            }
            else if ((eccState == index_Go_sleep) && (X_READY.value & Y_READY.value)) {
                state_START();
                transition_Master_TEST_17(); 
            }
            else if ((eccState == index_START) && (!pp1.value & !pp2.value & !pp3.value)) {
                state_Go_sleep();
                transition_Master_TEST_18(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            System.out.println("init!!!");

        }

        /** ALGORITHM Vacuum_On IN Java*/
        public void alg_Vacuum_On() {
            Vacuum_ORDER.value = true;
            Vacuum_nORDER.value = false;

        }

        /** ALGORITHM Vacuum_Off IN Java*/
        public void alg_Vacuum_Off() {
            Vacuum_ORDER.value = false;
            Vacuum_nORDER.value = true;

        }

        /** ALGORITHM Go_0_0 IN Java*/
        public void alg_Go_0_0() {
            X_ORDER.value = 0;
            Y_ORDER.value = 0;

        }

        /** ALGORITHM Go_1_0 IN Java*/
        public void alg_Go_1_0() {
            X_ORDER.value = 1;
            Y_ORDER.value = 0;

        }

        /** ALGORITHM Go_2_0 IN Java*/
        public void alg_Go_2_0() {
            X_ORDER.value = 2;
            Y_ORDER.value = 0;

        }

        /** ALGORITHM Go_3_0 IN Java*/
        public void alg_Go_3_0() {
            X_ORDER.value = 3;
            Y_ORDER.value = 0;

        }

        /** ALGORITHM Go_4_0 IN Java*/
        public void alg_Go_4_0() {
            X_ORDER.value = 4;
            Y_ORDER.value = 0;

        }

        /** ALGORITHM Go_1_1 IN Java*/
        public void alg_Go_1_1() {
            X_ORDER.value = 1;
            Y_ORDER.value = 1;

        }

        /** ALGORITHM Go_2_1 IN Java*/
        public void alg_Go_2_1() {
            X_ORDER.value = 2;
            Y_ORDER.value = 1;

        }

        /** ALGORITHM Go_3_3 IN Java*/
        public void alg_Go_3_3() {
            X_ORDER.value = 3;
            Y_ORDER.value = 3;

        }

        /** ALGORITHM Go_4_2 IN Java*/
        public void alg_Go_4_2() {
            X_ORDER.value = 4;
            Y_ORDER.value = 2;

        }
    }
    private void transition_Master_TEST_0() {
    }

    private void transition_Master_TEST_1() {
    }

    private void transition_Master_TEST_2() {
    }

    private void transition_Master_TEST_3() {
    }

    private void transition_Master_TEST_4() {
    }

    private void transition_Master_TEST_5() {
    }

    private void transition_Master_TEST_6() {
    }

    private void transition_Master_TEST_7() {
    }

    private void transition_Master_TEST_8() {
    }

    private void transition_Master_TEST_9() {
    }

    private void transition_Master_TEST_10() {
    }

    private void transition_Master_TEST_11() {
    }

    private void transition_Master_TEST_12() {
    }

    private void transition_Master_TEST_13() {
    }

    private void transition_Master_TEST_14() {
    }

    private void transition_Master_TEST_15() {
    }

    private void transition_Master_TEST_16() {
    }

    private void transition_Master_TEST_17() {
    }

    private void transition_Master_TEST_18() {
    }
}