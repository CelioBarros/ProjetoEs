package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_9 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_9.test1");


    freemind.controller.filter.condition.ConditionFactory var0 = freemind.controller.filter.FilterController.getConditionFactory();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    java.lang.String var3 = var1.getStringAttribute("ToolBarUI");
    freemind.controller.filter.condition.Condition var4 = var0.loadCondition(var1);

  }

}
