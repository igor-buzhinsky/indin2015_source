package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class GenCyl__Basic {
    private final GenCyl instance = new GenCyl();

    public void event_INIT(boolean chome_, boolean pp1_, boolean pp2_, boolean pp3_, boolean cend_, boolean vcPermitMove_, short ID_) {
        instance.chome.value = chome_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.cend.value = cend_;
        instance.vcPermitMove.value = vcPermitMove_;
        instance.ID.value = ID_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean chome_, boolean cend_, boolean pp1_, boolean pp2_, boolean pp3_, boolean vcPermitMove_, short ID_) {
        instance.chome.value = chome_;
        instance.cend.value = cend_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.vcPermitMove.value = vcPermitMove_;
        instance.ID.value = ID_;
        instance.REQ.serviceEvent(instance); 
    }

    public void event_IN_CMD(boolean vcPermitMove_, boolean pp3_, boolean pp2_, boolean pp1_, boolean cend_, boolean chome_) {
        instance.vcPermitMove.value = vcPermitMove_;
        instance.pp3.value = pp3_;
        instance.pp2.value = pp2_;
        instance.pp1.value = pp1_;
        instance.cend.value = cend_;
        instance.chome.value = chome_;
        instance.IN_CMD.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK GenCyl
     * @author Majid Sorouri
     * @version 20150208/Majid Sorouri
     */
    private class GenCyl extends FBInstance
    {
        /** Input event qualifier */
        public BOOL chome = new BOOL();
        /** VAR cend */
        public BOOL cend = new BOOL();
        /** VAR pp1 */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** VAR vcPermitMove */
        public BOOL vcPermitMove = new BOOL();
        /** VAR ID */
        public INT ID = new INT();
        /** VAR cMoveOut */
        public BOOL cMoveOut = new BOOL();
        /** VAR cMoveIn */
        public BOOL cMoveIn = new BOOL();
        /** VAR AllowVcDown */
        public BOOL AllowVcDown = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
        /** EVENT IN_CMD */
        public EventServer IN_CMD = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Execution Confirmation */
        public EventOutput CNF = new EventOutput();
        /** EVENT OUT_CMD */
        public EventOutput OUT_CMD = new EventOutput();
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
        /** Connect the given variable to the input variable chome
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable cend
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
        /** Connect the given variable to the input variable vcPermitMove
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable ID
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
            state_wait();
            transition_GenCyl_0();
        }
        private static final int index_c1home = 2;
        private void state_c1home() {
            eccState = index_c1home;
            alg_AllowVcDown();
            OUT_CMD.serviceEvent(this);
        }
        private static final int index_Getpp1or3 = 3;
        private void state_Getpp1or3() {
            eccState = index_Getpp1or3;
            alg_Get1or3();
            CNF.serviceEvent(this);
        }
        private static final int index_Getpp2or3 = 4;
        private void state_Getpp2or3() {
            eccState = index_Getpp2or3;
            alg_Get2or3();
            CNF.serviceEvent(this);
        }
        private static final int index_GoBack = 5;
        private void state_GoBack() {
            eccState = index_GoBack;
            alg_GoBack();
            CNF.serviceEvent(this);
            alg_BlockVcDown();
            OUT_CMD.serviceEvent(this);
        }
        private static final int index_c1end = 6;
        private void state_c1end() {
            eccState = index_c1end;
            alg_AllowVcDown();
            OUT_CMD.serviceEvent(this);
        }
        private static final int index_wait = 7;
        private void state_wait() {
            eccState = index_wait;
            alg_BlockVcDown();
            OUT_CMD.serviceEvent(this);
        }

        /** The default constructor. */
        public GenCyl() {
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
                transition_GenCyl_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_GoBack) && (chome.value)) {
                state_c1home();
                transition_GenCyl_2(); 
            }
            else if ((eccState == index_Getpp1or3) && (cend.value)) {
                state_c1end();
                transition_GenCyl_3(); 
            }
            else if ((eccState == index_wait) && (chome.value & pp1.value & ID.value == 1 | (pp3.value & !pp1.value & !pp2.value))) {
                state_Getpp1or3();
                transition_GenCyl_4(); 
            }
            else if ((eccState == index_wait) && (chome.value & ID.value == 1 & !pp1.value & pp2.value)) {
                state_c1end();
                transition_GenCyl_5(); 
            }
            else if ((eccState == index_wait) && (chome.value & !pp1.value & ID.value == 2 & (pp2.value | pp3.value))) {
                state_Getpp2or3();
                transition_GenCyl_6(); 
            }
            else if ((eccState == index_Getpp2or3) && (cend.value)) {
                state_c1end();
                transition_GenCyl_7(); 
            }
            else if ((eccState == index_wait) && (chome.value & pp1.value & ID.value == 2)) {
                state_c1end();
                transition_GenCyl_8(); 
            }
        }

        /** Services the IN_CMD event. */
        public void service_IN_CMD() {
            if ((eccState == index_c1home) && (vcPermitMove.value)) {
                state_wait();
                transition_GenCyl_9(); 
            }
            else if ((eccState == index_c1end) && (vcPermitMove.value)) {
                state_GoBack();
                transition_GenCyl_10(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            cMoveOut.value = false;
            cMoveIn.value = true;
            System.out.println("GenCyl INIT " + this);
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            System.out.println("GenCyl REQ " + this);
        }

        /** ALGORITHM Get2or3 IN ST*/
        public void alg_Get2or3() {
            cMoveOut.value = true;
            cMoveIn.value = false;
            System.out.println("GenCyl Get2or3 " + this);
        }

        /** ALGORITHM Get1or3 IN ST*/
        public void alg_Get1or3() {
            cMoveOut.value = true;
            cMoveIn.value = false;
            System.out.println("GenCyl Get1or3 " + this);
        }

        /** ALGORITHM GoBack IN ST*/
        public void alg_GoBack() {
            cMoveIn.value = true;
            cMoveOut.value = false;
            System.out.println("GenCyl GoBack " + this);
        }

        /** ALGORITHM AllowVcDown IN ST*/
        public void alg_AllowVcDown() {
            AllowVcDown.value = true;
            System.out.println("GenCyl AllowVcDown " + this);
        }

        /** ALGORITHM BlockVcDown IN ST*/
        public void alg_BlockVcDown() {
            AllowVcDown.value = false;
            System.out.println("GenCyl BlockVcDown " + this);
        }
    }
    private void transition_GenCyl_0() {
    }

    private void transition_GenCyl_1() {
    }

    private void transition_GenCyl_2() {
    }

    private void transition_GenCyl_3() {
    }

    private void transition_GenCyl_4() {
    }

    private void transition_GenCyl_5() {
    }

    private void transition_GenCyl_6() {
    }

    private void transition_GenCyl_7() {
    }

    private void transition_GenCyl_8() {
    }

    private void transition_GenCyl_9() {
    }

    private void transition_GenCyl_10() {
    }
}