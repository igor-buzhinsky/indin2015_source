package fb.rt.waterprocess;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class NOT16__Basic {
    private final NOT16 instance = new NOT16();

    public void event_REQ(boolean IN1_, boolean IN2_, boolean IN3_, boolean IN4_, boolean IN5_, boolean IN6_, boolean IN7_, boolean IN8_, boolean IN9_, boolean IN10_, boolean IN11_, boolean IN12_, boolean IN13_, boolean IN14_, boolean IN15_, boolean IN16_) {
        instance.IN1.value = IN1_;
        instance.IN2.value = IN2_;
        instance.IN3.value = IN3_;
        instance.IN4.value = IN4_;
        instance.IN5.value = IN5_;
        instance.IN6.value = IN6_;
        instance.IN7.value = IN7_;
        instance.IN8.value = IN8_;
        instance.IN9.value = IN9_;
        instance.IN10.value = IN10_;
        instance.IN11.value = IN11_;
        instance.IN12.value = IN12_;
        instance.IN13.value = IN13_;
        instance.IN14.value = IN14_;
        instance.IN15.value = IN15_;
        instance.IN16.value = IN16_;
        instance.REQ.serviceEvent(instance); 
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
        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Connect the given variable to the input variable IN1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN2
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN3
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN4
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN5
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN6
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN7
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN8
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN9
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN10
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN11
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN12
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN13
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN14
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN15
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable IN16
         * @param newIV The variable to connect
         */
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