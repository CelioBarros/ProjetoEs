package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_30 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_30.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    java.util.Locale var6 = var2.getLocale();
    var2.start();
    var2.init();

  }

}
