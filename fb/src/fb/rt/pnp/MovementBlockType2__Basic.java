package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class MovementBlockType2__Basic {
    private final MovementBlockType2 instance = new MovementBlockType2();

    public void event_INIT(boolean Extend_) {
        instance.Extend.value = Extend_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_CLK(boolean Extend_) {
        instance.Extend.value = Extend_;
        instance.CLK.serviceEvent(instance); 
    }

    public void event_FAULT() {
        
        instance.FAULT.serviceEvent(instance); 
    }

    public void event_RESUME() {
        
        instance.RESUME.serviceEvent(instance); 
    }

    /* Copyright (c)2015 The University of Auckland. All rights reserved. */




    /** FUNCTION_BLOCK MovementBlockType2
     * @author Sandeep Patil
     * @version 20150208/Sandeep Patil
     */
    private class MovementBlockType2 extends FBInstance
    {
        /** Move forwards */
        public BOOL Extend = new BOOL();
        /** Confirmed move forwards */
        public BOOL C_FWD = new BOOL();
        /** Confirmed move backwards */
        public BOOL C_BWD = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Clock signal */
        public EventServer CLK = new EventInput(this);
        /** EVENT FAULT */
        public EventServer FAULT = new EventInput(this);
        /** EVENT RESUME */
        public EventServer RESUME = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Data outputs changed */
        public EventOutput CHG = new EventOutput();
        /** EVENT OFAULT */
        public EventOutput OFAULT = new EventOutput();
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
        /** Connect the given variable to the input variable Extend
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
        }
        private static final int index_MOVE_FWD = 2;
        private void state_MOVE_FWD() {
            eccState = index_MOVE_FWD;
            alg_FWD();
            CHG.serviceEvent(this);
        }
        private static final int index_MOVE_BWD = 3;
        private void state_MOVE_BWD() {
            eccState = index_MOVE_BWD;
            alg_BWD();
            CHG.serviceEvent(this);
        }
        private static final int index_STOP = 4;
        private void state_STOP() {
            eccState = index_STOP;
            alg_STOP();
            CHG.serviceEvent(this);
        }
        private static final int index_FAILURE = 5;
        private void state_FAILURE() {
            eccState = index_FAILURE;
            alg_STOP();
            OFAULT.serviceEvent(this);
        }

        /** The default constructor. */
        public MovementBlockType2() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == CLK) service_CLK();
            else if (e == FAULT) service_FAULT();
            else if (e == RESUME) service_RESUME();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_MovementBlockType2_0(); 
            }
        }

        /** Services the CLK event. */
        public void service_CLK() {
            if ((eccState == index_INIT) && (Extend.value)) {
                state_MOVE_FWD();
                transition_MovementBlockType2_1(); 
            }
            else if ((eccState == index_INIT) && (!Extend.value)) {
                state_MOVE_BWD();
                transition_MovementBlockType2_2(); 
            }
            else if ((eccState == index_STOP) && (Extend.value)) {
                state_MOVE_FWD();
                transition_MovementBlockType2_3(); 
            }
            else if ((eccState == index_STOP) && (!Extend.value)) {
                state_MOVE_BWD();
                transition_MovementBlockType2_4(); 
            }
            else if ((eccState == index_MOVE_FWD) && (!Extend.value)) {
                state_MOVE_BWD();
                transition_MovementBlockType2_5(); 
            }
            else if ((eccState == index_MOVE_BWD) && (Extend.value)) {
                state_MOVE_FWD();
                transition_MovementBlockType2_6(); 
            }
            else if ((eccState == index_MOVE_FWD) && (Extend.value)) {
                state_MOVE_FWD();
                transition_MovementBlockType2_7(); 
            }
            else if ((eccState == index_MOVE_BWD) && (!Extend.value)) {
                state_MOVE_BWD();
                transition_MovementBlockType2_8(); 
            }
        }

        /** Services the FAULT event. */
        public void service_FAULT() {
            if ((eccState == index_MOVE_FWD)) {
                state_FAILURE();
                transition_MovementBlockType2_9(); 
            }
            else if ((eccState == index_STOP)) {
                state_FAILURE();
                transition_MovementBlockType2_10(); 
            }
            else if ((eccState == index_MOVE_BWD)) {
                state_FAILURE();
                transition_MovementBlockType2_11(); 
            }
            else if ((eccState == index_INIT)) {
                state_FAILURE();
                transition_MovementBlockType2_12(); 
            }
        }

        /** Services the RESUME event. */
        public void service_RESUME() {
            if ((eccState == index_FAILURE)) {
                state_STOP();
                transition_MovementBlockType2_13(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            C_FWD.value = false;
            C_BWD.value = false;

        }

        /** ALGORITHM FWD IN Java*/
        public void alg_FWD() {
            C_FWD.value = true;
            C_BWD.value = false;

        }

        /** ALGORITHM BWD IN Java*/
        public void alg_BWD() {
            C_FWD.value = false;
            C_BWD.value = true;

        }

        /** ALGORITHM STOP IN Java*/
        public void alg_STOP() {
            C_FWD.value = false;
            C_BWD.value = false;

        }
    }
    private void transition_MovementBlockType2_0() {
    }

    private void transition_MovementBlockType2_1() {
    }

    private void transition_MovementBlockType2_2() {
    }

    private void transition_MovementBlockType2_3() {
    }

    private void transition_MovementBlockType2_4() {
    }

    private void transition_MovementBlockType2_5() {
    }

    private void transition_MovementBlockType2_6() {
    }

    private void transition_MovementBlockType2_7() {
    }

    private void transition_MovementBlockType2_8() {
    }

    private void transition_MovementBlockType2_9() {
    }

    private void transition_MovementBlockType2_10() {
    }

    private void transition_MovementBlockType2_11() {
    }

    private void transition_MovementBlockType2_12() {
    }

    private void transition_MovementBlockType2_13() {
    }
}