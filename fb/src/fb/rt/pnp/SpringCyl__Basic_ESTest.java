/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 03:59:46 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.SpringCyl__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class SpringCyl__Basic_ESTest {

  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.SpringCyl__Basic$SpringCyl.service_REQ()V: I29 Branch 7 IFEQ L130 - true
   */

  @Test
  public void test0()  throws Throwable  {
      SpringCyl__Basic springCyl__Basic0 = new SpringCyl__Basic();
      springCyl__Basic0.event_REQ(false, false);
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * 1 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_5()V: root-Branch
   * 2 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_2()V: root-Branch
   * 3 fb.rt.pnp.SpringCyl__Basic$SpringCyl.state_In2()V: root-Branch
   * 4 fb.rt.pnp.SpringCyl__Basic$SpringCyl.alg_In2()V: root-Branch
   * 5 fb.rt.pnp.SpringCyl__Basic$SpringCyl.service_REQ()V: I8 Branch 5 IFEQ L126 - true
   * 6 fb.rt.pnp.SpringCyl__Basic$SpringCyl.service_REQ()V: I25 Branch 6 IFNE L130 - false
   * 7 fb.rt.pnp.SpringCyl__Basic$SpringCyl.service_REQ()V: I29 Branch 7 IFEQ L130 - false
   */

  @Test
  public void test1()  throws Throwable  {
      SpringCyl__Basic springCyl__Basic0 = new SpringCyl__Basic();
      springCyl__Basic0.event_REQ(false, true);
  }

  //Test case number: 2
  /*
   * 9 covered goals:
   * 1 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_4()V: root-Branch
   * 2 fb.rt.pnp.SpringCyl__Basic.event_REQ(ZZ)V: root-Branch
   * 3 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_1()V: root-Branch
   * 4 fb.rt.pnp.SpringCyl__Basic$SpringCyl.state_In1()V: root-Branch
   * 5 fb.rt.pnp.SpringCyl__Basic$SpringCyl.alg_In1()V: root-Branch
   * 6 fb.rt.pnp.SpringCyl__Basic$SpringCyl.service_REQ()V: I4 Branch 4 IFNE L126 - false
   * 7 fb.rt.pnp.SpringCyl__Basic$SpringCyl.service_REQ()V: I8 Branch 5 IFEQ L126 - false
   * 8 fb.rt.pnp.SpringCyl__Basic$SpringCyl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L112 - true
   * 9 fb.rt.pnp.SpringCyl__Basic$SpringCyl.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 2 IF_ACMPNE L113 - false
   */

  @Test
  public void test2()  throws Throwable  {
      SpringCyl__Basic springCyl__Basic0 = new SpringCyl__Basic();
      springCyl__Basic0.event_REQ(true, true);
  }

  //Test case number: 3
  /*
   * 10 covered goals:
   * 1 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_3()V: root-Branch
   * 2 fb.rt.pnp.SpringCyl__Basic.<init>()V: root-Branch
   * 3 fb.rt.pnp.SpringCyl__Basic.event_INIT(ZZ)V: root-Branch
   * 4 fb.rt.pnp.SpringCyl__Basic.transition_SpringCyl_0()V: root-Branch
   * 5 fb.rt.pnp.SpringCyl__Basic$SpringCyl.alg_INIT()V: root-Branch
   * 6 fb.rt.pnp.SpringCyl__Basic$SpringCyl.state_INIT()V: root-Branch
   * 7 fb.rt.pnp.SpringCyl__Basic$SpringCyl.<init>(Lfb/rt/pnp/SpringCyl__Basic;)V: root-Branch
   * 8 fb.rt.pnp.SpringCyl__Basic$SpringCyl.state_START()V: root-Branch
   * 9 fb.rt.pnp.SpringCyl__Basic$SpringCyl.service_INIT()V: I4 Branch 3 IFNE L118 - false
   * 10 fb.rt.pnp.SpringCyl__Basic$SpringCyl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L112 - false
   */

  @Test
  public void test3()  throws Throwable  {
      SpringCyl__Basic springCyl__Basic0 = new SpringCyl__Basic();
      springCyl__Basic0.event_INIT(true, true);
  }
}
