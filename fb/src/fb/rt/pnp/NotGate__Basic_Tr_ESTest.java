/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 13:45:15 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.NotGate__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class NotGate__Basic_Tr_ESTest {

  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.NotGate__Basic.transition_NotGate_2()V: root-Branch
   * 2 fb.rt.pnp.NotGate__Basic.transition_NotGate_1()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      NotGate__Basic notGate__Basic0 = new NotGate__Basic();
      notGate__Basic0.event_INIT(false);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.NotGate__Basic.transition_NotGate_0()V: root-Branch
   * 2 fb.rt.pnp.NotGate__Basic.transition_NotGate_3()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      NotGate__Basic notGate__Basic0 = new NotGate__Basic();
      notGate__Basic0.event_REQ(false);
  }
}