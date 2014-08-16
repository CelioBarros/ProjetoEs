package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_40 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_40.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.controller.MenuBar var2 = var0.getFreeMindMenuBar();
    int var3 = var0.getWinHeight();
    var0.err("hi!");

  }

}
