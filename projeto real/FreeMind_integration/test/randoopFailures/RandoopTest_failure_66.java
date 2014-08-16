package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_66 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_66.test1");


    accessories.plugins.ClonePlugin var0 = new accessories.plugins.ClonePlugin();
    freemind.modes.mindmapmode.MindMapController var1 = var0.getMindMapController();
    freemind.main.XMLElement var3 = new freemind.main.XMLElement(false);
    freemind.view.mindmapview.LeftNodeViewLayout var5 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var3.setAttribute("<a,23>", (java.lang.Object)var5);
    var0.save(var3);

  }

}
