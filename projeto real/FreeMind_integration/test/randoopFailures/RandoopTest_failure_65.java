package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_65 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_65.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.main.FreeMindApplet var4 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var5 = var4.getResources();
    var3.setFrame((freemind.main.FreeMindMain)var4);
    java.lang.String var8 = var3.getProperty("");

  }

}
