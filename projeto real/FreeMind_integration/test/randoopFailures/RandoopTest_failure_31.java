package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_31 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_31.test1");


    freemind.modes.mindmapmode.MindMapMode var0 = new freemind.modes.mindmapmode.MindMapMode();
    freemind.main.FreeMindApplet var1 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var2 = var1.getFocusTraversalPolicy();
    var1.destroy();
    freemind.controller.Controller var4 = new freemind.controller.Controller((freemind.main.FreeMindMain)var1);
    java.net.URL var6 = var4.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    var0.init(var4);

  }

}
