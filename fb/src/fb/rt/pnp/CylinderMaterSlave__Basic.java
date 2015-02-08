package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class CylinderMaterSlave__Basic {
    private final CylinderMaterSlave instance = new CylinderMaterSlave();

    public void event_Extend() {
        
        instance.Extend.serviceEvent(instance); 
    }

    public void event_Retract() {
        
        instance.Retract.serviceEvent(instance); 
    }

    public void event_REQ(boolean HOME_, boolean MID_, boolean END_) {
        instance.HOME.value = HOME_;
        instance.MID.value = MID_;
        instance.END.value = END_;
        instance.REQ.serviceEvent(instance); 
    }

    public void event_SL_CNF(boolean SL_READY_) {
        instance.SL_READY.value = SL_READY_;
        instance.SL_CNF.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK CylinderMaterSlave
     * @author JHC
     * @version 20150208/JHC
     */
    private class CylinderMaterSlave extends FBInstance
    {
        /** Input event qualifier */
        public BOOL HOME = new BOOL();
        /** Input event qualifier */
        public BOOL MID = new BOOL();
        /** Input event qualifier */
        public BOOL END = new BOOL();
        /** VAR SL_READY */
        public BOOL SL_READY = new BOOL();
        /** Output event qualifier */
        public BOOL READY = new BOOL();
        /** Output event qualifier */
        public BOOL GoOut = new BOOL();
        /** Output event qualifier */
        public BOOL GoIn = new BOOL();
        /** Initialization Request */
        public EventServer Extend = new EventInput(this);
        /** Normal Execution Request */
        public EventServer Retract = new EventInput(this);
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
        /** EVENT SL_CNF */
        public EventServer SL_CNF = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput Completed = new EventOutput();
        /** EVENT CNF */
        public EventOutput CNF = new EventOutput();
        /** EVENT SL_OP1 */
        public EventOutput SL_OP1 = new EventOutput();
        /** EVENT SL_OP2 */
        public EventOutput SL_OP2 = new EventOutput();
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
        /** Connect the given variable to the input variable HOME
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable MID
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable END
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable SL_READY
         * @param newIV The variable to connect
         */
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
            alg_Test();
            Completed.serviceEvent(this);
        }
        private static final int index_Extend = 1;
        private void state_Extend() {
            eccState = index_Extend;
            alg_Extend();
            CNF.serviceEvent(this);
        }
        private static final int index_Retract = 2;
        private void state_Retract() {
            eccState = index_Retract;
            alg_Retract();
            CNF.serviceEvent(this);
        }
        private static final int index_Home = 3;
        private void state_Home() {
            eccState = index_Home;
            alg_Home();
            CNF.serviceEvent(this);
            state_START();
            transition_CylinderMaterSlave_0();
        }
        private static final int index_End = 4;
        private void state_End() {
            eccState = index_End;
            alg_End();
            CNF.serviceEvent(this);
            SL_OP1.serviceEvent(this);
        }

        /** The default constructor. */
        public CylinderMaterSlave() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == Extend) service_Extend();
            else if (e == Retract) service_Retract();
            else if (e == REQ) service_REQ();
            else if (e == SL_CNF) service_SL_CNF();
        }

        /** Services the Extend event. */
        public void service_Extend() {
            if ((eccState == index_START)) {
                state_Extend();
                transition_CylinderMaterSlave_1(); 
            }
        }

        /** Services the Retract event. */
        public void service_Retract() {
            if ((eccState == index_START)) {
                state_Retract();
                transition_CylinderMaterSlave_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_Extend) && (END.value)) {
                state_End();
                transition_CylinderMaterSlave_3(); 
            }
            else if ((eccState == index_Retract) && (HOME.value)) {
                state_Home();
                transition_CylinderMaterSlave_4(); 
            }
        }

        /** Services the SL_CNF event. */
        public void service_SL_CNF() {
            if ((eccState == index_End) && (SL_READY.value)) {
                state_START();
                transition_CylinderMaterSlave_5(); 
            }
        }

        /** ALGORITHM Extend IN ST*/
        public void alg_Extend() {
            GoOut.value = true;
            GoIn.value = false;
            READY.value = false;
            System.out.println("ExtendMS!!");
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
        }

        /** ALGORITHM Retract IN ST*/
        public void alg_Retract() {
            GoIn.value = true;
            GoOut.value = false;
            READY.value = false;
            System.out.println("RetractMS!!");
        }

        /** ALGORITHM Home IN ST*/
        public void alg_Home() {
            READY.value = true;
            GoIn.value = false;
            System.out.println("HomeMS!!");
        }

        /** ALGORITHM End IN ST*/
        public void alg_End() {
            READY.value = true;
            GoOut.value = false;
            System.out.println("EndMS!!");
        }

        /** ALGORITHM Wait IN ST*/
        public void alg_Wait() {
            READY.value = true;
            System.out.println("Wait!!!");
        }

        /** ALGORITHM Test IN ST*/
        public void alg_Test() {
            System.out.println("Test");
        }
    }
    private void transition_CylinderMaterSlave_0() {
    }

    private void transition_CylinderMaterSlave_1() {
    }

    private void transition_CylinderMaterSlave_2() {
    }

    private void transition_CylinderMaterSlave_3() {
    }

    private void transition_CylinderMaterSlave_4() {
    }

    private void transition_CylinderMaterSlave_5() {
    }
}