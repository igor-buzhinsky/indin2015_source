package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class CentralizedControl__Basic {
    private final CentralizedControl instance = new CentralizedControl();

    public void event_INIT() {
        
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean c1Home_, boolean c1End_, boolean c2Home_, boolean c2End_, boolean vcHome_, boolean vcEnd_, boolean pp1_, boolean pp2_, boolean pp3_, boolean vac_) {
        instance.c1Home.value = c1Home_;
        instance.c1End.value = c1End_;
        instance.c2Home.value = c2Home_;
        instance.c2End.value = c2End_;
        instance.vcHome.value = vcHome_;
        instance.vcEnd.value = vcEnd_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.vac.value = vac_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK CentralizedControl
     * @author msor021
     * @version 20150208/msor021
     */
    private class CentralizedControl extends FBInstance
    {
        /** Input event qualifier */
        public BOOL c1Home = new BOOL();
        /** VAR c1End */
        public BOOL c1End = new BOOL();
        /** VAR c2Home */
        public BOOL c2Home = new BOOL();
        /** VAR c2End */
        public BOOL c2End = new BOOL();
        /** VAR vcHome */
        public BOOL vcHome = new BOOL();
        /** VAR vcEnd */
        public BOOL vcEnd = new BOOL();
        /** VAR pp1 */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** VAR vac */
        public BOOL vac = new BOOL();
        /** Output event qualifier */
        public BOOL c1Extend = new BOOL();
        /** VAR c1Retract */
        public BOOL c1Retract = new BOOL();
        /** VAR c2Extend */
        public BOOL c2Extend = new BOOL();
        /** VAR c2Retract */
        public BOOL c2Retract = new BOOL();
        /** VAR vcExtend */
        public BOOL vcExtend = new BOOL();
        /** VAR vacuum_on */
        public BOOL vacuum_on = new BOOL();
        /** VAR vacuum_off */
        public BOOL vacuum_off = new BOOL();
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
        /** Connect the given variable to the input variable c1Home
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c1End
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c2Home
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c2End
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vcHome
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vcEnd
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
        /** Connect the given variable to the input variable vac
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
            state_Wait();
            transition_CentralizedControl_0();
        }
        private static final int index_GoDown = 2;
        private void state_GoDown() {
            eccState = index_GoDown;
            alg_extendvc();
            CNF.serviceEvent(this);
        }
        private static final int index_Wait = 3;
        private void state_Wait() {
            eccState = index_Wait;
            alg_Wait();
        }
        private static final int index_Piece1 = 4;
        private void state_Piece1() {
            eccState = index_Piece1;
            alg_extend1();
            CNF.serviceEvent(this);
        }
        private static final int index_Piece2 = 5;
        private void state_Piece2() {
            eccState = index_Piece2;
            alg_extend2();
            CNF.serviceEvent(this);
        }
        private static final int index_Piece3 = 6;
        private void state_Piece3() {
            eccState = index_Piece3;
            alg_extend1and2();
            CNF.serviceEvent(this);
        }
        private static final int index_Vacuum_On = 7;
        private void state_Vacuum_On() {
            eccState = index_Vacuum_On;
            alg_TurnOnVac();
            CNF.serviceEvent(this);
        }
        private static final int index_GoUp = 8;
        private void state_GoUp() {
            eccState = index_GoUp;
            alg_Retractvc();
            CNF.serviceEvent(this);
        }
        private static final int index_VacuumOff = 9;
        private void state_VacuumOff() {
            eccState = index_VacuumOff;
            alg_TurnOffvac();
            CNF.serviceEvent(this);
        }
        private static final int index_Retract = 10;
        private void state_Retract() {
            eccState = index_Retract;
            alg_RetracAll();
            CNF.serviceEvent(this);
        }

        /** The default constructor. */
        public CentralizedControl() {
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
                transition_CentralizedControl_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_GoUp) && (vcHome.value & c1Home.value & c2Home.value)) {
                state_Wait();
                transition_CentralizedControl_2(); 
            }
            else if ((eccState == index_Retract) && (vac.value & c1Home.value & c2Home.value)) {
                state_GoDown();
                transition_CentralizedControl_3(); 
            }
            else if ((eccState == index_Wait) && (pp1.value & vcHome.value)) {
                state_Piece1();
                transition_CentralizedControl_4(); 
            }
            else if ((eccState == index_Wait) && (!pp1.value & pp2.value & vcHome.value)) {
                state_Piece2();
                transition_CentralizedControl_5(); 
            }
            else if ((eccState == index_Wait) && (!pp1.value & !pp2.value & pp3.value & vcHome.value)) {
                state_Piece3();
                transition_CentralizedControl_6(); 
            }
            else if ((eccState == index_Piece1) && (c1End.value)) {
                state_GoDown();
                transition_CentralizedControl_7(); 
            }
            else if ((eccState == index_Piece2) && (c2End.value)) {
                state_GoDown();
                transition_CentralizedControl_8(); 
            }
            else if ((eccState == index_Piece3) && (c1End.value & c2End.value)) {
                state_GoDown();
                transition_CentralizedControl_9(); 
            }
            else if ((eccState == index_GoDown) && (vcEnd.value & !(c1Home.value & c2Home.value))) {
                state_Vacuum_On();
                transition_CentralizedControl_10(); 
            }
            else if ((eccState == index_Vacuum_On) && (vac.value)) {
                state_GoUp();
                transition_CentralizedControl_11(); 
            }
            else if ((eccState == index_VacuumOff) && (!vac.value)) {
                state_GoUp();
                transition_CentralizedControl_12(); 
            }
            else if ((eccState == index_GoDown) && (vcEnd.value & c1Home.value & c2Home.value)) {
                state_VacuumOff();
                transition_CentralizedControl_13(); 
            }
            else if ((eccState == index_GoUp) && (vcHome.value & (!c1Home.value | !c2Home.value))) {
                state_Retract();
                transition_CentralizedControl_14(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            c1Extend.value = false;
            c2Extend.value = false;
            vcExtend.value = false;
            c1Retract.value = false;
            c2Retract.value = false;
            vacuum_on.value = false;
            vacuum_off.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;
        }

        /** ALGORITHM extend1 IN ST*/
        public void alg_extend1() {
            c1Extend.value = true;
            System.out.println("WorkPiece 1 Detected");
            System.out.println("Extending HOR CYL 1");
        }

        /** ALGORITHM extend2 IN ST*/
        public void alg_extend2() {
            c2Extend.value = true;
            System.out.println("WorkPiece 2 Detected");
            System.out.println("Extending HOR CYL 2");
        }

        /** ALGORITHM extend1and2 IN ST*/
        public void alg_extend1and2() {
            c1Extend.value = true;
            c2Extend.value = true;
            System.out.println("WorkPiece 3 Detected");
            System.out.println("Extending HOR CYL 1 and HOR CYL 2");
        }

        /** ALGORITHM extendvc IN ST*/
        public void alg_extendvc() {
            vcExtend.value = true;
            System.out.println("Extending VER CYL");
        }

        /** ALGORITHM TurnOnVac IN ST*/
        public void alg_TurnOnVac() {
            vacuum_on.value = true;
            vacuum_off.value = false;
            System.out.println("Turning ON VACCUM");
        }

        /** ALGORITHM Retractvc IN ST*/
        public void alg_Retractvc() {
            vcExtend.value = false;
            System.out.println("Retracting VER CYL");
        }

        /** ALGORITHM TurnOffvac IN ST*/
        public void alg_TurnOffvac() {
            vacuum_on.value = false;
            vacuum_off.value = true;
            System.out.println("Turning OFF Vaccum");
        }

        /** ALGORITHM RetracAll IN ST*/
        public void alg_RetracAll() {
            c1Extend.value = false;
            c2Extend.value = false;
            c1Retract.value = true;
            c2Retract.value = true;
            System.out.println("Retracting HOR CYL");
        }

        /** ALGORITHM Wait IN ST*/
        public void alg_Wait() {
            c1Extend.value = false;
            c2Extend.value = false;
            vcExtend.value = false;
            c1Retract.value = false;
            c2Retract.value = false;
            vacuum_on.value = false;
            vacuum_off.value = false;
        }
    }
    private void transition_CentralizedControl_0() {
    }

    private void transition_CentralizedControl_1() {
    }

    private void transition_CentralizedControl_2() {
    }

    private void transition_CentralizedControl_3() {
    }

    private void transition_CentralizedControl_4() {
    }

    private void transition_CentralizedControl_5() {
    }

    private void transition_CentralizedControl_6() {
    }

    private void transition_CentralizedControl_7() {
    }

    private void transition_CentralizedControl_8() {
    }

    private void transition_CentralizedControl_9() {
    }

    private void transition_CentralizedControl_10() {
    }

    private void transition_CentralizedControl_11() {
    }

    private void transition_CentralizedControl_12() {
    }

    private void transition_CentralizedControl_13() {
    }

    private void transition_CentralizedControl_14() {
    }
}