package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_53 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_53.test1");


    accessories.plugins.ClonePlugin var0 = new accessories.plugins.ClonePlugin();
    var0.processUnfinishedLinks();

  }

}
