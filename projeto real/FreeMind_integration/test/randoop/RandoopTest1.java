package randoop;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test1");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    boolean var2 = var0.isValid();
    accessories.plugins.time.JDayChooser var4 = new accessories.plugins.time.JDayChooser(false);
    var0.addFocusListener((java.awt.event.FocusListener)var4);
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var7.dispose();
    java.util.Vector var10 = freemind.main.Tools.urlStringToUrls("hi!");
    var7.setIconImages((java.util.List)var10);
    java.util.Locale var12 = var7.getLocale();
    var4.setLocale(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test2");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    java.lang.String var6 = var4.getText();
    boolean var7 = var4.getAppliesToNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test3");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.main.FreeMindApplet var4 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var5 = var4.getResources();
    var3.setFrame((freemind.main.FreeMindMain)var4);
    plugins.script.ScriptingSecurityManager var10 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var10.checkLink("hi!");
    var10.checkSystemClipboardAccess();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.errorMessage((java.lang.Object)var10);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test4");


    javax.swing.JColorChooser var0 = freemind.controller.Controller.getCommonJColorChooser();
    var0.setSize(100, 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test5");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    var0.revalidate();
    var0.setLocation(20, 2014);
    freemind.view.mindmapview.MapView.ScrollPane var5 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var6 = var5.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var7 = new accessories.plugins.time.JTripleCalendar();
    boolean var8 = var7.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var9 = var7.getDayChooser();
    java.awt.Color var10 = var9.getSundayForeground();
    var5.setColumnHeaderView((java.awt.Component)var9);
    var9.setAlwaysFireDayProperty(true);
    var9.reshape(292278994, 292278994, 2014, 11);
    freemind.controller.filter.util.SortedMapVector var19 = new freemind.controller.filter.util.SortedMapVector();
    freemind.modes.StylePattern var21 = new freemind.modes.StylePattern();
    var21.setEdgeStyle("hi!");
    freemind.modes.StylePattern var24 = var21.getChildrenStylePattern();
    freemind.modes.StylePattern var25 = new freemind.modes.StylePattern();
    var21.setChildrenStylePattern(var25);
    accessories.plugins.time.JTripleCalendar var27 = new accessories.plugins.time.JTripleCalendar();
    boolean var28 = var27.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var29 = var27.getDayChooser();
    accessories.plugins.time.JYearChooser var30 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var31 = var30.getMouseListeners();
    var30.repaint(100L, 1, (-1), 100, 1);
    var29.setYearChooser(var30);
    accessories.plugins.time.JTripleCalendar var39 = new accessories.plugins.time.JTripleCalendar();
    boolean var40 = var39.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var41 = var39.getDayChooser();
    java.awt.Color var42 = var41.getSundayForeground();
    var29.setDecorationBackgroundColor(var42);
    var21.setNodeColor(var42);
    int var45 = var19.add((java.lang.Comparable)"joao@BetelgeuseLX", (java.lang.Object)var42);
    var9.setForeground(var42);
    accessories.plugins.time.JCalendar var47 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var48 = var47.getCalendar();
    var9.setCalendar(var48);
    freemind.common.FreeMindProgressMonitor var51 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var51.revalidate();
    boolean var53 = var51.isUndecorated();
    var51.validate();
    java.awt.Container var55 = var51.getContentPane();
    freemind.main.FreeMindApplet var56 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var57 = var56.getFocusTraversalPolicy();
    var56.destroy();
    freemind.controller.Controller var59 = new freemind.controller.Controller((freemind.main.FreeMindMain)var56);
    java.net.URL var61 = var59.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var62 = new freemind.controller.MapMouseWheelListener(var59);
    var55.addMouseWheelListener((java.awt.event.MouseWheelListener)var62);
    var9.removeMouseWheelListener((java.awt.event.MouseWheelListener)var62);
    var0.removeMouseWheelListener((java.awt.event.MouseWheelListener)var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test6");


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
    var8.setSelected(false);
    boolean var22 = var8.requestDefaultFocus();
    
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

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test7");


    java.util.Vector var1 = freemind.main.Tools.urlStringToUrls("hi!");
    freemind.controller.filter.util.ExtendedComboBoxModel var2 = new freemind.controller.filter.util.ExtendedComboBoxModel(var1);
    javax.swing.event.ListDataListener[] var3 = var2.getListDataListeners();
    plugins.collaboration.database.DatabaseConnector var4 = new plugins.collaboration.database.DatabaseConnector();
    var2.removeElement((java.lang.Object)var4);
    freemind.controller.filter.util.SortedComboBoxModel var6 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var7 = var6.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var8 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var9 = var8.getName();
    boolean var10 = freemind.main.Tools.safeEquals((java.lang.Object)var6, (java.lang.Object)var9);
    java.util.Iterator var11 = var6.iterator();
    var6.remove((java.lang.Object)"icon_hi!");
    var2.setExtensionList((freemind.controller.filter.util.SortedListModel)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "OSM MapQuest.Open Map"+ "'", var9.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test8");


    freemind.view.mindmapview.MindMapLayout var0 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    javax.swing.InputVerifier var5 = var3.getInputVerifier();
    var0.removeLayoutComponent((java.awt.Component)var3);
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    var0.removeLayoutComponent((java.awt.Component)var7);
    var7.paintImmediately(100, 1, 0, (-1));
    java.lang.Object var15 = var7.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test9");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("hi!");
    var3.checkLink(".");
    var3.checkSystemClipboardAccess();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkConnect("ButtonUI", 256);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test10");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    boolean var7 = var0.isPaintingTile();
    javax.swing.plaf.ScrollPaneUI var8 = var0.getUI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var10 = var0.getFocusTraversalKeys(256);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test11");


    freemind.modes.browsemode.BrowseReminderHook var0 = new freemind.modes.browsemode.BrowseReminderHook();
    freemind.modes.common.plugins.ReminderHookBase.TimerBlinkTask var2 = var0.new TimerBlinkTask(true);
    var0.setRemindUserAt((-1L));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test12");


    freemind.common.NumberProperty var5 = new freemind.common.NumberProperty("open map", "/home/joao/workspace/FreeMind_integration/bin/classes/", 6, 200, 7);
    java.lang.String var6 = var5.getValue();
    java.lang.String var7 = var5.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "6"+ "'", var6.equals("6"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "6"+ "'", var7.equals("6"));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test13");


    freemind.controller.actions.generated.instance.XmlAction var1 = freemind.main.Tools.unMarshall("images/icons/");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test14");


    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var1 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var2 = var1.createReader();
    boolean var3 = var2.ready();
    boolean var4 = var2.markSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test15");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    freemind.modes.mindmapmode.actions.xml.ActionFactory var5 = new freemind.modes.mindmapmode.actions.xml.ActionFactory(var3);
    plugins.collaboration.socket.MindMapMaster var6 = new plugins.collaboration.socket.MindMapMaster();
    var6.processUnfinishedLinks();
    java.lang.String var8 = var6.getPassword();
    var5.deregisterFilter((freemind.modes.mindmapmode.actions.xml.ActionFilter)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test16");


    com.lightdev.app.shtm.SHTMLPanel var0 = accessories.plugins.NodeNoteRegistration.getHtmlEditorPanel();
    java.awt.Component.BaselineResizeBehavior var1 = var0.getBaselineResizeBehavior();
    var0.firePropertyChange("hi!", '#', '4');
    javax.accessibility.AccessibleContext var6 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test17");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.controller.MenuBar var2 = var0.getFreeMindMenuBar();
    accessories.plugins.time.JTripleCalendar var3 = new accessories.plugins.time.JTripleCalendar();
    boolean var4 = var3.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var5 = var3.getDayChooser();
    var0.remove((java.awt.Component)var5);
    int var7 = var0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test18");


    plugins.map.FreeMindMapController.TransportMap var0 = new plugins.map.FreeMindMapController.TransportMap();
    java.lang.String var1 = var0.getBaseUrl();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://a.tile2.opencyclemap.org/transport"+ "'", var1.equals("http://a.tile2.opencyclemap.org/transport"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test19");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.MapMouseMotionListener var4 = var3.getMapMouseMotionListener();
    freemind.controller.NodeMouseMotionListener var5 = var3.getNodeMouseMotionListener();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test20");


    freemind.modes.attributes.Attribute var2 = new freemind.modes.attributes.Attribute("hi!", "hi!");
    freemind.modes.attributes.Attribute var3 = new freemind.modes.attributes.Attribute(var2);
    java.lang.String var4 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test21");


    accessories.plugins.dialogs.EnterPasswordDialog var0 = new accessories.plugins.dialogs.EnterPasswordDialog();
    int var1 = var0.getResult();
    java.lang.StringBuffer var2 = var0.getPassword();
    boolean var3 = var0.isUndecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test22");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.controller.MenuBar var2 = var0.getFreeMindMenuBar();
    accessories.plugins.time.JTripleCalendar var3 = new accessories.plugins.time.JTripleCalendar();
    boolean var4 = var3.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var5 = var3.getDayChooser();
    var0.remove((java.awt.Component)var5);
    java.util.Locale var7 = var5.getLocale();
    java.awt.Point var9 = var5.getMousePosition(true);
    freemind.view.mindmapview.MapView.ScrollPane var10 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var11 = var10.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var12 = new accessories.plugins.time.JTripleCalendar();
    boolean var13 = var12.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var14 = var12.getDayChooser();
    java.awt.Color var15 = var14.getSundayForeground();
    var10.setColumnHeaderView((java.awt.Component)var14);
    java.util.Locale var17 = var14.getLocale();
    javax.swing.JButton var18 = var14.getSelectedDay();
    java.lang.String var19 = var18.getUIClassID();
    freemind.common.FreeMindProgressMonitor var21 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var21.revalidate();
    var21.addNotify();
    var21.setFocusTraversalPolicyProvider(false);
    java.awt.Point var26 = var21.location();
    boolean var27 = var18.contains(var26);
    boolean var28 = var18.isContentAreaFilled();
    freemind.view.mindmapview.MindMapLayout var29 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var32 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var32.requestFocus();
    javax.swing.InputVerifier var34 = var32.getInputVerifier();
    var29.removeLayoutComponent((java.awt.Component)var32);
    var18.setLayout((java.awt.LayoutManager)var29);
    accessories.plugins.time.JTripleCalendar var38 = new accessories.plugins.time.JTripleCalendar();
    var38.requestFocus();
    accessories.plugins.time.JCalendar var40 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var41 = var40.getCalendar();
    var38.setCalendar(var41);
    accessories.plugins.time.JYearChooser var43 = var38.getYearChooser();
    freemind.common.FreeMindProgressMonitor var45 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var45.revalidate();
    var45.addNotify();
    java.awt.event.WindowListener[] var48 = var45.getWindowListeners();
    java.lang.Object var49 = var43.getClientProperty((java.lang.Object)var45);
    var29.addLayoutComponent("png", (java.awt.Component)var45);
    accessories.plugins.time.JCalendar var51 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var52 = var51.getCalendar();
    java.util.Date var53 = var51.getMaxSelectableDate();
    java.lang.String var54 = var51.getToolTipText();
    var51.setOpaque(false);
    accessories.plugins.time.JTripleCalendar var57 = new accessories.plugins.time.JTripleCalendar();
    boolean var58 = var57.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var59 = var57.getDayChooser();
    boolean var60 = var59.isDecorationBordersVisible();
    java.util.GregorianCalendar var61 = var59.getTemporaryCalendar();
    var51.setCalendar((java.util.Calendar)var61);
    var45.addPropertyChangeListener((java.beans.PropertyChangeListener)var51);
    var5.addPropertyChangeListener((java.beans.PropertyChangeListener)var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "ButtonUI"+ "'", var19.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test23");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    int var5 = var3.getComponentCount();
    var3.addSeparator();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    boolean var9 = var7.isDoubleBuffered();
    var7.hide();
    int var11 = var3.getComponentIndex((java.awt.Component)var7);
    java.awt.Dimension var12 = var7.getMinimumSize();
    var7.setFocusCycleRoot(true);
    var0.addActionListener((java.awt.event.ActionListener)var7);
    freemind.view.mindmapview.MapView.ScrollPane var16 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var17 = var16.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var18 = new accessories.plugins.time.JTripleCalendar();
    boolean var19 = var18.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var20 = var18.getDayChooser();
    java.awt.Color var21 = var20.getSundayForeground();
    var16.setColumnHeaderView((java.awt.Component)var20);
    var20.setAlwaysFireDayProperty(true);
    var20.reshape(292278994, 292278994, 2014, 11);
    freemind.controller.filter.util.SortedMapVector var30 = new freemind.controller.filter.util.SortedMapVector();
    freemind.modes.StylePattern var32 = new freemind.modes.StylePattern();
    var32.setEdgeStyle("hi!");
    freemind.modes.StylePattern var35 = var32.getChildrenStylePattern();
    freemind.modes.StylePattern var36 = new freemind.modes.StylePattern();
    var32.setChildrenStylePattern(var36);
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
    var32.setNodeColor(var53);
    int var56 = var30.add((java.lang.Comparable)"joao@BetelgeuseLX", (java.lang.Object)var53);
    var20.setForeground(var53);
    accessories.plugins.time.JTripleCalendar var58 = new accessories.plugins.time.JTripleCalendar();
    boolean var59 = var58.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var60 = var58.getDayChooser();
    accessories.plugins.time.JYearChooser var61 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var62 = var61.getMouseListeners();
    var61.repaint(100L, 1, (-1), 100, 1);
    var60.setYearChooser(var61);
    accessories.plugins.time.JTripleCalendar var70 = new accessories.plugins.time.JTripleCalendar();
    boolean var71 = var70.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var72 = var70.getDayChooser();
    java.awt.Color var73 = var72.getSundayForeground();
    var60.setDecorationBackgroundColor(var73);
    var20.setDecorationBackgroundColor(var73);
    var7.setForeground(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test24");


    java.lang.String var1 = freemind.main.Tools.removeTranslateComment("[IndexPair");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[IndexPair"+ "'", var1.equals("[IndexPair"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test25");


    freemind.controller.StructuredMenuHolder.StructuredMenuListener var0 = new freemind.controller.StructuredMenuHolder.StructuredMenuListener();
    freemind.controller.StructuredMenuItemHolder var1 = new freemind.controller.StructuredMenuItemHolder();
    var0.addItem(var1);
    freemind.controller.MenuItemEnabledListener var3 = var1.getEnabledListener();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test26");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var2.isDecorationBordersVisible();
    java.util.GregorianCalendar var4 = var2.getTemporaryCalendar();
    accessories.plugins.time.JCalendar var5 = new accessories.plugins.time.JCalendar((java.util.Calendar)var4);
    java.util.Calendar var6 = var5.getCalendar();
    var5.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test27");


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
    var20.setValue(".*(Png).*");
    
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

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test28");


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
    boolean var33 = var32.requestFocusInWindow();
    accessories.plugins.time.JMonthChooser var34 = var32.getMonthChooser();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var35 = var34.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test29");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.hide();
    var1.setResizable(false);
    freemind.view.mindmapview.LeftNodeViewLayout var7 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var1.setLayout((java.awt.LayoutManager)var7);
    boolean var9 = var1.isAlwaysOnTop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test30");


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
    int var28 = var8.getHorizontalTextPosition();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 11);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test31");


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
    int var17 = var8.getComponentCount();
    java.awt.event.HierarchyListener[] var18 = var8.getHierarchyListeners();
    
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
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test32");


    accessories.plugins.time.ReminderHook var0 = new accessories.plugins.time.ReminderHook();
    var0.setRemindUserAt(10L);
    freemind.modes.common.plugins.ReminderHookBase.TimerBlinkTask var4 = var0.new TimerBlinkTask(false);
    var0.deregisterFilter();
    var0.onUpdateNodeHook();
    java.lang.String var7 = var0.getStateKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "freemind.modes.common.plugins.ReminderHookBase$TimerBlinkTask_STATE_"+ "'", var7.equals("freemind.modes.common.plugins.ReminderHookBase$TimerBlinkTask_STATE_"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test33");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    int var7 = var0.getVerticalScrollBarPolicy();
    java.awt.Container var8 = var0.getFocusCycleRootAncestor();
    freemind.view.mindmapview.MapView.ScrollPane var9 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var10 = var9.getAccessibleContext();
    int var11 = var9.getHorizontalScrollBarPolicy();
    freemind.view.mindmapview.MapView.ScrollPane var12 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var13 = var12.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var14 = new accessories.plugins.time.JTripleCalendar();
    boolean var15 = var14.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var16 = var14.getDayChooser();
    java.awt.Color var17 = var16.getSundayForeground();
    var12.setColumnHeaderView((java.awt.Component)var16);
    var12.enableInputMethods(true);
    freemind.view.mindmapview.MapView.ScrollPane var21 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var22 = var21.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var23 = new accessories.plugins.time.JTripleCalendar();
    boolean var24 = var23.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var25 = var23.getDayChooser();
    java.awt.Color var26 = var25.getSundayForeground();
    var21.setColumnHeaderView((java.awt.Component)var25);
    javax.swing.JViewport var28 = var21.getColumnHeader();
    var12.setColumnHeader(var28);
    var9.setRowHeader(var28);
    var0.setRowHeader(var28);
    java.lang.String var32 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertTrue("'" + var32 + "' != '" + "ScrollPaneUI"+ "'", var32.equals("ScrollPaneUI"));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test34");


    java.lang.String var1 = freemind.main.Tools.expandFileName("plugins.map.FreeMindMapController$MapQuestOpenMap");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "plugins.map.FreeMindMapController$MapQuestOpenMap"+ "'", var1.equals("plugins.map.FreeMindMapController$MapQuestOpenMap"));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test35");


    accessories.plugins.time.JSpinField var2 = new accessories.plugins.time.JSpinField(10, 1);
    java.awt.dnd.DropTarget var3 = var2.getDropTarget();
    var2.setDebugGraphicsOptions(100);
    boolean var6 = var2.isRequestFocusEnabled();
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
    var2.removePropertyChangeListener("Arrow_ID_515901044", (java.beans.PropertyChangeListener)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test36");


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
    boolean var33 = var32.requestFocusInWindow();
    accessories.plugins.time.JMonthChooser var34 = var32.getMonthChooser();
    boolean var35 = var32.isDecorationBordersVisible();
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test37");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    java.awt.Color var3 = var2.getSundayForeground();
    var2.setFocus();
    int var5 = var2.getMaxDayCharacters();
    var2.setMonth(20);
    java.awt.Color var8 = var2.getDecorationBackgroundColor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test38");


    freemind.modes.attributes.Attribute var2 = new freemind.modes.attributes.Attribute("hi!", "hi!");
    freemind.modes.attributes.Attribute var3 = new freemind.modes.attributes.Attribute(var2);
    freemind.modes.attributes.Attribute var4 = new freemind.modes.attributes.Attribute(var2);
    var2.setName("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n");

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test39");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    javax.swing.plaf.ToolBarUI var4 = var2.getUI();
    freemind.controller.FreeMindToolBar var7 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var7.updateUI();
    var7.setIgnoreRepaint(false);
    var7.setVisible(false);
    boolean var13 = var2.isAncestorOf((java.awt.Component)var7);
    java.awt.Dimension var14 = var7.preferredSize();
    boolean var15 = var7.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test40");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    java.lang.String var1 = var0.getTagName();
    java.util.Iterator var2 = var0.enumerateAttributeNames();
    java.util.Vector var4 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var5 = new freemind.modes.StylePattern(var0, (java.util.List)var4);
    boolean var6 = var5.getAppliesToEdge();
    accessories.plugins.time.JTripleCalendar var7 = new accessories.plugins.time.JTripleCalendar();
    boolean var8 = var7.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var9 = var7.getDayChooser();
    accessories.plugins.time.JYearChooser var10 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var11 = var10.getMouseListeners();
    var10.repaint(100L, 1, (-1), 100, 1);
    var9.setYearChooser(var10);
    accessories.plugins.time.JTripleCalendar var19 = new accessories.plugins.time.JTripleCalendar();
    boolean var20 = var19.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var21 = var19.getDayChooser();
    java.awt.Color var22 = var21.getSundayForeground();
    var9.setDecorationBackgroundColor(var22);
    var5.setEdgeColor(var22);
    boolean var25 = var5.getAppliesToNodeFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test41");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    boolean var8 = var1.isValidateRoot();
    var1.hide();
    accessories.plugins.time.JTripleCalendar var10 = new accessories.plugins.time.JTripleCalendar();
    boolean var11 = var10.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var12 = var10.getDayChooser();
    boolean var13 = var12.isDecorationBordersVisible();
    var1.addKeyListener((java.awt.event.KeyListener)var12);
    var1.hide();
    var1.createBufferStrategy(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test42");


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
    int var13 = var6.getDebugGraphicsOptions();
    var6.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test43");


    freemind.modes.schememode.SchemeMode var0 = new freemind.modes.schememode.SchemeMode();
    freemind.controller.Controller var1 = var0.getController();
    freemind.controller.Controller var2 = var0.getController();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test44");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    java.awt.Component var3 = var1.getFocusOwner();
    boolean var4 = var1.isFocused();
    freemind.controller.filter.condition.JCondition var5 = new freemind.controller.filter.condition.JCondition();
    var1.setContentPane((java.awt.Container)var5);
    var1.show();
    var1.reshape(292278994, 292278994, 8, 200);
    freemind.common.FreeMindProgressMonitor var14 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var14.revalidate();
    java.awt.Component var16 = var14.getFocusOwner();
    freemind.controller.FreeMindToolBar var19 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var20 = var19.isLightweight();
    int var21 = var19.getWidth();
    var19.list();
    freemind.controller.FreeMindToolBar var25 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var25.updateUI();
    var25.setIgnoreRepaint(false);
    javax.swing.Action var29 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var30 = var25.add(var29);
    javax.swing.JButton var31 = var19.add(var29);
    freemind.main.Tools.addEscapeActionToDialog((javax.swing.JDialog)var14, var29);
    freemind.main.Tools.addEscapeActionToDialog((javax.swing.JDialog)var1, var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test45");


    freemind.main.Tools.IntHolder var1 = new freemind.main.Tools.IntHolder(0);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test46");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    var2.setTitle("Png");
    freemind.modes.mindmapmode.hooks.MindMapHookFactory var8 = new freemind.modes.mindmapmode.hooks.MindMapHookFactory((freemind.main.FreeMindMain)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test47");


    freemind.preferences.layout.KeyEventWorkaround.numericKeypadKey();

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test48");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    java.lang.Integer var3 = var0.getNodeFontSize();
    java.lang.Boolean var4 = var0.getNodeFontBold();
    java.awt.Color var5 = var0.getEdgeColor();
    freemind.main.XMLElement var6 = new freemind.main.XMLElement();
    java.lang.String var7 = var6.getTagName();
    java.util.Iterator var8 = var6.enumerateAttributeNames();
    java.util.Vector var10 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var11 = new freemind.modes.StylePattern(var6, (java.util.List)var10);
    boolean var12 = var11.getAppliesToEdge();
    accessories.plugins.time.JTripleCalendar var13 = new accessories.plugins.time.JTripleCalendar();
    boolean var14 = var13.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var15 = var13.getDayChooser();
    accessories.plugins.time.JYearChooser var16 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var17 = var16.getMouseListeners();
    var16.repaint(100L, 1, (-1), 100, 1);
    var15.setYearChooser(var16);
    accessories.plugins.time.JTripleCalendar var25 = new accessories.plugins.time.JTripleCalendar();
    boolean var26 = var25.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var27 = var25.getDayChooser();
    java.awt.Color var28 = var27.getSundayForeground();
    var15.setDecorationBackgroundColor(var28);
    var11.setEdgeColor(var28);
    var0.setChildrenStylePattern(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test49");


    accessories.plugins.ClonePasteAction.CloneProperties var0 = new accessories.plugins.ClonePasteAction.CloneProperties();
    boolean var1 = var0.isCloneItself();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test50");


    freemind.common.StringProperty var2 = new freemind.common.StringProperty("file:/home/joao/workspace/\n", "ToolBarUI");
    accessories.plugins.time.JTripleCalendar var3 = new accessories.plugins.time.JTripleCalendar();
    var3.revalidate();
    var2.addPropertyChangeListener((java.beans.PropertyChangeListener)var3);
    boolean var6 = var3.getAutoscrolls();
    boolean var7 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var3);
    java.awt.Container var8 = var3.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test51");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    java.awt.Dimension var2 = var0.preferredSize();
    boolean var3 = var0.isMinimumSizeSet();
    var0.setAlignmentY(0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test52");


    boolean var1 = freemind.main.Tools.isAbsolutePath("JDayChooser");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test53");


    freemind.extensions.ExportHook var0 = new freemind.extensions.ExportHook();

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test54");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    int var3 = var0.getProperty("OSM MapQuest.Open Map", 0);
    java.lang.String var4 = var0.getTagName();
    char[] var5 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parseCharArray(var5, (-1), 10, 292278994);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test55");


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
    int var17 = var8.getY();
    
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
    assertTrue(var17 == 0);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test56");


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
    boolean var15 = var2.isActive();
    int var16 = var2.getWinHeight();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test57");


    java.lang.String var1 = accessories.plugins.time.TimeList.getPureRegularExpression("Abyssinica SIL");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Abyssinica SIL"+ "'", var1.equals("Abyssinica SIL"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test58");


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
    accessories.plugins.time.JYearChooser var18 = var9.getYearChooser();
    
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
    assertNotNull(var18);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test59");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    var0.switchMeOff();
    var0.processUnfinishedLinks();
    var0.processUnfinishedLinks();

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test60");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.lang.String var4 = var1.getTitle();
    freemind.common.FreeMindProgressMonitor var6 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var6.revalidate();
    var6.addNotify();
    var6.setFocusTraversalPolicyProvider(false);
    java.awt.Point var11 = var6.location();
    var1.setLocation(var11);
    java.awt.Window var13 = var1.getOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var4.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test61");


    freemind.main.FreeMindStarter.ProxyAuthenticator var2 = new freemind.main.FreeMindStarter.ProxyAuthenticator("[IndexPair", "//openstreetmap.org/");

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test62");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.Window.Type var4 = var1.getType();
    java.util.Locale var5 = var1.getLocale();
    var1.repaint(0L, 10, 20, 292278994, 256);
    freemind.common.FreeMindProgressMonitor var13 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var13.revalidate();
    boolean var15 = var13.isUndecorated();
    var13.validate();
    java.awt.Container var17 = var13.getContentPane();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.main.Tools.setDialogLocationRelativeTo((javax.swing.JDialog)var1, (java.awt.Component)var17);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test63");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var2 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var3 = var2.getName();
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Iterator var5 = var0.iterator();
    var0.remove((java.lang.Object)"icon_hi!");
    var0.clear();
    java.util.Iterator var9 = var0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test64");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.setFocusCycleRoot(true);
    var1.repaint();
    var1.setAlwaysOnTop(true);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test65");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    freemind.controller.NodeKeyListener var5 = var3.getNodeKeyListener();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test66");


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
    var15.revalidate();
    boolean var17 = var15.isFocusable();
    
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
    assertTrue(var17 == true);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test67");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    javax.swing.Action var4 = javax.swing.TransferHandler.getCutAction();
    freemind.main.Tools.addKeyActionToDialog((javax.swing.JDialog)var1, var4, "images/icons///SIGN:null\n", "");
    accessories.plugins.time.JTripleCalendar var8 = new accessories.plugins.time.JTripleCalendar();
    var8.requestFocus();
    accessories.plugins.time.JCalendar var10 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var11 = var10.getCalendar();
    var8.setCalendar(var11);
    accessories.plugins.time.JYearChooser var13 = var8.getYearChooser();
    freemind.common.FreeMindProgressMonitor var15 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var15.revalidate();
    var15.addNotify();
    java.awt.event.WindowListener[] var18 = var15.getWindowListeners();
    java.lang.Object var19 = var13.getClientProperty((java.lang.Object)var15);
    javax.swing.JPopupMenu var20 = var13.getComponentPopupMenu();
    freemind.common.FreeMindProgressMonitor var22 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var22.revalidate();
    boolean var24 = var22.isUndecorated();
    var22.validate();
    javax.accessibility.AccessibleContext var26 = var22.getAccessibleContext();
    java.beans.PropertyChangeListener[] var27 = var22.getPropertyChangeListeners();
    accessories.plugins.time.JYearChooser var28 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var29 = var28.getUI();
    java.awt.Dimension var30 = var28.minimumSize();
    var22.setSize(var30);
    java.awt.Dimension var32 = var13.getSize(var30);
    var1.setSize(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test68");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    java.awt.Component var3 = var1.getFocusOwner();
    boolean var4 = var1.isFocused();
    var1.setSize((-1), 20);
    var1.dispose();
    boolean var9 = var1.getFocusableWindowState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test69");


    freemind.extensions.ModeControllerHookAdapter var0 = new freemind.extensions.ModeControllerHookAdapter();

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test70");


    freemind.view.mindmapview.VerticalRootNodeViewLayout var0 = new freemind.view.mindmapview.VerticalRootNodeViewLayout();

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test71");


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
    java.awt.event.ItemListener[] var17 = var8.getItemListeners();
    
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
    assertNotNull(var17);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test72");


    freemind.main.Resources var3 = freemind.main.Resources.getInstance();
    java.net.URL var5 = var3.getResource("file:/home/joao/workspace/\n");
    java.lang.String var7 = var3.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var9 = var3.createTranslatedString("");
    freemind.common.ColorProperty var10 = new freemind.common.ColorProperty("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]", "file:/home/joao/workspace/\n", "PositionHolder [lat=10.0, lon=1.0, zoom=100]", (freemind.common.TextTranslator)var3);
    boolean var12 = var3.getBoolProperty("meta");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test73");


    freemind.main.Tools.waitForEventQueue();

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test74");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.setFocusTraversalPolicyProvider(false);
    boolean var6 = var1.isValidateRoot();
    var1.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test75");


    int var2 = freemind.main.Tools.countOccurrences("keystroke_icon_hi!", "6");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test76");


    freemind.modes.MindMapLinkRegistry var0 = new freemind.modes.MindMapLinkRegistry();
    java.lang.String var2 = var0.generateUniqueLinkId("16");
    freemind.modes.MindMapLink var4 = var0.getLinkForId("images/icons///SIGN:null\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "16"+ "'", var2.equals("16"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test77");


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
    freemind.common.FreeMindProgressMonitor var18 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var18.revalidate();
    var18.addNotify();
    var18.hide();
    var18.setResizable(false);
    freemind.view.mindmapview.LeftNodeViewLayout var24 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var18.setLayout((java.awt.LayoutManager)var24);
    var8.setLayout((java.awt.LayoutManager)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setVerticalTextPosition(256);
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
    assertNotNull(var15);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test78");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.lang.String var3 = var0.getResourceString("file:/home/joao/workspace/\n", "file:/home/joao/workspace/\n");
    java.lang.String var5 = var0.getText("hi!");
    boolean var7 = var0.getBoolProperty("");
    freemind.main.FreeMindMain.VersionInformation var8 = var0.getFreemindVersion();
    java.lang.String var10 = var0.getResourceString("http://openstreetmap.org/");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var3.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "http://openstreetmap.org/"+ "'", var10.equals("http://openstreetmap.org/"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test79");


    accessories.plugins.time.TimeList var0 = new accessories.plugins.time.TimeList();
    freemind.modes.mindmapmode.MindMapController var1 = var0.getMindMapController();
    freemind.modes.mindmapmode.MindMapController var2 = var0.getMindMapController();
    freemind.modes.mindmapmode.MindMapController var3 = var0.getMindMapController();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test80");


    java.util.List var1 = freemind.main.Tools.stringToList("joao@BetelgeuseLX");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test81");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    boolean var8 = var1.isValidateRoot();
    var1.hide();
    accessories.plugins.time.JTripleCalendar var10 = new accessories.plugins.time.JTripleCalendar();
    boolean var11 = var10.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var12 = var10.getDayChooser();
    boolean var13 = var12.isDecorationBordersVisible();
    var1.addKeyListener((java.awt.event.KeyListener)var12);
    var1.hide();
    java.lang.String var16 = var1.getTitle();
    boolean var17 = var1.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var16.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test82");


    java.util.Vector var0 = freemind.modes.MindIcon.getAllIconNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test83");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    java.awt.Component var3 = var1.getFocusOwner();
    boolean var4 = var1.isFocused();
    freemind.controller.filter.condition.JCondition var5 = new freemind.controller.filter.condition.JCondition();
    var1.setContentPane((java.awt.Container)var5);
    var1.show();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.modes.mindmapmode.JAutoScrollBarPane var8 = new freemind.modes.mindmapmode.JAutoScrollBarPane((java.awt.Component)var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test84");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    var4.setMaxDayCharacters(59);
    
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

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test85");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.JViewport var7 = var0.getColumnHeader();
    javax.swing.JScrollBar var8 = var0.createHorizontalScrollBar();
    javax.swing.JScrollBar var9 = var0.getVerticalScrollBar();
    
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
    assertNotNull(var9);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test86");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("<a,23>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkWrite("6");
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test87");


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
    boolean var33 = var32.requestFocusInWindow();
    boolean var34 = var32.requestDefaultFocus();
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test88");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.dnd.DropTarget var4 = var1.getDropTarget();
    boolean var5 = var1.isFocused();
    accessories.plugins.time.JTripleCalendar var6 = new accessories.plugins.time.JTripleCalendar();
    var6.revalidate();
    boolean var8 = var6.isDisplayable();
    var1.setContentPane((java.awt.Container)var6);
    java.util.Date var10 = var6.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test89");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    int var2 = var0.getTileSize();
    java.lang.String var3 = var0.getAttributionImageURL();
    org.openstreetmap.gui.jmapviewer.interfaces.TileSource.TileUpdate var4 = var0.getTileUpdate();
    double var7 = var0.lonToTileX((-1.0d), 2014);
    var0.setAttributionText("<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>");
    java.lang.String var10 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 256);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "OSM MapQuest.Open Map"+ "'", var10.equals("OSM MapQuest.Open Map"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test90");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    java.awt.Color var3 = var2.getSundayForeground();
    var2.setFocus();
    int var5 = var2.getMaxDayCharacters();
    boolean var6 = var2.isDecorationBordersVisible();
    java.beans.PropertyChangeListener[] var7 = var2.getPropertyChangeListeners();
    boolean var8 = var2.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test91");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.checkListen(10);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test92");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    var4.grabFocus();
    
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

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test93");


    javax.swing.JColorChooser var0 = freemind.controller.Controller.getCommonJColorChooser();
    freemind.view.mindmapview.MapView.ScrollPane var1 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var2 = var1.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var3 = new accessories.plugins.time.JTripleCalendar();
    boolean var4 = var3.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var5 = var3.getDayChooser();
    java.awt.Color var6 = var5.getSundayForeground();
    var1.setColumnHeaderView((java.awt.Component)var5);
    java.util.Locale var8 = var5.getLocale();
    javax.swing.JButton var9 = var5.getSelectedDay();
    var9.setDisplayedMnemonicIndex(1);
    int var12 = var9.getMnemonic();
    var9.addNotify();
    var9.setFocusPainted(true);
    javax.swing.Action var16 = javax.swing.TransferHandler.getCutAction();
    var9.setAction(var16);
    var9.setDefaultCapable(false);
    accessories.plugins.time.JTripleCalendar var20 = new accessories.plugins.time.JTripleCalendar();
    boolean var21 = var20.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var22 = var20.getDayChooser();
    accessories.plugins.time.JYearChooser var23 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var24 = var23.getMouseListeners();
    var23.repaint(100L, 1, (-1), 100, 1);
    var22.setYearChooser(var23);
    accessories.plugins.time.JTripleCalendar var32 = new accessories.plugins.time.JTripleCalendar();
    boolean var33 = var32.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var34 = var32.getDayChooser();
    java.awt.Color var35 = var34.getSundayForeground();
    var22.setDecorationBackgroundColor(var35);
    var22.setDay(10);
    boolean var40 = var22.requestFocus(false);
    java.awt.ComponentOrientation var41 = var22.getComponentOrientation();
    var9.applyComponentOrientation(var41);
    var0.setComponentOrientation(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test94");


    java.lang.String var1 = freemind.main.HtmlTools.removeHtmlTagsFromString("http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=200&layers=Q");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=200&layers=Q"+ "'", var1.equals("http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=200&layers=Q"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test95");


    plugins.collaboration.database.DatabaseStarter var0 = new plugins.collaboration.database.DatabaseStarter();
    plugins.collaboration.socket.MindMapMaster var1 = new plugins.collaboration.socket.MindMapMaster();
    var1.switchMeOff();
    var1.processUnfinishedLinks();
    freemind.modes.mindmapmode.actions.xml.ActionPair var4 = var1.getEmptyActionPair();
    freemind.modes.mindmapmode.actions.xml.ActionPair var5 = var0.filterAction(var4);
    var0.processUnfinishedLinks();
    var0.registerFilter();
    var0.deregisterFilter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test96");


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
    int var29 = var7.getIconTextGap();
    
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
    assertTrue(var29 == 4);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test97");


    freemind.modes.attributes.Attribute var1 = new freemind.modes.attributes.Attribute("open map");
    java.lang.String var2 = var1.getValue();
    var1.setValue("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test98");


    freemind.modes.browsemode.BrowseHookFactory var0 = new freemind.modes.browsemode.BrowseHookFactory();
    java.util.List var2 = var0.getHookMenuPositions("png");
    java.util.Vector var3 = var0.getPossibleNodeHooks();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test99");


    freemind.main.Resources var2 = freemind.main.Resources.getInstance();
    java.lang.String var4 = var2.getResourceString("");
    java.lang.String var6 = var2.getText("hi!");
    freemind.common.FontProperty var7 = new freemind.common.FontProperty("/home/joao/workspace/FreeMind_integration/bin/classes/", "images/icons///SIGN:null\n", (freemind.common.TextTranslator)var2);
    var7.setEnabled(true);
    var7.setValue("<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>");
    var7.setValue("[IndexPair");
    java.lang.String var14 = var7.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "images/icons///SIGN:null\n"+ "'", var14.equals("images/icons///SIGN:null\n"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test100");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.net.URL var2 = var0.getResource("file:/home/joao/workspace/\n");
    java.lang.String var4 = var0.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var6 = var0.createTranslatedString("");
    java.lang.String var7 = var6.toString();
    
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

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test101");


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
    boolean var18 = var1.isFocusCycleRoot();
    java.awt.image.BufferStrategy var19 = var1.getBufferStrategy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setUndecorated(true);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test102");


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
    boolean var16 = var8.requestFocusInWindow();
    accessories.plugins.time.JSpinField var19 = new accessories.plugins.time.JSpinField(10, 1);
    var19.setValue(292278994);
    java.awt.event.ContainerListener[] var22 = var19.getContainerListeners();
    java.awt.Dimension var23 = var19.getMinimumSize();
    var8.setPreferredSize(var23);
    var8.setValue(30);
    javax.swing.JPopupMenu var27 = var8.getComponentPopupMenu();
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test103");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    javax.swing.JRootPane var3 = var0.getRootPane();
    accessories.plugins.time.JDayChooser var4 = var0.getDayChooser();
    javax.swing.event.AncestorListener[] var5 = var0.getAncestorListeners();
    java.util.Calendar var6 = var0.getCalendar();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test104");


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
    java.lang.String var20 = var18.getDescription();
    
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

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test105");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.preferences.layout.KeyEventTranslator.setModifierMapping(10, 1, 2014, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test106");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    int var5 = var3.getComponentCount();
    var3.addSeparator();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    boolean var9 = var7.isDoubleBuffered();
    var7.hide();
    int var11 = var3.getComponentIndex((java.awt.Component)var7);
    java.awt.Dimension var12 = var7.getMinimumSize();
    var7.setFocusCycleRoot(true);
    var0.addActionListener((java.awt.event.ActionListener)var7);
    java.lang.String var16 = var0.getApproveButtonText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test107");


    java.util.Vector var1 = freemind.main.Tools.urlStringToUrls("hi!");
    freemind.controller.filter.util.ExtendedComboBoxModel var2 = new freemind.controller.filter.util.ExtendedComboBoxModel(var1);
    javax.swing.event.ListDataListener[] var3 = var2.getListDataListeners();
    freemind.view.mindmapview.MapView.ScrollPane var4 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var5 = var4.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var6 = new accessories.plugins.time.JTripleCalendar();
    boolean var7 = var6.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var8 = var6.getDayChooser();
    java.awt.Color var9 = var8.getSundayForeground();
    var4.setColumnHeaderView((java.awt.Component)var8);
    java.util.Locale var11 = var8.getLocale();
    javax.swing.JButton var12 = var8.getSelectedDay();
    java.lang.String var13 = var12.getUIClassID();
    freemind.common.FreeMindProgressMonitor var15 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var15.revalidate();
    var15.addNotify();
    var15.setFocusTraversalPolicyProvider(false);
    java.awt.Point var20 = var15.location();
    boolean var21 = var12.contains(var20);
    boolean var22 = var12.isContentAreaFilled();
    int var23 = var12.getHorizontalTextPosition();
    var12.setMultiClickThreshhold(0L);
    var2.addSortedElement((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "ButtonUI"+ "'", var13.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 11);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test108");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var1 = var0.getUI();
    java.io.File[] var2 = var0.getSelectedFiles();
    java.lang.String var3 = var0.getApproveButtonToolTipText();
    var0.setDialogTitle("127.0.1.1");
    var0.resetChoosableFileFilters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test109");


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
    int var20 = var8.getWidth();
    java.lang.String var21 = var8.getText();
    
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
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "16"+ "'", var21.equals("16"));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test110");


    java.lang.String[] var3 = new java.lang.String[] { "/home/joao/workspace/FreeMind_integration/bin/classes/"};
    freemind.main.Resources var4 = freemind.main.Resources.getInstance();
    java.net.URL var6 = var4.getResource("file:/home/joao/workspace/\n");
    java.lang.String var8 = var4.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var10 = var4.createTranslatedString("");
    freemind.common.ComboProperty var11 = new freemind.common.ComboProperty(".", "<a,23>", var3, (freemind.common.TextTranslator)var4);
    freemind.main.XMLElement var12 = new freemind.main.XMLElement();
    java.lang.String var13 = var12.getTagName();
    java.util.Iterator var14 = var12.enumerateAttributeNames();
    java.util.Vector var16 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var17 = new freemind.modes.StylePattern(var12, (java.util.List)var16);
    accessories.plugins.time.JTripleCalendar var18 = new accessories.plugins.time.JTripleCalendar();
    boolean var19 = var18.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var20 = var18.getDayChooser();
    javax.swing.JRootPane var21 = var18.getRootPane();
    java.util.Vector var22 = freemind.main.Tools.getVectorWithSingleElement((java.lang.Object)var18);
    var11.updateComboBoxEntries((java.util.List)var16, (java.util.List)var22);
    java.lang.String var24 = var11.getLabel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var11.getValue();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "<a,23>"+ "'", var24.equals("<a,23>"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test111");


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
    var8.setHideActionText(true);
    
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

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test112");


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
    boolean var17 = var1.setProgress(2014);
    freemind.controller.FreeMindToolBar var20 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var20.requestFocus();
    int var22 = var20.getComponentCount();
    var20.addSeparator();
    accessories.plugins.time.JYearChooser var24 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var25 = var24.getMouseListeners();
    boolean var26 = var24.isDoubleBuffered();
    var24.hide();
    int var28 = var20.getComponentIndex((java.awt.Component)var24);
    java.awt.Dimension var29 = var24.getMinimumSize();
    var1.setLocationRelativeTo((java.awt.Component)var24);
    var24.resetKeyboardActions();
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test113");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    java.net.URL var5 = var3.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseMotionListener var6 = new freemind.controller.MapMouseMotionListener(var3);
    freemind.controller.MainToolBar var7 = new freemind.controller.MainToolBar(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test114");


    int var2 = freemind.main.Tools.countOccurrences("IntHolder(0)", "joao@BetelgeuseLX");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test115");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setDialogTitle("");
    accessories.plugins.time.JSpinField var5 = new accessories.plugins.time.JSpinField(10, 1);
    var5.setValue(292278994);
    java.awt.event.ContainerListener[] var8 = var5.getContainerListeners();
    var0.removeActionListener((java.awt.event.ActionListener)var5);
    var0.changeToParentDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test116");


    freemind.main.Tools.BooleanHolder var1 = new freemind.main.Tools.BooleanHolder(true);
    freemind.main.Tools.BooleanHolder var3 = new freemind.main.Tools.BooleanHolder(true);
    boolean var4 = freemind.main.Tools.safeEquals(var1, var3);
    boolean var5 = var3.getValue();
    boolean var6 = var3.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test117");


    accessories.plugins.time.JSpinField var2 = new accessories.plugins.time.JSpinField(10, 1);
    freemind.view.mindmapview.MapView.ScrollPane var4 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var5 = var4.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var6 = new accessories.plugins.time.JTripleCalendar();
    boolean var7 = var6.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var8 = var6.getDayChooser();
    java.awt.Color var9 = var8.getSundayForeground();
    var4.setColumnHeaderView((java.awt.Component)var8);
    java.util.Locale var11 = var8.getLocale();
    java.awt.Graphics var12 = var8.getGraphics();
    java.awt.Color var13 = var8.getWeekdayForeground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var14 = freemind.controller.Controller.showCommonJColorChooserDialog((java.awt.Component)var2, "hi!", var13);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test118");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    int var2 = var0.getHorizontalScrollBarPolicy();
    int var3 = var0.getWidth();
    freemind.view.mindmapview.MapView.ScrollPane var4 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var5 = var4.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var6 = new accessories.plugins.time.JTripleCalendar();
    boolean var7 = var6.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var8 = var6.getDayChooser();
    java.awt.Color var9 = var8.getSundayForeground();
    var4.setColumnHeaderView((java.awt.Component)var8);
    var4.enableInputMethods(true);
    freemind.view.mindmapview.MapView.ScrollPane var13 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var14 = var13.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var15 = new accessories.plugins.time.JTripleCalendar();
    boolean var16 = var15.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var17 = var15.getDayChooser();
    java.awt.Color var18 = var17.getSundayForeground();
    var13.setColumnHeaderView((java.awt.Component)var17);
    javax.swing.JViewport var20 = var13.getColumnHeader();
    var4.setColumnHeader(var20);
    var0.setRowHeader(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test119");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.dnd.DropTarget var4 = var1.getDropTarget();
    java.lang.String var5 = var1.getWarningString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test120");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    java.lang.String var1 = var0.getTagName();
    int var2 = var0.getLineNr();
    int var4 = var0.getIntAttribute("ToolBarUI");
    java.lang.String var7 = var0.getStringAttribute("IntHolder(0)", "/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "/home/joao/workspace/\n"+ "'", var7.equals("/home/joao/workspace/\n"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test121");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
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
    var4.setForeground(var23);
    java.lang.String var26 = var4.getName();
    boolean var28 = var4.requestFocus(true);
    accessories.plugins.dialogs.EnterPasswordDialog var29 = new accessories.plugins.dialogs.EnterPasswordDialog();
    int var30 = var29.getResult();
    freemind.common.FreeMindProgressMonitor var32 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var32.revalidate();
    var32.addNotify();
    var32.show();
    accessories.plugins.util.window.WindowClosingAdapter var36 = new accessories.plugins.util.window.WindowClosingAdapter();
    var32.removeWindowStateListener((java.awt.event.WindowStateListener)var36);
    accessories.plugins.time.JTripleCalendar var38 = new accessories.plugins.time.JTripleCalendar();
    boolean var39 = var38.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var40 = var38.getDayChooser();
    javax.swing.JRootPane var41 = var38.getRootPane();
    accessories.plugins.time.JDayChooser var42 = var38.getDayChooser();
    java.awt.event.HierarchyListener[] var43 = var38.getHierarchyListeners();
    var32.addPropertyChangeListener((java.beans.PropertyChangeListener)var38);
    float var45 = var38.getAlignmentY();
    var29.addPropertyChangeListener((java.beans.PropertyChangeListener)var38);
    freemind.controller.filter.condition.IconContainedCondition var48 = new freemind.controller.filter.condition.IconContainedCondition("");
    freemind.main.XMLElement var49 = new freemind.main.XMLElement();
    java.lang.String var50 = var49.getTagName();
    var48.save(var49);
    javax.swing.JComponent var52 = var48.getListCellRendererComponent();
    java.awt.Color var53 = var52.getBackground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.add((java.awt.Component)var29, (java.lang.Object)var53, 30);
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
    assertTrue("'" + var26 + "' != '" + "JDayChooser"+ "'", var26.equals("JDayChooser"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test122");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    int var3 = var0.getProperty("OSM MapQuest.Open Map", 0);
    int var6 = var0.getIntAttribute("//openstreetmap.org/", 7);
    java.util.Enumeration var7 = var0.enumerateChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test123");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    boolean var2 = var0.hasSpinner();
    java.awt.Component var5 = var0.findComponentAt(6, 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test124");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.awt.Color var1 = var0.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    java.util.Date var4 = var2.getMaxSelectableDate();
    var0.setDate(var4);
    var0.setWeekOfYearVisible(true);
    java.util.Date var8 = var0.getMaxSelectableDate();
    java.util.Date var9 = var0.getMinSelectableDate();
    java.util.Date var10 = var0.getMinSelectableDate();
    var0.setFocusTraversalKeysEnabled(true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test125");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.awt.Color var1 = var0.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    java.util.Date var4 = var2.getMaxSelectableDate();
    var0.setDate(var4);
    var0.removeNotify();
    var0.setDecorationBordersVisible(false);
    var0.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test126");


    accessories.plugins.NodeHistory var0 = new accessories.plugins.NodeHistory();

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test127");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    freemind.main.FreeMindApplet var5 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var6 = var5.getFocusTraversalPolicy();
    var5.destroy();
    freemind.controller.Controller var8 = new freemind.controller.Controller((freemind.main.FreeMindMain)var5);
    freemind.controller.NodeDropListener var9 = new freemind.controller.NodeDropListener(var8);
    var9.deregister();
    var4.register((java.awt.dnd.DropTargetListener)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test128");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var1 = var0.getUI();
    java.io.File[] var2 = var0.getSelectedFiles();
    java.lang.String var3 = var0.getApproveButtonToolTipText();
    var0.setApproveButtonToolTipText("http://www.openstreetmap.org/copyright");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test129");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    int var5 = var3.getComponentCount();
    var3.addSeparator();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    boolean var9 = var7.isDoubleBuffered();
    var7.hide();
    int var11 = var3.getComponentIndex((java.awt.Component)var7);
    java.awt.Dimension var12 = var7.getMinimumSize();
    var7.setFocusCycleRoot(true);
    var0.addActionListener((java.awt.event.ActionListener)var7);
    accessories.plugins.time.JTripleCalendar var16 = new accessories.plugins.time.JTripleCalendar();
    var16.requestFocus();
    accessories.plugins.time.JCalendar var18 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var19 = var18.getCalendar();
    var16.setCalendar(var19);
    accessories.plugins.time.JYearChooser var21 = var16.getYearChooser();
    freemind.common.FreeMindProgressMonitor var23 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var23.revalidate();
    var23.addNotify();
    java.awt.event.WindowListener[] var26 = var23.getWindowListeners();
    java.lang.Object var27 = var21.getClientProperty((java.lang.Object)var23);
    javax.swing.JPopupMenu var28 = var21.getComponentPopupMenu();
    freemind.common.FreeMindProgressMonitor var30 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var30.revalidate();
    boolean var32 = var30.isUndecorated();
    var30.validate();
    javax.accessibility.AccessibleContext var34 = var30.getAccessibleContext();
    java.beans.PropertyChangeListener[] var35 = var30.getPropertyChangeListeners();
    accessories.plugins.time.JYearChooser var36 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var37 = var36.getUI();
    java.awt.Dimension var38 = var36.minimumSize();
    var30.setSize(var38);
    java.awt.Dimension var40 = var21.getSize(var38);
    var7.resize(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test130");


    boolean var1 = freemind.main.HtmlTools.isXMLValidCharacter('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test131");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.modes.mindmapmode.hooks.MindMapHookFactory var2 = new freemind.modes.mindmapmode.hooks.MindMapHookFactory((freemind.main.FreeMindMain)var0);
    java.lang.String var3 = var0.getAppletInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test132");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.border.Border var7 = var4.getBorder();
    boolean var8 = var4.isPaintingForPrint();
    var4.setDecorationBordersVisible(false);
    
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

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test133");


    freemind.preferences.layout.KeyEventTranslator.Key var3 = new freemind.preferences.layout.KeyEventTranslator.Key("", 10, '#');
    java.lang.String var4 = var3.toString();
    boolean var6 = var3.equals((java.lang.Object)10.0f);
    java.lang.String var7 = var3.toString();
    freemind.common.FreeMindProgressMonitor var9 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var10 = var9.getInputMethodListeners();
    javax.accessibility.AccessibleContext var11 = var9.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var13 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var13.revalidate();
    var9.setLocationRelativeTo((java.awt.Component)var13);
    boolean var16 = var9.isValidateRoot();
    var9.hide();
    accessories.plugins.time.JTripleCalendar var18 = new accessories.plugins.time.JTripleCalendar();
    boolean var19 = var18.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var20 = var18.getDayChooser();
    boolean var21 = var20.isDecorationBordersVisible();
    var9.addKeyListener((java.awt.event.KeyListener)var20);
    var20.setEnabled(true);
    boolean var25 = var3.equals((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<a,23>"+ "'", var4.equals("<a,23>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<a,23>"+ "'", var7.equals("<a,23>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test134");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    boolean var3 = var0.getControlButtonsAreShown();
    accessories.plugins.time.JTripleCalendar var4 = new accessories.plugins.time.JTripleCalendar();
    boolean var5 = var4.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var6 = var4.getDayChooser();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    var7.repaint(100L, 1, (-1), 100, 1);
    var6.setYearChooser(var7);
    var6.enable();
    var0.addActionListener((java.awt.event.ActionListener)var6);
    javax.swing.filechooser.FileSystemView var18 = var0.getFileSystemView();
    javax.swing.filechooser.FileFilter var19 = var0.getFileFilter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test135");


    freemind.controller.filter.condition.AttributeNotExistsCondition var1 = new freemind.controller.filter.condition.AttributeNotExistsCondition("hi!");
    freemind.controller.filter.condition.ConditionNotSatisfiedDecorator var2 = new freemind.controller.filter.condition.ConditionNotSatisfiedDecorator((freemind.controller.filter.condition.Condition)var1);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test136");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    freemind.view.mindmapview.MapView.ScrollPane var1 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var2 = var1.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var3 = new accessories.plugins.time.JTripleCalendar();
    boolean var4 = var3.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var5 = var3.getDayChooser();
    java.awt.Color var6 = var5.getSundayForeground();
    var1.setColumnHeaderView((java.awt.Component)var5);
    var5.setAlwaysFireDayProperty(true);
    var5.reshape(292278994, 292278994, 2014, 11);
    freemind.controller.filter.util.SortedMapVector var15 = new freemind.controller.filter.util.SortedMapVector();
    freemind.modes.StylePattern var17 = new freemind.modes.StylePattern();
    var17.setEdgeStyle("hi!");
    freemind.modes.StylePattern var20 = var17.getChildrenStylePattern();
    freemind.modes.StylePattern var21 = new freemind.modes.StylePattern();
    var17.setChildrenStylePattern(var21);
    accessories.plugins.time.JTripleCalendar var23 = new accessories.plugins.time.JTripleCalendar();
    boolean var24 = var23.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var25 = var23.getDayChooser();
    accessories.plugins.time.JYearChooser var26 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var27 = var26.getMouseListeners();
    var26.repaint(100L, 1, (-1), 100, 1);
    var25.setYearChooser(var26);
    accessories.plugins.time.JTripleCalendar var35 = new accessories.plugins.time.JTripleCalendar();
    boolean var36 = var35.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var37 = var35.getDayChooser();
    java.awt.Color var38 = var37.getSundayForeground();
    var25.setDecorationBackgroundColor(var38);
    var17.setNodeColor(var38);
    int var41 = var15.add((java.lang.Comparable)"joao@BetelgeuseLX", (java.lang.Object)var38);
    var5.setForeground(var38);
    accessories.plugins.time.JCalendar var43 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var44 = var43.getCalendar();
    var5.setCalendar(var44);
    var0.setCalendar(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test137");


    freemind.preferences.layout.OptionPanel.NewTabProperty var1 = new freemind.preferences.layout.OptionPanel.NewTabProperty("false");

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test138");


    plugins.script.ScriptEditor var0 = new plugins.script.ScriptEditor();
    freemind.modes.attributes.ColumnWidthChangeEvent var2 = new freemind.modes.attributes.ColumnWidthChangeEvent((java.lang.Object)var0, 7);
    int var3 = var2.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 7);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test139");


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
    var8.setDebugGraphicsOptions(8);
    
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

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test140");


    freemind.controller.filter.condition.IconContainedCondition var1 = new freemind.controller.filter.condition.IconContainedCondition("http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=200&layers=Q");

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test141");


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
    var2.setDay(10);
    java.awt.Color var19 = var2.getDecorationBackgroundColor();
    
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
    assertNotNull(var19);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test142");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("hi!");
    var3.checkSecurityAccess("");
    var3.checkPropertyAccess("ToolBarUI");
    var3.checkExec("0;0;");

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test143");


    accessories.plugins.NodeNote var0 = new accessories.plugins.NodeNote();

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test144");


    freemind.main.Resources var3 = freemind.main.Resources.getInstance();
    java.lang.String var5 = var3.getResourceString("");
    freemind.common.ColorProperty var6 = new freemind.common.ColorProperty("file:/home/joao/workspace/\n", "hi!", "file:/home/joao/workspace/\n", (freemind.common.TextTranslator)var3);
    java.lang.String var7 = var6.getDescription();
    freemind.common.NamedObject var9 = new freemind.common.NamedObject((java.lang.Object)var6, "open map");
    accessories.plugins.time.JCalendar var10 = new accessories.plugins.time.JCalendar();
    java.awt.Color var11 = var10.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var12 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var13 = var12.getCalendar();
    java.util.Date var14 = var12.getMaxSelectableDate();
    var10.setDate(var14);
    var10.setWeekOfYearVisible(true);
    boolean var18 = var10.isEnabled();
    var6.addPropertyChangeListener((java.beans.PropertyChangeListener)var10);
    java.awt.event.KeyListener[] var20 = var10.getKeyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var7.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test145");


    freemind.main.XMLElement var1 = new freemind.main.XMLElement(true);
    freemind.common.PasswordProperty var5 = new freemind.common.PasswordProperty("images/icons/", "");
    var1.setAttribute("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", (java.lang.Object)var5);
    plugins.script.ScriptEditorPanel.ScriptHolder var10 = new plugins.script.ScriptEditorPanel.ScriptHolder("PositionHolder [lat=10.0, lon=1.0, zoom=100]", "<a,23>");
    java.lang.Object var11 = var1.getAttribute("freemind.modes.common.plugins.ReminderHookBase$TimerBlinkTask_STATE_", (java.lang.Object)"PositionHolder [lat=10.0, lon=1.0, zoom=100]");
    var1.setIntAttribute("http://www.openstreetmap.org/copyright", 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "PositionHolder [lat=10.0, lon=1.0, zoom=100]"+ "'", var11.equals("PositionHolder [lat=10.0, lon=1.0, zoom=100]"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test146");


    freemind.main.XMLElement var1 = new freemind.main.XMLElement(true);
    freemind.common.PasswordProperty var5 = new freemind.common.PasswordProperty("images/icons/", "");
    var1.setAttribute("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", (java.lang.Object)var5);
    accessories.plugins.time.JTripleCalendar var7 = new accessories.plugins.time.JTripleCalendar();
    boolean var8 = var7.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var9 = var7.getDayChooser();
    javax.swing.JRootPane var10 = var7.getRootPane();
    java.util.Vector var11 = freemind.main.Tools.getVectorWithSingleElement((java.lang.Object)var7);
    freemind.modes.StylePattern var12 = new freemind.modes.StylePattern(var1, (java.util.List)var11);
    boolean var13 = var12.getAppliesToNodeFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test147");


    java.lang.String var0 = freemind.main.Tools.getHostName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "BetelgeuseLX"+ "'", var0.equals("BetelgeuseLX"));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test148");


    accessories.plugins.time.JDayChooser var1 = new accessories.plugins.time.JDayChooser(false);
    java.util.Date var2 = var1.getMinSelectableDate();
    boolean var3 = var1.isDecorationBackgroundVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test149");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    java.lang.String var3 = var0.getApproveButtonText();
    javax.swing.filechooser.FileFilter var4 = var0.getAcceptAllFileFilter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "IntHolder(0)"+ "'", var3.equals("IntHolder(0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test150");


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
    java.awt.Point var23 = plugins.map.MapMarkerBase.adjustToTextfieldLocation(var22);
    
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
    assertNotNull(var23);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test151");


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
    var8.show();
    
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

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test152");


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
    accessories.plugins.time.JYearChooser var27 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var28 = var27.getMouseListeners();
    boolean var29 = var27.isDoubleBuffered();
    int var30 = var27.getEndYear();
    java.awt.Dimension var31 = var27.getMinimumSize();
    var19.removeLayoutComponent((java.awt.Component)var27);
    freemind.view.mindmapview.MapView.ScrollPane var33 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var34 = var33.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var35 = new accessories.plugins.time.JTripleCalendar();
    boolean var36 = var35.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var37 = var35.getDayChooser();
    java.awt.Color var38 = var37.getSundayForeground();
    var33.setColumnHeaderView((java.awt.Component)var37);
    java.util.Locale var40 = var37.getLocale();
    javax.swing.JButton var41 = var37.getSelectedDay();
    var41.setDisplayedMnemonicIndex(1);
    int var44 = var41.getMnemonic();
    var41.addNotify();
    var41.setFocusPainted(true);
    var19.removeLayoutComponent((java.awt.Component)var41);
    javax.swing.ImageIcon var49 = freemind.modes.common.plugins.MapNodePositionHolderBase.getMapLocationIcon();
    int var50 = var49.getImageLoadStatus();
    int var51 = var49.getImageLoadStatus();
    var41.setIcon((javax.swing.Icon)var49);
    boolean var53 = var41.isFontSet();
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test153");


    freemind.controller.filter.condition.IconNotContainedCondition var1 = new freemind.controller.filter.condition.IconNotContainedCondition("JDayChooser");

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test154");


    freemind.preferences.layout.KeyEventTranslator.Key var3 = new freemind.preferences.layout.KeyEventTranslator.Key("ToolBarUI", 0, '#');
    accessories.plugins.time.JTripleCalendar var4 = new accessories.plugins.time.JTripleCalendar();
    boolean var5 = var4.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var6 = var4.getDayChooser();
    java.awt.Color var7 = var6.getSundayForeground();
    var6.setFocus();
    int var9 = var6.getMaxDayCharacters();
    var6.setMonth(20);
    boolean var12 = var3.equals((java.lang.Object)var6);
    var6.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test155");


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
    accessories.plugins.time.JTripleCalendar var23 = new accessories.plugins.time.JTripleCalendar();
    var23.setLocation(2014, (-1));
    var23.revalidate();
    boolean var28 = var23.isFocusTraversable();
    var3.setContentPane((java.awt.Container)var23);
    boolean var32 = var23.contains(4, 20);
    
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
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test156");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    boolean var7 = var0.isPaintingTile();
    javax.swing.plaf.ScrollPaneUI var8 = var0.getUI();
    freemind.view.mindmapview.MapView.ScrollPane var9 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var10 = var9.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var11 = new accessories.plugins.time.JTripleCalendar();
    boolean var12 = var11.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var13 = var11.getDayChooser();
    java.awt.Color var14 = var13.getSundayForeground();
    var9.setColumnHeaderView((java.awt.Component)var13);
    boolean var16 = var9.isPaintingTile();
    javax.swing.plaf.ScrollPaneUI var17 = var9.getUI();
    var0.setUI(var17);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test157");


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
    boolean var17 = var1.setProgress(2014);
    freemind.controller.FreeMindToolBar var20 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var20.requestFocus();
    int var22 = var20.getComponentCount();
    var20.addSeparator();
    accessories.plugins.time.JYearChooser var24 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var25 = var24.getMouseListeners();
    boolean var26 = var24.isDoubleBuffered();
    var24.hide();
    int var28 = var20.getComponentIndex((java.awt.Component)var24);
    java.awt.Dimension var29 = var24.getMinimumSize();
    var1.setLocationRelativeTo((java.awt.Component)var24);
    java.lang.String var31 = var1.getWarningString();
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test158");


    freemind.view.mindmapview.MindMapLayout var0 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    javax.swing.InputVerifier var5 = var3.getInputVerifier();
    var0.removeLayoutComponent((java.awt.Component)var3);
    boolean var7 = var3.isFloatable();
    var3.setToolTipText("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test159");


    java.util.Vector var1 = freemind.main.Tools.urlStringToUrls("hi!");
    freemind.controller.filter.util.ExtendedComboBoxModel var2 = new freemind.controller.filter.util.ExtendedComboBoxModel(var1);
    javax.swing.event.ListDataListener[] var3 = var2.getListDataListeners();
    var2.removeElementAt(256);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test160");


    boolean var0 = freemind.main.Tools.isAboveJava4();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test161");


    accessories.plugins.ExportWithXSLT var0 = new accessories.plugins.ExportWithXSLT();

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test162");


    freemind.extensions.ExportHook.ImageFilter var2 = new freemind.extensions.ExportHook.ImageFilter("JDayChooser", "simplyhtml.//openstreetmap.org/");

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test163");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    java.lang.Integer var6 = var0.getNodeFontSize();
    freemind.common.FreeMindProgressMonitor var8 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var8.dispose();
    java.util.Vector var11 = freemind.main.Tools.urlStringToUrls("hi!");
    var8.setIconImages((java.util.List)var11);
    java.util.Locale var13 = var8.getLocale();
    freemind.modes.StylePattern var14 = new freemind.modes.StylePattern();
    var14.setEdgeStyle("hi!");
    freemind.modes.StylePattern var17 = var14.getChildrenStylePattern();
    freemind.modes.StylePattern var18 = new freemind.modes.StylePattern();
    var14.setChildrenStylePattern(var18);
    accessories.plugins.time.JTripleCalendar var20 = new accessories.plugins.time.JTripleCalendar();
    boolean var21 = var20.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var22 = var20.getDayChooser();
    java.awt.Color var23 = var22.getSundayForeground();
    var18.setNodeBackgroundColor(var23);
    var8.setBackground(var23);
    var0.setEdgeColor(var23);
    freemind.view.mindmapview.MapView.ScrollPane var27 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var28 = var27.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var29 = new accessories.plugins.time.JTripleCalendar();
    boolean var30 = var29.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var31 = var29.getDayChooser();
    java.awt.Color var32 = var31.getSundayForeground();
    var27.setColumnHeaderView((java.awt.Component)var31);
    var31.setAlwaysFireDayProperty(true);
    var31.reshape(292278994, 292278994, 2014, 11);
    freemind.controller.filter.util.SortedMapVector var41 = new freemind.controller.filter.util.SortedMapVector();
    freemind.modes.StylePattern var43 = new freemind.modes.StylePattern();
    var43.setEdgeStyle("hi!");
    freemind.modes.StylePattern var46 = var43.getChildrenStylePattern();
    freemind.modes.StylePattern var47 = new freemind.modes.StylePattern();
    var43.setChildrenStylePattern(var47);
    accessories.plugins.time.JTripleCalendar var49 = new accessories.plugins.time.JTripleCalendar();
    boolean var50 = var49.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var51 = var49.getDayChooser();
    accessories.plugins.time.JYearChooser var52 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var53 = var52.getMouseListeners();
    var52.repaint(100L, 1, (-1), 100, 1);
    var51.setYearChooser(var52);
    accessories.plugins.time.JTripleCalendar var61 = new accessories.plugins.time.JTripleCalendar();
    boolean var62 = var61.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var63 = var61.getDayChooser();
    java.awt.Color var64 = var63.getSundayForeground();
    var51.setDecorationBackgroundColor(var64);
    var43.setNodeColor(var64);
    int var67 = var41.add((java.lang.Comparable)"joao@BetelgeuseLX", (java.lang.Object)var64);
    var31.setForeground(var64);
    accessories.plugins.time.JTripleCalendar var69 = new accessories.plugins.time.JTripleCalendar();
    boolean var70 = var69.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var71 = var69.getDayChooser();
    accessories.plugins.time.JYearChooser var72 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var73 = var72.getMouseListeners();
    var72.repaint(100L, 1, (-1), 100, 1);
    var71.setYearChooser(var72);
    accessories.plugins.time.JTripleCalendar var81 = new accessories.plugins.time.JTripleCalendar();
    boolean var82 = var81.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var83 = var81.getDayChooser();
    java.awt.Color var84 = var83.getSundayForeground();
    var71.setDecorationBackgroundColor(var84);
    var31.setDecorationBackgroundColor(var84);
    var0.setNodeBackgroundColor(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test164");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    java.lang.String var2 = var1.getTagName();
    java.util.Iterator var3 = var1.enumerateAttributeNames();
    java.util.Iterator var4 = var1.enumeratePropertyNames();
    var0.loadFrom(var1);
    freemind.modes.MindMapNode var6 = var0.getNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test165");


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
    accessories.plugins.time.JMonthChooser var34 = new accessories.plugins.time.JMonthChooser();
    var34.updateUI();
    var8.removeItemListener((java.awt.event.ItemListener)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setHorizontalAlignment(256);
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test166");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    boolean var3 = var1.isUndecorated();
    var1.validate();
    javax.accessibility.AccessibleContext var5 = var1.getAccessibleContext();
    java.beans.PropertyChangeListener[] var6 = var1.getPropertyChangeListeners();
    var1.toFront();
    boolean var8 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test167");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.net.URL var2 = var0.getResource("file:/home/joao/workspace/\n");
    java.lang.String var4 = var0.getResourceString("<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>");
    freemind.common.NamedObject var6 = var0.createTranslatedString("//openstreetmap.org/");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>"+ "'", var4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test168");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    java.net.URL var5 = var3.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var6 = new freemind.controller.MapMouseWheelListener(var3);
    java.net.URL var8 = var3.getResource("control");
    freemind.controller.MapMouseMotionListener var9 = new freemind.controller.MapMouseMotionListener(var3);
    plugins.collaboration.database.DatabaseConnectionHook var10 = new plugins.collaboration.database.DatabaseConnectionHook();
    var3.registerMapTitleContributor((freemind.controller.MapModuleManager.MapTitleContributor)var10);
    var10.processUnfinishedLinks();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test169");


    freemind.common.PasswordProperty var2 = new freemind.common.PasswordProperty("images/icons/", "");
    var2.setValue("JDayChooser");
    java.lang.String var5 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "eNoDAAAAAAE="+ "'", var5.equals("eNoDAAAAAAE="));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test170");


    freemind.common.StringProperty var2 = new freemind.common.StringProperty("", "hi!");
    var2.setValue("file:/home/joao/workspace/\n");
    java.lang.String var5 = var2.getDescription();
    freemind.common.StringProperty var8 = new freemind.common.StringProperty("file:/home/joao/workspace/\n", "ToolBarUI");
    accessories.plugins.time.JTripleCalendar var9 = new accessories.plugins.time.JTripleCalendar();
    var9.revalidate();
    var8.addPropertyChangeListener((java.beans.PropertyChangeListener)var9);
    boolean var12 = var9.getAutoscrolls();
    var2.removePropertyChangeListener((java.beans.PropertyChangeListener)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test171");


    freemind.main.FreeMindStarter.ProxyAuthenticator var2 = new freemind.main.FreeMindStarter.ProxyAuthenticator("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]", "false");

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test172");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    var1.dismiss();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test173");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.setIgnoreRepaint(false);
    java.awt.Dimension var6 = var2.getSize();
    var2.setLocation(10, 0);
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var12 = var11.getInputMethodListeners();
    javax.accessibility.AccessibleContext var13 = var11.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var15 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var15.revalidate();
    var11.setLocationRelativeTo((java.awt.Component)var15);
    accessories.plugins.time.JYearChooser var18 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var19 = var18.getUI();
    var18.setStartYear(10);
    int var22 = var18.getMaximum();
    var18.validate();
    java.awt.Component var25 = var11.add((java.awt.Component)var18, (-1));
    boolean var26 = var18.requestFocusInWindow();
    accessories.plugins.time.JSpinField var29 = new accessories.plugins.time.JSpinField(10, 1);
    var29.setValue(292278994);
    java.awt.event.ContainerListener[] var32 = var29.getContainerListeners();
    java.awt.Dimension var33 = var29.getMinimumSize();
    var18.setPreferredSize(var33);
    var18.setValue(30);
    var2.putClientProperty((java.lang.Object)var18, (java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test174");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    int var4 = var1.getHeight();
    boolean var5 = var1.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 198);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test175");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getAttributionLinkURL();
    var0.setAttributionLinkURL("false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://openstreetmap.org/"+ "'", var1.equals("http://openstreetmap.org/"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test176");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    int var7 = var0.getVerticalScrollBarPolicy();
    java.awt.Container var8 = var0.getFocusCycleRootAncestor();
    freemind.view.mindmapview.MapView.ScrollPane var9 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var10 = var9.getAccessibleContext();
    int var11 = var9.getHorizontalScrollBarPolicy();
    freemind.view.mindmapview.MapView.ScrollPane var12 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var13 = var12.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var14 = new accessories.plugins.time.JTripleCalendar();
    boolean var15 = var14.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var16 = var14.getDayChooser();
    java.awt.Color var17 = var16.getSundayForeground();
    var12.setColumnHeaderView((java.awt.Component)var16);
    var12.enableInputMethods(true);
    freemind.view.mindmapview.MapView.ScrollPane var21 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var22 = var21.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var23 = new accessories.plugins.time.JTripleCalendar();
    boolean var24 = var23.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var25 = var23.getDayChooser();
    java.awt.Color var26 = var25.getSundayForeground();
    var21.setColumnHeaderView((java.awt.Component)var25);
    javax.swing.JViewport var28 = var21.getColumnHeader();
    var12.setColumnHeader(var28);
    var9.setRowHeader(var28);
    var0.setRowHeader(var28);
    java.awt.GraphicsConfiguration var32 = var28.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertNull(var32);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test177");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.preferences.layout.KeyEventTranslator.setModifierMapping(0, 8, 11, 292278994);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test178");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    var0.setFile("Png");
    java.lang.String var3 = var0.getTitle();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setMode(2014);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test179");


    freemind.preferences.layout.KeyEventTranslator.Key var3 = new freemind.preferences.layout.KeyEventTranslator.Key("", 10, '#');
    java.lang.String var4 = var3.toString();
    boolean var6 = var3.equals((java.lang.Object)10.0f);
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<a,23>"+ "'", var4.equals("<a,23>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "<a,23>"+ "'", var7.equals("<a,23>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "<a,23>"+ "'", var8.equals("<a,23>"));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test180");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    java.lang.Integer var3 = var0.getNodeFontSize();
    freemind.modes.MindIcon var4 = var0.getNodeIcon();
    boolean var5 = var0.getRecursive();
    java.lang.String var6 = var0.getEdgeStyle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test181");


    accessories.plugins.CreationModificationPlugin var0 = new accessories.plugins.CreationModificationPlugin();
    freemind.modes.MindMapNode var1 = var0.getNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test182");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.File[] var1 = var0.getSelectedFiles();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test183");


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
    var5.firePropertyChange("joao@BetelgeuseLX", 4, 292278994);
    
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

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test184");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var2 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var3 = var2.getName();
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Iterator var5 = var0.iterator();
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var7.revalidate();
    boolean var9 = var7.isUndecorated();
    var7.validate();
    javax.accessibility.AccessibleContext var11 = var7.getAccessibleContext();
    java.beans.PropertyChangeListener[] var12 = var7.getPropertyChangeListeners();
    var0.addAll((java.lang.Object[])var12);
    var0.setSelectedItem((java.lang.Object)256);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test185");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setHorizontalAlignment((-2147483648));
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
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test186");


    freemind.common.BooleanProperty var2 = new freemind.common.BooleanProperty("/home/joao/workspace/FreeMind_integration/bin/classes/", "16");

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test187");


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
    var34.dispose();
    java.util.Vector var37 = freemind.main.Tools.urlStringToUrls("hi!");
    var34.setIconImages((java.util.List)var37);
    java.util.Locale var39 = var34.getLocale();
    accessories.plugins.time.JCalendar var40 = new accessories.plugins.time.JCalendar(var20, var39);
    boolean var41 = var40.isFocusTraversable();
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test188");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    freemind.modes.FreeMindJFileDialog var3 = new freemind.modes.FreeMindJFileDialog();
    var3.setApproveButtonText("IntHolder(0)");
    boolean var6 = var3.getControlButtonsAreShown();
    accessories.plugins.time.JTripleCalendar var7 = new accessories.plugins.time.JTripleCalendar();
    boolean var8 = var7.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var9 = var7.getDayChooser();
    accessories.plugins.time.JYearChooser var10 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var11 = var10.getMouseListeners();
    var10.repaint(100L, 1, (-1), 100, 1);
    var9.setYearChooser(var10);
    var9.enable();
    var3.addActionListener((java.awt.event.ActionListener)var9);
    javax.swing.filechooser.FileSystemView var21 = var3.getFileSystemView();
    var0.setFileSystemView(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test189");


    freemind.main.Tools.setPermissions("", 10);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test190");


    freemind.controller.filter.condition.AttributeNotExistsCondition var1 = new freemind.controller.filter.condition.AttributeNotExistsCondition("hi!");
    javax.swing.JComponent var2 = var1.getListCellRendererComponent();
    freemind.main.XMLElement var3 = new freemind.main.XMLElement();
    java.lang.String var4 = var3.getTagName();
    int var5 = var3.getLineNr();
    int var7 = var3.getIntAttribute("ToolBarUI");
    var1.saveAttributes(var3);
    plugins.map.MapNodePositionHolder var9 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var10 = new freemind.main.XMLElement();
    freemind.controller.filter.condition.AttributeNotExistsCondition var13 = new freemind.controller.filter.condition.AttributeNotExistsCondition("ToolBarUI");
    var10.setAttribute("ButtonUI", (java.lang.Object)"ToolBarUI");
    var10.removeChild("IntHolder(0)");
    var9.loadFrom(var10);
    var1.save(var10);
    javax.swing.JComponent var19 = var1.getListCellRendererComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test191");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    int var1 = var0.getWinHeight();
    java.lang.String var2 = var0.getAppletInfo();
    java.util.List var3 = var0.getLoggerList();
    freemind.main.FreeMindApplet var4 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var5 = var4.getFocusTraversalPolicy();
    freemind.controller.MenuBar var6 = var4.getFreeMindMenuBar();
    java.awt.Component var7 = var0.add((java.awt.Component)var4);
    freemind.common.FreeMindProgressMonitor var9 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var10 = var9.getInputMethodListeners();
    javax.accessibility.AccessibleContext var11 = var9.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var13 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var13.revalidate();
    var9.setLocationRelativeTo((java.awt.Component)var13);
    accessories.plugins.time.JYearChooser var16 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var17 = var16.getUI();
    var16.setStartYear(10);
    int var20 = var16.getMaximum();
    var16.validate();
    java.awt.Component var23 = var9.add((java.awt.Component)var16, (-1));
    var23.revalidate();
    java.awt.Toolkit var25 = var23.getToolkit();
    var4.remove(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test192");


    freemind.main.FreeMindMain.VersionInformation var5 = new freemind.main.FreeMindMain.VersionInformation(100, 10, 200, 11, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var5.toString();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test193");


    freemind.extensions.ExportHook.ImageFilter var2 = new freemind.extensions.ExportHook.ImageFilter("Arrow_ID_515901044", "file:/home/joao/workspace/FreeMind_integration/bin/classes/images/map_location.png");

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test194");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    freemind.modes.MindIcon var2 = freemind.modes.MindIcon.factory("hi!");
    java.lang.String var3 = var2.getIconFileName();
    var0.setNodeIcon(var2);
    java.lang.String var5 = var0.getEdgeStyle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "images/icons/JDayChooser.png"+ "'", var3.equals("images/icons/JDayChooser.png"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test195");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.dispose();
    java.util.Vector var4 = freemind.main.Tools.urlStringToUrls("hi!");
    var1.setIconImages((java.util.List)var4);
    java.util.Locale var6 = var1.getLocale();
    freemind.modes.StylePattern var7 = new freemind.modes.StylePattern();
    var7.setEdgeStyle("hi!");
    freemind.modes.StylePattern var10 = var7.getChildrenStylePattern();
    freemind.modes.StylePattern var11 = new freemind.modes.StylePattern();
    var7.setChildrenStylePattern(var11);
    accessories.plugins.time.JTripleCalendar var13 = new accessories.plugins.time.JTripleCalendar();
    boolean var14 = var13.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var15 = var13.getDayChooser();
    java.awt.Color var16 = var15.getSundayForeground();
    var11.setNodeBackgroundColor(var16);
    var1.setBackground(var16);
    java.awt.Container var19 = var1.getFocusCycleRootAncestor();
    java.awt.event.MouseListener[] var20 = var1.getMouseListeners();
    java.awt.Graphics var21 = var1.getGraphics();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var23 = var1.getFocusTraversalKeys((-2147483648));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test196");


    freemind.preferences.layout.OptionPanel.NewTabProperty var2 = new freemind.preferences.layout.OptionPanel.NewTabProperty("joao@BetelgeuseLX", "16");

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test197");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    boolean var3 = var0.getControlButtonsAreShown();
    accessories.plugins.time.JTripleCalendar var4 = new accessories.plugins.time.JTripleCalendar();
    boolean var5 = var4.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var6 = var4.getDayChooser();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    var7.repaint(100L, 1, (-1), 100, 1);
    var6.setYearChooser(var7);
    var6.enable();
    var0.addActionListener((java.awt.event.ActionListener)var6);
    var6.setDay(59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test198");


    java.util.List var1 = freemind.main.Tools.stringToList("Arrow_ID_515901044");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test199");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    int var2 = var0.getTileSize();
    java.lang.String var3 = var0.getAttributionImageURL();
    org.openstreetmap.gui.jmapviewer.interfaces.TileSource.TileUpdate var4 = var0.getTileUpdate();
    double var7 = var0.lonToTileX((-1.0d), 2014);
    var0.setAttributionText("<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>");
    java.lang.String var10 = var0.getTermsOfUseText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 256);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test200");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.setStartYear(10);
    int var4 = var0.getMaximum();
    var0.validate();
    boolean var6 = var0.getVerifyInputWhenFocusTarget();
    var0.setMinimum(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test201");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    javax.swing.Action var4 = javax.swing.TransferHandler.getCutAction();
    freemind.main.Tools.addKeyActionToDialog((javax.swing.JDialog)var1, var4, "images/icons///SIGN:null\n", "");
    boolean var8 = var1.getFocusableWindowState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test202");


    freemind.controller.filter.condition.ConditionFactory var0 = freemind.controller.filter.FilterController.getConditionFactory();
    freemind.common.NamedObject[] var1 = var0.getAttributeConditionNames();
    freemind.common.NamedObject[] var2 = var0.getAttributeConditionNames();
    java.lang.Object[] var3 = var0.getIconConditionNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test203");


    byte[] var1 = freemind.main.Tools.uTF8StringToByteArray("simplyhtml.//openstreetmap.org/");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test204");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.lang.String var2 = var0.getResourceString("");
    java.lang.String var4 = var0.getText("hi!");
    int var7 = var0.getIntProperty("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 4);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test205");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    int var4 = var2.getWidth();
    javax.accessibility.AccessibleContext var5 = var2.getAccessibleContext();
    freemind.controller.FreeMindToolBar var8 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var8.updateUI();
    var8.repaint(10L);
    freemind.controller.FreeMindToolBar var14 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var15 = var14.isLightweight();
    javax.swing.plaf.ToolBarUI var16 = var14.getUI();
    var8.setUI(var16);
    var2.setUI(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test206");


    freemind.controller.FreeMindToolBar var0 = new freemind.controller.FreeMindToolBar();
    boolean var3 = var0.contains(100, 6);
    freemind.main.FreeMindApplet var4 = new freemind.main.FreeMindApplet();
    boolean var5 = var4.isActive();
    freemind.controller.FreeMindToolBar var8 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var8.requestFocus();
    int var10 = var8.getComponentCount();
    var8.addSeparator();
    accessories.plugins.time.JYearChooser var12 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var13 = var12.getMouseListeners();
    boolean var14 = var12.isDoubleBuffered();
    var12.hide();
    int var16 = var8.getComponentIndex((java.awt.Component)var12);
    java.awt.Dimension var17 = var12.getMinimumSize();
    var4.resize(var17);
    var0.addSeparator(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test207");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    var0.enableInputMethods(true);
    java.lang.String var9 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ScrollPaneUI"+ "'", var9.equals("ScrollPaneUI"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test208");


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
    var14.removeChild("Abyssinica SIL");
    
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

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test209");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.awt.Point var7 = var0.location();
    javax.swing.JViewport var8 = var0.getRowHeader();
    boolean var9 = var0.isWheelScrollingEnabled();
    
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

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test210");


    accessories.plugins.ExportToOoWriter var0 = new accessories.plugins.ExportToOoWriter();

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test211");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.requestFocus();
    boolean var4 = var2.isFocusable();
    javax.swing.ActionMap var5 = var2.getActionMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test212");


    freemind.modes.browsemode.BrowseHookFactory var0 = new freemind.modes.browsemode.BrowseHookFactory();
    java.util.List var2 = var0.getHookMenuPositions("png");
    java.util.List var3 = var0.getRegistrations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test213");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    freemind.controller.filter.condition.ConjunctConditions var2 = new freemind.controller.filter.condition.ConjunctConditions((java.lang.Object[])var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test214");


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
    java.lang.String var18 = var0.toString();
    var0.setTileSource("//openstreetmap.org/");
    
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
    assertTrue("'" + var18 + "' != '" + "MapNodePositionHolder [mPosition=Coordinate[0.0, 0.0], mMapCenter=Coordinate[0.0, 0.0], mTileSource=null, mZoom=1, getNode()=null]"+ "'", var18.equals("MapNodePositionHolder [mPosition=Coordinate[0.0, 0.0], mMapCenter=Coordinate[0.0, 0.0], mTileSource=null, mZoom=1, getNode()=null]"));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test215");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var2 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var3 = var2.getName();
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Iterator var5 = var0.iterator();
    var0.remove((java.lang.Object)"icon_hi!");
    var0.clear();
    java.lang.String[] var10 = new java.lang.String[] { "file:/home/joao/workspace/\n"};
    freemind.main.ExampleFileFilter var11 = new freemind.main.ExampleFileFilter(var10);
    java.lang.String var12 = freemind.main.Tools.arrayToUrls(var10);
    freemind.main.ExampleFileFilter var14 = new freemind.main.ExampleFileFilter(var10, "images/icons///SIGN:null\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove((java.lang.Object)var10);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "file:/home/joao/workspace/file:/home/joao/workspace/%0A\n"+ "'", var12.equals("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n"));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test216");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.controller.MenuBar var2 = var0.getFreeMindMenuBar();
    int var3 = var0.getWinHeight();
    var0.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test217");


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
    freemind.common.FreeMindProgressMonitor var22 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var22.dispose();
    java.util.Vector var25 = freemind.main.Tools.urlStringToUrls("hi!");
    var22.setIconImages((java.util.List)var25);
    java.util.Locale var27 = var22.getLocale();
    accessories.plugins.time.JCalendar var30 = new accessories.plugins.time.JCalendar(var19, var27, true, true);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test218");


    accessories.plugins.dialogs.EnterPasswordDialog var0 = new accessories.plugins.dialogs.EnterPasswordDialog();
    int var1 = var0.getResult();
    java.lang.StringBuffer var2 = var0.getPassword();
    var0.setLocation((-2147483648), (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test219");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.JViewport var7 = var0.getColumnHeader();
    javax.swing.JScrollBar var8 = var0.createHorizontalScrollBar();
    boolean var9 = var0.isValidateRoot();
    
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
    assertTrue(var9 == true);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test220");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    var0.setFileSelectionMode(256);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test221");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    int var3 = var0.getProperty("OSM MapQuest.Open Map", 0);
    int var6 = var0.getIntAttribute("//openstreetmap.org/", 7);
    java.lang.Object var9 = var0.getAttribute("png", (java.lang.Object)4.110171553125E8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 4.110171553125E8d+ "'", var9.equals(4.110171553125E8d));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test222");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
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
    var4.setForeground(var23);
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
    freemind.view.mindmapview.MapView.ScrollPane var43 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var44 = var43.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var45 = new accessories.plugins.time.JTripleCalendar();
    boolean var46 = var45.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var47 = var45.getDayChooser();
    java.awt.Color var48 = var47.getSundayForeground();
    var43.setColumnHeaderView((java.awt.Component)var47);
    java.util.Locale var50 = var47.getLocale();
    javax.swing.JButton var51 = var47.getSelectedDay();
    java.util.Date var52 = var47.getMaxSelectableDate();
    freemind.common.FreeMindProgressMonitor var54 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var55 = var54.getInputMethodListeners();
    javax.accessibility.AccessibleContext var56 = var54.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var58 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var58.revalidate();
    var54.setLocationRelativeTo((java.awt.Component)var58);
    boolean var61 = var54.isValidateRoot();
    accessories.plugins.time.JCalendar var62 = new accessories.plugins.time.JCalendar();
    java.awt.Color var63 = var62.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var64 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var65 = var64.getCalendar();
    java.util.Date var66 = var64.getMaxSelectableDate();
    var62.setDate(var66);
    var62.setWeekOfYearVisible(true);
    var54.addPropertyChangeListener((java.beans.PropertyChangeListener)var62);
    accessories.plugins.time.JCalendar var71 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var72 = var71.getCalendar();
    java.util.Date var73 = var71.getMaxSelectableDate();
    var62.setMinSelectableDate(var73);
    var28.setSelectableDateRange(var52, var73);
    java.util.Date var76 = var4.setMaxSelectableDate(var73);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test223");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.dispose();
    java.util.Vector var4 = freemind.main.Tools.urlStringToUrls("hi!");
    var1.setIconImages((java.util.List)var4);
    java.lang.String var6 = freemind.main.Tools.listToString((java.util.List)var4);
    java.lang.String var7 = freemind.main.Tools.listToString((java.util.List)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test224");


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
    javax.swing.KeyStroke[] var22 = var8.getRegisteredKeyStrokes();
    
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
    assertNotNull(var22);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test225");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    var0.setFile("Png");
    java.lang.String var3 = var0.getTitle();
    freemind.main.ExampleFileFilter var4 = new freemind.main.ExampleFileFilter();
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var4);
    java.awt.Component.BaselineResizeBehavior var6 = var0.getBaselineResizeBehavior();
    java.awt.event.FocusListener[] var7 = var0.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test226");


    freemind.preferences.layout.VariableSizeCardLayout var2 = new freemind.preferences.layout.VariableSizeCardLayout(10, 0);
    freemind.view.mindmapview.MapView.ScrollPane var3 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var4 = var3.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var5 = new accessories.plugins.time.JTripleCalendar();
    boolean var6 = var5.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var7 = var5.getDayChooser();
    java.awt.Color var8 = var7.getSundayForeground();
    var3.setColumnHeaderView((java.awt.Component)var7);
    java.util.Locale var10 = var7.getLocale();
    javax.swing.JButton var11 = var7.getSelectedDay();
    var11.setDisplayedMnemonicIndex(1);
    int var14 = var11.getMnemonic();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.first((java.awt.Container)var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test227");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.modes.mindmapmode.hooks.MindMapHookFactory var2 = new freemind.modes.mindmapmode.hooks.MindMapHookFactory((freemind.main.FreeMindMain)var0);
    java.util.List var3 = var2.getRegistrations();
    java.util.Vector var4 = var2.getPossibleModeControllerHooks();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var2.getHookMenuPositions("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]");
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

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test228");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.util.Locale var7 = var4.getLocale();
    javax.swing.JButton var8 = var4.getSelectedDay();
    var4.requestFocus();
    java.awt.event.MouseListener[] var10 = var4.getMouseListeners();
    
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
    assertNotNull(var10);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test229");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    int var2 = var0.getHorizontalScrollBarPolicy();
    int var3 = var0.getWidth();
    freemind.view.mindmapview.MapView.ScrollPane var4 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var5 = var4.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var6 = new accessories.plugins.time.JTripleCalendar();
    boolean var7 = var6.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var8 = var6.getDayChooser();
    java.awt.Color var9 = var8.getSundayForeground();
    var4.setColumnHeaderView((java.awt.Component)var8);
    var4.enableInputMethods(true);
    javax.swing.border.Border var13 = var4.getViewportBorder();
    var4.setWheelScrollingEnabled(true);
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.border.Border var17 = var0.getViewportBorder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test230");


    plugins.script.ScriptEditor var0 = new plugins.script.ScriptEditor();
    freemind.modes.attributes.ColumnWidthChangeEvent var2 = new freemind.modes.attributes.ColumnWidthChangeEvent((java.lang.Object)var0, 7);
    java.lang.String var3 = var2.toString();

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test231");


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
    accessories.plugins.time.JYearChooser var27 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var28 = var27.getMouseListeners();
    boolean var29 = var27.isDoubleBuffered();
    int var30 = var27.getEndYear();
    java.awt.Dimension var31 = var27.getMinimumSize();
    var19.removeLayoutComponent((java.awt.Component)var27);
    freemind.view.mindmapview.MapView.ScrollPane var33 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var34 = var33.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var35 = new accessories.plugins.time.JTripleCalendar();
    boolean var36 = var35.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var37 = var35.getDayChooser();
    java.awt.Color var38 = var37.getSundayForeground();
    var33.setColumnHeaderView((java.awt.Component)var37);
    java.util.Locale var40 = var37.getLocale();
    javax.swing.JButton var41 = var37.getSelectedDay();
    var41.setDisplayedMnemonicIndex(1);
    int var44 = var41.getMnemonic();
    var41.addNotify();
    var41.setFocusPainted(true);
    var19.removeLayoutComponent((java.awt.Component)var41);
    javax.swing.ImageIcon var49 = freemind.modes.common.plugins.MapNodePositionHolderBase.getMapLocationIcon();
    int var50 = var49.getImageLoadStatus();
    int var51 = var49.getImageLoadStatus();
    var41.setIcon((javax.swing.Icon)var49);
    java.lang.String var53 = var49.getDescription();
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "file:/home/joao/workspace/FreeMind_integration/bin/classes/images/map_location.png"+ "'", var53.equals("file:/home/joao/workspace/FreeMind_integration/bin/classes/images/map_location.png"));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test232");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.modes.mindmapmode.hooks.MindMapHookFactory var2 = new freemind.modes.mindmapmode.hooks.MindMapHookFactory((freemind.main.FreeMindMain)var0);
    java.util.List var3 = var2.getRegistrations();
    java.util.Vector var4 = var2.getPossibleModeControllerHooks();
    freemind.main.FreeMindApplet var6 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var7 = var6.getFocusTraversalPolicy();
    var6.destroy();
    freemind.controller.Controller var9 = new freemind.controller.Controller((freemind.main.FreeMindMain)var6);
    freemind.main.FreeMindApplet var10 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var11 = var10.getResources();
    var9.setFrame((freemind.main.FreeMindMain)var10);
    freemind.main.FreeMindApplet var13 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var14 = var13.getFocusTraversalPolicy();
    var13.destroy();
    freemind.controller.Controller var16 = new freemind.controller.Controller((freemind.main.FreeMindMain)var13);
    freemind.controller.NodeDropListener var17 = new freemind.controller.NodeDropListener(var16);
    freemind.controller.Controller.PropertyAction var18 = var9.new PropertyAction(var16);
    var18.setEnabled(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.decorateAction("http://a.tile2.opencyclemap.org/transport", (javax.swing.AbstractAction)var18);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test233");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    java.lang.String var6 = var0.getEdgeStyle();
    var0.setNodeStyle("images/icons/");
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "node: null, null, images/icons/, null, null, null, null, \nedge: null, hi!, null"+ "'", var9.equals("node: null, null, images/icons/, null, null, null, null, \nedge: null, hi!, null"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test234");


    plugins.collaboration.database.DatabaseStarter var0 = new plugins.collaboration.database.DatabaseStarter();
    var0.onUpdateNodeHook();
    var0.onUpdateNodeHook();

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test235");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    java.util.Locale var6 = var2.getLocale();
    var2.destroy();
    boolean var8 = var2.isMaximumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test236");


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
    accessories.plugins.time.JCalendar var42 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var43 = var42.getCalendar();
    var4.setCalendar(var43);
    freemind.common.FreeMindProgressMonitor var46 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var46.revalidate();
    boolean var48 = var46.isUndecorated();
    var46.validate();
    java.awt.Container var50 = var46.getContentPane();
    freemind.main.FreeMindApplet var51 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var52 = var51.getFocusTraversalPolicy();
    var51.destroy();
    freemind.controller.Controller var54 = new freemind.controller.Controller((freemind.main.FreeMindMain)var51);
    java.net.URL var56 = var54.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var57 = new freemind.controller.MapMouseWheelListener(var54);
    var50.addMouseWheelListener((java.awt.event.MouseWheelListener)var57);
    var4.removeMouseWheelListener((java.awt.event.MouseWheelListener)var57);
    var4.setSize(198, 6);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test237");


    javax.swing.ImageIcon var0 = freemind.modes.common.plugins.MapNodePositionHolderBase.getMapLocationIcon();
    int var1 = var0.getImageLoadStatus();
    int var2 = var0.getImageLoadStatus();
    javax.accessibility.AccessibleContext var3 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test238");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    java.net.URL var5 = var3.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var6 = new freemind.controller.MapMouseWheelListener(var3);
    java.net.URL var8 = var3.getResource("control");
    freemind.controller.MapMouseMotionListener var9 = new freemind.controller.MapMouseMotionListener(var3);
    var3.setAntialiasEdges(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test239");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var2.isDecorationBordersVisible();
    java.util.GregorianCalendar var4 = var2.getTemporaryCalendar();
    boolean var5 = var2.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test240");


    freemind.controller.filter.condition.SelectedViewCondition var0 = new freemind.controller.filter.condition.SelectedViewCondition();
    javax.swing.JComponent var1 = var0.getListCellRendererComponent();
    javax.swing.InputVerifier var2 = var1.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test241");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isMultiSelectionEnabled();
    java.awt.Window[] var3 = var0.getOwnedWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test242");


    accessories.plugins.NodeNoteRegistration.SimplyHtmlResources var0 = new accessories.plugins.NodeNoteRegistration.SimplyHtmlResources();
    java.lang.String var2 = var0.getString("//openstreetmap.org/");
    java.lang.String var4 = var0.getString("http://www.openstreetmap.org/copyright");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "simplyhtml.//openstreetmap.org/"+ "'", var2.equals("simplyhtml.//openstreetmap.org/"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "simplyhtml.http://www.openstreetmap.org/copyright"+ "'", var4.equals("simplyhtml.http://www.openstreetmap.org/copyright"));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test243");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.main.FreeMindApplet var4 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var5 = var4.getResources();
    var3.setFrame((freemind.main.FreeMindMain)var4);
    freemind.main.FreeMindApplet var7 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var8 = var7.getFocusTraversalPolicy();
    var7.destroy();
    freemind.controller.Controller var10 = new freemind.controller.Controller((freemind.main.FreeMindMain)var7);
    freemind.controller.NodeDropListener var11 = new freemind.controller.NodeDropListener(var10);
    freemind.controller.Controller.PropertyAction var12 = var3.new PropertyAction(var10);
    boolean var13 = var12.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test244");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.requestFocus();
    boolean var4 = var2.isFocusable();
    java.lang.Object var5 = var2.getTreeLock();
    var2.setRollover(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test245");


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
    boolean var28 = var8.isBorderPainted();
    int var29 = var8.getHorizontalTextPosition();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 11);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test246");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isDoubleBuffered();
    freemind.main.ExampleFileFilter var2 = new freemind.main.ExampleFileFilter();
    var2.setExtensionListInDescription(false);
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var2);
    var2.setDescription("/home/joao/workspace/FreeMind_integration/bin/classes/");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test247");


    freemind.modes.common.dialogs.EnterPasswordDialog var0 = new freemind.modes.common.dialogs.EnterPasswordDialog();
    int var1 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test248");


    byte[] var1 = freemind.main.Base64Coding.decode64("meta");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test249");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    java.awt.Dimension var2 = var0.minimumSize();
    java.util.Set var4 = freemind.main.Tools.getAvailableFontFamilyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(1, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test250");


    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var1 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var2 = var1.createReader();
    boolean var3 = var2.ready();
    long var5 = var2.skip(100L);
    var2.mark(200);
    freemind.main.FreeMindApplet var9 = new freemind.main.FreeMindApplet();
    int var10 = var9.getWinHeight();
    java.lang.String var11 = var9.getAppletInfo();
    java.util.List var12 = var9.getLoggerList();
    freemind.main.FreeMindApplet var13 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var14 = var13.getFocusTraversalPolicy();
    freemind.controller.MenuBar var15 = var13.getFreeMindMenuBar();
    java.awt.Component var16 = var9.add((java.awt.Component)var13);
    java.io.Reader var17 = freemind.main.Tools.getUpdateReader(var2, "hi!", (freemind.main.FreeMindMain)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 9L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test251");


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
    boolean var16 = var8.requestFocusInWindow();
    accessories.plugins.time.JSpinField var19 = new accessories.plugins.time.JSpinField(10, 1);
    var19.setValue(292278994);
    java.awt.event.ContainerListener[] var22 = var19.getContainerListeners();
    java.awt.Dimension var23 = var19.getMinimumSize();
    var8.setPreferredSize(var23);
    int var25 = var8.getMaximum();
    int var26 = var8.getValue();
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2014);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test252");


    freemind.main.Resources var2 = freemind.main.Resources.getInstance();
    java.lang.String var4 = var2.getResourceString("");
    java.lang.String var6 = var2.getText("hi!");
    freemind.common.FontProperty var7 = new freemind.common.FontProperty("/home/joao/workspace/FreeMind_integration/bin/classes/", "images/icons///SIGN:null\n", (freemind.common.TextTranslator)var2);
    java.lang.String var8 = var7.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Abyssinica SIL"+ "'", var8.equals("Abyssinica SIL"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test253");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    var0.setFile("Png");
    java.lang.String var3 = var0.getTitle();
    freemind.main.ExampleFileFilter var4 = new freemind.main.ExampleFileFilter();
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var4);
    java.awt.Component.BaselineResizeBehavior var6 = var0.getBaselineResizeBehavior();
    var0.enable(false);
    freemind.main.FreeMindApplet var9 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var10 = var9.getFocusTraversalPolicy();
    var0.setFocusTraversalPolicy(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test254");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    java.lang.String var6 = var0.getEdgeStyle();
    boolean var7 = var0.getAppliesToChildren();
    var0.setNodeFontFamily("JDayChooser");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test255");


    freemind.controller.filter.condition.AttributeCompareCondition var5 = new freemind.controller.filter.condition.AttributeCompareCondition("file:/home/joao/workspace/\n", "<a,23>", true, (-1), true);
    freemind.main.XMLElement var6 = new freemind.main.XMLElement();
    java.lang.String var7 = var6.getTagName();
    java.util.Iterator var8 = var6.enumerateAttributeNames();
    java.lang.String var9 = var6.toString();
    java.lang.Object var11 = var6.getAttribute("images/icons/hi!.png");
    var5.save(var6);
    freemind.controller.filter.condition.AttributeExistsCondition var14 = new freemind.controller.filter.condition.AttributeExistsCondition("images/icons/");
    freemind.main.XMLElement var15 = new freemind.main.XMLElement();
    java.lang.String var16 = var15.getTagName();
    java.util.Iterator var17 = var15.enumerateAttributeNames();
    java.lang.String var18 = var15.toString();
    java.lang.Object var20 = var15.getAttribute("images/icons/hi!.png");
    var14.save(var15);
    double var24 = var15.getDoubleAttribute("Png", 1.0d);
    freemind.main.XMLElement var25 = new freemind.main.XMLElement();
    java.lang.String var26 = var25.getTagName();
    java.util.Iterator var27 = var25.enumerateAttributeNames();
    java.lang.String var28 = var25.toString();
    java.lang.Object var30 = var25.getAttribute("images/icons/hi!.png");
    var15.removeChild(var25);
    var5.save(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test256");


    freemind.preferences.layout.VariableSizeCardLayout var2 = new freemind.preferences.layout.VariableSizeCardLayout(2014, 6);
    var2.setVgap(8);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test257");


    freemind.main.LogFileLogHandler var0 = new freemind.main.LogFileLogHandler();
    accessories.plugins.LogFileViewer var1 = new accessories.plugins.LogFileViewer();
    var0.setLogReceiver((freemind.main.LogFileLogHandler.LogReceiver)var1);
    var0.flush();

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test258");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    var4.setEdgeWidth((java.lang.Integer)292278994);
    java.lang.String var8 = var4.getNodeFontFamily();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test259");


    plugins.map.FreeMindMapController.PositionHolder var4 = new plugins.map.FreeMindMapController.PositionHolder(10.0d, 1.0d, 100);
    java.lang.String var5 = var4.toString();
    org.openstreetmap.gui.jmapviewer.Coordinate var6 = var4.getCoordinate();
    plugins.map.FreeMindMapController.PositionHolder var11 = new plugins.map.FreeMindMapController.PositionHolder(10.0d, 1.0d, 100);
    org.openstreetmap.gui.jmapviewer.Coordinate var12 = var11.getCoordinate();
    plugins.map.MapNodePositionHolder var13 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var14 = new freemind.main.XMLElement();
    java.lang.String var15 = var14.getTagName();
    java.util.Iterator var16 = var14.enumerateAttributeNames();
    java.util.Iterator var17 = var14.enumeratePropertyNames();
    var13.loadFrom(var14);
    freemind.main.XMLElement var19 = new freemind.main.XMLElement();
    java.lang.String var20 = var19.getTagName();
    java.util.Iterator var21 = var19.enumerateAttributeNames();
    java.util.Iterator var22 = var19.enumeratePropertyNames();
    var13.loadFrom(var19);
    org.openstreetmap.gui.jmapviewer.Coordinate var24 = var13.getPosition();
    java.lang.String var26 = plugins.map.FreeMindMapController.getLink("plugins.map.FreeMindMapController$MapQuestOpenMap", var12, var24, 200);
    java.lang.String var28 = plugins.map.FreeMindMapController.getLink("0;0;", var6, var24, 59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "PositionHolder [lat=10.0, lon=1.0, zoom=100]"+ "'", var5.equals("PositionHolder [lat=10.0, lon=1.0, zoom=100]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=200&layers=Q"+ "'", var26.equals("http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=200&layers=Q"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=59&layers=M"+ "'", var28.equals("http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=59&layers=M"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test260");


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
    int var12 = var7.getDefaultCloseOperation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test261");


    javax.swing.KeyStroke var1 = freemind.main.Tools.getKeyStroke("/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test262");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    int var4 = var2.getWidth();
    var2.list();
    freemind.controller.FreeMindToolBar var8 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var8.updateUI();
    var8.setIgnoreRepaint(false);
    javax.swing.Action var12 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var13 = var8.add(var12);
    javax.swing.JButton var14 = var2.add(var12);
    var14.setRolloverEnabled(false);
    java.awt.Dimension var17 = var14.getPreferredSize();
    accessories.plugins.time.JMonthChooser var18 = new accessories.plugins.time.JMonthChooser();
    var18.updateUI();
    java.awt.Dimension var20 = var18.preferredSize();
    var18.setEnabled(false);
    var14.removeItemListener((java.awt.event.ItemListener)var18);
    javax.swing.Action var24 = var14.getAction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test263");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    var0.setApproveButtonToolTipText("hi!");
    freemind.main.ExampleFileFilter var7 = new freemind.main.ExampleFileFilter("png", "hi!");
    var7.setExtensionListInDescription(false);
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var7);
    java.awt.Component.BaselineResizeBehavior var11 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test264");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.setFocusableWindowState(true);
    java.awt.im.InputContext var6 = var1.getInputContext();
    java.util.Locale var7 = var1.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test265");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    javax.swing.JMenuBar var4 = var0.getJMenuBar();
    boolean var5 = var0.isActive();
    javax.swing.JRootPane var6 = var0.getRootPane();
    javax.swing.TransferHandler var7 = var0.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test266");


    java.lang.String var1 = freemind.main.Tools.BooleanToXml(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test267");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    var0.switchMeOff();
    var0.processUnfinishedLinks();
    freemind.modes.mindmapmode.actions.xml.ActionPair var3 = var0.getEmptyActionPair();
    var0.shutdown();
    freemind.controller.filter.condition.AttributeNotExistsCondition var6 = new freemind.controller.filter.condition.AttributeNotExistsCondition("hi!");
    javax.swing.JComponent var7 = var6.getListCellRendererComponent();
    freemind.main.XMLElement var8 = new freemind.main.XMLElement();
    java.lang.String var9 = var8.getTagName();
    int var10 = var8.getLineNr();
    int var12 = var8.getIntAttribute("ToolBarUI");
    var6.saveAttributes(var8);
    var0.loadFrom(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.parseString("Abyssinica SIL", 1);
      fail("Expected exception of type freemind.main.XMLParseException");
    } catch (freemind.main.XMLParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test268");


    accessories.plugins.JumpLastEditLocation var0 = new accessories.plugins.JumpLastEditLocation();
    var0.startupMapHook();
    freemind.modes.mindmapmode.MindMapController var2 = var0.getMindMapController();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test269");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setDialogTitle("");
    var0.doLayout();
    freemind.modes.FreeMindJFileDialog var4 = new freemind.modes.FreeMindJFileDialog();
    var4.setApproveButtonText("IntHolder(0)");
    var4.setApproveButtonToolTipText("hi!");
    freemind.main.ExampleFileFilter var11 = new freemind.main.ExampleFileFilter("png", "hi!");
    var11.setExtensionListInDescription(false);
    var4.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var11);
    javax.swing.filechooser.FileFilter var15 = var4.getFileFilter();
    var0.addChoosableFileFilterAsDefault(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test270");


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
    var0.disable();
    freemind.main.Resources.createInstance((freemind.main.FreeMindMain)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test271");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    var0.setVerifyInputWhenFocusTarget(true);
    java.awt.event.HierarchyBoundsListener[] var3 = var0.getHierarchyBoundsListeners();
    javax.swing.border.Border var4 = var0.getBorder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test272");


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
    accessories.plugins.time.JMonthChooser var18 = new accessories.plugins.time.JMonthChooser();
    javax.swing.event.AncestorListener[] var19 = var18.getAncestorListeners();
    java.awt.Component var20 = var18.getComboBox();
    boolean var21 = var17.isAncestorOf(var20);
    boolean var22 = var20.isEnabled();
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test273");


    plugins.map.TileImage var0 = new plugins.map.TileImage();
    java.lang.String var1 = var0.save();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test274");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    java.lang.String var1 = var0.getTagName();
    int var2 = var0.getLineNr();
    freemind.common.XmlBindingTools var3 = freemind.common.XmlBindingTools.getInstance();
    freemind.common.FreeMindProgressMonitor var6 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var6.dispose();
    java.util.Vector var9 = freemind.main.Tools.urlStringToUrls("hi!");
    var6.setIconImages((java.util.List)var9);
    java.util.Locale var11 = var6.getLocale();
    freemind.modes.StylePattern var12 = new freemind.modes.StylePattern();
    var12.setEdgeStyle("hi!");
    freemind.modes.StylePattern var15 = var12.getChildrenStylePattern();
    freemind.modes.StylePattern var16 = new freemind.modes.StylePattern();
    var12.setChildrenStylePattern(var16);
    accessories.plugins.time.JTripleCalendar var18 = new accessories.plugins.time.JTripleCalendar();
    boolean var19 = var18.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var20 = var18.getDayChooser();
    java.awt.Color var21 = var20.getSundayForeground();
    var16.setNodeBackgroundColor(var21);
    var6.setBackground(var21);
    java.awt.Container var24 = var6.getFocusCycleRootAncestor();
    freemind.controller.actions.generated.instance.WindowConfigurationStorage var25 = var3.decorateDialog("/home/joao/workspace/FreeMind_integration/bin/classes/", (javax.swing.JDialog)var6);
    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var27 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var28 = var27.createReader();
    boolean var29 = var28.ready();
    long var31 = var28.skip(100L);
    freemind.controller.actions.generated.instance.XmlAction var32 = var3.unMarshall(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parseFromReader(var28);
      fail("Expected exception of type freemind.main.XMLParseException");
    } catch (freemind.main.XMLParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 9L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test275");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.controller.MenuBar var2 = var0.getFreeMindMenuBar();
    accessories.plugins.time.JTripleCalendar var3 = new accessories.plugins.time.JTripleCalendar();
    boolean var4 = var3.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var5 = var3.getDayChooser();
    var0.remove((java.awt.Component)var5);
    java.util.Locale var7 = var5.getLocale();
    java.awt.Point var9 = var5.getMousePosition(true);
    int var10 = var5.getMaxDayCharacters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test276");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JFrame var1 = var0.getJFrame();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test277");


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
    accessories.plugins.time.JCalendar var42 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var43 = var42.getCalendar();
    var4.setCalendar(var43);
    java.awt.Graphics var45 = var4.getGraphics();
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test278");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isMultiSelectionEnabled();
    var0.layout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test279");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    int var4 = var2.getWidth();
    var2.list();
    freemind.controller.FreeMindToolBar var8 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var8.updateUI();
    var8.setIgnoreRepaint(false);
    javax.swing.Action var12 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var13 = var8.add(var12);
    javax.swing.JButton var14 = var2.add(var12);
    var14.setIconTextGap(10);
    var14.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test280");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    var0.requestFocus();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    var0.setCalendar(var3);
    accessories.plugins.time.JYearChooser var5 = var0.getYearChooser();
    java.awt.Color var6 = var0.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test281");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.controller.MenuBar var2 = var0.getFreeMindMenuBar();
    accessories.plugins.time.JTripleCalendar var3 = new accessories.plugins.time.JTripleCalendar();
    boolean var4 = var3.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var5 = var3.getDayChooser();
    var0.remove((java.awt.Component)var5);
    java.awt.Image var9 = var5.createImage(30, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test282");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    java.lang.String var2 = var1.getTagName();
    java.util.Iterator var3 = var1.enumerateAttributeNames();
    java.util.Iterator var4 = var1.enumeratePropertyNames();
    var0.loadFrom(var1);
    java.lang.String[] var6 = var0.getBarePosition();
    freemind.main.XMLElement var8 = new freemind.main.XMLElement(true);
    freemind.common.PasswordProperty var12 = new freemind.common.PasswordProperty("images/icons/", "");
    var8.setAttribute("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", (java.lang.Object)var12);
    int var14 = var8.countChildren();
    var0.loadFrom(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test283");


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
    var8.setDoubleBuffered(false);
    
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

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test284");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var2 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var3 = var2.getName();
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Iterator var5 = var0.iterator();
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var7.revalidate();
    boolean var9 = var7.isUndecorated();
    var7.validate();
    javax.accessibility.AccessibleContext var11 = var7.getAccessibleContext();
    java.beans.PropertyChangeListener[] var12 = var7.getPropertyChangeListeners();
    var0.addAll((java.lang.Object[])var12);
    freemind.common.FreeMindProgressMonitor var15 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var16 = var15.getInputMethodListeners();
    var15.show();
    java.lang.String var18 = var15.getTitle();
    javax.swing.Action var19 = javax.swing.TransferHandler.getCutAction();
    freemind.main.Tools.addKeyActionToDialog((javax.swing.JDialog)var15, var19, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>", "Arrow_ID_515901044");
    java.awt.Toolkit var23 = var15.getToolkit();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove((java.lang.Object)var23);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var18.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test285");


    freemind.preferences.layout.KeyEventTranslator.Key var3 = new freemind.preferences.layout.KeyEventTranslator.Key("ToolBarUI", 0, '#');
    accessories.plugins.time.JTripleCalendar var4 = new accessories.plugins.time.JTripleCalendar();
    boolean var5 = var4.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var6 = var4.getDayChooser();
    java.awt.Color var7 = var6.getSundayForeground();
    var6.setFocus();
    int var9 = var6.getMaxDayCharacters();
    var6.setMonth(20);
    boolean var12 = var3.equals((java.lang.Object)var6);
    freemind.preferences.layout.KeyEventTranslator.Key var16 = new freemind.preferences.layout.KeyEventTranslator.Key("", 10, '#');
    java.lang.String var17 = var16.toString();
    freemind.preferences.layout.KeyEventTranslator.addTranslation(var3, var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "<a,23>"+ "'", var17.equals("<a,23>"));

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test286");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.awt.Color var1 = var0.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    java.util.Date var4 = var2.getMaxSelectableDate();
    var0.setDate(var4);
    accessories.plugins.time.JDayChooser var6 = var0.getDayChooser();
    accessories.plugins.time.JCalendar var7 = new accessories.plugins.time.JCalendar();
    java.awt.Color var8 = var7.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var9 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var10 = var9.getCalendar();
    java.util.Date var11 = var9.getMaxSelectableDate();
    var7.setDate(var11);
    var0.setMinSelectableDate(var11);
    boolean var14 = var0.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test287");


    freemind.main.XMLElement var1 = new freemind.main.XMLElement(true);
    freemind.common.PasswordProperty var5 = new freemind.common.PasswordProperty("images/icons/", "");
    var1.setAttribute("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", (java.lang.Object)var5);
    java.lang.String var8 = var1.getStringAttribute("Arrow_ID_515901044");
    int var11 = var1.getIntAttribute("plugins.map.FreeMindMapController$MapQuestOpenMap", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test288");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var2.isDecorationBordersVisible();
    freemind.common.StringProperty var6 = new freemind.common.StringProperty("file:/home/joao/workspace/\n", "ToolBarUI");
    accessories.plugins.time.JTripleCalendar var7 = new accessories.plugins.time.JTripleCalendar();
    var7.revalidate();
    var6.addPropertyChangeListener((java.beans.PropertyChangeListener)var7);
    var7.hide();
    accessories.plugins.time.JTripleCalendar var11 = new accessories.plugins.time.JTripleCalendar();
    var11.requestFocus();
    accessories.plugins.time.JCalendar var13 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var14 = var13.getCalendar();
    var11.setCalendar(var14);
    var7.propagateDate(var14);
    var2.setCalendar(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test289");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.dispose();
    java.util.Vector var4 = freemind.main.Tools.urlStringToUrls("hi!");
    var1.setIconImages((java.util.List)var4);
    java.util.Locale var6 = var1.getLocale();
    java.awt.image.VolatileImage var9 = var1.createVolatileImage(2014, 100);
    accessories.plugins.util.window.WindowClosingAdapter var10 = new accessories.plugins.util.window.WindowClosingAdapter();
    var1.addWindowFocusListener((java.awt.event.WindowFocusListener)var10);
    java.awt.image.ColorModel var12 = var1.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test290");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isMultiSelectionEnabled();
    var0.setAlwaysOnTop(true);
    java.io.FilenameFilter var5 = var0.getFilenameFilter();
    freemind.modes.FreeMindAwtFileDialog var6 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var7 = var6.isDoubleBuffered();
    freemind.main.ExampleFileFilter var8 = new freemind.main.ExampleFileFilter();
    var8.setExtensionListInDescription(false);
    var6.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var8);
    var0.addChoosableFileFilterAsDefault((javax.swing.filechooser.FileFilter)var8);
    boolean var13 = var8.isExtensionListInDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test291");


    freemind.preferences.layout.VariableSizeCardLayout var0 = new freemind.preferences.layout.VariableSizeCardLayout();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "freemind.preferences.layout.VariableSizeCardLayout[hgap=0,vgap=0]"+ "'", var1.equals("freemind.preferences.layout.VariableSizeCardLayout[hgap=0,vgap=0]"));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test292");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    boolean var2 = var0.isValid();
    java.awt.event.MouseListener[] var3 = var0.getMouseListeners();
    var0.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test293");


    freemind.common.ThreeCheckBoxProperty var2 = new freemind.common.ThreeCheckBoxProperty("ButtonUI", "Png");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setValue("icon_hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test294");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    var0.switchMeOff();
    var0.processUnfinishedLinks();
    var0.onUpdateNodeHook();
    java.lang.Integer var4 = var0.getRole();
    int var5 = var0.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test295");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.main.Resources.createInstance((freemind.main.FreeMindMain)var0);
    freemind.preferences.layout.VariableSizeCardLayout var5 = new freemind.preferences.layout.VariableSizeCardLayout(10, 0);
    var5.setHgap((-2147483648));
    accessories.plugins.time.JYearChooser var8 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var9 = var8.getMouseListeners();
    freemind.view.mindmapview.MindMapLayout var10 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var13 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var13.requestFocus();
    javax.swing.InputVerifier var15 = var13.getInputVerifier();
    var10.removeLayoutComponent((java.awt.Component)var13);
    accessories.plugins.time.JYearChooser var17 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var18 = var17.getMouseListeners();
    var10.removeLayoutComponent((java.awt.Component)var17);
    var8.setLayout((java.awt.LayoutManager)var10);
    freemind.controller.FreeMindToolBar var23 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var23.updateUI();
    var23.setIgnoreRepaint(false);
    java.awt.Dimension var27 = var23.getSize();
    var8.setMinimumSize(var27);
    freemind.view.mindmapview.MapView.ScrollPane var29 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var30 = var29.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var31 = new accessories.plugins.time.JTripleCalendar();
    boolean var32 = var31.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var33 = var31.getDayChooser();
    java.awt.Color var34 = var33.getSundayForeground();
    var29.setColumnHeaderView((java.awt.Component)var33);
    java.util.Locale var36 = var33.getLocale();
    java.awt.Graphics var37 = var33.getGraphics();
    var8.setDayChooser(var33);
    var33.addListeners(10);
    var5.removeLayoutComponent((java.awt.Component)var33);
    var0.setLayout((java.awt.LayoutManager)var5);
    var0.repaint(100L, 8, 292278994, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test296");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    int var2 = var0.getSize();
    int var3 = var0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test297");


    freemind.modes.HistoryInformation var0 = new freemind.modes.HistoryInformation();
    java.util.Date var1 = var0.getLastModifiedAt();
    java.util.Date var2 = var0.getCreatedAt();
    java.util.Date var3 = var0.getLastModifiedAt();
    accessories.plugins.time.JCalendar var4 = new accessories.plugins.time.JCalendar();
    java.awt.Color var5 = var4.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var6 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var7 = var6.getCalendar();
    java.util.Date var8 = var6.getMaxSelectableDate();
    var4.setDate(var8);
    var4.setWeekOfYearVisible(true);
    java.util.Date var12 = var4.getMaxSelectableDate();
    var0.setCreatedAt(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test298");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.JViewport var7 = var0.getColumnHeader();
    javax.swing.JScrollBar var8 = var0.createHorizontalScrollBar();
    javax.swing.JViewport var9 = var0.getViewport();
    
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
    assertNotNull(var9);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test299");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    var0.switchMeOff();
    java.lang.String var2 = var0.getUsers();
    var0.clearLock();
    java.lang.String var4 = var0.getUsers();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var0.getLockId();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "joao@BetelgeuseLX"+ "'", var2.equals("joao@BetelgeuseLX"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "joao@BetelgeuseLX"+ "'", var4.equals("joao@BetelgeuseLX"));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test300");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    boolean var2 = var0.isValid();
    accessories.plugins.time.JDayChooser var4 = new accessories.plugins.time.JDayChooser(false);
    var0.addFocusListener((java.awt.event.FocusListener)var4);
    var0.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test301");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var2 = var0.getTermsOfUseText();
    var0.setAttributionLinkURL("icon_hi!");
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "OSM MapQuest.Open Map"+ "'", var5.equals("OSM MapQuest.Open Map"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test302");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    var0.repaint(100L, 1, (-1), 100, 1);
    int var8 = var0.getStartYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test303");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isMultiSelectionEnabled();
    var0.setLocationByPlatform(false);
    freemind.main.ExampleFileFilter var5 = new freemind.main.ExampleFileFilter();
    var5.setExtensionListInDescription(false);
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var5);
    boolean var9 = var0.isMultiSelectionEnabled();
    boolean var10 = var0.getFocusableWindowState();
    float var11 = var0.getAlignmentX();
    var0.transferFocusBackward();
    var0.setDialogTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.5f);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test304");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    freemind.controller.actions.generated.instance.CollaborationUserInformation var1 = var0.getMasterInformation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test305");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    var4.deregister();
    var4.deregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test306");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    java.util.Locale var1 = var0.getLocale();
    java.awt.Component.BaselineResizeBehavior var2 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test307");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.lang.String var4 = var1.getTitle();
    javax.swing.Action var5 = javax.swing.TransferHandler.getCutAction();
    freemind.main.Tools.addKeyActionToDialog((javax.swing.JDialog)var1, var5, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>", "Arrow_ID_515901044");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setUndecorated(false);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var4.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test308");


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
    boolean var33 = var32.requestFocusInWindow();
    boolean var34 = var32.isFontSet();
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test309");


    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var1 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("http://openstreetmap.org/");

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test310");


    freemind.view.mindmapview.attributeview.AttributeTableCellRenderer var0 = new freemind.view.mindmapview.attributeview.AttributeTableCellRenderer();
    var0.setDisplayedMnemonic(8);
    javax.swing.ImageIcon var3 = freemind.modes.common.plugins.MapNodePositionHolderBase.getMapLocationIcon();
    java.awt.image.ImageObserver var4 = var3.getImageObserver();
    var0.setDisabledIcon((javax.swing.Icon)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test311");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    boolean var3 = var1.isUndecorated();
    var1.validate();
    javax.accessibility.AccessibleContext var5 = var1.getAccessibleContext();
    java.beans.PropertyChangeListener[] var6 = var1.getPropertyChangeListeners();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var8 = var7.getUI();
    java.awt.Dimension var9 = var7.minimumSize();
    var1.setSize(var9);
    freemind.view.mindmapview.MapView.ScrollPane var11 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var12 = var11.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var13 = new accessories.plugins.time.JTripleCalendar();
    boolean var14 = var13.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var15 = var13.getDayChooser();
    java.awt.Color var16 = var15.getSundayForeground();
    var11.setColumnHeaderView((java.awt.Component)var15);
    int var18 = var11.getVerticalScrollBarPolicy();
    javax.swing.plaf.ScrollPaneUI var19 = var11.getUI();
    accessories.plugins.time.JTripleCalendar var20 = new accessories.plugins.time.JTripleCalendar();
    var20.revalidate();
    boolean var22 = var20.isDisplayable();
    freemind.common.FreeMindProgressMonitor var24 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var24.dispose();
    java.awt.event.ContainerListener[] var26 = var24.getContainerListeners();
    java.awt.Rectangle var27 = var24.getBounds();
    var20.repaint(var27);
    java.awt.Rectangle var29 = var11.getBounds(var27);
    var1.setBounds(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test312");


    byte[] var1 = freemind.main.Tools.fromBase64("");
    java.lang.String var2 = freemind.main.Base64Coding.encode64(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test313");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.show();
    accessories.plugins.util.window.WindowClosingAdapter var5 = new accessories.plugins.util.window.WindowClosingAdapter();
    var1.removeWindowStateListener((java.awt.event.WindowStateListener)var5);
    accessories.plugins.time.JTripleCalendar var8 = new accessories.plugins.time.JTripleCalendar();
    var1.addPropertyChangeListener("<a,23>", (java.beans.PropertyChangeListener)var8);
    java.awt.Window[] var10 = var1.getOwnedWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test314");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    var0.enableInputMethods(true);
    freemind.view.mindmapview.MapView.ScrollPane var9 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var10 = var9.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var11 = new accessories.plugins.time.JTripleCalendar();
    boolean var12 = var11.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var13 = var11.getDayChooser();
    java.awt.Color var14 = var13.getSundayForeground();
    var9.setColumnHeaderView((java.awt.Component)var13);
    javax.swing.JViewport var16 = var9.getColumnHeader();
    var0.setColumnHeader(var16);
    boolean var18 = var16.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test315");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    boolean var7 = var0.isPaintingTile();
    javax.swing.JScrollBar var8 = var0.getVerticalScrollBar();
    javax.swing.border.Border var9 = var0.getBorder();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test316");


    accessories.plugins.time.JSpinField var0 = new accessories.plugins.time.JSpinField();
    java.awt.Component var1 = var0.getSpinner();
    boolean var2 = var0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test317");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.setFocusTraversalPolicyProvider(false);
    var1.setModal(false);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test318");


    plugins.map.FreeMindMapController.PositionHolder var3 = new plugins.map.FreeMindMapController.PositionHolder(1.0d, Double.NaN, 7);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test319");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isMultiSelectionEnabled();
    var0.setAlwaysOnTop(true);
    java.awt.Point var5 = var0.location();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test320");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    javax.swing.JRootPane var3 = var0.getRootPane();
    accessories.plugins.time.JDayChooser var4 = var0.getDayChooser();
    java.util.Locale var5 = var0.getLocale();
    javax.swing.JComponent.setDefaultLocale(var5);
    javax.swing.JComponent.setDefaultLocale(var5);
    
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

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test321");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.setIgnoreRepaint(false);
    javax.swing.Action var6 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var7 = var2.add(var6);
    var7.paintImmediately(292278994, (-1), 1, 30);
    javax.swing.Icon var13 = var7.getPressedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test322");


    freemind.modes.mindmapmode.MindMapMode var0 = new freemind.modes.mindmapmode.MindMapMode();
    freemind.controller.Controller var1 = var0.getController();
    var0.activate();
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "MindMap"+ "'", var3.equals("MindMap"));

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test323");


    java.lang.String var1 = accessories.plugins.time.TimeList.getPureRegularExpression("joao@BetelgeuseLX");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "joao@BetelgeuseLX"+ "'", var1.equals("joao@BetelgeuseLX"));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test324");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    java.awt.Dimension var2 = var0.preferredSize();
    boolean var3 = var0.isMinimumSizeSet();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.dispose();
    java.util.Vector var8 = freemind.main.Tools.urlStringToUrls("hi!");
    var5.setIconImages((java.util.List)var8);
    java.util.Locale var10 = var5.getLocale();
    javax.swing.JComponent.setDefaultLocale(var10);
    var0.setLocale(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test325");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    int var7 = var0.getVerticalScrollBarPolicy();
    java.awt.Container var8 = var0.getFocusCycleRootAncestor();
    freemind.view.mindmapview.MapView.ScrollPane var9 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var10 = var9.getAccessibleContext();
    int var11 = var9.getHorizontalScrollBarPolicy();
    freemind.view.mindmapview.MapView.ScrollPane var12 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var13 = var12.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var14 = new accessories.plugins.time.JTripleCalendar();
    boolean var15 = var14.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var16 = var14.getDayChooser();
    java.awt.Color var17 = var16.getSundayForeground();
    var12.setColumnHeaderView((java.awt.Component)var16);
    var12.enableInputMethods(true);
    freemind.view.mindmapview.MapView.ScrollPane var21 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var22 = var21.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var23 = new accessories.plugins.time.JTripleCalendar();
    boolean var24 = var23.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var25 = var23.getDayChooser();
    java.awt.Color var26 = var25.getSundayForeground();
    var21.setColumnHeaderView((java.awt.Component)var25);
    javax.swing.JViewport var28 = var21.getColumnHeader();
    var12.setColumnHeader(var28);
    var9.setRowHeader(var28);
    var0.setViewport(var28);
    float var32 = var28.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertTrue(var32 == 0.5f);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test326");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var2 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var3 = var2.getName();
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Iterator var5 = var0.iterator();
    var0.clear();
    java.lang.String[] var10 = new java.lang.String[] { "file:/home/joao/workspace/\n"};
    freemind.main.ExampleFileFilter var11 = new freemind.main.ExampleFileFilter(var10);
    java.lang.String var12 = freemind.main.Tools.arrayToUrls(var10);
    freemind.main.Resources var13 = freemind.main.Resources.getInstance();
    java.net.URL var15 = var13.getResource("file:/home/joao/workspace/\n");
    java.lang.String var17 = var13.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var19 = var13.createTranslatedString("");
    freemind.common.ComboProperty var20 = new freemind.common.ComboProperty("/home/joao/workspace/FreeMind_integration/bin/classes/", "ButtonUI", var10, (freemind.common.TextTranslator)var13);
    var0.addAll((java.lang.Object[])var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "file:/home/joao/workspace/file:/home/joao/workspace/%0A\n"+ "'", var12.equals("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test327");


    accessories.plugins.util.xslt.XmlExporter var0 = new accessories.plugins.util.xslt.XmlExporter();
    plugins.map.TileImage var1 = new plugins.map.TileImage();
    freemind.modes.FreeMindJFileDialog var2 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var3 = var2.getUI();
    java.io.File[] var4 = var2.getSelectedFiles();
    java.lang.String var5 = var2.getApproveButtonToolTipText();
    var2.setDialogTitle("127.0.1.1");
    java.io.File var8 = var2.getCurrentDirectory();
    freemind.main.Tools.setHidden(var8, false, true);
    var1.load(var8);
    freemind.modes.FreeMindJFileDialog var13 = new freemind.modes.FreeMindJFileDialog();
    var13.setApproveButtonText("IntHolder(0)");
    var13.setApproveButtonToolTipText("hi!");
    freemind.main.ExampleFileFilter var20 = new freemind.main.ExampleFileFilter("png", "hi!");
    var20.setExtensionListInDescription(false);
    var13.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var20);
    javax.swing.filechooser.FileFilter var24 = var13.getFileFilter();
    freemind.modes.FreeMindAwtFileDialog var25 = new freemind.modes.FreeMindAwtFileDialog();
    var25.setFile("Png");
    java.lang.String var28 = var25.getTitle();
    freemind.main.ExampleFileFilter var29 = new freemind.main.ExampleFileFilter();
    var25.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var29);
    var29.setDescription("PositionHolder [lat=10.0, lon=1.0, zoom=100]");
    freemind.modes.FreeMindJFileDialog var33 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var34 = var33.getUI();
    java.io.File[] var35 = var33.getSelectedFiles();
    java.lang.String var36 = var33.getApproveButtonToolTipText();
    var33.setDialogTitle("127.0.1.1");
    java.io.File var39 = var33.getCurrentDirectory();
    boolean var40 = var29.accept(var39);
    java.lang.String var41 = var13.getDescription(var39);
    freemind.modes.FreeMindJFileDialog var42 = new freemind.modes.FreeMindJFileDialog();
    var42.setApproveButtonText("IntHolder(0)");
    var42.setApproveButtonToolTipText("hi!");
    freemind.main.ExampleFileFilter var49 = new freemind.main.ExampleFileFilter("png", "hi!");
    var49.setExtensionListInDescription(false);
    var42.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var49);
    javax.swing.filechooser.FileFilter var53 = var42.getFileFilter();
    freemind.modes.FreeMindAwtFileDialog var54 = new freemind.modes.FreeMindAwtFileDialog();
    var54.setFile("Png");
    java.lang.String var57 = var54.getTitle();
    freemind.main.ExampleFileFilter var58 = new freemind.main.ExampleFileFilter();
    var54.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var58);
    var58.setDescription("PositionHolder [lat=10.0, lon=1.0, zoom=100]");
    freemind.modes.FreeMindJFileDialog var62 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var63 = var62.getUI();
    java.io.File[] var64 = var62.getSelectedFiles();
    java.lang.String var65 = var62.getApproveButtonToolTipText();
    var62.setDialogTitle("127.0.1.1");
    java.io.File var68 = var62.getCurrentDirectory();
    boolean var69 = var58.accept(var68);
    java.lang.String var70 = var42.getDescription(var68);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.transForm(var8, var39, var68);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "joao"+ "'", var41.equals("joao"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "joao"+ "'", var70.equals("joao"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test328");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.awt.Color var1 = var0.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    java.util.Date var4 = var2.getMaxSelectableDate();
    var0.setDate(var4);
    var0.setWeekOfYearVisible(true);
    java.awt.Color var8 = var0.getDecorationBackgroundColor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test329");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    boolean var6 = var2.isApplet();
    accessories.plugins.time.JMonthChooser var7 = new accessories.plugins.time.JMonthChooser();
    var7.updateUI();
    boolean var9 = var7.isValid();
    accessories.plugins.time.JDayChooser var11 = new accessories.plugins.time.JDayChooser(false);
    var7.addFocusListener((java.awt.event.FocusListener)var11);
    var2.setContentPane((java.awt.Container)var7);
    var2.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test330");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    var0.repaint(100L, 1, (-1), 100, 1);
    java.awt.Component var8 = var0.getNextFocusableComponent();
    java.awt.FocusTraversalPolicy var9 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var10 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var11 = var10.getFocusTraversalPolicy();
    var10.destroy();
    freemind.controller.Controller var13 = new freemind.controller.Controller((freemind.main.FreeMindMain)var10);
    java.net.URL var15 = var13.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var16 = new freemind.controller.MapMouseWheelListener(var13);
    java.net.URL var18 = var13.getResource("control");
    freemind.controller.MapMouseMotionListener var19 = new freemind.controller.MapMouseMotionListener(var13);
    var0.addMouseListener((java.awt.event.MouseListener)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test331");


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
    accessories.plugins.time.JMonthChooser var34 = new accessories.plugins.time.JMonthChooser();
    var34.updateUI();
    var8.removeItemListener((java.awt.event.ItemListener)var34);
    javax.swing.InputMap var37 = var8.getInputMap();
    
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
    assertNotNull(var37);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test332");


    freemind.view.mindmapview.RightNodeViewLayout var0 = new freemind.view.mindmapview.RightNodeViewLayout();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.awt.Color var3 = var2.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var4 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var5 = var4.getCalendar();
    java.util.Date var6 = var4.getMaxSelectableDate();
    var2.setDate(var6);
    var2.setWeekOfYearVisible(true);
    java.util.Date var10 = var2.getMaxSelectableDate();
    java.util.Date var11 = var2.getMinSelectableDate();
    var0.addLayoutComponent("Arrow_ID_515901044", (java.awt.Component)var2);
    boolean var13 = var2.getInheritsPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test333");


    java.lang.String var1 = freemind.main.Tools.removeTranslateComment("PositionHolder [lat=10.0, lon=1.0, zoom=100]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "PositionHolder [lat=10.0, lon=1.0, zoom=100]"+ "'", var1.equals("PositionHolder [lat=10.0, lon=1.0, zoom=100]"));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test334");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    boolean var3 = var0.getAppliesToEdge();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test335");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    var4.setDay(2014);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test336");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    java.net.URL var5 = var3.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var6 = new freemind.controller.MapMouseWheelListener(var3);
    java.net.URL var8 = var3.getResource("control");
    freemind.controller.MapMouseMotionListener var9 = new freemind.controller.MapMouseMotionListener(var3);
    plugins.collaboration.database.DatabaseConnectionHook var10 = new plugins.collaboration.database.DatabaseConnectionHook();
    var3.registerMapTitleContributor((freemind.controller.MapModuleManager.MapTitleContributor)var10);
    accessories.plugins.time.JCalendar var12 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var13 = var12.getCalendar();
    java.util.Date var14 = var12.getMaxSelectableDate();
    java.lang.String var15 = var12.getToolTipText();
    var12.setOpaque(false);
    accessories.plugins.time.JTripleCalendar var18 = new accessories.plugins.time.JTripleCalendar();
    boolean var19 = var18.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var20 = var18.getDayChooser();
    boolean var21 = var20.isDecorationBordersVisible();
    java.util.GregorianCalendar var22 = var20.getTemporaryCalendar();
    var12.setCalendar((java.util.Calendar)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.errorMessage((java.lang.Object)var12);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test337");


    freemind.common.DontShowNotificationProperty var2 = new freemind.common.DontShowNotificationProperty("file:/home/joao/workspace/\n", "OSM MapQuest.Open Map");
    java.lang.String var3 = var2.getLabel();
    var2.setEnabled(false);
    var2.setEnabled(true);
    java.lang.String var8 = var2.getDescription();
    java.lang.String var9 = var2.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var8.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var9.equals("file:/home/joao/workspace/\n"));

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test338");


    java.lang.String var1 = freemind.main.Tools.getPrefix("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test339");


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
    int var60 = var4.getDaysInMonth();
    
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
    assertTrue(var60 == 31);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test340");


    freemind.main.XMLElement var1 = new freemind.main.XMLElement(true);
    freemind.common.PasswordProperty var5 = new freemind.common.PasswordProperty("images/icons/", "");
    var1.setAttribute("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", (java.lang.Object)var5);
    int var7 = var1.countChildren();
    var1.setEncodedContent("images/icons/JDayChooser.png");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test341");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    boolean var4 = var0.getAppliesToNodeIcon();
    freemind.view.mindmapview.MapView.ScrollPane var5 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var6 = var5.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var7 = new accessories.plugins.time.JTripleCalendar();
    boolean var8 = var7.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var9 = var7.getDayChooser();
    java.awt.Color var10 = var9.getSundayForeground();
    var5.setColumnHeaderView((java.awt.Component)var9);
    java.util.Locale var12 = var9.getLocale();
    java.awt.Graphics var13 = var9.getGraphics();
    java.awt.Color var14 = var9.getWeekdayForeground();
    var0.setEdgeColor(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test342");


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
    freemind.controller.FreeMindToolBar var14 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var14.updateUI();
    var14.setIgnoreRepaint(false);
    accessories.plugins.time.JTripleCalendar var18 = new accessories.plugins.time.JTripleCalendar();
    boolean var19 = var18.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var20 = var18.getDayChooser();
    javax.swing.JRootPane var21 = var18.getRootPane();
    accessories.plugins.time.JDayChooser var22 = var18.getDayChooser();
    java.awt.event.HierarchyListener[] var23 = var18.getHierarchyListeners();
    accessories.plugins.time.JTripleCalendar var24 = new accessories.plugins.time.JTripleCalendar();
    var24.revalidate();
    boolean var26 = var24.isDisplayable();
    freemind.common.FreeMindProgressMonitor var28 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var28.dispose();
    java.awt.event.ContainerListener[] var30 = var28.getContainerListeners();
    java.awt.Rectangle var31 = var28.getBounds();
    var24.repaint(var31);
    var18.paintImmediately(var31);
    var14.computeVisibleRect(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setShape((java.awt.Shape)var31);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test343");


    java.lang.String[] var3 = new java.lang.String[] { "file:/home/joao/workspace/\n"};
    freemind.main.ExampleFileFilter var4 = new freemind.main.ExampleFileFilter(var3);
    java.lang.String var5 = freemind.main.Tools.arrayToUrls(var3);
    freemind.main.Resources var6 = freemind.main.Resources.getInstance();
    java.net.URL var8 = var6.getResource("file:/home/joao/workspace/\n");
    java.lang.String var10 = var6.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var12 = var6.createTranslatedString("");
    freemind.common.ComboProperty var13 = new freemind.common.ComboProperty("/home/joao/workspace/FreeMind_integration/bin/classes/", "ButtonUI", var3, (freemind.common.TextTranslator)var6);
    freemind.common.FreeMindProgressMonitor var15 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var15.revalidate();
    var15.addNotify();
    var15.hide();
    java.awt.Container var19 = var15.getFocusCycleRootAncestor();
    java.util.List var20 = var15.getIconImages();
    plugins.map.MapNodePositionHolder var21 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var22 = new freemind.main.XMLElement();
    java.lang.String var23 = var22.getTagName();
    java.util.Iterator var24 = var22.enumerateAttributeNames();
    java.util.Iterator var25 = var22.enumeratePropertyNames();
    var21.loadFrom(var22);
    freemind.main.XMLElement var27 = new freemind.main.XMLElement();
    java.lang.String var28 = var27.getTagName();
    java.util.Iterator var29 = var27.enumerateAttributeNames();
    java.util.Iterator var30 = var27.enumeratePropertyNames();
    var21.loadFrom(var27);
    java.lang.String[] var32 = var21.getBarePosition();
    int var33 = var21.getZoom();
    java.util.Vector var34 = freemind.main.Tools.getVectorWithSingleElement((java.lang.Object)var33);
    var13.updateComboBoxEntries(var20, (java.util.List)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "file:/home/joao/workspace/file:/home/joao/workspace/%0A\n"+ "'", var5.equals("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test344");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.setStartYear(10);
    int var4 = var0.getMaximum();
    var0.validate();
    java.awt.Component var6 = var0.getSpinner();
    int var7 = var6.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test345");


    freemind.view.mindmapview.attributeview.AttributeTableCellRenderer var0 = new freemind.view.mindmapview.attributeview.AttributeTableCellRenderer();
    var0.setDisplayedMnemonic('4');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDisplayedMnemonicIndex(2014);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test346");


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
    boolean var33 = var32.requestFocusInWindow();
    accessories.plugins.time.JMonthChooser var34 = var32.getMonthChooser();
    accessories.plugins.time.JTripleCalendar var35 = new accessories.plugins.time.JTripleCalendar();
    boolean var36 = var35.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var37 = var35.getDayChooser();
    java.awt.Color var38 = var37.getSundayForeground();
    var37.setFocus();
    int var40 = var37.getMaxDayCharacters();
    boolean var41 = var37.isDecorationBordersVisible();
    java.beans.PropertyChangeListener[] var42 = var37.getPropertyChangeListeners();
    var34.setDayChooser(var37);
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test347");


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
    var0.setIntAttribute("joao", 8);
    
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

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test348");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var1 = var0.getUI();
    java.lang.String var2 = var0.getApproveButtonToolTipText();
    java.awt.event.ActionListener[] var3 = var0.getActionListeners();
    javax.swing.filechooser.FileSystemView var4 = var0.getFileSystemView();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test349");


    freemind.main.XMLElement var1 = new freemind.main.XMLElement(true);
    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var3 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var4 = var3.createReader();
    int var5 = var4.read();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.parseFromReader(var4, 6);
      fail("Expected exception of type freemind.main.XMLParseException");
    } catch (freemind.main.XMLParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 84);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test350");


    freemind.controller.StructuredMenuItemHolder var0 = new freemind.controller.StructuredMenuItemHolder();
    javax.swing.JMenuItem var1 = var0.getMenuItem();
    javax.swing.Action var2 = javax.swing.TransferHandler.getCutAction();
    var0.setAction(var2);
    freemind.controller.MenuItemSelectedListener var4 = var0.getSelectionListener();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test351");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.setFocusableWindowState(true);
    java.util.Locale var6 = var1.getLocale();
    var1.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test352");


    plugins.script.ScriptEditor var0 = new plugins.script.ScriptEditor();
    freemind.modes.attributes.ColumnWidthChangeEvent var2 = new freemind.modes.attributes.ColumnWidthChangeEvent((java.lang.Object)var0, 7);
    java.lang.Object var3 = var2.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test353");


    boolean var1 = freemind.main.Tools.isAbsolutePath("eNoDAAAAAAE=");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test354");


    freemind.common.NumberProperty var5 = new freemind.common.NumberProperty("open map", "/home/joao/workspace/FreeMind_integration/bin/classes/", 6, 200, 7);
    var5.setEnabled(true);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test355");


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
    var34.dispose();
    java.util.Vector var37 = freemind.main.Tools.urlStringToUrls("hi!");
    var34.setIconImages((java.util.List)var37);
    java.util.Locale var39 = var34.getLocale();
    accessories.plugins.time.JCalendar var40 = new accessories.plugins.time.JCalendar(var20, var39);
    java.lang.String var41 = freemind.main.Tools.dateToString(var20);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "253370779309367"+ "'", var41.equals("253370779309367"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test356");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    int var1 = var0.getWinHeight();
    java.lang.String var2 = var0.getAppletInfo();
    java.util.List var3 = var0.getLoggerList();
    java.util.logging.Logger var5 = var0.getLogger("joao@BetelgeuseLX");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test357");


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
    accessories.plugins.time.JMonthChooser var11 = new accessories.plugins.time.JMonthChooser();
    var11.updateUI();
    java.awt.Dimension var13 = var11.preferredSize();
    var8.addItemListener((java.awt.event.ItemListener)var11);
    accessories.plugins.time.JTripleCalendar var15 = new accessories.plugins.time.JTripleCalendar();
    boolean var16 = var15.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var17 = var15.getDayChooser();
    java.awt.Color var18 = var17.getSundayForeground();
    var17.setFocus();
    java.awt.im.InputContext var20 = var17.getInputContext();
    java.lang.String var21 = var17.getToolTipText();
    java.lang.String var22 = var17.getName();
    var11.setDayChooser(var17);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "JDayChooser"+ "'", var22.equals("JDayChooser"));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test358");


    freemind.main.XMLParseException var3 = new freemind.main.XMLParseException("BetelgeuseLX", 292278994, "simplyhtml.//openstreetmap.org/");

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test359");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    var0.setFile("Png");
    java.lang.String var3 = var0.getTitle();
    freemind.main.ExampleFileFilter var4 = new freemind.main.ExampleFileFilter();
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var4);
    java.lang.String var6 = var0.getDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test360");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var1 = var0.getUI();
    java.io.File[] var2 = var0.getSelectedFiles();
    java.lang.String var3 = var0.getDialogTitle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test361");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.main.Resources.createInstance((freemind.main.FreeMindMain)var0);
    freemind.preferences.layout.VariableSizeCardLayout var5 = new freemind.preferences.layout.VariableSizeCardLayout(10, 0);
    var5.setHgap((-2147483648));
    accessories.plugins.time.JYearChooser var8 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var9 = var8.getMouseListeners();
    freemind.view.mindmapview.MindMapLayout var10 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var13 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var13.requestFocus();
    javax.swing.InputVerifier var15 = var13.getInputVerifier();
    var10.removeLayoutComponent((java.awt.Component)var13);
    accessories.plugins.time.JYearChooser var17 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var18 = var17.getMouseListeners();
    var10.removeLayoutComponent((java.awt.Component)var17);
    var8.setLayout((java.awt.LayoutManager)var10);
    freemind.controller.FreeMindToolBar var23 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var23.updateUI();
    var23.setIgnoreRepaint(false);
    java.awt.Dimension var27 = var23.getSize();
    var8.setMinimumSize(var27);
    freemind.view.mindmapview.MapView.ScrollPane var29 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var30 = var29.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var31 = new accessories.plugins.time.JTripleCalendar();
    boolean var32 = var31.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var33 = var31.getDayChooser();
    java.awt.Color var34 = var33.getSundayForeground();
    var29.setColumnHeaderView((java.awt.Component)var33);
    java.util.Locale var36 = var33.getLocale();
    java.awt.Graphics var37 = var33.getGraphics();
    var8.setDayChooser(var33);
    var33.addListeners(10);
    var5.removeLayoutComponent((java.awt.Component)var33);
    var0.setLayout((java.awt.LayoutManager)var5);
    var0.enable(true);
    freemind.controller.FreeMindToolBar var47 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var48 = var47.isLightweight();
    int var49 = var47.getWidth();
    var47.list();
    freemind.controller.FreeMindToolBar var53 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var53.updateUI();
    var53.setIgnoreRepaint(false);
    javax.swing.Action var57 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var58 = var53.add(var57);
    javax.swing.JButton var59 = var47.add(var57);
    freemind.view.mindmapview.LeftNodeViewLayout var60 = new freemind.view.mindmapview.LeftNodeViewLayout();
    freemind.common.FreeMindProgressMonitor var62 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var62.revalidate();
    var62.addNotify();
    var62.hide();
    var62.setResizable(false);
    var60.removeLayoutComponent((java.awt.Component)var62);
    var59.setLayout((java.awt.LayoutManager)var60);
    accessories.plugins.time.JCalendar var70 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var71 = var70.getCalendar();
    java.util.Date var72 = var70.getMaxSelectableDate();
    java.lang.String var73 = var70.getToolTipText();
    var70.setOpaque(false);
    accessories.plugins.time.JTripleCalendar var76 = new accessories.plugins.time.JTripleCalendar();
    boolean var77 = var76.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var78 = var76.getDayChooser();
    boolean var79 = var78.isDecorationBordersVisible();
    java.util.GregorianCalendar var80 = var78.getTemporaryCalendar();
    var70.setCalendar((java.util.Calendar)var80);
    java.awt.Dimension var82 = var60.preferredLayoutSize((java.awt.Container)var70);
    var0.resize(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test362");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    var0.setDialogTitle("open map");
    javax.swing.plaf.FileChooserUI var5 = var0.getUI();
    var0.setMultiSelectionEnabled(false);
    var0.changeToParentDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test363");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    var0.setFile("Png");
    java.lang.String var3 = var0.getTitle();
    freemind.main.ExampleFileFilter var4 = new freemind.main.ExampleFileFilter();
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var4);
    java.awt.Dialog.ModalityType var6 = var0.getModalityType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test364");


    freemind.modes.schememode.SchemeMode var0 = new freemind.modes.schememode.SchemeMode();
    freemind.modes.ModeController var1 = var0.getDefaultModeController();
    var0.restore("/home/joao/workspace/\n");
    freemind.modes.ModeController var4 = var0.getDefaultModeController();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test365");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    var0.setLocation(2014, (-1));
    var0.revalidate();
    var0.transferFocusBackward();
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var7.dispose();
    java.util.Vector var10 = freemind.main.Tools.urlStringToUrls("hi!");
    var7.setIconImages((java.util.List)var10);
    java.awt.Dimension var12 = var7.minimumSize();
    var0.setMaximumSize(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test366");


    freemind.common.SeparatorProperty var1 = new freemind.common.SeparatorProperty("meta");

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test367");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    int var5 = var3.getComponentCount();
    var3.addSeparator();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    boolean var9 = var7.isDoubleBuffered();
    var7.hide();
    int var11 = var3.getComponentIndex((java.awt.Component)var7);
    java.awt.Dimension var12 = var7.getMinimumSize();
    var7.setFocusCycleRoot(true);
    var0.addActionListener((java.awt.event.ActionListener)var7);
    java.lang.String var16 = var0.getApproveButtonToolTipText();
    var0.hide();
    java.awt.Insets var18 = var0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test368");


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
    java.util.Calendar var15 = var7.getCalendar();
    boolean var16 = var7.isDecorationBackgroundVisible();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test369");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    accessories.plugins.time.JTripleCalendar var8 = new accessories.plugins.time.JTripleCalendar();
    var8.revalidate();
    boolean var10 = var8.isDisplayable();
    freemind.common.FreeMindProgressMonitor var12 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var12.dispose();
    java.awt.event.ContainerListener[] var14 = var12.getContainerListeners();
    java.awt.Rectangle var15 = var12.getBounds();
    var8.repaint(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setShape((java.awt.Shape)var15);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test370");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.setIgnoreRepaint(false);
    javax.swing.Action var6 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var7 = var2.add(var6);
    boolean var8 = var7.isDefaultCapable();
    int var9 = var7.getVerticalTextPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test371");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.hide();
    java.awt.Container var5 = var1.getFocusCycleRootAncestor();
    freemind.view.mindmapview.LeftNodeViewLayout var6 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var1.setLayout((java.awt.LayoutManager)var6);
    var1.invalidate();
    javax.accessibility.AccessibleContext var9 = var1.getAccessibleContext();
    accessories.plugins.time.JCalendar var10 = new accessories.plugins.time.JCalendar();
    java.awt.Color var11 = var10.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var12 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var13 = var12.getCalendar();
    java.util.Date var14 = var12.getMaxSelectableDate();
    var10.setDate(var14);
    var1.addPropertyChangeListener((java.beans.PropertyChangeListener)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test372");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    double var3 = var0.lonToTileX(100.0d, 256);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 9.006051385124593E76d);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test373");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.lang.String var4 = var1.getTitle();
    javax.swing.Action var5 = javax.swing.TransferHandler.getCutAction();
    freemind.main.Tools.addKeyActionToDialog((javax.swing.JDialog)var1, var5, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>", "Arrow_ID_515901044");
    java.awt.Toolkit var9 = var1.getToolkit();
    boolean var10 = var1.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var4.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test374");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.lang.String var3 = var0.getResourceString("file:/home/joao/workspace/\n", "file:/home/joao/workspace/\n");
    java.util.logging.Logger var5 = var0.getLogger("ToolBarUI");
    freemind.common.NamedObject var7 = var0.createTranslatedString("png");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var3.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test375");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    javax.swing.JMenuBar var4 = var0.getJMenuBar();
    var0.stop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test376");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    int var2 = var0.getMonth();
    int var3 = var0.getMonth();
    java.awt.Dimension var4 = var0.size();
    var0.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test377");


    freemind.main.Tools.BooleanHolder var1 = new freemind.main.Tools.BooleanHolder(true);
    freemind.main.Tools.BooleanHolder var3 = new freemind.main.Tools.BooleanHolder(true);
    boolean var4 = freemind.main.Tools.safeEquals(var1, var3);
    boolean var5 = var1.getValue();
    freemind.main.Tools.BooleanHolder var6 = new freemind.main.Tools.BooleanHolder();
    boolean var7 = freemind.main.Tools.safeEquals(var1, var6);
    var1.setValue(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test378");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setDialogTitle("");
    freemind.common.FreeMindProgressMonitor var4 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var4.revalidate();
    boolean var6 = var4.isUndecorated();
    var4.validate();
    javax.accessibility.AccessibleContext var8 = var4.getAccessibleContext();
    java.beans.PropertyChangeListener[] var9 = var4.getPropertyChangeListeners();
    accessories.plugins.time.JYearChooser var10 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var11 = var10.getUI();
    java.awt.Dimension var12 = var10.minimumSize();
    var4.setSize(var12);
    java.util.Locale var14 = var4.getLocale();
    var0.setLocale(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test379");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    var0.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test380");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    java.lang.String var1 = var0.getPassword();
    var0.clearLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test381");


    plugins.map.FreeMindMapController.PositionHolder var3 = new plugins.map.FreeMindMapController.PositionHolder(9.006051385124593E76d, 4.110171553125E8d, 6);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test382");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.setStartYear(10);
    var0.firePropertyChange("file:/home/joao/workspace/\n", true, true);
    freemind.common.FreeMindProgressMonitor var9 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var9.revalidate();
    var9.addNotify();
    var9.setFocusTraversalPolicyProvider(false);
    java.lang.Object var14 = var0.getClientProperty((java.lang.Object)var9);
    int var15 = var0.getStartYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test383");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var2.isDecorationBordersVisible();
    java.util.GregorianCalendar var4 = var2.getTemporaryCalendar();
    accessories.plugins.time.JCalendar var5 = new accessories.plugins.time.JCalendar((java.util.Calendar)var4);
    accessories.plugins.time.JCalendar var6 = new accessories.plugins.time.JCalendar((java.util.Calendar)var4);
    java.lang.Object var7 = var6.getTreeLock();
    java.util.Date var8 = var6.getMaxSelectableDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test384");


    freemind.modes.browsemode.BrowseHookFactory var0 = new freemind.modes.browsemode.BrowseHookFactory();
    freemind.extensions.ModeControllerHook var2 = var0.createModeControllerHook("control");
    java.util.List var4 = var0.getHookMenuPositions("icon_hi!");
    java.util.List var6 = var0.getHookMenuPositions("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test385");


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
    freemind.modes.MindIcon var16 = freemind.modes.MindIcon.factory("hi!");
    java.lang.String var17 = var16.getIconFileName();
    javax.swing.ImageIcon var18 = var16.getIcon();
    javax.accessibility.AccessibleContext var19 = var18.getAccessibleContext();
    var8.setPressedIcon((javax.swing.Icon)var18);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "images/icons/JDayChooser.png"+ "'", var17.equals("images/icons/JDayChooser.png"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test386");


    freemind.common.XmlBindingTools var0 = freemind.common.XmlBindingTools.getInstance();
    org.jibx.runtime.IUnmarshallingContext var1 = var0.createUnmarshaller();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test387");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    boolean var1 = var0.isActive();
    java.io.File var2 = var0.getPatternsFile();
    boolean var3 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test388");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    java.lang.Integer var6 = var0.getNodeFontSize();
    java.awt.Color var7 = var0.getNodeColor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test389");


    java.util.Vector var1 = freemind.main.Tools.urlStringToUrls("hi!");
    freemind.controller.filter.util.ExtendedComboBoxModel var2 = new freemind.controller.filter.util.ExtendedComboBoxModel(var1);
    var2.setSelectedItem((java.lang.Object)"false");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test390");


    plugins.collaboration.socket.SocketConnectionHook var0 = new plugins.collaboration.socket.SocketConnectionHook();
    var0.onUpdateNodeHook();

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test391");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    int var5 = var3.getComponentCount();
    var3.addSeparator();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    boolean var9 = var7.isDoubleBuffered();
    var7.hide();
    int var11 = var3.getComponentIndex((java.awt.Component)var7);
    java.awt.Dimension var12 = var7.getMinimumSize();
    var7.setFocusCycleRoot(true);
    var0.addActionListener((java.awt.event.ActionListener)var7);
    java.lang.String var16 = var0.getApproveButtonToolTipText();
    java.awt.event.ActionListener[] var17 = var0.getActionListeners();
    freemind.modes.FreeMindJFileDialog var18 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var19 = var18.getUI();
    java.io.File[] var20 = var18.getSelectedFiles();
    java.lang.String var21 = var18.getApproveButtonToolTipText();
    var18.setDialogTitle("127.0.1.1");
    java.io.File var24 = var18.getCurrentDirectory();
    var0.setSelectedFile(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test392");


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
    accessories.plugins.time.JTripleCalendar var28 = new accessories.plugins.time.JTripleCalendar();
    var28.requestFocus();
    accessories.plugins.time.JCalendar var30 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var31 = var30.getCalendar();
    var28.setCalendar(var31);
    accessories.plugins.time.JYearChooser var33 = var28.getYearChooser();
    freemind.common.FreeMindProgressMonitor var35 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var35.revalidate();
    var35.addNotify();
    java.awt.event.WindowListener[] var38 = var35.getWindowListeners();
    java.lang.Object var39 = var33.getClientProperty((java.lang.Object)var35);
    var19.addLayoutComponent("png", (java.awt.Component)var35);
    freemind.controller.FreeMindToolBar var43 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var44 = var43.isLightweight();
    javax.swing.plaf.ToolBarUI var45 = var43.getUI();
    freemind.controller.FreeMindToolBar var48 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var48.updateUI();
    var48.setIgnoreRepaint(false);
    var48.setVisible(false);
    boolean var54 = var43.isAncestorOf((java.awt.Component)var48);
    java.awt.Dimension var55 = var48.preferredSize();
    java.awt.Dimension var56 = var19.minimumLayoutSize((java.awt.Container)var48);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test393");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var2 = var0.getTermsOfUseText();
    var0.setAttributionLinkURL("253370779309367");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test394");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    int var2 = var0.getHorizontalScrollBarPolicy();
    int var3 = var0.getWidth();
    boolean var5 = var0.requestFocus(false);
    boolean var6 = var0.isWheelScrollingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test395");


    freemind.main.XMLElement var7 = new freemind.main.XMLElement(true);
    java.util.Vector var8 = var7.getChildren();
    freemind.common.FreeMindProgressMonitor var10 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var10.dispose();
    java.util.Vector var13 = freemind.main.Tools.urlStringToUrls("hi!");
    var10.setIconImages((java.util.List)var13);
    java.lang.String var15 = freemind.main.Tools.listToString((java.util.List)var13);
    freemind.controller.MindMapNodesSelection var16 = new freemind.controller.MindMapNodesSelection("Png", "meta", "images/icons/hi!.png", "eNoDAAAAAAE=", "simplyhtml.//openstreetmap.org/", "//otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", (java.util.List)var8, (java.util.List)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test396");


    freemind.controller.filter.condition.AttributeCompareCondition var5 = new freemind.controller.filter.condition.AttributeCompareCondition("file:/home/joao/workspace/\n", "<a,23>", true, (-1), true);
    freemind.main.XMLElement var6 = new freemind.main.XMLElement();
    java.lang.String var7 = var6.getTagName();
    java.util.Iterator var8 = var6.enumerateAttributeNames();
    java.lang.String var9 = var6.toString();
    java.lang.Object var11 = var6.getAttribute("images/icons/hi!.png");
    var5.save(var6);
    freemind.modes.common.plugins.MapNodePositionHolderBase var14 = new freemind.modes.common.plugins.MapNodePositionHolderBase();
    var6.setAttribute("open map", (java.lang.Object)var14);
    java.lang.String var17 = var6.getStringAttribute("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test397");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    java.awt.event.WindowListener[] var4 = var1.getWindowListeners();
    freemind.main.FreeMindApplet var5 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var6 = var5.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var7 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var8 = var7.getResources();
    java.awt.Container var9 = var7.getContentPane();
    var5.remove((java.awt.Component)var7);
    java.util.Locale var11 = var7.getLocale();
    var7.start();
    java.awt.Dimension var13 = var7.minimumSize();
    var1.setSize(var13);
    boolean var15 = var1.getFocusableWindowState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test398");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    java.lang.String var6 = var0.getEdgeStyle();
    boolean var7 = var0.getAppliesToChildren();
    accessories.plugins.time.JTripleCalendar var8 = new accessories.plugins.time.JTripleCalendar();
    boolean var9 = var8.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var10 = var8.getDayChooser();
    javax.swing.JRootPane var11 = var8.getRootPane();
    accessories.plugins.time.JDayChooser var12 = var8.getDayChooser();
    var12.setDay(100);
    java.awt.Color var15 = var12.getSundayForeground();
    var0.setEdgeColor(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test399");


    plugins.collaboration.database.DatabaseStarter var0 = new plugins.collaboration.database.DatabaseStarter();
    plugins.collaboration.socket.MindMapMaster var1 = new plugins.collaboration.socket.MindMapMaster();
    var1.switchMeOff();
    var1.processUnfinishedLinks();
    freemind.modes.mindmapmode.actions.xml.ActionPair var4 = var1.getEmptyActionPair();
    freemind.modes.mindmapmode.actions.xml.ActionPair var5 = var0.filterAction(var4);
    plugins.collaboration.database.UpdateThread var6 = var0.getUpdateThread();
    freemind.main.XMLElement var8 = new freemind.main.XMLElement(true);
    freemind.common.PasswordProperty var12 = new freemind.common.PasswordProperty("images/icons/", "");
    var8.setAttribute("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", (java.lang.Object)var12);
    var0.loadFrom(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test400");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.awt.Color var1 = var0.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    java.util.Date var4 = var2.getMaxSelectableDate();
    var0.setDate(var4);
    accessories.plugins.time.JDayChooser var6 = var0.getDayChooser();
    accessories.plugins.time.JCalendar var7 = new accessories.plugins.time.JCalendar();
    java.awt.Color var8 = var7.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var9 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var10 = var9.getCalendar();
    java.util.Date var11 = var9.getMaxSelectableDate();
    var7.setDate(var11);
    var0.setMinSelectableDate(var11);
    var0.setMaxDayCharacters(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test401");


    freemind.preferences.layout.VariableSizeCardLayout var0 = new freemind.preferences.layout.VariableSizeCardLayout();
    freemind.common.FreeMindProgressMonitor var2 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var3 = var2.getInputMethodListeners();
    javax.accessibility.AccessibleContext var4 = var2.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var6 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var6.revalidate();
    var2.setLocationRelativeTo((java.awt.Component)var6);
    boolean var9 = var2.isValidateRoot();
    accessories.plugins.time.JCalendar var10 = new accessories.plugins.time.JCalendar();
    java.awt.Color var11 = var10.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var12 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var13 = var12.getCalendar();
    java.util.Date var14 = var12.getMaxSelectableDate();
    var10.setDate(var14);
    var10.setWeekOfYearVisible(true);
    var2.addPropertyChangeListener((java.beans.PropertyChangeListener)var10);
    accessories.plugins.time.JCalendar var19 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var20 = var19.getCalendar();
    java.util.Date var21 = var19.getMaxSelectableDate();
    var10.setMinSelectableDate(var21);
    accessories.plugins.time.JCalendar var24 = new accessories.plugins.time.JCalendar(var21, false);
    accessories.plugins.time.JTripleCalendar var25 = new accessories.plugins.time.JTripleCalendar();
    boolean var26 = var25.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var27 = var25.getDayChooser();
    javax.swing.JRootPane var28 = var25.getRootPane();
    accessories.plugins.time.JDayChooser var29 = var25.getDayChooser();
    java.util.Locale var30 = var25.getLocale();
    accessories.plugins.time.JCalendar var33 = new accessories.plugins.time.JCalendar(var21, var30, true, true);
    java.awt.Dimension var34 = var0.minimumLayoutSize((java.awt.Container)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test402");


    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var1 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var2 = var1.createReader();
    var2.mark(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test403");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var2 = var0.getTermsOfUseText();
    java.lang.String var3 = var0.getTermsOfUseURL();
    var0.setTermsOfUseURL("hi!");
    java.lang.String var6 = plugins.map.FreeMindMapController.getTileSourceName((org.openstreetmap.gui.jmapviewer.interfaces.TileSource)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "http://www.openstreetmap.org/copyright"+ "'", var3.equals("http://www.openstreetmap.org/copyright"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "plugins.map.FreeMindMapController$MapQuestOpenMap"+ "'", var6.equals("plugins.map.FreeMindMapController$MapQuestOpenMap"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test404");


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
      var0.remove(2014);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test405");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isMultiSelectionEnabled();
    java.io.FilenameFilter var2 = var0.getFilenameFilter();
    freemind.modes.FreeMindJFileDialog var3 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var4 = var3.getUI();
    java.io.File[] var5 = var3.getSelectedFiles();
    java.lang.String var6 = var3.getApproveButtonToolTipText();
    var3.setDialogTitle("127.0.1.1");
    java.io.File var9 = var3.getCurrentDirectory();
    freemind.main.Tools.setHidden(var9, false, true);
    var0.setSelectedFile(var9);
    java.lang.String var14 = freemind.main.Tools.getExtension(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test406");


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
    boolean var33 = var32.requestFocusInWindow();
    var32.setWeekOfYearVisible(true);
    
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
    assertTrue(var33 == false);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test407");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setHorizontalTextPosition(100);
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

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test408");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    freemind.modes.mindmapmode.actions.xml.ActionFactory var5 = new freemind.modes.mindmapmode.actions.xml.ActionFactory(var3);
    freemind.controller.NodeMotionListener var6 = var3.getNodeMotionListener();
    freemind.controller.MapMouseWheelListener var7 = new freemind.controller.MapMouseWheelListener(var3);
    var7.deregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test409");


    freemind.common.DontShowNotificationProperty var2 = new freemind.common.DontShowNotificationProperty("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", "file:/home/joao/workspace/file:/home/joao/workspace/%0A\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setValue("MindMap");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test410");


    freemind.preferences.layout.VariableSizeCardLayout var2 = new freemind.preferences.layout.VariableSizeCardLayout(10, 0);
    accessories.plugins.time.JSpinField var5 = new accessories.plugins.time.JSpinField(10, 1);
    java.awt.dnd.DropTarget var6 = var5.getDropTarget();
    java.awt.Dimension var7 = var5.getPreferredSize();
    freemind.controller.filter.util.SortedComboBoxModel var8 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var9 = var8.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var10 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var11 = var10.getName();
    boolean var12 = freemind.main.Tools.safeEquals((java.lang.Object)var8, (java.lang.Object)var11);
    java.util.Iterator var13 = var8.iterator();
    var8.remove((java.lang.Object)"icon_hi!");
    freemind.modes.StylePattern var16 = new freemind.modes.StylePattern();
    var16.setEdgeStyle("hi!");
    freemind.modes.StylePattern var19 = var16.getChildrenStylePattern();
    freemind.modes.StylePattern var20 = new freemind.modes.StylePattern();
    var16.setChildrenStylePattern(var20);
    accessories.plugins.time.JTripleCalendar var22 = new accessories.plugins.time.JTripleCalendar();
    boolean var23 = var22.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var24 = var22.getDayChooser();
    java.awt.Color var25 = var24.getSundayForeground();
    var20.setNodeBackgroundColor(var25);
    var8.setSelectedItem((java.lang.Object)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addLayoutComponent((java.awt.Component)var5, (java.lang.Object)var20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "OSM MapQuest.Open Map"+ "'", var11.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test411");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.awt.Point var7 = var0.location();
    javax.swing.JViewport var8 = var0.getRowHeader();
    java.awt.Rectangle var9 = var0.getViewportBorderBounds();
    
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

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test412");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    int var7 = var0.getVerticalScrollBarPolicy();
    java.awt.Container var8 = var0.getFocusCycleRootAncestor();
    freemind.view.mindmapview.MapView.ScrollPane var9 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var10 = var9.getAccessibleContext();
    int var11 = var9.getHorizontalScrollBarPolicy();
    freemind.view.mindmapview.MapView.ScrollPane var12 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var13 = var12.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var14 = new accessories.plugins.time.JTripleCalendar();
    boolean var15 = var14.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var16 = var14.getDayChooser();
    java.awt.Color var17 = var16.getSundayForeground();
    var12.setColumnHeaderView((java.awt.Component)var16);
    var12.enableInputMethods(true);
    freemind.view.mindmapview.MapView.ScrollPane var21 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var22 = var21.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var23 = new accessories.plugins.time.JTripleCalendar();
    boolean var24 = var23.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var25 = var23.getDayChooser();
    java.awt.Color var26 = var25.getSundayForeground();
    var21.setColumnHeaderView((java.awt.Component)var25);
    javax.swing.JViewport var28 = var21.getColumnHeader();
    var12.setColumnHeader(var28);
    var9.setRowHeader(var28);
    var0.setViewport(var28);
    javax.swing.JScrollBar var32 = var0.createVerticalScrollBar();
    boolean var33 = var32.getAutoscrolls();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test413");


    freemind.common.NextLineProperty var0 = new freemind.common.NextLineProperty();

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test414");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    var4.setEdgeWidth((java.lang.Integer)292278994);
    boolean var8 = var4.getAppliesToNodeFont();
    java.awt.Color var9 = var4.getEdgeColor();
    java.lang.Boolean var10 = var4.getNodeFontBold();
    var4.setNodeFontBold((java.lang.Boolean)false);
    var4.setNodeFontBold((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test415");


    freemind.main.LogFileLogHandler var0 = new freemind.main.LogFileLogHandler();
    accessories.plugins.LogFileViewer var1 = new accessories.plugins.LogFileViewer();
    var0.setLogReceiver((freemind.main.LogFileLogHandler.LogReceiver)var1);
    java.util.logging.Formatter var3 = var0.getFormatter();
    java.util.logging.ErrorManager var4 = var0.getErrorManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test416");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    var2.setIgnoreRepaint(false);
    javax.swing.Action var6 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var7 = var2.add(var6);
    boolean var8 = var7.isDefaultCapable();
    java.lang.String var9 = var7.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test417");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    java.awt.event.WindowListener[] var4 = var1.getWindowListeners();
    var1.transferFocus();
    var1.reshape(11, 31, 10, 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test418");


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
    var2.setDay(10);
    boolean var20 = var2.requestFocus(false);
    java.awt.ComponentOrientation var21 = var2.getComponentOrientation();
    com.lightdev.app.shtm.SHTMLPanel var23 = accessories.plugins.NodeNoteRegistration.getHtmlEditorPanel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var24 = var2.add("ButtonUI", (java.awt.Component)var23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test419");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    boolean var3 = var1.isUndecorated();
    var1.validate();
    javax.accessibility.AccessibleContext var5 = var1.getAccessibleContext();
    java.awt.event.MouseWheelListener[] var6 = var1.getMouseWheelListeners();
    java.awt.im.InputContext var7 = var1.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test420");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    javax.swing.border.Border var4 = var2.getBorder();
    var2.setBorderPainted(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test421");


    accessories.plugins.time.JYearChooser var0 = new accessories.plugins.time.JYearChooser();
    boolean var1 = var0.isPaintingTile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test422");


    java.lang.String[] var3 = new java.lang.String[] { "/home/joao/workspace/FreeMind_integration/bin/classes/"};
    freemind.main.Resources var4 = freemind.main.Resources.getInstance();
    java.net.URL var6 = var4.getResource("file:/home/joao/workspace/\n");
    java.lang.String var8 = var4.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var10 = var4.createTranslatedString("");
    freemind.common.ComboProperty var11 = new freemind.common.ComboProperty(".", "<a,23>", var3, (freemind.common.TextTranslator)var4);
    freemind.main.XMLElement var12 = new freemind.main.XMLElement();
    java.lang.String var13 = var12.getTagName();
    java.util.Iterator var14 = var12.enumerateAttributeNames();
    java.util.Vector var16 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var17 = new freemind.modes.StylePattern(var12, (java.util.List)var16);
    accessories.plugins.time.JTripleCalendar var18 = new accessories.plugins.time.JTripleCalendar();
    boolean var19 = var18.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var20 = var18.getDayChooser();
    javax.swing.JRootPane var21 = var18.getRootPane();
    java.util.Vector var22 = freemind.main.Tools.getVectorWithSingleElement((java.lang.Object)var18);
    var11.updateComboBoxEntries((java.util.List)var16, (java.util.List)var22);
    java.lang.String var24 = var11.getDescription();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "."+ "'", var24.equals("."));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test423");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    java.awt.Color var3 = var2.getSundayForeground();
    var2.setFocus();
    int var5 = var2.getMaxDayCharacters();
    var2.setMonth(20);
    boolean var8 = var2.isPaintingTile();
    int var9 = var2.getDaysInMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test424");


    java.lang.String var1 = de.foltin.StringEncoder.decode("file:/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var1.equals("file:/home/joao/workspace/\n"));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test425");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.awt.Point var7 = var0.location();
    javax.swing.border.Border var8 = var0.getViewportBorder();
    
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

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test426");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.awt.Color var1 = var0.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var3 = var2.getCalendar();
    java.util.Date var4 = var2.getMaxSelectableDate();
    var0.setDate(var4);
    var0.setWeekOfYearVisible(true);
    freemind.common.FreeMindProgressMonitor var9 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var9.dispose();
    java.util.Vector var12 = freemind.main.Tools.urlStringToUrls("hi!");
    var9.setIconImages((java.util.List)var12);
    java.util.Locale var14 = var9.getLocale();
    freemind.modes.StylePattern var15 = new freemind.modes.StylePattern();
    var15.setEdgeStyle("hi!");
    freemind.modes.StylePattern var18 = var15.getChildrenStylePattern();
    freemind.modes.StylePattern var19 = new freemind.modes.StylePattern();
    var15.setChildrenStylePattern(var19);
    accessories.plugins.time.JTripleCalendar var21 = new accessories.plugins.time.JTripleCalendar();
    boolean var22 = var21.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var23 = var21.getDayChooser();
    java.awt.Color var24 = var23.getSundayForeground();
    var19.setNodeBackgroundColor(var24);
    var9.setBackground(var24);
    var0.setDecorationBackgroundColor(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test427");


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
    boolean var11 = var8.isFocusPainted();
    
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
    assertTrue(var11 == false);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test428");


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
    boolean var14 = var6.isMaximumSizeSet();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test429");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    int var5 = var3.getComponentCount();
    var3.addSeparator();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    boolean var9 = var7.isDoubleBuffered();
    var7.hide();
    int var11 = var3.getComponentIndex((java.awt.Component)var7);
    java.awt.Dimension var12 = var7.getMinimumSize();
    var7.setFocusCycleRoot(true);
    var0.addActionListener((java.awt.event.ActionListener)var7);
    java.lang.Object var16 = var7.getTreeLock();
    freemind.modes.FreeMindJFileDialog var17 = new freemind.modes.FreeMindJFileDialog();
    var17.setApproveButtonText("IntHolder(0)");
    java.awt.Component var20 = var7.add((java.awt.Component)var17);
    javax.swing.JComponent var21 = var17.getAccessory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test430");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var2 = var0.getTermsOfUseText();
    double var5 = var0.latToTileY(1.0d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 509.1554111333358d);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test431");


    freemind.modes.filemode.FileMode var0 = new freemind.modes.filemode.FileMode();
    java.lang.String var1 = var0.toString();
    freemind.controller.Controller var2 = var0.getController();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "File"+ "'", var1.equals("File"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test432");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    int var8 = var5.getComponentCount();
    javax.accessibility.AccessibleContext var9 = var5.getAccessibleContext();
    java.awt.GraphicsConfiguration var10 = var5.getGraphicsConfiguration();
    boolean var11 = var5.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test433");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    boolean var8 = var1.isValidateRoot();
    var1.hide();
    accessories.plugins.time.JTripleCalendar var10 = new accessories.plugins.time.JTripleCalendar();
    boolean var11 = var10.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var12 = var10.getDayChooser();
    boolean var13 = var12.isDecorationBordersVisible();
    var1.addKeyListener((java.awt.event.KeyListener)var12);
    var1.hide();
    java.lang.String var16 = var1.getTitle();
    java.awt.Window var17 = var1.getOwner();
    boolean var19 = var1.setProgress(198);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var16.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test434");


    freemind.preferences.layout.VariableSizeCardLayout var0 = new freemind.preferences.layout.VariableSizeCardLayout();
    freemind.common.FreeMindProgressMonitor var2 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var3 = var2.getInputMethodListeners();
    javax.accessibility.AccessibleContext var4 = var2.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var6 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var6.revalidate();
    var2.setLocationRelativeTo((java.awt.Component)var6);
    boolean var9 = var2.isValidateRoot();
    var2.hide();
    accessories.plugins.time.JTripleCalendar var11 = new accessories.plugins.time.JTripleCalendar();
    boolean var12 = var11.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var13 = var11.getDayChooser();
    boolean var14 = var13.isDecorationBordersVisible();
    var2.addKeyListener((java.awt.event.KeyListener)var13);
    var2.hide();
    java.lang.String var17 = var2.getTitle();
    java.awt.Window var18 = var2.getOwner();
    java.awt.Dimension var19 = var0.preferredLayoutSize((java.awt.Container)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var17.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test435");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkPackageAccess("hi!");
    var3.checkSecurityAccess("");
    var3.checkPropertyAccess("ToolBarUI");
    var3.checkPropertyAccess("<a,23>");
    var3.checkPropertiesAccess();
    var3.checkAwtEventQueueAccess();
    var3.checkCreateClassLoader();

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test436");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    boolean var8 = var1.isValidateRoot();
    var1.hide();
    accessories.plugins.time.JTripleCalendar var10 = new accessories.plugins.time.JTripleCalendar();
    boolean var11 = var10.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var12 = var10.getDayChooser();
    boolean var13 = var12.isDecorationBordersVisible();
    var1.addKeyListener((java.awt.event.KeyListener)var12);
    float var15 = var1.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test437");


    freemind.modes.MindIcon var1 = freemind.modes.MindIcon.factory("hi!");
    java.lang.String var2 = var1.getIconFileName();
    java.lang.String var3 = var1.getKeystrokeResourceName();
    java.lang.String var4 = var1.getDescription();
    var1.setName("JDayChooser");
    java.lang.String var7 = var1.toString();
    java.lang.String var8 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "images/icons/JDayChooser.png"+ "'", var2.equals("images/icons/JDayChooser.png"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "keystroke_icon_JDayChooser"+ "'", var3.equals("keystroke_icon_JDayChooser"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "icon_JDayChooser"+ "'", var4.equals("icon_JDayChooser"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Icon_name: JDayChooser"+ "'", var7.equals("Icon_name: JDayChooser"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "JDayChooser"+ "'", var8.equals("JDayChooser"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test438");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    boolean var3 = var1.isUndecorated();
    var1.validate();
    javax.accessibility.AccessibleContext var5 = var1.getAccessibleContext();
    java.beans.PropertyChangeListener[] var6 = var1.getPropertyChangeListeners();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    javax.swing.plaf.PanelUI var8 = var7.getUI();
    java.awt.Dimension var9 = var7.minimumSize();
    var1.setSize(var9);
    java.util.Locale var11 = var1.getLocale();
    var1.setTitle("/home/joao/workspace/\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test439");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    boolean var1 = var0.isActive();
    java.io.File var2 = var0.getPatternsFile();
    var0.setProperty("<a,23>", "<a,23>");
    freemind.extensions.ImportWizard var6 = new freemind.extensions.ImportWizard((freemind.main.FreeMindMain)var0);
    var6.buildClassList();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test440");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.hide();
    var1.setResizable(false);
    java.awt.GraphicsConfiguration var7 = var1.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test441");


    freemind.modes.attributes.Attribute var2 = new freemind.modes.attributes.Attribute("[IndexPair: originalStart: 10 originalEnd: -1 replacedStart: 0 replacedEnd: 1 is a tag: true]", "file:/home/joao/workspace/\n");

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test442");


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
    freemind.modes.mindmapmode.JAutoScrollBarPane var18 = new freemind.modes.mindmapmode.JAutoScrollBarPane((java.awt.Component)var8);
    java.awt.Dimension var19 = var18.getPreferredSize();
    
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
    assertNotNull(var19);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test443");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var5 = var0.getTileUrl((-1), 0, 200);
    var0.setTermsOfUseURL("[IndexPair");
    boolean var8 = var0.requiresAttribution();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png"+ "'", var5.equals("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test444");


    accessories.plugins.time.JMonthChooser var0 = new accessories.plugins.time.JMonthChooser();
    var0.updateUI();
    java.awt.Component var2 = var0.getSpinner();
    java.util.Locale var3 = var0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test445");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    java.awt.Color var3 = var2.getSundayForeground();
    var2.setDayBordersVisible(true);
    java.awt.Color var6 = var2.getSundayForeground();
    var2.setMaxDayCharacters(11);
    freemind.common.FreeMindProgressMonitor var10 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var11 = var10.getInputMethodListeners();
    javax.accessibility.AccessibleContext var12 = var10.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var14 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var14.revalidate();
    var10.setLocationRelativeTo((java.awt.Component)var14);
    boolean var17 = var10.isValidateRoot();
    accessories.plugins.time.JCalendar var18 = new accessories.plugins.time.JCalendar();
    java.awt.Color var19 = var18.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var20 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var21 = var20.getCalendar();
    java.util.Date var22 = var20.getMaxSelectableDate();
    var18.setDate(var22);
    var18.setWeekOfYearVisible(true);
    var10.addPropertyChangeListener((java.beans.PropertyChangeListener)var18);
    accessories.plugins.time.JCalendar var27 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var28 = var27.getCalendar();
    java.util.Date var29 = var27.getMaxSelectableDate();
    var18.setMinSelectableDate(var29);
    accessories.plugins.time.JCalendar var32 = new accessories.plugins.time.JCalendar(var29, false);
    java.util.Date var33 = var2.setMaxSelectableDate(var29);
    freemind.view.mindmapview.MapView.ScrollPane var34 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var35 = var34.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var36 = new accessories.plugins.time.JTripleCalendar();
    boolean var37 = var36.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var38 = var36.getDayChooser();
    java.awt.Color var39 = var38.getSundayForeground();
    var34.setColumnHeaderView((java.awt.Component)var38);
    java.util.Locale var41 = var38.getLocale();
    javax.swing.JButton var42 = var38.getSelectedDay();
    var42.setDisplayedMnemonicIndex(1);
    int var45 = var42.getMnemonic();
    var42.addNotify();
    var42.setFocusPainted(true);
    var42.setSelected(true);
    var2.remove((java.awt.Component)var42);
    freemind.main.FreeMindApplet var52 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var53 = var52.getFocusTraversalPolicy();
    var52.destroy();
    freemind.controller.Controller var55 = new freemind.controller.Controller((freemind.main.FreeMindMain)var52);
    var42.remove((java.awt.Component)var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test446");


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
    var8.setDefaultCapable(false);
    boolean var19 = var8.isOpaque();
    
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
    assertTrue(var19 == true);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test447");


    plugins.map.FreeMindMapController.TransportMap var0 = new plugins.map.FreeMindMapController.TransportMap();
    plugins.map.FreeMindMapController.TileSourceStore var2 = new plugins.map.FreeMindMapController.TileSourceStore((org.openstreetmap.gui.jmapviewer.interfaces.TileSource)var0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>");
    java.lang.String var3 = var0.getTermsOfUseText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test448");


    freemind.view.mindmapview.attributeview.AttributeTableCellRenderer var0 = new freemind.view.mindmapview.attributeview.AttributeTableCellRenderer();
    var0.invalidate();
    java.lang.String var2 = var0.getUIClassID();
    int var3 = var0.getHorizontalAlignment();
    javax.swing.Icon var4 = var0.getDisabledIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "LabelUI"+ "'", var2.equals("LabelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test449");


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
    int var21 = var12.getProperty("JDayChooser", (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test450");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.controller.MenuBar var2 = var0.getFreeMindMenuBar();
    accessories.plugins.time.JTripleCalendar var3 = new accessories.plugins.time.JTripleCalendar();
    boolean var4 = var3.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var5 = var3.getDayChooser();
    var0.remove((java.awt.Component)var5);
    freemind.view.mindmapview.MapView.ScrollPane var7 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var8 = var7.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var9 = new accessories.plugins.time.JTripleCalendar();
    boolean var10 = var9.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var11 = var9.getDayChooser();
    java.awt.Color var12 = var11.getSundayForeground();
    var7.setColumnHeaderView((java.awt.Component)var11);
    freemind.view.mindmapview.MapView.ScrollPane var14 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var15 = var14.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var16 = new accessories.plugins.time.JTripleCalendar();
    boolean var17 = var16.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var18 = var16.getDayChooser();
    java.awt.Color var19 = var18.getSundayForeground();
    var14.setColumnHeaderView((java.awt.Component)var18);
    javax.swing.JViewport var21 = var14.getColumnHeader();
    var7.setColumnHeader(var21);
    plugins.svg.ExportVectorGraphic var23 = new plugins.svg.ExportVectorGraphic();
    org.apache.batik.svggen.SVGGraphics2D var24 = var23.createSvgGraphics2D();
    var21.paintComponents((java.awt.Graphics)var24);
    var5.paint((java.awt.Graphics)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test451");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.dispose();
    java.util.Vector var4 = freemind.main.Tools.urlStringToUrls("hi!");
    var1.setIconImages((java.util.List)var4);
    java.util.Locale var6 = var1.getLocale();
    freemind.view.mindmapview.MapView.ScrollPane var7 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var8 = var7.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var9 = new accessories.plugins.time.JTripleCalendar();
    boolean var10 = var9.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var11 = var9.getDayChooser();
    java.awt.Color var12 = var11.getSundayForeground();
    var7.setColumnHeaderView((java.awt.Component)var11);
    java.util.Locale var14 = var11.getLocale();
    javax.swing.JButton var15 = var11.getSelectedDay();
    java.lang.String var16 = var15.getUIClassID();
    freemind.common.FreeMindProgressMonitor var18 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var18.revalidate();
    var18.addNotify();
    var18.setFocusTraversalPolicyProvider(false);
    java.awt.Point var23 = var18.location();
    boolean var24 = var15.contains(var23);
    boolean var25 = var15.isContentAreaFilled();
    freemind.view.mindmapview.MindMapLayout var26 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var29 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var29.requestFocus();
    javax.swing.InputVerifier var31 = var29.getInputVerifier();
    var26.removeLayoutComponent((java.awt.Component)var29);
    var15.setLayout((java.awt.LayoutManager)var26);
    javax.swing.Icon var34 = var15.getRolloverIcon();
    int var35 = var15.getDisplayedMnemonicIndex();
    java.awt.Cursor var36 = var15.getCursor();
    var1.remove((java.awt.Component)var15);
    freemind.main.FreeMindApplet var38 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var39 = var38.getFocusTraversalPolicy();
    var38.destroy();
    freemind.controller.Controller var41 = new freemind.controller.Controller((freemind.main.FreeMindMain)var38);
    java.net.URL var43 = var41.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var44 = new freemind.controller.MapMouseWheelListener(var41);
    java.net.URL var46 = var41.getResource("control");
    freemind.controller.MapMouseMotionListener var47 = new freemind.controller.MapMouseMotionListener(var41);
    var15.addMouseListener((java.awt.event.MouseListener)var47);
    boolean var49 = var15.isSelected();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertTrue("'" + var16 + "' != '" + "ButtonUI"+ "'", var16.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test452");


    java.lang.String var1 = freemind.main.HtmlTools.toXMLUnescapedText(".*(Png).*");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ".*(Png).*"+ "'", var1.equals(".*(Png).*"));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test453");


    freemind.preferences.layout.OptionPanel.NewTabProperty var2 = new freemind.preferences.layout.OptionPanel.NewTabProperty("plugins.map.FreeMindMapController$MapQuestOpenMap", "http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=200&layers=Q");

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test454");


    freemind.main.HtmlTools var0 = freemind.main.HtmlTools.getInstance();
    java.lang.String var2 = var0.toHtml("IntHolder(100)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "IntHolder(100)"+ "'", var2.equals("IntHolder(100)"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test455");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    java.util.ResourceBundle var2 = var0.getResources();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test456");


    freemind.main.Resources var3 = freemind.main.Resources.getInstance();
    java.lang.String var5 = var3.getResourceString("");
    freemind.common.ColorProperty var6 = new freemind.common.ColorProperty("file:/home/joao/workspace/\n", "hi!", "file:/home/joao/workspace/\n", (freemind.common.TextTranslator)var3);
    java.lang.String var7 = var6.getDescription();
    var6.setEnabled(false);
    java.lang.String var10 = var6.getDescription();
    java.lang.String var11 = var6.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var7.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var10.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var11.equals("file:/home/joao/workspace/\n"));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test457");


    plugins.map.MapNodePositionHolder var0 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    java.lang.String var2 = var1.getTagName();
    java.util.Iterator var3 = var1.enumerateAttributeNames();
    java.util.Iterator var4 = var1.enumeratePropertyNames();
    var0.loadFrom(var1);
    java.lang.String[] var6 = var0.getBarePosition();
    var0.onUpdateNodeHook();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test458");


    plugins.collaboration.database.DatabaseStarter var0 = new plugins.collaboration.database.DatabaseStarter();
    plugins.collaboration.socket.MindMapMaster var1 = new plugins.collaboration.socket.MindMapMaster();
    var1.switchMeOff();
    var1.processUnfinishedLinks();
    freemind.modes.mindmapmode.actions.xml.ActionPair var4 = var1.getEmptyActionPair();
    freemind.modes.mindmapmode.actions.xml.ActionPair var5 = var0.filterAction(var4);
    var0.processUnfinishedLinks();
    var0.registerFilter();
    var0.registerFilter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test459");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = freemind.main.Tools.xmlToColor("253370779309367");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test460");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    java.util.Locale var6 = var2.getLocale();
    var2.start();
    javax.accessibility.AccessibleContext var8 = var2.getAccessibleContext();
    var2.setProperty(".*(Png).*", "http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=59&layers=M");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test461");


    freemind.controller.filter.condition.AttributeNotExistsCondition var1 = new freemind.controller.filter.condition.AttributeNotExistsCondition("hi!");
    javax.swing.JComponent var2 = var1.getListCellRendererComponent();
    plugins.collaboration.socket.MindMapMaster var3 = new plugins.collaboration.socket.MindMapMaster();
    var3.switchMeOff();
    var3.processUnfinishedLinks();
    freemind.modes.mindmapmode.actions.xml.ActionPair var6 = var3.getEmptyActionPair();
    var3.shutdown();
    freemind.controller.filter.condition.AttributeNotExistsCondition var9 = new freemind.controller.filter.condition.AttributeNotExistsCondition("hi!");
    javax.swing.JComponent var10 = var9.getListCellRendererComponent();
    freemind.main.XMLElement var11 = new freemind.main.XMLElement();
    java.lang.String var12 = var11.getTagName();
    int var13 = var11.getLineNr();
    int var15 = var11.getIntAttribute("ToolBarUI");
    var9.saveAttributes(var11);
    var3.loadFrom(var11);
    var11.removeChild("OSM MapQuest.Open Map");
    var1.save(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test462");


    freemind.view.mindmapview.attributeview.AttributeTableCellRenderer var0 = new freemind.view.mindmapview.attributeview.AttributeTableCellRenderer();
    int var1 = var0.getDisplayedMnemonic();
    var0.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test463");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    freemind.controller.FreeMindToolBar var3 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var3.requestFocus();
    int var5 = var3.getComponentCount();
    var3.addSeparator();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    boolean var9 = var7.isDoubleBuffered();
    var7.hide();
    int var11 = var3.getComponentIndex((java.awt.Component)var7);
    java.awt.Dimension var12 = var7.getMinimumSize();
    var7.setFocusCycleRoot(true);
    var0.addActionListener((java.awt.event.ActionListener)var7);
    java.lang.String var16 = var0.getApproveButtonToolTipText();
    java.awt.event.ActionListener[] var17 = var0.getActionListeners();
    var0.firePropertyChange("ToolBarUI", 11, (-2147483648));
    freemind.view.mindmapview.MapView.ScrollPane var22 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var23 = var22.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var24 = new accessories.plugins.time.JTripleCalendar();
    boolean var25 = var24.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var26 = var24.getDayChooser();
    java.awt.Color var27 = var26.getSundayForeground();
    var22.setColumnHeaderView((java.awt.Component)var26);
    int var29 = var22.getVerticalScrollBarPolicy();
    javax.swing.plaf.ScrollPaneUI var30 = var22.getUI();
    accessories.plugins.time.JTripleCalendar var31 = new accessories.plugins.time.JTripleCalendar();
    var31.revalidate();
    boolean var33 = var31.isDisplayable();
    freemind.common.FreeMindProgressMonitor var35 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var35.dispose();
    java.awt.event.ContainerListener[] var37 = var35.getContainerListeners();
    java.awt.Rectangle var38 = var35.getBounds();
    var31.repaint(var38);
    java.awt.Rectangle var40 = var22.getBounds(var38);
    var0.repaint(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test464");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      freemind.preferences.layout.KeyEventTranslator.setModifierMapping(1, 200, 8, 31);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test465");


    plugins.script.ScriptEditorPanel.ScriptHolder var2 = new plugins.script.ScriptEditorPanel.ScriptHolder("images/icons/hi!.png", "ButtonUI");
    java.lang.String var3 = var2.getScriptName();
    plugins.script.ScriptEditorPanel.ScriptHolder var5 = var2.setScript("http://a.tile2.opencyclemap.org/transport");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "images/icons/hi!.png"+ "'", var3.equals("images/icons/hi!.png"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test466");


    freemind.modes.filemode.FileMode var0 = new freemind.modes.filemode.FileMode();
    java.lang.String var1 = var0.toString();
    var0.restore("icon_JDayChooser");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "File"+ "'", var1.equals("File"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test467");


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
    java.awt.ComponentOrientation var19 = var8.getComponentOrientation();
    
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

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test468");


    freemind.main.LogFileLogHandler var0 = new freemind.main.LogFileLogHandler();
    accessories.plugins.LogFileViewer var1 = new accessories.plugins.LogFileViewer();
    var0.setLogReceiver((freemind.main.LogFileLogHandler.LogReceiver)var1);
    freemind.main.LogFileLogHandler var3 = new freemind.main.LogFileLogHandler((freemind.main.LogFileLogHandler.LogReceiver)var1);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test469");


    plugins.collaboration.socket.MindMapMaster var0 = new plugins.collaboration.socket.MindMapMaster();
    var0.switchMeOff();
    var0.processUnfinishedLinks();
    freemind.modes.mindmapmode.actions.xml.ActionPair var3 = var0.getEmptyActionPair();
    var0.shutdown();
    freemind.controller.filter.condition.AttributeNotExistsCondition var6 = new freemind.controller.filter.condition.AttributeNotExistsCondition("hi!");
    javax.swing.JComponent var7 = var6.getListCellRendererComponent();
    freemind.main.XMLElement var8 = new freemind.main.XMLElement();
    java.lang.String var9 = var8.getTagName();
    int var10 = var8.getLineNr();
    int var12 = var8.getIntAttribute("ToolBarUI");
    var6.saveAttributes(var8);
    var0.loadFrom(var8);
    freemind.main.XMLElement var15 = new freemind.main.XMLElement();
    int var18 = var15.getProperty("OSM MapQuest.Open Map", 0);
    int var19 = var15.countChildren();
    var8.addChild(var15);
    freemind.common.FreeMindProgressMonitor var23 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var23.revalidate();
    var23.addNotify();
    var23.show();
    accessories.plugins.util.window.WindowClosingAdapter var27 = new accessories.plugins.util.window.WindowClosingAdapter();
    var23.removeWindowStateListener((java.awt.event.WindowStateListener)var27);
    freemind.modes.attributes.ColumnWidthChangeEvent var30 = new freemind.modes.attributes.ColumnWidthChangeEvent((java.lang.Object)var27, 256);
    var15.addProperty("127.0.1.1", (java.lang.Object)256);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test470");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.setFocusableWindowState(true);
    java.util.Locale var6 = var1.getLocale();
    java.awt.event.HierarchyBoundsListener[] var7 = var1.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test471");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    boolean var3 = var0.getControlButtonsAreShown();
    accessories.plugins.time.JTripleCalendar var4 = new accessories.plugins.time.JTripleCalendar();
    boolean var5 = var4.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var6 = var4.getDayChooser();
    accessories.plugins.time.JYearChooser var7 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    var7.repaint(100L, 1, (-1), 100, 1);
    var6.setYearChooser(var7);
    var6.enable();
    var0.addActionListener((java.awt.event.ActionListener)var6);
    int var18 = var0.getApproveButtonMnemonic();
    boolean var19 = var0.getControlButtonsAreShown();
    boolean var20 = var0.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test472");


    freemind.main.LogFileLogHandler var0 = new freemind.main.LogFileLogHandler();
    accessories.plugins.LogFileViewer var1 = new accessories.plugins.LogFileViewer();
    var0.setLogReceiver((freemind.main.LogFileLogHandler.LogReceiver)var1);
    java.util.logging.Level var3 = var0.getLevel();
    freemind.main.LogFileLogHandler var4 = new freemind.main.LogFileLogHandler();
    accessories.plugins.LogFileViewer var5 = new accessories.plugins.LogFileViewer();
    var4.setLogReceiver((freemind.main.LogFileLogHandler.LogReceiver)var5);
    java.util.logging.Level var7 = var4.getLevel();
    var0.setLevel(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test473");


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
    int var13 = var0.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test474");


    plugins.map.TileImage var0 = new plugins.map.TileImage();
    java.awt.image.RenderedImage var1 = var0.getImage();
    boolean var2 = var0.isDrawingDone();
    java.awt.image.RenderedImage var3 = var0.getImage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test475");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.dnd.DropTarget var4 = var1.getDropTarget();
    boolean var5 = var1.isFocused();
    var1.reshape(200, 292278994, 292278994, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test476");


    java.util.Date var1 = freemind.main.Tools.xmlToDate("plugins.map.FreeMindMapController$MapQuestOpenMap");
    accessories.plugins.time.JCalendar var2 = new accessories.plugins.time.JCalendar(var1);
    java.lang.String var3 = freemind.main.Tools.dateToString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1408214452508"+ "'", var3.equals("1408214452508"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test477");


    freemind.controller.LastStateStorageManagement var1 = new freemind.controller.LastStateStorageManagement("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png");
    var1.setLastFocussedTab(1);
    freemind.controller.actions.generated.instance.MindmapLastStateStorage var5 = var1.getStorage("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test478");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.Window.Type var4 = var1.getType();
    boolean var5 = var1.getFocusableWindowState();
    java.awt.Window var6 = var1.getOwner();
    accessories.plugins.util.window.WindowClosingAdapter var8 = new accessories.plugins.util.window.WindowClosingAdapter(false);
    var1.addWindowFocusListener((java.awt.event.WindowFocusListener)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test479");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var1 = var0.getUI();
    java.lang.String var2 = var0.getApproveButtonToolTipText();
    var0.setFileHidingEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test480");


    freemind.main.Resources var3 = freemind.main.Resources.getInstance();
    java.lang.String var5 = var3.getResourceString("");
    freemind.common.ColorProperty var6 = new freemind.common.ColorProperty("file:/home/joao/workspace/\n", "hi!", "file:/home/joao/workspace/\n", (freemind.common.TextTranslator)var3);
    java.lang.String var7 = var6.getDescription();
    var6.setEnabled(false);
    var6.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var7.equals("file:/home/joao/workspace/\n"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test481");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var2 = var0.getTermsOfUseText();
    boolean var3 = var0.requiresAttribution();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test482");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    java.lang.Integer var3 = var0.getNodeFontSize();
    java.lang.Boolean var4 = var0.getNodeFontBold();
    freemind.main.XMLElement var5 = new freemind.main.XMLElement();
    java.lang.String var6 = var5.getTagName();
    java.util.Iterator var7 = var5.enumerateAttributeNames();
    java.util.Vector var9 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var10 = new freemind.modes.StylePattern(var5, (java.util.List)var9);
    boolean var11 = var10.getAppliesToEdge();
    accessories.plugins.time.JTripleCalendar var12 = new accessories.plugins.time.JTripleCalendar();
    boolean var13 = var12.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var14 = var12.getDayChooser();
    accessories.plugins.time.JYearChooser var15 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var16 = var15.getMouseListeners();
    var15.repaint(100L, 1, (-1), 100, 1);
    var14.setYearChooser(var15);
    accessories.plugins.time.JTripleCalendar var24 = new accessories.plugins.time.JTripleCalendar();
    boolean var25 = var24.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var26 = var24.getDayChooser();
    java.awt.Color var27 = var26.getSundayForeground();
    var14.setDecorationBackgroundColor(var27);
    var10.setEdgeColor(var27);
    var0.setNodeBackgroundColor(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test483");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.dispose();
    java.util.Vector var4 = freemind.main.Tools.urlStringToUrls("hi!");
    var1.setIconImages((java.util.List)var4);
    java.util.Locale var6 = var1.getLocale();
    freemind.modes.StylePattern var7 = new freemind.modes.StylePattern();
    var7.setEdgeStyle("hi!");
    freemind.modes.StylePattern var10 = var7.getChildrenStylePattern();
    freemind.modes.StylePattern var11 = new freemind.modes.StylePattern();
    var7.setChildrenStylePattern(var11);
    accessories.plugins.time.JTripleCalendar var13 = new accessories.plugins.time.JTripleCalendar();
    boolean var14 = var13.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var15 = var13.getDayChooser();
    java.awt.Color var16 = var15.getSundayForeground();
    var11.setNodeBackgroundColor(var16);
    var1.setBackground(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var20 = var1.getFocusTraversalKeys(198);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test484");


    java.lang.String[] var3 = new java.lang.String[] { "file:/home/joao/workspace/\n"};
    freemind.main.ExampleFileFilter var4 = new freemind.main.ExampleFileFilter(var3);
    java.lang.String var5 = freemind.main.Tools.arrayToUrls(var3);
    freemind.main.Resources var6 = freemind.main.Resources.getInstance();
    java.net.URL var8 = var6.getResource("file:/home/joao/workspace/\n");
    java.lang.String var10 = var6.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var12 = var6.createTranslatedString("");
    freemind.common.ComboProperty var13 = new freemind.common.ComboProperty("/home/joao/workspace/FreeMind_integration/bin/classes/", "ButtonUI", var3, (freemind.common.TextTranslator)var6);
    java.util.logging.Logger var15 = var6.getLogger("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "file:/home/joao/workspace/file:/home/joao/workspace/%0A\n"+ "'", var5.equals("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test485");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    int var4 = var2.getWidth();
    var2.list();
    freemind.controller.FreeMindToolBar var8 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var8.updateUI();
    var8.setIgnoreRepaint(false);
    javax.swing.Action var12 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var13 = var8.add(var12);
    javax.swing.JButton var14 = var2.add(var12);
    freemind.view.mindmapview.LeftNodeViewLayout var15 = new freemind.view.mindmapview.LeftNodeViewLayout();
    freemind.common.FreeMindProgressMonitor var17 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var17.revalidate();
    var17.addNotify();
    var17.hide();
    var17.setResizable(false);
    var15.removeLayoutComponent((java.awt.Component)var17);
    var14.setLayout((java.awt.LayoutManager)var15);
    accessories.plugins.time.JCalendar var25 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var26 = var25.getCalendar();
    java.util.Date var27 = var25.getMaxSelectableDate();
    java.lang.String var28 = var25.getToolTipText();
    var25.setOpaque(false);
    accessories.plugins.time.JTripleCalendar var31 = new accessories.plugins.time.JTripleCalendar();
    boolean var32 = var31.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var33 = var31.getDayChooser();
    boolean var34 = var33.isDecorationBordersVisible();
    java.util.GregorianCalendar var35 = var33.getTemporaryCalendar();
    var25.setCalendar((java.util.Calendar)var35);
    java.awt.Dimension var37 = var15.preferredLayoutSize((java.awt.Container)var25);
    freemind.modes.HistoryInformation var38 = new freemind.modes.HistoryInformation();
    java.util.Date var39 = var38.getLastModifiedAt();
    java.util.Date var40 = var38.getCreatedAt();
    java.util.Date var41 = var38.getLastModifiedAt();
    var25.setMinSelectableDate(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test486");


    freemind.view.mindmapview.attributeview.AttributeTableCellRenderer var0 = new freemind.view.mindmapview.attributeview.AttributeTableCellRenderer();
    var0.setDisplayedMnemonic('4');
    int var3 = var0.getHorizontalTextPosition();
    var0.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 11);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test487");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.filechooser.FileView var1 = var0.getFileView();
    java.lang.String var2 = var0.getDialogTitle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test488");


    plugins.collaboration.database.DatabaseConnectionHook var0 = new plugins.collaboration.database.DatabaseConnectionHook();
    var0.processUnfinishedLinks();
    var0.onUpdateNodeHook();
    freemind.main.XMLElement var3 = new freemind.main.XMLElement();
    int var6 = var3.getProperty("OSM MapQuest.Open Map", 0);
    java.lang.String var7 = var3.getTagName();
    var0.save(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test489");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.dnd.DropTarget var4 = var1.getDropTarget();
    boolean var5 = var1.isFocused();
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var8 = var7.getInputMethodListeners();
    javax.accessibility.AccessibleContext var9 = var7.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var11 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var11.revalidate();
    var7.setLocationRelativeTo((java.awt.Component)var11);
    boolean var14 = var7.isValidateRoot();
    accessories.plugins.time.JCalendar var15 = new accessories.plugins.time.JCalendar();
    java.awt.Color var16 = var15.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var17 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var18 = var17.getCalendar();
    java.util.Date var19 = var17.getMaxSelectableDate();
    var15.setDate(var19);
    var15.setWeekOfYearVisible(true);
    var7.addPropertyChangeListener((java.beans.PropertyChangeListener)var15);
    accessories.plugins.time.JCalendar var24 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var25 = var24.getCalendar();
    java.util.Date var26 = var24.getMaxSelectableDate();
    var15.setMinSelectableDate(var26);
    var1.addPropertyChangeListener((java.beans.PropertyChangeListener)var15);
    java.awt.Color var29 = var15.getSundayForeground();
    freemind.view.mindmapview.MapView.ScrollPane var30 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var31 = var30.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var32 = new accessories.plugins.time.JTripleCalendar();
    boolean var33 = var32.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var34 = var32.getDayChooser();
    java.awt.Color var35 = var34.getSundayForeground();
    var30.setColumnHeaderView((java.awt.Component)var34);
    java.util.Locale var37 = var34.getLocale();
    javax.swing.JButton var38 = var34.getSelectedDay();
    var38.setDisplayedMnemonicIndex(1);
    int var41 = var38.getMnemonic();
    var38.addNotify();
    var38.setFocusPainted(true);
    javax.swing.Action var45 = javax.swing.TransferHandler.getCutAction();
    var38.setAction(var45);
    var38.setDefaultCapable(false);
    javax.swing.Icon var49 = var38.getDisabledIcon();
    accessories.plugins.time.JMonthChooser var50 = new accessories.plugins.time.JMonthChooser();
    var50.updateUI();
    java.awt.Component var52 = var50.getSpinner();
    var38.removeChangeListener((javax.swing.event.ChangeListener)var50);
    freemind.common.FreeMindProgressMonitor var55 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var56 = var55.getInputMethodListeners();
    javax.accessibility.AccessibleContext var57 = var55.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var59 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var59.revalidate();
    var55.setLocationRelativeTo((java.awt.Component)var59);
    boolean var62 = var55.isValidateRoot();
    accessories.plugins.time.JCalendar var63 = new accessories.plugins.time.JCalendar();
    java.awt.Color var64 = var63.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var65 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var66 = var65.getCalendar();
    java.util.Date var67 = var65.getMaxSelectableDate();
    var63.setDate(var67);
    var63.setWeekOfYearVisible(true);
    var55.addPropertyChangeListener((java.beans.PropertyChangeListener)var63);
    freemind.common.FreeMindProgressMonitor var73 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var73.revalidate();
    var73.addNotify();
    var73.hide();
    java.awt.Container var77 = var73.getFocusCycleRootAncestor();
    freemind.view.mindmapview.LeftNodeViewLayout var78 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var73.setLayout((java.awt.LayoutManager)var78);
    java.awt.Graphics var80 = var73.getGraphics();
    var63.paint(var80);
    var38.print(var80);
    var15.paint(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test490");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.swing.JViewport var1 = var0.getRowHeader();
    boolean var2 = var0.getFocusTraversalKeysEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setHorizontalScrollBarPolicy(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test491");


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
    var2.saveProperties(false);
    
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

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test492");


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
    javax.swing.ImageIcon var12 = freemind.modes.common.plugins.MapNodePositionHolderBase.getMapLocationIcon();
    java.awt.image.ImageObserver var13 = var12.getImageObserver();
    javax.accessibility.AccessibleContext var14 = var12.getAccessibleContext();
    java.lang.String var15 = var12.getDescription();
    var8.setRolloverSelectedIcon((javax.swing.Icon)var12);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "file:/home/joao/workspace/FreeMind_integration/bin/classes/images/map_location.png"+ "'", var15.equals("file:/home/joao/workspace/FreeMind_integration/bin/classes/images/map_location.png"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test493");


    accessories.plugins.ClonePlugin var0 = new accessories.plugins.ClonePlugin();
    var0.registerFilter();
    var0.clearCloneCache();
    var0.setName("node: null, null, images/icons/, null, null, null, null, \nedge: null, hi!, null");

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test494");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    int var4 = var2.getWidth();
    var2.list();
    freemind.controller.FreeMindToolBar var8 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var8.updateUI();
    var8.setIgnoreRepaint(false);
    javax.swing.Action var12 = javax.swing.TransferHandler.getCutAction();
    javax.swing.JButton var13 = var8.add(var12);
    javax.swing.JButton var14 = var2.add(var12);
    var14.setRolloverEnabled(false);
    javax.swing.Icon var17 = var14.getRolloverIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test495");


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
    freemind.controller.BlindIcon var19 = new freemind.controller.BlindIcon((-1));
    var8.setDisabledSelectedIcon((javax.swing.Icon)var19);
    int var21 = var19.getIconWidth();
    freemind.view.mindmapview.MapView.ScrollPane var22 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.swing.plaf.ScrollPaneUI var23 = var22.getUI();
    freemind.view.mindmapview.MapView.ScrollPane var24 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var25 = var24.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var26 = new accessories.plugins.time.JTripleCalendar();
    boolean var27 = var26.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var28 = var26.getDayChooser();
    java.awt.Color var29 = var28.getSundayForeground();
    var24.setColumnHeaderView((java.awt.Component)var28);
    freemind.view.mindmapview.MapView.ScrollPane var31 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var32 = var31.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var33 = new accessories.plugins.time.JTripleCalendar();
    boolean var34 = var33.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var35 = var33.getDayChooser();
    java.awt.Color var36 = var35.getSundayForeground();
    var31.setColumnHeaderView((java.awt.Component)var35);
    javax.swing.JViewport var38 = var31.getColumnHeader();
    var24.setColumnHeader(var38);
    plugins.svg.ExportVectorGraphic var40 = new plugins.svg.ExportVectorGraphic();
    org.apache.batik.svggen.SVGGraphics2D var41 = var40.createSvgGraphics2D();
    var38.paintComponents((java.awt.Graphics)var41);
    var19.paintIcon((java.awt.Component)var22, (java.awt.Graphics)var41, 11, 200);
    
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
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test496");


    freemind.view.mindmapview.attributeview.AttributeTableCellRenderer var0 = new freemind.view.mindmapview.attributeview.AttributeTableCellRenderer();
    int var1 = var0.getDisplayedMnemonic();
    int var2 = var0.getDisplayedMnemonicIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test497");


    freemind.preferences.layout.KeyEventTranslator.Key var3 = new freemind.preferences.layout.KeyEventTranslator.Key("ToolBarUI", 0, '#');
    accessories.plugins.time.JTripleCalendar var4 = new accessories.plugins.time.JTripleCalendar();
    boolean var5 = var4.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var6 = var4.getDayChooser();
    java.awt.Color var7 = var6.getSundayForeground();
    var6.setFocus();
    int var9 = var6.getMaxDayCharacters();
    var6.setMonth(20);
    boolean var12 = var3.equals((java.lang.Object)var6);
    java.awt.Point var13 = var6.getLocation();
    var6.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test498");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    int var7 = var0.getVerticalScrollBarPolicy();
    javax.swing.plaf.ScrollPaneUI var8 = var0.getUI();
    freemind.main.FreeMindApplet var9 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var10 = var9.getFocusTraversalPolicy();
    var9.destroy();
    freemind.controller.Controller var12 = new freemind.controller.Controller((freemind.main.FreeMindMain)var9);
    java.net.URL var14 = var12.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.NodeMouseMotionListener var15 = new freemind.controller.NodeMouseMotionListener(var12);
    var0.removeMouseMotionListener((java.awt.event.MouseMotionListener)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test499");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.main.FreeMindApplet var4 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var5 = var4.getResources();
    var3.setFrame((freemind.main.FreeMindMain)var4);
    freemind.common.OptionalDontShowMeAgainDialog.StandardPropertyHandler var8 = new freemind.common.OptionalDontShowMeAgainDialog.StandardPropertyHandler(var3, "http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png");
    freemind.controller.LastOpenedList var9 = var3.getLastOpenedList();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test500");


    freemind.controller.LastStateStorageManagement var1 = new freemind.controller.LastStateStorageManagement("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png");
    var1.clearTabIndices();
    java.lang.String var3 = var1.getXml();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><mindmap_last_state_map_storage/>"+ "'", var3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><mindmap_last_state_map_storage/>"));

  }

}
