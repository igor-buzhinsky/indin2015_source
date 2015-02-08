package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class PnpCylinders__Composite {
    private final PnpCylinders instance = new PnpCylinders();

    public void event_INIT(int LCForwardSpeed_, int LCBackwardSpeed_, boolean LCExtend_, boolean LCRetract_, int LCMovingtDistance_, int HomeSensorRange_0, int HomeSensorRange_1, int EndSensorRange_0, int EndSensorRange_1, float InitialPosition_, int LoadType_, boolean Loaded_, int MidSensorRange_0, int MidSensorRange_1, int RCForwardSpeed_, int RCBackwardSpeed_, boolean RCExtend_, boolean RCRetract_, int RCMovingtDistance_, int VCSpeed_, boolean VCExtend_, int VCMovingtDistance_) {
        instance.LCForwardSpeed.value = Math.abs(LCForwardSpeed_);
        instance.LCBackwardSpeed.value = Math.abs(LCBackwardSpeed_);
        instance.LCExtend.value = LCExtend_;
        instance.LCRetract.value = LCRetract_;
        instance.LCMovingtDistance.value = Math.abs(LCMovingtDistance_);
        ((UINT) instance.HomeSensorRange.value[0]).value = Math.abs(HomeSensorRange_0);
        ((UINT) instance.HomeSensorRange.value[1]).value = Math.abs(HomeSensorRange_1);
        ((UINT) instance.EndSensorRange.value[0]).value = Math.abs(EndSensorRange_0);
        ((UINT) instance.EndSensorRange.value[1]).value = Math.abs(EndSensorRange_1);
        instance.InitialPosition.value = InitialPosition_;
        instance.LoadType.value = Math.abs(LoadType_);
        instance.Loaded.value = Loaded_;
        ((UINT) instance.MidSensorRange.value[0]).value = Math.abs(MidSensorRange_0);
        ((UINT) instance.MidSensorRange.value[1]).value = Math.abs(MidSensorRange_1);
        instance.RCForwardSpeed.value = Math.abs(RCForwardSpeed_);
        instance.RCBackwardSpeed.value = Math.abs(RCBackwardSpeed_);
        instance.RCExtend.value = RCExtend_;
        instance.RCRetract.value = RCRetract_;
        instance.RCMovingtDistance.value = Math.abs(RCMovingtDistance_);
        instance.VCSpeed.value = Math.abs(VCSpeed_);
        instance.VCExtend.value = VCExtend_;
        instance.VCMovingtDistance.value = Math.abs(VCMovingtDistance_);
        instance.INIT.serviceEvent(instance); 
    }

    public void event_CLK(int LoadType_, boolean Loaded_) {
        instance.LoadType.value = Math.abs(LoadType_);
        instance.Loaded.value = Loaded_;
        instance.CLK.serviceEvent(instance); 
    }

    public void event_FAULT() {
        
        instance.FAULT.serviceEvent(instance); 
    }

    public void event_RESUME() {
        
        instance.RESUME.serviceEvent(instance); 
    }

    public void event_CYL_IND(boolean LCExtend_, boolean LCRetract_, boolean RCExtend_, boolean RCRetract_, boolean VCExtend_) {
        instance.LCExtend.value = LCExtend_;
        instance.LCRetract.value = LCRetract_;
        instance.RCExtend.value = RCExtend_;
        instance.RCRetract.value = RCRetract_;
        instance.VCExtend.value = VCExtend_;
        instance.CYL_IND.serviceEvent(instance); 
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
        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Connect the given variable to the input variable InitialPosition
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable HomeSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable MidSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable EndSensorRange
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable Loaded
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable LoadType
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable LCExtend
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable LCRetract
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable LCMovingtDistance
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable LCForwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable LCBackwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable RCExtend
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable RCRetract
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable RCMovingtDistance
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable RCForwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable RCBackwardSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable VCExtend
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable VCMovingtDistance
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable VCSpeed
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
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
}