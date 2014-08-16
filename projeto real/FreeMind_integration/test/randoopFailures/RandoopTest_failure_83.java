package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_83 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_83.test1");


    accessories.plugins.FitToPage var0 = new accessories.plugins.FitToPage();
    var0.startupMapHook();

  }

}
