package randoop;

import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test1");


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test2");


    freemind.common.StringProperty var2 = new freemind.common.StringProperty("file:/home/joao/workspace/\n", "ToolBarUI");
    accessories.plugins.time.JTripleCalendar var3 = new accessories.plugins.time.JTripleCalendar();
    var3.revalidate();
    var2.addPropertyChangeListener((java.beans.PropertyChangeListener)var3);
    boolean var6 = var3.getAutoscrolls();
    boolean var7 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var3);
    var3.setFocusable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test3");


    freemind.preferences.layout.OptionPanel.NewTabProperty var2 = new freemind.preferences.layout.OptionPanel.NewTabProperty("", "images/icons/hi!.png");
    java.lang.String var3 = var2.getLabel();
    java.lang.String var4 = var2.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "images/icons/hi!.png"+ "'", var4.equals("images/icons/hi!.png"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test4");


    java.lang.String[] var1 = new java.lang.String[] { "file:/home/joao/workspace/\n"};
    freemind.main.ExampleFileFilter var2 = new freemind.main.ExampleFileFilter(var1);
    java.lang.String var3 = freemind.main.Tools.arrayToUrls(var1);
    freemind.main.ExampleFileFilter var5 = new freemind.main.ExampleFileFilter(var1, ".");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "file:/home/joao/workspace/file:/home/joao/workspace/%0A\n"+ "'", var3.equals("file:/home/joao/workspace/file:/home/joao/workspace/%0A\n"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test5");


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
    java.lang.String var19 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi! filter_does_not_exist"+ "'", var19.equals("hi! filter_does_not_exist"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test6");


    freemind.common.StringProperty var2 = new freemind.common.StringProperty("16", "hi! filter_does_not_exist");

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test7");


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
    freemind.common.FreeMindProgressMonitor var28 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var29 = var28.getInputMethodListeners();
    javax.accessibility.AccessibleContext var30 = var28.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var32 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var32.revalidate();
    var28.setLocationRelativeTo((java.awt.Component)var32);
    boolean var35 = var28.isValidateRoot();
    accessories.plugins.time.JCalendar var36 = new accessories.plugins.time.JCalendar();
    java.awt.Color var37 = var36.getDecorationBackgroundColor();
    accessories.plugins.time.JCalendar var38 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var39 = var38.getCalendar();
    java.util.Date var40 = var38.getMaxSelectableDate();
    var36.setDate(var40);
    var36.setWeekOfYearVisible(true);
    var28.addPropertyChangeListener((java.beans.PropertyChangeListener)var36);
    accessories.plugins.time.JCalendar var45 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var46 = var45.getCalendar();
    java.util.Date var47 = var45.getMaxSelectableDate();
    var36.setMinSelectableDate(var47);
    accessories.plugins.time.JCalendar var50 = new accessories.plugins.time.JCalendar(var47, false);
    accessories.plugins.time.JTripleCalendar var51 = new accessories.plugins.time.JTripleCalendar();
    boolean var52 = var51.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var53 = var51.getDayChooser();
    javax.swing.JRootPane var54 = var51.getRootPane();
    accessories.plugins.time.JDayChooser var55 = var51.getDayChooser();
    java.util.Locale var56 = var51.getLocale();
    accessories.plugins.time.JCalendar var59 = new accessories.plugins.time.JCalendar(var47, var56, true, true);
    java.util.Date var60 = var4.setMinSelectableDate(var47);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test8");


    plugins.collaboration.socket.SocketConnectionHook var0 = new plugins.collaboration.socket.SocketConnectionHook();
    plugins.collaboration.socket.MindMapMaster var1 = new plugins.collaboration.socket.MindMapMaster();
    var1.switchMeOff();
    freemind.main.XMLElement var3 = new freemind.main.XMLElement();
    java.lang.String var4 = var3.getTagName();
    java.util.Iterator var5 = var3.enumerateAttributeNames();
    var1.save(var3);
    var0.loadFrom(var3);
    freemind.controller.filter.condition.AttributeCompareCondition var13 = new freemind.controller.filter.condition.AttributeCompareCondition("file:/home/joao/workspace/\n", "<a,23>", true, (-1), true);
    freemind.main.XMLElement var14 = new freemind.main.XMLElement();
    java.lang.String var15 = var14.getTagName();
    java.util.Iterator var16 = var14.enumerateAttributeNames();
    java.lang.String var17 = var14.toString();
    java.lang.Object var19 = var14.getAttribute("images/icons/hi!.png");
    var13.save(var14);
    freemind.modes.common.plugins.MapNodePositionHolderBase var22 = new freemind.modes.common.plugins.MapNodePositionHolderBase();
    var14.setAttribute("open map", (java.lang.Object)var22);
    var0.save(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test9");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    freemind.common.FreeMindProgressMonitor var3 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var4 = var3.getInputMethodListeners();
    var0.addAll((java.lang.Object[])var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test10");


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
    var1.transferFocus();
    
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

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test11");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var1 = var0.getUI();
    java.io.File[] var2 = var0.getSelectedFiles();
    java.lang.String var3 = var0.getApproveButtonToolTipText();
    var0.setDialogTitle("127.0.1.1");
    java.io.File var6 = var0.getCurrentDirectory();
    var0.setApproveButtonMnemonic(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test12");


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
    java.lang.String[] var11 = var0.getBarePosition();
    org.openstreetmap.gui.jmapviewer.Coordinate var12 = var0.getPosition();
    
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
    assertNotNull(var12);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test13");


    freemind.preferences.layout.KeyEventTranslator.Key var3 = new freemind.preferences.layout.KeyEventTranslator.Key("", 10, '#');
    java.lang.String var4 = var3.toString();
    freemind.common.NamedObject var6 = new freemind.common.NamedObject((java.lang.Object)var4, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "<a,23>"+ "'", var4.equals("<a,23>"));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test14");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    boolean var3 = var0.contains(10, 8);
    int var4 = var0.getMaxDayCharacters();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test15");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    var0.reshape((-1), 59, 292278994, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test16");


    freemind.controller.filter.condition.SelectedViewCondition var0 = new freemind.controller.filter.condition.SelectedViewCondition();
    freemind.main.XMLElement var1 = new freemind.main.XMLElement();
    int var4 = var1.getProperty("OSM MapQuest.Open Map", 0);
    int var7 = var1.getIntAttribute("//openstreetmap.org/", 7);
    freemind.controller.filter.condition.IconContainedCondition var9 = new freemind.controller.filter.condition.IconContainedCondition("");
    freemind.main.XMLElement var10 = new freemind.main.XMLElement();
    java.lang.String var11 = var10.getTagName();
    var9.save(var10);
    var1.removeChild(var10);
    var0.save(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test17");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    java.awt.Color var3 = var2.getSundayForeground();
    freemind.view.mindmapview.MapView.ScrollPane var4 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var5 = var4.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var6 = new accessories.plugins.time.JTripleCalendar();
    boolean var7 = var6.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var8 = var6.getDayChooser();
    java.awt.Color var9 = var8.getSundayForeground();
    var4.setColumnHeaderView((java.awt.Component)var8);
    var8.setAlwaysFireDayProperty(true);
    var8.reshape(292278994, 292278994, 2014, 11);
    freemind.controller.filter.util.SortedMapVector var18 = new freemind.controller.filter.util.SortedMapVector();
    freemind.modes.StylePattern var20 = new freemind.modes.StylePattern();
    var20.setEdgeStyle("hi!");
    freemind.modes.StylePattern var23 = var20.getChildrenStylePattern();
    freemind.modes.StylePattern var24 = new freemind.modes.StylePattern();
    var20.setChildrenStylePattern(var24);
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
    var20.setNodeColor(var41);
    int var44 = var18.add((java.lang.Comparable)"joao@BetelgeuseLX", (java.lang.Object)var41);
    var8.setForeground(var41);
    var2.setForeground(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
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
    assertNull(var23);
    
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
    assertTrue(var44 == 0);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test18");


    freemind.controller.filter.condition.JCondition var0 = new freemind.controller.filter.condition.JCondition();
    freemind.common.FreeMindProgressMonitor var2 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var3 = var2.getInputMethodListeners();
    var2.show();
    java.lang.String var5 = var2.getTitle();
    freemind.common.FreeMindProgressMonitor var7 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var7.revalidate();
    var7.addNotify();
    var7.setFocusTraversalPolicyProvider(false);
    java.awt.Point var12 = var7.location();
    var2.setLocation(var12);
    java.awt.Component var14 = var0.findComponentAt(var12);
    java.lang.String var15 = freemind.main.Tools.PointToXml(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var5.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "59;24;"+ "'", var15.equals("59;24;"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test19");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isMultiSelectionEnabled();
    boolean var2 = var0.isMultipleMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test20");


    freemind.modes.HistoryInformation var0 = new freemind.modes.HistoryInformation();
    java.util.Date var1 = var0.getLastModifiedAt();
    java.util.Date var2 = var0.getCreatedAt();
    java.util.Date var3 = var0.getLastModifiedAt();
    java.util.Date var4 = var0.getCreatedAt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test21");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    accessories.plugins.time.JYearChooser var3 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var4 = var3.getMouseListeners();
    var3.repaint(100L, 1, (-1), 100, 1);
    var2.setYearChooser(var3);
    var2.enable();
    java.awt.Graphics var13 = var2.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test22");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    boolean var3 = var2.isDecorationBordersVisible();
    java.util.GregorianCalendar var4 = var2.getTemporaryCalendar();
    accessories.plugins.time.JCalendar var5 = new accessories.plugins.time.JCalendar((java.util.Calendar)var4);
    accessories.plugins.time.JCalendar var6 = new accessories.plugins.time.JCalendar((java.util.Calendar)var4);
    java.lang.Object var7 = var6.getTreeLock();
    java.awt.Rectangle var8 = var6.bounds();
    
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

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test23");


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
    accessories.plugins.time.JTripleCalendar var13 = new accessories.plugins.time.JTripleCalendar();
    boolean var14 = var13.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var15 = var13.getDayChooser();
    javax.swing.JRootPane var16 = var13.getRootPane();
    accessories.plugins.time.JDayChooser var17 = var13.getDayChooser();
    var12.removePropertyChangeListener((java.beans.PropertyChangeListener)var13);
    boolean var19 = var13.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test24");


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
    freemind.controller.filter.util.ExtendedComboBoxModel var21 = new freemind.controller.filter.util.ExtendedComboBoxModel(var11);
    freemind.controller.filter.util.ExtendedComboBoxModel var22 = new freemind.controller.filter.util.ExtendedComboBoxModel(var11);
    
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

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test25");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    boolean var3 = var2.isLightweight();
    javax.swing.plaf.ToolBarUI var4 = var2.getUI();
    accessories.plugins.time.JSpinField var7 = new accessories.plugins.time.JSpinField(10, 1);
    var7.setValue(292278994);
    java.awt.event.ContainerListener[] var10 = var7.getContainerListeners();
    java.awt.Dimension var11 = var7.getMinimumSize();
    int var12 = var2.getComponentIndex((java.awt.Component)var7);
    freemind.view.mindmapview.MapView.ScrollPane var13 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var14 = var13.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var15 = new accessories.plugins.time.JTripleCalendar();
    boolean var16 = var15.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var17 = var15.getDayChooser();
    java.awt.Color var18 = var17.getSundayForeground();
    var13.setColumnHeaderView((java.awt.Component)var17);
    java.util.Locale var20 = var17.getLocale();
    javax.swing.JButton var21 = var17.getSelectedDay();
    java.lang.String var22 = var21.getUIClassID();
    freemind.common.FreeMindProgressMonitor var24 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var24.revalidate();
    var24.addNotify();
    var24.setFocusTraversalPolicyProvider(false);
    java.awt.Point var29 = var24.location();
    boolean var30 = var21.contains(var29);
    boolean var31 = var21.isContentAreaFilled();
    freemind.view.mindmapview.MindMapLayout var32 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var35 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var35.requestFocus();
    javax.swing.InputVerifier var37 = var35.getInputVerifier();
    var32.removeLayoutComponent((java.awt.Component)var35);
    var21.setLayout((java.awt.LayoutManager)var32);
    accessories.plugins.time.JTripleCalendar var41 = new accessories.plugins.time.JTripleCalendar();
    var41.requestFocus();
    accessories.plugins.time.JCalendar var43 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var44 = var43.getCalendar();
    var41.setCalendar(var44);
    accessories.plugins.time.JYearChooser var46 = var41.getYearChooser();
    freemind.common.FreeMindProgressMonitor var48 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var48.revalidate();
    var48.addNotify();
    java.awt.event.WindowListener[] var51 = var48.getWindowListeners();
    java.lang.Object var52 = var46.getClientProperty((java.lang.Object)var48);
    var32.addLayoutComponent("png", (java.awt.Component)var48);
    var2.setLayout((java.awt.LayoutManager)var32);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "ButtonUI"+ "'", var22.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test26");


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
    var8.setValue(10);
    
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

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test27");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.lang.String var3 = var0.getResourceString("file:/home/joao/workspace/\n", "file:/home/joao/workspace/\n");
    java.lang.String var5 = var0.getText("hi!");
    boolean var7 = var0.getBoolProperty("");
    java.util.HashMap var8 = var0.getCountryMap();
    java.util.logging.Logger var10 = var0.getLogger("images/icons/hi!.png");
    
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
    assertNotNull(var10);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test28");


    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var1 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var2 = var1.createReader();
    boolean var3 = var2.ready();
    long var5 = var2.skip(100L);
    var2.mark(200);
    boolean var8 = var2.markSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 9L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test29");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isMultiSelectionEnabled();
    var0.setLocationByPlatform(false);
    freemind.main.ExampleFileFilter var5 = new freemind.main.ExampleFileFilter();
    var5.setExtensionListInDescription(false);
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var5);
    freemind.modes.FreeMindJFileDialog var9 = new freemind.modes.FreeMindJFileDialog();
    freemind.controller.FreeMindToolBar var12 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var12.requestFocus();
    int var14 = var12.getComponentCount();
    var12.addSeparator();
    accessories.plugins.time.JYearChooser var16 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var17 = var16.getMouseListeners();
    boolean var18 = var16.isDoubleBuffered();
    var16.hide();
    int var20 = var12.getComponentIndex((java.awt.Component)var16);
    java.awt.Dimension var21 = var16.getMinimumSize();
    var16.setFocusCycleRoot(true);
    var9.addActionListener((java.awt.event.ActionListener)var16);
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
    boolean var41 = var9.accept(var39);
    boolean var42 = var5.accept(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test30");


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
    java.lang.Integer var13 = var4.getEdgeWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 292278994+ "'", var13.equals(292278994));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test31");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    java.lang.Integer var3 = var0.getNodeFontSize();
    java.lang.Boolean var4 = var0.getNodeFontBold();
    boolean var5 = var0.getRecursive();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test32");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    javax.accessibility.AccessibleContext var3 = var1.getAccessibleContext();
    freemind.common.FreeMindProgressMonitor var5 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var5.revalidate();
    var1.setLocationRelativeTo((java.awt.Component)var5);
    boolean var8 = var1.isValidateRoot();
    var1.hide();
    var1.setFocusableWindowState(false);
    freemind.view.mindmapview.MapView.ScrollPane var12 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var13 = var12.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var14 = new accessories.plugins.time.JTripleCalendar();
    boolean var15 = var14.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var16 = var14.getDayChooser();
    java.awt.Color var17 = var16.getSundayForeground();
    var12.setColumnHeaderView((java.awt.Component)var16);
    freemind.view.mindmapview.MapView.ScrollPane var19 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var20 = var19.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var21 = new accessories.plugins.time.JTripleCalendar();
    boolean var22 = var21.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var23 = var21.getDayChooser();
    java.awt.Color var24 = var23.getSundayForeground();
    var19.setColumnHeaderView((java.awt.Component)var23);
    javax.swing.JViewport var26 = var19.getColumnHeader();
    var12.setColumnHeader(var26);
    plugins.svg.ExportVectorGraphic var28 = new plugins.svg.ExportVectorGraphic();
    org.apache.batik.svggen.SVGGraphics2D var29 = var28.createSvgGraphics2D();
    var26.paintComponents((java.awt.Graphics)var29);
    var1.paint((java.awt.Graphics)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test33");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.Window.Type var4 = var1.getType();
    boolean var5 = var1.getFocusableWindowState();
    java.awt.Window var6 = var1.getOwner();
    freemind.common.FreeMindProgressMonitor var8 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var8.dispose();
    java.util.Vector var11 = freemind.main.Tools.urlStringToUrls("hi!");
    var8.setIconImages((java.util.List)var11);
    java.util.Locale var13 = var8.getLocale();
    java.awt.image.VolatileImage var16 = var8.createVolatileImage(2014, 100);
    freemind.view.mindmapview.MapView.ScrollPane var17 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var18 = var17.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var19 = new accessories.plugins.time.JTripleCalendar();
    boolean var20 = var19.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var21 = var19.getDayChooser();
    java.awt.Color var22 = var21.getSundayForeground();
    var17.setColumnHeaderView((java.awt.Component)var21);
    java.awt.Point var24 = var17.location();
    java.awt.Dimension var25 = var17.getMaximumSize();
    var8.setMinimumSize(var25);
    var6.setMinimumSize(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
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

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test34");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    int var2 = var0.getTileSize();
    double var5 = var0.tileXToLon(292278994, 8);
    java.lang.String var6 = var0.getAttributionImageURL();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 256);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 4.110171553125E8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test35");


    freemind.common.NumberProperty var5 = new freemind.common.NumberProperty("//openstreetmap.org/", "PositionHolder [lat=10.0, lon=1.0, zoom=100]", 100, 100, 200);
    var5.setEnabled(false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test36");


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
    java.util.Locale var20 = var8.getLocale();
    
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
    assertNotNull(var20);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test37");


    freemind.modes.filemode.FileMode var0 = new freemind.modes.filemode.FileMode();
    java.lang.String var1 = var0.toString();
    freemind.modes.ModeController var2 = var0.getDefaultModeController();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "File"+ "'", var1.equals("File"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test38");


    freemind.main.LogFileLogHandler var0 = new freemind.main.LogFileLogHandler();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setEncoding("6");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test39");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isMultiSelectionEnabled();
    freemind.controller.filter.condition.IconContainedCondition var3 = new freemind.controller.filter.condition.IconContainedCondition("");
    freemind.main.XMLElement var4 = new freemind.main.XMLElement();
    java.lang.String var5 = var4.getTagName();
    var3.save(var4);
    javax.swing.JComponent var7 = var3.getListCellRendererComponent();
    java.awt.Color var8 = var7.getBackground();
    var0.setBackground(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test40");


    freemind.modes.StylePattern var0 = new freemind.modes.StylePattern();
    var0.setEdgeStyle("hi!");
    freemind.modes.StylePattern var3 = var0.getChildrenStylePattern();
    freemind.modes.StylePattern var4 = new freemind.modes.StylePattern();
    var0.setChildrenStylePattern(var4);
    var4.setEdgeWidth((java.lang.Integer)292278994);
    boolean var8 = var4.getAppliesToNodeFont();
    var4.setNodeFontItalic((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test41");


    java.util.Date var1 = freemind.main.Tools.xmlToDate(".");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test42");


    freemind.view.mindmapview.attributeview.AttributeTableCellRenderer var0 = new freemind.view.mindmapview.attributeview.AttributeTableCellRenderer();
    var0.setDisplayedMnemonic('4');
    int var3 = var0.getHorizontalTextPosition();
    int var4 = var0.getVerticalTextPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test43");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    boolean var1 = var0.isActive();
    java.io.File var2 = var0.getPatternsFile();
    var0.setProperty("<a,23>", "<a,23>");
    freemind.extensions.ImportWizard var6 = new freemind.extensions.ImportWizard((freemind.main.FreeMindMain)var0);
    java.lang.String[] var10 = new java.lang.String[] { "/home/joao/workspace/FreeMind_integration/bin/classes/"};
    freemind.main.Resources var11 = freemind.main.Resources.getInstance();
    java.net.URL var13 = var11.getResource("file:/home/joao/workspace/\n");
    java.lang.String var15 = var11.getProperty("OSM MapQuest.Open Map");
    freemind.common.NamedObject var17 = var11.createTranslatedString("");
    freemind.common.ComboProperty var18 = new freemind.common.ComboProperty(".", "<a,23>", var10, (freemind.common.TextTranslator)var11);
    freemind.main.XMLElement var19 = new freemind.main.XMLElement();
    java.lang.String var20 = var19.getTagName();
    java.util.Iterator var21 = var19.enumerateAttributeNames();
    java.util.Vector var23 = freemind.main.Tools.urlStringToUrls("control");
    freemind.modes.StylePattern var24 = new freemind.modes.StylePattern(var19, (java.util.List)var23);
    accessories.plugins.time.JTripleCalendar var25 = new accessories.plugins.time.JTripleCalendar();
    boolean var26 = var25.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var27 = var25.getDayChooser();
    javax.swing.JRootPane var28 = var25.getRootPane();
    java.util.Vector var29 = freemind.main.Tools.getVectorWithSingleElement((java.lang.Object)var25);
    var18.updateComboBoxEntries((java.util.List)var23, (java.util.List)var29);
    freemind.modes.FreeMindJFileDialog var31 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var32 = var31.getUI();
    java.io.File[] var33 = var31.getSelectedFiles();
    java.lang.String var34 = var31.getApproveButtonToolTipText();
    var31.setDialogTitle("127.0.1.1");
    java.io.File var37 = var31.getCurrentDirectory();
    freemind.main.Tools.setHidden(var37, false, true);
    freemind.modes.FreeMindJFileDialog var41 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var42 = var41.getUI();
    java.io.File[] var43 = var41.getSelectedFiles();
    java.lang.String var44 = var41.getApproveButtonToolTipText();
    var41.setDialogTitle("127.0.1.1");
    java.io.File var47 = var41.getCurrentDirectory();
    var6.addClassesFromDir(var29, var37, var47, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test44");


    java.lang.String var1 = freemind.main.HtmlTools.toXMLUnescapedText("joao");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "joao"+ "'", var1.equals("joao"));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test45");


    freemind.main.LogFileLogHandler var0 = new freemind.main.LogFileLogHandler();
    accessories.plugins.LogFileViewer var1 = new accessories.plugins.LogFileViewer();
    var0.setLogReceiver((freemind.main.LogFileLogHandler.LogReceiver)var1);
    java.util.logging.Level var3 = var0.getLevel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setEncoding("control");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test46");


    plugins.script.ScriptingSecurityManager var3 = new plugins.script.ScriptingSecurityManager(false, false, true);
    var3.checkLink("hi!");
    var3.checkSecurityAccess("//otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png");

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test47");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    plugins.map.FreeMindMapController.MapQuestOpenMap var2 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var3 = var2.getName();
    boolean var4 = freemind.main.Tools.safeEquals((java.lang.Object)var0, (java.lang.Object)var3);
    java.util.Iterator var5 = var0.iterator();
    var0.remove((java.lang.Object)"icon_hi!");
    freemind.modes.browsemode.BrowseReminderHook var8 = new freemind.modes.browsemode.BrowseReminderHook();
    freemind.modes.common.plugins.ReminderHookBase.TimerBlinkTask var10 = var8.new TimerBlinkTask(true);
    int var11 = var0.getIndexOf((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test48");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    freemind.controller.NodeDragListener var5 = new freemind.controller.NodeDragListener(var3);
    var3.setAntialiasEdges(false);
    freemind.controller.MenuBar var8 = new freemind.controller.MenuBar(var3);
    java.awt.Component var9 = var8.getComponent();
    java.awt.Component var11 = var8.getComponentAtIndex(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test49");


    freemind.main.XMLElement var0 = new freemind.main.XMLElement();
    java.lang.String var1 = var0.getTagName();
    java.util.Iterator var2 = var0.enumerateAttributeNames();
    java.util.Iterator var3 = var0.enumeratePropertyNames();
    java.lang.String var6 = var0.getProperty("ToolBarUI", "plugins.map.FreeMindMapController$MapQuestOpenMap");
    accessories.plugins.time.JTripleCalendar var8 = new accessories.plugins.time.JTripleCalendar();
    boolean var9 = var8.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var10 = var8.getDayChooser();
    accessories.plugins.time.JYearChooser var11 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var12 = var11.getMouseListeners();
    var11.repaint(100L, 1, (-1), 100, 1);
    var10.setYearChooser(var11);
    var0.setAttribute("//openstreetmap.org/", (java.lang.Object)var10);
    double var23 = var0.getDoubleAttribute(".*(open map).*", Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "plugins.map.FreeMindMapController$MapQuestOpenMap"+ "'", var6.equals("plugins.map.FreeMindMapController$MapQuestOpenMap"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == Double.NaN);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test50");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var1 = var0.getResources();
    freemind.modes.mindmapmode.hooks.MindMapHookFactory var2 = new freemind.modes.mindmapmode.hooks.MindMapHookFactory((freemind.main.FreeMindMain)var0);
    freemind.main.FreeMindApplet var4 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var5 = var4.getFocusTraversalPolicy();
    var4.destroy();
    freemind.controller.Controller var7 = new freemind.controller.Controller((freemind.main.FreeMindMain)var4);
    freemind.main.FreeMindApplet var8 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var9 = var8.getResources();
    var7.setFrame((freemind.main.FreeMindMain)var8);
    freemind.main.FreeMindApplet var11 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var12 = var11.getFocusTraversalPolicy();
    var11.destroy();
    freemind.controller.Controller var14 = new freemind.controller.Controller((freemind.main.FreeMindMain)var11);
    freemind.controller.NodeDropListener var15 = new freemind.controller.NodeDropListener(var14);
    freemind.controller.Controller.PropertyAction var16 = var7.new PropertyAction(var14);
    accessories.plugins.time.JTripleCalendar var17 = new accessories.plugins.time.JTripleCalendar();
    boolean var18 = var17.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var19 = var17.getDayChooser();
    javax.swing.JRootPane var20 = var17.getRootPane();
    accessories.plugins.time.JDayChooser var21 = var17.getDayChooser();
    var16.removePropertyChangeListener((java.beans.PropertyChangeListener)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.decorateAction("joao", (javax.swing.AbstractAction)var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test51");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.lang.String var4 = var1.getTitle();
    javax.swing.Action var5 = javax.swing.TransferHandler.getCutAction();
    freemind.main.Tools.addKeyActionToDialog((javax.swing.JDialog)var1, var5, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><compound_action/>", "Arrow_ID_515901044");
    java.awt.Toolkit var9 = var1.getToolkit();
    java.awt.Dialog.ModalityType var10 = var1.getModalityType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var4.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test52");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    var1.hide();
    java.awt.Container var5 = var1.getFocusCycleRootAncestor();
    freemind.view.mindmapview.LeftNodeViewLayout var6 = new freemind.view.mindmapview.LeftNodeViewLayout();
    var1.setLayout((java.awt.LayoutManager)var6);
    freemind.controller.FreeMindToolBar var10 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var10.requestFocus();
    int var12 = var10.getComponentCount();
    var10.addSeparator();
    accessories.plugins.time.JYearChooser var14 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var15 = var14.getMouseListeners();
    boolean var16 = var14.isDoubleBuffered();
    var14.hide();
    int var18 = var10.getComponentIndex((java.awt.Component)var14);
    var14.setMinimum(256);
    int var21 = var14.getDebugGraphicsOptions();
    var1.setGlassPane((java.awt.Component)var14);
    int var23 = var14.getEndYear();
    var14.setName("eNoDAAAAAAE=");
    accessories.plugins.time.JMonthChooser var26 = new accessories.plugins.time.JMonthChooser();
    var26.updateUI();
    java.awt.Dimension var28 = var26.preferredSize();
    var14.setMinimumSize(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test53");


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
    javax.swing.plaf.ButtonUI var12 = var8.getUI();
    
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

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test54");


    accessories.plugins.time.JMonthChooser var1 = new accessories.plugins.time.JMonthChooser(false);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test55");


    boolean var0 = freemind.main.Tools.isHeadless();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test56");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.updateUI();
    java.lang.Object var4 = var2.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test57");


    freemind.common.StringProperty var2 = new freemind.common.StringProperty("OSM MapQuest.Open Map", "hi!");
    java.lang.String var3 = var2.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OSM MapQuest.Open Map"+ "'", var3.equals("OSM MapQuest.Open Map"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test58");


    freemind.controller.filter.util.SortedComboBoxModel var0 = new freemind.controller.filter.util.SortedComboBoxModel();
    java.lang.Object var1 = var0.getSelectedItem();
    int var2 = var0.getSize();
    javax.swing.event.ListDataListener[] var3 = var0.getListDataListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test59");


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
    accessories.plugins.time.JTripleCalendar var11 = new accessories.plugins.time.JTripleCalendar();
    var11.setVerifyInputWhenFocusTarget(true);
    java.awt.event.HierarchyBoundsListener[] var14 = var11.getHierarchyBoundsListeners();
    java.awt.Component var15 = var1.add((java.awt.Component)var11);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test60");


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
    var1.toBack();
    var1.show();
    
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

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test61");


    accessories.plugins.time.JTripleCalendar var0 = new accessories.plugins.time.JTripleCalendar();
    boolean var1 = var0.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var2 = var0.getDayChooser();
    javax.swing.JRootPane var3 = var0.getRootPane();
    java.util.Vector var4 = freemind.main.Tools.getVectorWithSingleElement((java.lang.Object)var0);
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "accessories.plugins.time.JTripleCalendar[JTripleCalendar,0,0,0var5,invalid,layout=java.awt.GridLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var5.equals("accessories.plugins.time.JTripleCalendar[JTripleCalendar,0,0,0var5,invalid,layout=java.awt.GridLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test62");


    accessories.plugins.time.JCalendar var1 = new accessories.plugins.time.JCalendar(false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test63");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    javax.swing.JViewport var7 = var0.getColumnHeader();
    var7.reshape(8, 292278994, 7, (-2147483648));
    accessories.plugins.time.JYearChooser var13 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var14 = var13.getMouseListeners();
    java.awt.Dimension var15 = var13.minimumSize();
    java.awt.Dimension var16 = var7.getSize(var15);
    var7.repaint(100L, (-2147483648), 200, 59, 256);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test64");


    plugins.map.FreeMindMapController.MapQuestOpenMap var0 = new plugins.map.FreeMindMapController.MapQuestOpenMap();
    java.lang.String var1 = var0.getName();
    java.lang.String var2 = var0.getTermsOfUseText();
    var0.setTermsOfUseText("control");
    java.lang.String var5 = var0.getAttributionLinkURL();
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
    plugins.map.FreeMindMapController.PositionHolder var31 = new plugins.map.FreeMindMapController.PositionHolder(10.0d, 1.0d, 100);
    org.openstreetmap.gui.jmapviewer.Coordinate var32 = var31.getCoordinate();
    plugins.map.MapNodePositionHolder var33 = new plugins.map.MapNodePositionHolder();
    freemind.main.XMLElement var34 = new freemind.main.XMLElement();
    java.lang.String var35 = var34.getTagName();
    java.util.Iterator var36 = var34.enumerateAttributeNames();
    java.util.Iterator var37 = var34.enumeratePropertyNames();
    var33.loadFrom(var34);
    freemind.main.XMLElement var39 = new freemind.main.XMLElement();
    java.lang.String var40 = var39.getTagName();
    java.util.Iterator var41 = var39.enumerateAttributeNames();
    java.util.Iterator var42 = var39.enumeratePropertyNames();
    var33.loadFrom(var39);
    org.openstreetmap.gui.jmapviewer.Coordinate var44 = var33.getPosition();
    java.lang.String var46 = plugins.map.FreeMindMapController.getLink("plugins.map.FreeMindMapController$MapQuestOpenMap", var32, var44, 200);
    java.lang.String var47 = var0.getAttributionText(256, var12, var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OSM MapQuest.Open Map"+ "'", var1.equals("OSM MapQuest.Open Map"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "http://openstreetmap.org/"+ "'", var5.equals("http://openstreetmap.org/"));
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=200&layers=Q"+ "'", var46.equals("http://www.openstreetmap.org/?mlat=10.0&mlon=1.0&lat=0.0&lon=0.0&zoom=200&layers=Q"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "\u00A9 OpenStreetMap contributors, CC-BY-SA "+ "'", var47.equals("\u00A9 OpenStreetMap contributors, CC-BY-SA "));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test65");


    freemind.controller.filter.util.SortedMapVector var0 = new freemind.controller.filter.util.SortedMapVector();
    var0.clear();
    freemind.view.mindmapview.MapView.ScrollPane var2 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var3 = var2.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var4 = new accessories.plugins.time.JTripleCalendar();
    boolean var5 = var4.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var6 = var4.getDayChooser();
    java.awt.Color var7 = var6.getSundayForeground();
    var2.setColumnHeaderView((java.awt.Component)var6);
    var6.setAlwaysFireDayProperty(true);
    var6.reshape(292278994, 292278994, 2014, 11);
    freemind.controller.filter.util.SortedMapVector var16 = new freemind.controller.filter.util.SortedMapVector();
    freemind.modes.StylePattern var18 = new freemind.modes.StylePattern();
    var18.setEdgeStyle("hi!");
    freemind.modes.StylePattern var21 = var18.getChildrenStylePattern();
    freemind.modes.StylePattern var22 = new freemind.modes.StylePattern();
    var18.setChildrenStylePattern(var22);
    accessories.plugins.time.JTripleCalendar var24 = new accessories.plugins.time.JTripleCalendar();
    boolean var25 = var24.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var26 = var24.getDayChooser();
    accessories.plugins.time.JYearChooser var27 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var28 = var27.getMouseListeners();
    var27.repaint(100L, 1, (-1), 100, 1);
    var26.setYearChooser(var27);
    accessories.plugins.time.JTripleCalendar var36 = new accessories.plugins.time.JTripleCalendar();
    boolean var37 = var36.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var38 = var36.getDayChooser();
    java.awt.Color var39 = var38.getSundayForeground();
    var26.setDecorationBackgroundColor(var39);
    var18.setNodeColor(var39);
    int var42 = var16.add((java.lang.Comparable)"joao@BetelgeuseLX", (java.lang.Object)var39);
    var6.setForeground(var39);
    accessories.plugins.time.JCalendar var44 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var45 = var44.getCalendar();
    var6.setCalendar(var45);
    freemind.main.XMLElement var47 = new freemind.main.XMLElement();
    java.lang.String var48 = var47.getTagName();
    java.util.Iterator var49 = var47.enumerateAttributeNames();
    java.util.Iterator var50 = var47.enumeratePropertyNames();
    java.lang.String var53 = var47.getProperty("ToolBarUI", "plugins.map.FreeMindMapController$MapQuestOpenMap");
    int var54 = var0.add((java.lang.Comparable)var45, (java.lang.Object)"ToolBarUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "plugins.map.FreeMindMapController$MapQuestOpenMap"+ "'", var53.equals("plugins.map.FreeMindMapController$MapQuestOpenMap"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test66");


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
    java.io.File[] var16 = var0.getSelectedFiles();
    var0.resetChoosableFileFilters();
    int var18 = var0.getDialogType();
    javax.accessibility.AccessibleContext var19 = var0.getAccessibleContext();
    var0.setApproveButtonText("plugins.map.FreeMindMapController$MapQuestOpenMap");
    
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
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test67");


    freemind.modes.FreeMindAwtFileDialog var0 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var1 = var0.isMultiSelectionEnabled();
    var0.setFocusTraversalPolicyProvider(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test68");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    boolean var7 = var0.isPaintingTile();
    javax.swing.JScrollBar var8 = var0.createHorizontalScrollBar();
    freemind.view.mindmapview.MindMapLayout var9 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var12 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var12.requestFocus();
    javax.swing.InputVerifier var14 = var12.getInputVerifier();
    var9.removeLayoutComponent((java.awt.Component)var12);
    accessories.plugins.time.JYearChooser var16 = new accessories.plugins.time.JYearChooser();
    java.awt.event.MouseListener[] var17 = var16.getMouseListeners();
    var9.removeLayoutComponent((java.awt.Component)var16);
    var16.addNotify();
    boolean var20 = var0.isFocusCycleRoot((java.awt.Container)var16);
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test69");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    boolean var2 = var0.isApplet();
    java.util.Properties var3 = var0.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test70");


    freemind.controller.FreeMindToolBar var2 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var2.requestFocus();
    int var4 = var2.getComponentCount();
    var2.addSeparator();
    freemind.controller.StructuredMenuItemHolder var6 = new freemind.controller.StructuredMenuItemHolder();
    javax.swing.JMenuItem var7 = var6.getMenuItem();
    javax.swing.Action var8 = javax.swing.TransferHandler.getCutAction();
    var6.setAction(var8);
    javax.swing.JButton var10 = var2.add(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test71");


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
    accessories.plugins.time.JTripleCalendar var43 = new accessories.plugins.time.JTripleCalendar();
    boolean var44 = var43.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var45 = var43.getDayChooser();
    javax.swing.JRootPane var46 = var43.getRootPane();
    java.util.Vector var47 = freemind.main.Tools.getVectorWithSingleElement((java.lang.Object)var43);
    java.awt.Dimension var48 = var5.maximumLayoutSize((java.awt.Container)var43);
    int var49 = var5.getVgap();
    
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
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test72");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    var1.addNotify();
    java.awt.event.WindowListener[] var4 = var1.getWindowListeners();
    freemind.view.mindmapview.MindMapLayout var5 = new freemind.view.mindmapview.MindMapLayout();
    freemind.controller.FreeMindToolBar var8 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var8.requestFocus();
    javax.swing.InputVerifier var10 = var8.getInputVerifier();
    var5.removeLayoutComponent((java.awt.Component)var8);
    boolean var12 = var8.isFloatable();
    var1.setGlassPane((java.awt.Component)var8);
    javax.swing.JRootPane var14 = var1.getRootPane();
    var1.pack();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test73");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    var0.setApproveButtonToolTipText("hi!");
    freemind.main.ExampleFileFilter var7 = new freemind.main.ExampleFileFilter("png", "hi!");
    var7.setExtensionListInDescription(false);
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var7);
    javax.swing.filechooser.FileFilter var11 = var0.getFileFilter();
    freemind.modes.FreeMindAwtFileDialog var12 = new freemind.modes.FreeMindAwtFileDialog();
    var12.setFile("Png");
    java.lang.String var15 = var12.getTitle();
    freemind.main.ExampleFileFilter var16 = new freemind.main.ExampleFileFilter();
    var12.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var16);
    var16.setDescription("PositionHolder [lat=10.0, lon=1.0, zoom=100]");
    freemind.modes.FreeMindJFileDialog var20 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var21 = var20.getUI();
    java.io.File[] var22 = var20.getSelectedFiles();
    java.lang.String var23 = var20.getApproveButtonToolTipText();
    var20.setDialogTitle("127.0.1.1");
    java.io.File var26 = var20.getCurrentDirectory();
    boolean var27 = var16.accept(var26);
    java.lang.String var28 = var0.getDescription(var26);
    int var29 = var0.getDialogType();
    accessories.plugins.time.JMonthChooser var30 = new accessories.plugins.time.JMonthChooser();
    var30.updateUI();
    boolean var32 = var30.isValid();
    accessories.plugins.time.JDayChooser var34 = new accessories.plugins.time.JDayChooser(false);
    var30.addFocusListener((java.awt.event.FocusListener)var34);
    java.awt.event.ComponentListener[] var36 = var34.getComponentListeners();
    var0.removeActionListener((java.awt.event.ActionListener)var34);
    var0.setDoubleBuffered(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "joao"+ "'", var28.equals("joao"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test74");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.MapMouseMotionListener var4 = var3.getMapMouseMotionListener();
    freemind.common.OptionalDontShowMeAgainDialog.StandardPropertyHandler var6 = new freemind.common.OptionalDontShowMeAgainDialog.StandardPropertyHandler(var3, "1408214452508");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test75");


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
    javax.swing.Action var25 = javax.swing.TransferHandler.getCutAction();
    var14.setAction(var25);
    
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
    assertNotNull(var25);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test76");


    freemind.main.Tools.IntHolder var1 = new freemind.main.Tools.IntHolder(100);
    java.lang.String var2 = var1.toString();
    var1.setValue(8);
    int var5 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "IntHolder(100)"+ "'", var2.equals("IntHolder(100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test77");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    java.net.URL var5 = var3.getResource("/home/joao/workspace/FreeMind_integration/bin/classes/");
    freemind.controller.MapMouseWheelListener var6 = new freemind.controller.MapMouseWheelListener(var3);
    java.net.URL var8 = var3.getResource("control");
    freemind.controller.NodeDragListener var9 = var3.getNodeDragListener();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test78");


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
    java.io.File[] var16 = var0.getSelectedFiles();
    var0.resetChoosableFileFilters();
    java.lang.String var18 = var0.getApproveButtonToolTipText();
    
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
    assertNull(var18);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test79");


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
    freemind.main.FreeMindApplet var43 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var44 = var43.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var45 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var46 = var45.getResources();
    java.awt.Container var47 = var45.getContentPane();
    var43.remove((java.awt.Component)var45);
    boolean var49 = var45.isApplet();
    accessories.plugins.time.JMonthChooser var50 = new accessories.plugins.time.JMonthChooser();
    var50.updateUI();
    boolean var52 = var50.isValid();
    accessories.plugins.time.JDayChooser var54 = new accessories.plugins.time.JDayChooser(false);
    var50.addFocusListener((java.awt.event.FocusListener)var54);
    var45.setContentPane((java.awt.Container)var50);
    var5.removeLayoutComponent((java.awt.Component)var50);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test80");


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
    int var27 = var0.capacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var29 = var0.getValue((java.lang.Comparable)3);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 10);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test81");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    var0.destroy();
    freemind.controller.Controller var3 = new freemind.controller.Controller((freemind.main.FreeMindMain)var0);
    freemind.controller.NodeDropListener var4 = new freemind.controller.NodeDropListener(var3);
    freemind.modes.mindmapmode.actions.xml.ActionFactory var5 = new freemind.modes.mindmapmode.actions.xml.ActionFactory(var3);
    plugins.collaboration.socket.MindMapMaster var6 = new plugins.collaboration.socket.MindMapMaster();
    var6.switchMeOff();
    freemind.main.XMLElement var8 = new freemind.main.XMLElement();
    java.lang.String var9 = var8.getTagName();
    java.util.Iterator var10 = var8.enumerateAttributeNames();
    var6.save(var8);
    var5.registerFilter((freemind.modes.mindmapmode.actions.xml.ActionFilter)var6);
    var6.clearLock();
    java.lang.String var14 = var6.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test82");


    accessories.plugins.time.JCalendar var0 = new accessories.plugins.time.JCalendar();
    java.util.Calendar var1 = var0.getCalendar();
    freemind.controller.FreeMindToolBar var4 = new freemind.controller.FreeMindToolBar("file:/home/joao/workspace/\n", 1);
    var4.updateUI();
    var4.setIgnoreRepaint(false);
    java.awt.Dimension var8 = var4.getSize();
    var0.setMaximumSize(var8);
    freemind.common.StringProperty var13 = new freemind.common.StringProperty("file:/home/joao/workspace/\n", "ToolBarUI");
    accessories.plugins.time.JTripleCalendar var14 = new accessories.plugins.time.JTripleCalendar();
    var14.revalidate();
    var13.addPropertyChangeListener((java.beans.PropertyChangeListener)var14);
    boolean var17 = var14.getAutoscrolls();
    boolean var18 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var14);
    var0.addPropertyChangeListener("false", (java.beans.PropertyChangeListener)var14);
    var0.grabFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test83");


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

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test84");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    var1.show();
    java.awt.dnd.DropTarget var4 = var1.getDropTarget();
    java.awt.Toolkit var5 = var1.getToolkit();
    var1.setModal(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test85");


    java.lang.String[] var3 = new java.lang.String[] { "http://www.openstreetmap.org/copyright"};
    freemind.main.Resources var4 = freemind.main.Resources.getInstance();
    java.util.HashMap var5 = var4.getCountryMap();
    freemind.common.ComboProperty var6 = new freemind.common.ComboProperty("http://otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", "//openstreetmap.org/", var3, (freemind.common.TextTranslator)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test86");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setDialogTitle("");
    accessories.plugins.time.JSpinField var5 = new accessories.plugins.time.JSpinField(10, 1);
    var5.setValue(292278994);
    java.awt.event.ContainerListener[] var8 = var5.getContainerListeners();
    var0.removeActionListener((java.awt.event.ActionListener)var5);
    var0.firePropertyChange("false", 'a', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test87");


    freemind.view.mindmapview.MapView.ScrollPane var0 = new freemind.view.mindmapview.MapView.ScrollPane();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    accessories.plugins.time.JTripleCalendar var2 = new accessories.plugins.time.JTripleCalendar();
    boolean var3 = var2.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var4 = var2.getDayChooser();
    java.awt.Color var5 = var4.getSundayForeground();
    var0.setColumnHeaderView((java.awt.Component)var4);
    java.awt.Point var7 = var0.location();
    javax.swing.JRootPane var8 = var0.getRootPane();
    var0.reshape(0, 100, 198, 8);
    
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

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test88");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.dispose();
    java.awt.event.ContainerListener[] var3 = var1.getContainerListeners();
    java.awt.Rectangle var4 = var1.getBounds();
    var1.hide();
    freemind.main.FreeMindApplet var6 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var7 = var6.getFocusTraversalPolicy();
    var6.destroy();
    freemind.controller.Controller var9 = new freemind.controller.Controller((freemind.main.FreeMindMain)var6);
    freemind.controller.NodeDropListener var10 = new freemind.controller.NodeDropListener(var9);
    freemind.controller.NodeDragListener var11 = new freemind.controller.NodeDragListener(var9);
    java.awt.Cursor var13 = var11.getCursorByAction(200);
    var1.setCursor(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test89");


    freemind.main.XMLParseException var2 = new freemind.main.XMLParseException("//otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", "keystroke_icon_hi!");
    int var3 = var2.getLineNr();
    java.lang.Throwable[] var4 = var2.getSuppressed();
    freemind.main.Resources var5 = freemind.main.Resources.getInstance();
    java.lang.String var7 = var5.getResourceString("");
    freemind.main.XMLParseException var10 = new freemind.main.XMLParseException("//otile1.mqcdn.com/tiles/1.0.0/osm/-1/0/200.png", "keystroke_icon_hi!");
    var5.logException((java.lang.Throwable)var10, "//openstreetmap.org/");
    var2.addSuppressed((java.lang.Throwable)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test90");


    freemind.modes.MindIcon var1 = freemind.modes.MindIcon.factory("hi!");
    java.lang.String var2 = var1.getIconFileName();
    javax.swing.ImageIcon var3 = var1.getIcon();
    javax.swing.JComponent var4 = var1.getRendererComponent();
    accessories.plugins.time.JTripleCalendar var5 = new accessories.plugins.time.JTripleCalendar();
    boolean var6 = var5.requestFocusInWindow();
    accessories.plugins.time.JDayChooser var7 = var5.getDayChooser();
    javax.swing.JRootPane var8 = var5.getRootPane();
    accessories.plugins.time.JDayChooser var9 = var5.getDayChooser();
    accessories.plugins.time.JCalendar var10 = new accessories.plugins.time.JCalendar();
    java.awt.Color var11 = var10.getWeekdayForeground();
    var9.setDecorationBackgroundColor(var11);
    var4.addFocusListener((java.awt.event.FocusListener)var9);
    java.awt.Dimension var14 = var4.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "images/icons/JDayChooser.png"+ "'", var2.equals("images/icons/JDayChooser.png"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test91");


    freemind.common.XmlBindingTools var0 = freemind.common.XmlBindingTools.getInstance();
    freemind.controller.actions.generated.instance.XmlAction var2 = var0.unMarshall("png");
    org.jibx.runtime.IMarshallingContext var3 = var0.createMarshaller();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test92");


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
    var12.removeAttribute("1408214452508");
    
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

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test93");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var13 = var1.getFocusTraversalKeys(11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test94");


    freemind.main.XMLParseException var2 = new freemind.main.XMLParseException("ToolBarUI", ".*(Png).*");

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test95");


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
    javax.swing.ButtonModel var20 = var8.getModel();
    boolean var21 = var8.getHideActionText();
    var8.setText("meta");
    var8.firePropertyChange(".", true, false);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test96");


    freemind.main.Resources var0 = freemind.main.Resources.getInstance();
    java.lang.String var3 = var0.getResourceString("file:/home/joao/workspace/\n", "file:/home/joao/workspace/\n");
    java.lang.String var5 = var0.getText("hi!");
    java.net.URL var7 = var0.getResource("file:/home/joao/workspace/\n");
    int var10 = var0.getIntProperty("File", 256);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "file:/home/joao/workspace/\n"+ "'", var3.equals("file:/home/joao/workspace/\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 256);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test97");


    freemind.view.mindmapview.attributeview.AttributeTableCellRenderer var0 = new freemind.view.mindmapview.attributeview.AttributeTableCellRenderer();
    int var1 = var0.getHorizontalTextPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test98");


    freemind.modes.FreeMindJFileDialog var0 = new freemind.modes.FreeMindJFileDialog();
    var0.setApproveButtonText("IntHolder(0)");
    var0.setApproveButtonToolTipText("hi!");
    freemind.main.ExampleFileFilter var7 = new freemind.main.ExampleFileFilter("png", "hi!");
    var7.setExtensionListInDescription(false);
    var0.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var7);
    javax.swing.filechooser.FileFilter var11 = var0.getFileFilter();
    freemind.modes.FreeMindAwtFileDialog var12 = new freemind.modes.FreeMindAwtFileDialog();
    var12.setFile("Png");
    java.lang.String var15 = var12.getTitle();
    freemind.main.ExampleFileFilter var16 = new freemind.main.ExampleFileFilter();
    var12.addChoosableFileFilter((javax.swing.filechooser.FileFilter)var16);
    var16.setDescription("PositionHolder [lat=10.0, lon=1.0, zoom=100]");
    freemind.modes.FreeMindJFileDialog var20 = new freemind.modes.FreeMindJFileDialog();
    javax.swing.plaf.FileChooserUI var21 = var20.getUI();
    java.io.File[] var22 = var20.getSelectedFiles();
    java.lang.String var23 = var20.getApproveButtonToolTipText();
    var20.setDialogTitle("127.0.1.1");
    java.io.File var26 = var20.getCurrentDirectory();
    boolean var27 = var16.accept(var26);
    java.lang.String var28 = var0.getDescription(var26);
    java.io.File[] var29 = var0.getSelectedFiles();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "joao"+ "'", var28.equals("joao"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test99");


    freemind.main.FreeMindApplet var0 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var1 = var0.getFocusTraversalPolicy();
    freemind.main.FreeMindApplet var2 = new freemind.main.FreeMindApplet();
    java.util.ResourceBundle var3 = var2.getResources();
    java.awt.Container var4 = var2.getContentPane();
    var0.remove((java.awt.Component)var2);
    boolean var6 = var2.isApplet();
    javax.swing.JScrollPane var7 = var2.getScrollPane();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setHorizontalScrollBarPolicy(200);
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
    assertNotNull(var7);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test100");


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
    freemind.main.FreeMindApplet var13 = new freemind.main.FreeMindApplet();
    java.awt.FocusTraversalPolicy var14 = var13.getFocusTraversalPolicy();
    var6.setFocusTraversalPolicy(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test101");


    freemind.common.FreeMindProgressMonitor var1 = new freemind.common.FreeMindProgressMonitor("file:/home/joao/workspace/\n");
    var1.revalidate();
    boolean var3 = var1.isUndecorated();
    freemind.modes.FreeMindAwtFileDialog var4 = new freemind.modes.FreeMindAwtFileDialog();
    boolean var5 = var4.isDoubleBuffered();
    boolean var6 = var4.isMultiSelectionEnabled();
    var4.setAlwaysOnTop(true);
    java.io.FilenameFilter var9 = var4.getFilenameFilter();
    boolean var10 = var1.isFocusCycleRoot((java.awt.Container)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test102");


    freemind.common.XmlBindingTools var0 = freemind.common.XmlBindingTools.getInstance();
    freemind.controller.actions.generated.instance.XmlAction var2 = var0.unMarshall("png");
    freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator var4 = new freemind.modes.mindmapmode.MindMapMapModel.StringReaderCreator("ToolBarUI");
    java.io.Reader var5 = var4.createReader();
    boolean var6 = var5.ready();
    long var8 = var5.skip(100L);
    freemind.controller.actions.generated.instance.XmlAction var9 = var0.unMarshall(var5);
    boolean var10 = var5.ready();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 9L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test103");


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
    var8.setLabel("ButtonUI");
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
    assertTrue("'" + var9 + "' != '" + "ButtonUI"+ "'", var9.equals("ButtonUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

}
