package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class my_sensor__Basic {
    private final my_sensor instance = new my_sensor();

    public void event_INIT(int POS_, int ZONE_0, int ZONE_1) {
        instance.POS.value = Math.abs(POS_);
        ((UINT) instance.ZONE.value[0]).value = Math.abs(ZONE_0);
        ((UINT) instance.ZONE.value[1]).value = Math.abs(ZONE_1);
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(int POS_, int ZONE_0, int ZONE_1) {
        instance.POS.value = Math.abs(POS_);
        ((UINT) instance.ZONE.value[0]).value = Math.abs(ZONE_0);
        ((UINT) instance.ZONE.value[1]).value = Math.abs(ZONE_1);
        instance.REQ.serviceEvent(instance); 
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
        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Connect the given variable to the input variable POS
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable ZONE
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
}