package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class SFC2__Basic {
    private final SFC2 instance = new SFC2();

    public void event_INIT(boolean s12_, boolean s3_, boolean X12_, boolean X3_, boolean X30_) {
        instance.s12.value = s12_;
        instance.s3.value = s3_;
        instance.X12.value = X12_;
        instance.X3.value = X3_;
        instance.X30.value = X30_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean s12_, boolean X12_, boolean X3_, boolean X30_, boolean s3_) {
        instance.s12.value = s12_;
        instance.X12.value = X12_;
        instance.X3.value = X3_;
        instance.X30.value = X30_;
        instance.s3.value = s3_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SFC2
     * @author JHC
     * @version 20150208/JHC
     */
    private class SFC2 extends FBInstance
    {
        /** Input event qualifier */
        public BOOL s12 = new BOOL();
        /** VAR s3 */
        public BOOL s3 = new BOOL();
        /** VAR X12 */
        public BOOL X12 = new BOOL();
        /** VAR X3 */
        public BOOL X3 = new BOOL();
        /** VAR X30 */
        public BOOL X30 = new BOOL();
        /** Output event qualifier */
        public BOOL CGO = new BOOL();
        /** VAR X10 */
        public BOOL X10 = new BOOL();
        /** VAR X11 */
        public BOOL X11 = new BOOL();
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
        /** Connect the given variable to the input variable s12
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable s3
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X12
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X3
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable X30
         * @param newIV The variable to connect
         */
        private static final int index_X10 = 0;
        private void state_X10() {
            eccState = index_X10;
            alg_X10();
            CNF.serviceEvent(this);
        }
        private static final int index_INIT = 1;
        private void state_INIT() {
            eccState = index_INIT;
            alg_INIT();
            INITO.serviceEvent(this);
            state_X10();
            transition_SFC2_0();
        }
        private static final int index_X11 = 2;
        private void state_X11() {
            eccState = index_X11;
            alg_X11();
            CNF.serviceEvent(this);
        }

        /** The default constructor. */
        public SFC2() {
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
            if ((eccState == index_X10)) {
                state_INIT();
                transition_SFC2_1(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_X10) && ((((!s12.value & X12.value) | (!s3.value & X3.value)) & X30.value))) {
                state_X11();
                transition_SFC2_2(); 
            }
            else if ((eccState == index_X11) && (((X12.value & s12.value) | (X3.value & s3.value)))) {
                state_X10();
                transition_SFC2_3(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            CGO.value = false;
            X10.value = false;
            X11.value = false;
            System.out.println("SFC2: INIT");
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
        }

        /** ALGORITHM X11 IN ST*/
        public void alg_X11() {
            CGO.value = true;
            X10.value = false;
            X11.value = true;
            System.out.println("SFC2: X11");
        }

        /** ALGORITHM IntStep IN ST*/
        public void alg_IntStep() {
            CGO.value = false;
            X11.value = false;
            System.out.println("SFC2: IntStep");
        }

        /** ALGORITHM X10 IN ST*/
        public void alg_X10() {
            X10.value = true;
            CGO.value = false;
            X11.value = false;
            System.out.println("SFC2: X10");
        }
    }
    private void transition_SFC2_0() {
    }

    private void transition_SFC2_1() {
    }

    private void transition_SFC2_2() {
    }

    private void transition_SFC2_3() {
    }
}