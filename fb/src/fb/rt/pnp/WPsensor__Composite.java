package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class WPsensor__Composite {
    private final WPsensor instance = new WPsensor();

    public void event_INIT(int WP1_X_, int WP1_Y_, int WP2_X_, int WP2_Y_, int WP3_Y_, int WP3_X_) {
        instance.WP1_X.value = Math.abs(WP1_X_);
        instance.WP1_Y.value = Math.abs(WP1_Y_);
        instance.WP2_X.value = Math.abs(WP2_X_);
        instance.WP2_Y.value = Math.abs(WP2_Y_);
        instance.WP3_Y.value = Math.abs(WP3_Y_);
        instance.WP3_X.value = Math.abs(WP3_X_);
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(int WP1_Y_, int WP1_X_, int WP2_X_, int WP2_Y_, int WP3_X_, int WP3_Y_) {
        instance.WP1_Y.value = Math.abs(WP1_Y_);
        instance.WP1_X.value = Math.abs(WP1_X_);
        instance.WP2_X.value = Math.abs(WP2_X_);
        instance.WP2_Y.value = Math.abs(WP2_Y_);
        instance.WP3_X.value = Math.abs(WP3_X_);
        instance.WP3_Y.value = Math.abs(WP3_Y_);
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK WPsensor
     * @author JHC
     * @version 20150208/JHC
     */
    private class WPsensor extends FBInstance
    {
        /** VAR WP1_X */
        public UINT WP1_X = new UINT();
        /** VAR WP1_Y */
        public UINT WP1_Y = new UINT();
        /** VAR WP2_X */
        public UINT WP2_X = new UINT();
        /** VAR WP2_Y */
        public UINT WP2_Y = new UINT();
        /** VAR WP3_X */
        public UINT WP3_X = new UINT();
        /** VAR WP3_Y */
        public UINT WP3_Y = new UINT();
        /** VAR wp12 */
        public BOOL wp12 = new BOOL();
        /** VAR wp13 */
        public BOOL wp13 = new BOOL();
        /** VAR wp14 */
        public BOOL wp14 = new BOOL();
        /** VAR wp11 */
        public BOOL wp11 = new BOOL();
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
        /** Connect the given variable to the input variable WP1_X
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable WP1_Y
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable WP2_X
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable WP2_Y
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable WP3_X
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable WP3_Y
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** FB WP1 */
        protected my_sensor2 WP1 = new my_sensor2() ;
        /** FB WP2 */
        protected my_sensor2 WP2 = new my_sensor2() ;
        /** FB WP3 */
        protected my_sensor2 WP3 = new my_sensor2() ;
        /** FB WP01 */
        protected my_sensor2 WP01 = new my_sensor2() ;
        /** FB WP02 */
        protected my_sensor2 WP02 = new my_sensor2() ;
        /** FB WP03 */
        protected my_sensor2 WP03 = new my_sensor2() ;
        /** FB WP0 */
        protected OR WP0 = new OR() ;
        /** The default constructor. */
        public WPsensor() {
            super();
            INIT.connectTo(WP1.INIT);
            REQ.connectTo(WP1.REQ);
            REQ.connectTo(WP2.REQ);
            REQ.connectTo(WP3.REQ);
            WP1.INITO.connectTo(WP2.INIT);
            WP2.INITO.connectTo(WP3.INIT);
            WP1.CNF.connectTo(CNF);
            WP2.CNF.connectTo(CNF);
            WP3.CNF.connectTo(CNF);
            REQ.connectTo(WP01.REQ);
            WP01.INITO.connectTo(WP02.INIT);
            WP02.INITO.connectTo(WP03.INIT);
            REQ.connectTo(WP02.REQ);
            REQ.connectTo(WP03.REQ);
            WP03.INITO.connectTo(WP0.INIT);
            WP03.CNF.connectTo(WP0.REQ);
            WP02.CNF.connectTo(WP0.REQ);
            WP01.CNF.connectTo(WP0.REQ);
            WP0.CNF.connectTo(CNF);
            WP0.INITO.connectTo(INITO);
            WP3.INITO.connectTo(WP01.INIT);
            wp12 = (BOOL) WP1.ovNamedNoException("QO");
            wp13 = (BOOL) WP2.ovNamedNoException("QO");
            wp14 = (BOOL) WP3.ovNamedNoException("QO");
            WP1.connectIVNoException("In1",WP1_X);
            WP1.connectIVNoException("In2",WP1_Y);
            WP2.connectIVNoException("In1",WP2_X);
            WP2.connectIVNoException("In2",WP2_Y);
            WP3.connectIVNoException("In1",WP3_X);
            WP3.connectIVNoException("In2",WP3_Y);
            WP01.connectIVNoException("In1",WP1_X);
            WP01.connectIVNoException("In2",WP1_Y);
            WP02.connectIVNoException("In1",WP2_X);
            WP02.connectIVNoException("In2",WP2_Y);
            WP03.connectIVNoException("In1",WP3_X);
            WP03.connectIVNoException("In2",WP3_Y);
            WP0.connectIVNoException("i3",WP03.ovNamedNoException("QO"));
            WP0.connectIVNoException("i2",WP02.ovNamedNoException("QO"));
            WP0.connectIVNoException("i1",WP01.ovNamedNoException("QO"));
            wp11 = (BOOL) WP0.ovNamedNoException("o");
            WP1.zone1.initializeNoException("[370,380]");
            WP1.zone2.initializeNoException("[210,220]");
            WP2.zone1.initializeNoException("[445,455]");
            WP2.zone2.initializeNoException("[210,220]");
            WP3.zone1.initializeNoException("[520,530]");
            WP3.zone2.initializeNoException("[210,220]");
            WP01.zone2.initializeNoException("[210,225]");
            WP01.zone1.initializeNoException("[295,305]");
            WP02.zone2.initializeNoException("[210,225]");
            WP02.zone1.initializeNoException("[295,305]");
            WP03.zone2.initializeNoException("[210,225]");
            WP03.zone1.initializeNoException("[295,305]");
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK my_sensor2
     * @author JHC
     * @version 20150208/JHC
     */
    private class my_sensor2 extends FBInstance
    {
        /** VAR In1 */
        public UINT In1 = new UINT();
        /** VAR zone1 */
        public ARRAY zone1 = new ARRAY(new UINT(),2);
        /** VAR In2 */
        public UINT In2 = new UINT();
        /** VAR zone2 */
        public ARRAY zone2 = new ARRAY(new UINT(),2);
        /** Output event qualifier */
        public BOOL QO = new BOOL();
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("QO".equals(s)) return QO;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("In1".equals(ivName)) connect_In1((UINT) newIV);
            else if ("zone1".equals(ivName)) connect_zone1((ARRAY) newIV);
            else if ("In2".equals(ivName)) connect_In2((UINT) newIV);
            else if ("zone2".equals(ivName)) connect_zone2((ARRAY) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable In1
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_In1(UINT newIV) throws FBRManagementException {
            In1 = newIV;
            S1.connectIVNoException("POS",In1);
        }

        /** Connect the given variable to the input variable zone1
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_zone1(ARRAY newIV) throws FBRManagementException {
            zone1 = newIV;
            S1.connectIVNoException("ZONE",zone1);
        }

        /** Connect the given variable to the input variable In2
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_In2(UINT newIV) throws FBRManagementException {
            In2 = newIV;
            S2.connectIVNoException("POS",In2);
        }

        /** Connect the given variable to the input variable zone2
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_zone2(ARRAY newIV) throws FBRManagementException {
            zone2 = newIV;
            S2.connectIVNoException("ZONE",zone2);
        }
        /** FB S1 */
        protected my_sensor S1 = new my_sensor() ;
        /** FB S2 */
        protected my_sensor S2 = new my_sensor() ;
        /** FB and */
        protected AND and = new AND() ;
        /** The default constructor. */
        public my_sensor2() {
            super();
            INIT.connectTo(S1.INIT);
            S1.INITO.connectTo(S2.INIT);
            REQ.connectTo(S1.REQ);
            S2.INITO.connectTo(and.INIT);
            S1.CNF.connectTo(and.REQ);
            S2.CNF.connectTo(and.REQ);
            and.INITO.connectTo(INITO);
            and.CNF.connectTo(CNF);
            REQ.connectTo(S2.REQ);
            S1.connectIVNoException("POS",In1);
            S1.connectIVNoException("ZONE",zone1);
            S2.connectIVNoException("POS",In2);
            S2.connectIVNoException("ZONE",zone2);
            and.connectIVNoException("Q1",S1.ovNamedNoException("VALUE"));
            and.connectIVNoException("Q2",S2.ovNamedNoException("VALUE"));
            QO = (BOOL) and.ovNamedNoException("Q0");
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK my_sensor
     * @author JHC
     * @version 20150208/JHC
     */
    private class my_sensor extends FBInstance
    {
        /** Input event qualifier */
        public UINT POS = new UINT();
        /** VAR ZONE */
        public ARRAY ZONE = new ARRAY(new UINT(),2);
        /** Output event qualifier */
        public BOOL VALUE = new BOOL();
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
            if ("VALUE".equals(s)) return VALUE;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("POS".equals(ivName)) connect_POS((UINT) newIV);
            else if ("ZONE".equals(ivName)) connect_ZONE((ARRAY) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable POS
         * @param newIV The variable to connect
         */
        public void connect_POS(UINT newIV) {
            POS = newIV;
        }

        /** Connect the given variable to the input variable ZONE
         * @param newIV The variable to connect
         */
        public void connect_ZONE(ARRAY newIV) {
            ZONE = newIV;
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
            transition_my_sensor_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_my_sensor_1();
        }

        /** The default constructor. */
        public my_sensor() {
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
                transition_my_sensor_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_my_sensor_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            VALUE.value = false;
        }

        /** ALGORITHM REQ IN Java*/
        public void alg_REQ() {
            if ((POS.value >= ((UINT) ZONE.value[0]).value) & (POS.value <= ((UINT) ZONE.value[1]).value)) {
                VALUE.value = true;
                //System.out.println("Sensor True " + POS.value);
            }
            else {
                VALUE.value = false;
            }

        }
    }
    private void transition_my_sensor_0() {
    }

    private void transition_my_sensor_1() {
    }

    private void transition_my_sensor_2() {
    }

    private void transition_my_sensor_3() {
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK AND
     * @author JHC
     * @version 20150208/JHC
     */
    private class AND extends FBInstance
    {
        /** Input event qualifier */
        public BOOL Q1 = new BOOL();
        /** VAR Q2 */
        public BOOL Q2 = new BOOL();
        /** Output event qualifier */
        public BOOL Q0 = new BOOL();
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
            if ("Q0".equals(s)) return Q0;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("Q1".equals(ivName)) connect_Q1((BOOL) newIV);
            else if ("Q2".equals(ivName)) connect_Q2((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable Q1
         * @param newIV The variable to connect
         */
        public void connect_Q1(BOOL newIV) {
            Q1 = newIV;
        }

        /** Connect the given variable to the input variable Q2
         * @param newIV The variable to connect
         */
        public void connect_Q2(BOOL newIV) {
            Q2 = newIV;
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
            transition_AND_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_AND_1();
        }

        /** The default constructor. */
        public AND() {
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
                transition_AND_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_AND_3(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            Q0.value = Q1.value & Q2.value;

        }

        /** ALGORITHM REQ IN Java*/
        public void alg_REQ() {
            Q0.value = Q1.value & Q2.value;

        }
    }
    private void transition_AND_0() {
    }

    private void transition_AND_1() {
    }

    private void transition_AND_2() {
    }

    private void transition_AND_3() {
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK OR
     * @author JHC
     * @version 20150208/JHC
     */
    private class OR extends FBInstance
    {
        /** Input event qualifier */
        public BOOL i1 = new BOOL();
        /** VAR i2 */
        public BOOL i2 = new BOOL();
        /** VAR i3 */
        public BOOL i3 = new BOOL();
        /** Output event qualifier */
        public BOOL o = new BOOL();
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
            if ("o".equals(s)) return o;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("i1".equals(ivName)) connect_i1((BOOL) newIV);
            else if ("i2".equals(ivName)) connect_i2((BOOL) newIV);
            else if ("i3".equals(ivName)) connect_i3((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable i1
         * @param newIV The variable to connect
         */
        public void connect_i1(BOOL newIV) {
            i1 = newIV;
        }

        /** Connect the given variable to the input variable i2
         * @param newIV The variable to connect
         */
        public void connect_i2(BOOL newIV) {
            i2 = newIV;
        }

        /** Connect the given variable to the input variable i3
         * @param newIV The variable to connect
         */
        public void connect_i3(BOOL newIV) {
            i3 = newIV;
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
            transition_OR_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_OR_1();
        }

        /** The default constructor. */
        public OR() {
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
                transition_OR_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_OR_3(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            o.value = i1.value | i2.value | i3.value;

        }

        /** ALGORITHM REQ IN Java*/
        public void alg_REQ() {
            o.value = i1.value | i2.value | i3.value;

        }
    }
    private void transition_OR_0() {
    }

    private void transition_OR_1() {
    }

    private void transition_OR_2() {
    }

    private void transition_OR_3() {
    }
}