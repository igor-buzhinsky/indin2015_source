/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 07 09:01:37 MSK 2015
 */

package fb.rt.pnp;

import static org.junit.Assert.*;
import org.junit.Test;
import fb.rt.pnp.CylinderMaterSlave__Basic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;


public class CylinderMaterSlave__Basic_Tr_ESTest {

  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.CylinderMaterSlave__Basic.transition_CylinderMaterSlave_3()V: root-Branch
   * 2 fb.rt.pnp.CylinderMaterSlave__Basic.transition_CylinderMaterSlave_1()V: root-Branch
   * 3 fb.rt.pnp.CylinderMaterSlave__Basic.transition_CylinderMaterSlave_5()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      CylinderMaterSlave__Basic cylinderMaterSlave__Basic0 = new CylinderMaterSlave__Basic();
      cylinderMaterSlave__Basic0.event_Extend();
      cylinderMaterSlave__Basic0.event_REQ(true, false, true);
      cylinderMaterSlave__Basic0.event_SL_CNF(true);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 fb.rt.pnp.CylinderMaterSlave__Basic.transition_CylinderMaterSlave_4()V: root-Branch
   * 2 fb.rt.pnp.CylinderMaterSlave__Basic.transition_CylinderMaterSlave_2()V: root-Branch
   * 3 fb.rt.pnp.CylinderMaterSlave__Basic.transition_CylinderMaterSlave_0()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      CylinderMaterSlave__Basic cylinderMaterSlave__Basic0 = new CylinderMaterSlave__Basic();
      cylinderMaterSlave__Basic0.event_Retract();
      cylinderMaterSlave__Basic0.event_REQ(true, false, true);
  }
}
