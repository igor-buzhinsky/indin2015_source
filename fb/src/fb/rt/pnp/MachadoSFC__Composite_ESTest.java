/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 06 20:43:45 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.MachadoSFC__Composite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class MachadoSFC__Composite_ESTest {

  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I171 Branch 96 IFEQ L1080 - true
   */

  @Test
  public void test0()  throws Throwable  {
      MachadoSFC__Composite machadoSFC__Composite0 = new MachadoSFC__Composite();
      machadoSFC__Composite0.event_INIT(false, false, false, true, false, true, false, false, true, false, true);
      machadoSFC__Composite0.event_INIT(true, true, true, false, true, false, false, true, true, false, true);
      machadoSFC__Composite0.event_INIT(true, true, false, false, false, true, false, false, false, false, true);
      machadoSFC__Composite0.event_INIT(true, true, true, false, false, true, true, false, true, false, false);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I76 Branch 87 IFEQ L1064 - false
   * 2 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I83 Branch 88 IFEQ L1064 - true
   * 3 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I105 Branch 90 IFEQ L1068 - true
   */

  @Test
  public void test1()  throws Throwable  {
      MachadoSFC__Composite machadoSFC__Composite0 = new MachadoSFC__Composite();
      machadoSFC__Composite0.event_INIT(true, true, true, true, true, true, true, true, true, true, true);
      machadoSFC__Composite0.event_INIT(true, true, true, true, true, true, true, true, true, false, false);
      machadoSFC__Composite0.event_REQ(true, true, true, true, true, true, false, false, true, true, false);
      machadoSFC__Composite0.event_REQ(false, true, true, false, true, false, false, true, false, true, true);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I51 Branch 85 IFEQ L1060 - true
   */

  @Test
  public void test2()  throws Throwable  {
      MachadoSFC__Composite machadoSFC__Composite0 = new MachadoSFC__Composite();
      machadoSFC__Composite0.event_INIT(false, false, false, true, false, true, false, false, true, false, true);
      machadoSFC__Composite0.event_INIT(true, false, false, false, false, false, true, false, true, false, false);
  }

  //Test case number: 3
  /*
   * 7 covered goals:
   * 1 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I120 Branch 22 IF_ICMPNE L455 - false
   * 2 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I124 Branch 23 IFNE L455 - true
   * 3 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I124 Branch 23 IFNE L455 - false
   * 4 fb.rt.pnp.MachadoSFC__Composite.transition_SFC1_6()V: root-Branch
   * 5 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_INIT()V: I4 Branch 39 IFNE L679 - true
   * 6 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I21 Branch 82 IFEQ L1056 - false
   * 7 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I29 Branch 83 IFEQ L1056 - true
   */

  @Test
  public void test3()  throws Throwable  {
      MachadoSFC__Composite machadoSFC__Composite0 = new MachadoSFC__Composite();
      machadoSFC__Composite0.event_INIT(false, false, true, true, false, false, false, false, false, false, true);
      machadoSFC__Composite0.event_REQ(false, false, false, true, false, true, true, false, true, true, false);
      machadoSFC__Composite0.event_REQ(false, false, false, false, true, true, false, true, false, false, false);
      machadoSFC__Composite0.event_INIT(true, true, true, true, true, true, false, true, false, false, true);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I80 Branch 19 IFEQ L447 - true
   */

  @Test
  public void test4()  throws Throwable  {
      MachadoSFC__Composite machadoSFC__Composite0 = new MachadoSFC__Composite();
      machadoSFC__Composite0.event_REQ(false, true, false, false, true, false, false, false, false, false, true);
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * 1 fb.rt.pnp.MachadoSFC__Composite$SFC1.state_X2()V: root-Branch
   * 2 fb.rt.pnp.MachadoSFC__Composite$SFC1.alg_X2()V: root-Branch
   * 3 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I39 Branch 15 IFEQ L443 - false
   * 4 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_INIT()V: I4 Branch 10 IFNE L431 - true
   * 5 fb.rt.pnp.MachadoSFC__Composite.transition_SFC1_3()V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      MachadoSFC__Composite machadoSFC__Composite0 = new MachadoSFC__Composite();
      machadoSFC__Composite0.event_REQ(false, false, false, true, false, true, true, false, true, true, false);
      machadoSFC__Composite0.event_INIT(false, true, true, false, false, true, true, true, true, false, false);
  }

  //Test case number: 6
  /*
   * 21 covered goals:
   * 1 fb.rt.pnp.MachadoSFC__Composite$SFC1.alg_X3()V: root-Branch
   * 2 fb.rt.pnp.MachadoSFC__Composite$SFC1.state_X3()V: root-Branch
   * 3 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I8 Branch 12 IFEQ L439 - true
   * 4 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I25 Branch 13 IFNE L443 - false
   * 5 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I32 Branch 14 IFEQ L443 - true
   * 6 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I39 Branch 15 IFEQ L443 - true
   * 7 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I56 Branch 16 IFNE L447 - false
   * 8 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I63 Branch 17 IFEQ L447 - true
   * 9 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I73 Branch 18 IFEQ L447 - true
   * 10 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I80 Branch 19 IFEQ L447 - false
   * 11 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I142 Branch 24 IF_ICMPNE L459 - false
   * 12 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I146 Branch 25 IFNE L459 - true
   * 13 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I146 Branch 25 IFNE L459 - false
   * 14 fb.rt.pnp.MachadoSFC__Composite$SFC1.alg_X4()V: I35 Branch 28 IFNE L487 - true
   * 15 fb.rt.pnp.MachadoSFC__Composite.transition_SFC1_7()V: root-Branch
   * 16 fb.rt.pnp.MachadoSFC__Composite.transition_SFC1_4()V: root-Branch
   * 17 fb.rt.pnp.MachadoSFC__Composite.transition_SFC2_3()V: root-Branch
   * 18 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I70 Branch 45 IFEQ L691 - false
   * 19 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X30()V: I40 Branch 98 IFEQ L1125 - false
   * 20 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X30()V: I49 Branch 99 IFEQ L1125 - false
   * 21 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X30()V: I57 Branch 100 IFEQ L1125 - false
   */

  @Test
  public void test6()  throws Throwable  {
      MachadoSFC__Composite machadoSFC__Composite0 = new MachadoSFC__Composite();
      machadoSFC__Composite0.event_INIT(false, false, false, true, false, false, true, false, true, true, false);
      machadoSFC__Composite0.event_REQ(true, false, false, false, false, false, true, false, false, true, false);
      machadoSFC__Composite0.event_REQ(false, true, false, true, false, false, false, true, true, false, false);
  }

  //Test case number: 7
  /*
   * 28 covered goals:
   * 1 fb.rt.pnp.MachadoSFC__Composite$SFC1.alg_X4()V: I11 Branch 26 IFNE L481 - true
   * 2 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_7()V: root-Branch
   * 3 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_5()V: root-Branch
   * 4 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_9()V: root-Branch
   * 5 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_4()V: root-Branch
   * 6 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_6()V: root-Branch
   * 7 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X38()V: root-Branch
   * 8 fb.rt.pnp.MachadoSFC__Composite$SFC4.state_X35()V: root-Branch
   * 9 fb.rt.pnp.MachadoSFC__Composite$SFC4.state_X37()V: root-Branch
   * 10 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X3334()V: root-Branch
   * 11 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X37()V: root-Branch
   * 12 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X35()V: root-Branch
   * 13 fb.rt.pnp.MachadoSFC__Composite$SFC4.state_X38()V: root-Branch
   * 14 fb.rt.pnp.MachadoSFC__Composite$SFC4.state_X3334()V: root-Branch
   * 15 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I12 Branch 81 IFEQ L1056 - true
   * 16 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I47 Branch 84 IF_ICMPNE L1060 - false
   * 17 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I51 Branch 85 IFEQ L1060 - false
   * 18 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I69 Branch 86 IF_ICMPNE L1064 - false
   * 19 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I76 Branch 87 IFEQ L1064 - true
   * 20 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I83 Branch 88 IFEQ L1064 - false
   * 21 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I101 Branch 89 IF_ICMPNE L1068 - false
   * 22 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I105 Branch 90 IFEQ L1068 - false
   * 23 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I123 Branch 91 IF_ICMPNE L1072 - false
   * 24 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I127 Branch 92 IFNE L1072 - true
   * 25 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I127 Branch 92 IFNE L1072 - false
   * 26 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I167 Branch 95 IF_ICMPNE L1080 - false
   * 27 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I171 Branch 96 IFEQ L1080 - false
   * 28 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_INIT()V: I4 Branch 79 IFNE L1048 - true
   */

  @Test
  public void test7()  throws Throwable  {
      MachadoSFC__Composite machadoSFC__Composite0 = new MachadoSFC__Composite();
      machadoSFC__Composite0.event_INIT(false, false, false, true, false, true, false, false, true, false, true);
      machadoSFC__Composite0.event_INIT(true, true, true, false, true, false, false, true, true, false, true);
      machadoSFC__Composite0.event_INIT(true, true, false, false, false, true, false, false, false, false, true);
      machadoSFC__Composite0.event_INIT(false, false, false, false, true, false, false, true, false, false, false);
  }

  //Test case number: 8
  /*
   * 55 covered goals:
   * 1 fb.rt.pnp.MachadoSFC__Composite$SFC1.alg_INIT()V: root-Branch
   * 2 fb.rt.pnp.MachadoSFC__Composite$SFC1.state_INIT()V: root-Branch
   * 3 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I98 Branch 20 IF_ICMPNE L451 - true
   * 4 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I102 Branch 21 IFNE L451 - true
   * 5 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I120 Branch 22 IF_ICMPNE L455 - true
   * 6 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I142 Branch 24 IF_ICMPNE L459 - true
   * 7 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_INIT()V: I4 Branch 10 IFNE L431 - false
   * 8 fb.rt.pnp.MachadoSFC__Composite$SFC1.alg_X4()V: I23 Branch 27 IFNE L484 - true
   * 9 fb.rt.pnp.MachadoSFC__Composite$SFC1.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 8 IF_ACMPNE L425 - false
   * 10 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_3()V: root-Branch
   * 11 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_1()V: root-Branch
   * 12 fb.rt.pnp.MachadoSFC__Composite.transition_SFC2_2()V: root-Branch
   * 13 fb.rt.pnp.MachadoSFC__Composite.transition_SFC2_0()V: root-Branch
   * 14 fb.rt.pnp.MachadoSFC__Composite.transition_SFC1_1()V: root-Branch
   * 15 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_2()V: root-Branch
   * 16 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_8()V: root-Branch
   * 17 fb.rt.pnp.MachadoSFC__Composite.transition_SFC2_1()V: root-Branch
   * 18 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_10()V: root-Branch
   * 19 fb.rt.pnp.MachadoSFC__Composite.transition_SFC4_0()V: root-Branch
   * 20 fb.rt.pnp.MachadoSFC__Composite.event_INIT(ZZZZZZZZZZZ)V: root-Branch
   * 21 fb.rt.pnp.MachadoSFC__Composite.transition_SFC1_0()V: root-Branch
   * 22 fb.rt.pnp.MachadoSFC__Composite$SFC2.alg_INIT()V: root-Branch
   * 23 fb.rt.pnp.MachadoSFC__Composite$SFC2.alg_X11()V: root-Branch
   * 24 fb.rt.pnp.MachadoSFC__Composite$SFC2.alg_X10()V: root-Branch
   * 25 fb.rt.pnp.MachadoSFC__Composite$SFC2.state_X11()V: root-Branch
   * 26 fb.rt.pnp.MachadoSFC__Composite$SFC2.state_X10()V: root-Branch
   * 27 fb.rt.pnp.MachadoSFC__Composite$SFC2.state_INIT()V: root-Branch
   * 28 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I4 Branch 40 IFNE L687 - true
   * 29 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I36 Branch 43 IFEQ L687 - false
   * 30 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I54 Branch 44 IF_ICMPNE L691 - false
   * 31 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I70 Branch 45 IFEQ L691 - true
   * 32 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_INIT()V: I4 Branch 39 IFNE L679 - false
   * 33 fb.rt.pnp.MachadoSFC__Composite$SFC2.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 37 IF_ACMPNE L673 - false
   * 34 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_INIT()V: root-Branch
   * 35 fb.rt.pnp.MachadoSFC__Composite$SFC4.state_START()V: root-Branch
   * 36 fb.rt.pnp.MachadoSFC__Composite$SFC4.state_X3136()V: root-Branch
   * 37 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X3136()V: root-Branch
   * 38 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X32()V: root-Branch
   * 39 fb.rt.pnp.MachadoSFC__Composite$SFC4.state_INIT()V: root-Branch
   * 40 fb.rt.pnp.MachadoSFC__Composite$SFC4.state_X30()V: root-Branch
   * 41 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_REQ()V: root-Branch
   * 42 fb.rt.pnp.MachadoSFC__Composite$SFC4.state_X32()V: root-Branch
   * 43 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I5 Branch 80 IF_ICMPNE L1056 - false
   * 44 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I12 Branch 81 IFEQ L1056 - false
   * 45 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I21 Branch 82 IFEQ L1056 - true
   * 46 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I29 Branch 83 IFEQ L1056 - false
   * 47 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I145 Branch 93 IF_ICMPNE L1076 - false
   * 48 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I149 Branch 94 IFEQ L1076 - true
   * 49 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I149 Branch 94 IFEQ L1076 - false
   * 50 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I189 Branch 97 IF_ICMPNE L1084 - false
   * 51 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_INIT()V: I4 Branch 79 IFNE L1048 - false
   * 52 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X30()V: I40 Branch 98 IFEQ L1125 - true
   * 53 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X30()V: I49 Branch 99 IFEQ L1125 - true
   * 54 fb.rt.pnp.MachadoSFC__Composite$SFC4.alg_X30()V: I57 Branch 100 IFEQ L1125 - true
   * 55 fb.rt.pnp.MachadoSFC__Composite$SFC4.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 77 IF_ACMPNE L1042 - false
   */

  @Test
  public void test8()  throws Throwable  {
      MachadoSFC__Composite machadoSFC__Composite0 = new MachadoSFC__Composite();
      machadoSFC__Composite0.event_INIT(false, false, false, false, false, false, false, false, true, false, false);
      machadoSFC__Composite0.event_REQ(true, false, false, true, true, true, true, true, true, true, true);
  }

  //Test case number: 9
  /*
   * 149 covered goals:
   * 1 fb.rt.pnp.MachadoSFC__Composite$MachadoSFC.<init>(Lfb/rt/pnp/MachadoSFC__Composite;)V: root-Branch
   * 2 fb.rt.pnp.MachadoSFC__Composite$SFC1.alg_X1()V: root-Branch
   * 3 fb.rt.pnp.MachadoSFC__Composite$SFC1.connect_pp3(Lfb/datatype/BOOL;)V: root-Branch
   * 4 fb.rt.pnp.MachadoSFC__Composite$SFC1.state_X1()V: root-Branch
   * 5 fb.rt.pnp.MachadoSFC__Composite$SFC1.<init>(Lfb/rt/pnp/MachadoSFC__Composite;)V: root-Branch
   * 6 fb.rt.pnp.MachadoSFC__Composite$SFC1.connect_pp1(Lfb/datatype/BOOL;)V: root-Branch
   * 7 fb.rt.pnp.MachadoSFC__Composite$SFC1.state_X4()V: root-Branch
   * 8 fb.rt.pnp.MachadoSFC__Composite$SFC1.connect_pp2(Lfb/datatype/BOOL;)V: root-Branch
   * 9 fb.rt.pnp.MachadoSFC__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 1 IFLE L346 - true
   * 10 fb.rt.pnp.MachadoSFC__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 1 IFLE L346 - false
   * 11 fb.rt.pnp.MachadoSFC__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 2 IFLE L347 - true
   * 12 fb.rt.pnp.MachadoSFC__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 2 IFLE L347 - false
   * 13 fb.rt.pnp.MachadoSFC__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 3 IFLE L348 - true
   * 14 fb.rt.pnp.MachadoSFC__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 3 IFLE L348 - false
   * 15 fb.rt.pnp.MachadoSFC__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I32 Branch 4 IFLE L349 - false
   * 16 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I4 Branch 11 IFNE L439 - true
   * 17 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I4 Branch 11 IFNE L439 - false
   * 18 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I8 Branch 12 IFEQ L439 - false
   * 19 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I25 Branch 13 IFNE L443 - true
   * 20 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I56 Branch 16 IFNE L447 - true
   * 21 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I98 Branch 20 IF_ICMPNE L451 - false
   * 22 fb.rt.pnp.MachadoSFC__Composite$SFC1.service_REQ()V: I102 Branch 21 IFNE L451 - false
   * 23 fb.rt.pnp.MachadoSFC__Composite$SFC1.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 5 IFLE L358 - true
   * 24 fb.rt.pnp.MachadoSFC__Composite$SFC1.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 5 IFLE L358 - false
   * 25 fb.rt.pnp.MachadoSFC__Composite$SFC1.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 6 IFLE L359 - true
   * 26 fb.rt.pnp.MachadoSFC__Composite$SFC1.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 6 IFLE L359 - false
   * 27 fb.rt.pnp.MachadoSFC__Composite$SFC1.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 7 IFLE L360 - false
   * 28 fb.rt.pnp.MachadoSFC__Composite$SFC1.alg_X4()V: I11 Branch 26 IFNE L481 - false
   * 29 fb.rt.pnp.MachadoSFC__Composite$SFC1.alg_X4()V: I23 Branch 27 IFNE L484 - false
   * 30 fb.rt.pnp.MachadoSFC__Composite$SFC1.alg_X4()V: I35 Branch 28 IFNE L487 - false
   * 31 fb.rt.pnp.MachadoSFC__Composite$SFC1.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 8 IF_ACMPNE L425 - true
   * 32 fb.rt.pnp.MachadoSFC__Composite$SFC1.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 9 IF_ACMPNE L426 - false
   * 33 fb.rt.pnp.MachadoSFC__Composite.<init>()V: root-Branch
   * 34 fb.rt.pnp.MachadoSFC__Composite.transition_SFC1_5()V: root-Branch
   * 35 fb.rt.pnp.MachadoSFC__Composite.event_REQ(ZZZZZZZZZZZ)V: root-Branch
   * 36 fb.rt.pnp.MachadoSFC__Composite.transition_SFC1_2()V: root-Branch
   * 37 fb.rt.pnp.MachadoSFC__Composite$SFC2.<init>(Lfb/rt/pnp/MachadoSFC__Composite;)V: root-Branch
   * 38 fb.rt.pnp.MachadoSFC__Composite$SFC2.connect_X30(Lfb/datatype/BOOL;)V: root-Branch
   * 39 fb.rt.pnp.MachadoSFC__Composite$SFC2.connect_s12(Lfb/datatype/BOOL;)V: root-Branch
   * 40 fb.rt.pnp.MachadoSFC__Composite$SFC2.connect_X12(Lfb/datatype/BOOL;)V: root-Branch
   * 41 fb.rt.pnp.MachadoSFC__Composite$SFC2.connect_X3(Lfb/datatype/BOOL;)V: root-Branch
   * 42 fb.rt.pnp.MachadoSFC__Composite$SFC2.connect_s3(Lfb/datatype/BOOL;)V: root-Branch
   * 43 fb.rt.pnp.MachadoSFC__Composite$SFC2.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 29 IFLE L591 - true
   * 44 fb.rt.pnp.MachadoSFC__Composite$SFC2.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 29 IFLE L591 - false
   * 45 fb.rt.pnp.MachadoSFC__Composite$SFC2.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 30 IFLE L592 - true
   * 46 fb.rt.pnp.MachadoSFC__Composite$SFC2.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 30 IFLE L592 - false
   * 47 fb.rt.pnp.MachadoSFC__Composite$SFC2.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 31 IFLE L593 - false
   * 48 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I4 Branch 40 IFNE L687 - false
   * 49 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I8 Branch 41 IFEQ L687 - true
   * 50 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I8 Branch 41 IFEQ L687 - false
   * 51 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I21 Branch 42 IFEQ L687 - true
   * 52 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I21 Branch 42 IFEQ L687 - false
   * 53 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I36 Branch 43 IFEQ L687 - true
   * 54 fb.rt.pnp.MachadoSFC__Composite$SFC2.service_REQ()V: I54 Branch 44 IF_ICMPNE L691 - true
   * 55 fb.rt.pnp.MachadoSFC__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 32 IFLE L602 - true
   * 56 fb.rt.pnp.MachadoSFC__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 32 IFLE L602 - false
   * 57 fb.rt.pnp.MachadoSFC__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 33 IFLE L603 - true
   * 58 fb.rt.pnp.MachadoSFC__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 33 IFLE L603 - false
   * 59 fb.rt.pnp.MachadoSFC__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 34 IFLE L604 - true
   * 60 fb.rt.pnp.MachadoSFC__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 34 IFLE L604 - false
   * 61 fb.rt.pnp.MachadoSFC__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 35 IFLE L605 - true
   * 62 fb.rt.pnp.MachadoSFC__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 35 IFLE L605 - false
   * 63 fb.rt.pnp.MachadoSFC__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I49 Branch 36 IFLE L606 - false
   * 64 fb.rt.pnp.MachadoSFC__Composite$SFC2.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 37 IF_ACMPNE L673 - true
   * 65 fb.rt.pnp.MachadoSFC__Composite$SFC2.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 38 IF_ACMPNE L674 - false
   * 66 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_X2(Lfb/datatype/BOOL;)V: root-Branch
   * 67 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_X11(Lfb/datatype/BOOL;)V: root-Branch
   * 68 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_vcd(Lfb/datatype/BOOL;)V: root-Branch
   * 69 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_s3(Lfb/datatype/BOOL;)V: root-Branch
   * 70 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_pp0(Lfb/datatype/BOOL;)V: root-Branch
   * 71 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_X21(Lfb/datatype/BOOL;)V: root-Branch
   * 72 fb.rt.pnp.MachadoSFC__Composite$SFC4.<init>(Lfb/rt/pnp/MachadoSFC__Composite;)V: root-Branch
   * 73 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_s1(Lfb/datatype/BOOL;)V: root-Branch
   * 74 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_X3(Lfb/datatype/BOOL;)V: root-Branch
   * 75 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_s2(Lfb/datatype/BOOL;)V: root-Branch
   * 76 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_X1(Lfb/datatype/BOOL;)V: root-Branch
   * 77 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_vcu(Lfb/datatype/BOOL;)V: root-Branch
   * 78 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_vacuum(Lfb/datatype/BOOL;)V: root-Branch
   * 79 fb.rt.pnp.MachadoSFC__Composite$SFC4.connect_s0(Lfb/datatype/BOOL;)V: root-Branch
   * 80 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 46 IFLE L843 - true
   * 81 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 46 IFLE L843 - false
   * 82 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 47 IFLE L844 - true
   * 83 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 47 IFLE L844 - false
   * 84 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 48 IFLE L845 - true
   * 85 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 48 IFLE L845 - false
   * 86 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I32 Branch 49 IFLE L846 - true
   * 87 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I32 Branch 49 IFLE L846 - false
   * 88 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I41 Branch 50 IFLE L847 - true
   * 89 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I41 Branch 50 IFLE L847 - false
   * 90 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I50 Branch 51 IFLE L848 - true
   * 91 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I50 Branch 51 IFLE L848 - false
   * 92 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I59 Branch 52 IFLE L849 - true
   * 93 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I59 Branch 52 IFLE L849 - false
   * 94 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I68 Branch 53 IFLE L850 - true
   * 95 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I68 Branch 53 IFLE L850 - false
   * 96 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I77 Branch 54 IFLE L851 - true
   * 97 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I77 Branch 54 IFLE L851 - false
   * 98 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I86 Branch 55 IFLE L852 - true
   * 99 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I86 Branch 55 IFLE L852 - false
   * 100 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I95 Branch 56 IFLE L853 - true
   * 101 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I95 Branch 56 IFLE L853 - false
   * 102 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I104 Branch 57 IFLE L854 - true
   * 103 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I104 Branch 57 IFLE L854 - false
   * 104 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I113 Branch 58 IFLE L855 - true
   * 105 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I113 Branch 58 IFLE L855 - false
   * 106 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I122 Branch 59 IFLE L856 - true
   * 107 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I122 Branch 59 IFLE L856 - false
   * 108 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I131 Branch 60 IFLE L857 - true
   * 109 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I131 Branch 60 IFLE L857 - false
   * 110 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I140 Branch 61 IFLE L858 - true
   * 111 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I140 Branch 61 IFLE L858 - false
   * 112 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I149 Branch 62 IFLE L859 - true
   * 113 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I149 Branch 62 IFLE L859 - false
   * 114 fb.rt.pnp.MachadoSFC__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I158 Branch 63 IFLE L860 - false
   * 115 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I5 Branch 80 IF_ICMPNE L1056 - true
   * 116 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I47 Branch 84 IF_ICMPNE L1060 - true
   * 117 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I69 Branch 86 IF_ICMPNE L1064 - true
   * 118 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I101 Branch 89 IF_ICMPNE L1068 - true
   * 119 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I123 Branch 91 IF_ICMPNE L1072 - true
   * 120 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I145 Branch 93 IF_ICMPNE L1076 - true
   * 121 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I167 Branch 95 IF_ICMPNE L1080 - true
   * 122 fb.rt.pnp.MachadoSFC__Composite$SFC4.service_REQ()V: I189 Branch 97 IF_ICMPNE L1084 - true
   * 123 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 64 IFLE L869 - true
   * 124 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 64 IFLE L869 - false
   * 125 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 65 IFLE L870 - true
   * 126 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 65 IFLE L870 - false
   * 127 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 66 IFLE L871 - true
   * 128 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 66 IFLE L871 - false
   * 129 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 67 IFLE L872 - true
   * 130 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 67 IFLE L872 - false
   * 131 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I49 Branch 68 IFLE L873 - true
   * 132 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I49 Branch 68 IFLE L873 - false
   * 133 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I60 Branch 69 IFLE L874 - true
   * 134 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I60 Branch 69 IFLE L874 - false
   * 135 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I71 Branch 70 IFLE L875 - true
   * 136 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I71 Branch 70 IFLE L875 - false
   * 137 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I82 Branch 71 IFLE L876 - true
   * 138 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I82 Branch 71 IFLE L876 - false
   * 139 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I93 Branch 72 IFLE L877 - true
   * 140 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I93 Branch 72 IFLE L877 - false
   * 141 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I104 Branch 73 IFLE L878 - true
   * 142 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I104 Branch 73 IFLE L878 - false
   * 143 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I115 Branch 74 IFLE L879 - true
   * 144 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I115 Branch 74 IFLE L879 - false
   * 145 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I126 Branch 75 IFLE L880 - true
   * 146 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I126 Branch 75 IFLE L880 - false
   * 147 fb.rt.pnp.MachadoSFC__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I137 Branch 76 IFLE L881 - false
   * 148 fb.rt.pnp.MachadoSFC__Composite$SFC4.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 77 IF_ACMPNE L1042 - true
   * 149 fb.rt.pnp.MachadoSFC__Composite$SFC4.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 78 IF_ACMPNE L1043 - false
   */

  @Test
  public void test9()  throws Throwable  {
      MachadoSFC__Composite machadoSFC__Composite0 = new MachadoSFC__Composite();
      machadoSFC__Composite0.event_REQ(false, true, false, true, false, false, false, true, true, false, false);
      machadoSFC__Composite0.event_REQ(false, true, false, false, true, false, false, false, false, false, true);
  }
}