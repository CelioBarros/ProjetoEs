package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_82 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_82.test1");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    freemind.controller.filter.condition.AttributeNotExistsCondition var4 = new freemind.controller.filter.condition.AttributeNotExistsCondition("ToolBarUI");
    var1.setAttribute("ButtonUI", (java.lang.Object)"ToolBarUI");
    var1.removeChild("IntHolder(0)");
    var0.loadFrom(var1);
    plugins.map.MapNodePositionHolder var9 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var10 = new freemind.main.XMLElement();
    java.lang.String var11 = var10.getTagName();
    java.util.Iterator var12 = var10.enumerateAttributeNames();
    java.util.Iterator var13 = var10.enumeratePropertyNames();
    var9.loadFrom(var10);
    freemind.main.XMLElement var15 = new freemind.main.XMLElement();
    java.lang.String var16 = var15.getTagName();
    java.util.Iterator var17 = var15.enumerateAttributeNames();
    java.util.Iterator var18 = var15.enumeratePropertyNames();
    var9.loadFrom(var15);
    org.openstreetmap.gui.jmapviewer.Coordinate var20 = var9.getPosition();
    plugins.map.FreeMindMapController.PositionHolder var25 = new plugins.map.FreeMindMapController.PositionHolder(10.0d, 1.0d, 100);
    org.openstreetmap.gui.jmapviewer.Coordinate var26 = var25.getCoordinate();
    plugins.map.MapNodePositionHolder var27 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var28 = new freemind.main.XMLElement();
    java.lang.String var29 = var28.getTagName();
    java.util.Iterator var30 = var28.enumerateAttributeNames();
    java.util.Iterator var31 = var28.enumeratePropertyNames();
    var27.loadFrom(var28);
    freemind.main.XMLElement var33 = new freemind.main.XMLElement();
    java.lang.String var34 = var33.getTagName();
    java.util.Iterator var35 = var33.enumerateAttributeNames();
    java.util.Iterator var36 = var33.enumeratePropertyNames();
    var27.loadFrom(var33);
    org.openstreetmap.gui.jmapviewer.Coordinate var38 = var27.getPosition();
    java.lang.String var40 = plugins.map.FreeMindMapController.getLink("plugins.map.FreeMindMapController$MapQuestOpenMap", var26, var38, 200);
    var0.changePosition(var20, var38, 256, "false");

  }

}
