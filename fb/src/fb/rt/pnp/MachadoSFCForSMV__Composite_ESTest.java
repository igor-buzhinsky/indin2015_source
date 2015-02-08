/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 06 21:03:53 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.MachadoSFCForSMV__Composite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class MachadoSFCForSMV__Composite_ESTest {

  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I127 Branch 92 IFNE L1021 - true
   * 2 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I171 Branch 96 IFEQ L1029 - true
   */

  @Test
  public void test0()  throws Throwable  {
      MachadoSFCForSMV__Composite machadoSFCForSMV__Composite0 = new MachadoSFCForSMV__Composite();
      machadoSFCForSMV__Composite0.event_INIT(true, true, true, true, true, true, true, true, true, true, true);
      machadoSFCForSMV__Composite0.event_INIT(true, true, true, false, true, false, false, false, true, false, true);
      machadoSFCForSMV__Composite0.event_INIT(false, true, true, true, true, true, true, true, true, true, true);
      machadoSFCForSMV__Composite0.event_INIT(false, false, false, true, false, true, false, true, true, false, false);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I76 Branch 87 IFEQ L1013 - false
   * 2 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I83 Branch 88 IFEQ L1013 - true
   * 3 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I105 Branch 90 IFEQ L1017 - true
   */

  @Test
  public void test1()  throws Throwable  {
      MachadoSFCForSMV__Composite machadoSFCForSMV__Composite0 = new MachadoSFCForSMV__Composite();
      machadoSFCForSMV__Composite0.event_INIT(true, true, true, true, true, true, true, true, true, true, true);
      machadoSFCForSMV__Composite0.event_INIT(true, true, false, true, true, false, true, true, true, true, true);
      machadoSFCForSMV__Composite0.event_INIT(true, true, true, false, true, false, false, false, true, false, true);
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * 1 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I12 Branch 81 IFEQ L1005 - false
   * 2 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I51 Branch 85 IFEQ L1009 - true
   * 3 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I102 Branch 21 IFNE L400 - false
   * 4 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_INIT()V: I4 Branch 39 IFNE L628 - true
   * 5 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC1_5()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      MachadoSFCForSMV__Composite machadoSFCForSMV__Composite0 = new MachadoSFCForSMV__Composite();
      machadoSFCForSMV__Composite0.event_INIT(false, false, false, false, false, false, false, false, false, false, false);
      machadoSFCForSMV__Composite0.event_REQ(true, false, true, false, false, true, false, true, true, true, true);
      machadoSFCForSMV__Composite0.event_REQ(true, false, false, false, false, true, false, false, true, false, false);
      machadoSFCForSMV__Composite0.event_INIT(false, false, false, false, false, false, false, false, false, true, false);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I124 Branch 23 IFNE L404 - true
   */

  @Test
  public void test3()  throws Throwable  {
      MachadoSFCForSMV__Composite machadoSFCForSMV__Composite0 = new MachadoSFCForSMV__Composite();
      machadoSFCForSMV__Composite0.event_INIT(false, true, false, true, true, false, false, false, false, false, false);
      machadoSFCForSMV__Composite0.event_REQ(true, false, true, false, false, false, false, false, true, false, false);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I80 Branch 19 IFEQ L396 - true
   */

  @Test
  public void test4()  throws Throwable  {
      MachadoSFCForSMV__Composite machadoSFCForSMV__Composite0 = new MachadoSFCForSMV__Composite();
      machadoSFCForSMV__Composite0.event_REQ(false, false, true, true, true, false, false, false, false, false, true);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_INIT()V: I4 Branch 10 IFNE L380 - true
   */

  @Test
  public void test5()  throws Throwable  {
      MachadoSFCForSMV__Composite machadoSFCForSMV__Composite0 = new MachadoSFCForSMV__Composite();
      machadoSFCForSMV__Composite0.event_REQ(true, true, true, true, true, true, true, true, true, true, true);
      machadoSFCForSMV__Composite0.event_INIT(true, true, true, true, true, true, true, true, true, true, true);
  }

  //Test case number: 6
  /*
   * 34 covered goals:
   * 1 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X32()V: root-Branch
   * 2 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.state_X37()V: root-Branch
   * 3 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X38()V: root-Branch
   * 4 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.state_X35()V: root-Branch
   * 5 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.state_X3334()V: root-Branch
   * 6 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X35()V: root-Branch
   * 7 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.state_X38()V: root-Branch
   * 8 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X37()V: root-Branch
   * 9 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X3334()V: root-Branch
   * 10 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.state_X32()V: root-Branch
   * 11 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I21 Branch 82 IFEQ L1005 - true
   * 12 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I29 Branch 83 IFEQ L1005 - false
   * 13 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I47 Branch 84 IF_ICMPNE L1009 - false
   * 14 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I51 Branch 85 IFEQ L1009 - false
   * 15 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I69 Branch 86 IF_ICMPNE L1013 - false
   * 16 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I76 Branch 87 IFEQ L1013 - true
   * 17 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I83 Branch 88 IFEQ L1013 - false
   * 18 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I101 Branch 89 IF_ICMPNE L1017 - false
   * 19 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I105 Branch 90 IFEQ L1017 - false
   * 20 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I123 Branch 91 IF_ICMPNE L1021 - false
   * 21 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I127 Branch 92 IFNE L1021 - false
   * 22 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I167 Branch 95 IF_ICMPNE L1029 - false
   * 23 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I171 Branch 96 IFEQ L1029 - false
   * 24 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_INIT()V: I4 Branch 79 IFNE L997 - true
   * 25 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X30()V: I57 Branch 100 IFEQ L1074 - false
   * 26 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I98 Branch 20 IF_ICMPNE L400 - false
   * 27 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I102 Branch 21 IFNE L400 - true
   * 28 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.alg_X4()V: I23 Branch 27 IFNE L433 - true
   * 29 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_3()V: root-Branch
   * 30 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_4()V: root-Branch
   * 31 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_6()V: root-Branch
   * 32 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_7()V: root-Branch
   * 33 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_5()V: root-Branch
   * 34 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_9()V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      MachadoSFCForSMV__Composite machadoSFCForSMV__Composite0 = new MachadoSFCForSMV__Composite();
      machadoSFCForSMV__Composite0.event_INIT(true, true, true, true, true, true, true, true, true, true, true);
      machadoSFCForSMV__Composite0.event_INIT(true, true, true, false, true, false, false, false, true, false, true);
      machadoSFCForSMV__Composite0.event_INIT(false, false, false, true, false, true, false, true, true, false, false);
      machadoSFCForSMV__Composite0.event_REQ(true, true, true, true, true, true, true, true, true, true, true);
  }

  //Test case number: 7
  /*
   * 8 covered goals:
   * 1 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.state_X2()V: root-Branch
   * 2 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.alg_X2()V: root-Branch
   * 3 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I39 Branch 15 IFEQ L392 - false
   * 4 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I120 Branch 22 IF_ICMPNE L404 - false
   * 5 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I124 Branch 23 IFNE L404 - false
   * 6 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.alg_X4()V: I35 Branch 28 IFNE L436 - true
   * 7 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC1_3()V: root-Branch
   * 8 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC1_6()V: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      MachadoSFCForSMV__Composite machadoSFCForSMV__Composite0 = new MachadoSFCForSMV__Composite();
      machadoSFCForSMV__Composite0.event_REQ(true, false, true, false, false, false, false, false, true, false, false);
      machadoSFCForSMV__Composite0.event_REQ(false, false, false, false, false, false, false, false, false, true, false);
  }

  //Test case number: 8
  /*
   * 202 covered goals:
   * 1 fb.rt.pnp.MachadoSFCForSMV__Composite$MachadoSFCForSMV.<init>(Lfb/rt/pnp/MachadoSFCForSMV__Composite;)V: root-Branch
   * 2 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.<init>(Lfb/rt/pnp/MachadoSFCForSMV__Composite;)V: root-Branch
   * 3 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_X21(Lfb/datatype/BOOL;)V: root-Branch
   * 4 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.state_X30()V: root-Branch
   * 5 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_s0(Lfb/datatype/BOOL;)V: root-Branch
   * 6 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_INIT()V: root-Branch
   * 7 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X3136()V: root-Branch
   * 8 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_X3(Lfb/datatype/BOOL;)V: root-Branch
   * 9 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_vcu(Lfb/datatype/BOOL;)V: root-Branch
   * 10 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_s2(Lfb/datatype/BOOL;)V: root-Branch
   * 11 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_X11(Lfb/datatype/BOOL;)V: root-Branch
   * 12 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_X1(Lfb/datatype/BOOL;)V: root-Branch
   * 13 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.state_INIT()V: root-Branch
   * 14 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.state_X3136()V: root-Branch
   * 15 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_vacuum(Lfb/datatype/BOOL;)V: root-Branch
   * 16 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_s1(Lfb/datatype/BOOL;)V: root-Branch
   * 17 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_vcd(Lfb/datatype/BOOL;)V: root-Branch
   * 18 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.state_START()V: root-Branch
   * 19 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_s3(Lfb/datatype/BOOL;)V: root-Branch
   * 20 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_REQ()V: root-Branch
   * 21 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_X2(Lfb/datatype/BOOL;)V: root-Branch
   * 22 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connect_pp0(Lfb/datatype/BOOL;)V: root-Branch
   * 23 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 46 IFLE L792 - true
   * 24 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 46 IFLE L792 - false
   * 25 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 47 IFLE L793 - true
   * 26 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 47 IFLE L793 - false
   * 27 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 48 IFLE L794 - true
   * 28 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 48 IFLE L794 - false
   * 29 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I32 Branch 49 IFLE L795 - true
   * 30 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I32 Branch 49 IFLE L795 - false
   * 31 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I41 Branch 50 IFLE L796 - true
   * 32 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I50 Branch 51 IFLE L797 - true
   * 33 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I59 Branch 52 IFLE L798 - true
   * 34 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I68 Branch 53 IFLE L799 - true
   * 35 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I77 Branch 54 IFLE L800 - true
   * 36 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I86 Branch 55 IFLE L801 - true
   * 37 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I95 Branch 56 IFLE L802 - true
   * 38 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I104 Branch 57 IFLE L803 - true
   * 39 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I113 Branch 58 IFLE L804 - true
   * 40 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I113 Branch 58 IFLE L804 - false
   * 41 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I122 Branch 59 IFLE L805 - true
   * 42 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I122 Branch 59 IFLE L805 - false
   * 43 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I131 Branch 60 IFLE L806 - true
   * 44 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I131 Branch 60 IFLE L806 - false
   * 45 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I140 Branch 61 IFLE L807 - true
   * 46 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I140 Branch 61 IFLE L807 - false
   * 47 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I149 Branch 62 IFLE L808 - true
   * 48 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I149 Branch 62 IFLE L808 - false
   * 49 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I158 Branch 63 IFLE L809 - false
   * 50 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I5 Branch 80 IF_ICMPNE L1005 - true
   * 51 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I5 Branch 80 IF_ICMPNE L1005 - false
   * 52 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I12 Branch 81 IFEQ L1005 - true
   * 53 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I21 Branch 82 IFEQ L1005 - false
   * 54 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I29 Branch 83 IFEQ L1005 - true
   * 55 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I47 Branch 84 IF_ICMPNE L1009 - true
   * 56 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I69 Branch 86 IF_ICMPNE L1013 - true
   * 57 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I101 Branch 89 IF_ICMPNE L1017 - true
   * 58 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I123 Branch 91 IF_ICMPNE L1021 - true
   * 59 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I145 Branch 93 IF_ICMPNE L1025 - true
   * 60 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I145 Branch 93 IF_ICMPNE L1025 - false
   * 61 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I149 Branch 94 IFEQ L1025 - true
   * 62 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I149 Branch 94 IFEQ L1025 - false
   * 63 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I167 Branch 95 IF_ICMPNE L1029 - true
   * 64 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I189 Branch 97 IF_ICMPNE L1033 - true
   * 65 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_REQ()V: I189 Branch 97 IF_ICMPNE L1033 - false
   * 66 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.service_INIT()V: I4 Branch 79 IFNE L997 - false
   * 67 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X30()V: I40 Branch 98 IFEQ L1074 - true
   * 68 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X30()V: I40 Branch 98 IFEQ L1074 - false
   * 69 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X30()V: I49 Branch 99 IFEQ L1074 - true
   * 70 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X30()V: I49 Branch 99 IFEQ L1074 - false
   * 71 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.alg_X30()V: I57 Branch 100 IFEQ L1074 - true
   * 72 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 64 IFLE L818 - true
   * 73 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 64 IFLE L818 - false
   * 74 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 65 IFLE L819 - true
   * 75 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 65 IFLE L819 - false
   * 76 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 66 IFLE L820 - true
   * 77 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 66 IFLE L820 - false
   * 78 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 67 IFLE L821 - true
   * 79 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 67 IFLE L821 - false
   * 80 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I49 Branch 68 IFLE L822 - true
   * 81 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I49 Branch 68 IFLE L822 - false
   * 82 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I60 Branch 69 IFLE L823 - true
   * 83 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I60 Branch 69 IFLE L823 - false
   * 84 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I71 Branch 70 IFLE L824 - true
   * 85 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I71 Branch 70 IFLE L824 - false
   * 86 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I82 Branch 71 IFLE L825 - true
   * 87 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I82 Branch 71 IFLE L825 - false
   * 88 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I93 Branch 72 IFLE L826 - true
   * 89 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I93 Branch 72 IFLE L826 - false
   * 90 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I104 Branch 73 IFLE L827 - true
   * 91 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I104 Branch 73 IFLE L827 - false
   * 92 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I115 Branch 74 IFLE L828 - true
   * 93 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I115 Branch 74 IFLE L828 - false
   * 94 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I126 Branch 75 IFLE L829 - true
   * 95 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I126 Branch 75 IFLE L829 - false
   * 96 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I137 Branch 76 IFLE L830 - false
   * 97 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 77 IF_ACMPNE L991 - true
   * 98 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 77 IF_ACMPNE L991 - false
   * 99 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC4.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 78 IF_ACMPNE L992 - false
   * 100 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.state_X3()V: root-Branch
   * 101 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.state_X4()V: root-Branch
   * 102 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.state_X1()V: root-Branch
   * 103 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.alg_X1()V: root-Branch
   * 104 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.alg_X3()V: root-Branch
   * 105 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.connect_pp1(Lfb/datatype/BOOL;)V: root-Branch
   * 106 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.connect_pp3(Lfb/datatype/BOOL;)V: root-Branch
   * 107 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.<init>(Lfb/rt/pnp/MachadoSFCForSMV__Composite;)V: root-Branch
   * 108 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.connect_pp2(Lfb/datatype/BOOL;)V: root-Branch
   * 109 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.state_INIT()V: root-Branch
   * 110 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.alg_INIT()V: root-Branch
   * 111 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 1 IFLE L295 - true
   * 112 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 1 IFLE L295 - false
   * 113 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 2 IFLE L296 - true
   * 114 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 2 IFLE L296 - false
   * 115 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 3 IFLE L297 - false
   * 116 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I4 Branch 11 IFNE L388 - true
   * 117 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I4 Branch 11 IFNE L388 - false
   * 118 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I8 Branch 12 IFEQ L388 - true
   * 119 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I8 Branch 12 IFEQ L388 - false
   * 120 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I25 Branch 13 IFNE L392 - true
   * 121 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I25 Branch 13 IFNE L392 - false
   * 122 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I32 Branch 14 IFEQ L392 - true
   * 123 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I39 Branch 15 IFEQ L392 - true
   * 124 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I56 Branch 16 IFNE L396 - true
   * 125 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I56 Branch 16 IFNE L396 - false
   * 126 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I63 Branch 17 IFEQ L396 - true
   * 127 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I73 Branch 18 IFEQ L396 - true
   * 128 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I80 Branch 19 IFEQ L396 - false
   * 129 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I98 Branch 20 IF_ICMPNE L400 - true
   * 130 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I120 Branch 22 IF_ICMPNE L404 - true
   * 131 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I142 Branch 24 IF_ICMPNE L408 - true
   * 132 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I142 Branch 24 IF_ICMPNE L408 - false
   * 133 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I146 Branch 25 IFNE L408 - true
   * 134 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_REQ()V: I146 Branch 25 IFNE L408 - false
   * 135 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.service_INIT()V: I4 Branch 10 IFNE L380 - false
   * 136 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 5 IFLE L307 - true
   * 137 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 5 IFLE L307 - false
   * 138 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 6 IFLE L308 - true
   * 139 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 6 IFLE L308 - false
   * 140 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 7 IFLE L309 - false
   * 141 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.alg_X4()V: I11 Branch 26 IFNE L430 - true
   * 142 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.alg_X4()V: I11 Branch 26 IFNE L430 - false
   * 143 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.alg_X4()V: I23 Branch 27 IFNE L433 - false
   * 144 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.alg_X4()V: I35 Branch 28 IFNE L436 - false
   * 145 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 8 IF_ACMPNE L374 - true
   * 146 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 8 IF_ACMPNE L374 - false
   * 147 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC1.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 9 IF_ACMPNE L375 - false
   * 148 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.alg_X10()V: root-Branch
   * 149 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connect_s12(Lfb/datatype/BOOL;)V: root-Branch
   * 150 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connect_s3(Lfb/datatype/BOOL;)V: root-Branch
   * 151 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connect_X12(Lfb/datatype/BOOL;)V: root-Branch
   * 152 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.alg_X11()V: root-Branch
   * 153 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connect_X3(Lfb/datatype/BOOL;)V: root-Branch
   * 154 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.alg_INIT()V: root-Branch
   * 155 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.<init>(Lfb/rt/pnp/MachadoSFCForSMV__Composite;)V: root-Branch
   * 156 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.state_X10()V: root-Branch
   * 157 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.state_X11()V: root-Branch
   * 158 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connect_X30(Lfb/datatype/BOOL;)V: root-Branch
   * 159 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.state_INIT()V: root-Branch
   * 160 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 29 IFLE L540 - false
   * 161 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I4 Branch 40 IFNE L636 - true
   * 162 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I4 Branch 40 IFNE L636 - false
   * 163 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I8 Branch 41 IFEQ L636 - true
   * 164 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I8 Branch 41 IFEQ L636 - false
   * 165 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I21 Branch 42 IFEQ L636 - true
   * 166 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I21 Branch 42 IFEQ L636 - false
   * 167 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I36 Branch 43 IFEQ L636 - true
   * 168 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I36 Branch 43 IFEQ L636 - false
   * 169 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I54 Branch 44 IF_ICMPNE L640 - true
   * 170 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I54 Branch 44 IF_ICMPNE L640 - false
   * 171 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I70 Branch 45 IFEQ L640 - true
   * 172 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_REQ()V: I70 Branch 45 IFEQ L640 - false
   * 173 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.service_INIT()V: I4 Branch 39 IFNE L628 - false
   * 174 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 32 IFLE L551 - true
   * 175 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 32 IFLE L551 - false
   * 176 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 33 IFLE L552 - true
   * 177 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 33 IFLE L552 - false
   * 178 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 34 IFLE L553 - true
   * 179 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 34 IFLE L553 - false
   * 180 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 35 IFLE L554 - true
   * 181 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 35 IFLE L554 - false
   * 182 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I49 Branch 36 IFLE L555 - false
   * 183 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 37 IF_ACMPNE L622 - true
   * 184 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 37 IF_ACMPNE L622 - false
   * 185 fb.rt.pnp.MachadoSFCForSMV__Composite$SFC2.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 38 IF_ACMPNE L623 - false
   * 186 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC1_1()V: root-Branch
   * 187 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_1()V: root-Branch
   * 188 fb.rt.pnp.MachadoSFCForSMV__Composite.event_REQ(ZZZZZZZZZZZ)V: root-Branch
   * 189 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC2_3()V: root-Branch
   * 190 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_8()V: root-Branch
   * 191 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC2_1()V: root-Branch
   * 192 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_0()V: root-Branch
   * 193 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC1_2()V: root-Branch
   * 194 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC1_0()V: root-Branch
   * 195 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC1_4()V: root-Branch
   * 196 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_10()V: root-Branch
   * 197 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC4_2()V: root-Branch
   * 198 fb.rt.pnp.MachadoSFCForSMV__Composite.<init>()V: root-Branch
   * 199 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC1_7()V: root-Branch
   * 200 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC2_2()V: root-Branch
   * 201 fb.rt.pnp.MachadoSFCForSMV__Composite.transition_SFC2_0()V: root-Branch
   * 202 fb.rt.pnp.MachadoSFCForSMV__Composite.event_INIT(ZZZZZZZZZZZ)V: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      MachadoSFCForSMV__Composite machadoSFCForSMV__Composite0 = new MachadoSFCForSMV__Composite();
      machadoSFCForSMV__Composite0.event_INIT(false, true, false, true, true, false, false, false, false, false, false);
      machadoSFCForSMV__Composite0.event_REQ(false, false, false, false, false, false, false, false, false, true, false);
      machadoSFCForSMV__Composite0.event_REQ(true, true, true, true, true, true, true, true, false, false, false);
  }
}