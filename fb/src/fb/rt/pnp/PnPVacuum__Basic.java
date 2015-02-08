package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class PnPVacuum__Basic {
    private final PnPVacuum instance = new PnPVacuum();

    public void event_INIT(boolean VacuumOn_, boolean VacuumOff_) {
        instance.VacuumOn.value = VacuumOn_;
        instance.VacuumOff.value = VacuumOff_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_CLK(boolean VacuumOn_, boolean VacuumOff_) {
        instance.VacuumOn.value = VacuumOn_;
        instance.VacuumOff.value = VacuumOff_;
        instance.CLK.serviceEvent(instance); 
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
        /** {@inheritDoc}
         * @param ivName {@inheritDoc}
         * @param newIV {@inheritDoc}
         * @throws FBRManagementException {@inheritDoc} */
        /** Connect the given variable to the input variable VacuumOn
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable VacuumOff
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
}