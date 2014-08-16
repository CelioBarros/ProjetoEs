package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_6 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_6.test1");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    var0.switchMeOff();
    var0.shutdownMapHook();

  }

}
