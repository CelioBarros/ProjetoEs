package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_59 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_59.test1");


    accessories.plugins.ImportMindmanagerFiles var0 = new accessories.plugins.ImportMindmanagerFiles();
    var0.startupMapHook();

  }

}
