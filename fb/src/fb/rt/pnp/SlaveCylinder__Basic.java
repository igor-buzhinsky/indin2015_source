package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class SlaveCylinder__Basic {
    private final SlaveCylinder instance = new SlaveCylinder();

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

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SlaveCylinder
     * @author JHC
     * @version 20150208/JHC
     */
    private class SlaveCylinder extends FBInstance
    {
        /** Input event qualifier */
        public BOOL HOME = new BOOL();
        /** Input event qualifier */
        public BOOL MID = new BOOL();
        /** Input event qualifier */
        public BOOL END = new BOOL();
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
        /** Initialization Confirm */
        public EventOutput Completed = new EventOutput();
        /** EVENT CNF */
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
        /** Connect the given variable to the input variable HOME
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable MID
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable END
         * @param newIV The variable to connect
         */
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
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
        private static final int index_End = 3;
        private void state_End() {
            eccState = index_End;
            alg_End();
            CNF.serviceEvent(this);
            Completed.serviceEvent(this);
            state_START();
            transition_SlaveCylinder_0();
        }
        private static final int index_Home = 4;
        private void state_Home() {
            eccState = index_Home;
            alg_Home();
            CNF.serviceEvent(this);
            Completed.serviceEvent(this);
            state_START();
            transition_SlaveCylinder_1();
        }

        /** The default constructor. */
        public SlaveCylinder() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == Extend) service_Extend();
            else if (e == Retract) service_Retract();
            else if (e == REQ) service_REQ();
        }

        /** Services the Extend event. */
        public void service_Extend() {
            if ((eccState == index_START)) {
                state_Extend();
                transition_SlaveCylinder_2(); 
            }
        }

        /** Services the Retract event. */
        public void service_Retract() {
            if ((eccState == index_START)) {
                state_Retract();
                transition_SlaveCylinder_3(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_Retract) && (HOME.value)) {
                state_Home();
                transition_SlaveCylinder_4(); 
            }
            else if ((eccState == index_Extend) && (END.value)) {
                state_End();
                transition_SlaveCylinder_5(); 
            }
        }

        /** ALGORITHM Extend IN ST*/
        public void alg_Extend() {
            GoOut.value = true;
            GoIn.value = false;
            READY.value = false;
            System.out.println("Extend!!");
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            System.out.println("REQ!!");
        }

        /** ALGORITHM Retract IN ST*/
        public void alg_Retract() {
            GoIn.value = true;
            GoOut.value = false;
            READY.value = false;
            System.out.println("Retract!!");
        }

        /** ALGORITHM Home IN ST*/
        public void alg_Home() {
            READY.value = true;
            GoIn.value = false;
            System.out.println("Home!!");
        }

        /** ALGORITHM End IN ST*/
        public void alg_End() {
            READY.value = true;
            GoOut.value = false;
            System.out.println("End!!");
        }
    }
    private void transition_SlaveCylinder_0() {
    }

    private void transition_SlaveCylinder_1() {
    }

    private void transition_SlaveCylinder_2() {
    }

    private void transition_SlaveCylinder_3() {
    }

    private void transition_SlaveCylinder_4() {
    }

    private void transition_SlaveCylinder_5() {
    }
}