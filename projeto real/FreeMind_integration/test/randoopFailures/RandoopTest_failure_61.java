package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_61 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_61.test1");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isMultiSelectionEnabled();
    java.io.FilenameFilter var2 = var0.getFilenameFilter();
    java.io.File var3 = var0.getSelectedFile();

  }

}
