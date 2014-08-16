package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_46 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_46.test1");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    freemind.controller.filter.condition.AttributeNotExistsCondition var4 = new freemind.controller.filter.condition.AttributeNotExistsCondition("ToolBarUI");
    var1.setAttribute("ButtonUI", (java.lang.Object)"ToolBarUI");
    var1.removeChild("IntHolder(0)");
    var0.loadFrom(var1);
    java.lang.String var9 = var0.getImageHtml();

  }

}
