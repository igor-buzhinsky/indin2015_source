/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 00:16:57 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.PierToPierCFB__Composite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class PierToPierCFB__Composite_ESTest {

  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I75 Branch 81 IFEQ L1054 - true
   */

  @Test
  public void test0()  throws Throwable  {
      PierToPierCFB__Composite pierToPierCFB__Composite0 = new PierToPierCFB__Composite();
      pierToPierCFB__Composite0.event_INIT(true, false, false, false, false, false, false, false, false, false, false);
      pierToPierCFB__Composite0.event_REQ(false, false, false, false, true, false, false, true, false, false, true);
      pierToPierCFB__Composite0.event_REQ(false, true, true, true, true, true, true, false, false, true, false);
      pierToPierCFB__Composite0.event_REQ(false, false, false, false, false, false, false, false, false, false, false);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I175 Branch 49 IF_ICMPNE L741 - true
   * 2 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I212 Branch 52 IFEQ L745 - true
   * 3 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I242 Branch 54 IF_ICMPNE L749 - true
   * 4 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I249 Branch 55 IFEQ L749 - true
   */

  @Test
  public void test1()  throws Throwable  {
      PierToPierCFB__Composite pierToPierCFB__Composite0 = new PierToPierCFB__Composite();
      pierToPierCFB__Composite0.event_INIT(true, false, true, true, true, true, true, true, true, true, true);
      pierToPierCFB__Composite0.event_REQ(false, true, true, true, false, false, true, true, false, true, true);
      pierToPierCFB__Composite0.event_REQ(false, true, false, false, false, false, true, false, false, false, false);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I31 Branch 37 IFEQ L729 - true
   */

  @Test
  public void test2()  throws Throwable  {
      PierToPierCFB__Composite pierToPierCFB__Composite0 = new PierToPierCFB__Composite();
      pierToPierCFB__Composite0.event_INIT(true, false, false, false, false, false, false, false, false, false, false);
      pierToPierCFB__Composite0.event_REQ(false, false, false, false, true, false, false, true, false, false, true);
      pierToPierCFB__Composite0.event_REQ(false, false, false, false, true, true, true, false, true, false, true);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I9 Branch 35 IFEQ L725 - true
   */

  @Test
  public void test3()  throws Throwable  {
      PierToPierCFB__Composite pierToPierCFB__Composite0 = new PierToPierCFB__Composite();
      pierToPierCFB__Composite0.event_INIT(true, true, false, true, true, false, false, false, false, false, false);
      pierToPierCFB__Composite0.event_REQ(false, true, false, false, false, true, false, true, false, false, true);
      pierToPierCFB__Composite0.event_REQ(true, true, false, true, true, true, true, true, true, false, true);
      pierToPierCFB__Composite0.event_REQ(true, false, false, true, true, true, true, true, false, true, false);
      pierToPierCFB__Composite0.event_REQ(false, false, false, false, false, true, false, false, false, true, true);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_INIT()V: I4 Branch 33 IFNE L717 - true
   */

  @Test
  public void test4()  throws Throwable  {
      PierToPierCFB__Composite pierToPierCFB__Composite0 = new PierToPierCFB__Composite();
      pierToPierCFB__Composite0.event_INIT(true, true, false, true, true, false, false, false, false, false, false);
      pierToPierCFB__Composite0.event_INIT(true, false, true, true, true, true, false, true, true, false, false);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I53 Branch 79 IFEQ L1050 - true
   * 2 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_Req()V: I31 Branch 13 IFEQ L386 - true
   */

  @Test
  public void test5()  throws Throwable  {
      PierToPierCFB__Composite pierToPierCFB__Composite0 = new PierToPierCFB__Composite();
      pierToPierCFB__Composite0.event_INIT(false, false, true, false, false, false, false, false, false, false, true);
      pierToPierCFB__Composite0.event_REQ(true, false, true, false, false, false, false, false, true, false, false);
      pierToPierCFB__Composite0.event_REQ(true, true, false, false, true, false, true, false, false, false, false);
      pierToPierCFB__Composite0.event_REQ(false, false, false, false, false, true, false, true, false, true, true);
  }

  //Test case number: 6
  /*
   * 15 covered goals:
   * 1 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_IN_CMD()V: I5 Branch 56 IF_ICMPNE L757 - false
   * 2 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_IN_CMD()V: I9 Branch 57 IFEQ L757 - false
   * 3 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I74 Branch 40 IFEQ L733 - false
   * 4 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I128 Branch 45 IFEQ L737 - false
   * 5 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I164 Branch 48 IFEQ L741 - false
   * 6 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I190 Branch 50 IFEQ L741 - true
   * 7 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I230 Branch 53 IF_ICMPNE L749 - false
   * 8 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I242 Branch 54 IF_ICMPNE L749 - false
   * 9 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I249 Branch 55 IFEQ L749 - false
   * 10 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_IN_CMD()V: I5 Branch 82 IF_ICMPNE L1062 - false
   * 11 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_8()V: root-Branch
   * 12 fb.rt.pnp.PierToPierCFB__Composite.transition_vaccum3_2()V: root-Branch
   * 13 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_9()V: root-Branch
   * 14 fb.rt.pnp.PierToPierCFB__Composite.transition_verticalcylinder3_5()V: root-Branch
   * 15 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_Req()V: I9 Branch 11 IFNE L382 - false
   */

  @Test
  public void test6()  throws Throwable  {
      PierToPierCFB__Composite pierToPierCFB__Composite0 = new PierToPierCFB__Composite();
      pierToPierCFB__Composite0.event_INIT(true, true, true, true, true, true, true, true, false, true, true);
      pierToPierCFB__Composite0.event_REQ(true, true, true, true, true, true, true, true, true, true, true);
      pierToPierCFB__Composite0.event_REQ(false, true, true, true, true, true, true, true, true, true, true);
      pierToPierCFB__Composite0.event_REQ(true, true, true, true, true, false, true, true, true, true, true);
      pierToPierCFB__Composite0.event_REQ(true, true, true, true, true, true, false, true, false, true, false);
      pierToPierCFB__Composite0.event_REQ(false, false, true, true, true, true, false, true, true, true, false);
  }

  //Test case number: 7
  /*
   * 21 covered goals:
   * 1 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.alg_Get2or3()V: root-Branch
   * 2 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.state_Getpp2or3()V: root-Branch
   * 3 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I84 Branch 41 IFEQ L733 - false
   * 4 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I92 Branch 42 IFEQ L733 - true
   * 5 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I110 Branch 43 IF_ICMPNE L737 - false
   * 6 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I118 Branch 44 IF_ICMPNE L737 - true
   * 7 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I118 Branch 44 IF_ICMPNE L737 - false
   * 8 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I128 Branch 45 IFEQ L737 - true
   * 9 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I139 Branch 46 IFEQ L737 - true
   * 10 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I139 Branch 46 IFEQ L737 - false
   * 11 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I157 Branch 47 IF_ICMPNE L741 - false
   * 12 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I164 Branch 48 IFEQ L741 - true
   * 13 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I175 Branch 49 IF_ICMPNE L741 - false
   * 14 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I190 Branch 50 IFEQ L741 - false
   * 15 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I208 Branch 51 IF_ICMPNE L745 - false
   * 16 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I212 Branch 52 IFEQ L745 - false
   * 17 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_6()V: root-Branch
   * 18 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_7()V: root-Branch
   * 19 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_5()V: root-Branch
   * 20 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_IN_CMD()V: I9 Branch 15 IFEQ L394 - true
   * 21 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_IN_CMD()V: I27 Branch 16 IF_ICMPNE L398 - true
   */

  @Test
  public void test7()  throws Throwable  {
      PierToPierCFB__Composite pierToPierCFB__Composite0 = new PierToPierCFB__Composite();
      pierToPierCFB__Composite0.event_INIT(true, true, true, true, true, true, true, true, true, true, true);
      pierToPierCFB__Composite0.event_REQ(true, true, true, true, false, true, true, false, false, true, true);
      pierToPierCFB__Composite0.event_REQ(true, true, true, true, true, true, true, true, true, true, true);
  }

  //Test case number: 8
  /*
   * 199 covered goals:
   * 1 fb.rt.pnp.PierToPierCFB__Composite$PierToPierCFB.<init>(Lfb/rt/pnp/PierToPierCFB__Composite;)V: root-Branch
   * 2 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.state_GoBack()V: root-Branch
   * 3 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.alg_INIT()V: root-Branch
   * 4 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.state_c1home()V: root-Branch
   * 5 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.<init>(Lfb/rt/pnp/PierToPierCFB__Composite;)V: root-Branch
   * 6 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.alg_BlockVcDown()V: root-Branch
   * 7 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connect_vcPermitMove(Lfb/datatype/BOOL;)V: root-Branch
   * 8 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.alg_AllowVcDown()V: root-Branch
   * 9 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.alg_Get1or3()V: root-Branch
   * 10 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connect_pp3(Lfb/datatype/BOOL;)V: root-Branch
   * 11 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.state_Getpp1or3()V: root-Branch
   * 12 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connect_cend(Lfb/datatype/BOOL;)V: root-Branch
   * 13 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.alg_GoBack()V: root-Branch
   * 14 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connect_pp2(Lfb/datatype/BOOL;)V: root-Branch
   * 15 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.state_wait()V: root-Branch
   * 16 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.state_INIT()V: root-Branch
   * 17 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.state_c1end()V: root-Branch
   * 18 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connect_chome(Lfb/datatype/BOOL;)V: root-Branch
   * 19 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connect_pp1(Lfb/datatype/BOOL;)V: root-Branch
   * 20 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 20 IFLE L582 - true
   * 21 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 20 IFLE L582 - false
   * 22 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 21 IFLE L583 - true
   * 23 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 21 IFLE L583 - false
   * 24 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 22 IFLE L584 - false
   * 25 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_IN_CMD()V: I5 Branch 56 IF_ICMPNE L757 - true
   * 26 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_IN_CMD()V: I27 Branch 58 IF_ICMPNE L761 - true
   * 27 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_IN_CMD()V: I27 Branch 58 IF_ICMPNE L761 - false
   * 28 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_IN_CMD()V: I31 Branch 59 IFEQ L761 - false
   * 29 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I5 Branch 34 IF_ICMPNE L725 - true
   * 30 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I5 Branch 34 IF_ICMPNE L725 - false
   * 31 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I9 Branch 35 IFEQ L725 - false
   * 32 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I27 Branch 36 IF_ICMPNE L729 - true
   * 33 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I27 Branch 36 IF_ICMPNE L729 - false
   * 34 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I31 Branch 37 IFEQ L729 - false
   * 35 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I49 Branch 38 IF_ICMPNE L733 - true
   * 36 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I49 Branch 38 IF_ICMPNE L733 - false
   * 37 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I61 Branch 39 IF_ICMPNE L733 - true
   * 38 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I61 Branch 39 IF_ICMPNE L733 - false
   * 39 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I74 Branch 40 IFEQ L733 - true
   * 40 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I84 Branch 41 IFEQ L733 - true
   * 41 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I92 Branch 42 IFEQ L733 - false
   * 42 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I110 Branch 43 IF_ICMPNE L737 - true
   * 43 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I157 Branch 47 IF_ICMPNE L741 - true
   * 44 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I208 Branch 51 IF_ICMPNE L745 - true
   * 45 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_REQ()V: I230 Branch 53 IF_ICMPNE L749 - true
   * 46 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.service_INIT()V: I4 Branch 33 IFNE L717 - false
   * 47 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 23 IFLE L593 - true
   * 48 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 23 IFLE L593 - false
   * 49 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 24 IFLE L594 - true
   * 50 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 24 IFLE L594 - false
   * 51 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 25 IFLE L595 - true
   * 52 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 25 IFLE L595 - false
   * 53 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 26 IFLE L596 - true
   * 54 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 26 IFLE L596 - false
   * 55 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I49 Branch 27 IFLE L597 - true
   * 56 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I49 Branch 27 IFLE L597 - false
   * 57 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I60 Branch 28 IFLE L598 - false
   * 58 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 30 IF_ACMPNE L710 - true
   * 59 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 30 IF_ACMPNE L710 - false
   * 60 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 31 IF_ACMPNE L711 - true
   * 61 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 31 IF_ACMPNE L711 - false
   * 62 fb.rt.pnp.PierToPierCFB__Composite$GenCyl.serviceEvent(Lfb/rt/EventServer;)V: I23 Branch 32 IF_ACMPNE L712 - false
   * 63 fb.rt.pnp.PierToPierCFB__Composite$E_SPLIT.state_EO()V: root-Branch
   * 64 fb.rt.pnp.PierToPierCFB__Composite$E_SPLIT.state_START()V: root-Branch
   * 65 fb.rt.pnp.PierToPierCFB__Composite$E_SPLIT.<init>(Lfb/rt/pnp/PierToPierCFB__Composite;)V: root-Branch
   * 66 fb.rt.pnp.PierToPierCFB__Composite$E_SPLIT.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 86 IF_ACMPNE L1187 - false
   * 67 fb.rt.pnp.PierToPierCFB__Composite$E_SPLIT.service_EI()V: I4 Branch 87 IFNE L1192 - false
   * 68 fb.rt.pnp.PierToPierCFB__Composite$E_Split4.state_REQ()V: root-Branch
   * 69 fb.rt.pnp.PierToPierCFB__Composite$E_Split4.<init>(Lfb/rt/pnp/PierToPierCFB__Composite;)V: root-Branch
   * 70 fb.rt.pnp.PierToPierCFB__Composite$E_Split4.state_START()V: root-Branch
   * 71 fb.rt.pnp.PierToPierCFB__Composite$E_Split4.service_E()V: I4 Branch 19 IFNE L499 - false
   * 72 fb.rt.pnp.PierToPierCFB__Composite$E_Split4.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 18 IF_ACMPNE L494 - false
   * 73 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connect_c2home(Lfb/datatype/BOOL;)V: root-Branch
   * 74 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.state_DownToPick()V: root-Branch
   * 75 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connect_c2PermitDown(Lfb/datatype/BOOL;)V: root-Branch
   * 76 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.alg_Finish()V: root-Branch
   * 77 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.state_INIT()V: root-Branch
   * 78 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.alg_INIT()V: root-Branch
   * 79 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.alg_Pick()V: root-Branch
   * 80 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.state_GoUp()V: root-Branch
   * 81 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.<init>(Lfb/rt/pnp/PierToPierCFB__Composite;)V: root-Branch
   * 82 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connect_pp0(Lfb/datatype/BOOL;)V: root-Branch
   * 83 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.alg_Up()V: root-Branch
   * 84 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.state_Up()V: root-Branch
   * 85 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connect_vc_down(Lfb/datatype/BOOL;)V: root-Branch
   * 86 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.state_DownToDrop()V: root-Branch
   * 87 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.alg_Drop()V: root-Branch
   * 88 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connect_c1permitDown(Lfb/datatype/BOOL;)V: root-Branch
   * 89 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connect_c1home(Lfb/datatype/BOOL;)V: root-Branch
   * 90 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connect_vc_up(Lfb/datatype/BOOL;)V: root-Branch
   * 91 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.state_GoDown()V: root-Branch
   * 92 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.alg_Down()V: root-Branch
   * 93 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 60 IFLE L910 - true
   * 94 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 60 IFLE L910 - false
   * 95 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 61 IFLE L911 - true
   * 96 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 61 IFLE L911 - false
   * 97 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 62 IFLE L912 - true
   * 98 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I23 Branch 62 IFLE L912 - false
   * 99 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I32 Branch 63 IFLE L913 - false
   * 100 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_IN_CMD()V: I5 Branch 82 IF_ICMPNE L1062 - true
   * 101 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_IN_CMD()V: I23 Branch 83 IF_ICMPNE L1066 - true
   * 102 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_IN_CMD()V: I23 Branch 83 IF_ICMPNE L1066 - false
   * 103 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_IN_CMD()V: I41 Branch 84 IF_ICMPNE L1070 - true
   * 104 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_IN_CMD()V: I41 Branch 84 IF_ICMPNE L1070 - false
   * 105 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_IN_CMD()V: I49 Branch 85 IFEQ L1070 - true
   * 106 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_IN_CMD()V: I49 Branch 85 IFEQ L1070 - false
   * 107 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I5 Branch 75 IF_ICMPNE L1046 - true
   * 108 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I5 Branch 75 IF_ICMPNE L1046 - false
   * 109 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I16 Branch 76 IFEQ L1046 - true
   * 110 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I16 Branch 76 IFEQ L1046 - false
   * 111 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I23 Branch 77 IFEQ L1046 - true
   * 112 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I23 Branch 77 IFEQ L1046 - false
   * 113 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I41 Branch 78 IF_ICMPNE L1050 - true
   * 114 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I41 Branch 78 IF_ICMPNE L1050 - false
   * 115 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I53 Branch 79 IFEQ L1050 - false
   * 116 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I71 Branch 80 IF_ICMPNE L1054 - true
   * 117 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I71 Branch 80 IF_ICMPNE L1054 - false
   * 118 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_REQ()V: I75 Branch 81 IFEQ L1054 - false
   * 119 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.service_INIT()V: I4 Branch 74 IFNE L1038 - false
   * 120 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 64 IFLE L922 - true
   * 121 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 64 IFLE L922 - false
   * 122 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 65 IFLE L923 - true
   * 123 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 65 IFLE L923 - false
   * 124 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 66 IFLE L924 - true
   * 125 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 66 IFLE L924 - false
   * 126 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 67 IFLE L925 - true
   * 127 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I38 Branch 67 IFLE L925 - false
   * 128 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I49 Branch 68 IFLE L926 - true
   * 129 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I49 Branch 68 IFLE L926 - false
   * 130 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I60 Branch 69 IFLE L927 - true
   * 131 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I60 Branch 69 IFLE L927 - false
   * 132 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I71 Branch 70 IFLE L928 - false
   * 133 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 71 IF_ACMPNE L1031 - true
   * 134 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 71 IF_ACMPNE L1031 - false
   * 135 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 72 IF_ACMPNE L1032 - true
   * 136 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 72 IF_ACMPNE L1032 - false
   * 137 fb.rt.pnp.PierToPierCFB__Composite$verticalcylinder3.serviceEvent(Lfb/rt/EventServer;)V: I23 Branch 73 IF_ACMPNE L1033 - false
   * 138 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_1()V: root-Branch
   * 139 fb.rt.pnp.PierToPierCFB__Composite.transition_verticalcylinder3_1()V: root-Branch
   * 140 fb.rt.pnp.PierToPierCFB__Composite.transition_verticalcylinder3_3()V: root-Branch
   * 141 fb.rt.pnp.PierToPierCFB__Composite.transition_E_Split4_1()V: root-Branch
   * 142 fb.rt.pnp.PierToPierCFB__Composite.transition_vaccum3_0()V: root-Branch
   * 143 fb.rt.pnp.PierToPierCFB__Composite.event_REQ(ZZZZZZZZZZZ)V: root-Branch
   * 144 fb.rt.pnp.PierToPierCFB__Composite.transition_E_SPLIT_0()V: root-Branch
   * 145 fb.rt.pnp.PierToPierCFB__Composite.transition_vaccum3_5()V: root-Branch
   * 146 fb.rt.pnp.PierToPierCFB__Composite.transition_vaccum3_3()V: root-Branch
   * 147 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_4()V: root-Branch
   * 148 fb.rt.pnp.PierToPierCFB__Composite.transition_verticalcylinder3_6()V: root-Branch
   * 149 fb.rt.pnp.PierToPierCFB__Composite.transition_verticalcylinder3_4()V: root-Branch
   * 150 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_2()V: root-Branch
   * 151 fb.rt.pnp.PierToPierCFB__Composite.<init>()V: root-Branch
   * 152 fb.rt.pnp.PierToPierCFB__Composite.transition_verticalcylinder3_0()V: root-Branch
   * 153 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_0()V: root-Branch
   * 154 fb.rt.pnp.PierToPierCFB__Composite.transition_verticalcylinder3_2()V: root-Branch
   * 155 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_10()V: root-Branch
   * 156 fb.rt.pnp.PierToPierCFB__Composite.transition_E_Split4_0()V: root-Branch
   * 157 fb.rt.pnp.PierToPierCFB__Composite.transition_vaccum3_1()V: root-Branch
   * 158 fb.rt.pnp.PierToPierCFB__Composite.transition_E_SPLIT_1()V: root-Branch
   * 159 fb.rt.pnp.PierToPierCFB__Composite.transition_vaccum3_4()V: root-Branch
   * 160 fb.rt.pnp.PierToPierCFB__Composite.transition_verticalcylinder3_7()V: root-Branch
   * 161 fb.rt.pnp.PierToPierCFB__Composite.transition_GenCyl_3()V: root-Branch
   * 162 fb.rt.pnp.PierToPierCFB__Composite.event_INIT(ZZZZZZZZZZZ)V: root-Branch
   * 163 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.connect_SwitchOff(Lfb/datatype/BOOL;)V: root-Branch
   * 164 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.state_VaccumOff()V: root-Branch
   * 165 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.connect_vacuum(Lfb/datatype/BOOL;)V: root-Branch
   * 166 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.state_Drop()V: root-Branch
   * 167 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.alg_INIT()V: root-Branch
   * 168 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.connect_SwitchOn(Lfb/datatype/BOOL;)V: root-Branch
   * 169 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.<init>(Lfb/rt/pnp/PierToPierCFB__Composite;)V: root-Branch
   * 170 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.alg_suction()V: root-Branch
   * 171 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.alg_Drop()V: root-Branch
   * 172 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.state_suction()V: root-Branch
   * 173 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.state_INIT()V: root-Branch
   * 174 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.state_VaccumOn()V: root-Branch
   * 175 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 1 IFLE L288 - true
   * 176 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I5 Branch 1 IFLE L288 - false
   * 177 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.ovNamed(Ljava/lang/String;)Lfb/datatype/ANY;: I14 Branch 2 IFLE L289 - false
   * 178 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_IN_CMD()V: I5 Branch 14 IF_ICMPNE L394 - true
   * 179 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_IN_CMD()V: I5 Branch 14 IF_ICMPNE L394 - false
   * 180 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_IN_CMD()V: I9 Branch 15 IFEQ L394 - false
   * 181 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_IN_CMD()V: I27 Branch 16 IF_ICMPNE L398 - false
   * 182 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_IN_CMD()V: I31 Branch 17 IFEQ L398 - false
   * 183 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_INIT()V: I4 Branch 9 IFNE L374 - false
   * 184 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_Req()V: I5 Branch 10 IF_ICMPNE L382 - true
   * 185 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_Req()V: I5 Branch 10 IF_ICMPNE L382 - false
   * 186 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_Req()V: I9 Branch 11 IFNE L382 - true
   * 187 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_Req()V: I27 Branch 12 IF_ICMPNE L386 - true
   * 188 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_Req()V: I27 Branch 12 IF_ICMPNE L386 - false
   * 189 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.service_Req()V: I31 Branch 13 IFEQ L386 - false
   * 190 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 3 IFLE L298 - true
   * 191 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I5 Branch 3 IFLE L298 - false
   * 192 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 4 IFLE L299 - true
   * 193 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I16 Branch 4 IFLE L299 - false
   * 194 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.connectIV(Ljava/lang/String;Lfb/datatype/ANY;)V: I27 Branch 5 IFLE L300 - false
   * 195 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 6 IF_ACMPNE L367 - true
   * 196 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.serviceEvent(Lfb/rt/EventServer;)V: I5 Branch 6 IF_ACMPNE L367 - false
   * 197 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 7 IF_ACMPNE L368 - true
   * 198 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.serviceEvent(Lfb/rt/EventServer;)V: I14 Branch 7 IF_ACMPNE L368 - false
   * 199 fb.rt.pnp.PierToPierCFB__Composite$vaccum3.serviceEvent(Lfb/rt/EventServer;)V: I23 Branch 8 IF_ACMPNE L369 - false
   */

  @Test
  public void test8()  throws Throwable  {
      PierToPierCFB__Composite pierToPierCFB__Composite0 = new PierToPierCFB__Composite();
      pierToPierCFB__Composite0.event_INIT(true, true, false, true, true, false, false, false, false, false, false);
      pierToPierCFB__Composite0.event_REQ(false, true, false, false, false, true, false, true, false, false, true);
      pierToPierCFB__Composite0.event_REQ(true, true, false, true, true, true, true, true, true, false, true);
      pierToPierCFB__Composite0.event_REQ(true, false, false, true, true, true, true, true, false, true, false);
      pierToPierCFB__Composite0.event_REQ(true, true, true, true, true, true, true, true, true, true, true);
  }
}