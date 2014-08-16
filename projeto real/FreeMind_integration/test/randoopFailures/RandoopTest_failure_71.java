package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_71 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_71.test1");


    plugins.map.TileImage var0 = new plugins.map.TileImage();
    var0.load("");
    var0.load(".");

  }

}
