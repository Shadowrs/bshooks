/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.BorderLayout
 *  java.awt.Color
 *  java.awt.Component
 *  java.awt.Container
 *  java.awt.Cursor
 *  java.awt.Desktop
 *  java.awt.Dimension
 *  java.awt.Font
 *  java.awt.Image
 *  java.awt.Insets
 *  java.awt.LayoutManager
 *  java.awt.Point
 *  java.awt.Toolkit
 *  java.awt.event.ActionEvent
 *  java.awt.event.ActionListener
 *  java.awt.event.MouseAdapter
 *  java.awt.event.MouseEvent
 *  java.awt.event.WindowAdapter
 *  java.awt.event.WindowEvent
 *  java.awt.event.WindowListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.net.URI
 *  java.util.HashSet
 *  java.util.Set
 *  javax.swing.BorderFactory
 *  javax.swing.Icon
 *  javax.swing.JButton
 *  javax.swing.JFrame
 *  javax.swing.JOptionPane
 *  javax.swing.JPanel
 *  javax.swing.JPopupMenu
 *  javax.swing.KeyStroke
 *  javax.swing.SwingUtilities
 *  javax.swing.UIManager
 *  javax.swing.border.Border
 *  javax.swing.plaf.ColorUIResource
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.RSApplet;
import com.imagineps.client.ScreenMode;
import com.imagineps.client.cache.CacheType;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;

public class ClientFrame
extends Client
implements ActionListener {
    public static boolean CHRISTMAS = true;
    private static final long serialVersionUID = 1L;
    public JFrame frame;
    private JPanel gamePanel;
    private JPanel menuPanel;
    private int leftHovers = -1;
    private int rightHovers = -1;
    private static Image LOGO;
    private static Image BG;
    private Image scaledBG;
    private static Image BUTTON_IMAGE;
    private static Image BUTTON_HOVER_IMAGE;
    private static Image ICON;
    private static final int TEXT_COLOR = 1803417;
    private String[] leftLabels = new String[]{"Website", "Community", "Discord"};
    private String[] rightLabels = new String[]{"Vote", "Store", "Hiscores"};

    public ClientFrame() {
        try {
            this.initializeUserInterface();
            return;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void initializeUserInterface() {
        try {
            JPopupMenu.setDefaultLightWeightPopupEnabled((boolean)false);
            UIManager.put((Object)"InternalFrame.activeTitleBackground", (Object)new ColorUIResource(Color.black));
            UIManager.put((Object)"InternalFrame.activeTitleForeground", (Object)new ColorUIResource(Color.WHITE));
            UIManager.put((Object)"InternalFrame.titleFont", (Object)new Font("Dialog", 0, 11));
            this.frame = new JFrame("Imagine-PS");
            this.frame.setLayout((LayoutManager)new BorderLayout());
            this.frame.setResizable(false);
            this.frame.setDefaultCloseOperation(0);
            this.frame.setFocusTraversalKeys(0, null);
            this.frame.setFocusTraversalKeys(1, null);
            HashSet forwardKeys = new HashSet(1);
            forwardKeys.add((Object)KeyStroke.getKeyStroke((int)9, (int)2));
            this.setFocusTraversalKeys(0, (Set)forwardKeys);
            HashSet backwardKeys = new HashSet(1);
            backwardKeys.add((Object)KeyStroke.getKeyStroke((int)9, (int)3));
            this.setFocusTraversalKeys(1, (Set)backwardKeys);
            int width = 765;
            int height = 503;
            Insets insets = this.getInsets();
            this.frame.setSize(width + insets.left + insets.right, height + insets.top + insets.bottom);
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            int x = (int)(toolkit.getScreenSize().getWidth() / 2.0 - 382.0);
            int y = (int)(toolkit.getScreenSize().getHeight() / 2.0 - 251.0);
            this.frame.setLocation(new Point(x, y));
            this.frame.addWindowListener((WindowListener)new WindowAdapter(){

                public void windowClosing(WindowEvent we) {
                    Object[] options = new String[]{"Yes", "No"};
                    int userPrompt = JOptionPane.showOptionDialog((Component)null, (Object)"Are you sure you wish to exit?", (String)"Imagine-PS", (int)-1, (int)2, (Icon)null, (Object[])options, (Object)options[1]);
                    if (userPrompt != 0) return;
                    System.exit((int)0);
                }

                public void windowGainedFocus(WindowEvent e) {
                    ClientFrame.this.getGamePanel().requestFocusInWindow();
                    ClientFrame.this.getGamePanel().requestFocus();
                }
            });
            Image icon = Toolkit.getDefaultToolkit().getImage(CacheType.SPRITES.getFullLocation() + "Icon.png");
            if (icon != null) {
                this.frame.setIconImage(icon);
            }
            this.initializeGamePanel();
            this.frame.setFocusable(false);
            this.frame.pack();
            this.frame.setVisible(true);
            this.init();
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initializeGamePanel() {
        this.setGamePanel(new JPanel());
        this.getGamePanel().setLayout((LayoutManager)new BorderLayout());
        this.getGamePanel().add((Component)this);
        Dimension dimension = new Dimension(765, 503);
        this.getGamePanel().setPreferredSize(dimension);
        this.getGamePanel().setSize(dimension);
        this.getGamePanel().setFocusable(false);
        this.getGamePanel().requestFocus();
        this.getGamePanel().setFocusTraversalKeysEnabled(false);
        this.getGamePanel().setFocusTraversalKeys(0, null);
        this.getGamePanel().setFocusTraversalKeys(1, null);
        this.frame.getContentPane().add((Component)this.getGamePanel(), (Object)"Center");
    }

    private JButton createButton(String title, String image, String tooltip) {
        JButton button = new JButton(title);
        button.addActionListener((ActionListener)this);
        if (tooltip != null) {
            button.setToolTipText(tooltip);
        }
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setContentAreaFilled(false);
        button.setCursor(new Cursor(12));
        button.setForeground(Color.WHITE);
        return button;
    }

    static void openURL(String url) {
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI(url));
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resize(ScreenMode screenMode) {
        try {
            int width = screenMode == ScreenMode.FIXED ? 765 : 790;
            int height = screenMode == ScreenMode.FIXED ? 503 : 600;
            Point point = this.getGameComponent().getLocationOnScreen();
            Dimension dimension = new Dimension(width, height);
            this.getGameComponent().setSize(dimension);
            this.gamePanel.setPreferredSize(dimension);
            this.frame.setMinimumSize(dimension);
            Insets insets = this.frame.getInsets();
            int widthModifier = 0 + insets.left;
            int heightModifier = 0 + insets.top;
            this.frame.setBounds(0, 0, width + widthModifier, height + heightModifier);
            this.myWidth = width;
            this.myHeight = height;
            this.frame.setResizable(screenMode != ScreenMode.FIXED);
            this.frame.setLocation(point);
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * Exception decompiling
     */
    public void actionPerformed(ActionEvent evt) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:251)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:215)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:25)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:96)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:839)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:191)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:136)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:369)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:770)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:702)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        // the.bytecode.club.bytecodeviewer.decompilers.CFRDecompiler.decompileToZip(CFRDecompiler.java:263)
        // the.bytecode.club.bytecodeviewer.gui.MainViewerGUI$18$1$3.run(MainViewerGUI.java:1122)
        throw new IllegalStateException("Decompilation failed");
    }

    public JPanel getGamePanel() {
        return this.gamePanel;
    }

    public void setGamePanel(JPanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public JPanel getMenuPanel() {
        return this.menuPanel;
    }

    public void setTitle(String title) {
        this.frame.setTitle(title);
    }

    private final class NavListener
    extends MouseAdapter {
        private final JPanel panel;

        NavListener(JPanel panel) {
            this.panel = panel;
        }

        public void mouseEntered(MouseEvent e) {
            int x_left = this.panel.getWidth() / 2 - 382;
            int x_right = this.panel.getWidth() / 2 + 382 + 2;
            int leftPos = (e.getX() - x_left) / 86;
            int rightPos = (e.getX() - x_right) / 86;
            if (rightPos == -1) {
                rightPos = 1;
            } else if (rightPos == -2) {
                rightPos = 2;
            }
            if (leftPos != ClientFrame.this.leftHovers) {
                ClientFrame.this.leftHovers = leftPos;
                this.panel.repaint();
                return;
            }
            if (rightPos == ClientFrame.this.rightHovers) return;
            ClientFrame.this.rightHovers = rightPos;
            this.panel.repaint();
        }

        public void mouseMoved(MouseEvent e) {
            int x_left = this.panel.getWidth() / 2 - 382;
            int x_right = this.panel.getWidth() / 2 + 382 + 2;
            int leftPos = (e.getX() - x_left) / 86;
            int rightPos = (e.getX() - x_right) / 86;
            if (rightPos == -1) {
                rightPos = 1;
            } else if (rightPos == -2) {
                rightPos = 2;
            }
            if (leftPos != ClientFrame.this.leftHovers) {
                ClientFrame.this.leftHovers = leftPos;
                this.panel.repaint();
                return;
            }
            if (rightPos == ClientFrame.this.rightHovers) return;
            ClientFrame.this.rightHovers = rightPos;
            this.panel.repaint();
        }

        public void mouseExited(MouseEvent e) {
            int leftPos = ClientFrame.this.leftHovers;
            int rightPos = ClientFrame.this.rightHovers;
            ClientFrame.this.leftHovers = -1;
            ClientFrame.this.rightHovers = -1;
            if (leftPos != ClientFrame.this.leftHovers) {
                this.panel.repaint();
                return;
            }
            if (rightPos == ClientFrame.this.rightHovers) return;
            this.panel.repaint();
        }

        public void mousePressed(MouseEvent e) {
            if (!SwingUtilities.isLeftMouseButton((MouseEvent)e)) return;
            int x_left = this.panel.getWidth() / 2 - 382;
            int x_right = this.panel.getWidth() / 2 + 382 + 2;
            int tabs_left = (e.getX() - x_left) / 86;
            int tabs_right = (e.getX() - x_right) / 86;
            if (tabs_right == -1) {
                tabs_right = 1;
            } else if (tabs_right == -2) {
                tabs_right = 2;
            }
            if (tabs_left > -1 && tabs_left < Configuration.LEFT_NAV_LINKS.length) {
                RSApplet.launchURL(Configuration.LEFT_NAV_LINKS[tabs_left]);
                return;
            }
            if (tabs_right <= -1) return;
            if (tabs_right >= Configuration.RIGHT_NAV_LINKS.length) return;
            RSApplet.launchURL(Configuration.RIGHT_NAV_LINKS[tabs_right]);
        }
    }

}

