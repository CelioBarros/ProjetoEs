package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_42 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_42.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    java.net.URL var5 = var3.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.modes.mindmapmode.attributeactors.AttributeManagerDialog var6 = new freemind.modes.mindmapmode.attributeactors.AttributeManagerDialog(var3);

  }

}
