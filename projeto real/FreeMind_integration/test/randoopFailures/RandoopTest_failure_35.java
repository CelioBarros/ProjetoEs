package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_35 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_35.test1");


    freemind.modes.browsemode.BrowseMode var0 = new freemind.modes.browsemode.BrowseMode();
    var0.activate();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var3 = var2.getFocusTraversalPolicy();
    var2.destroy();
    freemind.controller.Controller var5 = new freemind.controller.Controller((freemind.main.FreeMindMain)var2);
    var0.init(var5);

  }

}
