package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class PierToPierCFB__Composite {
    private final PierToPierCFB instance = new PierToPierCFB();

    public void event_INIT(boolean c1home_, boolean c1end_, boolean c2home_, boolean c2end_, boolean vc_up_, boolean vc_down_, boolean vacuum_, boolean pp0_, boolean pp1_, boolean pp2_, boolean pp3_) {
        instance.c1home.value = c1home_;
        instance.c1end.value = c1end_;
        instance.c2home.value = c2home_;
        instance.c2end.value = c2end_;
        instance.vc_up.value = vc_up_;
        instance.vc_down.value = vc_down_;
        instance.vacuum.value = vacuum_;
        instance.pp0.value = pp0_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean c1home_, boolean c1end_, boolean c2home_, boolean c2end_, boolean vc_up_, boolean vc_down_, boolean vacuum_, boolean pp0_, boolean pp1_, boolean pp2_, boolean pp3_) {
        instance.c1home.value = c1home_;
        instance.c1end.value = c1end_;
        instance.c2home.value = c2home_;
        instance.c2end.value = c2end_;
        instance.vc_up.value = vc_up_;
        instance.vc_down.value = vc_down_;
        instance.vacuum.value = vacuum_;
        instance.pp0.value = pp0_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK PierToPierCFB
     * @author Majid Sorouri
     * @version 20150205/Majid Sorouri
     */
    private class PierToPierCFB extends FBInstance
    {
        /** VAR c1home */
        public BOOL c1home = new BOOL();
        /** VAR c1end */
        public BOOL c1end = new BOOL();
        /** VAR c2home */
        public BOOL c2home = new BOOL();
        /** VAR c2end */
        public BOOL c2end = new BOOL();
        /** VAR vc_up */
        public BOOL vc_up = new BOOL();
        /** VAR vc_down */
        public BOOL vc_down = new BOOL();
        /** VAR vacuum */
        public BOOL vacuum = new BOOL();
        /** VAR pp0 */
        public BOOL pp0 = new BOOL();
        /** VAR pp1 */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** VAR vcMoveOut */
        public BOOL vcMoveOut = new BOOL();
        /** VAR venturi_on */
        public BOOL venturi_on = new BOOL();
        /** VAR venturi_off */
        public BOOL venturi_off = new BOOL();
        /** VAR c1MoveOut */
        public BOOL c1MoveOut = new BOOL();
        /** VAR c1MoveIn */
        public BOOL c1MoveIn = new BOOL();
        /** VAR c2MoveOut */
        public BOOL c2MoveOut = new BOOL();
        /** VAR c2MoveIn */
        public BOOL c2MoveIn = new BOOL();
        /** Initialization Request */
        public EventOutput INIT = new EventOutput();
        /** Normal Execution Request */
        public EventOutput REQ = new EventOutput();
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
        /** Connect the given variable to the input variable c1home
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable c1end
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable c2home
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable c2end
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vc_up
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vc_down
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vacuum
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
        /** FB FB3 */
        protected vaccum3 FB3 = new vaccum3() ;
        /** FB FB5 */
        protected E_Split4 FB5 = new E_Split4() ;
        /** FB FB2 */
        protected GenCyl FB2 = new GenCyl() ;
        /** FB FB1 */
        protected GenCyl FB1 = new GenCyl() ;
        /** FB FB4 */
        protected verticalcylinder3 FB4 = new verticalcylinder3() ;
        /** FB FB6 */
        protected E_SPLIT FB6 = new E_SPLIT() ;
        /** The default constructor. */
        public PierToPierCFB() {
            super();
            INIT.connectTo(FB1.INIT);
            FB1.INITO.connectTo(FB2.INIT);
            FB2.INITO.connectTo(FB4.INIT);
            FB4.INITO.connectTo(FB3.INIT);
            REQ.connectTo(FB5.E);
            FB5.E1.connectTo(FB1.REQ);
            FB5.E2.connectTo(FB2.REQ);
            FB5.E3.connectTo(FB4.REQ);
            FB5.E4.connectTo(FB3.Req);
            FB4.OUT_CMD2.connectTo(FB6.EI);
            FB6.EO2.connectTo(FB1.IN_CMD);
            FB6.EO1.connectTo(FB2.IN_CMD);
            FB2.OUT_CMD.connectTo(FB4.IN_CMD);
            FB3.OUT_CMD.connectTo(FB4.IN_CMD);
            FB1.OUT_CMD.connectTo(FB4.IN_CMD);
            FB4.OUT_CMD.connectTo(FB3.IN_CMD);
            FB3.INITO.connectTo(INITO);
            FB1.CNF.connectTo(CNF);
            FB2.CNF.connectTo(CNF);
            FB4.CNF.connectTo(CNF);
            FB3.CNF.connectTo(CNF);
            FB3.connectIVNoException("SwitchOn",FB4.ovNamedNoException("DownToPick"));
            FB3.connectIVNoException("SwitchOff",FB4.ovNamedNoException("DownToDrop"));
            FB4.connectIVNoException("c1permitDown",FB1.ovNamedNoException("AllowVcDown"));
            FB4.connectIVNoException("c2PermitDown",FB2.ovNamedNoException("AllowVcDown"));
            FB2.connectIVNoException("vcPermitMove",FB4.ovNamedNoException("vc_Done"));
            FB1.connectIVNoException("vcPermitMove",FB4.ovNamedNoException("vc_Done"));
            FB1.connectIVNoException("pp1",pp1);
            FB1.connectIVNoException("pp2",pp2);
            FB1.connectIVNoException("pp3",pp3);
            FB2.connectIVNoException("pp1",pp1);
            FB2.connectIVNoException("pp2",pp2);
            FB2.connectIVNoException("pp3",pp3);
            FB4.connectIVNoException("pp0",pp0);
            FB4.connectIVNoException("vc_up",vc_up);
            FB4.connectIVNoException("vc_down",vc_down);
            FB4.connectIVNoException("c1home",c1home);
            FB4.connectIVNoException("c2home",c2home);
            vcMoveOut = (BOOL) FB4.ovNamedNoException("vcMoveOut");
            FB3.connectIVNoException("vacuum",vacuum);
            venturi_on = (BOOL) FB3.ovNamedNoException("venturi_on");
            venturi_off = (BOOL) FB3.ovNamedNoException("venturi_off");
            FB1.connectIVNoException("chome",c1home);
            FB1.connectIVNoException("cend",c1end);
            FB2.connectIVNoException("chome",c2home);
            FB2.connectIVNoException("cend",c2end);
            c1MoveOut = (BOOL) FB1.ovNamedNoException("cMoveOut");
            c1MoveIn = (BOOL) FB1.ovNamedNoException("cMoveIn");
            c2MoveOut = (BOOL) FB2.ovNamedNoException("cMoveOut");
            c2MoveIn = (BOOL) FB2.ovNamedNoException("cMoveIn");
            FB2.ID.initializeNoException("2");
            FB1.ID.initializeNoException("1");
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK vaccum3
     * @author Majid Sorouri
     * @version 20150205/Majid Sorouri
     */
    private class vaccum3 extends FBInstance
    {
        /** VAR vacuum */
        public BOOL vacuum = new BOOL();
        /** VAR SwitchOn */
        public BOOL SwitchOn = new BOOL();
        /** VAR SwitchOff */
        public BOOL SwitchOff = new BOOL();
        /** Output event qualifier */
        public BOOL venturi_on = new BOOL();
        /** VAR venturi_off */
        public BOOL venturi_off = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** EVENT Req */
        public EventServer Req = new EventInput(this);
        /** EVENT IN_CMD */
        public EventServer IN_CMD = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** EVENT CNF */
        public EventOutput CNF = new EventOutput();
        /** Execution Confirmation */
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("venturi_on".equals(s)) return venturi_on;
            if ("venturi_off".equals(s)) return venturi_off;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("vacuum".equals(ivName)) connect_vacuum((BOOL) newIV);
            else if ("SwitchOn".equals(ivName)) connect_SwitchOn((BOOL) newIV);
            else if ("SwitchOff".equals(ivName)) connect_SwitchOff((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable vacuum
         * @param newIV The variable to connect
         */
        public void connect_vacuum(BOOL newIV) {
            vacuum = newIV;
        }

        /** Connect the given variable to the input variable SwitchOn
         * @param newIV The variable to connect
         */
        public void connect_SwitchOn(BOOL newIV) {
            SwitchOn = newIV;
        }

        /** Connect the given variable to the input variable SwitchOff
         * @param newIV The variable to connect
         */
        public void connect_SwitchOff(BOOL newIV) {
            SwitchOff = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_INIT = 1;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            INITO.serviceEvent(this);
            state_VaccumOff();
            transition_vaccum3_0();
        }
        private static final int index_suction = 2;
        private void state_suction() {
            eccState = index_suction;
            alg_suction();
            CNF.serviceEvent(this);
        }
        private static final int index_Drop = 3;
        private void state_Drop() {
            eccState = index_Drop;
            alg_Drop();
            CNF.serviceEvent(this);
        }
        private static final int index_VaccumOn = 4;
        private void state_VaccumOn() {
            eccState = index_VaccumOn;
            OUT_CMD.serviceEvent(this);
        }
        private static final int index_VaccumOff = 5;
        private void state_VaccumOff() {
            eccState = index_VaccumOff;
            OUT_CMD.serviceEvent(this);
        }

        /** The default constructor. */
        public vaccum3() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == Req) service_Req();
            else if (e == IN_CMD) service_IN_CMD();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_vaccum3_1(); 
            }
        }

        /** Services the Req event. */
        public void service_Req() {
            if ((eccState == index_Drop) && (!vacuum.value)) {
                state_VaccumOff();
                transition_vaccum3_2(); 
            }
            else if ((eccState == index_suction) && (vacuum.value)) {
                state_VaccumOn();
                transition_vaccum3_3(); 
            }
        }

        /** Services the IN_CMD event. */
        public void service_IN_CMD() {
            if ((eccState == index_VaccumOff) && (SwitchOn.value)) {
                state_suction();
                transition_vaccum3_4(); 
            }
            else if ((eccState == index_VaccumOn) && (SwitchOff.value)) {
                state_Drop();
                transition_vaccum3_5(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            venturi_off.value = true;
            venturi_on.value = false;
            System.out.println("Vassum3 INIT");
        }

        /** ALGORITHM suction IN ST*/
        public void alg_suction() {
            venturi_off.value = false;
            venturi_on.value = true;
            System.out.println("Vaccum3 Suction");
        }

        /** ALGORITHM Drop IN ST*/
        public void alg_Drop() {
            venturi_off.value = true;
            venturi_on.value = false;
            System.out.println("Vaccum3 Drop");
        }
    }
    private void transition_vaccum3_0() {
    }

    private void transition_vaccum3_1() {
    }

    private void transition_vaccum3_2() {
    }

    private void transition_vaccum3_3() {
    }

    private void transition_vaccum3_4() {
    }

    private void transition_vaccum3_5() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK E_Split4
     * @author Administrator
     * @version 20150205/Administrator
     */
    private class E_Split4 extends FBInstance
    {
        /** Normal Execution Request */
        public EventServer E = new EventInput(this);
        /** Execution Confirmation */
        public EventOutput E1 = new EventOutput();
        /** EVENT E2 */
        public EventOutput E2 = new EventOutput();
        /** EVENT E3 */
        public EventOutput E3 = new EventOutput();
        /** EVENT E4 */
        public EventOutput E4 = new EventOutput();
        /** {@inheritDoc}
         * @param s {@inheritDoc}
         * @return {@inheritDoc}
         */
        /** {@inheritDoc}
         * @param s {@inheritDoc}
         * @return {@inheritDoc}
         */
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_REQ = 1;
        private void state_REQ() {
            eccState = index_REQ;
            E1.serviceEvent(this);
            E2.serviceEvent(this);
            E3.serviceEvent(this);
            E4.serviceEvent(this);
            state_START();
            transition_E_Split4_0();
        }

        /** The default constructor. */
        public E_Split4() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == E) service_E();
        }

        /** Services the E event. */
        public void service_E() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_E_Split4_1(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;
        }
    }
    private void transition_E_Split4_0() {
    }

    private void transition_E_Split4_1() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK GenCyl
     * @author Majid Sorouri
     * @version 20150205/Majid Sorouri
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("cMoveOut".equals(s)) return cMoveOut;
            if ("cMoveIn".equals(s)) return cMoveIn;
            if ("AllowVcDown".equals(s)) return AllowVcDown;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("chome".equals(ivName)) connect_chome((BOOL) newIV);
            else if ("cend".equals(ivName)) connect_cend((BOOL) newIV);
            else if ("pp1".equals(ivName)) connect_pp1((BOOL) newIV);
            else if ("pp2".equals(ivName)) connect_pp2((BOOL) newIV);
            else if ("pp3".equals(ivName)) connect_pp3((BOOL) newIV);
            else if ("vcPermitMove".equals(ivName)) connect_vcPermitMove((BOOL) newIV);
            else if ("ID".equals(ivName)) connect_ID((INT) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable chome
         * @param newIV The variable to connect
         */
        public void connect_chome(BOOL newIV) {
            chome = newIV;
        }

        /** Connect the given variable to the input variable cend
         * @param newIV The variable to connect
         */
        public void connect_cend(BOOL newIV) {
            cend = newIV;
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

        /** Connect the given variable to the input variable vcPermitMove
         * @param newIV The variable to connect
         */
        public void connect_vcPermitMove(BOOL newIV) {
            vcPermitMove = newIV;
        }

        /** Connect the given variable to the input variable ID
         * @param newIV The variable to connect
         */
        public void connect_ID(INT newIV) {
            ID = newIV;
        }
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
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK verticalcylinder3
     * @author Majid Sorouri
     * @version 20150205/Majid Sorouri
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("vcMoveOut".equals(s)) return vcMoveOut;
            if ("DownToPick".equals(s)) return DownToPick;
            if ("DownToDrop".equals(s)) return DownToDrop;
            if ("vc_Done".equals(s)) return vc_Done;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("vc_up".equals(ivName)) connect_vc_up((BOOL) newIV);
            else if ("vc_down".equals(ivName)) connect_vc_down((BOOL) newIV);
            else if ("c1home".equals(ivName)) connect_c1home((BOOL) newIV);
            else if ("c2home".equals(ivName)) connect_c2home((BOOL) newIV);
            else if ("pp0".equals(ivName)) connect_pp0((BOOL) newIV);
            else if ("c1permitDown".equals(ivName)) connect_c1permitDown((BOOL) newIV);
            else if ("c2PermitDown".equals(ivName)) connect_c2PermitDown((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable vc_up
         * @param newIV The variable to connect
         */
        public void connect_vc_up(BOOL newIV) {
            vc_up = newIV;
        }

        /** Connect the given variable to the input variable vc_down
         * @param newIV The variable to connect
         */
        public void connect_vc_down(BOOL newIV) {
            vc_down = newIV;
        }

        /** Connect the given variable to the input variable c1home
         * @param newIV The variable to connect
         */
        public void connect_c1home(BOOL newIV) {
            c1home = newIV;
        }

        /** Connect the given variable to the input variable c2home
         * @param newIV The variable to connect
         */
        public void connect_c2home(BOOL newIV) {
            c2home = newIV;
        }

        /** Connect the given variable to the input variable pp0
         * @param newIV The variable to connect
         */
        public void connect_pp0(BOOL newIV) {
            pp0 = newIV;
        }

        /** Connect the given variable to the input variable c1permitDown
         * @param newIV The variable to connect
         */
        public void connect_c1permitDown(BOOL newIV) {
            c1permitDown = newIV;
        }

        /** Connect the given variable to the input variable c2PermitDown
         * @param newIV The variable to connect
         */
        public void connect_c2PermitDown(BOOL newIV) {
            c2PermitDown = newIV;
        }
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
    /* Copyright (c)2015 Holobloc Inc. All rights reserved. */




    /** FUNCTION_BLOCK E_SPLIT
     * @author JHC
     * @version 20150205/JHC
     */
    private class E_SPLIT extends FBInstance
    {
        /** Input event */
        public EventServer EI = new EventInput(this);
        /** First output event */
        public EventOutput EO1 = new EventOutput();
        /** Second output event,etc. */
        public EventOutput EO2 = new EventOutput();
        /** {@inheritDoc}
         * @param s {@inheritDoc}
         * @return {@inheritDoc}
         */
        /** {@inheritDoc}
         * @param s {@inheritDoc}
         * @return {@inheritDoc}
         */
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_EO = 1;
        private void state_EO() {
            eccState = index_EO;
            EO1.serviceEvent(this);
            EO2.serviceEvent(this);
            state_START();
            transition_E_SPLIT_0();
        }

        /** The default constructor. */
        public E_SPLIT() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == EI) service_EI();
        }

        /** Services the EI event. */
        public void service_EI() {
            if ((eccState == index_START)) {
                state_EO();
                transition_E_SPLIT_1(); 
            }
        }
    }
    private void transition_E_SPLIT_0() {
    }

    private void transition_E_SPLIT_1() {
    }
}