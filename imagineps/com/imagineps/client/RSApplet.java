/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.applet.Applet
 *  java.awt.Color
 *  java.awt.Component
 *  java.awt.Container
 *  java.awt.Cursor
 *  java.awt.Dimension
 *  java.awt.Font
 *  java.awt.FontMetrics
 *  java.awt.Graphics
 *  java.awt.Image
 *  java.awt.Insets
 *  java.awt.Point
 *  java.awt.Toolkit
 *  java.awt.event.FocusEvent
 *  java.awt.event.FocusListener
 *  java.awt.event.KeyEvent
 *  java.awt.event.KeyListener
 *  java.awt.event.MouseAdapter
 *  java.awt.event.MouseEvent
 *  java.awt.event.MouseListener
 *  java.awt.event.MouseMotionListener
 *  java.awt.event.MouseWheelEvent
 *  java.awt.event.MouseWheelListener
 *  java.awt.event.WindowEvent
 *  java.awt.event.WindowListener
 *  java.io.PrintStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Process
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  javax.swing.JPanel
 *  javax.swing.SwingUtilities
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.FileOperations;
import com.imagineps.client.PlayerSettings;
import com.imagineps.client.RSFrame;
import com.imagineps.client.cache.CacheType;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.login.LoginRenderer;
import com.imagineps.client.rs_interface.RSInterface;
import com.imagineps.client.updater.Updater;
import com.imagineps.client.updater.screen.UpdaterRenderer;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.PrintStream;
import java.lang.reflect.Method;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class RSApplet
extends Applet
implements Runnable,
MouseListener,
MouseMotionListener,
KeyListener,
FocusListener,
WindowListener,
MouseWheelListener {
    private static final long serialVersionUID = 1L;
    public LoginRenderer loginRenderer;
    public UpdaterRenderer updaterRenderer;
    private JPanel menuPanel;
    public static boolean shiftDown;
    public static boolean controlDown;
    private int leftHovers = -1;
    private int rightHovers = -1;
    public boolean mouseWheelDown;
    public int mouseWheelX;
    public int mouseWheelY;
    private int currentCursor = 0;
    private final Image[] cursorImages = new Image[76];
    public int forceWidth = -1;
    public int forceHeight = -1;
    public int offsetX = 0;
    public int offsetY = 0;
    public String titleText = "";
    public static int hotKey;
    private int anInt4;
    private int delayTime = 20;
    int minDelay = 1;
    private final long[] aLongArray7 = new long[10];
    static int fps;
    boolean shouldDebug = false;
    int myWidth;
    int myHeight;
    public Graphics graphics;
    GraphicsBuffer fullGameScreen;
    RSFrame gameFrame;
    boolean shouldClearScreen = true;
    protected boolean isApplet;
    boolean awtFocus = true;
    int idleTime;
    int clickMode2;
    public int mouseX;
    public int mouseY;
    private int clickMode1;
    private int clickX;
    private int clickY;
    private long clickTime;
    public int clickMode3;
    int saveClickX;
    int saveClickY;
    long aLong29;
    final int[] heldKeys = new int[128];
    private final int[] charQueue = new int[128];
    private int readIndex;
    private int writeIndex;
    public static int anInt34;
    public int resizeWidth;
    public int resizeHeight;

    public void recreateClientFrame(boolean decorative, int width, int height, boolean resizable) {
        Component component = this.getGameComponent();
        component.setBackground(Color.black);
        component.removeMouseWheelListener((MouseWheelListener)this);
        component.removeMouseListener((MouseListener)this);
        component.removeMouseMotionListener((MouseMotionListener)this);
        component.removeKeyListener((KeyListener)this);
        component.removeFocusListener((FocusListener)this);
        if (this.gameFrame != null) {
            this.gameFrame.removeWindowListener((WindowListener)this);
            this.gameFrame.setVisible(false);
            this.gameFrame.dispose();
            this.gameFrame = null;
        }
        if (!this.isApplet || decorative) {
            this.gameFrame = new RSFrame(this, width, height, decorative, resizable);
            this.gameFrame.addWindowListener((WindowListener)this);
        }
        if (resizable && decorative) {
            if (!this.isApplet) {
                this.gameFrame.setMinimumSize(new Dimension(800, 600));
            }
        } else if (!resizable) {
            if (!this.isApplet) {
                this.gameFrame.setMinimumSize(new Dimension(765, 503));
            } else {
                this.setMinimumSize(new Dimension(765, 503));
            }
        }
        component = this.getGameComponent();
        component.setBackground(Color.black);
        component.addMouseWheelListener((MouseWheelListener)this);
        component.addMouseListener((MouseListener)this);
        component.addMouseMotionListener((MouseMotionListener)this);
        component.addKeyListener((KeyListener)this);
        component.addFocusListener((FocusListener)this);
        this.mouseY = -1;
        this.mouseX = -1;
    }

    public final int readChar(int dummy) {
        block0 : do {
            if (dummy < 0) {
                int k = -1;
                if (this.writeIndex == this.readIndex) return k;
                k = this.charQueue[this.readIndex];
                this.readIndex = this.readIndex + 1 & 127;
                return k;
            }
            int j = 1;
            do {
                if (j <= 0) continue block0;
                ++j;
            } while (true);
            break;
        } while (true);
    }

    final void initClientFrame(int h, int w) {
        this.isApplet = true;
        this.myWidth = this.forceWidth = w;
        this.myHeight = this.forceHeight = h;
        this.graphics = this.getGameComponent().getGraphics();
        this.fullGameScreen = RSApplet.constructGraphicsBuffer(this.myWidth, this.myHeight, this.getGameComponent());
        this.startRunnable(this, 1);
    }

    public static void launchURL(String url) {
        String osName = System.getProperty((String)"os.name");
        try {
            if (osName.startsWith("Mac OS")) {
                Class fileMgr = Class.forName((String)"com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[]{String.class});
                openURL.invoke((Object)null, new Object[]{url});
                return;
            }
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
                return;
            }
            String[] browsers = new String[]{"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
            String browser = null;
            for (int count = 0; count < browsers.length && browser == null; ++count) {
                if (Runtime.getRuntime().exec(new String[]{"which", browsers[count]}).waitFor() != 0) continue;
                browser = browsers[count];
            }
            if (browser == null) {
                throw new Exception("Could not find web browser");
            }
            Runtime.getRuntime().exec(new String[]{browser, url});
            return;
        }
        catch (Exception e) {
            System.out.println("Failed to open URL.");
        }
    }

    public void drawCenteredString(Graphics g, String text, int x, int y, int color) {
        int width = g.getFontMetrics().stringWidth(text);
        g.setColor(Color.BLACK);
        g.drawString(text, x - width / 2 + 2, y + 2);
        g.setColor(new Color(color));
        g.drawString(text, x - width / 2, y);
    }

    public static final GraphicsBuffer constructGraphicsBuffer(int x, int y, Component component) {
        return new GraphicsBuffer(x, y, component);
    }

    public static final GraphicsBuffer constructGraphicsBuffer(int x, int y, int[] raster, Component component) {
        return new GraphicsBuffer(x, y, raster, component);
    }

    public void run() {
        this.getGameComponent().addMouseWheelListener((MouseWheelListener)this);
        this.getGameComponent().addMouseListener((MouseListener)this);
        this.getGameComponent().addMouseMotionListener((MouseMotionListener)this);
        this.getGameComponent().addKeyListener((KeyListener)this);
        this.getGameComponent().addFocusListener((FocusListener)this);
        if (this.gameFrame != null) {
            this.gameFrame.addWindowListener((WindowListener)this);
        }
        Updater.get().setup(Client.instance);
        int i = 0;
        int j = 256;
        int k = 1;
        int l = 0;
        int i1 = 0;
        for (int j1 = 0; j1 < 10; ++j1) {
            this.aLongArray7[j1] = System.currentTimeMillis();
        }
        do {
            if (this.anInt4 < 0) {
                if (this.anInt4 != -1) return;
                this.exit();
                return;
            }
            if (this.anInt4 > 0) {
                --this.anInt4;
                if (this.anInt4 == 0) {
                    this.exit();
                    return;
                }
            }
            int k1 = j;
            int i2 = k;
            j = 300;
            k = 1;
            long l2 = System.currentTimeMillis();
            if (this.aLongArray7[i] == 0L) {
                j = k1;
                k = i2;
            } else if (l2 > this.aLongArray7[i]) {
                j = (int)((long)(2560 * this.delayTime) / (l2 - this.aLongArray7[i]));
            }
            if (j < 25) {
                j = 25;
            }
            if (j > 256) {
                j = 256;
                k = (int)((long)this.delayTime - (l2 - this.aLongArray7[i]) / 10L);
            }
            if (k > this.delayTime) {
                k = this.delayTime;
            }
            this.aLongArray7[i] = l2;
            i = (i + 1) % 10;
            if (k > 1) {
                for (int j2 = 0; j2 < 10; ++j2) {
                    if (this.aLongArray7[j2] == 0L) continue;
                    long[] arrl = this.aLongArray7;
                    int n = j2;
                    arrl[n] = arrl[n] + (long)k;
                }
            }
            if (k < this.minDelay) {
                k = this.minDelay;
            }
            try {
                Thread.sleep((long)k);
            }
            catch (InterruptedException interruptedexception) {
                ++i1;
            }
            while (l < 256) {
                this.clickMode3 = this.clickMode1;
                this.saveClickX = this.clickX;
                this.saveClickY = this.clickY;
                this.aLong29 = this.clickTime;
                this.clickMode1 = 0;
                this.processGameLoop();
                this.readIndex = this.writeIndex;
                l += j;
            }
            l &= 255;
            if (this.delayTime > 0) {
                fps = 1000 * j / (this.delayTime * 256);
            }
            this.processDrawing();
            if (!this.shouldDebug) continue;
            System.out.println("ntime:" + l2);
            for (int k2 = 0; k2 < 10; ++k2) {
                int i3 = (i - k2 - 1 + 20) % 10;
                System.out.println("otim" + i3 + ":" + this.aLongArray7[i3]);
            }
            System.out.println("fps:" + fps + " ratio:" + j + " count:" + l);
            System.out.println("del:" + k + " deltime:" + this.delayTime + " mindel:" + this.minDelay);
            System.out.println("intex:" + i1 + " opos:" + i);
            this.shouldDebug = false;
            i1 = 0;
        } while (true);
    }

    private void exit() {
        this.anInt4 = -2;
        this.cleanUpForQuit();
        if (this.gameFrame == null) return;
        try {
            Thread.sleep((long)1000L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            System.exit((int)0);
            return;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    final void method4(int i) {
        this.delayTime = 1000 / i;
    }

    public final void start() {
        if (this.anInt4 < 0) return;
        this.anInt4 = 0;
    }

    public final void stop() {
        if (this.anInt4 < 0) return;
        this.anInt4 = 4000 / this.delayTime;
    }

    public final void destroy() {
        this.anInt4 = -1;
        try {
            Thread.sleep((long)5000L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (this.anInt4 != -1) return;
        this.exit();
    }

    public final void update(Graphics g) {
        this.shouldClearScreen = true;
        this.raiseWelcomeScreen();
    }

    public final void paint(Graphics g) {
        this.shouldClearScreen = true;
        this.raiseWelcomeScreen();
    }

    public void mouseWheelMoved(MouseWheelEvent event) {
        int rotation = event.getWheelRotation();
        if (this.mouseX > 0 && this.mouseX < 512 && this.mouseY > 342 + Client.instance.getChatBackIncreaseY()) {
            int i = Client.anInt1089;
            if ((i -= rotation * 30) < 0) {
                i = 0;
            }
            if (i > Client.chatScrollTotalLength - 110) {
                i = Client.chatScrollTotalLength - 110;
            }
            if (Client.anInt1089 == i) return;
            Client.anInt1089 = i;
            Client.inputTaken = true;
            return;
        }
        if (this.interfaceScrollCheck(event)) return;
        if (!event.isControlDown()) return;
        if (rotation == -1) {
            if (Client.cameraZoom > 0.2) {
                Client.cameraZoom -= 0.2;
            }
        } else if (Client.cameraZoom < 9.8) {
            Client.cameraZoom += 0.2;
        }
        Client.setDisplayZoom(true);
    }

    public final void mousePressed(MouseEvent mouseevent) {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        boolean type = false;
        if (this.gameFrame != null) {
            Insets insets = this.gameFrame.getInsets();
            i -= insets.left;
            j -= insets.top;
        }
        this.idleTime = 0;
        this.clickX = i;
        this.clickY = j;
        this.clickTime = System.currentTimeMillis();
        if (SwingUtilities.isMiddleMouseButton((MouseEvent)mouseevent)) {
            this.mouseWheelDown = true;
            this.mouseWheelX = i;
            this.mouseWheelY = j;
            return;
        }
        if (SwingUtilities.isRightMouseButton((MouseEvent)mouseevent)) {
            type = true;
            this.clickMode1 = 2;
            this.clickMode2 = 2;
            return;
        }
        if (!SwingUtilities.isLeftMouseButton((MouseEvent)mouseevent)) return;
        type = false;
        this.clickMode1 = 1;
        this.clickMode2 = 1;
    }

    public final void mouseReleased(MouseEvent mouseevent) {
        this.idleTime = 0;
        this.clickMode2 = 0;
        this.mouseWheelDown = false;
    }

    public final void mouseClicked(MouseEvent mouseevent1) {
    }

    public final void mouseEntered(MouseEvent mouseevent1) {
    }

    public final void mouseExited(MouseEvent mouseevent) {
        this.idleTime = 0;
        this.mouseX = -1;
        this.mouseY = -1;
    }

    public final void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (this.gameFrame != null) {
            Insets insets = this.gameFrame.getInsets();
            x -= insets.left;
            y -= insets.top;
        }
        if (this.mouseWheelDown) {
            y = this.mouseWheelX - e.getX();
            int k = this.mouseWheelY - e.getY();
            this.mouseWheelDragged(y, - k);
            this.mouseWheelX = e.getX();
            this.mouseWheelY = e.getY();
            return;
        }
        this.idleTime = 0;
        this.mouseX = x;
        this.mouseY = y;
    }

    void mouseWheelDragged(int param1, int param2) {
    }

    public final void mouseMoved(MouseEvent mouseevent) {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if (this.gameFrame != null) {
            Insets insets = this.gameFrame.getInsets();
            i -= insets.left;
            j -= insets.top;
        }
        this.idleTime = 0;
        this.mouseX = i;
        this.mouseY = j;
    }

    public final void keyPressed(KeyEvent keyevent) {
        Client client;
        this.idleTime = 0;
        int i = keyevent.getKeyCode();
        int j = keyevent.getKeyChar();
        boolean enableRotationFix = false;
        if (enableRotationFix) {
            if (i == 38) {
                if (Client.rotationY + 5 >= 2047) {
                    Client.rotationY = 2047;
                    return;
                }
                Client.rotationY += 5;
                return;
            }
            if (i == 40) {
                if (Client.rotationY - 5 <= 0) {
                    Client.rotationY = 0;
                    return;
                }
                Client.rotationY -= 5;
                return;
            }
            if (i == 39) {
                if (Client.rotationX + 5 >= 2047) {
                    Client.rotationX = 2047;
                    return;
                }
                Client.rotationX += 5;
                return;
            }
            if (i == 37) {
                if (Client.rotationX - 5 <= 0) {
                    Client.rotationX = 0;
                    return;
                }
                Client.rotationX -= 5;
                return;
            }
        }
        if (keyevent.isShiftDown()) {
            shiftDown = true;
        }
        if (keyevent.isControlDown()) {
            controlDown = true;
        }
        if (controlDown) {
            if (i == 61) {
                if (Client.cameraZoom > 0.2) {
                    Client.cameraZoom -= 0.2;
                }
                Client.setDisplayZoom(true);
                return;
            }
            if (i == 45) {
                if (Client.cameraZoom < 9.8) {
                    Client.cameraZoom += 0.2;
                }
                Client.setDisplayZoom(true);
                return;
            }
        }
        if (Client.firstPersonMode && i == 10 && Client.getSingleton().loggedIn && Client.openInterfaceID == -1) {
            boolean bl = Client.enterToChat = !Client.enterToChat;
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 66) {
            client = Client.instance;
            client.sendData("::bank");
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 73) {
            client = Client.instance;
            client.sendData("::instance");
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 72) {
            client = Client.instance;
            client.sendData("::home");
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 68) {
            client = Client.instance;
            client.sendData("::raredrops");
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 82) {
            client = Client.instance;
            client.sendData("::reqs");
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 71) {
            client = Client.instance;
            client.sendData("::gamble");
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 84) {
            client = Client.instance;
            client.sendData("::task");
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 83) {
            client = Client.instance;
            client.sendData("::slayer");
        }
        if (keyevent.isControlDown() && (keyevent.getKeyCode() == 77 || keyevent.getKeyCode() == 49 || keyevent.getKeyCode() == 50 || keyevent.getKeyCode() == 51 || keyevent.getKeyCode() == 52)) {
            client = Client.instance;
            client.sendData("::memory" + (keyevent.getKeyCode() == 49 ? "1" : (keyevent.getKeyCode() == 50 ? "2" : (keyevent.getKeyCode() == 51 ? "3" : (keyevent.getKeyCode() == 52 ? "4" : "")))));
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 86) {
            Client.getSingleton().inputString = Client.getSingleton().inputString + Client.getClipboardContents();
            Client.inputTaken = true;
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 88) {
            Client.setClipboardContents(Client.getSingleton().inputString);
            Client.getSingleton().inputString = "";
            Client.inputTaken = true;
        }
        if (keyevent.isControlDown() && keyevent.getKeyCode() == 89) {
            Client.getSingleton().inputString = "::yell ";
            Client.inputTaken = true;
        }
        if (hotKey == 508) {
            if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.NEW_FUNCTION_KEYS)) {
                if (i == 27) {
                    Client.setTab(3);
                } else if (i == 112) {
                    Client.setTab(0);
                } else if (i == 113) {
                    Client.setTab(1);
                } else if (i == 114) {
                    Client.setTab(2);
                } else if (i == 115) {
                    Client.setTab(3);
                } else if (i == 116) {
                    Client.setTab(4);
                } else if (i == 117) {
                    Client.setTab(5);
                } else if (i == 118) {
                    Client.setTab(6);
                } else if (i == 119) {
                    Client.setTab(7);
                } else if (i == 120) {
                    Client.setTab(8);
                } else if (i == 121) {
                    Client.setTab(9);
                } else if (i == 122) {
                    Client.setTab(10);
                } else if (i == 123) {
                    Client.setTab(11);
                }
            } else if (i == 27) {
                Client.setTab(3);
            } else if (i == 112) {
                Client.setTab(3);
            } else if (i == 113) {
                Client.setTab(4);
            } else if (i == 114) {
                Client.setTab(5);
            } else if (i == 115) {
                Client.setTab(6);
            } else if (i == 116) {
                Client.setTab(0);
            }
        } else if (i == 27) {
            Client.setTab(0);
        } else if (i == 112) {
            Client.setTab(3);
        } else if (i == 113) {
            Client.setTab(1);
        } else if (i == 114) {
            Client.setTab(2);
        } else if (i == 115) {
            Client.setTab(3);
        } else if (i == 116) {
            Client.setTab(4);
        } else if (i == 117) {
            Client.setTab(5);
        } else if (i == 118) {
            Client.setTab(6);
        } else if (i == 119) {
            Client.setTab(7);
        } else if (i == 120) {
            Client.setTab(8);
        } else if (i == 121) {
            Client.setTab(9);
        } else if (i == 122) {
            Client.setTab(10);
        } else if (i == 123) {
            Client.setTab(11);
        }
        if (j < 30) {
            j = 0;
        }
        if (i == 37) {
            j = 1;
        }
        if (i == 39) {
            j = 2;
        }
        if (i == 38) {
            j = 3;
        }
        if (i == 40) {
            j = 4;
        }
        if (i == 17) {
            j = 5;
        }
        if (i == 8) {
            j = 8;
        }
        if (i == 127) {
            j = 8;
        }
        if (i == 9) {
            j = 9;
        }
        if (i == 10) {
            j = 10;
        }
        if (i >= 112 && i <= 123) {
            j = 1008 + i - 112;
        }
        if (i == 36) {
            j = 1000;
        }
        if (i == 35) {
            j = 1001;
        }
        if (i == 33) {
            j = 1002;
        }
        if (i == 34) {
            j = 1003;
        }
        if (j > 0 && j < 128) {
            this.heldKeys[j] = 1;
        }
        if (j <= 4) return;
        this.charQueue[this.writeIndex] = j;
        this.writeIndex = this.writeIndex + 1 & 127;
    }

    public final void keyReleased(KeyEvent keyevent) {
        this.idleTime = 0;
        int i = keyevent.getKeyCode();
        int c = keyevent.getKeyChar();
        if (c < 30) {
            c = 0;
        }
        if (i == 37) {
            c = 1;
        }
        if (i == 16) {
            shiftDown = false;
        }
        if (i == 17) {
            controlDown = false;
        }
        if (i == 39) {
            c = 2;
        }
        if (i == 38) {
            c = 3;
        }
        if (i == 40) {
            c = 4;
        }
        if (i == 17) {
            c = 5;
        }
        if (i == 8) {
            c = 8;
        }
        if (i == 127) {
            c = 8;
        }
        if (i == 9) {
            c = 9;
        }
        if (i == 10) {
            c = 10;
        }
        if (c <= 0) return;
        if (c >= 128) return;
        this.heldKeys[c] = 0;
    }

    public final void keyTyped(KeyEvent keyevent1) {
    }

    final int readCharacter() {
        int k = -1;
        if (this.writeIndex == this.readIndex) return k;
        k = this.charQueue[this.readIndex];
        this.readIndex = this.readIndex + 1 & 127;
        return k;
    }

    public final void focusGained(FocusEvent focusevent) {
        this.awtFocus = true;
        this.shouldClearScreen = true;
        this.raiseWelcomeScreen();
    }

    public final void focusLost(FocusEvent focusevent) {
        this.awtFocus = false;
        int i = 0;
        while (i < 128) {
            this.heldKeys[i] = 0;
            ++i;
        }
    }

    public final void windowActivated(WindowEvent windowevent1) {
    }

    public final void windowClosed(WindowEvent windowevent1) {
    }

    public final void windowClosing(WindowEvent windowevent) {
        this.destroy();
    }

    public final void windowDeactivated(WindowEvent windowevent1) {
    }

    public final void windowDeiconified(WindowEvent windowevent1) {
    }

    public final void windowIconified(WindowEvent windowevent1) {
    }

    public final void windowOpened(WindowEvent windowevent1) {
    }

    void startUp() {
    }

    void processGameLoop() {
    }

    void cleanUpForQuit() {
    }

    void processDrawing() {
    }

    void raiseWelcomeScreen() {
    }

    Component getGameComponent() {
        if (this.gameFrame == null) return this;
        return this.gameFrame;
    }

    public void startRunnable(Runnable runnable, int i) {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(i);
    }

    public void loadCursorImages() {
        int index = 0;
        while (index < this.cursorImages.length) {
            this.cursorImages[index] = this.getGameComponent().getToolkit().createImage(FileOperations.readFile(CacheType.SPRITES.getFullLocation() + "Hack3r/Cursors/Cursor " + index + ".png"));
            ++index;
        }
    }

    public void setCursor(int id) {
        if (this.currentCursor == id) {
            return;
        }
        this.currentCursor = id;
        if (id > this.cursorImages.length - 1) return;
        if (this.cursorImages[id] == null) {
            return;
        }
        this.getGameComponent().setCursor(this.getGameComponent().getToolkit().createCustomCursor(this.cursorImages[id], new Point(0, 0), null));
    }

    private int getChildHeight(RSInterface Interface, int Index) {
        return RSInterface.interfaceCache[Interface.children[Index]].height;
    }

    private int getChildWidth(RSInterface Interface, int Index) {
        return RSInterface.interfaceCache[Interface.children[Index]].width;
    }

    /*
     * Exception decompiling
     */
    private boolean interfaceScrollCheck(MouseWheelEvent e) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:486)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.rebuildSwitches(SwitchReplacer.java:334)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:508)
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

    void drawLoadingText(int percentage, String loadingText) {
        while (this.graphics == null) {
            this.graphics = (this.isApplet ? this : this.gameFrame).getGraphics();
            try {
                this.getGameComponent().repaint();
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                Thread.sleep((long)1000L);
            }
            catch (Exception exception) {}
        }
        Font font = new Font("Helvetica", 1, 13);
        FontMetrics fontmetrics = this.getGameComponent().getFontMetrics(font);
        Font font1 = new Font("Helvetica", 0, 13);
        FontMetrics fontmetrics1 = this.getGameComponent().getFontMetrics(font1);
        if (this.shouldClearScreen) {
            this.graphics.setColor(Color.black);
            this.graphics.fillRect(0, 0, Client.clientWidth, Client.clientHeight);
            this.shouldClearScreen = false;
        }
        Color color = new Color(140, 17, 17);
        int y = Client.clientHeight / 2 - 18;
        this.graphics.setColor(color);
        this.graphics.drawRect(Client.clientWidth / 2 - 152, y, 304, 34);
        this.graphics.fillRect(Client.clientWidth / 2 - 150, y + 2, percentage * 3, 30);
        this.graphics.setColor(Color.black);
        this.graphics.fillRect(Client.clientWidth / 2 - 150 + percentage * 3, y + 2, 300 - percentage * 3, 30);
        this.graphics.setFont(font);
        this.graphics.setColor(Color.white);
        this.graphics.drawString(loadingText, (Client.clientWidth - fontmetrics.stringWidth(loadingText)) / 2, y + 22);
        this.graphics.drawString("", (Client.clientWidth - fontmetrics1.stringWidth("")) / 2, y - 8);
    }

    RSApplet() {
    }

    public int getScreenWidth() {
        if (this.forceWidth < 0) return this.getRealScreenWidth();
        return this.forceWidth;
    }

    public int getScreenHeight() {
        if (this.forceHeight < 0) return this.getRealScreenHeight();
        return this.forceHeight;
    }

    public void updateGraphics(boolean clear) {
        this.offsetX = (this.getRealScreenWidth() - this.getScreenWidth()) / 2;
        this.offsetY = (this.getRealScreenHeight() - this.getScreenHeight()) / 2;
        this.graphics = this.getGameComponent().getGraphics();
        if (clear) {
            this.graphics.clearRect(0, 0, this.getRealScreenWidth(), this.getRealScreenHeight());
        }
        this.getGameComponent().setBackground(Color.BLACK);
    }

    public int getRealScreenWidth() {
        Component component = this.getGameComponent();
        if (component != null) {
            int w = component.getWidth();
            if (!(component instanceof Container)) return w;
            Insets insets = ((Container)component).getInsets();
            w -= insets.left + insets.right;
            return w;
        }
        if (this.forceWidth < 0) return 765;
        int n = this.forceWidth;
        return n;
    }

    public int getRealScreenHeight() {
        Component component = this.getGameComponent();
        if (component != null) {
            int h = component.getHeight();
            if (!(component instanceof Container)) return h;
            Insets insets = ((Container)component).getInsets();
            h -= insets.top + insets.bottom;
            return h;
        }
        if (this.forceHeight < 0) return 503;
        int n = this.forceHeight;
        return n;
    }

    static {
        hotKey = 508;
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
            int leftPos = (e.getX() - x_left) / 72;
            int rightPos = (e.getX() - x_right) / 72;
            if (rightPos == -1) {
                rightPos = 1;
            } else if (rightPos == -2) {
                rightPos = 2;
            }
            if (leftPos != RSApplet.this.leftHovers) {
                RSApplet.this.leftHovers = leftPos;
                this.panel.repaint();
                return;
            }
            if (rightPos == RSApplet.this.rightHovers) return;
            RSApplet.this.rightHovers = rightPos;
            this.panel.repaint();
        }

        public void mouseMoved(MouseEvent e) {
            int x_left = this.panel.getWidth() / 2 - 382;
            int x_right = this.panel.getWidth() / 2 + 382 + 2;
            int leftPos = (e.getX() - x_left) / 72;
            int rightPos = (e.getX() - x_right) / 72;
            if (rightPos == -1) {
                rightPos = 1;
            } else if (rightPos == -2) {
                rightPos = 2;
            }
            if (leftPos != RSApplet.this.leftHovers) {
                RSApplet.this.leftHovers = leftPos;
                this.panel.repaint();
                return;
            }
            if (rightPos == RSApplet.this.rightHovers) return;
            RSApplet.this.rightHovers = rightPos;
            this.panel.repaint();
        }

        public void mouseExited(MouseEvent e) {
            int leftPos = RSApplet.this.leftHovers;
            int rightPos = RSApplet.this.rightHovers;
            RSApplet.this.leftHovers = -1;
            RSApplet.this.rightHovers = -1;
            if (leftPos != RSApplet.this.leftHovers) {
                this.panel.repaint();
                return;
            }
            if (rightPos == RSApplet.this.rightHovers) return;
            this.panel.repaint();
        }

        public void mousePressed(MouseEvent e) {
            if (!SwingUtilities.isLeftMouseButton((MouseEvent)e)) return;
            int x_left = this.panel.getWidth() / 2 - 382;
            int x_right = this.panel.getWidth() / 2 + 382 + 2;
            int tabs_left = (e.getX() - x_left) / 72;
            int tabs_right = (e.getX() - x_right) / 72;
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

