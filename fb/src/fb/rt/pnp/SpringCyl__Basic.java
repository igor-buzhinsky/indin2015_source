package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class SpringCyl__Basic {
    private final SpringCyl instance = new SpringCyl();

    public void event_INIT(boolean In1_, boolean In2_) {
        instance.In1.value = In1_;
        instance.In2.value = In2_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_REQ(boolean In1_, boolean In2_) {
        instance.In1.value = In1_;
        instance.In2.value = In2_;
        instance.REQ.serviceEvent(instance); 
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
        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Connect the given variable to the input variable In1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable In2
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