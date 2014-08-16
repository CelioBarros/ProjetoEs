package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_94 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_94.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    int var1 = var0.getWinHeight();
    java.lang.String var2 = var0.getAppletInfo();
    java.lang.String var3 = var0.getAppletInfo();
    java.lang.ClassLoader var4 = var0.getFreeMindClassLoader();
    java.net.URL var5 = var0.getDocumentBase();

  }

}
