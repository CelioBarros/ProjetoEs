package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_2.test1");


    accessories.plugins.time.TimeManagement var0 = new accessories.plugins.time.TimeManagement();
    var0.startupMapHook();

  }

}
