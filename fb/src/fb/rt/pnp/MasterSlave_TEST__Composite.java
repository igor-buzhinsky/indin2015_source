package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class MasterSlave_TEST__Composite {
    private final MasterSlave_TEST instance = new MasterSlave_TEST();

    public void event_INIT(boolean vacuum_, boolean pp0_, boolean pp1_, boolean pp2_, boolean pp3_, boolean cyl1home_, boolean cyl1end_, boolean cyl2home_, boolean cyl2end_, boolean cyl3home_, boolean cyl3mid_, boolean cyl3end_, boolean vcyl1home_, boolean vcyl1end_, boolean vcyl2home_, boolean vcyl2end_, boolean vcyl3home_, boolean vcyl3end_, boolean pp4_) {
        instance.vacuum.value = vacuum_;
        instance.pp0.value = pp0_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.cyl1home.value = cyl1home_;
        instance.cyl1end.value = cyl1end_;
        instance.cyl2home.value = cyl2home_;
        instance.cyl2end.value = cyl2end_;
        instance.cyl3home.value = cyl3home_;
        instance.cyl3mid.value = cyl3mid_;
        instance.cyl3end.value = cyl3end_;
        instance.vcyl1home.value = vcyl1home_;
        instance.vcyl1end.value = vcyl1end_;
        instance.vcyl2home.value = vcyl2home_;
        instance.vcyl2end.value = vcyl2end_;
        instance.vcyl3home.value = vcyl3home_;
        instance.vcyl3end.value = vcyl3end_;
        instance.pp4.value = pp4_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean vacuum_, boolean pp0_, boolean pp1_, boolean pp2_, boolean pp3_, boolean cyl1home_, boolean cyl1end_, boolean cyl2home_, boolean cyl2end_, boolean cyl3home_, boolean cyl3mid_, boolean cyl3end_, boolean vcyl1home_, boolean vcyl1end_, boolean vcyl2home_, boolean vcyl2end_, boolean vcyl3home_, boolean vcyl3end_, boolean pp4_) {
        instance.vacuum.value = vacuum_;
        instance.pp0.value = pp0_;
        instance.pp1.value = pp1_;
        instance.pp2.value = pp2_;
        instance.pp3.value = pp3_;
        instance.cyl1home.value = cyl1home_;
        instance.cyl1end.value = cyl1end_;
        instance.cyl2home.value = cyl2home_;
        instance.cyl2end.value = cyl2end_;
        instance.cyl3home.value = cyl3home_;
        instance.cyl3mid.value = cyl3mid_;
        instance.cyl3end.value = cyl3end_;
        instance.vcyl1home.value = vcyl1home_;
        instance.vcyl1end.value = vcyl1end_;
        instance.vcyl2home.value = vcyl2home_;
        instance.vcyl2end.value = vcyl2end_;
        instance.vcyl3home.value = vcyl3home_;
        instance.vcyl3end.value = vcyl3end_;
        instance.pp4.value = pp4_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK MasterSlave_TEST
     * @author Majid Sorouri
     * @version 20150208/Majid Sorouri
     */
    private class MasterSlave_TEST extends FBInstance
    {
        /** VAR cyl1home */
        public BOOL cyl1home = new BOOL();
        /** VAR cyl1end */
        public BOOL cyl1end = new BOOL();
        /** VAR cyl2home */
        public BOOL cyl2home = new BOOL();
        /** VAR cyl2end */
        public BOOL cyl2end = new BOOL();
        /** VAR cyl3home */
        public BOOL cyl3home = new BOOL();
        /** VAR cyl3mid */
        public BOOL cyl3mid = new BOOL();
        /** VAR cyl3end */
        public BOOL cyl3end = new BOOL();
        /** VAR vcyl1home */
        public BOOL vcyl1home = new BOOL();
        /** VAR vcyl1end */
        public BOOL vcyl1end = new BOOL();
        /** VAR vcyl2home */
        public BOOL vcyl2home = new BOOL();
        /** VAR vcyl2end */
        public BOOL vcyl2end = new BOOL();
        /** VAR vcyl3home */
        public BOOL vcyl3home = new BOOL();
        /** VAR vcyl3end */
        public BOOL vcyl3end = new BOOL();
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
        /** VAR pp4 */
        public BOOL pp4 = new BOOL();
        /** VAR venturi_on */
        public BOOL venturi_on = new BOOL();
        /** VAR venturi_off */
        public BOOL venturi_off = new BOOL();
        /** VAR cyl1MoveOut */
        public BOOL cyl1MoveOut = new BOOL();
        /** VAR cyl1MoveIn */
        public BOOL cyl1MoveIn = new BOOL();
        /** VAR cyl2MoveOut */
        public BOOL cyl2MoveOut = new BOOL();
        /** VAR cyl2MoveIn */
        public BOOL cyl2MoveIn = new BOOL();
        /** VAR cyl3MoveOut */
        public BOOL cyl3MoveOut = new BOOL();
        /** VAR cyl3MoveIn */
        public BOOL cyl3MoveIn = new BOOL();
        /** VAR vcyl1MoveOut */
        public BOOL vcyl1MoveOut = new BOOL();
        /** VAR vcyl1MoveIn */
        public BOOL vcyl1MoveIn = new BOOL();
        /** VAR vcyl2MoveOut */
        public BOOL vcyl2MoveOut = new BOOL();
        /** VAR vcyl2MoveIn */
        public BOOL vcyl2MoveIn = new BOOL();
        /** VAR vcyl3MoveOut */
        public BOOL vcyl3MoveOut = new BOOL();
        /** VAR vcyl3MoveIn */
        public BOOL vcyl3MoveIn = new BOOL();
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
        /** Connect the given variable to the input variable cyl1home
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable cyl1end
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable cyl2home
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable cyl2end
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable cyl3home
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable cyl3mid
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable cyl3end
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vcyl1home
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vcyl1end
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vcyl2home
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vcyl2end
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vcyl3home
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vcyl3end
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vacuum
         * @param newIV The variable to connect
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
        /** Connect the given variable to the input variable pp4
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** FB CYL3spring */
        protected SpringCyl CYL3spring = new SpringCyl() ;
        /** FB CYL1spring */
        protected SpringCyl CYL1spring = new SpringCyl() ;
        /** FB VCYL1spring */
        protected SpringCyl VCYL1spring = new SpringCyl() ;
        /** FB CYL2spring */
        protected SpringCyl CYL2spring = new SpringCyl() ;
        /** FB VCYL2spring */
        protected SpringCyl VCYL2spring = new SpringCyl() ;
        /** FB CYL1 */
        protected SlaveCylinder_TEST CYL1 = new SlaveCylinder_TEST() ;
        /** FB CYL2 */
        protected SlaveCylinder_TEST CYL2 = new SlaveCylinder_TEST() ;
        /** FB CYL3 */
        protected SlaveCylinder_TEST CYL3 = new SlaveCylinder_TEST() ;
        /** FB VCYL1 */
        protected SlaveCylinder_TEST VCYL1 = new SlaveCylinder_TEST() ;
        /** FB VCYL2 */
        protected SlaveCylinder_TEST VCYL2 = new SlaveCylinder_TEST() ;
        /** FB VCYL3 */
        protected SlaveCylinder_TEST VCYL3 = new SlaveCylinder_TEST() ;
        /** FB MASTER */
        protected Master_TEST MASTER = new Master_TEST() ;
        /** The default constructor. */
        public MasterSlave_TEST() {
            super();
            CYL1spring.CNF.connectTo(CNF);
            VCYL1spring.CNF.connectTo(CNF);
            VCYL2spring.CNF.connectTo(CNF);
            CYL2spring.CNF.connectTo(CNF);
            REQ.connectTo(CYL2spring.REQ);
            REQ.connectTo(VCYL2spring.REQ);
            CYL3spring.CNF.connectTo(CNF);
            REQ.connectTo(CYL3spring.REQ);
            REQ.connectTo(CYL3.REQ);
            REQ.connectTo(CYL2.REQ);
            REQ.connectTo(CYL1.REQ);
            CYL1.OrderOutput.connectTo(CYL2.Order);
            CYL2.OrderOutput.connectTo(CYL3.Order);
            CYL2.InitO.connectTo(CYL3.INIT);
            CYL1.InitO.connectTo(CYL2.INIT);
            VCYL1.OrderOutput.connectTo(VCYL2.Order);
            VCYL2.OrderOutput.connectTo(VCYL3.Order);
            VCYL2.InitO.connectTo(VCYL3.INIT);
            VCYL1.InitO.connectTo(VCYL2.INIT);
            REQ.connectTo(VCYL2.REQ);
            REQ.connectTo(VCYL3.REQ);
            REQ.connectTo(VCYL1.REQ);
            REQ.connectTo(VCYL1spring.REQ);
            REQ.connectTo(CYL1spring.REQ);
            CYL3.InitO.connectTo(VCYL1.INIT);
            MASTER.Order.connectTo(CYL1.Order);
            MASTER.Order.connectTo(VCYL1.Order);
            INIT.connectTo(MASTER.INIT);
            REQ.connectTo(MASTER.REQ);
            MASTER.INITO.connectTo(CYL1.INIT);
            VCYL3.InitO.connectTo(INITO);
            cyl1MoveOut = (BOOL) CYL1spring.ovNamedNoException("Out1");
            vcyl1MoveOut = (BOOL) VCYL1spring.ovNamedNoException("Out1");
            cyl2MoveOut = (BOOL) CYL2spring.ovNamedNoException("Out1");
            vcyl2MoveOut = (BOOL) VCYL2spring.ovNamedNoException("Out1");
            vcyl3MoveOut = (BOOL) CYL3spring.ovNamedNoException("Out1");
            CYL1.connectIVNoException("HOME",cyl1home);
            CYL1.connectIVNoException("END",cyl1end);
            CYL2.connectIVNoException("HOME",cyl2home);
            CYL2.connectIVNoException("END",cyl2end);
            CYL3.connectIVNoException("HOME",cyl3home);
            CYL3.connectIVNoException("END",cyl3end);
            VCYL1.connectIVNoException("HOME",vcyl1home);
            VCYL1.connectIVNoException("END",vcyl1end);
            VCYL2.connectIVNoException("HOME",vcyl2home);
            VCYL2.connectIVNoException("END",vcyl2end);
            VCYL3.connectIVNoException("HOME",vcyl3home);
            VCYL3.connectIVNoException("END",vcyl3end);
            CYL2.connectIVNoException("Position",CYL1.ovNamedNoException("PositionOutput"));
            CYL3.connectIVNoException("Position",CYL2.ovNamedNoException("PositionOutput"));
            VCYL2.connectIVNoException("Position",VCYL1.ovNamedNoException("PositionOutput"));
            VCYL3.connectIVNoException("Position",VCYL2.ovNamedNoException("PositionOutput"));
            CYL1spring.connectIVNoException("In1",CYL1.ovNamedNoException("GoOut"));
            CYL1spring.connectIVNoException("In2",CYL1.ovNamedNoException("GoIn"));
            CYL2spring.connectIVNoException("In1",CYL2.ovNamedNoException("GoOut"));
            CYL2spring.connectIVNoException("In2",CYL2.ovNamedNoException("GoIn"));
            VCYL1spring.connectIVNoException("In1",VCYL1.ovNamedNoException("GoOut"));
            VCYL1spring.connectIVNoException("In2",VCYL1.ovNamedNoException("GoIn"));
            VCYL2spring.connectIVNoException("In1",VCYL2.ovNamedNoException("GoOut"));
            VCYL2spring.connectIVNoException("In2",VCYL2.ovNamedNoException("GoIn"));
            CYL3spring.connectIVNoException("In1",VCYL3.ovNamedNoException("GoOut"));
            CYL3spring.connectIVNoException("In2",VCYL3.ovNamedNoException("GoIn"));
            CYL1.connectIVNoException("DONE",CYL2.ovNamedNoException("READY"));
            CYL2.connectIVNoException("DONE",CYL3.ovNamedNoException("READY"));
            VCYL2.connectIVNoException("DONE",VCYL3.ovNamedNoException("READY"));
            VCYL1.connectIVNoException("DONE",VCYL2.ovNamedNoException("READY"));
            cyl3MoveOut = (BOOL) CYL3.ovNamedNoException("GoOut");
            cyl3MoveIn = (BOOL) CYL3.ovNamedNoException("GoIn");
            CYL1.connectIVNoException("Position",MASTER.ovNamedNoException("X_ORDER"));
            VCYL1.connectIVNoException("Position",MASTER.ovNamedNoException("Y_ORDER"));
            MASTER.connectIVNoException("Y_POS",VCYL3.ovNamedNoException("PositionOutput"));
            MASTER.connectIVNoException("X_POS",CYL3.ovNamedNoException("PositionOutput"));
            MASTER.connectIVNoException("Y_READY",VCYL1.ovNamedNoException("READY"));
            MASTER.connectIVNoException("X_READY",CYL1.ovNamedNoException("READY"));
            MASTER.connectIVNoException("pp0",pp0);
            MASTER.connectIVNoException("pp1",pp1);
            MASTER.connectIVNoException("pp2",pp2);
            MASTER.connectIVNoException("pp3",pp3);
            MASTER.connectIVNoException("pp4",pp4);
            venturi_on = (BOOL) MASTER.ovNamedNoException("Vacuum_ORDER");
            venturi_off = (BOOL) MASTER.ovNamedNoException("Vacuum_nORDER");
            CYL3.connectIVNoException("MID",cyl3mid);
            CYL1.Size.initializeNoException("1");
            CYL2.Size.initializeNoException("1");
            CYL3.Size.initializeNoException("2");
            CYL3.DONE.initializeNoException("1");
            VCYL1.Size.initializeNoException("1");
            VCYL2.Size.initializeNoException("1");
            VCYL3.Size.initializeNoException("1");
            VCYL3.DONE.initializeNoException("1");
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
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
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SlaveCylinder_TEST
     * @author JHC
     * @version 20150208/JHC
     */
    private class SlaveCylinder_TEST extends FBInstance
    {
        /** Input event qualifier */
        public BOOL HOME = new BOOL();
        /** Input event qualifier */
        public BOOL MID = new BOOL();
        /** Input event qualifier */
        public BOOL END = new BOOL();
        /** VAR Position */
        public REAL Position = new REAL();
        /** VAR Size */
        public REAL Size = new REAL();
        /** VAR DONE */
        public BOOL DONE = new BOOL();
        /** Output event qualifier */
        public BOOL READY = new BOOL();
        /** Output event qualifier */
        public BOOL GoOut = new BOOL();
        /** Output event qualifier */
        public BOOL GoIn = new BOOL();
        /** VAR PositionOutput */
        public REAL PositionOutput = new REAL();
        /** VAR init */
        public BOOL init = new BOOL();
        /** VAR extended */
        public BOOL extended = new BOOL();
        /** VAR GoCenter */
        public BOOL GoCenter = new BOOL();
        /** VAR PositionO */
        public REAL PositionO = new REAL();
        /** EVENT INIT */
        public EventServer INIT = new EventInput(this);
        /** EVENT Order */
        public EventServer Order = new EventInput(this);
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
        /** EVENT InitO */
        public EventOutput InitO = new EventOutput();
        /** EVENT OrderOutput */
        public EventOutput OrderOutput = new EventOutput();
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
            if ("PositionOutput".equals(s)) return PositionOutput;
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
            else if ("Position".equals(ivName)) connect_Position((REAL) newIV);
            else if ("Size".equals(ivName)) connect_Size((REAL) newIV);
            else if ("DONE".equals(ivName)) connect_DONE((BOOL) newIV);
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

        /** Connect the given variable to the input variable Position
         * @param newIV The variable to connect
         */
        public void connect_Position(REAL newIV) {
            Position = newIV;
        }

        /** Connect the given variable to the input variable Size
         * @param newIV The variable to connect
         */
        public void connect_Size(REAL newIV) {
            Size = newIV;
        }

        /** Connect the given variable to the input variable DONE
         * @param newIV The variable to connect
         */
        public void connect_DONE(BOOL newIV) {
            DONE = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_ORDER = 1;
        private void state_ORDER() {
            eccState = index_ORDER;
            alg_Order();
            OrderOutput.serviceEvent(this);
            CNF.serviceEvent(this);
            state_START();
            transition_SlaveCylinder_TEST_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_Req();
            CNF.serviceEvent(this);
            state_START();
            transition_SlaveCylinder_TEST_1();
        }
        private static final int index_INIT = 3;
        private void state_INIT() {
            eccState = index_INIT;
            alg_Init();
            InitO.serviceEvent(this);
            state_START();
            transition_SlaveCylinder_TEST_2();
        }

        /** The default constructor. */
        public SlaveCylinder_TEST() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == Order) service_Order();
            else if (e == REQ) service_REQ();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_SlaveCylinder_TEST_3(); 
            }
        }

        /** Services the Order event. */
        public void service_Order() {
            if ((eccState == index_START)) {
                state_ORDER();
                transition_SlaveCylinder_TEST_4(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_SlaveCylinder_TEST_5(); 
            }
        }

        /** ALGORITHM Init IN Java*/
        public void alg_Init() {
            if (!init.value) {
                init.value = true;
                GoOut.value = false;
                GoIn.value = false;
                GoCenter.value = false;
                READY.value = true;
                extended.value = false;
            }
            System.out.println("initcyl!!!");

        }

        /** ALGORITHM Order IN Java*/
        public void alg_Order() {
            READY.value = false;
            GoOut.value = false;
            GoCenter.value = false;
            GoIn.value = false;

            if (Position.value >= Size.value) {
                GoOut.value = true;
                PositionO.value = Position.value - Size.value;
            } else {
                if (Position.value == 1 && Size.value == 2) {
                    GoCenter.value = true;
                    GoIn.value = true;
                    PositionO.value = Position.value - 1;
                } else {
                    GoIn.value = true;
                    PositionO.value = Position.value;
                }

            }





            PositionOutput.value = PositionO.value;

        }

        /** ALGORITHM Req IN Java*/
        public void alg_Req() {
            if (HOME.value && GoIn.value) {
                GoOut.value = false;
                GoIn.value = false;
                extended.value = false;
            }

            if (END.value && GoOut.value) {
                GoOut.value = false;
                GoIn.value = false;
                extended.value = true;
            }

            if (END.value && GoCenter.value) {
                GoOut.value = false;
                GoIn.value = true;
                extended.value = false;
            }
            if (HOME.value && GoCenter.value) {
                GoOut.value = true;
                GoIn.value = false;
                extended.value = false;
            }
            if (MID.value && GoCenter.value) {
                GoOut.value = false;
                GoIn.value = false;
                extended.value = false;
            }

            if (!GoOut.value && !GoIn.value && DONE.value) {
                READY.value = true;
            }
            if (Size.value == 2 && MID.value) {
                System.out.println("Req:" + MID.value);
            }

        }
    }
    private void transition_SlaveCylinder_TEST_0() {
    }

    private void transition_SlaveCylinder_TEST_1() {
    }

    private void transition_SlaveCylinder_TEST_2() {
    }

    private void transition_SlaveCylinder_TEST_3() {
    }

    private void transition_SlaveCylinder_TEST_4() {
    }

    private void transition_SlaveCylinder_TEST_5() {
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK Master_TEST
     * @author JHC
     * @version 20150208/JHC
     */
    private class Master_TEST extends FBInstance
    {
        /** VAR pp0 */
        public BOOL pp0 = new BOOL();
        /** VAR pp1 */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** VAR pp4 */
        public BOOL pp4 = new BOOL();
        /** VAR X_READY */
        public BOOL X_READY = new BOOL();
        /** VAR Y_READY */
        public BOOL Y_READY = new BOOL();
        /** VAR X_POS */
        public REAL X_POS = new REAL();
        /** VAR Y_POS */
        public REAL Y_POS = new REAL();
        /** VAR X_ORDER */
        public REAL X_ORDER = new REAL();
        /** VAR Y_ORDER */
        public REAL Y_ORDER = new REAL();
        /** VAR Vacuum_ORDER */
        public BOOL Vacuum_ORDER = new BOOL();
        /** VAR Vacuum_nORDER */
        public BOOL Vacuum_nORDER = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Execution Confirmation */
        public EventOutput CNF = new EventOutput();
        /** EVENT Order */
        public EventOutput Order = new EventOutput();
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
            if ("X_ORDER".equals(s)) return X_ORDER;
            if ("Y_ORDER".equals(s)) return Y_ORDER;
            if ("Vacuum_ORDER".equals(s)) return Vacuum_ORDER;
            if ("Vacuum_nORDER".equals(s)) return Vacuum_nORDER;
            return super.ovNamed(s);}

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
            else if ("pp4".equals(ivName)) connect_pp4((BOOL) newIV);
            else if ("X_READY".equals(ivName)) connect_X_READY((BOOL) newIV);
            else if ("Y_READY".equals(ivName)) connect_Y_READY((BOOL) newIV);
            else if ("X_POS".equals(ivName)) connect_X_POS((REAL) newIV);
            else if ("Y_POS".equals(ivName)) connect_Y_POS((REAL) newIV);
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

        /** Connect the given variable to the input variable pp4
         * @param newIV The variable to connect
         */
        public void connect_pp4(BOOL newIV) {
            pp4 = newIV;
        }

        /** Connect the given variable to the input variable X_READY
         * @param newIV The variable to connect
         */
        public void connect_X_READY(BOOL newIV) {
            X_READY = newIV;
        }

        /** Connect the given variable to the input variable Y_READY
         * @param newIV The variable to connect
         */
        public void connect_Y_READY(BOOL newIV) {
            Y_READY = newIV;
        }

        /** Connect the given variable to the input variable X_POS
         * @param newIV The variable to connect
         */
        public void connect_X_POS(REAL newIV) {
            X_POS = newIV;
        }

        /** Connect the given variable to the input variable Y_POS
         * @param newIV The variable to connect
         */
        public void connect_Y_POS(REAL newIV) {
            Y_POS = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_Pick3_3 = 1;
        private void state_Pick3_3() {
            eccState = index_Pick3_3;
            alg_Go_4_0();
            alg_Vacuum_On();
            Order.serviceEvent(this);
        }
        private static final int index_Pick3_1 = 2;
        private void state_Pick3_1() {
            eccState = index_Pick3_1;
            alg_Go_4_0();
            Order.serviceEvent(this);
        }
        private static final int index_Pick3_2 = 3;
        private void state_Pick3_2() {
            eccState = index_Pick3_2;
            alg_Go_4_2();
            Order.serviceEvent(this);
        }
        private static final int index_Pick2_3 = 4;
        private void state_Pick2_3() {
            eccState = index_Pick2_3;
            alg_Go_3_0();
            alg_Vacuum_On();
            Order.serviceEvent(this);
        }
        private static final int index_Pick2_1 = 5;
        private void state_Pick2_1() {
            eccState = index_Pick2_1;
            alg_Go_3_0();
            Order.serviceEvent(this);
        }
        private static final int index_Pick2_2 = 6;
        private void state_Pick2_2() {
            eccState = index_Pick2_2;
            alg_Go_3_3();
            Order.serviceEvent(this);
        }
        private static final int index_Pick1_3 = 7;
        private void state_Pick1_3() {
            eccState = index_Pick1_3;
            alg_Go_2_0();
            alg_Vacuum_On();
            Order.serviceEvent(this);
        }
        private static final int index_Pick1_1 = 8;
        private void state_Pick1_1() {
            eccState = index_Pick1_1;
            alg_Go_2_0();
            Order.serviceEvent(this);
        }
        private static final int index_Pick1_2 = 9;
        private void state_Pick1_2() {
            eccState = index_Pick1_2;
            alg_Go_2_1();
            Order.serviceEvent(this);
        }
        private static final int index_Deposit_1 = 10;
        private void state_Deposit_1() {
            eccState = index_Deposit_1;
            alg_Go_1_0();
            Order.serviceEvent(this);
        }
        private static final int index_Deposit_2 = 11;
        private void state_Deposit_2() {
            eccState = index_Deposit_2;
            alg_Go_1_1();
            Order.serviceEvent(this);
        }
        private static final int index_Deposit_3 = 12;
        private void state_Deposit_3() {
            eccState = index_Deposit_3;
            alg_Go_1_0();
            alg_Vacuum_Off();
            Order.serviceEvent(this);
        }
        private static final int index_Go_sleep = 13;
        private void state_Go_sleep() {
            eccState = index_Go_sleep;
            alg_Go_0_0();
            Order.serviceEvent(this);
        }
        private static final int index_Init = 14;
        private void state_Init() {
            eccState = index_Init;
            INITO.serviceEvent(this);
            state_START();
            transition_Master_TEST_0();
        }

        /** The default constructor. */
        public Master_TEST() {
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
                state_Init();
                transition_Master_TEST_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START) && (pp1.value)) {
                state_Pick1_1();
                transition_Master_TEST_2(); 
            }
            else if ((eccState == index_Pick1_1) && (X_READY.value & Y_READY.value)) {
                state_Pick1_2();
                transition_Master_TEST_3(); 
            }
            else if ((eccState == index_Pick1_2) && (X_READY.value & Y_READY.value)) {
                state_Pick1_3();
                transition_Master_TEST_4(); 
            }
            else if ((eccState == index_Pick1_3) && (X_READY.value & Y_READY.value)) {
                state_Deposit_1();
                transition_Master_TEST_5(); 
            }
            else if ((eccState == index_Deposit_1) && (X_READY.value & Y_READY.value)) {
                state_Deposit_2();
                transition_Master_TEST_6(); 
            }
            else if ((eccState == index_Deposit_2) && (X_READY.value & Y_READY.value)) {
                state_Deposit_3();
                transition_Master_TEST_7(); 
            }
            else if ((eccState == index_Deposit_3) && (X_READY.value & Y_READY.value)) {
                state_START();
                transition_Master_TEST_8(); 
            }
            else if ((eccState == index_START) && (pp2.value & !pp1.value)) {
                state_Pick2_1();
                transition_Master_TEST_9(); 
            }
            else if ((eccState == index_START) && (pp3.value & !pp2.value & !pp1.value)) {
                state_Pick3_1();
                transition_Master_TEST_10(); 
            }
            else if ((eccState == index_Pick2_1) && (X_READY.value & Y_READY.value)) {
                state_Pick2_2();
                transition_Master_TEST_11(); 
            }
            else if ((eccState == index_Pick2_2) && (X_READY.value & Y_READY.value)) {
                state_Pick2_3();
                transition_Master_TEST_12(); 
            }
            else if ((eccState == index_Pick3_1) && (X_READY.value & Y_READY.value)) {
                state_Pick3_2();
                transition_Master_TEST_13(); 
            }
            else if ((eccState == index_Pick3_2) && (X_READY.value & Y_READY.value)) {
                state_Pick3_3();
                transition_Master_TEST_14(); 
            }
            else if ((eccState == index_Pick3_3) && (X_READY.value & Y_READY.value)) {
                state_Deposit_1();
                transition_Master_TEST_15(); 
            }
            else if ((eccState == index_Pick2_3) && (X_READY.value & Y_READY.value)) {
                state_Deposit_1();
                transition_Master_TEST_16(); 
            }
            else if ((eccState == index_Go_sleep) && (X_READY.value & Y_READY.value)) {
                state_START();
                transition_Master_TEST_17(); 
            }
            else if ((eccState == index_START) && (!pp1.value & !pp2.value & !pp3.value)) {
                state_Go_sleep();
                transition_Master_TEST_18(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            System.out.println("init!!!");

        }

        /** ALGORITHM Vacuum_On IN Java*/
        public void alg_Vacuum_On() {
            Vacuum_ORDER.value = true;
            Vacuum_nORDER.value = false;

        }

        /** ALGORITHM Vacuum_Off IN Java*/
        public void alg_Vacuum_Off() {
            Vacuum_ORDER.value = false;
            Vacuum_nORDER.value = true;

        }

        /** ALGORITHM Go_0_0 IN Java*/
        public void alg_Go_0_0() {
            X_ORDER.value = 0;
            Y_ORDER.value = 0;

        }

        /** ALGORITHM Go_1_0 IN Java*/
        public void alg_Go_1_0() {
            X_ORDER.value = 1;
            Y_ORDER.value = 0;

        }

        /** ALGORITHM Go_2_0 IN Java*/
        public void alg_Go_2_0() {
            X_ORDER.value = 2;
            Y_ORDER.value = 0;

        }

        /** ALGORITHM Go_3_0 IN Java*/
        public void alg_Go_3_0() {
            X_ORDER.value = 3;
            Y_ORDER.value = 0;

        }

        /** ALGORITHM Go_4_0 IN Java*/
        public void alg_Go_4_0() {
            X_ORDER.value = 4;
            Y_ORDER.value = 0;

        }

        /** ALGORITHM Go_1_1 IN Java*/
        public void alg_Go_1_1() {
            X_ORDER.value = 1;
            Y_ORDER.value = 1;

        }

        /** ALGORITHM Go_2_1 IN Java*/
        public void alg_Go_2_1() {
            X_ORDER.value = 2;
            Y_ORDER.value = 1;

        }

        /** ALGORITHM Go_3_3 IN Java*/
        public void alg_Go_3_3() {
            X_ORDER.value = 3;
            Y_ORDER.value = 3;

        }

        /** ALGORITHM Go_4_2 IN Java*/
        public void alg_Go_4_2() {
            X_ORDER.value = 4;
            Y_ORDER.value = 2;

        }
    }
    private void transition_Master_TEST_0() {
    }

    private void transition_Master_TEST_1() {
    }

    private void transition_Master_TEST_2() {
    }

    private void transition_Master_TEST_3() {
    }

    private void transition_Master_TEST_4() {
    }

    private void transition_Master_TEST_5() {
    }

    private void transition_Master_TEST_6() {
    }

    private void transition_Master_TEST_7() {
    }

    private void transition_Master_TEST_8() {
    }

    private void transition_Master_TEST_9() {
    }

    private void transition_Master_TEST_10() {
    }

    private void transition_Master_TEST_11() {
    }

    private void transition_Master_TEST_12() {
    }

    private void transition_Master_TEST_13() {
    }

    private void transition_Master_TEST_14() {
    }

    private void transition_Master_TEST_15() {
    }

    private void transition_Master_TEST_16() {
    }

    private void transition_Master_TEST_17() {
    }

    private void transition_Master_TEST_18() {
    }
}