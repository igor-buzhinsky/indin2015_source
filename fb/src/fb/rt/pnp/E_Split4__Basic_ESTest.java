/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 06 19:12:38 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.E_Split4__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class E_Split4__Basic_ESTest {

  //Test case number: 0
  /*
   * 9 covered goals:
   * 1 fb.rt.pnp.E_Split4__Basic$E_Split4.state_REQ()V: root-Branch
   * 2 fb.rt.pnp.E_Split4__Basic$E_Split4.state_START()V: root-Branch
   * 3 fb.rt.pnp.E_Split4__Basic$E_Split4.<init>(Lfb/rt/pnp/E_Split4__Basic;)V: root-Branch
   * 4 fb.rt.pnp.E_Split4__Basic$E_Split4.service_E()V: I4 Branch 2 IFNE L72 - false
   * 5 fb.rt.pnp.E_Split4__Basic$E_Split4.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L67 - false
   * 6 fb.rt.pnp.E_Split4__Basic.event_E()V: root-Branch
   * 7 fb.rt.pnp.E_Split4__Basic.transition_E_Split4_1()V: root-Branch
   * 8 fb.rt.pnp.E_Split4__Basic.<init>()V: root-Branch
   * 9 fb.rt.pnp.E_Split4__Basic.transition_E_Split4_0()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      E_Split4__Basic e_Split4__Basic0 = new E_Split4__Basic();
      e_Split4__Basic0.event_E();
  }
}