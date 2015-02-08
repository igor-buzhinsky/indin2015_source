package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class MasterSlave__Composite {
    private final MasterSlave instance = new MasterSlave();

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




    /** FUNCTION_BLOCK MasterSlave
     * @author Majid Sorouri
     * @version 20150208/Majid Sorouri
     */
    private class MasterSlave extends FBInstance
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
        /** FB Vaccum */
        protected VaccumSlave Vaccum = new VaccumSlave() ;
        /** FB FB5 */
        protected E_Split5 FB5 = new E_Split5() ;
        /** FB LC */
        protected SlaveCylinder LC = new SlaveCylinder() ;
        /** FB RC */
        protected SlaveCylinder RC = new SlaveCylinder() ;
        /** FB VC */
        protected CylinderMaterSlave VC = new CylinderMaterSlave() ;
        /** FB Master */
        protected WPMaster Master = new WPMaster() ;
        /** FB SpringCyl */
        protected SpringCyl SpringCyl = new SpringCyl() ;
        /** The default constructor. */
        public MasterSlave() {
            super();
            REQ.connectTo(FB5.E);
            INIT.connectTo(Master.INIT);
            FB5.E1.connectTo(RC.REQ);
            Master.LC_Op1.connectTo(LC.Extend);
            Master.LC_Op2.connectTo(LC.Retract);
            Master.RC_Op1.connectTo(RC.Extend);
            Master.RC_Op2.connectTo(RC.Retract);
            Master.VC_Op1.connectTo(VC.Extend);
            LC.Completed.connectTo(Master.LC_CONF);
            RC.Completed.connectTo(Master.RC_CONF);
            VC.Completed.connectTo(Master.VC_CONF);
            LC.CNF.connectTo(CNF);
            RC.CNF.connectTo(CNF);
            VC.SL_OP1.connectTo(Vaccum.OP1);
            FB5.E2.connectTo(Master.REQ);
            FB5.E3.connectTo(LC.REQ);
            FB5.E4.connectTo(VC.REQ);
            FB5.E5.connectTo(Vaccum.REQ);
            Vaccum.Completed.connectTo(VC.SL_CNF);
            Vaccum.CNF.connectTo(CNF);
            Master.INITO.connectTo(Vaccum.INIT);
            Vaccum.INTO.connectTo(INITO);
            SpringCyl.CNF.connectTo(CNF);
            VC.CNF.connectTo(SpringCyl.REQ);
            Master.VC_Op2.connectTo(VC.Retract);
            LC.connectIVNoException("HOME",c1home);
            LC.connectIVNoException("END",c1end);
            RC.connectIVNoException("HOME",c2home);
            RC.connectIVNoException("END",c2end);
            c2MoveOut = (BOOL) RC.ovNamedNoException("GoOut");
            c2MoveIn = (BOOL) RC.ovNamedNoException("GoIn");
            c1MoveOut = (BOOL) LC.ovNamedNoException("GoOut");
            c1MoveIn = (BOOL) LC.ovNamedNoException("GoIn");
            Master.connectIVNoException("LC_READY",LC.ovNamedNoException("READY"));
            Master.connectIVNoException("RC_READY",RC.ovNamedNoException("READY"));
            Master.connectIVNoException("VC_READY",VC.ovNamedNoException("READY"));
            Master.connectIVNoException("pp0",pp0);
            Master.connectIVNoException("pp1",pp1);
            Master.connectIVNoException("pp2",pp2);
            Master.connectIVNoException("pp3",pp3);
            VC.connectIVNoException("HOME",vc_up);
            VC.connectIVNoException("END",vc_down);
            venturi_on = (BOOL) Vaccum.ovNamedNoException("VaccumOn");
            venturi_off = (BOOL) Vaccum.ovNamedNoException("VaccumOff");
            VC.connectIVNoException("SL_READY",Vaccum.ovNamedNoException("READY"));
            SpringCyl.connectIVNoException("In1",VC.ovNamedNoException("GoOut"));
            SpringCyl.connectIVNoException("In2",VC.ovNamedNoException("GoIn"));
            vcMoveOut = (BOOL) SpringCyl.ovNamedNoException("Out1");
            Vaccum.connectIVNoException("VACCUM",vacuum);
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK VaccumSlave
     * @author JHC
     * @version 20150208/JHC
     */
    private class VaccumSlave extends FBInstance
    {
        /** Input event qualifier */
        public BOOL VACCUM = new BOOL();
        /** Output event qualifier */
        public BOOL READY = new BOOL();
        /** Output event qualifier */
        public BOOL VaccumOn = new BOOL();
        /** Output event qualifier */
        public BOOL VaccumOff = new BOOL();
        /** Initialization Request */
        public EventServer OP1 = new EventInput(this);
        /** Normal Execution Request */
        public EventServer OP2 = new EventInput(this);
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
        /** EVENT INIT */
        public EventServer INIT = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput Completed = new EventOutput();
        /** EVENT CNF */
        public EventOutput CNF = new EventOutput();
        /** EVENT INTO */
        public EventOutput INTO = new EventOutput();
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
            if ("READY".equals(s)) return READY;
            if ("VaccumOn".equals(s)) return VaccumOn;
            if ("VaccumOff".equals(s)) return VaccumOff;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("VACCUM".equals(ivName)) connect_VACCUM((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable VACCUM
         * @param newIV The variable to connect
         */
        public void connect_VACCUM(BOOL newIV) {
            VACCUM = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_OP11 = 1;
        private void state_OP11() {
            eccState = index_OP11;
            alg_OP11();
            CNF.serviceEvent(this);
        }
        private static final int index_OP22 = 2;
        private void state_OP22() {
            eccState = index_OP22;
            alg_OP22();
            CNF.serviceEvent(this);
        }
        private static final int index_OP12 = 3;
        private void state_OP12() {
            eccState = index_OP12;
            alg_OP12();
            CNF.serviceEvent(this);
        }
        private static final int index_OP21 = 4;
        private void state_OP21() {
            eccState = index_OP21;
            alg_OP22();
            CNF.serviceEvent(this);
        }
        private static final int index_Vaccum = 5;
        private void state_Vaccum() {
            eccState = index_Vaccum;
            alg_Vaccum();
            CNF.serviceEvent(this);
            Completed.serviceEvent(this);
            state_START();
            transition_VaccumSlave_0();
        }
        private static final int index_INIT = 6;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            INTO.serviceEvent(this);
            state_START();
            transition_VaccumSlave_1();
        }

        /** The default constructor. */
        public VaccumSlave() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == OP1) service_OP1();
            else if (e == OP2) service_OP2();
            else if (e == REQ) service_REQ();
            else if (e == INIT) service_INIT();
        }

        /** Services the OP1 event. */
        public void service_OP1() {
            if ((eccState == index_START) && (VACCUM.value)) {
                state_OP11();
                transition_VaccumSlave_2(); 
            }
            else if ((eccState == index_START) && (!VACCUM.value)) {
                state_OP12();
                transition_VaccumSlave_3(); 
            }
        }

        /** Services the OP2 event. */
        public void service_OP2() {
            if ((eccState == index_START) && (!VACCUM.value)) {
                state_OP22();
                transition_VaccumSlave_4(); 
            }
            else if ((eccState == index_START) && (VACCUM.value)) {
                state_OP21();
                transition_VaccumSlave_5(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_OP12) && (VACCUM.value)) {
                state_Vaccum();
                transition_VaccumSlave_6(); 
            }
            else if ((eccState == index_OP11) && (!VACCUM.value)) {
                state_Vaccum();
                transition_VaccumSlave_7(); 
            }
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_VaccumSlave_8(); 
            }
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
        }

        /** ALGORITHM OP11 IN ST*/
        public void alg_OP11() {
            VaccumOff.value = true;
            VaccumOn.value = false;
            READY.value = false;
            System.out.println("OP11!!");
        }

        /** ALGORITHM OP12 IN ST*/
        public void alg_OP12() {
            VaccumOff.value = false;
            VaccumOn.value = true;
            READY.value = false;
            System.out.println("OP12!!");
        }

        /** ALGORITHM OP21 IN ST*/
        public void alg_OP21() {
            VaccumOff.value = true;
            VaccumOn.value = false;
            READY.value = false;
            System.out.println("OP21!!");
        }

        /** ALGORITHM OP22 IN ST*/
        public void alg_OP22() {
            VaccumOff.value = true;
            VaccumOn.value = false;
            READY.value = false;
            System.out.println("OP22!!");
        }

        /** ALGORITHM Vaccum IN ST*/
        public void alg_Vaccum() {
            READY.value = true;
            System.out.println("Vaccum!!");
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            VACCUM.value = false;
        }
    }
    private void transition_VaccumSlave_0() {
    }

    private void transition_VaccumSlave_1() {
    }

    private void transition_VaccumSlave_2() {
    }

    private void transition_VaccumSlave_3() {
    }

    private void transition_VaccumSlave_4() {
    }

    private void transition_VaccumSlave_5() {
    }

    private void transition_VaccumSlave_6() {
    }

    private void transition_VaccumSlave_7() {
    }

    private void transition_VaccumSlave_8() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK E_Split5
     * @author Administrator
     * @version 20150208/Administrator
     */
    private class E_Split5 extends FBInstance
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
        /** EVENT E5 */
        public EventOutput E5 = new EventOutput();
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
            E5.serviceEvent(this);
            state_START();
            transition_E_Split5_0();
        }

        /** The default constructor. */
        public E_Split5() {
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
                transition_E_Split5_1(); 
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
    private void transition_E_Split5_0() {
    }

    private void transition_E_Split5_1() {
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SlaveCylinder
     * @author JHC
     * @version 20150208/JHC
     */
    private class SlaveCylinder extends FBInstance
    {
        /** Input event qualifier */
        public BOOL HOME = new BOOL();
        /** Input event qualifier */
        public BOOL MID = new BOOL();
        /** Input event qualifier */
        public BOOL END = new BOOL();
        /** Output event qualifier */
        public BOOL READY = new BOOL();
        /** Output event qualifier */
        public BOOL GoOut = new BOOL();
        /** Output event qualifier */
        public BOOL GoIn = new BOOL();
        /** Initialization Request */
        public EventServer Extend = new EventInput(this);
        /** Normal Execution Request */
        public EventServer Retract = new EventInput(this);
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput Completed = new EventOutput();
        /** EVENT CNF */
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
            if ("READY".equals(s)) return READY;
            if ("GoOut".equals(s)) return GoOut;
            if ("GoIn".equals(s)) return GoIn;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("HOME".equals(ivName)) connect_HOME((BOOL) newIV);
            else if ("MID".equals(ivName)) connect_MID((BOOL) newIV);
            else if ("END".equals(ivName)) connect_END((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable HOME
         * @param newIV The variable to connect
         */
        public void connect_HOME(BOOL newIV) {
            HOME = newIV;
        }

        /** Connect the given variable to the input variable MID
         * @param newIV The variable to connect
         */
        public void connect_MID(BOOL newIV) {
            MID = newIV;
        }

        /** Connect the given variable to the input variable END
         * @param newIV The variable to connect
         */
        public void connect_END(BOOL newIV) {
            END = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_Extend = 1;
        private void state_Extend() {
            eccState = index_Extend;
            alg_Extend();
            CNF.serviceEvent(this);
        }
        private static final int index_Retract = 2;
        private void state_Retract() {
            eccState = index_Retract;
            alg_Retract();
            CNF.serviceEvent(this);
        }
        private static final int index_End = 3;
        private void state_End() {
            eccState = index_End;
            alg_End();
            CNF.serviceEvent(this);
            Completed.serviceEvent(this);
            state_START();
            transition_SlaveCylinder_0();
        }
        private static final int index_Home = 4;
        private void state_Home() {
            eccState = index_Home;
            alg_Home();
            CNF.serviceEvent(this);
            Completed.serviceEvent(this);
            state_START();
            transition_SlaveCylinder_1();
        }

        /** The default constructor. */
        public SlaveCylinder() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == Extend) service_Extend();
            else if (e == Retract) service_Retract();
            else if (e == REQ) service_REQ();
        }

        /** Services the Extend event. */
        public void service_Extend() {
            if ((eccState == index_START)) {
                state_Extend();
                transition_SlaveCylinder_2(); 
            }
        }

        /** Services the Retract event. */
        public void service_Retract() {
            if ((eccState == index_START)) {
                state_Retract();
                transition_SlaveCylinder_3(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_Retract) && (HOME.value)) {
                state_Home();
                transition_SlaveCylinder_4(); 
            }
            else if ((eccState == index_Extend) && (END.value)) {
                state_End();
                transition_SlaveCylinder_5(); 
            }
        }

        /** ALGORITHM Extend IN ST*/
        public void alg_Extend() {
            GoOut.value = true;
            GoIn.value = false;
            READY.value = false;
            System.out.println("Extend!!");
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            System.out.println("REQ!!");
        }

        /** ALGORITHM Retract IN ST*/
        public void alg_Retract() {
            GoIn.value = true;
            GoOut.value = false;
            READY.value = false;
            System.out.println("Retract!!");
        }

        /** ALGORITHM Home IN ST*/
        public void alg_Home() {
            READY.value = true;
            GoIn.value = false;
            System.out.println("Home!!");
        }

        /** ALGORITHM End IN ST*/
        public void alg_End() {
            READY.value = true;
            GoOut.value = false;
            System.out.println("End!!");
        }
    }
    private void transition_SlaveCylinder_0() {
    }

    private void transition_SlaveCylinder_1() {
    }

    private void transition_SlaveCylinder_2() {
    }

    private void transition_SlaveCylinder_3() {
    }

    private void transition_SlaveCylinder_4() {
    }

    private void transition_SlaveCylinder_5() {
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK CylinderMaterSlave
     * @author JHC
     * @version 20150208/JHC
     */
    private class CylinderMaterSlave extends FBInstance
    {
        /** Input event qualifier */
        public BOOL HOME = new BOOL();
        /** Input event qualifier */
        public BOOL MID = new BOOL();
        /** Input event qualifier */
        public BOOL END = new BOOL();
        /** VAR SL_READY */
        public BOOL SL_READY = new BOOL();
        /** Output event qualifier */
        public BOOL READY = new BOOL();
        /** Output event qualifier */
        public BOOL GoOut = new BOOL();
        /** Output event qualifier */
        public BOOL GoIn = new BOOL();
        /** Initialization Request */
        public EventServer Extend = new EventInput(this);
        /** Normal Execution Request */
        public EventServer Retract = new EventInput(this);
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
        /** EVENT SL_CNF */
        public EventServer SL_CNF = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput Completed = new EventOutput();
        /** EVENT CNF */
        public EventOutput CNF = new EventOutput();
        /** EVENT SL_OP1 */
        public EventOutput SL_OP1 = new EventOutput();
        /** EVENT SL_OP2 */
        public EventOutput SL_OP2 = new EventOutput();
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
            if ("READY".equals(s)) return READY;
            if ("GoOut".equals(s)) return GoOut;
            if ("GoIn".equals(s)) return GoIn;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("HOME".equals(ivName)) connect_HOME((BOOL) newIV);
            else if ("MID".equals(ivName)) connect_MID((BOOL) newIV);
            else if ("END".equals(ivName)) connect_END((BOOL) newIV);
            else if ("SL_READY".equals(ivName)) connect_SL_READY((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable HOME
         * @param newIV The variable to connect
         */
        public void connect_HOME(BOOL newIV) {
            HOME = newIV;
        }

        /** Connect the given variable to the input variable MID
         * @param newIV The variable to connect
         */
        public void connect_MID(BOOL newIV) {
            MID = newIV;
        }

        /** Connect the given variable to the input variable END
         * @param newIV The variable to connect
         */
        public void connect_END(BOOL newIV) {
            END = newIV;
        }

        /** Connect the given variable to the input variable SL_READY
         * @param newIV The variable to connect
         */
        public void connect_SL_READY(BOOL newIV) {
            SL_READY = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
            alg_Test();
            Completed.serviceEvent(this);
        }
        private static final int index_Extend = 1;
        private void state_Extend() {
            eccState = index_Extend;
            alg_Extend();
            CNF.serviceEvent(this);
        }
        private static final int index_Retract = 2;
        private void state_Retract() {
            eccState = index_Retract;
            alg_Retract();
            CNF.serviceEvent(this);
        }
        private static final int index_Home = 3;
        private void state_Home() {
            eccState = index_Home;
            alg_Home();
            CNF.serviceEvent(this);
            state_START();
            transition_CylinderMaterSlave_0();
        }
        private static final int index_End = 4;
        private void state_End() {
            eccState = index_End;
            alg_End();
            CNF.serviceEvent(this);
            SL_OP1.serviceEvent(this);
        }

        /** The default constructor. */
        public CylinderMaterSlave() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == Extend) service_Extend();
            else if (e == Retract) service_Retract();
            else if (e == REQ) service_REQ();
            else if (e == SL_CNF) service_SL_CNF();
        }

        /** Services the Extend event. */
        public void service_Extend() {
            if ((eccState == index_START)) {
                state_Extend();
                transition_CylinderMaterSlave_1(); 
            }
        }

        /** Services the Retract event. */
        public void service_Retract() {
            if ((eccState == index_START)) {
                state_Retract();
                transition_CylinderMaterSlave_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_Extend) && (END.value)) {
                state_End();
                transition_CylinderMaterSlave_3(); 
            }
            else if ((eccState == index_Retract) && (HOME.value)) {
                state_Home();
                transition_CylinderMaterSlave_4(); 
            }
        }

        /** Services the SL_CNF event. */
        public void service_SL_CNF() {
            if ((eccState == index_End) && (SL_READY.value)) {
                state_START();
                transition_CylinderMaterSlave_5(); 
            }
        }

        /** ALGORITHM Extend IN ST*/
        public void alg_Extend() {
            GoOut.value = true;
            GoIn.value = false;
            READY.value = false;
            System.out.println("ExtendMS!!");
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
        }

        /** ALGORITHM Retract IN ST*/
        public void alg_Retract() {
            GoIn.value = true;
            GoOut.value = false;
            READY.value = false;
            System.out.println("RetractMS!!");
        }

        /** ALGORITHM Home IN ST*/
        public void alg_Home() {
            READY.value = true;
            GoIn.value = false;
            System.out.println("HomeMS!!");
        }

        /** ALGORITHM End IN ST*/
        public void alg_End() {
            READY.value = true;
            GoOut.value = false;
            System.out.println("EndMS!!");
        }

        /** ALGORITHM Wait IN ST*/
        public void alg_Wait() {
            READY.value = true;
            System.out.println("Wait!!!");
        }

        /** ALGORITHM Test IN ST*/
        public void alg_Test() {
            System.out.println("Test");
        }
    }
    private void transition_CylinderMaterSlave_0() {
    }

    private void transition_CylinderMaterSlave_1() {
    }

    private void transition_CylinderMaterSlave_2() {
    }

    private void transition_CylinderMaterSlave_3() {
    }

    private void transition_CylinderMaterSlave_4() {
    }

    private void transition_CylinderMaterSlave_5() {
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK WPMaster
     * @author JHC
     * @version 20150208/JHC
     */
    private class WPMaster extends FBInstance
    {
        /** VAR pp0 */
        public BOOL pp0 = new BOOL();
        /** VAR pp1 */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** VAR LC_READY */
        public BOOL LC_READY = new BOOL();
        /** VAR RC_READY */
        public BOOL RC_READY = new BOOL();
        /** VAR VC_READY */
        public BOOL VC_READY = new BOOL();
        /** VAR Flag */
        public BOOL Flag = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
        /** EVENT LC_CONF */
        public EventServer LC_CONF = new EventInput(this);
        /** EVENT RC_CONF */
        public EventServer RC_CONF = new EventInput(this);
        /** EVENT VC_CONF */
        public EventServer VC_CONF = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Execution Confirmation */
        public EventOutput CNF = new EventOutput();
        /** EVENT LC_Op1 */
        public EventOutput LC_Op1 = new EventOutput();
        /** EVENT LC_Op2 */
        public EventOutput LC_Op2 = new EventOutput();
        /** EVENT RC_Op1 */
        public EventOutput RC_Op1 = new EventOutput();
        /** EVENT RC_Op2 */
        public EventOutput RC_Op2 = new EventOutput();
        /** EVENT VC_Op1 */
        public EventOutput VC_Op1 = new EventOutput();
        /** EVENT VC_Op2 */
        public EventOutput VC_Op2 = new EventOutput();
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
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("pp0".equals(ivName)) connect_pp0((BOOL) newIV);
            else if ("pp1".equals(ivName)) connect_pp1((BOOL) newIV);
            else if ("pp2".equals(ivName)) connect_pp2((BOOL) newIV);
            else if ("pp3".equals(ivName)) connect_pp3((BOOL) newIV);
            else if ("LC_READY".equals(ivName)) connect_LC_READY((BOOL) newIV);
            else if ("RC_READY".equals(ivName)) connect_RC_READY((BOOL) newIV);
            else if ("VC_READY".equals(ivName)) connect_VC_READY((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable pp0
         * @param newIV The variable to connect
         */
        public void connect_pp0(BOOL newIV) {
            pp0 = newIV;
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

        /** Connect the given variable to the input variable LC_READY
         * @param newIV The variable to connect
         */
        public void connect_LC_READY(BOOL newIV) {
            LC_READY = newIV;
        }

        /** Connect the given variable to the input variable RC_READY
         * @param newIV The variable to connect
         */
        public void connect_RC_READY(BOOL newIV) {
            RC_READY = newIV;
        }

        /** Connect the given variable to the input variable VC_READY
         * @param newIV The variable to connect
         */
        public void connect_VC_READY(BOOL newIV) {
            VC_READY = newIV;
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
            state_START();
            transition_WPMaster_0();
        }
        private static final int index_Pick1 = 2;
        private void state_Pick1() {
            eccState = index_Pick1;
            LC_Op1.serviceEvent(this);
        }
        private static final int index_Pick2 = 3;
        private void state_Pick2() {
            eccState = index_Pick2;
            RC_Op1.serviceEvent(this);
        }
        private static final int index_Pick3 = 4;
        private void state_Pick3() {
            eccState = index_Pick3;
            LC_Op1.serviceEvent(this);
            RC_Op1.serviceEvent(this);
        }
        private static final int index_VCDown = 5;
        private void state_VCDown() {
            eccState = index_VCDown;
            VC_Op1.serviceEvent(this);
        }
        private static final int index_VCUp = 6;
        private void state_VCUp() {
            eccState = index_VCUp;
            alg_ChangeFlag();
            VC_Op2.serviceEvent(this);
        }
        private static final int index_CylGoBack = 7;
        private void state_CylGoBack() {
            eccState = index_CylGoBack;
            LC_Op2.serviceEvent(this);
            RC_Op2.serviceEvent(this);
        }
        private static final int index_Temp1 = 8;
        private void state_Temp1() {
            eccState = index_Temp1;
        }
        private static final int index_Temp2 = 9;
        private void state_Temp2() {
            eccState = index_Temp2;
        }
        private static final int index_Temp3 = 10;
        private void state_Temp3() {
            eccState = index_Temp3;
        }
        private static final int index_Temp4 = 11;
        private void state_Temp4() {
            eccState = index_Temp4;
        }

        /** The default constructor. */
        public WPMaster() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == REQ) service_REQ();
            else if (e == LC_CONF) service_LC_CONF();
            else if (e == RC_CONF) service_RC_CONF();
            else if (e == VC_CONF) service_VC_CONF();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_WPMaster_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START) && (pp1.value)) {
                state_Pick1();
                transition_WPMaster_2(); 
            }
            else if ((eccState == index_START) && (pp2.value & !pp1.value)) {
                state_Pick2();
                transition_WPMaster_3(); 
            }
            else if ((eccState == index_START) && (pp3.value & !pp1.value & !pp2.value)) {
                state_Pick3();
                transition_WPMaster_4(); 
            }
        }

        /** Services the LC_CONF event. */
        public void service_LC_CONF() {
            if ((eccState == index_Pick1) && (LC_READY.value)) {
                state_VCDown();
                transition_WPMaster_5(); 
            }
            else if ((eccState == index_Pick3) && (LC_READY.value)) {
                state_Temp1();
                transition_WPMaster_6(); 
            }
            else if ((eccState == index_Temp2) && (LC_READY.value)) {
                state_VCDown();
                transition_WPMaster_7(); 
            }
            else if ((eccState == index_CylGoBack) && (LC_READY.value)) {
                state_Temp3();
                transition_WPMaster_8(); 
            }
            else if ((eccState == index_Temp4) && (LC_READY.value)) {
                state_VCDown();
                transition_WPMaster_9(); 
            }
        }

        /** Services the RC_CONF event. */
        public void service_RC_CONF() {
            if ((eccState == index_Pick2) && (RC_READY.value)) {
                state_VCDown();
                transition_WPMaster_10(); 
            }
            else if ((eccState == index_Pick3) && (RC_READY.value)) {
                state_Temp2();
                transition_WPMaster_11(); 
            }
            else if ((eccState == index_Temp1) && (RC_READY.value)) {
                state_VCDown();
                transition_WPMaster_12(); 
            }
            else if ((eccState == index_CylGoBack) && (RC_READY.value)) {
                state_Temp4();
                transition_WPMaster_13(); 
            }
            else if ((eccState == index_Temp3) && (RC_READY.value)) {
                state_VCDown();
                transition_WPMaster_14(); 
            }
        }

        /** Services the VC_CONF event. */
        public void service_VC_CONF() {
            if ((eccState == index_VCDown) && (VC_READY.value)) {
                state_VCUp();
                transition_WPMaster_15(); 
            }
            else if ((eccState == index_VCUp) && (VC_READY.value & Flag.value)) {
                state_CylGoBack();
                transition_WPMaster_16(); 
            }
            else if ((eccState == index_VCUp) && (VC_READY.value & !Flag.value)) {
                state_START();
                transition_WPMaster_17(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            Flag.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
        }

        /** ALGORITHM ChangeFlag IN ST*/
        public void alg_ChangeFlag() {
            if (Flag.value) {
                Flag.value = false;
            }
            else {
                Flag.value = true;
            }

            System.out.println("ChangeFlag!!" + Flag.value);
        }
    }
    private void transition_WPMaster_0() {
    }

    private void transition_WPMaster_1() {
    }

    private void transition_WPMaster_2() {
    }

    private void transition_WPMaster_3() {
    }

    private void transition_WPMaster_4() {
    }

    private void transition_WPMaster_5() {
    }

    private void transition_WPMaster_6() {
    }

    private void transition_WPMaster_7() {
    }

    private void transition_WPMaster_8() {
    }

    private void transition_WPMaster_9() {
    }

    private void transition_WPMaster_10() {
    }

    private void transition_WPMaster_11() {
    }

    private void transition_WPMaster_12() {
    }

    private void transition_WPMaster_13() {
    }

    private void transition_WPMaster_14() {
    }

    private void transition_WPMaster_15() {
    }

    private void transition_WPMaster_16() {
    }

    private void transition_WPMaster_17() {
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SpringCyl
     * @author JHC
     * @version 20150208/JHC
     */
    private class SpringCyl extends FBInstance
    {
        /** Input event qualifier */
        public BOOL In1 = new BOOL();
        /** VAR In2 */
        public BOOL In2 = new BOOL();
        /** Output event qualifier */
        public BOOL Out1 = new BOOL();
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
            if ("Out1".equals(s)) return Out1;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("In1".equals(ivName)) connect_In1((BOOL) newIV);
            else if ("In2".equals(ivName)) connect_In2((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable In1
         * @param newIV The variable to connect
         */
        public void connect_In1(BOOL newIV) {
            In1 = newIV;
        }

        /** Connect the given variable to the input variable In2
         * @param newIV The variable to connect
         */
        public void connect_In2(BOOL newIV) {
            In2 = newIV;
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
            state_START();
            transition_SpringCyl_0();
        }
        private static final int index_In1 = 2;
        private void state_In1() {
            eccState = index_In1;
            alg_In1();
            CNF.serviceEvent(this);
            state_START();
            transition_SpringCyl_1();
        }
        private static final int index_In2 = 3;
        private void state_In2() {
            eccState = index_In2;
            alg_In2();
            CNF.serviceEvent(this);
            state_START();
            transition_SpringCyl_2();
        }

        /** The default constructor. */
        public SpringCyl() {
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
                transition_SpringCyl_3(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START) && (In1.value)) {
                state_In1();
                transition_SpringCyl_4(); 
            }
            else if ((eccState == index_START) && (In2.value)) {
                state_In2();
                transition_SpringCyl_5(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
        }

        /** ALGORITHM In1 IN ST*/
        public void alg_In1() {
            Out1.value = In1.value;
            System.out.println("In1!!!!");
        }

        /** ALGORITHM In2 IN ST*/
        public void alg_In2() {
            Out1.value = In1.value;
            System.out.println("In2!!!!" + Out1.value);
        }
    }
    private void transition_SpringCyl_0() {
    }

    private void transition_SpringCyl_1() {
    }

    private void transition_SpringCyl_2() {
    }

    private void transition_SpringCyl_3() {
    }

    private void transition_SpringCyl_4() {
    }

    private void transition_SpringCyl_5() {
    }
}