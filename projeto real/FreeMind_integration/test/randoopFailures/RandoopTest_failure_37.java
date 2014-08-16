package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_37 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_37.test1");


    plugins.collaboration.database.DatabaseConnector var0 = new plugins.collaboration.database.DatabaseConnector();
    plugins.collaboration.database.UpdateThread var1 = var0.getUpdateThread();
    var0.startupMapHook();

  }

}
