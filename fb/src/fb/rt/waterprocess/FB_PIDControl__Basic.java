package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class FB_PIDControl__Basic {
    private final FB_PIDControl instance = new FB_PIDControl();

    public void event_INIT(boolean AutoMode_, float PV_, float SP_, float gain_, float rate_, float reset_, float sample_) {
        instance.AutoMode.value = AutoMode_;
        instance.PV.value = PV_;
        instance.SP.value = SP_;
        instance.gain.value = gain_;
        instance.rate.value = rate_;
        instance.reset.value = reset_;
        instance.sample.value = sample_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean AutoMode_, float PV_, float SP_, float gain_, float rate_, float reset_, float sample_) {
        instance.AutoMode.value = AutoMode_;
        instance.PV.value = PV_;
        instance.SP.value = SP_;
        instance.gain.value = gain_;
        instance.rate.value = rate_;
        instance.reset.value = reset_;
        instance.sample.value = sample_;
        instance.REQ.serviceEvent(instance); 
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
        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Connect the given variable to the input variable AutoMode
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable PV
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable SP
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable gain
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable rate
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable reset
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable sample
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
}