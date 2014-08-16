package randoop;
import junit.framework.*;
import junit.textui.*;

public class RandoopTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public RandoopTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(RandoopTest0.class));
    result.addTest(new TestSuite(RandoopTest1.class));
    result.addTest(new TestSuite(RandoopTest2.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_1.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_2.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_3.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_4.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_5.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_6.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_7.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_8.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_9.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_10.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_11.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_12.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_13.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_14.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_15.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_16.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_17.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_18.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_19.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_20.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_21.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_22.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_23.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_24.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_25.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_26.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_27.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_28.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_29.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_30.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_31.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_32.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_33.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_34.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_35.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_36.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_37.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_38.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_39.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_40.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_41.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_42.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_43.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_44.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_45.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_46.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_47.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_48.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_49.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_50.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_51.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_52.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_53.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_54.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_55.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_56.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_57.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_58.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_59.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_60.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_61.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_62.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_63.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_64.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_65.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_66.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_67.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_68.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_69.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_70.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_71.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_72.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_73.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_74.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_75.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_76.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_77.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_78.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_79.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_80.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_81.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_82.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_83.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_84.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_85.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_86.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_87.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_88.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_89.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_90.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_91.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_92.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_93.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_94.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_95.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_96.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_97.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_98.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_99.class));
    return result;
  }

}
