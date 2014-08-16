package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_18 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_18.test1");


    accessories.plugins.HierarchicalIcons var0 = new accessories.plugins.HierarchicalIcons();
    var0.onUpdateNodeHook();

  }

}
