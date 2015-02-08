/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 18:28:16 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.VaccumSlave__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class VaccumSlave__Basic_Tr_ESTest {

  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.VaccumSlave__Basic.transition_VaccumSlave_4()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      VaccumSlave__Basic vaccumSlave__Basic0 = new VaccumSlave__Basic();
      vaccumSlave__Basic0.event_OP2();
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.VaccumSlave__Basic.transition_VaccumSlave_8()V: root-Branch
   * 2 fb.rt.pnp.VaccumSlave__Basic.transition_VaccumSlave_1()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      VaccumSlave__Basic vaccumSlave__Basic0 = new VaccumSlave__Basic();
      vaccumSlave__Basic0.event_INIT(true);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.VaccumSlave__Basic.transition_VaccumSlave_7()V: root-Branch
   * 2 fb.rt.pnp.VaccumSlave__Basic.transition_VaccumSlave_2()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      VaccumSlave__Basic vaccumSlave__Basic0 = new VaccumSlave__Basic();
      vaccumSlave__Basic0.event_REQ(true);
      vaccumSlave__Basic0.event_OP1();
      vaccumSlave__Basic0.event_REQ(false);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.VaccumSlave__Basic.transition_VaccumSlave_5()V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      VaccumSlave__Basic vaccumSlave__Basic0 = new VaccumSlave__Basic();
      vaccumSlave__Basic0.event_REQ(true);
      vaccumSlave__Basic0.event_OP2();
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.VaccumSlave__Basic.transition_VaccumSlave_0()V: root-Branch
   * 2 fb.rt.pnp.VaccumSlave__Basic.transition_VaccumSlave_6()V: root-Branch
   * 3 fb.rt.pnp.VaccumSlave__Basic.transition_VaccumSlave_3()V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      VaccumSlave__Basic vaccumSlave__Basic0 = new VaccumSlave__Basic();
      vaccumSlave__Basic0.event_OP1();
      vaccumSlave__Basic0.event_REQ(true);
  }
}
