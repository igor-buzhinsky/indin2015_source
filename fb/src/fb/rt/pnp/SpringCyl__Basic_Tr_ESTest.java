/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 17:57:57 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.SpringCyl__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class SpringCyl__Basic_Tr_ESTest {

  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_5()V: root-Branch
   * 2 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_2()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      SpringCyl__Basic springCyl__Basic0 = new SpringCyl__Basic();
      springCyl__Basic0.event_REQ(false, true);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_4()V: root-Branch
   * 2 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_1()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      SpringCyl__Basic springCyl__Basic0 = new SpringCyl__Basic();
      springCyl__Basic0.event_REQ(true, true);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_3()V: root-Branch
   * 2 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_0()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      SpringCyl__Basic springCyl__Basic0 = new SpringCyl__Basic();
      springCyl__Basic0.event_INIT(true, true);
  }
}
