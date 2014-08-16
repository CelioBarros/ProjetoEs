package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_8 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_8.test1");


    accessories.plugins.time.ReminderHook var0 = new accessories.plugins.time.ReminderHook();
    var0.setRemindUserAt(10L);
    var0.shutdownMapHook();

  }

}
