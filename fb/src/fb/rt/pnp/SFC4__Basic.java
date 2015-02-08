package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class SFC4__Basic {
    private final SFC4 instance = new SFC4();

    public void event_INIT(boolean s0_, boolean s1_, boolean s2_, boolean s3_, boolean X1_, boolean X2_, boolean X3_, boolean X11_, boolean X21_, boolean pp0_, boolean vcu_, boolean vcd_, boolean vacuum_) {
        instance.s0.value = s0_;
        instance.s1.value = s1_;
        instance.s2.value = s2_;
        instance.s3.value = s3_;
        instance.X1.value = X1_;
        instance.X2.value = X2_;
        instance.X3.value = X3_;
        instance.X11.value = X11_;
        instance.X21.value = X21_;
        instance.pp0.value = pp0_;
        instance.vcu.value = vcu_;
        instance.vcd.value = vcd_;
        instance.vacuum.value = vacuum_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean s0_, boolean s1_, boolean s2_, boolean s3_, boolean X1_, boolean X2_, boolean X3_, boolean X11_, boolean X21_, boolean pp0_, boolean vcu_, boolean vcd_, boolean vacuum_) {
        instance.s0.value = s0_;
        instance.s1.value = s1_;
        instance.s2.value = s2_;
        instance.s3.value = s3_;
        instance.X1.value = X1_;
        instance.X2.value = X2_;
        instance.X3.value = X3_;
        instance.X11.value = X11_;
        instance.X21.value = X21_;
        instance.pp0.value = pp0_;
        instance.vcu.value = vcu_;
        instance.vcd.value = vcd_;
        instance.vacuum.value = vacuum_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SFC4
     * @author JHC
     * @version 20150208/JHC
     */
    private class SFC4 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL s0 = new BOOL();
        /** Input event qualifier */
        public BOOL s1 = new BOOL();
        /** Input event qualifier */
        public BOOL s2 = new BOOL();
        /** Input event qualifier */
        public BOOL s3 = new BOOL();
        /** Input event qualifier */
        public BOOL X1 = new BOOL();
        /** Input event qualifier */
        public BOOL X2 = new BOOL();
        /** Input event qualifier */
        public BOOL X3 = new BOOL();
        /** Input event qualifier */
        public BOOL X11 = new BOOL();
        /** Input event qualifier */
        public BOOL X21 = new BOOL();
        /** Input event qualifier */
        public BOOL pp0 = new BOOL();
        /** Input event qualifier */
        public BOOL vcu = new BOOL();
        /** Input event qualifier */
        public BOOL vcd = new BOOL();
        /** VAR vacuum */
        public BOOL vacuum = new BOOL();
        /** Output event qualifier */
        public BOOL VCGD = new BOOL();
        /** VAR L1CGI */
        public BOOL L1CGI = new BOOL();
        /** VAR L2CGI */
        public BOOL L2CGI = new BOOL();
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
        /** VAR vc_down30 */
        public BOOL vc_down30 = new BOOL();
        /** VAR vc_down31 */
        public BOOL vc_down31 = new BOOL();
        /** VAR vc_down35 */
        public BOOL vc_down35 = new BOOL();
        /** VAR vc_down37 */
        public BOOL vc_down37 = new BOOL();
        /** VAR venturi_on */
        public BOOL venturi_on = new BOOL();
        /** VAR venturi_off */
        public BOOL venturi_off = new BOOL();
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
        /** Connect the given variable to the input variable s0
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable s1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable s2
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable s3
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X2
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X3
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X11
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X21
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable pp0
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vcu
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vcd
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable vacuum
         * @param newIV The variable to connect
         */
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
            alg_REQ();
            CNF.serviceEvent(this);
            state_X30();
            transition_SFC4_0();
        }
        private static final int index_INIT = 1;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            INITO.serviceEvent(this);
            state_START();
            transition_SFC4_1();
        }
        private static final int index_X3136 = 2;
        private void state_X3136() {
            eccState = index_X3136;
            alg_X3136();
            CNF.serviceEvent(this);
        }
        private static final int index_X32 = 3;
        private void state_X32() {
            eccState = index_X32;
            alg_X32();
            CNF.serviceEvent(this);
        }
        private static final int index_X3334 = 4;
        private void state_X3334() {
            eccState = index_X3334;
            alg_X3334();
            CNF.serviceEvent(this);
        }
        private static final int index_X35 = 5;
        private void state_X35() {
            eccState = index_X35;
            alg_X35();
            CNF.serviceEvent(this);
        }
        private static final int index_X37 = 6;
        private void state_X37() {
            eccState = index_X37;
            alg_X37();
            CNF.serviceEvent(this);
        }
        private static final int index_X38 = 7;
        private void state_X38() {
            eccState = index_X38;
            alg_X38();
            CNF.serviceEvent(this);
        }
        private static final int index_X30 = 8;
        private void state_X30() {
            eccState = index_X30;
            alg_X30();
            CNF.serviceEvent(this);
        }

        /** The default constructor. */
        public SFC4() {
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
                transition_SFC4_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_X3136) && (vacuum.value & (!X11.value | !X21.value))) {
                state_X32();
                transition_SFC4_3(); 
            }
            else if ((eccState == index_X32) && (vcu.value)) {
                state_X3334();
                transition_SFC4_4(); 
            }
            else if ((eccState == index_X3334) && (s0.value & !pp0.value)) {
                state_X35();
                transition_SFC4_5(); 
            }
            else if ((eccState == index_X35) && (vcd.value)) {
                state_X37();
                transition_SFC4_6(); 
            }
            else if ((eccState == index_X37) && (!vacuum.value)) {
                state_X38();
                transition_SFC4_7(); 
            }
            else if ((eccState == index_X30) && (vcd.value)) {
                state_X3136();
                transition_SFC4_8(); 
            }
            else if ((eccState == index_X38) && (vcu.value)) {
                state_X30();
                transition_SFC4_9(); 
            }
            else if ((eccState == index_X30)) {
                state_X30();
                transition_SFC4_10(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            X30.value = true;
            VCGD.value = false;
            L2CGI.value = false;
            L1CGI.value = false;
            X31.value = false;
            X32.value = false;
            X33.value = false;
            X34.value = false;
            X35.value = false;
            X36.value = false;
            X37.value = false;
            X38.value = false;
            vc_down30.value = false;
            vc_down31.value = false;
            vc_down35.value = false;
            vc_down37.value = false;
            venturi_on.value = false;
            venturi_off.value = false;
            System.out.println("SFC4: INIT");
        }

        /** ALGORITHM REQ IN Java*/
        public void alg_REQ() {
            X38.value = false;
            X30.value = true;
            //System.out.println(s0.value + " " + s1.value + " " + s2.value + " " + s3.value + " " + X11.value + " " + X21.value);

        }

        /** ALGORITHM X30 IN ST*/
        public void alg_X30() {
            X30.value = true;
            X38.value = false;
            if ((((s1.value & X1.value) | (s2.value & X2.value) | (s3.value & X3.value)) & (!X11.value | !X21.value))) {
                VCGD.value = true;
                vc_down30.value = true;
            }
            venturi_off.value = false;
        }

        /** ALGORITHM X3136 IN ST*/
        public void alg_X3136() {
            venturi_on.value = true;
            vc_down30.value = false;
            vc_down31.value = true;
            X30.value = false;
            vc_down31.value = true;
            X31.value = true;
            X36.value = true;
            System.out.println("SFC4: X3136");
        }

        /** ALGORITHM X32 IN ST*/
        public void alg_X32() {
            VCGD.value = false;
            X32.value = true;
            vc_down31.value = false;
            X31.value = false;
            X36.value = true;
            System.out.println("SFC4: X32");
        }

        /** ALGORITHM X3334 IN ST*/
        public void alg_X3334() {
            L1CGI.value = true;
            L2CGI.value = true;
            vc_down31.value = false;
            X32.value = false;
            X36.value = true;
            X33.value = true;
            X34.value = true;
            System.out.println("SFC4: X3334");
        }

        /** ALGORITHM X35 IN ST*/
        public void alg_X35() {
            VCGD.value = true;
            L2CGI.value = false;
            L1CGI.value = false;
            vc_down35.value = true;
            X36.value = true;
            X33.value = false;
            X34.value = false;
            X35.value = true;
            System.out.println("SFC4: X35");
        }

        /** ALGORITHM X37 IN ST*/
        public void alg_X37() {
            venturi_on.value = false;
            venturi_off.value = true;
            vc_down37.value = true;
            vc_down35.value = false;
            X36.value = false;
            X35.value = false;
            X37.value = true;
            System.out.println("SFC4: X37");
        }

        /** ALGORITHM X38 IN ST*/
        public void alg_X38() {
            VCGD.value = false;
            vc_down37.value = false;
            X37.value = false;
            X38.value = true;
            System.out.println("SFC4: X38");
        }
    }
    private void transition_SFC4_0() {
    }

    private void transition_SFC4_1() {
    }

    private void transition_SFC4_2() {
    }

    private void transition_SFC4_3() {
    }

    private void transition_SFC4_4() {
    }

    private void transition_SFC4_5() {
    }

    private void transition_SFC4_6() {
    }

    private void transition_SFC4_7() {
    }

    private void transition_SFC4_8() {
    }

    private void transition_SFC4_9() {
    }

    private void transition_SFC4_10() {
    }
}