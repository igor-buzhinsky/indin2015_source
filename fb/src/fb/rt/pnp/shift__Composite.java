package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class shift__Composite {
    private final shift instance = new shift();

    public void event_REQ(int X1_, int Y1_, int X2_, int Y2_) {
        instance.X1.value = Math.abs(X1_);
        instance.Y1.value = Math.abs(Y1_);
        instance.X2.value = Math.abs(X2_);
        instance.Y2.value = Math.abs(Y2_);
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK shift
     * @author JHC
     * @version 20150205/JHC
     */
    private class shift extends FBInstance
    {
        /** VAR X1 */
        public UINT X1 = new UINT();
        /** VAR Y1 */
        public UINT Y1 = new UINT();
        /** VAR X2 */
        public UINT X2 = new UINT();
        /** VAR Y2 */
        public UINT Y2 = new UINT();
        /** VAR X */
        public UINT X = new UINT();
        /** VAR Y */
        public UINT Y = new UINT();
        /** Normal Execution Request */
        public EventOutput REQ = new EventOutput();
        /** EVENT DONE */
        public EventOutput DONE = new EventOutput();
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
        /** Connect the given variable to the input variable X1
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable Y1
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable X2
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** Connect the given variable to the input variable Y2
         * @param newIV The variable to connect
         * @throws FBRManagementException An internal connection failed.
         */
        /** FB ADDX */
        protected FB_ADD_UINT ADDX = new FB_ADD_UINT() ;
        /** FB ADDY */
        protected FB_ADD_UINT ADDY = new FB_ADD_UINT() ;
        /** The default constructor. */
        public shift() {
            super();
            ADDX.CNF.connectTo(DONE);
            REQ.connectTo(ADDX.REQ);
            REQ.connectTo(ADDY.REQ);
            ADDY.CNF.connectTo(DONE);
            ADDX.connectIVNoException("IN1",X1);
            ADDX.connectIVNoException("IN2",X2);
            X = (UINT) ADDX.ovNamedNoException("OUT");
            ADDY.connectIVNoException("IN1",Y1);
            ADDY.connectIVNoException("IN2",Y2);
            Y = (UINT) ADDY.ovNamedNoException("OUT");
        }
        /** {@inheritDoc}
         * @param fbName {@inheritDoc}
         * @param r {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Start the FB instances. */
        /** Stop the FB instances. */
    }
    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK FB_ADD_UINT
     * @author JHC
     * @version 20150205/JHC
     */
    private class FB_ADD_UINT extends FBInstance
    {
        /** Augend */
        public UINT IN1 = new UINT();
        /** Addend */
        public UINT IN2 = new UINT();
        /** Sum */
        public UINT OUT = new UINT();
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
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
            if ("OUT".equals(s)) return OUT;
            return super.ovNamed(s);}

        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        public void connectIV(String ivName, ANY newIV)
            throws FBRManagementException {
            if ("IN1".equals(ivName)) connect_IN1((UINT) newIV);
            else if ("IN2".equals(ivName)) connect_IN2((UINT) newIV);
            else super.connectIV(ivName, newIV);
        }

        /** Connect the given variable to the input variable IN1
         * @param newIV The variable to connect
         */
        public void connect_IN1(UINT newIV) {
            IN1 = newIV;
        }

        /** Connect the given variable to the input variable IN2
         * @param newIV The variable to connect
         */
        public void connect_IN2(UINT newIV) {
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
            transition_FB_ADD_UINT_0();
        }

        /** The default constructor. */
        public FB_ADD_UINT() {
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
                transition_FB_ADD_UINT_1(); 
            }
        }

        /** ALGORITHM REQ IN ST*/
        public void alg_REQ() {
            OUT.value = (int) (IN1.value + IN2.value);
            System.out.println("IN1=" + IN1.value + "OUT=" + OUT.value);
        }
    }
    private void transition_FB_ADD_UINT_0() {
    }

    private void transition_FB_ADD_UINT_1() {
    }
}