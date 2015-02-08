package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class Model__Composite {
    private final Model instance = new Model();

    public void event_INIT(int BASEX_, int BASEY_) {
        instance.BASEX.value = Math.abs(BASEX_);
        instance.BASEY.value = Math.abs(BASEY_);
        instance.INIT.serviceEvent(instance); 
    }

    public void event_CLK(int CYL1_SPEED_, int CYL2_SPEED_, int VCYL_SPEED_) {
        instance.CYL1_SPEED.value = Math.abs(CYL1_SPEED_);
        instance.CYL2_SPEED.value = Math.abs(CYL2_SPEED_);
        instance.VCYL_SPEED.value = Math.abs(VCYL_SPEED_);
        instance.CLK.serviceEvent(instance); 
    }

    public void event_REQ(boolean Add1_, boolean Add2_, boolean Add3_) {
        instance.Add1.value = Add1_;
        instance.Add2.value = Add2_;
        instance.Add3.value = Add3_;
        instance.REQ.serviceEvent(instance); 
    }

    public void event_ADD_WP(int AddedWP_X_, int AddedWP_Y_) {
        instance.AddedWP_X.value = Math.abs(AddedWP_X_);
        instance.AddedWP_Y.value = Math.abs(AddedWP_Y_);
        instance.ADD_WP.serviceEvent(instance); 
    }

    public void event_ADD_WP00() {
        
        instance.ADD_WP00.serviceEvent(instance); 
    }

    public void event_REMOVE_WP() {
        
        instance.REMOVE_WP.serviceEvent(instance); 
    }

    public void event_CYL_IND(boolean cyl1_fwd_, boolean cyl1_back_, boolean cyl2_fwd_, boolean cyl2_back_, boolean vcyl_down_, boolean vacuum_on_, boolean vacuum_off_) {
        instance.cyl1_fwd.value = cyl1_fwd_;
        instance.cyl1_back.value = cyl1_back_;
        instance.cyl2_fwd.value = cyl2_fwd_;
        instance.cyl2_back.value = cyl2_back_;
        instance.vcyl_down.value = vcyl_down_;
        instance.vacuum_on.value = vacuum_on_;
        instance.vacuum_off.value = vacuum_off_;
        instance.CYL_IND.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK Model
     * @author JHC
     * @version 20150208/JHC
     */
    private class Model extends FBInstance
    {
        /** VAR BASEX */
        public UINT BASEX = new UINT();
        /** VAR BASEY */
        public UINT BASEY = new UINT();
        /** VAR CYL1_SPEED */
        public UINT CYL1_SPEED = new UINT();
        /** VAR CYL2_SPEED */
        public UINT CYL2_SPEED = new UINT();
        /** VAR VCYL_SPEED */
        public UINT VCYL_SPEED = new UINT();
        /** VAR cyl1_fwd */
        public BOOL cyl1_fwd = new BOOL();
        /** Response Data from Socket */
        public BOOL cyl1_back = new BOOL();
        /** VAR cyl2_fwd */
        public BOOL cyl2_fwd = new BOOL();
        /** VAR cyl2_back */
        public BOOL cyl2_back = new BOOL();
        /** VAR vcyl_down */
        public BOOL vcyl_down = new BOOL();
        /** VAR vacuum_on */
        public BOOL vacuum_on = new BOOL();
        /** VAR vacuum_off */
        public BOOL vacuum_off = new BOOL();
        /** VAR Add1 */
        public BOOL Add1 = new BOOL();
        /** VAR Add2 */
        public BOOL Add2 = new BOOL();
        /** VAR Add3 */
        public BOOL Add3 = new BOOL();
        /** VAR AddedWP_X */
        public UINT AddedWP_X = new UINT();
        /** VAR AddedWP_Y */
        public UINT AddedWP_Y = new UINT();
        /** Response Data from Socket */
        public UINT BASE_X = new UINT();
        /** Response Data from Socket */
        public UINT BASE_Y = new UINT();
        /** Response Data from Socket */
        public UINT CYL1_X = new UINT();
        /** Response Data from Socket */
        public UINT CYL1_Y = new UINT();
        /** Response Data from Socket */
        public UINT CYL2_X = new UINT();
        /** Response Data from Socket */
        public UINT CYL2_Y = new UINT();
        /** Response Data from Socket */
        public UINT VCYL_X = new UINT();
        /** Response Data from Socket */
        public UINT VCYL_Y = new UINT();
        /** Response Data from Socket */
        public UINT WP_X = new UINT();
        /** Response Data from Socket */
        public UINT WP_Y = new UINT();
        /** Response Data from Socket */
        public UINT WP2_X = new UINT();
        /** Response Data from Socket */
        public UINT WP2_Y = new UINT();
        /** Response Data from Socket */
        public UINT WP3_X = new UINT();
        /** Response Data from Socket */
        public UINT WP3_Y = new UINT();
        /** Response Data from Socket */
        public BOOL VACUUM_ON = new BOOL();
        /** VAR c1home */
        public BOOL c1home = new BOOL();
        /** VAR c1end */
        public BOOL c1end = new BOOL();
        /** VAR c2home */
        public BOOL c2home = new BOOL();
        /** VAR c2end */
        public BOOL c2end = new BOOL();
        /** VAR vchome */
        public BOOL vchome = new BOOL();
        /** VAR vcend */
        public BOOL vcend = new BOOL();
        /** VAR pp0 */
        public BOOL pp0 = new BOOL();
        /** VAR pp1 */
        public BOOL pp1 = new BOOL();
        /** VAR pp2 */
        public BOOL pp2 = new BOOL();
        /** VAR pp3 */
        public BOOL pp3 = new BOOL();
        /** VAR RemovedWP_X */
        public UINT RemovedWP_X = new UINT();
        /** VAR RemovedWP_Y */
        public UINT RemovedWP_Y = new UINT();
        /** Initialization Request */
        public EventOutput INIT = new EventOutput();
        /** Clock */
        public EventOutput CLK = new EventOutput();
        /** EVENT REQ */
        public EventOutput REQ = new EventOutput();
        /** EVENT ADD_WP */
        public EventOutput ADD_WP = new EventOutput();
        /** EVENT ADD_WP00 */
        public EventOutput ADD_WP00 = new EventOutput();
        /** EVENT REMOVE_WP */
        public EventOutput REMOVE_WP = new EventOutput();
        /** EVENT CYL_IND */
        public EventOutput CYL_IND = new EventOutput();
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** View State Changed */
        public EventOutput CHG = new EventOutput();
        /** EVENT CNF */
        public EventOutput CNF = new EventOutput();
        /** EVENT WP_ADDED */
        public EventOutput WP_ADDED = new EventOutput();
        /** EVENT WP_REMOVED */
        public EventOutput WP_REMOVED = new EventOutput();
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
        /** Connect the given variable to the input variable BASEX
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable BASEY
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable CYL1_SPEED
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable CYL2_SPEED
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable VCYL_SPEED
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable cyl1_fwd
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable cyl1_back
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable cyl2_fwd
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable cyl2_back
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vcyl_down
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vacuum_on
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable vacuum_off
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable Add1
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable Add2
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable Add3
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable AddedWP_X
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable AddedWP_Y
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** FB Cylinder */
        protected PnpCylinders Cylinder = new PnpCylinders() ;
        /** FB ViewControl */
        protected PnpXYCalculator ViewControl = new PnpXYCalculator() ;
        /** FB SuctionUnit */
        protected PnPVacuum SuctionUnit = new PnPVacuum() ;
        /** FB WPSensors */
        protected WPsensor WPSensors = new WPsensor() ;
        /** The default constructor. */
        public Model() {
            super();
            INIT.connectTo(Cylinder.INIT);
            REQ.connectTo(ViewControl.REQ);
            ADD_WP.connectTo(ViewControl.ADD_WP);
            ADD_WP00.connectTo(ViewControl.ADD_WP00);
            REMOVE_WP.connectTo(ViewControl.REMOVE_WP);
            ViewControl.WP_ADDED.connectTo(WP_ADDED);
            ViewControl.WP_REMOVED.connectTo(WP_REMOVED);
            Cylinder.INITO.connectTo(SuctionUnit.INIT);
            SuctionUnit.INITO.connectTo(ViewControl.INIT);
            CLK.connectTo(Cylinder.CLK);
            CYL_IND.connectTo(Cylinder.CYL_IND);
            CYL_IND.connectTo(SuctionUnit.CLK);
            SuctionUnit.CHG.connectTo(ViewControl.CLK);
            ViewControl.INITO.connectTo(WPSensors.INIT);
            WPSensors.CNF.connectTo(CHG);
            WPSensors.INITO.connectTo(INITO);
            ViewControl.CNF.connectTo(WPSensors.REQ);
            Cylinder.CNF.connectTo(ViewControl.CLK);
            Cylinder.CHG.connectTo(CHG);
            SuctionUnit.CHG.connectTo(CHG);
            ViewControl.CNF.connectTo(CNF);
            BASE_X = (UINT) ViewControl.ovNamedNoException("BASE_X");
            BASE_Y = (UINT) ViewControl.ovNamedNoException("BASE_Y");
            CYL1_X = (UINT) ViewControl.ovNamedNoException("CYL1_X");
            CYL1_Y = (UINT) ViewControl.ovNamedNoException("CYL1_Y");
            CYL2_X = (UINT) ViewControl.ovNamedNoException("CYL2_X");
            CYL2_Y = (UINT) ViewControl.ovNamedNoException("CYL2_Y");
            VCYL_X = (UINT) ViewControl.ovNamedNoException("VCYL_X");
            VCYL_Y = (UINT) ViewControl.ovNamedNoException("VCYL_Y");
            WP_X = (UINT) ViewControl.ovNamedNoException("WP_X");
            WP_Y = (UINT) ViewControl.ovNamedNoException("WP_Y");
            WP2_X = (UINT) ViewControl.ovNamedNoException("WP2_X");
            WP2_Y = (UINT) ViewControl.ovNamedNoException("WP2_Y");
            WP3_X = (UINT) ViewControl.ovNamedNoException("WP3_X");
            WP3_Y = (UINT) ViewControl.ovNamedNoException("WP3_Y");
            ViewControl.connectIVNoException("BASEX",BASEX);
            ViewControl.connectIVNoException("BASEY",BASEY);
            ViewControl.connectIVNoException("vacuum_on",vacuum_on);
            ViewControl.connectIVNoException("vacuum_off",vacuum_off);
            ViewControl.connectIVNoException("Add1",Add1);
            ViewControl.connectIVNoException("Add2",Add2);
            ViewControl.connectIVNoException("Add3",Add3);
            ViewControl.connectIVNoException("AddedWP_X",AddedWP_X);
            ViewControl.connectIVNoException("AddedWP_Y",AddedWP_Y);
            ViewControl.connectIVNoException("LCPos",Cylinder.ovNamedNoException("LCAbsolutePos"));
            Cylinder.connectIVNoException("LCForwardSpeed",CYL1_SPEED);
            Cylinder.connectIVNoException("LCBackwardSpeed",CYL1_SPEED);
            Cylinder.connectIVNoException("RCForwardSpeed",CYL2_SPEED);
            Cylinder.connectIVNoException("RCBackwardSpeed",CYL2_SPEED);
            Cylinder.connectIVNoException("VCSpeed",VCYL_SPEED);
            Cylinder.connectIVNoException("LCExtend",cyl1_fwd);
            Cylinder.connectIVNoException("LCRetract",cyl1_back);
            Cylinder.connectIVNoException("RCExtend",cyl2_fwd);
            Cylinder.connectIVNoException("RCRetract",cyl2_back);
            Cylinder.connectIVNoException("VCExtend",vcyl_down);
            ViewControl.connectIVNoException("RCPos",Cylinder.ovNamedNoException("RCAbsolutePos"));
            ViewControl.connectIVNoException("VCPos",Cylinder.ovNamedNoException("VCAbsolutePos"));
            c1home = (BOOL) Cylinder.ovNamedNoException("LCAtHome");
            c1end = (BOOL) Cylinder.ovNamedNoException("LCAtEnd");
            c2home = (BOOL) Cylinder.ovNamedNoException("RCAtHome");
            c2end = (BOOL) Cylinder.ovNamedNoException("RCAtEnd");
            vchome = (BOOL) Cylinder.ovNamedNoException("VCAtHome");
            vcend = (BOOL) Cylinder.ovNamedNoException("VCAtEnd");
            VACUUM_ON = (BOOL) SuctionUnit.ovNamedNoException("VacState");
            SuctionUnit.connectIVNoException("VacuumOn",vacuum_on);
            SuctionUnit.connectIVNoException("VacuumOff",vacuum_off);
            ViewControl.connectIVNoException("vacuumon",SuctionUnit.ovNamedNoException("VacState"));
            WPSensors.connectIVNoException("WP1_X",ViewControl.ovNamedNoException("WP_X"));
            WPSensors.connectIVNoException("WP1_Y",ViewControl.ovNamedNoException("WP_Y"));
            WPSensors.connectIVNoException("WP2_X",ViewControl.ovNamedNoException("WP2_X"));
            WPSensors.connectIVNoException("WP2_Y",ViewControl.ovNamedNoException("WP2_Y"));
            WPSensors.connectIVNoException("WP3_X",ViewControl.ovNamedNoException("WP3_X"));
            WPSensors.connectIVNoException("WP3_Y",ViewControl.ovNamedNoException("WP3_Y"));
            pp0 = (BOOL) WPSensors.ovNamedNoException("wp11");
            pp3 = (BOOL) WPSensors.ovNamedNoException("wp14");
            pp2 = (BOOL) WPSensors.ovNamedNoException("wp13");
            pp1 = (BOOL) WPSensors.ovNamedNoException("wp12");
            Cylinder.InitialPosition.initializeNoException("0.0");
            Cylinder.HomeSensorRange.initializeNoException("[0,0]");
            Cylinder.MidSensorRange.initializeNoException("[50,50]");
            Cylinder.EndSensorRange.initializeNoException("[100,100]");
            Cylinder.Loaded.initializeNoException("0");
            Cylinder.LoadType.initializeNoException("0");
            Cylinder.LCMovingtDistance.initializeNoException("75");
            Cylinder.RCMovingtDistance.initializeNoException("150");
            Cylinder.VCMovingtDistance.initializeNoException("75");
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK PnpCylinders
     * @author JHC
     * @version 20150208/JHC
     */
    private class PnpCylinders extends FBInstance
    {
        /** Initial position */
        public REAL InitialPosition = new REAL();
        /** Detection range of home sensor */
        public ARRAY HomeSensorRange = new ARRAY(new UINT(),2);
        /** Detection range of home sensor */
        public ARRAY MidSensorRange = new ARRAY(new UINT(),2);
        /** Detection range of end sensor */
        public ARRAY EndSensorRange = new ARRAY(new UINT(),2);
        /** VAR Loaded */
        public BOOL Loaded = new BOOL();
        /** VAR LoadType */
        public UINT LoadType = new UINT();
        /** VAR LCExtend */
        public BOOL LCExtend = new BOOL();
        /** VAR LCRetract */
        public BOOL LCRetract = new BOOL();
        /** Moving distance */
        public UINT LCMovingtDistance = new UINT();
        /** Forward speed */
        public UINT LCForwardSpeed = new UINT();
        /** Backward speed */
        public UINT LCBackwardSpeed = new UINT();
        /** VAR RCExtend */
        public BOOL RCExtend = new BOOL();
        /** VAR RCRetract */
        public BOOL RCRetract = new BOOL();
        /** Moving distance */
        public UINT RCMovingtDistance = new UINT();
        /** Forward speed */
        public UINT RCForwardSpeed = new UINT();
        /** Backward speed */
        public UINT RCBackwardSpeed = new UINT();
        /** VAR VCExtend */
        public BOOL VCExtend = new BOOL();
        /** Moving distance */
        public UINT VCMovingtDistance = new UINT();
        /** Forward speed */
        public UINT VCSpeed = new UINT();
        /** Current position */
        public UINT LCAbsolutePos = new UINT();
        /** Detected at home position */
        public BOOL LCAtHome = new BOOL();
        /** Detected at end position */
        public BOOL LCAtEnd = new BOOL();
        /** VAR LCAtMid */
        public BOOL LCAtMid = new BOOL();
        /** Current position */
        public UINT RCAbsolutePos = new UINT();
        /** Detected at home position */
        public BOOL RCAtHome = new BOOL();
        /** Detected at end position */
        public BOOL RCAtEnd = new BOOL();
        /** VAR RCAtMid */
        public BOOL RCAtMid = new BOOL();
        /** Current position */
        public UINT VCAbsolutePos = new UINT();
        /** Detected at home position */
        public BOOL VCAtHome = new BOOL();
        /** Detected at end position */
        public BOOL VCAtEnd = new BOOL();
        /** VAR VCAtMid */
        public BOOL VCAtMid = new BOOL();
        /** Initialization Request */
        public EventOutput INIT = new EventOutput();
        /** EVENT CLK */
        public EventOutput CLK = new EventOutput();
        /** EVENT FAULT */
        public EventOutput FAULT = new EventOutput();
        /** EVENT RESUME */
        public EventOutput RESUME = new EventOutput();
        /** EVENT CYL_IND */
        public EventOutput CYL_IND = new EventOutput();
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** EVENT CHG */
        public EventOutput CHG = new EventOutput();
        /** EVENT OFAULT */
        public EventOutput OFAULT = new EventOutput();
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
            if ("LCAbsolutePos".equals(s)) return LCAbsolutePos;
            if ("LCAtHome".equals(s)) return LCAtHome;
            if ("LCAtEnd".equals(s)) return LCAtEnd;
            if ("LCAtMid".equals(s)) return LCAtMid;
            if ("RCAbsolutePos".equals(s)) return RCAbsolutePos;
            if ("RCAtHome".equals(s)) return RCAtHome;
            if ("RCAtEnd".equals(s)) return RCAtEnd;
            if ("RCAtMid".equals(s)) return RCAtMid;
            if ("VCAbsolutePos".equals(s)) return VCAbsolutePos;
            if ("VCAtHome".equals(s)) return VCAtHome;
            if ("VCAtEnd".equals(s)) return VCAtEnd;
            if ("VCAtMid".equals(s)) return VCAtMid;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("InitialPosition".equals(ivName)) connect_InitialPosition((REAL) newIV);
            else if ("HomeSensorRange".equals(ivName)) connect_HomeSensorRange((ARRAY) newIV);
            else if ("MidSensorRange".equals(ivName)) connect_MidSensorRange((ARRAY) newIV);
            else if ("EndSensorRange".equals(ivName)) connect_EndSensorRange((ARRAY) newIV);
            else if ("Loaded".equals(ivName)) connect_Loaded((BOOL) newIV);
            else if ("LoadType".equals(ivName)) connect_LoadType((UINT) newIV);
            else if ("LCExtend".equals(ivName)) connect_LCExtend((BOOL) newIV);
            else if ("LCRetract".equals(ivName)) connect_LCRetract((BOOL) newIV);
            else if ("LCMovingtDistance".equals(ivName)) connect_LCMovingtDistance((UINT) newIV);
            else if ("LCForwardSpeed".equals(ivName)) connect_LCForwardSpeed((UINT) newIV);
            else if ("LCBackwardSpeed".equals(ivName)) connect_LCBackwardSpeed((UINT) newIV);
            else if ("RCExtend".equals(ivName)) connect_RCExtend((BOOL) newIV);
            else if ("RCRetract".equals(ivName)) connect_RCRetract((BOOL) newIV);
            else if ("RCMovingtDistance".equals(ivName)) connect_RCMovingtDistance((UINT) newIV);
            else if ("RCForwardSpeed".equals(ivName)) connect_RCForwardSpeed((UINT) newIV);
            else if ("RCBackwardSpeed".equals(ivName)) connect_RCBackwardSpeed((UINT) newIV);
            else if ("VCExtend".equals(ivName)) connect_VCExtend((BOOL) newIV);
            else if ("VCMovingtDistance".equals(ivName)) connect_VCMovingtDistance((UINT) newIV);
            else if ("VCSpeed".equals(ivName)) connect_VCSpeed((UINT) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable InitialPosition
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_InitialPosition(REAL newIV) throws FBRManagementException {
            InitialPosition = newIV;
            LeftCylinder.connectIVNoException("InitialPosition",InitialPosition);
            RightCylinder.connectIVNoException("InitialPosition",InitialPosition);
            VerticleCylinder.connectIVNoException("InitialPosition",InitialPosition);
        }

        /** Connect the given variable to the input variable HomeSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_HomeSensorRange(ARRAY newIV) throws FBRManagementException {
            HomeSensorRange = newIV;
            LeftCylinder.connectIVNoException("HomeSensorRange",HomeSensorRange);
            RightCylinder.connectIVNoException("HomeSensorRange",HomeSensorRange);
            VerticleCylinder.connectIVNoException("HomeSensorRange",HomeSensorRange);
        }

        /** Connect the given variable to the input variable MidSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_MidSensorRange(ARRAY newIV) throws FBRManagementException {
            MidSensorRange = newIV;
            LeftCylinder.connectIVNoException("MidSensorRange",MidSensorRange);
            RightCylinder.connectIVNoException("MidSensorRange",MidSensorRange);
            VerticleCylinder.connectIVNoException("MidSensorRange",MidSensorRange);
        }

        /** Connect the given variable to the input variable EndSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_EndSensorRange(ARRAY newIV) throws FBRManagementException {
            EndSensorRange = newIV;
            LeftCylinder.connectIVNoException("EndSensorRange",EndSensorRange);
            RightCylinder.connectIVNoException("EndSensorRange",EndSensorRange);
            VerticleCylinder.connectIVNoException("EndSensorRange",EndSensorRange);
        }

        /** Connect the given variable to the input variable Loaded
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_Loaded(BOOL newIV) throws FBRManagementException {
            Loaded = newIV;
            LeftCylinder.connectIVNoException("Loaded",Loaded);
            RightCylinder.connectIVNoException("Loaded",Loaded);
            VerticleCylinder.connectIVNoException("Loaded",Loaded);
        }

        /** Connect the given variable to the input variable LoadType
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_LoadType(UINT newIV) throws FBRManagementException {
            LoadType = newIV;
            LeftCylinder.connectIVNoException("LoadType",LoadType);
            RightCylinder.connectIVNoException("LoadType",LoadType);
            VerticleCylinder.connectIVNoException("LoadType",LoadType);
        }

        /** Connect the given variable to the input variable LCExtend
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_LCExtend(BOOL newIV) throws FBRManagementException {
            LCExtend = newIV;
            LeftCylinder.connectIVNoException("Extend",LCExtend);
        }

        /** Connect the given variable to the input variable LCRetract
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_LCRetract(BOOL newIV) throws FBRManagementException {
            LCRetract = newIV;
            LeftCylinder.connectIVNoException("Retract",LCRetract);
        }

        /** Connect the given variable to the input variable LCMovingtDistance
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_LCMovingtDistance(UINT newIV) throws FBRManagementException {
            LCMovingtDistance = newIV;
            LeftCylinder.connectIVNoException("MovingtDistance",LCMovingtDistance);
        }

        /** Connect the given variable to the input variable LCForwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_LCForwardSpeed(UINT newIV) throws FBRManagementException {
            LCForwardSpeed = newIV;
            LeftCylinder.connectIVNoException("ForwardSpeed",LCForwardSpeed);
        }

        /** Connect the given variable to the input variable LCBackwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_LCBackwardSpeed(UINT newIV) throws FBRManagementException {
            LCBackwardSpeed = newIV;
            LeftCylinder.connectIVNoException("BackwardSpeed",LCBackwardSpeed);
        }

        /** Connect the given variable to the input variable RCExtend
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_RCExtend(BOOL newIV) throws FBRManagementException {
            RCExtend = newIV;
            RightCylinder.connectIVNoException("Extend",RCExtend);
        }

        /** Connect the given variable to the input variable RCRetract
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_RCRetract(BOOL newIV) throws FBRManagementException {
            RCRetract = newIV;
            RightCylinder.connectIVNoException("Retract",RCRetract);
        }

        /** Connect the given variable to the input variable RCMovingtDistance
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_RCMovingtDistance(UINT newIV) throws FBRManagementException {
            RCMovingtDistance = newIV;
            RightCylinder.connectIVNoException("MovingtDistance",RCMovingtDistance);
        }

        /** Connect the given variable to the input variable RCForwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_RCForwardSpeed(UINT newIV) throws FBRManagementException {
            RCForwardSpeed = newIV;
            RightCylinder.connectIVNoException("ForwardSpeed",RCForwardSpeed);
        }

        /** Connect the given variable to the input variable RCBackwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_RCBackwardSpeed(UINT newIV) throws FBRManagementException {
            RCBackwardSpeed = newIV;
            RightCylinder.connectIVNoException("BackwardSpeed",RCBackwardSpeed);
        }

        /** Connect the given variable to the input variable VCExtend
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_VCExtend(BOOL newIV) throws FBRManagementException {
            VCExtend = newIV;
            VerticleCylinder.connectIVNoException("Extend",VCExtend);
        }

        /** Connect the given variable to the input variable VCMovingtDistance
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_VCMovingtDistance(UINT newIV) throws FBRManagementException {
            VCMovingtDistance = newIV;
            VerticleCylinder.connectIVNoException("MovingtDistance",VCMovingtDistance);
        }

        /** Connect the given variable to the input variable VCSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_VCSpeed(UINT newIV) throws FBRManagementException {
            VCSpeed = newIV;
            VerticleCylinder.connectIVNoException("ForwardSpeed",VCSpeed);
            VerticleCylinder.connectIVNoException("BackwardSpeed",VCSpeed);
        }
        /** FB LeftCylinder */
        protected GenericCylinderModelType1 LeftCylinder = new GenericCylinderModelType1() ;
        /** FB RightCylinder */
        protected GenericCylinderModelType1 RightCylinder = new GenericCylinderModelType1() ;
        /** FB VerticleCylinder */
        protected GenericCylinderModelType2 VerticleCylinder = new GenericCylinderModelType2() ;
        /** The default constructor. */
        public PnpCylinders() {
            super();
            INIT.connectTo(LeftCylinder.INIT);
            CLK.connectTo(LeftCylinder.CLK);
            FAULT.connectTo(LeftCylinder.FAULT);
            RESUME.connectTo(LeftCylinder.RESUME);
            VerticleCylinder.INITO.connectTo(INITO);
            LeftCylinder.CHG.connectTo(CHG);
            RightCylinder.CHG.connectTo(CHG);
            VerticleCylinder.CHG.connectTo(CHG);
            LeftCylinder.OFAULT.connectTo(RightCylinder.FAULT);
            RightCylinder.OFAULT.connectTo(VerticleCylinder.FAULT);
            VerticleCylinder.OFAULT.connectTo(OFAULT);
            RESUME.connectTo(RightCylinder.RESUME);
            RESUME.connectTo(VerticleCylinder.RESUME);
            VerticleCylinder.CNF.connectTo(CNF);
            CLK.connectTo(RightCylinder.CLK);
            CLK.connectTo(VerticleCylinder.CLK);
            RightCylinder.CNF.connectTo(CNF);
            LeftCylinder.CNF.connectTo(CNF);
            LeftCylinder.INITO.connectTo(RightCylinder.INIT);
            RightCylinder.INITO.connectTo(VerticleCylinder.INIT);
            CYL_IND.connectTo(LeftCylinder.CYL_IND);
            CYL_IND.connectTo(RightCylinder.CYL_IND);
            CYL_IND.connectTo(VerticleCylinder.CYL_IND);
            LeftCylinder.connectIVNoException("ForwardSpeed",LCForwardSpeed);
            LeftCylinder.connectIVNoException("BackwardSpeed",LCBackwardSpeed);
            LeftCylinder.connectIVNoException("InitialPosition",InitialPosition);
            LeftCylinder.connectIVNoException("MovingtDistance",LCMovingtDistance);
            LeftCylinder.connectIVNoException("HomeSensorRange",HomeSensorRange);
            LeftCylinder.connectIVNoException("MidSensorRange",MidSensorRange);
            LeftCylinder.connectIVNoException("EndSensorRange",EndSensorRange);
            LeftCylinder.connectIVNoException("Extend",LCExtend);
            LeftCylinder.connectIVNoException("Retract",LCRetract);
            LeftCylinder.connectIVNoException("Loaded",Loaded);
            LeftCylinder.connectIVNoException("LoadType",LoadType);
            RightCylinder.connectIVNoException("ForwardSpeed",RCForwardSpeed);
            RightCylinder.connectIVNoException("BackwardSpeed",RCBackwardSpeed);
            RightCylinder.connectIVNoException("InitialPosition",InitialPosition);
            RightCylinder.connectIVNoException("MovingtDistance",RCMovingtDistance);
            RightCylinder.connectIVNoException("HomeSensorRange",HomeSensorRange);
            RightCylinder.connectIVNoException("MidSensorRange",MidSensorRange);
            RightCylinder.connectIVNoException("EndSensorRange",EndSensorRange);
            RightCylinder.connectIVNoException("Extend",RCExtend);
            RightCylinder.connectIVNoException("Retract",RCRetract);
            RightCylinder.connectIVNoException("Loaded",Loaded);
            RightCylinder.connectIVNoException("LoadType",LoadType);
            VerticleCylinder.connectIVNoException("ForwardSpeed",VCSpeed);
            VerticleCylinder.connectIVNoException("BackwardSpeed",VCSpeed);
            VerticleCylinder.connectIVNoException("InitialPosition",InitialPosition);
            VerticleCylinder.connectIVNoException("MovingtDistance",VCMovingtDistance);
            VerticleCylinder.connectIVNoException("HomeSensorRange",HomeSensorRange);
            VerticleCylinder.connectIVNoException("MidSensorRange",MidSensorRange);
            VerticleCylinder.connectIVNoException("EndSensorRange",EndSensorRange);
            VerticleCylinder.connectIVNoException("Extend",VCExtend);
            VerticleCylinder.connectIVNoException("Loaded",Loaded);
            VerticleCylinder.connectIVNoException("LoadType",LoadType);
            LCAtHome = (BOOL) LeftCylinder.ovNamedNoException("AtHome");
            LCAtMid = (BOOL) LeftCylinder.ovNamedNoException("AtMid");
            RCAtHome = (BOOL) RightCylinder.ovNamedNoException("AtHome");
            RCAtMid = (BOOL) RightCylinder.ovNamedNoException("AtMid");
            LCAtEnd = (BOOL) LeftCylinder.ovNamedNoException("AtEnd");
            RCAtEnd = (BOOL) RightCylinder.ovNamedNoException("AtEnd");
            VCAtHome = (BOOL) VerticleCylinder.ovNamedNoException("AtHome");
            VCAtEnd = (BOOL) VerticleCylinder.ovNamedNoException("AtEnd");
            VCAtMid = (BOOL) VerticleCylinder.ovNamedNoException("AtMid");
            LCAbsolutePos = (UINT) LeftCylinder.ovNamedNoException("AbsolutePos");
            RCAbsolutePos = (UINT) RightCylinder.ovNamedNoException("AbsolutePos");
            VCAbsolutePos = (UINT) VerticleCylinder.ovNamedNoException("AbsolutePos");
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 The University of Auckland. All rights reserved. */




    /** FUNCTION_BLOCK GenericCylinderModelType1
     * @author Sandeep Patil
     * @version 20150208/Sandeep Patil
     */
    private class GenericCylinderModelType1 extends FBInstance
    {
        /** Forward speed */
        public UINT ForwardSpeed = new UINT();
        /** Backward speed */
        public UINT BackwardSpeed = new UINT();
        /** Initial position */
        public REAL InitialPosition = new REAL();
        /** Moving distance */
        public UINT MovingtDistance = new UINT();
        /** Detection range of home sensor */
        public ARRAY HomeSensorRange = new ARRAY(new UINT(),2);
        /** Detection range of home sensor */
        public ARRAY MidSensorRange = new ARRAY(new UINT(),2);
        /** Detection range of end sensor */
        public ARRAY EndSensorRange = new ARRAY(new UINT(),2);
        /** VAR Extend */
        public BOOL Extend = new BOOL();
        /** VAR Retract */
        public BOOL Retract = new BOOL();
        /** VAR Loaded */
        public BOOL Loaded = new BOOL();
        /** VAR LoadType */
        public UINT LoadType = new UINT();
        /** Current position */
        public UINT AbsolutePos = new UINT();
        /** Detected at home position */
        public BOOL AtHome = new BOOL();
        /** Detected at end position */
        public BOOL AtEnd = new BOOL();
        /** VAR AtMid */
        public BOOL AtMid = new BOOL();
        /** Initialization Request */
        public EventOutput INIT = new EventOutput();
        /** Clock signal */
        public EventOutput CLK = new EventOutput();
        /** EVENT FAULT */
        public EventOutput FAULT = new EventOutput();
        /** EVENT RESUME */
        public EventOutput RESUME = new EventOutput();
        /** EVENT CYL_IND */
        public EventOutput CYL_IND = new EventOutput();
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Indicate data outputs changed */
        public EventOutput CHG = new EventOutput();
        /** EVENT OFAULT */
        public EventOutput OFAULT = new EventOutput();
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
            if ("AbsolutePos".equals(s)) return AbsolutePos;
            if ("AtHome".equals(s)) return AtHome;
            if ("AtEnd".equals(s)) return AtEnd;
            if ("AtMid".equals(s)) return AtMid;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("ForwardSpeed".equals(ivName)) connect_ForwardSpeed((UINT) newIV);
            else if ("BackwardSpeed".equals(ivName)) connect_BackwardSpeed((UINT) newIV);
            else if ("InitialPosition".equals(ivName)) connect_InitialPosition((REAL) newIV);
            else if ("MovingtDistance".equals(ivName)) connect_MovingtDistance((UINT) newIV);
            else if ("HomeSensorRange".equals(ivName)) connect_HomeSensorRange((ARRAY) newIV);
            else if ("MidSensorRange".equals(ivName)) connect_MidSensorRange((ARRAY) newIV);
            else if ("EndSensorRange".equals(ivName)) connect_EndSensorRange((ARRAY) newIV);
            else if ("Extend".equals(ivName)) connect_Extend((BOOL) newIV);
            else if ("Retract".equals(ivName)) connect_Retract((BOOL) newIV);
            else if ("Loaded".equals(ivName)) connect_Loaded((BOOL) newIV);
            else if ("LoadType".equals(ivName)) connect_LoadType((UINT) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable ForwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_ForwardSpeed(UINT newIV) throws FBRManagementException {
            ForwardSpeed = newIV;
            Position.connectIVNoException("ForwardSpeed",ForwardSpeed);
        }

        /** Connect the given variable to the input variable BackwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_BackwardSpeed(UINT newIV) throws FBRManagementException {
            BackwardSpeed = newIV;
            Position.connectIVNoException("BackwardSpeed",BackwardSpeed);
        }

        /** Connect the given variable to the input variable InitialPosition
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_InitialPosition(REAL newIV) throws FBRManagementException {
            InitialPosition = newIV;
            Position.connectIVNoException("InitialPosition",InitialPosition);
        }

        /** Connect the given variable to the input variable MovingtDistance
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_MovingtDistance(UINT newIV) throws FBRManagementException {
            MovingtDistance = newIV;
            Position.connectIVNoException("MovingDistance",MovingtDistance);
        }

        /** Connect the given variable to the input variable HomeSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_HomeSensorRange(ARRAY newIV) throws FBRManagementException {
            HomeSensorRange = newIV;
            Home.connectIVNoException("Zone",HomeSensorRange);
        }

        /** Connect the given variable to the input variable MidSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_MidSensorRange(ARRAY newIV) throws FBRManagementException {
            MidSensorRange = newIV;
            Middle.connectIVNoException("Zone",MidSensorRange);
        }

        /** Connect the given variable to the input variable EndSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_EndSensorRange(ARRAY newIV) throws FBRManagementException {
            EndSensorRange = newIV;
            End.connectIVNoException("Zone",EndSensorRange);
        }

        /** Connect the given variable to the input variable Extend
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_Extend(BOOL newIV) throws FBRManagementException {
            Extend = newIV;
            MovingStatus.connectIVNoException("Extend",Extend);
        }

        /** Connect the given variable to the input variable Retract
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_Retract(BOOL newIV) throws FBRManagementException {
            Retract = newIV;
            MovingStatus.connectIVNoException("Retract",Retract);
        }

        /** Connect the given variable to the input variable Loaded
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_Loaded(BOOL newIV) throws FBRManagementException {
            Loaded = newIV;
            Position.connectIVNoException("Loaded",Loaded);
        }

        /** Connect the given variable to the input variable LoadType
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_LoadType(UINT newIV) throws FBRManagementException {
            LoadType = newIV;
            Position.connectIVNoException("LoadType",LoadType);
        }
        /** FB Home */
        protected PnPSensor Home = new PnPSensor() ;
        /** FB Middle */
        protected PnPSensor Middle = new PnPSensor() ;
        /** FB End */
        protected PnPSensor End = new PnPSensor() ;
        /** FB MovingStatus */
        protected MovementBlockType1 MovingStatus = new MovementBlockType1() ;
        /** FB Position */
        protected LinearMotionLoad Position = new LinearMotionLoad() ;
        /** The default constructor. */
        public GenericCylinderModelType1() {
            super();
            INIT.connectTo(MovingStatus.INIT);
            FAULT.connectTo(MovingStatus.FAULT);
            RESUME.connectTo(MovingStatus.RESUME);
            Home.CHG.connectTo(CHG);
            End.CHG.connectTo(CHG);
            End.INITO.connectTo(INITO);
            MovingStatus.OFAULT.connectTo(OFAULT);
            MovingStatus.INITO.connectTo(Position.INIT);
            Position.INITO.connectTo(Home.INIT);
            Position.CHG.connectTo(Home.CLK);
            Position.CHG.connectTo(End.CLK);
            Home.INITO.connectTo(Middle.INIT);
            Middle.INITO.connectTo(End.INIT);
            Position.CHG.connectTo(Middle.CLK);
            Position.CHG.connectTo(CNF);
            Middle.CHG.connectTo(CHG);
            CLK.connectTo(Position.CLK);
            CYL_IND.connectTo(MovingStatus.CLK);
            End.connectIVNoException("Zone",EndSensorRange);
            Position.connectIVNoException("MoveForwards",MovingStatus.ovNamedNoException("C_FWD"));
            Position.connectIVNoException("MoveBackwards",MovingStatus.ovNamedNoException("C_BWD"));
            Position.connectIVNoException("Loaded",Loaded);
            Position.connectIVNoException("ForwardSpeed",ForwardSpeed);
            Position.connectIVNoException("BackwardSpeed",BackwardSpeed);
            Position.connectIVNoException("LoadType",LoadType);
            AbsolutePos = (UINT) Position.ovNamedNoException("AbsolutePos");
            Position.connectIVNoException("MovingDistance",MovingtDistance);
            AtHome = (BOOL) Home.ovNamedNoException("Detected");
            AtEnd = (BOOL) End.ovNamedNoException("Detected");
            Position.connectIVNoException("InitialPosition",InitialPosition);
            Home.connectIVNoException("Zone",HomeSensorRange);
            Home.connectIVNoException("Position",Position.ovNamedNoException("RelativePos"));
            End.connectIVNoException("Position",Position.ovNamedNoException("RelativePos"));
            Middle.connectIVNoException("Position",Position.ovNamedNoException("RelativePos"));
            Middle.connectIVNoException("Zone",MidSensorRange);
            AtMid = (BOOL) Middle.ovNamedNoException("Detected");
            MovingStatus.connectIVNoException("Extend",Extend);
            MovingStatus.connectIVNoException("Retract",Retract);
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 The University of Auckland. All rights reserved. */




    /** FUNCTION_BLOCK PnPSensor
     * @author Cheng Pang
     * @version 20150208/Cheng Pang
     */
    private class PnPSensor extends FBInstance
    {
        /** The object's position */
        public UINT Position = new UINT();
        /** Detection range of the sensor */
        public ARRAY Zone = new ARRAY(new UINT(),2);
        /** Whether an object is detected */
        public BOOL Detected = new BOOL();
        /** VAR emitCHG */
        public BOOL emitCHG = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Clock signal */
        public EventServer CLK = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Value of DETECTED changed */
        public EventOutput CHG = new EventOutput();
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
            if ("Detected".equals(s)) return Detected;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("Position".equals(ivName)) connect_Position((UINT) newIV);
            else if ("Zone".equals(ivName)) connect_Zone((ARRAY) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable Position
         * @param newIV The variable to connect
         */
        public void connect_Position(UINT newIV) {
            Position = newIV;
        }

        /** Connect the given variable to the input variable Zone
         * @param newIV The variable to connect
         */
        public void connect_Zone(ARRAY newIV) {
            Zone = newIV;
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
        }
        private static final int index_DETECT = 2;
        private void state_DETECT() {
            eccState = index_DETECT;
            alg_DETECT();
            if (emitCHG.value) state_EMITCHG();
        }
        private static final int index_EMITCHG = 3;
        private void state_EMITCHG() {
            eccState = index_EMITCHG;
            alg_EMITCHG();
            CHG.serviceEvent(this);
        }

        /** The default constructor. */
        public PnPSensor() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == CLK) service_CLK();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_PnPSensor_0(); 
            }
        }

        /** Services the CLK event. */
        public void service_CLK() {
            if ((eccState == index_INIT)) {
                state_DETECT();
                transition_PnPSensor_1(); 
            }
            else if ((eccState == index_DETECT)) {
                state_DETECT();
                transition_PnPSensor_2(); 
            }
            else if ((eccState == index_EMITCHG)) {
                state_DETECT();
                transition_PnPSensor_3(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            if ((Position.value >= ((UINT) Zone.value[0]).value) && (Position.value <= ((UINT) Zone.value[1]).value)) {
                Detected.value = true;
            }
            else {
                Detected.value = false;
            }
            emitCHG.value = false;

        }

        /** ALGORITHM DETECT IN Java*/
        public void alg_DETECT() {
            if ((Position.value >= ((UINT) Zone.value[0]).value) && (Position.value <= ((UINT) Zone.value[1]).value)) {
                if (Detected.value == false) {
                    Detected.value = true;
                    emitCHG.value = true;
                }
            }
            else {
                if (Detected.value == true) {
                    Detected.value = false;
                    emitCHG.value = true;
                }
            }

        }

        /** ALGORITHM EMITCHG IN ST*/
        public void alg_EMITCHG() {
            emitCHG.value = false;
        }
    }
    private void transition_PnPSensor_0() {
    }

    private void transition_PnPSensor_1() {
    }

    private void transition_PnPSensor_2() {
    }

    private void transition_PnPSensor_3() {
    }
    /* Copyright (c)2015 The University of Auckland. All rights reserved. */




    /** FUNCTION_BLOCK MovementBlockType1
     * @author Cheng Pang
     * @version 20150208/Cheng Pang
     */
    private class MovementBlockType1 extends FBInstance
    {
        /** Move forwards */
        public BOOL Extend = new BOOL();
        /** Move backwards */
        public BOOL Retract = new BOOL();
        /** Confirmed move forwards */
        public BOOL C_FWD = new BOOL();
        /** Confirmed move backwards */
        public BOOL C_BWD = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Clock signal */
        public EventServer CLK = new EventInput(this);
        /** EVENT FAULT */
        public EventServer FAULT = new EventInput(this);
        /** EVENT RESUME */
        public EventServer RESUME = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Data outputs changed */
        public EventOutput CHG = new EventOutput();
        /** EVENT OFAULT */
        public EventOutput OFAULT = new EventOutput();
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
            if ("C_FWD".equals(s)) return C_FWD;
            if ("C_BWD".equals(s)) return C_BWD;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("Extend".equals(ivName)) connect_Extend((BOOL) newIV);
            else if ("Retract".equals(ivName)) connect_Retract((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable Extend
         * @param newIV The variable to connect
         */
        public void connect_Extend(BOOL newIV) {
            Extend = newIV;
        }

        /** Connect the given variable to the input variable Retract
         * @param newIV The variable to connect
         */
        public void connect_Retract(BOOL newIV) {
            Retract = newIV;
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
        }
        private static final int index_MOVE_FWD = 2;
        private void state_MOVE_FWD() {
            eccState = index_MOVE_FWD;
            alg_FWD();
            CHG.serviceEvent(this);
        }
        private static final int index_MOVE_BWD = 3;
        private void state_MOVE_BWD() {
            eccState = index_MOVE_BWD;
            alg_BWD();
            CHG.serviceEvent(this);
        }
        private static final int index_STOP = 4;
        private void state_STOP() {
            eccState = index_STOP;
            alg_STOP();
            CHG.serviceEvent(this);
        }
        private static final int index_FAILURE = 5;
        private void state_FAILURE() {
            eccState = index_FAILURE;
            alg_STOP();
            OFAULT.serviceEvent(this);
        }

        /** The default constructor. */
        public MovementBlockType1() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == CLK) service_CLK();
            else if (e == FAULT) service_FAULT();
            else if (e == RESUME) service_RESUME();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_MovementBlockType1_0(); 
            }
        }

        /** Services the CLK event. */
        public void service_CLK() {
            if ((eccState == index_INIT) && (Extend.value & (!Retract.value))) {
                state_MOVE_FWD();
                transition_MovementBlockType1_1(); 
            }
            else if ((eccState == index_INIT) && ((!Extend.value) & (!Retract.value))) {
                state_STOP();
                transition_MovementBlockType1_2(); 
            }
            else if ((eccState == index_INIT) && (Retract.value & (!Extend.value))) {
                state_MOVE_BWD();
                transition_MovementBlockType1_3(); 
            }
            else if ((eccState == index_MOVE_FWD) && ((!Extend.value) & (!Retract.value))) {
                state_STOP();
                transition_MovementBlockType1_4(); 
            }
            else if ((eccState == index_MOVE_BWD) && ((!Extend.value) & (!Retract.value))) {
                state_STOP();
                transition_MovementBlockType1_5(); 
            }
            else if ((eccState == index_STOP) && (Extend.value & (!Retract.value))) {
                state_MOVE_FWD();
                transition_MovementBlockType1_6(); 
            }
            else if ((eccState == index_STOP) && (Retract.value & (!Extend.value))) {
                state_MOVE_BWD();
                transition_MovementBlockType1_7(); 
            }
            else if ((eccState == index_MOVE_FWD) && (Retract.value & (!Extend.value))) {
                state_MOVE_BWD();
                transition_MovementBlockType1_8(); 
            }
            else if ((eccState == index_MOVE_BWD) && (Extend.value & (!Retract.value))) {
                state_MOVE_FWD();
                transition_MovementBlockType1_9(); 
            }
            else if ((eccState == index_STOP) && (Extend.value & Retract.value)) {
                state_FAILURE();
                transition_MovementBlockType1_10(); 
            }
            else if ((eccState == index_INIT) && (Extend.value & Retract.value)) {
                state_FAILURE();
                transition_MovementBlockType1_11(); 
            }
            else if ((eccState == index_MOVE_FWD) && (Extend.value & Retract.value)) {
                state_FAILURE();
                transition_MovementBlockType1_12(); 
            }
            else if ((eccState == index_MOVE_BWD) && (Extend.value & Retract.value)) {
                state_FAILURE();
                transition_MovementBlockType1_13(); 
            }
            else if ((eccState == index_MOVE_FWD) && (Extend.value & (!Retract.value))) {
                state_MOVE_FWD();
                transition_MovementBlockType1_14(); 
            }
            else if ((eccState == index_MOVE_BWD) && (Retract.value & (!Extend.value))) {
                state_MOVE_BWD();
                transition_MovementBlockType1_15(); 
            }
            else if ((eccState == index_STOP) && ((!Extend.value) & (!Retract.value))) {
                state_STOP();
                transition_MovementBlockType1_16(); 
            }
        }

        /** Services the FAULT event. */
        public void service_FAULT() {
            if ((eccState == index_MOVE_FWD)) {
                state_FAILURE();
                transition_MovementBlockType1_17(); 
            }
            else if ((eccState == index_STOP)) {
                state_FAILURE();
                transition_MovementBlockType1_18(); 
            }
            else if ((eccState == index_MOVE_BWD)) {
                state_FAILURE();
                transition_MovementBlockType1_19(); 
            }
        }

        /** Services the RESUME event. */
        public void service_RESUME() {
            if ((eccState == index_FAILURE)) {
                state_STOP();
                transition_MovementBlockType1_20(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            C_FWD.value = false;
            C_BWD.value = false;

        }

        /** ALGORITHM FWD IN Java*/
        public void alg_FWD() {
            C_FWD.value = true;
            C_BWD.value = false;
            //System.out.println("\n  MotionLogic.FWD:");
            //System.out.println("  Moving forwards");

        }

        /** ALGORITHM BWD IN Java*/
        public void alg_BWD() {
            C_FWD.value = false;
            C_BWD.value = true;

            //System.out.println("Moving Backwards");

        }

        /** ALGORITHM STOP IN Java*/
        public void alg_STOP() {
            C_FWD.value = false;
            C_BWD.value = false;

            //System.out.println("Stopped");

        }
    }
    private void transition_MovementBlockType1_0() {
    }

    private void transition_MovementBlockType1_1() {
    }

    private void transition_MovementBlockType1_2() {
    }

    private void transition_MovementBlockType1_3() {
    }

    private void transition_MovementBlockType1_4() {
    }

    private void transition_MovementBlockType1_5() {
    }

    private void transition_MovementBlockType1_6() {
    }

    private void transition_MovementBlockType1_7() {
    }

    private void transition_MovementBlockType1_8() {
    }

    private void transition_MovementBlockType1_9() {
    }

    private void transition_MovementBlockType1_10() {
    }

    private void transition_MovementBlockType1_11() {
    }

    private void transition_MovementBlockType1_12() {
    }

    private void transition_MovementBlockType1_13() {
    }

    private void transition_MovementBlockType1_14() {
    }

    private void transition_MovementBlockType1_15() {
    }

    private void transition_MovementBlockType1_16() {
    }

    private void transition_MovementBlockType1_17() {
    }

    private void transition_MovementBlockType1_18() {
    }

    private void transition_MovementBlockType1_19() {
    }

    private void transition_MovementBlockType1_20() {
    }
    /* Copyright (c)2015 The University of Auckland. All rights reserved. */




    /** FUNCTION_BLOCK LinearMotionLoad
     * @author Sandeep Patil
     * @version 20150208/Sandeep Patil
     */
    private class LinearMotionLoad extends FBInstance
    {
        /** Forward speed */
        public UINT ForwardSpeed = new UINT();
        /** Backward speed */
        public UINT BackwardSpeed = new UINT();
        /** Absolute initial position */
        public REAL InitialPosition = new REAL();
        /** VAR MovingDistance */
        public UINT MovingDistance = new UINT();
        /** Move forwards */
        public BOOL MoveForwards = new BOOL();
        /** Move backwards */
        public BOOL MoveBackwards = new BOOL();
        /** VAR Loaded */
        public BOOL Loaded = new BOOL();
        /** With different types of load, the actual moving speed varies */
        public UINT LoadType = new UINT();
        /** VAR AbsolutePos */
        public UINT AbsolutePos = new UINT();
        /** Position in percentation */
        public UINT RelativePos = new UINT();
        /** VAR percentagePos */
        public REAL percentagePos = new REAL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Clock signal */
        public EventServer CLK = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Indicates changes on the data output */
        public EventOutput CHG = new EventOutput();
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
            if ("AbsolutePos".equals(s)) return AbsolutePos;
            if ("RelativePos".equals(s)) return RelativePos;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("ForwardSpeed".equals(ivName)) connect_ForwardSpeed((UINT) newIV);
            else if ("BackwardSpeed".equals(ivName)) connect_BackwardSpeed((UINT) newIV);
            else if ("InitialPosition".equals(ivName)) connect_InitialPosition((REAL) newIV);
            else if ("MovingDistance".equals(ivName)) connect_MovingDistance((UINT) newIV);
            else if ("MoveForwards".equals(ivName)) connect_MoveForwards((BOOL) newIV);
            else if ("MoveBackwards".equals(ivName)) connect_MoveBackwards((BOOL) newIV);
            else if ("Loaded".equals(ivName)) connect_Loaded((BOOL) newIV);
            else if ("LoadType".equals(ivName)) connect_LoadType((UINT) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable ForwardSpeed
         * @param newIV The variable to connect
         */
        public void connect_ForwardSpeed(UINT newIV) {
            ForwardSpeed = newIV;
        }

        /** Connect the given variable to the input variable BackwardSpeed
         * @param newIV The variable to connect
         */
        public void connect_BackwardSpeed(UINT newIV) {
            BackwardSpeed = newIV;
        }

        /** Connect the given variable to the input variable InitialPosition
         * @param newIV The variable to connect
         */
        public void connect_InitialPosition(REAL newIV) {
            InitialPosition = newIV;
        }

        /** Connect the given variable to the input variable MovingDistance
         * @param newIV The variable to connect
         */
        public void connect_MovingDistance(UINT newIV) {
            MovingDistance = newIV;
        }

        /** Connect the given variable to the input variable MoveForwards
         * @param newIV The variable to connect
         */
        public void connect_MoveForwards(BOOL newIV) {
            MoveForwards = newIV;
        }

        /** Connect the given variable to the input variable MoveBackwards
         * @param newIV The variable to connect
         */
        public void connect_MoveBackwards(BOOL newIV) {
            MoveBackwards = newIV;
        }

        /** Connect the given variable to the input variable Loaded
         * @param newIV The variable to connect
         */
        public void connect_Loaded(BOOL newIV) {
            Loaded = newIV;
        }

        /** Connect the given variable to the input variable LoadType
         * @param newIV The variable to connect
         */
        public void connect_LoadType(UINT newIV) {
            LoadType = newIV;
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
            state_HOME();
            transition_LinearMotionLoad_0();
        }
        private static final int index_MOVE_FWD = 2;
        private void state_MOVE_FWD() {
            eccState = index_MOVE_FWD;
            alg_INCR();
            CHG.serviceEvent(this);
        }
        private static final int index_MOVE_BWD = 3;
        private void state_MOVE_BWD() {
            eccState = index_MOVE_BWD;
            alg_DECR();
            CHG.serviceEvent(this);
        }
        private static final int index_STOP = 4;
        private void state_STOP() {
            eccState = index_STOP;
            CHG.serviceEvent(this);
        }
        private static final int index_HOME = 5;
        private void state_HOME() {
            eccState = index_HOME;
        }

        /** The default constructor. */
        public LinearMotionLoad() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == CLK) service_CLK();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_LinearMotionLoad_1(); 
            }
        }

        /** Services the CLK event. */
        public void service_CLK() {
            if ((eccState == index_HOME) && (MoveForwards.value)) {
                state_MOVE_FWD();
                transition_LinearMotionLoad_2(); 
            }
            else if ((eccState == index_MOVE_FWD) && ((!MoveForwards.value) & (!MoveBackwards.value))) {
                state_STOP();
                transition_LinearMotionLoad_3(); 
            }
            else if ((eccState == index_MOVE_BWD) && ((!MoveForwards.value) & (!MoveBackwards.value))) {
                state_STOP();
                transition_LinearMotionLoad_4(); 
            }
            else if ((eccState == index_STOP) && (MoveForwards.value)) {
                state_MOVE_FWD();
                transition_LinearMotionLoad_5(); 
            }
            else if ((eccState == index_STOP) && (MoveBackwards.value)) {
                state_MOVE_BWD();
                transition_LinearMotionLoad_6(); 
            }
            else if ((eccState == index_MOVE_BWD) && (RelativePos.value == 0)) {
                state_HOME();
                transition_LinearMotionLoad_7(); 
            }
            else if ((eccState == index_MOVE_FWD) && (MoveBackwards.value)) {
                state_MOVE_BWD();
                transition_LinearMotionLoad_8(); 
            }
            else if ((eccState == index_MOVE_BWD) && (MoveForwards.value)) {
                state_MOVE_FWD();
                transition_LinearMotionLoad_9(); 
            }
            else if ((eccState == index_MOVE_FWD) && (MoveForwards.value & (RelativePos.value < 100))) {
                state_MOVE_FWD();
                transition_LinearMotionLoad_10(); 
            }
            else if ((eccState == index_MOVE_BWD) && (MoveBackwards.value & (RelativePos.value > 0))) {
                state_MOVE_BWD();
                transition_LinearMotionLoad_11(); 
            }
            else if ((eccState == index_HOME) && (MoveBackwards.value)) {
                state_MOVE_BWD();
                transition_LinearMotionLoad_12(); 
            }
            else if ((eccState == index_MOVE_FWD) && (RelativePos.value == 100)) {
                state_HOME();
                transition_LinearMotionLoad_13(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            System.out.println("\n  LinearMotion_C.INIT");

            float position = (float) InitialPosition.value;

            //AbsolutePos.value=(int)Math.ceil(position);
            AbsolutePos.value = (int) Math.floor(position);

        }

        /** ALGORITHM INCR IN Java*/
        public void alg_INCR() {
            // With different types of load, the actual moving speed changes

            float position = 0;

            // ---------- Check whether the motor is loaded ----------
            if (Loaded.value && LoadType.value > 0)
            {
                position = (float) (AbsolutePos.value + ForwardSpeed.value * (1 - LoadType.value / 10.0));
                position = (position > MovingDistance.value) ? MovingDistance.value : position;
                percentagePos.value = (int) Math.floor((position / MovingDistance.value) * 100);
            }
            else
            {
                position = (float) (AbsolutePos.value + ForwardSpeed.value);
                position = (position > MovingDistance.value) ? MovingDistance.value : position;
                percentagePos.value = (int) Math.floor((position / MovingDistance.value) * 100);    
            }

            AbsolutePos.value = (int) Math.floor(position);
            RelativePos.value = (int) percentagePos.value;

            //System.out.println("PercentagePos = " + RelativePos.value + " " + AbsolutePos.value + " " + position);

        }

        /** ALGORITHM DECR IN Java*/
        public void alg_DECR() {
            // ---------- Check whether the motor is loaded ----------

            float position = 0;

            // ---------- Check whether the motor is loaded ----------
            if (Loaded.value && LoadType.value > 0)
            {
                position = (float) (AbsolutePos.value - BackwardSpeed.value * (1 - LoadType.value / 10.0));
                position = (position < 0) ? 0 : position;
                percentagePos.value = (int) Math.floor((position / MovingDistance.value) * 100);
            }
            else
            {
                position = (float) (AbsolutePos.value - BackwardSpeed.value);
                position = (position < 0) ? 0 : position;
                percentagePos.value = (int) Math.floor((position / MovingDistance.value) * 100);   
            }

            AbsolutePos.value = (int) Math.floor(position);
            RelativePos.value = (int) percentagePos.value;

        }
    }
    private void transition_LinearMotionLoad_0() {
    }

    private void transition_LinearMotionLoad_1() {
    }

    private void transition_LinearMotionLoad_2() {
    }

    private void transition_LinearMotionLoad_3() {
    }

    private void transition_LinearMotionLoad_4() {
    }

    private void transition_LinearMotionLoad_5() {
    }

    private void transition_LinearMotionLoad_6() {
    }

    private void transition_LinearMotionLoad_7() {
    }

    private void transition_LinearMotionLoad_8() {
    }

    private void transition_LinearMotionLoad_9() {
    }

    private void transition_LinearMotionLoad_10() {
    }

    private void transition_LinearMotionLoad_11() {
    }

    private void transition_LinearMotionLoad_12() {
    }

    private void transition_LinearMotionLoad_13() {
    }
    /* Copyright (c)2015 The University of Auckland. All rights reserved. */




    /** FUNCTION_BLOCK GenericCylinderModelType2
     * @author Sandeep Patil
     * @version 20150208/Sandeep Patil
     */
    private class GenericCylinderModelType2 extends FBInstance
    {
        /** Forward speed */
        public UINT ForwardSpeed = new UINT();
        /** Backward speed */
        public UINT BackwardSpeed = new UINT();
        /** Initial position */
        public REAL InitialPosition = new REAL();
        /** Moving distance */
        public UINT MovingtDistance = new UINT();
        /** Detection range of home sensor */
        public ARRAY HomeSensorRange = new ARRAY(new UINT(),2);
        /** Detection range of home sensor */
        public ARRAY MidSensorRange = new ARRAY(new UINT(),2);
        /** Detection range of end sensor */
        public ARRAY EndSensorRange = new ARRAY(new UINT(),2);
        /** VAR Extend */
        public BOOL Extend = new BOOL();
        /** VAR Loaded */
        public BOOL Loaded = new BOOL();
        /** VAR LoadType */
        public UINT LoadType = new UINT();
        /** Current position */
        public UINT AbsolutePos = new UINT();
        /** Detected at home position */
        public BOOL AtHome = new BOOL();
        /** Detected at end position */
        public BOOL AtEnd = new BOOL();
        /** VAR AtMid */
        public BOOL AtMid = new BOOL();
        /** Initialization Request */
        public EventOutput INIT = new EventOutput();
        /** Clock signal */
        public EventOutput CLK = new EventOutput();
        /** EVENT FAULT */
        public EventOutput FAULT = new EventOutput();
        /** EVENT RESUME */
        public EventOutput RESUME = new EventOutput();
        /** EVENT CYL_IND */
        public EventOutput CYL_IND = new EventOutput();
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Indicate data outputs changed */
        public EventOutput CHG = new EventOutput();
        /** EVENT OFAULT */
        public EventOutput OFAULT = new EventOutput();
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
            if ("AbsolutePos".equals(s)) return AbsolutePos;
            if ("AtHome".equals(s)) return AtHome;
            if ("AtEnd".equals(s)) return AtEnd;
            if ("AtMid".equals(s)) return AtMid;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("ForwardSpeed".equals(ivName)) connect_ForwardSpeed((UINT) newIV);
            else if ("BackwardSpeed".equals(ivName)) connect_BackwardSpeed((UINT) newIV);
            else if ("InitialPosition".equals(ivName)) connect_InitialPosition((REAL) newIV);
            else if ("MovingtDistance".equals(ivName)) connect_MovingtDistance((UINT) newIV);
            else if ("HomeSensorRange".equals(ivName)) connect_HomeSensorRange((ARRAY) newIV);
            else if ("MidSensorRange".equals(ivName)) connect_MidSensorRange((ARRAY) newIV);
            else if ("EndSensorRange".equals(ivName)) connect_EndSensorRange((ARRAY) newIV);
            else if ("Extend".equals(ivName)) connect_Extend((BOOL) newIV);
            else if ("Loaded".equals(ivName)) connect_Loaded((BOOL) newIV);
            else if ("LoadType".equals(ivName)) connect_LoadType((UINT) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable ForwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_ForwardSpeed(UINT newIV) throws FBRManagementException {
            ForwardSpeed = newIV;
            Position.connectIVNoException("ForwardSpeed",ForwardSpeed);
        }

        /** Connect the given variable to the input variable BackwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_BackwardSpeed(UINT newIV) throws FBRManagementException {
            BackwardSpeed = newIV;
            Position.connectIVNoException("BackwardSpeed",BackwardSpeed);
        }

        /** Connect the given variable to the input variable InitialPosition
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_InitialPosition(REAL newIV) throws FBRManagementException {
            InitialPosition = newIV;
            Position.connectIVNoException("InitialPosition",InitialPosition);
        }

        /** Connect the given variable to the input variable MovingtDistance
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_MovingtDistance(UINT newIV) throws FBRManagementException {
            MovingtDistance = newIV;
            Position.connectIVNoException("MovingDistance",MovingtDistance);
        }

        /** Connect the given variable to the input variable HomeSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_HomeSensorRange(ARRAY newIV) throws FBRManagementException {
            HomeSensorRange = newIV;
            Home.connectIVNoException("Zone",HomeSensorRange);
        }

        /** Connect the given variable to the input variable MidSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_MidSensorRange(ARRAY newIV) throws FBRManagementException {
            MidSensorRange = newIV;
            Middle.connectIVNoException("Zone",MidSensorRange);
        }

        /** Connect the given variable to the input variable EndSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_EndSensorRange(ARRAY newIV) throws FBRManagementException {
            EndSensorRange = newIV;
            End.connectIVNoException("Zone",EndSensorRange);
        }

        /** Connect the given variable to the input variable Extend
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_Extend(BOOL newIV) throws FBRManagementException {
            Extend = newIV;
            MovingStatus.connectIVNoException("Extend",Extend);
        }

        /** Connect the given variable to the input variable Loaded
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_Loaded(BOOL newIV) throws FBRManagementException {
            Loaded = newIV;
            Position.connectIVNoException("Loaded",Loaded);
        }

        /** Connect the given variable to the input variable LoadType
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_LoadType(UINT newIV) throws FBRManagementException {
            LoadType = newIV;
            Position.connectIVNoException("LoadType",LoadType);
        }
        /** FB Home */
        protected PnPSensor Home = new PnPSensor() ;
        /** FB Middle */
        protected PnPSensor Middle = new PnPSensor() ;
        /** FB End */
        protected PnPSensor End = new PnPSensor() ;
        /** FB MovingStatus */
        protected MovementBlockType2 MovingStatus = new MovementBlockType2() ;
        /** FB Position */
        protected LinearMotionLoad Position = new LinearMotionLoad() ;
        /** The default constructor. */
        public GenericCylinderModelType2() {
            super();
            INIT.connectTo(MovingStatus.INIT);
            FAULT.connectTo(MovingStatus.FAULT);
            RESUME.connectTo(MovingStatus.RESUME);
            Home.CHG.connectTo(CHG);
            End.CHG.connectTo(CHG);
            End.INITO.connectTo(INITO);
            MovingStatus.OFAULT.connectTo(OFAULT);
            MovingStatus.INITO.connectTo(Position.INIT);
            Position.INITO.connectTo(Home.INIT);
            Position.CHG.connectTo(Home.CLK);
            Position.CHG.connectTo(End.CLK);
            Home.INITO.connectTo(Middle.INIT);
            Middle.INITO.connectTo(End.INIT);
            Position.CHG.connectTo(Middle.CLK);
            Position.CHG.connectTo(CNF);
            CLK.connectTo(Position.CLK);
            CYL_IND.connectTo(MovingStatus.CLK);
            End.connectIVNoException("Zone",EndSensorRange);
            Position.connectIVNoException("MoveForwards",MovingStatus.ovNamedNoException("C_FWD"));
            Position.connectIVNoException("MoveBackwards",MovingStatus.ovNamedNoException("C_BWD"));
            Position.connectIVNoException("Loaded",Loaded);
            Position.connectIVNoException("ForwardSpeed",ForwardSpeed);
            Position.connectIVNoException("BackwardSpeed",BackwardSpeed);
            Position.connectIVNoException("LoadType",LoadType);
            AbsolutePos = (UINT) Position.ovNamedNoException("AbsolutePos");
            Position.connectIVNoException("MovingDistance",MovingtDistance);
            AtHome = (BOOL) Home.ovNamedNoException("Detected");
            AtEnd = (BOOL) End.ovNamedNoException("Detected");
            Position.connectIVNoException("InitialPosition",InitialPosition);
            Home.connectIVNoException("Zone",HomeSensorRange);
            Home.connectIVNoException("Position",Position.ovNamedNoException("RelativePos"));
            End.connectIVNoException("Position",Position.ovNamedNoException("RelativePos"));
            Middle.connectIVNoException("Position",Position.ovNamedNoException("RelativePos"));
            Middle.connectIVNoException("Zone",MidSensorRange);
            AtMid = (BOOL) Middle.ovNamedNoException("Detected");
            MovingStatus.connectIVNoException("Extend",Extend);
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 The University of Auckland. All rights reserved. */




    /** FUNCTION_BLOCK MovementBlockType2
     * @author Sandeep Patil
     * @version 20150208/Sandeep Patil
     */
    private class MovementBlockType2 extends FBInstance
    {
        /** Move forwards */
        public BOOL Extend = new BOOL();
        /** Confirmed move forwards */
        public BOOL C_FWD = new BOOL();
        /** Confirmed move backwards */
        public BOOL C_BWD = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Clock signal */
        public EventServer CLK = new EventInput(this);
        /** EVENT FAULT */
        public EventServer FAULT = new EventInput(this);
        /** EVENT RESUME */
        public EventServer RESUME = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Data outputs changed */
        public EventOutput CHG = new EventOutput();
        /** EVENT OFAULT */
        public EventOutput OFAULT = new EventOutput();
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
            if ("C_FWD".equals(s)) return C_FWD;
            if ("C_BWD".equals(s)) return C_BWD;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("Extend".equals(ivName)) connect_Extend((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable Extend
         * @param newIV The variable to connect
         */
        public void connect_Extend(BOOL newIV) {
            Extend = newIV;
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
        }
        private static final int index_MOVE_FWD = 2;
        private void state_MOVE_FWD() {
            eccState = index_MOVE_FWD;
            alg_FWD();
            CHG.serviceEvent(this);
        }
        private static final int index_MOVE_BWD = 3;
        private void state_MOVE_BWD() {
            eccState = index_MOVE_BWD;
            alg_BWD();
            CHG.serviceEvent(this);
        }
        private static final int index_STOP = 4;
        private void state_STOP() {
            eccState = index_STOP;
            alg_STOP();
            CHG.serviceEvent(this);
        }
        private static final int index_FAILURE = 5;
        private void state_FAILURE() {
            eccState = index_FAILURE;
            alg_STOP();
            OFAULT.serviceEvent(this);
        }

        /** The default constructor. */
        public MovementBlockType2() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == CLK) service_CLK();
            else if (e == FAULT) service_FAULT();
            else if (e == RESUME) service_RESUME();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_MovementBlockType2_0(); 
            }
        }

        /** Services the CLK event. */
        public void service_CLK() {
            if ((eccState == index_INIT) && (Extend.value)) {
                state_MOVE_FWD();
                transition_MovementBlockType2_1(); 
            }
            else if ((eccState == index_INIT) && (!Extend.value)) {
                state_MOVE_BWD();
                transition_MovementBlockType2_2(); 
            }
            else if ((eccState == index_STOP) && (Extend.value)) {
                state_MOVE_FWD();
                transition_MovementBlockType2_3(); 
            }
            else if ((eccState == index_STOP) && (!Extend.value)) {
                state_MOVE_BWD();
                transition_MovementBlockType2_4(); 
            }
            else if ((eccState == index_MOVE_FWD) && (!Extend.value)) {
                state_MOVE_BWD();
                transition_MovementBlockType2_5(); 
            }
            else if ((eccState == index_MOVE_BWD) && (Extend.value)) {
                state_MOVE_FWD();
                transition_MovementBlockType2_6(); 
            }
            else if ((eccState == index_MOVE_FWD) && (Extend.value)) {
                state_MOVE_FWD();
                transition_MovementBlockType2_7(); 
            }
            else if ((eccState == index_MOVE_BWD) && (!Extend.value)) {
                state_MOVE_BWD();
                transition_MovementBlockType2_8(); 
            }
        }

        /** Services the FAULT event. */
        public void service_FAULT() {
            if ((eccState == index_MOVE_FWD)) {
                state_FAILURE();
                transition_MovementBlockType2_9(); 
            }
            else if ((eccState == index_STOP)) {
                state_FAILURE();
                transition_MovementBlockType2_10(); 
            }
            else if ((eccState == index_MOVE_BWD)) {
                state_FAILURE();
                transition_MovementBlockType2_11(); 
            }
            else if ((eccState == index_INIT)) {
                state_FAILURE();
                transition_MovementBlockType2_12(); 
            }
        }

        /** Services the RESUME event. */
        public void service_RESUME() {
            if ((eccState == index_FAILURE)) {
                state_STOP();
                transition_MovementBlockType2_13(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            C_FWD.value = false;
            C_BWD.value = false;

        }

        /** ALGORITHM FWD IN Java*/
        public void alg_FWD() {
            C_FWD.value = true;
            C_BWD.value = false;

        }

        /** ALGORITHM BWD IN Java*/
        public void alg_BWD() {
            C_FWD.value = false;
            C_BWD.value = true;

        }

        /** ALGORITHM STOP IN Java*/
        public void alg_STOP() {
            C_FWD.value = false;
            C_BWD.value = false;

        }
    }
    private void transition_MovementBlockType2_0() {
    }

    private void transition_MovementBlockType2_1() {
    }

    private void transition_MovementBlockType2_2() {
    }

    private void transition_MovementBlockType2_3() {
    }

    private void transition_MovementBlockType2_4() {
    }

    private void transition_MovementBlockType2_5() {
    }

    private void transition_MovementBlockType2_6() {
    }

    private void transition_MovementBlockType2_7() {
    }

    private void transition_MovementBlockType2_8() {
    }

    private void transition_MovementBlockType2_9() {
    }

    private void transition_MovementBlockType2_10() {
    }

    private void transition_MovementBlockType2_11() {
    }

    private void transition_MovementBlockType2_12() {
    }

    private void transition_MovementBlockType2_13() {
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK PnpXYCalculator
     * @author JHC
     * @version 20150208/JHC
     */
    private class PnpXYCalculator extends FBInstance
    {
        /** VAR BASEX */
        public UINT BASEX = new UINT();
        /** VAR BASEY */
        public UINT BASEY = new UINT();
        /** VAR vacuum_on */
        public BOOL vacuum_on = new BOOL();
        /** VAR vacuum_off */
        public BOOL vacuum_off = new BOOL();
        /** VAR Add1 */
        public BOOL Add1 = new BOOL();
        /** VAR Add2 */
        public BOOL Add2 = new BOOL();
        /** VAR Add3 */
        public BOOL Add3 = new BOOL();
        /** VAR AddedWP_X */
        public UINT AddedWP_X = new UINT();
        /** VAR AddedWP_Y */
        public UINT AddedWP_Y = new UINT();
        /** VAR LCPos */
        public UINT LCPos = new UINT();
        /** VAR RCPos */
        public UINT RCPos = new UINT();
        /** VAR VCPos */
        public UINT VCPos = new UINT();
        /** VAR vacuumon */
        public BOOL vacuumon = new BOOL();
        /** Response Data from Socket */
        public UINT BASE_X = new UINT();
        /** Response Data from Socket */
        public UINT BASE_Y = new UINT();
        /** Response Data from Socket */
        public UINT CYL1_X = new UINT();
        /** Response Data from Socket */
        public UINT CYL1_Y = new UINT();
        /** Response Data from Socket */
        public UINT CYL2_X = new UINT();
        /** Response Data from Socket */
        public UINT CYL2_Y = new UINT();
        /** Response Data from Socket */
        public UINT VCYL_X = new UINT();
        /** Response Data from Socket */
        public UINT VCYL_Y = new UINT();
        /** Response Data from Socket */
        public UINT WP_X = new UINT();
        /** Response Data from Socket */
        public UINT WP_Y = new UINT();
        /** Response Data from Socket */
        public UINT WP2_X = new UINT();
        /** Response Data from Socket */
        public UINT WP2_Y = new UINT();
        /** Response Data from Socket */
        public UINT WP3_X = new UINT();
        /** Response Data from Socket */
        public UINT WP3_Y = new UINT();
        /** VAR cyl1x */
        public UINT cyl1x = new UINT();
        /** VAR cyl2x */
        public UINT cyl2x = new UINT();
        /** VAR vcyly */
        public UINT vcyly = new UINT();
        /** VAR wpx */
        public UINT wpx = new UINT();
        /** VAR wpy */
        public UINT wpy = new UINT();
        /** VAR wp2x */
        public UINT wp2x = new UINT();
        /** VAR wp2y */
        public UINT wp2y = new UINT();
        /** VAR wp3x */
        public UINT wp3x = new UINT();
        /** VAR wp3y */
        public UINT wp3y = new UINT();
        /** VAR slider1 */
        public BOOL slider1 = new BOOL();
        /** VAR slider2 */
        public BOOL slider2 = new BOOL();
        /** VAR slider3 */
        public BOOL slider3 = new BOOL();
        /** VAR wpon */
        public BOOL wpon = new BOOL();
        /** VAR wp2on */
        public BOOL wp2on = new BOOL();
        /** VAR wp3on */
        public BOOL wp3on = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Clock */
        public EventServer CLK = new EventInput(this);
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
        /** EVENT ADD_WP */
        public EventServer ADD_WP = new EventInput(this);
        /** EVENT ADD_WP00 */
        public EventServer ADD_WP00 = new EventInput(this);
        /** EVENT REMOVE_WP */
        public EventServer REMOVE_WP = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** EVENT CNF */
        public EventOutput CNF = new EventOutput();
        /** EVENT WP_ADDED */
        public EventOutput WP_ADDED = new EventOutput();
        /** EVENT WP_REMOVED */
        public EventOutput WP_REMOVED = new EventOutput();
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
            if ("BASE_X".equals(s)) return BASE_X;
            if ("BASE_Y".equals(s)) return BASE_Y;
            if ("CYL1_X".equals(s)) return CYL1_X;
            if ("CYL1_Y".equals(s)) return CYL1_Y;
            if ("CYL2_X".equals(s)) return CYL2_X;
            if ("CYL2_Y".equals(s)) return CYL2_Y;
            if ("VCYL_X".equals(s)) return VCYL_X;
            if ("VCYL_Y".equals(s)) return VCYL_Y;
            if ("WP_X".equals(s)) return WP_X;
            if ("WP_Y".equals(s)) return WP_Y;
            if ("WP2_X".equals(s)) return WP2_X;
            if ("WP2_Y".equals(s)) return WP2_Y;
            if ("WP3_X".equals(s)) return WP3_X;
            if ("WP3_Y".equals(s)) return WP3_Y;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("BASEX".equals(ivName)) connect_BASEX((UINT) newIV);
            else if ("BASEY".equals(ivName)) connect_BASEY((UINT) newIV);
            else if ("vacuum_on".equals(ivName)) connect_vacuum_on((BOOL) newIV);
            else if ("vacuum_off".equals(ivName)) connect_vacuum_off((BOOL) newIV);
            else if ("Add1".equals(ivName)) connect_Add1((BOOL) newIV);
            else if ("Add2".equals(ivName)) connect_Add2((BOOL) newIV);
            else if ("Add3".equals(ivName)) connect_Add3((BOOL) newIV);
            else if ("AddedWP_X".equals(ivName)) connect_AddedWP_X((UINT) newIV);
            else if ("AddedWP_Y".equals(ivName)) connect_AddedWP_Y((UINT) newIV);
            else if ("LCPos".equals(ivName)) connect_LCPos((UINT) newIV);
            else if ("RCPos".equals(ivName)) connect_RCPos((UINT) newIV);
            else if ("VCPos".equals(ivName)) connect_VCPos((UINT) newIV);
            else if ("vacuumon".equals(ivName)) connect_vacuumon((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable BASEX
         * @param newIV The variable to connect
         */
        public void connect_BASEX(UINT newIV) {
            BASEX = newIV;
        }

        /** Connect the given variable to the input variable BASEY
         * @param newIV The variable to connect
         */
        public void connect_BASEY(UINT newIV) {
            BASEY = newIV;
        }

        /** Connect the given variable to the input variable vacuum_on
         * @param newIV The variable to connect
         */
        public void connect_vacuum_on(BOOL newIV) {
            vacuum_on = newIV;
        }

        /** Connect the given variable to the input variable vacuum_off
         * @param newIV The variable to connect
         */
        public void connect_vacuum_off(BOOL newIV) {
            vacuum_off = newIV;
        }

        /** Connect the given variable to the input variable Add1
         * @param newIV The variable to connect
         */
        public void connect_Add1(BOOL newIV) {
            Add1 = newIV;
        }

        /** Connect the given variable to the input variable Add2
         * @param newIV The variable to connect
         */
        public void connect_Add2(BOOL newIV) {
            Add2 = newIV;
        }

        /** Connect the given variable to the input variable Add3
         * @param newIV The variable to connect
         */
        public void connect_Add3(BOOL newIV) {
            Add3 = newIV;
        }

        /** Connect the given variable to the input variable AddedWP_X
         * @param newIV The variable to connect
         */
        public void connect_AddedWP_X(UINT newIV) {
            AddedWP_X = newIV;
        }

        /** Connect the given variable to the input variable AddedWP_Y
         * @param newIV The variable to connect
         */
        public void connect_AddedWP_Y(UINT newIV) {
            AddedWP_Y = newIV;
        }

        /** Connect the given variable to the input variable LCPos
         * @param newIV The variable to connect
         */
        public void connect_LCPos(UINT newIV) {
            LCPos = newIV;
        }

        /** Connect the given variable to the input variable RCPos
         * @param newIV The variable to connect
         */
        public void connect_RCPos(UINT newIV) {
            RCPos = newIV;
        }

        /** Connect the given variable to the input variable VCPos
         * @param newIV The variable to connect
         */
        public void connect_VCPos(UINT newIV) {
            VCPos = newIV;
        }

        /** Connect the given variable to the input variable vacuumon
         * @param newIV The variable to connect
         */
        public void connect_vacuumon(BOOL newIV) {
            vacuumon = newIV;
        }
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_INIT = 1;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            alg_UPDATE_VIEW();
            INITO.serviceEvent(this);
            state_START();
            transition_PnpXYCalculator_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_REQ();
            CNF.serviceEvent(this);
            state_START();
            transition_PnpXYCalculator_1();
        }
        private static final int index_CLK = 3;
        private void state_CLK() {
            eccState = index_CLK;
            alg_CLK();
            alg_UPDATE_VIEW();
            CNF.serviceEvent(this);
            state_START();
            transition_PnpXYCalculator_2();
        }
        private static final int index_ADD_WP = 4;
        private void state_ADD_WP() {
            eccState = index_ADD_WP;
            alg_ADD_WP();
            WP_ADDED.serviceEvent(this);
            alg_UPDATE_VIEW();
            CNF.serviceEvent(this);
            state_START();
            transition_PnpXYCalculator_3();
        }
        private static final int index_REMOVE_WP = 5;
        private void state_REMOVE_WP() {
            eccState = index_REMOVE_WP;
            alg_REMOVE_WP();
            WP_REMOVED.serviceEvent(this);
            alg_UPDATE_VIEW();
            CNF.serviceEvent(this);
            state_START();
            transition_PnpXYCalculator_4();
        }
        private static final int index_Add00 = 6;
        private void state_Add00() {
            eccState = index_Add00;
            alg_Add_WP00();
            WP_ADDED.serviceEvent(this);
            alg_UPDATE_VIEW();
            CNF.serviceEvent(this);
            state_START();
            transition_PnpXYCalculator_5();
        }

        /** The default constructor. */
        public PnpXYCalculator() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == CLK) service_CLK();
            else if (e == REQ) service_REQ();
            else if (e == ADD_WP) service_ADD_WP();
            else if (e == ADD_WP00) service_ADD_WP00();
            else if (e == REMOVE_WP) service_REMOVE_WP();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_PnpXYCalculator_6(); 
            }
        }

        /** Services the CLK event. */
        public void service_CLK() {
            if ((eccState == index_START)) {
                state_CLK();
                transition_PnpXYCalculator_7(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_PnpXYCalculator_8(); 
            }
        }

        /** Services the ADD_WP event. */
        public void service_ADD_WP() {
            if ((eccState == index_START)) {
                state_ADD_WP();
                transition_PnpXYCalculator_9(); 
            }
        }

        /** Services the ADD_WP00 event. */
        public void service_ADD_WP00() {
            if ((eccState == index_START)) {
                state_Add00();
                transition_PnpXYCalculator_10(); 
            }
        }

        /** Services the REMOVE_WP event. */
        public void service_REMOVE_WP() {
            if ((eccState == index_START)) {
                state_REMOVE_WP();
                transition_PnpXYCalculator_11(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            wpx.value = 6000;
            wpy.value = 6000;
            wp2x.value = 6000;
            wp2y.value = 6000;
            wp3x.value = 6000;
            wp3y.value = 6000;
            wpon.value = false;
            wp2on.value = false;
            wp3on.value = false;

            BASE_X.value = BASEX.value;
            BASE_Y.value = BASEY.value;
            CYL1_Y.value = BASEY.value;
            CYL2_Y.value = BASEY.value + 12;

        }

        /** ALGORITHM REQ IN Java*/
        public void alg_REQ() {

        }

        /** ALGORITHM CLK IN Java*/
        public void alg_CLK() {
            int cyl1_length = 75;
            int cyl2_length = 150;
            int vcyl_length = 75;

            // horizontal cylinder 1
            cyl1x.value = LCPos.value;

            // horizontal cylinder 2
            cyl2x.value = RCPos.value;

            // vertical cylinder
            vcyly.value = VCPos.value;

            if (wpx.value <= 10 && wpy.value >= 185) {
                slider1.value = true;
            } else {slider1.value = false;}
            if (wp2x.value <= 10 && wp2y.value >= 185) {
                slider2.value = true;
            } else {slider2.value = false;}
            if (wp3x.value <= 10 && wp3y.value >= 185) {
                slider3.value = true;
            } else {slider3.value = false;}

            if (vacuumon.value) {
                int vacuumx = cyl1x.value + cyl2x.value;
                int vacuumy = vcyly.value + 115;
                int dx = Math.abs(wpx.value - vacuumx);
                int dy = Math.abs(wpy.value - vacuumy);
                int dx2 = Math.abs(wp2x.value - vacuumx);
                int dy2 = Math.abs(wp2y.value - vacuumy);
                int dx3 = Math.abs(wp3x.value - vacuumx);
                int dy3 = Math.abs(wp3y.value - vacuumy);

                if (dx < 17 && dy < 7 && wp2on.value == false && wp3on.value == false) {
                    wpon.value = true;
                }
                if (dx2 < 17 && dy2 < 7 && wpon.value == false && wp3on.value == false) {
                    wp2on.value = true;
                }
                if (dx3 < 17 && dy3 < 7 && wp2on.value == false && wpon.value == false) {
                    wp3on.value = true;
                }
            } else {
                wpon.value = false;
                wp2on.value = false;
                wp3on.value = false;
            }

            //System.out.println("Clocking");

        }

        /** ALGORITHM UPDATE_VIEW IN Java*/
        public void alg_UPDATE_VIEW() {
            int bx = BASEX.value;
            int by = BASEY.value;
            CYL1_X.value = bx + 22 + cyl1x.value;
            CYL2_X.value = bx + 116 + cyl1x.value + cyl2x.value;
            VCYL_X.value = bx + 305 + cyl1x.value + cyl2x.value;
            VCYL_Y.value = by + vcyly.value + 15;

            if (wpon.value) {
                wpx.value = cyl1x.value + cyl2x.value;
                wpy.value = vcyly.value + 115;
            } else if (slider1.value) {
                wpy.value = wpy.value + 1;
            } else {
                wpy.value = 190;
            }
            if (wp2on.value) {
                wp2x.value = cyl1x.value + cyl2x.value;
                wp2y.value = vcyly.value + 115;
            } else if (slider2.value) {
                wp2y.value = wp2y.value + 1;
            }else {
                wp2y.value = 190;
            }
            if (wp3on.value) {
                wp3x.value = cyl1x.value + cyl2x.value;
                wp3y.value = vcyly.value + 115;
            } else if (slider3.value) {
                wp3y.value = wp3y.value + 1;
            }else {
                wp3y.value = 190;
            }

            WP_X.value = bx + 300 + wpx.value;
            WP_Y.value = by + wpy.value;
            WP2_X.value = bx + 300 + wp2x.value;
            WP2_Y.value = by + wp2y.value;
            WP3_X.value = bx + 300 + wp3x.value;
            WP3_Y.value = by + wp3y.value;
            if (WP_X.value == 305 && WP_Y.value >= 330)
            {
                WP_X.value = 6000;
                WP_Y.value = 6000;
            }
            if (WP2_X.value == 305 && WP2_Y.value >= 330)
            {
                WP2_X.value = 6000;
                WP2_Y.value = 6000;
            }
            if (WP3_X.value == 305 && WP3_Y.value >= 330)
            {
                WP3_X.value = 6000;
                WP3_Y.value = 6000;
            }

            //System.out.println("C1X = " + CYL1_X + " C2X = " + CYL2_X + " VCX = " + VCYL_X + " VCY = " + VCYL_Y);

        }

        /** ALGORITHM ADD_WP IN Java*/
        public void alg_ADD_WP() {
            if (Add1.value == true) {
                wpx.value = 75;
                wpy.value = 215;
                wpon.value = false;
            }
            if (Add2.value == true) {
                wp2x.value = 150;
                wp2y.value = 215;
                wp2on.value = false;
            }
            if (Add3.value == true) {
                wp3x.value = 225;
                wp3y.value = 215;
                wp3on.value = false;
            }

        }

        /** ALGORITHM REMOVE_WP IN Java*/
        public void alg_REMOVE_WP() {
            if (Add1.value == true) {
                wpon.value = false;
                wpx.value = 6000;
                wpy.value = 6000;
            }
            if (Add2.value == true) {
                wp2on.value = false;
                wp2x.value = 6000;
                wp2y.value = 6000;
            }
            if (Add3.value == true) {
                wp3on.value = false;
                wp3x.value = 6000;
                wp3y.value = 6000;
            }

        }

        /** ALGORITHM Add_WP00 IN Java*/
        public void alg_Add_WP00() {
            if (Add1.value == true) {
                wpx.value = 0;
                wpy.value = 215;
                wpon.value = false;
            }
            if (Add2.value == true) {
                wp2x.value = 0;
                wp2y.value = 215;
                wp2on.value = false;
            }
            if (Add3.value == true) {
                wp3x.value = 0;
                wp3y.value = 215;
                wp3on.value = false;
            }

        }
    }
    private void transition_PnpXYCalculator_0() {
    }

    private void transition_PnpXYCalculator_1() {
    }

    private void transition_PnpXYCalculator_2() {
    }

    private void transition_PnpXYCalculator_3() {
    }

    private void transition_PnpXYCalculator_4() {
    }

    private void transition_PnpXYCalculator_5() {
    }

    private void transition_PnpXYCalculator_6() {
    }

    private void transition_PnpXYCalculator_7() {
    }

    private void transition_PnpXYCalculator_8() {
    }

    private void transition_PnpXYCalculator_9() {
    }

    private void transition_PnpXYCalculator_10() {
    }

    private void transition_PnpXYCalculator_11() {
    }
    /* Copyright (c)2015 The University of Auckland. All rights reserved. */




    /** FUNCTION_BLOCK PnPVacuum
     * @author Cheng Pang
     * @version 20150208/Cheng Pang
     */
    private class PnPVacuum extends FBInstance
    {
        /** Input event qualifier */
        public BOOL VacuumOn = new BOOL();
        /** VAR VacuumOff */
        public BOOL VacuumOff = new BOOL();
        /** State of vacuum */
        public BOOL VacState = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Clock signal */
        public EventServer CLK = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** Execution Confirmation */
        public EventOutput CHG = new EventOutput();
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
            if ("VacState".equals(s)) return VacState;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("VacuumOn".equals(ivName)) connect_VacuumOn((BOOL) newIV);
            else if ("VacuumOff".equals(ivName)) connect_VacuumOff((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable VacuumOn
         * @param newIV The variable to connect
         */
        public void connect_VacuumOn(BOOL newIV) {
            VacuumOn = newIV;
        }

        /** Connect the given variable to the input variable VacuumOff
         * @param newIV The variable to connect
         */
        public void connect_VacuumOff(BOOL newIV) {
            VacuumOff = newIV;
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
        }
        private static final int index_ON = 2;
        private void state_ON() {
            eccState = index_ON;
            alg_SWITCH_ON();
            CHG.serviceEvent(this);
        }
        private static final int index_OFF = 3;
        private void state_OFF() {
            eccState = index_OFF;
            alg_SWITCH_OFF();
            CHG.serviceEvent(this);
        }

        /** The default constructor. */
        public PnPVacuum() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == CLK) service_CLK();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_PnPVacuum_0(); 
            }
        }

        /** Services the CLK event. */
        public void service_CLK() {
            if ((eccState == index_INIT) && (VacuumOff.value)) {
                state_OFF();
                transition_PnPVacuum_1(); 
            }
            else if ((eccState == index_OFF) && (VacuumOn.value)) {
                state_ON();
                transition_PnPVacuum_2(); 
            }
            else if ((eccState == index_ON) && (VacuumOff.value)) {
                state_OFF();
                transition_PnPVacuum_3(); 
            }
            else if ((eccState == index_INIT) && (VacuumOn.value)) {
                state_ON();
                transition_PnPVacuum_4(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            //System.out.println("\n Vacuum.INIT:");
            if (VacuumOn.value) {
                VacState.value = true;
            }
            else if (VacuumOff.value) {
                VacState.value = false;
            }
            //System.out.println("");

        }

        /** ALGORITHM SWITCH_ON IN Java*/
        public void alg_SWITCH_ON() {
            VacState.value = true;

        }

        /** ALGORITHM SWITCH_OFF IN Java*/
        public void alg_SWITCH_OFF() {
            VacState.value = false;

        }
    }
    private void transition_PnPVacuum_0() {
    }

    private void transition_PnPVacuum_1() {
    }

    private void transition_PnPVacuum_2() {
    }

    private void transition_PnPVacuum_3() {
    }

    private void transition_PnPVacuum_4() {
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("wp12".equals(s)) return wp12;
            if ("wp13".equals(s)) return wp13;
            if ("wp14".equals(s)) return wp14;
            if ("wp11".equals(s)) return wp11;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("WP1_X".equals(ivName)) connect_WP1_X((UINT) newIV);
            else if ("WP1_Y".equals(ivName)) connect_WP1_Y((UINT) newIV);
            else if ("WP2_X".equals(ivName)) connect_WP2_X((UINT) newIV);
            else if ("WP2_Y".equals(ivName)) connect_WP2_Y((UINT) newIV);
            else if ("WP3_X".equals(ivName)) connect_WP3_X((UINT) newIV);
            else if ("WP3_Y".equals(ivName)) connect_WP3_Y((UINT) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable WP1_X
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_WP1_X(UINT newIV) throws FBRManagementException {
            WP1_X = newIV;
            WP1.connectIVNoException("In1",WP1_X);
            WP01.connectIVNoException("In1",WP1_X);
        }

        /** Connect the given variable to the input variable WP1_Y
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_WP1_Y(UINT newIV) throws FBRManagementException {
            WP1_Y = newIV;
            WP1.connectIVNoException("In2",WP1_Y);
            WP01.connectIVNoException("In2",WP1_Y);
        }

        /** Connect the given variable to the input variable WP2_X
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_WP2_X(UINT newIV) throws FBRManagementException {
            WP2_X = newIV;
            WP2.connectIVNoException("In1",WP2_X);
            WP02.connectIVNoException("In1",WP2_X);
        }

        /** Connect the given variable to the input variable WP2_Y
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_WP2_Y(UINT newIV) throws FBRManagementException {
            WP2_Y = newIV;
            WP2.connectIVNoException("In2",WP2_Y);
            WP02.connectIVNoException("In2",WP2_Y);
        }

        /** Connect the given variable to the input variable WP3_X
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_WP3_X(UINT newIV) throws FBRManagementException {
            WP3_X = newIV;
            WP3.connectIVNoException("In1",WP3_X);
            WP03.connectIVNoException("In1",WP3_X);
        }

        /** Connect the given variable to the input variable WP3_Y
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_WP3_Y(UINT newIV) throws FBRManagementException {
            WP3_Y = newIV;
            WP3.connectIVNoException("In2",WP3_Y);
            WP03.connectIVNoException("In2",WP3_Y);
        }
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