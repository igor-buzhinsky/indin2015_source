/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 06 17:11:20 MSK 2015
 */

package fb.rt.waterprocess;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.waterprocess.NOT2__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class NOT2__Basic_ESTest {

  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 fb.rt.waterprocess.NOT2__Basic$NOT2.alg_REQ()V: I7 Branch 3 IFEQ L101 - false
   * 2 fb.rt.waterprocess.NOT2__Basic$NOT2.alg_REQ()V: I21 Branch 4 IFEQ L102 - false
   */

  @Test
  public void test0()  throws Throwable  {
      NOT2__Basic nOT2__Basic0 = new NOT2__Basic();
      nOT2__Basic0.event_REQ(true, true);
  }

  //Test case number: 1
  /*
   * 11 covered goals:
   * 1 fb.rt.waterprocess.NOT2__Basic$NOT2.<init>(Lfb/rt/waterprocess/NOT2__Basic;)V: root-Branch
   * 2 fb.rt.waterprocess.NOT2__Basic$NOT2.state_START()V: root-Branch
   * 3 fb.rt.waterprocess.NOT2__Basic$NOT2.state_REQ()V: root-Branch
   * 4 fb.rt.waterprocess.NOT2__Basic$NOT2.alg_REQ()V: I7 Branch 3 IFEQ L101 - true
   * 5 fb.rt.waterprocess.NOT2__Basic$NOT2.alg_REQ()V: I21 Branch 4 IFEQ L102 - true
   * 6 fb.rt.waterprocess.NOT2__Basic$NOT2.service_REQ()V: I4 Branch 2 IFNE L93 - false
   * 7 fb.rt.waterprocess.NOT2__Basic$NOT2.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L88 - false
   * 8 fb.rt.waterprocess.NOT2__Basic.event_REQ(ZZ)V: root-Branch
   * 9 fb.rt.waterprocess.NOT2__Basic.<init>()V: root-Branch
   * 10 fb.rt.waterprocess.NOT2__Basic.transition_NOT2_0()V: root-Branch
   * 11 fb.rt.waterprocess.NOT2__Basic.transition_NOT2_1()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      NOT2__Basic nOT2__Basic0 = new NOT2__Basic();
      nOT2__Basic0.event_REQ(false, false);
  }
}
