package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_87 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_87.test1");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    int var4 = var2.getWidth();
    var2.addNotify();
    var2.updateUI();

  }

}
