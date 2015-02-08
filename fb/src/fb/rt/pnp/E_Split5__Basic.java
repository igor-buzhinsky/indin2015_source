package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class E_Split5__Basic {
    private final E_Split5 instance = new E_Split5();

    public void event_E() {
        
        instance.E.serviceEvent(instance); 
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
}