package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class SlaveCylinder_TEST__Basic {
    private final SlaveCylinder_TEST instance = new SlaveCylinder_TEST();

    public void event_INIT(float Size_) {
        instance.Size.value = Size_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_Order(float Position_) {
        instance.Position.value = Position_;
        instance.Order.serviceEvent(instance); 
    }

    public void event_REQ(boolean HOME_, boolean MID_, boolean END_, boolean DONE_) {
        instance.HOME.value = HOME_;
        instance.MID.value = MID_;
        instance.END.value = END_;
        instance.DONE.value = DONE_;
        instance.REQ.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK SlaveCylinder_TEST
     * @author JHC
     * @version 20150208/JHC
     */
    private class SlaveCylinder_TEST extends FBInstance
    {
        /** Input event qualifier */
        public BOOL HOME = new BOOL();
        /** Input event qualifier */
        public BOOL MID = new BOOL();
        /** Input event qualifier */
        public BOOL END = new BOOL();
        /** VAR Position */
        public REAL Position = new REAL();
        /** VAR Size */
        public REAL Size = new REAL();
        /** VAR DONE */
        public BOOL DONE = new BOOL();
        /** Output event qualifier */
        public BOOL READY = new BOOL();
        /** Output event qualifier */
        public BOOL GoOut = new BOOL();
        /** Output event qualifier */
        public BOOL GoIn = new BOOL();
        /** VAR PositionOutput */
        public REAL PositionOutput = new REAL();
        /** VAR init */
        public BOOL init = new BOOL();
        /** VAR extended */
        public BOOL extended = new BOOL();
        /** VAR GoCenter */
        public BOOL GoCenter = new BOOL();
        /** VAR PositionO */
        public REAL PositionO = new REAL();
        /** EVENT INIT */
        public EventServer INIT = new EventInput(this);
        /** EVENT Order */
        public EventServer Order = new EventInput(this);
        /** EVENT REQ */
        public EventServer REQ = new EventInput(this);
        /** EVENT InitO */
        public EventOutput InitO = new EventOutput();
        /** EVENT OrderOutput */
        public EventOutput OrderOutput = new EventOutput();
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
        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Connect the given variable to the input variable HOME
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable MID
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable END
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Position
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Size
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable DONE
         * @param newIV The variable to connect
         */
        private static final int index_START = 0;
        private void state_START() {
            eccState = index_START;
        }
        private static final int index_ORDER = 1;
        private void state_ORDER() {
            eccState = index_ORDER;
            alg_Order();
            OrderOutput.serviceEvent(this);
            CNF.serviceEvent(this);
            state_START();
            transition_SlaveCylinder_TEST_0();
        }
        private static final int index_REQ = 2;
        private void state_REQ() {
            eccState = index_REQ;
            alg_Req();
            CNF.serviceEvent(this);
            state_START();
            transition_SlaveCylinder_TEST_1();
        }
        private static final int index_INIT = 3;
        private void state_INIT() {
            eccState = index_INIT;
            alg_Init();
            InitO.serviceEvent(this);
            state_START();
            transition_SlaveCylinder_TEST_2();
        }

        /** The default constructor. */
        public SlaveCylinder_TEST() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == Order) service_Order();
            else if (e == REQ) service_REQ();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_SlaveCylinder_TEST_3(); 
            }
        }

        /** Services the Order event. */
        public void service_Order() {
            if ((eccState == index_START)) {
                state_ORDER();
                transition_SlaveCylinder_TEST_4(); 
            }
        }

        /** Services the REQ event. */
        public void service_REQ() {
            if ((eccState == index_START)) {
                state_REQ();
                transition_SlaveCylinder_TEST_5(); 
            }
        }

        /** ALGORITHM Init IN Java*/
        public void alg_Init() {
            if (!init.value) {
                init.value = true;
                GoOut.value = false;
                GoIn.value = false;
                GoCenter.value = false;
                READY.value = true;
                extended.value = false;
            }
            System.out.println("initcyl!!!");

        }

        /** ALGORITHM Order IN Java*/
        public void alg_Order() {
            READY.value = false;
            GoOut.value = false;
            GoCenter.value = false;
            GoIn.value = false;

            if (Position.value >= Size.value) {
                GoOut.value = true;
                PositionO.value = Position.value - Size.value;
            } else {
                if (Position.value == 1 && Size.value == 2) {
                    GoCenter.value = true;
                    GoIn.value = true;
                    PositionO.value = Position.value - 1;
                } else {
                    GoIn.value = true;
                    PositionO.value = Position.value;
                }

            }





            PositionOutput.value = PositionO.value;

        }

        /** ALGORITHM Req IN Java*/
        public void alg_Req() {
            if (HOME.value && GoIn.value) {
                GoOut.value = false;
                GoIn.value = false;
                extended.value = false;
            }

            if (END.value && GoOut.value) {
                GoOut.value = false;
                GoIn.value = false;
                extended.value = true;
            }

            if (END.value && GoCenter.value) {
                GoOut.value = false;
                GoIn.value = true;
                extended.value = false;
            }
            if (HOME.value && GoCenter.value) {
                GoOut.value = true;
                GoIn.value = false;
                extended.value = false;
            }
            if (MID.value && GoCenter.value) {
                GoOut.value = false;
                GoIn.value = false;
                extended.value = false;
            }

            if (!GoOut.value && !GoIn.value && DONE.value) {
                READY.value = true;
            }
            if (Size.value == 2 && MID.value) {
                System.out.println("Req:" + MID.value);
            }

        }
    }
    private void transition_SlaveCylinder_TEST_0() {
    }

    private void transition_SlaveCylinder_TEST_1() {
    }

    private void transition_SlaveCylinder_TEST_2() {
    }

    private void transition_SlaveCylinder_TEST_3() {
    }

    private void transition_SlaveCylinder_TEST_4() {
    }

    private void transition_SlaveCylinder_TEST_5() {
    }
}