package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    accessories.plugins.SortNodes var0 = new accessories.plugins.SortNodes();

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    java.lang.String var1 = freemind.main.HtmlTools.extractHtmlBody("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var1 = freemind.main.Tools.xmlToPoint("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    java.lang.String var2 = freemind.main.Tools.compareText("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    java.lang.String var1 = freemind.main.Tools.getPrefix("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    java.lang.String var1 = freemind.main.HtmlTools.replaceSpacesToNonbreakableSpaces("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    java.lang.String[] var1 = new java.lang.String[] { ""};
    java.lang.String var2 = freemind.main.Tools.arrayToUrls(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var2.equals("file:/home/joao/workspace/\n"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    plugins.map.RemoveMapToNodeAction var0 = new plugins.map.RemoveMapToNodeAction();

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    freemind.preferences.layout.KeyEventWorkaround var0 = new freemind.preferences.layout.KeyEventWorkaround();

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    boolean var0 = freemind.main.Tools.isMacOsX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.controller.FreeMindToolBar var1 = new freemind.controller.FreeMindToolBar(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    java.lang.String var1 = freemind.main.HtmlTools.replaceSpacesToNonbreakableSpaces("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    freemind.preferences.layout.KeyEventTranslator.Key var1 = freemind.preferences.layout.KeyEventTranslator.parseKey("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    java.lang.String var1 = freemind.main.Tools.getExtension("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    plugins.script.ScriptEditorPanel.ScriptHolder var2 = new plugins.script.ScriptEditorPanel.ScriptHolder("", "hi!");
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)"hi!", (java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    java.lang.String var1 = freemind.main.HtmlTools.extractHtmlBody("file:/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var1.equals("file:/home/joao/workspace/\n"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    boolean var1 = freemind.main.HtmlTools.isHtmlNode("file:/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var3 = var1.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    java.lang.String var2 = freemind.main.Tools.expandPlaceholders("file:/home/joao/workspace/\n", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var2.equals("file:/home/joao/workspace/\n"));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var4 = var2.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    boolean var0 = freemind.main.Tools.isBelowJava6();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    accessories.plugins.EncryptNode var0 = new accessories.plugins.EncryptNode();

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    java.util.Collection var0 = freemind.controller.Controller.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    java.lang.String var1 = accessories.plugins.time.TimeList.getPureRegularExpression("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    java.lang.Object var3 = freemind.main.Tools.getField((java.lang.Object[])var1, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    freemind.main.Tools.setPermissions("", 292278994);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    plugins.map.FreeMindMapController.TileSourceStore[] var0 = plugins.map.FreeMindMapController.getmTileSources();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    accessories.plugins.ChangeRootNode var0 = new accessories.plugins.ChangeRootNode();

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setVerticalScrollBarPolicy(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    java.lang.String var1 = freemind.main.HtmlTools.makeValidXml("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    boolean var0 = freemind.main.Tools.isUnix();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    freemind.view.mindmapview.IndependantMapViewCreator var0 = new freemind.view.mindmapview.IndependantMapViewCreator();

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    java.lang.String var2 = freemind.main.Tools.expandPlaceholders("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

//  public void test35() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test35");
//
//
//    // The following exception was thrown during execution.
//    // This behavior will recorded for regression testing.
//    try {
//      int var2 = freemind.main.Tools.countOccurrences("hi!", "");
//      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
//      // Expected exception.
//    }
//
//  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    java.awt.datatransfer.Clipboard var6 = freemind.main.Tools.getClipboard();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkConnect("file:/home/joao/workspace/\n", 2014, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    javax.swing.plaf.ToolBarUI var4 = var2.getUI();
    javax.swing.InputMap var5 = var2.getInputMap();
    boolean var6 = var2.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    javax.swing.KeyStroke var1 = freemind.main.Tools.getKeyStroke("OSM MapQuest.Open Map");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    int var0 = freemind.view.mindmapview.NodeView.getFoldingSymbolWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 6);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    freemind.modes.StylePatternFactory var0 = new freemind.modes.StylePatternFactory();

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    java.lang.String var1 = freemind.preferences.layout.KeyEventTranslator.getSymbolicModifierName(292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "control"+ "'", var1.equals("control"));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    plugins.script.SignedScriptHandler var0 = new plugins.script.SignedScriptHandler();

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    java.lang.String var1 = freemind.main.HtmlTools.toXMLEscapedText("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    freemind.main.Resources var3 = freemind.main.Resources.getInstance();
    java.lang.String var5 = var3.getResourceString("");
    freemind.common.ColorProperty var6 = new freemind.common.ColorProperty("file:/home/joao/workspace/\n", "hi!", "file:/home/joao/workspace/\n", (freemind.common.TextTranslator)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setValue("ToolBarUI");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkLink("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkDelete("OSM MapQuest.Open Map");
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    freemind.controller.actions.generated.instance.Patterns var1 = freemind.modes.StylePatternFactory.getPatternsFromString("ToolBarUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    freemind.view.mindmapview.MindMapLayout var0 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    javax.swing.InputVerifier var5 = var3.getInputVerifier();
    var0.removeLayoutComponent((java.awt.Component)var3);
    boolean var7 = var3.isFloatable();
    boolean var8 = var3.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    java.lang.String var1 = freemind.main.HtmlTools.toXMLEscapedTextExpandingWhitespace("OSM MapQuest.Open Map");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    accessories.plugins.IconSelectionPlugin var0 = new accessories.plugins.IconSelectionPlugin();

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    freemind.controller.filter.condition.ConditionRenderer var0 = new freemind.controller.filter.condition.ConditionRenderer();

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    boolean var3 = var1.isUndecorated();
    var1.validate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setUndecorated(true);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    freemind.main.FreeMindStarter.ProxyAuthenticator var2 = new freemind.main.FreeMindStarter.ProxyAuthenticator("OSM MapQuest.Open Map", "ToolBarUI");

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    freemind.view.mindmapview.ConvexHull var0 = new freemind.view.mindmapview.ConvexHull();

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    byte[] var1 = freemind.main.Tools.uTF8StringToByteArray("file:/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    freemind.common.StringProperty var2 = new freemind.common.StringProperty("", "control");

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    javax.swing.plaf.ToolBarUI var4 = var2.getUI();
    javax.swing.InputMap var5 = var2.getInputMap();
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var7.revalidate();
    var7.addNotify();
    java.awt.event.WindowListener[] var10 = var7.getWindowListeners();
    freemind.view.mindmapview.MindMapLayout var11 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var14 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var14.requestFocus();
    javax.swing.InputVerifier var16 = var14.getInputVerifier();
    var11.removeLayoutComponent((java.awt.Component)var14);
    boolean var18 = var14.isFloatable();
    var7.setGlassPane((java.awt.Component)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var20 = var2.add((java.awt.Component)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    java.lang.String var1 = freemind.main.HtmlTools.makeValidXml("<a,23>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<a,23>"+ "'", var1.equals("<a,23>"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    freemind.extensions.HookAdapter var0 = new freemind.extensions.HookAdapter();

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    freemind.extensions.HookFactory.RegistrationContainer var0 = new freemind.extensions.HookFactory.RegistrationContainer();

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkListen(1);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    var0.enableInputMethods(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setVerticalScrollBarPolicy((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    java.lang.String var1 = freemind.main.HtmlTools.extractHtmlBody("control");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "control"+ "'", var1.equals("control"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.removeNotify();

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    java.lang.String var1 = freemind.main.HtmlTools.unescapeHTMLUnicodeEntity("OSM MapQuest.Open Map");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    accessories.plugins.time.JSpinField var2 = new accessories.plugins.time.JSpinField(10, 1);
    var2.setValue(292278994);
    java.awt.Component var5 = var2.getSpinner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    java.lang.String var1 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    java.lang.String var1 = freemind.main.HtmlTools.htmlToPlain("OSM MapQuest.Open Map");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    java.lang.String var1 = freemind.main.Tools.getExtension("OSM MapQuest.Open Map");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "open map"+ "'", var1.equals("open map"));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.setStartYear(10);
    var0.requestFocus();
    var0.disable();
    java.beans.VetoableChangeListener[] var6 = var0.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.requestFocus();
    int var4 = var2.getComponentCount();
    var2.addSeparator();
    accessories.plugins.time.JYearChooser var6 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var7 = var6.getMouseListeners();
    boolean var8 = var6.isDoubleBuffered();
    var6.hide();
    int var10 = var2.getComponentIndex((java.awt.Component)var6);
    java.awt.Point var11 = var6.getMousePosition();
    int var12 = var6.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    java.awt.Dimension var2 = var0.minimumSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setHorizontalAlignment((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.repaint(10L);
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var7.revalidate();
    var7.addNotify();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var10 = var2.add((java.awt.Component)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.lang.String var3 = var0.getResourceString("file:/home/joao/workspace/\n", "file:/home/joao/workspace/\n");
    java.lang.String var5 = var0.getText("hi!");
    boolean var7 = var0.getBoolProperty("");
    java.lang.String var8 = var0.getFreemindDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var3.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "."+ "'", var8.equals("."));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    boolean var2 = var0.isDoubleBuffered();
    var0.hide();
    int var4 = var0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2014);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.Window.Type var4 = var1.getType();
    var1.setTitle(".");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    freemind.modes.attributes.Attribute var2 = new freemind.modes.attributes.Attribute("hi!", "hi!");
    java.lang.String var3 = var2.getValue();
    var2.setName("control");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.net.URL var2 = var0.getResource("file:/home/joao/workspace/\n");
    java.lang.String var4 = var0.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var6 = var0.createTranslatedString("");
    java.lang.Object var7 = var6.getObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("hi!");
    var3.checkSystemClipboardAccess();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkRead("http://openstreetmap.org/");
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    java.awt.Shape var3 = var1.getShape();
    boolean var4 = var1.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.awt.Point var7 = var0.location();
    javax.swing.JViewport var8 = var0.getRowHeader();
    javax.swing.JViewport var9 = var0.getRowHeader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    accessories.plugins.time.JSpinField var0 = new accessories.plugins.time.JSpinField();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var2 = var0.getInputMap(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setVerticalAlignment(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    boolean var3 = var1.isUndecorated();
    var1.validate();
    var1.list();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.applyResourceBundle("http://openstreetmap.org/");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    accessories.plugins.ExportToImage var0 = new accessories.plugins.ExportToImage();

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = freemind.main.Tools.xmlToColor("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    java.lang.String var0 = freemind.modes.MindIcon.getIconsPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "images/icons/"+ "'", var0.equals("images/icons/"));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.requestFocus();
    int var4 = var2.getComponentCount();
    java.awt.Insets var5 = var2.getMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkAccept("OSM MapQuest.Open Map", 6);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setDefaultCloseOperation(256);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    freemind.common.NamedObject var1 = freemind.common.NamedObject.literal("images/icons/");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    javax.swing.plaf.ToolBarUI var4 = var2.getUI();
    freemind.controller.FreeMindToolBar var7 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var7.updateUI();
    var7.setIgnoreRepaint(false);
    var7.setVisible(false);
    boolean var13 = var2.isAncestorOf((java.awt.Component)var7);
    var2.firePropertyChange("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n", (byte)10, (byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.Window.Type var4 = var1.getType();
    java.util.Locale var5 = var1.getLocale();
    var1.repaint(0L, 10, 20, 292278994, 256);
    accessories.plugins.time.JMonthChooser var12 = new accessories.plugins.time.JMonthChooser();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.main.Tools.setDialogLocationRelativeTo((javax.swing.JDialog)var1, (java.awt.Component)var12);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    freemind.controller.filter.condition.Condition var0 = freemind.controller.filter.condition.NoFilteringCondition.createCondition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.setFocusableWindowState(true);
    java.awt.Component var6 = var1.getGlassPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var1 = var0.getCalendar();
    java.util.Date var2 = var0.getMaxSelectableDate();
    freemind.controller.FreeMindToolBar var5 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var6 = var5.isLightweight();
    int var7 = var5.getWidth();
    var5.addNotify();
    freemind.common.FreeMindProgressMonitor var10 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var5, (java.lang.Object)"file:/home/joao/workspace/\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    javax.swing.KeyStroke var1 = freemind.main.Tools.getKeyStroke("ToolBarUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    java.lang.String var1 = freemind.main.Tools.getExtension("images/icons/hi!.png");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "png"+ "'", var1.equals("png"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.requestFocus();
    int var4 = var2.getComponentCount();
    var2.addSeparator();
    accessories.plugins.time.JYearChooser var6 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var7 = var6.getMouseListeners();
    boolean var8 = var6.isDoubleBuffered();
    var6.hide();
    int var10 = var2.getComponentIndex((java.awt.Component)var6);
    java.awt.Container var11 = var2.getFocusCycleRootAncestor();
    var2.setFloatable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var2 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var3 = var2.getName();
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)var0, (java.lang.Object)var3);
    freemind.view.mindmapview.MindMapLayout var5 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var8 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var8.requestFocus();
    javax.swing.InputVerifier var10 = var8.getInputVerifier();
    var5.removeLayoutComponent((java.awt.Component)var8);
    freemind.controller.FreeMindToolBar var14 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var14.requestFocus();
    boolean var16 = var14.isFocusable();
    java.lang.Object var17 = var14.getTreeLock();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.replace((java.lang.Object)var5, (java.lang.Object)var14);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    freemind.controller.FreeMindToolBar var6 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var7 = var6.isLightweight();
    int var8 = var6.getWidth();
    var6.list();
    javax.swing.plaf.ToolBarUI var10 = var6.getUI();
    var2.setUI(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.requestFocus();
    int var4 = var2.getComponentCount();
    var2.addSeparator();
    accessories.plugins.time.JYearChooser var6 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var7 = var6.getMouseListeners();
    boolean var8 = var6.isDoubleBuffered();
    var6.hide();
    int var10 = var2.getComponentIndex((java.awt.Component)var6);
    java.awt.Container var11 = var2.getFocusCycleRootAncestor();
    java.util.Set var13 = freemind.main.Tools.getAvailableFontFamilyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFocusTraversalKeys(1, var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    boolean var1 = de.foltin.StringEncoder.isValidXMLChar('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    java.lang.String var1 = freemind.main.HtmlTools.toXMLEscapedText("png");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "png"+ "'", var1.equals("png"));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    accessories.plugins.time.JSpinField var2 = new accessories.plugins.time.JSpinField(10, 1);
    var2.setValue(292278994);
    java.awt.event.ContainerListener[] var5 = var2.getContainerListeners();
    java.awt.Dimension var6 = var2.getMinimumSize();
    accessories.plugins.time.TimeManagement var8 = new accessories.plugins.time.TimeManagement();
    var2.removePropertyChangeListener("file:/home/joao/workspace/\n", (java.beans.PropertyChangeListener)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    int var2 = plugins.script.ScriptingEngine.findLineNumberInString("ButtonUI", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    javax.swing.plaf.ToolBarUI var4 = var2.getUI();
    javax.swing.InputMap var5 = var2.getInputMap();
    int var6 = var2.getOrientation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.net.URL var2 = var0.getResource("file:/home/joao/workspace/\n");
    java.lang.String var4 = var0.getProperty("OSM MapQuest.Open Map");
    int var7 = var0.getIntProperty("control", (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-2147483648));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    plugins.map.ShowMapToNodeAction var0 = new plugins.map.ShowMapToNodeAction();
    var0.shutdownMapHook();

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    plugins.script.SignedScriptHandler.ScriptContents var1 = new plugins.script.SignedScriptHandler.ScriptContents("images/icons/");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "images/icons///SIGN:null\n"+ "'", var2.equals("images/icons///SIGN:null\n"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    java.lang.String var0 = freemind.main.Tools.getFreeMindBasePath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "/home/joao/workspace/FreeMind_integration/bin/classes/"+ "'", var0.equals("/home/joao/workspace/FreeMind_integration/bin/classes/"));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    boolean var18 = var8.isContentAreaFilled();
    int var19 = var8.getHorizontalTextPosition();
    javax.swing.Icon var20 = var8.getPressedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    accessories.plugins.RemoveNote var0 = new accessories.plugins.RemoveNote();

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    boolean var4 = var0.getAppliesToNodeIcon();
    var0.setNodeFontSize((java.lang.Integer)(-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    freemind.controller.actions.generated.instance.Pattern var1 = freemind.modes.StylePatternFactory.getPatternFromString("ToolBarUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    freemind.main.FreeMindStarter.ProxyAuthenticator var2 = new freemind.main.FreeMindStarter.ProxyAuthenticator("<a,23>", "<a,23>");

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    java.util.Vector var1 = freemind.main.Tools.urlStringToUrls("hi!");
    freemind.controller.filter.util.ExtendedComboBoxModel var2 = new freemind.controller.filter.util.ExtendedComboBoxModel(var1);
    var2.removeElementAt(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    java.lang.String var1 = var0.getTagName();
    java.util.Iterator var2 = var0.enumerateAttributeNames();
    char[] var3 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parseCharArray(var3, 20, 200, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    freemind.preferences.layout.KeyEventTranslator var0 = new freemind.preferences.layout.KeyEventTranslator();

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    javax.swing.JRootPane var3 = var0.getRootPane();
    accessories.plugins.time.JDayChooser var4 = var0.getDayChooser();
    var4.transferFocusBackward();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.addListeners(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    var8.setDisplayedMnemonicIndex(1);
    int var11 = var8.getMnemonic();
    java.lang.String var12 = var8.getText();
    int var13 = var8.getDisplayedMnemonicIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "16"+ "'", var12.equals("16"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    javax.swing.JDialog.setDefaultLookAndFeelDecorated(false);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    freemind.modes.MindIcon var1 = freemind.modes.MindIcon.factory("hi!");
    java.lang.String var2 = var1.getIconFileName();
    accessories.plugins.time.TimeManagement var3 = new accessories.plugins.time.TimeManagement();
    var3.numberOfOpenMapInformation(1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var1.compareTo((java.lang.Object)1);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "images/icons/hi!.png"+ "'", var2.equals("images/icons/hi!.png"));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    int var2 = var0.getWinX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    freemind.controller.FreeMindToolBar var10 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var10.updateUI();
    var10.setIgnoreRepaint(false);
    java.awt.Dimension var14 = var10.getPreferredSize();
    var5.setSize(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var2 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var3 = var2.getName();
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)var0, (java.lang.Object)var3);
    freemind.common.NamedObject var6 = freemind.common.NamedObject.literal("png");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.lang.Object)var6);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    freemind.modes.attributes.Attribute var2 = new freemind.modes.attributes.Attribute("hi!", "hi!");
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    freemind.preferences.layout.KeyEventTranslator.Key var3 = new freemind.preferences.layout.KeyEventTranslator.Key("", 10, '#');
    java.lang.String var4 = var3.toString();
    freemind.preferences.layout.KeyEventTranslator.Key var8 = new freemind.preferences.layout.KeyEventTranslator.Key("ToolBarUI", 0, '#');
    freemind.preferences.layout.KeyEventTranslator.addTranslation(var3, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<a,23>"+ "'", var4.equals("<a,23>"));

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.view.mindmapview.MapView.ScrollPane var4 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var5 = var4.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var6 = new accessories.plugins.time.JTripleCalendar();
    boolean var7 = var6.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var8 = var6.getDayChooser();
    java.awt.Color var9 = var8.getSundayForeground();
    var4.setColumnHeaderView((java.awt.Component)var8);
    java.awt.Point var11 = var4.location();
    boolean var12 = var1.isAncestorOf((java.awt.Component)var4);
    javax.swing.JViewport var13 = var4.getViewport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    java.lang.String var1 = freemind.main.Tools.firstLetterCapitalized("png");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Png"+ "'", var1.equals("Png"));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    freemind.main.Tools var0 = new freemind.main.Tools();

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    freemind.controller.filter.util.SortedMapListModel var0 = new freemind.controller.filter.util.SortedMapListModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    java.lang.String var1 = freemind.main.Tools.getFileNameFromRestorable("http://openstreetmap.org/");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "//openstreetmap.org/"+ "'", var1.equals("//openstreetmap.org/"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    accessories.plugins.time.TimeManagement var0 = new accessories.plugins.time.TimeManagement();
    var0.numberOfOpenMapInformation(20, 100);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    int var2 = var0.getTileSize();
    java.lang.String var3 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 256);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    freemind.modes.browsemode.BrowseMode var0 = new freemind.modes.browsemode.BrowseMode();
    var0.activate();
    freemind.controller.Controller var2 = var0.getController();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    freemind.modes.common.dialogs.EnterPasswordDialog var0 = new freemind.modes.common.dialogs.EnterPasswordDialog();
    java.lang.StringBuffer var1 = var0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var1 = freemind.main.Tools.xmlToPoint("images/icons///SIGN:null\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    plugins.map.TileImage var0 = new plugins.map.TileImage();
    boolean var1 = var0.hasErrors();
    boolean var2 = var0.hasErrors();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    accessories.plugins.time.JYearChooser var8 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var9 = var8.getUI();
    var8.setStartYear(10);
    int var12 = var8.getMaximum();
    var8.validate();
    java.awt.Component var15 = var1.add((java.awt.Component)var8, (-1));
    java.awt.im.InputMethodRequests var16 = var15.getInputMethodRequests();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    freemind.main.Tools.IntHolder var0 = new freemind.main.Tools.IntHolder();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "IntHolder(0)"+ "'", var1.equals("IntHolder(0)"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var2.isDecorationBordersVisible();
    var2.revalidate();
    java.awt.Point var5 = var2.location();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    accessories.plugins.UnfoldAll var0 = new accessories.plugins.UnfoldAll();

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    freemind.modes.MindIcon var2 = freemind.modes.MindIcon.factory("hi!");
    java.lang.String var3 = var2.getIconFileName();
    var0.setNodeIcon(var2);
    java.lang.String var5 = var2.getIconFileName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "images/icons/hi!.png"+ "'", var3.equals("images/icons/hi!.png"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "images/icons/hi!.png"+ "'", var5.equals("images/icons/hi!.png"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    freemind.common.DontShowNotificationProperty var2 = new freemind.common.DontShowNotificationProperty("file:/home/joao/workspace/\n", "OSM MapQuest.Open Map");
    java.lang.String var3 = var2.getLabel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setValue("/home/joao/workspace/FreeMind_integration/bin/classes/");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    freemind.common.NamedObject var1 = freemind.common.NamedObject.literal("png");
    java.lang.Object var2 = var1.getObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "png"+ "'", var2.equals("png"));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    java.util.Vector var1 = freemind.main.Tools.urlStringToUrls("hi!");
    freemind.controller.filter.util.ExtendedComboBoxModel var2 = new freemind.controller.filter.util.ExtendedComboBoxModel(var1);
    var2.removeAllElements();
    freemind.view.mindmapview.MapView.ScrollPane var4 = new freemind.view.mindmapview.MapView.ScrollPane();
    var2.addSortedElement((java.lang.Object)var4);
    plugins.map.FreeMindMapController.MapQuestOpenMap var6 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var6.getTermsOfUseText();
    var6.setTermsOfUseText("control");
    var2.removeElement((java.lang.Object)"control");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "OSM MapQuest.Open Map"+ "'", var7.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    accessories.plugins.time.RemoveReminderHook var0 = new accessories.plugins.time.RemoveReminderHook();

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    int var4 = var2.getWidth();
    var2.addNotify();
    var2.setRollover(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    java.util.HashMap var1 = freemind.extensions.HookInstanciationMethod.getAllInstanciationMethods();
    java.lang.String var3 = freemind.main.Tools.generateID("ToolBarUI", var1, "<a,23>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "ToolBarUI"+ "'", var3.equals("ToolBarUI"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    freemind.view.mindmapview.LeftNodeViewLayout var0 = new freemind.view.mindmapview.LeftNodeViewLayout();
    freemind.common.FreeMindProgressMonitor var2 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var2.revalidate();
    var2.addNotify();
    var2.hide();
    var2.setResizable(false);
    var0.removeLayoutComponent((java.awt.Component)var2);
    freemind.common.FreeMindProgressMonitor var10 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var11 = var10.getInputMethodListeners();
    var10.show();
    java.awt.Window.Type var13 = var10.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setType(var13);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    boolean var1 = freemind.main.Tools.isAbsolutePath("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.view.mindmapview.MapView.ScrollPane var4 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var5 = var4.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var6 = new accessories.plugins.time.JTripleCalendar();
    boolean var7 = var6.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var8 = var6.getDayChooser();
    java.awt.Color var9 = var8.getSundayForeground();
    var4.setColumnHeaderView((java.awt.Component)var8);
    java.awt.Point var11 = var4.location();
    boolean var12 = var1.isAncestorOf((java.awt.Component)var4);
    javax.accessibility.AccessibleContext var13 = var4.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    freemind.main.Tools.addFocusPrintTimer();

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.main.FreeMindMain.VersionInformation var1 = new freemind.main.FreeMindMain.VersionInformation("0;0;");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    char[] var1 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parseCharArray(var1, (-2147483648), 292278994, 292278994);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    freemind.common.DontShowNotificationProperty var2 = new freemind.common.DontShowNotificationProperty("file:/home/joao/workspace/\n", "OSM MapQuest.Open Map");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setValue("open map");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    accessories.plugins.time.TimeManagement var0 = new accessories.plugins.time.TimeManagement();
    var0.numberOfOpenMapInformation(1, 100);
    var0.numberOfOpenMapInformation(292278994, (-1));
    var0.numberOfOpenMapInformation((-2147483648), 292278994);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    accessories.plugins.time.JYearChooser var3 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var4 = var3.getMouseListeners();
    var3.repaint(100L, 1, (-1), 100, 1);
    var2.setYearChooser(var3);
    accessories.plugins.time.JTripleCalendar var12 = new accessories.plugins.time.JTripleCalendar();
    boolean var13 = var12.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var14 = var12.getDayChooser();
    java.awt.Color var15 = var14.getSundayForeground();
    var2.setDecorationBackgroundColor(var15);
    float var17 = var2.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.5f);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.main.Resources.createInstance((freemind.main.FreeMindMain)var0);
    java.io.File var3 = var0.getPatternsFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    boolean var1 = freemind.main.HtmlTools.isXMLValidCharacter('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    java.lang.String var1 = freemind.main.HtmlTools.unescapeHTMLUnicodeEntity("png");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "png"+ "'", var1.equals("png"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    freemind.main.FreeMindMain.VersionInformation var5 = new freemind.main.FreeMindMain.VersionInformation(10, 1, 30, 200, 256);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    freemind.modes.schememode.SchemeMode var0 = new freemind.modes.schememode.SchemeMode();
    freemind.modes.ModeController var1 = var0.getDefaultModeController();
    var0.restore("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    freemind.common.SeparatorProperty var1 = new freemind.common.SeparatorProperty("keystroke_icon_hi!");

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    java.awt.Color var3 = var2.getSundayForeground();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var5.addNotify();
    var5.show();
    accessories.plugins.util.window.WindowClosingAdapter var9 = new accessories.plugins.util.window.WindowClosingAdapter();
    var5.removeWindowStateListener((java.awt.event.WindowStateListener)var9);
    accessories.plugins.time.JTripleCalendar var11 = new accessories.plugins.time.JTripleCalendar();
    boolean var12 = var11.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var13 = var11.getDayChooser();
    javax.swing.JRootPane var14 = var11.getRootPane();
    accessories.plugins.time.JDayChooser var15 = var11.getDayChooser();
    java.awt.event.HierarchyListener[] var16 = var11.getHierarchyListeners();
    var5.addPropertyChangeListener((java.beans.PropertyChangeListener)var11);
    freemind.controller.filter.util.SortedComboBoxModel var20 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var21 = var20.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var22 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var23 = var22.getName();
    boolean var24 = freemind.main.Tools.safeEquals((java.lang.Object)var20, (java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.modes.mindmapmode.attributeactors.ListDialog.showDialog((java.awt.Component)var2, (java.awt.Component)var5, "open map", "ToolBarUI", (freemind.controller.filter.util.SortedListModel)var20, "ToolBarUI");
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "OSM MapQuest.Open Map"+ "'", var23.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    freemind.view.mindmapview.MindMapLayout var0 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    javax.swing.InputVerifier var5 = var3.getInputVerifier();
    var0.removeLayoutComponent((java.awt.Component)var3);
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    var0.removeLayoutComponent((java.awt.Component)var7);
    var7.paintImmediately(100, 1, 0, (-1));
    var7.setToolTipText("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    var0.disable();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    var0.setCalendar(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    freemind.controller.filter.util.ExtendedComboBoxModel var0 = new freemind.controller.filter.util.ExtendedComboBoxModel();

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    javax.swing.JPopupMenu.setDefaultLightWeightPopupEnabled(true);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.main.Resources.createInstance((freemind.main.FreeMindMain)var0);
    java.awt.Component var3 = var0.getGlassPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.preferences.layout.KeyEventTranslator.setModifierMapping(7, 11, 11, 2014);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    boolean var18 = var8.isContentAreaFilled();
    java.awt.Insets var19 = var8.getMargin();
    accessories.plugins.time.JTripleCalendar var20 = new accessories.plugins.time.JTripleCalendar();
    boolean var21 = var20.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var22 = var20.getDayChooser();
    accessories.plugins.time.JYearChooser var23 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var24 = var23.getMouseListeners();
    var23.repaint(100L, 1, (-1), 100, 1);
    var22.setYearChooser(var23);
    var22.enable();
    var8.addKeyListener((java.awt.event.KeyListener)var22);
    boolean var34 = var22.isMaximumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    java.lang.String var1 = freemind.main.Tools.getFileNameFromRestorable("file:/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "/home/joao/workspace/\n"+ "'", var1.equals("/home/joao/workspace/\n"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getAttributionLinkURL();
    java.lang.String var2 = plugins.map.FreeMindMapController.getTileSourceName((org.openstreetmap.gui.jmapviewer.interfaces.TileSource)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://openstreetmap.org/"+ "'", var1.equals("http://openstreetmap.org/"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "plugins.map.FreeMindMapController$MapQuestOpenMap"+ "'", var2.equals("plugins.map.FreeMindMapController$MapQuestOpenMap"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    java.lang.String var0 = freemind.main.Tools.getUserName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "joao@BetelgeuseLX"+ "'", var0.equals("joao@BetelgeuseLX"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    var4.setAlwaysFireDayProperty(true);
    freemind.common.FreeMindProgressMonitor var10 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var11 = var10.getInputMethodListeners();
    var10.show();
    java.lang.String var13 = var10.getTitle();
    freemind.common.FreeMindProgressMonitor var15 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var15.revalidate();
    var15.addNotify();
    var15.setFocusTraversalPolicyProvider(false);
    java.awt.Point var20 = var15.location();
    var10.setLocation(var20);
    java.awt.Point var22 = var4.getLocation(var20);
    java.lang.String var23 = freemind.main.Tools.PointToXml(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var13.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "0;0;"+ "'", var23.equals("0;0;"));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.awt.Color var1 = var0.getDecorationBackgroundColor();
    freemind.view.mindmapview.MapView.ScrollPane var2 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var3 = var2.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var4 = new accessories.plugins.time.JTripleCalendar();
    boolean var5 = var4.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var6 = var4.getDayChooser();
    java.awt.Color var7 = var6.getSundayForeground();
    var2.setColumnHeaderView((java.awt.Component)var6);
    java.util.Locale var9 = var6.getLocale();
    javax.swing.JButton var10 = var6.getSelectedDay();
    freemind.view.mindmapview.MapView.ScrollPane var11 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var12 = var11.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var13 = new accessories.plugins.time.JTripleCalendar();
    boolean var14 = var13.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var15 = var13.getDayChooser();
    java.awt.Color var16 = var15.getSundayForeground();
    var11.setColumnHeaderView((java.awt.Component)var15);
    java.util.Locale var18 = var15.getLocale();
    javax.swing.JButton var19 = var15.getSelectedDay();
    java.lang.String var20 = var19.getUIClassID();
    freemind.common.FreeMindProgressMonitor var22 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var22.revalidate();
    var22.addNotify();
    var22.setFocusTraversalPolicyProvider(false);
    java.awt.Point var27 = var22.location();
    boolean var28 = var19.contains(var27);
    boolean var29 = var19.isContentAreaFilled();
    java.awt.Insets var30 = var19.getMargin();
    var10.setMargin(var30);
    freemind.controller.FreeMindToolBar var34 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var35 = var34.isLightweight();
    int var36 = var34.getWidth();
    var34.list();
    freemind.controller.FreeMindToolBar var40 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var40.updateUI();
    var40.setIgnoreRepaint(false);
    javax.swing.Action var44 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var45 = var40.add(var44);
    javax.swing.JButton var46 = var34.add(var44);
    var46.setIconTextGap(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var10, (java.lang.Object)10, 2014);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "ButtonUI"+ "'", var20.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    freemind.modes.browsemode.BrowseHookFactory var0 = new freemind.modes.browsemode.BrowseHookFactory();
    java.util.List var1 = var0.getRegistrations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.setStartYear(10);
    var0.requestFocus();
    var0.disable();
    boolean var6 = var0.isFocusable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    boolean var18 = var8.isContentAreaFilled();
    freemind.view.mindmapview.MindMapLayout var19 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var22 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var22.requestFocus();
    javax.swing.InputVerifier var24 = var22.getInputVerifier();
    var19.removeLayoutComponent((java.awt.Component)var22);
    var8.setLayout((java.awt.LayoutManager)var19);
    boolean var27 = var8.isBorderPainted();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var1 = var0.getCalendar();
    freemind.controller.FreeMindToolBar var4 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var4.updateUI();
    var4.setIgnoreRepaint(false);
    java.awt.Dimension var8 = var4.getSize();
    var0.setMaximumSize(var8);
    var0.setMaxDayCharacters(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.dnd.DropTarget var4 = var1.getDropTarget();
    javax.swing.JMenuBar var5 = var1.getJMenuBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    freemind.view.mindmapview.SharpBezierEdgeView var0 = new freemind.view.mindmapview.SharpBezierEdgeView();

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.hide();
    java.awt.Container var5 = var1.getFocusCycleRootAncestor();
    freemind.view.mindmapview.LeftNodeViewLayout var6 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var1.setLayout((java.awt.LayoutManager)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.show();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    java.lang.String var1 = freemind.main.Tools.BooleanToXml(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    java.awt.Component var3 = var1.getFocusOwner();
    boolean var4 = var1.isFocused();
    freemind.controller.filter.condition.JCondition var5 = new freemind.controller.filter.condition.JCondition();
    var1.setContentPane((java.awt.Container)var5);
    java.awt.Dimension var7 = var5.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.preferences.layout.KeyEventTranslator.setModifierMapping(20, (-2147483648), 30, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    java.util.Vector var1 = freemind.main.Tools.urlStringToUrls("hi!");
    freemind.controller.filter.util.ExtendedComboBoxModel var2 = new freemind.controller.filter.util.ExtendedComboBoxModel(var1);
    var2.removeAllElements();
    int var4 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.modes.mindmapmode.hooks.MindMapHookFactory var2 = new freemind.modes.mindmapmode.hooks.MindMapHookFactory((freemind.main.FreeMindMain)var0);
    java.util.logging.Logger var4 = var0.getLogger("keystroke_icon_hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.setFocusTraversalPolicyProvider(false);
    java.awt.Point var6 = var1.location();
    var1.setAutoRequestFocus(false);
    freemind.common.FreeMindProgressMonitor var10 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var10.revalidate();
    var10.addNotify();
    var10.show();
    accessories.plugins.util.window.WindowClosingAdapter var14 = new accessories.plugins.util.window.WindowClosingAdapter();
    var10.removeWindowStateListener((java.awt.event.WindowStateListener)var14);
    var1.addWindowFocusListener((java.awt.event.WindowFocusListener)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.lang.String var2 = var0.getResourceString("");
    java.lang.String var4 = var0.getText("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]");
    freemind.controller.filter.condition.ConditionFactory var6 = freemind.controller.filter.FilterController.getConditionFactory();
    freemind.common.NamedObject[] var7 = var6.getAttributeConditionNames();
    java.lang.String var8 = var0.format("ToolBarUI", (java.lang.Object[])var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]"+ "'", var4.equals("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "ToolBarUI"+ "'", var8.equals("ToolBarUI"));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.Window.Type var4 = var1.getType();
    java.lang.String var5 = var1.getTitle();
    var1.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var5.equals("file:/home/joao/workspace/\n"));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    freemind.controller.filter.condition.AttributeNotExistsCondition var3 = new freemind.controller.filter.condition.AttributeNotExistsCondition("ToolBarUI");
    var0.setAttribute("ButtonUI", (java.lang.Object)"ToolBarUI");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var0.getProperty("ButtonUI", 7);
      fail("Expected exception of type freemind.main.XMLParseException");
    } catch (freemind.main.XMLParseException e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    java.lang.String[] var3 = new java.lang.String[] { "file:/home/joao/workspace/\n"};
    freemind.main.ExampleFileFilter var4 = new freemind.main.ExampleFileFilter(var3);
    freemind.main.XMLElement var7 = new freemind.main.XMLElement();
    java.lang.String var8 = var7.getTagName();
    java.util.Iterator var9 = var7.enumerateAttributeNames();
    java.util.Vector var11 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var12 = new freemind.modes.StylePattern(var7, (java.util.List)var11);
    freemind.common.FreeMindProgressMonitor var14 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var14.dispose();
    java.util.Vector var17 = freemind.main.Tools.urlStringToUrls("hi!");
    var14.setIconImages((java.util.List)var17);
    freemind.common.ComboProperty var19 = new freemind.common.ComboProperty("", "file:/home/joao/workspace/\n", (java.util.List)var11, (java.util.List)var17);
    freemind.common.ComboProperty var20 = new freemind.common.ComboProperty(".", "//openstreetmap.org/", var3, (java.util.List)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.main.Tools.swapVectorPositions(var11, 11, 200);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    accessories.plugins.ChangeNodeLevelAction var0 = new accessories.plugins.ChangeNodeLevelAction();
    java.net.URL var2 = var0.getResource("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("hi!");
    var3.checkLink(".");
    var3.checkPackageAccess(".");

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.hide();
    java.awt.Container var5 = var1.getFocusCycleRootAncestor();
    freemind.view.mindmapview.LeftNodeViewLayout var6 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var1.setLayout((java.awt.LayoutManager)var6);
    freemind.main.FreeMindApplet var8 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var9 = var8.getResources();
    freemind.main.Resources.createInstance((freemind.main.FreeMindMain)var8);
    var6.removeLayoutComponent((java.awt.Component)var8);
    var8.setProperty("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]", "plugins.map.FreeMindMapController$MapQuestOpenMap");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    var0.switchMeOff();
    java.lang.String var2 = var0.getUsers();
    var0.clearLock();
    java.lang.String var4 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "joao@BetelgeuseLX"+ "'", var2.equals("joao@BetelgeuseLX"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.Window.Type var4 = var1.getType();
    boolean var5 = var1.getFocusableWindowState();
    java.awt.Window var6 = var1.getOwner();
    java.awt.Window[] var7 = var6.getOwnedWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    java.lang.String var1 = freemind.preferences.layout.KeyEventTranslator.getSymbolicModifierName(2014);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "control"+ "'", var1.equals("control"));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    java.lang.String var2 = var0.getStringAttribute("ToolBarUI");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parseString("ButtonUI", 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    boolean var18 = var8.isContentAreaFilled();
    java.awt.Insets var19 = var8.getMargin();
    javax.swing.ButtonModel var20 = var8.getModel();
    freemind.main.Tools.setLabelAndMnemonic((javax.swing.AbstractButton)var8, ".");
    int var23 = var8.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    boolean var6 = var0.getRecursive();
    var0.setEdgeWidth((java.lang.Integer)30);
    var0.setNodeFontItalic((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.border.Border var7 = var4.getBorder();
    boolean var8 = var4.isPaintingForPrint();
    var4.setYear(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.JViewport var7 = var0.getColumnHeader();
    javax.swing.JPopupMenu var8 = var0.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    boolean var6 = var2.isApplet();
    accessories.plugins.time.JCalendar var7 = new accessories.plugins.time.JCalendar();
    java.awt.Color var8 = var7.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var9 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var10 = var9.getCalendar();
    java.util.Date var11 = var9.getMaxSelectableDate();
    var7.setDate(var11);
    accessories.plugins.time.JDayChooser var13 = var7.getDayChooser();
    var2.setContentPane((java.awt.Container)var7);
    var7.setDecorationBordersVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    accessories.plugins.dialogs.EnterPasswordDialog var0 = new accessories.plugins.dialogs.EnterPasswordDialog();
    freemind.common.FreeMindProgressMonitor var3 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var4 = var3.getInputMethodListeners();
    javax.accessibility.AccessibleContext var5 = var3.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var7.revalidate();
    var3.setLocationRelativeTo((java.awt.Component)var7);
    boolean var10 = var3.isValidateRoot();
    accessories.plugins.time.JCalendar var11 = new accessories.plugins.time.JCalendar();
    java.awt.Color var12 = var11.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var13 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var14 = var13.getCalendar();
    java.util.Date var15 = var13.getMaxSelectableDate();
    var11.setDate(var15);
    var11.setWeekOfYearVisible(true);
    var3.addPropertyChangeListener((java.beans.PropertyChangeListener)var11);
    accessories.plugins.time.JCalendar var20 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var21 = var20.getCalendar();
    java.util.Date var22 = var20.getMaxSelectableDate();
    var11.setMinSelectableDate(var22);
    accessories.plugins.time.JCalendar var25 = new accessories.plugins.time.JCalendar(var22, false);
    accessories.plugins.time.JTripleCalendar var26 = new accessories.plugins.time.JTripleCalendar();
    boolean var27 = var26.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var28 = var26.getDayChooser();
    javax.swing.JRootPane var29 = var26.getRootPane();
    accessories.plugins.time.JDayChooser var30 = var26.getDayChooser();
    java.util.Locale var31 = var26.getLocale();
    accessories.plugins.time.JCalendar var34 = new accessories.plugins.time.JCalendar(var22, var31, true, true);
    var0.addPropertyChangeListener("keystroke_icon_hi!", (java.beans.PropertyChangeListener)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    boolean var1 = var0.isActive();
    boolean var2 = var0.isFocusable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    boolean var18 = var8.isContentAreaFilled();
    freemind.view.mindmapview.MindMapLayout var19 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var22 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var22.requestFocus();
    javax.swing.InputVerifier var24 = var22.getInputVerifier();
    var19.removeLayoutComponent((java.awt.Component)var22);
    var8.setLayout((java.awt.LayoutManager)var19);
    boolean var27 = var8.isSelected();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setVerticalAlignment(2014);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    boolean var18 = var8.isContentAreaFilled();
    javax.swing.Icon var19 = var8.getDisabledIcon();
    var8.setContentAreaFilled(true);
    boolean var22 = var8.isSelected();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.dispose();
    java.util.Vector var4 = freemind.main.Tools.urlStringToUrls("hi!");
    var1.setIconImages((java.util.List)var4);
    boolean var6 = var1.isAutoRequestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.setIgnoreRepaint(false);
    java.awt.Dimension var6 = var2.getSize();
    var2.setLocation(10, 0);
    boolean var10 = var2.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    freemind.main.XMLElement var2 = new freemind.main.XMLElement();
    java.lang.String var3 = var2.getTagName();
    java.util.Iterator var4 = var2.enumerateAttributeNames();
    java.util.Vector var6 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var7 = new freemind.modes.StylePattern(var2, (java.util.List)var6);
    freemind.main.XMLElement var10 = new freemind.main.XMLElement();
    java.lang.String var11 = var10.getTagName();
    java.util.Iterator var12 = var10.enumerateAttributeNames();
    java.util.Vector var14 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var15 = new freemind.modes.StylePattern(var10, (java.util.List)var14);
    freemind.common.FreeMindProgressMonitor var17 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var17.dispose();
    java.util.Vector var20 = freemind.main.Tools.urlStringToUrls("hi!");
    var17.setIconImages((java.util.List)var20);
    freemind.common.ComboProperty var22 = new freemind.common.ComboProperty("", "file:/home/joao/workspace/\n", (java.util.List)var14, (java.util.List)var20);
    freemind.common.ComboProperty var23 = new freemind.common.ComboProperty("false", "open map", (java.util.List)var6, (java.util.List)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    accessories.plugins.time.ReminderHook var0 = new accessories.plugins.time.ReminderHook();
    var0.setRemindUserAt(10L);
    freemind.modes.common.plugins.ReminderHookBase.TimerBlinkTask var4 = var0.new TimerBlinkTask(false);
    var0.deregisterFilter();
    var0.setRemindUserAt(1L);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    accessories.plugins.time.JSpinField var12 = new accessories.plugins.time.JSpinField(10, 1);
    var12.setValue(292278994);
    java.awt.event.ContainerListener[] var15 = var12.getContainerListeners();
    var8.addChangeListener((javax.swing.event.ChangeListener)var12);
    boolean var17 = var8.getHideActionText();
    javax.swing.Icon var18 = var8.getIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    accessories.plugins.time.JYearChooser var3 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var4 = var3.getMouseListeners();
    var3.repaint(100L, 1, (-1), 100, 1);
    var2.setYearChooser(var3);
    var2.enable();
    java.awt.Insets var13 = var2.insets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.Window.Type var4 = var1.getType();
    boolean var5 = var1.getFocusableWindowState();
    java.awt.Window var6 = var1.getOwner();
    var1.setVisible(false);
    boolean var9 = var1.isModal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var2 = var0.getTermsOfUseText();
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var2.isDecorationBordersVisible();
    java.util.GregorianCalendar var4 = var2.getTemporaryCalendar();
    accessories.plugins.time.JCalendar var5 = new accessories.plugins.time.JCalendar((java.util.Calendar)var4);
    accessories.plugins.time.JCalendar var6 = new accessories.plugins.time.JCalendar((java.util.Calendar)var4);
    boolean var7 = var6.isWeekOfYearVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    var8.setDisplayedMnemonicIndex(1);
    int var11 = var8.getMnemonic();
    var8.addNotify();
    var8.setFocusPainted(true);
    javax.swing.Action var15 = javax.swing.TransferHandler.getCutAction();
    var8.setAction(var15);
    var8.setIconTextGap(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    int var2 = var0.getWinState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    freemind.main.Tools.correctJSplitPaneKeyMap();

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    boolean var3 = var1.isUndecorated();
    var1.validate();
    javax.accessibility.AccessibleContext var5 = var1.getAccessibleContext();
    java.beans.PropertyChangeListener[] var6 = var1.getPropertyChangeListeners();
    var1.toFront();
    java.beans.PropertyChangeListener[] var8 = var1.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.setVisible(true);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    boolean var18 = var8.isContentAreaFilled();
    java.awt.Insets var19 = var8.getMargin();
    accessories.plugins.time.JTripleCalendar var20 = new accessories.plugins.time.JTripleCalendar();
    boolean var21 = var20.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var22 = var20.getDayChooser();
    accessories.plugins.time.JYearChooser var23 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var24 = var23.getMouseListeners();
    var23.repaint(100L, 1, (-1), 100, 1);
    var22.setYearChooser(var23);
    var22.enable();
    var8.addKeyListener((java.awt.event.KeyListener)var22);
    boolean var34 = var22.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    var5.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    java.awt.Dimension var2 = var0.minimumSize();
    var0.setFocusable(true);
    java.util.Set var6 = freemind.main.Tools.getAvailableFontFamilyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys((-2147483648), var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    freemind.main.HtmlTools.IndexPair var5 = new freemind.main.HtmlTools.IndexPair(10, (-1), 0, 1, true);
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]"+ "'", var6.equals("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]"+ "'", var7.equals("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]"));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    freemind.view.mindmapview.MindMapLayout var0 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    javax.swing.InputVerifier var5 = var3.getInputVerifier();
    var0.removeLayoutComponent((java.awt.Component)var3);
    accessories.plugins.time.JCalendar var7 = new accessories.plugins.time.JCalendar();
    java.awt.Color var8 = var7.getWeekdayForeground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.layoutContainer((java.awt.Container)var7);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    java.lang.String var1 = freemind.main.Tools.expandFileName("<a,23>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<a,23>"+ "'", var1.equals("<a,23>"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    accessories.plugins.time.TimeList var0 = new accessories.plugins.time.TimeList();
    freemind.modes.mindmapmode.MindMapController var1 = var0.getMindMapController();
    java.lang.String var2 = var0.getName();
    freemind.modes.mindmapmode.MindMapController var3 = var0.getMindMapController();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    var4.setEdgeWidth((java.lang.Integer)292278994);
    boolean var8 = var4.getAppliesToNodeIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    java.lang.String var1 = freemind.main.HtmlTools.removeAllTagsFromString("Png");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Png"+ "'", var1.equals("Png"));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    freemind.controller.filter.util.SortedMapVector var0 = new freemind.controller.filter.util.SortedMapVector();
    freemind.modes.StylePattern var2 = new freemind.modes.StylePattern();
    var2.setEdgeStyle("hi!");
    freemind.modes.StylePattern var5 = var2.getChildrenStylePattern();
    freemind.modes.StylePattern var6 = new freemind.modes.StylePattern();
    var2.setChildrenStylePattern(var6);
    accessories.plugins.time.JTripleCalendar var8 = new accessories.plugins.time.JTripleCalendar();
    boolean var9 = var8.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var10 = var8.getDayChooser();
    accessories.plugins.time.JYearChooser var11 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var12 = var11.getMouseListeners();
    var11.repaint(100L, 1, (-1), 100, 1);
    var10.setYearChooser(var11);
    accessories.plugins.time.JTripleCalendar var20 = new accessories.plugins.time.JTripleCalendar();
    boolean var21 = var20.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var22 = var20.getDayChooser();
    java.awt.Color var23 = var22.getSundayForeground();
    var10.setDecorationBackgroundColor(var23);
    var2.setNodeColor(var23);
    int var26 = var0.add((java.lang.Comparable)"joao@BetelgeuseLX", (java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var28 = var0.getValue((java.lang.Comparable)10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    freemind.controller.filter.condition.AttributeExistsCondition var1 = new freemind.controller.filter.condition.AttributeExistsCondition("images/icons/");
    freemind.main.XMLElement var2 = new freemind.main.XMLElement();
    java.lang.String var3 = var2.getTagName();
    java.util.Iterator var4 = var2.enumerateAttributeNames();
    java.lang.String var5 = var2.toString();
    java.lang.Object var7 = var2.getAttribute("images/icons/hi!.png");
    var1.save(var2);
    double var11 = var2.getDoubleAttribute("Png", 1.0d);
    freemind.main.XMLElement var12 = new freemind.main.XMLElement();
    java.lang.String var13 = var12.getTagName();
    java.util.Iterator var14 = var12.enumerateAttributeNames();
    java.lang.String var15 = var12.toString();
    java.lang.Object var17 = var12.getAttribute("images/icons/hi!.png");
    var2.removeChild(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.parseString("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n", (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.hide();
    var1.setResizable(false);
    freemind.view.mindmapview.LeftNodeViewLayout var7 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var1.setLayout((java.awt.LayoutManager)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setDefaultCloseOperation(6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    int var4 = var2.getWidth();
    java.lang.String var5 = var2.getUIClassID();
    java.lang.String var6 = var2.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "ToolBarUI"+ "'", var5.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ToolBarUI"+ "'", var6.equals("ToolBarUI"));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    int var2 = var0.getTileSize();
    java.lang.String var3 = var0.getAttributionImageURL();
    int var4 = var0.getMinZoom();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 256);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.show();
    accessories.plugins.util.window.WindowClosingAdapter var5 = new accessories.plugins.util.window.WindowClosingAdapter();
    var1.removeWindowStateListener((java.awt.event.WindowStateListener)var5);
    freemind.common.FreeMindProgressMonitor var8 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var8.revalidate();
    var8.addNotify();
    var8.setFocusTraversalPolicyProvider(false);
    java.awt.Point var13 = var8.location();
    var1.setLocation(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.MouseListener[] var2 = var1.getMouseListeners();
    javax.swing.JMenuBar var3 = var1.getJMenuBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.swing.JViewport var1 = var0.getRowHeader();
    boolean var2 = var0.getFocusTraversalKeysEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setVerticalScrollBarPolicy(200);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.list();

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.border.Border var7 = var4.getBorder();
    boolean var8 = var4.isPaintingForPrint();
    java.awt.Color var9 = var4.getWeekdayForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    freemind.modes.MindIcon var1 = freemind.modes.MindIcon.factory("hi!");
    java.lang.String var2 = var1.getIconFileName();
    java.lang.String var3 = var1.getKeystrokeResourceName();
    javax.swing.KeyStroke var4 = var1.getKeyStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "images/icons/hi!.png"+ "'", var2.equals("images/icons/hi!.png"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "keystroke_icon_hi!"+ "'", var3.equals("keystroke_icon_hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    freemind.modes.attributes.Attribute var2 = new freemind.modes.attributes.Attribute("hi!", "hi!");
    freemind.modes.attributes.Attribute var3 = new freemind.modes.attributes.Attribute(var2);
    freemind.modes.attributes.Attribute var4 = new freemind.modes.attributes.Attribute(var2);
    java.lang.String var5 = var4.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    freemind.controller.filter.condition.IconContainedCondition var1 = new freemind.controller.filter.condition.IconContainedCondition("");
    freemind.main.XMLElement var2 = new freemind.main.XMLElement();
    java.lang.String var3 = var2.getTagName();
    var1.save(var2);
    javax.swing.JComponent var5 = var1.getListCellRendererComponent();
    freemind.controller.filter.condition.ConditionNotSatisfiedDecorator var6 = new freemind.controller.filter.condition.ConditionNotSatisfiedDecorator((freemind.controller.filter.condition.Condition)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    freemind.view.mindmapview.MindMapLayout var2 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var5 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var5.requestFocus();
    javax.swing.InputVerifier var7 = var5.getInputVerifier();
    var2.removeLayoutComponent((java.awt.Component)var5);
    accessories.plugins.time.JYearChooser var9 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var10 = var9.getMouseListeners();
    var2.removeLayoutComponent((java.awt.Component)var9);
    var0.setLayout((java.awt.LayoutManager)var2);
    freemind.controller.FreeMindToolBar var15 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var15.updateUI();
    var15.setIgnoreRepaint(false);
    java.awt.Dimension var19 = var15.getSize();
    var0.setMinimumSize(var19);
    int var21 = var0.getEndYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 292278994);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.net.URL var2 = var0.getResource("file:/home/joao/workspace/\n");
    java.lang.String var4 = var0.getProperty("OSM MapQuest.Open Map");
    java.lang.String var7 = var0.getResourceString("images/icons/", "Png");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "images/icons/"+ "'", var7.equals("images/icons/"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("<a,23>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkAccept("", 292278994);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    boolean var2 = var0.hasSpinner();
    var0.setRequestFocusEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    freemind.main.Resources var2 = freemind.main.Resources.getInstance();
    java.lang.String var4 = var2.getResourceString("");
    freemind.common.RemindValueProperty var5 = new freemind.common.RemindValueProperty("ButtonUI", "joao@BetelgeuseLX", (freemind.common.TextTranslator)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setValue("images/icons///SIGN:null\n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.show();
    accessories.plugins.util.window.WindowClosingAdapter var5 = new accessories.plugins.util.window.WindowClosingAdapter();
    var1.removeWindowStateListener((java.awt.event.WindowStateListener)var5);
    accessories.plugins.time.JTripleCalendar var8 = new accessories.plugins.time.JTripleCalendar();
    var1.addPropertyChangeListener("<a,23>", (java.beans.PropertyChangeListener)var8);
    java.awt.Shape var10 = var1.getShape();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setOpacity(0.5f);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    java.awt.Component var3 = var1.getFocusOwner();
    boolean var4 = var1.isFocused();
    freemind.controller.filter.condition.JCondition var5 = new freemind.controller.filter.condition.JCondition();
    var1.setContentPane((java.awt.Container)var5);
    boolean var7 = var1.isAlwaysOnTop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    freemind.modes.browsemode.BrowseHookFactory var0 = new freemind.modes.browsemode.BrowseHookFactory();
    java.lang.Object var2 = var0.getPluginBaseClass("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.Window.Type var4 = var1.getType();
    boolean var5 = var1.getFocusableWindowState();
    java.awt.Window var6 = var1.getOwner();
    accessories.plugins.time.JTripleCalendar var7 = new accessories.plugins.time.JTripleCalendar();
    boolean var8 = var7.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var9 = var7.getDayChooser();
    javax.swing.JRootPane var10 = var7.getRootPane();
    java.util.Vector var11 = freemind.main.Tools.getVectorWithSingleElement((java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setIconImages((java.util.List)var11);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    freemind.view.mindmapview.MindMapLayout var0 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    javax.swing.InputVerifier var5 = var3.getInputVerifier();
    var0.removeLayoutComponent((java.awt.Component)var3);
    boolean var7 = var3.isFloatable();
    var3.setName("file:/home/joao/workspace/\n");
    java.awt.Cursor var10 = var3.getCursor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    var0.switchMeOff();
    var0.processUnfinishedLinks();
    var0.onUpdateNodeHook();
    java.lang.Integer var4 = var0.getRole();
    java.lang.Integer var5 = var0.getRole();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0+ "'", var5.equals(0));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    java.lang.String var2 = var1.getTagName();
    java.util.Iterator var3 = var1.enumerateAttributeNames();
    java.util.Iterator var4 = var1.enumeratePropertyNames();
    var0.loadFrom(var1);
    int var8 = var1.getIntAttribute("16", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.repaint(10L);
    boolean var6 = var2.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    plugins.svg.ExportSvg var0 = new plugins.svg.ExportSvg();

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    plugins.map.AddLinkToMapAction var0 = new plugins.map.AddLinkToMapAction();

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    int var4 = var2.getWidth();
    java.lang.String var5 = var2.getUIClassID();
    var2.setRollover(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "ToolBarUI"+ "'", var5.equals("ToolBarUI"));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    boolean var2 = var0.isDoubleBuffered();
    var0.hide();
    var0.adjustWidthToMaximumValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    freemind.controller.filter.util.SortedMapVector var0 = new freemind.controller.filter.util.SortedMapVector();
    freemind.modes.StylePattern var2 = new freemind.modes.StylePattern();
    var2.setEdgeStyle("hi!");
    freemind.modes.StylePattern var5 = var2.getChildrenStylePattern();
    freemind.modes.StylePattern var6 = new freemind.modes.StylePattern();
    var2.setChildrenStylePattern(var6);
    accessories.plugins.time.JTripleCalendar var8 = new accessories.plugins.time.JTripleCalendar();
    boolean var9 = var8.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var10 = var8.getDayChooser();
    accessories.plugins.time.JYearChooser var11 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var12 = var11.getMouseListeners();
    var11.repaint(100L, 1, (-1), 100, 1);
    var10.setYearChooser(var11);
    accessories.plugins.time.JTripleCalendar var20 = new accessories.plugins.time.JTripleCalendar();
    boolean var21 = var20.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var22 = var20.getDayChooser();
    java.awt.Color var23 = var22.getSundayForeground();
    var10.setDecorationBackgroundColor(var23);
    var2.setNodeColor(var23);
    int var26 = var0.add((java.lang.Comparable)"joao@BetelgeuseLX", (java.lang.Object)var23);
    int var27 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    freemind.common.XmlBindingTools var0 = freemind.common.XmlBindingTools.getInstance();
    freemind.common.FreeMindProgressMonitor var3 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var3.dispose();
    java.util.Vector var6 = freemind.main.Tools.urlStringToUrls("hi!");
    var3.setIconImages((java.util.List)var6);
    java.util.Locale var8 = var3.getLocale();
    freemind.modes.StylePattern var9 = new freemind.modes.StylePattern();
    var9.setEdgeStyle("hi!");
    freemind.modes.StylePattern var12 = var9.getChildrenStylePattern();
    freemind.modes.StylePattern var13 = new freemind.modes.StylePattern();
    var9.setChildrenStylePattern(var13);
    accessories.plugins.time.JTripleCalendar var15 = new accessories.plugins.time.JTripleCalendar();
    boolean var16 = var15.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var17 = var15.getDayChooser();
    java.awt.Color var18 = var17.getSundayForeground();
    var13.setNodeBackgroundColor(var18);
    var3.setBackground(var18);
    java.awt.Container var21 = var3.getFocusCycleRootAncestor();
    freemind.controller.actions.generated.instance.WindowConfigurationStorage var22 = var0.decorateDialog("/home/joao/workspace/FreeMind_integration/bin/classes/", (javax.swing.JDialog)var3);
    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var24 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var25 = var24.createReader();
    boolean var26 = var25.ready();
    long var28 = var25.skip(100L);
    freemind.controller.actions.generated.instance.XmlAction var29 = var0.unMarshall(var25);
    plugins.collaboration.socket.MindMapMaster var30 = new plugins.collaboration.socket.MindMapMaster();
    var30.switchMeOff();
    var30.processUnfinishedLinks();
    freemind.modes.mindmapmode.actions.xml.ActionPair var33 = var30.getEmptyActionPair();
    freemind.controller.actions.generated.instance.XmlAction var34 = var33.getUndoAction();
    freemind.common.XmlBindingTools var35 = freemind.common.XmlBindingTools.getInstance();
    freemind.common.FreeMindProgressMonitor var38 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var38.dispose();
    java.util.Vector var41 = freemind.main.Tools.urlStringToUrls("hi!");
    var38.setIconImages((java.util.List)var41);
    java.util.Locale var43 = var38.getLocale();
    freemind.modes.StylePattern var44 = new freemind.modes.StylePattern();
    var44.setEdgeStyle("hi!");
    freemind.modes.StylePattern var47 = var44.getChildrenStylePattern();
    freemind.modes.StylePattern var48 = new freemind.modes.StylePattern();
    var44.setChildrenStylePattern(var48);
    accessories.plugins.time.JTripleCalendar var50 = new accessories.plugins.time.JTripleCalendar();
    boolean var51 = var50.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var52 = var50.getDayChooser();
    java.awt.Color var53 = var52.getSundayForeground();
    var48.setNodeBackgroundColor(var53);
    var38.setBackground(var53);
    java.awt.Container var56 = var38.getFocusCycleRootAncestor();
    freemind.controller.actions.generated.instance.WindowConfigurationStorage var57 = var35.decorateDialog("/home/joao/workspace/FreeMind_integration/bin/classes/", (javax.swing.JDialog)var38);
    plugins.collaboration.socket.MindMapMaster var58 = new plugins.collaboration.socket.MindMapMaster();
    var58.switchMeOff();
    var58.processUnfinishedLinks();
    freemind.modes.mindmapmode.actions.xml.ActionPair var61 = var58.getEmptyActionPair();
    freemind.controller.actions.generated.instance.XmlAction var62 = var61.getUndoAction();
    java.lang.String var63 = var35.marshall(var62);
    var33.setDoAction(var62);
    java.lang.String var65 = var0.marshall(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 9L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>"+ "'", var63.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>"+ "'", var65.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>"));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var1 = var0.getCalendar();
    java.util.Date var2 = var0.getMaxSelectableDate();
    java.util.Date var4 = freemind.main.Tools.xmlToDate("plugins.map.FreeMindMapController$MapQuestOpenMap");
    var0.setMaxSelectableDate(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    freemind.main.ExampleFileFilter var0 = new freemind.main.ExampleFileFilter();
    var0.setExtensionListInDescription(false);
    var0.addExtension("/home/joao/workspace/FreeMind_integration/bin/classes/");

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    boolean var2 = var0.hasSpinner();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    boolean var18 = var8.isContentAreaFilled();
    freemind.view.mindmapview.MindMapLayout var19 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var22 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var22.requestFocus();
    javax.swing.InputVerifier var24 = var22.getInputVerifier();
    var19.removeLayoutComponent((java.awt.Component)var22);
    var8.setLayout((java.awt.LayoutManager)var19);
    javax.swing.Icon var27 = var8.getRolloverIcon();
    boolean var28 = var8.isRolloverEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    var8.setRolloverEnabled(true);
    long var20 = var8.getMultiClickThreshhold();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    java.lang.String var1 = freemind.main.Tools.expandFileName("http://openstreetmap.org/");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://openstreetmap.org/"+ "'", var1.equals("http://openstreetmap.org/"));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    freemind.view.mindmapview.MapView.ScrollPane var1 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var2 = var1.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var3 = new accessories.plugins.time.JTripleCalendar();
    boolean var4 = var3.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var5 = var3.getDayChooser();
    java.awt.Color var6 = var5.getSundayForeground();
    var1.setColumnHeaderView((java.awt.Component)var5);
    javax.swing.JViewport var8 = var1.getColumnHeader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var0.showOpenDialog((java.awt.Component)var8);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    javax.swing.plaf.ToolBarUI var4 = var2.getUI();
    javax.swing.InputMap var5 = var2.getInputMap();
    var2.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    freemind.controller.filter.condition.AttributeNotExistsCondition var4 = new freemind.controller.filter.condition.AttributeNotExistsCondition("ToolBarUI");
    var1.setAttribute("ButtonUI", (java.lang.Object)"ToolBarUI");
    var1.removeChild("IntHolder(0)");
    var0.loadFrom(var1);
    var1.setTagName("file:/home/joao/workspace/\n");

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.dispose();
    java.util.Vector var4 = freemind.main.Tools.urlStringToUrls("hi!");
    var1.setIconImages((java.util.List)var4);
    var1.firePropertyChange("16", (short)100, (short)10);
    java.awt.Dialog.ModalityType var10 = var1.getModalityType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    java.awt.Component var3 = var1.getFocusOwner();
    boolean var4 = var1.isFocused();
    freemind.controller.filter.condition.JCondition var5 = new freemind.controller.filter.condition.JCondition();
    var1.setContentPane((java.awt.Container)var5);
    var1.show();
    accessories.plugins.time.JCalendar var8 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var9 = var8.getCalendar();
    freemind.controller.FreeMindToolBar var12 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var12.updateUI();
    var12.setIgnoreRepaint(false);
    java.awt.Dimension var16 = var12.getSize();
    var8.setMaximumSize(var16);
    freemind.common.StringProperty var21 = new freemind.common.StringProperty("file:/home/joao/workspace/\n", "ToolBarUI");
    accessories.plugins.time.JTripleCalendar var22 = new accessories.plugins.time.JTripleCalendar();
    var22.revalidate();
    var21.addPropertyChangeListener((java.beans.PropertyChangeListener)var22);
    boolean var25 = var22.getAutoscrolls();
    boolean var26 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var22);
    var8.addPropertyChangeListener("false", (java.beans.PropertyChangeListener)var22);
    var1.addPropertyChangeListener((java.beans.PropertyChangeListener)var8);
    var1.repaint(10L, 1, 10, 256, 2014);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    freemind.modes.browsemode.BrowseHookFactory var2 = new freemind.modes.browsemode.BrowseHookFactory();
    java.util.Vector var3 = var2.getPossibleNodeHooks();
    java.lang.String[] var7 = new java.lang.String[] { "file:/home/joao/workspace/\n"};
    freemind.main.ExampleFileFilter var8 = new freemind.main.ExampleFileFilter(var7);
    freemind.main.XMLElement var11 = new freemind.main.XMLElement();
    java.lang.String var12 = var11.getTagName();
    java.util.Iterator var13 = var11.enumerateAttributeNames();
    java.util.Vector var15 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var16 = new freemind.modes.StylePattern(var11, (java.util.List)var15);
    freemind.common.FreeMindProgressMonitor var18 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var18.dispose();
    java.util.Vector var21 = freemind.main.Tools.urlStringToUrls("hi!");
    var18.setIconImages((java.util.List)var21);
    freemind.common.ComboProperty var23 = new freemind.common.ComboProperty("", "file:/home/joao/workspace/\n", (java.util.List)var15, (java.util.List)var21);
    freemind.common.ComboProperty var24 = new freemind.common.ComboProperty(".", "//openstreetmap.org/", var7, (java.util.List)var15);
    freemind.common.ComboProperty var25 = new freemind.common.ComboProperty("control", "images/icons///SIGN:null\n", (java.util.List)var3, (java.util.List)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    freemind.modes.MindMapLinkRegistry var0 = new freemind.modes.MindMapLinkRegistry();
    freemind.modes.MindMapNode var2 = var0.getTargetForId("IntHolder(100)");
    java.lang.String var4 = var0.generateUniqueLinkId("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Arrow_ID_515901044"+ "'", var4.equals("Arrow_ID_515901044"));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getAttributionLinkURL();
    java.lang.String var2 = var0.getAttributionImageURL();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://openstreetmap.org/"+ "'", var1.equals("http://openstreetmap.org/"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    java.util.Locale var6 = var2.getLocale();
    javax.swing.JComponent.setDefaultLocale(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    int var10 = var8.getMnemonic();
    javax.swing.event.ChangeListener[] var11 = var8.getChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    javax.swing.JColorChooser var0 = freemind.controller.Controller.getCommonJColorChooser();
    java.awt.Color var1 = var0.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    freemind.view.mindmapview.SharpLinearEdgeView var0 = new freemind.view.mindmapview.SharpLinearEdgeView();

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    var1.dispose();
    boolean var6 = var1.setProgress(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    accessories.plugins.time.ReminderHook var0 = new accessories.plugins.time.ReminderHook();
    var0.setRemindUserAt(10L);
    freemind.modes.common.plugins.ReminderHookBase.TimerBlinkTask var4 = var0.new TimerBlinkTask(false);
    var0.processUnfinishedLinks();

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.JViewport var7 = var0.getColumnHeader();
    var0.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.setStartYear(10);
    var0.reshape(200, 100, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.repaint(10L);
    freemind.controller.FreeMindToolBar var8 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var9 = var8.isLightweight();
    javax.swing.plaf.ToolBarUI var10 = var8.getUI();
    var2.setUI(var10);
    var2.repaint(10L, (-1), 7, 2014, 0);
    javax.swing.TransferHandler var18 = var2.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    java.lang.String var1 = freemind.main.HtmlTools.plainToHTML("file:/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "<html><body><p>file:/home/joao/workspace/<br>"+ "'", var1.equals("<html><body><p>file:/home/joao/workspace/<br>"));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    javax.swing.KeyStroke var1 = freemind.main.Tools.getKeyStroke("file:/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var2 = var0.getTermsOfUseText();
    var0.setTermsOfUseText("control");
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "OSM MapQuest.Open Map"+ "'", var5.equals("OSM MapQuest.Open Map"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.lang.String var2 = var0.getProperty("control");
    freemind.main.FreeMindMain.VersionInformation var3 = var0.getFreemindVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.show();
    accessories.plugins.util.window.WindowClosingAdapter var5 = new accessories.plugins.util.window.WindowClosingAdapter();
    var1.removeWindowStateListener((java.awt.event.WindowStateListener)var5);
    accessories.plugins.time.JTripleCalendar var7 = new accessories.plugins.time.JTripleCalendar();
    boolean var8 = var7.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var9 = var7.getDayChooser();
    javax.swing.JRootPane var10 = var7.getRootPane();
    accessories.plugins.time.JDayChooser var11 = var7.getDayChooser();
    java.awt.event.HierarchyListener[] var12 = var7.getHierarchyListeners();
    var1.addPropertyChangeListener((java.beans.PropertyChangeListener)var7);
    var1.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var1 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var2 = var1.createReader();
    boolean var3 = var2.ready();
    long var5 = var2.skip(100L);
    var2.mark(200);
    int var8 = var2.read();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 9L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    boolean var6 = var2.isApplet();
    freemind.common.FreeMindProgressMonitor var8 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var9 = var8.getInputMethodListeners();
    var8.show();
    java.awt.dnd.DropTarget var11 = var8.getDropTarget();
    boolean var12 = var8.isFocused();
    freemind.common.FreeMindProgressMonitor var14 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var15 = var14.getInputMethodListeners();
    javax.accessibility.AccessibleContext var16 = var14.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var18 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var18.revalidate();
    var14.setLocationRelativeTo((java.awt.Component)var18);
    boolean var21 = var14.isValidateRoot();
    accessories.plugins.time.JCalendar var22 = new accessories.plugins.time.JCalendar();
    java.awt.Color var23 = var22.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var24 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var25 = var24.getCalendar();
    java.util.Date var26 = var24.getMaxSelectableDate();
    var22.setDate(var26);
    var22.setWeekOfYearVisible(true);
    var14.addPropertyChangeListener((java.beans.PropertyChangeListener)var22);
    accessories.plugins.time.JCalendar var31 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var32 = var31.getCalendar();
    java.util.Date var33 = var31.getMaxSelectableDate();
    var22.setMinSelectableDate(var33);
    var8.addPropertyChangeListener((java.beans.PropertyChangeListener)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setContentPane((java.awt.Container)var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.MouseListener[] var2 = var1.getMouseListeners();
    freemind.common.FreeMindProgressMonitor var4 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var4.revalidate();
    var4.addNotify();
    var4.show();
    accessories.plugins.util.window.WindowClosingAdapter var8 = new accessories.plugins.util.window.WindowClosingAdapter();
    var4.removeWindowStateListener((java.awt.event.WindowStateListener)var8);
    var1.addWindowFocusListener((java.awt.event.WindowFocusListener)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isMultiSelectionEnabled();
    accessories.plugins.dialogs.EnterPasswordDialog var2 = new accessories.plugins.dialogs.EnterPasswordDialog();
    int var3 = var2.getResult();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var5.addNotify();
    var5.show();
    accessories.plugins.util.window.WindowClosingAdapter var9 = new accessories.plugins.util.window.WindowClosingAdapter();
    var5.removeWindowStateListener((java.awt.event.WindowStateListener)var9);
    accessories.plugins.time.JTripleCalendar var11 = new accessories.plugins.time.JTripleCalendar();
    boolean var12 = var11.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var13 = var11.getDayChooser();
    javax.swing.JRootPane var14 = var11.getRootPane();
    accessories.plugins.time.JDayChooser var15 = var11.getDayChooser();
    java.awt.event.HierarchyListener[] var16 = var11.getHierarchyListeners();
    var5.addPropertyChangeListener((java.beans.PropertyChangeListener)var11);
    float var18 = var11.getAlignmentY();
    var2.addPropertyChangeListener((java.beans.PropertyChangeListener)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var20 = var0.showOpenDialog((java.awt.Component)var2);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.5f);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    java.lang.String var1 = accessories.plugins.time.TimeList.getRegularExpression("open map");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ".*(open map).*"+ "'", var1.equals(".*(open map).*"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    boolean var0 = freemind.main.Tools.isWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    var0.requestFocus();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    var0.setCalendar(var3);
    boolean var5 = var0.isFontSet();
    accessories.plugins.time.JDayChooser var6 = var0.getDayChooser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    freemind.common.XmlBindingTools var0 = freemind.common.XmlBindingTools.getInstance();
    freemind.common.FreeMindProgressMonitor var3 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var3.dispose();
    java.util.Vector var6 = freemind.main.Tools.urlStringToUrls("hi!");
    var3.setIconImages((java.util.List)var6);
    java.util.Locale var8 = var3.getLocale();
    freemind.modes.StylePattern var9 = new freemind.modes.StylePattern();
    var9.setEdgeStyle("hi!");
    freemind.modes.StylePattern var12 = var9.getChildrenStylePattern();
    freemind.modes.StylePattern var13 = new freemind.modes.StylePattern();
    var9.setChildrenStylePattern(var13);
    accessories.plugins.time.JTripleCalendar var15 = new accessories.plugins.time.JTripleCalendar();
    boolean var16 = var15.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var17 = var15.getDayChooser();
    java.awt.Color var18 = var17.getSundayForeground();
    var13.setNodeBackgroundColor(var18);
    var3.setBackground(var18);
    java.awt.Container var21 = var3.getFocusCycleRootAncestor();
    freemind.controller.actions.generated.instance.WindowConfigurationStorage var22 = var0.decorateDialog("/home/joao/workspace/FreeMind_integration/bin/classes/", (javax.swing.JDialog)var3);
    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var24 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var25 = var24.createReader();
    boolean var26 = var25.ready();
    long var28 = var25.skip(100L);
    freemind.controller.actions.generated.instance.XmlAction var29 = var0.unMarshall(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var30 = freemind.modes.StylePattern.loadPatterns(var25);
      fail("Expected exception of type freemind.main.XMLParseException");
    } catch (freemind.main.XMLParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 9L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.hide();
    java.awt.Container var5 = var1.getFocusCycleRootAncestor();
    freemind.view.mindmapview.LeftNodeViewLayout var6 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var1.setLayout((java.awt.LayoutManager)var6);
    freemind.main.FreeMindApplet var8 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var9 = var8.getResources();
    freemind.main.Resources.createInstance((freemind.main.FreeMindMain)var8);
    var6.removeLayoutComponent((java.awt.Component)var8);
    var8.setWaitingCursor(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkLink("hi!");
    var3.checkExit(100);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.hide();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.applyResourceBundle("<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    plugins.collaboration.database.DatabaseStarter var0 = new plugins.collaboration.database.DatabaseStarter();
    var0.processUnfinishedLinks();

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    accessories.plugins.time.JYearChooser var3 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var4 = var3.getMouseListeners();
    var3.repaint(100L, 1, (-1), 100, 1);
    var2.setYearChooser(var3);
    boolean var12 = var2.isOpaque();
    var2.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.requestFocus();
    int var4 = var2.getComponentCount();
    var2.addSeparator();
    accessories.plugins.time.JYearChooser var6 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var7 = var6.getMouseListeners();
    boolean var8 = var6.isDoubleBuffered();
    var6.hide();
    int var10 = var2.getComponentIndex((java.awt.Component)var6);
    var6.setMinimum(256);
    java.awt.event.FocusListener[] var13 = var6.getFocusListeners();
    accessories.plugins.time.JTripleCalendar var14 = new accessories.plugins.time.JTripleCalendar();
    var14.setLocation(2014, (-1));
    var6.removePropertyChangeListener((java.beans.PropertyChangeListener)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    var8.setRolloverEnabled(true);
    boolean var20 = var8.isRolloverEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    int var2 = var0.getValue();
    java.awt.image.VolatileImage var5 = var0.createVolatileImage(6, (-1));
    java.awt.Dimension var6 = var0.getMinimumSize();
    var0.setYear(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2014);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.awt.Point var7 = var0.location();
    javax.swing.JRootPane var8 = var0.getRootPane();
    boolean var9 = var0.isValidateRoot();
    javax.swing.JScrollBar var10 = var0.getVerticalScrollBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    freemind.view.mindmapview.MindMapLayout var0 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    javax.swing.InputVerifier var5 = var3.getInputVerifier();
    var0.removeLayoutComponent((java.awt.Component)var3);
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var8 = var7.getUI();
    java.awt.Dimension var9 = var7.minimumSize();
    java.awt.Dimension var10 = var3.getSize(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    java.lang.String var3 = freemind.main.Tools.expandPlaceholders("images/icons/", ".", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "images/icons/"+ "'", var3.equals("images/icons/"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    freemind.controller.StructuredMenuItemHolder var0 = new freemind.controller.StructuredMenuItemHolder();
    javax.swing.Action var1 = var0.getAction();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.net.URL var2 = var0.getResource("file:/home/joao/workspace/\n");
    java.lang.String var4 = var0.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var6 = var0.createTranslatedString("");
    freemind.common.NamedObject var8 = var0.createTranslatedString("ButtonUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    boolean var0 = javax.swing.JDialog.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


    java.lang.String var1 = freemind.main.Tools.getModeFromRestorable("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[IndexPair"+ "'", var1.equals("[IndexPair"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.Window.Type var4 = var1.getType();
    java.lang.String var5 = var1.getTitle();
    java.awt.event.WindowListener[] var6 = var1.getWindowListeners();
    var1.dismiss();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var5.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    double var3 = var0.latToTileY(100.0d, (-2147483648));
    boolean var4 = var0.requiresAttribution();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    freemind.modes.StylePattern var3 = new freemind.modes.StylePattern();
    var3.setEdgeStyle("hi!");
    freemind.modes.StylePattern var6 = var3.getChildrenStylePattern();
    freemind.modes.StylePattern var7 = new freemind.modes.StylePattern();
    var3.setChildrenStylePattern(var7);
    java.lang.Integer var9 = var3.getNodeFontSize();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.dispose();
    java.util.Vector var14 = freemind.main.Tools.urlStringToUrls("hi!");
    var11.setIconImages((java.util.List)var14);
    java.util.Locale var16 = var11.getLocale();
    freemind.modes.StylePattern var17 = new freemind.modes.StylePattern();
    var17.setEdgeStyle("hi!");
    freemind.modes.StylePattern var20 = var17.getChildrenStylePattern();
    freemind.modes.StylePattern var21 = new freemind.modes.StylePattern();
    var17.setChildrenStylePattern(var21);
    accessories.plugins.time.JTripleCalendar var23 = new accessories.plugins.time.JTripleCalendar();
    boolean var24 = var23.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var25 = var23.getDayChooser();
    java.awt.Color var26 = var25.getSundayForeground();
    var21.setNodeBackgroundColor(var26);
    var11.setBackground(var26);
    var3.setEdgeColor(var26);
    var2.setDecorationBackgroundColor(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    freemind.common.DontShowNotificationProperty var2 = new freemind.common.DontShowNotificationProperty("file:/home/joao/workspace/\n", "OSM MapQuest.Open Map");
    java.lang.String var3 = var2.getLabel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setValue("OSM MapQuest.Open Map");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.main.FreeMindApplet var4 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var5 = var4.getResources();
    var3.setFrame((freemind.main.FreeMindMain)var4);
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    freemind.controller.FreeMindToolBar var11 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var11.updateUI();
    var11.setIgnoreRepaint(false);
    javax.swing.Action var15 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var16 = var11.add(var15);
    freemind.view.mindmapview.MapView.ScrollPane var17 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var18 = var17.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var19 = new accessories.plugins.time.JTripleCalendar();
    boolean var20 = var19.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var21 = var19.getDayChooser();
    java.awt.Color var22 = var21.getSundayForeground();
    var17.setColumnHeaderView((java.awt.Component)var21);
    java.util.Locale var24 = var21.getLocale();
    javax.swing.JButton var25 = var21.getSelectedDay();
    java.lang.String var26 = var25.getUIClassID();
    freemind.common.FreeMindProgressMonitor var28 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var28.revalidate();
    var28.addNotify();
    var28.setFocusTraversalPolicyProvider(false);
    java.awt.Point var33 = var28.location();
    boolean var34 = var25.contains(var33);
    boolean var35 = var25.isContentAreaFilled();
    java.awt.Insets var36 = var25.getMargin();
    var16.setMargin(var36);
    java.awt.Insets var38 = var7.getInsets(var36);
    freemind.view.mindmapview.MapView.ScrollPane var39 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var40 = var39.getAccessibleContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.informationMessage((java.lang.Object)var38, (javax.swing.JComponent)var39);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "ButtonUI"+ "'", var26.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    java.net.URL var5 = var3.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var6 = new freemind.controller.MapMouseWheelListener(var3);
    java.net.URL var8 = var3.getResource("control");
    freemind.controller.MapMouseMotionListener var9 = new freemind.controller.MapMouseMotionListener(var3);
    var9.deregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    java.awt.Color var3 = var2.getSundayForeground();
    boolean var4 = var2.isDecorationBackgroundVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var1 = freemind.main.Tools.xmlToPoint("//openstreetmap.org/");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    boolean var1 = freemind.main.Tools.executableByExtension("images/icons///SIGN:null\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    boolean var1 = freemind.main.Tools.isAvailableFontFamily(".");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    java.lang.String var2 = freemind.main.HtmlTools.unicodeToHTMLUnicodeEntity("open map", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "open map"+ "'", var2.equals("open map"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    freemind.view.mindmapview.RightNodeViewLayout var0 = new freemind.view.mindmapview.RightNodeViewLayout();
    accessories.plugins.time.JYearChooser var1 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var2 = var1.getMouseListeners();
    boolean var3 = var1.isDoubleBuffered();
    int var4 = var1.getEndYear();
    java.awt.Dimension var5 = var1.getMinimumSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.layoutContainer((java.awt.Container)var1);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var1 = var0.getUI();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    freemind.main.Resources.createInstance((freemind.main.FreeMindMain)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.showOpenDialog((java.awt.Component)var2);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    freemind.view.mindmapview.MindMapLayout var2 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var5 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var5.requestFocus();
    javax.swing.InputVerifier var7 = var5.getInputVerifier();
    var2.removeLayoutComponent((java.awt.Component)var5);
    accessories.plugins.time.JYearChooser var9 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var10 = var9.getMouseListeners();
    var2.removeLayoutComponent((java.awt.Component)var9);
    var0.setLayout((java.awt.LayoutManager)var2);
    freemind.controller.FreeMindToolBar var15 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var15.updateUI();
    var15.setIgnoreRepaint(false);
    java.awt.Dimension var19 = var15.getSize();
    var0.setMinimumSize(var19);
    freemind.view.mindmapview.MapView.ScrollPane var21 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var22 = var21.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var23 = new accessories.plugins.time.JTripleCalendar();
    boolean var24 = var23.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var25 = var23.getDayChooser();
    java.awt.Color var26 = var25.getSundayForeground();
    var21.setColumnHeaderView((java.awt.Component)var25);
    java.util.Locale var28 = var25.getLocale();
    java.awt.Graphics var29 = var25.getGraphics();
    var0.setDayChooser(var25);
    freemind.main.XMLElement var31 = new freemind.main.XMLElement();
    java.lang.String var32 = var31.getTagName();
    java.util.Iterator var33 = var31.enumerateAttributeNames();
    java.util.Vector var35 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var36 = new freemind.modes.StylePattern(var31, (java.util.List)var35);
    boolean var37 = var36.getAppliesToEdge();
    accessories.plugins.time.JTripleCalendar var38 = new accessories.plugins.time.JTripleCalendar();
    boolean var39 = var38.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var40 = var38.getDayChooser();
    accessories.plugins.time.JYearChooser var41 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var42 = var41.getMouseListeners();
    var41.repaint(100L, 1, (-1), 100, 1);
    var40.setYearChooser(var41);
    accessories.plugins.time.JTripleCalendar var50 = new accessories.plugins.time.JTripleCalendar();
    boolean var51 = var50.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var52 = var50.getDayChooser();
    java.awt.Color var53 = var52.getSundayForeground();
    var40.setDecorationBackgroundColor(var53);
    var36.setEdgeColor(var53);
    var25.setWeekdayForeground(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    int var10 = var8.getMnemonic();
    javax.swing.Icon var11 = var8.getDisabledSelectedIcon();
    var8.setMnemonic(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    var0.setEdgeStyle("");
    java.lang.Integer var8 = var0.getEdgeWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var2 = var0.getTermsOfUseText();
    var0.setTermsOfUseText("control");
    java.lang.String var5 = var0.getAttributionLinkURL();
    java.awt.Image var6 = var0.getAttributionImage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://openstreetmap.org/"+ "'", var5.equals("http://openstreetmap.org/"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    accessories.plugins.time.JSpinField var0 = new accessories.plugins.time.JSpinField();
    var0.updateUI();

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isMultiSelectionEnabled();
    java.io.FilenameFilter var2 = var0.getFilenameFilter();
    freemind.controller.FreeMindToolBar var5 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var6 = var5.isLightweight();
    int var7 = var5.getWidth();
    var5.list();
    freemind.controller.FreeMindToolBar var11 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var11.updateUI();
    var11.setIgnoreRepaint(false);
    javax.swing.Action var15 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var16 = var11.add(var15);
    javax.swing.JButton var17 = var5.add(var15);
    freemind.view.mindmapview.LeftNodeViewLayout var18 = new freemind.view.mindmapview.LeftNodeViewLayout();
    freemind.common.FreeMindProgressMonitor var20 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var20.revalidate();
    var20.addNotify();
    var20.hide();
    var20.setResizable(false);
    var18.removeLayoutComponent((java.awt.Component)var20);
    var17.setLayout((java.awt.LayoutManager)var18);
    accessories.plugins.time.JCalendar var28 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var29 = var28.getCalendar();
    java.util.Date var30 = var28.getMaxSelectableDate();
    java.lang.String var31 = var28.getToolTipText();
    var28.setOpaque(false);
    accessories.plugins.time.JTripleCalendar var34 = new accessories.plugins.time.JTripleCalendar();
    boolean var35 = var34.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var36 = var34.getDayChooser();
    boolean var37 = var36.isDecorationBordersVisible();
    java.util.GregorianCalendar var38 = var36.getTemporaryCalendar();
    var28.setCalendar((java.util.Calendar)var38);
    java.awt.Dimension var40 = var18.preferredLayoutSize((java.awt.Container)var28);
    var0.setMinimumSize(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.common.NumberProperty var5 = new freemind.common.NumberProperty("file:/home/joao/workspace/\n", "PositionHolder [lat=10.0, lon=1.0, zoom=100]", 11, 7, 30);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    java.util.Locale var6 = var2.getLocale();
    var2.start();
    boolean var8 = var2.isApplet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var3 = var2.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var4 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var5 = var4.getResources();
    java.awt.Container var6 = var4.getContentPane();
    var2.remove((java.awt.Component)var4);
    boolean var8 = var4.isApplet();
    accessories.plugins.time.JCalendar var9 = new accessories.plugins.time.JCalendar();
    java.awt.Color var10 = var9.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var11 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var12 = var11.getCalendar();
    java.util.Date var13 = var11.getMaxSelectableDate();
    var9.setDate(var13);
    accessories.plugins.time.JDayChooser var15 = var9.getDayChooser();
    var4.setContentPane((java.awt.Container)var9);
    boolean var17 = var4.isActive();
    java.util.Vector var19 = freemind.main.Tools.urlStringToUrls("control");
    freemind.common.IconProperty var20 = new freemind.common.IconProperty("IntHolder(100)", "OSM MapQuest.Open Map", (freemind.main.FreeMindMain)var4, var19);
    java.lang.String var21 = var20.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "OSM MapQuest.Open Map"+ "'", var21.equals("OSM MapQuest.Open Map"));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    java.lang.String var1 = freemind.main.Tools.getFileNameFromRestorable("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "//otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png"+ "'", var1.equals("//otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    freemind.controller.FreeMindToolBar var1 = new freemind.controller.FreeMindToolBar("hi!");

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    freemind.main.Tools.BooleanHolder var1 = new freemind.main.Tools.BooleanHolder(true);
    freemind.main.Tools.BooleanHolder var3 = new freemind.main.Tools.BooleanHolder(true);
    boolean var4 = freemind.main.Tools.safeEquals(var1, var3);
    boolean var5 = var1.getValue();
    var1.setValue(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    var8.setDisplayedMnemonicIndex(1);
    int var11 = var8.getMnemonic();
    var8.addNotify();
    var8.setFocusPainted(true);
    javax.swing.Action var15 = javax.swing.TransferHandler.getCutAction();
    var8.setAction(var15);
    freemind.main.Tools.setLabelAndMnemonic(var15, "/home/joao/workspace/\n");
    freemind.main.Tools.setLabelAndMnemonic(var15, "images/icons/");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    java.awt.Color var3 = var2.getSundayForeground();
    var2.reshape(2014, (-1), 11, 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    freemind.modes.mindmapmode.actions.xml.ActionFactory var5 = new freemind.modes.mindmapmode.actions.xml.ActionFactory(var3);
    freemind.controller.NodeMotionListener var6 = var3.getNodeMotionListener();
    freemind.controller.filter.FilterController var7 = var3.getFilterController();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var2.isDecorationBordersVisible();
    java.util.GregorianCalendar var4 = var2.getTemporaryCalendar();
    accessories.plugins.time.JCalendar var5 = new accessories.plugins.time.JCalendar((java.util.Calendar)var4);
    accessories.plugins.time.JCalendar var6 = new accessories.plugins.time.JCalendar((java.util.Calendar)var4);
    var6.setFocusCycleRoot(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    int var1 = var0.getWinHeight();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    freemind.controller.FreeMindToolBar var6 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var6.updateUI();
    var6.setIgnoreRepaint(false);
    java.awt.Dimension var10 = var6.getSize();
    var2.setMaximumSize(var10);
    var0.resize(var10);
    var0.destroy();
    java.awt.Component var14 = var0.getGlassPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


    java.lang.String var1 = freemind.preferences.layout.KeyEventTranslator.modifiersToString(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "meta"+ "'", var1.equals("meta"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    accessories.plugins.time.ReminderHook var0 = new accessories.plugins.time.ReminderHook();
    var0.setRemindUserAt(10L);
    freemind.modes.common.plugins.ReminderHookBase.TimerBlinkTask var4 = var0.new TimerBlinkTask(false);
    int var5 = var0.getRemindUserAtAsSecondsFromNow();
    var0.processUnfinishedLinks();
    freemind.modes.common.plugins.ReminderHookBase.TimerBlinkTask var8 = var0.new TimerBlinkTask(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2147483648));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    freemind.common.StringProperty var2 = new freemind.common.StringProperty("Arrow_ID_515901044", "open map");

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.requestFocus();
    javax.swing.InputVerifier var4 = var2.getInputVerifier();
    freemind.view.mindmapview.MindMapLayout var5 = new freemind.view.mindmapview.MindMapLayout();
    var2.setLayout((java.awt.LayoutManager)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var1 = var0.getCalendar();
    freemind.controller.FreeMindToolBar var4 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var4.updateUI();
    var4.setIgnoreRepaint(false);
    java.awt.Dimension var8 = var4.getSize();
    var0.setMaximumSize(var8);
    accessories.plugins.time.JCalendar var10 = new accessories.plugins.time.JCalendar();
    java.awt.Color var11 = var10.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var12 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var13 = var12.getCalendar();
    java.util.Date var14 = var12.getMaxSelectableDate();
    var10.setDate(var14);
    var10.setWeekOfYearVisible(true);
    java.util.Date var18 = var10.getMaxSelectableDate();
    java.util.Date var19 = var10.getMinSelectableDate();
    var0.setMaxSelectableDate(var19);
    java.lang.String var21 = freemind.main.Tools.dateToString(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "-62135755137457"+ "'", var21.equals("-62135755137457"));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.requestFocus();
    int var4 = var2.getComponentCount();
    var2.addSeparator();
    accessories.plugins.time.JYearChooser var6 = new accessories.plugins.time.JYearChooser();
    java.awt.Insets var7 = var6.getInsets();
    var2.setMargin(var7);
    boolean var9 = var2.isRollover();
    javax.swing.InputMap var10 = var2.getInputMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    java.lang.String var4 = freemind.main.Tools.expandPlaceholders(".*(open map).*", "/home/joao/workspace/\n", "file:/home/joao/workspace/\n", "0;0;");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ".*(open map).*"+ "'", var4.equals(".*(open map).*"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.MindIcon var4 = freemind.modes.MindIcon.factory("hi!");
    var0.setNodeIcon(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    freemind.view.mindmapview.MindMapLayout var2 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var5 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var5.requestFocus();
    javax.swing.InputVerifier var7 = var5.getInputVerifier();
    var2.removeLayoutComponent((java.awt.Component)var5);
    accessories.plugins.time.JYearChooser var9 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var10 = var9.getMouseListeners();
    var2.removeLayoutComponent((java.awt.Component)var9);
    var0.setLayout((java.awt.LayoutManager)var2);
    freemind.controller.FreeMindToolBar var15 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var15.updateUI();
    var15.setIgnoreRepaint(false);
    java.awt.Dimension var19 = var15.getSize();
    var0.setMinimumSize(var19);
    var0.setEndYear(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.controller.FreeMindToolBar var1 = new freemind.controller.FreeMindToolBar(20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var1 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var2 = var1.createReader();
    boolean var3 = var2.ready();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = freemind.modes.StylePattern.loadPatterns(var2);
      fail("Expected exception of type freemind.main.XMLParseException");
    } catch (freemind.main.XMLParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.awt.Point var7 = var0.location();
    javax.swing.JRootPane var8 = var0.getRootPane();
    javax.swing.JScrollBar var9 = var0.getHorizontalScrollBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    boolean var3 = var1.isUndecorated();
    freemind.view.mindmapview.MapView.ScrollPane var4 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var5 = var4.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var6 = new accessories.plugins.time.JTripleCalendar();
    boolean var7 = var6.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var8 = var6.getDayChooser();
    java.awt.Color var9 = var8.getSundayForeground();
    var4.setColumnHeaderView((java.awt.Component)var8);
    java.util.Locale var11 = var8.getLocale();
    javax.swing.JButton var12 = var8.getSelectedDay();
    var1.setLocationRelativeTo((java.awt.Component)var8);
    var8.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var1 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ToolBarUI"+ "'", var2.equals("ToolBarUI"));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    var4.setAlwaysFireDayProperty(true);
    var4.reshape(292278994, 292278994, 2014, 11);
    java.util.Date var14 = var4.getMaxSelectableDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.awt.Color var1 = var0.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    java.util.Date var4 = var2.getMaxSelectableDate();
    var0.setDate(var4);
    var0.setWeekOfYearVisible(true);
    java.util.Date var8 = var0.getMaxSelectableDate();
    freemind.common.FreeMindProgressMonitor var10 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var11 = var10.getInputMethodListeners();
    var10.show();
    java.awt.Window.Type var13 = var10.getType();
    java.util.Locale var14 = var10.getLocale();
    accessories.plugins.time.JCalendar var17 = new accessories.plugins.time.JCalendar(var8, var14, true, false);
    freemind.view.mindmapview.MapView.ScrollPane var18 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var19 = var18.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var20 = new accessories.plugins.time.JTripleCalendar();
    boolean var21 = var20.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var22 = var20.getDayChooser();
    java.awt.Color var23 = var22.getSundayForeground();
    var18.setColumnHeaderView((java.awt.Component)var22);
    java.util.Locale var25 = var22.getLocale();
    accessories.plugins.time.JTripleCalendar var26 = new accessories.plugins.time.JTripleCalendar();
    boolean var27 = var26.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var28 = var26.getDayChooser();
    accessories.plugins.time.JYearChooser var29 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var30 = var29.getMouseListeners();
    var29.repaint(100L, 1, (-1), 100, 1);
    var28.setYearChooser(var29);
    accessories.plugins.time.JTripleCalendar var38 = new accessories.plugins.time.JTripleCalendar();
    boolean var39 = var38.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var40 = var38.getDayChooser();
    java.awt.Color var41 = var40.getSundayForeground();
    var28.setDecorationBackgroundColor(var41);
    var22.setForeground(var41);
    var17.setSundayForeground(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test367");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    javax.swing.plaf.ToolBarUI var4 = var2.getUI();
    accessories.plugins.time.JSpinField var7 = new accessories.plugins.time.JSpinField(10, 1);
    var7.setValue(292278994);
    java.awt.event.ContainerListener[] var10 = var7.getContainerListeners();
    java.awt.Dimension var11 = var7.getMinimumSize();
    int var12 = var2.getComponentIndex((java.awt.Component)var7);
    java.awt.event.MouseListener[] var13 = var7.getMouseListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.swing.plaf.ScrollPaneUI var1 = var0.getUI();
    int var2 = var0.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    var8.setDisplayedMnemonicIndex(1);
    int var11 = var8.getMnemonic();
    javax.swing.Icon var12 = var8.getPressedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    java.net.URL var5 = var3.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var6 = new freemind.controller.MapMouseWheelListener(var3);
    freemind.modes.FreeMindJFileDialog var7 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var8 = var7.getUI();
    accessories.plugins.time.JMonthChooser var10 = new accessories.plugins.time.JMonthChooser(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.informationMessage((java.lang.Object)var8, (javax.swing.JComponent)var10);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    java.lang.String var1 = freemind.modes.NodeAdapter.convertToEncodedContent("meta");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "meta"+ "'", var1.equals("meta"));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


    javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


    byte[] var1 = freemind.main.Tools.fromBase64("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.setStartYear(10);
    var0.firePropertyChange("file:/home/joao/workspace/\n", true, true);
    var0.repaint(1L);
    java.awt.LayoutManager var10 = var0.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    int var2 = var0.getMonth();
    java.awt.Component var3 = var0.getSpinner();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    boolean var8 = var1.isValidateRoot();
    accessories.plugins.time.JCalendar var9 = new accessories.plugins.time.JCalendar();
    java.awt.Color var10 = var9.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var11 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var12 = var11.getCalendar();
    java.util.Date var13 = var11.getMaxSelectableDate();
    var9.setDate(var13);
    var9.setWeekOfYearVisible(true);
    var1.addPropertyChangeListener((java.beans.PropertyChangeListener)var9);
    int var18 = var1.getDefaultCloseOperation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


    freemind.main.Resources var2 = freemind.main.Resources.getInstance();
    java.lang.String var4 = var2.getResourceString("");
    freemind.common.RemindValueProperty var5 = new freemind.common.RemindValueProperty("ButtonUI", "joao@BetelgeuseLX", (freemind.common.TextTranslator)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setValue("Png");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    freemind.common.StringProperty var2 = new freemind.common.StringProperty("", "hi!");
    var2.setValue("file:/home/joao/workspace/\n");
    java.lang.String var5 = var2.getDescription();
    java.lang.String var6 = var2.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.setStartYear(10);
    int var4 = var0.getMaximum();
    accessories.plugins.time.JTripleCalendar var5 = new accessories.plugins.time.JTripleCalendar();
    boolean var6 = var5.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var7 = var5.getDayChooser();
    java.awt.Insets var8 = var5.getInsets();
    java.awt.Insets var9 = var0.getInsets(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    boolean var18 = var8.isContentAreaFilled();
    int var19 = var8.getHorizontalTextPosition();
    javax.swing.event.ChangeListener[] var20 = var8.getChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    plugins.script.SignedScriptHandler.ScriptContents var0 = new plugins.script.SignedScriptHandler.ScriptContents();

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    var8.setDisplayedMnemonicIndex(1);
    int var11 = var8.getMnemonic();
    var8.addNotify();
    var8.setFocusPainted(true);
    var8.setSelected(true);
    java.lang.String var17 = var8.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.controller.FreeMindToolBar var1 = new freemind.controller.FreeMindToolBar(200);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.controller.MenuBar var2 = var0.getFreeMindMenuBar();
    int var3 = var0.getWinHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JFrame var4 = var0.getJFrame();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


    accessories.plugins.ClonePasteAction var0 = new accessories.plugins.ClonePasteAction();

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPropertiesAccess();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkRead("images/icons/");
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


    java.lang.String var1 = freemind.modes.NodeAdapter.convertToEncodedContent("16");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "16"+ "'", var1.equals("16"));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    int var2 = var0.getHorizontalScrollBarPolicy();
    int var3 = var0.getWidth();
    boolean var4 = var0.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setOrientation(292278994);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    freemind.modes.MindMapLinkRegistry var0 = new freemind.modes.MindMapLinkRegistry();
    var0.registerLocalHyperlinkId("false");

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    var0.setLocation(2014, (-1));
    var0.revalidate();
    boolean var5 = var0.isFocusTraversable();
    accessories.plugins.time.JCalendar var6 = new accessories.plugins.time.JCalendar();
    java.awt.Color var7 = var6.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var8 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var9 = var8.getCalendar();
    java.util.Date var10 = var8.getMaxSelectableDate();
    java.lang.String var11 = var8.getToolTipText();
    var8.setOpaque(false);
    accessories.plugins.time.JTripleCalendar var14 = new accessories.plugins.time.JTripleCalendar();
    boolean var15 = var14.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var16 = var14.getDayChooser();
    boolean var17 = var16.isDecorationBordersVisible();
    java.util.GregorianCalendar var18 = var16.getTemporaryCalendar();
    var8.setCalendar((java.util.Calendar)var18);
    var6.setCalendar((java.util.Calendar)var18);
    var0.propagateDate((java.util.Calendar)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.setIgnoreRepaint(false);
    javax.swing.Action var6 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var7 = var2.add(var6);
    boolean var8 = var7.isFocusPainted();
    boolean var9 = var7.isDefaultButton();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.hide();
    java.awt.Container var5 = var1.getFocusCycleRootAncestor();
    freemind.view.mindmapview.LeftNodeViewLayout var6 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var1.setLayout((java.awt.LayoutManager)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setOpacity((-1.0f));
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    java.lang.String var1 = freemind.main.HtmlTools.replaceSpacesToNonbreakableSpaces("/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "/home/joao/workspace/\n"+ "'", var1.equals("/home/joao/workspace/\n"));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    boolean var7 = var0.isPaintingTile();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setHorizontalScrollBarPolicy(256);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


    freemind.controller.filter.condition.AttributeNotExistsCondition var1 = new freemind.controller.filter.condition.AttributeNotExistsCondition("control");

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkConnect("//otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", 6);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    java.lang.String var1 = freemind.main.Tools.expandFileName("IntHolder(0)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "IntHolder(0)"+ "'", var1.equals("IntHolder(0)"));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    javax.swing.ImageIcon var0 = freemind.modes.common.plugins.MapNodePositionHolderBase.getMapLocationIcon();
    java.awt.image.ImageObserver var1 = var0.getImageObserver();
    java.awt.image.ImageObserver var2 = var0.getImageObserver();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    var8.setDisplayedMnemonicIndex(1);
    int var11 = var8.getMnemonic();
    var8.addNotify();
    var8.setFocusPainted(true);
    var8.setSelected(true);
    var8.setBorderPainted(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    accessories.plugins.time.JMonthChooser var1 = new accessories.plugins.time.JMonthChooser(true);
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    freemind.controller.MenuBar var4 = var2.getFreeMindMenuBar();
    accessories.plugins.time.JTripleCalendar var5 = new accessories.plugins.time.JTripleCalendar();
    boolean var6 = var5.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var7 = var5.getDayChooser();
    var2.remove((java.awt.Component)var7);
    java.util.Locale var9 = var7.getLocale();
    var1.setLocale(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    var0.requestFocus();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    var0.setCalendar(var3);
    accessories.plugins.time.JYearChooser var5 = var0.getYearChooser();
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var7.revalidate();
    var7.addNotify();
    java.awt.event.WindowListener[] var10 = var7.getWindowListeners();
    java.lang.Object var11 = var5.getClientProperty((java.lang.Object)var7);
    javax.swing.JPopupMenu var12 = var5.getComponentPopupMenu();
    freemind.common.FreeMindProgressMonitor var14 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var14.revalidate();
    boolean var16 = var14.isUndecorated();
    var14.validate();
    javax.accessibility.AccessibleContext var18 = var14.getAccessibleContext();
    java.beans.PropertyChangeListener[] var19 = var14.getPropertyChangeListeners();
    accessories.plugins.time.JYearChooser var20 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var21 = var20.getUI();
    java.awt.Dimension var22 = var20.minimumSize();
    var14.setSize(var22);
    java.awt.Dimension var24 = var5.getSize(var22);
    var5.setDebugGraphicsOptions(2014);
    boolean var27 = var5.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.awt.Point var7 = var0.location();
    javax.swing.JRootPane var8 = var0.getRootPane();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setHorizontalScrollBarPolicy(7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var11.addNotify();
    var11.setFocusTraversalPolicyProvider(false);
    java.awt.Point var16 = var11.location();
    boolean var17 = var8.contains(var16);
    boolean var18 = var8.isContentAreaFilled();
    freemind.view.mindmapview.MindMapLayout var19 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var22 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var22.requestFocus();
    javax.swing.InputVerifier var24 = var22.getInputVerifier();
    var19.removeLayoutComponent((java.awt.Component)var22);
    var8.setLayout((java.awt.LayoutManager)var19);
    javax.swing.Icon var27 = var8.getRolloverIcon();
    int var28 = var8.getDisplayedMnemonicIndex();
    java.awt.Cursor var29 = var8.getCursor();
    var8.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    byte[] var1 = freemind.main.Tools.fromBase64("");
    java.lang.String var2 = freemind.main.Tools.toBase64(var1);
    java.lang.String var3 = freemind.main.Base64Coding.encode64(var1);
    java.lang.String var4 = freemind.main.Base64Coding.encode64(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    java.lang.String var1 = freemind.preferences.layout.KeyEventTranslator.getSymbolicModifierName(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "meta"+ "'", var1.equals("meta"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    freemind.main.Resources var3 = freemind.main.Resources.getInstance();
    java.lang.String var5 = var3.getResourceString("");
    freemind.common.ColorProperty var6 = new freemind.common.ColorProperty("file:/home/joao/workspace/\n", "hi!", "file:/home/joao/workspace/\n", (freemind.common.TextTranslator)var3);
    java.lang.String var7 = var6.getDescription();
    java.lang.String var8 = var6.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var7.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var8.equals("file:/home/joao/workspace/\n"));

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    java.util.Vector var1 = freemind.main.Tools.urlStringToUrls("hi!");
    freemind.controller.filter.util.ExtendedComboBoxModel var2 = new freemind.controller.filter.util.ExtendedComboBoxModel(var1);
    var2.removeAllElements();
    freemind.common.StringProperty var6 = new freemind.common.StringProperty("file:/home/joao/workspace/\n", "ToolBarUI");
    accessories.plugins.time.JTripleCalendar var7 = new accessories.plugins.time.JTripleCalendar();
    var7.revalidate();
    var6.addPropertyChangeListener((java.beans.PropertyChangeListener)var7);
    boolean var10 = var7.getAutoscrolls();
    boolean var11 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var7);
    var2.removeElement((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    java.lang.String var9 = var8.getUIClassID();
    accessories.plugins.time.JSpinField var12 = new accessories.plugins.time.JSpinField(10, 1);
    var12.setValue(292278994);
    java.awt.event.ContainerListener[] var15 = var12.getContainerListeners();
    var8.addChangeListener((javax.swing.event.ChangeListener)var12);
    boolean var17 = var8.getHideActionText();
    javax.swing.ImageIcon var18 = freemind.modes.common.plugins.MapNodePositionHolderBase.getMapLocationIcon();
    var8.setIcon((javax.swing.Icon)var18);
    java.lang.String var20 = var18.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "file:/home/joao/workspace/FreeMind_integration/bin/classes/images/map_location.png"+ "'", var20.equals("file:/home/joao/workspace/FreeMind_integration/bin/classes/images/map_location.png"));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


    java.lang.String var1 = freemind.main.HtmlTools.htmlToPlain("file:/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var1.equals("file:/home/joao/workspace/\n"));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var2.isDecorationBordersVisible();
    java.util.GregorianCalendar var4 = var2.getTemporaryCalendar();
    var2.firePropertyChange("open map", 0L, 0L);
    java.awt.Component.BaselineResizeBehavior var9 = var2.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    freemind.modes.HistoryInformation var0 = new freemind.modes.HistoryInformation();
    accessories.plugins.time.JCalendar var1 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var2 = var1.getCalendar();
    java.util.Date var3 = var1.getMaxSelectableDate();
    var0.setCreatedAt(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    java.net.URL var5 = var3.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.modes.StylePattern var6 = new freemind.modes.StylePattern();
    var6.setEdgeStyle("hi!");
    freemind.modes.StylePattern var9 = var6.getChildrenStylePattern();
    freemind.modes.StylePattern var10 = new freemind.modes.StylePattern();
    var6.setChildrenStylePattern(var10);
    boolean var12 = var6.getRecursive();
    freemind.modes.MindIcon var13 = var6.getNodeIcon();
    freemind.view.mindmapview.MapView.ScrollPane var14 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var15 = var14.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var16 = new accessories.plugins.time.JTripleCalendar();
    boolean var17 = var16.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var18 = var16.getDayChooser();
    java.awt.Color var19 = var18.getSundayForeground();
    var14.setColumnHeaderView((java.awt.Component)var18);
    var14.enableInputMethods(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.informationMessage((java.lang.Object)var6, (javax.swing.JComponent)var14);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.MouseListener[] var2 = var1.getMouseListeners();
    boolean var3 = var1.isUndecorated();
    var1.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    javax.swing.plaf.ToolBarUI var4 = var2.getUI();
    freemind.controller.FreeMindToolBar var7 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var7.updateUI();
    var7.setIgnoreRepaint(false);
    var7.setVisible(false);
    boolean var13 = var2.isAncestorOf((java.awt.Component)var7);
    var7.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


    java.util.Vector var1 = freemind.main.Tools.urlStringToUrls("hi!");
    freemind.controller.filter.util.ExtendedComboBoxModel var2 = new freemind.controller.filter.util.ExtendedComboBoxModel(var1);
    javax.swing.event.ListDataListener[] var3 = var2.getListDataListeners();
    plugins.collaboration.database.DatabaseConnector var4 = new plugins.collaboration.database.DatabaseConnector();
    var2.removeElement((java.lang.Object)var4);
    var2.removeAllElements();
    java.lang.Object var7 = var2.getSelectedItem();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


    freemind.main.Resources var2 = freemind.main.Resources.getInstance();
    java.lang.String var4 = var2.getResourceString("");
    java.lang.String var6 = var2.getText("hi!");
    freemind.common.FontProperty var7 = new freemind.common.FontProperty("/home/joao/workspace/FreeMind_integration/bin/classes/", "images/icons///SIGN:null\n", (freemind.common.TextTranslator)var2);
    var7.setEnabled(true);
    java.lang.String var10 = var7.getValue();
    var7.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Abyssinica SIL"+ "'", var10.equals("Abyssinica SIL"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("hi!");
    var3.checkSystemClipboardAccess();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkWrite("6");
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


    java.lang.String[] var3 = new java.lang.String[] { "/home/joao/workspace/FreeMind_integration/bin/classes/"};
    freemind.main.Resources var4 = freemind.main.Resources.getInstance();
    java.net.URL var6 = var4.getResource("file:/home/joao/workspace/\n");
    java.lang.String var8 = var4.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var10 = var4.createTranslatedString("");
    freemind.common.ComboProperty var11 = new freemind.common.ComboProperty(".", "<a,23>", var3, (freemind.common.TextTranslator)var4);
    var11.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    plugins.script.ScriptEditorPanel.ScriptHolder var2 = new plugins.script.ScriptEditorPanel.ScriptHolder("", "hi!");
    java.lang.String var3 = var2.getScriptName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


    plugins.map.TileImage var0 = new plugins.map.TileImage();
    java.awt.image.RenderedImage var1 = var0.getImage();
    java.awt.image.RenderedImage var2 = var0.getImage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


    freemind.common.DontShowNotificationProperty var2 = new freemind.common.DontShowNotificationProperty("file:/home/joao/workspace/\n", "OSM MapQuest.Open Map");
    java.lang.String var3 = var2.getLabel();
    var2.setEnabled(false);
    java.lang.String var6 = var2.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setValue("Abyssinica SIL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    java.lang.String var1 = freemind.main.Tools.removeMnemonic("control");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "control"+ "'", var1.equals("control"));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    java.awt.event.WindowListener[] var4 = var1.getWindowListeners();
    var1.transferFocus();
    var1.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    freemind.main.Resources var2 = freemind.main.Resources.getInstance();
    java.lang.String var4 = var2.getResourceString("");
    java.lang.String var6 = var2.getText("hi!");
    freemind.common.FontProperty var7 = new freemind.common.FontProperty("/home/joao/workspace/FreeMind_integration/bin/classes/", "images/icons///SIGN:null\n", (freemind.common.TextTranslator)var2);
    var7.setEnabled(true);
    var7.setValue("<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>");
    var7.setValue("OSM MapQuest.Open Map");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.modes.mindmapmode.hooks.MindMapHookFactory var2 = new freemind.modes.mindmapmode.hooks.MindMapHookFactory((freemind.main.FreeMindMain)var0);
    java.util.List var3 = var2.getRegistrations();
    var2.deregisterAllRegistrationContainer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.extensions.HookInstanciationMethod var6 = var2.getInstanciationMethod("Abyssinica SIL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    java.lang.String var1 = var0.getTagName();
    int var2 = var0.countChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("hi!");
    var3.checkSecurityAccess("");
    var3.checkPropertyAccess("ToolBarUI");
    var3.checkPropertyAccess("<a,23>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkConnect("ButtonUI", 11);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.setFocusTraversalPolicyProvider(false);
    boolean var6 = var1.isValidateRoot();
    freemind.common.FreeMindProgressMonitor var8 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var8.dispose();
    java.awt.event.ContainerListener[] var10 = var8.getContainerListeners();
    java.awt.Rectangle var11 = var8.getBounds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setShape((java.awt.Shape)var11);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    freemind.main.Resources var3 = freemind.main.Resources.getInstance();
    java.lang.String var5 = var3.getResourceString("");
    freemind.common.ColorProperty var6 = new freemind.common.ColorProperty("file:/home/joao/workspace/\n", "hi!", "file:/home/joao/workspace/\n", (freemind.common.TextTranslator)var3);
    java.util.logging.Logger var8 = var3.getLogger("control");
    java.util.HashMap var9 = var3.getCountryMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    freemind.modes.MindIcon var1 = freemind.modes.MindIcon.factory("hi!");
    java.lang.String var2 = var1.getIconFileName();
    java.lang.String var3 = var1.getKeystrokeResourceName();
    javax.swing.JComponent var4 = var1.getRendererComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "images/icons/hi!.png"+ "'", var2.equals("images/icons/hi!.png"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "keystroke_icon_hi!"+ "'", var3.equals("keystroke_icon_hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    var4.setAlwaysFireDayProperty(true);
    var4.reshape(292278994, 292278994, 2014, 11);
    freemind.controller.filter.util.SortedMapVector var14 = new freemind.controller.filter.util.SortedMapVector();
    freemind.modes.StylePattern var16 = new freemind.modes.StylePattern();
    var16.setEdgeStyle("hi!");
    freemind.modes.StylePattern var19 = var16.getChildrenStylePattern();
    freemind.modes.StylePattern var20 = new freemind.modes.StylePattern();
    var16.setChildrenStylePattern(var20);
    accessories.plugins.time.JTripleCalendar var22 = new accessories.plugins.time.JTripleCalendar();
    boolean var23 = var22.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var24 = var22.getDayChooser();
    accessories.plugins.time.JYearChooser var25 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var26 = var25.getMouseListeners();
    var25.repaint(100L, 1, (-1), 100, 1);
    var24.setYearChooser(var25);
    accessories.plugins.time.JTripleCalendar var34 = new accessories.plugins.time.JTripleCalendar();
    boolean var35 = var34.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var36 = var34.getDayChooser();
    java.awt.Color var37 = var36.getSundayForeground();
    var24.setDecorationBackgroundColor(var37);
    var16.setNodeColor(var37);
    int var40 = var14.add((java.lang.Comparable)"joao@BetelgeuseLX", (java.lang.Object)var37);
    var4.setForeground(var37);
    accessories.plugins.time.JTripleCalendar var42 = new accessories.plugins.time.JTripleCalendar();
    boolean var43 = var42.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var44 = var42.getDayChooser();
    accessories.plugins.time.JYearChooser var45 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var46 = var45.getMouseListeners();
    var45.repaint(100L, 1, (-1), 100, 1);
    var44.setYearChooser(var45);
    accessories.plugins.time.JTripleCalendar var54 = new accessories.plugins.time.JTripleCalendar();
    boolean var55 = var54.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var56 = var54.getDayChooser();
    java.awt.Color var57 = var56.getSundayForeground();
    var44.setDecorationBackgroundColor(var57);
    var4.setDecorationBackgroundColor(var57);
    freemind.controller.FreeMindToolBar var62 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var62.updateUI();
    var62.setIgnoreRepaint(false);
    java.awt.Dimension var66 = var62.getSize();
    var4.setMinimumSize(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    freemind.controller.NodeDragListener var5 = new freemind.controller.NodeDragListener(var3);
    java.awt.Cursor var7 = var5.getCursorByAction(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.show();
    var1.setVisible(false);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    freemind.common.StringProperty var2 = new freemind.common.StringProperty("", "hi!");
    var2.setEnabled(true);
    var2.setEnabled(true);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test436");


    freemind.controller.filter.condition.Condition var0 = freemind.controller.filter.condition.SelectedViewCondition.CreateCondition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test437");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.setStartYear(10);
    int var4 = var0.getMaximum();
    var0.validate();
    boolean var6 = var0.getVerifyInputWhenFocusTarget();
    var0.setValue(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test438");


    java.lang.String var1 = freemind.main.Tools.compress("meta");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "eNrLTS1JBAAEMAGo"+ "'", var1.equals("eNrLTS1JBAAEMAGo"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test439");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var1 = var0.getUI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDialogType(20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test440");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    int var1 = var0.getMonth();
    freemind.common.FreeMindProgressMonitor var4 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.MouseListener[] var5 = var4.getMouseListeners();
    var0.putClientProperty((java.lang.Object)"OSM MapQuest.Open Map", (java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test441");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    javax.swing.JRootPane var3 = var0.getRootPane();
    accessories.plugins.time.JDayChooser var4 = var0.getDayChooser();
    javax.swing.event.AncestorListener[] var5 = var0.getAncestorListeners();
    freemind.controller.filter.condition.ConjunctConditions var6 = new freemind.controller.filter.condition.ConjunctConditions((java.lang.Object[])var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test442");


    freemind.common.DontShowNotificationProperty var2 = new freemind.common.DontShowNotificationProperty("file:/home/joao/workspace/FreeMind_integration/bin/classes/images/map_location.png", "//otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png");

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test443");


    byte[] var1 = freemind.main.Tools.fromBase64("/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test444");


    plugins.map.AddMapImageToNodeAction var0 = new plugins.map.AddMapImageToNodeAction();

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test445");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var2 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var3 = var2.getName();
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Iterator var5 = var0.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test446");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    var8.setDisplayedMnemonicIndex(1);
    int var11 = var8.getMnemonic();
    var8.addNotify();
    var8.setFocusPainted(true);
    javax.swing.Action var15 = javax.swing.TransferHandler.getCutAction();
    var8.setAction(var15);
    accessories.plugins.time.JYearChooser var17 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var18 = var17.getMouseListeners();
    var8.addChangeListener((javax.swing.event.ChangeListener)var17);
    int var20 = var8.getVerticalAlignment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test447");


    accessories.plugins.NewParentNode var0 = new accessories.plugins.NewParentNode();

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test448");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var2 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var3 = var2.getName();
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Iterator var5 = var0.iterator();
    var0.remove((java.lang.Object)"icon_hi!");
    freemind.modes.StylePattern var8 = new freemind.modes.StylePattern();
    var8.setEdgeStyle("hi!");
    freemind.modes.StylePattern var11 = var8.getChildrenStylePattern();
    freemind.modes.StylePattern var12 = new freemind.modes.StylePattern();
    var8.setChildrenStylePattern(var12);
    accessories.plugins.time.JTripleCalendar var14 = new accessories.plugins.time.JTripleCalendar();
    boolean var15 = var14.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var16 = var14.getDayChooser();
    java.awt.Color var17 = var16.getSundayForeground();
    var12.setNodeBackgroundColor(var17);
    var0.setSelectedItem((java.lang.Object)var12);
    boolean var20 = var12.getAppliesToNodeIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test449");


    freemind.common.StringProperty var2 = new freemind.common.StringProperty("OSM MapQuest.Open Map", "//otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png");

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test450");


    freemind.main.Resources var2 = freemind.main.Resources.getInstance();
    java.lang.String var4 = var2.getResourceString("");
    java.lang.String var6 = var2.getText("hi!");
    freemind.common.FontProperty var7 = new freemind.common.FontProperty("/home/joao/workspace/FreeMind_integration/bin/classes/", "images/icons///SIGN:null\n", (freemind.common.TextTranslator)var2);
    var7.setEnabled(true);
    var7.setValue("<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>");
    var7.setValue("control");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test451");


    freemind.modes.MindMapLinkRegistry var0 = new freemind.modes.MindMapLinkRegistry();
    freemind.modes.MindMapNode var2 = var0.getTargetForId("IntHolder(100)");
    java.lang.String var4 = var0.generateUniqueLinkId("control");
    var0.registerLocalHyperlinkId("[IndexPair");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "control"+ "'", var4.equals("control"));

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test452");


    freemind.controller.filter.condition.IconContainedCondition var1 = new freemind.controller.filter.condition.IconContainedCondition("");
    freemind.main.XMLElement var2 = new freemind.main.XMLElement();
    java.lang.String var3 = var2.getTagName();
    var1.save(var2);
    freemind.controller.filter.condition.ConditionNotSatisfiedDecorator var5 = new freemind.controller.filter.condition.ConditionNotSatisfiedDecorator((freemind.controller.filter.condition.Condition)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test453");


    freemind.view.mindmapview.MindMapLayout var0 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    int var5 = var3.getComponentCount();
    var3.addSeparator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.layoutContainer((java.awt.Container)var3);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test454");


    accessories.plugins.util.html.ClickableImageCreator.AreaHolder var0 = new accessories.plugins.util.html.ClickableImageCreator.AreaHolder();

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test455");


    accessories.plugins.dialogs.EnterPasswordDialog var0 = new accessories.plugins.dialogs.EnterPasswordDialog();
    int var1 = var0.getResult();
    freemind.common.FreeMindProgressMonitor var3 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var3.revalidate();
    var3.addNotify();
    var3.show();
    accessories.plugins.util.window.WindowClosingAdapter var7 = new accessories.plugins.util.window.WindowClosingAdapter();
    var3.removeWindowStateListener((java.awt.event.WindowStateListener)var7);
    accessories.plugins.time.JTripleCalendar var9 = new accessories.plugins.time.JTripleCalendar();
    boolean var10 = var9.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var11 = var9.getDayChooser();
    javax.swing.JRootPane var12 = var9.getRootPane();
    accessories.plugins.time.JDayChooser var13 = var9.getDayChooser();
    java.awt.event.HierarchyListener[] var14 = var9.getHierarchyListeners();
    var3.addPropertyChangeListener((java.beans.PropertyChangeListener)var9);
    float var16 = var9.getAlignmentY();
    var0.addPropertyChangeListener((java.beans.PropertyChangeListener)var9);
    int var18 = var0.getResult();
    javax.swing.Action var19 = javax.swing.TransferHandler.getPasteAction();
    freemind.main.Tools.addKeyActionToDialog((javax.swing.JDialog)var0, var19, "/home/joao/workspace/FreeMind_integration/bin/classes/", "http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test456");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    var0.requestFocus();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    var0.setCalendar(var3);
    accessories.plugins.time.JYearChooser var5 = var0.getYearChooser();
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var7.revalidate();
    var7.addNotify();
    java.awt.event.WindowListener[] var10 = var7.getWindowListeners();
    java.lang.Object var11 = var5.getClientProperty((java.lang.Object)var7);
    javax.swing.JPopupMenu var12 = var5.getComponentPopupMenu();
    freemind.common.FreeMindProgressMonitor var14 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var14.revalidate();
    boolean var16 = var14.isUndecorated();
    var14.validate();
    javax.accessibility.AccessibleContext var18 = var14.getAccessibleContext();
    java.beans.PropertyChangeListener[] var19 = var14.getPropertyChangeListeners();
    accessories.plugins.time.JYearChooser var20 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var21 = var20.getUI();
    java.awt.Dimension var22 = var20.minimumSize();
    var14.setSize(var22);
    java.awt.Dimension var24 = var5.getSize(var22);
    var5.setDebugGraphicsOptions(2014);
    var5.setValue(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test457");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var5 = var0.getTileUrl((-1), 0, 200);
    var0.setAttributionLinkURL("simplyhtml.//openstreetmap.org/");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png"+ "'", var5.equals("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test458");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    javax.swing.JRootPane var3 = var0.getRootPane();
    accessories.plugins.time.JDayChooser var4 = var0.getDayChooser();
    var4.setDay(100);
    accessories.plugins.time.JCalendar var7 = new accessories.plugins.time.JCalendar();
    java.awt.Color var8 = var7.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var9 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var10 = var9.getCalendar();
    java.util.Date var11 = var9.getMaxSelectableDate();
    var7.setDate(var11);
    accessories.plugins.time.JDayChooser var13 = var7.getDayChooser();
    accessories.plugins.time.JCalendar var14 = new accessories.plugins.time.JCalendar();
    java.awt.Color var15 = var14.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var16 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var17 = var16.getCalendar();
    java.util.Date var18 = var16.getMaxSelectableDate();
    var14.setDate(var18);
    var7.setMinSelectableDate(var18);
    accessories.plugins.time.JTripleCalendar var21 = new accessories.plugins.time.JTripleCalendar();
    boolean var22 = var21.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var23 = var21.getDayChooser();
    java.awt.Color var24 = var23.getSundayForeground();
    var23.setDayBordersVisible(true);
    java.awt.Color var27 = var23.getSundayForeground();
    var23.setMaxDayCharacters(11);
    freemind.common.FreeMindProgressMonitor var31 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var32 = var31.getInputMethodListeners();
    javax.accessibility.AccessibleContext var33 = var31.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var35 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var35.revalidate();
    var31.setLocationRelativeTo((java.awt.Component)var35);
    boolean var38 = var31.isValidateRoot();
    accessories.plugins.time.JCalendar var39 = new accessories.plugins.time.JCalendar();
    java.awt.Color var40 = var39.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var41 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var42 = var41.getCalendar();
    java.util.Date var43 = var41.getMaxSelectableDate();
    var39.setDate(var43);
    var39.setWeekOfYearVisible(true);
    var31.addPropertyChangeListener((java.beans.PropertyChangeListener)var39);
    accessories.plugins.time.JCalendar var48 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var49 = var48.getCalendar();
    java.util.Date var50 = var48.getMaxSelectableDate();
    var39.setMinSelectableDate(var50);
    accessories.plugins.time.JCalendar var53 = new accessories.plugins.time.JCalendar(var50, false);
    java.util.Date var54 = var23.setMaxSelectableDate(var50);
    var4.setSelectableDateRange(var18, var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test459");


    java.lang.String var0 = freemind.main.Tools.getHostIpAsString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "127.0.1.1"+ "'", var0.equals("127.0.1.1"));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test460");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkDelete("http://openstreetmap.org/");
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test461");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    var0.setFile("Png");
    java.lang.String var3 = var0.getTitle();
    freemind.main.ExampleFileFilter var4 = new freemind.main.ExampleFileFilter();
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var4);
    java.awt.Component.BaselineResizeBehavior var6 = var0.getBaselineResizeBehavior();
    freemind.view.mindmapview.MapView.ScrollPane var7 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var8 = var7.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var9 = new accessories.plugins.time.JTripleCalendar();
    boolean var10 = var9.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var11 = var9.getDayChooser();
    java.awt.Color var12 = var11.getSundayForeground();
    var7.setColumnHeaderView((java.awt.Component)var11);
    java.util.Locale var14 = var11.getLocale();
    javax.swing.JButton var15 = var11.getSelectedDay();
    var15.setDisplayedMnemonicIndex(1);
    accessories.plugins.time.JMonthChooser var18 = new accessories.plugins.time.JMonthChooser();
    var18.updateUI();
    java.awt.Dimension var20 = var18.preferredSize();
    var15.addItemListener((java.awt.event.ItemListener)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var22 = var0.showSaveDialog((java.awt.Component)var15);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test462");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var1 = var0.getUI();
    var0.setDialogTitle("keystroke_icon_hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test463");


    freemind.modes.mindmapmode.hooks.MindMapHookAdapter var0 = new freemind.modes.mindmapmode.hooks.MindMapHookAdapter();
    var0.setName("");

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test464");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    boolean var8 = var5.isFocusableWindow();
    int var9 = var5.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 59);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test465");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.MapMouseMotionListener var4 = var3.getMapMouseMotionListener();
    freemind.controller.MapModuleManager var5 = var3.getMapModuleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test466");


    freemind.modes.browsemode.BrowseHookFactory var0 = new freemind.modes.browsemode.BrowseHookFactory();
    java.util.Vector var1 = var0.getPossibleNodeHooks();
    freemind.extensions.ModeControllerHook var3 = var0.createModeControllerHook("OSM MapQuest.Open Map");
    freemind.extensions.HookInstanciationMethod var5 = var0.getInstanciationMethod("ToolBarUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test467");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    var0.setFileSelectionMode(1);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test468");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    java.lang.String var1 = var0.getTagName();
    java.lang.String var3 = var0.getProperty("joao@BetelgeuseLX");
    freemind.common.FreeMindProgressMonitor var6 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var6.revalidate();
    boolean var8 = var6.isUndecorated();
    var6.validate();
    java.awt.Container var10 = var6.getContentPane();
    javax.swing.JRootPane var11 = var6.getRootPane();
    var0.addProperty("-62135755137457", (java.lang.Object)var11);
    freemind.main.Resources var16 = freemind.main.Resources.getInstance();
    java.lang.String var18 = var16.getResourceString("");
    java.lang.String var20 = var16.getText("hi!");
    freemind.common.FontProperty var21 = new freemind.common.FontProperty("/home/joao/workspace/FreeMind_integration/bin/classes/", "images/icons///SIGN:null\n", (freemind.common.TextTranslator)var16);
    var0.setAttribute(".*(open map).*", (java.lang.Object)var21);
    var21.setValue("<html><body><p>file:/home/joao/workspace/<br>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test469");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.awt.Color var1 = var0.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    java.util.Date var4 = var2.getMaxSelectableDate();
    var0.setDate(var4);
    var0.removeNotify();
    accessories.plugins.time.JCalendar var7 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var8 = var7.getCalendar();
    java.util.Date var9 = var7.getMaxSelectableDate();
    var0.setMinSelectableDate(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test470");


    freemind.controller.filter.condition.IconContainedCondition var1 = new freemind.controller.filter.condition.IconContainedCondition("");
    freemind.main.XMLElement var2 = new freemind.main.XMLElement();
    java.lang.String var3 = var2.getTagName();
    int var4 = var2.getLineNr();
    int var6 = var2.getIntAttribute("ToolBarUI");
    var1.save(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test471");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    java.net.URL var5 = var3.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.NodeMouseMotionListener var6 = new freemind.controller.NodeMouseMotionListener(var3);
    var6.deregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test472");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("<a,23>");
    var3.checkLink("open map");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkDelete(".");
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test473");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isMultiSelectionEnabled();
    java.io.FilenameFilter var2 = var0.getFilenameFilter();
    var0.setDialogTitle("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test474");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    java.lang.String var2 = var0.getStringAttribute("ToolBarUI");
    java.lang.String var3 = var0.getName();
    int var5 = var0.getIntAttribute("images/icons/hi!.png");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test475");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.awt.Color var1 = var0.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    java.util.Date var4 = var2.getMaxSelectableDate();
    var0.setDate(var4);
    var0.setWeekOfYearVisible(true);
    boolean var8 = var0.isEnabled();
    java.awt.Color var9 = var0.getDecorationBackgroundColor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test476");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    int var4 = var2.getWidth();
    var2.addNotify();
    javax.accessibility.AccessibleContext var6 = var2.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test477");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    boolean var8 = var1.isValidateRoot();
    var1.transferFocus();
    boolean var10 = var1.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test478");


    freemind.main.Base64Coding var0 = new freemind.main.Base64Coding();

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test479");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    freemind.controller.filter.condition.AttributeNotExistsCondition var4 = new freemind.controller.filter.condition.AttributeNotExistsCondition("ToolBarUI");
    var1.setAttribute("ButtonUI", (java.lang.Object)"ToolBarUI");
    var1.removeChild("IntHolder(0)");
    var0.loadFrom(var1);
    int var10 = var1.getIntAttribute("<html><body><p>file:/home/joao/workspace/<br>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test480");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    var0.requestFocus();
    java.awt.event.InputMethodListener[] var2 = var0.getInputMethodListeners();
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test481");


    freemind.modes.mindmapmode.hooks.PermanentMindMapNodeHookAdapter var0 = new freemind.modes.mindmapmode.hooks.PermanentMindMapNodeHookAdapter();

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test482");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    boolean var8 = var1.isValidateRoot();
    accessories.plugins.time.JCalendar var9 = new accessories.plugins.time.JCalendar();
    java.awt.Color var10 = var9.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var11 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var12 = var11.getCalendar();
    java.util.Date var13 = var11.getMaxSelectableDate();
    var9.setDate(var13);
    var9.setWeekOfYearVisible(true);
    var1.addPropertyChangeListener((java.beans.PropertyChangeListener)var9);
    accessories.plugins.time.JCalendar var18 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var19 = var18.getCalendar();
    java.util.Date var20 = var18.getMaxSelectableDate();
    var9.setMinSelectableDate(var20);
    accessories.plugins.time.JCalendar var23 = new accessories.plugins.time.JCalendar(var20, false);
    accessories.plugins.time.JTripleCalendar var24 = new accessories.plugins.time.JTripleCalendar();
    boolean var25 = var24.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var26 = var24.getDayChooser();
    javax.swing.JRootPane var27 = var24.getRootPane();
    accessories.plugins.time.JDayChooser var28 = var24.getDayChooser();
    java.util.Locale var29 = var24.getLocale();
    accessories.plugins.time.JCalendar var32 = new accessories.plugins.time.JCalendar(var20, var29, true, true);
    freemind.common.FreeMindProgressMonitor var34 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var35 = var34.getInputMethodListeners();
    javax.accessibility.AccessibleContext var36 = var34.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var38 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var38.revalidate();
    var34.setLocationRelativeTo((java.awt.Component)var38);
    boolean var41 = var34.isValidateRoot();
    accessories.plugins.time.JCalendar var42 = new accessories.plugins.time.JCalendar();
    java.awt.Color var43 = var42.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var44 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var45 = var44.getCalendar();
    java.util.Date var46 = var44.getMaxSelectableDate();
    var42.setDate(var46);
    var42.setWeekOfYearVisible(true);
    var34.addPropertyChangeListener((java.beans.PropertyChangeListener)var42);
    accessories.plugins.time.JCalendar var51 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var52 = var51.getCalendar();
    java.util.Date var53 = var51.getMaxSelectableDate();
    var42.setMinSelectableDate(var53);
    accessories.plugins.time.JCalendar var56 = new accessories.plugins.time.JCalendar(var53, false);
    accessories.plugins.time.JTripleCalendar var57 = new accessories.plugins.time.JTripleCalendar();
    boolean var58 = var57.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var59 = var57.getDayChooser();
    javax.swing.JRootPane var60 = var57.getRootPane();
    accessories.plugins.time.JDayChooser var61 = var57.getDayChooser();
    java.util.Locale var62 = var57.getLocale();
    accessories.plugins.time.JCalendar var65 = new accessories.plugins.time.JCalendar(var53, var62, true, true);
    accessories.plugins.time.JCalendar var66 = new accessories.plugins.time.JCalendar(var20, var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test483");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    java.lang.String var1 = var0.getTagName();
    java.lang.String var3 = var0.getProperty("joao@BetelgeuseLX");
    java.util.Vector var4 = var0.getChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test484");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    freemind.modes.MindIcon var2 = freemind.modes.MindIcon.factory("hi!");
    java.lang.String var3 = var2.getIconFileName();
    var0.setNodeIcon(var2);
    java.lang.Boolean var5 = var0.getNodeFontItalic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "images/icons/hi!.png"+ "'", var3.equals("images/icons/hi!.png"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test485");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.setIgnoreRepaint(false);
    javax.swing.Action var6 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var7 = var2.add(var6);
    freemind.view.mindmapview.MapView.ScrollPane var8 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var9 = var8.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var10 = new accessories.plugins.time.JTripleCalendar();
    boolean var11 = var10.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var12 = var10.getDayChooser();
    java.awt.Color var13 = var12.getSundayForeground();
    var8.setColumnHeaderView((java.awt.Component)var12);
    java.util.Locale var15 = var12.getLocale();
    javax.swing.JButton var16 = var12.getSelectedDay();
    java.lang.String var17 = var16.getUIClassID();
    freemind.common.FreeMindProgressMonitor var19 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var19.revalidate();
    var19.addNotify();
    var19.setFocusTraversalPolicyProvider(false);
    java.awt.Point var24 = var19.location();
    boolean var25 = var16.contains(var24);
    boolean var26 = var16.isContentAreaFilled();
    java.awt.Insets var27 = var16.getMargin();
    var7.setMargin(var27);
    boolean var29 = var7.getHideActionText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "ButtonUI"+ "'", var17.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test486");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    java.awt.Color var3 = var2.getSundayForeground();
    var2.setFocus();
    java.awt.im.InputContext var5 = var2.getInputContext();
    java.lang.String var6 = var2.getToolTipText();
    freemind.common.FreeMindProgressMonitor var8 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var8.revalidate();
    var8.addNotify();
    var8.hide();
    java.awt.Container var12 = var8.getFocusCycleRootAncestor();
    freemind.view.mindmapview.LeftNodeViewLayout var13 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var8.setLayout((java.awt.LayoutManager)var13);
    var2.setLayout((java.awt.LayoutManager)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test487");


    freemind.modes.browsemode.BrowseHookFactory var0 = new freemind.modes.browsemode.BrowseHookFactory();
    java.util.Vector var1 = var0.getPossibleNodeHooks();
    freemind.extensions.ModeControllerHook var3 = var0.createModeControllerHook("plugins.map.FreeMindMapController$MapQuestOpenMap");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test488");


    java.lang.String var1 = freemind.modes.mindmapmode.actions.ApplyPatternAction.edgeWidthIntToString(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "6"+ "'", var1.equals("6"));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test489");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    java.lang.String var6 = var0.getEdgeStyle();
    java.awt.Color var7 = var0.getEdgeColor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test490");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    java.lang.String var2 = var1.getTagName();
    java.util.Iterator var3 = var1.enumerateAttributeNames();
    java.util.Iterator var4 = var1.enumeratePropertyNames();
    var0.loadFrom(var1);
    freemind.main.XMLElement var6 = new freemind.main.XMLElement();
    java.lang.String var7 = var6.getTagName();
    java.util.Iterator var8 = var6.enumerateAttributeNames();
    java.util.Iterator var9 = var6.enumeratePropertyNames();
    var0.loadFrom(var6);
    org.openstreetmap.gui.jmapviewer.Coordinate var11 = var0.getPosition();
    freemind.controller.filter.condition.IconContainedCondition var13 = new freemind.controller.filter.condition.IconContainedCondition("");
    freemind.main.XMLElement var14 = new freemind.main.XMLElement();
    java.lang.String var15 = var14.getTagName();
    var13.save(var14);
    var0.loadFrom(var14);
    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var19 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var20 = var19.createReader();
    boolean var21 = var20.ready();
    long var23 = var20.skip(100L);
    var20.mark(200);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.parseFromReader(var20, 292278994);
      fail("Expected exception of type freemind.main.XMLParseException");
    } catch (freemind.main.XMLParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 9L);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test491");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.setIgnoreRepaint(false);
    javax.swing.Action var6 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var7 = var2.add(var6);
    boolean var8 = var7.isFocusPainted();
    var7.firePropertyChange("images/icons/", (short)0, (short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test492");


    freemind.controller.filter.condition.AttributeExistsCondition var1 = new freemind.controller.filter.condition.AttributeExistsCondition("images/icons/");
    freemind.main.XMLElement var2 = new freemind.main.XMLElement();
    java.lang.String var3 = var2.getTagName();
    java.util.Iterator var4 = var2.enumerateAttributeNames();
    java.lang.String var5 = var2.toString();
    java.lang.Object var7 = var2.getAttribute("images/icons/hi!.png");
    var1.save(var2);
    double var11 = var2.getDoubleAttribute("Png", 1.0d);
    java.lang.String var12 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test493");


    java.lang.String var1 = accessories.plugins.time.TimeList.getRegularExpression("Png");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ".*(Png).*"+ "'", var1.equals(".*(Png).*"));

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test494");


    freemind.main.Resources var3 = freemind.main.Resources.getInstance();
    java.net.URL var5 = var3.getResource("file:/home/joao/workspace/\n");
    java.lang.String var7 = var3.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var9 = var3.createTranslatedString("");
    freemind.common.ColorProperty var10 = new freemind.common.ColorProperty("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]", "file:/home/joao/workspace/\n", "PositionHolder [lat=10.0, lon=1.0, zoom=100]", (freemind.common.TextTranslator)var3);
    java.lang.String var11 = var10.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]"+ "'", var11.equals("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]"));

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test495");


    freemind.preferences.layout.VariableSizeCardLayout var2 = new freemind.preferences.layout.VariableSizeCardLayout(10, 0);
    freemind.common.FreeMindProgressMonitor var4 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var4.revalidate();
    var4.addNotify();
    var4.hide();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.next((java.awt.Container)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test496");


    accessories.plugins.ClonePlugin var0 = new accessories.plugins.ClonePlugin();
    freemind.controller.filter.condition.AttributeExistsCondition var2 = new freemind.controller.filter.condition.AttributeExistsCondition("images/icons/");
    freemind.main.XMLElement var3 = new freemind.main.XMLElement();
    java.lang.String var4 = var3.getTagName();
    java.util.Iterator var5 = var3.enumerateAttributeNames();
    java.lang.String var6 = var3.toString();
    java.lang.Object var8 = var3.getAttribute("images/icons/hi!.png");
    var2.save(var3);
    double var12 = var3.getDoubleAttribute("Png", 1.0d);
    var0.loadFrom(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0d);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test497");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var1 = var0.getCalendar();
    freemind.controller.FreeMindToolBar var4 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var4.updateUI();
    var4.setIgnoreRepaint(false);
    java.awt.Dimension var8 = var4.getSize();
    var0.setMaximumSize(var8);
    boolean var10 = var0.isWeekOfYearVisible();
    java.util.Date var11 = var0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test498");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    var0.setDialogTitle("open map");
    var0.rescanCurrentDirectory();

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test499");


    java.lang.String var1 = freemind.main.Tools.expandFileName("127.0.1.1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.1.1"+ "'", var1.equals("127.0.1.1"));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test500");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    java.lang.String var3 = var0.getDialogTitle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

}
