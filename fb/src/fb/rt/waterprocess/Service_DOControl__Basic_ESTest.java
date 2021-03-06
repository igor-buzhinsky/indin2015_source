/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 06 18:11:58 MSK 2015
 */

package fb.rt.waterprocess;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.waterprocess.Service_DOControl__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class Service_DOControl__Basic_ESTest {

  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.alg_REQ()V: I8 Branch 5 IFEQ L141 - false
   * 2 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.alg_REQ()V: I23 Branch 6 IFEQ L141 - false
   */

  @Test
  public void test0()  throws Throwable  {
      Service_DOControl__Basic service_DOControl__Basic0 = new Service_DOControl__Basic();
      service_DOControl__Basic0.event_REQ(false, true, true);
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * 1 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.state_INIT()V: root-Branch
   * 2 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.alg_INIT()V: root-Branch
   * 3 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.service_INIT()V: I4 Branch 3 IFNE L117 - false
   * 4 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L111 - false
   * 5 fb.rt.waterprocess.Service_DOControl__Basic.transition_Service_DOControl_0()V: root-Branch
   * 6 fb.rt.waterprocess.Service_DOControl__Basic.event_INIT(ZZZ)V: root-Branch
   * 7 fb.rt.waterprocess.Service_DOControl__Basic.transition_Service_DOControl_2()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      Service_DOControl__Basic service_DOControl__Basic0 = new Service_DOControl__Basic();
      service_DOControl__Basic0.event_INIT(false, false, false);
  }

  //Test case number: 2
  /*
   * 12 covered goals:
   * 1 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.state_START()V: root-Branch
   * 2 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.<init>(Lfb/rt/waterprocess/Service_DOControl__Basic;)V: root-Branch
   * 3 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.state_REQ()V: root-Branch
   * 4 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.alg_REQ()V: I8 Branch 5 IFEQ L141 - true
   * 5 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.alg_REQ()V: I23 Branch 6 IFEQ L141 - true
   * 6 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.service_REQ()V: I4 Branch 4 IFNE L125 - false
   * 7 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L111 - true
   * 8 fb.rt.waterprocess.Service_DOControl__Basic$Service_DOControl.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 2 IF_ACMPNE L112 - false
   * 9 fb.rt.waterprocess.Service_DOControl__Basic.transition_Service_DOControl_1()V: root-Branch
   * 10 fb.rt.waterprocess.Service_DOControl__Basic.<init>()V: root-Branch
   * 11 fb.rt.waterprocess.Service_DOControl__Basic.event_REQ(ZZZ)V: root-Branch
   * 12 fb.rt.waterprocess.Service_DOControl__Basic.transition_Service_DOControl_3()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      Service_DOControl__Basic service_DOControl__Basic0 = new Service_DOControl__Basic();
      service_DOControl__Basic0.event_REQ(false, false, false);
  }
}
