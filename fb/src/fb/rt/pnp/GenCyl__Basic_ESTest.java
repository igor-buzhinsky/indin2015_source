/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 06 19:32:51 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.GenCyl__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class GenCyl__Basic_ESTest {

  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_8()V: root-Branch
   * 2 fb.rt.pnp.GenCyl__Basic$GenCyl.service_IN_CMD()V: I31 Branch 30 IFEQ L238 - true
   * 3 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I128 Branch 16 IFEQ L214 - false
   * 4 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I164 Branch 19 IFEQ L218 - false
   * 5 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I242 Branch 25 IF_ICMPNE L226 - false
   * 6 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I249 Branch 26 IFEQ L226 - false
   */

  @Test
  public void test0()  throws Throwable  {
      GenCyl__Basic genCyl__Basic0 = new GenCyl__Basic();
      genCyl__Basic0.event_INIT(true, true, true, true, true, true, (short) (-2604));
      genCyl__Basic0.event_REQ(true, true, true, true, true, true, (short)2);
      genCyl__Basic0.event_IN_CMD(false, true, true, true, true, false);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.GenCyl__Basic$GenCyl.service_IN_CMD()V: I9 Branch 28 IFEQ L234 - true
   * 2 fb.rt.pnp.GenCyl__Basic$GenCyl.service_IN_CMD()V: I27 Branch 29 IF_ICMPNE L238 - true
   */

  @Test
  public void test1()  throws Throwable  {
      GenCyl__Basic genCyl__Basic0 = new GenCyl__Basic();
      genCyl__Basic0.event_INIT(true, false, true, false, true, true, (short) (-4));
      genCyl__Basic0.event_REQ(true, true, true, true, true, true, (short)1);
      genCyl__Basic0.event_REQ(false, true, true, false, false, true, (short) (-4));
      genCyl__Basic0.event_IN_CMD(true, true, true, true, true, true);
      genCyl__Basic0.event_REQ(true, true, true, true, true, true, (short)1);
      genCyl__Basic0.event_IN_CMD(false, true, true, true, true, true);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I212 Branch 23 IFEQ L222 - true
   */

  @Test
  public void test2()  throws Throwable  {
      GenCyl__Basic genCyl__Basic0 = new GenCyl__Basic();
      genCyl__Basic0.event_INIT(true, true, true, true, true, true, (short)0);
      genCyl__Basic0.event_REQ(true, false, false, true, false, false, (short)2);
      genCyl__Basic0.event_REQ(false, false, true, true, true, false, (short)0);
  }

  //Test case number: 3
  /*
   * 14 covered goals:
   * 1 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_2()V: root-Branch
   * 2 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_5()V: root-Branch
   * 3 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_9()V: root-Branch
   * 4 fb.rt.pnp.GenCyl__Basic$GenCyl.state_c1home()V: root-Branch
   * 5 fb.rt.pnp.GenCyl__Basic$GenCyl.service_IN_CMD()V: I5 Branch 27 IF_ICMPNE L234 - false
   * 6 fb.rt.pnp.GenCyl__Basic$GenCyl.service_IN_CMD()V: I9 Branch 28 IFEQ L234 - false
   * 7 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I9 Branch 6 IFEQ L202 - false
   * 8 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I118 Branch 15 IF_ICMPNE L214 - false
   * 9 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I139 Branch 17 IFEQ L214 - false
   * 10 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I175 Branch 20 IF_ICMPNE L218 - true
   * 11 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I190 Branch 21 IFEQ L218 - true
   * 12 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I230 Branch 24 IF_ICMPNE L226 - false
   * 13 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I242 Branch 25 IF_ICMPNE L226 - true
   * 14 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I249 Branch 26 IFEQ L226 - true
   */

  @Test
  public void test3()  throws Throwable  {
      GenCyl__Basic genCyl__Basic0 = new GenCyl__Basic();
      genCyl__Basic0.event_INIT(false, false, false, false, false, true, (short)1);
      genCyl__Basic0.event_REQ(true, false, false, true, true, true, (short)1);
      genCyl__Basic0.event_IN_CMD(true, false, true, false, false, false);
      genCyl__Basic0.event_REQ(true, true, false, false, true, false, (short)1);
      genCyl__Basic0.event_IN_CMD(true, false, false, false, true, false);
      genCyl__Basic0.event_REQ(false, false, false, false, false, false, (short)1);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I31 Branch 8 IFEQ L206 - true
   * 2 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I61 Branch 10 IF_ICMPNE L210 - false
   * 3 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I74 Branch 11 IFEQ L210 - false
   */

  @Test
  public void test4()  throws Throwable  {
      GenCyl__Basic genCyl__Basic0 = new GenCyl__Basic();
      genCyl__Basic0.event_INIT(true, false, true, false, true, true, (short) (-4));
      genCyl__Basic0.event_REQ(true, true, true, true, true, true, (short)1);
      genCyl__Basic0.event_REQ(false, false, true, false, true, false, (short)1);
  }

  //Test case number: 5
  /*
   * 21 covered goals:
   * 1 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_3()V: root-Branch
   * 2 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_4()V: root-Branch
   * 3 fb.rt.pnp.GenCyl__Basic.event_IN_CMD(ZZZZZZ)V: root-Branch
   * 4 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_10()V: root-Branch
   * 5 fb.rt.pnp.GenCyl__Basic$GenCyl.alg_Get1or3()V: root-Branch
   * 6 fb.rt.pnp.GenCyl__Basic$GenCyl.alg_GoBack()V: root-Branch
   * 7 fb.rt.pnp.GenCyl__Basic$GenCyl.state_Getpp1or3()V: root-Branch
   * 8 fb.rt.pnp.GenCyl__Basic$GenCyl.state_GoBack()V: root-Branch
   * 9 fb.rt.pnp.GenCyl__Basic$GenCyl.service_IN_CMD()V: I5 Branch 27 IF_ICMPNE L234 - true
   * 10 fb.rt.pnp.GenCyl__Basic$GenCyl.service_IN_CMD()V: I27 Branch 29 IF_ICMPNE L238 - false
   * 11 fb.rt.pnp.GenCyl__Basic$GenCyl.service_IN_CMD()V: I31 Branch 30 IFEQ L238 - false
   * 12 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I5 Branch 5 IF_ICMPNE L202 - false
   * 13 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I9 Branch 6 IFEQ L202 - true
   * 14 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I27 Branch 7 IF_ICMPNE L206 - false
   * 15 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I31 Branch 8 IFEQ L206 - false
   * 16 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I84 Branch 12 IFEQ L210 - true
   * 17 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I92 Branch 13 IFEQ L210 - false
   * 18 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I208 Branch 22 IF_ICMPNE L222 - true
   * 19 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I230 Branch 24 IF_ICMPNE L226 - true
   * 20 fb.rt.pnp.GenCyl__Basic$GenCyl.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 2 IF_ACMPNE L188 - true
   * 21 fb.rt.pnp.GenCyl__Basic$GenCyl.serviceEvent(Lfb/rt/EventServer;)V: I23 Branch 3 IF_ACMPNE L189 - false
   */

  @Test
  public void test5()  throws Throwable  {
      GenCyl__Basic genCyl__Basic0 = new GenCyl__Basic();
      genCyl__Basic0.event_INIT(false, false, false, false, true, false, (short)13);
      genCyl__Basic0.event_REQ(false, false, false, false, true, false, (short)13);
      genCyl__Basic0.event_REQ(false, true, false, false, false, false, (short)13);
      genCyl__Basic0.event_IN_CMD(true, false, false, true, false, true);
      genCyl__Basic0.event_REQ(false, false, true, false, false, false, (short)13);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.GenCyl__Basic$GenCyl.service_INIT()V: I4 Branch 4 IFNE L194 - true
   */

  @Test
  public void test6()  throws Throwable  {
      GenCyl__Basic genCyl__Basic0 = new GenCyl__Basic();
      genCyl__Basic0.event_INIT(true, false, true, false, true, true, (short) (-4));
      genCyl__Basic0.event_INIT(true, true, true, false, true, true, (short)1);
  }

  //Test case number: 7
  /*
   * 40 covered goals:
   * 1 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_1()V: root-Branch
   * 2 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_6()V: root-Branch
   * 3 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_7()V: root-Branch
   * 4 fb.rt.pnp.GenCyl__Basic.event_INIT(ZZZZZZS)V: root-Branch
   * 5 fb.rt.pnp.GenCyl__Basic.event_REQ(ZZZZZZS)V: root-Branch
   * 6 fb.rt.pnp.GenCyl__Basic.transition_GenCyl_0()V: root-Branch
   * 7 fb.rt.pnp.GenCyl__Basic.<init>()V: root-Branch
   * 8 fb.rt.pnp.GenCyl__Basic$GenCyl.state_INIT()V: root-Branch
   * 9 fb.rt.pnp.GenCyl__Basic$GenCyl.state_wait()V: root-Branch
   * 10 fb.rt.pnp.GenCyl__Basic$GenCyl.alg_AllowVcDown()V: root-Branch
   * 11 fb.rt.pnp.GenCyl__Basic$GenCyl.alg_BlockVcDown()V: root-Branch
   * 12 fb.rt.pnp.GenCyl__Basic$GenCyl.state_c1end()V: root-Branch
   * 13 fb.rt.pnp.GenCyl__Basic$GenCyl.<init>(Lfb/rt/pnp/GenCyl__Basic;)V: root-Branch
   * 14 fb.rt.pnp.GenCyl__Basic$GenCyl.state_Getpp2or3()V: root-Branch
   * 15 fb.rt.pnp.GenCyl__Basic$GenCyl.alg_INIT()V: root-Branch
   * 16 fb.rt.pnp.GenCyl__Basic$GenCyl.alg_Get2or3()V: root-Branch
   * 17 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I5 Branch 5 IF_ICMPNE L202 - true
   * 18 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I27 Branch 7 IF_ICMPNE L206 - true
   * 19 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I49 Branch 9 IF_ICMPNE L210 - true
   * 20 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I49 Branch 9 IF_ICMPNE L210 - false
   * 21 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I61 Branch 10 IF_ICMPNE L210 - true
   * 22 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I74 Branch 11 IFEQ L210 - true
   * 23 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I84 Branch 12 IFEQ L210 - false
   * 24 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I92 Branch 13 IFEQ L210 - true
   * 25 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I110 Branch 14 IF_ICMPNE L214 - true
   * 26 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I110 Branch 14 IF_ICMPNE L214 - false
   * 27 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I118 Branch 15 IF_ICMPNE L214 - true
   * 28 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I128 Branch 16 IFEQ L214 - true
   * 29 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I139 Branch 17 IFEQ L214 - true
   * 30 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I157 Branch 18 IF_ICMPNE L218 - true
   * 31 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I157 Branch 18 IF_ICMPNE L218 - false
   * 32 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I164 Branch 19 IFEQ L218 - true
   * 33 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I175 Branch 20 IF_ICMPNE L218 - false
   * 34 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I190 Branch 21 IFEQ L218 - false
   * 35 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I208 Branch 22 IF_ICMPNE L222 - false
   * 36 fb.rt.pnp.GenCyl__Basic$GenCyl.service_REQ()V: I212 Branch 23 IFEQ L222 - false
   * 37 fb.rt.pnp.GenCyl__Basic$GenCyl.service_INIT()V: I4 Branch 4 IFNE L194 - false
   * 38 fb.rt.pnp.GenCyl__Basic$GenCyl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L187 - true
   * 39 fb.rt.pnp.GenCyl__Basic$GenCyl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L187 - false
   * 40 fb.rt.pnp.GenCyl__Basic$GenCyl.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 2 IF_ACMPNE L188 - false
   */

  @Test
  public void test7()  throws Throwable  {
      GenCyl__Basic genCyl__Basic0 = new GenCyl__Basic();
      genCyl__Basic0.event_INIT(true, true, true, true, true, true, (short) (-5));
      genCyl__Basic0.event_REQ(true, true, false, true, true, true, (short)2);
      genCyl__Basic0.event_REQ(true, true, true, true, false, true, (short) (-5));
  }
}
