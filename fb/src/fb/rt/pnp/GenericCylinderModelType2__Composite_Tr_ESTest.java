/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 10:12:29 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.GenericCylinderModelType2__Composite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class GenericCylinderModelType2__Composite_Tr_ESTest {

  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_12()V: root-Branch
   * 2 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_10()V: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT(2003, 2003, true, 2003, 2003, 2003, 2003, (float) 2003, 2003, 2003, true, 2003, 2003);
      genericCylinderModelType2__Composite0.event_FAULT();
      genericCylinderModelType2__Composite0.event_RESUME();
      genericCylinderModelType2__Composite0.event_FAULT();
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_5()V: root-Branch
   * 2 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_8()V: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT(1321, 1321, true, 1321, 1321, 1321, 1321, (float) 1321, 1321, 1321, true, 1321, 1321);
      genericCylinderModelType2__Composite0.event_CYL_IND(true);
      genericCylinderModelType2__Composite0.event_CLK(1321, true);
      genericCylinderModelType2__Composite0.event_CYL_IND(false);
      genericCylinderModelType2__Composite0.event_CLK(0, true);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_8()V: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT((-1855), (-1855), false, (-1855), (-1855), (-1855), (-1855), (float) (-1855), (-1855), (-1855), false, (-1855), (-1855));
      genericCylinderModelType2__Composite0.event_CYL_IND(false);
      genericCylinderModelType2__Composite0.event_CYL_IND(false);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_10()V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT(0, 0, true, 0, 0, 0, 0, (float) 0, 0, 0, true, 0, 0);
      genericCylinderModelType2__Composite0.event_CYL_IND(true);
      genericCylinderModelType2__Composite0.event_CLK(0, true);
      genericCylinderModelType2__Composite0.event_CLK(0, true);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_4()V: root-Branch
   * 2 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_3()V: root-Branch
   * 3 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_11()V: root-Branch
   * 4 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_5()V: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT(2003, 2003, true, 2003, 2003, 2003, 2003, (float) 2003, 2003, 2003, true, 2003, 2003);
      genericCylinderModelType2__Composite0.event_CYL_IND(false);
      genericCylinderModelType2__Composite0.event_CLK(2003, true);
      genericCylinderModelType2__Composite0.event_FAULT();
      genericCylinderModelType2__Composite0.event_RESUME();
      genericCylinderModelType2__Composite0.event_CLK(2003, false);
      genericCylinderModelType2__Composite0.event_CYL_IND(true);
      genericCylinderModelType2__Composite0.event_CLK(2003, false);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_9()V: root-Branch
   * 2 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_6()V: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT((-1855), (-1855), false, (-1855), (-1855), (-1855), (-1855), (float) (-1855), (-1855), (-1855), false, (-1855), (-1855));
      genericCylinderModelType2__Composite0.event_CYL_IND(false);
      genericCylinderModelType2__Composite0.event_CLK((-1855), true);
      genericCylinderModelType2__Composite0.event_CYL_IND(true);
      genericCylinderModelType2__Composite0.event_CLK((-1855), true);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_7()V: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT((-2120), (-2120), false, (-2120), (-2120), (-2120), (-2120), (float) (-2120), (-2120), (-2120), false, (-2120), (-2120));
      genericCylinderModelType2__Composite0.event_CYL_IND(false);
      genericCylinderModelType2__Composite0.event_CLK((-2120), false);
      genericCylinderModelType2__Composite0.event_CLK((-2120), false);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_7()V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT(0, 0, true, 0, 0, 0, 0, (float) 0, 0, 0, true, 0, 0);
      genericCylinderModelType2__Composite0.event_CYL_IND(true);
      genericCylinderModelType2__Composite0.event_CYL_IND(true);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_13()V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT(7, 7, true, 7, 7, 7, 7, (float) 7, 7, 7, true, 7, 7);
      genericCylinderModelType2__Composite0.event_CYL_IND(true);
      genericCylinderModelType2__Composite0.event_CLK(7, true);
      genericCylinderModelType2__Composite0.event_CLK(7, true);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_11()V: root-Branch
   * 2 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_12()V: root-Branch
   * 3 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_2()V: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT((-358), (-358), false, (-358), (-358), (-1912), (-358), 737.872F, (-358), (-1912), false, (-358), (-358));
      genericCylinderModelType2__Composite0.event_CYL_IND(false);
      genericCylinderModelType2__Composite0.event_CLK((-358), false);
      genericCylinderModelType2__Composite0.event_CLK((-358), false);
  }

  //Test case number: 10
  /*
   * 14 covered goals:
   * 1 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_2()V: root-Branch
   * 2 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_1()V: root-Branch
   * 3 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_0()V: root-Branch
   * 4 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_6()V: root-Branch
   * 5 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_PnPSensor_1()V: root-Branch
   * 6 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_PnPSensor_3()V: root-Branch
   * 7 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_9()V: root-Branch
   * 8 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_13()V: root-Branch
   * 9 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_0()V: root-Branch
   * 10 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_1()V: root-Branch
   * 11 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_LinearMotionLoad_3()V: root-Branch
   * 12 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_PnPSensor_0()V: root-Branch
   * 13 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_PnPSensor_2()V: root-Branch
   * 14 fb.rt.pnp.GenericCylinderModelType2__Composite.transition_MovementBlockType2_4()V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      GenericCylinderModelType2__Composite genericCylinderModelType2__Composite0 = new GenericCylinderModelType2__Composite();
      genericCylinderModelType2__Composite0.event_INIT(2005, 0, true, 0, 0, 0, 2005, (float) 2005, 0, 2005, true, 2005, 0);
      genericCylinderModelType2__Composite0.event_CYL_IND(true);
      genericCylinderModelType2__Composite0.event_CLK(2005, true);
      genericCylinderModelType2__Composite0.event_FAULT();
      genericCylinderModelType2__Composite0.event_CLK(0, false);
      genericCylinderModelType2__Composite0.event_RESUME();
      genericCylinderModelType2__Composite0.event_CYL_IND(false);
      genericCylinderModelType2__Composite0.event_CLK(2005, true);
  }
}
