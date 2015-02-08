package fb.rt.pnp;

import fb.rt.*;
import fb.rt.net.*;
import fb.datatype.*;

public class vaccum3__Basic {
    private final vaccum3 instance = new vaccum3();

    public void event_INIT(boolean vacuum_, boolean SwitchOn_, boolean SwitchOff_) {
        instance.vacuum.value = vacuum_;
        instance.SwitchOn.value = SwitchOn_;
        instance.SwitchOff.value = SwitchOff_;
        instance.INIT.serviceEvent(instance); 
    }

    public void event_Req(boolean vacuum_) {
        instance.vacuum.value = vacuum_;
        instance.Req.serviceEvent(instance); 
    }

    public void event_IN_CMD(boolean SwitchOn_, boolean SwitchOff_) {
        instance.SwitchOn.value = SwitchOn_;
        instance.SwitchOff.value = SwitchOff_;
        instance.IN_CMD.serviceEvent(instance); 
    }

    /* Copyright (c)2015 nxtControl GmbH. All rights reserved. */




    /** FUNCTION_BLOCK vaccum3
     * @author Majid Sorouri
     * @version 20150208/Majid Sorouri
     */
    private class vaccum3 extends FBInstance
    {
        /** VAR vacuum */
        public BOOL vacuum = new BOOL();
        /** VAR SwitchOn */
        public BOOL SwitchOn = new BOOL();
        /** VAR SwitchOff */
        public BOOL SwitchOff = new BOOL();
        /** Output event qualifier */
        public BOOL venturi_on = new BOOL();
        /** VAR venturi_off */
        public BOOL venturi_off = new BOOL();
        /** Initialization Request */
        public EventServer INIT = new EventInput(this);
        /** EVENT Req */
        public EventServer Req = new EventInput(this);
        /** EVENT IN_CMD */
        public EventServer IN_CMD = new EventInput(this);
        /** Initialization Confirm */
        public EventOutput INITO = new EventOutput();
        /** EVENT CNF */
        public EventOutput CNF = new EventOutput();
        /** Execution Confirmation */
        public EventOutput OUT_CMD = new EventOutput();
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
        /** Connect the given variable to the input variable vacuum
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable SwitchOn
         * @param newIV The variable to connect
         */
        /** Connect the given variable to the input variable SwitchOff
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
            state_VaccumOff();
            transition_vaccum3_0();
        }
        private static final int index_suction = 2;
        private void state_suction() {
            eccState = index_suction;
            alg_suction();
            CNF.serviceEvent(this);
        }
        private static final int index_Drop = 3;
        private void state_Drop() {
            eccState = index_Drop;
            alg_Drop();
            CNF.serviceEvent(this);
        }
        private static final int index_VaccumOn = 4;
        private void state_VaccumOn() {
            eccState = index_VaccumOn;
            OUT_CMD.serviceEvent(this);
        }
        private static final int index_VaccumOff = 5;
        private void state_VaccumOff() {
            eccState = index_VaccumOff;
            OUT_CMD.serviceEvent(this);
        }

        /** The default constructor. */
        public vaccum3() {
            super();
        }

        /** {@inheritDoc}
         * @param e {@inheritDoc} */
        public void serviceEvent(EventServer e) {
            if (e == INIT) service_INIT();
            else if (e == Req) service_Req();
            else if (e == IN_CMD) service_IN_CMD();
        }

        /** Services the INIT event. */
        public void service_INIT() {
            if ((eccState == index_START)) {
                state_INIT();
                transition_vaccum3_1(); 
            }
        }

        /** Services the Req event. */
        public void service_Req() {
            if ((eccState == index_Drop) && (!vacuum.value)) {
                state_VaccumOff();
                transition_vaccum3_2(); 
            }
            else if ((eccState == index_suction) && (vacuum.value)) {
                state_VaccumOn();
                transition_vaccum3_3(); 
            }
        }

        /** Services the IN_CMD event. */
        public void service_IN_CMD() {
            if ((eccState == index_VaccumOff) && (SwitchOn.value)) {
                state_suction();
                transition_vaccum3_4(); 
            }
            else if ((eccState == index_VaccumOn) && (SwitchOff.value)) {
                state_Drop();
                transition_vaccum3_5(); 
            }
        }

        /** ALGORITHM INIT IN ST*/
        public void alg_INIT() {
            venturi_off.value = true;
            venturi_on.value = false;
            System.out.println("Vassum3 INIT");
        }

        /** ALGORITHM suction IN ST*/
        public void alg_suction() {
            venturi_off.value = false;
            venturi_on.value = true;
            System.out.println("Vaccum3 Suction");
        }

        /** ALGORITHM Drop IN ST*/
        public void alg_Drop() {
            venturi_off.value = true;
            venturi_on.value = false;
            System.out.println("Vaccum3 Drop");
        }
    }
    private void transition_vaccum3_0() {
    }

    private void transition_vaccum3_1() {
    }

    private void transition_vaccum3_2() {
    }

    private void transition_vaccum3_3() {
    }

    private void transition_vaccum3_4() {
    }

    private void transition_vaccum3_5() {
    }
}