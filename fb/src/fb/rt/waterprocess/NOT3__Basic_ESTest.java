/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 06 17:21:25 MSK 2015
 */

package fb.rt.waterprocess;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.waterprocess.NOT3__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class NOT3__Basic_ESTest {

  //Test case number: 0
  /*
   * 10 covered goals:
   * 1 fb.rt.waterprocess.NOT3__Basic.<init>()V: root-Branch
   * 2 fb.rt.waterprocess.NOT3__Basic.transition_NOT3_1()V: root-Branch
   * 3 fb.rt.waterprocess.NOT3__Basic.transition_NOT3_0()V: root-Branch
   * 4 fb.rt.waterprocess.NOT3__Basic.event_REQ(ZZZ)V: root-Branch
   * 5 fb.rt.waterprocess.NOT3__Basic$NOT3.alg_REQ()V: root-Branch
   * 6 fb.rt.waterprocess.NOT3__Basic$NOT3.state_REQ()V: root-Branch
   * 7 fb.rt.waterprocess.NOT3__Basic$NOT3.state_START()V: root-Branch
   * 8 fb.rt.waterprocess.NOT3__Basic$NOT3.<init>(Lfb/rt/waterprocess/NOT3__Basic;)V: root-Branch
   * 9 fb.rt.waterprocess.NOT3__Basic$NOT3.service_REQ()V: I4 Branch 2 IFNE L101 - false
   * 10 fb.rt.waterprocess.NOT3__Basic$NOT3.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L96 - false
   */

  @Test
  public void test0()  throws Throwable  {
      NOT3__Basic nOT3__Basic0 = new NOT3__Basic();
      nOT3__Basic0.event_REQ(false, false, false);
  }
}
