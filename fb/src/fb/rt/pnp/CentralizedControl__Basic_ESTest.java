/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 06 18:52:25 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.CentralizedControl__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class CentralizedControl__Basic_ESTest {

  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_12()V: root-Branch
   * 2 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I305 Branch 29 IFNE L262 - false
   * 3 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I369 Branch 34 IFEQ L270 - false
   * 4 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I377 Branch 35 IFEQ L270 - true
   */

  @Test
  public void test00()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(true, true, true, true, true, true, true, true, true, true);
      centralizedControl__Basic0.event_REQ(true, true, true, true, true, true, true, true, false, true);
      centralizedControl__Basic0.event_REQ(true, true, true, true, true, true, true, true, true, true);
      centralizedControl__Basic0.event_REQ(true, true, true, true, true, false, false, true, true, false);
      centralizedControl__Basic0.event_REQ(true, true, true, true, false, true, true, false, true, true);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I335 Branch 31 IFEQ L266 - true
   */

  @Test
  public void test01()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(false, true, true, false, true, true, true, false, true, true);
      centralizedControl__Basic0.event_REQ(true, true, true, false, true, true, true, true, false, false);
      centralizedControl__Basic0.event_REQ(true, true, true, false, false, false, true, false, true, true);
  }

  //Test case number: 2
  /*
   * 9 covered goals:
   * 1 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_13()V: root-Branch
   * 2 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.state_VacuumOff()V: root-Branch
   * 3 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.alg_TurnOffvac()V: root-Branch
   * 4 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I254 Branch 24 IFEQ L254 - false
   * 5 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I261 Branch 25 IFEQ L254 - true
   * 6 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I301 Branch 28 IF_ICMPNE L262 - false
   * 7 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I305 Branch 29 IFNE L262 - true
   * 8 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I323 Branch 30 IF_ICMPNE L266 - false
   * 9 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I335 Branch 31 IFEQ L266 - false
   */

  @Test
  public void test02()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(false, true, true, false, true, true, true, false, true, true);
      centralizedControl__Basic0.event_REQ(true, true, true, false, true, true, true, true, false, false);
      centralizedControl__Basic0.event_REQ(true, false, true, true, true, true, true, true, true, true);
      centralizedControl__Basic0.event_REQ(false, true, true, true, true, false, true, true, false, true);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I283 Branch 27 IFEQ L258 - true
   */

  @Test
  public void test03()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(false, false, true, false, true, true, false, true, true, false);
      centralizedControl__Basic0.event_REQ(false, false, false, true, false, false, false, false, false, false);
      centralizedControl__Basic0.event_REQ(true, true, false, true, false, true, true, false, false, true);
      centralizedControl__Basic0.event_REQ(false, false, false, true, false, false, false, false, false, false);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I225 Branch 22 IFEQ L250 - true
   */

  @Test
  public void test04()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(false, false, false, false, true, false, false, false, true, false);
      centralizedControl__Basic0.event_REQ(false, true, false, false, true, true, false, false, false, false);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I199 Branch 20 IFEQ L246 - true
   */

  @Test
  public void test05()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(false, false, true, true, true, false, false, true, false, false);
      centralizedControl__Basic0.event_REQ(true, true, true, false, true, false, false, true, false, true);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I177 Branch 18 IFEQ L242 - true
   */

  @Test
  public void test06()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(true, true, false, true, true, true, true, true, true, true);
      centralizedControl__Basic0.event_REQ(false, false, false, true, false, false, false, true, true, false);
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * 1 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I95 Branch 11 IFEQ L234 - false
   * 2 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I131 Branch 14 IFEQ L238 - false
   * 3 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I140 Branch 15 IFEQ L238 - false
   * 4 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I155 Branch 16 IFEQ L238 - true
   */

  @Test
  public void test07()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(false, false, false, false, false, false, true, true, true, true);
  }

  //Test case number: 8
  /*
   * 10 covered goals:
   * 1 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_4()V: root-Branch
   * 2 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_7()V: root-Branch
   * 3 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.state_Piece1()V: root-Branch
   * 4 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.alg_extend1()V: root-Branch
   * 5 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I47 Branch 7 IFEQ L226 - true
   * 6 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I73 Branch 9 IFEQ L230 - false
   * 7 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I173 Branch 17 IF_ICMPNE L242 - false
   * 8 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I177 Branch 18 IFEQ L242 - false
   * 9 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I353 Branch 32 IF_ICMPNE L270 - true
   * 10 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I360 Branch 33 IFEQ L270 - false
   */

  @Test
  public void test08()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(true, false, true, true, true, true, true, true, true, true);
      centralizedControl__Basic0.event_REQ(false, true, false, false, true, false, false, false, false, false);
      centralizedControl__Basic0.event_REQ(true, true, false, true, false, true, false, true, true, true);
      centralizedControl__Basic0.event_REQ(false, true, false, false, true, false, true, true, false, true);
      centralizedControl__Basic0.event_REQ(true, false, false, true, true, true, false, false, true, false);
      centralizedControl__Basic0.event_REQ(true, true, true, true, true, false, true, false, false, false);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_INIT()V: I4 Branch 3 IFNE L214 - true
   */

  @Test
  public void test09()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_INIT();
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_2()V: root-Branch
   * 2 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I17 Branch 5 IFEQ L222 - false
   */

  @Test
  public void test10()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(false, false, true, true, true, false, false, true, false, false);
      centralizedControl__Basic0.event_REQ(true, true, true, true, true, true, false, false, true, false);
      centralizedControl__Basic0.event_REQ(true, true, false, true, false, true, true, true, true, true);
      centralizedControl__Basic0.event_REQ(true, false, true, false, true, true, false, true, true, true);
      centralizedControl__Basic0.event_REQ(true, true, true, true, true, false, true, true, false, true);
  }

  //Test case number: 11
  /*
   * 35 covered goals:
   * 1 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_3()V: root-Branch
   * 2 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_10()V: root-Branch
   * 3 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_5()V: root-Branch
   * 4 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_11()V: root-Branch
   * 5 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_14()V: root-Branch
   * 6 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_8()V: root-Branch
   * 7 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.state_Piece2()V: root-Branch
   * 8 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.state_Vacuum_On()V: root-Branch
   * 9 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.alg_RetracAll()V: root-Branch
   * 10 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.alg_TurnOnVac()V: root-Branch
   * 11 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.state_GoUp()V: root-Branch
   * 12 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.alg_Retractvc()V: root-Branch
   * 13 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.state_Retract()V: root-Branch
   * 14 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.alg_extend2()V: root-Branch
   * 15 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I5 Branch 4 IF_ICMPNE L222 - false
   * 16 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I17 Branch 5 IFEQ L222 - true
   * 17 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I35 Branch 6 IF_ICMPNE L226 - false
   * 18 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I47 Branch 7 IFEQ L226 - false
   * 19 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I109 Branch 12 IFEQ L234 - false
   * 20 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I195 Branch 19 IF_ICMPNE L246 - false
   * 21 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I199 Branch 20 IFEQ L246 - false
   * 22 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I217 Branch 21 IF_ICMPNE L250 - true
   * 23 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I243 Branch 23 IF_ICMPNE L254 - true
   * 24 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I243 Branch 23 IF_ICMPNE L254 - false
   * 25 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I254 Branch 24 IFEQ L254 - true
   * 26 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I261 Branch 25 IFEQ L254 - false
   * 27 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I279 Branch 26 IF_ICMPNE L258 - true
   * 28 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I279 Branch 26 IF_ICMPNE L258 - false
   * 29 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I283 Branch 27 IFEQ L258 - false
   * 30 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I301 Branch 28 IF_ICMPNE L262 - true
   * 31 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I323 Branch 30 IF_ICMPNE L266 - true
   * 32 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I353 Branch 32 IF_ICMPNE L270 - false
   * 33 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I360 Branch 33 IFEQ L270 - true
   * 34 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I369 Branch 34 IFEQ L270 - true
   * 35 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I377 Branch 35 IFEQ L270 - false
   */

  @Test
  public void test11()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(false, false, true, false, true, true, false, true, true, false);
      centralizedControl__Basic0.event_REQ(false, false, false, true, false, false, false, false, false, false);
      centralizedControl__Basic0.event_REQ(true, true, false, true, false, true, true, false, false, true);
      centralizedControl__Basic0.event_REQ(true, false, true, false, false, true, false, false, true, true);
      centralizedControl__Basic0.event_REQ(false, false, false, true, true, false, true, true, true, true);
      centralizedControl__Basic0.event_REQ(true, true, true, true, true, false, true, true, false, true);
  }

  //Test case number: 12
  /*
   * 38 covered goals:
   * 1 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_0()V: root-Branch
   * 2 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_9()V: root-Branch
   * 3 fb.rt.pnp.CentralizedControl__Basic.event_REQ(ZZZZZZZZZZ)V: root-Branch
   * 4 fb.rt.pnp.CentralizedControl__Basic.event_INIT()V: root-Branch
   * 5 fb.rt.pnp.CentralizedControl__Basic.<init>()V: root-Branch
   * 6 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_1()V: root-Branch
   * 7 fb.rt.pnp.CentralizedControl__Basic.transition_CentralizedControl_6()V: root-Branch
   * 8 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.alg_extend1and2()V: root-Branch
   * 9 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.state_Piece3()V: root-Branch
   * 10 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.<init>(Lfb/rt/pnp/CentralizedControl__Basic;)V: root-Branch
   * 11 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.alg_Wait()V: root-Branch
   * 12 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.alg_INIT()V: root-Branch
   * 13 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.alg_extendvc()V: root-Branch
   * 14 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.state_INIT()V: root-Branch
   * 15 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.state_GoDown()V: root-Branch
   * 16 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.state_Wait()V: root-Branch
   * 17 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I5 Branch 4 IF_ICMPNE L222 - true
   * 18 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I35 Branch 6 IF_ICMPNE L226 - true
   * 19 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I65 Branch 8 IF_ICMPNE L230 - true
   * 20 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I65 Branch 8 IF_ICMPNE L230 - false
   * 21 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I73 Branch 9 IFEQ L230 - true
   * 22 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I91 Branch 10 IF_ICMPNE L234 - true
   * 23 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I91 Branch 10 IF_ICMPNE L234 - false
   * 24 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I95 Branch 11 IFEQ L234 - true
   * 25 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I109 Branch 12 IFEQ L234 - true
   * 26 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I127 Branch 13 IF_ICMPNE L238 - true
   * 27 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I127 Branch 13 IF_ICMPNE L238 - false
   * 28 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I131 Branch 14 IFEQ L238 - true
   * 29 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I140 Branch 15 IFEQ L238 - true
   * 30 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I155 Branch 16 IFEQ L238 - false
   * 31 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I173 Branch 17 IF_ICMPNE L242 - true
   * 32 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I195 Branch 19 IF_ICMPNE L246 - true
   * 33 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I217 Branch 21 IF_ICMPNE L250 - false
   * 34 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_REQ()V: I225 Branch 22 IFEQ L250 - false
   * 35 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.service_INIT()V: I4 Branch 3 IFNE L214 - false
   * 36 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L208 - true
   * 37 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L208 - false
   * 38 fb.rt.pnp.CentralizedControl__Basic$CentralizedControl.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 2 IF_ACMPNE L209 - false
   */

  @Test
  public void test12()  throws Throwable  {
      CentralizedControl__Basic centralizedControl__Basic0 = new CentralizedControl__Basic();
      centralizedControl__Basic0.event_INIT();
      centralizedControl__Basic0.event_REQ(false, false, false, false, true, false, false, false, true, false);
      centralizedControl__Basic0.event_REQ(true, true, true, true, false, false, false, false, true, true);
  }
}
