/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 08:01:02 MSK 2015
 */

package fb.rt.waterprocess;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.waterprocess.Service_DIMeasure__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class Service_DIMeasure__Basic_Tr_ESTest {

  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 fb.rt.waterprocess.Service_DIMeasure__Basic.transition_Service_DIMeasure_2()V: root-Branch
   * 2 fb.rt.waterprocess.Service_DIMeasure__Basic.transition_Service_DIMeasure_0()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      Service_DIMeasure__Basic service_DIMeasure__Basic0 = new Service_DIMeasure__Basic();
      service_DIMeasure__Basic0.event_INIT(true, true);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 fb.rt.waterprocess.Service_DIMeasure__Basic.transition_Service_DIMeasure_3()V: root-Branch
   * 2 fb.rt.waterprocess.Service_DIMeasure__Basic.transition_Service_DIMeasure_1()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      Service_DIMeasure__Basic service_DIMeasure__Basic0 = new Service_DIMeasure__Basic();
      service_DIMeasure__Basic0.event_REQ(false, false);
  }
}
