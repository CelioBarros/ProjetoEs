package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_99 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_99.test1");


    freemind.modes.schememode.SchemeMode var0 = new freemind.modes.schememode.SchemeMode();
    freemind.modes.ModeController var1 = var0.getDefaultModeController();
    var0.restore("/home/joao/workspace/\n");
    var0.activate();

  }

}
