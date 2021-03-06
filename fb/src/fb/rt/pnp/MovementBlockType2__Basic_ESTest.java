/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 06 22:55:57 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.MovementBlockType2__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class MovementBlockType2__Basic_ESTest {

  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_RESUME()V: I5 Branch 26 IF_ICMPNE L201 - true
   */

  @Test
  public void test00()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_RESUME();
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_FAULT()V: I59 Branch 25 IF_ICMPNE L193 - true
   */

  @Test
  public void test01()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_FAULT();
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I159 Branch 20 IF_ICMPNE L173 - true
   */

  @Test
  public void test02()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_CLK(false);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_INIT()V: I4 Branch 5 IFNE L137 - true
   */

  @Test
  public void test03()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_INIT(true);
      movementBlockType2__Basic0.event_INIT(false);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_9()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_FAULT()V: I5 Branch 22 IF_ICMPNE L181 - false
   */

  @Test
  public void test04()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_INIT(false);
      movementBlockType2__Basic0.event_CLK(true);
      movementBlockType2__Basic0.event_FAULT();
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_3()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I53 Branch 11 IFEQ L153 - false
   */

  @Test
  public void test05()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_INIT(true);
      movementBlockType2__Basic0.event_FAULT();
      movementBlockType2__Basic0.event_RESUME();
      movementBlockType2__Basic0.event_CLK(true);
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * 1 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_4()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I49 Branch 10 IF_ICMPNE L153 - false
   * 3 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I53 Branch 11 IFEQ L153 - true
   * 4 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I71 Branch 12 IF_ICMPNE L157 - false
   * 5 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I75 Branch 13 IFNE L157 - false
   */

  @Test
  public void test06()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_INIT(false);
      movementBlockType2__Basic0.event_FAULT();
      movementBlockType2__Basic0.event_RESUME();
      movementBlockType2__Basic0.event_CLK(false);
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * 1 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_7()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I97 Branch 15 IFNE L161 - true
   * 3 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I115 Branch 16 IF_ICMPNE L165 - true
   * 4 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I137 Branch 18 IF_ICMPNE L169 - false
   * 5 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I141 Branch 19 IFEQ L169 - false
   */

  @Test
  public void test07()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_INIT(true);
      movementBlockType2__Basic0.event_CLK(true);
      movementBlockType2__Basic0.event_CLK(true);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_6()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I119 Branch 17 IFEQ L165 - false
   */

  @Test
  public void test08()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_INIT(false);
      movementBlockType2__Basic0.event_CLK(false);
      movementBlockType2__Basic0.event_CLK(true);
  }

  //Test case number: 9
  /*
   * 11 covered goals:
   * 1 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_10()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_13()V: root-Branch
   * 3 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_12()V: root-Branch
   * 4 fb.rt.pnp.MovementBlockType2__Basic.event_RESUME()V: root-Branch
   * 5 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.state_STOP()V: root-Branch
   * 6 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_FAULT()V: I23 Branch 23 IF_ICMPNE L185 - false
   * 7 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_FAULT()V: I41 Branch 24 IF_ICMPNE L189 - true
   * 8 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_FAULT()V: I59 Branch 25 IF_ICMPNE L193 - false
   * 9 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_RESUME()V: I5 Branch 26 IF_ICMPNE L201 - false
   * 10 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.serviceEvent(Lfb/rt/EventServer;)V: I23 Branch 3 IF_ACMPNE L131 - true
   * 11 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.serviceEvent(Lfb/rt/EventServer;)V: I32 Branch 4 IF_ACMPNE L132 - false
   */

  @Test
  public void test09()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_INIT(false);
      movementBlockType2__Basic0.event_FAULT();
      movementBlockType2__Basic0.event_RESUME();
      movementBlockType2__Basic0.event_FAULT();
  }

  //Test case number: 10
  /*
   * 7 covered goals:
   * 1 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_8()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I93 Branch 14 IF_ICMPNE L161 - true
   * 3 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I115 Branch 16 IF_ICMPNE L165 - false
   * 4 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I119 Branch 17 IFEQ L165 - true
   * 5 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I137 Branch 18 IF_ICMPNE L169 - true
   * 6 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I159 Branch 20 IF_ICMPNE L173 - false
   * 7 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I163 Branch 21 IFNE L173 - false
   */

  @Test
  public void test10()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_INIT(false);
      movementBlockType2__Basic0.event_CLK(false);
      movementBlockType2__Basic0.event_CLK(false);
  }

  //Test case number: 11
  /*
   * 11 covered goals:
   * 1 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_5()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_1()V: root-Branch
   * 3 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.state_MOVE_FWD()V: root-Branch
   * 4 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.alg_FWD()V: root-Branch
   * 5 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I5 Branch 6 IF_ICMPNE L145 - true
   * 6 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I9 Branch 7 IFEQ L145 - false
   * 7 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I27 Branch 8 IF_ICMPNE L149 - true
   * 8 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I49 Branch 10 IF_ICMPNE L153 - true
   * 9 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I71 Branch 12 IF_ICMPNE L157 - true
   * 10 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I93 Branch 14 IF_ICMPNE L161 - false
   * 11 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I97 Branch 15 IFNE L161 - false
   */

  @Test
  public void test11()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_INIT(true);
      movementBlockType2__Basic0.event_CLK(true);
      movementBlockType2__Basic0.event_CLK(false);
  }

  //Test case number: 12
  /*
   * 27 covered goals:
   * 1 fb.rt.pnp.MovementBlockType2__Basic.<init>()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_11()V: root-Branch
   * 3 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_2()V: root-Branch
   * 4 fb.rt.pnp.MovementBlockType2__Basic.event_INIT(Z)V: root-Branch
   * 5 fb.rt.pnp.MovementBlockType2__Basic.event_FAULT()V: root-Branch
   * 6 fb.rt.pnp.MovementBlockType2__Basic.transition_MovementBlockType2_0()V: root-Branch
   * 7 fb.rt.pnp.MovementBlockType2__Basic.event_CLK(Z)V: root-Branch
   * 8 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.<init>(Lfb/rt/pnp/MovementBlockType2__Basic;)V: root-Branch
   * 9 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.state_MOVE_BWD()V: root-Branch
   * 10 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.alg_INIT()V: root-Branch
   * 11 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.alg_STOP()V: root-Branch
   * 12 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.state_INIT()V: root-Branch
   * 13 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.state_FAILURE()V: root-Branch
   * 14 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.alg_BWD()V: root-Branch
   * 15 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I5 Branch 6 IF_ICMPNE L145 - false
   * 16 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I9 Branch 7 IFEQ L145 - true
   * 17 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I27 Branch 8 IF_ICMPNE L149 - false
   * 18 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_CLK()V: I31 Branch 9 IFNE L149 - false
   * 19 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_INIT()V: I4 Branch 5 IFNE L137 - false
   * 20 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_FAULT()V: I5 Branch 22 IF_ICMPNE L181 - true
   * 21 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_FAULT()V: I23 Branch 23 IF_ICMPNE L185 - true
   * 22 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.service_FAULT()V: I41 Branch 24 IF_ICMPNE L189 - false
   * 23 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L129 - true
   * 24 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 1 IF_ACMPNE L129 - false
   * 25 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 2 IF_ACMPNE L130 - true
   * 26 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 2 IF_ACMPNE L130 - false
   * 27 fb.rt.pnp.MovementBlockType2__Basic$MovementBlockType2.serviceEvent(Lfb/rt/EventServer;)V: I23 Branch 3 IF_ACMPNE L131 - false
   */

  @Test
  public void test12()  throws Throwable  {
      MovementBlockType2__Basic movementBlockType2__Basic0 = new MovementBlockType2__Basic();
      movementBlockType2__Basic0.event_INIT(true);
      movementBlockType2__Basic0.event_CLK(false);
      movementBlockType2__Basic0.event_FAULT();
  }
}
