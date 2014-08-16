package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_63 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_63.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    boolean var6 = var2.isApplet();
    accessories.plugins.time.JCalendar var7 = new accessories.plugins.time.JCalendar();
    java.awt.Color var8 = var7.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var9 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var10 = var9.getCalendar();
    java.util.Date var11 = var9.getMaxSelectableDate();
    var7.setDate(var11);
    accessories.plugins.time.JDayChooser var13 = var7.getDayChooser();
    var2.setContentPane((java.awt.Container)var7);
    java.lang.String var16 = var2.getParameter("-62135755137457");

  }

}
