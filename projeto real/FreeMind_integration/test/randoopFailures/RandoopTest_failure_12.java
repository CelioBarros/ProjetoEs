package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_12 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_12.test1");


    accessories.plugins.time.TimeList var0 = new accessories.plugins.time.TimeList();
    freemind.modes.mindmapmode.MindMapController var1 = var0.getMindMapController();
    var0.startupMapHook();

  }

}
