package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_23 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_23.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    boolean var2 = var0.isApplet();
    java.lang.String var4 = var0.getProperty("http://openstreetmap.org/");

  }

}
