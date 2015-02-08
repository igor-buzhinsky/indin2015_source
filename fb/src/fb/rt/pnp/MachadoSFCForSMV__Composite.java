package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class MachadoSFCForSMV__Composite {
    private final MachadoSFCForSMV instance = new MachadoSFCForSMV();

    public void event_INIT(boolean s10_, boolean s11_, boolean s13_, boolean s12_, boolean vcu_, boolean vcd_, boolean pp0_, boolean pp1_, boolean pp2_, boolean pp3_, boolean vacuum_) {
        instance.s10.value = s10_;
        instance.s11.value = s11_;
        instance.s13.value = s13_;
        instance.s12.value = s12_;
        instance.vcu.value = vcu_;
        instance.vcd.value = vcd_;
        instance.pp0.value = pp0_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.vacuum.value = vacuum_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean s10_, boolean s11_, boolean s12_, boolean s13_, boolean vcu_, boolean vcd_, boolean pp0_, boolean pp1_, boolean pp2_, boolean pp3_, boolean vacuum_) {
        instance.s10.value = s10_;
        instance.s11.value = s11_;
        instance.s12.value = s12_;
        instance.s13.value = s13_;
        instance.vcu.value = vcu_;
        instance.vcd.value = vcd_;
        instance.pp0.value = pp0_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.vacuum.value = vacuum_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK MachadoSFCForSMV
     * @author JHC
     * @version 20150208/JHC
     */
    private class MachadoSFCForSMV extends FBInstance
    {
        /** Input event qualifier */
        public BOOL s10 = new BOOL();
        /** VAR s11 */
        public BOOL s11 = new BOOL();
        /** VAR s12 */
        public BOOL s12 = new BOOL();
        /** VAR s13 */
        public BOOL s13 = new BOOL();
        /** VAR vcu */
        public BOOL vcu = new BOOL();
        /** VAR vcd */
        public BOOL vcd = new BOOL();
        /** VAR pp0 */
        public BOOL pp0 = new BOOL();
        /** VAR pp1 */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** VAR vacuum */
        public BOOL vacuum = new BOOL();
        /** Output event qualifier */
        public BOOL c1_front = new BOOL();
        /** VAR c1_back */
        public BOOL c1_back = new BOOL();
        /** VAR c2_front */
        public BOOL c2_front = new BOOL();
        /** VAR c2_back */
        public BOOL c2_back = new BOOL();
        /** VAR vc_down */
        public BOOL vc_down = new BOOL();
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
        /** EVENT INIT */
        public EventOutput INIT = new EventOutput();
        /** Normal Execution Request */
        public EventOutput REQ = new EventOutput();
        /** EVENT INITO */
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
        /** Connect the given variable to the input variable s10
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable s11
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable s12
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable s13
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vcu
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vcd
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable pp0
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable pp1
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable pp2
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable pp3
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vacuum
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** FB SFC1 */
        protected SFC1 SFC1 = new SFC1() ;
        /** FB SFC2 */
        protected SFC2 SFC2 = new SFC2() ;
        /** FB SFC3 */
        protected SFC2 SFC3 = new SFC2() ;
        /** FB SFC4 */
        protected SFC4 SFC4 = new SFC4() ;
        /** The default constructor. */
        public MachadoSFCForSMV() {
            super();
            INIT.connectTo(SFC1.INIT);
            REQ.connectTo(SFC1.REQ);
            SFC1.CNF.connectTo(SFC2.REQ);
            SFC3.CNF.connectTo(CNF);
            SFC2.CNF.connectTo(CNF);
            SFC1.INITO.connectTo(SFC2.INIT);
            SFC2.INITO.connectTo(SFC3.INIT);
            SFC3.INITO.connectTo(SFC4.INIT);
            SFC3.CNF.connectTo(SFC4.REQ);
            SFC2.CNF.connectTo(SFC4.REQ);
            SFC4.INITO.connectTo(INITO);
            SFC4.CNF.connectTo(CNF);
            SFC4.CNF.connectTo(SFC2.REQ);
            SFC4.CNF.connectTo(SFC1.REQ);
            REQ.connectTo(SFC4.REQ);
            REQ.connectTo(SFC3.REQ);
            SFC1.CNF.connectTo(SFC3.REQ);
            REQ.connectTo(SFC2.REQ);
            SFC1.connectIVNoException("pp1",pp1);
            SFC1.connectIVNoException("pp2",pp2);
            SFC1.connectIVNoException("pp3",pp3);
            SFC3.connectIVNoException("s12",s12);
            SFC3.connectIVNoException("s3",s13);
            SFC3.connectIVNoException("X12",SFC1.ovNamedNoException("X2"));
            SFC3.connectIVNoException("X3",SFC1.ovNamedNoException("X3"));
            SFC2.connectIVNoException("X12",SFC1.ovNamedNoException("X1"));
            SFC2.connectIVNoException("s3",s13);
            SFC2.connectIVNoException("X3",SFC1.ovNamedNoException("X3"));
            SFC4.connectIVNoException("s0",s10);
            SFC4.connectIVNoException("s1",s11);
            SFC4.connectIVNoException("s2",s12);
            SFC4.connectIVNoException("s3",s13);
            SFC4.connectIVNoException("X1",SFC1.ovNamedNoException("X1"));
            SFC4.connectIVNoException("X2",SFC1.ovNamedNoException("X2"));
            SFC4.connectIVNoException("X3",SFC1.ovNamedNoException("X3"));
            SFC4.connectIVNoException("X11",SFC2.ovNamedNoException("CGO"));
            SFC4.connectIVNoException("X21",SFC3.ovNamedNoException("CGO"));
            SFC4.connectIVNoException("pp0",pp0);
            SFC4.connectIVNoException("vcu",vcu);
            SFC4.connectIVNoException("vcd",vcd);
            SFC4.connectIVNoException("vacuum",vacuum);
            c1_front = (BOOL) SFC2.ovNamedNoException("CGO");
            c2_front = (BOOL) SFC3.ovNamedNoException("CGO");
            c1_back = (BOOL) SFC4.ovNamedNoException("L1CGI");
            c2_back = (BOOL) SFC4.ovNamedNoException("L2CGI");
            SFC3.connectIVNoException("X30",SFC4.ovNamedNoException("X30"));
            SFC2.connectIVNoException("X30",SFC4.ovNamedNoException("X30"));
            vc_down30 = (BOOL) SFC4.ovNamedNoException("vc_down30");
            vc_down31 = (BOOL) SFC4.ovNamedNoException("vc_down31");
            vc_down35 = (BOOL) SFC4.ovNamedNoException("vc_down35");
            vc_down37 = (BOOL) SFC4.ovNamedNoException("vc_down37");
            venturi_on = (BOOL) SFC4.ovNamedNoException("venturi_on");
            venturi_off = (BOOL) SFC4.ovNamedNoException("venturi_off");
            vc_down = (BOOL) SFC4.ovNamedNoException("VCGD");
            SFC2.connectIVNoException("s12",s11);
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SFC1
     * @author JHC
     * @version 20150208/JHC
     */
    private class SFC1 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** Output event qualifier */
        public BOOL X1 = new BOOL();
        /** VAR X2 */
        public BOOL X2 = new BOOL();
        /** VAR X3 */
        public BOOL X3 = new BOOL();
        /** VAR X4 */
        public BOOL X4 = new BOOL();
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("X1".equals(s)) return X1;
            if ("X2".equals(s)) return X2;
            if ("X3".equals(s)) return X3;
            if ("X4".equals(s)) return X4;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("pp1".equals(ivName)) connect_pp1((BOOL) newIV);
            else if ("pp2".equals(ivName)) connect_pp2((BOOL) newIV);
            else if ("pp3".equals(ivName)) connect_pp3((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable pp1
         * @param newIV The variable to connect
         */
        public void connect_pp1(BOOL newIV) {
            pp1 = newIV;
        }

        /** Connect the given variable to the input variable pp2
         * @param newIV The variable to connect
         */
        public void connect_pp2(BOOL newIV) {
            pp2 = newIV;
        }

        /** Connect the given variable to the input variable pp3
         * @param newIV The variable to connect
         */
        public void connect_pp3(BOOL newIV) {
            pp3 = newIV;
        }
        private static final int index_X4 = 0;
        private void state_X4() {
            eccState = index_X4;
            alg_X4();
            CNF.serviceEvent(this);
        }
        private static final int index_INIT = 1;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            INITO.serviceEvent(this);
            state_X4();
            transition_SFC1_0();
        }
        private static final int index_X1 = 2;
        private void state_X1() {
            eccState = index_X1;
            alg_X1();
            CNF.serviceEvent(this);
        }
        private static final int index_X2 = 3;
        private void state_X2() {
            eccState = index_X2;
            alg_X2();
            CNF.serviceEvent(this);
        }
        private static final int index_X3 = 4;
        private void state_X3() {
            eccState = index_X3;
            alg_X3();
            CNF.serviceEvent(this);
        }

        /** The default constructor. */
        public SFC1() {
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
            if ((eccState == index_X4)) {
                state_INIT();
                transition_SFC1_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_X4) && (pp1.value)) {
                state_X1();
                transition_SFC1_2(); 
            }
            else if ((eccState == index_X4) && ((pp2.value & !pp1.value))) {
                state_X2();
                transition_SFC1_3(); 
            }
            else if ((eccState == index_X4) && ((pp3.value & !pp1.value & !pp2.value))) {
                state_X3();
                transition_SFC1_4(); 
            }
            else if ((eccState == index_X1) && (!pp1.value)) {
                state_X4();
                transition_SFC1_5(); 
            }
            else if ((eccState == index_X2) && (!pp2.value)) {
                state_X4();
                transition_SFC1_6(); 
            }
            else if ((eccState == index_X3) && (!pp3.value)) {
                state_X4();
                transition_SFC1_7(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            X1.value = false;
            X2.value = false;
            X3.value = false;
            X4.value = false;
            System.out.println("SFC1: INIT");
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
        }

        /** ALGORITHM X4 IN ST*/
        public void alg_X4() {
            X4.value = true;
            if (!pp1.value) {
                X1.value = false;
            }
            if (!pp2.value) {
                X2.value = false;
            }
            if (!pp3.value) {
                X3.value = false;
            }
            System.out.println("SFC1: X4");
        }

        /** ALGORITHM X1 IN ST*/
        public void alg_X1() {
            X1.value = true;
            X4.value = false;
            System.out.println("SFC1: X1");
        }

        /** ALGORITHM X2 IN ST*/
        public void alg_X2() {
            X2.value = true;
            X4.value = false;
            System.out.println("SFC1: X2");
        }

        /** ALGORITHM X3 IN ST*/
        public void alg_X3() {
            X3.value = true;
            X4.value = false;
            System.out.println("SFC1: X3");
        }
    }
    private void transition_SFC1_0() {
    }

    private void transition_SFC1_1() {
    }

    private void transition_SFC1_2() {
    }

    private void transition_SFC1_3() {
    }

    private void transition_SFC1_4() {
    }

    private void transition_SFC1_5() {
    }

    private void transition_SFC1_6() {
    }

    private void transition_SFC1_7() {
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SFC2
     * @author JHC
     * @version 20150208/JHC
     */
    private class SFC2 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL s12 = new BOOL();
        /** VAR s3 */
        public BOOL s3 = new BOOL();
        /** VAR X12 */
        public BOOL X12 = new BOOL();
        /** VAR X3 */
        public BOOL X3 = new BOOL();
        /** VAR X30 */
        public BOOL X30 = new BOOL();
        /** Output event qualifier */
        public BOOL CGO = new BOOL();
        /** VAR X10 */
        public BOOL X10 = new BOOL();
        /** VAR X11 */
        public BOOL X11 = new BOOL();
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("CGO".equals(s)) return CGO;
            if ("X10".equals(s)) return X10;
            if ("X11".equals(s)) return X11;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("s12".equals(ivName)) connect_s12((BOOL) newIV);
            else if ("s3".equals(ivName)) connect_s3((BOOL) newIV);
            else if ("X12".equals(ivName)) connect_X12((BOOL) newIV);
            else if ("X3".equals(ivName)) connect_X3((BOOL) newIV);
            else if ("X30".equals(ivName)) connect_X30((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable s12
         * @param newIV The variable to connect
         */
        public void connect_s12(BOOL newIV) {
            s12 = newIV;
        }

        /** Connect the given variable to the input variable s3
         * @param newIV The variable to connect
         */
        public void connect_s3(BOOL newIV) {
            s3 = newIV;
        }

        /** Connect the given variable to the input variable X12
         * @param newIV The variable to connect
         */
        public void connect_X12(BOOL newIV) {
            X12 = newIV;
        }

        /** Connect the given variable to the input variable X3
         * @param newIV The variable to connect
         */
        public void connect_X3(BOOL newIV) {
            X3 = newIV;
        }

        /** Connect the given variable to the input variable X30
         * @param newIV The variable to connect
         */
        public void connect_X30(BOOL newIV) {
            X30 = newIV;
        }
        private static final int index_X10 = 0;
        private void state_X10() {
            eccState = index_X10;
            alg_X10();
            CNF.serviceEvent(this);
        }
        private static final int index_INIT = 1;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            INITO.serviceEvent(this);
            state_X10();
            transition_SFC2_0();
        }
        private static final int index_X11 = 2;
        private void state_X11() {
            eccState = index_X11;
            alg_X11();
            CNF.serviceEvent(this);
        }

        /** The default constructor. */
        public SFC2() {
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
            if ((eccState == index_X10)) {
                state_INIT();
                transition_SFC2_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_X10) && ((((!s12.value & X12.value) | (!s3.value & X3.value)) & X30.value))) {
                state_X11();
                transition_SFC2_2(); 
            }
            else if ((eccState == index_X11) && (((X12.value & s12.value) | (X3.value & s3.value)))) {
                state_X10();
                transition_SFC2_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            CGO.value = false;
            X10.value = false;
            X11.value = false;
            System.out.println("SFC2: INIT");
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
        }

        /** ALGORITHM X11 IN ST*/
        public void alg_X11() {
            CGO.value = true;
            X10.value = false;
            X11.value = true;
            System.out.println("SFC2: X11");
        }

        /** ALGORITHM IntStep IN ST*/
        public void alg_IntStep() {
            CGO.value = false;
            X11.value = false;
            System.out.println("SFC2: IntStep");
        }

        /** ALGORITHM X10 IN ST*/
        public void alg_X10() {
            X10.value = true;
            CGO.value = false;
            X11.value = false;
            System.out.println("SFC2: X10");
        }
    }
    private void transition_SFC2_0() {
    }

    private void transition_SFC2_1() {
    }

    private void transition_SFC2_2() {
    }

    private void transition_SFC2_3() {
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("VCGD".equals(s)) return VCGD;
            if ("L1CGI".equals(s)) return L1CGI;
            if ("L2CGI".equals(s)) return L2CGI;
            if ("X30".equals(s)) return X30;
            if ("X31".equals(s)) return X31;
            if ("X32".equals(s)) return X32;
            if ("X33".equals(s)) return X33;
            if ("X34".equals(s)) return X34;
            if ("X35".equals(s)) return X35;
            if ("X36".equals(s)) return X36;
            if ("X37".equals(s)) return X37;
            if ("X38".equals(s)) return X38;
            if ("vc_down30".equals(s)) return vc_down30;
            if ("vc_down31".equals(s)) return vc_down31;
            if ("vc_down35".equals(s)) return vc_down35;
            if ("vc_down37".equals(s)) return vc_down37;
            if ("venturi_on".equals(s)) return venturi_on;
            if ("venturi_off".equals(s)) return venturi_off;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("s0".equals(ivName)) connect_s0((BOOL) newIV);
            else if ("s1".equals(ivName)) connect_s1((BOOL) newIV);
            else if ("s2".equals(ivName)) connect_s2((BOOL) newIV);
            else if ("s3".equals(ivName)) connect_s3((BOOL) newIV);
            else if ("X1".equals(ivName)) connect_X1((BOOL) newIV);
            else if ("X2".equals(ivName)) connect_X2((BOOL) newIV);
            else if ("X3".equals(ivName)) connect_X3((BOOL) newIV);
            else if ("X11".equals(ivName)) connect_X11((BOOL) newIV);
            else if ("X21".equals(ivName)) connect_X21((BOOL) newIV);
            else if ("pp0".equals(ivName)) connect_pp0((BOOL) newIV);
            else if ("vcu".equals(ivName)) connect_vcu((BOOL) newIV);
            else if ("vcd".equals(ivName)) connect_vcd((BOOL) newIV);
            else if ("vacuum".equals(ivName)) connect_vacuum((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable s0
         * @param newIV The variable to connect
         */
        public void connect_s0(BOOL newIV) {
            s0 = newIV;
        }

        /** Connect the given variable to the input variable s1
         * @param newIV The variable to connect
         */
        public void connect_s1(BOOL newIV) {
            s1 = newIV;
        }

        /** Connect the given variable to the input variable s2
         * @param newIV The variable to connect
         */
        public void connect_s2(BOOL newIV) {
            s2 = newIV;
        }

        /** Connect the given variable to the input variable s3
         * @param newIV The variable to connect
         */
        public void connect_s3(BOOL newIV) {
            s3 = newIV;
        }

        /** Connect the given variable to the input variable X1
         * @param newIV The variable to connect
         */
        public void connect_X1(BOOL newIV) {
            X1 = newIV;
        }

        /** Connect the given variable to the input variable X2
         * @param newIV The variable to connect
         */
        public void connect_X2(BOOL newIV) {
            X2 = newIV;
        }

        /** Connect the given variable to the input variable X3
         * @param newIV The variable to connect
         */
        public void connect_X3(BOOL newIV) {
            X3 = newIV;
        }

        /** Connect the given variable to the input variable X11
         * @param newIV The variable to connect
         */
        public void connect_X11(BOOL newIV) {
            X11 = newIV;
        }

        /** Connect the given variable to the input variable X21
         * @param newIV The variable to connect
         */
        public void connect_X21(BOOL newIV) {
            X21 = newIV;
        }

        /** Connect the given variable to the input variable pp0
         * @param newIV The variable to connect
         */
        public void connect_pp0(BOOL newIV) {
            pp0 = newIV;
        }

        /** Connect the given variable to the input variable vcu
         * @param newIV The variable to connect
         */
        public void connect_vcu(BOOL newIV) {
            vcu = newIV;
        }

        /** Connect the given variable to the input variable vcd
         * @param newIV The variable to connect
         */
        public void connect_vcd(BOOL newIV) {
            vcd = newIV;
        }

        /** Connect the given variable to the input variable vacuum
         * @param newIV The variable to connect
         */
        public void connect_vacuum(BOOL newIV) {
            vacuum = newIV;
        }
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