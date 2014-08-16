package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_20 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_20.test1");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    var0.switchMeOff();
    var0.processUnfinishedLinks();
    var0.onUpdateNodeHook();
    java.lang.String var5 = var0.getResourceString("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png");

  }

}
