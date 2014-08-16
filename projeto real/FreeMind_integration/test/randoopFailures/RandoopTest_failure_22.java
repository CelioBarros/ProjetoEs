package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_22 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_22.test1");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    java.awt.event.WindowListener[] var4 = var1.getWindowListeners();
    var1.transferFocus();
    freemind.main.FreeMindApplet var6 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var7 = var6.getResources();
    var1.applyResourceBundle(var7);

  }

}
