package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_96 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_96.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    int var1 = var0.getWinHeight();
    java.lang.String var2 = var0.getAppletInfo();
    java.util.List var3 = var0.getLoggerList();
    java.util.ResourceBundle var4 = var0.getResources();
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    var0.out("ScrollPaneUI");

  }

}
