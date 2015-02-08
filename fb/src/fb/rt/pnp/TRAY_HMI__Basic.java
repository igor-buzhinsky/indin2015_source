package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class TRAY_HMI__Basic {
    private final TRAY_HMI instance = new TRAY_HMI();

    public void event_INIT(boolean Tray1_, boolean Tray2_, boolean Tray3_) {
        instance.Tray1.value = Tray1_;
        instance.Tray2.value = Tray2_;
        instance.Tray3.value = Tray3_;
        instance.INIT.serviceEvent(instance); 
    }

    /* Copyright (c)2015 Rockwell Automation. All rights reserved. */




    /** FUNCTION_BLOCK TRAY_HMI
     * @author JHC
     * @version 20150208/JHC
     */
    private class TRAY_HMI extends FBInstance
    {
        /** Input event qualifier */
        public BOOL Tray1 = new BOOL();
        /** VAR Tray2 */
        public BOOL Tray2 = new BOOL();
        /** VAR Tray3 */
        public BOOL Tray3 = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INIT1 = new EventOutput();
        /** EVENT INIT2 */
        public EventOutput INIT2 = new EventOutput();
        /** EVENT INIT3 */
        public EventOutput INIT3 = new EventOutput();
        /** EVENT INITO */
        public EventOutput INITO = new EventOutput();
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
        /** Connect the given variable to the input variable Tray1
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Tray2
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable Tray3
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
            transition_TRAY_HMI_0();
        }

        /** The default constructor. */
        public TRAY_HMI() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_TRAY_HMI_1(); 
            }
        }

        /** ALGORITHM INIT IN Java*/
        public void alg_INIT() {
            if (Tray1.value)
            {
                INIT1.serviceEvent(this);
            }
            if (Tray2.value)
            {
                INIT2.serviceEvent(this);
            }
            if (Tray3.value)
            {
                INIT3.serviceEvent(this);
            }

        }
    }
    private void transition_TRAY_HMI_0() {
    }

    private void transition_TRAY_HMI_1() {
    }
}