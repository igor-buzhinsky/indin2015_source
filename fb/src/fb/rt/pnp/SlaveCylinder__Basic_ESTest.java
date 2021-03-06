/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 03:39:32 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.SlaveCylinder__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class SlaveCylinder__Basic_ESTest {

  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_REQ()V: I31 Branch 9 IFEQ L161 - true
   */

  @Test
  public void test0()  throws Throwable  {
      SlaveCylinder__Basic slaveCylinder__Basic0 = new SlaveCylinder__Basic();
      slaveCylinder__Basic0.event_Extend();
      slaveCylinder__Basic0.event_REQ(false, false, false);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_REQ()V: I9 Branch 7 IFEQ L157 - true
   * 2 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_REQ()V: I27 Branch 8 IF_ICMPNE L161 - true
   */

  @Test
  public void test1()  throws Throwable  {
      SlaveCylinder__Basic slaveCylinder__Basic0 = new SlaveCylinder__Basic();
      slaveCylinder__Basic0.event_Retract();
      slaveCylinder__Basic0.event_REQ(false, false, false);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_Retract()V: I4 Branch 5 IFNE L149 - true
   */

  @Test
  public void test2()  throws Throwable  {
      SlaveCylinder__Basic slaveCylinder__Basic0 = new SlaveCylinder__Basic();
      slaveCylinder__Basic0.event_Retract();
      slaveCylinder__Basic0.event_Retract();
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_Extend()V: I4 Branch 4 IFNE L141 - true
   */

  @Test
  public void test3()  throws Throwable  {
      SlaveCylinder__Basic slaveCylinder__Basic0 = new SlaveCylinder__Basic();
      slaveCylinder__Basic0.event_Retract();
      slaveCylinder__Basic0.event_Extend();
  }

  //Test case number: 4
  /*
   * 12 covered goals:
   * 1 fb.rt.pnp.SlaveCylinder__Basic.transition_SlaveCylinder_3()V: root-Branch
   * 2 fb.rt.pnp.SlaveCylinder__Basic.event_Retract()V: root-Branch
   * 3 fb.rt.pnp.SlaveCylinder__Basic.transition_SlaveCylinder_4()V: root-Branch
   * 4 fb.rt.pnp.SlaveCylinder__Basic.transition_SlaveCylinder_1()V: root-Branch
   * 5 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.alg_Retract()V: root-Branch
   * 6 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.state_Home()V: root-Branch
   * 7 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.state_Retract()V: root-Branch
   * 8 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.alg_Home()V: root-Branch
   * 9 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_Retract()V: I4 Branch 5 IFNE L149 - false
   * 10 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_REQ()V: I5 Branch 6 IF_ICMPNE L157 - false
   * 11 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_REQ()V: I9 Branch 7 IFEQ L157 - false
   * 12 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 2 IF_ACMPNE L135 - false
   */

  @Test
  public void test4()  throws Throwable  {
      SlaveCylinder__Basic slaveCylinder__Basic0 = new SlaveCylinder__Basic();
      slaveCylinder__Basic0.event_Retract();
      slaveCylinder__Basic0.event_REQ(true, true, true);
  }

  //Test case number: 5
  /*
   * 20 covered goals:
   * 1 fb.rt.pnp.SlaveCylinder__Basic.event_REQ(ZZZ)V: root-Branch
   * 2 fb.rt.pnp.SlaveCylinder__Basic.<init>()V: root-Branch
   * 3 fb.rt.pnp.SlaveCylinder__Basic.transition_SlaveCylinder_0()V: root-Branch
   * 4 fb.rt.pnp.SlaveCylinder__Basic.transition_SlaveCylinder_5()V: root-Branch
   * 5 fb.rt.pnp.SlaveCylinder__Basic.event_Extend()V: root-Branch
   * 6 fb.rt.pnp.SlaveCylinder__Basic.transition_SlaveCylinder_2()V: root-Branch
   * 7 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.state_START()V: root-Branch
   * 8 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.<init>(Lfb/rt/pnp/SlaveCylinder__Basic;)V: root-Branch
   * 9 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.alg_Extend()V: root-Branch
   * 10 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.state_End()V: root-Branch
   * 11 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.alg_End()V: root-Branch
   * 12 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.state_Extend()V: root-Branch
   * 13 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_REQ()V: I5 Branch 6 IF_ICMPNE L157 - true
   * 14 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_REQ()V: I27 Branch 8 IF_ICMPNE L161 - false
   * 15 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_REQ()V: I31 Branch 9 IFEQ L161 - false
   * 16 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L134 - true
   * 17 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L134 - false
   * 18 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 2 IF_ACMPNE L135 - true
   * 19 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.serviceEvent(Lfb/rt/EventServer;)V: I23 Branch 3 IF_ACMPNE L136 - false
   * 20 fb.rt.pnp.SlaveCylinder__Basic$SlaveCylinder.service_Extend()V: I4 Branch 4 IFNE L141 - false
   */

  @Test
  public void test5()  throws Throwable  {
      SlaveCylinder__Basic slaveCylinder__Basic0 = new SlaveCylinder__Basic();
      slaveCylinder__Basic0.event_Extend();
      slaveCylinder__Basic0.event_REQ(true, true, true);
  }
}
