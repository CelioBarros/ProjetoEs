package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_95 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_95.test1");


    accessories.plugins.BlinkingNodeHook var0 = new accessories.plugins.BlinkingNodeHook();
    var0.shutdownMapHook();

  }

}
