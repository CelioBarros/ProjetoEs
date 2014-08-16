package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_76 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_76.test1");


    accessories.plugins.FormularEditor var0 = new accessories.plugins.FormularEditor();
    freemind.controller.filter.condition.AttributeNotExistsCondition var2 = new freemind.controller.filter.condition.AttributeNotExistsCondition("hi!");
    javax.swing.JComponent var3 = var2.getListCellRendererComponent();
    freemind.main.XMLElement var4 = new freemind.main.XMLElement();
    java.lang.String var5 = var4.getTagName();
    int var6 = var4.getLineNr();
    int var8 = var4.getIntAttribute("ToolBarUI");
    var2.saveAttributes(var4);
    plugins.map.MapNodePositionHolder var10 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var11 = new freemind.main.XMLElement();
    freemind.controller.filter.condition.AttributeNotExistsCondition var14 = new freemind.controller.filter.condition.AttributeNotExistsCondition("ToolBarUI");
    var11.setAttribute("ButtonUI", (java.lang.Object)"ToolBarUI");
    var11.removeChild("IntHolder(0)");
    var10.loadFrom(var11);
    var2.save(var11);
    var0.save(var11);

  }

}
