package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_19 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_19.test1");


    plugins.collaboration.database.DatabaseConnector var0 = new plugins.collaboration.database.DatabaseConnector();
    var0.shutdownMapHook();

  }

}
