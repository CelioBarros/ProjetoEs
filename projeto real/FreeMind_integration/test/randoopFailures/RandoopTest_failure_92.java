package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_92 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_92.test1");


    plugins.collaboration.database.DatabaseConnectionHook var0 = new plugins.collaboration.database.DatabaseConnectionHook();
    var0.processUnfinishedLinks();
    var0.startupMapHook();

  }

}
