package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_16 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_16.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindSplashModern var2 = new freemind.main.FreeMindSplashModern((freemind.main.FreeMindMain)var0);

  }

}
