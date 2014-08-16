package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_60 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_60.test1");


    accessories.plugins.time.ReminderHook var0 = new accessories.plugins.time.ReminderHook();
    var0.setRemindUserAt(10L);
    freemind.modes.common.plugins.ReminderHookBase.TimerBlinkTask var4 = var0.new TimerBlinkTask(false);
    var0.deregisterFilter();
    var0.registerFilter();
    var0.deregisterFilter();
    freemind.main.XMLElement var9 = new freemind.main.XMLElement(false);
    var0.save(var9);

  }

}
