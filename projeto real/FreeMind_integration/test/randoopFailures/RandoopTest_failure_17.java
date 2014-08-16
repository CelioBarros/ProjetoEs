package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_17 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_17.test1");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.JViewport var7 = var0.getColumnHeader();
    freemind.view.mindmapview.MapView.ScrollPane var8 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var9 = var8.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var10 = new accessories.plugins.time.JTripleCalendar();
    boolean var11 = var10.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var12 = var10.getDayChooser();
    java.awt.Color var13 = var12.getSundayForeground();
    var8.setColumnHeaderView((java.awt.Component)var12);
    java.util.Locale var15 = var12.getLocale();
    javax.swing.JButton var16 = var12.getSelectedDay();
    java.lang.String var17 = var16.getUIClassID();
    freemind.common.FreeMindProgressMonitor var19 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var19.revalidate();
    var19.addNotify();
    var19.setFocusTraversalPolicyProvider(false);
    java.awt.Point var24 = var19.location();
    boolean var25 = var16.contains(var24);
    freemind.common.FreeMindProgressMonitor var27 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var27.revalidate();
    boolean var29 = var27.isUndecorated();
    var27.validate();
    var27.list();
    freemind.main.Tools.convertPointFromAncestor((java.awt.Component)var0, var24, (java.awt.Component)var27);

  }

}
