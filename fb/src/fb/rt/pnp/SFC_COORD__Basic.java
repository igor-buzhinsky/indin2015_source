package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class SFC_COORD__Basic {
    private final SFC_COORD instance = new SFC_COORD();

    public void event_INIT(boolean X1_, boolean X2_, boolean X3_, boolean X4_, boolean X30_, boolean X31_, boolean X32_, boolean X10_, boolean X11_, boolean X20_, boolean X21_, boolean c1front_, boolean c1back_, boolean c2front_, boolean c2back_, boolean X33_, boolean X34_, boolean X35_, boolean X36_, boolean X37_, boolean X38_, boolean vcd30_, boolean vcd31_, boolean vcd35_, boolean vcd37_, boolean venturi_on_, boolean X50_, boolean X51_, boolean X52_) {
        instance.X1.value = X1_;
        instance.X2.value = X2_;
        instance.X3.value = X3_;
        instance.X4.value = X4_;
        instance.X30.value = X30_;
        instance.X31.value = X31_;
        instance.X32.value = X32_;
        instance.X10.value = X10_;
        instance.X11.value = X11_;
        instance.X20.value = X20_;
        instance.X21.value = X21_;
        instance.c1front.value = c1front_;
        instance.c1back.value = c1back_;
        instance.c2front.value = c2front_;
        instance.c2back.value = c2back_;
        instance.X33.value = X33_;
        instance.X34.value = X34_;
        instance.X35.value = X35_;
        instance.X36.value = X36_;
        instance.X37.value = X37_;
        instance.X38.value = X38_;
        instance.vcd30.value = vcd30_;
        instance.vcd31.value = vcd31_;
        instance.vcd35.value = vcd35_;
        instance.vcd37.value = vcd37_;
        instance.venturi_on.value = venturi_on_;
        instance.X50.value = X50_;
        instance.X51.value = X51_;
        instance.X52.value = X52_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean X1_, boolean X2_, boolean X3_, boolean X4_, boolean X30_, boolean X31_, boolean X32_, boolean c1front_, boolean c1back_, boolean c2front_, boolean X10_, boolean X11_, boolean X20_, boolean X21_, boolean c2back_, boolean X33_, boolean X34_, boolean X35_, boolean X36_, boolean X37_, boolean X38_, boolean vcd30_, boolean vcd31_, boolean vcd35_, boolean vcd37_, boolean venturi_on_, boolean X50_, boolean X51_, boolean X52_) {
        instance.X1.value = X1_;
        instance.X2.value = X2_;
        instance.X3.value = X3_;
        instance.X4.value = X4_;
        instance.X30.value = X30_;
        instance.X31.value = X31_;
        instance.X32.value = X32_;
        instance.c1front.value = c1front_;
        instance.c1back.value = c1back_;
        instance.c2front.value = c2front_;
        instance.X10.value = X10_;
        instance.X11.value = X11_;
        instance.X20.value = X20_;
        instance.X21.value = X21_;
        instance.c2back.value = c2back_;
        instance.X33.value = X33_;
        instance.X34.value = X34_;
        instance.X35.value = X35_;
        instance.X36.value = X36_;
        instance.X37.value = X37_;
        instance.X38.value = X38_;
        instance.vcd30.value = vcd30_;
        instance.vcd31.value = vcd31_;
        instance.vcd35.value = vcd35_;
        instance.vcd37.value = vcd37_;
        instance.venturi_on.value = venturi_on_;
        instance.X50.value = X50_;
        instance.X51.value = X51_;
        instance.X52.value = X52_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SFC_COORD
     * @author JHC
     * @version 20150208/JHC
     */
    private class SFC_COORD extends FBInstance
    {
        /** Input event qualifier */
        public BOOL X1 = new BOOL();
        /** VAR X2 */
        public BOOL X2 = new BOOL();
        /** VAR X3 */
        public BOOL X3 = new BOOL();
        /** VAR X4 */
        public BOOL X4 = new BOOL();
        /** VAR X10 */
        public BOOL X10 = new BOOL();
        /** VAR X11 */
        public BOOL X11 = new BOOL();
        /** VAR X20 */
        public BOOL X20 = new BOOL();
        /** VAR X21 */
        public BOOL X21 = new BOOL();
        /** VAR X30 */
        public BOOL X30 = new BOOL();
        /** VAR X31 */
        public BOOL X31 = new BOOL();
        /** VAR X32 */
        public BOOL X32 = new BOOL();
        /** VAR X33 */
        public BOOL X33 = new BOOL();
        /** VAR X34 */
        public BOOL X34 = new BOOL();
        /** VAR X35 */
        public BOOL X35 = new BOOL();
        /** VAR X36 */
        public BOOL X36 = new BOOL();
        /** VAR X37 */
        public BOOL X37 = new BOOL();
        /** VAR X38 */
        public BOOL X38 = new BOOL();
        /** VAR X50 */
        public BOOL X50 = new BOOL();
        /** VAR X51 */
        public BOOL X51 = new BOOL();
        /** VAR X52 */
        public BOOL X52 = new BOOL();
        /** VAR c1front */
        public BOOL c1front = new BOOL();
        /** VAR c1back */
        public BOOL c1back = new BOOL();
        /** VAR c2front */
        public BOOL c2front = new BOOL();
        /** VAR c2back */
        public BOOL c2back = new BOOL();
        /** VAR vcd30 */
        public BOOL vcd30 = new BOOL();
        /** VAR vcd31 */
        public BOOL vcd31 = new BOOL();
        /** VAR vcd35 */
        public BOOL vcd35 = new BOOL();
        /** VAR vcd37 */
        public BOOL vcd37 = new BOOL();
        /** VAR venturi_on */
        public BOOL venturi_on = new BOOL();
        /** Output event qualifier */
        public WSTRING X1_IMG = new WSTRING();
        /** VAR X2_IMG */
        public WSTRING X2_IMG = new WSTRING();
        /** VAR X3_IMG */
        public WSTRING X3_IMG = new WSTRING();
        /** VAR X4_IMG */
        public WSTRING X4_IMG = new WSTRING();
        /** VAR X10_IMG */
        public WSTRING X10_IMG = new WSTRING();
        /** VAR X11_IMG */
        public WSTRING X11_IMG = new WSTRING();
        /** VAR X20_IMG */
        public WSTRING X20_IMG = new WSTRING();
        /** VAR X21_IMG */
        public WSTRING X21_IMG = new WSTRING();
        /** VAR X30_IMG */
        public WSTRING X30_IMG = new WSTRING();
        /** VAR X31_IMG */
        public WSTRING X31_IMG = new WSTRING();
        /** VAR X32_IMG */
        public WSTRING X32_IMG = new WSTRING();
        /** VAR X33_IMG */
        public WSTRING X33_IMG = new WSTRING();
        /** VAR X34_IMG */
        public WSTRING X34_IMG = new WSTRING();
        /** VAR X35_IMG */
        public WSTRING X35_IMG = new WSTRING();
        /** VAR X36_IMG */
        public WSTRING X36_IMG = new WSTRING();
        /** VAR X37_IMG */
        public WSTRING X37_IMG = new WSTRING();
        /** VAR X38_IMG */
        public WSTRING X38_IMG = new WSTRING();
        /** VAR X50_IMG */
        public WSTRING X50_IMG = new WSTRING();
        /** VAR X51_IMG */
        public WSTRING X51_IMG = new WSTRING();
        /** VAR X52_IMG */
        public WSTRING X52_IMG = new WSTRING();
        /** VAR vcd30_IMG */
        public WSTRING vcd30_IMG = new WSTRING();
        /** VAR vcd31_IMG */
        public WSTRING vcd31_IMG = new WSTRING();
        /** VAR vcd35_IMG */
        public WSTRING vcd35_IMG = new WSTRING();
        /** VAR vcd37_IMG */
        public WSTRING vcd37_IMG = new WSTRING();
        /** VAR venturi_IMG */
        public WSTRING venturi_IMG = new WSTRING();
        /** VAR L1C_IMG */
        public WSTRING L1C_IMG = new WSTRING();
        /** VAR L2C_IMG */
        public WSTRING L2C_IMG = new WSTRING();
        /** VAR L1CGI_IMG */
        public WSTRING L1CGI_IMG = new WSTRING();
        /** VAR L2CGI_IMG */
        public WSTRING L2CGI_IMG = new WSTRING();
        /** VAR L1CGI_IMG_A */
        public WSTRING L1CGI_IMG_A = new WSTRING();
        /** VAR L2CGI_IMG_A */
        public WSTRING L2CGI_IMG_A = new WSTRING();
        /** VAR N_X11_X21 */
        public BOOL N_X11_X21 = new BOOL();
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
        /** Connect the given variable to the input variable X1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X2
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X3
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X4
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X10
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X11
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X20
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X21
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X30
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X31
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X32
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X33
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X34
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X35
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X36
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X37
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X38
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X50
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X51
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X52
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c1front
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c1back
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c2front
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable c2back
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vcd30
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vcd31
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vcd35
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vcd37
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable venturi_on
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
            state_START();
            transition_SFC_COORD_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            state_START();
            transition_SFC_COORD_1();
        }

        /** The default constructor. */
        public SFC_COORD() {
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
                transition_SFC_COORD_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_SFC_COORD_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            X1_IMG.value = "/fb/rt/pnp/pics/S1.png";
            X2_IMG.value = "/fb/rt/pnp/pics/S2.png";
            X3_IMG.value = "/fb/rt/pnp/pics/S3.png";
            X4_IMG.value = "/fb/rt/pnp/pics/S4.png";
            X10_IMG.value = "/fb/rt/pnp/pics/S10.png";
            X11_IMG.value = "/fb/rt/pnp/pics/S11.png";
            X20_IMG.value = "/fb/rt/pnp/pics/S20.png";
            X21_IMG.value = "/fb/rt/pnp/pics/S21.png";
            X30_IMG.value = "/fb/rt/pnp/pics/S30.png";
            X31_IMG.value = "/fb/rt/pnp/pics/S31.png";
            X32_IMG.value = "/fb/rt/pnp/pics/S32.png";
            X33_IMG.value = "/fb/rt/pnp/pics/S33.png";
            X34_IMG.value = "/fb/rt/pnp/pics/S34.png";
            X35_IMG.value = "/fb/rt/pnp/pics/S35.png";
            X36_IMG.value = "/fb/rt/pnp/pics/S36.png";
            X37_IMG.value = "/fb/rt/pnp/pics/S37.png";
            X38_IMG.value = "/fb/rt/pnp/pics/S38.png";
            X50_IMG.value = "/fb/rt/pnp/pics/S50.png";
            X51_IMG.value = "/fb/rt/pnp/pics/S51.png";
            X52_IMG.value = "/fb/rt/pnp/pics/S52.png";
            vcd30_IMG.value = "/fb/rt/pnp/pics/VCGD.png";
            vcd31_IMG.value = "/fb/rt/pnp/pics/VCGD.png";
            vcd35_IMG.value = "/fb/rt/pnp/pics/VCGD.png";
            vcd37_IMG.value = "/fb/rt/pnp/pics/VCGD.png";
            venturi_IMG.value = "/fb/rt/pnp/pics/VENTURI.png";
            L1C_IMG.value = "/fb/rt/pnp/pics/L1C.png";
            L2C_IMG.value = "/fb/rt/pnp/pics/L2C.png";
            L1CGI_IMG.value = "/fb/rt/pnp/pics/L1CGI.png";
            L2CGI_IMG.value = "/fb/rt/pnp/pics/L2CGI.png";
            L1CGI_IMG_A.value = "/fb/rt/pnp/pics/L1CGI.png";
            L2CGI_IMG_A.value = "/fb/rt/pnp/pics/L2CGI.png";
            N_X11_X21.value = !(X11.value | X21.value);
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            if (X1.value) {
                if (X1_IMG.value == "/fb/rt/pnp/pics/S1.png") {
                    X1_IMG.value = "/fb/rt/pnp/pics/S1G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X1_IMG.value == "/fb/rt/pnp/pics/S1G.png") {
                    X1_IMG.value = "/fb/rt/pnp/pics/S1.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X2.value) {
                if (X2_IMG.value == "/fb/rt/pnp/pics/S2.png") {
                    X2_IMG.value = "/fb/rt/pnp/pics/S2G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X2_IMG.value == "/fb/rt/pnp/pics/S2G.png") {
                    X2_IMG.value = "/fb/rt/pnp/pics/S2.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X3.value) {
                if (X3_IMG.value == "/fb/rt/pnp/pics/S3.png") {
                    X3_IMG.value = "/fb/rt/pnp/pics/S3G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X3_IMG.value == "/fb/rt/pnp/pics/S3G.png") {
                    X3_IMG.value = "/fb/rt/pnp/pics/S3.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X4.value) {
                if (X4_IMG.value == "/fb/rt/pnp/pics/S4.png") {
                    X4_IMG.value = "/fb/rt/pnp/pics/S4G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X4_IMG.value == "/fb/rt/pnp/pics/S4G.png") {
                    X4_IMG.value = "/fb/rt/pnp/pics/S4.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X10.value) {
                if (X10_IMG.value == "/fb/rt/pnp/pics/S10.png") {
                    X10_IMG.value = "/fb/rt/pnp/pics/S10G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X10_IMG.value == "/fb/rt/pnp/pics/S10G.png") {
                    X10_IMG.value = "/fb/rt/pnp/pics/S10.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X11.value) {
                if (X11_IMG.value == "/fb/rt/pnp/pics/S11.png") {
                    X11_IMG.value = "/fb/rt/pnp/pics/S11G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X11_IMG.value == "/fb/rt/pnp/pics/S11G.png") {
                    X11_IMG.value = "/fb/rt/pnp/pics/S11.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X20.value) {
                if (X20_IMG.value == "/fb/rt/pnp/pics/S20.png") {
                    X20_IMG.value = "/fb/rt/pnp/pics/S20G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X20_IMG.value == "/fb/rt/pnp/pics/S20G.png") {
                    X20_IMG.value = "/fb/rt/pnp/pics/S20.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X21.value) {
                if (X21_IMG.value == "/fb/rt/pnp/pics/S21.png") {
                    X21_IMG.value = "/fb/rt/pnp/pics/S21G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X21_IMG.value == "/fb/rt/pnp/pics/S21G.png") {
                    X21_IMG.value = "/fb/rt/pnp/pics/S21.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X30.value) {
                if (X30_IMG.value == "/fb/rt/pnp/pics/S30.png") {
                    X30_IMG.value = "/fb/rt/pnp/pics/S30G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X30_IMG.value == "/fb/rt/pnp/pics/S30G.png") {
                    X30_IMG.value = "/fb/rt/pnp/pics/S30.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X31.value) {
                if (X31_IMG.value == "/fb/rt/pnp/pics/S31.png") {
                    X31_IMG.value = "/fb/rt/pnp/pics/S31G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X31_IMG.value == "/fb/rt/pnp/pics/S31G.png") {
                    X31_IMG.value = "/fb/rt/pnp/pics/S31.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X32.value) {
                if (X32_IMG.value == "/fb/rt/pnp/pics/S32.png") {
                    X32_IMG.value = "/fb/rt/pnp/pics/S32G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X32_IMG.value == "/fb/rt/pnp/pics/S32G.png") {
                    X32_IMG.value = "/fb/rt/pnp/pics/S32.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X33.value) {
                if (X33_IMG.value == "/fb/rt/pnp/pics/S33.png") {
                    X33_IMG.value = "/fb/rt/pnp/pics/S33G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X33_IMG.value == "/fb/rt/pnp/pics/S33G.png") {
                    X33_IMG.value = "/fb/rt/pnp/pics/S33.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X34.value) {
                if (X34_IMG.value == "/fb/rt/pnp/pics/S34.png") {
                    X34_IMG.value = "/fb/rt/pnp/pics/S34G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X34_IMG.value == "/fb/rt/pnp/pics/S34G.png") {
                    X34_IMG.value = "/fb/rt/pnp/pics/S34.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X35.value) {
                if (X35_IMG.value == "/fb/rt/pnp/pics/S35.png") {
                    X35_IMG.value = "/fb/rt/pnp/pics/S35G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X35_IMG.value == "/fb/rt/pnp/pics/S35G.png") {
                    X35_IMG.value = "/fb/rt/pnp/pics/S35.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X36.value) {
                if (X36_IMG.value == "/fb/rt/pnp/pics/S36.png") {
                    X36_IMG.value = "/fb/rt/pnp/pics/S36G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X36_IMG.value == "/fb/rt/pnp/pics/S36G.png") {
                    X36_IMG.value = "/fb/rt/pnp/pics/S36.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X37.value) {
                if (X37_IMG.value == "/fb/rt/pnp/pics/S37.png") {
                    X37_IMG.value = "/fb/rt/pnp/pics/S37G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X37_IMG.value == "/fb/rt/pnp/pics/S37G.png") {
                    X37_IMG.value = "/fb/rt/pnp/pics/S37.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X38.value) {
                if (X38_IMG.value == "/fb/rt/pnp/pics/S38.png") {
                    X38_IMG.value = "/fb/rt/pnp/pics/S38G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X38_IMG.value == "/fb/rt/pnp/pics/S38G.png") {
                    X38_IMG.value = "/fb/rt/pnp/pics/S38.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X50.value) {
                if (X50_IMG.value == "/fb/rt/pnp/pics/S50.png") {
                    X50_IMG.value = "/fb/rt/pnp/pics/S50G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X50_IMG.value == "/fb/rt/pnp/pics/S50G.png") {
                    X50_IMG.value = "/fb/rt/pnp/pics/S50.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X51.value) {
                if (X51_IMG.value == "/fb/rt/pnp/pics/S51.png") {
                    X51_IMG.value = "/fb/rt/pnp/pics/S51G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X51_IMG.value == "/fb/rt/pnp/pics/S51G.png") {
                    X51_IMG.value = "/fb/rt/pnp/pics/S51.png";
                    CNF.serviceEvent(this);
                }
            }

            if (X52.value) {
                if (X52_IMG.value == "/fb/rt/pnp/pics/S52.png") {
                    X52_IMG.value = "/fb/rt/pnp/pics/S52G.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (X52_IMG.value == "/fb/rt/pnp/pics/S52G.png") {
                    X52_IMG.value = "/fb/rt/pnp/pics/S52.png";
                    CNF.serviceEvent(this);
                }
            }

            if (c1front.value) {
                if (L1C_IMG.value == "/fb/rt/pnp/pics/L1C.png") {
                    L1C_IMG.value = "/fb/rt/pnp/pics/L1CG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (L1C_IMG.value == "/fb/rt/pnp/pics/L1CG.png") {
                    L1C_IMG.value = "/fb/rt/pnp/pics/L1C.png";
                    CNF.serviceEvent(this);
                }
            }

            if (c2front.value) {
                if (L2C_IMG.value == "/fb/rt/pnp/pics/L2C.png") {
                    L2C_IMG.value = "/fb/rt/pnp/pics/L2CG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (L2C_IMG.value == "/fb/rt/pnp/pics/L2CG.png") {
                    L2C_IMG.value = "/fb/rt/pnp/pics/L2C.png";
                    CNF.serviceEvent(this);
                }
            }

            if (vcd30.value) {
                if (vcd30_IMG.value == "/fb/rt/pnp/pics/VCGD.png") {
                    vcd30_IMG.value = "/fb/rt/pnp/pics/VCGDG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (vcd30_IMG.value == "/fb/rt/pnp/pics/VCGDG.png") {
                    vcd30_IMG.value = "/fb/rt/pnp/pics/VCGD.png";
                    CNF.serviceEvent(this);
                }
            }

            if (vcd31.value) {
                if (vcd31_IMG.value == "/fb/rt/pnp/pics/VCGD.png") {
                    vcd31_IMG.value = "/fb/rt/pnp/pics/VCGDG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (vcd31_IMG.value == "/fb/rt/pnp/pics/VCGDG.png") {
                    vcd31_IMG.value = "/fb/rt/pnp/pics/VCGD.png";
                    CNF.serviceEvent(this);
                }
            }

            if (vcd35.value) {
                if (vcd35_IMG.value == "/fb/rt/pnp/pics/VCGD.png") {
                    vcd35_IMG.value = "/fb/rt/pnp/pics/VCGDG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (vcd35_IMG.value == "/fb/rt/pnp/pics/VCGDG.png") {
                    vcd35_IMG.value = "/fb/rt/pnp/pics/VCGD.png";
                    CNF.serviceEvent(this);
                }
            }

            if (vcd37.value) {
                if (vcd37_IMG.value == "/fb/rt/pnp/pics/VCGD.png") {
                    vcd37_IMG.value = "/fb/rt/pnp/pics/VCGDG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (vcd37_IMG.value == "/fb/rt/pnp/pics/VCGDG.png") {
                    vcd37_IMG.value = "/fb/rt/pnp/pics/VCGD.png";
                    CNF.serviceEvent(this);
                }
            }

            if (venturi_on.value) {
                if (venturi_IMG.value == "/fb/rt/pnp/pics/VENTURI.png") {
                    venturi_IMG.value = "/fb/rt/pnp/pics/VENTURIG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (venturi_IMG.value == "/fb/rt/pnp/pics/VENTURIG.png") {
                    venturi_IMG.value = "/fb/rt/pnp/pics/VENTURI.png";
                    CNF.serviceEvent(this);
                }
            }

            if (c1back.value & X33.value) {
                if (L1CGI_IMG.value == "/fb/rt/pnp/pics/L1CGI.png") {
                    L1CGI_IMG.value = "/fb/rt/pnp/pics/L1CGIG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (L1CGI_IMG.value == "/fb/rt/pnp/pics/L1CGIG.png") {
                    L1CGI_IMG.value = "/fb/rt/pnp/pics/L1CGI.png";
                    CNF.serviceEvent(this);
                }
            }

            if (c2back.value & X34.value) {
                if (L2CGI_IMG.value == "/fb/rt/pnp/pics/L2CGI.png") {
                    L2CGI_IMG.value = "/fb/rt/pnp/pics/L2CGIG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (L2CGI_IMG.value == "/fb/rt/pnp/pics/L2CGIG.png") {
                    L2CGI_IMG.value = "/fb/rt/pnp/pics/L2CGI.png";
                    CNF.serviceEvent(this);
                }
            }

            if (c1back.value & X51.value) {
                if (L1CGI_IMG_A.value == "/fb/rt/pnp/pics/L1CGI.png") {
                    L1CGI_IMG_A.value = "/fb/rt/pnp/pics/L1CGIG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (L1CGI_IMG_A.value == "/fb/rt/pnp/pics/L1CGIG.png") {
                    L1CGI_IMG_A.value = "/fb/rt/pnp/pics/L1CGI.png";
                    CNF.serviceEvent(this);
                }
            }

            if (c2back.value & X52.value) {
                if (L2CGI_IMG_A.value == "/fb/rt/pnp/pics/L2CGI.png") {
                    L2CGI_IMG_A.value = "/fb/rt/pnp/pics/L2CGIG.png";
                    CNF.serviceEvent(this);
                }
            }
            else {
                if (L2CGI_IMG_A.value == "/fb/rt/pnp/pics/L2CGIG.png") {
                    L2CGI_IMG_A.value = "/fb/rt/pnp/pics/L2CGI.png";
                    CNF.serviceEvent(this);
                }
            }

            N_X11_X21.value = !(X11.value | X21.value);
        }
    }
    private void transition_SFC_COORD_0() {
    }

    private void transition_SFC_COORD_1() {
    }

    private void transition_SFC_COORD_2() {
    }

    private void transition_SFC_COORD_3() {
    }
}