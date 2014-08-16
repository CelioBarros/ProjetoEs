package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_70 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_70.test1");


    accessories.plugins.ClonePasteAction.CloneProperties var0 = new accessories.plugins.ClonePasteAction.CloneProperties();
    var0.setCloneItself(true);
    accessories.plugins.ClonePlugin var3 = new accessories.plugins.ClonePlugin();
    var0.deregisterObserver((accessories.plugins.ClonePasteAction.ClonePropertiesObserver)var3);
    var3.shutdownMapHook();

  }

}
