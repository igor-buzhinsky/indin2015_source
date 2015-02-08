package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class PNP_PLANT_MS_CONTROL_FOR_SMV__Composite {
    private final PNP_PLANT_MS_CONTROL_FOR_SMV instance = new PNP_PLANT_MS_CONTROL_FOR_SMV();

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

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK PNP_PLANT_MS_CONTROL_FOR_SMV
     * @author JHC
     * @version 20150208/JHC
     */
    private class PNP_PLANT_MS_CONTROL_FOR_SMV extends FBInstance
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
        /** VAR AddedWP_X */
        public UINT AddedWP_X = new UINT();
        /** VAR AddedWP_Y */
        public UINT AddedWP_Y = new UINT();
        /** VAR RemovedWP_X */
        public UINT RemovedWP_X = new UINT();
        /** VAR RemovedWP_Y */
        public UINT RemovedWP_Y = new UINT();
        /** Initialisation */
        public EventOutput INIT = new EventOutput();
        /** EVENT CLK */
        public EventOutput CLK = new EventOutput();
        /** EVENT ADD_WP */
        public EventOutput ADD_WP = new EventOutput();
        /** EVENT ADD_WP00 */
        public EventOutput ADD_WP00 = new EventOutput();
        /** EVENT REMOVE_WP */
        public EventOutput REMOVE_WP = new EventOutput();
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
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
         */
        /** Connect the given variable to the input variable BASEY
         * @param newIV The variable to connect
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
        /** Connect the given variable to the input variable AddedWP_X
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable AddedWP_Y
         * @param newIV The variable to connect
         */
        /** FB MODEL */
        protected Plant_SMV MODEL = new Plant_SMV() ;
        /** FB CONTROL */
        protected MasterSlave CONTROL = new MasterSlave() ;
        /** The default constructor. */
        public PNP_PLANT_MS_CONTROL_FOR_SMV() {
            super();
            INIT.connectTo(MODEL.INIT);
            CLK.connectTo(MODEL.CLK);
            MODEL.INITO.connectTo(CONTROL.INIT);
            MODEL.CHG.connectTo(CONTROL.REQ);
            CONTROL.INITO.connectTo(INITO);
            CONTROL.CNF.connectTo(MODEL.CYL_IND);
            MODEL.connectIVNoException("CYL1_SPEED",CYL1_SPEED);
            MODEL.connectIVNoException("CYL2_SPEED",CYL2_SPEED);
            MODEL.connectIVNoException("VCYL_SPEED",VCYL_SPEED);
            CONTROL.connectIVNoException("c1home",MODEL.ovNamedNoException("c1home"));
            CONTROL.connectIVNoException("c1end",MODEL.ovNamedNoException("c1end"));
            CONTROL.connectIVNoException("c2home",MODEL.ovNamedNoException("c2home"));
            CONTROL.connectIVNoException("c2end",MODEL.ovNamedNoException("c2end"));
            CONTROL.connectIVNoException("vc_up",MODEL.ovNamedNoException("vchome"));
            CONTROL.connectIVNoException("vc_down",MODEL.ovNamedNoException("vcend"));
            CONTROL.connectIVNoException("vacuum",MODEL.ovNamedNoException("VACUUM_ON"));
            MODEL.connectIVNoException("vcyl_down",CONTROL.ovNamedNoException("vcMoveOut"));
            MODEL.connectIVNoException("vacuum_on",CONTROL.ovNamedNoException("venturi_on"));
            MODEL.connectIVNoException("vacuum_off",CONTROL.ovNamedNoException("venturi_off"));
            MODEL.connectIVNoException("cyl1_fwd",CONTROL.ovNamedNoException("c1MoveOut"));
            MODEL.connectIVNoException("cyl1_back",CONTROL.ovNamedNoException("c1MoveIn"));
            MODEL.connectIVNoException("cyl2_fwd",CONTROL.ovNamedNoException("c2MoveOut"));
            MODEL.connectIVNoException("cyl2_back",CONTROL.ovNamedNoException("c2MoveIn"));
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK Plant_SMV
     * @author JHC
     * @version 20150208/JHC
     */
    private class Plant_SMV extends FBInstance
    {
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("VACUUM_ON".equals(s)) return VACUUM_ON;
            if ("c1home".equals(s)) return c1home;
            if ("c1end".equals(s)) return c1end;
            if ("c2home".equals(s)) return c2home;
            if ("c2end".equals(s)) return c2end;
            if ("vchome".equals(s)) return vchome;
            if ("vcend".equals(s)) return vcend;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("CYL1_SPEED".equals(ivName)) connect_CYL1_SPEED((UINT) newIV);
            else if ("CYL2_SPEED".equals(ivName)) connect_CYL2_SPEED((UINT) newIV);
            else if ("VCYL_SPEED".equals(ivName)) connect_VCYL_SPEED((UINT) newIV);
            else if ("cyl1_fwd".equals(ivName)) connect_cyl1_fwd((BOOL) newIV);
            else if ("cyl1_back".equals(ivName)) connect_cyl1_back((BOOL) newIV);
            else if ("cyl2_fwd".equals(ivName)) connect_cyl2_fwd((BOOL) newIV);
            else if ("cyl2_back".equals(ivName)) connect_cyl2_back((BOOL) newIV);
            else if ("vcyl_down".equals(ivName)) connect_vcyl_down((BOOL) newIV);
            else if ("vacuum_on".equals(ivName)) connect_vacuum_on((BOOL) newIV);
            else if ("vacuum_off".equals(ivName)) connect_vacuum_off((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable CYL1_SPEED
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_CYL1_SPEED(UINT newIV) throws FBRManagementException {
            CYL1_SPEED = newIV;
            Cylinder.connectIVNoException("LCForwardSpeed",CYL1_SPEED);
            Cylinder.connectIVNoException("LCBackwardSpeed",CYL1_SPEED);
        }

        /** Connect the given variable to the input variable CYL2_SPEED
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_CYL2_SPEED(UINT newIV) throws FBRManagementException {
            CYL2_SPEED = newIV;
            Cylinder.connectIVNoException("RCForwardSpeed",CYL2_SPEED);
            Cylinder.connectIVNoException("RCBackwardSpeed",CYL2_SPEED);
        }

        /** Connect the given variable to the input variable VCYL_SPEED
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_VCYL_SPEED(UINT newIV) throws FBRManagementException {
            VCYL_SPEED = newIV;
            Cylinder.connectIVNoException("VCSpeed",VCYL_SPEED);
        }

        /** Connect the given variable to the input variable cyl1_fwd
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_cyl1_fwd(BOOL newIV) throws FBRManagementException {
            cyl1_fwd = newIV;
            Cylinder.connectIVNoException("LCExtend",cyl1_fwd);
        }

        /** Connect the given variable to the input variable cyl1_back
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_cyl1_back(BOOL newIV) throws FBRManagementException {
            cyl1_back = newIV;
            Cylinder.connectIVNoException("LCRetract",cyl1_back);
        }

        /** Connect the given variable to the input variable cyl2_fwd
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_cyl2_fwd(BOOL newIV) throws FBRManagementException {
            cyl2_fwd = newIV;
            Cylinder.connectIVNoException("RCExtend",cyl2_fwd);
        }

        /** Connect the given variable to the input variable cyl2_back
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_cyl2_back(BOOL newIV) throws FBRManagementException {
            cyl2_back = newIV;
            Cylinder.connectIVNoException("RCRetract",cyl2_back);
        }

        /** Connect the given variable to the input variable vcyl_down
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_vcyl_down(BOOL newIV) throws FBRManagementException {
            vcyl_down = newIV;
            Cylinder.connectIVNoException("VCExtend",vcyl_down);
        }

        /** Connect the given variable to the input variable vacuum_on
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_vacuum_on(BOOL newIV) throws FBRManagementException {
            vacuum_on = newIV;
            SuctionUnit.connectIVNoException("VacuumOn",vacuum_on);
        }

        /** Connect the given variable to the input variable vacuum_off
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_vacuum_off(BOOL newIV) throws FBRManagementException {
            vacuum_off = newIV;
            SuctionUnit.connectIVNoException("VacuumOff",vacuum_off);
        }
        /** FB Cylinder */
        protected PnpCylinders Cylinder = new PnpCylinders() ;
        /** FB SuctionUnit */
        protected PnPVacuum SuctionUnit = new PnPVacuum() ;
        /** The default constructor. */
        public Plant_SMV() {
            super();
            INIT.connectTo(Cylinder.INIT);
            Cylinder.INITO.connectTo(SuctionUnit.INIT);
            CLK.connectTo(Cylinder.CLK);
            CYL_IND.connectTo(Cylinder.CYL_IND);
            CYL_IND.connectTo(SuctionUnit.CLK);
            Cylinder.CHG.connectTo(CHG);
            SuctionUnit.CHG.connectTo(CHG);
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
            c1home = (BOOL) Cylinder.ovNamedNoException("LCAtHome");
            c1end = (BOOL) Cylinder.ovNamedNoException("LCAtEnd");
            c2home = (BOOL) Cylinder.ovNamedNoException("RCAtHome");
            c2end = (BOOL) Cylinder.ovNamedNoException("RCAtEnd");
            vchome = (BOOL) Cylinder.ovNamedNoException("VCAtHome");
            vcend = (BOOL) Cylinder.ovNamedNoException("VCAtEnd");
            VACUUM_ON = (BOOL) SuctionUnit.ovNamedNoException("VacState");
            SuctionUnit.connectIVNoException("VacuumOn",vacuum_on);
            SuctionUnit.connectIVNoException("VacuumOff",vacuum_off);
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
        public ANY ovNamed(String s) throws FBRManagementException {
            if ("vcMoveOut".equals(s)) return vcMoveOut;
            if ("venturi_on".equals(s)) return venturi_on;
            if ("venturi_off".equals(s)) return venturi_off;
            if ("c1MoveOut".equals(s)) return c1MoveOut;
            if ("c1MoveIn".equals(s)) return c1MoveIn;
            if ("c2MoveOut".equals(s)) return c2MoveOut;
            if ("c2MoveIn".equals(s)) return c2MoveIn;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("c1home".equals(ivName)) connect_c1home((BOOL) newIV);
            else if ("c1end".equals(ivName)) connect_c1end((BOOL) newIV);
            else if ("c2home".equals(ivName)) connect_c2home((BOOL) newIV);
            else if ("c2end".equals(ivName)) connect_c2end((BOOL) newIV);
            else if ("vc_up".equals(ivName)) connect_vc_up((BOOL) newIV);
            else if ("vc_down".equals(ivName)) connect_vc_down((BOOL) newIV);
            else if ("vacuum".equals(ivName)) connect_vacuum((BOOL) newIV);
            else if ("pp0".equals(ivName)) connect_pp0((BOOL) newIV);
            else if ("pp1".equals(ivName)) connect_pp1((BOOL) newIV);
            else if ("pp2".equals(ivName)) connect_pp2((BOOL) newIV);
            else if ("pp3".equals(ivName)) connect_pp3((BOOL) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable c1home
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_c1home(BOOL newIV) throws FBRManagementException {
            c1home = newIV;
            LC.connectIVNoException("HOME",c1home);
        }

        /** Connect the given variable to the input variable c1end
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_c1end(BOOL newIV) throws FBRManagementException {
            c1end = newIV;
            LC.connectIVNoException("END",c1end);
        }

        /** Connect the given variable to the input variable c2home
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_c2home(BOOL newIV) throws FBRManagementException {
            c2home = newIV;
            RC.connectIVNoException("HOME",c2home);
        }

        /** Connect the given variable to the input variable c2end
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_c2end(BOOL newIV) throws FBRManagementException {
            c2end = newIV;
            RC.connectIVNoException("END",c2end);
        }

        /** Connect the given variable to the input variable vc_up
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_vc_up(BOOL newIV) throws FBRManagementException {
            vc_up = newIV;
            VC.connectIVNoException("HOME",vc_up);
        }

        /** Connect the given variable to the input variable vc_down
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_vc_down(BOOL newIV) throws FBRManagementException {
            vc_down = newIV;
            VC.connectIVNoException("END",vc_down);
        }

        /** Connect the given variable to the input variable vacuum
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_vacuum(BOOL newIV) throws FBRManagementException {
            vacuum = newIV;
            Vaccum.connectIVNoException("VACCUM",vacuum);
        }

        /** Connect the given variable to the input variable pp0
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_pp0(BOOL newIV) throws FBRManagementException {
            pp0 = newIV;
            Master.connectIVNoException("pp0",pp0);
        }

        /** Connect the given variable to the input variable pp1
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_pp1(BOOL newIV) throws FBRManagementException {
            pp1 = newIV;
            Master.connectIVNoException("pp1",pp1);
        }

        /** Connect the given variable to the input variable pp2
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_pp2(BOOL newIV) throws FBRManagementException {
            pp2 = newIV;
            Master.connectIVNoException("pp2",pp2);
        }

        /** Connect the given variable to the input variable pp3
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        public void connect_pp3(BOOL newIV) throws FBRManagementException {
            pp3 = newIV;
            Master.connectIVNoException("pp3",pp3);
        }
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