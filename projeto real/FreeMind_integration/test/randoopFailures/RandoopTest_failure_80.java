package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_80 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_80.test1");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    java.lang.String var2 = var1.getTagName();
    java.util.Iterator var3 = var1.enumerateAttributeNames();
    java.util.Iterator var4 = var1.enumeratePropertyNames();
    var0.loadFrom(var1);
    java.lang.String var6 = var0.getNodeId();

  }

}
