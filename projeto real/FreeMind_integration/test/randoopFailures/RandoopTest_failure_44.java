package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_44 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_44.test1");


    plugins.script.ScriptEditor var0 = new plugins.script.ScriptEditor();
    var0.startupMapHook();

  }

}
