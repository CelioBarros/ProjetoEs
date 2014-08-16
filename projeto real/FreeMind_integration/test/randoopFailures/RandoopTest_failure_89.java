package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_89 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_89.test1");


    accessories.plugins.SaveAll var0 = new accessories.plugins.SaveAll();
    var0.startupMapHook();

  }

}
