package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_21 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_21.test1");


    plugins.collaboration.database.DatabaseConnector var0 = new plugins.collaboration.database.DatabaseConnector();
    java.lang.String var1 = var0.getHost();

  }

}
