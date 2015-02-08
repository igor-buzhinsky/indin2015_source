/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 12:34:18 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.Model__Composite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class Model__Composite_Tr_ESTest {

  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_11()V: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT(46, (-11));
      model__Composite0.event_CYL_IND(true, true, true, false, false, false, false);
      model__Composite0.event_CLK(46, 46, (-11));
      model__Composite0.event_CYL_IND(true, false, false, true, true, true, true);
      model__Composite0.event_CLK((-2412), (-11), (-13));
      model__Composite0.event_CLK(81, (-13), (-11));
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_14()V: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT((-4357), (-4357));
      model__Composite0.event_CYL_IND(true, false, true, false, false, false, false);
      model__Composite0.event_CYL_IND(true, false, false, false, false, true, true);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_MovementBlockType2_9()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_18()V: root-Branch
   * 3 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_10()V: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT(0, 0);
      model__Composite0.event_CYL_IND(false, false, false, false, true, false, true);
      model__Composite0.event_CYL_IND(true, true, false, false, true, true, false);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_10()V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT(46, (-11));
      model__Composite0.event_CYL_IND(true, true, true, false, false, false, false);
      model__Composite0.event_CLK(46, 46, (-11));
      model__Composite0.event_CLK(46, 46, (-13));
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_11()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_4()V: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_REMOVE_WP();
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_13()V: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT(1745, 1745);
      model__Composite0.event_CYL_IND(true, true, true, false, true, true, true);
      model__Composite0.event_CLK(700, 700, 700);
      model__Composite0.event_CLK(700, 700, (-1233));
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_19()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_PnPVacuum_3()V: root-Branch
   * 3 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_13()V: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT(1724, 3794);
      model__Composite0.event_CYL_IND(false, true, false, true, false, true, false);
      model__Composite0.event_CYL_IND(true, true, true, true, false, true, true);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_1()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_8()V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_REQ(true, true, false);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_9()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_3()V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_ADD_WP((-4336), (-4336));
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_4()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_6()V: root-Branch
   * 3 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_15()V: root-Branch
   * 4 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_7()V: root-Branch
   * 5 fb.rt.pnp.Model__Composite.transition_PnPVacuum_2()V: root-Branch
   * 6 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_3()V: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT(1724, 3794);
      model__Composite0.event_CYL_IND(true, false, false, false, false, false, false);
      model__Composite0.event_CLK(1724, 1724, 3);
      model__Composite0.event_CYL_IND(false, false, false, true, true, false, true);
      model__Composite0.event_CLK(3, 3571, 3571);
      model__Composite0.event_CYL_IND(false, true, false, true, false, true, false);
      model__Composite0.event_CLK(1724, 3794, 1724);
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_10()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_5()V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_ADD_WP00();
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_12()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_MovementBlockType2_11()V: root-Branch
   * 3 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_17()V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT(0, 0);
      model__Composite0.event_CYL_IND(true, false, true, false, false, true, true);
      model__Composite0.event_CYL_IND(true, true, true, true, true, false, true);
  }

  //Test case number: 12
  /*
   * 4 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_9()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_MovementBlockType2_6()V: root-Branch
   * 3 fb.rt.pnp.Model__Composite.transition_MovementBlockType2_2()V: root-Branch
   * 4 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_9()V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT(46, (-11));
      model__Composite0.event_CYL_IND(true, true, true, false, false, false, false);
      model__Composite0.event_CLK(46, 46, (-11));
      model__Composite0.event_CYL_IND(true, false, false, true, true, true, true);
      model__Composite0.event_CLK((-2412), (-11), (-13));
      model__Composite0.event_CYL_IND(false, false, true, false, false, false, false);
      model__Composite0.event_CLK(0, 100, 46);
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_PnPVacuum_4()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_MovementBlockType2_12()V: root-Branch
   * 3 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_2()V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT(0, 0);
      model__Composite0.event_CYL_IND(false, false, true, true, false, true, false);
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_MovementBlockType2_7()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_8()V: root-Branch
   * 3 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_11()V: root-Branch
   * 4 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_1()V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT(1724, 1724);
      model__Composite0.event_CYL_IND(true, true, true, false, true, true, true);
      model__Composite0.event_CYL_IND(false, false, false, true, true, false, true);
  }

  //Test case number: 15
  /*
   * 39 covered goals:
   * 1 fb.rt.pnp.Model__Composite.transition_my_sensor_2()V: root-Branch
   * 2 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_5()V: root-Branch
   * 3 fb.rt.pnp.Model__Composite.transition_PnPSensor_2()V: root-Branch
   * 4 fb.rt.pnp.Model__Composite.transition_AND_1()V: root-Branch
   * 5 fb.rt.pnp.Model__Composite.transition_OR_3()V: root-Branch
   * 6 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_6()V: root-Branch
   * 7 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_2()V: root-Branch
   * 8 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_0()V: root-Branch
   * 9 fb.rt.pnp.Model__Composite.transition_PnPVacuum_0()V: root-Branch
   * 10 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_16()V: root-Branch
   * 11 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_12()V: root-Branch
   * 12 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_1()V: root-Branch
   * 13 fb.rt.pnp.Model__Composite.transition_my_sensor_3()V: root-Branch
   * 14 fb.rt.pnp.Model__Composite.transition_PnPSensor_3()V: root-Branch
   * 15 fb.rt.pnp.Model__Composite.transition_AND_2()V: root-Branch
   * 16 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_3()V: root-Branch
   * 17 fb.rt.pnp.Model__Composite.transition_AND_3()V: root-Branch
   * 18 fb.rt.pnp.Model__Composite.transition_OR_0()V: root-Branch
   * 19 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_2()V: root-Branch
   * 20 fb.rt.pnp.Model__Composite.transition_my_sensor_0()V: root-Branch
   * 21 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_7()V: root-Branch
   * 22 fb.rt.pnp.Model__Composite.transition_PnPSensor_0()V: root-Branch
   * 23 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_0()V: root-Branch
   * 24 fb.rt.pnp.Model__Composite.transition_MovementBlockType2_5()V: root-Branch
   * 25 fb.rt.pnp.Model__Composite.transition_MovementBlockType2_1()V: root-Branch
   * 26 fb.rt.pnp.Model__Composite.transition_OR_1()V: root-Branch
   * 27 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_6()V: root-Branch
   * 28 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_4()V: root-Branch
   * 29 fb.rt.pnp.Model__Composite.transition_PnPSensor_1()V: root-Branch
   * 30 fb.rt.pnp.Model__Composite.transition_my_sensor_1()V: root-Branch
   * 31 fb.rt.pnp.Model__Composite.transition_AND_0()V: root-Branch
   * 32 fb.rt.pnp.Model__Composite.transition_OR_2()V: root-Branch
   * 33 fb.rt.pnp.Model__Composite.transition_PnpXYCalculator_7()V: root-Branch
   * 34 fb.rt.pnp.Model__Composite.transition_PnPVacuum_1()V: root-Branch
   * 35 fb.rt.pnp.Model__Composite.transition_MovementBlockType2_8()V: root-Branch
   * 36 fb.rt.pnp.Model__Composite.transition_MovementBlockType1_5()V: root-Branch
   * 37 fb.rt.pnp.Model__Composite.transition_MovementBlockType2_0()V: root-Branch
   * 38 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_8()V: root-Branch
   * 39 fb.rt.pnp.Model__Composite.transition_LinearMotionLoad_0()V: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      Model__Composite model__Composite0 = new Model__Composite();
      model__Composite0.event_INIT((-4336), 3794);
      model__Composite0.event_CYL_IND(false, true, false, true, true, true, true);
      model__Composite0.event_CLK(1724, 1724, 1724);
      model__Composite0.event_CYL_IND(false, false, false, false, false, false, true);
      model__Composite0.event_CLK((-2412), (-605), (-605));
      model__Composite0.event_CYL_IND(true, false, false, false, false, false, false);
      model__Composite0.event_CLK(0, (-2412), (-4336));
  }
}
