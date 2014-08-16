package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_90 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_90.test1");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    java.lang.String var2 = var1.getTagName();
    java.util.Iterator var3 = var1.enumerateAttributeNames();
    java.util.Iterator var4 = var1.enumeratePropertyNames();
    var0.loadFrom(var1);
    freemind.main.XMLElement var6 = new freemind.main.XMLElement();
    java.lang.String var7 = var6.getTagName();
    java.util.Iterator var8 = var6.enumerateAttributeNames();
    java.util.Iterator var9 = var6.enumeratePropertyNames();
    var0.loadFrom(var6);
    java.lang.String[] var11 = var0.getBarePosition();
    int var12 = var0.getZoom();
    var0.setName("-62135755137457");
    boolean var15 = var0.hasFoldedParents();

  }

}
