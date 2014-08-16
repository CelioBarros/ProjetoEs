package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_75 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_75.test1");


    plugins.collaboration.database.DatabaseStarter var0 = new plugins.collaboration.database.DatabaseStarter();
    plugins.collaboration.socket.MindMapMaster var1 = new plugins.collaboration.socket.MindMapMaster();
    var1.switchMeOff();
    var1.processUnfinishedLinks();
    freemind.modes.mindmapmode.actions.xml.ActionPair var4 = var1.getEmptyActionPair();
    freemind.modes.mindmapmode.actions.xml.ActionPair var5 = var0.filterAction(var4);
    var0.shutdownMapHook();

  }

}
