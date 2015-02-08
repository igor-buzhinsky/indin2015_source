package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class MyPnpXYCalculatorStep1__Basic {
    private final MyPnpXYCalculatorStep1 instance = new MyPnpXYCalculatorStep1();

    public void event_INIT(int BASEX_, int BASEY_) {
        instance.BASEX.value = Math.abs(BASEX_);
        instance.BASEY.value = Math.abs(BASEY_);
        instance.INIT.serviceEvent(instance); 
    }

    public void event_CLK(int LCPos_, int RCPos_, int VCPos_, boolean vacuumon_, int HC3Pos_) {
        instance.LCPos.value = Math.abs(LCPos_);
        instance.RCPos.value = Math.abs(RCPos_);
        instance.VCPos.value = Math.abs(VCPos_);
        instance.vacuumon.value = vacuumon_;
        instance.HC3Pos.value = Math.abs(HC3Pos_);
        instance.CLK.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK MyPnpXYCalculatorStep1
     * @author JHC
     * @version 20150208/JHC
     */
    private class MyPnpXYCalculatorStep1 extends FBInstance
    {
        /** VAR BASEX */
        public UINT BASEX = new UINT();
        /** VAR BASEY */
        public UINT BASEY = new UINT();
        /** VAR LCPos */
        public UINT LCPos = new UINT();
        /** VAR RCPos */
        public UINT RCPos = new UINT();
        /** VAR HC3Pos */
        public UINT HC3Pos = new UINT();
        /** VAR VCPos */
        public UINT VCPos = new UINT();
        /** VAR vacuumon */
        public BOOL vacuumon = new BOOL();
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
        public UINT VCYL_X = new UINT();
        /** Response Data from Socket */
        public UINT VCYL_Y = new UINT();
        /** Response Data from Socket */
        public UINT WP_X = new UINT();
        /** Response Data from Socket */
        public UINT WP_Y = new UINT();
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
        /** VAR vcyly */
        public UINT vcyly = new UINT();
        /** VAR wpx */
        public UINT wpx = new UINT();
        /** VAR wpy */
        public UINT wpy = new UINT();
        /** VAR wp2x */
        public UINT wp2x = new UINT();
        /** VAR wp2y */
        public UINT wp2y = new UINT();
        /** VAR wp3x */
        public UINT wp3x = new UINT();
        /** VAR wp3y */
        public UINT wp3y = new UINT();
        /** VAR slider1 */
        public BOOL slider1 = new BOOL();
        /** VAR slider2 */
        public BOOL slider2 = new BOOL();
        /** VAR slider3 */
        public BOOL slider3 = new BOOL();
        /** VAR wpon */
        public BOOL wpon = new BOOL();
        /** VAR wp2on */
        public BOOL wp2on = new BOOL();
        /** VAR wp3on */
        public BOOL wp3on = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Clock */
        public EventServer CLK = new EventInput(this);
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
        /** Connect the given variable to the input variable LCPos
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable RCPos
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable HC3Pos
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable VCPos
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vacuumon
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
            transition_MyPnpXYCalculatorStep1_0();
        }
        private static final int index_CLK = 2;
        private void state_CLK() {
            eccState = index_CLK;
            alg_CLK();
            alg_UPDATE_VIEW();
            CNF.serviceEvent(this);
            state_START();
            transition_MyPnpXYCalculatorStep1_1();
        }

        /** The default constructor. */
        public MyPnpXYCalculatorStep1() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == CLK) service_CLK();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_MyPnpXYCalculatorStep1_2(); 
            }
        }

        /** Services the CLK event. */
        public void service_CLK() {
            if ((eccState == index_START)) {
                state_CLK();
                transition_MyPnpXYCalculatorStep1_3(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            wpx.value = 75;
            wpy.value = 215;
            wp2x.value = 150;
            wp2y.value = 215;
            wp3x.value = 225;
            wp3y.value = 215;

            wpon.value = false;
            wp2on.value = false;
            wp3on.value = false;

            BASE_X.value = BASEX.value;
            BASE_Y.value = BASEY.value;
            CYL1_Y.value = BASEY.value;
            CYL2_Y.value = BASEY.value + 12;

        }

        /** ALGORITHM REQ IN Java*/
        public void alg_REQ() {

        }

        /** ALGORITHM CLK IN Java*/
        public void alg_CLK() {
            int cyl1_length = 75;
            int cyl2_length = 150;
            int vcyl_length = 75;

            if (LCPos.value > 75)
            {
                LCPos.value = 75;
            }

            RCPos.value = (int) (RCPos.value * 1.5);

            if (RCPos.value > 150)
            {
                RCPos.value = 150;
            }

            if (VCPos.value > 75)
            {
                VCPos.value = 75;
            }

            // horizontal cylinder 1
            cyl1x.value = LCPos.value;

            // horizontal cylinder 2
            cyl2x.value = RCPos.value;

            // vertical cylinder
            vcyly.value = VCPos.value;

            if (wpx.value <= 10 && wpy.value >= 185) {
                slider1.value = true;
            } else {slider1.value = false;}
            if (wp2x.value <= 10 && wp2y.value >= 185) {
                slider2.value = true;
            } else {slider2.value = false;}
            if (wp3x.value <= 10 && wp3y.value >= 185) {
                slider3.value = true;
            } else {slider3.value = false;}

            if (vacuumon.value) {
                int vacuumx = cyl1x.value + cyl2x.value;
                int vacuumy = vcyly.value + 115;
                int dx = Math.abs(wpx.value - vacuumx);
                int dy = Math.abs(wpy.value - vacuumy);
                int dx2 = Math.abs(wp2x.value - vacuumx);
                int dy2 = Math.abs(wp2y.value - vacuumy);
                int dx3 = Math.abs(wp3x.value - vacuumx);
                int dy3 = Math.abs(wp3y.value - vacuumy);

                if (dx < 17 && dy < 7 && wp2on.value == false && wp3on.value == false) {
                    wpon.value = true;
                }
                if (dx2 < 17 && dy2 < 7 && wpon.value == false && wp3on.value == false) {
                    wp2on.value = true;
                }
                if (dx3 < 17 && dy3 < 7 && wp2on.value == false && wpon.value == false) {
                    wp3on.value = true;
                }
            } else {
                wpon.value = false;
                wp2on.value = false;
                wp3on.value = false;
            }

            System.out.println("Clocking");

        }

        /** ALGORITHM UPDATE_VIEW IN Java*/
        public void alg_UPDATE_VIEW() {
            int bx = BASEX.value;
            int by = BASEY.value;
            CYL1_X.value = bx + 22 + cyl1x.value;
            CYL2_X.value = bx + 116 + cyl1x.value + cyl2x.value;
            VCYL_X.value = bx + 305 + cyl1x.value + cyl2x.value;
            VCYL_Y.value = by + vcyly.value + 15;

            if (wpon.value) {
                wpx.value = cyl1x.value + cyl2x.value;
                wpy.value = vcyly.value + 115;
            } else if (slider1.value) {
                wpy.value = wpy.value + 1;
            } else {
                wpy.value = 190;
            }
            if (wp2on.value) {
                wp2x.value = cyl1x.value + cyl2x.value;
                wp2y.value = vcyly.value + 115;
            } else if (slider2.value) {
                wp2y.value = wp2y.value + 1;
            }else {
                wp2y.value = 190;
            }
            if (wp3on.value) {
                wp3x.value = cyl1x.value + cyl2x.value;
                wp3y.value = vcyly.value + 115;
            } else if (slider3.value) {
                wp3y.value = wp3y.value + 1;
            }else {
                wp3y.value = 190;
            }

            WP_X.value = bx + 300 + wpx.value;
            WP_Y.value = by + wpy.value;
            WP2_X.value = bx + 300 + wp2x.value;
            WP2_Y.value = by + wp2y.value;
            WP3_X.value = bx + 300 + wp3x.value;
            WP3_Y.value = by + wp3y.value;
            if (WP_X.value == 305 && WP_Y.value >= 330)
            {
                WP_X.value = 6000;
                WP_Y.value = 6000;
            }
            if (WP2_X.value == 305 && WP2_Y.value >= 330)
            {
                WP2_X.value = 6000;
                WP2_Y.value = 6000;
            }
            if (WP3_X.value == 305 && WP3_Y.value >= 330)
            {
                WP3_X.value = 6000;
                WP3_Y.value = 6000;
            }

            //System.out.println("C1X = " + CYL1_X + " C2X = " + CYL2_X + " VCX = " + VCYL_X + " VCY = " + VCYL_Y);

        }
    }
    private void transition_MyPnpXYCalculatorStep1_0() {
    }

    private void transition_MyPnpXYCalculatorStep1_1() {
    }

    private void transition_MyPnpXYCalculatorStep1_2() {
    }

    private void transition_MyPnpXYCalculatorStep1_3() {
    }
}