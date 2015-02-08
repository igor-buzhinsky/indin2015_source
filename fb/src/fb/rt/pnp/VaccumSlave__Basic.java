package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class VaccumSlave__Basic {
    private final VaccumSlave instance = new VaccumSlave();

    public void event_OP1() {
        
        instance.OP1.serviceEvent(instance); 
    }

    public void event_OP2() {
        
        instance.OP2.serviceEvent(instance); 
    }

    public void event_REQ(boolean VACCUM_) {
        instance.VACCUM.value = VACCUM_;
        instance.REQ.serviceEvent(instance); 
    }

    public void event_INIT(boolean VACCUM_) {
        instance.VACCUM.value = VACCUM_;
        instance.INIT.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK VaccumSlave
     * @author JHC
     * @version 20150208/JHC
     */
    private class VaccumSlave extends FBInstance
    {
        /** Input event qualifier */
        public BOOL VACCUM = new BOOL();
        /** Output event qualifier */
        public BOOL READY = new BOOL();
        /** Output event qualifier */
        public BOOL VaccumOn = new BOOL();
        /** Output event qualifier */
        public BOOL VaccumOff = new BOOL();
        /** Initialization Request */
        public EventServer OP1 = new EventInput(this);
        /** Normal Execution Request */
        public EventServer OP2 = new EventInput(this);
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
        /** EVENT INIT */
        public EventServer INIT = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput Completed = new EventOutput();
        /** EVENT CNF */
        public EventOutput CNF = new EventOutput();
        /** EVENT INTO */
        public EventOutput INTO = new EventOutput();
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
        /** Connect the given variable to the input variable VACCUM
         * @param newIV The variable to connect
         */
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_OP11 = 1;
        private void state_OP11() {
            eccState = index_OP11;
            alg_OP11();
            CNF.serviceEvent(this);
        }
        private static final int index_OP22 = 2;
        private void state_OP22() {
            eccState = index_OP22;
            alg_OP22();
            CNF.serviceEvent(this);
        }
        private static final int index_OP12 = 3;
        private void state_OP12() {
            eccState = index_OP12;
            alg_OP12();
            CNF.serviceEvent(this);
        }
        private static final int index_OP21 = 4;
        private void state_OP21() {
            eccState = index_OP21;
            alg_OP22();
            CNF.serviceEvent(this);
        }
        private static final int index_Vaccum = 5;
        private void state_Vaccum() {
            eccState = index_Vaccum;
            alg_Vaccum();
            CNF.serviceEvent(this);
            Completed.serviceEvent(this);
            state_START();
            transition_VaccumSlave_0();
        }
        private static final int index_INIT = 6;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            INTO.serviceEvent(this);
            state_START();
            transition_VaccumSlave_1();
        }

        /** The default constructor. */
        public VaccumSlave() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == OP1) service_OP1();
            else if (e == OP2) service_OP2();
            else if (e == REQ) service_REQ();
            else if (e == INIT) service_INIT();
        }

        /** Services the OP1 event. */
        public void service_OP1() {
            if ((eccState == index_START) && (VACCUM.value)) {
                state_OP11();
                transition_VaccumSlave_2(); 
            }
            else if ((eccState == index_START) && (!VACCUM.value)) {
                state_OP12();
                transition_VaccumSlave_3(); 
            }
        }

        /** Services the OP2 event. */
        public void service_OP2() {
            if ((eccState == index_START) && (!VACCUM.value)) {
                state_OP22();
                transition_VaccumSlave_4(); 
            }
            else if ((eccState == index_START) && (VACCUM.value)) {
                state_OP21();
                transition_VaccumSlave_5(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_OP12) && (VACCUM.value)) {
                state_Vaccum();
                transition_VaccumSlave_6(); 
            }
            else if ((eccState == index_OP11) && (!VACCUM.value)) {
                state_Vaccum();
                transition_VaccumSlave_7(); 
            }
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_VaccumSlave_8(); 
            }
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
        }

        /** ALGORITHM OP11 IN ST*/
        public void alg_OP11() {
            VaccumOff.value = true;
            VaccumOn.value = false;
            READY.value = false;
            System.out.println("OP11!!");
        }

        /** ALGORITHM OP12 IN ST*/
        public void alg_OP12() {
            VaccumOff.value = false;
            VaccumOn.value = true;
            READY.value = false;
            System.out.println("OP12!!");
        }

        /** ALGORITHM OP21 IN ST*/
        public void alg_OP21() {
            VaccumOff.value = true;
            VaccumOn.value = false;
            READY.value = false;
            System.out.println("OP21!!");
        }

        /** ALGORITHM OP22 IN ST*/
        public void alg_OP22() {
            VaccumOff.value = true;
            VaccumOn.value = false;
            READY.value = false;
            System.out.println("OP22!!");
        }

        /** ALGORITHM Vaccum IN ST*/
        public void alg_Vaccum() {
            READY.value = true;
            System.out.println("Vaccum!!");
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            VACCUM.value = false;
        }
    }
    private void transition_VaccumSlave_0() {
    }

    private void transition_VaccumSlave_1() {
    }

    private void transition_VaccumSlave_2() {
    }

    private void transition_VaccumSlave_3() {
    }

    private void transition_VaccumSlave_4() {
    }

    private void transition_VaccumSlave_5() {
    }

    private void transition_VaccumSlave_6() {
    }

    private void transition_VaccumSlave_7() {
    }

    private void transition_VaccumSlave_8() {
    }
}