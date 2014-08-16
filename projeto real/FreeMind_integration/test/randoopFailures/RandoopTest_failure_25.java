package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_25 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_25.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.view.mindmapview.MapView.ScrollPane var4 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var5 = var4.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var6 = new accessories.plugins.time.JTripleCalendar();
    boolean var7 = var6.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var8 = var6.getDayChooser();
    java.awt.Color var9 = var8.getSundayForeground();
    var4.setColumnHeaderView((java.awt.Component)var8);
    javax.swing.JSplitPane var11 = var0.insertComponentIntoSplitPane((javax.swing.JComponent)var8);

  }

}
