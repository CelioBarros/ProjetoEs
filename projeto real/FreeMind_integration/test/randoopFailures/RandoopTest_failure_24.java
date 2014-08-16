package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_24 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_24.test1");


    freemind.modes.browsemode.BrowseMode var0 = new freemind.modes.browsemode.BrowseMode();
    var0.activate();
    var0.activate();

  }

}
