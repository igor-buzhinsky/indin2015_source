package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class System_NoOutput__Composite {
    private final System_NoOutput instance = new System_NoOutput();

    public void event_INIT(float IA_L101_, float IA_L201_, float IA_L301_, float IA_L401_, float IA_T100_, float IA_F100_, float IA_F200_, float IA_T300_, float IA_P300_, boolean ID_L100_, boolean ID_L102_, boolean ID_L200_, boolean ID_L202_, boolean ID_L300_, boolean ID_L302_, boolean ID_L400_, boolean ID_L402_) {
        instance.IA_L101.value = IA_L101_;
        instance.IA_L201.value = IA_L201_;
        instance.IA_L301.value = IA_L301_;
        instance.IA_L401.value = IA_L401_;
        instance.IA_T100.value = IA_T100_;
        instance.IA_F100.value = IA_F100_;
        instance.IA_F200.value = IA_F200_;
        instance.IA_T300.value = IA_T300_;
        instance.IA_P300.value = IA_P300_;
        instance.ID_L100.value = ID_L100_;
        instance.ID_L102.value = ID_L102_;
        instance.ID_L200.value = ID_L200_;
        instance.ID_L202.value = ID_L202_;
        instance.ID_L300.value = ID_L300_;
        instance.ID_L302.value = ID_L302_;
        instance.ID_L400.value = ID_L400_;
        instance.ID_L402.value = ID_L402_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(float IA_L101_, float IA_L201_, float IA_L301_, float IA_L401_, float IA_T100_, float IA_F100_, float IA_F200_, float IA_T300_, float IA_P300_, boolean ID_L100_, boolean ID_L102_, boolean ID_L200_, boolean ID_L202_, boolean ID_L300_, boolean ID_L302_, boolean ID_L400_, boolean ID_L402_) {
        instance.IA_L101.value = IA_L101_;
        instance.IA_L201.value = IA_L201_;
        instance.IA_L301.value = IA_L301_;
        instance.IA_L401.value = IA_L401_;
        instance.IA_T100.value = IA_T100_;
        instance.IA_F100.value = IA_F100_;
        instance.IA_F200.value = IA_F200_;
        instance.IA_T300.value = IA_T300_;
        instance.IA_P300.value = IA_P300_;
        instance.ID_L100.value = ID_L100_;
        instance.ID_L102.value = ID_L102_;
        instance.ID_L200.value = ID_L200_;
        instance.ID_L202.value = ID_L202_;
        instance.ID_L300.value = ID_L300_;
        instance.ID_L302.value = ID_L302_;
        instance.ID_L400.value = ID_L400_;
        instance.ID_L402.value = ID_L402_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK System_NoOutput
     * @author Администратор
     * @version 20150208/Администратор
     */
    private class System_NoOutput extends FBInstance
    {
        /** VAR IA_L101 */
        public REAL IA_L101 = new REAL();
        /** VAR IA_L201 */
        public REAL IA_L201 = new REAL();
        /** VAR IA_L301 */
        public REAL IA_L301 = new REAL();
        /** VAR IA_L401 */
        public REAL IA_L401 = new REAL();
        /** VAR IA_T100 */
        public REAL IA_T100 = new REAL();
        /** VAR IA_F100 */
        public REAL IA_F100 = new REAL();
        /** VAR IA_F200 */
        public REAL IA_F200 = new REAL();
        /** VAR IA_T300 */
        public REAL IA_T300 = new REAL();
        /** VAR IA_P300 */
        public REAL IA_P300 = new REAL();
        /** VAR ID_L100 */
        public BOOL ID_L100 = new BOOL();
        /** VAR ID_L102 */
        public BOOL ID_L102 = new BOOL();
        /** VAR ID_L200 */
        public BOOL ID_L200 = new BOOL();
        /** VAR ID_L202 */
        public BOOL ID_L202 = new BOOL();
        /** VAR ID_L300 */
        public BOOL ID_L300 = new BOOL();
        /** VAR ID_L302 */
        public BOOL ID_L302 = new BOOL();
        /** VAR ID_L400 */
        public BOOL ID_L400 = new BOOL();
        /** VAR ID_L402 */
        public BOOL ID_L402 = new BOOL();
        /** EVENT INIT */
        public EventOutput INIT = new EventOutput();
        /** EVENT REQ */
        public EventOutput REQ = new EventOutput();
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
        /** Connect the given variable to the input variable IA_L101
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable IA_L201
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable IA_L301
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable IA_L401
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable IA_T100
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable IA_F100
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable IA_F200
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable IA_T300
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable IA_P300
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable ID_L100
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable ID_L102
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable ID_L200
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable ID_L202
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable ID_L300
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable ID_L302
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable ID_L400
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable ID_L402
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** FB T100WaterLevel */
        protected Service_ADIMeasure T100WaterLevel = new Service_ADIMeasure() ;
        /** FB T200WaterLevel */
        protected Service_ADIMeasure T200WaterLevel = new Service_ADIMeasure() ;
        /** FB T300WaterLevel */
        protected Service_ADIMeasure T300WaterLevel = new Service_ADIMeasure() ;
        /** FB T400WaterLevel */
        protected Service_ADIMeasure T400WaterLevel = new Service_ADIMeasure() ;
        /** FB T100Temperature */
        protected Service_AIMeasure T100Temperature = new Service_AIMeasure() ;
        /** FB F100Flow */
        protected Service_AIMeasure F100Flow = new Service_AIMeasure() ;
        /** FB F200Flow */
        protected Service_AIMeasure F200Flow = new Service_AIMeasure() ;
        /** FB T300Temperature */
        protected Service_AIMeasure T300Temperature = new Service_AIMeasure() ;
        /** FB P300Pressure */
        protected Service_AIMeasure P300Pressure = new Service_AIMeasure() ;
        /** FB T100TankControl */
        protected FB_TankControl T100TankControl = new FB_TankControl() ;
        /** FB T200TankControl */
        protected FB_TankControl T200TankControl = new FB_TankControl() ;
        /** FB T300TankControl */
        protected FB_TankControl T300TankControl = new FB_TankControl() ;
        /** FB T400TankControl */
        protected FB_TankControl T400TankControl = new FB_TankControl() ;
        /** FB M100PumpPIDControl */
        protected FB_PIDControl M100PumpPIDControl = new FB_PIDControl() ;
        /** FB M200PumpPIDControl */
        protected FB_PIDControl M200PumpPIDControl = new FB_PIDControl() ;
        /** FB WaterProcessSequenceControl */
        protected FB_SequenceControl WaterProcessSequenceControl = new FB_SequenceControl() ;
        /** FB WaterProcessInterlockControl */
        protected FB_InterlockControl WaterProcessInterlockControl = new FB_InterlockControl() ;
        /** FB E100HeaterControl */
        protected FB_HeaterControl E100HeaterControl = new FB_HeaterControl() ;
        /** FB M100PumpControl */
        protected FB_PumpControl M100PumpControl = new FB_PumpControl() ;
        /** FB M200PumpControl */
        protected FB_PumpControl M200PumpControl = new FB_PumpControl() ;
        /** FB Y101ValveControl */
        protected FB_ValveControl Y101ValveControl = new FB_ValveControl() ;
        /** FB Y102ValveControl */
        protected FB_ValveControl Y102ValveControl = new FB_ValveControl() ;
        /** FB Y103ValveControl */
        protected FB_ValveControl Y103ValveControl = new FB_ValveControl() ;
        /** FB Y105ValveControl */
        protected FB_ValveControl Y105ValveControl = new FB_ValveControl() ;
        /** FB Y201ValveControl */
        protected FB_ValveControl Y201ValveControl = new FB_ValveControl() ;
        /** FB Y202ValveControl */
        protected FB_ValveControl Y202ValveControl = new FB_ValveControl() ;
        /** FB Y203ValveControl */
        protected FB_ValveControl Y203ValveControl = new FB_ValveControl() ;
        /** FB Y204ValveControl */
        protected FB_ValveControl Y204ValveControl = new FB_ValveControl() ;
        /** FB Y501ValveControl */
        protected FB_ValveControl Y501ValveControl = new FB_ValveControl() ;
        /** FB Y404ValveControl */
        protected FB_ValveControl Y404ValveControl = new FB_ValveControl() ;
        /** FB Y401ValveControl */
        protected FB_ValveControl Y401ValveControl = new FB_ValveControl() ;
        /** FB Y303ValveControl */
        protected FB_ValveControl Y303ValveControl = new FB_ValveControl() ;
        /** FB Y403ValveControl */
        protected FB_ValveControl Y403ValveControl = new FB_ValveControl() ;
        /** FB Y402ValveControl */
        protected FB_ValveControl Y402ValveControl = new FB_ValveControl() ;
        /** FB Y305ValveControl */
        protected FB_ValveControl Y305ValveControl = new FB_ValveControl() ;
        /** FB Y302ValveControl */
        protected FB_ValveControl Y302ValveControl = new FB_ValveControl() ;
        /** FB Y301ValveControl */
        protected FB_ValveControl Y301ValveControl = new FB_ValveControl() ;
        /** FB M100Control */
        protected Service_AOControl M100Control = new Service_AOControl() ;
        /** FB M200Control */
        protected Service_AOControl M200Control = new Service_AOControl() ;
        /** FB Y102Control */
        protected Service_AOControl Y102Control = new Service_AOControl() ;
        /** FB Y201Control */
        protected Service_AOControl Y201Control = new Service_AOControl() ;
        /** FB E100Control */
        protected Service_DOControl E100Control = new Service_DOControl() ;
        /** FB Y101Control */
        protected Service_DOControl Y101Control = new Service_DOControl() ;
        /** FB Y103Control */
        protected Service_DOControl Y103Control = new Service_DOControl() ;
        /** FB Y105Control */
        protected Service_DOControl Y105Control = new Service_DOControl() ;
        /** FB Y202Control */
        protected Service_DOControl Y202Control = new Service_DOControl() ;
        /** FB Y203Control */
        protected Service_DOControl Y203Control = new Service_DOControl() ;
        /** FB Y204Control */
        protected Service_DOControl Y204Control = new Service_DOControl() ;
        /** FB Y301Control */
        protected Service_DOControl Y301Control = new Service_DOControl() ;
        /** FB Y302Control */
        protected Service_DOControl Y302Control = new Service_DOControl() ;
        /** FB Y303Control */
        protected Service_DOControl Y303Control = new Service_DOControl() ;
        /** FB Y305Control */
        protected Service_DOControl Y305Control = new Service_DOControl() ;
        /** FB Y401Control */
        protected Service_DOControl Y401Control = new Service_DOControl() ;
        /** FB Y402Control */
        protected Service_DOControl Y402Control = new Service_DOControl() ;
        /** FB Y403Control */
        protected Service_DOControl Y403Control = new Service_DOControl() ;
        /** FB Y404Control */
        protected Service_DOControl Y404Control = new Service_DOControl() ;
        /** FB Y501Control */
        protected Service_DOControl Y501Control = new Service_DOControl() ;
        /** FB FB1 */
        protected NOT1 FB1 = new NOT1() ;
        /** FB FB6 */
        protected NOT2 FB6 = new NOT2() ;
        /** FB FB5 */
        protected NOT3 FB5 = new NOT3() ;
        /** FB FB7 */
        protected NOT1 FB7 = new NOT1() ;
        /** FB FB8 */
        protected NOT1 FB8 = new NOT1() ;
        /** FB FB11 */
        protected NOT10 FB11 = new NOT10() ;
        /** FB FB9 */
        protected NOT16 FB9 = new NOT16() ;
        /** The default constructor. */
        public System_NoOutput() {
            super();
            T100WaterLevel.INITO.connectTo(T200WaterLevel.INIT);
            T100WaterLevel.CNF.connectTo(T200WaterLevel.REQ);
            T200WaterLevel.INITO.connectTo(T300WaterLevel.INIT);
            T300WaterLevel.INITO.connectTo(T400WaterLevel.INIT);
            T200WaterLevel.CNF.connectTo(T300WaterLevel.REQ);
            T300WaterLevel.CNF.connectTo(T400WaterLevel.REQ);
            T400WaterLevel.INITO.connectTo(T100Temperature.INIT);
            T400WaterLevel.CNF.connectTo(T100Temperature.REQ);
            T100Temperature.INITO.connectTo(F100Flow.INIT);
            T100Temperature.CNF.connectTo(F100Flow.REQ);
            F100Flow.INITO.connectTo(F200Flow.INIT);
            F100Flow.CNF.connectTo(F200Flow.REQ);
            F200Flow.INITO.connectTo(T300Temperature.INIT);
            F200Flow.CNF.connectTo(T300Temperature.REQ);
            T300Temperature.INITO.connectTo(P300Pressure.INIT);
            T300Temperature.CNF.connectTo(P300Pressure.REQ);
            P300Pressure.INITO.connectTo(T100TankControl.INIT);
            P300Pressure.CNF.connectTo(FB6.REQ);
            FB6.CNF.connectTo(T100TankControl.REQ);
            T100TankControl.INITO.connectTo(T200TankControl.INIT);
            T200TankControl.INITO.connectTo(T300TankControl.INIT);
            T300TankControl.INITO.connectTo(T400TankControl.INIT);
            T100TankControl.CNF.connectTo(FB1.REQ);
            T200TankControl.CNF.connectTo(FB5.REQ);
            FB5.CNF.connectTo(T300TankControl.REQ);
            T300TankControl.CNF.connectTo(FB7.REQ);
            FB7.CNF.connectTo(T400TankControl.REQ);
            T400TankControl.INITO.connectTo(M100PumpPIDControl.INIT);
            T400TankControl.CNF.connectTo(M100PumpPIDControl.REQ);
            M100PumpPIDControl.INITO.connectTo(M200PumpPIDControl.INIT);
            M100PumpPIDControl.CNF.connectTo(M200PumpPIDControl.REQ);
            M200PumpPIDControl.INITO.connectTo(WaterProcessSequenceControl.INIT);
            WaterProcessSequenceControl.INITO.connectTo(WaterProcessInterlockControl.INIT);
            WaterProcessInterlockControl.INITO.connectTo(E100HeaterControl.INIT);
            WaterProcessInterlockControl.CNF.connectTo(E100HeaterControl.REQ);
            E100HeaterControl.INITO.connectTo(M100PumpControl.INIT);
            E100HeaterControl.CNF.connectTo(M100PumpControl.REQ);
            M100PumpControl.INITO.connectTo(M200PumpControl.INIT);
            M100PumpControl.CNF.connectTo(M200PumpControl.REQ);
            M200PumpControl.INITO.connectTo(Y101ValveControl.INIT);
            M200PumpControl.CNF.connectTo(Y101ValveControl.REQ);
            Y101ValveControl.INITO.connectTo(Y102ValveControl.INIT);
            Y101ValveControl.CNF.connectTo(Y102ValveControl.REQ);
            Y102ValveControl.INITO.connectTo(Y103ValveControl.INIT);
            Y102ValveControl.CNF.connectTo(Y103ValveControl.REQ);
            Y103ValveControl.INITO.connectTo(Y105ValveControl.INIT);
            Y103ValveControl.CNF.connectTo(Y105ValveControl.REQ);
            Y105ValveControl.INITO.connectTo(Y201ValveControl.INIT);
            Y105ValveControl.CNF.connectTo(Y201ValveControl.REQ);
            Y201ValveControl.INITO.connectTo(Y202ValveControl.INIT);
            Y201ValveControl.CNF.connectTo(Y202ValveControl.REQ);
            Y202ValveControl.INITO.connectTo(Y203ValveControl.INIT);
            Y202ValveControl.CNF.connectTo(Y203ValveControl.REQ);
            Y203ValveControl.INITO.connectTo(Y204ValveControl.INIT);
            Y203ValveControl.CNF.connectTo(Y204ValveControl.REQ);
            Y204ValveControl.INITO.connectTo(Y301ValveControl.INIT);
            Y204ValveControl.CNF.connectTo(Y301ValveControl.REQ);
            Y301ValveControl.INITO.connectTo(Y302ValveControl.INIT);
            Y301ValveControl.CNF.connectTo(Y302ValveControl.REQ);
            Y302ValveControl.INITO.connectTo(Y303ValveControl.INIT);
            Y302ValveControl.CNF.connectTo(Y303ValveControl.REQ);
            Y303ValveControl.INITO.connectTo(Y305ValveControl.INIT);
            Y303ValveControl.CNF.connectTo(Y305ValveControl.REQ);
            Y305ValveControl.INITO.connectTo(Y401ValveControl.INIT);
            Y305ValveControl.CNF.connectTo(Y401ValveControl.REQ);
            Y401ValveControl.INITO.connectTo(Y402ValveControl.INIT);
            Y401ValveControl.CNF.connectTo(Y402ValveControl.REQ);
            Y402ValveControl.INITO.connectTo(Y403ValveControl.INIT);
            Y402ValveControl.CNF.connectTo(Y403ValveControl.REQ);
            Y403ValveControl.INITO.connectTo(Y404ValveControl.INIT);
            Y403ValveControl.CNF.connectTo(Y404ValveControl.REQ);
            Y404ValveControl.INITO.connectTo(Y501ValveControl.INIT);
            Y404ValveControl.CNF.connectTo(Y501ValveControl.REQ);
            M200PumpPIDControl.CNF.connectTo(FB11.REQ);
            FB11.CNF.connectTo(WaterProcessSequenceControl.REQ);
            WaterProcessSequenceControl.CNF.connectTo(FB9.REQ);
            FB9.CNF.connectTo(FB8.REQ);
            FB8.CNF.connectTo(WaterProcessInterlockControl.REQ);
            Y501ValveControl.INITO.connectTo(M100Control.INIT);
            Y501ValveControl.CNF.connectTo(M100Control.REQ);
            M100Control.INITO.connectTo(M200Control.INIT);
            M100Control.CNF.connectTo(M200Control.REQ);
            M200Control.INITO.connectTo(Y102Control.INIT);
            M200Control.CNF.connectTo(Y102Control.REQ);
            Y102Control.INITO.connectTo(Y201Control.INIT);
            Y102Control.CNF.connectTo(Y201Control.REQ);
            Y201Control.INITO.connectTo(E100Control.INIT);
            Y201Control.CNF.connectTo(E100Control.REQ);
            Y204Control.INITO.connectTo(Y301Control.INIT);
            Y204Control.CNF.connectTo(Y301Control.REQ);
            E100Control.INITO.connectTo(Y101Control.INIT);
            E100Control.CNF.connectTo(Y101Control.REQ);
            Y101Control.INITO.connectTo(Y103Control.INIT);
            Y101Control.CNF.connectTo(Y103Control.REQ);
            Y103Control.INITO.connectTo(Y105Control.INIT);
            Y103Control.CNF.connectTo(Y105Control.REQ);
            Y105Control.INITO.connectTo(Y202Control.INIT);
            Y105Control.CNF.connectTo(Y202Control.REQ);
            Y202Control.INITO.connectTo(Y203Control.INIT);
            Y202Control.CNF.connectTo(Y203Control.REQ);
            Y203Control.INITO.connectTo(Y204Control.INIT);
            Y203Control.CNF.connectTo(Y204Control.REQ);
            Y301Control.INITO.connectTo(Y302Control.INIT);
            Y301Control.CNF.connectTo(Y302Control.REQ);
            Y302Control.INITO.connectTo(Y303Control.INIT);
            Y302Control.CNF.connectTo(Y303Control.REQ);
            Y303Control.INITO.connectTo(Y305Control.INIT);
            Y303Control.CNF.connectTo(Y305Control.REQ);
            Y305Control.INITO.connectTo(Y401Control.INIT);
            Y305Control.CNF.connectTo(Y401Control.REQ);
            Y401Control.INITO.connectTo(Y402Control.INIT);
            Y401Control.CNF.connectTo(Y402Control.REQ);
            Y402Control.INITO.connectTo(Y403Control.INIT);
            Y402Control.CNF.connectTo(Y403Control.REQ);
            Y403Control.INITO.connectTo(Y404Control.INIT);
            Y403Control.CNF.connectTo(Y404Control.REQ);
            Y404Control.INITO.connectTo(Y501Control.INIT);
            Y404Control.CNF.connectTo(Y501Control.REQ);
            INIT.connectTo(T100WaterLevel.INIT);
            FB1.CNF.connectTo(T200TankControl.REQ);
            REQ.connectTo(T100WaterLevel.REQ);
            T100WaterLevel.connectIVNoException("DIH",ID_L100);
            T100WaterLevel.connectIVNoException("DIL",ID_L102);
            T200WaterLevel.connectIVNoException("DIH",ID_L200);
            T200WaterLevel.connectIVNoException("DIL",ID_L202);
            T300WaterLevel.connectIVNoException("DIH",ID_L300);
            T300WaterLevel.connectIVNoException("DIL",ID_L302);
            T400WaterLevel.connectIVNoException("DIH",ID_L400);
            T400WaterLevel.connectIVNoException("DIL",ID_L402);
            F100Flow.connectIVNoException("AI",IA_F100);
            F200Flow.connectIVNoException("AI",IA_F200);
            FB6.connectIVNoException("IN1",T100WaterLevel.ovNamedNoException("SensorFault"));
            FB6.connectIVNoException("IN2",T100Temperature.ovNamedNoException("SensorFault"));
            T100TankControl.connectIVNoException("WaterLevelSensorHighHealthy",FB6.ovNamedNoException("OUT1"));
            T100TankControl.connectIVNoException("TempSensorHealthy",FB6.ovNamedNoException("OUT2"));
            T100TankControl.connectIVNoException("WaterLevelSensorLLAlarm",T100WaterLevel.ovNamedNoException("AlarmLL"));
            T100TankControl.connectIVNoException("WaterLevelSensorLowHealthy",FB6.ovNamedNoException("OUT1"));
            FB1.connectIVNoException("IN1",T200WaterLevel.ovNamedNoException("SensorFault"));
            T200TankControl.connectIVNoException("WaterLevelSensorHighHealthy",FB1.ovNamedNoException("OUT1"));
            T200TankControl.connectIVNoException("WaterLevelSensorLowHealthy",FB1.ovNamedNoException("OUT1"));
            T200TankControl.connectIVNoException("WaterLevelSensorHHAlarm",T200WaterLevel.ovNamedNoException("AlarmHH"));
            T200TankControl.connectIVNoException("WaterLevelSensorLLAlarm",T200WaterLevel.ovNamedNoException("AlarmLL"));
            FB5.connectIVNoException("IN1",T300WaterLevel.ovNamedNoException("SensorFault"));
            T300TankControl.connectIVNoException("WaterLevelSensorHighHealthy",FB5.ovNamedNoException("OUT1"));
            T300TankControl.connectIVNoException("WaterLevelSensorLowHealthy",FB5.ovNamedNoException("OUT1"));
            FB5.connectIVNoException("IN2",T300Temperature.ovNamedNoException("SensorFault"));
            T300TankControl.connectIVNoException("TempSensorHealthy",FB5.ovNamedNoException("OUT2"));
            FB5.connectIVNoException("IN3",P300Pressure.ovNamedNoException("SensorFault"));
            T300TankControl.connectIVNoException("PressureSensorHealthy",FB5.ovNamedNoException("OUT3"));
            T300TankControl.connectIVNoException("TempSensorHHAlarm",T300Temperature.ovNamedNoException("AlarmHH"));
            T300TankControl.connectIVNoException("PressureSensorHHAlarm",P300Pressure.ovNamedNoException("AlarmHH"));
            T300TankControl.connectIVNoException("WaterLevelSensorHHAlarm",T300WaterLevel.ovNamedNoException("AlarmHH"));
            T300TankControl.connectIVNoException("WaterLevelSensorLLAlarm",T300WaterLevel.ovNamedNoException("AlarmLL"));
            FB7.connectIVNoException("IN1",T400WaterLevel.ovNamedNoException("SensorFault"));
            T400TankControl.connectIVNoException("WaterLevelSensorHighHealthy",FB7.ovNamedNoException("OUT1"));
            T400TankControl.connectIVNoException("WaterLevelSensorLowHealthy",FB7.ovNamedNoException("OUT1"));
            T100TankControl.connectIVNoException("WaterLevelSensorHHAlarm",T100WaterLevel.ovNamedNoException("AlarmHH"));
            T100TankControl.connectIVNoException("TempSensorHHAlarm",T100Temperature.ovNamedNoException("AlarmHH"));
            T400TankControl.connectIVNoException("WaterLevelSensorHHAlarm",T400WaterLevel.ovNamedNoException("AlarmHH"));
            T400TankControl.connectIVNoException("WaterLevelSensorLLAlarm",T400WaterLevel.ovNamedNoException("AlarmLL"));
            M100PumpPIDControl.connectIVNoException("PV",IA_F100);
            M200PumpPIDControl.connectIVNoException("PV",IA_F200);
            WaterProcessSequenceControl.connectIVNoException("T300_OverPressure",T300TankControl.ovNamedNoException("OverPresuure"));
            FB11.connectIVNoException("IN1",T100TankControl.ovNamedNoException("InfeedEnabled"));
            FB11.connectIVNoException("IN2",T100TankControl.ovNamedNoException("OutfeedEnabled"));
            FB11.connectIVNoException("IN3",T100TankControl.ovNamedNoException("HeatEnabled"));
            FB11.connectIVNoException("IN4",T200TankControl.ovNamedNoException("InfeedEnabled"));
            FB11.connectIVNoException("IN5",T200TankControl.ovNamedNoException("OutfeedEnabled"));
            FB11.connectIVNoException("IN6",T300TankControl.ovNamedNoException("InfeedEnabled"));
            FB11.connectIVNoException("IN7",T300TankControl.ovNamedNoException("OutfeedEnabled"));
            FB11.connectIVNoException("IN8",T300TankControl.ovNamedNoException("HeatEnabled"));
            WaterProcessSequenceControl.connectIVNoException("T100_Overflow",FB11.ovNamedNoException("OUT1"));
            WaterProcessSequenceControl.connectIVNoException("T100_Underflow",FB11.ovNamedNoException("OUT2"));
            WaterProcessSequenceControl.connectIVNoException("T100_Overheat",FB11.ovNamedNoException("OUT3"));
            WaterProcessSequenceControl.connectIVNoException("T200_Overflow",FB11.ovNamedNoException("OUT4"));
            WaterProcessSequenceControl.connectIVNoException("T200_Underflow",FB11.ovNamedNoException("OUT5"));
            WaterProcessSequenceControl.connectIVNoException("T300_Overflow",FB11.ovNamedNoException("OUT6"));
            WaterProcessSequenceControl.connectIVNoException("T300_Underflow",FB11.ovNamedNoException("OUT7"));
            WaterProcessSequenceControl.connectIVNoException("T300_Overheat",FB11.ovNamedNoException("OUT8"));
            FB11.connectIVNoException("IN9",T400TankControl.ovNamedNoException("InfeedEnabled"));
            WaterProcessSequenceControl.connectIVNoException("T400_Overflow",FB11.ovNamedNoException("OUT9"));
            FB11.connectIVNoException("IN10",T400TankControl.ovNamedNoException("OutfeedEnabled"));
            WaterProcessSequenceControl.connectIVNoException("T400_Underflow",FB11.ovNamedNoException("OUT10"));
            Y101ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y101_Open"));
            Y102ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y102_Open"));
            Y103ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y103_Open"));
            Y105ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y105_Open"));
            Y201ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y201_Open"));
            Y202ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y202_Open"));
            Y203ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y203_Open"));
            Y204ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y204_Open"));
            Y301ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y301_Open"));
            Y302ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y302_Open"));
            Y303ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y303_Open"));
            Y305ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y305_Open"));
            Y401ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y401_Open"));
            Y402ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y402_Open"));
            Y403ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y403_Open"));
            Y404ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y404_Open"));
            Y501ValveControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("Y501_Open"));
            E100HeaterControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("E100_On"));
            M100PumpControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("M100_On"));
            M200PumpControl.connectIVNoException("RequestStart",WaterProcessSequenceControl.ovNamedNoException("M200_On"));
            WaterProcessInterlockControl.connectIVNoException("T300_OverPressure",T300TankControl.ovNamedNoException("OverPresuure"));
            FB9.connectIVNoException("IN1",T100TankControl.ovNamedNoException("InfeedEnabled"));
            FB9.connectIVNoException("IN2",T100TankControl.ovNamedNoException("OutfeedEnabled"));
            FB9.connectIVNoException("IN3",T100TankControl.ovNamedNoException("HeatEnabled"));
            FB9.connectIVNoException("IN4",T200TankControl.ovNamedNoException("InfeedEnabled"));
            FB9.connectIVNoException("IN5",T200TankControl.ovNamedNoException("OutfeedEnabled"));
            FB9.connectIVNoException("IN6",T300TankControl.ovNamedNoException("InfeedEnabled"));
            FB9.connectIVNoException("IN7",T300TankControl.ovNamedNoException("OutfeedEnabled"));
            FB9.connectIVNoException("IN8",T300TankControl.ovNamedNoException("HeatEnabled"));
            FB9.connectIVNoException("IN9",T400TankControl.ovNamedNoException("InfeedEnabled"));
            FB9.connectIVNoException("IN10",T400TankControl.ovNamedNoException("OutfeedEnabled"));
            FB9.connectIVNoException("IN11",Y102ValveControl.ovNamedNoException("ValveOn"));
            WaterProcessInterlockControl.connectIVNoException("T100_Overflow",FB9.ovNamedNoException("OUT1"));
            WaterProcessInterlockControl.connectIVNoException("T100_Underflow",FB9.ovNamedNoException("OUT2"));
            WaterProcessInterlockControl.connectIVNoException("T100_Overheat",FB9.ovNamedNoException("OUT3"));
            WaterProcessInterlockControl.connectIVNoException("T200_Overflow",FB9.ovNamedNoException("OUT4"));
            WaterProcessInterlockControl.connectIVNoException("T200_Underflow",FB9.ovNamedNoException("OUT5"));
            WaterProcessInterlockControl.connectIVNoException("T300_Overflow",FB9.ovNamedNoException("OUT6"));
            WaterProcessInterlockControl.connectIVNoException("T300_Underflow",FB9.ovNamedNoException("OUT7"));
            WaterProcessInterlockControl.connectIVNoException("T300_Overheat",FB9.ovNamedNoException("OUT8"));
            WaterProcessInterlockControl.connectIVNoException("T400_Overflow",FB9.ovNamedNoException("OUT9"));
            WaterProcessInterlockControl.connectIVNoException("T400_Underflow",FB9.ovNamedNoException("OUT10"));
            WaterProcessInterlockControl.connectIVNoException("Y102_Closed",FB9.ovNamedNoException("OUT11"));
            FB9.connectIVNoException("IN12",Y201ValveControl.ovNamedNoException("ValveOn"));
            WaterProcessInterlockControl.connectIVNoException("Y201_Closed",FB9.ovNamedNoException("OUT12"));
            FB9.connectIVNoException("IN13",Y203ValveControl.ovNamedNoException("ValveOn"));
            WaterProcessInterlockControl.connectIVNoException("Y203_Closed",FB9.ovNamedNoException("OUT13"));
            FB9.connectIVNoException("IN15",Y301ValveControl.ovNamedNoException("ValveOn"));
            WaterProcessInterlockControl.connectIVNoException("Y301_Closed",FB9.ovNamedNoException("OUT15"));
            FB9.connectIVNoException("IN16",Y303ValveControl.ovNamedNoException("ValveOn"));
            WaterProcessInterlockControl.connectIVNoException("Y303_Closed",FB9.ovNamedNoException("OUT16"));
            WaterProcessInterlockControl.connectIVNoException("Y403_Closed",FB8.ovNamedNoException("OUT1"));
            FB8.connectIVNoException("IN1",Y403ValveControl.ovNamedNoException("ValveOn"));
            E100HeaterControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("E100_On"));
            M100PumpControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("M100_On"));
            M200PumpControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("M200_On"));
            M100PumpControl.connectIVNoException("RequestValue",M100PumpPIDControl.ovNamedNoException("OUT"));
            M200PumpControl.connectIVNoException("RequestValue",M200PumpPIDControl.ovNamedNoException("OUT"));
            Y101ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y101_Open"));
            Y102ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y102_Open"));
            Y103ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y103_Open"));
            Y105ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y105_Open"));
            Y201ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y201_Open"));
            Y202ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y202_Open"));
            Y203ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y203_Open"));
            Y204ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y204_Open"));
            Y301ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y301_Open"));
            Y302ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y302_Open"));
            Y303ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y303_Open"));
            Y305ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y305_Open"));
            Y401ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y401_Open"));
            Y402ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y402_Open"));
            Y403ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y403_Open"));
            Y404ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y404_Open"));
            Y501ValveControl.connectIVNoException("ReadyToStart",WaterProcessInterlockControl.ovNamedNoException("Y501_Open"));
            Y102ValveControl.connectIVNoException("RequestValue",M100PumpPIDControl.ovNamedNoException("OUT"));
            Y201ValveControl.connectIVNoException("RequestValue",M200PumpPIDControl.ovNamedNoException("OUT"));
            E100Control.connectIVNoException("CMD_ON",E100HeaterControl.ovNamedNoException("HeaterOn"));
            M100Control.connectIVNoException("AOValue",M100PumpControl.ovNamedNoException("PumpValue"));
            M200Control.connectIVNoException("AOValue",M200PumpControl.ovNamedNoException("PumpValue"));
            Y102Control.connectIVNoException("AOValue",Y102ValveControl.ovNamedNoException("ValveValue"));
            Y201Control.connectIVNoException("AOValue",Y201ValveControl.ovNamedNoException("ValveValue"));
            Y101Control.connectIVNoException("CMD_ON",Y101ValveControl.ovNamedNoException("ValveOn"));
            Y103Control.connectIVNoException("CMD_ON",Y103ValveControl.ovNamedNoException("ValveOn"));
            Y105Control.connectIVNoException("CMD_ON",Y105ValveControl.ovNamedNoException("ValveOn"));
            Y202Control.connectIVNoException("CMD_ON",Y202ValveControl.ovNamedNoException("ValveOn"));
            Y203Control.connectIVNoException("CMD_ON",Y203ValveControl.ovNamedNoException("ValveOn"));
            Y204Control.connectIVNoException("CMD_ON",Y204ValveControl.ovNamedNoException("ValveOn"));
            Y301Control.connectIVNoException("CMD_ON",Y301ValveControl.ovNamedNoException("ValveOn"));
            Y302Control.connectIVNoException("CMD_ON",Y302ValveControl.ovNamedNoException("ValveOn"));
            Y303Control.connectIVNoException("CMD_ON",Y303ValveControl.ovNamedNoException("ValveOn"));
            Y305Control.connectIVNoException("CMD_ON",Y305ValveControl.ovNamedNoException("ValveOn"));
            Y401Control.connectIVNoException("CMD_ON",Y401ValveControl.ovNamedNoException("ValveOn"));
            Y402Control.connectIVNoException("CMD_ON",Y402ValveControl.ovNamedNoException("ValveOn"));
            Y403Control.connectIVNoException("CMD_ON",Y403ValveControl.ovNamedNoException("ValveOn"));
            Y404Control.connectIVNoException("CMD_ON",Y404ValveControl.ovNamedNoException("ValveOn"));
            Y501Control.connectIVNoException("CMD_ON",Y501ValveControl.ovNamedNoException("ValveOn"));
            T100WaterLevel.connectIVNoException("AI",IA_L101);
            T200WaterLevel.connectIVNoException("AI",IA_L201);
            T300WaterLevel.connectIVNoException("AI",IA_L301);
            T400WaterLevel.connectIVNoException("AI",IA_L401);
            T100Temperature.connectIVNoException("AI",IA_T100);
            T300Temperature.connectIVNoException("AI",IA_T300);
            P300Pressure.connectIVNoException("AI",IA_P300);
            T100WaterLevel.PRESET_HH.initializeNoException("270.0");
            T100WaterLevel.PRESET_H.initializeNoException("240.0");
            T100WaterLevel.PRESET_L.initializeNoException("180.0");
            T100WaterLevel.PRESET_LL.initializeNoException("160.0");
            T100WaterLevel.PRESET_MINAI.initializeNoException("848.0");
            T100WaterLevel.PRESET_MAXAI.initializeNoException("17844.0");
            T200WaterLevel.PRESET_HH.initializeNoException("285.0");
            T200WaterLevel.PRESET_H.initializeNoException("255.0");
            T200WaterLevel.PRESET_L.initializeNoException("70.0");
            T200WaterLevel.PRESET_LL.initializeNoException("40.0");
            T200WaterLevel.PRESET_MINAI.initializeNoException("0");
            T200WaterLevel.PRESET_MAXAI.initializeNoException("300.0");
            T300WaterLevel.PRESET_HH.initializeNoException("285.0");
            T300WaterLevel.PRESET_H.initializeNoException("255.0");
            T300WaterLevel.PRESET_L.initializeNoException("70.0");
            T300WaterLevel.PRESET_LL.initializeNoException("40.0");
            T300WaterLevel.PRESET_MINAI.initializeNoException("0.0");
            T300WaterLevel.PRESET_MAXAI.initializeNoException("300.0");
            T400WaterLevel.PRESET_HH.initializeNoException("285.0");
            T400WaterLevel.PRESET_H.initializeNoException("255.0");
            T400WaterLevel.PRESET_L.initializeNoException("70.0");
            T400WaterLevel.PRESET_LL.initializeNoException("40.0");
            T400WaterLevel.PRESET_MINAI.initializeNoException("892.0");
            T400WaterLevel.PRESET_MAXAI.initializeNoException("17723.0");
            T100Temperature.PRESET_HH.initializeNoException("45.0");
            T100Temperature.PRESET_H.initializeNoException("40.0");
            T100Temperature.PRESET_L.initializeNoException("25.0");
            T100Temperature.PRESET_LL.initializeNoException("20.0");
            T100Temperature.PRESET_MINAI.initializeNoException("0.0");
            T100Temperature.PRESET_MAXAI.initializeNoException("100.0");
            F100Flow.PRESET_HH.initializeNoException("2.0");
            F100Flow.PRESET_H.initializeNoException("1.95");
            F100Flow.PRESET_L.initializeNoException("0.1");
            F100Flow.PRESET_LL.initializeNoException("0.0");
            F100Flow.PRESET_MINAI.initializeNoException("0.0");
            F100Flow.PRESET_MAXAI.initializeNoException("2.5");
            F200Flow.PRESET_HH.initializeNoException("2.0");
            F200Flow.PRESET_H.initializeNoException("1.95");
            F200Flow.PRESET_L.initializeNoException("0.1");
            F200Flow.PRESET_LL.initializeNoException("0.0");
            F200Flow.PRESET_MINAI.initializeNoException("0.0");
            F200Flow.PRESET_MAXAI.initializeNoException("2.5");
            T300Temperature.PRESET_HH.initializeNoException("45.0");
            T300Temperature.PRESET_H.initializeNoException("40.0");
            T300Temperature.PRESET_L.initializeNoException("25.0");
            T300Temperature.PRESET_LL.initializeNoException("20.0");
            T300Temperature.PRESET_MINAI.initializeNoException("0.0");
            T300Temperature.PRESET_MAXAI.initializeNoException("100.0");
            P300Pressure.PRESET_HH.initializeNoException("0.25");
            P300Pressure.PRESET_H.initializeNoException("0.2");
            P300Pressure.PRESET_L.initializeNoException("0.1");
            P300Pressure.PRESET_LL.initializeNoException("0.0");
            P300Pressure.PRESET_MINAI.initializeNoException("0");
            P300Pressure.PRESET_MAXAI.initializeNoException("0.25");
            T100TankControl.TempSensorIsConfigured.initializeNoException("TRUE");
            T100TankControl.PressureSensorIsConfigured.initializeNoException("FALSE");
            T100TankControl.PressureSensorHHAlarm.initializeNoException("FALSE");
            T100TankControl.PressureSensorHealthy.initializeNoException("FALSE");
            T100TankControl.WaterLevelSensorHighIsConfigured.initializeNoException("TRUE");
            T100TankControl.WaterLevelSensorLowIsConfigured.initializeNoException("TRUE");
            T100TankControl.WaterLevelSensorOverflowIsConfigured.initializeNoException("FALSE");
            T100TankControl.WaterLevelSensorOverflowAlarm.initializeNoException("FALSE");
            T100TankControl.WaterLevelSensorOverflowHealthy.initializeNoException("FALSE");
            T200TankControl.WaterLevelSensorHighIsConfigured.initializeNoException("TRUE");
            T200TankControl.WaterLevelSensorLowIsConfigured.initializeNoException("TRUE");
            T200TankControl.TempSensorIsConfigured.initializeNoException("FALSE");
            T200TankControl.TempSensorHHAlarm.initializeNoException("FALSE");
            T200TankControl.TempSensorHealthy.initializeNoException("FALSE");
            T200TankControl.PressureSensorIsConfigured.initializeNoException("FALSE");
            T200TankControl.PressureSensorHHAlarm.initializeNoException("FALSE");
            T200TankControl.PressureSensorHealthy.initializeNoException("FALSE");
            T200TankControl.WaterLevelSensorOverflowIsConfigured.initializeNoException("FALSE");
            T200TankControl.WaterLevelSensorOverflowAlarm.initializeNoException("FALSE");
            T200TankControl.WaterLevelSensorOverflowHealthy.initializeNoException("FALSE");
            T300TankControl.TempSensorIsConfigured.initializeNoException("TRUE");
            T300TankControl.PressureSensorIsConfigured.initializeNoException("TRUE");
            T300TankControl.WaterLevelSensorHighIsConfigured.initializeNoException("TRUE");
            T300TankControl.WaterLevelSensorLowIsConfigured.initializeNoException("TRUE");
            T300TankControl.WaterLevelSensorOverflowIsConfigured.initializeNoException("FALSE");
            T300TankControl.WaterLevelSensorOverflowAlarm.initializeNoException("FALSE");
            T300TankControl.WaterLevelSensorOverflowHealthy.initializeNoException("FALSE");
            T400TankControl.WaterLevelSensorLowIsConfigured.initializeNoException("TRUE");
            T400TankControl.PressureSensorHealthy.initializeNoException("FALSE");
            T400TankControl.TempSensorIsConfigured.initializeNoException("FALSE");
            T400TankControl.TempSensorHHAlarm.initializeNoException("FALSE");
            T400TankControl.TempSensorHealthy.initializeNoException("FALSE");
            T400TankControl.PressureSensorIsConfigured.initializeNoException("FALSE");
            T400TankControl.PressureSensorHHAlarm.initializeNoException("FALSE");
            T400TankControl.WaterLevelSensorHighIsConfigured.initializeNoException("TRUE");
            T400TankControl.WaterLevelSensorOverflowIsConfigured.initializeNoException("FALSE");
            T400TankControl.WaterLevelSensorOverflowAlarm.initializeNoException("FALSE");
            T400TankControl.WaterLevelSensorOverflowHealthy.initializeNoException("FALSE");
            M100PumpPIDControl.AutoMode.initializeNoException("TRUE");
            M100PumpPIDControl.SP.initializeNoException("2.0");
            M100PumpPIDControl.gain.initializeNoException("1.0");
            M100PumpPIDControl.rate.initializeNoException("1.0");
            M100PumpPIDControl.reset.initializeNoException("1.0");
            M100PumpPIDControl.sample.initializeNoException("1.5");
            M200PumpPIDControl.AutoMode.initializeNoException("TRUE");
            M200PumpPIDControl.SP.initializeNoException("2.0");
            M200PumpPIDControl.gain.initializeNoException("1.0");
            M200PumpPIDControl.rate.initializeNoException("1.0");
            M200PumpPIDControl.reset.initializeNoException("1.0");
            M200PumpPIDControl.sample.initializeNoException("1.5");
            WaterProcessSequenceControl.FillingSeqEnable.initializeNoException("FALSE");
            WaterProcessSequenceControl.StartSeqEnable.initializeNoException("FALSE");
            WaterProcessSequenceControl.ShutdownSeqEnable.initializeNoException("FALSE");
            WaterProcessSequenceControl.EmptyingSeqEnable.initializeNoException("FALSE");
            M100PumpControl.RangeOutMin.initializeNoException("0.0");
            M100PumpControl.RangeOutMax.initializeNoException("100.0");
            M200PumpControl.RangeOutMin.initializeNoException("0.0");
            M200PumpControl.RangeOutMax.initializeNoException("100.0");
            Y101ValveControl.IsControlValve.initializeNoException("FALSE");
            Y101ValveControl.RangeOutMin.initializeNoException("0.0");
            Y101ValveControl.RangeOutMax.initializeNoException("0.0");
            Y101ValveControl.RequestValue.initializeNoException("0.0");
            Y102ValveControl.RangeOutMin.initializeNoException("0.0");
            Y102ValveControl.IsControlValve.initializeNoException("TRUE");
            Y102ValveControl.RangeOutMax.initializeNoException("25630.0");
            Y103ValveControl.IsControlValve.initializeNoException("FALSE");
            Y103ValveControl.RangeOutMin.initializeNoException("0.0");
            Y103ValveControl.RangeOutMax.initializeNoException("0.0");
            Y103ValveControl.RequestValue.initializeNoException("0.0");
            Y105ValveControl.IsControlValve.initializeNoException("FALSE");
            Y105ValveControl.RangeOutMin.initializeNoException("0.0");
            Y105ValveControl.RangeOutMax.initializeNoException("0.0");
            Y105ValveControl.RequestValue.initializeNoException("0.0");
            Y201ValveControl.IsControlValve.initializeNoException("TRUE");
            Y201ValveControl.RangeOutMin.initializeNoException("0.0");
            Y201ValveControl.RangeOutMax.initializeNoException("25630.0");
            Y202ValveControl.IsControlValve.initializeNoException("FALSE");
            Y202ValveControl.RangeOutMin.initializeNoException("0.0");
            Y202ValveControl.RangeOutMax.initializeNoException("0.0");
            Y202ValveControl.RequestValue.initializeNoException("0.0");
            Y203ValveControl.IsControlValve.initializeNoException("FALSE");
            Y203ValveControl.RangeOutMin.initializeNoException("0.0");
            Y203ValveControl.RangeOutMax.initializeNoException("0.0");
            Y203ValveControl.RequestValue.initializeNoException("0.0");
            Y204ValveControl.IsControlValve.initializeNoException("FALSE");
            Y204ValveControl.RangeOutMin.initializeNoException("0.0");
            Y204ValveControl.RangeOutMax.initializeNoException("0.0");
            Y204ValveControl.RequestValue.initializeNoException("0.0");
            Y501ValveControl.IsControlValve.initializeNoException("FALSE");
            Y501ValveControl.RangeOutMin.initializeNoException("0.0");
            Y501ValveControl.RangeOutMax.initializeNoException("0.0");
            Y501ValveControl.RequestValue.initializeNoException("0.0");
            Y404ValveControl.IsControlValve.initializeNoException("FALSE");
            Y404ValveControl.RangeOutMin.initializeNoException("0.0");
            Y404ValveControl.RangeOutMax.initializeNoException("0.0");
            Y404ValveControl.RequestValue.initializeNoException("0.0");
            Y401ValveControl.IsControlValve.initializeNoException("FALSE");
            Y401ValveControl.RangeOutMin.initializeNoException("0.0");
            Y401ValveControl.RangeOutMax.initializeNoException("0.0");
            Y401ValveControl.RequestValue.initializeNoException("0.0");
            Y303ValveControl.IsControlValve.initializeNoException("FALSE");
            Y303ValveControl.RangeOutMin.initializeNoException("0.0");
            Y303ValveControl.RangeOutMax.initializeNoException("0.0");
            Y303ValveControl.RequestValue.initializeNoException("0.0");
            Y403ValveControl.IsControlValve.initializeNoException("FALSE");
            Y403ValveControl.RangeOutMin.initializeNoException("0.0");
            Y403ValveControl.RangeOutMax.initializeNoException("0.0");
            Y403ValveControl.RequestValue.initializeNoException("0.0");
            Y402ValveControl.IsControlValve.initializeNoException("FALSE");
            Y402ValveControl.RangeOutMin.initializeNoException("0.0");
            Y402ValveControl.RangeOutMax.initializeNoException("0.0");
            Y402ValveControl.RequestValue.initializeNoException("0.0");
            Y305ValveControl.IsControlValve.initializeNoException("FALSE");
            Y305ValveControl.RangeOutMin.initializeNoException("0.0");
            Y305ValveControl.RangeOutMax.initializeNoException("0.0");
            Y305ValveControl.RequestValue.initializeNoException("0.0");
            Y302ValveControl.IsControlValve.initializeNoException("FALSE");
            Y302ValveControl.RangeOutMin.initializeNoException("0.0");
            Y302ValveControl.RangeOutMax.initializeNoException("0.0");
            Y302ValveControl.RequestValue.initializeNoException("0.0");
            Y301ValveControl.IsControlValve.initializeNoException("FALSE");
            Y301ValveControl.RangeOutMin.initializeNoException("0.0");
            Y301ValveControl.RangeOutMax.initializeNoException("0.0");
            Y301ValveControl.RequestValue.initializeNoException("0.0");
            M100Control.OM.initializeNoException("FALSE");
            M100Control.OM_Value.initializeNoException("0.0");
            M200Control.OM.initializeNoException("FALSE");
            M200Control.OM_Value.initializeNoException("0.0");
            Y102Control.OM.initializeNoException("FALSE");
            Y102Control.OM_Value.initializeNoException("0.0");
            Y201Control.OM.initializeNoException("FALSE");
            Y201Control.OM_Value.initializeNoException("0.0");
            E100Control.OM.initializeNoException("FALSE");
            E100Control.OM_ON.initializeNoException("FALSE");
            Y101Control.OM.initializeNoException("FALSE");
            Y101Control.OM_ON.initializeNoException("FALSE");
            Y103Control.OM.initializeNoException("FALSE");
            Y103Control.OM_ON.initializeNoException("FALSE");
            Y105Control.OM.initializeNoException("FALSE");
            Y105Control.OM_ON.initializeNoException("FALSE");
            Y202Control.OM.initializeNoException("FALSE");
            Y202Control.OM_ON.initializeNoException("FALSE");
            Y203Control.OM.initializeNoException("FALSE");
            Y203Control.OM_ON.initializeNoException("FALSE");
            Y204Control.OM.initializeNoException("FALSE");
            Y204Control.OM_ON.initializeNoException("FALSE");
            Y301Control.OM.initializeNoException("FALSE");
            Y301Control.OM_ON.initializeNoException("FALSE");
            Y302Control.OM.initializeNoException("FALSE");
            Y302Control.OM_ON.initializeNoException("FALSE");
            Y303Control.OM.initializeNoException("FALSE");
            Y303Control.OM_ON.initializeNoException("FALSE");
            Y305Control.OM.initializeNoException("FALSE");
            Y305Control.OM_ON.initializeNoException("FALSE");
            Y401Control.OM.initializeNoException("FALSE");
            Y401Control.OM_ON.initializeNoException("FALSE");
            Y402Control.OM.initializeNoException("FALSE");
            Y402Control.OM_ON.initializeNoException("FALSE");
            Y403Control.OM.initializeNoException("FALSE");
            Y403Control.OM_ON.initializeNoException("FALSE");
            Y404Control.OM.initializeNoException("FALSE");
            Y404Control.OM_ON.initializeNoException("FALSE");
            Y501Control.OM.initializeNoException("FALSE");
            Y501Control.OM_ON.initializeNoException("FALSE");
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK Service_ADIMeasure
     * @author wildai
     * @version 20150208/wildai
     */
    private class Service_ADIMeasure extends FBInstance
    {
        /** VAR AI */
        public REAL AI = new REAL();
        /** VAR DIH */
        public BOOL DIH = new BOOL();
        /** VAR DIL */
        public BOOL DIL = new BOOL();
        /** VAR PRESET_HH */
        public REAL PRESET_HH = new REAL();
        /** VAR PRESET_H */
        public REAL PRESET_H = new REAL();
        /** VAR PRESET_L */
        public REAL PRESET_L = new REAL();
        /** VAR PRESET_LL */
        public REAL PRESET_LL = new REAL();
        /** VAR PRESET_MINAI */
        public REAL PRESET_MINAI = new REAL();
        /** VAR PRESET_MAXAI */
        public REAL PRESET_MAXAI = new REAL();
        /** VAR AlarmHH */
        public BOOL AlarmHH = new BOOL();
        /** VAR AlarmH */
        public BOOL AlarmH = new BOOL();
        /** VAR AlarmL */
        public BOOL AlarmL = new BOOL();
        /** VAR AlarmLL */
        public BOOL AlarmLL = new BOOL();
        /** VAR SensorFault */
        public BOOL SensorFault = new BOOL();
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
            if ("AlarmHH".equals(s)) return AlarmHH;
            if ("AlarmH".equals(s)) return AlarmH;
            if ("AlarmL".equals(s)) return AlarmL;
            if ("AlarmLL".equals(s)) return AlarmLL;
            if ("SensorFault".equals(s)) return SensorFault;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("AI".equals(ivName)) connect_AI((REAL) newIV);
            else if ("DIH".equals(ivName)) connect_DIH((BOOL) newIV);
            else if ("DIL".equals(ivName)) connect_DIL((BOOL) newIV);
            else if ("PRESET_HH".equals(ivName)) connect_PRESET_HH((REAL) newIV);
            else if ("PRESET_H".equals(ivName)) connect_PRESET_H((REAL) newIV);
            else if ("PRESET_L".equals(ivName)) connect_PRESET_L((REAL) newIV);
            else if ("PRESET_LL".equals(ivName)) connect_PRESET_LL((REAL) newIV);
            else if ("PRESET_MINAI".equals(ivName)) connect_PRESET_MINAI((REAL) newIV);
            else if ("PRESET_MAXAI".equals(ivName)) connect_PRESET_MAXAI((REAL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable AI
         * @param newIV The variable to connect
         */
        public void connect_AI(REAL newIV) {
            AI = newIV;
        }

        /** Connect the given variable to the input variable DIH
         * @param newIV The variable to connect
         */
        public void connect_DIH(BOOL newIV) {
            DIH = newIV;
        }

        /** Connect the given variable to the input variable DIL
         * @param newIV The variable to connect
         */
        public void connect_DIL(BOOL newIV) {
            DIL = newIV;
        }

        /** Connect the given variable to the input variable PRESET_HH
         * @param newIV The variable to connect
         */
        public void connect_PRESET_HH(REAL newIV) {
            PRESET_HH = newIV;
        }

        /** Connect the given variable to the input variable PRESET_H
         * @param newIV The variable to connect
         */
        public void connect_PRESET_H(REAL newIV) {
            PRESET_H = newIV;
        }

        /** Connect the given variable to the input variable PRESET_L
         * @param newIV The variable to connect
         */
        public void connect_PRESET_L(REAL newIV) {
            PRESET_L = newIV;
        }

        /** Connect the given variable to the input variable PRESET_LL
         * @param newIV The variable to connect
         */
        public void connect_PRESET_LL(REAL newIV) {
            PRESET_LL = newIV;
        }

        /** Connect the given variable to the input variable PRESET_MINAI
         * @param newIV The variable to connect
         */
        public void connect_PRESET_MINAI(REAL newIV) {
            PRESET_MINAI = newIV;
        }

        /** Connect the given variable to the input variable PRESET_MAXAI
         * @param newIV The variable to connect
         */
        public void connect_PRESET_MAXAI(REAL newIV) {
            PRESET_MAXAI = newIV;
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
            transition_Service_ADIMeasure_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_Service_ADIMeasure_1();
        }

        /** The default constructor. */
        public Service_ADIMeasure() {
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
                transition_Service_ADIMeasure_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_Service_ADIMeasure_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            SensorFault.value = false;
            AlarmHH.value = false;
            AlarmH.value = false;
            AlarmL.value = false;
            AlarmLL.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;
            if (((DIH.value & DIL.value) | (AI.value >= PRESET_HH.value & !DIH.value) | (AI.value <= PRESET_LL.value & !DIL.value) | (AI.value > PRESET_MAXAI.value) | (AI.value < PRESET_MINAI.value))) {
                SensorFault.value = true;
                AlarmHH.value = false;
                AlarmH.value = false;
                AlarmL.value = false;
                AlarmLL.value = false;
            }
            else {
                SensorFault.value = false;
                if (AI.value >= PRESET_HH.value | DIH.value) {
                    AlarmHH.value = true;
                    AlarmH.value = false;
                    AlarmL.value = false;
                    AlarmLL.value = false;
                }
                else if (AI.value < PRESET_H.value & AI.value >= PRESET_H.value) {
                    AlarmHH.value = false;
                    AlarmH.value = true;
                    AlarmL.value = false;
                    AlarmLL.value = false;
                }
                else if (AI.value <= PRESET_L.value & AI.value > PRESET_LL.value) {
                    AlarmHH.value = false;
                    AlarmH.value = false;
                    AlarmL.value = true;
                    AlarmLL.value = false;
                }
                else if (AI.value <= PRESET_LL.value | DIL.value) {
                    AlarmHH.value = false;
                    AlarmH.value = false;
                    AlarmL.value = false;
                    AlarmLL.value = true;
                }
                else {
                    AlarmHH.value = false;
                    AlarmH.value = false;
                    AlarmL.value = false;
                    AlarmLL.value = false;
                };
            };
        }
    }
    private void transition_Service_ADIMeasure_0() {
    }

    private void transition_Service_ADIMeasure_1() {
    }

    private void transition_Service_ADIMeasure_2() {
    }

    private void transition_Service_ADIMeasure_3() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK Service_AIMeasure
     * @author wildai
     * @version 20150208/wildai
     */
    private class Service_AIMeasure extends FBInstance
    {
        /** VAR AI */
        public REAL AI = new REAL();
        /** VAR PRESET_HH */
        public REAL PRESET_HH = new REAL();
        /** VAR PRESET_H */
        public REAL PRESET_H = new REAL();
        /** VAR PRESET_L */
        public REAL PRESET_L = new REAL();
        /** VAR PRESET_LL */
        public REAL PRESET_LL = new REAL();
        /** VAR PRESET_MINAI */
        public REAL PRESET_MINAI = new REAL();
        /** VAR PRESET_MAXAI */
        public REAL PRESET_MAXAI = new REAL();
        /** VAR AlarmHH */
        public BOOL AlarmHH = new BOOL();
        /** VAR AlarmH */
        public BOOL AlarmH = new BOOL();
        /** VAR AlarmL */
        public BOOL AlarmL = new BOOL();
        /** VAR AlarmLL */
        public BOOL AlarmLL = new BOOL();
        /** VAR SensorFault */
        public BOOL SensorFault = new BOOL();
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
            if ("AlarmHH".equals(s)) return AlarmHH;
            if ("AlarmH".equals(s)) return AlarmH;
            if ("AlarmL".equals(s)) return AlarmL;
            if ("AlarmLL".equals(s)) return AlarmLL;
            if ("SensorFault".equals(s)) return SensorFault;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("AI".equals(ivName)) connect_AI((REAL) newIV);
            else if ("PRESET_HH".equals(ivName)) connect_PRESET_HH((REAL) newIV);
            else if ("PRESET_H".equals(ivName)) connect_PRESET_H((REAL) newIV);
            else if ("PRESET_L".equals(ivName)) connect_PRESET_L((REAL) newIV);
            else if ("PRESET_LL".equals(ivName)) connect_PRESET_LL((REAL) newIV);
            else if ("PRESET_MINAI".equals(ivName)) connect_PRESET_MINAI((REAL) newIV);
            else if ("PRESET_MAXAI".equals(ivName)) connect_PRESET_MAXAI((REAL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable AI
         * @param newIV The variable to connect
         */
        public void connect_AI(REAL newIV) {
            AI = newIV;
        }

        /** Connect the given variable to the input variable PRESET_HH
         * @param newIV The variable to connect
         */
        public void connect_PRESET_HH(REAL newIV) {
            PRESET_HH = newIV;
        }

        /** Connect the given variable to the input variable PRESET_H
         * @param newIV The variable to connect
         */
        public void connect_PRESET_H(REAL newIV) {
            PRESET_H = newIV;
        }

        /** Connect the given variable to the input variable PRESET_L
         * @param newIV The variable to connect
         */
        public void connect_PRESET_L(REAL newIV) {
            PRESET_L = newIV;
        }

        /** Connect the given variable to the input variable PRESET_LL
         * @param newIV The variable to connect
         */
        public void connect_PRESET_LL(REAL newIV) {
            PRESET_LL = newIV;
        }

        /** Connect the given variable to the input variable PRESET_MINAI
         * @param newIV The variable to connect
         */
        public void connect_PRESET_MINAI(REAL newIV) {
            PRESET_MINAI = newIV;
        }

        /** Connect the given variable to the input variable PRESET_MAXAI
         * @param newIV The variable to connect
         */
        public void connect_PRESET_MAXAI(REAL newIV) {
            PRESET_MAXAI = newIV;
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
            transition_Service_AIMeasure_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_Service_AIMeasure_1();
        }

        /** The default constructor. */
        public Service_AIMeasure() {
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
                transition_Service_AIMeasure_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_Service_AIMeasure_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            SensorFault.value = false;
            AlarmHH.value = false;
            AlarmH.value = false;
            AlarmL.value = false;
            AlarmLL.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;
            if (AI.value < PRESET_MINAI.value | AI.value > PRESET_MAXAI.value) {
                SensorFault.value = true;
                AlarmHH.value = false;
                AlarmH.value = false;
                AlarmL.value = false;
                AlarmLL.value = false;
            }
            else {
                SensorFault.value = false;
                if (AI.value >= PRESET_HH.value) {
                    AlarmHH.value = true;
                    AlarmH.value = false;
                    AlarmL.value = false;
                    AlarmLL.value = false;
                }
                else if (AI.value < PRESET_H.value & AI.value >= PRESET_H.value) {
                    AlarmHH.value = false;
                    AlarmH.value = true;
                    AlarmL.value = false;
                    AlarmLL.value = false;
                }
                else if (AI.value <= PRESET_L.value & AI.value > PRESET_LL.value) {
                    AlarmHH.value = false;
                    AlarmH.value = false;
                    AlarmL.value = true;
                    AlarmLL.value = false;
                }
                else if (AI.value <= PRESET_LL.value) {
                    AlarmHH.value = false;
                    AlarmH.value = false;
                    AlarmL.value = false;
                    AlarmLL.value = true;
                }
                else {
                    AlarmHH.value = false;
                    AlarmH.value = false;
                    AlarmL.value = false;
                    AlarmLL.value = false;
                };
            };
        }
    }
    private void transition_Service_AIMeasure_0() {
    }

    private void transition_Service_AIMeasure_1() {
    }

    private void transition_Service_AIMeasure_2() {
    }

    private void transition_Service_AIMeasure_3() {
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("Ready".equals(s)) return Ready;
            if ("OverPresuure".equals(s)) return OverPresuure;
            if ("InfeedEnabled".equals(s)) return InfeedEnabled;
            if ("OutfeedEnabled".equals(s)) return OutfeedEnabled;
            if ("HeatEnabled".equals(s)) return HeatEnabled;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("TempSensorIsConfigured".equals(ivName)) connect_TempSensorIsConfigured((BOOL) newIV);
            else if ("TempSensorHHAlarm".equals(ivName)) connect_TempSensorHHAlarm((BOOL) newIV);
            else if ("TempSensorHealthy".equals(ivName)) connect_TempSensorHealthy((BOOL) newIV);
            else if ("PressureSensorIsConfigured".equals(ivName)) connect_PressureSensorIsConfigured((BOOL) newIV);
            else if ("PressureSensorHHAlarm".equals(ivName)) connect_PressureSensorHHAlarm((BOOL) newIV);
            else if ("PressureSensorHealthy".equals(ivName)) connect_PressureSensorHealthy((BOOL) newIV);
            else if ("WaterLevelSensorHighIsConfigured".equals(ivName)) connect_WaterLevelSensorHighIsConfigured((BOOL) newIV);
            else if ("WaterLevelSensorHHAlarm".equals(ivName)) connect_WaterLevelSensorHHAlarm((BOOL) newIV);
            else if ("WaterLevelSensorHighHealthy".equals(ivName)) connect_WaterLevelSensorHighHealthy((BOOL) newIV);
            else if ("WaterLevelSensorOverflowIsConfigured".equals(ivName)) connect_WaterLevelSensorOverflowIsConfigured((BOOL) newIV);
            else if ("WaterLevelSensorOverflowAlarm".equals(ivName)) connect_WaterLevelSensorOverflowAlarm((BOOL) newIV);
            else if ("WaterLevelSensorOverflowHealthy".equals(ivName)) connect_WaterLevelSensorOverflowHealthy((BOOL) newIV);
            else if ("WaterLevelSensorLowIsConfigured".equals(ivName)) connect_WaterLevelSensorLowIsConfigured((BOOL) newIV);
            else if ("WaterLevelSensorLLAlarm".equals(ivName)) connect_WaterLevelSensorLLAlarm((BOOL) newIV);
            else if ("WaterLevelSensorLowHealthy".equals(ivName)) connect_WaterLevelSensorLowHealthy((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable TempSensorIsConfigured
         * @param newIV The variable to connect
         */
        public void connect_TempSensorIsConfigured(BOOL newIV) {
            TempSensorIsConfigured = newIV;
        }

        /** Connect the given variable to the input variable TempSensorHHAlarm
         * @param newIV The variable to connect
         */
        public void connect_TempSensorHHAlarm(BOOL newIV) {
            TempSensorHHAlarm = newIV;
        }

        /** Connect the given variable to the input variable TempSensorHealthy
         * @param newIV The variable to connect
         */
        public void connect_TempSensorHealthy(BOOL newIV) {
            TempSensorHealthy = newIV;
        }

        /** Connect the given variable to the input variable PressureSensorIsConfigured
         * @param newIV The variable to connect
         */
        public void connect_PressureSensorIsConfigured(BOOL newIV) {
            PressureSensorIsConfigured = newIV;
        }

        /** Connect the given variable to the input variable PressureSensorHHAlarm
         * @param newIV The variable to connect
         */
        public void connect_PressureSensorHHAlarm(BOOL newIV) {
            PressureSensorHHAlarm = newIV;
        }

        /** Connect the given variable to the input variable PressureSensorHealthy
         * @param newIV The variable to connect
         */
        public void connect_PressureSensorHealthy(BOOL newIV) {
            PressureSensorHealthy = newIV;
        }

        /** Connect the given variable to the input variable WaterLevelSensorHighIsConfigured
         * @param newIV The variable to connect
         */
        public void connect_WaterLevelSensorHighIsConfigured(BOOL newIV) {
            WaterLevelSensorHighIsConfigured = newIV;
        }

        /** Connect the given variable to the input variable WaterLevelSensorHHAlarm
         * @param newIV The variable to connect
         */
        public void connect_WaterLevelSensorHHAlarm(BOOL newIV) {
            WaterLevelSensorHHAlarm = newIV;
        }

        /** Connect the given variable to the input variable WaterLevelSensorHighHealthy
         * @param newIV The variable to connect
         */
        public void connect_WaterLevelSensorHighHealthy(BOOL newIV) {
            WaterLevelSensorHighHealthy = newIV;
        }

        /** Connect the given variable to the input variable WaterLevelSensorOverflowIsConfigured
         * @param newIV The variable to connect
         */
        public void connect_WaterLevelSensorOverflowIsConfigured(BOOL newIV) {
            WaterLevelSensorOverflowIsConfigured = newIV;
        }

        /** Connect the given variable to the input variable WaterLevelSensorOverflowAlarm
         * @param newIV The variable to connect
         */
        public void connect_WaterLevelSensorOverflowAlarm(BOOL newIV) {
            WaterLevelSensorOverflowAlarm = newIV;
        }

        /** Connect the given variable to the input variable WaterLevelSensorOverflowHealthy
         * @param newIV The variable to connect
         */
        public void connect_WaterLevelSensorOverflowHealthy(BOOL newIV) {
            WaterLevelSensorOverflowHealthy = newIV;
        }

        /** Connect the given variable to the input variable WaterLevelSensorLowIsConfigured
         * @param newIV The variable to connect
         */
        public void connect_WaterLevelSensorLowIsConfigured(BOOL newIV) {
            WaterLevelSensorLowIsConfigured = newIV;
        }

        /** Connect the given variable to the input variable WaterLevelSensorLLAlarm
         * @param newIV The variable to connect
         */
        public void connect_WaterLevelSensorLLAlarm(BOOL newIV) {
            WaterLevelSensorLLAlarm = newIV;
        }

        /** Connect the given variable to the input variable WaterLevelSensorLowHealthy
         * @param newIV The variable to connect
         */
        public void connect_WaterLevelSensorLowHealthy(BOOL newIV) {
            WaterLevelSensorLowHealthy = newIV;
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
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_PIDControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_PIDControl extends FBInstance
    {
        /** VAR AutoMode */
        public BOOL AutoMode = new BOOL();
        /** VAR PV */
        public REAL PV = new REAL();
        /** VAR SP */
        public REAL SP = new REAL();
        /** VAR gain */
        public REAL gain = new REAL();
        /** VAR rate */
        public REAL rate = new REAL();
        /** VAR reset */
        public REAL reset = new REAL();
        /** VAR sample */
        public REAL sample = new REAL();
        /** VAR Mode */
        public BOOL Mode = new BOOL();
        /** VAR OUT */
        public REAL OUT = new REAL();
        /** VAR SPin */
        public REAL SPin = new REAL();
        /** VAR PVscl */
        public REAL PVscl = new REAL();
        /** VAR SPscl */
        public REAL SPscl = new REAL();
        /** VAR OUTscl */
        public REAL OUTscl = new REAL();
        /** VAR error */
        public REAL error = new REAL();
        /** VAR bias */
        public REAL bias = new REAL();
        /** VAR PVold */
        public REAL PVold = new REAL();
        /** VAR I_Coeff */
        public REAL I_Coeff = new REAL();
        /** VAR D_Coeff */
        public REAL D_Coeff = new REAL();
        /** VAR curMode */
        public BOOL curMode = new BOOL();
        /** VAR firstCycle */
        public BOOL firstCycle = new BOOL();
        /** VAR Mp */
        public REAL Mp = new REAL();
        /** VAR Mi */
        public REAL Mi = new REAL();
        /** VAR Md */
        public REAL Md = new REAL();
        /** VAR Ma */
        public REAL Ma = new REAL();
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
            if ("Mode".equals(s)) return Mode;
            if ("OUT".equals(s)) return OUT;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("AutoMode".equals(ivName)) connect_AutoMode((BOOL) newIV);
            else if ("PV".equals(ivName)) connect_PV((REAL) newIV);
            else if ("SP".equals(ivName)) connect_SP((REAL) newIV);
            else if ("gain".equals(ivName)) connect_gain((REAL) newIV);
            else if ("rate".equals(ivName)) connect_rate((REAL) newIV);
            else if ("reset".equals(ivName)) connect_reset((REAL) newIV);
            else if ("sample".equals(ivName)) connect_sample((REAL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable AutoMode
         * @param newIV The variable to connect
         */
        public void connect_AutoMode(BOOL newIV) {
            AutoMode = newIV;
        }

        /** Connect the given variable to the input variable PV
         * @param newIV The variable to connect
         */
        public void connect_PV(REAL newIV) {
            PV = newIV;
        }

        /** Connect the given variable to the input variable SP
         * @param newIV The variable to connect
         */
        public void connect_SP(REAL newIV) {
            SP = newIV;
        }

        /** Connect the given variable to the input variable gain
         * @param newIV The variable to connect
         */
        public void connect_gain(REAL newIV) {
            gain = newIV;
        }

        /** Connect the given variable to the input variable rate
         * @param newIV The variable to connect
         */
        public void connect_rate(REAL newIV) {
            rate = newIV;
        }

        /** Connect the given variable to the input variable reset
         * @param newIV The variable to connect
         */
        public void connect_reset(REAL newIV) {
            reset = newIV;
        }

        /** Connect the given variable to the input variable sample
         * @param newIV The variable to connect
         */
        public void connect_sample(REAL newIV) {
            sample = newIV;
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
            transition_FB_PIDControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_FB_PIDControl_1();
        }

        /** The default constructor. */
        public FB_PIDControl() {
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
                transition_FB_PIDControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_FB_PIDControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            Mode.value = false;
            OUT.value = (float) (0.0);
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            /*PrecalculatePIDcofeeicients*/
            I_Coeff.value = (float) (0.0);
            SPin.value = (float) (SP.value);
            if (reset.value != 0) {
                I_Coeff.value = (float) (sample.value / reset.value);
            };
            D_Coeff.value = (float) (rate.value / sample.value);

            /*MultiplyI,Dcofficeintsbygain.valueif(gain.valueisused*/
            if (gain.value != 0) {
                I_Coeff.value = (float) (I_Coeff.value * gain.value);
                D_Coeff.value = (float) (D_Coeff.value * gain.value);
            };

            /*Auto->ManualTransition*/
            if (((!AutoMode.value) & curMode.value)) {
                firstCycle.value = true;
                curMode.value = false;
                Mode.value = false;
                /*Manual->AutoTransition*/
            }
            else if ((AutoMode.value & (!curMode.value))) {
                bias.value = (float) (OUT.value / 27648);
                SPin.value = (float) (PV.value);
                firstCycle.value = true;
                curMode.value = true;
                Mode.value = true;
            };

            if (curMode.value) {
                /*ScalePV.valueif(>100%){clampat100%,if(PV.value<0%){clamp; .value<=0%*/
                if (PV.value <= 0) {
                    PVscl.value = (float) (0.0);
                }
                else if (PV.value > 27648) {
                    PVscl.value = (float) (1.0);
                }
                else {
                    PVscl.value = (float) (PV.value / 27648);
                };

                /*ScaleSetpointif(SP.value>100%){clamp; .value<=100%,if(SP.value<0%){clamp; .value<=0%*/
                if (SPin.value < 0) {
                    SPscl.value = (float) (0.0);
                }
                else if (SPin.value >= 27648) {
                    SPscl.value = (float) (1.0);
                }
                else {
                    SPscl.value = (float) (SPin.value / 27648);
                };

                /*CalculateError*/
                error.value = (float) (SPin.value - PV.value);
                /*CalculatePIDterms*/
                Mp.value = (float) (gain.value * error.value);
                Mi.value = (float) (bias.value + (I_Coeff.value * error.value));
                Md.value = (float) (0.0);

                /*if(derivativeused){calculateMd.value*/
                if (((rate.value != 0) & (!firstCycle.value))) {
                    Md.value = (float) (D_Coeff.value * (PVold.value - PV.value));
                };

                /*Calcuulateprovisionaloutput(beforebias.valueclamping)*/
                PVold.value = (float) (PVscl.value);
                Ma.value = (float) (Mp.value + Md.value);
                OUT.value = (float) (Ma.value + Mi.value);

                /*BiasClamping:if(Output>100%,clamp&backcalculatebias.value*/
                if (OUT.value > 1) {
                    OUTscl.value = (float) (1.0);
                    Mi.value = (float) (1.0 - Ma.value);
                }
                else if (OUT.value < 0) {
                    OUTscl.value = (float) (0.0);
                    Mi.value = (float) (0.0 - Ma.value);
                };

                /*Clampbias.value; .value<=0; .value<=1range*/
                if (I_Coeff.value != 0.0) {
                    if (Mi.value > 1.0) {
                        Mi.value = (float) (1.0);
                    }
                    else if (Mi.value < 0.0) {
                        Mi.value = (float) (0.0);
                    }
                    else {
                        bias.value = (float) (Mi.value);
                    };
                };

                /*Resetfirstcycleflag&unscaleoutput*/
                firstCycle.value = false;
                OUT.value = (float) (OUTscl.value * 27648);
            };
        }
    }
    private void transition_FB_PIDControl_0() {
    }

    private void transition_FB_PIDControl_1() {
    }

    private void transition_FB_PIDControl_2() {
    }

    private void transition_FB_PIDControl_3() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_SequenceControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_SequenceControl extends FBInstance
    {
        /** VAR T100_Overflow */
        public BOOL T100_Overflow = new BOOL();
        /** VAR T100_Underflow */
        public BOOL T100_Underflow = new BOOL();
        /** VAR T100_Overheat */
        public BOOL T100_Overheat = new BOOL();
        /** VAR T200_Overflow */
        public BOOL T200_Overflow = new BOOL();
        /** VAR T200_Underflow */
        public BOOL T200_Underflow = new BOOL();
        /** VAR T300_Overflow */
        public BOOL T300_Overflow = new BOOL();
        /** VAR T300_Underflow */
        public BOOL T300_Underflow = new BOOL();
        /** VAR T300_Overheat */
        public BOOL T300_Overheat = new BOOL();
        /** VAR T300_OverPressure */
        public BOOL T300_OverPressure = new BOOL();
        /** VAR T400_Overflow */
        public BOOL T400_Overflow = new BOOL();
        /** VAR T400_Underflow */
        public BOOL T400_Underflow = new BOOL();
        /** VAR FillingSeqEnable */
        public BOOL FillingSeqEnable = new BOOL();
        /** VAR StartSeqEnable */
        public BOOL StartSeqEnable = new BOOL();
        /** VAR ShutdownSeqEnable */
        public BOOL ShutdownSeqEnable = new BOOL();
        /** VAR EmptyingSeqEnable */
        public BOOL EmptyingSeqEnable = new BOOL();
        /** VAR Y101_Open */
        public BOOL Y101_Open = new BOOL();
        /** VAR Y102_Open */
        public BOOL Y102_Open = new BOOL();
        /** VAR Y103_Open */
        public BOOL Y103_Open = new BOOL();
        /** VAR Y105_Open */
        public BOOL Y105_Open = new BOOL();
        /** VAR Y201_Open */
        public BOOL Y201_Open = new BOOL();
        /** VAR Y202_Open */
        public BOOL Y202_Open = new BOOL();
        /** VAR Y203_Open */
        public BOOL Y203_Open = new BOOL();
        /** VAR Y204_Open */
        public BOOL Y204_Open = new BOOL();
        /** VAR Y301_Open */
        public BOOL Y301_Open = new BOOL();
        /** VAR Y302_Open */
        public BOOL Y302_Open = new BOOL();
        /** VAR Y303_Open */
        public BOOL Y303_Open = new BOOL();
        /** VAR Y305_Open */
        public BOOL Y305_Open = new BOOL();
        /** VAR Y401_Open */
        public BOOL Y401_Open = new BOOL();
        /** VAR Y402_Open */
        public BOOL Y402_Open = new BOOL();
        /** VAR Y403_Open */
        public BOOL Y403_Open = new BOOL();
        /** VAR Y404_Open */
        public BOOL Y404_Open = new BOOL();
        /** VAR Y501_Open */
        public BOOL Y501_Open = new BOOL();
        /** VAR E100_On */
        public BOOL E100_On = new BOOL();
        /** VAR M100_On */
        public BOOL M100_On = new BOOL();
        /** VAR M200_On */
        public BOOL M200_On = new BOOL();
        /** VAR FillingSeqComplete */
        public BOOL FillingSeqComplete = new BOOL();
        /** VAR StartSeqComplete */
        public BOOL StartSeqComplete = new BOOL();
        /** VAR EmptyingComplete */
        public BOOL EmptyingComplete = new BOOL();
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
            if ("Y101_Open".equals(s)) return Y101_Open;
            if ("Y102_Open".equals(s)) return Y102_Open;
            if ("Y103_Open".equals(s)) return Y103_Open;
            if ("Y105_Open".equals(s)) return Y105_Open;
            if ("Y201_Open".equals(s)) return Y201_Open;
            if ("Y202_Open".equals(s)) return Y202_Open;
            if ("Y203_Open".equals(s)) return Y203_Open;
            if ("Y204_Open".equals(s)) return Y204_Open;
            if ("Y301_Open".equals(s)) return Y301_Open;
            if ("Y302_Open".equals(s)) return Y302_Open;
            if ("Y303_Open".equals(s)) return Y303_Open;
            if ("Y305_Open".equals(s)) return Y305_Open;
            if ("Y401_Open".equals(s)) return Y401_Open;
            if ("Y402_Open".equals(s)) return Y402_Open;
            if ("Y403_Open".equals(s)) return Y403_Open;
            if ("Y404_Open".equals(s)) return Y404_Open;
            if ("Y501_Open".equals(s)) return Y501_Open;
            if ("E100_On".equals(s)) return E100_On;
            if ("M100_On".equals(s)) return M100_On;
            if ("M200_On".equals(s)) return M200_On;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("T100_Overflow".equals(ivName)) connect_T100_Overflow((BOOL) newIV);
            else if ("T100_Underflow".equals(ivName)) connect_T100_Underflow((BOOL) newIV);
            else if ("T100_Overheat".equals(ivName)) connect_T100_Overheat((BOOL) newIV);
            else if ("T200_Overflow".equals(ivName)) connect_T200_Overflow((BOOL) newIV);
            else if ("T200_Underflow".equals(ivName)) connect_T200_Underflow((BOOL) newIV);
            else if ("T300_Overflow".equals(ivName)) connect_T300_Overflow((BOOL) newIV);
            else if ("T300_Underflow".equals(ivName)) connect_T300_Underflow((BOOL) newIV);
            else if ("T300_Overheat".equals(ivName)) connect_T300_Overheat((BOOL) newIV);
            else if ("T300_OverPressure".equals(ivName)) connect_T300_OverPressure((BOOL) newIV);
            else if ("T400_Overflow".equals(ivName)) connect_T400_Overflow((BOOL) newIV);
            else if ("T400_Underflow".equals(ivName)) connect_T400_Underflow((BOOL) newIV);
            else if ("FillingSeqEnable".equals(ivName)) connect_FillingSeqEnable((BOOL) newIV);
            else if ("StartSeqEnable".equals(ivName)) connect_StartSeqEnable((BOOL) newIV);
            else if ("ShutdownSeqEnable".equals(ivName)) connect_ShutdownSeqEnable((BOOL) newIV);
            else if ("EmptyingSeqEnable".equals(ivName)) connect_EmptyingSeqEnable((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable T100_Overflow
         * @param newIV The variable to connect
         */
        public void connect_T100_Overflow(BOOL newIV) {
            T100_Overflow = newIV;
        }

        /** Connect the given variable to the input variable T100_Underflow
         * @param newIV The variable to connect
         */
        public void connect_T100_Underflow(BOOL newIV) {
            T100_Underflow = newIV;
        }

        /** Connect the given variable to the input variable T100_Overheat
         * @param newIV The variable to connect
         */
        public void connect_T100_Overheat(BOOL newIV) {
            T100_Overheat = newIV;
        }

        /** Connect the given variable to the input variable T200_Overflow
         * @param newIV The variable to connect
         */
        public void connect_T200_Overflow(BOOL newIV) {
            T200_Overflow = newIV;
        }

        /** Connect the given variable to the input variable T200_Underflow
         * @param newIV The variable to connect
         */
        public void connect_T200_Underflow(BOOL newIV) {
            T200_Underflow = newIV;
        }

        /** Connect the given variable to the input variable T300_Overflow
         * @param newIV The variable to connect
         */
        public void connect_T300_Overflow(BOOL newIV) {
            T300_Overflow = newIV;
        }

        /** Connect the given variable to the input variable T300_Underflow
         * @param newIV The variable to connect
         */
        public void connect_T300_Underflow(BOOL newIV) {
            T300_Underflow = newIV;
        }

        /** Connect the given variable to the input variable T300_Overheat
         * @param newIV The variable to connect
         */
        public void connect_T300_Overheat(BOOL newIV) {
            T300_Overheat = newIV;
        }

        /** Connect the given variable to the input variable T300_OverPressure
         * @param newIV The variable to connect
         */
        public void connect_T300_OverPressure(BOOL newIV) {
            T300_OverPressure = newIV;
        }

        /** Connect the given variable to the input variable T400_Overflow
         * @param newIV The variable to connect
         */
        public void connect_T400_Overflow(BOOL newIV) {
            T400_Overflow = newIV;
        }

        /** Connect the given variable to the input variable T400_Underflow
         * @param newIV The variable to connect
         */
        public void connect_T400_Underflow(BOOL newIV) {
            T400_Underflow = newIV;
        }

        /** Connect the given variable to the input variable FillingSeqEnable
         * @param newIV The variable to connect
         */
        public void connect_FillingSeqEnable(BOOL newIV) {
            FillingSeqEnable = newIV;
        }

        /** Connect the given variable to the input variable StartSeqEnable
         * @param newIV The variable to connect
         */
        public void connect_StartSeqEnable(BOOL newIV) {
            StartSeqEnable = newIV;
        }

        /** Connect the given variable to the input variable ShutdownSeqEnable
         * @param newIV The variable to connect
         */
        public void connect_ShutdownSeqEnable(BOOL newIV) {
            ShutdownSeqEnable = newIV;
        }

        /** Connect the given variable to the input variable EmptyingSeqEnable
         * @param newIV The variable to connect
         */
        public void connect_EmptyingSeqEnable(BOOL newIV) {
            EmptyingSeqEnable = newIV;
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
            transition_FB_SequenceControl_0();
        }
        private static final int index_FillingSeq = 2;
        private void state_FillingSeq() {
            eccState = index_FillingSeq;
            alg_FillingSeq_Action();
            CNF.serviceEvent(this);
        }
        private static final int index_WAIT = 3;
        private void state_WAIT() {
            eccState = index_WAIT;
            alg_Wait_Action();
            CNF.serviceEvent(this);
        }
        private static final int index_StartupSeq = 4;
        private void state_StartupSeq() {
            eccState = index_StartupSeq;
            alg_StartupSeq_Action();
            CNF.serviceEvent(this);
        }
        private static final int index_SupplySeq = 5;
        private void state_SupplySeq() {
            eccState = index_SupplySeq;
            alg_SupplySeq_Action();
            CNF.serviceEvent(this);
        }
        private static final int index_ShutdownSeq = 6;
        private void state_ShutdownSeq() {
            eccState = index_ShutdownSeq;
            alg_ShutdownSeq_Action();
            CNF.serviceEvent(this);
        }
        private static final int index_EmptyingSeq = 7;
        private void state_EmptyingSeq() {
            eccState = index_EmptyingSeq;
            alg_EmptyingSeq_Action();
            CNF.serviceEvent(this);
        }

        /** The default constructor. */
        public FB_SequenceControl() {
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
                transition_FB_SequenceControl_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START) && (FillingSeqEnable.value)) {
                state_FillingSeq();
                transition_FB_SequenceControl_2(); 
            }
            else if ((eccState == index_FillingSeq) && (FillingSeqComplete.value)) {
                state_WAIT();
                transition_FB_SequenceControl_3(); 
            }
            else if ((eccState == index_WAIT) && (StartSeqEnable.value)) {
                state_StartupSeq();
                transition_FB_SequenceControl_4(); 
            }
            else if ((eccState == index_StartupSeq) && (StartSeqComplete.value)) {
                state_SupplySeq();
                transition_FB_SequenceControl_5(); 
            }
            else if ((eccState == index_SupplySeq) && (ShutdownSeqEnable.value)) {
                state_ShutdownSeq();
                transition_FB_SequenceControl_6(); 
            }
            else if ((eccState == index_ShutdownSeq) && (EmptyingSeqEnable.value)) {
                state_EmptyingSeq();
                transition_FB_SequenceControl_7(); 
            }
            else if ((eccState == index_EmptyingSeq) && (EmptyingComplete.value)) {
                state_START();
                transition_FB_SequenceControl_8(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            Y101_Open.value = false;
            Y102_Open.value = false;
            Y103_Open.value = false;
            Y105_Open.value = false;
            Y201_Open.value = false;
            Y202_Open.value = false;
            Y203_Open.value = false;
            Y204_Open.value = true;/*for(OverPressure*/
            Y301_Open.value = false;
            Y302_Open.value = false;
            Y303_Open.value = false;
            Y305_Open.value = false;
            Y401_Open.value = false;
            Y402_Open.value = false;
            Y403_Open.value = false;
            Y404_Open.value = false;
            Y501_Open.value = false;
            E100_On.value = false;
            M100_On.value = false;
            M200_On.value = false;
        }

        /** ALGORITHM FillingSeq_Action IN ST*/
        public void alg_FillingSeq_Action() {
            ;

            Y101_Open.value = true;
            Y102_Open.value = true;
            M100_On.value = true;
            Y203_Open.value = true;
            Y201_Open.value = true;
            M200_On.value = true;
            Y303_Open.value = true;
            Y301_Open.value = true;

            FillingSeqComplete.value = !(T100_Underflow.value | T200_Underflow.value | T300_Underflow.value | T400_Underflow.value);
        }

        /** ALGORITHM EmptyingSeq_Action IN ST*/
        public void alg_EmptyingSeq_Action() {
            ;

            if (!T400_Underflow.value) {
                Y105_Open.value = true;
            };

            if (!T200_Underflow.value) {
                Y201_Open.value = true;
                M200_On.value = true;
                Y303_Open.value = true;
                Y301_Open.value = true;
            };

            if (!T300_Underflow.value) {
                Y305_Open.value = true;
                Y501_Open.value = true;
            }

            if (!T400_Underflow.value) {
                Y101_Open.value = true;
            };

            EmptyingComplete.value = T100_Underflow.value & T200_Underflow.value & T300_Underflow.value & T400_Underflow.value;
        }

        /** ALGORITHM ShutdownSeq_Action IN ST*/
        public void alg_ShutdownSeq_Action() {
            ;

            Y501_Open.value = false;
            E100_On.value = false;
            Y102_Open.value = false;
            M100_On.value = false;
            Y203_Open.value = false;
            Y201_Open.value = false;
            M200_On.value = false;
            Y303_Open.value = false;
            Y301_Open.value = false;
            Y305_Open.value = false;
        }

        /** ALGORITHM StartupSeq_Action IN ST*/
        public void alg_StartupSeq_Action() {
            ;

            Y101_Open.value = false;
            Y102_Open.value = false;
            Y103_Open.value = false;
            Y105_Open.value = false;
            Y201_Open.value = false;
            Y202_Open.value = false;
            Y203_Open.value = false;
            Y204_Open.value = true;/*for(OverPressure*/
            Y301_Open.value = false;
            Y302_Open.value = false;
            Y303_Open.value = false;
            Y305_Open.value = false;
            Y401_Open.value = false;
            Y402_Open.value = false;
            Y403_Open.value = false;
            Y404_Open.value = false;
            Y501_Open.value = false;
            E100_On.value = false;
            M100_On.value = false;
            M200_On.value = false;
        }

        /** ALGORITHM SupplySeq_Action IN ST*/
        public void alg_SupplySeq_Action() {
            ;

            Y501_Open.value = true;
        }

        /** ALGORITHM Wait_Action IN ST*/
        public void alg_Wait_Action() {
            ;

            Y101_Open.value = false;
            Y102_Open.value = false;
            M100_On.value = false;
            Y203_Open.value = false;
            Y201_Open.value = false;
            M200_On.value = false;
            Y303_Open.value = false;
            Y301_Open.value = false;
        }
    }
    private void transition_FB_SequenceControl_0() {
    }

    private void transition_FB_SequenceControl_1() {
    }

    private void transition_FB_SequenceControl_2() {
    }

    private void transition_FB_SequenceControl_3() {
    }

    private void transition_FB_SequenceControl_4() {
    }

    private void transition_FB_SequenceControl_5() {
    }

    private void transition_FB_SequenceControl_6() {
    }

    private void transition_FB_SequenceControl_7() {
    }

    private void transition_FB_SequenceControl_8() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_InterlockControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_InterlockControl extends FBInstance
    {
        /** VAR T100_Overflow */
        public BOOL T100_Overflow = new BOOL();
        /** VAR T100_Underflow */
        public BOOL T100_Underflow = new BOOL();
        /** VAR T100_Overheat */
        public BOOL T100_Overheat = new BOOL();
        /** VAR T200_Overflow */
        public BOOL T200_Overflow = new BOOL();
        /** VAR T200_Underflow */
        public BOOL T200_Underflow = new BOOL();
        /** VAR T300_Overflow */
        public BOOL T300_Overflow = new BOOL();
        /** VAR T300_Underflow */
        public BOOL T300_Underflow = new BOOL();
        /** VAR T300_Overheat */
        public BOOL T300_Overheat = new BOOL();
        /** VAR T300_OverPressure */
        public BOOL T300_OverPressure = new BOOL();
        /** VAR T400_Overflow */
        public BOOL T400_Overflow = new BOOL();
        /** VAR T400_Underflow */
        public BOOL T400_Underflow = new BOOL();
        /** VAR Y102_Closed */
        public BOOL Y102_Closed = new BOOL();
        /** VAR Y201_Closed */
        public BOOL Y201_Closed = new BOOL();
        /** VAR Y203_Closed */
        public BOOL Y203_Closed = new BOOL();
        /** VAR Y301_Closed */
        public BOOL Y301_Closed = new BOOL();
        /** VAR Y303_Closed */
        public BOOL Y303_Closed = new BOOL();
        /** VAR Y403_Closed */
        public BOOL Y403_Closed = new BOOL();
        /** VAR Y101_Open */
        public BOOL Y101_Open = new BOOL();
        /** VAR Y102_Open */
        public BOOL Y102_Open = new BOOL();
        /** VAR Y103_Open */
        public BOOL Y103_Open = new BOOL();
        /** VAR Y105_Open */
        public BOOL Y105_Open = new BOOL();
        /** VAR Y201_Open */
        public BOOL Y201_Open = new BOOL();
        /** VAR Y202_Open */
        public BOOL Y202_Open = new BOOL();
        /** VAR Y203_Open */
        public BOOL Y203_Open = new BOOL();
        /** VAR Y204_Open */
        public BOOL Y204_Open = new BOOL();
        /** VAR Y301_Open */
        public BOOL Y301_Open = new BOOL();
        /** VAR Y302_Open */
        public BOOL Y302_Open = new BOOL();
        /** VAR Y303_Open */
        public BOOL Y303_Open = new BOOL();
        /** VAR Y305_Open */
        public BOOL Y305_Open = new BOOL();
        /** VAR Y401_Open */
        public BOOL Y401_Open = new BOOL();
        /** VAR Y402_Open */
        public BOOL Y402_Open = new BOOL();
        /** VAR Y403_Open */
        public BOOL Y403_Open = new BOOL();
        /** VAR Y404_Open */
        public BOOL Y404_Open = new BOOL();
        /** VAR Y501_Open */
        public BOOL Y501_Open = new BOOL();
        /** VAR E100_On */
        public BOOL E100_On = new BOOL();
        /** VAR M100_On */
        public BOOL M100_On = new BOOL();
        /** VAR M200_On */
        public BOOL M200_On = new BOOL();
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
            if ("Y101_Open".equals(s)) return Y101_Open;
            if ("Y102_Open".equals(s)) return Y102_Open;
            if ("Y103_Open".equals(s)) return Y103_Open;
            if ("Y105_Open".equals(s)) return Y105_Open;
            if ("Y201_Open".equals(s)) return Y201_Open;
            if ("Y202_Open".equals(s)) return Y202_Open;
            if ("Y203_Open".equals(s)) return Y203_Open;
            if ("Y204_Open".equals(s)) return Y204_Open;
            if ("Y301_Open".equals(s)) return Y301_Open;
            if ("Y302_Open".equals(s)) return Y302_Open;
            if ("Y303_Open".equals(s)) return Y303_Open;
            if ("Y305_Open".equals(s)) return Y305_Open;
            if ("Y401_Open".equals(s)) return Y401_Open;
            if ("Y402_Open".equals(s)) return Y402_Open;
            if ("Y403_Open".equals(s)) return Y403_Open;
            if ("Y404_Open".equals(s)) return Y404_Open;
            if ("Y501_Open".equals(s)) return Y501_Open;
            if ("E100_On".equals(s)) return E100_On;
            if ("M100_On".equals(s)) return M100_On;
            if ("M200_On".equals(s)) return M200_On;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("T100_Overflow".equals(ivName)) connect_T100_Overflow((BOOL) newIV);
            else if ("T100_Underflow".equals(ivName)) connect_T100_Underflow((BOOL) newIV);
            else if ("T100_Overheat".equals(ivName)) connect_T100_Overheat((BOOL) newIV);
            else if ("T200_Overflow".equals(ivName)) connect_T200_Overflow((BOOL) newIV);
            else if ("T200_Underflow".equals(ivName)) connect_T200_Underflow((BOOL) newIV);
            else if ("T300_Overflow".equals(ivName)) connect_T300_Overflow((BOOL) newIV);
            else if ("T300_Underflow".equals(ivName)) connect_T300_Underflow((BOOL) newIV);
            else if ("T300_Overheat".equals(ivName)) connect_T300_Overheat((BOOL) newIV);
            else if ("T300_OverPressure".equals(ivName)) connect_T300_OverPressure((BOOL) newIV);
            else if ("T400_Overflow".equals(ivName)) connect_T400_Overflow((BOOL) newIV);
            else if ("T400_Underflow".equals(ivName)) connect_T400_Underflow((BOOL) newIV);
            else if ("Y102_Closed".equals(ivName)) connect_Y102_Closed((BOOL) newIV);
            else if ("Y201_Closed".equals(ivName)) connect_Y201_Closed((BOOL) newIV);
            else if ("Y203_Closed".equals(ivName)) connect_Y203_Closed((BOOL) newIV);
            else if ("Y301_Closed".equals(ivName)) connect_Y301_Closed((BOOL) newIV);
            else if ("Y303_Closed".equals(ivName)) connect_Y303_Closed((BOOL) newIV);
            else if ("Y403_Closed".equals(ivName)) connect_Y403_Closed((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable T100_Overflow
         * @param newIV The variable to connect
         */
        public void connect_T100_Overflow(BOOL newIV) {
            T100_Overflow = newIV;
        }

        /** Connect the given variable to the input variable T100_Underflow
         * @param newIV The variable to connect
         */
        public void connect_T100_Underflow(BOOL newIV) {
            T100_Underflow = newIV;
        }

        /** Connect the given variable to the input variable T100_Overheat
         * @param newIV The variable to connect
         */
        public void connect_T100_Overheat(BOOL newIV) {
            T100_Overheat = newIV;
        }

        /** Connect the given variable to the input variable T200_Overflow
         * @param newIV The variable to connect
         */
        public void connect_T200_Overflow(BOOL newIV) {
            T200_Overflow = newIV;
        }

        /** Connect the given variable to the input variable T200_Underflow
         * @param newIV The variable to connect
         */
        public void connect_T200_Underflow(BOOL newIV) {
            T200_Underflow = newIV;
        }

        /** Connect the given variable to the input variable T300_Overflow
         * @param newIV The variable to connect
         */
        public void connect_T300_Overflow(BOOL newIV) {
            T300_Overflow = newIV;
        }

        /** Connect the given variable to the input variable T300_Underflow
         * @param newIV The variable to connect
         */
        public void connect_T300_Underflow(BOOL newIV) {
            T300_Underflow = newIV;
        }

        /** Connect the given variable to the input variable T300_Overheat
         * @param newIV The variable to connect
         */
        public void connect_T300_Overheat(BOOL newIV) {
            T300_Overheat = newIV;
        }

        /** Connect the given variable to the input variable T300_OverPressure
         * @param newIV The variable to connect
         */
        public void connect_T300_OverPressure(BOOL newIV) {
            T300_OverPressure = newIV;
        }

        /** Connect the given variable to the input variable T400_Overflow
         * @param newIV The variable to connect
         */
        public void connect_T400_Overflow(BOOL newIV) {
            T400_Overflow = newIV;
        }

        /** Connect the given variable to the input variable T400_Underflow
         * @param newIV The variable to connect
         */
        public void connect_T400_Underflow(BOOL newIV) {
            T400_Underflow = newIV;
        }

        /** Connect the given variable to the input variable Y102_Closed
         * @param newIV The variable to connect
         */
        public void connect_Y102_Closed(BOOL newIV) {
            Y102_Closed = newIV;
        }

        /** Connect the given variable to the input variable Y201_Closed
         * @param newIV The variable to connect
         */
        public void connect_Y201_Closed(BOOL newIV) {
            Y201_Closed = newIV;
        }

        /** Connect the given variable to the input variable Y203_Closed
         * @param newIV The variable to connect
         */
        public void connect_Y203_Closed(BOOL newIV) {
            Y203_Closed = newIV;
        }

        /** Connect the given variable to the input variable Y301_Closed
         * @param newIV The variable to connect
         */
        public void connect_Y301_Closed(BOOL newIV) {
            Y301_Closed = newIV;
        }

        /** Connect the given variable to the input variable Y303_Closed
         * @param newIV The variable to connect
         */
        public void connect_Y303_Closed(BOOL newIV) {
            Y303_Closed = newIV;
        }

        /** Connect the given variable to the input variable Y403_Closed
         * @param newIV The variable to connect
         */
        public void connect_Y403_Closed(BOOL newIV) {
            Y403_Closed = newIV;
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
            transition_FB_InterlockControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_FB_InterlockControl_1();
        }

        /** The default constructor. */
        public FB_InterlockControl() {
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
                transition_FB_InterlockControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_FB_InterlockControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            Y101_Open.value = true;
            Y102_Open.value = true;
            Y103_Open.value = true;
            Y105_Open.value = true;
            Y201_Open.value = true;
            Y202_Open.value = true;
            Y203_Open.value = true;
            Y204_Open.value = true;
            Y301_Open.value = true;
            Y302_Open.value = true;
            Y303_Open.value = true;
            Y305_Open.value = true;
            Y401_Open.value = true;
            Y402_Open.value = true;
            Y403_Open.value = false;
            Y404_Open.value = true;
            Y501_Open.value = true;
            E100_On.value = true;
            M100_On.value = true;
            M200_On.value = true;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            /*Interlocksfor(Valve,Heater&Pump*/
            Y101_Open.value = true;
            Y102_Open.value = true;
            Y103_Open.value = true;
            Y105_Open.value = true;
            Y201_Open.value = true;
            Y202_Open.value = true;
            Y203_Open.value = true;
            Y204_Open.value = true;
            Y301_Open.value = true;
            Y302_Open.value = true;
            Y303_Open.value = true;
            Y305_Open.value = true;
            Y401_Open.value = true;
            Y402_Open.value = true;
            Y403_Open.value = false;
            Y404_Open.value = true;
            Y501_Open.value = true;
            E100_On.value = true;
            M100_On.value = true;
            M200_On.value = true;

            if (T100_Overflow.value | T400_Underflow.value) {
                Y101_Open.value = false;
            };

            if (T100_Underflow.value) {
                Y102_Open.value = false;
            };

            if (T100_Underflow.value | T300_Overflow.value) {
                Y103_Open.value = false;
            };

            if (T100_Underflow.value) {
                Y105_Open.value = false;
            };

            if (T200_Underflow.value) {
                Y201_Open.value = false;
            };

            if (T200_Underflow.value) {
                Y202_Open.value = false;
            };

            if (T200_Overflow.value) {
                Y203_Open.value = false;
            };

            if (T200_Overflow.value | T300_Underflow.value) {
                Y204_Open.value = false;
            };
            if (T300_OverPressure.value) {
                Y204_Open.value = true;
            };

            if (T300_Overflow.value) {
                Y301_Open.value = false;
            };

            if (T300_Overflow.value) {
                Y302_Open.value = false;
            };

            if (T300_Underflow.value) {
                Y305_Open.value = false;
            };

            if (T300_Underflow.value) {
                Y401_Open.value = false;
            };

            if (T200_Underflow.value | T400_Overflow.value) {
                Y402_Open.value = false;
            };

            if (T400_Underflow.value) {
                Y404_Open.value = false;
            };

            if (T100_Overflow.value) {
                Y501_Open.value = false;
            };

            if (T100_Overheat.value | T100_Underflow.value) {
                E100_On.value = false;
            };

            if (Y102_Closed.value | (Y203_Closed.value & Y403_Closed.value)) {
                M100_On.value = false;
            };

            if (Y301_Closed.value | Y303_Closed.value | Y201_Closed.value) {
                M200_On.value = false;
            };
        }
    }
    private void transition_FB_InterlockControl_0() {
    }

    private void transition_FB_InterlockControl_1() {
    }

    private void transition_FB_InterlockControl_2() {
    }

    private void transition_FB_InterlockControl_3() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_HeaterControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_HeaterControl extends FBInstance
    {
        /** VAR RequestStart */
        public BOOL RequestStart = new BOOL();
        /** VAR ReadyToStart */
        public BOOL ReadyToStart = new BOOL();
        /** Output event qualifier */
        public BOOL HeaterOn = new BOOL();
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
            if ("HeaterOn".equals(s)) return HeaterOn;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("RequestStart".equals(ivName)) connect_RequestStart((BOOL) newIV);
            else if ("ReadyToStart".equals(ivName)) connect_ReadyToStart((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable RequestStart
         * @param newIV The variable to connect
         */
        public void connect_RequestStart(BOOL newIV) {
            RequestStart = newIV;
        }

        /** Connect the given variable to the input variable ReadyToStart
         * @param newIV The variable to connect
         */
        public void connect_ReadyToStart(BOOL newIV) {
            ReadyToStart = newIV;
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
            transition_FB_HeaterControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_FB_HeaterControl_1();
        }

        /** The default constructor. */
        public FB_HeaterControl() {
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
                transition_FB_HeaterControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_FB_HeaterControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            HeaterOn.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            if (RequestStart.value & ReadyToStart.value) {
                HeaterOn.value = true;
            }
            else {
                HeaterOn.value = false;
            };
        }
    }
    private void transition_FB_HeaterControl_0() {
    }

    private void transition_FB_HeaterControl_1() {
    }

    private void transition_FB_HeaterControl_2() {
    }

    private void transition_FB_HeaterControl_3() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_PumpControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_PumpControl extends FBInstance
    {
        /** VAR RangeOutMin */
        public REAL RangeOutMin = new REAL();
        /** VAR RangeOutMax */
        public REAL RangeOutMax = new REAL();
        /** VAR RequestStart */
        public BOOL RequestStart = new BOOL();
        /** VAR ReadyToStart */
        public BOOL ReadyToStart = new BOOL();
        /** VAR RequestValue */
        public REAL RequestValue = new REAL();
        /** Output event qualifier */
        public BOOL PumpOn = new BOOL();
        /** VAR InvalidRange */
        public BOOL InvalidRange = new BOOL();
        /** VAR PumpValue */
        public REAL PumpValue = new REAL();
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
            if ("PumpOn".equals(s)) return PumpOn;
            if ("InvalidRange".equals(s)) return InvalidRange;
            if ("PumpValue".equals(s)) return PumpValue;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("RangeOutMin".equals(ivName)) connect_RangeOutMin((REAL) newIV);
            else if ("RangeOutMax".equals(ivName)) connect_RangeOutMax((REAL) newIV);
            else if ("RequestStart".equals(ivName)) connect_RequestStart((BOOL) newIV);
            else if ("ReadyToStart".equals(ivName)) connect_ReadyToStart((BOOL) newIV);
            else if ("RequestValue".equals(ivName)) connect_RequestValue((REAL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable RangeOutMin
         * @param newIV The variable to connect
         */
        public void connect_RangeOutMin(REAL newIV) {
            RangeOutMin = newIV;
        }

        /** Connect the given variable to the input variable RangeOutMax
         * @param newIV The variable to connect
         */
        public void connect_RangeOutMax(REAL newIV) {
            RangeOutMax = newIV;
        }

        /** Connect the given variable to the input variable RequestStart
         * @param newIV The variable to connect
         */
        public void connect_RequestStart(BOOL newIV) {
            RequestStart = newIV;
        }

        /** Connect the given variable to the input variable ReadyToStart
         * @param newIV The variable to connect
         */
        public void connect_ReadyToStart(BOOL newIV) {
            ReadyToStart = newIV;
        }

        /** Connect the given variable to the input variable RequestValue
         * @param newIV The variable to connect
         */
        public void connect_RequestValue(REAL newIV) {
            RequestValue = newIV;
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
            transition_FB_PumpControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_FB_PumpControl_1();
        }

        /** The default constructor. */
        public FB_PumpControl() {
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
                transition_FB_PumpControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_FB_PumpControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            PumpOn.value = false;
            InvalidRange.value = false;
            PumpValue.value = (float) (0.0);
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            if (RequestStart.value & ReadyToStart.value) {
                if (RequestValue.value >= RangeOutMin.value & RequestValue.value <= RangeOutMax.value) {
                    PumpValue.value = (float) (RequestValue.value);
                    InvalidRange.value = false;
                    PumpOn.value = true;
                }
                else {
                    PumpValue.value = (float) (0.0);
                    InvalidRange.value = true;
                    PumpOn.value = false;
                };
            }
            else {
                PumpOn.value = false;
                PumpValue.value = (float) (0.0);
            };
        }
    }
    private void transition_FB_PumpControl_0() {
    }

    private void transition_FB_PumpControl_1() {
    }

    private void transition_FB_PumpControl_2() {
    }

    private void transition_FB_PumpControl_3() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK FB_ValveControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class FB_ValveControl extends FBInstance
    {
        /** Input event qualifier */
        public BOOL IsControlValve = new BOOL();
        /** VAR RangeOutMin */
        public REAL RangeOutMin = new REAL();
        /** VAR RangeOutMax */
        public REAL RangeOutMax = new REAL();
        /** VAR RequestStart */
        public BOOL RequestStart = new BOOL();
        /** VAR ReadyToStart */
        public BOOL ReadyToStart = new BOOL();
        /** VAR RequestValue */
        public REAL RequestValue = new REAL();
        /** Output event qualifier */
        public BOOL ValveOn = new BOOL();
        /** VAR InvalidRange */
        public BOOL InvalidRange = new BOOL();
        /** VAR ValveValue */
        public REAL ValveValue = new REAL();
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
            if ("ValveOn".equals(s)) return ValveOn;
            if ("InvalidRange".equals(s)) return InvalidRange;
            if ("ValveValue".equals(s)) return ValveValue;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("IsControlValve".equals(ivName)) connect_IsControlValve((BOOL) newIV);
            else if ("RangeOutMin".equals(ivName)) connect_RangeOutMin((REAL) newIV);
            else if ("RangeOutMax".equals(ivName)) connect_RangeOutMax((REAL) newIV);
            else if ("RequestStart".equals(ivName)) connect_RequestStart((BOOL) newIV);
            else if ("ReadyToStart".equals(ivName)) connect_ReadyToStart((BOOL) newIV);
            else if ("RequestValue".equals(ivName)) connect_RequestValue((REAL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable IsControlValve
         * @param newIV The variable to connect
         */
        public void connect_IsControlValve(BOOL newIV) {
            IsControlValve = newIV;
        }

        /** Connect the given variable to the input variable RangeOutMin
         * @param newIV The variable to connect
         */
        public void connect_RangeOutMin(REAL newIV) {
            RangeOutMin = newIV;
        }

        /** Connect the given variable to the input variable RangeOutMax
         * @param newIV The variable to connect
         */
        public void connect_RangeOutMax(REAL newIV) {
            RangeOutMax = newIV;
        }

        /** Connect the given variable to the input variable RequestStart
         * @param newIV The variable to connect
         */
        public void connect_RequestStart(BOOL newIV) {
            RequestStart = newIV;
        }

        /** Connect the given variable to the input variable ReadyToStart
         * @param newIV The variable to connect
         */
        public void connect_ReadyToStart(BOOL newIV) {
            ReadyToStart = newIV;
        }

        /** Connect the given variable to the input variable RequestValue
         * @param newIV The variable to connect
         */
        public void connect_RequestValue(REAL newIV) {
            RequestValue = newIV;
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
            transition_FB_ValveControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_FB_ValveControl_1();
        }

        /** The default constructor. */
        public FB_ValveControl() {
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
                transition_FB_ValveControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_FB_ValveControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;

            ValveOn.value = false;
            InvalidRange.value = false;
            ValveValue.value = (float) (0.0);
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            if (IsControlValve.value & RequestStart.value & ReadyToStart.value) {
                if (RequestValue.value >= RangeOutMin.value & RequestValue.value <= RangeOutMax.value) {
                    ValveValue.value = (float) (RequestValue.value);
                    InvalidRange.value = false;
                    ValveOn.value = true;
                }
                else {
                    ValveValue.value = (float) (0.0);
                    InvalidRange.value = true;
                    ValveOn.value = false;
                };
            }
            else {
                ValveOn.value = false;
                ValveValue.value = (float) (0.0);
            };
        }
    }
    private void transition_FB_ValveControl_0() {
    }

    private void transition_FB_ValveControl_1() {
    }

    private void transition_FB_ValveControl_2() {
    }

    private void transition_FB_ValveControl_3() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK Service_AOControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class Service_AOControl extends FBInstance
    {
        /** VAR AOValue */
        public REAL AOValue = new REAL();
        /** VAR OM */
        public BOOL OM = new BOOL();
        /** VAR OM_Value */
        public REAL OM_Value = new REAL();
        /** VAR AO */
        public REAL AO = new REAL();
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
            if ("AO".equals(s)) return AO;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("AOValue".equals(ivName)) connect_AOValue((REAL) newIV);
            else if ("OM".equals(ivName)) connect_OM((BOOL) newIV);
            else if ("OM_Value".equals(ivName)) connect_OM_Value((REAL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable AOValue
         * @param newIV The variable to connect
         */
        public void connect_AOValue(REAL newIV) {
            AOValue = newIV;
        }

        /** Connect the given variable to the input variable OM
         * @param newIV The variable to connect
         */
        public void connect_OM(BOOL newIV) {
            OM = newIV;
        }

        /** Connect the given variable to the input variable OM_Value
         * @param newIV The variable to connect
         */
        public void connect_OM_Value(REAL newIV) {
            OM_Value = newIV;
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
            transition_Service_AOControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_Service_AOControl_1();
        }

        /** The default constructor. */
        public Service_AOControl() {
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
                transition_Service_AOControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_Service_AOControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;
            AO.value = (float) (0.0);
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            if (OM.value) {
                AO.value = (float) (OM_Value.value);
            }
            else {
                AO.value = (float) (AOValue.value);
            };
        }
    }
    private void transition_Service_AOControl_0() {
    }

    private void transition_Service_AOControl_1() {
    }

    private void transition_Service_AOControl_2() {
    }

    private void transition_Service_AOControl_3() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK Service_DOControl
     * @author wildai
     * @version 20150208/wildai
     */
    private class Service_DOControl extends FBInstance
    {
        /** VAR CMD_ON */
        public BOOL CMD_ON = new BOOL();
        /** VAR OM */
        public BOOL OM = new BOOL();
        /** VAR OM_ON */
        public BOOL OM_ON = new BOOL();
        /** VAR OUTPUT */
        public BOOL OUTPUT = new BOOL();
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
            if ("OUTPUT".equals(s)) return OUTPUT;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("CMD_ON".equals(ivName)) connect_CMD_ON((BOOL) newIV);
            else if ("OM".equals(ivName)) connect_OM((BOOL) newIV);
            else if ("OM_ON".equals(ivName)) connect_OM_ON((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable CMD_ON
         * @param newIV The variable to connect
         */
        public void connect_CMD_ON(BOOL newIV) {
            CMD_ON = newIV;
        }

        /** Connect the given variable to the input variable OM
         * @param newIV The variable to connect
         */
        public void connect_OM(BOOL newIV) {
            OM = newIV;
        }

        /** Connect the given variable to the input variable OM_ON
         * @param newIV The variable to connect
         */
        public void connect_OM_ON(BOOL newIV) {
            OM_ON = newIV;
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
            transition_Service_DOControl_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_Service_DOControl_1();
        }

        /** The default constructor. */
        public Service_DOControl() {
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
                transition_Service_DOControl_2(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_Service_DOControl_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            ;
            OUTPUT.value = false;
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            ;

            if (((CMD_ON.value & !OM.value) | (OM.value & OM_ON.value))) {
                OUTPUT.value = true;
            }
            else {
                OUTPUT.value = false;
            };
        }
    }
    private void transition_Service_DOControl_0() {
    }

    private void transition_Service_DOControl_1() {
    }

    private void transition_Service_DOControl_2() {
    }

    private void transition_Service_DOControl_3() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK NOT1
     * @author Администратор
     * @version 20150208/Администратор
     */
    private class NOT1 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL IN1 = new BOOL();
        /** Output event qualifier */
        public BOOL OUT1 = new BOOL();
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
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
            if ("OUT1".equals(s)) return OUT1;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("IN1".equals(ivName)) connect_IN1((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable IN1
         * @param newIV The variable to connect
         */
        public void connect_IN1(BOOL newIV) {
            IN1 = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_REQ = 1;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_NOT1_0();
        }

        /** The default constructor. */
        public NOT1() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == REQ) service_REQ();
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_NOT1_1(); 
            }
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            OUT1.value = !IN1.value;}
    }
    private void transition_NOT1_0() {
    }

    private void transition_NOT1_1() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK NOT2
     * @author Администратор
     * @version 20150208/Администратор
     */
    private class NOT2 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL IN1 = new BOOL();
        /** VAR IN2 */
        public BOOL IN2 = new BOOL();
        /** Output event qualifier */
        public BOOL OUT1 = new BOOL();
        /** VAR OUT2 */
        public BOOL OUT2 = new BOOL();
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
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
            if ("OUT1".equals(s)) return OUT1;
            if ("OUT2".equals(s)) return OUT2;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("IN1".equals(ivName)) connect_IN1((BOOL) newIV);
            else if ("IN2".equals(ivName)) connect_IN2((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable IN1
         * @param newIV The variable to connect
         */
        public void connect_IN1(BOOL newIV) {
            IN1 = newIV;
        }

        /** Connect the given variable to the input variable IN2
         * @param newIV The variable to connect
         */
        public void connect_IN2(BOOL newIV) {
            IN2 = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_REQ = 1;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_NOT2_0();
        }

        /** The default constructor. */
        public NOT2() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == REQ) service_REQ();
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_NOT2_1(); 
            }
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            OUT1.value = !IN1.value;
            OUT2.value = !IN2.value;}
    }
    private void transition_NOT2_0() {
    }

    private void transition_NOT2_1() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK NOT3
     * @author Администратор
     * @version 20150208/Администратор
     */
    private class NOT3 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL IN1 = new BOOL();
        /** VAR IN2 */
        public BOOL IN2 = new BOOL();
        /** VAR IN3 */
        public BOOL IN3 = new BOOL();
        /** Output event qualifier */
        public BOOL OUT1 = new BOOL();
        /** VAR OUT2 */
        public BOOL OUT2 = new BOOL();
        /** VAR OUT3 */
        public BOOL OUT3 = new BOOL();
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
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
            if ("OUT1".equals(s)) return OUT1;
            if ("OUT2".equals(s)) return OUT2;
            if ("OUT3".equals(s)) return OUT3;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("IN1".equals(ivName)) connect_IN1((BOOL) newIV);
            else if ("IN2".equals(ivName)) connect_IN2((BOOL) newIV);
            else if ("IN3".equals(ivName)) connect_IN3((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable IN1
         * @param newIV The variable to connect
         */
        public void connect_IN1(BOOL newIV) {
            IN1 = newIV;
        }

        /** Connect the given variable to the input variable IN2
         * @param newIV The variable to connect
         */
        public void connect_IN2(BOOL newIV) {
            IN2 = newIV;
        }

        /** Connect the given variable to the input variable IN3
         * @param newIV The variable to connect
         */
        public void connect_IN3(BOOL newIV) {
            IN3 = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_REQ = 1;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_NOT3_0();
        }

        /** The default constructor. */
        public NOT3() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == REQ) service_REQ();
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_NOT3_1(); 
            }
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            OUT1.value = IN1.value;
            OUT2.value = IN2.value;
            OUT3.value = IN3.value;}
    }
    private void transition_NOT3_0() {
    }

    private void transition_NOT3_1() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK NOT10
     * @author Администратор
     * @version 20150208/Администратор
     */
    private class NOT10 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL IN1 = new BOOL();
        /** VAR IN2 */
        public BOOL IN2 = new BOOL();
        /** VAR IN3 */
        public BOOL IN3 = new BOOL();
        /** VAR IN4 */
        public BOOL IN4 = new BOOL();
        /** VAR IN5 */
        public BOOL IN5 = new BOOL();
        /** VAR IN6 */
        public BOOL IN6 = new BOOL();
        /** VAR IN7 */
        public BOOL IN7 = new BOOL();
        /** VAR IN8 */
        public BOOL IN8 = new BOOL();
        /** VAR IN9 */
        public BOOL IN9 = new BOOL();
        /** VAR IN10 */
        public BOOL IN10 = new BOOL();
        /** Output event qualifier */
        public BOOL OUT1 = new BOOL();
        /** VAR OUT2 */
        public BOOL OUT2 = new BOOL();
        /** VAR OUT3 */
        public BOOL OUT3 = new BOOL();
        /** VAR OUT4 */
        public BOOL OUT4 = new BOOL();
        /** VAR OUT5 */
        public BOOL OUT5 = new BOOL();
        /** VAR OUT6 */
        public BOOL OUT6 = new BOOL();
        /** VAR OUT7 */
        public BOOL OUT7 = new BOOL();
        /** VAR OUT8 */
        public BOOL OUT8 = new BOOL();
        /** VAR OUT9 */
        public BOOL OUT9 = new BOOL();
        /** VAR OUT10 */
        public BOOL OUT10 = new BOOL();
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
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
            if ("OUT1".equals(s)) return OUT1;
            if ("OUT2".equals(s)) return OUT2;
            if ("OUT3".equals(s)) return OUT3;
            if ("OUT4".equals(s)) return OUT4;
            if ("OUT5".equals(s)) return OUT5;
            if ("OUT6".equals(s)) return OUT6;
            if ("OUT7".equals(s)) return OUT7;
            if ("OUT8".equals(s)) return OUT8;
            if ("OUT9".equals(s)) return OUT9;
            if ("OUT10".equals(s)) return OUT10;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("IN1".equals(ivName)) connect_IN1((BOOL) newIV);
            else if ("IN2".equals(ivName)) connect_IN2((BOOL) newIV);
            else if ("IN3".equals(ivName)) connect_IN3((BOOL) newIV);
            else if ("IN4".equals(ivName)) connect_IN4((BOOL) newIV);
            else if ("IN5".equals(ivName)) connect_IN5((BOOL) newIV);
            else if ("IN6".equals(ivName)) connect_IN6((BOOL) newIV);
            else if ("IN7".equals(ivName)) connect_IN7((BOOL) newIV);
            else if ("IN8".equals(ivName)) connect_IN8((BOOL) newIV);
            else if ("IN9".equals(ivName)) connect_IN9((BOOL) newIV);
            else if ("IN10".equals(ivName)) connect_IN10((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable IN1
         * @param newIV The variable to connect
         */
        public void connect_IN1(BOOL newIV) {
            IN1 = newIV;
        }

        /** Connect the given variable to the input variable IN2
         * @param newIV The variable to connect
         */
        public void connect_IN2(BOOL newIV) {
            IN2 = newIV;
        }

        /** Connect the given variable to the input variable IN3
         * @param newIV The variable to connect
         */
        public void connect_IN3(BOOL newIV) {
            IN3 = newIV;
        }

        /** Connect the given variable to the input variable IN4
         * @param newIV The variable to connect
         */
        public void connect_IN4(BOOL newIV) {
            IN4 = newIV;
        }

        /** Connect the given variable to the input variable IN5
         * @param newIV The variable to connect
         */
        public void connect_IN5(BOOL newIV) {
            IN5 = newIV;
        }

        /** Connect the given variable to the input variable IN6
         * @param newIV The variable to connect
         */
        public void connect_IN6(BOOL newIV) {
            IN6 = newIV;
        }

        /** Connect the given variable to the input variable IN7
         * @param newIV The variable to connect
         */
        public void connect_IN7(BOOL newIV) {
            IN7 = newIV;
        }

        /** Connect the given variable to the input variable IN8
         * @param newIV The variable to connect
         */
        public void connect_IN8(BOOL newIV) {
            IN8 = newIV;
        }

        /** Connect the given variable to the input variable IN9
         * @param newIV The variable to connect
         */
        public void connect_IN9(BOOL newIV) {
            IN9 = newIV;
        }

        /** Connect the given variable to the input variable IN10
         * @param newIV The variable to connect
         */
        public void connect_IN10(BOOL newIV) {
            IN10 = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_REQ = 1;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_NOT10_0();
        }

        /** The default constructor. */
        public NOT10() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == REQ) service_REQ();
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_NOT10_1(); 
            }
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            OUT1.value = !IN1.value;
            OUT2.value = !IN2.value;
            OUT3.value = !IN3.value;
            OUT4.value = !IN4.value;
            OUT5.value = !IN5.value;
            OUT6.value = !IN6.value;
            OUT7.value = !IN7.value;
            OUT8.value = !IN8.value;
            OUT9.value = !IN9.value;
            OUT10.value = !IN10.value;}
    }
    private void transition_NOT10_0() {
    }

    private void transition_NOT10_1() {
    }
    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK NOT16
     * @author Администратор
     * @version 20150208/Администратор
     */
    private class NOT16 extends FBInstance
    {
        /** OUT1 := NOT IN1; */
        public BOOL IN1 = new BOOL();
        /** VAR IN2 */
        public BOOL IN2 = new BOOL();
        /** VAR IN3 */
        public BOOL IN3 = new BOOL();
        /** VAR IN4 */
        public BOOL IN4 = new BOOL();
        /** VAR IN5 */
        public BOOL IN5 = new BOOL();
        /** VAR IN6 */
        public BOOL IN6 = new BOOL();
        /** VAR IN7 */
        public BOOL IN7 = new BOOL();
        /** VAR IN8 */
        public BOOL IN8 = new BOOL();
        /** VAR IN9 */
        public BOOL IN9 = new BOOL();
        /** VAR IN10 */
        public BOOL IN10 = new BOOL();
        /** VAR IN11 */
        public BOOL IN11 = new BOOL();
        /** VAR IN12 */
        public BOOL IN12 = new BOOL();
        /** VAR IN13 */
        public BOOL IN13 = new BOOL();
        /** VAR IN14 */
        public BOOL IN14 = new BOOL();
        /** VAR IN15 */
        public BOOL IN15 = new BOOL();
        /** VAR IN16 */
        public BOOL IN16 = new BOOL();
        /** Output event qualifier */
        public BOOL OUT1 = new BOOL();
        /** VAR OUT2 */
        public BOOL OUT2 = new BOOL();
        /** VAR OUT3 */
        public BOOL OUT3 = new BOOL();
        /** VAR OUT4 */
        public BOOL OUT4 = new BOOL();
        /** VAR OUT5 */
        public BOOL OUT5 = new BOOL();
        /** VAR OUT6 */
        public BOOL OUT6 = new BOOL();
        /** VAR OUT7 */
        public BOOL OUT7 = new BOOL();
        /** VAR OUT8 */
        public BOOL OUT8 = new BOOL();
        /** VAR OUT9 */
        public BOOL OUT9 = new BOOL();
        /** VAR OUT10 */
        public BOOL OUT10 = new BOOL();
        /** VAR OUT11 */
        public BOOL OUT11 = new BOOL();
        /** VAR OUT12 */
        public BOOL OUT12 = new BOOL();
        /** VAR OUT13 */
        public BOOL OUT13 = new BOOL();
        /** VAR OUT14 */
        public BOOL OUT14 = new BOOL();
        /** VAR OUT15 */
        public BOOL OUT15 = new BOOL();
        /** VAR OUT16 */
        public BOOL OUT16 = new BOOL();
        /** Normal Execution Request */
        public EventServer REQ = new EventInput(this);
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
            if ("OUT1".equals(s)) return OUT1;
            if ("OUT2".equals(s)) return OUT2;
            if ("OUT3".equals(s)) return OUT3;
            if ("OUT4".equals(s)) return OUT4;
            if ("OUT5".equals(s)) return OUT5;
            if ("OUT6".equals(s)) return OUT6;
            if ("OUT7".equals(s)) return OUT7;
            if ("OUT8".equals(s)) return OUT8;
            if ("OUT9".equals(s)) return OUT9;
            if ("OUT10".equals(s)) return OUT10;
            if ("OUT11".equals(s)) return OUT11;
            if ("OUT12".equals(s)) return OUT12;
            if ("OUT13".equals(s)) return OUT13;
            if ("OUT14".equals(s)) return OUT14;
            if ("OUT15".equals(s)) return OUT15;
            if ("OUT16".equals(s)) return OUT16;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("IN1".equals(ivName)) connect_IN1((BOOL) newIV);
            else if ("IN2".equals(ivName)) connect_IN2((BOOL) newIV);
            else if ("IN3".equals(ivName)) connect_IN3((BOOL) newIV);
            else if ("IN4".equals(ivName)) connect_IN4((BOOL) newIV);
            else if ("IN5".equals(ivName)) connect_IN5((BOOL) newIV);
            else if ("IN6".equals(ivName)) connect_IN6((BOOL) newIV);
            else if ("IN7".equals(ivName)) connect_IN7((BOOL) newIV);
            else if ("IN8".equals(ivName)) connect_IN8((BOOL) newIV);
            else if ("IN9".equals(ivName)) connect_IN9((BOOL) newIV);
            else if ("IN10".equals(ivName)) connect_IN10((BOOL) newIV);
            else if ("IN11".equals(ivName)) connect_IN11((BOOL) newIV);
            else if ("IN12".equals(ivName)) connect_IN12((BOOL) newIV);
            else if ("IN13".equals(ivName)) connect_IN13((BOOL) newIV);
            else if ("IN14".equals(ivName)) connect_IN14((BOOL) newIV);
            else if ("IN15".equals(ivName)) connect_IN15((BOOL) newIV);
            else if ("IN16".equals(ivName)) connect_IN16((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable IN1
         * @param newIV The variable to connect
         */
        public void connect_IN1(BOOL newIV) {
            IN1 = newIV;
        }

        /** Connect the given variable to the input variable IN2
         * @param newIV The variable to connect
         */
        public void connect_IN2(BOOL newIV) {
            IN2 = newIV;
        }

        /** Connect the given variable to the input variable IN3
         * @param newIV The variable to connect
         */
        public void connect_IN3(BOOL newIV) {
            IN3 = newIV;
        }

        /** Connect the given variable to the input variable IN4
         * @param newIV The variable to connect
         */
        public void connect_IN4(BOOL newIV) {
            IN4 = newIV;
        }

        /** Connect the given variable to the input variable IN5
         * @param newIV The variable to connect
         */
        public void connect_IN5(BOOL newIV) {
            IN5 = newIV;
        }

        /** Connect the given variable to the input variable IN6
         * @param newIV The variable to connect
         */
        public void connect_IN6(BOOL newIV) {
            IN6 = newIV;
        }

        /** Connect the given variable to the input variable IN7
         * @param newIV The variable to connect
         */
        public void connect_IN7(BOOL newIV) {
            IN7 = newIV;
        }

        /** Connect the given variable to the input variable IN8
         * @param newIV The variable to connect
         */
        public void connect_IN8(BOOL newIV) {
            IN8 = newIV;
        }

        /** Connect the given variable to the input variable IN9
         * @param newIV The variable to connect
         */
        public void connect_IN9(BOOL newIV) {
            IN9 = newIV;
        }

        /** Connect the given variable to the input variable IN10
         * @param newIV The variable to connect
         */
        public void connect_IN10(BOOL newIV) {
            IN10 = newIV;
        }

        /** Connect the given variable to the input variable IN11
         * @param newIV The variable to connect
         */
        public void connect_IN11(BOOL newIV) {
            IN11 = newIV;
        }

        /** Connect the given variable to the input variable IN12
         * @param newIV The variable to connect
         */
        public void connect_IN12(BOOL newIV) {
            IN12 = newIV;
        }

        /** Connect the given variable to the input variable IN13
         * @param newIV The variable to connect
         */
        public void connect_IN13(BOOL newIV) {
            IN13 = newIV;
        }

        /** Connect the given variable to the input variable IN14
         * @param newIV The variable to connect
         */
        public void connect_IN14(BOOL newIV) {
            IN14 = newIV;
        }

        /** Connect the given variable to the input variable IN15
         * @param newIV The variable to connect
         */
        public void connect_IN15(BOOL newIV) {
            IN15 = newIV;
        }

        /** Connect the given variable to the input variable IN16
         * @param newIV The variable to connect
         */
        public void connect_IN16(BOOL newIV) {
            IN16 = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_REQ = 1;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_NOT16_0();
        }

        /** The default constructor. */
        public NOT16() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == REQ) service_REQ();
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_NOT16_1(); 
            }
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            OUT1.value = !IN1.value;
            OUT2.value = !IN2.value;
            OUT3.value = !IN3.value;
            OUT4.value = !IN4.value;
            OUT5.value = !IN5.value;
            OUT6.value = !IN6.value;
            OUT7.value = !IN7.value;
            OUT8.value = !IN8.value;
            OUT9.value = !IN9.value;
            OUT10.value = !IN10.value;
            OUT11.value = !IN11.value;
            OUT12.value = !IN12.value;
            OUT13.value = !IN13.value;
            OUT14.value = !IN14.value;
            OUT15.value = !IN15.value;
            OUT16.value = !IN16.value;}
    }
    private void transition_NOT16_0() {
    }

    private void transition_NOT16_1() {
    }
}