/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 16:47:17 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.SFC2__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class SFC2__Basic_Tr_ESTest {

  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.SFC2__Basic.transition_SFC2_2()V: root-Branch
   * 2 fb.rt.pnp.SFC2__Basic.transition_SFC2_3()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      SFC2__Basic sFC2__Basic0 = new SFC2__Basic();
      sFC2__Basic0.event_REQ(true, false, true, true, false);
      sFC2__Basic0.event_REQ(false, true, true, true, true);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.SFC2__Basic.transition_SFC2_1()V: root-Branch
   * 2 fb.rt.pnp.SFC2__Basic.transition_SFC2_0()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      SFC2__Basic sFC2__Basic0 = new SFC2__Basic();
      sFC2__Basic0.event_INIT(true, true, true, true, true);
  }
}
