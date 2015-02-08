/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 16:16:58 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.PnpXYCalculator__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class PnpXYCalculator__Basic_Tr_ESTest {

  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_7()V: root-Branch
   * 2 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_2()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      PnpXYCalculator__Basic pnpXYCalculator__Basic0 = new PnpXYCalculator__Basic();
      pnpXYCalculator__Basic0.event_CLK(0, 0, (-75), true);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_8()V: root-Branch
   * 2 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_1()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      PnpXYCalculator__Basic pnpXYCalculator__Basic0 = new PnpXYCalculator__Basic();
      pnpXYCalculator__Basic0.event_REQ(false, true, true, false, false);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_6()V: root-Branch
   * 2 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_0()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      PnpXYCalculator__Basic pnpXYCalculator__Basic0 = new PnpXYCalculator__Basic();
      pnpXYCalculator__Basic0.event_INIT(5, 5);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_5()V: root-Branch
   * 2 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_10()V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      PnpXYCalculator__Basic pnpXYCalculator__Basic0 = new PnpXYCalculator__Basic();
      pnpXYCalculator__Basic0.event_ADD_WP00();
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_3()V: root-Branch
   * 2 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_9()V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      PnpXYCalculator__Basic pnpXYCalculator__Basic0 = new PnpXYCalculator__Basic();
      pnpXYCalculator__Basic0.event_ADD_WP(5, 5);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_4()V: root-Branch
   * 2 fb.rt.pnp.PnpXYCalculator__Basic.transition_PnpXYCalculator_11()V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      PnpXYCalculator__Basic pnpXYCalculator__Basic0 = new PnpXYCalculator__Basic();
      pnpXYCalculator__Basic0.event_REMOVE_WP();
  }
}