package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_26 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_26.test1");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var2.isDecorationBordersVisible();
    java.util.GregorianCalendar var4 = var2.getTemporaryCalendar();
    var2.setAlwaysFireDayProperty(true);
    freemind.view.mindmapview.MapView.ScrollPane var7 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var8 = var7.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var9 = new accessories.plugins.time.JTripleCalendar();
    boolean var10 = var9.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var11 = var9.getDayChooser();
    java.awt.Color var12 = var11.getSundayForeground();
    var7.setColumnHeaderView((java.awt.Component)var11);
    var11.setAlwaysFireDayProperty(true);
    freemind.common.FreeMindProgressMonitor var17 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var18 = var17.getInputMethodListeners();
    var17.show();
    java.lang.String var20 = var17.getTitle();
    freemind.common.FreeMindProgressMonitor var22 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var22.revalidate();
    var22.addNotify();
    var22.setFocusTraversalPolicyProvider(false);
    java.awt.Point var27 = var22.location();
    var17.setLocation(var27);
    java.awt.Point var29 = var11.getLocation(var27);
    freemind.common.FreeMindProgressMonitor var31 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var32 = var31.getInputMethodListeners();
    javax.accessibility.AccessibleContext var33 = var31.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var35 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var35.revalidate();
    var31.setLocationRelativeTo((java.awt.Component)var35);
    boolean var38 = var31.isValidateRoot();
    accessories.plugins.time.JCalendar var39 = new accessories.plugins.time.JCalendar();
    java.awt.Color var40 = var39.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var41 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var42 = var41.getCalendar();
    java.util.Date var43 = var41.getMaxSelectableDate();
    var39.setDate(var43);
    var39.setWeekOfYearVisible(true);
    var31.addPropertyChangeListener((java.beans.PropertyChangeListener)var39);
    accessories.plugins.time.JCalendar var48 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var49 = var48.getCalendar();
    java.util.Date var50 = var48.getMaxSelectableDate();
    var39.setMinSelectableDate(var50);
    java.awt.Point var52 = freemind.main.Tools.convertPointToAncestor((java.awt.Component)var2, var29, (java.awt.Component)var39);

  }

}
