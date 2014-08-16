package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_85 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_85.test1");


    accessories.plugins.LogFileViewer var0 = new accessories.plugins.LogFileViewer();
    freemind.modes.mindmapmode.MindMapController var1 = var0.getMindMapController();
    var0.disposeDialog();

  }

}
