/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 05:17:37 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.WPsensor__Composite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class WPsensor__Composite_ESTest {

  //Test case number: 0
  /*
   * 27 covered goals:
   * 1 fb.rt.pnp.WPsensor__Composite$OR.state_REQ()V: root-Branch
   * 2 fb.rt.pnp.WPsensor__Composite$OR.alg_REQ()V: root-Branch
   * 3 fb.rt.pnp.WPsensor__Composite$OR.service_REQ()V: I4 Branch 30 IFNE L739 - false
   * 4 fb.rt.pnp.WPsensor__Composite$OR.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 27 IF_ACMPNE L725 - true
   * 5 fb.rt.pnp.WPsensor__Composite$OR.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 28 IF_ACMPNE L726 - false
   * 6 fb.rt.pnp.WPsensor__Composite.transition_my_sensor_1()V: root-Branch
   * 7 fb.rt.pnp.WPsensor__Composite.transition_AND_1()V: root-Branch
   * 8 fb.rt.pnp.WPsensor__Composite.transition_AND_3()V: root-Branch
   * 9 fb.rt.pnp.WPsensor__Composite.transition_OR_3()V: root-Branch
   * 10 fb.rt.pnp.WPsensor__Composite.transition_OR_1()V: root-Branch
   * 11 fb.rt.pnp.WPsensor__Composite.event_REQ(IIIIII)V: root-Branch
   * 12 fb.rt.pnp.WPsensor__Composite.transition_my_sensor_3()V: root-Branch
   * 13 fb.rt.pnp.WPsensor__Composite$my_sensor.state_REQ()V: root-Branch
   * 14 fb.rt.pnp.WPsensor__Composite$my_sensor.alg_REQ()V: I12 Branch 13 IF_ICMPLT L451 - true
   * 15 fb.rt.pnp.WPsensor__Composite$my_sensor.alg_REQ()V: I12 Branch 13 IF_ICMPLT L451 - false
   * 16 fb.rt.pnp.WPsensor__Composite$my_sensor.alg_REQ()V: I28 Branch 14 IF_ICMPGT L451 - true
   * 17 fb.rt.pnp.WPsensor__Composite$my_sensor.alg_REQ()V: I28 Branch 14 IF_ICMPGT L451 - false
   * 18 fb.rt.pnp.WPsensor__Composite$my_sensor.alg_REQ()V: I35 Branch 15 IFEQ L451 - true
   * 19 fb.rt.pnp.WPsensor__Composite$my_sensor.alg_REQ()V: I35 Branch 15 IFEQ L451 - false
   * 20 fb.rt.pnp.WPsensor__Composite$my_sensor.service_REQ()V: I4 Branch 12 IFNE L438 - false
   * 21 fb.rt.pnp.WPsensor__Composite$my_sensor.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 9 IF_ACMPNE L424 - true
   * 22 fb.rt.pnp.WPsensor__Composite$my_sensor.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 10 IF_ACMPNE L425 - false
   * 23 fb.rt.pnp.WPsensor__Composite$AND.state_REQ()V: root-Branch
   * 24 fb.rt.pnp.WPsensor__Composite$AND.alg_REQ()V: root-Branch
   * 25 fb.rt.pnp.WPsensor__Composite$AND.service_REQ()V: I4 Branch 22 IFNE L586 - false
   * 26 fb.rt.pnp.WPsensor__Composite$AND.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 19 IF_ACMPNE L572 - true
   * 27 fb.rt.pnp.WPsensor__Composite$AND.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 20 IF_ACMPNE L573 - false
   */

  @Test
  public void test0()  throws Throwable  {
      WPsensor__Composite wPsensor__Composite0 = new WPsensor__Composite();
      wPsensor__Composite0.event_REQ(452, 452, 452, 452, 452, 452);
  }

  //Test case number: 1
  /*
   * 56 covered goals:
   * 1 fb.rt.pnp.WPsensor__Composite$my_sensor2.connect_In1(Lfb/datatype/UINT;)V: root-Branch
   * 2 fb.rt.pnp.WPsensor__Composite$my_sensor2.<init>(Lfb/rt/pnp/WPsensor__Composite;)V: root-Branch
   * 3 fb.rt.pnp.WPsensor__Composite$my_sensor2.connect_In2(Lfb/datatype/UINT;)V: root-Branch
   * 4 fb.rt.pnp.WPsensor__Composite$my_sensor2.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 1 IFLE L240 - false
   * 5 fb.rt.pnp.WPsensor__Composite$my_sensor2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 2 IFLE L249 - true
   * 6 fb.rt.pnp.WPsensor__Composite$my_sensor2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 2 IFLE L249 - false
   * 7 fb.rt.pnp.WPsensor__Composite$my_sensor2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 3 IFLE L250 - true
   * 8 fb.rt.pnp.WPsensor__Composite$my_sensor2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 4 IFLE L251 - false
   * 9 fb.rt.pnp.WPsensor__Composite$OR.connect_i1(Lfb/datatype/BOOL;)V: root-Branch
   * 10 fb.rt.pnp.WPsensor__Composite$OR.state_START()V: root-Branch
   * 11 fb.rt.pnp.WPsensor__Composite$OR.state_INIT()V: root-Branch
   * 12 fb.rt.pnp.WPsensor__Composite$OR.connect_i3(Lfb/datatype/BOOL;)V: root-Branch
   * 13 fb.rt.pnp.WPsensor__Composite$OR.connect_i2(Lfb/datatype/BOOL;)V: root-Branch
   * 14 fb.rt.pnp.WPsensor__Composite$OR.<init>(Lfb/rt/pnp/WPsensor__Composite;)V: root-Branch
   * 15 fb.rt.pnp.WPsensor__Composite$OR.alg_INIT()V: root-Branch
   * 16 fb.rt.pnp.WPsensor__Composite$OR.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 23 IFLE L661 - false
   * 17 fb.rt.pnp.WPsensor__Composite$OR.service_INIT()V: I4 Branch 29 IFNE L731 - false
   * 18 fb.rt.pnp.WPsensor__Composite$OR.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 24 IFLE L670 - true
   * 19 fb.rt.pnp.WPsensor__Composite$OR.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 24 IFLE L670 - false
   * 20 fb.rt.pnp.WPsensor__Composite$OR.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 25 IFLE L671 - true
   * 21 fb.rt.pnp.WPsensor__Composite$OR.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 25 IFLE L671 - false
   * 22 fb.rt.pnp.WPsensor__Composite$OR.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 26 IFLE L672 - false
   * 23 fb.rt.pnp.WPsensor__Composite$OR.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 27 IF_ACMPNE L725 - false
   * 24 fb.rt.pnp.WPsensor__Composite.event_INIT(IIIIII)V: root-Branch
   * 25 fb.rt.pnp.WPsensor__Composite.transition_my_sensor_0()V: root-Branch
   * 26 fb.rt.pnp.WPsensor__Composite.transition_AND_0()V: root-Branch
   * 27 fb.rt.pnp.WPsensor__Composite.transition_AND_2()V: root-Branch
   * 28 fb.rt.pnp.WPsensor__Composite.<init>()V: root-Branch
   * 29 fb.rt.pnp.WPsensor__Composite.transition_OR_2()V: root-Branch
   * 30 fb.rt.pnp.WPsensor__Composite.transition_OR_0()V: root-Branch
   * 31 fb.rt.pnp.WPsensor__Composite.transition_my_sensor_2()V: root-Branch
   * 32 fb.rt.pnp.WPsensor__Composite$my_sensor.state_INIT()V: root-Branch
   * 33 fb.rt.pnp.WPsensor__Composite$my_sensor.<init>(Lfb/rt/pnp/WPsensor__Composite;)V: root-Branch
   * 34 fb.rt.pnp.WPsensor__Composite$my_sensor.connect_ZONE(Lfb/datatype/ARRAY;)V: root-Branch
   * 35 fb.rt.pnp.WPsensor__Composite$my_sensor.connect_POS(Lfb/datatype/UINT;)V: root-Branch
   * 36 fb.rt.pnp.WPsensor__Composite$my_sensor.state_START()V: root-Branch
   * 37 fb.rt.pnp.WPsensor__Composite$my_sensor.alg_INIT()V: root-Branch
   * 38 fb.rt.pnp.WPsensor__Composite$my_sensor.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 6 IFLE L368 - false
   * 39 fb.rt.pnp.WPsensor__Composite$my_sensor.service_INIT()V: I4 Branch 11 IFNE L430 - false
   * 40 fb.rt.pnp.WPsensor__Composite$my_sensor.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 7 IFLE L377 - true
   * 41 fb.rt.pnp.WPsensor__Composite$my_sensor.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 7 IFLE L377 - false
   * 42 fb.rt.pnp.WPsensor__Composite$my_sensor.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 8 IFLE L378 - false
   * 43 fb.rt.pnp.WPsensor__Composite$my_sensor.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 9 IF_ACMPNE L424 - false
   * 44 fb.rt.pnp.WPsensor__Composite$AND.alg_INIT()V: root-Branch
   * 45 fb.rt.pnp.WPsensor__Composite$AND.state_START()V: root-Branch
   * 46 fb.rt.pnp.WPsensor__Composite$AND.state_INIT()V: root-Branch
   * 47 fb.rt.pnp.WPsensor__Composite$AND.<init>(Lfb/rt/pnp/WPsensor__Composite;)V: root-Branch
   * 48 fb.rt.pnp.WPsensor__Composite$AND.connect_Q1(Lfb/datatype/BOOL;)V: root-Branch
   * 49 fb.rt.pnp.WPsensor__Composite$AND.connect_Q2(Lfb/datatype/BOOL;)V: root-Branch
   * 50 fb.rt.pnp.WPsensor__Composite$AND.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 16 IFLE L516 - false
   * 51 fb.rt.pnp.WPsensor__Composite$AND.service_INIT()V: I4 Branch 21 IFNE L578 - false
   * 52 fb.rt.pnp.WPsensor__Composite$AND.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 17 IFLE L525 - true
   * 53 fb.rt.pnp.WPsensor__Composite$AND.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 17 IFLE L525 - false
   * 54 fb.rt.pnp.WPsensor__Composite$AND.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 18 IFLE L526 - false
   * 55 fb.rt.pnp.WPsensor__Composite$AND.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 19 IF_ACMPNE L572 - false
   * 56 fb.rt.pnp.WPsensor__Composite$WPsensor.<init>(Lfb/rt/pnp/WPsensor__Composite;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      WPsensor__Composite wPsensor__Composite0 = new WPsensor__Composite();
      wPsensor__Composite0.event_INIT(452, 452, 452, 452, 452, 452);
  }
}
