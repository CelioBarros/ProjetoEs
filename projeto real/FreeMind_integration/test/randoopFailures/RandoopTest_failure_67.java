package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_67 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_67.test1");


    accessories.plugins.ManagePatterns var0 = new accessories.plugins.ManagePatterns();
    var0.startupMapHook();

  }

}
