/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 06:09:56 MSK 2015
 */

package fb.rt.waterprocess;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.waterprocess.FB_SequenceControl__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class FB_SequenceControl__Basic_Tr_ESTest {

  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 fb.rt.waterprocess.FB_SequenceControl__Basic.transition_FB_SequenceControl_4()V: root-Branch
   * 2 fb.rt.waterprocess.FB_SequenceControl__Basic.transition_FB_SequenceControl_2()V: root-Branch
   * 3 fb.rt.waterprocess.FB_SequenceControl__Basic.transition_FB_SequenceControl_3()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      FB_SequenceControl__Basic fB_SequenceControl__Basic0 = new FB_SequenceControl__Basic();
      fB_SequenceControl__Basic0.event_REQ(false, false, true, true, false, false, false, true, false, false, false, true, false, false, false);
      fB_SequenceControl__Basic0.event_REQ(false, false, true, false, false, false, true, false, false, false, true, false, false, true, false);
      fB_SequenceControl__Basic0.event_REQ(true, false, false, false, false, true, true, false, true, true, true, false, true, false, false);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 fb.rt.waterprocess.FB_SequenceControl__Basic.transition_FB_SequenceControl_0()V: root-Branch
   * 2 fb.rt.waterprocess.FB_SequenceControl__Basic.transition_FB_SequenceControl_1()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      FB_SequenceControl__Basic fB_SequenceControl__Basic0 = new FB_SequenceControl__Basic();
      fB_SequenceControl__Basic0.event_INIT(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
  }
}