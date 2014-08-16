package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_98 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_98.test1");


    freemind.modes.filemode.FileMode var0 = new freemind.modes.filemode.FileMode();
    java.lang.String var1 = var0.toString();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var3 = var2.getFocusTraversalPolicy();
    var2.destroy();
    freemind.controller.Controller var5 = new freemind.controller.Controller((freemind.main.FreeMindMain)var2);
    freemind.main.FreeMindApplet var6 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var7 = var6.getResources();
    var5.setFrame((freemind.main.FreeMindMain)var6);
    freemind.common.OptionalDontShowMeAgainDialog.StandardPropertyHandler var10 = new freemind.common.OptionalDontShowMeAgainDialog.StandardPropertyHandler(var5, "http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png");
    var0.init(var5);

  }

}
