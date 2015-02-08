package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class SFC1__Basic {
    private final SFC1 instance = new SFC1();

    public void event_INIT(boolean pp1_, boolean pp2_, boolean pp3_) {
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean pp1_, boolean pp2_, boolean pp3_) {
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SFC1
     * @author JHC
     * @version 20150208/JHC
     */
    private class SFC1 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** Output event qualifier */
        public BOOL X1 = new BOOL();
        /** VAR X2 */
        public BOOL X2 = new BOOL();
        /** VAR X3 */
        public BOOL X3 = new BOOL();
        /** VAR X4 */
        public BOOL X4 = new BOOL();
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
        /** Connect the given variable to the input variable pp1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable pp2
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable pp3
         * @param newIV The variable to connect
         */
        private static final int index_X4 = 0;
        private void state_X4() {
            eccState = index_X4;
            alg_X4();
            CNF.serviceEvent(this);
        }
        private static final int index_INIT = 1;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            INITO.serviceEvent(this);
            state_X4();
            transition_SFC1_0();
        }
        private static final int index_X1 = 2;
        private void state_X1() {
            eccState = index_X1;
            alg_X1();
            CNF.serviceEvent(this);
        }
        private static final int index_X2 = 3;
        private void state_X2() {
            eccState = index_X2;
            alg_X2();
            CNF.serviceEvent(this);
        }
        private static final int index_X3 = 4;
        private void state_X3() {
            eccState = index_X3;
            alg_X3();
            CNF.serviceEvent(this);
        }

        /** The default constructor. */
        public SFC1() {
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
            if ((eccState == index_X4)) {
                state_INIT();
                transition_SFC1_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_X4) && (pp1.value)) {
                state_X1();
                transition_SFC1_2(); 
            }
            else if ((eccState == index_X4) && ((pp2.value & !pp1.value))) {
                state_X2();
                transition_SFC1_3(); 
            }
            else if ((eccState == index_X4) && ((pp3.value & !pp1.value & !pp2.value))) {
                state_X3();
                transition_SFC1_4(); 
            }
            else if ((eccState == index_X1) && (!pp1.value)) {
                state_X4();
                transition_SFC1_5(); 
            }
            else if ((eccState == index_X2) && (!pp2.value)) {
                state_X4();
                transition_SFC1_6(); 
            }
            else if ((eccState == index_X3) && (!pp3.value)) {
                state_X4();
                transition_SFC1_7(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            X1.value = false;
            X2.value = false;
            X3.value = false;
            X4.value = false;
            System.out.println("SFC1: INIT");
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
        }

        /** ALGORITHM X4 IN ST*/
        public void alg_X4() {
            X4.value = true;
            if (!pp1.value) {
                X1.value = false;
            }
            if (!pp2.value) {
                X2.value = false;
            }
            if (!pp3.value) {
                X3.value = false;
            }
            System.out.println("SFC1: X4");
        }

        /** ALGORITHM X1 IN ST*/
        public void alg_X1() {
            X1.value = true;
            X4.value = false;
            System.out.println("SFC1: X1");
        }

        /** ALGORITHM X2 IN ST*/
        public void alg_X2() {
            X2.value = true;
            X4.value = false;
            System.out.println("SFC1: X2");
        }

        /** ALGORITHM X3 IN ST*/
        public void alg_X3() {
            X3.value = true;
            X4.value = false;
            System.out.println("SFC1: X3");
        }
    }
    private void transition_SFC1_0() {
    }

    private void transition_SFC1_1() {
    }

    private void transition_SFC1_2() {
    }

    private void transition_SFC1_3() {
    }

    private void transition_SFC1_4() {
    }

    private void transition_SFC1_5() {
    }

    private void transition_SFC1_6() {
    }

    private void transition_SFC1_7() {
    }
}