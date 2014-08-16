package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_47 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_47.test1");


    freemind.common.XmlBindingTools var0 = freemind.common.XmlBindingTools.getInstance();
    freemind.controller.actions.generated.instance.XmlAction var2 = var0.unMarshall("png");
    freemind.main.FreeMindApplet var3 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var4 = var3.getFocusTraversalPolicy();
    var3.destroy();
    freemind.controller.Controller var6 = new freemind.controller.Controller((freemind.main.FreeMindMain)var3);
    java.net.URL var8 = var6.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var9 = new freemind.controller.MapMouseWheelListener(var6);
    java.net.URL var11 = var6.getResource("control");
    freemind.common.FreeMindProgressMonitor var13 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.MouseListener[] var14 = var13.getMouseListeners();
    freemind.controller.FreeMindToolBar var17 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var17.updateUI();
    var17.setIgnoreRepaint(false);
    java.awt.Dimension var21 = var17.getSize();
    java.awt.Component var22 = var13.add((java.awt.Component)var17);
    freemind.controller.actions.generated.instance.WindowConfigurationStorage var24 = var0.decorateDialog(var6, (javax.swing.JDialog)var13, "<a,23>");

  }

}
