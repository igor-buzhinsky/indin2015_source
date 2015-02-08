/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 06 15:30:15 MSK 2015
 */

package fb.rt.waterprocess;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.waterprocess.FB_HeaterControl__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class FB_HeaterControl__Basic_ESTest {

  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.alg_REQ()V: I9 Branch 5 IFEQ L135 - true
   */

  @Test
  public void test0()  throws Throwable  {
      FB_HeaterControl__Basic fB_HeaterControl__Basic0 = new FB_HeaterControl__Basic();
      fB_HeaterControl__Basic0.event_REQ(true, false);
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * 1 fb.rt.waterprocess.FB_HeaterControl__Basic.transition_FB_HeaterControl_0()V: root-Branch
   * 2 fb.rt.waterprocess.FB_HeaterControl__Basic.event_INIT(ZZ)V: root-Branch
   * 3 fb.rt.waterprocess.FB_HeaterControl__Basic.transition_FB_HeaterControl_2()V: root-Branch
   * 4 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.state_INIT()V: root-Branch
   * 5 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.alg_INIT()V: root-Branch
   * 6 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.service_INIT()V: I4 Branch 3 IFNE L110 - false
   * 7 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L104 - false
   */

  @Test
  public void test1()  throws Throwable  {
      FB_HeaterControl__Basic fB_HeaterControl__Basic0 = new FB_HeaterControl__Basic();
      fB_HeaterControl__Basic0.event_INIT(false, false);
  }

  //Test case number: 2
  /*
   * 11 covered goals:
   * 1 fb.rt.waterprocess.FB_HeaterControl__Basic.<init>()V: root-Branch
   * 2 fb.rt.waterprocess.FB_HeaterControl__Basic.event_REQ(ZZ)V: root-Branch
   * 3 fb.rt.waterprocess.FB_HeaterControl__Basic.transition_FB_HeaterControl_1()V: root-Branch
   * 4 fb.rt.waterprocess.FB_HeaterControl__Basic.transition_FB_HeaterControl_3()V: root-Branch
   * 5 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.<init>(Lfb/rt/waterprocess/FB_HeaterControl__Basic;)V: root-Branch
   * 6 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.state_START()V: root-Branch
   * 7 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.state_REQ()V: root-Branch
   * 8 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.alg_REQ()V: I9 Branch 5 IFEQ L135 - false
   * 9 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.service_REQ()V: I4 Branch 4 IFNE L118 - false
   * 10 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L104 - true
   * 11 fb.rt.waterprocess.FB_HeaterControl__Basic$FB_HeaterControl.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 2 IF_ACMPNE L105 - false
   */

  @Test
  public void test2()  throws Throwable  {
      FB_HeaterControl__Basic fB_HeaterControl__Basic0 = new FB_HeaterControl__Basic();
      fB_HeaterControl__Basic0.event_REQ(true, true);
  }
}
