package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class PnpXYCalculatorBA__Basic {
    private final PnpXYCalculatorBA instance = new PnpXYCalculatorBA();

    public void event_INIT(int BASEX_, int BASEY_) {
        instance.BASEX.value = Math.abs(BASEX_);
        instance.BASEY.value = Math.abs(BASEY_);
        instance.INIT.serviceEvent(instance); 
    }

    public void event_CLK(boolean vacuumon_, int CYL1Pos_, int CYL2Pos_, int CYL3Pos_, int VCYL1Pos_, int VCYL2Pos_, int VCYL3Pos_) {
        instance.vacuumon.value = vacuumon_;
        instance.CYL1Pos.value = Math.abs(CYL1Pos_);
        instance.CYL2Pos.value = Math.abs(CYL2Pos_);
        instance.CYL3Pos.value = Math.abs(CYL3Pos_);
        instance.VCYL1Pos.value = Math.abs(VCYL1Pos_);
        instance.VCYL2Pos.value = Math.abs(VCYL2Pos_);
        instance.VCYL3Pos.value = Math.abs(VCYL3Pos_);
        instance.CLK.serviceEvent(instance); 
    }

    public void event_REQ(boolean vacuum_on_, boolean vacuum_off_, boolean Add1_, boolean Add2_, boolean Add3_, boolean Add4_) {
        instance.vacuum_on.value = vacuum_on_;
        instance.vacuum_off.value = vacuum_off_;
        instance.Add1.value = Add1_;
        instance.Add2.value = Add2_;
        instance.Add3.value = Add3_;
        instance.Add4.value = Add4_;
        instance.REQ.serviceEvent(instance); 
    }

    public void event_ADD_WP(int AddedWP_X_, int AddedWP_Y_) {
        instance.AddedWP_X.value = Math.abs(AddedWP_X_);
        instance.AddedWP_Y.value = Math.abs(AddedWP_Y_);
        instance.ADD_WP.serviceEvent(instance); 
    }

    public void event_ADD_WP00() {
        
        instance.ADD_WP00.serviceEvent(instance); 
    }

    public void event_REMOVE_WP() {
        
        instance.REMOVE_WP.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK PnpXYCalculatorBA
     * @author JHC
     * @version 20150208/JHC
     */
    private class PnpXYCalculatorBA extends FBInstance
    {
        /** VAR BASEX */
        public UINT BASEX = new UINT();
        /** VAR BASEY */
        public UINT BASEY = new UINT();
        /** VAR vacuum_on */
        public BOOL vacuum_on = new BOOL();
        /** VAR vacuum_off */
        public BOOL vacuum_off = new BOOL();
        /** VAR Add1 */
        public BOOL Add1 = new BOOL();
        /** VAR Add2 */
        public BOOL Add2 = new BOOL();
        /** VAR Add3 */
        public BOOL Add3 = new BOOL();
        /** VAR Add4 */
        public BOOL Add4 = new BOOL();
        /** VAR AddedWP_X */
        public UINT AddedWP_X = new UINT();
        /** VAR AddedWP_Y */
        public UINT AddedWP_Y = new UINT();
        /** VAR vacuumon */
        public BOOL vacuumon = new BOOL();
        /** VAR CYL1Pos */
        public UINT CYL1Pos = new UINT();
        /** VAR CYL2Pos */
        public UINT CYL2Pos = new UINT();
        /** VAR CYL3Pos */
        public UINT CYL3Pos = new UINT();
        /** VAR VCYL1Pos */
        public UINT VCYL1Pos = new UINT();
        /** VAR VCYL2Pos */
        public UINT VCYL2Pos = new UINT();
        /** VAR VCYL3Pos */
        public UINT VCYL3Pos = new UINT();
        /** Response Data from Socket */
        public UINT BASE_X = new UINT();
        /** Response Data from Socket */
        public UINT BASE_Y = new UINT();
        /** Response Data from Socket */
        public UINT CYL1_X = new UINT();
        /** Response Data from Socket */
        public UINT CYL1_Y = new UINT();
        /** Response Data from Socket */
        public UINT CYL2_X = new UINT();
        /** Response Data from Socket */
        public UINT CYL2_Y = new UINT();
        /** Response Data from Socket */
        public UINT CYL3_X = new UINT();
        /** Response Data from Socket */
        public UINT CYL3_Y = new UINT();
        /** Response Data from Socket */
        public UINT VCYL1_X = new UINT();
        /** Response Data from Socket */
        public UINT VCYL1_Y = new UINT();
        /** Response Data from Socket */
        public UINT VCYL2_X = new UINT();
        /** Response Data from Socket */
        public UINT VCYL2_Y = new UINT();
        /** Response Data from Socket */
        public UINT VCYL3_X = new UINT();
        /** Response Data from Socket */
        public UINT VCYL3_Y = new UINT();
        /** Response Data from Socket */
        public UINT WP1_X = new UINT();
        /** Response Data from Socket */
        public UINT WP1_Y = new UINT();
        /** Response Data from Socket */
        public UINT WP2_X = new UINT();
        /** Response Data from Socket */
        public UINT WP2_Y = new UINT();
        /** Response Data from Socket */
        public UINT WP3_X = new UINT();
        /** Response Data from Socket */
        public UINT WP3_Y = new UINT();
        /** VAR cyl1x */
        public UINT cyl1x = new UINT();
        /** VAR cyl2x */
        public UINT cyl2x = new UINT();
        /** VAR cyl3x */
        public UINT cyl3x = new UINT();
        /** VAR vcyl1y */
        public UINT vcyl1y = new UINT();
        /** VAR vcyl2y */
        public UINT vcyl2y = new UINT();
        /** VAR vcyl3y */
        public UINT vcyl3y = new UINT();
        /** VAR wp1x */
        public UINT wp1x = new UINT();
        /** VAR wp1y */
        public UINT wp1y = new UINT();
        /** VAR wp2x */
        public UINT wp2x = new UINT();
        /** VAR wp2y */
        public UINT wp2y = new UINT();
        /** VAR wp3x */
        public UINT wp3x = new UINT();
        /** VAR wp3y */
        public UINT wp3y = new UINT();
        /** VAR wp4x */
        public UINT wp4x = new UINT();
        /** VAR wp4y */
        public UINT wp4y = new UINT();
        /** VAR slider1 */
        public BOOL slider1 = new BOOL();
        /** VAR slider2 */
        public BOOL slider2 = new BOOL();
        /** VAR slider3 */
        public BOOL slider3 = new BOOL();
        /** VAR slider4 */
        public BOOL slider4 = new BOOL();
        /** VAR wp1on */
        public BOOL wp1on = new BOOL();
        /** VAR wp2on */
        public BOOL wp2on = new BOOL();
        /** VAR wp3on */
        public BOOL wp3on = new BOOL();
        /** VAR wp4on */
        public BOOL wp4on = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Clock */
        public EventServer CLK = new EventInput(this);
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
        /** EVENT ADD_WP */
        public EventServer ADD_WP = new EventInput(this);
        /** EVENT ADD_WP00 */
        public EventServer ADD_WP00 = new EventInput(this);
        /** EVENT REMOVE_WP */
        public EventServer REMOVE_WP = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** EVENT CNF */
        public EventOutput CNF = new EventOutput();
        /** EVENT WP_ADDED */
        public EventOutput WP_ADDED = new EventOutput();
        /** EVENT WP_REMOVED */
        public EventOutput WP_REMOVED = new EventOutput();
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
        /** Connect the given variable to the input variable BASEX
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable BASEY
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vacuum_on
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vacuum_off
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Add1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Add2
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Add3
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Add4
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable AddedWP_X
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable AddedWP_Y
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vacuumon
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable CYL1Pos
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable CYL2Pos
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable CYL3Pos
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable VCYL1Pos
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable VCYL2Pos
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable VCYL3Pos
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
            alg_UPDATE_VIEW();
            INITO.serviceEvent(this);
            state_START();
            transition_PnpXYCalculatorBA_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_PnpXYCalculatorBA_1();
        }
        private static final int index_CLK = 3;
        private void state_CLK() {
            eccState = index_CLK;
            alg_CLK();
            alg_UPDATE_VIEW();
            CNF.serviceEvent(this);
            state_START();
            transition_PnpXYCalculatorBA_2();
        }
        private static final int index_ADD_WP = 4;
        private void state_ADD_WP() {
            eccState = index_ADD_WP;
            alg_ADD_WP();
            WP_ADDED.serviceEvent(this);
            alg_UPDATE_VIEW();
            CNF.serviceEvent(this);
            state_START();
            transition_PnpXYCalculatorBA_3();
        }
        private static final int index_REMOVE_WP = 5;
        private void state_REMOVE_WP() {
            eccState = index_REMOVE_WP;
            alg_REMOVE_WP();
            WP_REMOVED.serviceEvent(this);
            alg_UPDATE_VIEW();
            CNF.serviceEvent(this);
            state_START();
            transition_PnpXYCalculatorBA_4();
        }
        private static final int index_Add00 = 6;
        private void state_Add00() {
            eccState = index_Add00;
            alg_Add_WP00();
            WP_ADDED.serviceEvent(this);
            alg_UPDATE_VIEW();
            CNF.serviceEvent(this);
            state_START();
            transition_PnpXYCalculatorBA_5();
        }

        /** The default constructor. */
        public PnpXYCalculatorBA() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == CLK) service_CLK();
            else if (e == REQ) service_REQ();
            else if (e == ADD_WP) service_ADD_WP();
            else if (e == ADD_WP00) service_ADD_WP00();
            else if (e == REMOVE_WP) service_REMOVE_WP();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_PnpXYCalculatorBA_6(); 
            }
        }

        /** Services the CLK event. */
        public void service_CLK() {
            if ((eccState == index_START)) {
                state_CLK();
                transition_PnpXYCalculatorBA_7(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_PnpXYCalculatorBA_8(); 
            }
        }

        /** Services the ADD_WP event. */
        public void service_ADD_WP() {
            if ((eccState == index_START)) {
                state_ADD_WP();
                transition_PnpXYCalculatorBA_9(); 
            }
        }

        /** Services the ADD_WP00 event. */
        public void service_ADD_WP00() {
            if ((eccState == index_START)) {
                state_Add00();
                transition_PnpXYCalculatorBA_10(); 
            }
        }

        /** Services the REMOVE_WP event. */
        public void service_REMOVE_WP() {
            if ((eccState == index_START)) {
                state_REMOVE_WP();
                transition_PnpXYCalculatorBA_11(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            wp1x.value = 6000;
            wp1y.value = 6000;
            wp2x.value = 6000;
            wp2y.value = 6000;
            wp3x.value = 6000;
            wp3y.value = 6000;
            wp1on.value = false;
            wp2on.value = false;
            wp3on.value = false;

            BASE_X.value = BASEX.value;
            BASE_Y.value = BASEY.value;
            CYL1_Y.value = BASEY.value;
            CYL2_Y.value = BASEY.value;
            CYL3_Y.value = BASEY.value;

        }

        /** ALGORITHM REQ IN Java*/
        public void alg_REQ() {

        }

        /** ALGORITHM CLK IN Java*/
        public void alg_CLK() {
            int cyl1_length = 75;
            int cyl2_length = 75;
            int cyl3_length = 150;
            int vcyl1_length = 75;
            int vcyl2_length = 75;
            int vcyl3_length = 75;

            cyl1x.value = CYL1Pos.value;
            cyl2x.value = CYL2Pos.value;
            cyl3x.value = CYL3Pos.value;
            vcyl1y.value = VCYL1Pos.value;
            vcyl2y.value = VCYL2Pos.value;
            vcyl3y.value = VCYL3Pos.value;

            if (WP1_X.value <= 465 && WP1_Y.value >= 370) {
                slider1.value = true;
            } else {slider1.value = false;}
            if (WP2_X.value <= 465 && WP2_Y.value >= 370) {
                slider2.value = true;
            } else {slider2.value = false;}
            if (WP3_X.value <= 465 && WP3_Y.value >= 370) {
                slider3.value = true;
            } else {slider3.value = false;}


            if (vacuumon.value) {
                int vacuumx = VCYL3_X.value;
                int vacuumy = VCYL3_Y.value + 100;
                int dx1 = Math.abs(wp1x.value - vacuumx);
                int dy1 = Math.abs(wp1y.value - vacuumy);
                int dx2 = Math.abs(wp2x.value - vacuumx);
                int dy2 = Math.abs(wp2y.value - vacuumy);
                int dx3 = Math.abs(wp3x.value - vacuumx);
                int dy3 = Math.abs(wp3y.value - vacuumy);

                if (dx1 < 17 && dy1 < 7 && wp2on.value == false && wp3on.value == false) {
                    wp1on.value = true;
                }
                if (dx2 < 17 && dy2 < 7 && wp1on.value == false && wp3on.value == false) {
                    wp2on.value = true;
                }
                if (dx3 < 17 && dy3 < 7 && wp2on.value == false && wp1on.value == false) {
                    wp3on.value = true;
                }
                //System.out.println("Clocking"+dx1+"-"+dy1);

            } else {
                wp1on.value = false;
                wp2on.value = false;
                wp3on.value = false;
            }

            //System.out.println("Clocking");

        }

        /** ALGORITHM UPDATE_VIEW IN Java*/
        public void alg_UPDATE_VIEW() {
            int bx = BASEX.value;
            int by = BASEY.value;
            CYL1_X.value = bx + 22 + cyl1x.value;
            CYL2_X.value = CYL1_X.value + 90 + cyl2x.value;
            CYL3_X.value = CYL2_X.value + 90 + cyl3x.value;

            VCYL1_X.value = CYL3_X.value + 180;
            VCYL2_X.value = CYL3_X.value + 180;
            VCYL3_X.value = CYL3_X.value + 180;
            //VCYL1_Y.value = by+vcyl1y.value+15;
            VCYL1_Y.value = by + vcyl1y.value;
            VCYL2_Y.value = VCYL1_Y.value + 90 + vcyl2y.value;
            VCYL3_Y.value = VCYL2_Y.value + 90 + vcyl3y.value;

            if (wp1on.value) {
                wp1x.value = VCYL3_X.value;
                wp1y.value = VCYL3_Y.value + 100;
            } else if (slider1.value) {


                /*if(wp1y.value <= 490) {
                 wp1y.value = wp1y.value+1;
                 if (slider2.value && wp2y.value >= 476 && wp1y.value >= 476) {
                 wp1y.value = wp1y.value-1;
                 } else if (slider3.value && wp3y.value >= 476 && wp1y.value >= 476) {
                 wp1y.value = wp1y.value-1;
                 } else if (slider3.value && slider2.value && wp2y.value >= 462 && wp3y.value >= 462 && wp1y.value >= 460) {
                 wp1y.value = wp1y.value-1;
                 }
                 }*/
                wp1y.value = wp1y.value + 1;

            } else {
                //wp1y.value = 385;
            }

            if (wp2on.value) {
                wp2x.value = VCYL3_X.value;
                wp2y.value = VCYL3_Y.value + 100;
            } else if (slider2.value) {



                /*if(wp2y.value <= 490) {

                 wp2y.value = wp2y.value+1;
                 if (slider1.value && wp1y.value >= 476 && wp2y.value >= 476) {
                 wp2y.value = wp2y.value-1;
                 } else if (slider3.value && wp3y.value >= 476 && wp2y.value >= 476) {
                 wp2y.value = wp2y.value-1;
                 } else if (slider3.value && slider1.value && wp1y.value >= 462 && wp3y.value >= 462 && wp2y.value >= 460) {
                 wp2y.value = wp2y.value-1;
                 }

                 }*/
                wp2y.value = wp2y.value + 1;

            } else {
                //wp2y.value = 535;
            }

            if (wp3on.value) {
                wp3x.value = VCYL3_X.value;
                wp3y.value = VCYL3_Y.value + 100;
            } else if (slider3.value) {

                /*if(wp3y.value <= 490) {

                 wp3y.value = wp3y.value+1;
                 if (slider1.value && wp1y.value >= 476 && wp3y.value >= 476) {
                 wp3y.value = wp3y.value-1;
                 } else if (slider2.value && wp2y.value >= 476 && wp3y.value >= 476) {
                 wp3y.value = wp3y.value-1;
                 } else if (slider2.value && slider1.value && wp1y.value >= 462 && wp2y.value >= 462 && wp3y.value >= 460) {
                 wp3y.value = wp3y.value-1;
                 }

                 }*/
                wp3y.value = wp3y.value + 1;


            } else {
                //wp3y.value = 460;
            }



            WP1_X.value = wp1x.value;
            WP1_Y.value = wp1y.value;
            WP2_X.value = wp2x.value;
            WP2_Y.value = wp2y.value;
            WP3_X.value = wp3x.value;
            WP3_Y.value = wp3y.value;

            //WP1_X.value = bx+300+wp1x.value;
            WP1_Y.value = wp1y.value;
            //WP2_X.value = bx+300+wp2x.value;
            WP2_Y.value = wp2y.value;
            //WP3_X.value = bx+300+wp3x.value;
            WP3_Y.value = wp3y.value;


            /*if (WP1_X.value == 462 && WP1_Y.value >= 535)
             {
             WP1_X.value = 6000;
             WP1_Y.value = 6000;
             }
             if (WP2_X.value == 462 && WP2_Y.value >= 535)
             {
             WP2_X.value = 6000;
             WP2_Y.value = 6000;
             }
             if (WP3_X.value == 462 && WP3_Y.value >= 535)
             {
             WP3_X.value = 6000;
             WP3_Y.value = 6000;
             }*/


            //System.out.println("C1X = " + CYL1_X + " C2X = " + CYL2_X + " VCX = " + VCYL_X + " VCY = " + VCYL_Y);

        }

        /** ALGORITHM ADD_WP IN Java*/
        public void alg_ADD_WP() {
            if (Add1.value == true) {
                wp1x.value = 537;
                wp1y.value = 385;
                wp1on.value = false;
            }
            if (Add2.value == true) {
                wp2x.value = 612;
                wp2y.value = 535;
                wp2on.value = false;
            }
            if (Add3.value == true) {
                wp3x.value = 687;
                wp3y.value = 460;
                wp3on.value = false;
            }

        }

        /** ALGORITHM REMOVE_WP IN Java*/
        public void alg_REMOVE_WP() {
            if (Add1.value == true) {
                wp1on.value = false;
                wp1x.value = 6000;
                wp1y.value = 6000;
            }
            if (Add2.value == true) {
                wp2on.value = false;
                wp2x.value = 6000;
                wp2y.value = 6000;
            }
            if (Add3.value == true) {
                wp3on.value = false;
                wp3x.value = 6000;
                wp3y.value = 6000;
            }

        }

        /** ALGORITHM Add_WP00 IN Java*/
        public void alg_Add_WP00() {
            if (Add1.value == true) {
                wp1x.value = 0;
                wp1y.value = 215;
                wp1on.value = false;
            }
            if (Add2.value == true) {
                wp2x.value = 0;
                wp2y.value = 215;
                wp2on.value = false;
            }
            if (Add3.value == true) {
                wp3x.value = 0;
                wp3y.value = 215;
                wp3on.value = false;
            }
            if (Add4.value == true) {
                wp4x.value = 0;
                wp4y.value = 215;
                wp4on.value = false;
            }

        }
    }
    private void transition_PnpXYCalculatorBA_0() {
    }

    private void transition_PnpXYCalculatorBA_1() {
    }

    private void transition_PnpXYCalculatorBA_2() {
    }

    private void transition_PnpXYCalculatorBA_3() {
    }

    private void transition_PnpXYCalculatorBA_4() {
    }

    private void transition_PnpXYCalculatorBA_5() {
    }

    private void transition_PnpXYCalculatorBA_6() {
    }

    private void transition_PnpXYCalculatorBA_7() {
    }

    private void transition_PnpXYCalculatorBA_8() {
    }

    private void transition_PnpXYCalculatorBA_9() {
    }

    private void transition_PnpXYCalculatorBA_10() {
    }

    private void transition_PnpXYCalculatorBA_11() {
    }
}