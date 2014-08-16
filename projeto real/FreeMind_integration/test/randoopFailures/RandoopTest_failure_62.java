package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_62 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_62.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    freemind.modes.mindmapmode.actions.xml.ActionFactory var5 = new freemind.modes.mindmapmode.actions.xml.ActionFactory(var3);
    var3.setMenubarVisible(true);

  }

}
