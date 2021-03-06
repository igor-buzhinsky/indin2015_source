/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 12:44:27 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.MovementBlockType1__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class MovementBlockType1__Basic_Tr_ESTest {

  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_14()V: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(false, true);
      movementBlockType1__Basic0.event_CLK(true, false);
      movementBlockType1__Basic0.event_CLK(true, false);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_12()V: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(false, false);
      movementBlockType1__Basic0.event_CLK(true, false);
      movementBlockType1__Basic0.event_CLK(true, true);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_4()V: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(true, true);
      movementBlockType1__Basic0.event_CLK(true, false);
      movementBlockType1__Basic0.event_CLK(false, false);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_10()V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(true, true);
      movementBlockType1__Basic0.event_CLK(true, true);
      movementBlockType1__Basic0.event_RESUME();
      movementBlockType1__Basic0.event_CLK(true, true);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_16()V: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(false, true);
      movementBlockType1__Basic0.event_CLK(true, true);
      movementBlockType1__Basic0.event_RESUME();
      movementBlockType1__Basic0.event_CLK(false, false);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_8()V: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(true, false);
      movementBlockType1__Basic0.event_CLK(true, false);
      movementBlockType1__Basic0.event_CLK(false, true);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_18()V: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(true, true);
      movementBlockType1__Basic0.event_CLK(false, false);
      movementBlockType1__Basic0.event_FAULT();
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_6()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_2()V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(false, false);
      movementBlockType1__Basic0.event_CLK(false, false);
      movementBlockType1__Basic0.event_CLK(true, false);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_15()V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(true, false);
      movementBlockType1__Basic0.event_CLK(false, true);
      movementBlockType1__Basic0.event_CLK(false, true);
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_1()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_17()V: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(false, true);
      movementBlockType1__Basic0.event_CLK(true, false);
      movementBlockType1__Basic0.event_FAULT();
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_20()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_7()V: root-Branch
   * 3 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_11()V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(false, true);
      movementBlockType1__Basic0.event_CLK(true, true);
      movementBlockType1__Basic0.event_RESUME();
      movementBlockType1__Basic0.event_CLK(false, true);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_19()V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(false, true);
      movementBlockType1__Basic0.event_CLK(false, true);
      movementBlockType1__Basic0.event_FAULT();
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_5()V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(false, false);
      movementBlockType1__Basic0.event_CLK(false, true);
      movementBlockType1__Basic0.event_CLK(false, false);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_9()V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(true, true);
      movementBlockType1__Basic0.event_CLK(false, true);
      movementBlockType1__Basic0.event_CLK(true, false);
  }

  //Test case number: 14
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_13()V: root-Branch
   * 2 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_3()V: root-Branch
   * 3 fb.rt.pnp.MovementBlockType1__Basic.transition_MovementBlockType1_0()V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      MovementBlockType1__Basic movementBlockType1__Basic0 = new MovementBlockType1__Basic();
      movementBlockType1__Basic0.event_INIT(true, false);
      movementBlockType1__Basic0.event_CLK(false, true);
      movementBlockType1__Basic0.event_CLK(true, true);
  }
}
