package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_41 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_41.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.modes.mindmapmode.hooks.MindMapHookFactory var2 = new freemind.modes.mindmapmode.hooks.MindMapHookFactory((freemind.main.FreeMindMain)var0);
    freemind.view.mindmapview.MapView var3 = var0.getView();

  }

}
