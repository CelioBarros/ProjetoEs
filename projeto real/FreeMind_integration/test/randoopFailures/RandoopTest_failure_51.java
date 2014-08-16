package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_51 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_51.test1");


    plugins.map.SearchInMapForNodeTextAction var0 = new plugins.map.SearchInMapForNodeTextAction();
    plugins.map.Registration var1 = var0.getRegistration();

  }

}
