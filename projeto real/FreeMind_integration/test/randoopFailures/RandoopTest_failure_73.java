package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_73 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_73.test1");


    freemind.modes.schememode.SchemeMode var0 = new freemind.modes.schememode.SchemeMode();
    freemind.controller.Controller var1 = var0.getController();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var3 = var2.getFocusTraversalPolicy();
    var2.destroy();
    freemind.controller.Controller var5 = new freemind.controller.Controller((freemind.main.FreeMindMain)var2);
    java.net.URL var7 = var5.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var8 = new freemind.controller.MapMouseWheelListener(var5);
    java.net.URL var10 = var5.getResource("control");
    freemind.controller.MapMouseMotionListener var11 = new freemind.controller.MapMouseMotionListener(var5);
    plugins.collaboration.database.DatabaseConnectionHook var12 = new plugins.collaboration.database.DatabaseConnectionHook();
    var5.registerMapTitleContributor((freemind.controller.MapModuleManager.MapTitleContributor)var12);
    var0.init(var5);

  }

}
