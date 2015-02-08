package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class verticalcylinder3__Basic {
    private final verticalcylinder3 instance = new verticalcylinder3();

    public void event_INIT(boolean vc_up_, boolean vc_down_, boolean c1home_, boolean c2home_, boolean pp0_, boolean c1permitDown_, boolean c2PermitDown_) {
        instance.vc_up.value = vc_up_;
        instance.vc_down.value = vc_down_;
        instance.c1home.value = c1home_;
        instance.c2home.value = c2home_;
        instance.pp0.value = pp0_;
        instance.c1permitDown.value = c1permitDown_;
        instance.c2PermitDown.value = c2PermitDown_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean vc_up_, boolean vc_down_, boolean c1home_, boolean c2home_, boolean pp0_) {
        instance.vc_up.value = vc_up_;
        instance.vc_down.value = vc_down_;
        instance.c1home.value = c1home_;
        instance.c2home.value = c2home_;
        instance.pp0.value = pp0_;
        instance.REQ.serviceEvent(instance); 
    }

    public void event_IN_CMD(boolean c1permitDown_, boolean vc_up_, boolean vc_down_, boolean c1home_, boolean c2home_, boolean pp0_, boolean c2PermitDown_) {
        instance.c1permitDown.value = c1permitDown_;
        instance.vc_up.value = vc_up_;
        instance.vc_down.value = vc_down_;
        instance.c1home.value = c1home_;
        instance.c2home.value = c2home_;
        instance.pp0.value = pp0_;
        instance.c2PermitDown.value = c2PermitDown_;
        instance.IN_CMD.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK verticalcylinder3
     * @author Majid Sorouri
     * @version 20150208/Majid Sorouri
     */
    private class verticalcylinder3 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL vc_up = new BOOL();
        /** VAR vc_down */
        public BOOL vc_down = new BOOL();
        /** VAR c1home */
        public BOOL c1home = new BOOL();
        /** VAR c2home */
        public BOOL c2home = new BOOL();
        /** VAR pp0 */
        public BOOL pp0 = new BOOL();
        /** VAR c1permitDown */
        public BOOL c1permitDown = new BOOL();
        /** VAR c2PermitDown */
        public BOOL c2PermitDown = new BOOL();
        /** Output event qualifier */
        public BOOL vcMoveOut = new BOOL();
        /** VAR DownToPick */
        public BOOL DownToPick = new BOOL();
        /** VAR DownToDrop */
        public BOOL DownToDrop = new BOOL();
        /** VAR vc_Done */
        public BOOL vc_Done = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
        /** EVENT IN_CMD */
        public EventServer IN_CMD = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** EVENT CNF */
        public EventOutput CNF = new EventOutput();
        /** EVENT OUT_CMD */
        public EventOutput OUT_CMD = new EventOutput();
        /** EVENT OUT_CMD2 */
        public EventOutput OUT_CMD2 = new EventOutput();
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
        /** Connect the given variable to the input variable vc_up
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vc_down
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c1home
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c2home
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable pp0
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c1permitDown
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c2PermitDown
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
            state_Up();
            transition_verticalcylinder3_0();
        }
        private static final int index_GoUp = 2;
        private void state_GoUp() {
            eccState = index_GoUp;
            alg_Up();
            CNF.serviceEvent(this);
        }
        private static final int index_GoDown = 3;
        private void state_GoDown() {
            eccState = index_GoDown;
            alg_Down();
            CNF.serviceEvent(this);
        }
        private static final int index_DownToPick = 4;
        private void state_DownToPick() {
            eccState = index_DownToPick;
            alg_Pick();
            OUT_CMD.serviceEvent(this);
        }
        private static final int index_DownToDrop = 5;
        private void state_DownToDrop() {
            eccState = index_DownToDrop;
            alg_Drop();
            OUT_CMD.serviceEvent(this);
        }
        private static final int index_Up = 6;
        private void state_Up() {
            eccState = index_Up;
            alg_Finish();
            OUT_CMD2.serviceEvent(this);
        }

        /** The default constructor. */
        public verticalcylinder3() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == REQ) service_REQ();
            else if (e == IN_CMD) service_IN_CMD();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_verticalcylinder3_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_GoDown) && (vc_down.value & !(c1home.value & c2home.value))) {
                state_DownToPick();
                transition_verticalcylinder3_2(); 
            }
            else if ((eccState == index_GoDown) && (c1home.value & c2home.value & vc_down.value)) {
                state_DownToDrop();
                transition_verticalcylinder3_3(); 
            }
            else if ((eccState == index_GoUp) && (vc_up.value)) {
                state_Up();
                transition_verticalcylinder3_4(); 
            }
        }

        /** Services the IN_CMD event. */
        public void service_IN_CMD() {
            if ((eccState == index_DownToDrop)) {
                state_GoUp();
                transition_verticalcylinder3_5(); 
            }
            else if ((eccState == index_DownToPick)) {
                state_GoUp();
                transition_verticalcylinder3_6(); 
            }
            else if ((eccState == index_Up) && (c1permitDown.value & c2PermitDown.value)) {
                state_GoDown();
                transition_verticalcylinder3_7(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            vcMoveOut.value = false;
            DownToPick.value = false;
            DownToDrop.value = false;
            vc_Done.value = true;
            System.out.println("VertCyl INIT");
        }

        /** ALGORITHM Down IN ST*/
        public void alg_Down() {
            vcMoveOut.value = true;
            vc_Done.value = false;
            System.out.println("VertCyl Down");
        }

        /** ALGORITHM Up IN ST*/
        public void alg_Up() {
            vcMoveOut.value = false;
            System.out.println("VertCyl Up");
        }

        /** ALGORITHM Pick IN ST*/
        public void alg_Pick() {
            DownToPick.value = true;
            DownToDrop.value = false;
            System.out.println("VertCyl Pick");
        }

        /** ALGORITHM Drop IN ST*/
        public void alg_Drop() {
            DownToPick.value = false;
            DownToDrop.value = true;
            System.out.println("VertCyl Drop");
        }

        /** ALGORITHM Finish IN ST*/
        public void alg_Finish() {
            vc_Done.value = true;
            System.out.println("VertCyl Finish");
        }
    }
    private void transition_verticalcylinder3_0() {
    }

    private void transition_verticalcylinder3_1() {
    }

    private void transition_verticalcylinder3_2() {
    }

    private void transition_verticalcylinder3_3() {
    }

    private void transition_verticalcylinder3_4() {
    }

    private void transition_verticalcylinder3_5() {
    }

    private void transition_verticalcylinder3_6() {
    }

    private void transition_verticalcylinder3_7() {
    }
}