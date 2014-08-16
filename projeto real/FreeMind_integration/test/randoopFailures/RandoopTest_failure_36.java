package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_36 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_36.test1");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    var0.recreateTooltip();

  }

}
