package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class FB_TankControl__Basic {
    private final FB_TankControl instance = new FB_TankControl();

    public void event_INIT(boolean TempSensorIsConfigured_, boolean TempSensorHHAlarm_, boolean TempSensorHealthy_, boolean PressureSensorIsConfigured_, boolean PressureSensorHHAlarm_, boolean PressureSensorHealthy_, boolean WaterLevelSensorHighIsConfigured_, boolean WaterLevelSensorHHAlarm_, boolean WaterLevelSensorHighHealthy_, boolean WaterLevelSensorOverflowIsConfigured_, boolean WaterLevelSensorOverflowAlarm_, boolean WaterLevelSensorOverflowHealthy_, boolean WaterLevelSensorLowIsConfigured_, boolean WaterLevelSensorLLAlarm_, boolean WaterLevelSensorLowHealthy_) {
        instance.TempSensorIsConfigured.value = TempSensorIsConfigured_;
        instance.TempSensorHHAlarm.value = TempSensorHHAlarm_;
        instance.TempSensorHealthy.value = TempSensorHealthy_;
        instance.PressureSensorIsConfigured.value = PressureSensorIsConfigured_;
        instance.PressureSensorHHAlarm.value = PressureSensorHHAlarm_;
        instance.PressureSensorHealthy.value = PressureSensorHealthy_;
        instance.WaterLevelSensorHighIsConfigured.value = WaterLevelSensorHighIsConfigured_;
        instance.WaterLevelSensorHHAlarm.value = WaterLevelSensorHHAlarm_;
        instance.WaterLevelSensorHighHealthy.value = WaterLevelSensorHighHealthy_;
        instance.WaterLevelSensorOverflowIsConfigured.value = WaterLevelSensorOverflowIsConfigured_;
        instance.WaterLevelSensorOverflowAlarm.value = WaterLevelSensorOverflowAlarm_;
        instance.WaterLevelSensorOverflowHealthy.value = WaterLevelSensorOverflowHealthy_;
        instance.WaterLevelSensorLowIsConfigured.value = WaterLevelSensorLowIsConfigured_;
        instance.WaterLevelSensorLLAlarm.value = WaterLevelSensorLLAlarm_;
        instance.WaterLevelSensorLowHealthy.value = WaterLevelSensorLowHealthy_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean TempSensorIsConfigured_, boolean TempSensorHHAlarm_, boolean TempSensorHealthy_, boolean PressureSensorIsConfigured_, boolean PressureSensorHHAlarm_, boolean PressureSensorHealthy_, boolean WaterLevelSensorHighIsConfigured_, boolean WaterLevelSensorHHAlarm_, boolean WaterLevelSensorHighHealthy_, boolean WaterLevelSensorOverflowIsConfigured_, boolean WaterLevelSensorOverflowAlarm_, boolean WaterLevelSensorOverflowHealthy_, boolean WaterLevelSensorLowIsConfigured_, boolean WaterLevelSensorLLAlarm_, boolean WaterLevelSensorLowHealthy_) {
        instance.TempSensorIsConfigured.value = TempSensorIsConfigured_;
        instance.TempSensorHHAlarm.value = TempSensorHHAlarm_;
        instance.TempSensorHealthy.value = TempSensorHealthy_;
        instance.PressureSensorIsConfigured.value = PressureSensorIsConfigured_;
        instance.PressureSensorHHAlarm.value = PressureSensorHHAlarm_;
        instance.PressureSensorHealthy.value = PressureSensorHealthy_;
        instance.WaterLevelSensorHighIsConfigured.value = WaterLevelSensorHighIsConfigured_;
        instance.WaterLevelSensorHHAlarm.value = WaterLevelSensorHHAlarm_;
        instance.WaterLevelSensorHighHealthy.value = WaterLevelSensorHighHealthy_;
        instance.WaterLevelSensorOverflowIsConfigured.value = WaterLevelSensorOverflowIsConfigured_;
        instance.WaterLevelSensorOverflowAlarm.value = WaterLevelSensorOverflowAlarm_;
        instance.WaterLevelSensorOverflowHealthy.value = WaterLevelSensorOverflowHealthy_;
        instance.WaterLevelSensorLowIsConfigured.value = WaterLevelSensorLowIsConfigured_;
        instance.WaterLevelSensorLLAlarm.value = WaterLevelSensorLLAlarm_;
        instance.WaterLevelSensorLowHealthy.value = WaterLevelSensorLowHealthy_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_TankControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_TankControl extends FBInstance
    {
        /** VAR TempSensorIsConfigured */
        public BOOL TempSensorIsConfigured = new BOOL();
        /** VAR TempSensorHHAlarm */
        public BOOL TempSensorHHAlarm = new BOOL();
        /** VAR TempSensorHealthy */
        public BOOL TempSensorHealthy = new BOOL();
        /** VAR PressureSensorIsConfigured */
        public BOOL PressureSensorIsConfigured = new BOOL();
        /** VAR PressureSensorHHAlarm */
        public BOOL PressureSensorHHAlarm = new BOOL();
        /** VAR PressureSensorHealthy */
        public BOOL PressureSensorHealthy = new BOOL();
        /** VAR WaterLevelSensorHighIsConfigured */
        public BOOL WaterLevelSensorHighIsConfigured = new BOOL();
        /** VAR WaterLevelSensorHHAlarm */
        public BOOL WaterLevelSensorHHAlarm = new BOOL();
        /** VAR WaterLevelSensorHighHealthy */
        public BOOL WaterLevelSensorHighHealthy = new BOOL();
        /** VAR WaterLevelSensorOverflowIsConfigured */
        public BOOL WaterLevelSensorOverflowIsConfigured = new BOOL();
        /** VAR WaterLevelSensorOverflowAlarm */
        public BOOL WaterLevelSensorOverflowAlarm = new BOOL();
        /** VAR WaterLevelSensorOverflowHealthy */
        public BOOL WaterLevelSensorOverflowHealthy = new BOOL();
        /** VAR WaterLevelSensorLowIsConfigured */
        public BOOL WaterLevelSensorLowIsConfigured = new BOOL();
        /** VAR WaterLevelSensorLLAlarm */
        public BOOL WaterLevelSensorLLAlarm = new BOOL();
        /** VAR WaterLevelSensorLowHealthy */
        public BOOL WaterLevelSensorLowHealthy = new BOOL();
        /** VAR Ready */
        public BOOL Ready = new BOOL();
        /** VAR OverPresuure */
        public BOOL OverPresuure = new BOOL();
        /** VAR InfeedEnabled */
        public BOOL InfeedEnabled = new BOOL();
        /** VAR OutfeedEnabled */
        public BOOL OutfeedEnabled = new BOOL();
        /** VAR HeatEnabled */
        public BOOL HeatEnabled = new BOOL();
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
        /** Connect the given variable to the input variable TempSensorIsConfigured
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable TempSensorHHAlarm
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable TempSensorHealthy
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable PressureSensorIsConfigured
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable PressureSensorHHAlarm
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable PressureSensorHealthy
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable WaterLevelSensorHighIsConfigured
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable WaterLevelSensorHHAlarm
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable WaterLevelSensorHighHealthy
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable WaterLevelSensorOverflowIsConfigured
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable WaterLevelSensorOverflowAlarm
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable WaterLevelSensorOverflowHealthy
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable WaterLevelSensorLowIsConfigured
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable WaterLevelSensorLLAlarm
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable WaterLevelSensorLowHealthy
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
            transition_FB_TankControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_FB_TankControl_1();
        }

        /** The default constructor. */
        public FB_TankControl() {
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
                transition_FB_TankControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_FB_TankControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;
            Ready.value = false;
            OverPresuure.value = false;
            InfeedEnabled.value = false;
            OutfeedEnabled.value = false;
            HeatEnabled.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            if (((TempSensorIsConfigured.value & !TempSensorHealthy.value) |
            (PressureSensorIsConfigured.value & !PressureSensorHealthy.value) |
            (WaterLevelSensorHighIsConfigured.value & !WaterLevelSensorHighHealthy.value) |
            (WaterLevelSensorOverflowIsConfigured.value & !WaterLevelSensorOverflowHealthy.value) |
            (WaterLevelSensorLowIsConfigured.value & !WaterLevelSensorLowHealthy.value))) {
                Ready.value = false;
            }
            else {
                Ready.value = true;
            };

            if (((TempSensorIsConfigured.value & !TempSensorHHAlarm.value) & Ready.value)) {
                HeatEnabled.value = true;
            }
            else {
                HeatEnabled.value = false;
            };

            if ((PressureSensorIsConfigured.value & PressureSensorHHAlarm.value)) {
                OverPresuure.value = true;
            }
            else {
                OverPresuure.value = false;
            };

            if (((WaterLevelSensorHighIsConfigured.value & WaterLevelSensorHHAlarm.value) | (WaterLevelSensorOverflowIsConfigured.value & WaterLevelSensorOverflowAlarm.value) | !Ready.value | (!WaterLevelSensorHighIsConfigured.value & !WaterLevelSensorOverflowIsConfigured.value))) {
                InfeedEnabled.value = false;
            }
            else {
                InfeedEnabled.value = true;
            };

            if (((WaterLevelSensorLowIsConfigured.value & !WaterLevelSensorLLAlarm.value) & Ready.value)) {
                OutfeedEnabled.value = true;
            }
            else {
                OutfeedEnabled.value = false;
            };
        }
    }
    private void transition_FB_TankControl_0() {
    }

    private void transition_FB_TankControl_1() {
    }

    private void transition_FB_TankControl_2() {
    }

    private void transition_FB_TankControl_3() {
    }
}