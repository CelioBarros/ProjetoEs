package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_93 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_93.test1");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    freemind.modes.mindmapmode.actions.xml.ActionFactory var5 = new freemind.modes.mindmapmode.actions.xml.ActionFactory(var3);
    plugins.collaboration.socket.MindMapMaster var6 = new plugins.collaboration.socket.MindMapMaster();
    var6.switchMeOff();
    freemind.main.XMLElement var8 = new freemind.main.XMLElement();
    java.lang.String var9 = var8.getTagName();
    java.util.Iterator var10 = var8.enumerateAttributeNames();
    var6.save(var8);
    var5.registerFilter((freemind.modes.mindmapmode.actions.xml.ActionFilter)var6);
    plugins.collaboration.socket.MindMapMaster var14 = new plugins.collaboration.socket.MindMapMaster();
    var14.switchMeOff();
    var14.processUnfinishedLinks();
    freemind.modes.mindmapmode.actions.xml.ActionPair var17 = var14.getEmptyActionPair();
    freemind.controller.actions.generated.instance.XmlAction var18 = var17.getUndoAction();
    freemind.controller.actions.generated.instance.XmlAction var19 = var17.getDoAction();
    freemind.modes.mindmapmode.actions.xml.ActionPair var20 = var17.reverse();
    boolean var21 = var5.doTransaction("http://www.openstreetmap.org/copyright", var17);

  }

}
