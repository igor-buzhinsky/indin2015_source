package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class my_sensor2__Composite {
    private final my_sensor2 instance = new my_sensor2();

    public void event_INIT(int In1_, int zone1_0, int zone1_1, int In2_, int zone2_0, int zone2_1) {
        instance.In1.value = Math.abs(In1_);
        ((UINT) instance.zone1.value[0]).value = Math.abs(zone1_0);
        ((UINT) instance.zone1.value[1]).value = Math.abs(zone1_1);
        instance.In2.value = Math.abs(In2_);
        ((UINT) instance.zone2.value[0]).value = Math.abs(zone2_0);
        ((UINT) instance.zone2.value[1]).value = Math.abs(zone2_1);
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(int In1_, int zone1_0, int zone1_1, int In2_, int zone2_0, int zone2_1) {
        instance.In1.value = Math.abs(In1_);
        ((UINT) instance.zone1.value[0]).value = Math.abs(zone1_0);
        ((UINT) instance.zone1.value[1]).value = Math.abs(zone1_1);
        instance.In2.value = Math.abs(In2_);
        ((UINT) instance.zone2.value[0]).value = Math.abs(zone2_0);
        ((UINT) instance.zone2.value[1]).value = Math.abs(zone2_1);
        instance.REQ.serviceEvent(instance); 
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
        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Connect the given variable to the input variable In1
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable zone1
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable In2
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable zone2
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
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
}