package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_39 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_39.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    java.awt.Container var2 = var0.getContentPane();
    int var5 = var0.getIntProperty("keystroke_icon_hi!", 6);

  }

}
