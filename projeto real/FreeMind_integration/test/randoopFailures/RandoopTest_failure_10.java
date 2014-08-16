package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_10 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_10.test1");


    accessories.plugins.HierarchicalIcons var0 = new accessories.plugins.HierarchicalIcons();
    java.lang.String var1 = var0.getName();
    var0.onUpdateNodeHook();

  }

}
