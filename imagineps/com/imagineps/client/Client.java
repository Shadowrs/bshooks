/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.applet.Applet
 *  java.applet.AppletContext
 *  java.awt.Button
 *  java.awt.Color
 *  java.awt.Component
 *  java.awt.Dialog
 *  java.awt.Dimension
 *  java.awt.Font
 *  java.awt.Frame
 *  java.awt.Graphics
 *  java.awt.Graphics2D
 *  java.awt.GridLayout
 *  java.awt.Image
 *  java.awt.Label
 *  java.awt.LayoutManager
 *  java.awt.Panel
 *  java.awt.Point
 *  java.awt.TextField
 *  java.awt.Toolkit
 *  java.awt.datatransfer.Clipboard
 *  java.awt.datatransfer.ClipboardOwner
 *  java.awt.datatransfer.DataFlavor
 *  java.awt.datatransfer.StringSelection
 *  java.awt.datatransfer.Transferable
 *  java.awt.datatransfer.UnsupportedFlavorException
 *  java.awt.event.ActionEvent
 *  java.awt.event.ActionListener
 *  java.awt.event.KeyEvent
 *  java.awt.event.KeyListener
 *  java.awt.font.FontRenderContext
 *  java.awt.geom.AffineTransform
 *  java.awt.image.BufferedImage
 *  java.awt.image.FilteredImageSource
 *  java.awt.image.ImageFilter
 *  java.awt.image.ImageObserver
 *  java.awt.image.ImageProducer
 *  java.awt.image.RGBImageFilter
 *  java.awt.image.RenderedImage
 *  java.io.BufferedReader
 *  java.io.BufferedWriter
 *  java.io.ByteArrayInputStream
 *  java.io.DataInputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.FileReader
 *  java.io.FileWriter
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.io.Reader
 *  java.io.Writer
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.ClassCastException
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Process
 *  java.lang.ProcessBuilder
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.net.InetAddress
 *  java.net.NetworkInterface
 *  java.net.Socket
 *  java.net.SocketException
 *  java.net.URL
 *  java.net.UnknownHostException
 *  java.nio.ByteBuffer
 *  java.nio.channels.FileChannel
 *  java.nio.file.FileVisitResult
 *  java.nio.file.FileVisitor
 *  java.nio.file.Files
 *  java.nio.file.Path
 *  java.nio.file.Paths
 *  java.nio.file.SimpleFileVisitor
 *  java.nio.file.attribute.BasicFileAttributes
 *  java.text.NumberFormat
 *  java.util.AbstractMap
 *  java.util.AbstractMap$SimpleEntry
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Queue
 *  java.util.Random
 *  java.util.Scanner
 *  java.util.Set
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  javax.imageio.ImageIO
 *  javax.sound.midi.Sequencer
 *  javax.swing.JOptionPane
 */
package com.imagineps.client;

import com.imagineps.client.AccountData;
import com.imagineps.client.Animable_Sub4;
import com.imagineps.client.Animable_Sub5;
import com.imagineps.client.Bubble;
import com.imagineps.client.BuffTimerHandler;
import com.imagineps.client.Censor;
import com.imagineps.client.ChatMessage;
import com.imagineps.client.Class30_Sub1;
import com.imagineps.client.ClientFrame;
import com.imagineps.client.CollisionMap;
import com.imagineps.client.Compass;
import com.imagineps.client.Configuration;
import com.imagineps.client.ConnectionStatus;
import com.imagineps.client.CustomObjects;
import com.imagineps.client.Entity;
import com.imagineps.client.FileOperations;
import com.imagineps.client.GameObject;
import com.imagineps.client.GroundDecoration;
import com.imagineps.client.ISAACRandomGenerator;
import com.imagineps.client.InteractiveObject;
import com.imagineps.client.InterfaceTextInput;
import com.imagineps.client.Item;
import com.imagineps.client.MRUNodes;
import com.imagineps.client.MapRegion;
import com.imagineps.client.Mobile;
import com.imagineps.client.Model;
import com.imagineps.client.MouseDetection;
import com.imagineps.client.NPC;
import com.imagineps.client.Node;
import com.imagineps.client.NodeList;
import com.imagineps.client.OSValidator;
import com.imagineps.client.Player;
import com.imagineps.client.PlayerSettings;
import com.imagineps.client.Projectile;
import com.imagineps.client.RSApplet;
import com.imagineps.client.RSFont;
import com.imagineps.client.RSFrame;
import com.imagineps.client.RSSocket;
import com.imagineps.client.ScreenMode;
import com.imagineps.client.SkillStringData;
import com.imagineps.client.Skills;
import com.imagineps.client.Snow;
import com.imagineps.client.SoundProvider;
import com.imagineps.client.Sounds;
import com.imagineps.client.SpriteLoader;
import com.imagineps.client.Stopwatch;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.TextClass;
import com.imagineps.client.TextDrawingArea;
import com.imagineps.client.TextInput;
import com.imagineps.client.Utility;
import com.imagineps.client.VarBit;
import com.imagineps.client.Varp;
import com.imagineps.client.WallDecoration;
import com.imagineps.client.WallObject;
import com.imagineps.client.WorldController;
import com.imagineps.client.cache.CacheType;
import com.imagineps.client.cache.Decompressor;
import com.imagineps.client.cache.OnDemandData;
import com.imagineps.client.cache.OnDemandFetcher;
import com.imagineps.client.capatcha.ReCaptchaComponent;
import com.imagineps.client.definition.AnimationDefinition;
import com.imagineps.client.definition.FloorOverlay;
import com.imagineps.client.definition.FloorUnderlay;
import com.imagineps.client.definition.FrameReader;
import com.imagineps.client.definition.IDK;
import com.imagineps.client.definition.ItemDefinition;
import com.imagineps.client.definition.NPCDefinition;
import com.imagineps.client.definition.ObjectDefinition;
import com.imagineps.client.definition.RevisionType;
import com.imagineps.client.definition.SpotAnim;
import com.imagineps.client.graphics.Background;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.graphics.Rasterizer;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.login.LoginComponent;
import com.imagineps.client.login.LoginRenderer;
import com.imagineps.client.login.impl.MainScreen;
import com.imagineps.client.particles.Particle;
import com.imagineps.client.rs_interface.RSInterface;
import com.imagineps.client.rs_interface.impl.InputFieldWidget;
import com.imagineps.client.rs_interface.impl.MenuItem;
import com.imagineps.client.signlink.Signlink;
import com.imagineps.client.updater.Updater;
import com.imagineps.client.updater.screen.UpdaterRenderer;
import com.imagineps.content.AccountManager;
import com.imagineps.content.Settings;
import com.imagineps.content.alerts.Alert;
import com.imagineps.content.alerts.AlertHandler;
import com.imagineps.content.clan.ClanChat;
import com.imagineps.content.login_screen.LoginScreen;
import com.imagineps.content.login_screen.LoginScreenPopUp;
import com.imagineps.content.login_screen.LoginScreenWorldSelector;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.NumberFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.sound.midi.Sequencer;
import javax.swing.JOptionPane;

public class Client
extends RSApplet {
    public static final long serialVersionUID = 1L;
    public static ClientFrame clientFrame;
    public static boolean betaOnly;
    public static ScreenMode screenMode;
    private static Stopwatch loadingTime;
    public static final int NPC_BITS = 18;
    static final int[] skinColor2;
    public static int clientHeight;
    public static int clientWidth;
    public static int renderDistance;
    private static PlayerSettings playerSettings;
    public static int rotationX;
    public static int rotationY;
    public float LP;
    public static int chatIncreaseY;
    public static int chatIncreaseX;
    public static ArrayList<Bubble> bubbles;
    public static Client instance;
    public static boolean hdMinimap;
    public static int spellID;
    public boolean loginLoaded;
    public static int mapRegionsX;
    public static int mapRegionsY;
    public AccountData lastAccount;
    public static boolean enterToChat;
    public static boolean firstPersonMode;
    public int loginTick = 0;
    public static int totalRead;
    public static boolean wearingPumpkin;
    public int pmChatSize = 5;
    public int announcementTicks = 0;
    public int announcementFade = 0;
    public int announcementMovement = clientWidth - 2;
    public static int lala;
    public static int fadeStep;
    private static GraphicsBuffer gameScreenIP;
    private static final String[] CHANNEL_NAMES;
    public static boolean displayZoom;
    public static int displayZoomDuration;
    public static int[] displayAlertDuration;
    public static String[] alertTitle;
    public static String[] alertMessage;
    public static boolean announcement;
    public static String chatColorHex;
    private static final int MAXIMUM_CHAT_MESSAGE_AMOUNT = 500;
    static int focusTab;
    public static ReCaptchaComponent reCaptcha;
    public static final boolean CAPTCHA_ENABLED = true;
    public static Sprite[] cacheSprite;
    public static double cameraZoom;
    private static final boolean DISPLAY_MOUSE_COORDINATES = true;
    public static float particleOffset;
    public static int fadingTo;
    static int step;
    public static int[] excepSprite;
    static boolean switching;
    public static boolean autoFog;
    public static char[] xlateTable;
    public static int anInt849;
    public static int anInt854;
    public static int openInterfaceID;
    public static String[] cursorInfo;
    public static int anInt924;
    public static int nodeID;
    public static int portOff;
    static boolean clientData;
    public static boolean isMembers;
    public static boolean lowMem;
    public static int anInt986;
    static final int[][] equipmentColors;
    public static int anInt1005;
    public static final int[] anIntArray1019;
    public static int loadingStage;
    public static int baseX;
    public static int baseY;
    public static int anInt1051;
    public static int anInt1061;
    public static OnDemandFetcher onDemandFetcher;
    public static int anInt1069;
    public static int anInt1070;
    public static int anInt1089;
    public static int anInt1097;
    static boolean tabAreaAltered;
    public static int anInt1117;
    public static Player myPlayer;
    public static final int[] tabInterfaceIDs;
    public static int anInt1134;
    public static int anInt1142;
    static boolean needDrawTabArea;
    public static int anInt1155;
    public static boolean fpsOn;
    public static final String validUserPassChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    public static int anInt1175;
    public static int anInt1188;
    static final int[] anIntArray1204;
    public static boolean enableMipMapping;
    public static boolean flagged;
    public static int chatScrollTotalLength;
    public static int tabID;
    public static boolean inputTaken;
    public static int anInt1226;
    public static int[] anIntArray1232;
    public static int currentWalkingQueueSize;
    public static int anInt1290;
    public static int log_view_dist;
    public static int[] antialiasingPixels;
    public static int[] antialiasingOffsets;
    public static boolean transparentChat;
    public static boolean newTabs;
    public static ArrayList<Snow> snowFlakes;
    private static boolean loaded;
    static Random random;
    public BuffTimerHandler buffTimerHandler;
    public boolean isOneClick;
    public boolean tabToReply;
    public static RSFont newSmallFont;
    public static RSFont newRegularFont;
    public RSFont newBoldFont;
    public RSFont newFancyFont;
    public AlertHandler alertHandler;
    public Sprite alertBack;
    public Sprite alertBorder;
    public Sprite alertBorderH;
    public Sprite coinOrb;
    public Sprite coinPart;
    public boolean coinToggle;
    public Sprite coinOrbPart;
    public int frontLight;
    public int backLight;
    public int rightLight;
    public int middleLight;
    public int leftLight;
    public int followPlayer;
    public int followNPC;
    public int followDistance;
    private ClanChat clanChat;
    public static ConnectionStatus connectionStatus;
    public int[] positions;
    public int[] landScapes;
    public int[] objects;
    protected boolean resizing;
    public final int REGULAR_WIDTH = 765;
    public final int REGULAR_HEIGHT = 503;
    public final int RESIZABLE_WIDTH = 790;
    public final int RESIZABLE_HEIGHT = 600;
    public int gameScreenDrawX;
    public int gameScreenDrawY;
    public int yPaddingchatBackImage;
    public int xPaddingchatBackImage;
    public int yPaddingmapBackImage;
    public int xPaddingmapBackImage;
    public int xPaddingtabBack;
    public int yPaddingtabBack;
    public int mapIncreaseY;
    public int mapIncreaseX;
    public int tabIncreaseY;
    public int tabIncreaseX;
    public int main3DAreaWidth;
    public int main3DAreaHeight;
    public Sprite magicAuto;
    public boolean autoCast;
    public int autocastId;
    public int MapX;
    public int MapY;
    Mobile opponent;
    long hpOverlayTimer;
    int currentHealth;
    int maxHealth;
    public RSInterface inputFieldSelected;
    public int hoverSpriteId;
    private final Sprite[] chatAreaSprites;
    private int channelButtonHoverPosition;
    private int channelButtonClickPosition;
    private boolean yellChatMode;
    public int canWalkDelay;
    public String floorMaps;
    public String objectMaps;
    public int nukeTimer;
    public String LoadNumber;
    public String loadingText;
    public final int LOADING_BAR_PADDING = 100;
    public final int LOADING_BAR_SPACING = 60;
    public double loadingPercent;
    public final int TOTAL_LOADING_WIDTH_PERCENT = 2;
    public final int PROGRESS_COLOR = 14540253;
    public final int PROGRESS_TXET_COLOR = 16777215;
    public final int PROGRESS_ALPHA = 150;
    AffineTransform affinetransform;
    FontRenderContext frc;
    public boolean openBOX;
    public String donatorPayment;
    public InputFieldWidget currentInputField;
    private final ArrayList<ChatMessage> chatMessages;
    String[] captchaId;
    Dialog captchaDialog;
    Boolean captchaRequired;
    int num1;
    int num2;
    int cType;
    Object captchaAnswer;
    Object captchaLock;
    public StreamLoader[] archives;
    public boolean[] loadingFlags;
    public volatile boolean clientLoaded;
    private LoginScreenWorldSelector worldSelector;
    private int screenGliding;
    public int mapDrawAreaX;
    public int mapDrawAreaY;
    public int mapPaddingFromTop;
    public int mapPaddingFromLeft;
    public int mapPaddingFromBottom;
    public int mapPaddingFromRight;
    public int miniMapWidth;
    public int miniMapHeight;
    public int mapSpritesX;
    public int mapSpritesY;
    public int mapMovedX;
    public int mapMovedY;
    int mapInnerSizeWidth;
    int mapInnerSizeHeight;
    public boolean toolTips;
    private String tooltipText;
    private int tooltipWidth;
    private int tooltipHeight;
    private int tooltipXOffset;
    private int tooltipYOffset;
    private long hoverToolTip;
    public Sprite[] backingOrb;
    public Sprite[] genericOrbs;
    public Sprite[] healthOrbs;
    public Sprite[] prayerOrbs;
    public Sprite[] energyOrbs;
    public Sprite[] summoningOrbs;
    public boolean[] orbToggle;
    public int orbHover;
    public double[] lastOrbAmount;
    public String spec;
    public String myEmail;
    private LoginScreenPopUp loginScreenPopUp;
    public int[] quickPrayers;
    public int[] quickCurses;
    public boolean loadTickSelection;
    public int[] oldPrayerButtons;
    public final int[] curseLevelRequirements;
    public final String[] curseName;
    public int[] quickConfigIDs;
    public final int[] prayerLevelRequirements;
    public final String[] prayerName;
    public int[] defPray;
    public int[] strPray;
    public int[] atkPray;
    public int[] rangeAndMagePray;
    public int[] rangeAndMagePrayOff;
    public int[] headPray;
    public int[] superiorPray;
    public int[][] prayer;
    public int[] sapCurse;
    public int[] leechCurse;
    public int[] deflectCurse;
    public int editedTextFrame;
    public String newText;
    public int oldFogColor;
    public Sprite coinSimpleHover;
    public Sprite coinSimpleNormal;
    public Sprite coinSimpleHoverToggle;
    public Sprite coinComplexHoverToggle;
    public Sprite coinSimpleNormalToggle;
    public Sprite coinComplexNormalToggle;
    public Sprite coinpartHover;
    public Sprite coinpartNormal;
    public ArrayList<Particle> displayedParticles;
    public ArrayList<Particle> removeDeadParticles;
    public Sprite HPBarFull;
    public Sprite HPBarEmpty;
    public int chatTypeView;
    public boolean clanChatMode;
    public int duelMode;
    public Sprite CrownName;
    public Sprite emptyOrb;
    public Sprite emptyFOrb;
    public Sprite hoveredEmpty;
    public Sprite hoveredFEmpty;
    public Sprite runIcon1;
    public Sprite runIcon2;
    public Sprite runOrb1;
    public Sprite runOrb2;
    public Sprite hitPointsFill;
    public Sprite hitPointsIcon;
    public Sprite prayerFill;
    public Sprite prayerIcon;
    public Sprite[] tabArea;
    public Sprite mapArea;
    public Sprite[] tabAreaSprite;
    public GraphicsBuffer leftFrame;
    public GraphicsBuffer topFrame;
    public GraphicsBuffer rightFrame;
    public int ignoreCount;
    public long aLong824;
    public int[][] distanceValues;
    public int[] friendsNodeIDs;
    public NodeList[][][] groundArray;
    public int[] anIntArray828;
    public int[] anIntArray829;
    public volatile boolean aBoolean831;
    public Socket aSocket832;
    public Stream aStream_834;
    public NPC[] npcArray;
    public int npcCount;
    public int[] npcIndices;
    public int anInt839;
    public int[] anIntArray840;
    public int anInt841;
    public int anInt842;
    public int anInt843;
    public String aString844;
    public int privateChatMode;
    public Stream aStream_847;
    public boolean aBoolean848;
    public int[] anIntArray850;
    public int[] anIntArray851;
    public int[] anIntArray852;
    public int[] anIntArray853;
    public int hintType;
    public int xCameraPos;
    public int zCameraPos;
    public int yCameraPos;
    public int yCameraCurve;
    public int xCameraCurve;
    public int[] myPrivilege;
    public final int[] currentExp;
    public Sprite mapFlag;
    public Sprite mapMarker;
    public boolean aBoolean872;
    public final int[] anIntArray873;
    public int anInt874;
    public final boolean[] aBooleanArray876;
    public int weight;
    public MouseDetection mouseDetection;
    public volatile boolean drawFlames;
    public String reportAbuseInput;
    public int unknownInt10;
    public boolean menuOpen;
    public int hoverChildId;
    public String inputString;
    public final int maxPlayers;
    public final int myPlayerIndex;
    public Player[] playerArray;
    public int playerCount;
    public int[] playerIndices;
    public int anInt893;
    public int[] anIntArray894;
    public Stream[] aStreamArray895s;
    public int anInt896;
    public int anInt897;
    public int friendsCount;
    public int anInt900;
    public int[][] wayPoints;
    public byte[] aByteArray912;
    public int anInt913;
    public int crossX;
    public int crossY;
    public int crossIndex;
    public int crossType;
    public int plane;
    public final int[] currentStats;
    public final long[] ignoreListAsLongs;
    public boolean loadingError;
    public final int[] anIntArray928;
    public int[][] anIntArrayArray929;
    public Sprite aClass30_Sub2_Sub1_Sub1_931;
    public Sprite aClass30_Sub2_Sub1_Sub1_932;
    public int hintArrowPlayerID;
    public int hintArrowX;
    public int hintArrowY;
    public int anInt936;
    public int anInt937;
    public int anInt938;
    public int anInt945;
    public WorldController worldController;
    public Sprite[] sideIcons;
    public int menuScreenArea;
    public int menuOffsetX;
    public int menuOffsetY;
    public int menuWidth;
    public int menuHeight;
    public long aLong953;
    public boolean aBoolean954;
    public long[] friendsListAsLongs;
    public int currentSong;
    public volatile boolean drawingFlames;
    public int spriteDrawX;
    public int spriteDrawY;
    public final int[] anIntArray965;
    public final int[] compassPixelCutLeft;
    public final int[] anIntArray969;
    public final Decompressor[] decompressors;
    public int[] variousSettings;
    public boolean aBoolean972;
    public final int anInt975;
    public final int[] anIntArray976;
    public final int[] anIntArray977;
    public final int[] anIntArray978;
    public final int[] anIntArray979;
    public final int[] anIntArray980;
    public final int[] anIntArray981;
    public final int[] anIntArray982;
    public final String[] aStringArray983;
    public int anInt984;
    public int anInt985;
    public Sprite[][][] hitMarkBacks;
    public Sprite[] hitMarkIcons;
    public int anInt988;
    public int anInt989;
    public final int[] anIntArray990;
    public final boolean aBoolean994;
    public int anInt995;
    public int anInt996;
    public int anInt997;
    public int anInt998;
    public int anInt999;
    public ISAACRandomGenerator encryption;
    public Sprite mapEdge;
    public Sprite multiOverlay;
    public int tabIDHover;
    public String amountOrNameInput;
    public int daysSinceLastLogin;
    public int interfaceButtonAction;
    public int pktSize;
    public int pktType;
    public int anInt1009;
    public int anInt1010;
    public int anInt1011;
    public NodeList aClass19_1013;
    public int anInt1014;
    public int anInt1015;
    public int anInt1016;
    public boolean aBoolean1017;
    public int walkableInterfaceID;
    public int minimapCover;
    public int anInt1022;
    public Sprite[] scrollBar;
    public Sprite[] scrollArrow;
    public Sprite rightFrameSprite;
    public int lastHoverChildId;
    public final int[] anIntArray1030;
    public boolean aBoolean1031;
    public Sprite[] mapFunctions;
    public int anInt1036;
    public int anInt1037;
    public int loginFailures;
    public int anInt1039;
    public int anInt1040;
    public int anInt1041;
    public int dialogID;
    public final int[] maxStats;
    public final int[] anIntArray1045;
    public int anInt1046;
    public boolean aBoolean1047;
    public int anInt1048;
    public String aString1049;
    public final int[] mapImagePixelCutLeft;
    public StreamLoader titleStreamLoader;
    public int tabIconFlash;
    public int displayOverLayIcon;
    public NodeList aClass19_1056;
    public final int[] compassPixelCutRight;
    public final RSInterface aClass9_1059;
    public Background[] mapScenes;
    public int currentSound;
    public int friendsListAction;
    public final int[] anIntArray1065;
    public int mouseInvInterfaceIndex;
    public int lastActiveInvInterface;
    public int totalMapFunctions;
    public int[] mapFunctionX;
    public int[] mapFunctionY;
    public Sprite mapDotItem;
    public Sprite mapDotNPC;
    public Sprite mapDotPlayer;
    public Sprite mapDotFriend;
    public Sprite mapDotTeam;
    public Sprite mapDotClan;
    public int anInt1079;
    public boolean aBoolean1080;
    public String[] friendsList;
    public Stream inStream;
    public int anInt1084;
    public int anInt1085;
    public int activeInterfaceType;
    public int anInt1087;
    public int anInt1088;
    public final int[] expectedCRCs;
    public int[] menuActionCmd2;
    public int[] menuActionCmd3;
    public int[] menuActionID;
    public int[] menuActionCmd1;
    public Sprite[] headIcons;
    public Sprite[] cursesIcons;
    public Sprite[] skullIcons;
    public Sprite[] headIconsHint;
    public int anInt1098;
    public int anInt1099;
    public int anInt1100;
    public int anInt1101;
    public int anInt1102;
    public int systemUpdatetime;
    public GraphicsBuffer aGraphicsBuffer_1107;
    public GraphicsBuffer aGraphicsBuffer_1108;
    public static GraphicsBuffer updateScreenGraphicsBuffer;
    public static GraphicsBuffer loginScreenGraphicsBuffer;
    public GraphicsBuffer aGraphicsBuffer_1110;
    public GraphicsBuffer aGraphicsBuffer_1111;
    public GraphicsBuffer aGraphicsBuffer_1112;
    public GraphicsBuffer aGraphicsBuffer_1113;
    public GraphicsBuffer aGraphicsBuffer_1114;
    public GraphicsBuffer aGraphicsBuffer_1115;
    public int membersInt;
    public String aString1121;
    public Sprite compass;
    public GraphicsBuffer aGraphicsBuffer_1123;
    public GraphicsBuffer aGraphicsBuffer_1124;
    public GraphicsBuffer aGraphicsBuffer_1125;
    public final String[] atPlayerActions;
    public final boolean[] atPlayerArray;
    public final int[][][] anIntArrayArrayArray1129;
    public int anInt1131;
    public int anInt1132;
    public int menuActionRow;
    public int spellSelected;
    public int anInt1137;
    public int spellUsableOn;
    public String spellTooltip;
    public Sprite[] currentMapFunctions;
    public boolean aBoolean1141;
    public int energy;
    public boolean aBoolean1149;
    public Sprite[] crosses;
    public boolean musicEnabled;
    public int unreadMessages;
    public boolean loggedIn;
    public boolean canMute;
    public boolean canBan;
    public boolean aBoolean1159;
    public boolean aBoolean1160;
    public static int loopCycle;
    public GraphicsBuffer sideTabArea;
    public GraphicsBuffer mapEdgeIP;
    public GraphicsBuffer mapBackImage;
    public GraphicsBuffer main3DArea;
    public GraphicsBuffer chatBackImage;
    public int daysSinceRecovChange;
    public RSSocket socketStream;
    public int anInt1169;
    public int mapAmtDiffZoom;
    public int mapAmtCounterZoom;
    public long aLong1172;
    public String myUsername;
    public String myPassword;
    public final int[] anIntArray1177;
    public boolean tabSpace;
    public int mapHover;
    public int advisorHover;
    public int exitHover;
    public int reportAbuseInterfaceID;
    public NodeList aClass19_1179;
    public int[] anIntArray1180;
    public int[] anIntArray1181;
    public int[] anIntArray1182;
    public byte[][] aByteArrayArray1183;
    public int anInt1184;
    public int compassRotation;
    public int anInt1186;
    public int anInt1187;
    public int invOverlayInterfaceID;
    public int[] anIntArray1190;
    public int[] anIntArray1191;
    public Stream stream;
    public int anInt1193;
    public int splitPrivateChat;
    public Background[] mapBack;
    public String[] menuActionName;
    public Sprite aClass30_Sub2_Sub1_Sub1_1201;
    public Sprite aClass30_Sub2_Sub1_Sub1_1202;
    public final int[] anIntArray1203;
    public String nameYell;
    public String shoutYell;
    public Sprite[] inventoryStones;
    public final int[] soundIds;
    public int anInt1208;
    public int mapAmtDiffRotation;
    public int mapAmtCounterRotation;
    public String promptInput;
    public int anInt1213;
    public int[][][] intGroundArray;
    public long aLong1215;
    public int loginScreenCursorPos;
    public final Sprite[] modIcons;
    public long aLong1220;
    public int hintArrowNPCID;
    public int inputDialogState;
    public int nextSong;
    public final int[] mapImagePixelCutRight;
    public final CollisionMap[] collisionMaps;
    public int[] anIntArray1234;
    public int[] anIntArray1235;
    public int[] anIntArray1236;
    public int anInt1237;
    public int anInt1238;
    public final int anInt1239 = 100;
    public final int[] anIntArray1240;
    public final int[] soundType;
    public boolean aBoolean1242;
    public int atInventoryLoopCycle;
    public int atInventoryInterface;
    public int atInventoryIndex;
    public int atInventoryInterfaceType;
    public byte[][] aByteArrayArray1247;
    public int tradeMode;
    public int anInt1249;
    public final int[] soundDelay;
    public int anInt1251;
    public int anInt1253;
    public int mapTimedProcessCounter;
    public boolean welcomeScreenRaised;
    public boolean messagePromptRaised;
    public int anInt1257;
    public byte[][][] byteGroundArray;
    public int prevSong;
    public int destX;
    public int destY;
    public Sprite miniMapImage;
    public int arbitraryDestination;
    public int anInt1265;
    public String loginMessage;
    public AccountData accountToRemove;
    public int anInt1268;
    public int anInt1269;
    public TextDrawingArea smallFont;
    public TextDrawingArea normalFont;
    public TextDrawingArea boldFont;
    public TextDrawingArea fancyFont;
    public TextDrawingArea bigHit;
    public TextDrawingArea smallHit;
    public int anInt1275;
    public int backDialogID;
    public int anInt1278;
    public int anInt1279;
    public int[] walkingQueueX;
    public int[] walkingQueueY;
    public int itemSelected;
    public int itemSlotUsedOn;
    public int anInt1284;
    public int anInt1285;
    public String selectedItemName;
    public int publicChatMode;
    public int anInt1289;
    public boolean runClicked;
    public int drawCount;
    public int fullscreenInterfaceID;
    public int anInt1044;
    public int lastHoverToggleChildId;
    public int hoverToggleChildId;
    public int anInt1500;
    public Sprite infinityIcon;
    public int anInt1501;
    public int[] fullScreenTextureArray;
    public boolean counterOn;
    public boolean summoningAttack;
    public int xpAddedPos;
    public int expAdded;
    public int xpCounter;
    public Sprite[] XPcounterSprite;
    public Sprite[] exitButton;
    public Sprite[] worldMapIcon;
    public Sprite[] advisorButton;
    public String linkInText;
    public Map<Integer, int[]> customMapIcons;
    public int prayerInterfaceType;
    private int realPlane;
    public static int percentageColor;
    public static int steps;
    public static int fadingToColor;
    public static boolean switchColor;
    private int errorTime;
    private Runnable cleanup;
    public boolean changedRenderDistance;

    public static String capitalize(String s) {
        int i = 0;
        while (i < s.length()) {
            if (i == 0) {
                s = String.format((String)"%s%s", (Object[])new Object[]{Character.valueOf((char)Character.toUpperCase((char)s.charAt(0))), s.substring(1)});
            }
            if (!Character.isLetterOrDigit((char)s.charAt(i)) && i + 1 < s.length()) {
                s = String.format((String)"%s%s%s", (Object[])new Object[]{s.subSequence(0, i + 1), Character.valueOf((char)Character.toUpperCase((char)s.charAt(i + 1))), s.substring(i + 2)});
            }
            ++i;
        }
        return s;
    }

    public static String combatDiffColor(int i, int j) {
        int k = i - j;
        if (k < -9) {
            return "@red@";
        }
        if (k < -6) {
            return "@or3@";
        }
        if (k < -3) {
            return "@or2@";
        }
        if (k < 0) {
            return "@or1@";
        }
        if (k > 9) {
            return "@gre@";
        }
        if (k > 6) {
            return "@gr3@";
        }
        if (k > 3) {
            return "@gr2@";
        }
        if (k <= 0) return "@yel@";
        return "@gr1@";
    }

    static void drawSnow() {
        if (!ClientFrame.CHRISTMAS) return;
        if (!loaded) {
            int index = 0;
            do {
                if (index >= 100) {
                    loaded = true;
                    return;
                }
                snowFlakes.add((Object)new Snow());
                ++index;
            } while (true);
        }
        Iterator index = snowFlakes.iterator();
        while (index.hasNext()) {
            Snow snow = (Snow)index.next();
            if (snow == null) continue;
            snow.draw();
        }
    }

    public static void disableInputFields() {
        int i = 0;
        while (i < 20) {
            if (RSInterface.inputFields[i] != null) {
                RSInterface.inputFields[i].inputToggled = false;
                if (RSInterface.inputFields[i].inputText.equals((Object)"")) {
                    RSInterface.inputFields[i].inputText = RSInterface.inputFields[i].defaultText;
                }
            }
            ++i;
        }
    }

    public static String formatNumber(double number) {
        return NumberFormat.getInstance().format(number);
    }

    public static int getBaseX() {
        return baseX;
    }

    public static int getBaseY() {
        return baseY;
    }

    public static int getCheckup(String s) {
        char[] UIDFletcherInput = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[] UIDFletcherOutput = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71};
        int UID = 0;
        int i1 = 0;
        while (i1 < s.length()) {
            for (int i2 = 0; i2 < UIDFletcherInput.length; ++i2) {
                if (UIDFletcherInput[i2] != s.charAt(i1)) continue;
                UID += UIDFletcherOutput[i2];
            }
            ++i1;
        }
        return UID;
    }

    public static int getClientHeight() {
        return clientHeight;
    }

    public static int getClientWidth() {
        return clientWidth;
    }

    public static String getClipboardContents() {
        boolean hasTransferableText;
        String result = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents((Object)null);
        boolean bl = hasTransferableText = contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        if (hasTransferableText) {
            try {
                result = (String)contents.getTransferData(DataFlavor.stringFlavor);
            }
            catch (UnsupportedFlavorException ex) {
                System.out.println((Object)ex);
                ex.printStackTrace();
            }
            catch (IOException ex) {
                System.out.println((Object)ex);
                ex.printStackTrace();
            }
        }
        boolean error = false;
        int i = 0;
        while (i < result.length()) {
            block7 : {
                for (char x : xlateTable) {
                    if (result.charAt(i) != x) {
                        continue;
                    }
                    break block7;
                }
                error = true;
            }
            ++i;
        }
        return result;
    }

    public static String getFileNameWithoutExtension(String fileName) {
        File tmpFile = new File(fileName);
        tmpFile.getName();
        int whereDot = tmpFile.getName().lastIndexOf(46);
        if (0 >= whereDot) return "";
        if (whereDot > tmpFile.getName().length() - 2) return "";
        return tmpFile.getName().substring(0, whereDot);
    }

    public static AbstractMap.SimpleEntry<Integer, Integer> getNextInteger(ArrayList<Integer> values) {
        ArrayList frequencies = new ArrayList();
        int maxIndex = 0;
        int i = 0;
        do {
            block4 : {
                if (i >= values.size()) {
                    frequencies.add((Object)new AbstractMap.SimpleEntry((Object)0, (Object)1));
                    return (AbstractMap.SimpleEntry)frequencies.get(maxIndex);
                }
                int value = (Integer)values.get(i);
                for (int j = 0; j < frequencies.size(); ++j) {
                    if ((Integer)((AbstractMap.SimpleEntry)frequencies.get(j)).getKey() != value) continue;
                    ((AbstractMap.SimpleEntry)frequencies.get(j)).setValue((Object)((Integer)((AbstractMap.SimpleEntry)frequencies.get(j)).getValue() + 1));
                    if ((Integer)((AbstractMap.SimpleEntry)frequencies.get(maxIndex)).getValue() < (Integer)((AbstractMap.SimpleEntry)frequencies.get(j)).getValue()) {
                        maxIndex = j;
                    }
                    break block4;
                }
                frequencies.add((Object)new AbstractMap.SimpleEntry((Object)value, (Object)1));
            }
            ++i;
        } while (true);
    }

    public static Client getSingleton() {
        return instance;
    }

    public static int getZoomPercentage() {
        double d;
        if (cameraZoom > 1.0) {
            d = 100.0 / cameraZoom;
            return (int)d;
        }
        if (cameraZoom == 0.0) {
            d = 100.0;
            return (int)d;
        }
        d = 100.0 + (1.0 - cameraZoom) * 100.0;
        return (int)d;
    }

    public static boolean goodDistance(int objectX, int objectY, int playerX, int playerY, int distance) {
        if (playerX == objectX && playerY == objectY) {
            return true;
        }
        int i = 0;
        while (i <= distance) {
            for (int j = 0; j <= distance; ++j) {
                if (objectX + i == playerX) {
                    if (objectY + j == playerY) return true;
                    if (objectY - j == playerY) return true;
                    if (objectY == playerY) {
                        return true;
                    }
                }
                if (objectX - i == playerX) {
                    if (objectY + j == playerY) return true;
                    if (objectY - j == playerY) return true;
                    if (objectY == playerY) {
                        return true;
                    }
                }
                if (objectX != playerX) continue;
                if (objectY + j == playerY) return true;
                if (objectY - j == playerY) return true;
                if (objectY != playerY) continue;
                return true;
            }
            ++i;
        }
        return false;
    }

    private static BufferedImage imageToBufferedImage(Image image) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), 2);
        Graphics2D g2 = bufferedImage.createGraphics();
        g2.drawImage(image, 0, 0, null);
        g2.dispose();
        return bufferedImage;
    }

    public static String intToKOrMil(int j) {
        if (j < 100000) {
            return String.valueOf((int)j);
        }
        if (j >= 10000000) return "" + j / 1000000 + "M";
        return "" + j / 1000 + "K";
    }

    public static String intToKOrMilLongName(int i) {
        String s = String.valueOf((int)i);
        for (int k = s.length() - 3; k > 0; k -= 3) {
            s = s.substring(0, k) + "," + s.substring(k);
        }
        if (s.length() > 8) {
            s = "@gre@" + s.substring(0, s.length() - 8) + " million @whi@(" + s + ")";
            return " " + s;
        }
        if (s.length() <= 4) return " " + s;
        s = "@cya@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
        return " " + s;
    }

    public static boolean isDisplayingZoom() {
        return displayZoom;
    }

    public static boolean isFixed() {
        if (screenMode != ScreenMode.FIXED) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Imagine-PS is now starting up...");
        loadingTime = new Stopwatch();
        if (Configuration.DEBUG_MODE) {
            Client.start(args);
            return;
        }
        Client.start(new String[0]);
    }

    public static void start(String[] args) {
        Configuration.LOADING_MESSAGE = Utility.randomElement(Configuration.LOADING_MESSAGES);
        try {
            nodeID = 10;
            portOff = 0;
            Client.setHighMem();
            isMembers = true;
            Signlink.startpriv(InetAddress.getLocalHost());
            instance = new Client();
            clientFrame = new ClientFrame();
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Image makeColorTransparent(BufferedImage im, final Color color) {
        RGBImageFilter filter = new RGBImageFilter(){
            public int markerRGB;
            {
                this.markerRGB = color.getRGB() | -16777216;
            }

            public final int filterRGB(int x, int y, int rgb) {
                if ((rgb | -16777216) != this.markerRGB) return rgb;
                return 16777215 & rgb;
            }
        };
        FilteredImageSource ip = new FilteredImageSource(im.getSource(), (ImageFilter)filter);
        return Toolkit.getDefaultToolkit().createImage((ImageProducer)ip);
    }

    public static void saveValue(BufferedWriter buffer, String value, String variable, boolean last) {
        try {
            if (value == null || variable.equals((Object)"null")) {
                System.out.println("Error: saveValue had no identifier.");
            }
            if (variable == null || variable.equals((Object)"null")) {
                variable = "0";
            }
            if (value.startsWith("[") && value.endsWith("]")) {
                buffer.write(value, 0, value.length());
            } else {
                value = value + " = ";
                buffer.write(value, 0, value.length());
                buffer.write(variable, 0, variable.length());
            }
            buffer.newLine();
            if (!last) return;
            buffer.newLine();
            return;
        }
        catch (IOException ioexception) {
            ioexception.printStackTrace();
            return;
        }
        catch (NullPointerException nullpointerexception) {
            nullpointerexception.printStackTrace();
        }
    }

    public static void sendFrame126(String str, int i) {
        if (RSInterface.interfaceCache[i] == null) {
            return;
        }
        RSInterface.interfaceCache[i].message = str;
        if (RSInterface.interfaceCache[i].parentID != tabInterfaceIDs[tabID]) return;
        needDrawTabArea = true;
    }

    public static void setClipboardContents(String aString) {
        StringSelection stringSelection = new StringSelection(aString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents((Transferable)stringSelection, null);
    }

    public static void setDisplayZoom(boolean setTo) {
        displayZoom = setTo;
        displayZoomDuration = 75;
    }

    public static void setHighMem() {
        WorldController.lowMem = false;
        lowMem = false;
        MapRegion.lowMem = false;
        ObjectDefinition.lowMem = false;
    }

    public static void setLowMem() {
        WorldController.lowMem = true;
        lowMem = true;
        MapRegion.lowMem = true;
        ObjectDefinition.lowMem = true;
    }

    public static void setTab(int id) {
        focusTab = focusTab == id && !Client.isFixed() && newTabs ? -1 : id;
        needDrawTabArea = true;
        tabID = id;
        tabAreaAltered = true;
    }

    public static void writeFile(byte[] data, String fileName) throws IOException {
        FileOutputStream out = new FileOutputStream(fileName);
        out.write(data);
        out.close();
    }

    public static void writeTemp(String tempData) {
        try {
            BufferedWriter bw = new BufferedWriter((Writer)new FileWriter("./derp.txt", true));
            bw.write(tempData);
            bw.newLine();
            bw.flush();
            bw.close();
            return;
        }
        catch (IOException bw) {
            // empty catch block
        }
    }

    public Client() {
        this.buffTimerHandler = new BuffTimerHandler(this);
        this.isOneClick = true;
        this.tabToReply = true;
        this.coinToggle = false;
        this.frontLight = 68;
        this.backLight = 820;
        this.rightLight = 0;
        this.middleLight = -1;
        this.leftLight = 0;
        this.followPlayer = 0;
        this.followNPC = 0;
        this.followDistance = 1;
        this.clanChat = new ClanChat(this);
        this.positions = new int[2000];
        this.landScapes = new int[2000];
        this.objects = new int[2000];
        this.REGULAR_WIDTH = 765;
        this.REGULAR_HEIGHT = 503;
        this.RESIZABLE_WIDTH = 790;
        this.RESIZABLE_HEIGHT = 600;
        this.gameScreenDrawX = 4;
        this.gameScreenDrawY = 4;
        this.yPaddingchatBackImage = 338;
        this.xPaddingchatBackImage = 0;
        this.yPaddingmapBackImage = 0;
        this.xPaddingmapBackImage = 516;
        this.xPaddingtabBack = 519;
        this.yPaddingtabBack = 168;
        this.mapIncreaseY = 0;
        this.mapIncreaseX = 0;
        this.tabIncreaseY = 0;
        this.tabIncreaseX = 0;
        this.main3DAreaWidth = 512;
        this.main3DAreaHeight = 334;
        this.autoCast = false;
        this.autocastId = 0;
        this.opponent = null;
        this.hpOverlayTimer = 0L;
        this.inputFieldSelected = null;
        this.hoverSpriteId = -1;
        this.chatAreaSprites = new Sprite[8];
        this.channelButtonHoverPosition = -1;
        this.channelButtonClickPosition = 0;
        this.yellChatMode = true;
        this.canWalkDelay = 0;
        this.floorMaps = "";
        this.objectMaps = "";
        this.LoadNumber = "";
        this.LOADING_BAR_PADDING = 100;
        this.LOADING_BAR_SPACING = 60;
        this.loadingPercent = 0.0;
        this.TOTAL_LOADING_WIDTH_PERCENT = 2;
        this.PROGRESS_COLOR = 14540253;
        this.PROGRESS_TXET_COLOR = 16777215;
        this.PROGRESS_ALPHA = 150;
        this.affinetransform = new AffineTransform();
        this.frc = new FontRenderContext(this.affinetransform, true, true);
        this.openBOX = false;
        this.donatorPayment = "";
        this.chatMessages = new ArrayList();
        this.captchaId = new String[]{"+", "-", "*"};
        this.captchaRequired = false;
        this.captchaAnswer = null;
        this.captchaLock = new Object();
        this.archives = new StreamLoader[6];
        this.loadingFlags = new boolean[6];
        this.clientLoaded = false;
        this.mapDrawAreaX = 0;
        this.mapDrawAreaY = 516;
        this.mapPaddingFromTop = !Client.isFixed() ? 5 : 9;
        this.mapPaddingFromLeft = !Client.isFixed() ? 5 : 35;
        this.mapPaddingFromBottom = !Client.isFixed() ? 5 : 7;
        this.mapPaddingFromRight = !Client.isFixed() ? 5 : 62;
        this.miniMapWidth = !Client.isFixed() ? 163 : 249;
        this.miniMapHeight = !Client.isFixed() ? 163 : 168;
        this.mapSpritesX = 107;
        this.mapSpritesY = 88;
        this.mapMovedX = 29;
        this.mapMovedY = 4;
        this.mapInnerSizeWidth = this.miniMapWidth - (this.mapPaddingFromLeft + this.mapPaddingFromRight);
        this.mapInnerSizeHeight = this.miniMapHeight - (this.mapPaddingFromTop + this.mapPaddingFromBottom);
        this.toolTips = true;
        this.tooltipText = null;
        this.tooltipWidth = 0;
        this.tooltipHeight = 21;
        this.tooltipXOffset = 5;
        this.tooltipYOffset = 5;
        this.backingOrb = new Sprite[4];
        this.genericOrbs = new Sprite[7];
        this.healthOrbs = new Sprite[3];
        this.prayerOrbs = new Sprite[3];
        this.energyOrbs = new Sprite[7];
        this.summoningOrbs = new Sprite[4];
        this.orbToggle = new boolean[4];
        this.orbHover = -1;
        this.lastOrbAmount = new double[4];
        this.spec = "@gre@Normal (ECO) World";
        this.myEmail = "";
        this.quickPrayers = new int[26];
        this.quickCurses = new int[20];
        this.loadTickSelection = false;
        this.oldPrayerButtons = new int[]{5609, 5610, 5611, 18000, 18002, 5612, 5613, 5614, 5615, 5616, 5617, 18004, 18006, 5618, 5619, 5620, 5621, 5622, 5623, 18008, 18010, 683, 684, 685, 18012, 18014};
        this.curseLevelRequirements = new int[]{50, 50, 52, 54, 56, 59, 62, 65, 68, 71, 74, 76, 78, 80, 82, 84, 86, 89, 92, 95};
        this.curseName = new String[]{"Protect Item", "Sap Warrior", "Sap Ranger", "Sap Mage", "Sap Spirit", "Berserker", "Deflect Summoning", "Deflect Magic", "Deflect Missiles", "Deflect Melee", "Leech Attack", "Leech Ranged", "Leech Magic", "Leech Defence", "Leech Strength", "Leech Energy", "Leech Special Attack", "Wrath", "Soul Split", "Turmoil"};
        this.quickConfigIDs = new int[]{630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656};
        this.prayerLevelRequirements = new int[]{1, 4, 7, 8, 9, 10, 13, 16, 19, 22, 25, 26, 27, 28, 31, 34, 37, 40, 43, 44, 45, 46, 49, 52, 60, 70};
        this.prayerName = new String[]{"Thick Skin", "Burst of Strength", "Clarity of Thought", "Sharp Eye", "Mystic Will", "Rock Skin", "Superhuman Strength", "Improved Reflexes", "Rapid Restore", "Rapid Heal", "Protect Item", "Hawk Eye", "Mystic Lore", "Steel Skin", "Ultimate Strength", "Incredible Reflexes", "Protect from Magic", "Protect from Missiles", "Protect from Melee", "Eagle Eye", "Mystic Might", "Retribution", "Redemption", "Smite", "Chivalry", "Piety"};
        this.defPray = new int[]{0, 5, 13, 24, 25};
        this.strPray = new int[]{1, 3, 4, 6, 11, 12, 14, 19, 20, 24, 25};
        this.atkPray = new int[]{2, 3, 4, 7, 11, 12, 15, 19, 20, 24, 25};
        this.rangeAndMagePray = new int[]{3, 4, 11, 12, 19, 20, 24, 25};
        this.rangeAndMagePrayOff = new int[]{1, 2, 3, 4, 6, 7, 11, 12, 14, 15, 19, 20, 24, 25};
        this.headPray = new int[]{16, 17, 18, 21, 22, 23};
        this.superiorPray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13, 14, 15, 19, 20, 24, 25};
        this.prayer = new int[][]{this.defPray, this.strPray, this.atkPray, this.rangeAndMagePray, this.headPray};
        this.sapCurse = new int[]{1, 2, 3, 4, 19};
        this.leechCurse = new int[]{10, 11, 12, 13, 14, 15, 16, 19};
        this.deflectCurse = new int[]{7, 8, 9, 17, 18};
        this.editedTextFrame = 0;
        this.newText = "";
        this.oldFogColor = 0;
        this.clanChatMode = true;
        this.anIntArray965 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
        this.decompressors = new Decompressor[9];
        this.interfaceButtonAction = 0;
        this.scrollBar = new Sprite[8];
        this.scrollArrow = new Sprite[4];
        this.anIntArray1177 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        this.nameYell = "";
        this.shoutYell = "";
        this.collisionMaps = new CollisionMap[4];
        this.anInt1239 = 100;
        this.loginMessage = "";
        this.runClicked = false;
        this.exitButton = new Sprite[3];
        this.worldMapIcon = new Sprite[2];
        this.advisorButton = new Sprite[3];
        this.customMapIcons = new HashMap();
        this.errorTime = 10;
        this.cleanup = new Runnable(){

            public void run() {
                if (Configuration.SKIP_UPDATING) {
                    return;
                }
                if (Configuration.clientRunMode == Configuration.ClientRunMode.PACKAGED) {
                    return;
                }
                try {
                    if (Signlink.cache_dat != null) {
                        Signlink.cache_dat.close();
                    }
                    FileChannel[] arrfileChannel = Signlink.cache_idx;
                    int n = arrfileChannel.length;
                    int n2 = 0;
                    do {
                        if (n2 >= n) {
                            Client.removeRecursive(Paths.get((String)Signlink.getDirectory(), (String[])new String[0]));
                            return;
                        }
                        FileChannel channel = arrfileChannel[n2];
                        if (channel != null) {
                            channel.close();
                        }
                        ++n2;
                    } while (true);
                }
                catch (IOException cause) {
                    return;
                }
            }
        };
        this.LP = 0.0f;
        this.displayedParticles = new ArrayList(10000);
        this.removeDeadParticles = new ArrayList();
        this.alertHandler = new AlertHandler(this);
        this.inventoryStones = new Sprite[3];
        this.tabSpace = this.getScreenWidth() - 765 >= 492;
        this.mapBack = new Background[5];
        this.tabIDHover = -1;
        this.tabAreaSprite = new Sprite[2];
        this.linkInText = "";
        this.tabArea = new Sprite[2];
        this.XPcounterSprite = new Sprite[5];
        this.fullscreenInterfaceID = -1;
        this.chatTypeView = 0;
        this.spec = " @gre@1";
        this.distanceValues = new int[104][104];
        this.friendsNodeIDs = new int[200];
        this.groundArray = new NodeList[4][104][104];
        this.aBoolean831 = false;
        this.aStream_834 = new Stream(new byte[5000]);
        this.npcArray = new NPC[16384];
        this.npcIndices = new int[16384];
        this.anIntArray840 = new int[1000];
        this.aStream_847 = Stream.create();
        this.aBoolean848 = true;
        openInterfaceID = -1;
        this.currentExp = new int[25];
        this.aBoolean872 = false;
        this.anIntArray873 = new int[5];
        this.anInt874 = -1;
        this.aBooleanArray876 = new boolean[5];
        this.drawFlames = false;
        this.reportAbuseInput = "";
        this.unknownInt10 = -1;
        this.menuOpen = false;
        this.inputString = "";
        this.maxPlayers = 2048;
        this.myPlayerIndex = 2047;
        this.playerArray = new Player[40000];
        this.playerIndices = new int[this.maxPlayers];
        this.anIntArray894 = new int[this.maxPlayers];
        this.aStreamArray895s = new Stream[this.maxPlayers];
        this.anInt897 = 1;
        this.wayPoints = new int[104][104];
        this.aByteArray912 = new byte[16384];
        this.currentStats = new int[25];
        this.ignoreListAsLongs = new long[100];
        this.loadingError = false;
        this.anIntArray928 = new int[5];
        this.anIntArrayArray929 = new int[104][104];
        this.sideIcons = new Sprite[16];
        this.aBoolean954 = true;
        this.friendsListAsLongs = new long[200];
        this.currentSong = -1;
        this.drawingFlames = false;
        this.spriteDrawX = -1;
        this.spriteDrawY = -1;
        this.compassPixelCutLeft = new int[33];
        this.anIntArray969 = new int[256];
        this.variousSettings = new int[2000];
        this.aBoolean972 = false;
        this.anInt975 = 50;
        this.anIntArray976 = new int[this.anInt975];
        this.anIntArray977 = new int[this.anInt975];
        this.anIntArray978 = new int[this.anInt975];
        this.anIntArray979 = new int[this.anInt975];
        this.anIntArray980 = new int[this.anInt975];
        this.anIntArray981 = new int[this.anInt975];
        this.anIntArray982 = new int[this.anInt975];
        this.aStringArray983 = new String[this.anInt975];
        this.anInt985 = -1;
        this.hitMarkBacks = new Sprite[6][2][3];
        this.hitMarkIcons = new Sprite[20];
        this.anIntArray990 = new int[6];
        this.aBoolean994 = false;
        this.amountOrNameInput = "";
        this.aClass19_1013 = new NodeList();
        this.aBoolean1017 = false;
        this.walkableInterfaceID = -1;
        this.anIntArray1030 = new int[5];
        this.aBoolean1031 = false;
        this.mapFunctions = new Sprite[100];
        this.dialogID = -1;
        this.maxStats = new int[25];
        this.anIntArray1045 = new int[2000];
        this.aBoolean1047 = true;
        this.mapImagePixelCutLeft = new int[this.miniMapHeight - this.mapPaddingFromTop];
        this.mapImagePixelCutRight = new int[this.miniMapHeight - this.mapPaddingFromTop];
        this.tabIconFlash = -1;
        this.aClass19_1056 = new NodeList();
        this.compassPixelCutRight = new int[33];
        this.aClass9_1059 = new RSInterface();
        this.mapScenes = new Background[100];
        this.anIntArray1065 = new int[7];
        this.mapFunctionX = new int[1000];
        this.mapFunctionY = new int[1000];
        this.aBoolean1080 = false;
        this.friendsList = new String[200];
        this.inStream = Stream.create();
        this.expectedCRCs = new int[9];
        this.menuActionCmd2 = new int[500];
        this.menuActionCmd3 = new int[500];
        this.menuActionID = new int[500];
        this.menuActionCmd1 = new int[500];
        this.headIcons = new Sprite[20];
        this.cursesIcons = new Sprite[20];
        this.skullIcons = new Sprite[20];
        this.headIconsHint = new Sprite[20];
        tabAreaAltered = false;
        this.aString1121 = "";
        this.atPlayerActions = new String[5];
        this.atPlayerArray = new boolean[5];
        this.anIntArrayArrayArray1129 = new int[4][13][13];
        this.anInt1132 = 2;
        this.currentMapFunctions = new Sprite[1000];
        this.aBoolean1141 = false;
        this.aBoolean1149 = false;
        this.crosses = new Sprite[8];
        this.musicEnabled = true;
        needDrawTabArea = false;
        this.loggedIn = false;
        this.canMute = false;
        this.canBan = false;
        this.aBoolean1159 = false;
        this.aBoolean1160 = false;
        this.mapAmtCounterZoom = 1;
        this.myUsername = "";
        this.myPassword = "";
        this.reportAbuseInterfaceID = -1;
        this.aClass19_1179 = new NodeList();
        this.anInt1184 = 128;
        this.invOverlayInterfaceID = -1;
        this.stream = Stream.create();
        this.menuActionName = new String[500];
        this.anIntArray1203 = new int[5];
        this.soundIds = new int[50];
        this.mapAmtCounterRotation = 2;
        chatScrollTotalLength = 78;
        this.promptInput = "";
        this.modIcons = new Sprite[26];
        tabID = 3;
        inputTaken = false;
        this.anIntArray1240 = new int[100];
        this.soundType = new int[50];
        this.aBoolean1242 = false;
        this.soundDelay = new int[50];
        this.welcomeScreenRaised = false;
        this.messagePromptRaised = false;
        this.backDialogID = -1;
        this.anInt1279 = 2;
        this.walkingQueueX = new int[4000];
        this.walkingQueueY = new int[4000];
        this.anInt1289 = -1;
    }

    public void addFriend(long l) {
        try {
            if (l == 0L) {
                return;
            }
            if (this.friendsCount >= 100 && this.anInt1046 != 1) {
                this.pushMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", ChatMessage.ChatType.ZERO);
                return;
            }
            if (this.friendsCount >= 200) {
                this.pushMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", ChatMessage.ChatType.ZERO);
                return;
            }
            String s = TextClass.fixName(TextClass.nameForLong(l));
            for (int i = 0; i < this.friendsCount; ++i) {
                if (this.friendsListAsLongs[i] != l) continue;
                this.pushMessage(s + " is already on your friend list", ChatMessage.ChatType.ZERO);
                return;
            }
            for (int j = 0; j < this.ignoreCount; ++j) {
                if (this.ignoreListAsLongs[j] != l) continue;
                this.pushMessage("Please remove " + s + " from your ignore list first", ChatMessage.ChatType.ZERO);
                return;
            }
            if (s.equals((Object)Client.myPlayer.name)) {
                return;
            }
            this.friendsList[this.friendsCount] = s;
            this.friendsListAsLongs[this.friendsCount] = l;
            this.friendsNodeIDs[this.friendsCount] = 0;
            ++this.friendsCount;
            needDrawTabArea = true;
            this.stream.createFrame(188);
            this.stream.writeQWord(l);
            return;
        }
        catch (RuntimeException runtimeexception) {
            Signlink.reporterror("15283, 68, " + l + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void addIgnore(long l) {
        try {
            if (l == 0L) {
                return;
            }
            if (this.ignoreCount >= 100) {
                this.pushMessage("Your ignore list is full. Max of 100 hit", ChatMessage.ChatType.ZERO);
                return;
            }
            String s = TextClass.fixName(TextClass.nameForLong(l));
            for (int j = 0; j < this.ignoreCount; ++j) {
                if (this.ignoreListAsLongs[j] != l) continue;
                this.pushMessage(s + " is already on your ignore list", ChatMessage.ChatType.ZERO);
                return;
            }
            int k = 0;
            do {
                if (k >= this.friendsCount) {
                    this.ignoreListAsLongs[this.ignoreCount++] = l;
                    needDrawTabArea = true;
                    this.stream.createFrame(133);
                    this.stream.writeQWord(l);
                    return;
                }
                if (this.friendsListAsLongs[k] == l) {
                    this.pushMessage("Please remove " + s + " from your friend list first", ChatMessage.ChatType.ZERO);
                    return;
                }
                ++k;
            } while (true);
        }
        catch (RuntimeException runtimeexception) {
            Signlink.reporterror("45688, " + l + ", " + 4 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void addMenuAction(String actionName, int actionId, int command1, int command2, int command3) {
        this.menuActionName[this.menuActionRow] = actionName;
        this.menuActionID[this.menuActionRow] = actionId;
        if (command1 != -1) {
            this.menuActionCmd1[this.menuActionRow] = command1;
        }
        if (command2 != -1) {
            this.menuActionCmd2[this.menuActionRow] = command2;
        }
        if (command3 != -1) {
            this.menuActionCmd3[this.menuActionRow] = command3;
        }
        ++this.menuActionRow;
    }

    public void addObject(int objectId, int x, int y, int face, int type, int height) {
        if (type == 0 || type == 2) {
            int mX = baseX;
            int mY = baseY;
            int x2 = x - mX;
            int y2 = y - mY;
            int kz = type >> 2;
            int l17 = this.anIntArray1177[kz];
            if (y2 < 0) return;
            if (y2 >= 103) return;
            if (x2 < 0) return;
            if (x2 >= 103) return;
            this.method130(-1, objectId, face, l17, y2, kz, height, x2, 0);
            return;
        }
        if (type != 1) {
            if (type != 10) return;
        }
        int mX = baseX;
        int mY = baseY;
        int x2 = x - mX;
        int y2 = y - mY;
        int i15 = 10;
        int l17 = this.anIntArray1177[i15];
        if (y2 <= 0) return;
        if (y2 >= 103) return;
        if (x2 <= 0) return;
        if (x2 >= 103) return;
        this.method130(-1, objectId, face, l17, y2, type, height, x2, 0);
    }

    public final void addParticle(Particle var1) {
        this.displayedParticles.add((Object)var1);
    }

    public void adjustVolume(boolean flag, int i) {
        Signlink.midivol = i;
        if (!flag) return;
        Signlink.midi = "voladjust";
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public void build3dScreenMenu() {
        block42 : {
            block43 : {
                try {
                    drawY = Client.clientHeight - (Client.getClientWidth() > 850 ? 25 : 190);
                    drawX = Client.isFixed() != false ? 490 : Client.getClientWidth() - this.tabAreaSprite[0].myWidth - 30;
                    for (BuffTimerHandler.BuffTimer t : this.buffTimerHandler.getBuffTimers()) {
                        if (this.inSprite(false, t.getTimer().getSpriteId() > -1 ? Client.cacheSprite[t.getTimer().getSpriteId()] : ItemDefinition.getSprite(15332, 0, 0), drawX, drawY)) {
                            this.menuActionName[this.menuActionRow] = "Examine";
                            this.menuActionID[this.menuActionRow] = 5555;
                            this.menuActionCmd2[this.menuActionRow] = t.getTimer().getId();
                            ++this.menuActionRow;
                            this.drawTooltip(drawX - 100, drawY, t.getTimer().getName(), true);
                            return;
                        }
                        drawY -= 22;
                    }
                    if (this.itemSelected == 0 && this.spellSelected == 0) {
                        this.menuActionName[this.menuActionRow] = "Walk here";
                        this.menuActionID[this.menuActionRow] = 516;
                        this.menuActionCmd2[this.menuActionRow] = this.mouseX;
                        this.menuActionCmd3[this.menuActionRow] = this.mouseY;
                        ++this.menuActionRow;
                    }
                    j = -1;
                    k = 0;
                    while (k < Model.anInt1687) {
                        block44 : {
                            block45 : {
                                l = Model.anIntArray1688[k];
                                i1 = l & 127;
                                j1 = l >> 7 & 127;
                                k1 = l >> 29 & 3;
                                l1 = l >> 14 & 32767;
                                if (l == j) break block44;
                                j = l;
                                if (k1 != 2 || this.worldController.getObjectConfig(this.plane, i1, j1, l) < 0) break block45;
                                class46 = ObjectDefinition.forID(l1);
                                if (class46 == null) break block44;
                                if (class46.childrenIDs != null) {
                                    class46 = class46.method580();
                                }
                                if (class46.name == null) break block44;
                                if (this.itemSelected == 1) {
                                    this.menuActionName[this.menuActionRow] = "Use " + this.selectedItemName + " with @cya@" + class46.name;
                                    this.menuActionID[this.menuActionRow] = 62;
                                    this.menuActionCmd1[this.menuActionRow] = l;
                                    this.menuActionCmd2[this.menuActionRow] = i1;
                                    this.menuActionCmd3[this.menuActionRow] = j1;
                                    ++this.menuActionRow;
                                } else if (this.spellSelected == 1) {
                                    if ((this.spellUsableOn & 4) == 4) {
                                        this.menuActionName[this.menuActionRow] = this.spellTooltip + " @cya@" + class46.name;
                                        this.menuActionID[this.menuActionRow] = 956;
                                        this.menuActionCmd1[this.menuActionRow] = l;
                                        this.menuActionCmd2[this.menuActionRow] = i1;
                                        this.menuActionCmd3[this.menuActionRow] = j1;
                                        ++this.menuActionRow;
                                    }
                                } else {
                                    if (class46.itemActions != null) {
                                        for (i2 = 4; i2 >= 0; --i2) {
                                            if (class46.itemActions[i2] == null) continue;
                                            this.menuActionName[this.menuActionRow] = class46.itemActions[i2] + " @cya@" + class46.name;
                                            if (i2 == 0) {
                                                this.menuActionID[this.menuActionRow] = 502;
                                            }
                                            if (i2 == 1) {
                                                this.menuActionID[this.menuActionRow] = 900;
                                            }
                                            if (i2 == 2) {
                                                this.menuActionID[this.menuActionRow] = 113;
                                            }
                                            if (i2 == 3) {
                                                this.menuActionID[this.menuActionRow] = 872;
                                            }
                                            if (i2 == 4) {
                                                this.menuActionID[this.menuActionRow] = 1062;
                                            }
                                            this.menuActionCmd1[this.menuActionRow] = l;
                                            this.menuActionCmd2[this.menuActionRow] = i1;
                                            this.menuActionCmd3[this.menuActionRow] = j1;
                                            ++this.menuActionRow;
                                        }
                                    }
                                    if (!class46.name.toLowerCase().contains((CharSequence)"null")) {
                                        this.menuActionName[this.menuActionRow] = "Examine @cya@" + class46.name + (!(this.myPrivilege[0] != 8 && this.myPrivilege[0] != 7 && this.myPrivilege[0] != 6 || Client.clientData == false && Client.fpsOn == false) ? new StringBuilder().append(" @gre@(@whi@").append(l1).append("@gre@) (@whi@").append(i1 + Client.baseX).append(",").append(j1 + Client.baseY).append("@gre@)").append(class46.anIntArray773 == null ? "" : Arrays.toString((int[])class46.anIntArray773)).toString() : "");
                                        this.menuActionID[this.menuActionRow] = 1226;
                                        this.menuActionCmd1[this.menuActionRow] = class46.type << 14;
                                        this.menuActionCmd2[this.menuActionRow] = i1;
                                        this.menuActionCmd3[this.menuActionRow] = j1;
                                        ++this.menuActionRow;
                                    }
                                }
                            }
                            if (k1 == 1) {
                                npc = this.npcArray[l1];
                                if (npc.npcDefinition.boundDim == 1 && (npc.x & 127) == 64 && (npc.y & 127) == 64) {
                                    for (j2 = 0; j2 < this.npcCount; ++j2) {
                                        npc2 = this.npcArray[this.npcIndices[j2]];
                                        if (npc2 == null || npc2 == npc || npc2.npcDefinition.boundDim != 1 || npc2.x != npc.x || npc2.y != npc.y) continue;
                                        this.buildAtNPCMenu(npc2.npcDefinition, this.npcIndices[j2], j1, i1);
                                    }
                                    for (l2 = 0; l2 < this.playerCount; ++l2) {
                                        player = this.playerArray[this.playerIndices[l2]];
                                        if (player == null || player.x != npc.x || player.y != npc.y) continue;
                                        this.buildAtPlayerMenu(i1, this.playerIndices[l2], player, j1);
                                    }
                                }
                                this.buildAtNPCMenu(npc.npcDefinition, l1, j1, i1);
                            }
                            if (k1 == 0) {
                                player = this.playerArray[l1];
                                if ((player.x & 127) == 64 && (player.y & 127) == 64) {
                                    for (k2 = 0; k2 < this.npcCount; ++k2) {
                                        class30_sub2_sub4_sub1_sub1_2 = this.npcArray[this.npcIndices[k2]];
                                        if (class30_sub2_sub4_sub1_sub1_2 == null || class30_sub2_sub4_sub1_sub1_2.npcDefinition.boundDim != 1 || class30_sub2_sub4_sub1_sub1_2.x != player.x || class30_sub2_sub4_sub1_sub1_2.y != player.y) continue;
                                        this.buildAtNPCMenu(class30_sub2_sub4_sub1_sub1_2.npcDefinition, this.npcIndices[k2], j1, i1);
                                    }
                                    for (i3 = 0; i3 < this.playerCount; ++i3) {
                                        class30_sub2_sub4_sub1_sub2_2 = this.playerArray[this.playerIndices[i3]];
                                        if (class30_sub2_sub4_sub1_sub2_2 == null || class30_sub2_sub4_sub1_sub2_2 == player || class30_sub2_sub4_sub1_sub2_2.x != player.x || class30_sub2_sub4_sub1_sub2_2.y != player.y) continue;
                                        this.buildAtPlayerMenu(i1, this.playerIndices[i3], class30_sub2_sub4_sub1_sub2_2, j1);
                                    }
                                }
                                this.buildAtPlayerMenu(i1, l1, player, j1);
                            }
                            if (k1 == 3 && (class19 = this.groundArray[this.plane][i1][j1]) != null) {
                                item = (Item)class19.getFirst();
lbl110: // 2 sources:
                                if (item != null) {
                                    itemDef = ItemDefinition.forID(item.ID);
                                    v0 = name = item.customName != null ? item.customName : itemDef.name;
                                    if (this.itemSelected == 1) {
                                        this.menuActionName[this.menuActionRow] = "Use " + this.selectedItemName + " with @lre@" + name;
                                        this.menuActionID[this.menuActionRow] = 511;
                                        this.menuActionCmd1[this.menuActionRow] = item.ID;
                                        this.menuActionCmd2[this.menuActionRow] = i1;
                                        this.menuActionCmd3[this.menuActionRow] = j1;
                                        ++this.menuActionRow;
                                        break block42;
                                    }
                                    if (this.spellSelected != 1) break block43;
                                    if ((this.spellUsableOn & 1) == 1) {
                                        this.menuActionName[this.menuActionRow] = this.spellTooltip + " @lre@" + name;
                                        this.menuActionID[this.menuActionRow] = 94;
                                        this.menuActionCmd1[this.menuActionRow] = item.ID;
                                        this.menuActionCmd2[this.menuActionRow] = i1;
                                        this.menuActionCmd3[this.menuActionRow] = j1;
                                        ++this.menuActionRow;
                                    }
                                    break block42;
                                }
                            }
                        }
                        ++k;
                    }
                    return;
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
            for (j3 = 4; j3 >= 0; --j3) {
                if (itemDef.groundActions != null && itemDef.groundActions[j3] != null) {
                    this.menuActionName[this.menuActionRow] = itemDef.groundActions[j3] + " @lre@" + name;
                    if (j3 == 0) {
                        this.menuActionID[this.menuActionRow] = 652;
                    }
                    if (j3 == 1) {
                        this.menuActionID[this.menuActionRow] = 567;
                    }
                    if (j3 == 2) {
                        this.menuActionID[this.menuActionRow] = 234;
                    }
                    if (j3 == 3) {
                        this.menuActionID[this.menuActionRow] = 244;
                    }
                    if (j3 == 4) {
                        this.menuActionID[this.menuActionRow] = 213;
                    }
                    this.menuActionCmd1[this.menuActionRow] = item.ID;
                    this.menuActionCmd2[this.menuActionRow] = i1;
                    this.menuActionCmd3[this.menuActionRow] = j1;
                    ++this.menuActionRow;
                    continue;
                }
                if (j3 != 2) continue;
                this.menuActionName[this.menuActionRow] = "Take @lre@" + name;
                this.menuActionID[this.menuActionRow] = 234;
                this.menuActionCmd1[this.menuActionRow] = item.ID;
                this.menuActionCmd2[this.menuActionRow] = i1;
                this.menuActionCmd3[this.menuActionRow] = j1;
                ++this.menuActionRow;
            }
            this.menuActionName[this.menuActionRow] = "Examine @lre@" + name + (!(this.myPrivilege[0] != 8 && this.myPrivilege[0] != 7 && this.myPrivilege[0] != 6 || Client.clientData == false && Client.fpsOn == false) ? new StringBuilder().append(" @whi@(ID)@gre@").append(item.ID).append(" @whi@(Fem/Male)@gre@ ").append(itemDef.maleEquipt).append("/").append(itemDef.femaleEquipt).append(" @whi@(Drop)@gre@ ").append(itemDef.groundModelId).toString() : "");
            this.menuActionID[this.menuActionRow] = 1448;
            this.menuActionCmd1[this.menuActionRow] = item.ID;
            this.menuActionCmd2[this.menuActionRow] = i1;
            this.menuActionCmd3[this.menuActionRow] = j1;
            ++this.menuActionRow;
        }
        item = (Item)class19.getNext();
        ** GOTO lbl110
    }

    public void buildAtNPCMenu(NPCDefinition entityDef, int i, int j, int k) {
        if (this.menuActionRow >= 400) {
            return;
        }
        if (entityDef.childrenIDs != null) {
            entityDef = entityDef.method161();
        }
        if (entityDef == null) {
            return;
        }
        if (!entityDef.aBoolean84) {
            return;
        }
        if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.HIDE_NPCS)) return;
        if (entityDef.name.toLowerCase().equalsIgnoreCase("pumpkin") && !wearingPumpkin) {
            return;
        }
        String s = entityDef.name;
        if (entityDef.combatLevel != 0) {
            s = s + Client.combatDiffColor(Client.myPlayer.combatLevel, entityDef.combatLevel) + " (level:" + entityDef.combatLevel + ")";
        }
        if (this.summoningAttack) {
            this.menuActionName[this.menuActionRow] = "Use familiar attack with @whi@" + s;
            this.menuActionID[this.menuActionRow] = 582;
            this.menuActionCmd1[this.menuActionRow] = i;
            this.menuActionCmd2[this.menuActionRow] = k;
            this.menuActionCmd3[this.menuActionRow] = j;
            ++this.menuActionRow;
            return;
        }
        if (this.itemSelected == 1) {
            this.menuActionName[this.menuActionRow] = "Use " + this.selectedItemName + " with @yel@" + s;
            this.menuActionID[this.menuActionRow] = 582;
            this.menuActionCmd1[this.menuActionRow] = i;
            this.menuActionCmd2[this.menuActionRow] = k;
            this.menuActionCmd3[this.menuActionRow] = j;
            ++this.menuActionRow;
            return;
        }
        if (this.spellSelected == 1) {
            if ((this.spellUsableOn & 2) != 2) return;
            this.menuActionName[this.menuActionRow] = this.spellTooltip + " @yel@" + s;
            this.menuActionID[this.menuActionRow] = 413;
            this.menuActionCmd1[this.menuActionRow] = i;
            this.menuActionCmd2[this.menuActionRow] = k;
            this.menuActionCmd3[this.menuActionRow] = j;
            ++this.menuActionRow;
            return;
        }
        if (entityDef.actions != null) {
            for (int l = 4; l >= 0; --l) {
                if (entityDef.actions[l] == null || entityDef.actions[l].equalsIgnoreCase("attack") || entityDef.name.toLowerCase().contains((CharSequence)"pet") && entityDef.actions[l].contains((CharSequence)"Pick-up")) continue;
                this.menuActionName[this.menuActionRow] = entityDef.actions[l] + " @yel@" + s + (!(this.myPrivilege[0] != 8 && this.myPrivilege[0] != 7 && this.myPrivilege[0] != 6 || !clientData && !fpsOn) ? new StringBuilder().append(" (@cya@Id: ").append(entityDef.type).append("@yel@)").toString() : "");
                if (l == 0) {
                    this.menuActionID[this.menuActionRow] = 20;
                }
                if (l == 1) {
                    this.menuActionID[this.menuActionRow] = 412;
                }
                if (l == 2) {
                    this.menuActionID[this.menuActionRow] = 225;
                }
                if (l == 3) {
                    this.menuActionID[this.menuActionRow] = 965;
                }
                if (l == 4) {
                    this.menuActionID[this.menuActionRow] = 478;
                }
                this.menuActionCmd1[this.menuActionRow] = i;
                this.menuActionCmd2[this.menuActionRow] = k;
                this.menuActionCmd3[this.menuActionRow] = j;
                ++this.menuActionRow;
            }
        }
        if (entityDef.actions != null) {
            for (int i1 = 4; i1 >= 0; --i1) {
                if (entityDef.actions[i1] == null || !entityDef.actions[i1].equalsIgnoreCase("attack")) continue;
                int c = 0;
                if (!this.isOneClick && entityDef.combatLevel > Client.myPlayer.combatLevel) {
                    c = 2000;
                }
                this.menuActionName[this.menuActionRow] = entityDef.actions[i1] + " @yel@" + s;
                if (i1 == 0) {
                    this.menuActionID[this.menuActionRow] = 20 + c;
                }
                if (i1 == 1) {
                    this.menuActionID[this.menuActionRow] = 412 + c;
                }
                if (i1 == 2) {
                    this.menuActionID[this.menuActionRow] = 225 + c;
                }
                if (i1 == 3) {
                    this.menuActionID[this.menuActionRow] = 965 + c;
                }
                if (i1 == 4) {
                    this.menuActionID[this.menuActionRow] = 478 + c;
                }
                this.menuActionCmd1[this.menuActionRow] = i;
                this.menuActionCmd2[this.menuActionRow] = k;
                this.menuActionCmd3[this.menuActionRow] = j;
                ++this.menuActionRow;
            }
        }
        if (entityDef.combatLevel <= 0) return;
        this.menuActionName[this.menuActionRow] = "Check Drops @yel@" + s + (!(this.myPrivilege[0] != 8 && this.myPrivilege[0] != 7 && this.myPrivilege[0] != 6 || !clientData && !fpsOn) ? new StringBuilder().append(", @gre@(@whi@ID: ").append(entityDef.type).append(", Model: ").append(entityDef.models[0]).append("@gre@)").toString() : "");
        this.menuActionID[this.menuActionRow] = 1025;
        this.menuActionCmd1[this.menuActionRow] = i;
        this.menuActionCmd2[this.menuActionRow] = k;
        this.menuActionCmd3[this.menuActionRow] = j;
        ++this.menuActionRow;
    }

    public void buildAtPlayerMenu(int i, int j, Player player, int k) {
        if (player == myPlayer) {
            return;
        }
        if (this.menuActionRow >= 400) {
            return;
        }
        String s = player.skill == 0 ? player.name + Client.combatDiffColor(Client.myPlayer.combatLevel, player.combatLevel) + " (level-" + player.combatLevel + ")" : "@" + player.contextColor() + "@" + player.getRank() + "@whi@" + player.name + Client.combatDiffColor(Client.myPlayer.combatLevel, player.combatLevel) + " (level-" + player.combatLevel + ")";
        if (this.summoningAttack) {
            this.menuActionName[this.menuActionRow] = "Use familiar attack with @whi@" + s;
            this.menuActionID[this.menuActionRow] = 491;
            this.menuActionCmd1[this.menuActionRow] = j;
            this.menuActionCmd2[this.menuActionRow] = i;
            this.menuActionCmd3[this.menuActionRow] = k;
            ++this.menuActionRow;
        }
        if (this.itemSelected == 1) {
            this.menuActionName[this.menuActionRow] = "Use " + this.selectedItemName + " with @whi@" + s;
            this.menuActionID[this.menuActionRow] = 491;
            this.menuActionCmd1[this.menuActionRow] = j;
            this.menuActionCmd2[this.menuActionRow] = i;
            this.menuActionCmd3[this.menuActionRow] = k;
            ++this.menuActionRow;
        } else {
            for (int index = 4; index >= 0; --index) {
                if (this.atPlayerActions[index] == null) continue;
                this.menuActionName[this.menuActionRow] = this.atPlayerActions[index] + " @whi@" + s;
                int c = 0;
                if (this.atPlayerActions[index].equalsIgnoreCase("attack")) {
                    if (!this.isOneClick && player.combatLevel > Client.myPlayer.combatLevel) {
                        c = 2000;
                    }
                    if (Client.myPlayer.team != 0 && player.team != 0) {
                        c = Client.myPlayer.team == player.team ? 2000 : 0;
                    }
                } else if (this.atPlayerArray[index]) {
                    c = 2000;
                }
                if (index == 0) {
                    this.menuActionID[this.menuActionRow] = 561 + c;
                }
                if (index == 1) {
                    this.menuActionID[this.menuActionRow] = 779 + c;
                }
                if (index == 2) {
                    this.menuActionID[this.menuActionRow] = 27 + c;
                }
                if (index == 3) {
                    this.menuActionID[this.menuActionRow] = 577 + c;
                }
                if (index == 4) {
                    this.menuActionID[this.menuActionRow] = 729 + c;
                }
                this.menuActionCmd1[this.menuActionRow] = j;
                this.menuActionCmd2[this.menuActionRow] = i;
                this.menuActionCmd3[this.menuActionRow] = k;
                ++this.menuActionRow;
            }
            if (this.spellSelected == 1 && (this.spellUsableOn & 8) == 8) {
                this.menuActionName[this.menuActionRow] = this.spellTooltip + " @whi@" + s;
                this.menuActionID[this.menuActionRow] = 365;
                this.menuActionCmd1[this.menuActionRow] = j;
                this.menuActionCmd2[this.menuActionRow] = i;
                this.menuActionCmd3[this.menuActionRow] = k;
                ++this.menuActionRow;
            }
        }
        int i1 = 0;
        while (i1 < this.menuActionRow) {
            if (this.menuActionID[i1] == 516) {
                this.menuActionName[i1] = "Walk here @whi@" + s;
                return;
            }
            ++i1;
        }
    }

    public void buildChatAreaMenu(int paddingY) {
        int totalLines = 0;
        Iterator iterator = this.chatMessages.iterator();
        while (iterator.hasNext()) {
            ChatMessage message = (ChatMessage)iterator.next();
            if (message == null) continue;
            int chatType = message.getType().getType();
            int scrollYPos = 70 - totalLines * 14 + 42 + anInt1089 + 4 + 5;
            if (scrollYPos < -23) {
                return;
            }
            String name = message.getName();
            if (this.chatTypeView == 1) {
                this.buildPublicChat(paddingY);
                return;
            }
            if (this.chatTypeView == 2) {
                this.buildFriendChat(paddingY);
                return;
            }
            if (this.chatTypeView == 3 || this.chatTypeView == 4) {
                this.buildDuelorTrade(paddingY);
                return;
            }
            if (this.chatTypeView == 5) {
                return;
            }
            if (chatType == 0) {
                ++totalLines;
            }
            if ((chatType == 1 || chatType == 2) && (chatType == 1 || this.publicChatMode == 0 || this.publicChatMode == 1 && this.isFriendOrSelf(name))) {
                if (paddingY > scrollYPos - 14 && paddingY <= scrollYPos && !name.equals((Object)Client.myPlayer.name)) {
                    if (this.myPrivilege[0] == 8 || this.myPrivilege[0] == 7 || this.myPrivilege[0] == 6) {
                        this.menuActionName[this.menuActionRow] = "Staff Panel @whi@" + name;
                        this.menuActionID[this.menuActionRow] = 606;
                        ++this.menuActionRow;
                    }
                    this.menuActionName[this.menuActionRow] = "Add ignore @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 42;
                    ++this.menuActionRow;
                    this.menuActionName[this.menuActionRow] = "Reply to @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 639;
                    ++this.menuActionRow;
                    this.menuActionName[this.menuActionRow] = "Add friend @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 337;
                    ++this.menuActionRow;
                }
                ++totalLines;
            }
            if ((chatType == 3 || chatType == 7) && this.splitPrivateChat == 0 && (chatType == 7 || this.privateChatMode == 0 || this.privateChatMode == 1 && this.isFriendOrSelf(name))) {
                if (paddingY > scrollYPos - 14 && paddingY <= scrollYPos) {
                    if (this.myPrivilege[0] == 8 || this.myPrivilege[0] == 7 || this.myPrivilege[0] == 6) {
                        this.menuActionName[this.menuActionRow] = "Staff Panel @whi@" + name;
                        this.menuActionID[this.menuActionRow] = 606;
                        ++this.menuActionRow;
                    }
                    this.menuActionName[this.menuActionRow] = "Add ignore @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 42;
                    ++this.menuActionRow;
                    this.menuActionName[this.menuActionRow] = "Reply to @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 639;
                    ++this.menuActionRow;
                    this.menuActionName[this.menuActionRow] = "Add friend @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 337;
                    ++this.menuActionRow;
                }
                ++totalLines;
            }
            if (chatType == 4 && (this.tradeMode == 0 || this.tradeMode == 1 && this.isFriendOrSelf(name))) {
                if (paddingY > scrollYPos - 14 && paddingY <= scrollYPos) {
                    this.menuActionName[this.menuActionRow] = "Accept trade @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 484;
                    ++this.menuActionRow;
                }
                ++totalLines;
            }
            if (message.getType() == ChatMessage.ChatType.GAMBLE) {
                if (paddingY > scrollYPos - 14 && paddingY <= scrollYPos) {
                    this.menuActionName[this.menuActionRow] = "Accept gamble @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 4444;
                    ++this.menuActionRow;
                }
                ++totalLines;
            } else if (message.getType() == ChatMessage.ChatType.URL) {
                if (paddingY > scrollYPos - 14 && paddingY <= scrollYPos) {
                    String displayLink = name.length() > 30 ? name.substring(0, 25) + "..." : name;
                    this.menuActionName[this.menuActionRow] = "Open page: " + displayLink;
                    this.menuActionID[this.menuActionRow] = 485;
                    ++this.menuActionRow;
                    this.linkInText = name;
                }
                ++totalLines;
            } else if (message.getType() == ChatMessage.ChatType.YELL && (this.chatTypeView == 0 || this.chatTypeView == 12) && this.yellChatMode && !this.isSelf(name)) {
                if (paddingY > scrollYPos - 14 && paddingY <= scrollYPos) {
                    if (this.myPrivilege[0] == 8 || this.myPrivilege[0] == 7 || this.myPrivilege[0] == 6) {
                        this.menuActionName[this.menuActionRow] = "Staff Panel @whi@" + name;
                        this.menuActionID[this.menuActionRow] = 606;
                        ++this.menuActionRow;
                    }
                    if (this.isFriend(name)) {
                        this.menuActionName[this.menuActionRow] = "Reply to @whi@" + name;
                        this.menuActionID[this.menuActionRow] = 639;
                        ++this.menuActionRow;
                    } else {
                        this.menuActionName[this.menuActionRow] = "Add ignore @whi@" + name;
                        this.menuActionID[this.menuActionRow] = 42;
                        ++this.menuActionRow;
                        this.menuActionName[this.menuActionRow] = "Add friend @whi@" + name;
                        this.menuActionID[this.menuActionRow] = 337;
                        ++this.menuActionRow;
                    }
                }
                ++totalLines;
            }
            if ((chatType == 5 || chatType == 6) && this.splitPrivateChat == 0 && this.privateChatMode < 2) {
                ++totalLines;
            }
            if (chatType != 8 || this.tradeMode != 0 && (this.tradeMode != 1 || !this.isFriendOrSelf(name))) continue;
            if (paddingY > scrollYPos - 14 && paddingY <= scrollYPos) {
                this.menuActionName[this.menuActionRow] = "Accept challenge @whi@" + name;
                this.menuActionID[this.menuActionRow] = 6;
                ++this.menuActionRow;
            }
            ++totalLines;
        }
    }

    public void buildDuelorTrade(int j) {
        int l = 0;
        Iterator iterator = this.chatMessages.iterator();
        while (iterator.hasNext()) {
            ChatMessage message = (ChatMessage)iterator.next();
            if (message == null || this.chatTypeView != 3 && this.chatTypeView != 4) continue;
            int chatType = message.getType().getType();
            int k1 = 70 - l * 14 + 42 + anInt1089 + 4 + 5;
            if (k1 < -23) {
                return;
            }
            if (this.chatTypeView == 3 && chatType == 4 && (this.tradeMode == 0 || this.tradeMode == 1 && this.isFriendOrSelf(message.getName()))) {
                if (j > k1 - 14 && j <= k1) {
                    this.menuActionName[this.menuActionRow] = "Accept trade @whi@" + message.getName();
                    this.menuActionID[this.menuActionRow] = 484;
                    ++this.menuActionRow;
                }
                ++l;
            }
            if (chatType == 9) {
                if (j > k1 - 14 && j <= k1) {
                    String displayLink = message.getName();
                    this.menuActionName[this.menuActionRow] = "Open page: " + displayLink;
                    this.menuActionID[this.menuActionRow] = 485;
                    ++this.menuActionRow;
                    this.linkInText = message.getName();
                }
                ++l;
            }
            if (this.chatTypeView == 4 && chatType == 8 && (this.tradeMode == 0 || this.tradeMode == 1 && this.isFriendOrSelf(message.getName()))) {
                if (j > k1 - 14 && j <= k1) {
                    this.menuActionName[this.menuActionRow] = "Accept challenge @whi@" + message.getName();
                    this.menuActionID[this.menuActionRow] = 6;
                    ++this.menuActionRow;
                }
                ++l;
            }
            if (chatType != 12) continue;
            if (j > k1 - 14 && j <= k1) {
                this.menuActionName[this.menuActionRow] = "Go-to @blu@" + message.getName();
                this.menuActionID[this.menuActionRow] = 915;
                ++this.menuActionRow;
            }
            ++l;
        }
    }

    public void buildFriendChat(int j) {
        int l = 0;
        Iterator iterator = this.chatMessages.iterator();
        while (iterator.hasNext()) {
            ChatMessage message = (ChatMessage)iterator.next();
            if (message == null || this.chatTypeView != 2) continue;
            int chatType = message.getType().getType();
            int k1 = 70 - l * 14 + 42 + anInt1089 + 4 + 5;
            if (k1 < -23) {
                return;
            }
            if (!(chatType != 5 && chatType != 6 || this.splitPrivateChat != 0 && this.chatTypeView != 2 || chatType != 6 && this.privateChatMode != 0 && (this.privateChatMode != 1 || !this.isFriendOrSelf(message.getName())))) {
                ++l;
            }
            if (chatType != 3 && chatType != 7 || this.splitPrivateChat != 0 && this.chatTypeView != 2 || chatType != 7 && this.privateChatMode != 0 && (this.privateChatMode != 1 || !this.isFriendOrSelf(message.getName()))) continue;
            if (j > k1 - 14 && j <= k1) {
                if (this.myPrivilege[0] == 1) {
                    this.menuActionName[this.menuActionRow] = "Staff Panel @whi@" + message.getName();
                    this.menuActionID[this.menuActionRow] = 606;
                    ++this.menuActionRow;
                }
                this.menuActionName[this.menuActionRow] = "Add ignore @whi@" + message.getName();
                this.menuActionID[this.menuActionRow] = 42;
                ++this.menuActionRow;
                this.menuActionName[this.menuActionRow] = "Reply to @whi@" + message.getName();
                this.menuActionID[this.menuActionRow] = 639;
                ++this.menuActionRow;
                this.menuActionName[this.menuActionRow] = "Add friend @whi@" + message.getName();
                this.menuActionID[this.menuActionRow] = 337;
                ++this.menuActionRow;
            }
            ++l;
        }
    }

    public boolean buildFriendsListMenu(RSInterface class9) {
        int i = class9.contentType;
        if (i >= 1 && i <= 200 || i >= 701 && i <= 900) {
            i = i >= 801 ? (i -= 701) : (i >= 701 ? (i -= 601) : (i >= 101 ? (i -= 101) : --i));
            if (shiftDown) {
                this.menuActionName[this.menuActionRow] = "Message @whi@" + this.friendsList[i];
                this.menuActionID[this.menuActionRow] = 639;
                ++this.menuActionRow;
                this.menuActionName[this.menuActionRow] = "Remove @whi@" + this.friendsList[i];
                this.menuActionID[this.menuActionRow] = 792;
                ++this.menuActionRow;
                return true;
            }
            this.menuActionName[this.menuActionRow] = "Remove @whi@" + this.friendsList[i];
            this.menuActionID[this.menuActionRow] = 792;
            ++this.menuActionRow;
            this.menuActionName[this.menuActionRow] = "Message @whi@" + this.friendsList[i];
            this.menuActionID[this.menuActionRow] = 639;
            ++this.menuActionRow;
            return true;
        }
        if (i < 401) return false;
        if (i > 500) return false;
        this.menuActionName[this.menuActionRow] = "Remove @whi@" + class9.message;
        this.menuActionID[this.menuActionRow] = 322;
        ++this.menuActionRow;
        return true;
    }

    public void openPromptForInput(String message) {
        this.promptInput = "";
        this.aString1121 = message;
        this.messagePromptRaised = true;
        inputTaken = true;
        this.friendsListAction = -1;
    }

    public void searchBank() {
        this.openPromptForInput("Enter an item name to search:");
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public void buildInterfaceMenu(int xPadding, RSInterface rsinterface, int xPos, int yPadding, int yPos, int yScrollPoint) {
        block68 : {
            try {
                if (rsinterface.type != 0) return;
                if (rsinterface.children == null) return;
                if (rsinterface.isMouseoverTriggered) {
                    return;
                }
                if (xPos < xPadding) return;
                if (yPos < yPadding) return;
                if (xPos > xPadding + rsinterface.width) return;
                if (yPos > yPadding + rsinterface.height) {
                    return;
                }
                totalChildren = rsinterface.children.length;
                childIndex = 0;
                while (childIndex < totalChildren) {
                    xSpritePos = rsinterface.childX[childIndex] + xPadding;
                    ySpritePos = rsinterface.childY[childIndex] + yPadding - yScrollPoint;
                    rsinterfacechildren = RSInterface.interfaceCache[rsinterface.children[childIndex]];
                    if ((rsinterfacechildren.mOverInterToTrigger >= 0 || rsinterfacechildren.textHoverColour != 0) && xPos >= xSpritePos && xPos < (xSpritePos += rsinterfacechildren.offsetX) + rsinterfacechildren.width && yPos >= ySpritePos && yPos < (ySpritePos += rsinterfacechildren.offsetY) + rsinterfacechildren.height) {
                        this.hoverSpriteId = rsinterfacechildren.mOverInterToTrigger >= 0 ? (this.hoverChildId = rsinterfacechildren.mOverInterToTrigger) : (this.hoverChildId = rsinterfacechildren.id);
                    }
                    if (rsinterfacechildren.type == 8 && xPos >= xSpritePos && xPos < xSpritePos + rsinterfacechildren.width && yPos >= ySpritePos && yPos < ySpritePos + rsinterfacechildren.height) {
                        this.hoverToggleChildId = rsinterfacechildren.id;
                    }
                    if (!rsinterfacechildren.handleInterfaceAction(this, xPos, yPos, xSpritePos, ySpritePos, yScrollPoint)) {
                        if (rsinterfacechildren.type == 0) {
                            this.buildInterfaceMenu(xSpritePos, rsinterfacechildren, xPos, ySpritePos, yPos, rsinterfacechildren.scrollPosition);
                            if (rsinterfacechildren.scrollMax > rsinterfacechildren.height) {
                                this.method65(xSpritePos + rsinterfacechildren.width, rsinterfacechildren.height, xPos, yPos, rsinterfacechildren, ySpritePos, true, rsinterfacechildren.scrollMax);
                            }
                        } else {
                            if (rsinterfacechildren.atActionType == 1 && xPos >= xSpritePos && yPos >= ySpritePos && xPos < xSpritePos + rsinterfacechildren.width && yPos < ySpritePos + rsinterfacechildren.height) {
                                flag = false;
                                if (rsinterfacechildren.contentType == 0 || !(flag = this.buildFriendsListMenu(rsinterfacechildren))) {
                                    this.menuActionName[this.menuActionRow] = rsinterfacechildren.tooltip + (this.myPrivilege[0] != 0 ? new StringBuilder().append(", @gre@(@whi@").append(rsinterfacechildren.id).append("@gre@)").toString() : "");
                                    this.menuActionID[this.menuActionRow] = 315;
                                    this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                    ++this.menuActionRow;
                                }
                            }
                            if (rsinterfacechildren.atActionType == 2 && this.spellSelected == 0 && xPos >= xSpritePos && yPos >= ySpritePos && xPos < xSpritePos + rsinterfacechildren.width && yPos < ySpritePos + rsinterfacechildren.height) {
                                s = rsinterfacechildren.selectedActionName;
                                if (s.indexOf(" ") != -1) {
                                    s = s.substring(0, s.indexOf(" "));
                                }
                                if (rsinterfacechildren.spellName.endsWith("Rush") || rsinterfacechildren.spellName.endsWith("Burst") || rsinterfacechildren.spellName.endsWith("Blitz") || rsinterfacechildren.spellName.endsWith("Barrage") && !rsinterfacechildren.spellName.equals((Object)"Miasmic Barrage")) {
                                    this.menuActionName[this.menuActionRow] = "Autocast @gre@" + rsinterfacechildren.spellName + (this.myPrivilege[0] != 0 ? new StringBuilder().append(", ").append(rsinterfacechildren.id).toString() : "");
                                    this.menuActionID[this.menuActionRow] = 104;
                                    this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                    ++this.menuActionRow;
                                }
                                this.menuActionName[this.menuActionRow] = s + " @gre@" + rsinterfacechildren.spellName + (this.myPrivilege[0] != 0 ? new StringBuilder().append(", ").append(rsinterfacechildren.id).toString() : "");
                                this.menuActionID[this.menuActionRow] = 626;
                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                ++this.menuActionRow;
                                if (rsinterfacechildren.spellName.endsWith("strike") || rsinterfacechildren.spellName.endsWith("bolt") || rsinterfacechildren.spellName.equals((Object)"Crumble undead") || rsinterfacechildren.spellName.endsWith("blast") || rsinterfacechildren.spellName.endsWith("wave") || rsinterfacechildren.spellName.equals((Object)"Claws of Guthix") || rsinterfacechildren.spellName.equals((Object)"Flames of Zamorak") || rsinterfacechildren.spellName.equals((Object)"Magic Dart")) {
                                    this.menuActionName[this.menuActionRow] = "Autocast @gre@" + rsinterfacechildren.spellName + (this.myPrivilege[0] != 0 ? new StringBuilder().append(", ").append(rsinterfacechildren.id).toString() : "");
                                    this.menuActionID[this.menuActionRow] = 104;
                                    this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                    ++this.menuActionRow;
                                }
                            }
                            if (rsinterfacechildren.atActionType == 3 && xPos >= xSpritePos && yPos >= ySpritePos && xPos < xSpritePos + rsinterfacechildren.width && yPos < ySpritePos + rsinterfacechildren.height) {
                                this.menuActionName[this.menuActionRow] = "Close" + (this.myPrivilege[0] != 0 ? new StringBuilder().append(", ").append(rsinterfacechildren.id).toString() : "");
                                this.menuActionID[this.menuActionRow] = 200;
                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                ++this.menuActionRow;
                            }
                            if (rsinterfacechildren.atActionType == 4 && xPos >= xSpritePos && yPos >= ySpritePos && xPos < xSpritePos + rsinterfacechildren.width && yPos < ySpritePos + rsinterfacechildren.height) {
                                this.menuActionName[this.menuActionRow] = rsinterfacechildren.tooltip + (this.myPrivilege[0] != 0 ? new StringBuilder().append(", @gre@(@whi@").append(rsinterfacechildren.id).append("@gre@)").toString() : "");
                                this.menuActionID[this.menuActionRow] = 169;
                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                ++this.menuActionRow;
                                if (rsinterfacechildren.hoverText != null) {
                                    // empty if block
                                }
                            }
                            if (rsinterfacechildren.atActionType == 5 && xPos >= xSpritePos && yPos >= ySpritePos && xPos < xSpritePos + rsinterfacechildren.width && yPos < ySpritePos + rsinterfacechildren.height) {
                                if (rsinterfacechildren.tooltip.toLowerCase().startsWith("transform")) {
                                    rsinterfacechildren.itemActions = new String[5];
                                    rsinterfacechildren.itemActions[0] = "Transform";
                                    rsinterfacechildren.itemActions[1] = "Transform-5";
                                    rsinterfacechildren.itemActions[2] = "Transform-10";
                                    rsinterfacechildren.itemActions[3] = "Transform-all";
                                    rsinterfacechildren.itemActions[4] = "Transform-X";
                                    if (rsinterfacechildren.itemActions != null) {
                                        for (j4 = 4; j4 >= 0; --j4) {
                                            if (rsinterfacechildren.itemActions[j4] == null) continue;
                                            this.menuActionName[this.menuActionRow] = rsinterfacechildren.tooltip.replaceAll("Transform", rsinterfacechildren.itemActions[j4]);
                                            if (j4 == 0) {
                                                this.menuActionID[this.menuActionRow] = 632;
                                            }
                                            if (j4 == 1) {
                                                this.menuActionID[this.menuActionRow] = 78;
                                            }
                                            if (j4 == 2) {
                                                this.menuActionID[this.menuActionRow] = 867;
                                            }
                                            if (j4 == 3) {
                                                this.menuActionID[this.menuActionRow] = 431;
                                            }
                                            if (j4 == 4) {
                                                this.menuActionID[this.menuActionRow] = 53;
                                            }
                                            this.menuActionCmd1[this.menuActionRow] = rsinterfacechildren.itemSpriteId1;
                                            this.menuActionCmd2[this.menuActionRow] = rsinterfacechildren.itemSpriteIndex;
                                            this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.parentID;
                                            ++this.menuActionRow;
                                        }
                                    }
                                } else {
                                    this.menuActionName[this.menuActionRow] = rsinterfacechildren.tooltip + (this.myPrivilege[0] != 0 ? new StringBuilder().append(", @gre@(@whi@").append(rsinterfacechildren.id).append("@gre@)").toString() : "");
                                    this.menuActionID[this.menuActionRow] = 646;
                                    this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                    ++this.menuActionRow;
                                }
                            }
                            if (rsinterfacechildren.atActionType == 6 && !this.aBoolean1149 && xPos >= xSpritePos && yPos >= ySpritePos && xPos < xSpritePos + rsinterfacechildren.width && yPos < ySpritePos + rsinterfacechildren.height) {
                                this.menuActionName[this.menuActionRow] = rsinterfacechildren.tooltip + (this.myPrivilege[0] != 0 ? new StringBuilder().append(", @gre@(@whi@").append(rsinterfacechildren.id).append("@gre@)").toString() : "");
                                this.menuActionID[this.menuActionRow] = 679;
                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                ++this.menuActionRow;
                            }
                            if (rsinterfacechildren.atActionType == 8 && !this.aBoolean1149 && xPos >= xSpritePos && yPos >= ySpritePos && xPos < xSpritePos + rsinterfacechildren.width && yPos < ySpritePos + rsinterfacechildren.height) {
                                for (s1 = 0; s1 < rsinterfacechildren.tooltips.length; ++s1) {
                                    if (!RSInterface.interfaceCache[32007].isMouseoverTriggered && rsinterfacechildren.id > 32016) continue;
                                    this.menuActionName[this.menuActionRow] = rsinterfacechildren.tooltips[s1];
                                    this.menuActionID[this.menuActionRow] = 1700 + s1;
                                    this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                    ++this.menuActionRow;
                                }
                            }
                            if (rsinterfacechildren.atActionType == 9 && !this.aBoolean1149 && xPos >= xSpritePos && yPos >= ySpritePos && xPos < xSpritePos + rsinterfacechildren.width && yPos < ySpritePos + rsinterfacechildren.height) {
                                this.menuActionName[this.menuActionRow] = rsinterfacechildren.tooltip;
                                this.menuActionID[this.menuActionRow] = 1100;
                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                ++this.menuActionRow;
                            }
                            if (rsinterfacechildren.atActionType == 10 && !this.aBoolean1149 && xPos >= xSpritePos && yPos >= ySpritePos && xPos < xSpritePos + rsinterfacechildren.width && yPos < ySpritePos + rsinterfacechildren.height && (parent = RSInterface.interfaceCache[rsinterfacechildren.parentID]) != null && parent.menuVisible) {
                                this.menuActionName[this.menuActionRow] = rsinterfacechildren.menuItem.getText();
                                this.menuActionID[this.menuActionRow] = 1200;
                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                ++this.menuActionRow;
                            }
                            if (rsinterfacechildren.type == 2) {
                                search = rsinterfacechildren.searchableContainer != false && this.friendsListAction == -1 && this.promptInput.isEmpty() == false;
                                results = -1;
                                yoffset = 0;
                                k2 = 0;
                                l2 = 0;
lbl125: // 2 sources:
                                if (l2 < rsinterfacechildren.height) {
                                    i3 = 0;
                                    break block68;
                                }
                            }
                        }
                    }
                    ++childIndex;
                }
                return;
            }
            catch (NullPointerException totalChildren) {
                // empty catch block
            }
            return;
        }
        do {
            block70 : {
                block74 : {
                    block77 : {
                        block78 : {
                            block79 : {
                                block69 : {
                                    block76 : {
                                        block75 : {
                                            block71 : {
                                                block73 : {
                                                    block72 : {
                                                        if (i3 >= rsinterfacechildren.width) break block69;
                                                        if (k2 >= rsinterfacechildren.inv.length) break block70;
                                                        if (!search || rsinterfacechildren.inv[k2] <= 0) break block71;
                                                        itemdef = ItemDefinition.forID(rsinterfacechildren.inv[k2] - 1);
                                                        if (itemdef != null && itemdef.name != null) break block72;
                                                        ++k2;
                                                        break block70;
                                                    }
                                                    if (itemdef.name.toLowerCase().contains((CharSequence)this.promptInput.toLowerCase())) break block73;
                                                    ++k2;
                                                    break block70;
                                                }
                                                ++results;
                                            }
                                            j3 = xSpritePos + (search != false ? results % rsinterfacechildren.width : i3) * (32 + rsinterfacechildren.invSpritePadX);
                                            k3 = ySpritePos + (search != false ? results / rsinterfacechildren.width : l2) * (32 + rsinterfacechildren.invSpritePadY) + yoffset;
                                            if (k2 < 20) {
                                                j3 += rsinterfacechildren.spritesX[k2];
                                                k3 += rsinterfacechildren.spritesY[k2];
                                            }
                                            if (xPos < j3 || yPos < k3 || xPos >= j3 + 32 || yPos >= k3 + 32) break block74;
                                            this.mouseInvInterfaceIndex = k2;
                                            this.lastActiveInvInterface = rsinterfacechildren.id;
                                            if (rsinterfacechildren.inv[k2] <= 0) break block74;
                                            itemDef = ItemDefinition.forID(rsinterfacechildren.inv[k2] - 1);
                                            v0 = name = rsinterfacechildren.customName[k2] != null ? rsinterfacechildren.customName[k2] : itemDef.name;
                                            if (Client.openInterfaceID == 63000 && itemDef.itemActions != null) {
                                                this.menuActionName[this.menuActionRow] = "Insert @lre@" + name;
                                                this.menuActionID[this.menuActionRow] = 74;
                                                this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                                                this.menuActionCmd2[this.menuActionRow] = k2;
                                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                                ++this.menuActionRow;
                                                return;
                                            }
                                            if (this.itemSelected != 1 || !rsinterfacechildren.isInventoryInterface) break block75;
                                            if (rsinterfacechildren.id != this.anInt1284 || k2 != this.itemSlotUsedOn) {
                                                this.menuActionName[this.menuActionRow] = "Compare " + this.selectedItemName + " with @lre@" + name;
                                                this.menuActionID[this.menuActionRow] = 875;
                                                this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                                                this.menuActionCmd2[this.menuActionRow] = k2;
                                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                                ++this.menuActionRow;
                                            }
                                            if (rsinterfacechildren.id != this.anInt1284 || k2 != this.itemSlotUsedOn) {
                                                this.menuActionName[this.menuActionRow] = "Use " + this.selectedItemName + " with @lre@" + name;
                                                this.menuActionID[this.menuActionRow] = 870;
                                                this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                                                this.menuActionCmd2[this.menuActionRow] = k2;
                                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                                ++this.menuActionRow;
                                            }
                                            break block74;
                                        }
                                        if (this.spellSelected != 1 || !rsinterfacechildren.isInventoryInterface) break block76;
                                        if ((this.spellUsableOn & 16) == 16) {
                                            this.menuActionName[this.menuActionRow] = this.spellTooltip + " @lre@" + name;
                                            this.menuActionID[this.menuActionRow] = 543;
                                            this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                                            this.menuActionCmd2[this.menuActionRow] = k2;
                                            this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                            ++this.menuActionRow;
                                        }
                                        break block74;
                                    }
                                    if (!rsinterfacechildren.isInventoryInterface) break block77;
                                    canDrop = false;
                                    if (itemDef.itemActions == null) break block78;
                                    break block79;
                                }
                                ++l2;
                                ** GOTO lbl125
                            }
                            for (index = 0; index < itemDef.itemActions.length; ++index) {
                                if (itemDef.itemActions[index] == null || !itemDef.itemActions[index].equals((Object)"Drop")) continue;
                                canDrop = true;
                                break;
                            }
                            if (canDrop && RSApplet.shiftDown) {
                                this.menuActionName[this.menuActionRow] = "Drop @lre@" + name;
                                this.menuActionID[this.menuActionRow] = 847;
                                this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                                this.menuActionCmd2[this.menuActionRow] = k2;
                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                ++this.menuActionRow;
                                return;
                            }
                        }
                        if (RSApplet.controlDown) {
                            this.menuActionName[this.menuActionRow] = "Wear Costume @lre@" + name;
                            this.menuActionID[this.menuActionRow] = 888;
                            this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                            this.menuActionCmd2[this.menuActionRow] = k2;
                            this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                            ++this.menuActionRow;
                            return;
                        }
                        for (l3 = 4; l3 >= 3; --l3) {
                            if (itemDef.itemActions != null && itemDef.itemActions[l3] != null) {
                                this.menuActionName[this.menuActionRow] = itemDef.itemActions[l3] + " @lre@" + name;
                                if (l3 == 3) {
                                    this.menuActionID[this.menuActionRow] = 493;
                                }
                                if (l3 == 4) {
                                    this.menuActionID[this.menuActionRow] = 847;
                                }
                                this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                                this.menuActionCmd2[this.menuActionRow] = k2;
                                this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                                ++this.menuActionRow;
                                continue;
                            }
                            if (l3 != 4) continue;
                            this.menuActionName[this.menuActionRow] = "Drop @lre@" + name;
                            this.menuActionID[this.menuActionRow] = 847;
                            this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                            this.menuActionCmd2[this.menuActionRow] = k2;
                            this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                            ++this.menuActionRow;
                        }
                    }
                    if (rsinterfacechildren.usableItemInterface) {
                        this.menuActionName[this.menuActionRow] = "Use @lre@" + name;
                        this.menuActionID[this.menuActionRow] = 447;
                        this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                        this.menuActionCmd2[this.menuActionRow] = k2;
                        this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                        ++this.menuActionRow;
                    }
                    if (rsinterfacechildren.isInventoryInterface && itemDef.itemActions != null) {
                        for (i4 = 2; i4 >= 0; --i4) {
                            if (itemDef.itemActions[i4] == null) continue;
                            this.menuActionName[this.menuActionRow] = itemDef.itemActions[i4] + " @lre@" + name;
                            if (i4 == 0) {
                                this.menuActionID[this.menuActionRow] = 74;
                            }
                            if (i4 == 1) {
                                this.menuActionID[this.menuActionRow] = 454;
                            }
                            if (i4 == 2) {
                                this.menuActionID[this.menuActionRow] = 539;
                            }
                            this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                            this.menuActionCmd2[this.menuActionRow] = k2;
                            this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                            ++this.menuActionRow;
                        }
                    }
                    if (rsinterfacechildren.itemActions != null) {
                        for (j4 = 4; j4 >= 0; --j4) {
                            if (rsinterfacechildren.itemActions[j4] == null) continue;
                            this.menuActionName[this.menuActionRow] = rsinterfacechildren.itemActions[j4] + " @lre@" + name;
                            if (j4 == 0) {
                                this.menuActionID[this.menuActionRow] = 632;
                            }
                            if (j4 == 1) {
                                this.menuActionID[this.menuActionRow] = 78;
                            }
                            if (j4 == 2) {
                                this.menuActionID[this.menuActionRow] = 867;
                            }
                            if (j4 == 3) {
                                this.menuActionID[this.menuActionRow] = 431;
                            }
                            if (j4 == 4) {
                                this.menuActionID[this.menuActionRow] = 53;
                            }
                            this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                            this.menuActionCmd2[this.menuActionRow] = k2;
                            this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                            ++this.menuActionRow;
                        }
                    }
                    if (rsinterfacechildren.parentID >= 59040) {
                        if (rsinterfacechildren.parentID <= 59048) return;
                    }
                    if (rsinterfacechildren.parentID >= 32100) {
                        if (rsinterfacechildren.parentID <= 32156) return;
                    }
                    if (rsinterfacechildren.parentID >= 32200 && rsinterfacechildren.parentID <= 32222) {
                        return;
                    }
                    this.menuActionName[this.menuActionRow] = "Check Price @lre@" + name + (!(this.myPrivilege[0] != 8 && this.myPrivilege[0] != 7 && this.myPrivilege[0] != 6 || Client.clientData == false && Client.fpsOn == false) ? new StringBuilder().append(" @whi@(ID)@gre@").append(rsinterfacechildren.inv[k2] - 1).append(" @whi@(Fem/Male)@gre@ ").append(itemDef.maleEquipt).append(" / ").append(itemDef.femaleEquipt).append(" @whi@(ModelId)@gre@ ").append(itemDef.groundModelId).append(", zoom: ").append(itemDef.modelZoom).append(", o1: ").append(itemDef.modelOffset1).append(", o2: ").append(itemDef.modelOffset2).append(" r1: ").append(itemDef.modelRotation1).append(", r2: ").append(itemDef.modelRotation2).toString() : "");
                    this.menuActionID[this.menuActionRow] = 1125;
                    this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                    this.menuActionCmd2[this.menuActionRow] = k2;
                    this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                    ++this.menuActionRow;
                    if (rsinterfacechildren.isInventoryInterface && itemDef.itemActions != null) {
                        this.menuActionName[this.menuActionRow] = "Inspect @lre@" + name;
                        this.menuActionID[this.menuActionRow] = 1130;
                        this.menuActionCmd1[this.menuActionRow] = itemDef.id;
                        this.menuActionCmd2[this.menuActionRow] = k2;
                        this.menuActionCmd3[this.menuActionRow] = rsinterfacechildren.id;
                        ++this.menuActionRow;
                    }
                }
                ++k2;
            }
            ++i3;
        } while (true);
    }

    public void buildPublicChat(int j) {
        int l = 0;
        Iterator iterator = this.chatMessages.iterator();
        while (iterator.hasNext()) {
            ChatMessage message = (ChatMessage)iterator.next();
            if (message == null || this.chatTypeView != 1) continue;
            int chatType = message.getType().getType();
            int k1 = 70 - l * 14 + 42 + anInt1089 + 4 + 5;
            if (k1 < -23) {
                return;
            }
            if (chatType != 1 && chatType != 2 || chatType != 1 && this.publicChatMode != 0 && (this.publicChatMode != 1 || !this.isFriendOrSelf(message.getName()))) continue;
            if (j > k1 - 14 && j <= k1 && !message.getName().equals((Object)Client.myPlayer.name)) {
                if (this.myPrivilege[0] == 8 || this.myPrivilege[0] == 7 || this.myPrivilege[0] == 6) {
                    this.menuActionName[this.menuActionRow] = "Staff Panel @whi@" + message.getName();
                    this.menuActionID[this.menuActionRow] = 606;
                    ++this.menuActionRow;
                }
                this.menuActionName[this.menuActionRow] = "Add ignore @whi@" + message.getName();
                this.menuActionID[this.menuActionRow] = 42;
                ++this.menuActionRow;
                this.menuActionName[this.menuActionRow] = "Reply to @whi@" + message.getName();
                this.menuActionID[this.menuActionRow] = 639;
                ++this.menuActionRow;
                this.menuActionName[this.menuActionRow] = "Add friend @whi@" + message.getName();
                this.menuActionID[this.menuActionRow] = 337;
                ++this.menuActionRow;
            }
            ++l;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void buildSplitPrivateChatMenu(int paddingX, int paddingY) {
        if (this.splitPrivateChat == 0) {
            return;
        }
        drawLineY = 0;
        if (this.systemUpdatetime != 0) {
            drawLineY = 1;
        }
        var4_4 = this.chatMessages.iterator();
        do lbl-1000: // 3 sources:
        {
            if (var4_4.hasNext() == false) return;
            message = (ChatMessage)var4_4.next();
            if (message == null) ** GOTO lbl-1000
            type = message.getType().getType();
            name = message.getName();
            if (type != 3 && type != 7 || type != 7 && this.privateChatMode != 0 && (this.privateChatMode != 1 || !this.isFriendOrSelf(name))) continue;
            l = 322 - drawLineY * 13 + paddingY;
            if (this.mouseX > 4 && this.mouseY - 4 > l - 10 && this.mouseY - 4 <= l + 3) {
                textWidth = this.normalFont.getTextWidth("From:  " + name + message.getMessage()) + 25;
                if (textWidth > 450) {
                    textWidth = 450;
                }
                if (this.mouseX < 4 + textWidth) {
                    if (this.myPrivilege[0] == 8 || this.myPrivilege[0] == 7 || this.myPrivilege[0] == 6) {
                        this.menuActionName[this.menuActionRow] = "Staff Panel @whi@" + name;
                        this.menuActionID[this.menuActionRow] = 606;
                        ++this.menuActionRow;
                    }
                    this.menuActionName[this.menuActionRow] = "Add ignore @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 42;
                    ++this.menuActionRow;
                    this.menuActionName[this.menuActionRow] = "Add friend @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 337;
                    ++this.menuActionRow;
                    this.menuActionName[this.menuActionRow] = "Reply to @whi@" + name;
                    this.menuActionID[this.menuActionRow] = 2639;
                    ++this.menuActionRow;
                }
            }
            if (++drawLineY < this.pmChatSize) continue;
            return;
        } while (type != 5 && type != 6 || this.privateChatMode >= 2 || ++drawLineY < this.pmChatSize);
    }

    public int byteArrayToInt(byte[] b) {
        int value = 0;
        int i = 0;
        while (i < 4) {
            int shift = (3 - i) * 8;
            value += (b[i] & 255) << shift;
            ++i;
        }
        return value;
    }

    public void calcCameraPos() {
        int j2;
        int k2;
        int i = this.anInt1098 * 128 + 64;
        int j = this.anInt1099 * 128 + 64;
        int k = this.method42(this.plane, j, i) - this.anInt1100;
        if (this.xCameraPos < i) {
            this.xCameraPos += this.anInt1101 + (i - this.xCameraPos) * this.anInt1102 / 1000;
            if (this.xCameraPos > i) {
                this.xCameraPos = i;
            }
        }
        if (this.xCameraPos > i) {
            this.xCameraPos -= this.anInt1101 + (this.xCameraPos - i) * this.anInt1102 / 1000;
            if (this.xCameraPos < i) {
                this.xCameraPos = i;
            }
        }
        if (this.zCameraPos < k) {
            this.zCameraPos += this.anInt1101 + (k - this.zCameraPos) * this.anInt1102 / 1000;
            if (this.zCameraPos > k) {
                this.zCameraPos = k;
            }
        }
        if (this.zCameraPos > k) {
            this.zCameraPos -= this.anInt1101 + (this.zCameraPos - k) * this.anInt1102 / 1000;
            if (this.zCameraPos < k) {
                this.zCameraPos = k;
            }
        }
        if (this.yCameraPos < j) {
            this.yCameraPos += this.anInt1101 + (j - this.yCameraPos) * this.anInt1102 / 1000;
            if (this.yCameraPos > j) {
                this.yCameraPos = j;
            }
        }
        if (this.yCameraPos > j) {
            this.yCameraPos -= this.anInt1101 + (this.yCameraPos - j) * this.anInt1102 / 1000;
            if (this.yCameraPos < j) {
                this.yCameraPos = j;
            }
        }
        i = this.anInt995 * 128 + 64;
        j = this.anInt996 * 128 + 64;
        k = this.method42(this.plane, j, i) - this.anInt997;
        int l = i - this.xCameraPos;
        int i1 = k - this.zCameraPos;
        int j1 = j - this.yCameraPos;
        int k1 = (int)Math.sqrt((double)(l * l + j1 * j1));
        int l1 = (int)(Math.atan2((double)i1, (double)k1) * 325.949) & 2047;
        int i2 = (int)(Math.atan2((double)l, (double)j1) * -325.949) & 2047;
        if (l1 < 128) {
            l1 = 128;
        }
        if (l1 > 383) {
            l1 = 383;
        }
        if (this.yCameraCurve < l1) {
            this.yCameraCurve += this.anInt998 + (l1 - this.yCameraCurve) * this.anInt999 / 1000;
            if (this.yCameraCurve > l1) {
                this.yCameraCurve = l1;
            }
        }
        if (this.yCameraCurve > l1) {
            this.yCameraCurve -= this.anInt998 + (this.yCameraCurve - l1) * this.anInt999 / 1000;
            if (this.yCameraCurve < l1) {
                this.yCameraCurve = l1;
            }
        }
        if ((j2 = i2 - this.xCameraCurve) > 1024) {
            j2 -= 2048;
        }
        if (j2 < -1024) {
            j2 += 2048;
        }
        if (j2 > 0) {
            this.xCameraCurve += this.anInt998 + j2 * this.anInt999 / 1000;
            this.xCameraCurve &= 2047;
        }
        if (j2 < 0) {
            this.xCameraCurve -= this.anInt998 + (- j2) * this.anInt999 / 1000;
            this.xCameraCurve &= 2047;
        }
        if ((k2 = i2 - this.xCameraCurve) > 1024) {
            k2 -= 2048;
        }
        if (k2 < -1024) {
            k2 += 2048;
        }
        if (k2 >= 0 || j2 <= 0) {
            if (k2 <= 0) return;
            if (j2 >= 0) return;
        }
        this.xCameraCurve = i2;
    }

    public void calcEntityScreenPos(int i, int j, int l) {
        if (i < 128 || l < 128 || i > 13056 || l > 13056) {
            this.spriteDrawX = -1;
            this.spriteDrawY = -1;
            return;
        }
        int i1 = this.method42(this.plane, l, i) - j;
        int j1 = Model.modelIntArray1[this.yCameraCurve];
        int k1 = Model.modelIntArray2[this.yCameraCurve];
        int l1 = Model.modelIntArray1[this.xCameraCurve];
        int i2 = Model.modelIntArray2[this.xCameraCurve];
        int j2 = (l -= this.yCameraPos) * l1 + (i -= this.xCameraPos) * i2 >> 16;
        l = l * i2 - i * l1 >> 16;
        i = j2;
        j2 = (i1 -= this.zCameraPos) * k1 - l * j1 >> 16;
        l = i1 * j1 + l * k1 >> 16;
        i1 = j2;
        if (l >= 50) {
            this.spriteDrawX = Rasterizer.textureInt1 + (i << 9) / l;
            this.spriteDrawY = Rasterizer.textureInt2 + (i1 << 9) / l;
            return;
        }
        this.spriteDrawX = -1;
        this.spriteDrawY = -1;
    }

    public final int[] calcParticlePos(int x, int y, int z, int width, int height) {
        if (x < 128 || z < 128 || x > 13056 || z > 13056) {
            return new int[]{0, 0, 0, 0, 0, 0, 0};
        }
        int i1 = this.method42(this.plane, z, x) - y;
        int j1 = Model.modelIntArray1[this.yCameraCurve];
        int k1 = Model.modelIntArray2[this.yCameraCurve];
        int l1 = Model.modelIntArray1[this.xCameraCurve];
        int i2 = Model.modelIntArray2[this.xCameraCurve];
        int j2 = (z -= this.yCameraPos) * l1 + (x -= this.xCameraPos) * i2 >> 16;
        z = z * i2 - x * l1 >> 16;
        x = j2;
        j2 = (i1 -= this.zCameraPos) * k1 - z * j1 >> 16;
        if ((z = i1 * j1 + z * k1 >> 16) < 50) return new int[]{0, 0, 0, 0, 0, 0, 0};
        return new int[]{Rasterizer.textureInt1 + (x << log_view_dist) / z, Rasterizer.textureInt2 + (j2 << log_view_dist) / z, z, Rasterizer.textureInt1 + (x - width / 2 << log_view_dist) / z, Rasterizer.textureInt2 + (j2 - height / 2 << log_view_dist) / z, Rasterizer.textureInt1 + (x + width / 2 << log_view_dist) / z, Rasterizer.textureInt2 + (j2 + height / 2 << log_view_dist) / z};
    }

    public void chatJoin(long l) {
        try {
            if (l == 0L) {
                return;
            }
            this.stream.createFrame(60);
            this.stream.writeQWord(l);
            return;
        }
        catch (RuntimeException runtimeexception) {
            Signlink.reporterror("47229, 3, " + l + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    @Override
    public void cleanUpForQuit() {
        this.HPBarFull = null;
        this.HPBarEmpty = null;
        Signlink.reporterror = false;
        try {
            if (this.socketStream != null) {
                this.socketStream.close();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.socketStream = null;
        this.stopMidi();
        if (this.mouseDetection != null) {
            this.mouseDetection.running = false;
        }
        this.mouseDetection = null;
        onDemandFetcher.disable();
        updateScreenGraphicsBuffer = null;
        onDemandFetcher = null;
        this.aStream_834 = null;
        this.stream = null;
        this.aStream_847 = null;
        this.inStream = null;
        this.anIntArray1234 = null;
        this.aByteArrayArray1183 = null;
        this.aByteArrayArray1247 = null;
        this.anIntArray1235 = null;
        this.anIntArray1236 = null;
        this.intGroundArray = null;
        this.byteGroundArray = null;
        this.worldController = null;
        int index = 0;
        do {
            if (index >= this.collisionMaps.length) {
                this.wayPoints = null;
                this.distanceValues = null;
                this.walkingQueueX = null;
                this.walkingQueueY = null;
                this.aByteArray912 = null;
                this.sideTabArea = null;
                this.mapEdgeIP = null;
                this.leftFrame = null;
                this.topFrame = null;
                this.rightFrame = null;
                this.mapBackImage = null;
                this.main3DArea = null;
                this.chatBackImage = null;
                this.aGraphicsBuffer_1123 = null;
                this.aGraphicsBuffer_1124 = null;
                this.aGraphicsBuffer_1125 = null;
                this.alertBack = null;
                this.alertBorder = null;
                this.alertBorderH = null;
                this.tabArea = null;
                this.mapArea = null;
                this.magicAuto = null;
                this.emptyOrb = null;
                this.emptyFOrb = null;
                this.hoveredEmpty = null;
                this.hoveredFEmpty = null;
                this.runIcon1 = null;
                this.runIcon2 = null;
                this.runOrb1 = null;
                this.runOrb2 = null;
                this.hitPointsFill = null;
                this.hitPointsIcon = null;
                this.prayerFill = null;
                this.prayerIcon = null;
                this.sideIcons = null;
                this.compass = null;
                this.headIcons = null;
                this.cursesIcons = null;
                this.skullIcons = null;
                this.headIconsHint = null;
                this.crosses = null;
                this.mapDotItem = null;
                this.mapDotNPC = null;
                this.mapDotPlayer = null;
                this.mapDotFriend = null;
                this.mapDotTeam = null;
                this.mapScenes = null;
                this.mapFunctions = null;
                this.anIntArrayArray929 = null;
                this.playerArray = null;
                this.playerIndices = null;
                this.anIntArray894 = null;
                this.aStreamArray895s = null;
                this.anIntArray840 = null;
                this.npcArray = null;
                this.npcIndices = null;
                this.groundArray = null;
                this.aClass19_1179 = null;
                this.aClass19_1013 = null;
                this.aClass19_1056 = null;
                this.menuActionCmd2 = null;
                this.menuActionCmd3 = null;
                this.menuActionID = null;
                this.menuActionCmd1 = null;
                this.menuActionName = null;
                this.variousSettings = null;
                this.mapFunctionX = null;
                this.mapFunctionY = null;
                this.currentMapFunctions = null;
                this.customMapIcons = null;
                this.miniMapImage = null;
                this.friendsList = null;
                this.friendsListAsLongs = null;
                this.friendsNodeIDs = null;
                this.aGraphicsBuffer_1110 = null;
                this.aGraphicsBuffer_1111 = null;
                this.aGraphicsBuffer_1107 = null;
                this.aGraphicsBuffer_1108 = null;
                loginScreenGraphicsBuffer = null;
                this.aGraphicsBuffer_1112 = null;
                this.aGraphicsBuffer_1113 = null;
                this.aGraphicsBuffer_1114 = null;
                this.aGraphicsBuffer_1115 = null;
                this.multiOverlay = null;
                this.nullLoader();
                ObjectDefinition.nullLoader();
                NPCDefinition.nullLoader();
                ItemDefinition.nullLoader();
                FloorUnderlay.floors = null;
                IDK.cache = null;
                RSInterface.interfaceCache = null;
                AnimationDefinition.nullLoader();
                SpotAnim.nullLoader();
                Varp.cache = null;
                this.fullGameScreen = null;
                Player.characterCache = null;
                Rasterizer.nullLoader();
                WorldController.nullLoader();
                Model.nullLoader();
                FrameReader.nullLoader();
                System.gc();
                return;
            }
            this.collisionMaps[index] = null;
            ++index;
        } while (true);
    }

    private void clearChat(String name) {
        ArrayList toRemove = new ArrayList();
        Iterator iterator = this.chatMessages.iterator();
        do {
            if (!iterator.hasNext()) {
                this.chatMessages.removeAll((Collection)toRemove);
                return;
            }
            ChatMessage message = (ChatMessage)iterator.next();
            if (message == null) continue;
            if (name.toLowerCase().contains((CharSequence)"discord") && message.getType().equals((Object)ChatMessage.ChatType.YELLBOT)) {
                toRemove.add((Object)message);
            }
            if (message.getName() == null || !message.getName().equalsIgnoreCase(name)) continue;
            toRemove.add((Object)message);
        } while (true);
    }

    public void clearTopInterfaces() {
        this.stream.createFrame(130);
        if (this.invOverlayInterfaceID != -1) {
            this.invOverlayInterfaceID = -1;
            needDrawTabArea = true;
            this.aBoolean1149 = false;
            tabAreaAltered = true;
        }
        if (this.backDialogID != -1) {
            this.backDialogID = -1;
            inputTaken = true;
            this.aBoolean1149 = false;
        }
        openInterfaceID = -1;
        this.fullscreenInterfaceID = -1;
        this.resetInputField();
    }

    public boolean clickInArea(int clickX, int clickY, int width, int height) {
        if (this.saveClickX <= clickX) return false;
        if (this.saveClickY <= clickY) return false;
        if (this.saveClickX >= clickX + width) return false;
        if (this.saveClickY >= clickY + height) return false;
        return true;
    }

    public void configureQuickTicks() {
        if (this.prayerInterfaceType == 5608) {
            if (this.getQuickPrayersSet() <= 0) return;
            int index = 0;
            while (index < this.quickPrayers.length) {
                if (this.quickPrayers[index] == 1 && index >= 0 && index <= 25 && this.getOrbValues(1, null)[1] >= this.prayerLevelRequirements[index]) {
                    int[] types = this.getPrayerTypeForIndex(index);
                    if (types == null) {
                        this.quickPrayers[index] = 1;
                        this.variousSettings[this.quickConfigIDs[index]] = this.quickPrayers[index];
                        this.method33(this.quickConfigIDs[index]);
                        needDrawTabArea = true;
                        if (this.dialogID != -1) {
                            inputTaken = true;
                        }
                    } else {
                        for (int g = 0; g < this.rangeAndMagePray.length; ++g) {
                            if (index != this.rangeAndMagePray[g]) continue;
                            types = this.rangeAndMagePrayOff;
                        }
                        for (int i = 0; i < types.length; ++i) {
                            if (index != types[i]) {
                                if (index == 24 || index == 25) {
                                    types = this.superiorPray;
                                }
                                this.quickPrayers[types[i]] = 0;
                                this.variousSettings[this.quickConfigIDs[types[i]]] = 0;
                                this.method33(this.quickConfigIDs[types[i]]);
                                needDrawTabArea = true;
                                if (this.dialogID == -1) continue;
                                inputTaken = true;
                                continue;
                            }
                            this.quickPrayers[index] = 1;
                            this.variousSettings[this.quickConfigIDs[index]] = this.quickPrayers[index];
                            this.method33(this.quickConfigIDs[index]);
                            needDrawTabArea = true;
                            if (this.dialogID == -1) continue;
                            inputTaken = true;
                        }
                    }
                }
                ++index;
            }
            return;
        }
        if (this.prayerInterfaceType != 22500) return;
        if (this.getQuickCursesSet() <= 0) return;
        int index = 0;
        while (index < this.quickCurses.length) {
            if (this.quickCurses[index] == 1 && index >= 0 && index <= 20 && this.getOrbValues(1, null)[1] >= this.curseLevelRequirements[index]) {
                int[] types = this.getCurseTypeForIndex(index);
                if (types != null) {
                    for (int i = 0; i < types.length; ++i) {
                        if (index == types[i]) continue;
                        this.quickCurses[types[i]] = 0;
                        this.variousSettings[this.quickConfigIDs[types[i]]] = 0;
                        this.method33(this.quickConfigIDs[types[i]]);
                        needDrawTabArea = true;
                        if (this.dialogID == -1) continue;
                        inputTaken = true;
                    }
                }
                this.quickCurses[index] = 1;
                this.variousSettings[this.quickConfigIDs[index]] = this.quickCurses[index];
                this.method33(this.quickConfigIDs[index]);
                needDrawTabArea = true;
                if (this.dialogID != -1) {
                    inputTaken = true;
                }
            }
            ++index;
        }
    }

    public String convertMoneyPouch(long value) {
        if (value >= 0L && value < 10000L) {
            return String.valueOf((long)value);
        }
        if (value >= 10000L && value < 10000000L) {
            return "" + value / 1000L + "K";
        }
        if (value >= 10000000L && value < 10000000000L) {
            return "" + value / 1000000L + "M";
        }
        if (value >= 10000000000L && value <= 10000000000000L) {
            return "" + value / 1000000000L + "B";
        }
        if (value >= 10000000000000L && value <= Long.MAX_VALUE) {
            return "" + value / 1000000000000L + "T";
        }
        if (value <= Long.MAX_VALUE) return "?";
        return "*";
    }

    public void createCenteredPopUpMessage(String message) {
        this.loginScreenPopUp = new LoginScreenPopUp(message, this.getScreenWidth() / 2, this.getScreenHeight() / 2, 2, true);
    }

    public void createOrbs(int xdraw, int ydraw, int orbID, Sprite[] orbSprites) {
        int orbIconID = this.orbToggle[orbID] && orbID == 2 || orbID == 3 && this.summoningAttack ? 3 : 0;
        int current = 0;
        try {
            current = this.getOrbValues(orbID, orbSprites[orbIconID])[0];
        }
        catch (Exception exception) {
            // empty catch block
        }
        int total = 0;
        try {
            total = this.getOrbValues(orbID, orbSprites[orbIconID])[1];
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (current < 0) {
            current = 0;
        }
        if (total < 0) {
            total = 0;
        }
        double percentage = current * 100 / total;
        double pixelPercent = 27.0 - percentage * 27.0 / 100.0;
        int backingSprite = orbID == 0 ? (this.orbToggle[0] ? 4 : 3) : 2;
        int textColour = this.getOrbTextColor(percentage);
        if (this.orbToggle[orbID] && this.getOrbValues(orbID, null)[0] <= 0) {
            this.orbToggle[orbID] = false;
        }
        this.genericOrbs[(this.orbHover == orbID ? 1 : 0) + (!Client.isFixed() ? 5 : 0)].drawSprite(xdraw, ydraw);
        this.smallFont.drawCenteredText(textColour, xdraw + (!Client.isFixed() ? 13 : 41), "" + current, ydraw + 26, true);
        if (percentage != this.lastOrbAmount[orbID]) {
            this.backingOrb[orbID] = new Sprite(this.genericOrbs[backingSprite]);
            this.backingOrb[orbID].myHeight = (int)pixelPercent;
            this.lastOrbAmount[orbID] = percentage;
        }
        orbSprites[this.orbToggle[orbID] ? 2 : 1].drawSprite((!Client.isFixed() ? 24 : 0) + xdraw + 3, ydraw + 3);
        if (this.backingOrb[orbID] != null) {
            this.backingOrb[orbID].drawSprite((!Client.isFixed() ? 24 : 0) + xdraw + 3, ydraw + 3);
        }
        orbSprites[orbIconID].drawSprite1((!Client.isFixed() ? 24 : 0) + xdraw, ydraw, textColour == 16711680 && current != 0 ? (loopCycle % 40 < 20 ? 64 + loopCycle % 128 : 0) : 256);
    }

    public void delFriend(long l) {
        try {
            int i;
            block7 : {
                if (l == 0L) {
                    return;
                }
                i = 0;
                while (i < this.friendsCount) {
                    if (this.friendsListAsLongs[i] != l) {
                        ++i;
                        continue;
                    }
                    break block7;
                }
                return;
            }
            --this.friendsCount;
            needDrawTabArea = true;
            int j = i;
            do {
                if (j >= this.friendsCount) {
                    this.stream.createFrame(215);
                    this.stream.writeQWord(l);
                    return;
                }
                this.friendsList[j] = this.friendsList[j + 1];
                this.friendsNodeIDs[j] = this.friendsNodeIDs[j + 1];
                this.friendsListAsLongs[j] = this.friendsListAsLongs[j + 1];
                ++j;
            } while (true);
        }
        catch (RuntimeException runtimeexception) {
            Signlink.reporterror("18622, false, " + l + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void delIgnore(long l) {
        try {
            if (l == 0L) {
                return;
            }
            int j = 0;
            while (j < this.ignoreCount) {
                if (this.ignoreListAsLongs[j] == l) {
                    --this.ignoreCount;
                    needDrawTabArea = true;
                    System.arraycopy((Object)this.ignoreListAsLongs, (int)(j + 1), (Object)this.ignoreListAsLongs, (int)j, (int)(this.ignoreCount - j));
                    this.stream.createFrame(74);
                    this.stream.writeQWord(l);
                    return;
                }
                ++j;
            }
            return;
        }
        catch (RuntimeException runtimeexception) {
            Signlink.reporterror("47229, 3, " + l + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void determineMenuSize() {
        int i = this.newBoldFont.getTextWidth("Choose Option");
        for (int j = 0; j < this.menuActionRow; ++j) {
            int k = this.newBoldFont.getTextWidth(this.menuActionName[j]);
            if (k <= i) continue;
            i = k;
        }
        int l = 15 * this.menuActionRow + 21;
        int paddingRight = 8;
        int paddingBottom = 8;
        int width = !Client.isFixed() ? this.getScreenWidth() : 765;
        int height = !Client.isFixed() ? this.getScreenHeight() : 503;
        if (this.saveClickX <= 0) return;
        if (this.saveClickY <= 0) return;
        if (this.saveClickX >= width) return;
        if (this.saveClickY >= height) return;
        int x = this.saveClickX - 0 - (i += 8) / 2;
        if (x < 0) {
            x = 0;
        } else if (x + i > width - paddingRight) {
            x = width - paddingRight - i;
        }
        int y = this.saveClickY - 0;
        if (y + l > width) {
            y = width - l;
        }
        if (y < 0) {
            y = 0;
        } else if (y + l > height - paddingBottom) {
            y = height - paddingBottom - l;
        }
        if (l > height) {
            y = 0;
        }
        this.menuOpen = true;
        this.menuOffsetX = x;
        this.menuOffsetY = y;
        this.menuWidth = i;
        this.menuHeight = 15 * this.menuActionRow + 22;
    }

    public void doAction(int i) {
        NPC class30_sub2_sub4_sub1_sub1_7;
        int actionCommand1;
        int actionCommand2;
        int actionId;
        int actionCommand3;
        BuffTimerHandler.BuffTimers t;
        block224 : {
            int k2;
            NPC class30_sub2_sub4_sub1_sub1_2;
            Player player;
            String s2;
            String s3;
            RSInterface rsInterface;
            int j2;
            NPC npc;
            block223 : {
                int j3;
                String s1;
                int l1;
                block222 : {
                    String s;
                    Player class30_sub2_sub4_sub1_sub2_1;
                    NPC class30_sub2_sub4_sub1_sub1_1;
                    int k1;
                    InputFieldWidget inter;
                    if (i < 0) {
                        return;
                    }
                    this.summoningAttack = false;
                    actionId = this.menuActionID[i];
                    actionCommand1 = this.menuActionCmd1[i];
                    actionCommand2 = this.menuActionCmd2[i];
                    actionCommand3 = this.menuActionCmd3[i];
                    if (actionId == 5003) {
                        try {
                            inter = (InputFieldWidget)RSInterface.interfaceCache[actionCommand1];
                            this.setNewInputField(inter);
                            if (inter.message != null && inter.message.equals((Object)inter.getDefaultInputFieldText())) {
                                inter.message = "";
                            }
                            if (inter.message == null) {
                                inter.message = "";
                            }
                        }
                        catch (ClassCastException e) {
                            System.out.println("Failed casting input field.");
                            e.printStackTrace();
                        }
                    } else if (actionId == 5004) {
                        try {
                            inter = (InputFieldWidget)RSInterface.interfaceCache[actionCommand1];
                            inter.message = "";
                            this.updateInputField(inter);
                        }
                        catch (ClassCastException e) {
                            System.out.println("Failed casting input field.");
                            e.printStackTrace();
                        }
                    }
                    if (actionId >= 2000) {
                        actionId -= 2000;
                    }
                    if (actionId == 476) {
                        this.alertHandler.close();
                    }
                    if (actionId == 474) {
                        boolean bl = this.counterOn = !this.counterOn;
                    }
                    if (actionId == 475) {
                        this.xpCounter = 0;
                    }
                    if (actionId == 712) {
                        boolean bl = this.coinToggle = !this.coinToggle;
                    }
                    if (actionId == 713) {
                        this.promptInput = "";
                        inputTaken = true;
                        this.messagePromptRaised = true;
                        this.friendsListAction = -1;
                        this.amountOrNameInput = "";
                        this.inputDialogState = 0;
                        this.interfaceButtonAction = 557;
                        this.aString1121 = "Enter amount";
                    }
                    if (actionId == 714) {
                        this.pushMessage("Your money pouch currently contains " + RSInterface.interfaceCache[8135].message + " coins.", ChatMessage.ChatType.ZERO);
                    }
                    if (actionId == 715) {
                        this.promptInput = "";
                        inputTaken = true;
                        this.messagePromptRaised = true;
                        this.friendsListAction = -1;
                        this.amountOrNameInput = "";
                        this.inputDialogState = 0;
                        this.interfaceButtonAction = 788;
                        this.aString1121 = "Enter amount of 1B tickets to withdraw";
                    }
                    if (actionId == 582 && (npc = this.npcArray[actionCommand1]) != null) {
                        this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, npc.pathY[0], Client.myPlayer.pathX[0], false, npc.pathX[0]);
                        this.crossX = this.saveClickX;
                        this.crossY = this.saveClickY;
                        this.crossType = 2;
                        this.crossIndex = 0;
                        this.stream.createFrame(57);
                        this.stream.writeDWord(this.anInt1285);
                        this.stream.method432(actionCommand1);
                        this.stream.putLEShort(this.itemSlotUsedOn);
                        this.stream.method432(this.anInt1284);
                    }
                    if (actionId == 234) {
                        boolean flag1 = this.calculatePath(2, 0, 0, 0, Client.myPlayer.pathY[0], 0, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                        if (!flag1) {
                            flag1 = this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                        }
                        this.crossX = this.saveClickX;
                        this.crossY = this.saveClickY;
                        this.crossType = 2;
                        this.crossIndex = 0;
                        this.stream.createFrame(236);
                        this.stream.putLEShort(actionCommand3 + baseY);
                        this.stream.writeWord(actionCommand1);
                        this.stream.putLEShort(actionCommand2 + baseX);
                    }
                    if (actionId == 62 && this.findPathToObject(actionCommand1, actionCommand3, actionCommand2)) {
                        this.stream.createFrame(192);
                        this.stream.writeWord(this.anInt1284);
                        this.stream.putLEShort(actionCommand1 >> 14 & 32767);
                        this.stream.putLEShortA(actionCommand3 + baseY);
                        this.stream.putLEShort(this.itemSlotUsedOn);
                        this.stream.putLEShortA(actionCommand2 + baseX);
                        this.stream.writeDWord(this.anInt1285);
                    }
                    if (actionId == 104) {
                        rsInterface = RSInterface.interfaceCache[actionCommand3];
                        spellID = rsInterface.id;
                        if (!this.interfaceIsSelected(rsInterface)) {
                            this.pushMessage("You need the correct Magic level and rune requirements to use this spell.", ChatMessage.ChatType.ZERO);
                        } else if (!this.autoCast || this.autocastId != spellID) {
                            this.autoCast = true;
                            this.autocastId = spellID;
                            this.sendPacket185(this.autocastId, -1, 135);
                            this.pushMessage("Autocast spell selected.", ChatMessage.ChatType.ZERO);
                        } else if (this.autocastId == spellID) {
                            this.setAutoCastOff();
                        }
                    }
                    if (actionId == 511) {
                        boolean flag2 = this.calculatePath(2, 0, 0, 0, Client.myPlayer.pathY[0], 0, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                        if (!flag2) {
                            flag2 = this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                        }
                        this.crossX = this.saveClickX;
                        this.crossY = this.saveClickY;
                        this.crossType = 2;
                        this.crossIndex = 0;
                        this.stream.createFrame(25);
                        this.stream.writeDWord(this.anInt1284);
                        this.stream.method432(this.anInt1285);
                        this.stream.writeWord(actionCommand1);
                        this.stream.method432(actionCommand3 + baseY);
                        this.stream.putLEShortA(this.itemSlotUsedOn);
                        this.stream.writeWord(actionCommand2 + baseX);
                    }
                    if (actionId == 74) {
                        this.stream.createFrame(122);
                        this.stream.putLEShortA(actionCommand3);
                        this.stream.method432(actionCommand2);
                        this.stream.putLEShort(actionCommand1);
                        this.atInventoryLoopCycle = 0;
                        this.atInventoryInterface = actionCommand3;
                        this.atInventoryIndex = actionCommand2;
                        this.atInventoryInterfaceType = 2;
                        if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                            this.atInventoryInterfaceType = 1;
                        }
                        if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                            this.atInventoryInterfaceType = 3;
                        }
                    }
                    if (actionId == 315) {
                        RSInterface class9 = RSInterface.interfaceCache[actionCommand3];
                        if (class9.type == 77) {
                            boolean check = !class9.inputToggled;
                            Client.disableInputFields();
                            class9.inputToggled = check;
                            if (class9.inputToggled) {
                                this.inputFieldSelected = class9;
                            }
                            if (class9.inputToggled && class9.inputText.equals((Object)class9.defaultText)) {
                                class9.inputText = "";
                            } else if (!class9.inputToggled && class9.inputText.equalsIgnoreCase("")) {
                                class9.inputText = class9.defaultText;
                            }
                        }
                        this.sendPacket185(actionCommand3, -1, 135);
                    }
                    if (actionId == 561 && (player = this.playerArray[actionCommand1]) != null) {
                        this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, player.pathY[0], Client.myPlayer.pathX[0], false, player.pathX[0]);
                        this.crossX = this.saveClickX;
                        this.crossY = this.saveClickY;
                        this.crossType = 2;
                        this.crossIndex = 0;
                        if ((anInt1188 += actionCommand1) >= 90) {
                            this.stream.createFrame(136);
                            anInt1188 = 0;
                        }
                        this.stream.createFrame(128);
                        this.stream.writeWord(actionCommand1);
                    }
                    if (actionId == 20 && (class30_sub2_sub4_sub1_sub1_1 = this.npcArray[actionCommand1]) != null) {
                        this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, class30_sub2_sub4_sub1_sub1_1.pathY[0], Client.myPlayer.pathX[0], false, class30_sub2_sub4_sub1_sub1_1.pathX[0]);
                        this.crossX = this.saveClickX;
                        this.crossY = this.saveClickY;
                        this.crossType = 2;
                        this.crossIndex = 0;
                        this.stream.createFrame(155);
                        this.stream.putLEShort(actionCommand1);
                    }
                    if (actionId == 779 && (class30_sub2_sub4_sub1_sub2_1 = this.playerArray[actionCommand1]) != null) {
                        this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, class30_sub2_sub4_sub1_sub2_1.pathY[0], Client.myPlayer.pathX[0], false, class30_sub2_sub4_sub1_sub2_1.pathX[0]);
                        this.crossX = this.saveClickX;
                        this.crossY = this.saveClickY;
                        this.crossType = 2;
                        this.crossIndex = 0;
                        this.stream.createFrame(153);
                        this.stream.putLEShort(actionCommand1);
                    }
                    if (actionId == 516) {
                        if (!this.menuOpen) {
                            this.worldController.method312(this.saveClickY - 4, this.saveClickX - 4);
                        } else {
                            this.worldController.method312(actionCommand3 - 4, actionCommand2 - 4);
                        }
                    }
                    if (actionId == 519) {
                        int y;
                        int x = !this.menuOpen ? this.saveClickX : actionCommand2;
                        int n = y = !this.menuOpen ? this.saveClickY : actionCommand3;
                        if (!Client.isFixed()) {
                            x -= 4;
                            y -= 4;
                        }
                        this.worldController.method312(y, x);
                    }
                    if (actionId == 1062) {
                        if ((anInt924 += baseX) >= 113) {
                            this.stream.createFrame(183);
                            this.stream.writeDWordBigEndian(15086193);
                            anInt924 = 0;
                        }
                        this.findPathToObject(actionCommand1, actionCommand3, actionCommand2);
                        this.stream.createFrame(228);
                        this.stream.method432(actionCommand1 >> 14 & 32767);
                        this.stream.method432(actionCommand3 + baseY);
                        this.stream.writeWord(actionCommand2 + baseX);
                    }
                    if (actionId == 679 && !this.aBoolean1149) {
                        this.stream.createFrame(40);
                        this.stream.writeWord(actionCommand3);
                        this.aBoolean1149 = true;
                    }
                    if (actionId == 431) {
                        this.stream.createFrame(129);
                        this.stream.method432(actionCommand2);
                        this.stream.writeDWord(actionCommand3);
                        this.stream.writeDWord(actionCommand1);
                        this.atInventoryLoopCycle = 0;
                        this.atInventoryInterface = actionCommand3;
                        this.atInventoryIndex = actionCommand2;
                        this.atInventoryInterfaceType = 2;
                        if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                            this.atInventoryInterfaceType = 1;
                        }
                        if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                            this.atInventoryInterfaceType = 3;
                        }
                    }
                    if ((actionId == 337 || actionId == 42 || actionId == 792 || actionId == 322) && (k1 = (s = this.menuActionName[i]).indexOf("@whi@")) != -1) {
                        long l3 = TextClass.longForName(s.substring(k1 + 5).trim());
                        if (actionId == 337) {
                            this.addFriend(l3);
                        }
                        if (actionId == 42) {
                            this.addIgnore(l3);
                        }
                        if (actionId == 792) {
                            this.delFriend(l3);
                        }
                        if (actionId == 322) {
                            this.delIgnore(l3);
                        }
                    }
                    if (actionId == 53) {
                        this.stream.createFrame(135);
                        this.stream.putLEShort(actionCommand2);
                        this.stream.method432(actionCommand3);
                        this.stream.writeDWord(actionCommand1);
                        this.atInventoryLoopCycle = 0;
                        this.atInventoryInterface = actionCommand3;
                        this.atInventoryIndex = actionCommand2;
                        this.atInventoryInterfaceType = 2;
                        if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                            this.atInventoryInterfaceType = 1;
                        }
                        if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                            this.atInventoryInterfaceType = 3;
                        }
                    }
                    if (actionId == 539) {
                        this.stream.createFrame(16);
                        this.stream.writeDWord(actionCommand1);
                        this.stream.putLEShortA(actionCommand2);
                        this.stream.putLEShortA(actionCommand3);
                        this.atInventoryLoopCycle = 0;
                        this.atInventoryInterface = actionCommand3;
                        this.atInventoryIndex = actionCommand2;
                        this.atInventoryInterfaceType = 2;
                        if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                            this.atInventoryInterfaceType = 1;
                        }
                        if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                            this.atInventoryInterfaceType = 3;
                        }
                    }
                    if (actionId == 2444 && (l1 = (s1 = this.menuActionName[i]).indexOf("@whi@")) != -1) {
                        s1 = s1.substring(l1 + 5).trim();
                        String username = TextClass.fixName(TextClass.nameForLong(TextClass.longForName(s1)));
                        boolean playerFound = false;
                        for (j3 = 0; j3 < this.playerCount; ++j3) {
                            Player target = this.playerArray[this.playerIndices[j3]];
                            if (target == null || target.name == null || !target.name.equalsIgnoreCase(username)) continue;
                            this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, target.pathY[0], Client.myPlayer.pathX[0], false, target.pathX[0]);
                            if (actionId == 2444) {
                                this.stream.createFrame(62);
                                this.stream.writeWord(this.playerIndices[j3]);
                            }
                            if (!(playerFound = true)) {
                                break;
                            }
                            break block222;
                        }
                        this.pushMessage("Unable to find " + username, ChatMessage.ChatType.ZERO);
                    }
                }
                if ((actionId == 484 || actionId == 6) && (l1 = (s1 = this.menuActionName[i]).indexOf("@whi@")) != -1) {
                    s1 = s1.substring(l1 + 5).trim();
                    String s7 = TextClass.fixName(TextClass.nameForLong(TextClass.longForName(s1)));
                    boolean flag9 = false;
                    for (j3 = 0; j3 < this.playerCount; ++j3) {
                        Player class30_sub2_sub4_sub1_sub2_7 = this.playerArray[this.playerIndices[j3]];
                        if (class30_sub2_sub4_sub1_sub2_7 == null || class30_sub2_sub4_sub1_sub2_7.name == null || !class30_sub2_sub4_sub1_sub2_7.name.equalsIgnoreCase(s7)) continue;
                        this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, class30_sub2_sub4_sub1_sub2_7.pathY[0], Client.myPlayer.pathX[0], false, class30_sub2_sub4_sub1_sub2_7.pathX[0]);
                        if (actionId == 484) {
                            this.stream.createFrame(39);
                            this.stream.putLEShort(this.playerIndices[j3]);
                        }
                        if (actionId == 6) {
                            if ((anInt1188 += actionCommand1) >= 90) {
                                this.stream.createFrame(136);
                                anInt1188 = 0;
                            }
                            this.stream.createFrame(128);
                            this.stream.writeWord(this.playerIndices[j3]);
                        }
                        if (!(flag9 = true)) {
                            break;
                        }
                        break block223;
                    }
                    this.pushMessage("Unable to find " + s7, ChatMessage.ChatType.ZERO);
                }
            }
            if (actionId == 485) {
                Client.launchURL(this.linkInText);
            }
            if (actionId == 870) {
                this.stream.createFrame(53);
                this.stream.writeWord(actionCommand2);
                this.stream.method432(this.itemSlotUsedOn);
                this.stream.putLEShortA(actionCommand1);
                this.stream.writeWord(this.anInt1284);
                this.stream.putLEShort(this.anInt1285);
                this.stream.writeWord(actionCommand3);
                this.atInventoryLoopCycle = 0;
                this.atInventoryInterface = actionCommand3;
                this.atInventoryIndex = actionCommand2;
                this.atInventoryInterfaceType = 2;
                if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                    this.atInventoryInterfaceType = 1;
                }
                if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                    this.atInventoryInterfaceType = 3;
                }
            }
            if (actionId == 875) {
                this.stream.createFrame(54);
                this.stream.writeWord(actionCommand2);
                this.stream.method432(this.itemSlotUsedOn);
                this.stream.putLEShortA(actionCommand1);
                this.stream.writeWord(this.anInt1284);
                this.stream.putLEShort(this.anInt1285);
                this.stream.writeWord(actionCommand3);
                this.atInventoryLoopCycle = 0;
                this.atInventoryInterface = actionCommand3;
                this.atInventoryIndex = actionCommand2;
                this.atInventoryInterfaceType = 2;
                if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                    this.atInventoryInterfaceType = 1;
                }
                if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                    this.atInventoryInterfaceType = 3;
                }
            }
            if (actionId == 847) {
                this.stream.createFrame(87);
                this.stream.method432(actionCommand1);
                this.stream.writeWord(actionCommand3);
                this.stream.method432(actionCommand2);
                this.atInventoryLoopCycle = 0;
                this.atInventoryInterface = actionCommand3;
                this.atInventoryIndex = actionCommand2;
                this.atInventoryInterfaceType = 2;
                if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                    this.atInventoryInterfaceType = 1;
                }
                if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                    this.atInventoryInterfaceType = 3;
                }
            }
            if (actionId == 626) {
                String s8;
                rsInterface = RSInterface.interfaceCache[actionCommand3];
                this.spellSelected = 1;
                spellID = rsInterface.id;
                this.anInt1137 = actionCommand3;
                this.spellUsableOn = rsInterface.spellUsableOn;
                this.itemSelected = 0;
                needDrawTabArea = true;
                String s4 = rsInterface.selectedActionName;
                if (s4.indexOf(" ") != -1) {
                    s4 = s4.substring(0, s4.indexOf(" "));
                }
                if ((s8 = rsInterface.selectedActionName).indexOf(" ") != -1) {
                    s8 = s8.substring(s8.indexOf(" ") + 1);
                }
                this.spellTooltip = s4 + " " + rsInterface.spellName + " " + s8;
                if (this.spellUsableOn != 16) return;
                needDrawTabArea = true;
                tabID = 3;
                tabAreaAltered = true;
                return;
            }
            if (actionId >= 1700 && actionId <= 1710) {
                this.stream.createFrame(185);
                int offset = 0;
                offset = actionCommand3 + (actionCommand3 - 58030) * 10 + (actionId - 1700);
                this.stream.writeWord(offset);
            }
            if (actionId == 1053) {
                this.stream.createFrame(185);
                this.stream.writeWord(9999);
            }
            if (actionId == 78) {
                this.stream.createFrame(117);
                this.stream.writeDWord(actionCommand3);
                this.stream.writeDWord(actionCommand1);
                this.stream.putLEShort(actionCommand2);
                this.atInventoryLoopCycle = 0;
                this.atInventoryInterface = actionCommand3;
                this.atInventoryIndex = actionCommand2;
                this.atInventoryInterfaceType = 2;
                if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                    this.atInventoryInterfaceType = 1;
                }
                if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                    this.atInventoryInterfaceType = 3;
                }
            }
            if (actionId == 27 && (player = this.playerArray[actionCommand1]) != null) {
                this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, player.pathY[0], Client.myPlayer.pathX[0], false, player.pathX[0]);
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                if ((anInt986 += actionCommand1) >= 54) {
                    this.stream.createFrame(189);
                    this.stream.writeWordBigEndian(234);
                    anInt986 = 0;
                }
                this.stream.createFrame(73);
                this.stream.putLEShort(actionCommand1);
            }
            if (actionId == 213) {
                boolean flag3 = this.calculatePath(2, 0, 0, 0, Client.myPlayer.pathY[0], 0, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                if (!flag3) {
                    flag3 = this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                }
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                this.stream.createFrame(79);
                this.stream.putLEShort(actionCommand3 + baseY);
                this.stream.writeWord(actionCommand1);
                this.stream.method432(actionCommand2 + baseX);
            }
            if (actionId == 632) {
                this.stream.createFrame(145);
                this.stream.writeDWord(actionCommand3);
                this.stream.method432(actionCommand2);
                this.stream.writeDWord(actionCommand1);
                this.atInventoryLoopCycle = 0;
                this.atInventoryInterface = actionCommand3;
                this.atInventoryIndex = actionCommand2;
                this.atInventoryInterfaceType = 2;
                if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                    this.atInventoryInterfaceType = 1;
                }
                if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                    this.atInventoryInterfaceType = 3;
                }
            }
            if (actionId == 1011) {
                Client.setTab(0);
            }
            if (actionId == 1012) {
                Client.setTab(1);
            }
            if (actionId == 1013) {
                Client.setTab(2);
            }
            if (actionId == 1014) {
                Client.setTab(3);
            }
            if (actionId == 1015) {
                Client.setTab(4);
            }
            if (actionId == 1016) {
                Client.setTab(5);
            }
            if (actionId == 1017) {
                Client.setTab(6);
            }
            if (actionId == 1018) {
                Client.setTab(7);
            }
            if (actionId == 1019) {
                Client.setTab(8);
            }
            if (actionId == 1020) {
                Client.setTab(9);
            }
            if (actionId == 1021) {
                Client.setTab(10);
            }
            if (actionId == 1022) {
                Client.setTab(11);
            }
            if (actionId == 1023) {
                Client.setTab(12);
            }
            if (actionId == 1024) {
                Client.setTab(13);
            }
            if (actionId == 1042) {
                Client.setTab(14);
            }
            if (actionId == 1043) {
                Client.setTab(16);
            }
            if (actionId == 1044) {
                Client.setTab(15);
            }
            if (actionId == 1045) {
                if (openInterfaceID != -1) {
                    this.pushMessage("Please close the window first.", ChatMessage.ChatType.ZERO);
                } else if (this.getOrbValues(1, null)[0] > 0) {
                    this.handleQuickAidsActive();
                } else {
                    this.pushMessage("You need to recharge your Prayer at an alter.", ChatMessage.ChatType.ZERO);
                }
            }
            if (actionId == 1046) {
                if (!this.loadTickSelection) {
                    this.turnOffPrayers();
                    this.turnOffCurses();
                    this.turnOffQuickTicks();
                    this.configureQuickTicks();
                    this.loadTickSelection = true;
                }
                this.toggleQuickAidsSelection();
            }
            if (actionId == 1047) {
                if (this.getOrbValues(2, null)[0] > 0) {
                    this.orbToggle[2] = !this.orbToggle[2];
                } else {
                    this.pushMessage("You don't have enough energy left to run!", ChatMessage.ChatType.ZERO);
                }
                this.sendPacket185(152, 173, 169);
            }
            if (actionId == 1048) {
                this.pushMessage("<col=225>Type ::rest To rest", ChatMessage.ChatType.ZERO);
            }
            if (actionId == 1049) {
                this.faceNorth();
            }
            if (actionId == 1050) {
                try {
                    System.out.println("Opening world map...");
                    Runtime.getRuntime().exec("java -jar " + CacheType.DATA.getFullLocation() + "OSRS_Map.jar");
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (actionId == 1051) {
                Client.launchURL("www.imagine-ps.com/community/index.php?/topic/1973-the-knowledge-starter-guide");
                this.pushMessage("<col=225>For Advice Ask For Help On The Forums.", ChatMessage.ChatType.ZERO);
            }
            if (actionId == 1052 && this.orbToggle[0]) {
                this.pushMessage("<col=225>Coming soon!", ChatMessage.ChatType.ZERO);
            }
            if (actionId == 1005) {
                this.yellChatMode = false;
                inputTaken = true;
            }
            if (actionId == 1004) {
                this.yellChatMode = true;
                inputTaken = true;
            }
            if (actionId == 1003) {
                this.channelButtonClickPosition = 6;
                this.chatTypeView = 12;
                inputTaken = true;
            }
            if (actionId == 1002) {
                this.clanChatMode = false;
                inputTaken = true;
            }
            if (actionId == 1001) {
                this.clanChatMode = true;
                inputTaken = true;
            }
            if (actionId == 1000) {
                this.channelButtonClickPosition = 5;
                this.chatTypeView = 11;
                inputTaken = true;
            }
            if (actionId == 999) {
                this.channelButtonClickPosition = 0;
                this.chatTypeView = 0;
                inputTaken = true;
            }
            if (actionId == 998) {
                this.channelButtonClickPosition = 1;
                this.chatTypeView = 5;
                inputTaken = true;
            }
            if (actionId == 997) {
                this.publicChatMode = 3;
                inputTaken = true;
            }
            if (actionId == 996) {
                this.publicChatMode = 2;
                inputTaken = true;
            }
            if (actionId == 995) {
                this.publicChatMode = 1;
                inputTaken = true;
            }
            if (actionId == 994) {
                this.publicChatMode = 0;
                inputTaken = true;
            }
            if (actionId == 993) {
                this.channelButtonClickPosition = 2;
                this.chatTypeView = 1;
                inputTaken = true;
            }
            if (actionId == 992) {
                this.privateChatMode = 2;
                inputTaken = true;
                this.privateChatMode = 2;
                this.stream.createFrame(95);
                this.stream.writeWordBigEndian(this.publicChatMode);
                this.stream.writeWordBigEndian(this.privateChatMode);
                this.stream.writeWordBigEndian(this.tradeMode);
            }
            if (actionId == 991) {
                this.privateChatMode = 1;
                inputTaken = true;
                this.stream.createFrame(95);
                this.stream.writeWordBigEndian(this.publicChatMode);
                this.stream.writeWordBigEndian(this.privateChatMode);
                this.stream.writeWordBigEndian(this.tradeMode);
            }
            if (actionId == 990) {
                this.privateChatMode = 0;
                inputTaken = true;
                this.stream.createFrame(95);
                this.stream.writeWordBigEndian(this.publicChatMode);
                this.stream.writeWordBigEndian(this.privateChatMode);
                this.stream.writeWordBigEndian(this.tradeMode);
            }
            if (actionId == 989) {
                this.channelButtonClickPosition = 3;
                this.chatTypeView = 2;
                inputTaken = true;
                this.stream.createFrame(95);
                this.stream.writeWordBigEndian(this.publicChatMode);
                this.stream.writeWordBigEndian(this.privateChatMode);
                this.stream.writeWordBigEndian(this.tradeMode);
            }
            if (actionId == 987) {
                this.tradeMode = 2;
                inputTaken = true;
            }
            if (actionId == 986) {
                this.tradeMode = 1;
                inputTaken = true;
            }
            if (actionId == 985) {
                this.tradeMode = 0;
                inputTaken = true;
            }
            if (actionId == 984) {
                this.channelButtonClickPosition = 5;
                this.chatTypeView = 3;
                inputTaken = true;
            }
            if (actionId == 983) {
                this.duelMode = 2;
                inputTaken = true;
            }
            if (actionId == 982) {
                this.duelMode = 1;
                inputTaken = true;
            }
            if (actionId == 981) {
                this.duelMode = 0;
                inputTaken = true;
            }
            if (actionId == 980) {
                this.channelButtonClickPosition = 6;
                this.chatTypeView = 4;
                inputTaken = true;
            }
            if (actionId == 493) {
                this.stream.createFrame(75);
                this.stream.putLEShortA(actionCommand3);
                this.stream.putLEShort(actionCommand2);
                this.stream.writeDWord(actionCommand1);
                this.atInventoryLoopCycle = 0;
                this.atInventoryInterface = actionCommand3;
                this.atInventoryIndex = actionCommand2;
                this.atInventoryInterfaceType = 2;
                if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                    this.atInventoryInterfaceType = 1;
                }
                if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                    this.atInventoryInterfaceType = 3;
                }
            }
            if (actionId == 652) {
                boolean flag4 = this.calculatePath(2, 0, 0, 0, Client.myPlayer.pathY[0], 0, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                if (!flag4) {
                    flag4 = this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                }
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                this.stream.createFrame(156);
                this.stream.method432(actionCommand2 + baseX);
                this.stream.putLEShort(actionCommand3 + baseY);
                this.stream.putLEShortA(actionCommand1);
            }
            if (actionId == 94) {
                boolean flag5 = this.calculatePath(2, 0, 0, 0, Client.myPlayer.pathY[0], 0, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                if (!flag5) {
                    flag5 = this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                }
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                this.stream.createFrame(181);
                this.stream.putLEShort(actionCommand3 + baseY);
                this.stream.writeWord(actionCommand1);
                this.stream.putLEShort(actionCommand2 + baseX);
                this.stream.method432(this.anInt1137);
            }
            if (actionId == 646) {
                this.sendPacket185(actionCommand3, -1, 646);
            }
            if (actionId == 225 && (class30_sub2_sub4_sub1_sub1_2 = this.npcArray[actionCommand1]) != null) {
                this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, class30_sub2_sub4_sub1_sub1_2.pathY[0], Client.myPlayer.pathX[0], false, class30_sub2_sub4_sub1_sub1_2.pathX[0]);
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                if ((anInt1226 += actionCommand1) >= 85) {
                    this.stream.createFrame(230);
                    this.stream.writeWordBigEndian(239);
                    anInt1226 = 0;
                }
                this.stream.createFrame(17);
                this.stream.putLEShortA(actionCommand1);
            }
            if (actionId == 965 && (npc = this.npcArray[actionCommand1]) != null) {
                this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, npc.pathY[0], Client.myPlayer.pathX[0], false, npc.pathX[0]);
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                if (++anInt1134 >= 96) {
                    this.stream.createFrame(152);
                    this.stream.writeWordBigEndian(88);
                    anInt1134 = 0;
                }
                this.stream.createFrame(21);
                this.stream.writeWord(actionCommand1);
            }
            if (actionId == 413 && (npc = this.npcArray[actionCommand1]) != null) {
                this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, npc.pathY[0], Client.myPlayer.pathX[0], false, npc.pathX[0]);
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                this.stream.createFrame(131);
                this.stream.putLEShortA(actionCommand1);
                this.stream.method432(this.anInt1137);
            }
            if (actionId == 200) {
                this.clearTopInterfaces();
            }
            if (actionId == 1025 && (npc = this.npcArray[actionCommand1]) != null) {
                NPCDefinition entityDef = npc.npcDefinition;
                if (entityDef.childrenIDs != null) {
                    entityDef = entityDef.method161();
                }
                if (entityDef != null) {
                    this.stream.createFrame(20);
                    this.stream.writeWord((int)entityDef.type);
                }
            }
            if (actionId == 900) {
                this.findPathToObject(actionCommand1, actionCommand3, actionCommand2);
                this.stream.createFrame(252);
                this.stream.putLEShortA(actionCommand1 >> 14 & 32767);
                this.stream.putLEShort(actionCommand3 + baseY);
                this.stream.method432(actionCommand2 + baseX);
            }
            if (actionId == 412 && (npc = this.npcArray[actionCommand1]) != null) {
                this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, npc.pathY[0], Client.myPlayer.pathX[0], false, npc.pathX[0]);
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                this.stream.createFrame(72);
                this.stream.method432(actionCommand1);
            }
            if (actionId == 365 && (player = this.playerArray[actionCommand1]) != null) {
                this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, player.pathY[0], Client.myPlayer.pathX[0], false, player.pathX[0]);
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                this.stream.createFrame(249);
                this.stream.method432(actionCommand1);
                this.stream.putLEShort(this.anInt1137);
            }
            if (actionId == 729 && (player = this.playerArray[actionCommand1]) != null) {
                this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, player.pathY[0], Client.myPlayer.pathX[0], false, player.pathX[0]);
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                this.stream.createFrame(39);
                this.stream.putLEShort(actionCommand1);
            }
            if (actionId == 577 && (player = this.playerArray[actionCommand1]) != null) {
                this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, player.pathY[0], Client.myPlayer.pathX[0], false, player.pathX[0]);
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                this.stream.createFrame(139);
                this.stream.putLEShort(actionCommand1);
            }
            if (actionId == 956 && this.findPathToObject(actionCommand1, actionCommand3, actionCommand2)) {
                this.stream.createFrame(35);
                this.stream.putLEShort(actionCommand2 + baseX);
                this.stream.method432(this.anInt1137);
                this.stream.method432(actionCommand3 + baseY);
                this.stream.putLEShort(actionCommand1 >> 14 & 32767);
            }
            if (actionId == 567) {
                boolean flag6 = this.calculatePath(2, 0, 0, 0, Client.myPlayer.pathY[0], 0, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                if (!flag6) {
                    flag6 = this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
                }
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                this.stream.createFrame(23);
                this.stream.putLEShort(actionCommand3 + baseY);
                this.stream.putLEShort(actionCommand1);
                this.stream.putLEShort(actionCommand2 + baseX);
            }
            if (actionId == 867) {
                if ((actionCommand1 & 3) == 0) {
                    // empty if block
                }
                if (++anInt1175 >= 59) {
                    this.stream.createFrame(200);
                    this.stream.writeWord(25501);
                    anInt1175 = 0;
                }
                this.stream.createFrame(43);
                this.stream.writeDWord(actionCommand3);
                this.stream.writeDWord(actionCommand1);
                this.stream.method432(actionCommand2);
                this.atInventoryLoopCycle = 0;
                this.atInventoryInterface = actionCommand3;
                this.atInventoryIndex = actionCommand2;
                this.atInventoryInterfaceType = 2;
                if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                    this.atInventoryInterfaceType = 1;
                }
                if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                    this.atInventoryInterfaceType = 3;
                }
            }
            if (actionId == 543) {
                this.stream.createFrame(237);
                this.stream.writeWord(actionCommand2);
                this.stream.writeDWord(actionCommand1);
                this.stream.writeWord(actionCommand3);
                this.stream.method432(this.anInt1137);
                this.atInventoryLoopCycle = 0;
                this.atInventoryInterface = actionCommand3;
                this.atInventoryIndex = actionCommand2;
                this.atInventoryInterfaceType = 2;
                if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                    this.atInventoryInterfaceType = 1;
                }
                if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                    this.atInventoryInterfaceType = 3;
                }
            }
            if (actionId == 606 && (j2 = (s2 = this.menuActionName[i]).indexOf("@whi@")) != -1) {
                if (openInterfaceID != -1) {
                    this.pushMessage("You Need to Be A staff Member to View Staff Control Panel.", ChatMessage.ChatType.ZERO);
                } else {
                    this.clearTopInterfaces();
                    this.reportAbuseInput = s2.substring(j2 + 5).trim();
                    this.canMute = false;
                    this.canBan = false;
                    for (int i3 = 0; i3 < RSInterface.interfaceCache.length; ++i3) {
                        if (RSInterface.interfaceCache[i3] == null || RSInterface.interfaceCache[i3].contentType != 600) continue;
                        this.reportAbuseInterfaceID = Client.openInterfaceID = RSInterface.interfaceCache[i3].parentID;
                        break;
                    }
                }
            }
            if (actionId == 491 && (player = this.playerArray[actionCommand1]) != null) {
                this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, player.pathY[0], Client.myPlayer.pathX[0], false, player.pathX[0]);
                this.crossX = this.saveClickX;
                this.crossY = this.saveClickY;
                this.crossType = 2;
                this.crossIndex = 0;
                this.stream.createFrame(14);
                this.stream.writeWord(actionCommand1);
                this.stream.putLEShort(this.itemSlotUsedOn);
            }
            if (actionId == 639 && (k2 = (s3 = this.menuActionName[i]).indexOf("@whi@")) != -1) {
                long l4 = TextClass.longForName(s3.substring(k2 + 5).trim());
                int k3 = -1;
                for (int i4 = 0; i4 < this.friendsCount; ++i4) {
                    if (this.friendsListAsLongs[i4] != l4 && actionId != 640) {
                        continue;
                    }
                    k3 = i4;
                    if (k3 == -1 || this.friendsNodeIDs[k3] != 10) break;
                    inputTaken = true;
                    this.inputDialogState = 0;
                    this.messagePromptRaised = true;
                    this.promptInput = "";
                    this.friendsListAction = 3;
                    this.aLong953 = this.friendsListAsLongs[k3];
                    this.aString1121 = "Enter message to send to " + this.friendsList[k3];
                    k3 = 0;
                    break block224;
                }
                this.pushMessage("That player is currently offline.", ChatMessage.ChatType.ZERO);
            }
        }
        if (actionId == 454) {
            this.stream.createFrame(41);
            this.stream.writeWord(actionCommand1);
            this.stream.method432(actionCommand2);
            this.stream.method432(actionCommand3);
            this.atInventoryLoopCycle = 0;
            this.atInventoryInterface = actionCommand3;
            this.atInventoryIndex = actionCommand2;
            this.atInventoryInterfaceType = 2;
            if (RSInterface.interfaceCache[actionCommand3].parentID == openInterfaceID) {
                this.atInventoryInterfaceType = 1;
            }
            if (RSInterface.interfaceCache[actionCommand3].parentID == this.backDialogID) {
                this.atInventoryInterfaceType = 3;
            }
        }
        if (actionId == 478 && (class30_sub2_sub4_sub1_sub1_7 = this.npcArray[actionCommand1]) != null) {
            this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, class30_sub2_sub4_sub1_sub1_7.pathY[0], Client.myPlayer.pathX[0], false, class30_sub2_sub4_sub1_sub1_7.pathX[0]);
            this.crossX = this.saveClickX;
            this.crossY = this.saveClickY;
            this.crossType = 2;
            this.crossIndex = 0;
            if ((actionCommand1 & 3) == 0) {
                // empty if block
            }
            if (++anInt1155 >= 53) {
                this.stream.createFrame(85);
                this.stream.writeWordBigEndian(66);
                anInt1155 = 0;
            }
            this.stream.createFrame(18);
            this.stream.putLEShort(actionCommand1);
        }
        if (actionId == 113) {
            this.findPathToObject(actionCommand1, actionCommand3, actionCommand2);
            this.stream.createFrame(70);
            this.stream.putLEShort(actionCommand2 + baseX);
            this.stream.writeWord(actionCommand3 + baseY);
            this.stream.putLEShortA(actionCommand1 >> 14 & 32767);
        }
        if (actionId == 872) {
            this.findPathToObject(actionCommand1, actionCommand3, actionCommand2);
            this.stream.createFrame(234);
            this.stream.putLEShortA(actionCommand2 + baseX);
            this.stream.method432(actionCommand1 >> 14 & 32767);
            this.stream.putLEShortA(actionCommand3 + baseY);
        }
        if (actionId >= 3555 && actionId <= 3585 && (t = BuffTimerHandler.BuffTimers.get(actionCommand2)) != null) {
            this.pushMessage(t.getDescription(), ChatMessage.ChatType.ONE);
        }
        if (actionId == 502) {
            this.findPathToObject(actionCommand1, actionCommand3, actionCommand2);
            this.stream.createFrame(132);
            this.stream.putLEShortA(actionCommand2 + baseX);
            this.stream.writeWord(actionCommand1 >> 14 & 32767);
            this.stream.method432(actionCommand3 + baseY);
        }
        if (actionId == 1125) {
            this.stream.createFrame(125);
            this.stream.writeWord(actionCommand3);
            this.stream.writeWordBigEndian(actionCommand2);
            this.stream.writeWord(actionCommand1);
        }
        if (actionId == 1130) {
            this.stream.createFrame(127);
            this.stream.writeWord(actionCommand3);
            this.stream.writeWordBigEndian(actionCommand2);
            this.stream.writeWord(actionCommand1);
        }
        if (actionId == 888) {
            this.stream.createFrame(124);
            this.stream.writeWord(actionCommand3);
            this.stream.writeWordBigEndian(actionCommand2);
            this.stream.writeWord(actionCommand1);
        }
        if (actionId == 169) {
            this.sendPacket185(actionCommand3, -1, 169);
        }
        if (actionId == 1100) {
            RSInterface button = RSInterface.interfaceCache[actionCommand3];
            boolean open = button.menuVisible = !button.menuVisible;
            String string = button.tooltip = open ? "Close" : "Open";
        }
        if (actionId == 1200) {
            this.stream.createFrame(185);
            this.stream.writeWord(actionCommand3);
            RSInterface item = RSInterface.interfaceCache[actionCommand3];
            RSInterface menu = RSInterface.interfaceCache[item.mOverInterToTrigger];
            menu.menuItem = item.menuItem;
            menu.menuVisible = false;
        }
        if (actionId == 447) {
            this.itemSelected = 1;
            this.itemSlotUsedOn = actionCommand2;
            this.anInt1284 = actionCommand3;
            this.anInt1285 = actionCommand1;
            this.selectedItemName = ItemDefinition.forID((int)actionCommand1).name;
            this.spellSelected = 0;
            this.summoningAttack = false;
            needDrawTabArea = true;
            return;
        }
        if (actionId == 1226) {
            int j1 = actionCommand1 >> 14 & 32767;
            ObjectDefinition class46 = ObjectDefinition.forID(j1);
            String s10 = class46.description != null ? new String(class46.description) : "It's a " + class46.name + ".";
            this.pushMessage(s10, ChatMessage.ChatType.ZERO);
        }
        if (actionId == 244) {
            boolean flag7 = this.calculatePath(2, 0, 0, 0, Client.myPlayer.pathY[0], 0, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
            if (!flag7) {
                flag7 = this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, actionCommand3, Client.myPlayer.pathX[0], false, actionCommand2);
            }
            this.crossX = this.saveClickX;
            this.crossY = this.saveClickY;
            this.crossType = 2;
            this.crossIndex = 0;
            this.stream.createFrame(253);
            this.stream.putLEShort(actionCommand2 + baseX);
            this.stream.putLEShortA(actionCommand3 + baseY);
            this.stream.method432(actionCommand1);
        }
        if (actionId == 1448) {
            ItemDefinition itemDef_1 = ItemDefinition.forID(actionCommand1);
            String s6 = itemDef_1.description != null ? new String(itemDef_1.description) : "It's a " + itemDef_1.name + ".";
            this.pushMessage(s6, ChatMessage.ChatType.ZERO);
        }
        this.itemSelected = 0;
        this.spellSelected = 0;
        needDrawTabArea = true;
    }

    public void doFlamesDrawing() {
        int c;
        block16 : {
            block15 : {
                block13 : {
                    block14 : {
                        block12 : {
                            c = 256;
                            if (this.anInt1040 <= 0) break block12;
                            break block13;
                        }
                        if (this.anInt1041 <= 0) break block14;
                        break block15;
                    }
                    System.arraycopy((Object)this.anIntArray851, (int)0, (Object)this.anIntArray850, (int)0, (int)256);
                    break block16;
                }
                for (int i = 0; i < 256; ++i) {
                    this.anIntArray850[i] = this.anInt1040 > 768 ? this.method83(this.anIntArray851[i], this.anIntArray852[i], 1024 - this.anInt1040) : (this.anInt1040 > 256 ? this.anIntArray852[i] : this.method83(this.anIntArray852[i], this.anIntArray851[i], 256 - this.anInt1040));
                }
                break block16;
            }
            for (int j = 0; j < 256; ++j) {
                this.anIntArray850[j] = this.anInt1041 > 768 ? this.method83(this.anIntArray851[j], this.anIntArray853[j], 1024 - this.anInt1041) : (this.anInt1041 > 256 ? this.anIntArray853[j] : this.method83(this.anIntArray853[j], this.anIntArray851[j], 256 - this.anInt1041));
            }
        }
        System.arraycopy((Object)this.aClass30_Sub2_Sub1_Sub1_1201.myPixels, (int)0, (Object)this.aGraphicsBuffer_1110.pixels, (int)0, (int)33920);
        int i1 = 0;
        int j1 = 1152;
        int k1 = 1;
        do {
            if (k1 >= c - 1) {
                if (!this.resizing) {
                    this.aGraphicsBuffer_1110.drawGraphics(0, this.graphics, 0);
                }
                break;
            }
            int l1 = this.anIntArray969[k1] * (c - k1) / c;
            int j2 = 22 + l1;
            if (j2 < 0) {
                j2 = 0;
            }
            i1 += j2;
            for (int l2 = j2; l2 < 128; ++l2) {
                int j3;
                if ((j3 = this.anIntArray828[i1++]) != 0) {
                    int l3 = j3;
                    int j4 = 256 - j3;
                    j3 = this.anIntArray850[j3];
                    int l4 = this.aGraphicsBuffer_1110.pixels[j1];
                    this.aGraphicsBuffer_1110.pixels[j1++] = ((j3 & 16711935) * l3 + (l4 & 16711935) * j4 & -16711936) + ((j3 & 65280) * l3 + (l4 & 65280) * j4 & 16711680) >> 8;
                    continue;
                }
                ++j1;
            }
            j1 += j2;
            ++k1;
        } while (true);
        System.arraycopy((Object)this.aClass30_Sub2_Sub1_Sub1_1202.myPixels, (int)0, (Object)this.aGraphicsBuffer_1111.pixels, (int)0, (int)33920);
        i1 = 0;
        j1 = 1176;
        int k2 = 1;
        do {
            if (k2 >= c - 1) {
                if (this.resizing) return;
                this.aGraphicsBuffer_1111.drawGraphics(0, this.graphics, 637);
                return;
            }
            int i3 = this.anIntArray969[k2] * (c - k2) / c;
            int k3 = 103 - i3;
            j1 += i3;
            for (int i4 = 0; i4 < k3; ++i4) {
                int k4;
                if ((k4 = this.anIntArray828[i1++]) != 0) {
                    int i5 = k4;
                    int j5 = 256 - k4;
                    k4 = this.anIntArray850[k4];
                    int k5 = this.aGraphicsBuffer_1111.pixels[j1];
                    this.aGraphicsBuffer_1111.pixels[j1++] = ((k4 & 16711935) * i5 + (k5 & 16711935) * j5 & -16711936) + ((k4 & 65280) * i5 + (k5 & 65280) * j5 & 16711680) >> 8;
                    continue;
                }
                ++j1;
            }
            i1 += 128 - k3;
            j1 += 128 - k3 - i3;
            ++k2;
        } while (true);
    }

    private boolean calculatePath(int clickType, int j, int objectSizeY, int objectType, int fromLocalY, int objectSizeX, int objectDirection, int toLocalY, int fromLocalX, boolean arbitraryDestination, int toLocalX) {
        int initialSkipCheck;
        this.resetPath();
        int currentX = fromLocalX;
        int currentY = fromLocalY;
        this.wayPoints[fromLocalX][fromLocalY] = 99;
        this.distanceValues[fromLocalX][fromLocalY] = 0;
        int nextIndex = 0;
        int currentIndex = 0;
        this.walkingQueueX[nextIndex] = fromLocalX;
        this.walkingQueueY[nextIndex++] = fromLocalY;
        boolean foundDestination = false;
        int maxPathSize = this.walkingQueueX.length;
        int[][] clippingMasks = this.collisionMaps[this.plane].clipData;
        while (currentIndex != nextIndex) {
            currentX = this.walkingQueueX[currentIndex];
            currentY = this.walkingQueueY[currentIndex];
            currentIndex = (currentIndex + 1) % maxPathSize;
            if (currentX == toLocalX && currentY == toLocalY) {
                foundDestination = true;
                break;
            }
            if (objectType != 0) {
                if ((objectType < 5 || objectType == 10) && this.collisionMaps[this.plane].reachedWall(toLocalX, currentX, currentY, j, objectType - 1, toLocalY)) {
                    foundDestination = true;
                    break;
                }
                if (objectType < 10 && this.collisionMaps[this.plane].reachedDecoration(toLocalX, toLocalY, currentY, objectType - 1, j, currentX)) {
                    foundDestination = true;
                    break;
                }
            }
            if (objectSizeX != 0 && objectSizeY != 0 && this.collisionMaps[this.plane].reachedFacingObject(toLocalY, toLocalX, currentX, objectSizeY, objectDirection, objectSizeX, currentY)) {
                foundDestination = true;
                break;
            }
            int newDistanceValue = this.distanceValues[currentX][currentY] + 1;
            if (currentX > 0 && this.wayPoints[currentX - 1][currentY] == 0 && (clippingMasks[currentX - 1][currentY] & 19398920) == 0) {
                this.walkingQueueX[nextIndex] = currentX - 1;
                this.walkingQueueY[nextIndex] = currentY;
                nextIndex = (nextIndex + 1) % maxPathSize;
                this.wayPoints[currentX - 1][currentY] = 2;
                this.distanceValues[currentX - 1][currentY] = newDistanceValue;
            }
            if (currentX < 102 && this.wayPoints[currentX + 1][currentY] == 0 && (clippingMasks[currentX + 1][currentY] & 19399040) == 0) {
                this.walkingQueueX[nextIndex] = currentX + 1;
                this.walkingQueueY[nextIndex] = currentY;
                nextIndex = (nextIndex + 1) % maxPathSize;
                this.wayPoints[currentX + 1][currentY] = 8;
                this.distanceValues[currentX + 1][currentY] = newDistanceValue;
            }
            if (currentY > 0 && this.wayPoints[currentX][currentY - 1] == 0 && (clippingMasks[currentX][currentY - 1] & 19398914) == 0) {
                this.walkingQueueX[nextIndex] = currentX;
                this.walkingQueueY[nextIndex] = currentY - 1;
                nextIndex = (nextIndex + 1) % maxPathSize;
                this.wayPoints[currentX][currentY - 1] = 1;
                this.distanceValues[currentX][currentY - 1] = newDistanceValue;
            }
            if (currentY < 102 && this.wayPoints[currentX][currentY + 1] == 0 && (clippingMasks[currentX][currentY + 1] & 19398944) == 0) {
                this.walkingQueueX[nextIndex] = currentX;
                this.walkingQueueY[nextIndex] = currentY + 1;
                nextIndex = (nextIndex + 1) % maxPathSize;
                this.wayPoints[currentX][currentY + 1] = 4;
                this.distanceValues[currentX][currentY + 1] = newDistanceValue;
            }
            if (currentX > 0 && currentY > 0 && this.wayPoints[currentX - 1][currentY - 1] == 0 && (clippingMasks[currentX - 1][currentY - 1] & 19398926) == 0 && (clippingMasks[currentX - 1][currentY] & 19398920) == 0 && (clippingMasks[currentX][currentY - 1] & 19398914) == 0) {
                this.walkingQueueX[nextIndex] = currentX - 1;
                this.walkingQueueY[nextIndex] = currentY - 1;
                nextIndex = (nextIndex + 1) % maxPathSize;
                this.wayPoints[currentX - 1][currentY - 1] = 3;
                this.distanceValues[currentX - 1][currentY - 1] = newDistanceValue;
            }
            if (currentX < 102 && currentY > 0 && this.wayPoints[currentX + 1][currentY - 1] == 0 && (clippingMasks[currentX + 1][currentY - 1] & 19399043) == 0 && (clippingMasks[currentX + 1][currentY] & 19399040) == 0 && (clippingMasks[currentX][currentY - 1] & 19398914) == 0) {
                this.walkingQueueX[nextIndex] = currentX + 1;
                this.walkingQueueY[nextIndex] = currentY - 1;
                nextIndex = (nextIndex + 1) % maxPathSize;
                this.wayPoints[currentX + 1][currentY - 1] = 9;
                this.distanceValues[currentX + 1][currentY - 1] = newDistanceValue;
            }
            if (currentX > 0 && currentY < 102 && this.wayPoints[currentX - 1][currentY + 1] == 0 && (clippingMasks[currentX - 1][currentY + 1] & 19398968) == 0 && (clippingMasks[currentX - 1][currentY] & 19398920) == 0 && (clippingMasks[currentX][currentY + 1] & 19398944) == 0) {
                this.walkingQueueX[nextIndex] = currentX - 1;
                this.walkingQueueY[nextIndex] = currentY + 1;
                nextIndex = (nextIndex + 1) % maxPathSize;
                this.wayPoints[currentX - 1][currentY + 1] = 6;
                this.distanceValues[currentX - 1][currentY + 1] = newDistanceValue;
            }
            if (currentX >= 102 || currentY >= 102 || this.wayPoints[currentX + 1][currentY + 1] != 0 || (clippingMasks[currentX + 1][currentY + 1] & 19399136) != 0 || (clippingMasks[currentX + 1][currentY] & 19399040) != 0 || (clippingMasks[currentX][currentY + 1] & 19398944) != 0) continue;
            this.walkingQueueX[nextIndex] = currentX + 1;
            this.walkingQueueY[nextIndex] = currentY + 1;
            nextIndex = (nextIndex + 1) % maxPathSize;
            this.wayPoints[currentX + 1][currentY + 1] = 12;
            this.distanceValues[currentX + 1][currentY + 1] = newDistanceValue;
        }
        this.arbitraryDestination = 0;
        if (!foundDestination) {
            if (arbitraryDestination) {
                int maxStepsNonInclusive = 100;
                for (int offset = 1; offset < 2; ++offset) {
                    for (int deviationX = toLocalX - offset; deviationX <= toLocalX + offset; ++deviationX) {
                        for (int deviationY = toLocalY - offset; deviationY <= toLocalY + offset; ++deviationY) {
                            if (deviationX < 0 || deviationY < 0 || deviationX >= 104 || deviationY >= 104 || this.distanceValues[deviationX][deviationY] >= maxStepsNonInclusive) continue;
                            maxStepsNonInclusive = this.distanceValues[deviationX][deviationY];
                            currentX = deviationX;
                            currentY = deviationY;
                            this.arbitraryDestination = 1;
                            foundDestination = true;
                        }
                    }
                    if (foundDestination) break;
                }
            }
            if (!foundDestination) {
                return false;
            }
        }
        currentIndex = 0;
        this.walkingQueueX[currentIndex] = currentX;
        this.walkingQueueY[currentIndex++] = currentY;
        int wayPoint = initialSkipCheck = this.wayPoints[currentX][currentY];
        while (currentX != fromLocalX || currentY != fromLocalY) {
            if (wayPoint != initialSkipCheck) {
                initialSkipCheck = wayPoint;
                this.walkingQueueX[currentIndex] = currentX;
                this.walkingQueueY[currentIndex++] = currentY;
            }
            if ((wayPoint & 2) != 0) {
                ++currentX;
            } else if ((wayPoint & 8) != 0) {
                --currentX;
            }
            if ((wayPoint & 1) != 0) {
                ++currentY;
            } else if ((wayPoint & 4) != 0) {
                --currentY;
            }
            wayPoint = this.wayPoints[currentX][currentY];
        }
        if (currentIndex > 0) {
            int traverseIndex = currentIndex;
            if (traverseIndex > 25) {
                traverseIndex = 25;
            }
            int localX = this.walkingQueueX[--currentIndex];
            int localY = this.walkingQueueY[currentIndex];
            if ((currentWalkingQueueSize += traverseIndex) >= 92) {
                this.stream.createFrame(36);
                this.stream.writeDWord(0);
                currentWalkingQueueSize = 0;
            }
            if (clickType == 0) {
                this.stream.createFrame(164);
                this.stream.writeWordBigEndian(traverseIndex + traverseIndex + 3);
            }
            if (clickType == 1) {
                this.stream.createFrame(248);
                this.stream.writeWordBigEndian(traverseIndex + traverseIndex + 3 + 14);
            }
            if (clickType == 2) {
                this.stream.createFrame(98);
                this.stream.writeWordBigEndian(traverseIndex + traverseIndex + 3);
            }
            this.stream.putLEShortA(localX + baseX);
            this.destX = this.walkingQueueX[0];
            this.destY = this.walkingQueueY[0];
            for (int i = 1; i < traverseIndex; ++i) {
                this.stream.writeWordBigEndian(this.walkingQueueX[--currentIndex] - localX);
                this.stream.writeWordBigEndian(this.walkingQueueY[currentIndex] - localY);
            }
            this.stream.putLEShort(localY + baseY);
            this.stream.putNegativeByte(this.heldKeys[5] != 1 ? 0 : 1);
            return true;
        }
        if (clickType == 1) return false;
        return true;
    }

    private void resetPath() {
        int x = 0;
        while (x < 104) {
            for (int y = 0; y < 104; ++y) {
                this.wayPoints[x][y] = 0;
                this.distanceValues[x][y] = 99999999;
            }
            ++x;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void draw3dScreen() {
        this.buffTimerHandler.draw();
        if (!Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.DISPLAY_LOOT_NAMES)) ** GOTO lbl6
        x = 0;
        block0 : do {
            block41 : {
                if (x < 104) break block41;
lbl6: // 2 sources:
                this.hpOverlay();
                if (this.nukeTimer > 0) {
                    DrawingArea.drawAlphaGradient(0, 0, 512, 334, 16711680, 0, 150);
                }
                this.alertHandler.processAlerts();
                this.drawSplitPrivateChat(0, this.getChatBackIncreaseY());
                if (this.crossType == 1) {
                    this.crosses[this.crossIndex / 100].drawSprite(this.crossX - 8 - 4, this.crossY - 8 - 4);
                    if (++Client.anInt1142 > 67) {
                        Client.anInt1142 = 0;
                        this.stream.createFrame(78);
                    }
                }
                if (this.crossType == 2) {
                    this.crosses[4 + this.crossIndex / 100].drawSprite(this.crossX - 8 - 4, this.crossY - 8 - 4);
                }
                if (this.walkableInterfaceID != -1) {
                    if (this.walkableInterfaceID == 44600) {
                        DrawingArea.drawRoundedRectangle(10, 17, 140, 75, 0, 120, true, false);
                    } else if (this.walkableInterfaceID == 44605) {
                        DrawingArea.drawRoundedRectangle(10, 17, 140, 110, 0, 130, true, false);
                        DrawingArea.drawRoundedRectangle(17, 91, 30, 30, 5274820, 200, true, false);
                    }
                    this.method119(this.anInt945, this.walkableInterfaceID);
                    if (this.walkableInterfaceID == 197 && !Client.isFixed()) {
                        this.drawInterface(0, 0 + this.getMapIncreaseX(), RSInterface.interfaceCache[this.walkableInterfaceID], -205 + this.getMapIncreaseY());
                    } else {
                        this.drawInterface(0, 0, RSInterface.interfaceCache[this.walkableInterfaceID], 0);
                    }
                }
                if (Client.openInterfaceID != -1) {
                    this.method119(this.anInt945, Client.openInterfaceID);
                    rsInterface = RSInterface.interfaceCache[Client.openInterfaceID];
                    width = Client.isFixed() == false ? this.getScreenWidth() : 516;
                    v0 = height = Client.isFixed() == false ? this.getScreenHeight() : 338;
                    if (!Client.isFixed()) {
                        this.drawInterface(0, (width - 765) / 2, rsInterface, (height - 503) / 2);
                    } else {
                        this.drawInterface(0, 0, rsInterface, 0);
                    }
                }
                if (this.displayOverLayIcon == 1) {
                    this.multiOverlay.drawSprite(Client.isFixed() == false ? this.xPaddingmapBackImage + this.getMapIncreaseX() - 50 : 472, Client.isFixed() == false ? 1 : 296 + this.getMapIncreaseY());
                }
                if (this.openBOX) {
                    this.openBOX = false;
                    this.donatorPayment = this.inputbox();
                }
                if (Client.fpsOn) {
                    c = 507;
                    k = 20;
                    i1 = 16776960;
                    if (RSApplet.fps < 15) {
                        i1 = 16711680;
                    }
                    this.normalFont.method380("Fps:" + RSApplet.fps, c, i1, k);
                    k += 15;
                    runtime = Runtime.getRuntime();
                    j1 = (int)((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                    i1 = 16776960;
                    if (j1 > 33554432 && Client.lowMem) {
                        i1 = 16711680;
                    }
                    this.normalFont.method380("Mem:" + j1 / 1024 + "mb", c, 16776960, k);
                    k += 15;
                }
                x = Client.baseX + (Client.myPlayer.x - 6 >> 7);
                y = Client.baseY + (Client.myPlayer.y - 6 >> 7);
                if (Client.clientData) {
                    this.normalFont.method385(16776960, "Fps: " + RSApplet.fps, this.myPrivilege[0] == 8 || this.myPrivilege[0] == 7 || this.myPrivilege[0] == 6 ? 255 : 315, 5);
                    runtime = Runtime.getRuntime();
                    j1 = (int)((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                    this.normalFont.method385(16776960, "Mem: " + j1 + "k", this.myPrivilege[0] == 8 || this.myPrivilege[0] == 7 || this.myPrivilege[0] == 6 ? 270 : 330, 5);
                    if (this.myPrivilege[0] == 7 || this.myPrivilege[0] == 8) {
                        drawY = 285;
                        var7_21 = toDraw = new String[]{"Mouse X: " + this.mouseX + " , Mouse Y: " + this.mouseY, "Coords: " + x + ", " + y + ", " + this.plane, "Object Maps: " + this.objectMaps + ";", "Floor Maps: " + this.floorMaps + ";"};
                        var8_22 = var7_21.length;
                        for (var9_24 = 0; var9_24 < var8_22; drawY += 15, ++var9_24) {
                            s = var7_21[var9_24];
                            Client.newRegularFont.drawBasicString(s, 5, drawY, 16776960, 0);
                        }
                    }
                }
                if (this.systemUpdatetime != 0) {
                    j = this.systemUpdatetime / 50;
                    l = j / 60;
                    if ((j %= 60) < 10) {
                        this.normalFont.method385(16776960, "System update in: " + l + ":0" + j, 329, 4);
                    } else {
                        this.normalFont.method385(16776960, "System update in: " + l + ":" + j, 329, 4);
                    }
                    if (++Client.anInt849 > 75) {
                        Client.anInt849 = 0;
                        this.stream.createFrame(148);
                    }
                }
                if (this.nukeTimer != 0) {
                    j = this.nukeTimer / 50;
                    l = j / 60;
                    if ((j %= 60) < 10) {
                        this.normalFont.method385(16776960, "Nuke in: " + l + ":0" + j, 329, 4);
                    } else {
                        this.normalFont.method385(16776960, "Nuke in: " + l + ":" + j, 329, 4);
                    }
                }
                if (Client.displayZoomDuration > 0) {
                    zoom = "Zoom: " + Client.getZoomPercentage() + "%";
                    y1 = 16;
                    DrawingArea.drawPixelsWithOpacity(16711680, 22, this.smallFont.getTextWidth(zoom) + 5, y1, 100, 5);
                    DrawingArea.drawRectangle(4, y1 + 5, this.smallFont.getTextWidth(zoom) + 7, y1 + 2, 16739179);
                    this.smallFont.method389(true, 8, 16777215, zoom, 36);
                    this.smallFont.method389(true, 7, 16777215, zoom, 35);
                }
                startX = 20;
                startY = 20;
                padding = 10;
                break;
            }
            y = 0;
            do {
                block43 : {
                    block44 : {
                        block42 : {
                            if (y >= 104) break block42;
                            node = this.groundArray[this.plane][x][y];
                            offset = 12;
                            if (node == null || !Client.goodDistance(x, y, Client.myPlayer.x - 6 >> 7, Client.myPlayer.y - 6 >> 7, 16)) break block43;
                            item = (Item)node.getFirst();
                            break block44;
                        }
                        ++x;
                        continue block0;
                    }
                    while (item != null) {
                        itemDef = ItemDefinition.forID(item.ID);
                        this.calcEntityScreenPos((x << 7) + 64, 64, (y << 7) + 64);
                        Client.newSmallFont.drawCenteredString(itemDef.name + (item.amount > 1 ? new StringBuilder().append(" (").append(item.amount).append(")").toString() : ""), this.spriteDrawX, this.spriteDrawY - offset, 16777215, 1);
                        offset += 12;
                        item = (Item)node.getNext();
                    }
                }
                ++y;
            } while (true);
            break;
        } while (true);
        for (i = 0; i < Client.displayAlertDuration.length; ++i) {
            if (Client.displayAlertDuration[i] <= 0) continue;
            title = Client.alertTitle[i].isEmpty() != false ? "" : Client.alertTitle[i] + ": ";
            messages = Client.alertMessage[i].split("#n");
            lines = messages.length;
            longestMessage = 0;
            for (String msg : messages) {
                width = this.smallFont.getTextWidth(msg);
                if (width <= longestMessage) continue;
                longestMessage = width;
            }
            messageYOffset = 15;
            width = (longestMessage += padding) + padding;
            height = (lines + 1) * messageYOffset + padding;
            DrawingArea.drawRoundedRectangle(startX - 1, startY - 1, width, height, 0, 40, false, true);
            DrawingArea.drawRoundedRectangle(startX + 1, startY + 1, width, height, 0, 40, false, true);
            DrawingArea.drawRoundedRectangle(startX, startY, width, height, 0, 40, true, true);
            this.smallFont.drawCenteredText(16777215, startX + width / 2, title, startY + messageYOffset, true);
            DrawingArea.drawHorizontalLine(startX + padding, startY + messageYOffset + 2, width - padding * 2, 1052688, false);
            messageYOffset += 15;
            msg = messages;
            width = msg.length;
            for (var16_35 = 0; var16_35 < width; messageYOffset += 15, ++var16_35) {
                msg = msg[var16_35];
                this.smallFont.drawCenteredText(16777215, startX + width / 2, msg, startY + messageYOffset, false);
            }
        }
        if (this.counterOn) {
            this.drawCounterOnScreen(this.getMapIncreaseX(), this.getMapIncreaseY());
        }
        if (!this.menuOpen) {
            this.processRightClick();
            this.drawTooltip();
            return;
        }
        this.drawMenu(4, 4);
    }

    public void drawBlackBox(int xPos, int yPos) {
        DrawingArea.drawPixels(71, yPos - 1, xPos - 2, 7496785, 1);
        DrawingArea.drawPixels(69, yPos, xPos + 174, 7496785, 1);
        DrawingArea.drawPixels(1, yPos - 2, xPos - 2, 7496785, 178);
        DrawingArea.drawPixels(1, yPos + 68, xPos, 7496785, 174);
        DrawingArea.drawPixels(71, yPos - 1, xPos - 1, 3025699, 1);
        DrawingArea.drawPixels(71, yPos - 1, xPos + 175, 3025699, 1);
        DrawingArea.drawPixels(1, yPos - 1, xPos, 3025699, 175);
        DrawingArea.drawPixels(1, yPos + 69, xPos, 3025699, 175);
        DrawingArea.method335(0, yPos, 174, 68, 220, xPos);
    }

    public void drawChannelButtons(int drawX, int drawY) {
        String[] text = new String[]{"On", "Friends", "Off", "Hide"};
        int[] textColor = new int[]{65280, 16776960, 16711680, 65535};
        int xOffset = 1;
        int index = 0;
        while (index < CHANNEL_NAMES.length) {
            Sprite toDraw = index == this.channelButtonClickPosition ? (this.channelButtonClickPosition == this.channelButtonHoverPosition ? this.chatAreaSprites[5] : this.chatAreaSprites[4]) : (index == this.channelButtonHoverPosition ? this.chatAreaSprites[index == 7 ? 7 : 3] : this.chatAreaSprites[index == 7 ? 6 : 2]);
            toDraw.drawSprite(drawX + xOffset, drawY + 142);
            newSmallFont.drawCenteredString(CHANNEL_NAMES[index], drawX + xOffset + toDraw.myWidth / 2, drawY + 157 - (index > 1 && index < 7 ? 5 : 0), 16777215, 0);
            if (index == 2) {
                newSmallFont.drawCenteredString(text[this.publicChatMode], drawX + xOffset + toDraw.myWidth / 2, drawY + 163, textColor[this.publicChatMode], 0);
            } else if (index == 3) {
                newSmallFont.drawCenteredString(text[this.privateChatMode], drawX + xOffset + toDraw.myWidth / 2, drawY + 163, textColor[this.privateChatMode], 0);
            } else if (index == 4) {
                newSmallFont.drawCenteredString(text[this.tradeMode], drawX + xOffset + toDraw.myWidth / 2, drawY + 163, textColor[this.tradeMode], 0);
            } else if (index == 5) {
                newSmallFont.drawCenteredString(this.clanChatMode ? "On" : "Off", drawX + xOffset + toDraw.myWidth / 2, drawY + 163, this.clanChatMode ? 65280 : 16711680, 0);
            } else if (index == 6) {
                newSmallFont.drawCenteredString(this.yellChatMode ? "On" : "Off", drawX + xOffset + toDraw.myWidth / 2, drawY + 163, this.yellChatMode ? 65280 : 16711680, 0);
            }
            xOffset += toDraw.myWidth + 2;
            ++index;
        }
    }

    public void drawChatArea(GraphicsBuffer chatback, int paddingX, int paddingY) {
        int maximumScrollRange = 210;
        int minimumScrollRange = 0;
        chatback.initDrawingArea();
        Rasterizer.anIntArray1472 = this.anIntArray1180;
        if (!Client.isFixed() && transparentChat) {
            if (!this.messagePromptRaised && this.aString844 == null && this.backDialogID == -1 && this.dialogID == -1 && this.inputDialogState == 0) {
                DrawingArea.drawAlphaGradient(7 + paddingX, 7 + paddingY, 505, 130, 11908533, 0, 70);
            } else {
                this.chatAreaSprites[0].drawSprite1(paddingX, paddingY, 128);
            }
        } else {
            this.chatAreaSprites[0].drawSprite(paddingX, paddingY);
            this.chatAreaSprites[1].drawSprite(paddingX, paddingY + 143);
        }
        this.drawChannelButtons(paddingX, paddingY);
        RSFont textDrawingArea = newRegularFont;
        if (this.messagePromptRaised) {
            this.boldFont.drawText(0, this.aString1121, 60 + paddingY, 259);
            this.boldFont.drawText(128, this.promptInput + "*", 80 + paddingY, 259);
        } else if (this.inputDialogState == 1) {
            this.boldFont.drawText(0, "Enter amount:", 60 + paddingY, 259);
            this.boldFont.drawText(128, this.amountOrNameInput + "*", 80 + paddingY, 259);
        } else if (this.inputDialogState == 2) {
            this.boldFont.drawText(0, "Enter name:", 60 + paddingY, 259);
            this.boldFont.drawText(128, this.amountOrNameInput + "*", 80 + paddingY, 259);
        } else if (this.inputDialogState == 3) {
            this.boldFont.drawText(0, "Enter secret phrase:", 60 + paddingY, 259);
            this.boldFont.drawText(128, this.amountOrNameInput + "*", 80 + paddingY, 259);
        } else if (this.inputDialogState == 4) {
            this.boldFont.drawText(0, "Enter username:", 60 + paddingY, 259);
            this.boldFont.drawText(128, this.amountOrNameInput + "*", 80 + paddingY, 259);
        } else if (this.aString844 != null) {
            this.boldFont.drawText(0, this.aString844, 60 + paddingY, 259);
            this.boldFont.drawText(128, "Click to continue", 80 + paddingY, 259);
        } else if (this.backDialogID != -1) {
            this.drawInterface(0, 20, RSInterface.interfaceCache[this.backDialogID], 20 + paddingY);
        } else if (this.dialogID != -1) {
            this.drawInterface(0, 20, RSInterface.interfaceCache[this.dialogID], 20 + paddingY);
        } else {
            int totalLines = 0;
            DrawingArea.setDrawingArea(122 + paddingY, 8 + paddingX, 497 + paddingX, 7 + paddingY);
            for (ChatMessage message : this.chatMessages) {
                int xPos;
                if (message == null) continue;
                int chatType = message.getType().getType();
                int yPos = 70 - (totalLines - 3) * 14 + anInt1089 + 5;
                String nameDisplay = message.getTitle() + message.getName();
                if (chatType == 0 && (this.chatTypeView == 5 || this.chatTypeView == 0)) {
                    if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                        textDrawingArea.drawBasicString(message.getMessage(), 11, yPos + paddingY, !Client.isFixed() && transparentChat ? 16777215 : 0, -1);
                    }
                    ++totalLines;
                }
                if (!(chatType != 1 && chatType != 2 || chatType != 1 && this.publicChatMode != 0 && (this.publicChatMode != 1 || !this.isFriendOrSelf(message.getName())) || this.chatTypeView != 1 && this.chatTypeView != 0)) {
                    if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                        xPos = 11;
                        newRegularFont.drawBasicString(nameDisplay + ":", xPos, yPos + paddingY, 0, -1);
                        newRegularFont.drawBasicString(message.getMessage(), xPos += newRegularFont.getTextWidth(nameDisplay) + 8, yPos + paddingY, 255, -1);
                    }
                    ++totalLines;
                }
                if (!(chatType != 3 && chatType != 7 && chatType != 18 || this.splitPrivateChat != 0 && this.chatTypeView != 2 || chatType != 7 && this.privateChatMode != 0 && (this.privateChatMode != 1 || !this.isFriendOrSelf(message.getName())) || this.chatTypeView != 2 && this.chatTypeView != 0)) {
                    if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                        xPos = 11;
                        textDrawingArea.drawBasicString("From", xPos, yPos + paddingY, 0, -1);
                        textDrawingArea.drawBasicString(nameDisplay + ":", xPos += textDrawingArea.getTextWidth("From "), yPos + paddingY, 0, -1);
                        textDrawingArea.drawBasicString(message.getMessage(), xPos += textDrawingArea.getTextWidth(nameDisplay) + 8, yPos + paddingY, !Client.isFixed() && transparentChat ? 16732758 : 8388608, -1);
                    }
                    ++totalLines;
                }
                if (chatType == 4 && (this.tradeMode == 0 || this.tradeMode == 1 && this.isFriendOrSelf(message.getName())) && (this.chatTypeView == 3 || this.chatTypeView == 0)) {
                    if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                        textDrawingArea.drawBasicString(nameDisplay + " " + message.getMessage(), 11, yPos + paddingY, 8388736, -1);
                    }
                    ++totalLines;
                }
                if (message.getType() == ChatMessage.ChatType.GAMBLE && (this.chatTypeView == 3 || this.chatTypeView == 0)) {
                    if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                        textDrawingArea.drawBasicString(nameDisplay + " " + message.getMessage(), 11, yPos + paddingY, 8388736, -1);
                    }
                    ++totalLines;
                }
                if (chatType == 5 && this.splitPrivateChat == 0 && this.privateChatMode < 2 && (this.chatTypeView == 2 || this.chatTypeView == 0)) {
                    if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                        textDrawingArea.drawBasicString(message.getMessage(), 11, yPos + paddingY, !Client.isFixed() && transparentChat ? 16732758 : 8388608, -1);
                    }
                    ++totalLines;
                }
                if (!(chatType != 6 || this.splitPrivateChat != 0 && this.chatTypeView != 2 || this.privateChatMode >= 2 || this.chatTypeView != 2 && this.chatTypeView != 0)) {
                    if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                        textDrawingArea.drawBasicString("To " + nameDisplay + ":", 11, yPos + paddingY, 0, -1);
                        textDrawingArea.drawBasicString(message.getMessage(), 15 + textDrawingArea.getTextWidth("To :" + nameDisplay), yPos + paddingY, !Client.isFixed() && transparentChat ? 16732758 : 8388608, -1);
                    }
                    ++totalLines;
                }
                if (chatType == 8 && (this.tradeMode == 0 || this.tradeMode == 1 && this.isFriendOrSelf(message.getName()))) {
                    if (this.chatTypeView == 3 || this.chatTypeView == 0) {
                        if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                            textDrawingArea.drawBasicString(nameDisplay + " " + message.getMessage(), 11, yPos + paddingY, 8270336, -1);
                        }
                        ++totalLines;
                    }
                    if (chatType == 11 && this.clanChatMode) {
                        if (this.chatTypeView == 11) {
                            if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                                textDrawingArea.drawBasicString(nameDisplay + " " + message.getMessage(), 11, yPos + paddingY, 8270336, -1);
                            }
                            ++totalLines;
                        }
                        if (chatType == 12 && yPos > minimumScrollRange && yPos < maximumScrollRange) {
                            textDrawingArea.drawBasicString(message.getMessage() + " @blu@" + nameDisplay, 11, yPos + paddingY, 8270336, -1);
                        }
                        ++totalLines;
                    }
                }
                if (message.getType() == ChatMessage.ChatType.URL) {
                    if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                        textDrawingArea.drawBasicString(message.getMessage(), 11, yPos + paddingY, !Client.isFixed() && transparentChat ? 8366590 : 3230034, -1);
                    }
                    ++totalLines;
                    continue;
                }
                if (message.getType() == ChatMessage.ChatType.CLAN) {
                    if (this.chatTypeView != 0 && this.chatTypeView != 11 || !this.clanChatMode) continue;
                    if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                        String toDisplay = "<col=255>[" + message.getTitle() + "]</col><col=<col=BA2B1C>[" + message.getName() + "]</col>: " + message.getMessage();
                        textDrawingArea.drawBasicString(toDisplay, 11, yPos + paddingY, !Client.isFixed() && transparentChat ? 16777215 : 0, -1);
                    }
                    ++totalLines;
                    continue;
                }
                if (message.getType() != ChatMessage.ChatType.YELL || this.chatTypeView != 0 && this.chatTypeView != 12 || !this.yellChatMode) continue;
                if (yPos > minimumScrollRange && yPos < maximumScrollRange) {
                    String toDisplay = message.getTitle() + " " + message.getName() + ": " + message.getMessage();
                    textDrawingArea.drawBasicString(toDisplay, 11, yPos + paddingY, !Client.isFixed() && transparentChat ? 16777215 : 0, -1);
                }
                ++totalLines;
            }
            DrawingArea.defaultDrawingAreaSize();
            chatScrollTotalLength = totalLines * 14 + 7 + 5;
            if (chatScrollTotalLength < 111) {
                chatScrollTotalLength = 111;
            }
            this.drawScrollbar(113, chatScrollTotalLength - anInt1089 - 113, 7 + paddingY, 497, chatScrollTotalLength, !Client.isFixed() && transparentChat);
            String name = "";
            if (myPlayer == null || Client.myPlayer.name == null) {
                name = TextClass.fixName(this.myUsername);
            } else {
                name = name + "<col=" + myPlayer.titleColor() + ">" + myPlayer.getRank() + "</col>";
                name = name + this.getCrownsForRights(this.myPrivilege) + " ";
                name = name + Client.myPlayer.name;
            }
            if (enterToChat && firstPersonMode) {
                textDrawingArea.drawBasicString(name + ":<col=FFFFFF> [Press Enter to Chat]</col><col=7FA9FF>" + this.inputString + "</col>", 11, 133 + paddingY, !Client.isFixed() && transparentChat ? 16777215 : 0, -1);
            } else {
                textDrawingArea.drawBasicString(name + ":", 11, 134 + paddingY, !Client.isFixed() && transparentChat ? 16777215 : 0, -1);
                textDrawingArea.drawBasicString(this.inputString + (loopCycle % 40 < 20 ? "|" : ""), 11 + textDrawingArea.getTextWidth(name + ":"), 134 + paddingY, !Client.isFixed() && transparentChat ? 8366591 : 255, -1);
            }
            DrawingArea.method339(121 + paddingY, !Client.isFixed() && transparentChat ? 16777215 : 8418912, 506, 7);
        }
        if (this.menuOpen && Client.isFixed()) {
            this.drawMenu(0, 338);
        }
        if (Client.isFixed()) {
            this.drawTooltipHover(this.mouseX + 4, this.mouseY + 4 - 338);
        }
        this.main3DArea.initDrawingArea();
        Rasterizer.anIntArray1472 = this.anIntArray1182;
    }

    public void drawCoinOrb() {
        if (!this.coinToggle) {
            this.coinOrb = this.mouseX >= 512 && this.mouseX <= 546 && this.mouseY >= 87 && this.mouseY <= 118 ? this.coinSimpleHover : this.coinSimpleNormal;
        } else if (this.coinToggle) {
            if (this.mouseX >= 436 && this.mouseX <= 546 && this.mouseY >= 87 && this.mouseY <= 118) {
                this.coinOrb = this.coinSimpleHoverToggle;
                this.coinPart = this.coinComplexHoverToggle;
            } else {
                this.coinOrb = this.coinSimpleNormalToggle;
                this.coinPart = this.coinComplexNormalToggle;
            }
        }
        if (this.coinOrb != null) {
            this.coinOrb.drawSprite(Client.isFixed() ? -4 : clientWidth - 85, Client.isFixed() ? 84 : 170);
        }
        if (this.mouseX < 436) return;
        if (this.mouseX > 546) return;
        if (this.mouseY < 87) return;
        if (this.mouseY > 118) return;
        this.coinPart = this.coinComplexHoverToggle;
        this.coinOrb = this.coinSimpleHover;
    }

    public void drawCoinParts() {
        if (!this.coinToggle) {
            this.coinOrbPart = this.mouseX >= 512 && this.mouseX <= 546 && this.mouseY >= 87 && this.mouseY <= 118 ? this.coinpartHover : this.coinpartNormal;
        }
        if (this.coinOrb == null) return;
        this.coinOrb.drawSprite(Client.isFixed() ? -4 : clientWidth - 80, Client.isFixed() ? 80 : 165);
    }

    public static int getPrefix(boolean flag) {
        if (!flag) return 15547966;
        return 6613048;
    }

    public void drawCounterOnScreen(int paddingX, int paddingY) {
        int x = this.xPaddingmapBackImage + (!Client.isFixed() ? paddingX - 22 : paddingX);
        int y = 46 + (!Client.isFixed() ? paddingY - 39 : paddingY);
        this.XPcounterSprite[2].drawSprite(x - 110, y + 8);
        int i = this.normalFont.getTextWidth(Integer.toString((int)this.xpCounter));
        this.normalFont.drawText(16777215, "XP:", y + 21, x - 99);
        this.normalFont.method385(16777215, Integer.toString((int)this.xpCounter), y + 21, x - 15 - i);
        if (this.expAdded == 0) return;
        i = this.smallFont.getTextWidth(Integer.toString((int)this.expAdded) + "xp");
        this.smallFont.drawText(16750899, Integer.toString((int)this.expAdded) + "xp", y + 21 + 18 + this.xpAddedPos, x - 12 - i);
        this.XPcounterSprite[3].drawSprite(x - 12 - i - 50, y + 18 + this.xpAddedPos);
        this.xpAddedPos += 2;
        if (this.xpAddedPos < 50) return;
        this.xpAddedPos = 0;
        this.expAdded = 0;
    }

    public void drawFlames() {
    }

    public void drawFriendsListOrWelcomeScreen(RSInterface class9) {
        int j = class9.contentType;
        if (j >= 1 && j <= 100 || j >= 701 && j <= 800) {
            if (j == 1 && this.anInt900 == 0) {
                class9.message = "Loading friend list";
                class9.atActionType = 0;
                return;
            }
            if (j == 1 && this.anInt900 == 1) {
                class9.message = "Connecting to friendserver";
                class9.atActionType = 0;
                return;
            }
            if (j == 2 && this.anInt900 != 2) {
                class9.message = "Please wait...";
                class9.atActionType = 0;
                return;
            }
            int k = this.friendsCount;
            if (this.anInt900 != 2) {
                k = 0;
            }
            j = j > 700 ? (j -= 601) : --j;
            if (j >= k) {
                class9.message = "";
                class9.atActionType = 0;
                return;
            }
            class9.message = this.friendsList[j];
            class9.atActionType = 1;
            return;
        }
        if (j >= 101 && j <= 200 || j >= 801 && j <= 900) {
            int l = this.friendsCount;
            if (this.anInt900 != 2) {
                l = 0;
            }
            j = j > 800 ? (j -= 701) : (j -= 101);
            if (j >= l) {
                class9.message = "";
                class9.atActionType = 0;
                return;
            }
            class9.message = this.friendsNodeIDs[j] == 0 ? "@red@Offline" : (this.friendsNodeIDs[j] == nodeID ? "@gre@Online" : "@red@Offline");
            class9.atActionType = 1;
            return;
        }
        if (j == 203) {
            int i1 = this.friendsCount;
            if (this.anInt900 != 2) {
                i1 = 0;
            }
            class9.scrollMax = i1 * 15 + 20;
            if (class9.scrollMax > class9.height) return;
            class9.scrollMax = class9.height + 1;
            return;
        }
        if (j >= 401 && j <= 500) {
            if ((j -= 401) == 0 && this.anInt900 == 0) {
                class9.message = "Loading ignore list";
                class9.atActionType = 0;
                return;
            }
            if (j == 1 && this.anInt900 == 0) {
                class9.message = "Please wait...";
                class9.atActionType = 0;
                return;
            }
            int j1 = this.ignoreCount;
            if (this.anInt900 == 0) {
                j1 = 0;
            }
            if (j >= j1) {
                class9.message = "";
                class9.atActionType = 0;
                return;
            }
            class9.message = TextClass.fixName(TextClass.nameForLong(this.ignoreListAsLongs[j]));
            class9.atActionType = 1;
            return;
        }
        if (j == 503) {
            class9.scrollMax = this.ignoreCount * 15 + 20;
            if (class9.scrollMax > class9.height) return;
            class9.scrollMax = class9.height + 1;
            return;
        }
        if (j == 327) {
            class9.modelRotation1 = 150;
            class9.modelRotation2 = (int)(Math.sin((double)((double)loopCycle / 40.0)) * 256.0) & 2047;
            if (!this.aBoolean1031) return;
        } else {
            if (j == 328) {
                RSInterface rsInterface = class9;
                int verticleTilt = 150;
                int animationSpeed = (int)(Math.sin((double)((double)loopCycle / 40.0)) * 256.0) & 2047;
                rsInterface.modelRotation1 = verticleTilt;
                rsInterface.modelRotation2 = animationSpeed;
                if (!this.aBoolean1031) return;
                Model characterDisplay = myPlayer.method452();
                int l2 = 0;
                do {
                    if (l2 >= 5) {
                        int staticFrame = Client.myPlayer.standAnim;
                        characterDisplay.method469();
                        characterDisplay.method470(AnimationDefinition.getAnim((int)staticFrame).frame[0]);
                        rsInterface.anInt233 = 5;
                        rsInterface.mediaID = 0;
                        RSInterface.method208(this.aBoolean994, characterDisplay);
                        return;
                    }
                    if (this.anIntArray990[l2] != 0) {
                        characterDisplay.reColor(equipmentColors[l2][0], equipmentColors[l2][this.anIntArray990[l2]]);
                        if (l2 == 1) {
                            characterDisplay.reColor(anIntArray1204[0], anIntArray1204[this.anIntArray990[l2]]);
                        }
                    }
                    ++l2;
                } while (true);
            }
            if (j == 324) {
                if (this.aClass30_Sub2_Sub1_Sub1_931 == null) {
                    this.aClass30_Sub2_Sub1_Sub1_931 = class9.sprite1;
                    this.aClass30_Sub2_Sub1_Sub1_932 = class9.sprite2;
                }
                if (this.aBoolean1047) {
                    class9.sprite1 = this.aClass30_Sub2_Sub1_Sub1_932;
                    return;
                }
                class9.sprite1 = this.aClass30_Sub2_Sub1_Sub1_931;
                return;
            }
            if (j == 325) {
                if (this.aClass30_Sub2_Sub1_Sub1_931 == null) {
                    this.aClass30_Sub2_Sub1_Sub1_931 = class9.sprite1;
                    this.aClass30_Sub2_Sub1_Sub1_932 = class9.sprite2;
                }
                if (this.aBoolean1047) {
                    class9.sprite1 = this.aClass30_Sub2_Sub1_Sub1_931;
                    return;
                }
                class9.sprite1 = this.aClass30_Sub2_Sub1_Sub1_932;
                return;
            }
            if (j == 600) {
                class9.message = this.reportAbuseInput;
                if (loopCycle % 20 < 10) {
                    class9.message = class9.message + "|";
                    return;
                }
                class9.message = class9.message + " ";
                return;
            }
            if (j > 600 && j < 621) {
                int id = j - 601;
                String[] mod_options = new String[]{"Moderator Options:", "Mute user", "Un-Mute user", "Jail user", "Un-Jail user", "Ban user", "Un-Ban user"};
                String[] admin_options = new String[]{"Admin Options:", "Mute users IP", "Un-Mute users IP", "Ban users IP", "Un-Ban users IP"};
                if (id < mod_options.length) {
                    class9.message = id == 0 ? mod_options[id] : "" + id + ": " + mod_options[id];
                } else if (id < mod_options.length + admin_options.length && this.myPrivilege[0] > 5) {
                    class9.message = id - mod_options.length == 0 ? admin_options[id - mod_options.length] : "" + (id - mod_options.length) + ": " + admin_options[id - mod_options.length];
                }
            }
            if (j == 650 || j == 655) {
                if (this.anInt1193 != 0) {
                    String s = this.daysSinceLastLogin == 0 ? "earlier today" : (this.daysSinceLastLogin == 1 ? "yesterday" : "" + this.daysSinceLastLogin + " days ago");
                    class9.message = "You last logged in " + s + " from: " + Signlink.dns;
                } else {
                    class9.message = "";
                }
            }
            if (j == 651) {
                if (this.unreadMessages == 0) {
                    class9.message = "0 unread messages";
                    class9.textColor = 16776960;
                }
                if (this.unreadMessages == 1) {
                    class9.message = "1 unread message";
                    class9.textColor = 65280;
                }
                if (this.unreadMessages > 1) {
                    class9.message = "" + this.unreadMessages + " unread messages";
                    class9.textColor = 65280;
                }
            }
            if (j == 652) {
                if (this.daysSinceRecovChange == 201) {
                    class9.message = this.membersInt == 1 ? "@yel@This is a non-members world: @whi@Since you are a member we" : "";
                } else if (this.daysSinceRecovChange == 200) {
                    class9.message = "You have not yet set any password recovery questions.";
                } else {
                    String s1 = this.daysSinceRecovChange == 0 ? "Earlier today" : (this.daysSinceRecovChange == 1 ? "Yesterday" : "" + this.daysSinceRecovChange + " days ago");
                    class9.message = s1 + " you changed your recovery questions";
                }
            }
            if (j == 653) {
                class9.message = this.daysSinceRecovChange == 201 ? (this.membersInt == 1 ? "@whi@recommend you use a members world instead. You may use" : "") : (this.daysSinceRecovChange == 200 ? "We strongly recommend you do so now to secure your account." : "If you do not remember making this change then cancel it immediately");
            }
            if (j == 654) {
                if (this.daysSinceRecovChange == 201) {
                    if (this.membersInt == 1) {
                        class9.message = "@whi@this world but member benefits are unavailable whilst here.";
                        return;
                    }
                    class9.message = "";
                    return;
                }
                if (this.daysSinceRecovChange == 200) {
                    class9.message = "Do this from the 'account management' area on our front webpage";
                    return;
                }
                class9.message = "Do this from the 'account management' area on our front webpage";
            }
            if (j != 3000) return;
            if (class9.contentId == -1) {
                return;
            }
            NPCDefinition npc = NPCDefinition.forID(class9.contentId);
            if (npc == null) {
                return;
            }
            int verticleTilt = 150;
            int animationSpeed = (int)(Math.sin((double)((double)loopCycle / 40.0)) * 256.0) & 2047;
            class9.modelRotation1 = verticleTilt;
            class9.modelRotation2 = animationSpeed;
            Model[] parts = new Model[npc.models.length];
            for (int i = 0; i < npc.models.length; ++i) {
                parts[i] = Model.fetchModel(npc.models[i], npc.revisionType);
            }
            Model model = parts.length == 1 ? parts[0] : new Model(parts.length, parts);
            if (model == null) {
                return;
            }
            model.method469();
            model.method470(AnimationDefinition.anims[npc.standAnim].frame[class9.animationLength]);
            class9.anInt233 = 5;
            class9.mediaID = 0;
            RSInterface.method208(this.aBoolean994, model);
            return;
        }
        for (int k1 = 0; k1 < 7; ++k1) {
            int l1 = this.anIntArray1065[k1];
            if (l1 < 0 || IDK.cache[l1].method537()) continue;
            return;
        }
        this.aBoolean1031 = false;
        Model[] aclass30_sub2_sub4_sub6s = new Model[7];
        int i2 = 0;
        for (int j2 = 0; j2 < 7; ++j2) {
            int k2 = this.anIntArray1065[j2];
            if (k2 < 0) continue;
            aclass30_sub2_sub4_sub6s[i2++] = IDK.cache[k2].method538();
        }
        Model model = new Model(i2, aclass30_sub2_sub4_sub6s);
        int l2 = 0;
        do {
            if (l2 >= 5) {
                model.method469();
                model.method470(AnimationDefinition.getAnim((int)Client.myPlayer.standAnim).frame[0]);
                model.light(64, 850, -30, -50, -30, true);
                class9.anInt233 = 5;
                class9.mediaID = 0;
                RSInterface.method208(this.aBoolean994, model);
                return;
            }
            if (this.anIntArray990[l2] != 0) {
                model.reColor(equipmentColors[l2][0], equipmentColors[l2][this.anIntArray990[l2]]);
                if (l2 == 1) {
                    model.reColor(anIntArray1204[0], anIntArray1204[this.anIntArray990[l2]]);
                }
            }
            ++l2;
        } while (true);
    }

    public void drawGameFrameOnFullScreen() {
        if (Client.isFixed()) return;
        if (this.resizing) return;
        this.drawChatArea(this.main3DArea, this.xPaddingchatBackImage, this.yPaddingchatBackImage + this.getChatBackIncreaseY());
        this.drawMinimap(this.main3DArea, this.xPaddingmapBackImage + this.getMapIncreaseX(), this.yPaddingmapBackImage + this.getMapIncreaseY());
        this.drawTabArea(this.main3DArea, this.xPaddingtabBack + this.getTabIncreaseX(), this.yPaddingtabBack + this.getTabIncreaseY());
        if (!this.menuOpen) {
            this.processRightClick();
            this.drawTooltipHover(this.mouseX, this.mouseY);
            return;
        }
        this.drawMenu(4, 4);
    }

    public void drawGameScreen() {
        boolean flag2;
        boolean flag1;
        if (this.fullscreenInterfaceID != -1 && (loadingStage == 2 || this.fullGameScreen != null)) {
            if (loadingStage == 2) {
                this.method119(this.anInt945, this.fullscreenInterfaceID);
                if (openInterfaceID != -1) {
                    this.method119(this.anInt945, openInterfaceID);
                }
                this.anInt945 = 0;
                this.resetAllImageProducers();
                this.fullGameScreen.initDrawingArea();
                Rasterizer.anIntArray1472 = this.fullScreenTextureArray;
                DrawingArea.setAllPixelsToZero();
                this.welcomeScreenRaised = true;
                if (openInterfaceID != -1) {
                    RSInterface rsInterface_1 = RSInterface.interfaceCache[openInterfaceID];
                    if (rsInterface_1.width == 512 && rsInterface_1.height == 334 && rsInterface_1.type == 0) {
                        rsInterface_1.width = 765;
                        rsInterface_1.height = 503;
                    }
                    this.drawInterface(0, 0, rsInterface_1, 8);
                }
                RSInterface rsInterface = RSInterface.interfaceCache[this.fullscreenInterfaceID];
                if (rsInterface.width == 512 && rsInterface.height == 334 && rsInterface.type == 0) {
                    rsInterface.width = 765;
                    rsInterface.height = 503;
                }
                this.drawInterface(0, 0, rsInterface, 8);
                if (!this.menuOpen) {
                    this.processRightClick();
                    this.drawTooltip();
                } else {
                    this.drawMenu(4, 4);
                }
            }
            ++this.drawCount;
            if (this.resizing) return;
            this.fullGameScreen.drawGraphics(0, this.graphics, 0);
            return;
        }
        if (this.drawCount != 0) {
            this.resetImageProducers2();
        }
        if (this.welcomeScreenRaised) {
            this.welcomeScreenRaised = false;
            if (Client.isFixed() && !this.resizing) {
                this.topFrame.drawGraphics(0, this.graphics, 0);
                this.leftFrame.drawGraphics(4, this.graphics, 0);
            }
            needDrawTabArea = true;
            inputTaken = true;
            tabAreaAltered = true;
            if (loadingStage != 2 && !this.resizing) {
                this.main3DArea.drawGraphics(!Client.isFixed() ? 0 : 4, this.graphics, !Client.isFixed() ? 0 : 4);
                this.mapBackImage.drawGraphics(this.mapDrawAreaX, this.graphics, this.mapDrawAreaY);
            }
        }
        if (this.menuOpen) {
            this.drawMenu(4, 4);
        }
        if (this.menuOpen && this.menuScreenArea == 1) {
            needDrawTabArea = true;
        }
        if (this.invOverlayInterfaceID != -1 && (flag1 = this.method119(this.anInt945, this.invOverlayInterfaceID))) {
            needDrawTabArea = true;
        }
        if (this.atInventoryInterfaceType == 2) {
            needDrawTabArea = true;
        }
        if (this.activeInterfaceType == 2) {
            needDrawTabArea = true;
        }
        if (Client.isFixed() && !this.resizing) {
            this.drawRightFrameArea();
            this.drawTabArea(this.sideTabArea, 0, 0);
            this.sideTabArea.drawGraphics(this.yPaddingtabBack, this.graphics, this.xPaddingtabBack);
            this.main3DArea.initDrawingArea();
        }
        if (this.backDialogID == -1) {
            int i;
            this.aClass9_1059.scrollPosition = chatScrollTotalLength - anInt1089 - 110;
            if (this.mouseX > 497 && this.mouseX < 512 && this.mouseY > 342 + this.getChatBackIncreaseY()) {
                this.method65(494, 110, this.mouseX - 0, this.mouseY - 348 - this.getChatBackIncreaseY(), this.aClass9_1059, 0, false, chatScrollTotalLength);
            }
            if ((i = chatScrollTotalLength - 110 - this.aClass9_1059.scrollPosition) < 0) {
                i = 0;
            }
            if (i > chatScrollTotalLength - 110) {
                i = chatScrollTotalLength - 110;
            }
            if (anInt1089 != i) {
                anInt1089 = i;
                inputTaken = true;
            }
        }
        if (this.backDialogID != -1 && (flag2 = this.method119(this.anInt945, this.backDialogID))) {
            inputTaken = true;
        }
        if (this.atInventoryInterfaceType == 3) {
            inputTaken = true;
        }
        if (this.activeInterfaceType == 3) {
            inputTaken = true;
        }
        if (this.aString844 != null) {
            inputTaken = true;
        }
        if (this.menuOpen && this.menuScreenArea == 2) {
            inputTaken = true;
        }
        if (inputTaken) {
            if (Client.isFixed() && !this.resizing) {
                this.drawChatArea(!Client.isFixed() ? this.main3DArea : this.chatBackImage, 0, 0);
                this.chatBackImage.drawGraphics(this.yPaddingchatBackImage, this.graphics, this.xPaddingchatBackImage);
                this.main3DArea.initDrawingArea();
            }
            inputTaken = false;
        }
        if (loadingStage == 2) {
            this.method146();
        }
        if (loadingStage == 2 && Client.isFixed()) {
            this.drawMinimap(this.mapBackImage, 0, 0);
            this.mapBackImage.drawGraphics(this.yPaddingmapBackImage + this.getMapIncreaseY(), this.graphics, this.xPaddingmapBackImage + this.getMapIncreaseX());
        }
        if (this.tabIconFlash != -1) {
            tabAreaAltered = true;
        }
        if (tabAreaAltered) {
            if (this.tabIconFlash != -1 && this.tabIconFlash == tabID) {
                this.tabIconFlash = -1;
                this.stream.createFrame(120);
                this.stream.writeWordBigEndian(tabID);
            }
            tabAreaAltered = false;
            this.aGraphicsBuffer_1125.initDrawingArea();
            this.main3DArea.initDrawingArea();
        }
        this.anInt945 = 0;
    }

    public void drawHeadIcon() {
        if (this.hintType != 2) {
            return;
        }
        this.calcEntityScreenPos((this.hintArrowX - baseX << 7) + this.anInt937, this.anInt936 * 2, (this.hintArrowY - baseY << 7) + this.anInt938);
        if (this.spriteDrawX <= -1) return;
        if (loopCycle % 20 >= 10) return;
        this.headIconsHint[0].drawSprite(this.spriteDrawX - 12, this.spriteDrawY - 28);
    }

    public void drawHoverBox(int xPos, int yPos, String text) {
        int i;
        String[] results = text.split("\n");
        int height = results.length * 16 + 6;
        int width = this.smallFont.getTextWidth(results[0]) + 6;
        for (i = 1; i < results.length; ++i) {
            if (width > this.smallFont.getTextWidth(results[i]) + 6) continue;
            width = this.smallFont.getTextWidth(results[i]) + 6;
        }
        DrawingArea.drawPixels(height, yPos, xPos, 16777120, width);
        DrawingArea.fillPixels(xPos, width, height, 0, yPos);
        yPos += 14;
        i = 0;
        while (i < results.length) {
            this.smallFont.method389(false, xPos + 3, 0, results[i], yPos);
            yPos += 16;
            ++i;
        }
    }

    /*
     * Exception decompiling
     */
    public void drawInterface(int yScrollPoint, int xPadding, RSInterface rsInterface, int yPadding) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[UNCONDITIONALDOLOOP]], but top level block is 14[FORLOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:809)
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

    public void drawIventoryStones(int paddingX, int paddingY) {
        boolean displayNewTabs = !Client.isFixed() && newTabs;
        paddingX += 2;
        if (displayNewTabs) {
            this.inventoryStones[2].drawSprite(1 + paddingX, 261 + paddingY);
            this.inventoryStones[2].drawSprite(31 + paddingX, 261 + paddingY);
            this.inventoryStones[2].drawSprite(61 + paddingX, 261 + paddingY);
            this.inventoryStones[2].drawSprite(91 + paddingX, 261 + paddingY);
            this.inventoryStones[2].drawSprite(121 + paddingX, 261 + paddingY);
            this.inventoryStones[2].drawSprite(151 + paddingX, 261 + paddingY);
            this.inventoryStones[2].drawSprite(181 + paddingX, 261 + paddingY);
            this.inventoryStones[2].drawSprite(211 + paddingX, 261 + paddingY);
            this.inventoryStones[2].drawSprite(1 + paddingX, 298 + paddingY);
            this.inventoryStones[2].drawSprite(31 + paddingX, 298 + paddingY);
            this.inventoryStones[2].drawSprite(61 + paddingX, 298 + paddingY);
            this.inventoryStones[2].drawSprite(91 + paddingX, 298 + paddingY);
            this.inventoryStones[2].drawSprite(121 + paddingX, 298 + paddingY);
            this.inventoryStones[2].drawSprite(151 + paddingX, 298 + paddingY);
            this.inventoryStones[2].drawSprite(181 + paddingX, 298 + paddingY);
            this.inventoryStones[2].drawSprite(211 + paddingX, 298 + paddingY);
        }
        if (tabInterfaceIDs[0] != -1) {
            this.inventoryStones[this.tabIDHover == 0 ? 1 : 2].drawSprite(1 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
        }
        if (tabInterfaceIDs[14] != -1) {
            this.inventoryStones[this.tabIDHover == 1 ? 1 : 2].drawSprite(31 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
        }
        if (tabInterfaceIDs[1] != -1) {
            this.inventoryStones[this.tabIDHover == 2 ? 1 : 2].drawSprite(61 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
        }
        if (tabInterfaceIDs[2] != -1) {
            this.inventoryStones[this.tabIDHover == 3 ? 1 : 2].drawSprite(91 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
        }
        if (tabInterfaceIDs[3] != -1) {
            this.inventoryStones[this.tabIDHover == 4 ? 1 : 2].drawSprite(121 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
        }
        if (tabInterfaceIDs[4] != -1) {
            this.inventoryStones[this.tabIDHover == 5 ? 1 : 2].drawSprite(151 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
        }
        if (tabInterfaceIDs[5] != -1) {
            this.inventoryStones[this.tabIDHover == 6 ? 1 : 2].drawSprite(181 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
        }
        if (tabInterfaceIDs[6] != -1) {
            this.inventoryStones[this.tabIDHover == 7 ? 1 : 2].drawSprite(211 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
        }
        if (tabInterfaceIDs[16] != -1) {
            this.inventoryStones[this.tabIDHover == 14 ? 1 : 2].drawSprite(1 + paddingX, 298 + paddingY);
        }
        if (tabInterfaceIDs[9] != -1) {
            this.inventoryStones[this.tabIDHover == 8 ? 1 : 2].drawSprite(31 + paddingX, 298 + paddingY);
        }
        if (tabInterfaceIDs[8] != -1) {
            this.inventoryStones[this.tabIDHover == 9 ? 1 : 2].drawSprite(61 + paddingX, 298 + paddingY);
        }
        if (tabInterfaceIDs[7] != -1) {
            this.inventoryStones[this.tabIDHover == 10 ? 1 : 2].drawSprite(91 + paddingX, 298 + paddingY);
        }
        if (tabInterfaceIDs[11] != -1) {
            this.inventoryStones[this.tabIDHover == 11 ? 1 : 2].drawSprite(121 + paddingX, 298 + paddingY);
        }
        if (tabInterfaceIDs[12] != -1) {
            this.inventoryStones[this.tabIDHover == 12 ? 1 : 2].drawSprite(151 + paddingX, 298 + paddingY);
        }
        if (tabInterfaceIDs[13] != -1) {
            this.inventoryStones[this.tabIDHover == 13 ? 1 : 2].drawSprite(181 + paddingX, 298 + paddingY);
        }
        if (tabInterfaceIDs[15] != -1) {
            this.inventoryStones[this.tabIDHover == 15 ? 1 : 2].drawSprite(211 + paddingX, 298 + paddingY);
        }
        if (this.invOverlayInterfaceID != -1) return;
        if (focusTab == -1) return;
        try {
            if (tabInterfaceIDs[tabID] == -1) return;
            if (tabID == 0) {
                this.inventoryStones[0].drawSprite(1 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
            }
            if (tabID == 14) {
                this.inventoryStones[0].drawSprite(31 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
            }
            if (tabID == 1) {
                this.inventoryStones[0].drawSprite(61 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
            }
            if (tabID == 2) {
                this.inventoryStones[0].drawSprite(91 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
            }
            if (tabID == 3) {
                this.inventoryStones[0].drawSprite(121 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
            }
            if (tabID == 4) {
                this.inventoryStones[0].drawSprite(151 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
            }
            if (tabID == 5) {
                this.inventoryStones[0].drawSprite(181 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
            }
            if (tabID == 6) {
                this.inventoryStones[0].drawSprite(211 + paddingX, (displayNewTabs ? 261 : 0) + paddingY);
            }
            if (tabID == 16) {
                this.inventoryStones[0].drawSprite(1 + paddingX, 298 + paddingY);
            }
            if (tabID == 8) {
                this.inventoryStones[0].drawSprite(31 + paddingX, 298 + paddingY);
            }
            if (tabID == 9) {
                this.inventoryStones[0].drawSprite(61 + paddingX, 298 + paddingY);
            }
            if (tabID == 7) {
                this.inventoryStones[0].drawSprite(91 + paddingX, 298 + paddingY);
            }
            if (tabID == 11) {
                this.inventoryStones[0].drawSprite(121 + paddingX, 298 + paddingY);
            }
            if (tabID == 12) {
                this.inventoryStones[0].drawSprite(151 + paddingX, 298 + paddingY);
            }
            if (tabID == 13) {
                this.inventoryStones[0].drawSprite(181 + paddingX, 298 + paddingY);
            }
            if (tabID != 15) return;
            this.inventoryStones[0].drawSprite(211 + paddingX, 298 + paddingY);
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
            tabID = 1;
        }
    }

    public final void drawLoadingAnimation(int x, int y, boolean center) {
        int centerX = 382;
        int centerY = 251;
        DrawingArea.drawGradualAlphaHorizontalLine(382, 251, 282, 14540253, 150, DrawingArea.Direction.RIGHT);
        DrawingArea.drawGradualAlphaHorizontalLine(382, 251, 282, 14540253, 150, DrawingArea.Direction.LEFT);
        DrawingArea.drawGradualAlphaHorizontalLine(382, 311, 282, 14540253, 150, DrawingArea.Direction.RIGHT);
        DrawingArea.drawGradualAlphaHorizontalLine(382, 311, 282, 14540253, 150, DrawingArea.Direction.LEFT);
        DrawingArea.drawGradualAlphaHorizontalBox(382, 253, (int)(2.0 * this.loadingPercent), 57, 14540253, 150, DrawingArea.Direction.RIGHT);
        DrawingArea.drawGradualAlphaHorizontalBox(382, 253, (int)(2.0 * this.loadingPercent), 57, 14540253, 150, DrawingArea.Direction.LEFT);
        if (this.newBoldFont == null) return;
        this.newBoldFont.drawCenteredString(this.loadingText, 382, 289, 16777215, 0);
    }

    public void drawLoginScreen() {
        this.resetImageProducers();
        loginScreenGraphicsBuffer.initDrawingArea();
        if (this.clientLoaded) {
            boolean startX = false;
            boolean startY = false;
            int centerX = 0 + this.getScreenWidth() / 2;
            int centerY = 0 + this.getScreenHeight() / 2;
            int width = Client.cacheSprite[0].myWidth / 2;
            int height = Client.cacheSprite[0].myHeight / 2;
            cacheSprite[0].drawAdvancedSprite(centerX / 2 - width, centerY / 2 - height);
            cacheSprite[1].drawAdvancedSprite(centerX / 2 + width, centerY / 2 - height);
            cacheSprite[2].drawAdvancedSprite(centerX / 2 - width, centerY / 2 + height);
            cacheSprite[3].drawAdvancedSprite(centerX / 2 + width, centerY / 2 + height);
            Client.drawSnow();
            cacheSprite[8].drawAdvancedSpriteCentered(centerX, centerY);
            cacheSprite[9].drawAdvancedSpriteCentered(centerX, centerY - 150);
            String[] loginMessages = this.loginMessage.split("\n");
            int drawY = 183;
            if (loginMessages == null || loginMessages.length == 0) {
                this.newBoldFont.drawCenteredString(this.loginMessage, 382, drawY, 16777215, 0);
            } else {
                drawY -= loginMessages.length * this.newBoldFont.baseCharacterHeight / 2;
                String[] arrstring = loginMessages;
                int n = arrstring.length;
                for (int i = 0; i < n; drawY += this.newBoldFont.baseCharacterHeight, ++i) {
                    String s = arrstring[i];
                    this.newBoldFont.drawCenteredString(s, 382, drawY, 16777215, 0);
                }
            }
            Rasterizer.method365(this.getScreenWidth(), this.getScreenHeight());
            this.fullScreenTextureArray = Rasterizer.anIntArray1472;
            this.worldSelector.draw(this, new Point(this.getScreenWidth() - 10, 10), this.mouseX, this.mouseY);
        }
        if (this.loginScreenPopUp != null) {
            this.loginScreenPopUp.draw(this);
        }
        String[] toDisplay = new String[]{"MouseX: " + this.mouseX, "MouseY: " + this.mouseY, "FPS: " + RSApplet.fps};
        int index = 0;
        do {
            if (index >= toDisplay.length) {
                loginScreenGraphicsBuffer.drawGraphics(0, this.graphics, 0);
                return;
            }
            newRegularFont.drawBasicString(toDisplay[index], 10, 20 + 15 * index, 16773632, 0);
            ++index;
        } while (true);
    }

    public void drawMapArrows(Sprite sprite, int x, int y) {
        int distance = x * x + y * y;
        int xPadding = 0;
        int yPadding = 0;
        if (!Client.isFixed()) {
            xPadding = this.xPaddingmapBackImage + this.getMapIncreaseX();
            yPadding = this.yPaddingmapBackImage + this.getMapIncreaseY();
        }
        if (distance > 4225 && distance < 90000) {
            int mapRotation = this.compassRotation + this.mapAmtDiffRotation & 2047;
            int spriteX = Model.modelIntArray1[mapRotation] * 256 / (this.mapAmtDiffZoom + 256);
            int spriteY = Model.modelIntArray2[mapRotation] * 256 / (this.mapAmtDiffZoom + 256);
            int drawX = y * spriteX + x * spriteY >> 16;
            int drawY = y * spriteY - x * spriteX >> 16;
            double spriteRotation = Math.atan2((double)drawX, (double)drawY);
            Math.sin((double)spriteRotation);
            Math.cos((double)spriteRotation);
            return;
        }
        this.drawMapSprites(sprite, x + xPadding, y + yPadding);
    }

    public void drawMapSprites(Sprite sprite, int x, int y) {
        if (sprite == null) {
            return;
        }
        try {
            int xPadding = 0;
            int yPadding = 0;
            if (!Client.isFixed()) {
                xPadding = this.xPaddingmapBackImage + this.getMapIncreaseX();
                yPadding = this.yPaddingmapBackImage + this.getMapIncreaseY();
            }
            int rotation = this.compassRotation + this.mapAmtDiffRotation & 2047;
            int distance = x * x + y * y;
            if (distance > 6400) {
                return;
            }
            int spriteX = Model.modelIntArray1[rotation] * 256 / (this.mapAmtDiffZoom + 256);
            int spriteY = Model.modelIntArray2[rotation] * 256 / (this.mapAmtDiffZoom + 256);
            int drawX = y * spriteX + x * spriteY >> 16;
            int drawY = y * spriteY - x * spriteX >> 16;
            int finalX = this.mapSpritesX + drawX - sprite.maxWidth / 2 + 4;
            int finalY = this.mapSpritesY - drawY - sprite.maxHeight / 2 - 4;
            sprite.drawSprite(finalX + xPadding, finalY + yPadding);
            return;
        }
        catch (ArrayIndexOutOfBoundsException xPadding) {
            // empty catch block
        }
    }

    private void drawMenu(int xOffSet, int yOffSet) {
        int xPos = this.menuOffsetX - (xOffSet - 4);
        int yPos = - yOffSet + 4 + this.menuOffsetY;
        int menuW = this.menuWidth;
        int menuH = this.menuHeight + 1;
        inputTaken = true;
        tabAreaAltered = true;
        if (Configuration.newMenu) {
            int menuColor = 6116423;
            DrawingArea.drawPixels(menuH, yPos, xPos, menuColor, menuW);
            DrawingArea.drawPixels(16, yPos + 1, xPos + 1, 0, menuW - 2);
            DrawingArea.fillPixels(xPos + 1, menuW - 2, menuH - 19, 0, yPos + 18);
            this.newBoldFont.drawBasicString("Choose Option", xPos + 3, yPos + 14, menuColor, 1);
            int mouseX = this.mouseX - xOffSet;
            int mouseY = - yOffSet + this.mouseY;
            for (int i = 0; i < this.menuActionRow; ++i) {
                int textY = yPos + 31 + (this.menuActionRow - 1 - i) * 15;
                int textColor = 16777215;
                if (mouseX > xPos && mouseX < xPos + menuW && mouseY > textY - 13 && mouseY < textY + 3) {
                    DrawingArea.drawPixels(15, textY - 11, xPos + 3, 7301469, this.menuWidth - 6);
                    textColor = 16776960;
                }
                this.newBoldFont.drawBasicString(this.menuActionName[i], xPos + 3, textY, textColor, 1);
            }
        } else {
            DrawingArea.drawPixels(menuH - 4, yPos + 2, xPos, 7367262, menuW);
            DrawingArea.drawPixels(menuH - 2, yPos + 1, xPos + 1, 7367262, menuW - 2);
            DrawingArea.drawPixels(menuH, yPos, xPos + 2, 7367262, menuW - 4);
            DrawingArea.drawPixels(menuH - 2, yPos + 1, xPos + 3, 2959394, menuW - 6);
            DrawingArea.drawPixels(menuH - 4, yPos + 2, xPos + 2, 2959394, menuW - 4);
            DrawingArea.drawPixels(menuH - 6, yPos + 3, xPos + 1, 2959394, menuW - 2);
            DrawingArea.drawPixels(menuH - 22, yPos + 19, xPos + 2, 5392957, menuW - 4);
            DrawingArea.drawPixels(menuH - 22, yPos + 20, xPos + 3, 5392957, menuW - 6);
            DrawingArea.drawPixels(menuH - 23, yPos + 20, xPos + 3, 2828060, menuW - 6);
            DrawingArea.fillPixels(xPos + 3, menuW - 6, 1, 2763035, yPos + 2);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 2762267, yPos + 3);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 2433302, yPos + 4);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 2170389, yPos + 5);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 1973010, yPos + 6);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 1709838, yPos + 7);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 2, 1380875, yPos + 8);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 1051912, yPos + 10);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 592388, yPos + 11);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 526083, yPos + 12);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 592388, yPos + 13);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 460802, yPos + 14);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 592388, yPos + 15);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 460802, yPos + 16);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 592388, yPos + 17);
            DrawingArea.fillPixels(xPos + 2, menuW - 4, 1, 2763035, yPos + 18);
            DrawingArea.fillPixels(xPos + 3, menuW - 6, 1, 5654851, yPos + 19);
            this.newBoldFont.drawBasicString("Choose Option", xPos + 3, yPos + 14, 13023381, 1);
        }
        int mouseX = this.mouseX - xOffSet;
        int mouseY = - yOffSet + this.mouseY;
        int l1 = 0;
        while (l1 < this.menuActionRow) {
            int textY = yPos + 31 + (this.menuActionRow - 1 - l1) * 15;
            if (mouseX > xPos && mouseX < xPos + menuW && mouseY > textY - 13 && mouseY < textY + 3) {
                DrawingArea.drawPixels(15, textY - 11, xPos + 3, 2512492, this.menuWidth - 6);
            }
            this.newBoldFont.drawBasicString(this.menuActionName[l1], xPos + 3, textY, 11182468, 1);
            ++l1;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void drawMinimap(GraphicsBuffer mapImage, int paddingX, int paddingY) {
        mapImage.initDrawingArea();
        mapRotation = this.compassRotation + this.mapAmtDiffRotation & 2047;
        mapCenterX = 48 + Client.myPlayer.x / 32;
        mapCenterY = 464 - Client.myPlayer.y / 32;
        switch (this.minimapCover) {
            case 2: {
                this.compass.drawRotatableSprite(33, this.compassRotation, this.compassPixelCutRight, 256, this.compassPixelCutLeft, 25, (Client.isFixed() == false ? 9 : 8) + paddingY, (Client.isFixed() == false ? 30 : 11) + paddingX, 33, 25);
                this.main3DArea.initDrawingArea();
                return;
            }
        }
        this.miniMapImage.drawRotatableSprite(this.mapInnerSizeHeight, mapRotation, this.mapImagePixelCutRight, 256 + this.mapAmtDiffZoom, this.mapImagePixelCutLeft, mapCenterY, this.mapPaddingFromTop + paddingY, this.mapPaddingFromLeft + paddingX, this.mapInnerSizeWidth, mapCenterX);
        for (loopIndex = 0; loopIndex < this.totalMapFunctions; ++loopIndex) {
            x = this.mapFunctionX[loopIndex] * 4 + 2 - Client.myPlayer.x / 32;
            y = this.mapFunctionY[loopIndex] * 4 + 2 - Client.myPlayer.y / 32;
            this.drawMapSprites(this.currentMapFunctions[loopIndex], x, y);
        }
        loopIndex = this.customMapIcons.keySet().iterator();
        while (loopIndex.hasNext()) {
            key = (Integer)loopIndex.next();
            this.drawMapSprites(this.mapFunctions[((int[])this.customMapIcons.get((Object)key))[0]], (((int[])this.customMapIcons.get((Object)key))[1] - Client.baseX) * 4 + 2 - Client.myPlayer.x / 32, (((int[])this.customMapIcons.get((Object)key))[2] - Client.baseY) * 4 + 2 - Client.myPlayer.y / 32);
        }
        for (loopXIndex = 0; loopXIndex < 104; ++loopXIndex) {
            for (loopYIndex = 0; loopYIndex < 104; ++loopYIndex) {
                nodeList = this.groundArray[this.plane][loopXIndex][loopYIndex];
                if (nodeList == null) continue;
                x = loopXIndex * 4 + 2 - Client.myPlayer.x / 32;
                y = loopYIndex * 4 + 2 - Client.myPlayer.y / 32;
                this.drawMapSprites(this.mapDotItem, x, y);
            }
        }
        for (loopIndex = 0; loopIndex < this.npcCount; ++loopIndex) {
            npc = this.npcArray[this.npcIndices[loopIndex]];
            if (npc == null || !npc.isVisible()) continue;
            entityDef = npc.npcDefinition;
            if (entityDef.childrenIDs != null) {
                entityDef = entityDef.method161();
            }
            if (entityDef == null || !entityDef.aBoolean87 || !entityDef.aBoolean84) continue;
            x = npc.x / 32 - Client.myPlayer.x / 32;
            y = npc.y / 32 - Client.myPlayer.y / 32;
            this.drawMapSprites(this.mapDotNPC, x, y);
        }
        playerIndex = 0;
        do {
            block29 : {
                block30 : {
                    block28 : {
                        if (playerIndex >= this.playerCount) break block28;
                        player = this.playerArray[this.playerIndices[playerIndex]];
                        if (player == null || !player.isVisible()) break block29;
                        x = player.x / 32 - Client.myPlayer.x / 32;
                        y = player.y / 32 - Client.myPlayer.y / 32;
                        isInFriends = false;
                        isInClan = this.clanChat.inClan(player.name);
                        playerNameLong = TextClass.longForName(player.name);
                        break block30;
                    }
                    if (this.hintType != 0 && Client.loopCycle % 20 < 10) {
                        if (this.hintType == 1 && this.hintArrowNPCID >= 0 && this.hintArrowNPCID < this.npcArray.length && (npc = this.npcArray[this.hintArrowNPCID]) != null) {
                            cordX = npc.x / 32 - Client.myPlayer.x / 32;
                            cordY = npc.y / 32 - Client.myPlayer.y / 32;
                            this.drawMapArrows(this.mapMarker, cordY, cordX);
                        }
                        if (this.hintType == 2) {
                            cordX = (this.hintArrowX - Client.baseX) * 4 + 2 - Client.myPlayer.x / 32;
                            cordY = (this.hintArrowY - Client.baseY) * 4 + 2 - Client.myPlayer.y / 32;
                            this.drawMapArrows(this.mapMarker, cordY, cordX);
                        }
                        if (this.hintType == 10 && this.hintArrowPlayerID >= 0 && this.hintArrowPlayerID < this.playerArray.length && (player = this.playerArray[this.hintArrowPlayerID]) != null) {
                            cordX = player.x / 32 - Client.myPlayer.x / 32;
                            cordY = player.y / 32 - Client.myPlayer.y / 32;
                            this.drawMapArrows(this.mapMarker, cordY, cordX);
                        }
                    }
                    if (this.destX != 0) {
                        walkingToX = this.destX * 4 + 2 - Client.myPlayer.x / 32;
                        walkingToY = this.destY * 4 + 2 - Client.myPlayer.y / 32;
                        this.drawMapSprites(this.mapFlag, walkingToX, walkingToY);
                    }
                    if (Client.isFixed()) {
                        this.mapBack[0].drawBackground(paddingX, paddingY);
                    } else {
                        this.mapBack[3].drawBackground(30 + paddingX, 4 + paddingY);
                        this.mapBack[4].drawBackground(25 + paddingX, 4 + paddingY);
                        this.mapBack[4].drawBackground(150 + paddingX, 133 + paddingY);
                    }
                    this.compass.drawRotatableSprite(33, this.compassRotation, this.compassPixelCutRight, 256, this.compassPixelCutLeft, 25, (Client.isFixed() == false ? 9 : 8) + paddingY, (Client.isFixed() == false ? 30 : 11) + paddingX, 33, 25);
                    this.drawOrbs(paddingX, paddingY);
                    this.drawCoinOrb();
                    this.advisorButton[this.advisorHover].drawSprite((Client.isFixed() == false ? 155 : 207) + paddingX, (Client.isFixed() == false ? -4 : 0) + paddingY);
                    this.drawXPCounter(paddingX, paddingY);
                    if (Client.tabInterfaceIDs[10] != -1 && this.invOverlayInterfaceID == -1) {
                        this.exitButton[this.exitHover].drawSprite((Client.isFixed() == false ? 176 : 228) + paddingX, (Client.isFixed() == false ? -4 : 0) + paddingY);
                    }
                    this.worldMapIcon[this.mapHover].drawSprite((Client.isFixed() == false ? 154 : 10) + paddingX, (Client.isFixed() == false ? 138 : 124) + paddingY);
                    DrawingArea.drawPixels(3, 76 + this.mapPaddingFromTop + paddingY, 76 + this.mapPaddingFromLeft + paddingX, 16777215, 3);
                    if (this.menuOpen && Client.isFixed()) {
                        this.drawMenu(516, 0);
                    }
                    if (Client.isFixed()) {
                        this.drawTooltipHover(this.mouseX - 516 + 4, this.mouseY + 4);
                    }
                    this.main3DArea.initDrawingArea();
                    return;
                }
                for (friendIndex = 0; friendIndex < this.friendsCount; ++friendIndex) {
                    if (playerNameLong != this.friendsListAsLongs[friendIndex] || this.friendsNodeIDs[friendIndex] == 0) continue;
                    isInFriends = true;
                    break;
                }
                isInTeam = false;
                if (Client.myPlayer.team == 0) ** GOTO lbl-1000
                if (player.team != 0 && Client.myPlayer.team == player.team) {
                    isInTeam = true;
                }
                if (isInFriends) lbl-1000: // 2 sources:
                {
                    this.drawMapSprites(this.mapDotFriend, x, y);
                } else if (isInClan) {
                    this.drawMapSprites(this.mapDotClan, x, y);
                } else if (isInTeam) {
                    this.drawMapSprites(this.mapDotTeam, x, y);
                } else {
                    this.drawMapSprites(this.mapDotPlayer, x, y);
                }
            }
            ++playerIndex;
        } while (true);
    }

    public void drawOrbs(int paddingX, int paddingY) {
        this.createOrbs((!Client.isFixed() ? -44 : 145) + this.mapMovedX + paddingX, (!Client.isFixed() ? 38 : 10) + this.mapMovedY + paddingY, 0, this.healthOrbs);
        this.createOrbs((!Client.isFixed() ? -47 : 161) + this.mapMovedX + paddingX, (!Client.isFixed() ? 72 : 49) + this.mapMovedY + paddingY, 1, this.prayerOrbs);
        this.createOrbs((!Client.isFixed() ? -35 : 161) + this.mapMovedX + paddingX, (!Client.isFixed() ? 106 : 88) + this.mapMovedY + paddingY, 2, this.energyOrbs);
        this.createOrbs((!Client.isFixed() ? -12 : 145) + this.mapMovedX + paddingX, (!Client.isFixed() ? 135 : 127) + this.mapMovedY + paddingY, 3, this.summoningOrbs);
    }

    public void drawRightFrameArea() {
        if (this.resizing) return;
        this.rightFrame.initDrawingArea();
        this.rightFrameSprite.drawSprite(0, 0);
        if (this.menuOpen && Client.isFixed()) {
            this.drawMenu(516, 168);
        }
        this.rightFrame.drawGraphics(168, this.graphics, 516);
        this.main3DArea.initDrawingArea();
    }

    public void drawScrollbar(int totalHeight, int currentPos, int yPos, int xPos, int ScrollsTotalLength, boolean hdStyle) {
        double repeats = (totalHeight - 32) / 5;
        int i = 0;
        while ((double)i <= repeats) {
            this.scrollBar[0 + (hdStyle && !Client.isFixed() ? 4 : 0)].drawSprite(xPos, yPos + 16 + i * 5);
            ++i;
        }
        int scrollLength = (totalHeight - 32) * totalHeight / ScrollsTotalLength;
        if (scrollLength < 10) {
            scrollLength = 10;
        }
        int calcScrollPos = (totalHeight - 32 - scrollLength) * currentPos / (ScrollsTotalLength - totalHeight);
        int frontStartY = yPos + 16 + calcScrollPos;
        int frontFinishY = yPos + 16 + calcScrollPos + scrollLength - 5;
        for (int frontY = frontStartY; frontY < frontFinishY; frontY += 5) {
            this.scrollBar[2 + (hdStyle && !Client.isFixed() ? 4 : 0)].drawSprite(xPos, frontY);
        }
        this.scrollBar[1 + (hdStyle && !Client.isFixed() ? 4 : 0)].drawSprite(xPos, frontStartY);
        this.scrollBar[3 + (hdStyle && !Client.isFixed() ? 4 : 0)].drawSprite(xPos, frontFinishY);
        this.scrollArrow[0 + (hdStyle && !Client.isFixed() ? 2 : 0)].drawSprite(xPos, yPos);
        this.scrollArrow[1 + (hdStyle && !Client.isFixed() ? 2 : 0)].drawSprite(xPos, yPos + totalHeight - 16);
    }

    public void drawSideIcons(int paddingX, int paddingY) {
        boolean displayNewTabs;
        boolean bl = displayNewTabs = !Client.isFixed() && newTabs;
        if (this.tabIconFlash != -1) {
            tabAreaAltered = true;
        }
        if (tabAreaAltered) {
            if (this.tabIconFlash != -1 && this.tabIconFlash == tabID) {
                this.tabIconFlash = -1;
                this.stream.createFrame(120);
                this.stream.writeWordBigEndian(tabID);
            }
            tabAreaAltered = false;
        }
        if (this.invOverlayInterfaceID != -1) return;
        if (tabInterfaceIDs[0] != -1 && (this.tabIconFlash != 0 || loopCycle % 20 < 10)) {
            this.sideIcons[0].drawSprite(8 + paddingX, (displayNewTabs ? 261 : 0) + 9 + paddingY);
        }
        if (tabInterfaceIDs[14] != -1 && (this.tabIconFlash != 1 || loopCycle % 20 < 10)) {
            this.sideIcons[3].drawSprite(37 + paddingX, (displayNewTabs ? 261 : 0) + 9 + paddingY);
        }
        if (tabInterfaceIDs[1] != -1 && (this.tabIconFlash != 2 || loopCycle % 20 < 10)) {
            this.sideIcons[1].drawSprite(67 + paddingX, (displayNewTabs ? 261 : 0) + 8 + paddingY);
        }
        if (tabInterfaceIDs[2] != -1 && (this.tabIconFlash != 14 || loopCycle % 20 < 10)) {
            this.sideIcons[2].drawSprite(97 + paddingX, (displayNewTabs ? 261 : 0) + 8 + paddingY);
        }
        if (tabInterfaceIDs[3] != -1 && (this.tabIconFlash != 3 || loopCycle % 20 < 10)) {
            this.sideIcons[4].drawSprite(127 + paddingX, (displayNewTabs ? 261 : 0) + 9 + paddingY);
        }
        if (tabInterfaceIDs[4] != -1 && (this.tabIconFlash != 4 || loopCycle % 20 < 10)) {
            this.sideIcons[5].drawSprite(159 + paddingX, (displayNewTabs ? 261 : 0) + 8 + paddingY);
        }
        if (tabInterfaceIDs[5] != -1 && (this.tabIconFlash != 5 || loopCycle % 20 < 10)) {
            this.sideIcons[6].drawSprite(187 + paddingX, (displayNewTabs ? 261 : 0) + 9 + paddingY);
        }
        if (tabInterfaceIDs[6] != -1 && (this.tabIconFlash != 6 || loopCycle % 20 < 10)) {
            this.sideIcons[7].drawSprite(217 + paddingX, (displayNewTabs ? 261 : 0) + 9 + paddingY);
        }
        if (tabInterfaceIDs[14] != -1 && (this.tabIconFlash != 7 || loopCycle % 20 < 10)) {
            this.sideIcons[8].drawSprite(7 + paddingX, 308 + paddingY);
        }
        if (tabInterfaceIDs[9] != -1 && (this.tabIconFlash != 9 || loopCycle % 20 < 10)) {
            this.sideIcons[9].drawSprite(38 + paddingX, 307 + paddingY);
        }
        if (tabInterfaceIDs[8] != -1 && (this.tabIconFlash != 8 || loopCycle % 20 < 10)) {
            this.sideIcons[10].drawSprite(70 + paddingX, 307 + paddingY);
        }
        if (tabInterfaceIDs[7] != -1 && (this.tabIconFlash != 7 || loopCycle % 20 < 10)) {
            this.sideIcons[11].drawSprite(97 + paddingX, 308 + paddingY);
        }
        if (tabInterfaceIDs[11] != -1 && (this.tabIconFlash != 11 || loopCycle % 20 < 10)) {
            this.sideIcons[12].drawSprite(127 + paddingX, 307 + paddingY);
        }
        if (tabInterfaceIDs[12] != -1 && (this.tabIconFlash != 12 || loopCycle % 20 < 10)) {
            this.sideIcons[13].drawSprite(157 + paddingX, 307 + paddingY);
        }
        if (tabInterfaceIDs[13] != -1 && (this.tabIconFlash != 13 || loopCycle % 20 < 10)) {
            this.sideIcons[14].drawSprite(186 + paddingX, 306 + paddingY);
        }
        if (tabInterfaceIDs[15] == -1) return;
        if (this.tabIconFlash == 15) {
            if (loopCycle % 20 >= 10) return;
        }
        this.sideIcons[15].drawSprite(217 + paddingX, 307 + paddingY);
    }

    /*
     * Unable to fully structure code
     */
    public void drawSplitPrivateChat(int paddingX, int paddingY) {
        if (this.splitPrivateChat == 0) {
            return;
        }
        i = 0;
        if (this.systemUpdatetime != 0) {
            i = 1;
        }
        var4_4 = this.chatMessages.iterator();
        do lbl-1000: // 4 sources:
        {
            if (var4_4.hasNext() == false) return;
            message = (ChatMessage)var4_4.next();
            if (message == null) ** GOTO lbl-1000
            chatType = message.getType().getType();
            if ((chatType == 3 || chatType == 7 || chatType == 18) && (chatType == 7 || this.privateChatMode == 0 || this.privateChatMode == 1 && this.isFriendOrSelf(message.getName()))) {
                drawY = 329 + paddingY - i * 13;
                Client.newRegularFont.drawBasicString("From " + message.getTitle() + message.getName() + ": " + message.getMessage(), 4, drawY, this.getChatColor(), 0);
                if (++i >= this.pmChatSize) {
                    return;
                }
            }
            if (chatType == 5 && this.privateChatMode < 2) {
                drawY = 329 + paddingY - i * 13;
                Client.newRegularFont.drawBasicString(message.getMessage(), 4, drawY, this.getChatColor(), 0);
                if (++i >= this.pmChatSize) {
                    return;
                }
            }
            if (chatType != 6 || this.privateChatMode >= 2) ** GOTO lbl-1000
            drawY = 329 + paddingY - i * 13;
            Client.newRegularFont.drawBasicString("To " + message.getName() + ": " + message.getMessage(), 4, drawY, this.getChatColor(), 0);
        } while (++i < this.pmChatSize);
    }

    public void drawTabArea(GraphicsBuffer tabImage, int paddingX, int paddingY) {
        tabImage.initDrawingArea();
        Rasterizer.anIntArray1472 = this.anIntArray1181;
        if (!Client.isFixed() && newTabs) {
            if (focusTab != -1) {
                this.tabAreaSprite[1].drawSprite1(22 + paddingX, 32 + paddingY - (!Client.isFixed() ? 46 : 0), 192);
            }
        } else {
            this.tabAreaSprite[0].drawSprite(0 + paddingX, 0 + paddingY);
        }
        this.drawIventoryStones(paddingX, paddingY);
        this.drawSideIcons(paddingX, paddingY);
        if (this.invOverlayInterfaceID != -1) {
            this.drawInterface(0, 28 + paddingX, RSInterface.interfaceCache[this.invOverlayInterfaceID], 37 - (!Client.isFixed() && newTabs ? 46 : 0) + paddingY);
        } else if (tabInterfaceIDs[tabID] != -1 && focusTab != -1) {
            this.drawInterface(0, 28 + paddingX, RSInterface.interfaceCache[tabInterfaceIDs[tabID]], 37 - (!Client.isFixed() && newTabs ? 46 : 0) + paddingY);
        }
        if (this.menuOpen && Client.isFixed()) {
            this.drawMenu(519, 168);
        }
        if (Client.isFixed()) {
            this.drawTooltipHover(this.mouseX - 516 + 4, this.mouseY - 168 + 4);
        }
        Rasterizer.anIntArray1472 = this.anIntArray1182;
    }

    private void drawTooltip() {
        if (this.menuActionRow < 2 && this.itemSelected == 0 && this.spellSelected == 0) {
            super.setCursor(0);
            return;
        }
        String s = this.itemSelected == 1 && this.menuActionRow < 2 ? "Use " + this.selectedItemName + " with..." : (this.spellSelected == 1 && this.menuActionRow < 2 ? this.spellTooltip + "..." : this.menuActionName[this.menuActionRow - 1]);
        s = this.menuActionRow > 2 && !this.toolTips ? s + "@whi@ / " + (this.menuActionRow - 2) + " more options" : s + "@whi@";
        boolean hoverToolTipActive = false;
        if (this.toolTips && !s.contains((CharSequence)"Walk here") && this.mouseX < 520 && this.mouseY < 340 && this.hoverToolTip <= System.currentTimeMillis()) {
            hoverToolTipActive = true;
            DrawingArea.drawAlphaPixels(this.mouseX - newSmallFont.getTextWidth(s.trim()) / 2, this.mouseY - 17, newSmallFont.getTextWidth(s.trim()) + 6, 15, 0, 100);
            newSmallFont.drawBasicString(s, this.mouseX + 2 - newSmallFont.getTextWidth(s.trim()) / 2, this.mouseY - 4, 16777215, 1);
        } else {
            this.hoverToolTip = System.currentTimeMillis() + 500L;
        }
        this.newBoldFont.drawBasicString(s, 4, 15, 16777215, 1);
        boolean hasFoundCursor = false;
        if (!hoverToolTipActive) {
            for (int i1 = 0; i1 < cursorInfo.length; ++i1) {
                if (!this.menuActionName[this.menuActionRow - 1].startsWith(cursorInfo[i1])) continue;
                super.setCursor(i1);
                hasFoundCursor = true;
            }
            if (hasFoundCursor) return;
        }
        super.setCursor(0);
    }

    public void drawTooltip(int xPos, int yPos, String text, boolean centerText) {
        int i;
        String[] results = text.split("\n");
        int height = results.length * 16 + 5;
        int width = newRegularFont.getTextWidth(results[0]) + 6;
        for (i = 1; i < results.length; ++i) {
            if (width > newRegularFont.getTextWidth(results[i]) + 6) continue;
            width = newRegularFont.getTextWidth(results[i]) + 6;
        }
        DrawingArea.drawPixels(height, yPos, xPos - (centerText ? width / 2 - 4 : 0), 16777120, width);
        DrawingArea.fillPixels(xPos - (centerText ? width / 2 - 4 : 0), width, height, 0, yPos);
        yPos += 14;
        i = 0;
        while (i < results.length) {
            if (centerText) {
                newRegularFont.drawCenteredString(results[i], xPos + 3, yPos, 0, -1);
            } else {
                newRegularFont.drawBasicString(results[i], xPos + 3, yPos, 0, -1);
            }
            yPos += 16;
            ++i;
        }
    }

    public void drawTooltipHover(int x, int y) {
        if (!Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TOOLTIPS)) return;
        if (x <= 0) return;
        if (y <= 0) return;
        if (this.menuOpen) return;
        if (this.tooltipText == null) return;
        needDrawTabArea = true;
        DrawingArea.method335(2236962, y + 2 - this.tooltipYOffset, this.tooltipWidth - 1, this.tooltipHeight - 4, 180, x + 3 - this.tooltipXOffset);
        this.smallFont.drawCenteredText(16777215, x + 5 - this.tooltipXOffset + this.tooltipWidth / 2, this.tooltipText, y + 15 - this.tooltipYOffset, true);
    }

    public void drawXPCounter(int paddingX, int paddingY) {
        int x = 0 + (!Client.isFixed() ? paddingX - 22 : paddingX);
        int y = 46 + (!Client.isFixed() ? paddingY - 39 : paddingY);
        this.XPcounterSprite[this.counterOn || this.isOnXPCounter(paddingX, paddingY) ? 1 : 0].drawSprite(x, y);
    }

    public void dropClient() {
        if (this.anInt1011 > 0) {
            this.resetLogout();
            return;
        }
        try {
            this.main3DArea.initDrawingArea();
            this.normalFont.drawText(0, "Connection lost", 144, 257);
            this.normalFont.drawText(16777215, "Connection lost", 143, 256);
            this.normalFont.drawText(0, "Please wait - attempting to reestablish", 159, 257);
            this.normalFont.drawText(16777215, "Please wait - attempting to reestablish", 158, 256);
            if (!this.resizing) {
                this.main3DArea.drawGraphics(!Client.isFixed() ? 0 : 4, this.graphics, !Client.isFixed() ? 0 : 4);
            }
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        this.minimapCover = 0;
        this.destX = 0;
        RSSocket rsSocket = this.socketStream;
        this.loggedIn = false;
        this.loginFailures = 0;
        if (this.captchaDialog != null) {
            this.captchaDialog.dispose();
            this.captchaDialog = null;
            this.captchaAnswer = null;
        }
        Settings.save();
        AccountManager.saveAccount();
        this.login(this.myUsername, this.myPassword, true, false);
        this.loginRenderer.setScreen(new MainScreen());
        if (!this.loggedIn) {
            this.resetLogout();
        }
        try {
            rsSocket.close();
            return;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void dumpCacheIndex(int cacheIndex) {
        System.out.println("STARITNG DUMP");
        if (cacheIndex > this.decompressors.length) {
            System.out.println("Dump error: Invalid Index");
            return;
        }
        File destinationFolder = new File("./dumpedindex" + cacheIndex + "/");
        if (!destinationFolder.exists()) {
            destinationFolder.mkdirs();
        }
        int fileId = 0;
        while (fileId < this.decompressors[cacheIndex].getFileCount()) {
            try {
                byte[] fileData = this.decompressors[cacheIndex].get(fileId).array();
                if (fileData != null && fileData.length != 0) {
                    FileOutputStream output = new FileOutputStream(new File((Object)destinationFolder.getAbsoluteFile() + File.separator + fileId + ".gz"));
                    output.write(fileData);
                    output.close();
                }
            }
            catch (Exception e) {
                System.out.println("Error writing file " + fileId + "!");
            }
            ++fileId;
        }
    }

    public void dumpImage(Sprite image, String name) {
        File directory = new File(Signlink.getDirectory() + "rsimg/dump/");
        if (!directory.exists()) {
            directory.mkdirs();
        }
        BufferedImage bi = new BufferedImage(image.myWidth, image.myHeight, 1);
        bi.setRGB(0, 0, image.myWidth, image.myHeight, image.myPixels, 0, image.myWidth);
        Image img = Client.makeColorTransparent(bi, new Color(0, 0, 0));
        BufferedImage trans = Client.imageToBufferedImage(img);
        try {
            File out = new File(Signlink.getDirectory() + "rsimg/dump/" + name + ".png");
            ImageIO.write((RenderedImage)trans, (String)"png", (File)out);
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dumpItemById(int id, boolean dumpByName) {
        ItemDefinition def = ItemDefinition.forID(id);
        if (def == null) {
            return;
        }
        Sprite sprite = ItemDefinition.getSprite(id, 0, 0);
        if (sprite == null) {
            return;
        }
        this.dumpImage(sprite, dumpByName ? def.name : Integer.toString((int)id));
    }

    public void dumpItemImages(boolean dumpByName) {
        int id = 0;
        while (id < ItemDefinition.totalItems + 1000 + ItemDefinition.totalOsrsItems) {
            this.dumpItemById(id, dumpByName);
            ++id;
        }
    }

    public int extractInterfaceValues(RSInterface class9, int j) {
        if (class9.valueIndexArray == null) return -2;
        if (j >= class9.valueIndexArray.length) {
            return -2;
        }
        try {
            int[] ai = class9.valueIndexArray[j];
            int k = 0;
            int l = 0;
            int i1 = 0;
            do {
                int j1 = ai[l++];
                int k1 = 0;
                int byte0 = 0;
                if (j1 == 0) {
                    return k;
                }
                if (j1 == 1) {
                    k1 = this.currentStats[ai[l++]];
                }
                if (j1 == 2) {
                    k1 = this.maxStats[ai[l++]];
                }
                if (j1 == 3) {
                    k1 = this.currentExp[ai[l++]];
                }
                if (j1 == 4) {
                    int k2;
                    RSInterface class9_1 = RSInterface.interfaceCache[ai[l++]];
                    if ((k2 = ai[l++]) >= 0 && k2 < ItemDefinition.totalItems && (!ItemDefinition.forID((int)k2).membersObject || isMembers)) {
                        for (int j3 = 0; j3 < class9_1.inv.length; ++j3) {
                            if (class9_1.inv[j3] != k2 + 1) continue;
                            k1 += class9_1.invStackSizes[j3];
                        }
                    }
                }
                if (j1 == 5) {
                    k1 = this.variousSettings[ai[l++]];
                }
                if (j1 == 6) {
                    k1 = anIntArray1019[this.maxStats[ai[l++]] - 1];
                }
                if (j1 == 7) {
                    k1 = this.variousSettings[ai[l++]] * 100 / 46875;
                }
                if (j1 == 8) {
                    k1 = Client.myPlayer.combatLevel;
                }
                if (j1 == 9) {
                    for (int l1 = 0; l1 < 25; ++l1) {
                        if (!Skills.skillEnabled[l1]) continue;
                        k1 += this.maxStats[l1];
                    }
                }
                if (j1 == 10) {
                    int l2;
                    RSInterface class9_2 = RSInterface.interfaceCache[ai[l++]];
                    if ((l2 = ai[l++] + 1) >= 0 && l2 < ItemDefinition.totalItems && (!ItemDefinition.forID((int)l2).membersObject || isMembers)) {
                        for (int k3 = 0; k3 < class9_2.inv.length; ++k3) {
                            if (class9_2.inv[k3] != l2) {
                                continue;
                            }
                            k1 = 999999999;
                            break;
                        }
                    }
                }
                if (j1 == 11) {
                    k1 = this.energy;
                }
                if (j1 == 12) {
                    k1 = this.weight;
                }
                if (j1 == 13) {
                    int i3;
                    int i2;
                    int n = k1 = ((i2 = this.variousSettings[ai[l++]]) & 1 << (i3 = ai[l++])) == 0 ? 0 : 1;
                }
                if (j1 == 14) {
                    int j2 = ai[l++];
                    VarBit varBit = VarBit.cache[j2];
                    int l3 = varBit.anInt648;
                    int i4 = varBit.anInt649;
                    int j4 = varBit.anInt650;
                    int k4 = anIntArray1232[j4 - i4];
                    k1 = this.variousSettings[l3] >> i4 & k4;
                }
                if (j1 == 15) {
                    byte0 = 1;
                }
                if (j1 == 16) {
                    byte0 = 2;
                }
                if (j1 == 17) {
                    byte0 = 3;
                }
                if (j1 == 18) {
                    k1 = (Client.myPlayer.x >> 7) + baseX;
                }
                if (j1 == 19) {
                    k1 = (Client.myPlayer.y >> 7) + baseY;
                }
                if (j1 == 20) {
                    k1 = ai[l++];
                }
                if (byte0 == 0) {
                    if (i1 == 0) {
                        k += k1;
                    }
                    if (i1 == 1) {
                        k -= k1;
                    }
                    if (i1 == 2 && k1 != 0) {
                        k /= k1;
                    }
                    if (i1 == 3) {
                        k *= k1;
                    }
                    i1 = 0;
                    continue;
                }
                i1 = byte0;
            } while (true);
        }
        catch (Exception _ex) {
            return -1;
        }
    }

    public byte[] fileToByteArray(int cacheIndex, int index) {
        try {
            if (this.indexLocation(cacheIndex, index).length() <= 0) return null;
            if (this.indexLocation(cacheIndex, index) == null) {
                return null;
            }
            File file = new File(this.indexLocation(cacheIndex, index));
            byte[] fileData = new byte[(int)file.length()];
            FileInputStream fis = new FileInputStream(file);
            fis.read(fileData);
            fis.close();
            return fileData;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean mouseInRegion(int x1, int y1, int x2, int y2) {
        if (this.mouseX < x1) return false;
        if (this.mouseX > x2) return false;
        if (this.mouseY < y1) return false;
        if (this.mouseY > y2) return false;
        return true;
    }

    public String generateString(String characters, int length) {
        char[] text = new char[length];
        int i = 0;
        while (i < length) {
            Random rng = new Random();
            text[i] = characters.charAt(rng.nextInt(characters.length()));
            ++i;
        }
        return new String(text);
    }

    public AppletContext getAppletContext() {
        if (Signlink.mainapp == null) return super.getAppletContext();
        return Signlink.mainapp.getAppletContext();
    }

    public int getChatBackIncreaseY() {
        chatIncreaseY = !Client.isFixed() ? this.getScreenHeight() - 503 : 0;
        return chatIncreaseY;
    }

    private int getChatColor() {
        return Integer.parseInt((String)chatColorHex, (int)16);
    }

    public URL getCodeBase() {
        try {
            return new URL(connectionStatus.getAddress() + ":" + (80 + portOff));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private /* varargs */ String getCrownsForRights(int ... rights) {
        String toReturn = "";
        int[] arrn = rights;
        int n = arrn.length;
        int n2 = 0;
        while (n2 < n) {
            int right = arrn[n2];
            toReturn = toReturn + "<img=" + (right - 1) + ">";
            ++n2;
        }
        return toReturn;
    }

    public int[] getCurseTypeForIndex(int index) {
        int g;
        int[] types = null;
        for (g = 0; g < this.leechCurse.length; ++g) {
            if (index != this.leechCurse[g]) continue;
            types = this.sapCurse;
        }
        for (g = 0; g < this.sapCurse.length; ++g) {
            if (index != this.sapCurse[g]) continue;
            types = this.leechCurse;
        }
        for (g = 0; g < this.deflectCurse.length; ++g) {
            if (index != this.deflectCurse[g]) continue;
            types = this.deflectCurse;
        }
        if (index == 6) {
            int[] type = new int[]{17, 18};
            types = type;
        }
        if (index == 17 || index == 18) {
            int[] type = new int[]{6, 7, 8, 9, 17, 18};
            types = type;
        }
        if (index != 19) return types;
        int[] turmoilCurseOff = new int[]{1, 2, 3, 4, 10, 11, 12, 13, 14, 15, 16, 19};
        return turmoilCurseOff;
    }

    public int getDis(int coordX1, int coordY1, int coordX2, int coordY2) {
        int deltaX = coordX2 - coordX1;
        int deltaY = coordY2 - coordY1;
        return (int)Math.sqrt((double)(Math.pow((double)deltaX, (double)2.0) + Math.pow((double)deltaY, (double)2.0)));
    }

    public String getDocumentBaseHost() {
        if (Signlink.mainapp != null) {
            return Signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        }
        if (this.gameFrame == null) return "";
        return "";
    }

    @Override
    public Component getGameComponent() {
        if (Signlink.mainapp != null) {
            return Signlink.mainapp;
        }
        if (this.gameFrame == null) return this;
        return this.gameFrame;
    }

    public String getHardwareId() {
        if (OSValidator.isWindows()) {
            try {
                Process process2 = Runtime.getRuntime().exec(new String[]{"wmic", "cpu", "get", "ProcessorId"});
                Scanner scanner2 = new Scanner(process2.getInputStream());
                String property2 = scanner2.next();
                String serial2 = scanner2.next();
                System.out.println(property2 + ": " + serial2);
                scanner2.close();
                return serial2;
            }
            catch (IOException e) {
                e.printStackTrace();
                return "NOTFOUNDWINDOWS";
            }
        }
        if (!OSValidator.isMac()) return "NOTFOUND";
        ProcessBuilder pb = new ProcessBuilder(new String[]{"bash", "-c", "ioreg -l | awk '/IOPlatformSerialNumber/ { print $4;}'"});
        pb.redirectErrorStream(true);
        try {
            Process p = pb.start();
            BufferedReader stdout = new BufferedReader((Reader)new InputStreamReader(p.getInputStream()));
            String s = stdout.readLine();
            if (s != null) {
                return s.substring(1, s.length() - 1);
            }
            System.out.println("Exit value: " + p.waitFor());
            p.getInputStream().close();
            p.getOutputStream().close();
            p.getErrorStream().close();
            return "NOTFOUND";
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return "NOTFOUNDMAC";
        }
    }

    public int getLevelForXP(int exp) {
        int points = 0;
        int output = 0;
        if (exp >= 172000000) {
            return 125;
        }
        int lvl = 1;
        while (lvl <= 125) {
            output = (int)Math.floor((double)((points = (int)((double)points + Math.floor((double)((double)lvl + 300.0 * Math.pow((double)2.0, (double)((double)lvl / 7.0)))))) / 4));
            if (output >= exp) {
                return lvl;
            }
            ++lvl;
        }
        return 125;
    }

    public String getMacAddress() {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress((InetAddress)ip);
            byte[] mac = network.getHardwareAddress();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < mac.length) {
                Object[] arrobject = new Object[2];
                arrobject[0] = mac[i];
                arrobject[1] = i < mac.length - 1 ? "-" : "";
                sb.append(String.format((String)"%02X%s", (Object[])arrobject));
                ++i;
            }
            return sb.toString();
        }
        catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
            return "00-00-00-00-00-00";
        }
    }

    public int getMapIncreaseX() {
        this.mapIncreaseX = !Client.isFixed() ? this.getScreenWidth() - 765 + 52 : 0;
        return this.mapIncreaseX;
    }

    public int getMapIncreaseY() {
        this.mapIncreaseY = !Client.isFixed() ? 4 : 0;
        return this.mapIncreaseY;
    }

    public int getMoneyOrbColor(int cashAmount) {
        if (cashAmount < 100000) return 65280;
        if (cashAmount > 999999) return 65280;
        return 16777215;
    }

    public int getOrbTextColor(double percentage) {
        if (percentage >= 75.0) {
            return 65280;
        }
        if (percentage >= 50.0 && percentage <= 74.0) {
            return 16776960;
        }
        if (percentage < 25.0) return 16711680;
        if (percentage > 49.0) return 16711680;
        return 16750623;
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public int[] getOrbValues(int type, Sprite orbSprite) {
        values = new int[2];
        offsetX = 0;
        offsetY = 0;
        switch (type) {
            case 0: {
                values[0] = Integer.parseInt((String)RSInterface.interfaceCache[4016].message.replaceAll("%", ""));
                values[1] = Integer.parseInt((String)RSInterface.interfaceCache[4017].message.replaceAll("%", ""));
                offsetX = 9;
                offsetY = 10;
                ** break;
            }
            case 1: {
                values[0] = Integer.parseInt((String)RSInterface.interfaceCache[4012].message.replaceAll("%", ""));
                values[1] = Integer.parseInt((String)RSInterface.interfaceCache[4013].message.replaceAll("%", ""));
                offsetX = 7;
                offsetY = 7;
                ** break;
            }
            case 2: {
                values[0] = Integer.parseInt((String)RSInterface.interfaceCache[149].message.replaceAll("%", ""));
                values[1] = 100;
                offsetX = 10;
                offsetY = 8;
                ** break;
            }
            case 3: {
                values[0] = Integer.parseInt((String)RSInterface.interfaceCache[19178].message.replaceAll("%", ""));
                values[1] = Integer.parseInt((String)RSInterface.interfaceCache[19179].message.replaceAll("%", ""));
                offsetX = 7;
                offsetY = 7;
                ** break;
            }
        }
        return null;
lbl30: // 4 sources:
        try {
            if (offsetX <= 0) return values;
            if (offsetY <= 0) return values;
            orbSprite.configXDrawOffset(offsetX);
            orbSprite.configYDrawOffset(offsetY);
            return values;
        }
        catch (NullPointerException var6_6) {
            // empty catch block
        }
        return values;
    }

    public String getParameter(String s) {
        if (Signlink.mainapp == null) return super.getParameter(s);
        return Signlink.mainapp.getParameter(s);
    }

    public int[] getPrayerTypeForIndex(int index) {
        int[] type = null;
        int i = 0;
        while (i < this.prayer.length) {
            for (int il = 0; il < this.prayer[i].length; ++il) {
                if (index != this.prayer[i][il]) continue;
                type = this.prayer[i];
            }
            ++i;
        }
        return type;
    }

    public int getQuickCursesSet() {
        int amount = 0;
        int i = 0;
        while (i < this.quickCurses.length) {
            if (this.quickCurses[i] == 1) {
                ++amount;
            }
            ++i;
        }
        return amount;
    }

    public int getQuickPrayersSet() {
        int amount = 0;
        int i = 0;
        while (i < this.quickPrayers.length) {
            if (this.quickPrayers[i] == 1) {
                ++amount;
            }
            ++i;
        }
        return amount;
    }

    public int getTabIncreaseX() {
        this.tabIncreaseX = !Client.isFixed() ? this.getScreenWidth() - 765 : 0;
        return this.tabIncreaseX;
    }

    public int getTabIncreaseY() {
        this.tabIncreaseY = !Client.isFixed() ? this.getScreenHeight() - 503 : 0;
        return this.tabIncreaseY;
    }

    public int getXPForLevel(int level) {
        if (level < anIntArray1019.length) return anIntArray1019[level];
        return anIntArray1019[anIntArray1019.length - 1];
    }

    public int getYMaxLength() {
        if (firstPersonMode) return 500;
        return 383;
    }

    public void handePrayerCorrection(int button) {
        int index = button - 25000;
        if (index > 0) {
            index /= 2;
        }
        this.sendPacket185(this.oldPrayerButtons[index], -1, 169);
    }

    public void handleNuke() {
    }

    public void handleQuickAidsActive() {
        if (this.prayerInterfaceType == 5608) {
            if (this.getQuickPrayersSet() > 0) {
                if (!this.orbToggle[1]) {
                    for (int i = 0; i < this.quickPrayers.length; ++i) {
                        if (this.quickPrayers[i] != 1) continue;
                        this.sendPacket185(i * 2 + 25000, -1, 169);
                    }
                } else {
                    this.turnOffPrayers();
                }
                this.orbToggle[1] = !this.orbToggle[1];
                return;
            }
            if (this.orbToggle[1]) {
                this.turnOffPrayers();
                this.orbToggle[1] = false;
                return;
            }
            this.pushMessage("You don't have any quick prayers selected.");
            this.pushMessage("Right-click the Prayer button next to the minimap to select some.");
            return;
        }
        if (this.prayerInterfaceType != 22500) return;
        if (this.getQuickCursesSet() > 0) {
            if (!this.orbToggle[1]) {
                for (int i = 0; i < this.quickCurses.length; ++i) {
                    if (this.quickCurses[i] != 1) continue;
                    this.sendPacket185(i * 2 + 22503, -1, 169);
                }
            } else {
                this.turnOffCurses();
            }
            this.orbToggle[1] = !this.orbToggle[1];
            return;
        }
        if (this.orbToggle[1]) {
            this.turnOffCurses();
            this.orbToggle[1] = false;
            return;
        }
        this.pushMessage("You don't have any quick curses selected.");
        this.pushMessage("Right-click the Curses button next to the minimap to select some.");
    }

    public void handleRegionChange() {
        int playerX = baseX + (Client.myPlayer.x - 6 >> 7);
        int playerY = baseY + (Client.myPlayer.y - 6 >> 7);
        Iterator iterator = CustomObjects.CUSTOM_OBJECT_LIST.iterator();
        do {
            if (!iterator.hasNext()) {
                this.method63();
                return;
            }
            GameObject customObject = (GameObject)iterator.next();
            if (customObject == null || this.plane != customObject.z && (this.realPlane != customObject.z || !Client.goodDistance(customObject.x, customObject.y, playerX, playerY, 50))) continue;
            int z = customObject.z > 3 ? customObject.z % 4 : customObject.z;
            this.addObject(customObject.id, customObject.x, customObject.y, customObject.face, customObject.type, z);
        } while (true);
    }

    public void hitmarkDraw(Mobile e, int hitLength, int markType, int icon, int damage, int move, int opacity, int focusPlayer, int focusNPC) {
        hitLength *= 2;
        if (damage <= 0) {
            this.hitMarkIcons[0].drawSprite1(this.spriteDrawX - 12, this.spriteDrawY - 14 + move, opacity);
            return;
        }
        if (icon > 0 && icon < this.hitMarkIcons.length) {
            this.hitMarkIcons[icon].drawSprite1(this.spriteDrawX - 34, this.spriteDrawY - 14 + move, opacity);
        }
        int focusType = e == myPlayer || focusPlayer != 0 && e == this.playerArray[focusPlayer] || focusNPC != 0 && e == this.npcArray[focusNPC] ? 0 : 1;
        this.hitMarkBacks[markType][focusType][0].drawSprite1(this.spriteDrawX - 12, this.spriteDrawY - 12 + move, opacity);
        for (int i = 1; i <= hitLength; ++i) {
            this.hitMarkBacks[markType][focusType][1].drawSprite1(this.spriteDrawX - 12 + i * 4, this.spriteDrawY - 12 + move, opacity);
        }
        this.hitMarkBacks[markType][focusType][2].drawSprite1(this.spriteDrawX - 8 + hitLength * 4, this.spriteDrawY - 12 + move, opacity);
        if (hitLength >= 10) {
            this.normalFont.drawText(16777215, String.valueOf((int)damage), this.spriteDrawY + 3 + move, this.spriteDrawX + 12);
            return;
        }
        if (hitLength >= 8) {
            this.normalFont.drawText(16777215, String.valueOf((int)damage), this.spriteDrawY + 3 + move, this.spriteDrawX + 8);
            return;
        }
        if (hitLength == 6) {
            this.normalFont.drawText(16777215, String.valueOf((int)damage), this.spriteDrawY + 3 + move, this.spriteDrawX + 4);
            return;
        }
        if (hitLength == 4) {
            this.normalFont.drawText(16777215, String.valueOf((int)damage), this.spriteDrawY + 3 + move, this.spriteDrawX);
            return;
        }
        this.normalFont.drawText(16777215, String.valueOf((int)damage), this.spriteDrawY + 3 + move, this.spriteDrawX - 4);
    }

    public void hpOverlay() {
        if (RSInterface.interfaceCache[35000] == null) {
            return;
        }
        if (this.opponent == null) {
            return;
        }
        if (this.opponent instanceof NPC && ((NPC)this.opponent).npcDefinition == null) {
            return;
        }
        if (this.maxHealth == 0) {
            return;
        }
        if (System.currentTimeMillis() - this.hpOverlayTimer > 10000L) {
            this.opponent = null;
            return;
        }
        String oponentsName = this.opponent instanceof NPC ? ((NPC)this.opponent).npcDefinition.name : ((Player)this.opponent).name;
        double oponentsHealth = this.currentHealth;
        double oponentsMaxHealth = this.maxHealth;
        double percentage = oponentsHealth / oponentsMaxHealth;
        if (percentage > 1.0) {
            percentage = 1.0;
        }
        int width = (int)(135.0 * percentage);
        DrawingArea.drawPixels(3, 13, 145, 37, 0);
        DrawingArea.drawAlphaGradient(3, 13, 145, 37, 0, 0, 85);
        newRegularFont.drawCenteredString(oponentsName, 75, 26, 16645629, 0);
        DrawingArea.drawAlphaGradient(9, 31, 135, 15, 13369344, 13369344, 100);
        DrawingArea.drawAlphaGradient(9, 31, width, 15, 39168, 39168, 250);
        newRegularFont.drawCenteredString("" + this.currentHealth + " / " + this.maxHealth, 75, 43, 16645629, 0);
    }

    public boolean inCircle(int circleX, int circleY, int radius) {
        if (Math.pow((double)(circleX + radius - this.mouseX), (double)2.0) + Math.pow((double)(circleY + radius - this.mouseY), (double)2.0) >= Math.pow((double)radius, (double)2.0)) return false;
        return true;
    }

    public String indexLocation(int cacheIndex, int index) {
        String string;
        if (index != -1) {
            string = "" + index + ".gz";
            return Signlink.getDirectory() + "/index" + cacheIndex + "/" + string;
        }
        string = "";
        return Signlink.getDirectory() + "/index" + cacheIndex + "/" + string;
    }

    public void init() {
        try {
            nodeID = 10;
            portOff = 0;
            Client.setHighMem();
            isMembers = true;
            this.initClientFrame(clientWidth, clientHeight);
            instance = this;
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String inputbox() {
        return JOptionPane.showInputDialog((Component)null, (Object)"Enter Payment ID", (String)"Damo`s Donors", (int)1);
    }

    public boolean inSprite(boolean Click, Sprite sprite, int xCoord, int yCoord) {
        if (Click && this.clickMode3 != 1) {
            return false;
        }
        if ((Click ? this.saveClickX : this.mouseX) < xCoord) return false;
        if ((Click ? this.saveClickX : this.mouseX) > xCoord + sprite.myWidth) return false;
        if ((Click ? this.saveClickY : this.mouseY) < yCoord) return false;
        if ((Click ? this.saveClickY : this.mouseY) > yCoord + sprite.myHeight) return false;
        return true;
    }

    public boolean interfaceContainsItem(int interfaceId) {
        if (interfaceId < 0) return false;
        if (interfaceId >= RSInterface.interfaceCache.length) {
            return false;
        }
        RSInterface rsi = RSInterface.interfaceCache[interfaceId];
        if (rsi == null) {
            return false;
        }
        if (rsi.inv == null) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < rsi.inv.length; ++i) {
            if (rsi.inv[i] <= 0) continue;
            ++count;
        }
        if (count <= 0) return false;
        return true;
    }

    public String interfaceIntToString(int j) {
        if (j >= 999999999) return "*";
        return String.valueOf((int)j);
    }

    public boolean interfaceIsSelected(RSInterface class9) {
        if (class9.valueCompareType == null) {
            return false;
        }
        int i = 0;
        while (i < class9.valueCompareType.length) {
            int j = this.extractInterfaceValues(class9, i);
            int k = class9.requiredValues[i];
            if (class9.valueCompareType[i] == 2 ? j >= k : (class9.valueCompareType[i] == 3 ? j <= k : (class9.valueCompareType[i] == 4 ? j == k : j != k))) {
                return false;
            }
            ++i;
        }
        return true;
    }

    private boolean isFriend(String userName) {
        if (userName == null) {
            return false;
        }
        if (this.friendsList == null) {
            return false;
        }
        String[] arrstring = this.friendsList;
        int n = arrstring.length;
        int n2 = 0;
        while (n2 < n) {
            String friend = arrstring[n2];
            if (friend != null && friend.equalsIgnoreCase(userName)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public boolean isFriendOrSelf(String s) {
        if (s == null) {
            return false;
        }
        int i = 0;
        while (i < this.friendsCount) {
            if (s.equalsIgnoreCase(this.friendsList[i])) {
                return true;
            }
            ++i;
        }
        return s.equalsIgnoreCase(Client.myPlayer.name);
    }

    public boolean isInArea(int clickX, int clickY, int width, int height) {
        if (this.mouseX <= clickX) return false;
        if (this.mouseY <= clickY) return false;
        if (this.mouseX >= clickX + width) return false;
        if (this.mouseY >= clickY + height) return false;
        return true;
    }

    public boolean isOnXPCounter(int paddingX, int paddingY) {
        int x = 0 + (!Client.isFixed() ? paddingX - 22 : paddingX);
        int y = 46 + (!Client.isFixed() ? paddingY - 39 : paddingY);
        if (this.mouseX < this.xPaddingmapBackImage + x) return false;
        if (this.mouseX > this.xPaddingmapBackImage + x + this.XPcounterSprite[0].myWidth) return false;
        if (this.mouseY < this.yPaddingmapBackImage + y) return false;
        if (this.mouseY > this.yPaddingmapBackImage + y + this.XPcounterSprite[0].myHeight) return false;
        return true;
    }

    private boolean isSelf(String userName) {
        if (userName != null) return userName.equalsIgnoreCase(Client.myPlayer.name);
        return false;
    }

    public final void loadCensor() {
        this.archives[4] = this.streamLoaderForName(7, "chat system", "wordenc", this.expectedCRCs[7], 50);
        Censor.loadConfig(this.archives[4]);
        this.loadingFlags[4] = true;
    }

    public final void loadConfig() {
        this.archives[0] = this.streamLoaderForName(2, "config", "config", this.expectedCRCs[2], 30);
        AnimationDefinition.unpackConfig(this.archives[0]);
        ObjectDefinition.unpackConfig(this.archives[0]);
        FloorUnderlay.unpackConfig();
        FloorOverlay.unpackConfig(this.archives[0]);
        ItemDefinition.unpackConfig(this.archives[0]);
        NPCDefinition.unpackConfig(this.archives[0]);
        IDK.unpackConfig(this.archives[0]);
        SpotAnim.unpackConfig(this.archives[0]);
        Varp.unpackConfig(this.archives[0]);
        VarBit.unpackConfig(this.archives[0]);
        this.readDetails();
        this.renderMapAndCompassHalfs();
        this.loadingFlags[0] = true;
    }

    public void loadError() {
        String s = "ondemand";
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + s + ".html"));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        do {
            try {
                do {
                    Thread.sleep((long)1000L);
                } while (true);
            }
            catch (Exception exception) {
                continue;
            }
            break;
        } while (true);
    }

    public void loadingStages() {
        int j;
        if (lowMem && loadingStage == 2 && MapRegion.anInt131 != this.plane) {
            this.main3DArea.initDrawingArea();
            this.normalFont.drawText(0, "Loading - please wait.", 151, 257);
            this.normalFont.drawText(16777215, "Loading - please wait.", 150, 256);
            if (!this.resizing) {
                this.main3DArea.drawGraphics(!Client.isFixed() ? 0 : 4, this.graphics, !Client.isFixed() ? 0 : 4);
            }
            loadingStage = 1;
            this.aLong824 = System.currentTimeMillis();
        }
        if (loadingStage == 1 && (j = this.method54()) != 0 && System.currentTimeMillis() - this.aLong824 > 360000L) {
            Signlink.reporterror(this.myUsername + " glcfb " + this.aLong1215 + "," + j + "," + lowMem + "," + this.decompressors[0] + "," + onDemandFetcher.getNodeCount() + "," + this.plane + "," + anInt1069 + "," + anInt1070);
            this.aLong824 = System.currentTimeMillis();
        }
        if (loadingStage != 2) return;
        if (this.plane == this.anInt985) return;
        this.anInt985 = this.plane;
        this.method24(this.plane);
    }

    public final void loadInterfaces() {
        this.archives[1] = this.streamLoaderForName(3, "interface", "interface", this.expectedCRCs[3], 35);
        TextDrawingArea[] allFonts = new TextDrawingArea[]{this.smallFont, this.normalFont, this.boldFont, this.fancyFont};
        RSInterface.fonts = allFonts;
        RSFont[] newFonts = new RSFont[]{newSmallFont, newRegularFont, this.newBoldFont, this.newFancyFont};
        RSInterface.unpack(this.archives[1], allFonts, this.archives[2], newFonts);
        this.loadingFlags[1] = true;
    }

    public final void loadMediaIntoMemory() {
        int loop;
        int i;
        super.loadCursorImages();
        this.archives[2] = this.streamLoaderForName(4, "2d graphics", "media", this.expectedCRCs[4], 40);
        this.CrownName = new Sprite("CrownName");
        this.infinityIcon = new Sprite("infinity");
        for (int iiig = 0; iiig < this.tabArea.length; ++iiig) {
            this.tabArea[iiig] = new Sprite("tabarea " + iiig);
        }
        this.HPBarFull = new Sprite("HITPOINTS_0");
        this.HPBarEmpty = new Sprite("HITPOINTS_1");
        this.mapArea = new Sprite("maparea");
        this.magicAuto = new Sprite("autocast");
        this.loadOrbs();
        this.multiOverlay = new Sprite(this.archives[2], "overlay_multiway", 0);
        for (i = 0; i < this.mapBack.length; ++i) {
            this.mapBack[i] = new Background(this.archives[2], "mapback", i);
        }
        for (int j5 = 0; j5 < this.tabAreaSprite.length; ++j5) {
            this.tabAreaSprite[j5] = new Sprite("tabarea " + j5);
        }
        for (loop = 0; loop < this.inventoryStones.length; ++loop) {
            this.inventoryStones[loop] = new Sprite("sideicon/inventorystones " + loop);
        }
        for (int j3 = 0; j3 < this.sideIcons.length; ++j3) {
            this.sideIcons[j3] = new Sprite("sideicon/sideicons " + j3);
        }
        this.compass = new Sprite(this.archives[2], "compass", 0);
        for (int j78 = 0; j78 < this.exitButton.length; ++j78) {
            this.exitButton[j78] = new Sprite("exit " + j78);
        }
        for (int j79 = 0; j79 < this.advisorButton.length; ++j79) {
            this.advisorButton[j79] = new Sprite("advisor " + j79);
        }
        for (int ghtr = 0; ghtr < this.worldMapIcon.length; ++ghtr) {
            this.worldMapIcon[ghtr] = new Sprite("mapIcon " + ghtr);
        }
        int i4 = 0;
        do {
            int i5;
            if (i4 < this.hitMarkBacks.length) {
            } else {
                for (i4 = 0; i4 < this.hitMarkIcons.length; ++i4) {
                    this.hitMarkIcons[i4] = new Sprite("/Hits/icons/icon " + i4);
                }
                this.emptyOrb = new Sprite("emptyorb");
                this.emptyFOrb = new Sprite("emptyforb");
                this.hoveredEmpty = new Sprite("hoveredempty");
                this.hoveredFEmpty = new Sprite("hoveredfempty");
                this.runIcon1 = new Sprite("runicon1");
                this.runIcon2 = new Sprite("runicon2");
                this.runOrb1 = new Sprite("runorb1");
                this.runOrb2 = new Sprite("runorb2");
                this.hitPointsFill = new Sprite("hitpointsfill");
                this.hitPointsIcon = new Sprite("hitpointsicon");
                this.prayerFill = new Sprite("prayerfill");
                this.prayerIcon = new Sprite("prayericon");
                this.mapEdge = new Sprite(this.archives[2], "mapedge", 0);
                this.mapEdge.method345();
                try {
                    for (i = 0; i < this.XPcounterSprite.length; ++i) {
                        this.XPcounterSprite[i] = new Sprite("xp/XP " + i);
                    }
                }
                catch (Exception i2) {
                    // empty catch block
                }
                try {
                    for (int k3 = 0; k3 < 100; ++k3) {
                        this.mapScenes[k3] = new Background(this.archives[2], "mapscene", k3);
                    }
                }
                catch (Exception k3) {
                    // empty catch block
                }
                try {
                    for (int l3 = 0; l3 < 100; ++l3) {
                        this.mapFunctions[l3] = new Sprite(this.archives[2], "mapfunction", l3);
                    }
                }
                catch (Exception l3) {
                    // empty catch block
                }
                try {
                    for (int h1 = 0; h1 < 6; ++h1) {
                        this.headIconsHint[h1] = new Sprite(this.archives[2], "headicons_hint", h1);
                    }
                }
                catch (Exception h1) {
                    // empty catch block
                }
                try {
                    int j45;
                    for (int j4 = 0; j4 < 18; ++j4) {
                        this.headIcons[j4] = new Sprite("curses/Prayer " + j4);
                    }
                    for (j45 = 0; j45 < 19; ++j45) {
                        this.skullIcons[j45] = new Sprite(this.archives[2], "headicons_pk", j45);
                    }
                    for (j45 = 9; j45 < 17; ++j45) {
                        this.cursesIcons[j45] = new Sprite("curses/Prayer " + j45);
                    }
                }
                catch (Exception j45) {
                    // empty catch block
                }
                this.mapFlag = new Sprite(this.archives[2], "mapmarker", 0);
                this.mapMarker = new Sprite(this.archives[2], "mapmarker", 1);
                for (int k4 = 0; k4 < 8; ++k4) {
                    this.crosses[k4] = new Sprite(this.archives[2], "cross", k4);
                }
                this.mapDotItem = new Sprite(this.archives[2], "mapdots", 0);
                this.mapDotNPC = new Sprite(this.archives[2], "mapdots", 1);
                this.mapDotPlayer = new Sprite(this.archives[2], "mapdots", 2);
                this.mapDotFriend = new Sprite(this.archives[2], "mapdots", 3);
                this.mapDotTeam = new Sprite(this.archives[2], "mapdots", 4);
                this.mapDotClan = new Sprite(this.archives[2], "mapdots", 5);
                this.alertBack = new Sprite("alertback");
                this.alertBorder = new Sprite("alertborder");
                this.alertBorderH = new Sprite("alertborderh");
                for (loop = 0; loop < this.scrollBar.length; ++loop) {
                    this.scrollBar[loop] = new Sprite("scrollbar/scrollbar " + loop);
                }
                for (loop = 0; loop < this.scrollArrow.length; ++loop) {
                    this.scrollArrow[loop] = new Sprite("scrollbar/scrollArrow " + loop);
                }
                this.rightFrameSprite = new Sprite(this.archives[2], "screenframe", 2);
                this.loadModICons();
                Sprite sprite = new Sprite(this.archives[2], "screenframe", 0);
                this.leftFrame = Client.constructGraphicsBuffer(sprite.myWidth, sprite.myHeight, this.getGameComponent());
                sprite.method346(0, 0);
                sprite = new Sprite(this.archives[2], "screenframe", 1);
                this.topFrame = Client.constructGraphicsBuffer(sprite.myWidth, sprite.myHeight, this.getGameComponent());
                sprite.method346(0, 0);
                sprite = new Sprite(this.archives[2], "mapedge", 0);
                this.mapEdgeIP = Client.constructGraphicsBuffer(sprite.myWidth, sprite.myHeight, this.getGameComponent());
                sprite.method346(0, 0);
                i5 = (int)(Math.random() * 21.0) - 10;
                int j5 = (int)(Math.random() * 21.0) - 10;
                int k5 = (int)(Math.random() * 21.0) - 10;
                int l5 = (int)(Math.random() * 41.0) - 20;
                for (int functionIndex = 0; functionIndex < 100; ++functionIndex) {
                    if (this.mapFunctions[functionIndex] != null) {
                        this.mapFunctions[functionIndex].method344(i5 + l5, j5 + l5, k5 + l5);
                    }
                    if (this.mapScenes[functionIndex] == null) continue;
                    this.mapScenes[functionIndex].method360(i5 + l5, j5 + l5, k5 + l5);
                }
                this.coinSimpleHover = new Sprite("Interfaces/Pouch/coin");
                this.coinSimpleNormal = new Sprite("Interfaces/Pouch/coin");
                this.coinSimpleHoverToggle = new Sprite("Interfaces/Pouch/coin");
                this.coinComplexHoverToggle = new Sprite("Interfaces/Pouch/frame");
                this.coinSimpleNormalToggle = new Sprite("Interfaces/Pouch/coin");
                this.coinComplexNormalToggle = new Sprite("Interfaces/Pouch/frame");
                this.coinpartHover = new Sprite("Interfaces/Pouch/coinpart hover");
                this.coinpartNormal = new Sprite("Interfaces/Pouch/coinpart normal");
                int index = 0;
                do {
                    if (index >= this.chatAreaSprites.length) {
                        this.loadingFlags[2] = true;
                        return;
                    }
                    this.chatAreaSprites[index] = new Sprite("gameframe/chat_area/IMAGE " + index);
                    ++index;
                } while (true);
            }
            for (i5 = 0; i5 < this.hitMarkBacks[0].length; ++i5) {
                for (int i6 = 0; i6 < this.hitMarkBacks[0][0].length; ++i6) {
                    this.hitMarkBacks[i4][i5][i6] = new Sprite("/hits/back/" + i4 + "/" + i5 + "/hit " + i6);
                }
            }
            ++i4;
        } while (true);
    }

    public void loadModICons() {
        this.modIcons[0] = cacheSprite[24];
        this.modIcons[1] = cacheSprite[25];
        this.modIcons[2] = cacheSprite[26];
        this.modIcons[3] = cacheSprite[27];
        this.modIcons[4] = cacheSprite[28];
        this.modIcons[5] = cacheSprite[29];
        this.modIcons[6] = cacheSprite[30];
        this.modIcons[7] = cacheSprite[31];
        this.modIcons[8] = cacheSprite[32];
        this.modIcons[9] = cacheSprite[33];
        this.modIcons[10] = cacheSprite[34];
        this.modIcons[11] = cacheSprite[35];
        this.modIcons[12] = cacheSprite[36];
        this.modIcons[13] = cacheSprite[37];
        this.modIcons[14] = cacheSprite[38];
        this.modIcons[15] = cacheSprite[39];
        this.modIcons[16] = cacheSprite[40];
        this.modIcons[17] = cacheSprite[41];
        this.modIcons[18] = cacheSprite[42];
        this.modIcons[19] = cacheSprite[43];
        this.modIcons[20] = cacheSprite[44];
        this.modIcons[21] = cacheSprite[45];
        this.modIcons[22] = cacheSprite[45];
        this.modIcons[23] = cacheSprite[47];
        this.modIcons[24] = cacheSprite[48];
        this.modIcons[25] = cacheSprite[49];
    }

    public void loadOrbs() {
        int i;
        for (i = 0; i < this.genericOrbs.length; ++i) {
            this.genericOrbs[i] = new Sprite("Minimap Orbs/orb " + i);
        }
        for (i = 0; i < this.healthOrbs.length; ++i) {
            this.healthOrbs[i] = new Sprite("Minimap Orbs/health/orb " + i);
        }
        for (i = 0; i < this.prayerOrbs.length; ++i) {
            this.prayerOrbs[i] = new Sprite("Minimap Orbs/prayer/orb " + i);
        }
        for (i = 0; i < this.energyOrbs.length; ++i) {
            this.energyOrbs[i] = new Sprite("Minimap Orbs/energy/orb " + i);
        }
        i = 0;
        while (i < this.summoningOrbs.length) {
            this.summoningOrbs[i] = new Sprite("Minimap Orbs/summoning/orb " + i);
            ++i;
        }
    }

    public final void loadTextures() {
        this.archives[3] = this.streamLoaderForName(6, "textures", "textures", this.expectedCRCs[6], 45);
        Rasterizer.method368(this.archives[3]);
        Rasterizer.method372(0.8);
        Rasterizer.method367();
        this.loadingFlags[3] = true;
    }

    public void attemptLogin(String username, String password, boolean reconnecting) {
        Configuration.errorname = username;
        if (username.length() == 0 && password.length() == 0) {
            this.loginMessage = "Please enter your account credentials before you log in!";
            return;
        }
        if (username.length() <= 0) {
            this.loginMessage = "Your username must have 1 or more characters.";
            return;
        }
        if (password.length() <= 0) {
            this.loginMessage = "Your password must have 1 or more characters.";
            return;
        }
        this.login(username, password, reconnecting, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void login(String userName, String password, boolean reconnecting, boolean register) {
        block81 : {
            int l2;
            block80 : {
                if (this.loggedIn) {
                    return;
                }
                if (userName.isEmpty()) {
                    this.loginMessage = "Please enter your username!";
                    return;
                }
                if (userName.length() > 12) {
                    this.loginMessage = "Your username can only be 12 characters long!";
                    return;
                }
                if (password.isEmpty()) {
                    this.loginMessage = "Please enter your password!";
                    return;
                }
                if (password.length() > 20) {
                    this.loginMessage = "Your password can only be 20 characters long!";
                    return;
                }
                Signlink.errorname = userName;
                String s2 = "error";
                try {
                    int incomingOpcode;
                    this.socketStream = new RSSocket(this, this.openSocket(connectionStatus.getPort() + portOff));
                    long l = TextClass.longForName(s2);
                    int i = (int)(l >> 16 & 31L);
                    this.stream.currentOffset = 0;
                    this.stream.writeWordBigEndian(register ? 20 : 14);
                    if (!register) {
                        this.stream.writeWordBigEndian(i);
                    }
                    this.socketStream.queueBytes(register ? 1 : 2, this.stream.buffer);
                    try {
                        int captcha2 = this.socketStream.read();
                        if (captcha2 == 1) {
                            byte[] length1 = new byte[4];
                            for (int dd = 0; dd < 4; ++dd) {
                                length1[dd] = (byte)this.socketStream.read();
                            }
                            int length = this.byteArrayToInt(length1);
                            byte[] captcha = new byte[length];
                            for (int dd = 0; dd < length; ++dd) {
                                captcha[dd] = (byte)this.socketStream.read();
                            }
                            ByteArrayInputStream in = new ByteArrayInputStream(captcha);
                            BufferedImage img = ImageIO.read((InputStream)in);
                            if (this.captchaDialog != null) {
                                this.captchaDialog.dispose();
                                this.captchaDialog = null;
                            }
                            this.captchaDialog = this.showCaptcha(img);
                            this.captchaRequired = true;
                        } else if (captcha2 == 2) {
                            this.num1 = this.socketStream.read();
                            this.num2 = this.socketStream.read();
                            this.cType = this.socketStream.read();
                            if (this.captchaDialog != null) {
                                this.captchaDialog.dispose();
                                this.captchaDialog = null;
                            }
                            this.captchaDialog = this.showSimpleCaptcha();
                            System.out.println("SHOW SIMPLE CAPTHA");
                            this.captchaRequired = true;
                        } else {
                            this.captchaRequired = false;
                        }
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (!register) {
                        for (int j = 0; j < 8; ++j) {
                            this.socketStream.read();
                        }
                    }
                    int initialIncomingOpcode = incomingOpcode = this.socketStream.read();
                    if (incomingOpcode == 40) {
                        this.stream.currentOffset = 0;
                        this.aStream_847.writeString(userName);
                        this.aStream_847.writeString(password);
                        this.aStream_847.writeString(this.myEmail);
                        this.socketStream.queueBytes(this.aStream_847.currentOffset, this.aStream_847.buffer);
                    }
                    if (incomingOpcode == 0) {
                        this.socketStream.flushInputStream(this.inStream.buffer, 8);
                        this.inStream.currentOffset = 0;
                        this.aLong1215 = this.inStream.readQWord();
                        if (this.captchaRequired.booleanValue()) {
                            Object length = this.captchaLock;
                            synchronized (length) {
                                while (this.captchaAnswer == null) {
                                    this.captchaLock.wait();
                                }
                            }
                            if (this.captchaAnswer instanceof String) {
                                this.aStream_847.currentOffset = 0;
                                this.aStream_847.writeString((String)this.captchaAnswer);
                                this.socketStream.queueBytes(this.aStream_847.currentOffset, this.aStream_847.buffer);
                            } else {
                                this.socketStream.outputStream.write(((Integer)this.captchaAnswer).intValue());
                                this.socketStream.outputStream.flush();
                            }
                        }
                        int[] ai = new int[]{(int)(Math.random() * 9.9999999E7), (int)(Math.random() * 9.9999999E7), (int)(this.aLong1215 >> 32), (int)this.aLong1215};
                        this.stream.currentOffset = 0;
                        this.stream.writeWordBigEndian(10);
                        this.stream.writeDWord(ai[0]);
                        this.stream.writeDWord(ai[1]);
                        this.stream.writeDWord(ai[2]);
                        this.stream.writeDWord(ai[3]);
                        this.stream.writeString(Signlink.uid);
                        this.stream.writeString(userName);
                        this.stream.writeString(password);
                        this.stream.doKeys();
                        this.aStream_847.currentOffset = 0;
                        this.aStream_847.writeWordBigEndian(reconnecting ? 18 : 16);
                        this.aStream_847.writeWordBigEndian(this.stream.currentOffset + 1 + 1 + 2);
                        this.aStream_847.writeWordBigEndian(255);
                        this.aStream_847.writeWord(39);
                        this.aStream_847.writeWordBigEndian(1);
                        this.aStream_847.writeBytes(this.stream.buffer, this.stream.currentOffset, 0);
                        this.stream.encryption = new ISAACRandomGenerator(ai);
                        int j2 = 0;
                        while (j2 < 4) {
                            int[] arrn = ai;
                            int n = j2++;
                            arrn[n] = arrn[n] + 50;
                        }
                        this.encryption = new ISAACRandomGenerator(ai);
                        this.socketStream.queueBytes(this.aStream_847.currentOffset, this.aStream_847.buffer);
                        incomingOpcode = this.socketStream.read();
                    }
                    if (incomingOpcode == 1) {
                        try {
                            Thread.sleep((long)2000L);
                        }
                        catch (Exception ai) {
                            // empty catch block
                        }
                        if (this.captchaDialog != null) {
                            this.captchaDialog.dispose();
                            this.captchaDialog = null;
                            this.captchaAnswer = null;
                        }
                        this.login(userName, password, reconnecting, false);
                        return;
                    }
                    if (incomingOpcode == 2) {
                        this.setDetails();
                        this.loginFailures = 0;
                        int toRead = this.socketStream.read();
                        this.myPrivilege = new int[toRead];
                        for (int index = 0; index < toRead; ++index) {
                            this.myPrivilege[index] = this.socketStream.read();
                        }
                        flagged = this.socketStream.read() == 1;
                        this.aLong1220 = 0L;
                        this.anInt1022 = 0;
                        this.mouseDetection.coordsIndex = 0;
                        this.awtFocus = true;
                        this.aBoolean954 = true;
                        this.loggedIn = true;
                        this.stream.currentOffset = 0;
                        this.inStream.currentOffset = 0;
                        this.pktType = -1;
                        this.anInt841 = -1;
                        this.anInt842 = -1;
                        this.anInt843 = -1;
                        this.pktSize = 0;
                        this.anInt1009 = 0;
                        this.systemUpdatetime = 0;
                        this.anInt1011 = 0;
                        this.hintType = 0;
                        this.menuActionRow = 0;
                        this.menuOpen = false;
                        this.idleTime = 0;
                        this.chatMessages.clear();
                        this.summoningAttack = false;
                        this.itemSelected = 0;
                        this.spellSelected = 0;
                        loadingStage = 0;
                        this.currentSound = 0;
                        this.faceNorth();
                        this.minimapCover = 0;
                        this.anInt985 = -1;
                        this.destX = 0;
                        this.destY = 0;
                        this.playerCount = 0;
                        this.npcCount = 0;
                        for (int i2 = 0; i2 < this.maxPlayers; ++i2) {
                            this.playerArray[i2] = null;
                            this.aStreamArray895s[i2] = null;
                        }
                        for (int k2 = 0; k2 < 16384; ++k2) {
                            this.npcArray[k2] = null;
                        }
                        myPlayer = this.playerArray[this.myPlayerIndex] = new Player();
                        this.aClass19_1013.removeAll();
                        this.aClass19_1056.removeAll();
                        l2 = 0;
                        break block80;
                    }
                    if (incomingOpcode == 3) {
                        this.loginMessage = "Invalid username or password.";
                        return;
                    }
                    if (incomingOpcode == 4) {
                        this.loginMessage = "Your account has been Banned.\nPlease Appeal For Unban on Forums";
                        return;
                    }
                    if (incomingOpcode == 5) {
                        this.loginMessage = "Your account is already logged in.\nIf you have just left another world be patient.";
                        return;
                    }
                    if (incomingOpcode == 6) {
                        this.loginMessage = "Imagine has been updated!\nPlease reload this page.";
                        return;
                    }
                    if (incomingOpcode == 7) {
                        this.loginMessage = "This world is full.\nPlease use a different world.";
                        return;
                    }
                    if (incomingOpcode == 8) {
                        this.loginMessage = "Unable to connect.\nLogin server offline.";
                        return;
                    }
                    if (incomingOpcode == 9) {
                        this.loginMessage = "Login limit exceeded.\nToo many connections from your address.";
                        return;
                    }
                    if (incomingOpcode == 10) {
                        this.loginMessage = "Unable to connect.\nBad session id.";
                        return;
                    }
                    if (incomingOpcode == 11) {
                        this.loginMessage = "Login server rejected session.\nPlease try again.";
                        return;
                    }
                    if (incomingOpcode == 12) {
                        this.loginMessage = "You need a members account to login to this world.\nPlease subscribe, or use a different world.";
                        return;
                    }
                    if (incomingOpcode == 13) {
                        this.loginMessage = "Could not complete login.\nPlease try using a different world.";
                        return;
                    }
                    if (incomingOpcode == 14) {
                        this.loginMessage = "The server is being updated.\nPlease wait 1 minute and try again.";
                        return;
                    }
                    if (incomingOpcode == 15) {
                        this.loggedIn = true;
                        this.stream.currentOffset = 0;
                        this.inStream.currentOffset = 0;
                        this.pktType = -1;
                        this.anInt841 = -1;
                        this.anInt842 = -1;
                        this.anInt843 = -1;
                        this.pktSize = 0;
                        this.anInt1009 = 0;
                        this.systemUpdatetime = 0;
                        this.menuActionRow = 0;
                        this.menuOpen = false;
                        this.aLong824 = System.currentTimeMillis();
                        return;
                    }
                    if (incomingOpcode == 16) {
                        this.loginMessage = "Login attempts exceeded.\nPlease wait 1 minute and try again.";
                        return;
                    }
                    if (incomingOpcode == 17) {
                        this.loginMessage = "You are standing in a members-only area.\nTo play on this world move to a free area first";
                        return;
                    }
                    if (incomingOpcode == 20) {
                        this.loginMessage = "Invalid loginserver requested\nPlease try using a different world.";
                        return;
                    }
                    if (incomingOpcode == 21) {
                        break block81;
                    }
                    if (incomingOpcode == 22) {
                        this.loginMessage = "Your computer has been UUID banned.\nPlease appeal on the forums.";
                        return;
                    }
                    if (incomingOpcode == 23) {
                        this.loginMessage = "Your Hardcore Ironman account has\ndied! Feel free to make another one!";
                        return;
                    }
                    if (incomingOpcode == 24) {
                        this.loginMessage = "The client has been updated.\nPlease download the new client.";
                        return;
                    }
                    if (incomingOpcode == 30) {
                        reCaptcha = ReCaptchaComponent.main();
                        this.loginMessage = "Please enter the displayed captcha code to continue";
                        if (reCaptcha.isVisible()) {
                            return;
                        }
                        this.login(userName, password, reconnecting, false);
                        return;
                    }
                    if (incomingOpcode == 31) {
                        reCaptcha.refresh();
                        this.loginMessage = "Captcha code has been entered wrong.\nPlease try again to continue.";
                        if (reCaptcha.isVisible()) {
                            return;
                        }
                        this.login(userName, password, reconnecting, false);
                        return;
                    }
                    if (incomingOpcode != -1) {
                        this.loginMessage = "Unexpected server response\nReload Browser or use Diff World";
                        return;
                    }
                    if (initialIncomingOpcode != 0) {
                        this.loginMessage = "No response from server\nReload Browser or use Diff World";
                        return;
                    }
                    if (this.loginFailures >= 2) {
                        this.loginMessage = "Looks like your Client may be outdated.\nDownload latest Client or restart Launcher.";
                        this.loginFailures = 0;
                        return;
                    }
                    try {
                        Thread.sleep((long)2000L);
                    }
                    catch (Exception _ex) {
                        _ex.printStackTrace();
                    }
                    ++this.loginFailures;
                    if (this.captchaDialog != null) {
                        this.captchaDialog.dispose();
                        this.captchaDialog = null;
                        this.captchaAnswer = null;
                    }
                    this.login(userName, password, reconnecting, false);
                    return;
                }
                catch (Exception e) {
                    this.loginMessage = "Report on forum";
                    this.loginMessage = "Error connecting to server.";
                    return;
                }
            }
            do {
                if (l2 < 4) {
                } else {
                    this.aClass19_1179 = new NodeList();
                    this.fullscreenInterfaceID = -1;
                    this.anInt900 = 0;
                    this.friendsCount = 0;
                    this.dialogID = -1;
                    this.backDialogID = -1;
                    openInterfaceID = -1;
                    this.invOverlayInterfaceID = -1;
                    this.walkableInterfaceID = -1;
                    this.aBoolean1149 = false;
                    tabID = 3;
                    this.inputDialogState = 0;
                    this.menuOpen = false;
                    this.messagePromptRaised = false;
                    this.aString844 = null;
                    this.displayOverLayIcon = 0;
                    this.tabIconFlash = -1;
                    this.aBoolean1047 = true;
                    this.method45();
                    for (int j3 = 0; j3 < 5; ++j3) {
                        this.anIntArray990[j3] = 0;
                    }
                    for (int l3 = 0; l3 < 5; ++l3) {
                        this.atPlayerActions[l3] = null;
                        this.atPlayerArray[l3] = false;
                    }
                    anInt1175 = 0;
                    anInt1134 = 0;
                    anInt986 = 0;
                    currentWalkingQueueSize = 0;
                    anInt924 = 0;
                    anInt1188 = 0;
                    anInt1155 = 0;
                    anInt1226 = 0;
                    this.clanChat.clear();
                    this.clanChat.drawLines();
                    this.resetImageProducers2();
                    this.updateGraphics(true);
                    renderDistance = 5;
                    this.switchToFullScreen(ScreenMode.RESIZABLE);
                    if (Client.isFixed()) {
                        this.updateGameArea();
                    }
                    inputTaken = true;
                    return;
                }
                for (int i3 = 0; i3 < 104; ++i3) {
                    for (int k3 = 0; k3 < 104; ++k3) {
                        this.groundArray[l2][i3][k3] = null;
                    }
                }
                ++l2;
            } while (true);
        }
        for (int k1 = this.socketStream.read(); k1 >= 0; --k1) {
            this.loginMessage = "You have only just left another world\nYour profile will be transferred in: " + k1 + " seconds";
            this.loginRenderer.display();
            try {
                Thread.sleep((long)1000L);
                continue;
            }
            catch (Exception l3) {
                // empty catch block
            }
        }
        if (this.captchaDialog != null) {
            this.captchaDialog.dispose();
            this.captchaDialog = null;
            this.captchaAnswer = null;
        }
        this.login(userName, password, reconnecting, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public void mainGameProcessor() {
        if (this.systemUpdatetime > 1) {
            --this.systemUpdatetime;
        }
        if (this.nukeTimer > 0) {
            --this.nukeTimer;
        }
        if (this.anInt1011 > 0) {
            --this.anInt1011;
        }
        if (this.loggedIn) {
            for (int j = 0; j < 50 && this.parsePacket(); ++j) {
            }
        }
        if (!this.loggedIn) {
            return;
        }
        try {
            Player p;
            --this.canWalkDelay;
            if (this.followNPC > 0) {
                NPC n = this.npcArray[this.followNPC];
                if (n != null && !this.withinDistance(Client.myPlayer.pathX[0], Client.myPlayer.pathY[0], n.pathX[0], n.pathY[0], this.followDistance)) {
                    this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, n.pathY[0], Client.myPlayer.pathX[0], false, n.pathX[0]);
                }
            } else if (this.followPlayer > 0 && this.canWalkDelay <= 0 && (p = this.playerArray[this.followPlayer]) != null) {
                int dis = this.getDis(Client.myPlayer.pathX[0], Client.myPlayer.pathY[0], p.pathX[0], p.pathY[0]);
                if (dis > this.followDistance) {
                    this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], this.followDistance, 0, p.pathY[0], Client.myPlayer.pathX[0], false, p.pathX[0]);
                    this.canWalkDelay = 30;
                } else if (dis == 0) {
                    int rnd = this.random(4);
                    if (rnd == 0) {
                        this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, p.pathY[0], Client.myPlayer.pathX[0], false, p.pathX[0] - 2);
                    } else if (rnd == 1) {
                        this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, p.pathY[0], Client.myPlayer.pathX[0], false, p.pathX[0] + 2);
                    } else if (rnd == 2) {
                        this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, p.pathY[0] - 2, Client.myPlayer.pathX[0], false, p.pathX[0]);
                    } else if (rnd == 3) {
                        this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0], 1, 0, p.pathY[0] + 2, Client.myPlayer.pathX[0], false, p.pathX[0]);
                    }
                    this.canWalkDelay = 60;
                }
            }
        }
        catch (Exception ex2) {
            System.out.println("Exception in following, method : in process.)");
        }
        Object ex2 = this.mouseDetection.syncObject;
        synchronized (ex2) {
            block97 : {
                block101 : {
                    block99 : {
                        int[] slots;
                        Point northEast;
                        int i;
                        Point southWest;
                        block100 : {
                            block98 : {
                                block95 : {
                                    int j2;
                                    int j3;
                                    block96 : {
                                        block94 : {
                                            if (!flagged) break block94;
                                            if (this.clickMode3 == 0 && this.mouseDetection.coordsIndex < 40) break block95;
                                            this.stream.createFrame(45);
                                            this.stream.writeWordBigEndian(0);
                                            j2 = this.stream.currentOffset;
                                            j3 = 0;
                                            break block96;
                                        }
                                        this.mouseDetection.coordsIndex = 0;
                                        break block95;
                                    }
                                    for (int j4 = 0; j4 < this.mouseDetection.coordsIndex && j2 - this.stream.currentOffset < 240; ++j4) {
                                        ++j3;
                                        int l4 = this.mouseDetection.coordsY[j4];
                                        if (l4 < 0) {
                                            l4 = 0;
                                        } else if (l4 > 502) {
                                            l4 = 502;
                                        }
                                        int k5 = this.mouseDetection.coordsX[j4];
                                        if (k5 < 0) {
                                            k5 = 0;
                                        } else if (k5 > 764) {
                                            k5 = 764;
                                        }
                                        int i6 = l4 * 765 + k5;
                                        if (this.mouseDetection.coordsY[j4] == -1 && this.mouseDetection.coordsX[j4] == -1) {
                                            k5 = -1;
                                            l4 = -1;
                                            i6 = 524287;
                                        }
                                        if (k5 == this.anInt1237 && l4 == this.anInt1238) {
                                            if (this.anInt1022 >= 2047) continue;
                                            ++this.anInt1022;
                                            continue;
                                        }
                                        int j6 = k5 - this.anInt1237;
                                        this.anInt1237 = k5;
                                        int k6 = l4 - this.anInt1238;
                                        this.anInt1238 = l4;
                                        if (this.anInt1022 < 8 && j6 >= -32 && j6 <= 31 && k6 >= -32 && k6 <= 31) {
                                            this.stream.writeWord((this.anInt1022 << 12) + ((j6 += 32) << 6) + (k6 += 32));
                                            this.anInt1022 = 0;
                                            continue;
                                        }
                                        if (this.anInt1022 < 8) {
                                            this.stream.writeDWordBigEndian(8388608 + (this.anInt1022 << 19) + i6);
                                            this.anInt1022 = 0;
                                            continue;
                                        }
                                        this.stream.writeDWord(-1073741824 + (this.anInt1022 << 19) + i6);
                                        this.anInt1022 = 0;
                                    }
                                    this.stream.writeBytes(this.stream.currentOffset - j2);
                                    if (j3 < this.mouseDetection.coordsIndex) {
                                        this.mouseDetection.coordsIndex -= j3;
                                        for (int i5 = 0; i5 < this.mouseDetection.coordsIndex; ++i5) {
                                            this.mouseDetection.coordsX[i5] = this.mouseDetection.coordsX[i5 + j3];
                                            this.mouseDetection.coordsY[i5] = this.mouseDetection.coordsY[i5 + j3];
                                        }
                                    } else {
                                        this.mouseDetection.coordsIndex = 0;
                                    }
                                }
                                if (this.clickMode3 != 0) {
                                    this.resetInputField();
                                    long l = (this.aLong29 - this.aLong1220) / 50L;
                                    if (l > 4095L) {
                                        l = 4095L;
                                    }
                                    this.aLong1220 = this.aLong29;
                                    int k2 = this.saveClickY;
                                    if (k2 < 0) {
                                        k2 = 0;
                                    } else if (k2 > 502) {
                                        k2 = 502;
                                    }
                                    int k3 = this.saveClickX;
                                    if (k3 < 0) {
                                        k3 = 0;
                                    } else if (k3 > 764) {
                                        k3 = 764;
                                    }
                                    int k4 = k2 * 765 + k3;
                                    int j5 = 0;
                                    if (this.clickMode3 == 2) {
                                        j5 = 1;
                                    }
                                    int l5 = (int)l;
                                    this.stream.createFrame(241);
                                    this.stream.writeDWord((l5 << 20) + (j5 << 19) + k4);
                                }
                                if (displayZoomDuration > 0) {
                                    --displayZoomDuration;
                                }
                                for (int d = 0; d < displayAlertDuration.length; ++d) {
                                    if (displayAlertDuration[d] <= 0) continue;
                                    int[] arrn = displayAlertDuration;
                                    int n = d;
                                    arrn[n] = arrn[n] - 1;
                                }
                                if (this.anInt1016 > 0) {
                                    --this.anInt1016;
                                }
                                if (this.heldKeys[1] == 1 || this.heldKeys[2] == 1 || this.heldKeys[3] == 1 || this.heldKeys[4] == 1) {
                                    this.aBoolean1017 = true;
                                }
                                if (this.aBoolean1017 && this.anInt1016 <= 0) {
                                    this.anInt1016 = 20;
                                    this.aBoolean1017 = false;
                                    this.stream.createFrame(86);
                                    this.stream.writeWord(this.anInt1184);
                                    this.stream.method432(this.compassRotation);
                                }
                                if (this.awtFocus && !this.aBoolean954) {
                                    this.aBoolean954 = true;
                                    this.stream.createFrame(3);
                                    this.stream.writeWordBigEndian(1);
                                }
                                if (!this.awtFocus && this.aBoolean954) {
                                    this.aBoolean954 = false;
                                    this.stream.createFrame(3);
                                    this.stream.writeWordBigEndian(0);
                                }
                                this.loadingStages();
                                this.method115();
                                this.processSounds();
                                ++this.anInt1009;
                                if (this.anInt1009 > 750) {
                                    this.dropClient();
                                }
                                this.method114();
                                this.method95();
                                this.method38();
                                ++this.anInt945;
                                if (this.crossType != 0) {
                                    this.crossIndex += 20;
                                    if (this.crossIndex >= 400) {
                                        this.crossType = 0;
                                    }
                                }
                                if (this.atInventoryInterfaceType != 0) {
                                    ++this.atInventoryLoopCycle;
                                    if (this.atInventoryLoopCycle >= 15) {
                                        if (this.atInventoryInterfaceType == 2) {
                                            needDrawTabArea = true;
                                        }
                                        if (this.atInventoryInterfaceType == 3) {
                                            inputTaken = true;
                                        }
                                        this.atInventoryInterfaceType = 0;
                                    }
                                }
                                if (this.activeInterfaceType == 0) break block97;
                                ++this.anInt989;
                                if (this.mouseX > this.anInt1087 + 5 || this.mouseX < this.anInt1087 - 5 || this.mouseY > this.anInt1088 + 5 || this.mouseY < this.anInt1088 - 5) {
                                    this.aBoolean1242 = true;
                                }
                                if (this.clickMode2 != 0) break block97;
                                if (this.activeInterfaceType == 2) {
                                    needDrawTabArea = true;
                                }
                                if (this.activeInterfaceType == 3) {
                                    inputTaken = true;
                                }
                                this.activeInterfaceType = 0;
                                if (!this.aBoolean1242 || this.anInt989 < 5) break block98;
                                this.lastActiveInvInterface = -1;
                                this.processRightClick();
                                if (this.anInt1084 != 5382) break block99;
                                int xOffset = Client.isFixed() ? 0 : (this.getScreenWidth() - 765) / 2;
                                int yOffset = Client.isFixed() ? 0 : (this.getScreenHeight() - 503) / 2;
                                southWest = new Point(68 + xOffset, 75 + yOffset);
                                northEast = new Point(457 + xOffset, 41 + yOffset);
                                slots = new int[9];
                                break block100;
                            }
                            if ((this.anInt1253 == 1 || this.menuHasAddFriend(this.menuActionRow - 1)) && this.menuActionRow > 2) {
                                this.determineMenuSize();
                            } else if (this.menuActionRow > 0) {
                                this.doAction(this.menuActionRow - 1);
                            }
                            break block101;
                        }
                        for (i = 0; i < slots.length; ++i) {
                            slots[i] = i == 0 ? (int)southWest.getX() : 41 * i + (int)southWest.getX();
                        }
                        for (i = 0; i < slots.length; ++i) {
                            if (this.mouseX < slots[i] || this.mouseX > slots[i] + 42 || (double)this.mouseY < northEast.getY() || (double)this.mouseY > southWest.getY()) continue;
                            RSInterface rsi = RSInterface.interfaceCache[59050 + i];
                            if (rsi.isMouseoverTriggered) continue;
                            this.stream.createFrame(214);
                            this.stream.putLEShortA(this.anInt1084);
                            this.stream.putNegativeByte(0);
                            this.stream.putLEShortA(this.anInt1085);
                            this.stream.putLEShort(1000 + i);
                            return;
                        }
                    }
                    if (this.lastActiveInvInterface == this.anInt1084 && this.mouseInvInterfaceIndex != this.anInt1085) {
                        RSInterface class9 = RSInterface.interfaceCache[this.anInt1084];
                        int j1 = 0;
                        if (this.anInt913 == 1 && class9.contentType == 206) {
                            j1 = 1;
                        }
                        if (class9.inv[this.mouseInvInterfaceIndex] <= 0) {
                            j1 = 0;
                        }
                        if (class9.aBoolean235) {
                            int l2 = this.anInt1085;
                            int l3 = this.mouseInvInterfaceIndex;
                            class9.inv[l3] = class9.inv[l2];
                            class9.invStackSizes[l3] = class9.invStackSizes[l2];
                            class9.inv[l2] = -1;
                            class9.invStackSizes[l2] = 0;
                        } else {
                            class9.swapInventoryItems(this.anInt1085, this.mouseInvInterfaceIndex);
                        }
                        this.stream.createFrame(214);
                        this.stream.putLEShortA(this.anInt1084);
                        this.stream.putNegativeByte(j1);
                        this.stream.putLEShortA(this.anInt1085);
                        this.stream.putLEShort(this.mouseInvInterfaceIndex);
                    }
                }
                this.atInventoryLoopCycle = 10;
                this.clickMode3 = 0;
            }
            if (WorldController.anInt470 != -1) {
                int k = WorldController.anInt470;
                int k1 = WorldController.anInt471;
                boolean flag = this.calculatePath(0, 0, 0, 0, Client.myPlayer.pathY[0], 0, 0, k1, Client.myPlayer.pathX[0], true, k);
                WorldController.anInt470 = -1;
                if (flag) {
                    this.crossX = this.saveClickX;
                    this.crossY = this.saveClickY;
                    this.crossType = 1;
                    this.crossIndex = 0;
                }
            }
            if (this.clickMode3 == 1 && this.aString844 != null) {
                this.aString844 = null;
                inputTaken = true;
                this.clickMode3 = 0;
            }
            if (!this.menuOpen) {
                this.processMinimapClick(this.getMapIncreaseX(), this.getMapIncreaseY());
                this.processChatModeClick(0, this.getChatBackIncreaseY());
            }
            this.processMenuClick();
            if (this.clickMode2 == 1 || this.clickMode3 == 1) {
                ++this.anInt1213;
            }
            if (this.anInt1500 != 0 || this.anInt1044 != 0 || this.lastHoverToggleChildId != 0) {
                if (this.anInt1501 < 100) {
                    ++this.anInt1501;
                    if (this.anInt1501 == 100) {
                        if (this.anInt1500 != 0) {
                            inputTaken = true;
                        }
                        if (this.anInt1044 != 0) {
                            needDrawTabArea = true;
                        }
                    }
                }
            } else if (this.anInt1501 > 0) {
                --this.anInt1501;
            }
            if (loadingStage == 2) {
                this.method108();
            }
            if (loadingStage == 2 && this.aBoolean1160) {
                this.calcCameraPos();
            }
            int i1 = 0;
            while (i1 < 5) {
                int[] arrn = this.anIntArray1030;
                int n = i1++;
                arrn[n] = arrn[n] + 1;
            }
            this.method73();
            ++this.idleTime;
            if (this.idleTime > 24500) {
                this.anInt1011 = 250;
                this.idleTime -= 2000;
                this.stream.createFrame(202);
            }
            ++this.anInt1010;
            if (this.anInt1010 > 50) {
                this.stream.createFrame(0);
            }
            try {
                if (this.socketStream == null) return;
                if (this.stream.currentOffset <= 0) return;
                this.socketStream.queueBytes(this.stream.currentOffset, this.stream.buffer);
                this.stream.currentOffset = 0;
                this.anInt1010 = 0;
                return;
            }
            catch (IOException _ex) {
                this.dropClient();
                return;
            }
            catch (Exception exception) {
                this.resetLogout();
            }
            return;
        }
    }

    public void faceNorth() {
        this.anInt1278 = 0;
        this.anInt1131 = 0;
        this.anInt896 = 0;
        this.mapAmtDiffRotation = 0;
        this.mapAmtDiffZoom = 0;
        this.compassRotation = 0;
    }

    public boolean menuHasAddFriend(int j) {
        if (j < 0) {
            return false;
        }
        int k = this.menuActionID[j];
        if (k >= 2000) {
            k -= 2000;
        }
        if (k != 337) return false;
        return true;
    }

    public void method100(Mobile entity) {
        int l;
        NPC npc;
        if (entity.anInt1504 == 0) {
            return;
        }
        if (entity.interactingEntity != -1 && entity.interactingEntity < 32768 && (npc = this.npcArray[entity.interactingEntity > this.npcArray.length ? this.npcArray.length - 1 : entity.interactingEntity]) != null) {
            int i1 = entity.x - npc.x;
            int k1 = entity.y - npc.y;
            if (i1 != 0 || k1 != 0) {
                entity.turnDirection = (int)(Math.atan2((double)i1, (double)k1) * 325.949) & 2047;
            }
        }
        if (entity.interactingEntity >= 32768) {
            Player player;
            int j = entity.interactingEntity - 32768;
            if (j == this.unknownInt10) {
                j = this.myPlayerIndex;
            }
            if ((player = this.playerArray[j]) != null) {
                int l1 = entity.x - player.x;
                int i2 = entity.y - player.y;
                if (l1 != 0 || i2 != 0) {
                    entity.turnDirection = (int)(Math.atan2((double)l1, (double)i2) * 325.949) & 2047;
                }
            }
        }
        if (!(entity.anInt1538 == 0 && entity.anInt1539 == 0 || entity.pathLength != 0 && entity.anInt1503 <= 0)) {
            int k = entity.x - (entity.anInt1538 - baseX - baseX) * 64;
            int j1 = entity.y - (entity.anInt1539 - baseY - baseY) * 64;
            if (k != 0 || j1 != 0) {
                entity.turnDirection = (int)(Math.atan2((double)k, (double)j1) * 325.949) & 2047;
            }
            entity.anInt1538 = 0;
            entity.anInt1539 = 0;
        }
        if ((l = entity.turnDirection - entity.anInt1552 & 2047) == 0) return;
        entity.anInt1552 = l < entity.anInt1504 || l > 2048 - entity.anInt1504 ? entity.turnDirection : (l > 1024 ? (entity.anInt1552 -= entity.anInt1504) : (entity.anInt1552 += entity.anInt1504));
        entity.anInt1552 &= 2047;
        if (entity.anInt1517 != entity.standAnim) return;
        if (entity.anInt1552 == entity.turnDirection) return;
        if (entity.standTurnAnim != -1) {
            entity.anInt1517 = entity.standTurnAnim;
            return;
        }
        entity.anInt1517 = entity.walkAnim;
    }

    public void updateAnimation(Mobile entity) {
        try {
            entity.aBoolean1541 = false;
            if (entity.anInt1517 != -1) {
                AnimationDefinition animation = AnimationDefinition.getAnim(entity.anInt1517);
                ++entity.anInt1519;
                if (entity.anInt1518 < animation.frameCount && entity.anInt1519 > animation.method258(entity.anInt1518)) {
                    entity.anInt1519 = 1;
                    ++entity.anInt1518;
                    ++entity.nextIdleFrame;
                }
                if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) {
                    entity.nextIdleFrame = entity.anInt1518 + 1;
                }
                if (entity.nextIdleFrame >= animation.frameCount && entity.nextIdleFrame >= animation.frameCount) {
                    entity.nextIdleFrame = 0;
                }
                if (entity.anInt1518 >= animation.frameCount) {
                    entity.anInt1519 = 1;
                    entity.anInt1518 = 0;
                }
            }
            if (entity.graphic != -1 && loopCycle >= entity.graphicDelay) {
                if (entity.currentAnimation < 0) {
                    entity.currentAnimation = 0;
                }
                AnimationDefinition animation_1 = SpotAnim.forId((int)entity.graphic).aAnimation_407;
                ++entity.anInt1522;
                while (entity.currentAnimation < animation_1.frameCount && entity.anInt1522 > animation_1.method258(entity.currentAnimation)) {
                    entity.anInt1522 -= animation_1.method258(entity.currentAnimation);
                    ++entity.currentAnimation;
                }
                if (entity.currentAnimation >= animation_1.frameCount && (entity.currentAnimation < 0 || entity.currentAnimation >= animation_1.frameCount)) {
                    entity.graphic = -1;
                }
                if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) {
                    entity.nextGraphicFrame = entity.currentAnimation + 1;
                }
                if (entity.nextGraphicFrame >= animation_1.frameCount && (entity.nextGraphicFrame < 0 || entity.nextGraphicFrame >= animation_1.frameCount)) {
                    entity.graphic = -1;
                }
            }
            if (entity.forcedAnimation != -1 && entity.animationDelay <= 1) {
                AnimationDefinition animation_2 = AnimationDefinition.getAnim(entity.forcedAnimation);
                if (animation_2.anInt363 == 1 && entity.anInt1542 > 0 && entity.startForceMovement <= loopCycle && entity.endForceMovement < loopCycle) {
                    entity.animationDelay = 1;
                    return;
                }
            }
            if (entity.forcedAnimation != -1 && entity.animationDelay == 0) {
                AnimationDefinition animation_3 = AnimationDefinition.getAnim(entity.forcedAnimation);
                ++entity.emoteTimeRemaining;
                while (entity.displayedEmoteFrames < animation_3.frameCount && entity.emoteTimeRemaining > animation_3.method258(entity.displayedEmoteFrames)) {
                    entity.emoteTimeRemaining -= animation_3.method258(entity.displayedEmoteFrames);
                    ++entity.displayedEmoteFrames;
                }
                if (entity.displayedEmoteFrames >= animation_3.frameCount) {
                    entity.displayedEmoteFrames -= animation_3.anInt356;
                    ++entity.currentAnimationLoops;
                    if (entity.currentAnimationLoops >= animation_3.anInt362) {
                        entity.forcedAnimation = -1;
                    }
                    if (entity.displayedEmoteFrames < 0 || entity.displayedEmoteFrames >= animation_3.frameCount) {
                        entity.forcedAnimation = -1;
                    }
                }
                if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) {
                    entity.nextAnimFrame = entity.displayedEmoteFrames + 1;
                }
                if (entity.nextAnimFrame >= animation_3.frameCount) {
                    if (entity.currentAnimationLoops >= animation_3.anInt362) {
                        entity.nextAnimFrame = entity.displayedEmoteFrames + 1;
                    }
                    if (entity.nextAnimFrame < 0 || entity.nextAnimFrame >= animation_3.frameCount) {
                        entity.nextAnimFrame = entity.displayedEmoteFrames;
                    }
                }
                entity.aBoolean1541 = animation_3.aBoolean358;
            }
            if (entity.animationDelay <= 0) return;
            --entity.animationDelay;
            return;
        }
        catch (NullPointerException animation_3) {
            // empty catch block
        }
    }

    public static int fadeColors(Color color1, Color color2, float step) {
        float ratio = step / 100.0f;
        int r = (int)((float)color2.getRed() * ratio + (float)color1.getRed() * (1.0f - ratio));
        int g = (int)((float)color2.getGreen() * ratio + (float)color1.getGreen() * (1.0f - ratio));
        int b = (int)((float)color2.getBlue() * ratio + (float)color1.getBlue() * (1.0f - ratio));
        return new Color(r, g, b).getRGB();
    }

    public void method104() {
        Projectile class30_sub2_sub4_sub3 = (Projectile)this.aClass19_1056.reverseGetFirst();
        while (class30_sub2_sub4_sub3 != null) {
            if (class30_sub2_sub4_sub3.anInt1560 != this.plane || class30_sub2_sub4_sub3.aBoolean1567) {
                class30_sub2_sub4_sub3.unlink();
            } else if (loopCycle >= class30_sub2_sub4_sub3.anInt1564) {
                class30_sub2_sub4_sub3.method454(this.anInt945);
                if (class30_sub2_sub4_sub3.aBoolean1567) {
                    class30_sub2_sub4_sub3.unlink();
                } else {
                    this.worldController.method285(class30_sub2_sub4_sub3.anInt1560, 0, class30_sub2_sub4_sub3.anInt1563, -1, class30_sub2_sub4_sub3.anInt1562, 60, class30_sub2_sub4_sub3.anInt1561, class30_sub2_sub4_sub3, false);
                }
            }
            class30_sub2_sub4_sub3 = (Projectile)this.aClass19_1056.reverseGetNext();
        }
    }

    public void method107(int i, int j, Stream stream, Player player) {
        int damage;
        int type;
        int icon;
        int focusPlayer;
        block30 : {
            int j3;
            int k3;
            block31 : {
                int[] myPrivilege;
                int i1;
                block32 : {
                    if ((i & 1024) != 0) {
                        player.anInt1543 = stream.method428();
                        player.anInt1545 = stream.method428();
                        player.anInt1544 = stream.method428();
                        player.anInt1546 = stream.method428();
                        player.startForceMovement = stream.method436() + loopCycle;
                        player.endForceMovement = stream.method435() + loopCycle;
                        player.anInt1549 = stream.method428();
                        player.method446();
                    }
                    if ((i & 256) != 0) {
                        player.graphic = stream.method434();
                        int k = stream.readDWord();
                        player.anInt1524 = k >> 16;
                        player.graphicDelay = loopCycle + (k & 65535);
                        player.currentAnimation = 0;
                        player.anInt1522 = 0;
                        if (player.graphicDelay > loopCycle) {
                            player.currentAnimation = -1;
                        }
                        if (player.graphic == 65535) {
                            player.graphic = -1;
                        }
                    }
                    if ((i & 8) != 0) {
                        int l = stream.method434();
                        if (l == 65535) {
                            l = -1;
                        }
                        int i2 = stream.method427();
                        if (l == player.forcedAnimation && l != -1) {
                            int i3 = AnimationDefinition.getAnim((int)l).anInt365;
                            if (i3 == 1) {
                                player.displayedEmoteFrames = 0;
                                player.emoteTimeRemaining = 0;
                                player.animationDelay = i2;
                                player.currentAnimationLoops = 0;
                            }
                            if (i3 == 2) {
                                player.currentAnimationLoops = 0;
                            }
                        } else if (l == -1 || player.forcedAnimation == -1 || AnimationDefinition.getAnim((int)l).priority >= AnimationDefinition.getAnim((int)player.forcedAnimation).priority) {
                            player.forcedAnimation = l;
                            player.displayedEmoteFrames = 0;
                            player.emoteTimeRemaining = 0;
                            player.animationDelay = i2;
                            player.currentAnimationLoops = 0;
                            player.anInt1542 = player.pathLength;
                        }
                    }
                    if ((i & 4) != 0) {
                        player.textSpoken = stream.readString();
                        if (player.textSpoken.charAt(0) == '~') {
                            player.textSpoken = player.textSpoken.substring(1);
                        }
                        this.pushMessage("", player.name, player.textSpoken, ChatMessage.ChatType.TWO);
                        player.anInt1513 = 0;
                        player.anInt1531 = 0;
                        player.textCycle = 150;
                    }
                    if ((i & 128) == 0) break block30;
                    i1 = stream.method434();
                    int count = stream.readUnsignedByte();
                    myPrivilege = new int[count];
                    for (int index = 0; index < count; ++index) {
                        myPrivilege[index] = stream.readUnsignedByte();
                    }
                    j3 = stream.method427();
                    k3 = stream.currentOffset;
                    if (player.name == null || !player.visible) break block31;
                    long l3 = TextClass.longForName(player.name);
                    boolean flag = false;
                    if (myPrivilege[0] > 1) break block32;
                    for (int i4 = 0; i4 < this.ignoreCount; ++i4) {
                        if (this.ignoreListAsLongs[i4] != l3) {
                            continue;
                        }
                        flag = true;
                        break;
                    }
                    if (flag) break block31;
                }
                if (this.anInt1251 == 0) {
                    try {
                        String s;
                        this.aStream_834.currentOffset = 0;
                        stream.method442(j3, 0, this.aStream_834.buffer);
                        this.aStream_834.currentOffset = 0;
                        player.textSpoken = s = TextInput.method525(j3, this.aStream_834);
                        player.anInt1513 = i1 >> 8;
                        player.privelage = myPrivilege;
                        player.anInt1531 = i1 & 255;
                        player.textCycle = 150;
                        String title = "<col=" + player.titleColor() + ">" + player.getRank() + "</col>";
                        if (myPrivilege[0] > 0) {
                            this.pushMessage(title + this.getCrownsForRights(myPrivilege), player.name, s, ChatMessage.ChatType.ONE);
                        } else {
                            this.pushMessage(title, player.name, s, ChatMessage.ChatType.TWO);
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        Signlink.reporterror("cde2");
                    }
                }
            }
            stream.currentOffset = k3 + j3;
        }
        if ((i & 1) != 0) {
            player.interactingEntity = stream.method434();
            if (player.interactingEntity == 65535) {
                player.interactingEntity = -1;
            }
        }
        if ((i & 16) != 0) {
            int j1 = stream.method427();
            byte[] abyte0 = new byte[j1];
            Stream stream_1 = new Stream(abyte0);
            stream.readBytes(j1, 0, abyte0);
            this.aStreamArray895s[j] = stream_1;
            player.updatePlayer(stream_1);
        }
        if ((i & 2) != 0) {
            player.anInt1538 = stream.method436();
            player.anInt1539 = stream.method434();
        }
        if ((i & 32) != 0) {
            damage = stream.readUnsignedWord();
            type = stream.method426();
            icon = stream.readUnsignedByte();
            focusPlayer = stream.readUnsignedByte();
            player.updateHitData(type, damage, loopCycle, icon, focusPlayer, 0);
            player.loopCycleStatus = loopCycle + 300;
            player.currentHealth = stream.readUnsignedWord();
            player.maxHealth = stream.readUnsignedWord();
        }
        if ((i & 512) == 0) return;
        damage = stream.readUnsignedWord();
        type = stream.method428();
        icon = stream.readUnsignedByte();
        focusPlayer = stream.readUnsignedByte();
        player.updateHitData(type, damage, loopCycle, icon, focusPlayer, 0);
        player.loopCycleStatus = loopCycle + 300;
        player.currentHealth = stream.readUnsignedWord();
        player.maxHealth = stream.readUnsignedWord();
    }

    private void method108() {
        try {
            int j2;
            int x = Client.myPlayer.x + this.anInt1278;
            int y = Client.myPlayer.y + this.anInt1131;
            double rotSpeed = 2.0;
            if (!Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.CAMERA_GLIDE)) {
                this.screenGliding = 0;
            }
            if (this.anInt1014 - x < -500 || this.anInt1014 - x > 500 || this.anInt1015 - y < -500 || this.anInt1015 - y > 500) {
                this.anInt1014 = x;
                this.anInt1015 = y;
            }
            if (this.anInt1014 != x) {
                this.anInt1014 += (x - this.anInt1014) / 16;
            }
            if (this.anInt1015 != y) {
                this.anInt1015 += (y - this.anInt1015) / 16;
            }
            if (this.heldKeys[1] == 1) {
                this.anInt1186 = (int)((double)this.anInt1186 + (double)(-24 - this.anInt1186) / rotSpeed);
                ++this.screenGliding;
            } else if (this.heldKeys[2] == 1) {
                this.anInt1186 = (int)((double)this.anInt1186 + (double)(24 - this.anInt1186) / rotSpeed);
                ++this.screenGliding;
            } else if (this.screenGliding >= 10) {
                if (this.anInt1186 > 0) {
                    --this.anInt1186;
                } else if (this.anInt1186 < 0) {
                    ++this.anInt1186;
                }
            } else {
                this.anInt1186 = (int)((double)this.anInt1186 / rotSpeed);
            }
            if (this.heldKeys[3] == 1) {
                this.anInt1187 = (int)((double)this.anInt1187 + (double)(12 - this.anInt1187) / rotSpeed);
                ++this.screenGliding;
            } else if (this.heldKeys[4] == 1) {
                this.anInt1187 = (int)((double)this.anInt1187 + (double)(-12 - this.anInt1187) / rotSpeed);
                ++this.screenGliding;
            } else if (this.screenGliding >= 10) {
                if (this.anInt1187 > 0) {
                    --this.anInt1187;
                } else if (this.anInt1187 < 0) {
                    ++this.anInt1187;
                }
            } else {
                this.anInt1187 = (int)((double)this.anInt1187 / rotSpeed);
            }
            this.compassRotation = this.compassRotation + this.anInt1186 / (int)rotSpeed & 2047;
            this.anInt1184 = (int)((double)this.anInt1184 + (double)this.anInt1187 / rotSpeed);
            if (this.anInt1184 < 128) {
                this.anInt1184 = 128;
            }
            if (this.anInt1184 > 383) {
                this.anInt1184 = 383;
            }
            int l = this.anInt1014 >> 7;
            int i1 = this.anInt1015 >> 7;
            int j1 = this.method42(this.plane, this.anInt1015, this.anInt1014);
            int k1 = 0;
            if (l > 3 && i1 > 3 && l < 100 && i1 < 100) {
                for (int l1 = l - 4; l1 <= l + 4; ++l1) {
                    for (int k2 = i1 - 4; k2 <= i1 + 4; ++k2) {
                        int i3;
                        int l2 = this.plane;
                        if (l2 < 3 && (this.byteGroundArray[1][l1][k2] & 2) == 2) {
                            ++l2;
                        }
                        if ((i3 = j1 - this.intGroundArray[l2][l1][k2]) <= k1) continue;
                        k1 = i3;
                    }
                }
            }
            if (++anInt1005 > 1512) {
                anInt1005 = 0;
                this.stream.createFrame(77);
                this.stream.writeWordBigEndian(0);
                int i2 = this.stream.currentOffset;
                this.stream.writeWordBigEndian((int)(Math.random() * 256.0));
                this.stream.writeWordBigEndian(101);
                this.stream.writeWordBigEndian(233);
                this.stream.writeWord(45092);
                if ((int)(Math.random() * 2.0) == 0) {
                    this.stream.writeWord(35784);
                }
                this.stream.writeWordBigEndian((int)(Math.random() * 256.0));
                this.stream.writeWordBigEndian(64);
                this.stream.writeWordBigEndian(38);
                this.stream.writeWord((int)(Math.random() * 65536.0));
                this.stream.writeWord((int)(Math.random() * 65536.0));
                this.stream.writeBytes(this.stream.currentOffset - i2);
            }
            if ((j2 = k1 * 192) > 98048) {
                j2 = 98048;
            }
            if (j2 < 32768) {
                j2 = 32768;
            }
            if (j2 > this.anInt984) {
                this.anInt984 += (j2 - this.anInt984) / 24;
                return;
            }
            if (j2 >= this.anInt984) return;
            this.anInt984 += (j2 - this.anInt984) / 80;
            return;
        }
        catch (Exception _ex) {
            Signlink.reporterror("glfc_ex " + Client.myPlayer.x + "," + Client.myPlayer.y + "," + this.anInt1014 + "," + this.anInt1015 + "," + anInt1069 + "," + anInt1070 + "," + baseX + "," + baseY);
            throw new RuntimeException("eek");
        }
    }

    public void method114() {
        int i = -1;
        while (i < this.playerCount) {
            int j = i == -1 ? this.myPlayerIndex : this.playerIndices[i];
            Player player = this.playerArray[j];
            if (player != null) {
                this.method96(player);
            }
            ++i;
        }
    }

    public void method115() {
        if (loadingStage != 2) return;
        Class30_Sub1 class30_sub1 = (Class30_Sub1)this.aClass19_1179.reverseGetFirst();
        while (class30_sub1 != null) {
            if (class30_sub1.anInt1294 > 0) {
                --class30_sub1.anInt1294;
            }
            if (class30_sub1.anInt1294 == 0) {
                if (class30_sub1.anInt1299 < 0 || MapRegion.method178(class30_sub1.anInt1299, class30_sub1.anInt1301)) {
                    this.method142(class30_sub1.anInt1298, class30_sub1.anInt1295, class30_sub1.anInt1300, class30_sub1.anInt1301, class30_sub1.anInt1297, class30_sub1.anInt1296, class30_sub1.anInt1299);
                    class30_sub1.unlink();
                }
            } else {
                if (class30_sub1.anInt1302 > 0) {
                    --class30_sub1.anInt1302;
                }
                if (class30_sub1.anInt1302 == 0 && class30_sub1.anInt1297 >= 1 && class30_sub1.anInt1298 >= 1 && class30_sub1.anInt1297 <= 102 && class30_sub1.anInt1298 <= 102 && (class30_sub1.anInt1291 < 0 || MapRegion.method178(class30_sub1.anInt1291, class30_sub1.anInt1293))) {
                    this.method142(class30_sub1.anInt1298, class30_sub1.anInt1295, class30_sub1.anInt1292, class30_sub1.anInt1293, class30_sub1.anInt1297, class30_sub1.anInt1296, class30_sub1.anInt1291);
                    class30_sub1.anInt1302 = -1;
                    if (class30_sub1.anInt1291 == class30_sub1.anInt1299 && class30_sub1.anInt1299 == -1) {
                        class30_sub1.unlink();
                    } else if (class30_sub1.anInt1291 == class30_sub1.anInt1299 && class30_sub1.anInt1292 == class30_sub1.anInt1300 && class30_sub1.anInt1293 == class30_sub1.anInt1301) {
                        class30_sub1.unlink();
                    }
                }
            }
            class30_sub1 = (Class30_Sub1)this.aClass19_1179.reverseGetNext();
        }
    }

    public void method117(Stream stream) {
        stream.initBitAccess();
        int j = stream.readBits(1);
        if (j == 0) {
            return;
        }
        int k = stream.readBits(2);
        if (k == 0) {
            this.anIntArray894[this.anInt893++] = this.myPlayerIndex;
            return;
        }
        if (k == 1) {
            int l = stream.readBits(3);
            myPlayer.move(false, l);
            int k1 = stream.readBits(1);
            if (k1 != 1) return;
            this.anIntArray894[this.anInt893++] = this.myPlayerIndex;
            return;
        }
        if (k == 2) {
            int i1 = stream.readBits(3);
            myPlayer.move(true, i1);
            int l1 = stream.readBits(3);
            myPlayer.move(true, l1);
            int j2 = stream.readBits(1);
            if (j2 != 1) return;
            this.anIntArray894[this.anInt893++] = this.myPlayerIndex;
            return;
        }
        if (k != 3) return;
        this.plane = stream.readBits(2);
        int j1 = stream.readBits(1);
        int i2 = stream.readBits(1);
        if (i2 == 1) {
            this.anIntArray894[this.anInt893++] = this.myPlayerIndex;
        }
        int k2 = stream.readBits(7);
        int l2 = stream.readBits(7);
        myPlayer.setPos(l2, k2, j1 == 1);
    }

    public boolean method119(int i, int j) {
        return this.method119(i, RSInterface.interfaceCache[j]);
    }

    public boolean method119(int i, RSInterface widget) {
        boolean flag1 = false;
        if (widget == null) return flag1;
        try {
            int k = 0;
            while (k < widget.children.length) {
                int l;
                boolean flag2;
                if (widget.children[k] == -1) {
                    return flag1;
                }
                RSInterface class9_1 = RSInterface.interfaceCache[widget.children[k]];
                if (class9_1.type == 1) {
                    flag1 |= this.method119(i, class9_1.id);
                }
                if (class9_1.type == 6 && (class9_1.disabledAnimation != -1 || class9_1.anInt258 != -1) && (l = (flag2 = this.interfaceIsSelected(class9_1)) ? class9_1.anInt258 : class9_1.disabledAnimation) != -1) {
                    AnimationDefinition animation = AnimationDefinition.getAnim(l);
                    class9_1.animationDelay += i;
                    while (class9_1.animationDelay > animation.method258(class9_1.animationLength)) {
                        class9_1.animationDelay -= animation.method258(class9_1.animationLength) + 1;
                        ++class9_1.animationLength;
                        if (class9_1.animationLength >= animation.frameCount) {
                            class9_1.animationLength -= animation.anInt356;
                            if (class9_1.animationLength < 0 || class9_1.animationLength >= animation.frameCount) {
                                class9_1.animationLength = 0;
                            }
                        }
                        flag1 = true;
                    }
                }
                ++k;
            }
            return flag1;
        }
        catch (NullPointerException ex) {
            return flag1;
        }
    }

    public int method120() {
        if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TOGGLE_ROOF)) {
            return this.plane;
        }
        int j = 3;
        if (this.yCameraCurve < 310) {
            int k = this.xCameraPos >> 7;
            int l = this.yCameraPos >> 7;
            int i1 = Client.myPlayer.x >> 7;
            int j1 = Client.myPlayer.y >> 7;
            if ((this.byteGroundArray[this.plane][k][l] & 4) != 0) {
                j = this.plane;
            }
            int k1 = i1 > k ? i1 - k : k - i1;
            int l1 = j1 > l ? j1 - l : l - j1;
            if (k1 <= l1) {
                try {
                    if (l1 == 0) {
                        return 0;
                    }
                    int j2 = k1 * 65536 / l1;
                    int l2 = 32768;
                    while (l != j1) {
                        if (l < j1) {
                            ++l;
                        } else if (l > j1) {
                            --l;
                        }
                        if ((this.byteGroundArray[this.plane][k][l] & 4) != 0) {
                            j = this.plane;
                        }
                        if ((l2 += j2) < 65536) continue;
                        l2 -= 65536;
                        if (k < i1) {
                            ++k;
                        } else if (k > i1) {
                            --k;
                        }
                        if ((this.byteGroundArray[this.plane][k][l] & 4) == 0) continue;
                        j = this.plane;
                    }
                }
                catch (Exception j2) {
                    // empty catch block
                }
            } else {
                int i2 = l1 * 65536 / k1;
                int k2 = 32768;
                while (k != i1) {
                    if (k < i1) {
                        ++k;
                    } else if (k > i1) {
                        --k;
                    }
                    if ((this.byteGroundArray[this.plane][k][l] & 4) != 0) {
                        j = this.plane;
                    }
                    if ((k2 += i2) < 65536) continue;
                    k2 -= 65536;
                    if (l < j1) {
                        ++l;
                    } else if (l > j1) {
                        --l;
                    }
                    if ((this.byteGroundArray[this.plane][k][l] & 4) == 0) continue;
                    j = this.plane;
                }
            }
        }
        if ((this.byteGroundArray[this.plane][Client.myPlayer.x >> 7][Client.myPlayer.y >> 7] & 4) == 0) return j;
        return this.plane;
    }

    public int method121() {
        if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TOGGLE_ROOF)) {
            return this.plane;
        }
        int j = this.method42(this.plane, this.yCameraPos, this.xCameraPos);
        if (j - this.zCameraPos >= 800) return 3;
        if ((this.byteGroundArray[this.plane][this.xCameraPos >> 7][this.yCameraPos >> 7] & 4) == 0) return 3;
        return this.plane;
    }

    public void method130(int j, int k, int l, int i1, int j1, int k1, int l1, int i2, int j2) {
        Class30_Sub1 class30_sub1 = null;
        Class30_Sub1 class30_sub1_1 = (Class30_Sub1)this.aClass19_1179.reverseGetFirst();
        while (class30_sub1_1 != null) {
            if (class30_sub1_1.anInt1295 == l1 && class30_sub1_1.anInt1297 == i2 && class30_sub1_1.anInt1298 == j1 && class30_sub1_1.anInt1296 == i1) {
                class30_sub1 = class30_sub1_1;
                break;
            }
            class30_sub1_1 = (Class30_Sub1)this.aClass19_1179.reverseGetNext();
        }
        if (class30_sub1 == null) {
            class30_sub1 = new Class30_Sub1();
            class30_sub1.anInt1295 = l1;
            class30_sub1.anInt1296 = i1;
            class30_sub1.anInt1297 = i2;
            class30_sub1.anInt1298 = j1;
            this.method89(class30_sub1);
            this.aClass19_1179.insertHead(class30_sub1);
        }
        class30_sub1.anInt1291 = k;
        class30_sub1.anInt1293 = k1;
        class30_sub1.anInt1292 = l;
        class30_sub1.anInt1302 = j2;
        class30_sub1.anInt1294 = j;
    }

    public void method134(Stream stream) {
        int j = stream.readBits(8);
        if (j < this.playerCount) {
            for (int k = j; k < this.playerCount; ++k) {
                this.anIntArray840[this.anInt839++] = this.playerIndices[k];
            }
        }
        if (j > this.playerCount) {
            Signlink.reporterror(this.myUsername + " Too many players");
            throw new RuntimeException("eek");
        }
        this.playerCount = 0;
        int l = 0;
        while (l < j) {
            int i1 = this.playerIndices[l];
            Player player = this.playerArray[i1];
            int j1 = stream.readBits(1);
            if (j1 == 0) {
                this.playerIndices[this.playerCount++] = i1;
                player.anInt1537 = loopCycle;
            } else {
                int k1 = stream.readBits(2);
                if (k1 == 0) {
                    this.playerIndices[this.playerCount++] = i1;
                    player.anInt1537 = loopCycle;
                    this.anIntArray894[this.anInt893++] = i1;
                } else if (k1 == 1) {
                    this.playerIndices[this.playerCount++] = i1;
                    player.anInt1537 = loopCycle;
                    int l1 = stream.readBits(3);
                    player.move(false, l1);
                    int j2 = stream.readBits(1);
                    if (j2 == 1) {
                        this.anIntArray894[this.anInt893++] = i1;
                    }
                } else if (k1 == 2) {
                    this.playerIndices[this.playerCount++] = i1;
                    player.anInt1537 = loopCycle;
                    int i2 = stream.readBits(3);
                    player.move(true, i2);
                    int k2 = stream.readBits(3);
                    player.move(true, k2);
                    int l2 = stream.readBits(1);
                    if (l2 == 1) {
                        this.anIntArray894[this.anInt893++] = i1;
                    }
                } else if (k1 == 3) {
                    this.anIntArray840[this.anInt839++] = i1;
                }
            }
            ++l;
        }
    }

    public void method137(Stream stream, int j) {
        int j3;
        Item class30_sub2_sub4_sub2_3;
        int l8;
        int i6;
        int l13;
        int k11;
        NodeList class19_1;
        if (j == 84) {
            int k = stream.readUnsignedByte();
            j3 = this.anInt1268 + (k >> 4 & 7);
            i6 = this.anInt1269 + (k & 7);
            l8 = stream.readUnsignedWord();
            k11 = stream.readUnsignedWord();
            l13 = stream.readUnsignedWord();
            if (j3 < 0) return;
            if (i6 < 0) return;
            if (j3 >= 104) return;
            if (i6 >= 104) return;
            class19_1 = this.groundArray[this.plane][j3][i6];
            if (class19_1 == null) return;
            class30_sub2_sub4_sub2_3 = (Item)class19_1.reverseGetFirst();
        } else {
            if (j == 105) {
                int l = stream.readUnsignedByte();
                int k3 = this.anInt1268 + (l >> 4 & 7);
                int j6 = this.anInt1269 + (l & 7);
                int i9 = stream.readUnsignedWord();
                int l11 = stream.readUnsignedByte();
                int i14 = l11 >> 4 & 15;
                int i16 = l11 & 7;
                if (Client.myPlayer.pathX[0] >= k3 - i14 && Client.myPlayer.pathX[0] <= k3 + i14 && Client.myPlayer.pathY[0] >= j6 - i14 && Client.myPlayer.pathY[0] <= j6 + i14 && this.aBoolean848 && !lowMem && this.currentSound < 50) {
                    this.soundIds[this.currentSound] = i9;
                    this.soundType[this.currentSound] = i16;
                    this.soundDelay[this.currentSound] = Sounds.anIntArray326[i9];
                    ++this.currentSound;
                }
            }
            if (j == 215) {
                int i1 = stream.method435();
                int l3 = stream.method428();
                int k6 = this.anInt1268 + (l3 >> 4 & 7);
                int j9 = this.anInt1269 + (l3 & 7);
                int i12 = stream.method435();
                int j14 = stream.readUnsignedWord();
                if (k6 < 0) return;
                if (j9 < 0) return;
                if (k6 >= 104) return;
                if (j9 >= 104) return;
                if (i12 == this.unknownInt10) return;
                Item class30_sub2_sub4_sub2_2 = new Item();
                class30_sub2_sub4_sub2_2.ID = i1;
                class30_sub2_sub4_sub2_2.amount = j14;
                if (this.groundArray[this.plane][k6][j9] == null) {
                    this.groundArray[this.plane][k6][j9] = new NodeList();
                }
                this.groundArray[this.plane][k6][j9].insertHead(class30_sub2_sub4_sub2_2);
                this.spawnGroundItem(k6, j9);
                return;
            }
            if (j == 156) {
                int j1 = stream.method426();
                int i4 = this.anInt1268 + (j1 >> 4 & 7);
                int l6 = this.anInt1269 + (j1 & 7);
                int k9 = stream.readInt();
                if (i4 < 0) return;
                if (l6 < 0) return;
                if (i4 >= 104) return;
                if (l6 >= 104) return;
                NodeList class19 = this.groundArray[this.plane][i4][l6];
                if (class19 == null) return;
                Item item = (Item)class19.reverseGetFirst();
                while (item != null) {
                    if (item.ID != k9) {
                        item = (Item)class19.reverseGetNext();
                        continue;
                    }
                    item.unlink();
                    break;
                }
                if (class19.reverseGetFirst() == null) {
                    this.groundArray[this.plane][i4][l6] = null;
                }
                this.spawnGroundItem(i4, l6);
                return;
            }
            if (j == 160) {
                WallObject class10;
                WallDecoration class26;
                int k1 = stream.method428();
                int j4 = this.anInt1268 + (k1 >> 4 & 7);
                int i7 = this.anInt1269 + (k1 & 7);
                int l9 = stream.method428();
                int j12 = l9 >> 2;
                int k14 = l9 & 3;
                int j16 = this.anIntArray1177[j12];
                int j17 = stream.method435();
                if (j4 < 0) return;
                if (i7 < 0) return;
                if (j4 >= 103) return;
                if (i7 >= 103) return;
                int j18 = this.intGroundArray[this.plane][j4][i7];
                int i19 = this.intGroundArray[this.plane][j4 + 1][i7];
                int l19 = this.intGroundArray[this.plane][j4 + 1][i7 + 1];
                int k20 = this.intGroundArray[this.plane][j4][i7 + 1];
                if (j16 == 0 && (class10 = this.worldController.method296(this.plane, j4, i7)) != null) {
                    int k21 = class10.uid >> 14 & 32767;
                    if (j12 == 2) {
                        class10.entityOne = new Animable_Sub5(k21, 4 + k14, 2, i19, l19, j18, k20, j17, false);
                        class10.entityTwo = new Animable_Sub5(k21, k14 + 1 & 3, 2, i19, l19, j18, k20, j17, false);
                    } else {
                        class10.entityOne = new Animable_Sub5(k21, k14, j12, i19, l19, j18, k20, j17, false);
                    }
                }
                if (j16 == 1 && (class26 = this.worldController.method297(j4, i7, this.plane)) != null) {
                    class26.entity = new Animable_Sub5(class26.uid >> 14 & 32767, 0, 4, i19, l19, j18, k20, j17, false);
                }
                if (j16 == 2) {
                    InteractiveObject class28 = this.worldController.method298(j4, i7, this.plane);
                    if (j12 == 11) {
                        j12 = 10;
                    }
                    if (class28 != null) {
                        class28.animable = new Animable_Sub5(class28.uid >> 14 & 32767, k14, j12, i19, l19, j18, k20, j17, false);
                    }
                }
                if (j16 != 3) return;
                GroundDecoration class49 = this.worldController.method299(i7, j4, this.plane);
                if (class49 == null) return;
                class49.entity = new Animable_Sub5(class49.uid >> 14 & 32767, k14, 22, i19, l19, j18, k20, j17, false);
                return;
            }
            if (j == 147) {
                int k22;
                int l22;
                int i22;
                int j22;
                ObjectDefinition class46;
                Model model;
                int l1 = stream.method428();
                int k4 = this.anInt1268 + (l1 >> 4 & 7);
                int j7 = this.anInt1269 + (l1 & 7);
                int i10 = stream.readUnsignedWord();
                byte byte0 = stream.method430();
                int l14 = stream.method434();
                byte byte1 = stream.method429();
                int k17 = stream.readUnsignedWord();
                int k18 = stream.method428();
                int j19 = k18 >> 2;
                int i20 = k18 & 3;
                int l20 = this.anIntArray1177[j19];
                byte byte2 = stream.readSignedByte();
                int l21 = stream.readUnsignedWord();
                byte byte3 = stream.method429();
                Player player = i10 == this.unknownInt10 ? myPlayer : this.playerArray[i10];
                if (player != null && (model = (class46 = ObjectDefinition.forID(l21)).method578(j19, i20, i22 = this.intGroundArray[this.plane][k4][j7], j22 = this.intGroundArray[this.plane][k4 + 1][j7], k22 = this.intGroundArray[this.plane][k4 + 1][j7 + 1], l22 = this.intGroundArray[this.plane][k4][j7 + 1], -1)) != null) {
                    this.method130(k17 + 1, -1, 0, l20, j7, 0, this.plane, k4, l14 + 1);
                    player.anInt1707 = l14 + loopCycle;
                    player.anInt1708 = k17 + loopCycle;
                    player.aModel_1714 = model;
                    int i23 = class46.width;
                    int j23 = class46.length;
                    if (i20 == 1 || i20 == 3) {
                        i23 = class46.length;
                        j23 = class46.width;
                    }
                    player.anInt1711 = k4 * 128 + i23 * 64;
                    player.anInt1713 = j7 * 128 + j23 * 64;
                    player.anInt1712 = this.method42(this.plane, player.anInt1713, player.anInt1711);
                    if (byte2 > byte0) {
                        byte byte4 = byte2;
                        byte2 = byte0;
                        byte0 = byte4;
                    }
                    if (byte3 > byte1) {
                        byte byte5 = byte3;
                        byte3 = byte1;
                        byte1 = byte5;
                    }
                    player.anInt1719 = k4 + byte2;
                    player.anInt1721 = k4 + byte0;
                    player.anInt1720 = j7 + byte3;
                    player.anInt1722 = j7 + byte1;
                }
            }
            if (j == 151) {
                int i2 = stream.method426();
                int l4 = this.anInt1268 + (i2 >> 4 & 7);
                int k7 = this.anInt1269 + (i2 & 7);
                int j10 = stream.method434();
                int k12 = stream.method428();
                int i15 = k12 >> 2;
                int k16 = k12 & 3;
                int l17 = this.anIntArray1177[i15];
                if (l4 < 0) return;
                if (k7 < 0) return;
                if (l4 >= 104) return;
                if (k7 >= 104) return;
                this.method130(-1, j10, k16, l17, k7, i15, this.plane, l4, 0);
                return;
            }
            if (j == 4) {
                int j2 = stream.readUnsignedByte();
                int i5 = this.anInt1268 + (j2 >> 4 & 7);
                int l7 = this.anInt1269 + (j2 & 7);
                int k10 = stream.readUnsignedWord();
                int l12 = stream.readUnsignedByte();
                int j15 = stream.readUnsignedWord();
                if (i5 < 0) return;
                if (l7 < 0) return;
                if (i5 >= 104) return;
                if (l7 >= 104) return;
                i5 = i5 * 128 + 64;
                l7 = l7 * 128 + 64;
                Projectile class30_sub2_sub4_sub3 = new Projectile(this.plane, loopCycle, j15, k10, this.method42(this.plane, l7, i5) - l12, l7, i5);
                this.aClass19_1056.insertHead(class30_sub2_sub4_sub3);
                return;
            }
            if (j == 44) {
                int k2 = stream.method436();
                int j5 = stream.readUnsignedWord();
                int i8 = stream.readUnsignedByte();
                int l10 = this.anInt1268 + (i8 >> 4 & 7);
                int i13 = this.anInt1269 + (i8 & 7);
                String name = this.inStream.readByte() == 1 ? this.inStream.readString() : null;
                if (l10 < 0) return;
                if (i13 < 0) return;
                if (l10 >= 104) return;
                if (i13 >= 104) return;
                Item groundItem = new Item();
                groundItem.ID = k2;
                groundItem.amount = j5;
                groundItem.customName = name;
                groundItem.x = l10;
                groundItem.y = i13;
                if (this.groundArray[this.plane][l10][i13] == null) {
                    this.groundArray[this.plane][l10][i13] = new NodeList();
                }
                this.groundArray[this.plane][l10][i13].insertHead(groundItem);
                this.spawnGroundItem(l10, i13);
                return;
            }
            if (j == 101) {
                int l2 = stream.method427();
                int k5 = l2 >> 2;
                int j8 = l2 & 3;
                int i11 = this.anIntArray1177[k5];
                int j13 = stream.readUnsignedByte();
                int k15 = this.anInt1268 + (j13 >> 4 & 7);
                int l16 = this.anInt1269 + (j13 & 7);
                if (k15 < 0) return;
                if (l16 < 0) return;
                if (k15 >= 104) return;
                if (l16 >= 104) return;
                this.method130(-1, -1, j8, i11, l16, k5, this.plane, k15, 0);
                return;
            }
            if (j != 117) return;
            int i3 = stream.readUnsignedByte();
            int l5 = this.anInt1268 + (i3 >> 4 & 7);
            int k8 = this.anInt1269 + (i3 & 7);
            int j11 = l5 + stream.readSignedByte();
            int k13 = k8 + stream.readSignedByte();
            int l15 = stream.readSignedWord();
            int i17 = stream.readUnsignedWord();
            int i18 = stream.readUnsignedByte() * 4;
            int l18 = stream.readUnsignedByte() * 4;
            int k19 = stream.readUnsignedWord();
            int j20 = stream.readUnsignedWord();
            int i21 = stream.readUnsignedByte();
            int j21 = stream.readUnsignedByte();
            if (l5 < 0) return;
            if (k8 < 0) return;
            if (l5 >= 104) return;
            if (k8 >= 104) return;
            if (j11 < 0) return;
            if (k13 < 0) return;
            if (j11 >= 104) return;
            if (k13 >= 104) return;
            if (i17 == 65535) return;
            l5 = l5 * 128 + 64;
            k8 = k8 * 128 + 64;
            j11 = j11 * 128 + 64;
            k13 = k13 * 128 + 64;
            Animable_Sub4 class30_sub2_sub4_sub4 = new Animable_Sub4(i21, l18, k19 + loopCycle, j20 + loopCycle, j21, this.plane, this.method42(this.plane, k8, l5) - i18, k8, l5, l15, i17);
            class30_sub2_sub4_sub4.method455(k19 + loopCycle, k13, this.method42(this.plane, k13, j11) - l18, j11);
            this.aClass19_1013.insertHead(class30_sub2_sub4_sub4);
            return;
        }
        while (class30_sub2_sub4_sub2_3 != null) {
            if (class30_sub2_sub4_sub2_3.ID == (l8 & 32767) && class30_sub2_sub4_sub2_3.amount == k11) {
                class30_sub2_sub4_sub2_3.amount = l13;
                break;
            }
            class30_sub2_sub4_sub2_3 = (Item)class19_1.reverseGetNext();
        }
        this.spawnGroundItem(j3, i6);
    }

    public void method139(Stream stream) {
        stream.initBitAccess();
        int k = stream.readBits(8);
        if (k < this.npcCount) {
            for (int l = k; l < this.npcCount; ++l) {
                this.anIntArray840[this.anInt839++] = this.npcIndices[l];
            }
        }
        if (k > this.npcCount) {
            Signlink.reporterror(this.myUsername + " Too many npcs");
            throw new RuntimeException("eek");
        }
        this.npcCount = 0;
        int i1 = 0;
        while (i1 < k) {
            int j1 = this.npcIndices[i1];
            NPC npc = this.npcArray[j1];
            int k1 = stream.readBits(1);
            if (k1 == 0) {
                this.npcIndices[this.npcCount++] = j1;
                npc.anInt1537 = loopCycle;
            } else {
                int l1 = stream.readBits(2);
                if (l1 == 0) {
                    this.npcIndices[this.npcCount++] = j1;
                    npc.anInt1537 = loopCycle;
                    this.anIntArray894[this.anInt893++] = j1;
                } else if (l1 == 1) {
                    this.npcIndices[this.npcCount++] = j1;
                    npc.anInt1537 = loopCycle;
                    int i2 = stream.readBits(3);
                    npc.move(false, i2);
                    int k2 = stream.readBits(1);
                    if (k2 == 1) {
                        this.anIntArray894[this.anInt893++] = j1;
                    }
                } else if (l1 == 2) {
                    this.npcIndices[this.npcCount++] = j1;
                    npc.anInt1537 = loopCycle;
                    int j2 = stream.readBits(3);
                    npc.move(true, j2);
                    int l2 = stream.readBits(3);
                    npc.move(true, l2);
                    int i3 = stream.readBits(1);
                    if (i3 == 1) {
                        this.anIntArray894[this.anInt893++] = j1;
                    }
                } else if (l1 == 3) {
                    this.anIntArray840[this.anInt839++] = j1;
                }
            }
            ++i1;
        }
    }

    private void method142(int i, int j, int k, int l, int i1, int j1, int k1) {
        if (i1 < 1) return;
        if (i < 1) return;
        if (i1 > 102) return;
        if (i > 102) return;
        if (lowMem && j != this.plane) {
            return;
        }
        int i2 = 0;
        if (j1 == 0) {
            i2 = this.worldController.method300(j, i1, i);
        }
        if (j1 == 1) {
            i2 = this.worldController.method301(j, i1, i);
        }
        if (j1 == 2) {
            i2 = this.worldController.method302(j, i1, i);
        }
        if (j1 == 3) {
            i2 = this.worldController.method303(j, i1, i);
        }
        if (i2 != 0) {
            int i3 = this.worldController.getObjectConfig(j, i1, i, i2);
            int j2 = i2 >> 14 & 32767;
            int k2 = i3 & 31;
            int l2 = i3 >> 6;
            if (j1 == 0) {
                this.worldController.method291(i1, j, i, (byte)-119);
                ObjectDefinition class46 = ObjectDefinition.forID(j2);
                if (class46.aBoolean767) {
                    this.collisionMaps[j].method215(l2, k2, class46.aBoolean757, i1, i);
                }
            }
            if (j1 == 1) {
                this.worldController.method292(i, j, i1);
            }
            if (j1 == 2) {
                this.worldController.method293(j, i1, i);
                ObjectDefinition class46_1 = ObjectDefinition.forID(j2);
                if (i1 + class46_1.width > 103) return;
                if (i + class46_1.width > 103) return;
                if (i1 + class46_1.length > 103) return;
                if (i + class46_1.length > 103) {
                    return;
                }
                if (class46_1.aBoolean767) {
                    this.collisionMaps[j].method216(l2, class46_1.width, i1, i, class46_1.length, class46_1.aBoolean757);
                }
            }
            if (j1 == 3) {
                this.worldController.method294(j, i, i1);
                ObjectDefinition class46_2 = ObjectDefinition.forID(j2);
                if (class46_2.aBoolean767 && class46_2.hasActions) {
                    this.collisionMaps[j].method218(i, i1);
                }
            }
        }
        if (k1 < 0) return;
        int j3 = j;
        if (j3 < 3 && (this.byteGroundArray[1][i1][i] & 2) == 2) {
            ++j3;
        }
        MapRegion.method188(this.worldController, k, i, l, j3, this.collisionMaps[j], this.intGroundArray, i1, k1, j);
    }

    /*
     * Exception decompiling
     */
    public void method146() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[UNCONDITIONALDOLOOP]], but top level block is 8[SIMPLE_IF_TAKEN]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:809)
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

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public void method22() {
        block43 : {
            block42 : {
                block41 : {
                    try {
                        this.anInt985 = -1;
                        this.aClass19_1056.removeAll();
                        this.aClass19_1013.removeAll();
                        Rasterizer.method366();
                        this.unlinkMRUNodes();
                        this.worldController.initToNull();
                        System.gc();
                        for (i = 0; i < 4; ++i) {
                            this.collisionMaps[i].build();
                        }
                        l = 0;
lbl13: // 2 sources:
                        if (l < 4) {
                            break block41;
                        }
                        objectManager = new MapRegion(this.byteGroundArray, this.intGroundArray);
                        this.handleRegionChange();
                        if (this.aByteArrayArray1183 == null) {
                            return;
                        }
                        k2 = this.aByteArrayArray1183.length;
                        for (i1 = 0; i1 < k2; ++i1) {
                            for (i2 = 0; i2 < 2000; ++i2) {
                                if (this.anIntArray1234[i1] != this.positions[i2]) continue;
                                this.anIntArray1235[i1] = this.landScapes[i2];
                                this.anIntArray1236[i1] = this.objects[i2];
                            }
                        }
                        this.stream.createFrame(0);
                        if (!this.aBoolean1159) {
                            for (i3 = 0; i3 < k2; ++i3) {
                                i4 = (this.anIntArray1234[i3] >> 8) * 64 - Client.baseX;
                                k5 = (this.anIntArray1234[i3] & 255) * 64 - Client.baseY;
                                abyte0 = this.aByteArrayArray1183[i3];
                                if (abyte0 == null) continue;
                                objectManager.method180(abyte0, k5, i4, (Client.anInt1069 - 6) * 8, (Client.anInt1070 - 6) * 8, this.collisionMaps);
                            }
                            for (j4 = 0; j4 < k2; ++j4) {
                                l5 = (this.anIntArray1234[j4] >> 8) * 62 - Client.baseX;
                                k7 = (this.anIntArray1234[j4] & 255) * 62 - Client.baseY;
                                abyte2 = this.aByteArrayArray1183[j4];
                                if (abyte2 != null || Client.anInt1070 >= 800) continue;
                                objectManager.method174(k7, 64, 64, l5);
                            }
                            if (++Client.anInt1097 > 160) {
                                Client.anInt1097 = 0;
                                this.stream.createFrame(238);
                                this.stream.writeWordBigEndian(96);
                            }
                            this.stream.createFrame(0);
                            for (i6 = 0; i6 < k2; ++i6) {
                                abyte1 = this.aByteArrayArray1247[i6];
                                if (abyte1 == null) continue;
                                l8 = (this.anIntArray1234[i6] >> 8) * 64 - Client.baseX;
                                k9 = (this.anIntArray1234[i6] & 255) * 64 - Client.baseY;
                                objectManager.method190(l8, this.collisionMaps, k9, this.worldController, abyte1);
                            }
                        }
                        if (this.aBoolean1159) {
                            j3 = 0;
lbl57: // 2 sources:
                            if (j3 < 4) {
                                k4 = 0;
                                break block42;
                            }
                            for (l4 = 0; l4 < 13; ++l4) {
                                for (k6 = 0; k6 < 13; ++k6) {
                                    i8 = this.anIntArrayArrayArray1129[0][l4][k6];
                                    if (i8 != -1) continue;
                                    objectManager.method174(k6 * 8, 8, 8, l4 * 8);
                                }
                            }
                            this.stream.createFrame(0);
                            l6 = 0;
lbl69: // 2 sources:
                            if (l6 < 4) {
                                j8 = 0;
                                break block43;
                            }
                        }
                        this.stream.createFrame(0);
                        objectManager.method171(this.collisionMaps, this.worldController);
                        if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.FOG)) {
                            Rasterizer.newFogColor = (Integer)Client.getNextInteger(objectManager.fogColorList).getKey();
                            objectManager.fogColorList.clear();
                        }
                        this.main3DArea.initDrawingArea();
                        this.stream.createFrame(0);
                        k3 = MapRegion.setZ;
                        if (k3 > this.plane) {
                            k3 = this.plane;
                        }
                        if (k3 < this.plane - 1) {
                            k3 = this.plane - 1;
                        }
                        if (Client.lowMem) {
                            this.worldController.method275(MapRegion.setZ);
                        } else {
                            this.worldController.method275(0);
                        }
                        for (i5 = 0; i5 < 104; ++i5) {
                            for (i7 = 0; i7 < 104; ++i7) {
                                this.spawnGroundItem(i5, i7);
                            }
                        }
                        if (++Client.anInt1051 > 98) {
                            Client.anInt1051 = 0;
                            this.stream.createFrame(150);
                        }
                        this.method63();
                        ObjectDefinition.mruNodes1.unlinkAll();
                        if (this.gameFrame != null) {
                            this.stream.createFrame(210);
                            this.stream.writeDWord(1057001181);
                        }
                        System.gc();
                        Rasterizer.method367();
                        Client.onDemandFetcher.method566();
                        k = (Client.anInt1069 - 6) / 8 - 1;
                        j1 = (Client.anInt1069 + 6) / 8 + 1;
                        i2 = (Client.anInt1070 - 6) / 8 - 1;
                        l2 = (Client.anInt1070 + 6) / 8 + 1;
                        if (this.aBoolean1141) {
                            k = 49;
                            j1 = 50;
                            i2 = 49;
                            l2 = 50;
                        }
                        l3 = k;
                        while (l3 <= j1) {
                            for (j5 = i2; j5 <= l2; ++j5) {
                                if (l3 != k && l3 != j1 && j5 != i2 && j5 != l2) continue;
                                j7 = Client.onDemandFetcher.method562(0, j5, l3);
                                if (j7 != -1) {
                                    Client.onDemandFetcher.method560(j7, 3);
                                }
                                if ((k8 = Client.onDemandFetcher.method562(1, j5, l3)) == -1) continue;
                                Client.onDemandFetcher.method560(k8, 3);
                            }
                            ++l3;
                        }
                        return;
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    return;
                }
                for (k1 = 0; k1 < 104; ++k1) {
                    for (j2 = 0; j2 < 104; ++j2) {
                        this.byteGroundArray[l][k1][j2] = 0;
                    }
                }
                ++l;
                ** GOTO lbl13
            }
            block19 : do {
                block44 : {
                    if (k4 < 13) break block44;
                    ++j3;
                    ** GOTO lbl57
                }
                j6 = 0;
                do {
                    block46 : {
                        block47 : {
                            block45 : {
                                if (j6 >= 13) break block45;
                                l7 = this.anIntArrayArrayArray1129[j3][k4][j6];
                                if (l7 == -1) break block46;
                                i9 = l7 >> 24 & 3;
                                l9 = l7 >> 1 & 3;
                                j10 = l7 >> 14 & 1023;
                                l10 = l7 >> 3 & 2047;
                                j11 = (j10 / 8 << 8) + l10 / 8;
                                break block47;
                            }
                            ++k4;
                            continue block19;
                        }
                        for (l11 = 0; l11 < this.anIntArray1234.length; ++l11) {
                            if (this.anIntArray1234[l11] != j11 || this.aByteArrayArray1183[l11] == null) continue;
                            objectManager.method179(i9, l9, this.collisionMaps, k4 * 8, (j10 & 7) * 8, this.aByteArrayArray1183[l11], (l10 & 7) * 8, j3, j6 * 8);
                            break;
                        }
                    }
                    ++j6;
                } while (true);
                break;
            } while (true);
        }
        block22 : do {
            block48 : {
                if (j8 < 13) break block48;
                ++l6;
                ** GOTO lbl69
            }
            j9 = 0;
            do {
                block50 : {
                    block51 : {
                        block49 : {
                            if (j9 >= 13) break block49;
                            i10 = this.anIntArrayArrayArray1129[l6][j8][j9];
                            if (i10 == -1) break block50;
                            k10 = i10 >> 24 & 3;
                            i11 = i10 >> 1 & 3;
                            k11 = i10 >> 14 & 1023;
                            i12 = i10 >> 3 & 2047;
                            j12 = (k11 / 8 << 8) + i12 / 8;
                            break block51;
                        }
                        ++j8;
                        continue block22;
                    }
                    for (k12 = 0; k12 < this.anIntArray1234.length; ++k12) {
                        if (this.anIntArray1234[k12] != j12 || this.aByteArrayArray1247[k12] == null) continue;
                        objectManager.method183(this.collisionMaps, this.worldController, k10, j8 * 8, (i12 & 7) * 8, l6, this.aByteArrayArray1247[k12], (k11 & 7) * 8, i11, j9 * 8);
                        break;
                    }
                }
                ++j9;
            } while (true);
            break;
        } while (true);
    }

    public void method24(int i) {
        int[] ai = this.miniMapImage.myPixels;
        int j = ai.length;
        for (int k = 0; k < j; ++k) {
            ai[k] = 0;
        }
        for (int l = 1; l < 103; ++l) {
            int i1 = 24628 + (103 - l) * 512 * 4;
            for (int k1 = 1; k1 < 103; i1 += 4, ++k1) {
                if ((this.byteGroundArray[i][k1][l] & 24) == 0) {
                    this.worldController.method309(ai, i1, i, k1, l);
                }
                if (i >= 3 || (this.byteGroundArray[i + 1][k1][l] & 8) == 0) continue;
                this.worldController.method309(ai, i1, i + 1, k1, l);
            }
        }
        int j1 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
        int l1 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
        this.miniMapImage.method343();
        for (int i2 = 1; i2 < 103; ++i2) {
            for (int j2 = 1; j2 < 103; ++j2) {
                if ((this.byteGroundArray[i][j2][i2] & 24) == 0) {
                    this.method50(i2, j1, j2, l1, i);
                }
                if (i >= 3 || (this.byteGroundArray[i + 1][j2][i2] & 8) == 0) continue;
                this.method50(i2, j1, j2, l1, i + 1);
            }
        }
        try {
            this.main3DArea.initDrawingArea();
            this.totalMapFunctions = 0;
            int k2 = 0;
            do {
                if (k2 >= 104) {
                    this.customMapIcons.put((Object)0, (Object)new int[]{5, 2524, 4029});
                    this.customMapIcons.put((Object)1, (Object)new int[]{5, 2531, 4029});
                    this.customMapIcons.put((Object)2, (Object)new int[]{0, 2556, 3995});
                    this.customMapIcons.put((Object)3, (Object)new int[]{5, 2557, 4005});
                    this.customMapIcons.put((Object)4, (Object)new int[]{5, 2557, 3985});
                    this.customMapIcons.put((Object)5, (Object)new int[]{38, 2550, 3974});
                    this.customMapIcons.put((Object)6, (Object)new int[]{34, 2550, 4022});
                    this.customMapIcons.put((Object)7, (Object)new int[]{5, 2543, 4027});
                    this.customMapIcons.put((Object)8, (Object)new int[]{10, 2543, 4031});
                    this.customMapIcons.put((Object)9, (Object)new int[]{9, 2547, 4031});
                    this.customMapIcons.put((Object)10, (Object)new int[]{8, 2557, 4029});
                    this.customMapIcons.put((Object)11, (Object)new int[]{19, 2521, 4015});
                    return;
                }
                for (int l2 = 0; l2 < 104; ++l2) {
                    int i3 = this.worldController.method303(this.plane, k2, l2);
                    if (i3 == 0) continue;
                    i3 = i3 >> 14 & 32767;
                    int j3 = ObjectDefinition.forID((int)i3).anInt746;
                    if (j3 < 0) continue;
                    int k3 = k2;
                    int l3 = l2;
                    if (j3 != 22 && j3 != 29 && j3 != 34 && j3 != 36 && j3 != 46 && j3 != 47 && j3 != 48) {
                        int byte0 = 104;
                        int byte1 = 104;
                        int[][] ai1 = this.collisionMaps[this.plane].clipData;
                        for (int i4 = 0; i4 < 10; ++i4) {
                            int j4 = (int)(Math.random() * 4.0);
                            if (j4 == 0 && k3 > 0 && k3 > k2 - 3 && (ai1[k3 - 1][l3] & 19398920) == 0) {
                                --k3;
                            }
                            if (j4 == 1 && k3 < byte0 - 1 && k3 < k2 + 3 && (ai1[k3 + 1][l3] & 19399040) == 0) {
                                ++k3;
                            }
                            if (j4 == 2 && l3 > 0 && l3 > l2 - 3 && (ai1[k3][l3 - 1] & 19398914) == 0) {
                                --l3;
                            }
                            if (j4 != 3 || l3 >= byte1 - 1 || l3 >= l2 + 3 || (ai1[k3][l3 + 1] & 19398944) != 0) continue;
                            ++l3;
                        }
                    }
                    this.currentMapFunctions[this.totalMapFunctions] = this.mapFunctions[j3];
                    this.mapFunctionX[this.totalMapFunctions] = k3;
                    this.mapFunctionY[this.totalMapFunctions] = l3;
                    ++this.totalMapFunctions;
                }
                ++k2;
            } while (true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void method26(boolean flag) {
        int j = 0;
        while (j < this.npcCount) {
            block5 : {
                NPC npc;
                int k;
                block6 : {
                    boolean hideNpc;
                    npc = this.npcArray[this.npcIndices[j]];
                    k = 536870912 + (this.npcIndices[j] << 14);
                    int x = baseX + (Client.myPlayer.x - 6 >> 7);
                    int y = baseY + (Client.myPlayer.y - 6 >> 7);
                    if (npc == null) break block5;
                    boolean bl = hideNpc = x >= 2497 && x <= 2559 && y >= 3969 && y <= 4031 && npc.npcDefinition != null && npc.npcDefinition.name != null && npc.npcDefinition.name.toLowerCase().contains((CharSequence)"pet") || npc.npcDefinition.name.toLowerCase().equalsIgnoreCase("pumpkin") && !wearingPumpkin;
                    if (hideNpc || !npc.isVisible() || npc.npcDefinition.aBoolean93 != flag) break block5;
                    int l = npc.x >> 7;
                    int i1 = npc.y >> 7;
                    if (l < 0 || l >= 104 || i1 < 0 || i1 >= 104) break block5;
                    if (npc.tileSize != 1 || (npc.x & 127) != 64 || (npc.y & 127) != 64) break block6;
                    if (this.anIntArrayArray929[l][i1] == this.anInt1265) break block5;
                    this.anIntArrayArray929[l][i1] = this.anInt1265;
                }
                if (!npc.npcDefinition.aBoolean84) {
                    k -= Integer.MIN_VALUE;
                }
                this.worldController.method285(this.plane, npc.anInt1552, this.method42(this.plane, npc.y, npc.x), k, npc.y, (npc.tileSize - 1) * 64 + 60, npc.x, npc, npc.aBoolean1541);
            }
            ++j;
        }
    }

    public void method33(int i) {
        if (i < 0) return;
        if (i >= Varp.cache.length) {
            return;
        }
        int j = Varp.cache[i].anInt709;
        if (j == 0) {
            return;
        }
        int k = this.variousSettings[i];
        if (j == 1) {
            if (k == 1) {
                Rasterizer.method372(0.9);
            }
            if (k == 2) {
                Rasterizer.method372(0.8);
            }
            if (k == 3) {
                Rasterizer.method372(0.7);
            }
            if (k == 4) {
                Rasterizer.method372(0.6);
            }
            ItemDefinition.mruNodes1.unlinkAll();
            this.welcomeScreenRaised = true;
        }
        if (j == 3) {
            boolean flag1 = this.musicEnabled;
            if (k == 0) {
                this.adjustVolume(this.musicEnabled, 0);
                this.musicEnabled = true;
            }
            if (k == 1) {
                this.adjustVolume(this.musicEnabled, -400);
                this.musicEnabled = true;
            }
            if (k == 2) {
                this.adjustVolume(this.musicEnabled, -800);
                this.musicEnabled = true;
            }
            if (k == 3) {
                this.adjustVolume(this.musicEnabled, -1200);
                this.musicEnabled = true;
            }
            if (k == 4) {
                this.musicEnabled = false;
            }
            if (this.musicEnabled != flag1 && !lowMem) {
                if (this.musicEnabled) {
                    this.nextSong = this.currentSong;
                    onDemandFetcher.loadMandatory(2, this.nextSong);
                } else {
                    this.stopMidi();
                }
                this.prevSong = 0;
            }
        }
        if (j == 4) {
            if (k == 0) {
                this.aBoolean848 = true;
                this.setWaveVolume(0);
            }
            if (k == 1) {
                this.aBoolean848 = true;
                this.setWaveVolume(-400);
            }
            if (k == 2) {
                this.aBoolean848 = true;
                this.setWaveVolume(-800);
            }
            if (k == 3) {
                this.aBoolean848 = true;
                this.setWaveVolume(-1200);
            }
            if (k == 4) {
                this.aBoolean848 = false;
            }
        }
        if (j == 5) {
            this.anInt1253 = k;
        }
        if (j == 6) {
            this.anInt1249 = k;
        }
        if (j == 8) {
            this.splitPrivateChat = k;
            inputTaken = true;
        }
        if (j != 9) return;
        this.anInt913 = k;
    }

    public void method37(int j) {
        try {
            int k2;
            byte[] abyte2;
            Background background_2;
            int i1;
            int l1;
            byte[] abyte5;
            if (Rasterizer.anIntArray1480[17] >= j) {
                Background background = Rasterizer.aBackgroundArray1474s[17];
                int k = background.anInt1452 * background.anInt1453 - 1;
                int j1 = background.anInt1452 * this.anInt945 * 2;
                byte[] abyte0 = background.aByteArray1450;
                byte[] abyte3 = this.aByteArray912;
                for (int i2 = 0; i2 <= k; ++i2) {
                    abyte3[i2] = abyte0[i2 - j1 & k];
                }
                background.aByteArray1450 = abyte3;
                this.aByteArray912 = abyte0;
                Rasterizer.method370(17);
                if (++anInt854 > 1235) {
                    anInt854 = 0;
                    this.stream.createFrame(226);
                    this.stream.writeWordBigEndian(0);
                    int l2 = this.stream.currentOffset;
                    this.stream.writeWord(58722);
                    this.stream.writeWordBigEndian(240);
                    this.stream.writeWord((int)(Math.random() * 65536.0));
                    this.stream.writeWordBigEndian((int)(Math.random() * 256.0));
                    if ((int)(Math.random() * 2.0) == 0) {
                        this.stream.writeWord(51825);
                    }
                    this.stream.writeWordBigEndian((int)(Math.random() * 256.0));
                    this.stream.writeWord((int)(Math.random() * 65536.0));
                    this.stream.writeWord(7130);
                    this.stream.writeWord((int)(Math.random() * 65536.0));
                    this.stream.writeWord(61657);
                    this.stream.writeBytes(this.stream.currentOffset - l2);
                }
            }
            if (Rasterizer.anIntArray1480[24] >= j) {
                Background background_1 = Rasterizer.aBackgroundArray1474s[24];
                int l = background_1.anInt1452 * background_1.anInt1453 - 1;
                int k1 = background_1.anInt1452 * this.anInt945 * 2;
                byte[] abyte1 = background_1.aByteArray1450;
                byte[] abyte4 = this.aByteArray912;
                for (int j2 = 0; j2 <= l; ++j2) {
                    abyte4[j2] = abyte1[j2 - k1 & l];
                }
                background_1.aByteArray1450 = abyte4;
                this.aByteArray912 = abyte1;
                Rasterizer.method370(24);
            }
            if (Rasterizer.anIntArray1480[34] >= j) {
                background_2 = Rasterizer.aBackgroundArray1474s[34];
                i1 = background_2.anInt1452 * background_2.anInt1453 - 1;
                l1 = background_2.anInt1452 * this.anInt945 * 2;
                abyte2 = background_2.aByteArray1450;
                abyte5 = this.aByteArray912;
                for (k2 = 0; k2 <= i1; ++k2) {
                    abyte5[k2] = abyte2[k2 - l1 & i1];
                }
                background_2.aByteArray1450 = abyte5;
                this.aByteArray912 = abyte2;
                Rasterizer.method370(34);
            }
            if (Rasterizer.anIntArray1480[40] >= j) {
                background_2 = Rasterizer.aBackgroundArray1474s[40];
                i1 = background_2.anInt1452 * background_2.anInt1453 - 1;
                l1 = background_2.anInt1452 * this.anInt945 * 2;
                abyte2 = background_2.aByteArray1450;
                abyte5 = this.aByteArray912;
                for (k2 = 0; k2 <= i1; ++k2) {
                    abyte5[k2] = abyte2[k2 - l1 & i1];
                }
                background_2.aByteArray1450 = abyte5;
                this.aByteArray912 = abyte2;
                Rasterizer.method370(40);
            }
            int i = 51;
            while (i < 67) {
                if (Rasterizer.anIntArray1480[i] >= j) {
                    Background background_22 = Rasterizer.aBackgroundArray1474s[i];
                    int i12 = background_22.anInt1452 * background_22.anInt1453 - 1;
                    int l12 = background_22.anInt1452 * this.anInt945 * 2;
                    byte[] abyte22 = background_22.aByteArray1450;
                    byte[] abyte52 = this.aByteArray912;
                    for (int k22 = 0; k22 <= i12; ++k22) {
                        abyte52[k22] = abyte22[k22 - l12 & i12];
                    }
                    background_22.aByteArray1450 = abyte52;
                    this.aByteArray912 = abyte22;
                    Rasterizer.method370(i);
                }
                ++i;
            }
            return;
        }
        catch (Exception i) {
            // empty catch block
        }
    }

    public void method38() {
        for (int i = -1; i < this.playerCount; ++i) {
            int j = i == -1 ? this.myPlayerIndex : this.playerIndices[i];
            Player player = this.playerArray[j];
            if (player == null || player.textCycle <= 0) continue;
            --player.textCycle;
            if (player.textCycle != 0) continue;
            player.textSpoken = null;
        }
        int k = 0;
        while (k < this.npcCount) {
            int l = this.npcIndices[k];
            NPC npc = this.npcArray[l];
            if (npc != null && npc.textCycle > 0) {
                --npc.textCycle;
                if (npc.textCycle == 0) {
                    npc.textSpoken = null;
                }
            }
            ++k;
        }
    }

    public int method42(int i, int j, int k) {
        int l = k >> 7;
        int i1 = j >> 7;
        if (l < 0) return 0;
        if (i1 < 0) return 0;
        if (l > 103) return 0;
        if (i1 > 103) {
            return 0;
        }
        int j1 = i;
        if (j1 < 3 && (this.byteGroundArray[1][l][i1] & 2) == 2) {
            ++j1;
        }
        int k1 = k & 127;
        int l1 = j & 127;
        int i2 = this.intGroundArray[j1][l][i1] * (128 - k1) + this.intGroundArray[j1][l + 1][i1] * k1 >> 7;
        int j2 = this.intGroundArray[j1][l][i1 + 1] * (128 - k1) + this.intGroundArray[j1][l + 1][i1 + 1] * k1 >> 7;
        return i2 * (128 - l1) + j2 * l1 >> 7;
    }

    public void method45() {
        this.aBoolean1031 = true;
        int j = 0;
        while (j < 7) {
            this.anIntArray1065[j] = -1;
            for (int k = 0; k < IDK.length; ++k) {
                if (IDK.cache[k].aBoolean662 || IDK.cache[k].anInt657 != j + (this.aBoolean1047 ? 0 : 7)) continue;
                this.anIntArray1065[j] = k;
                break;
            }
            ++j;
        }
    }

    public void method46(int i, Stream stream) {
        int k;
        while (stream.bitPosition + 21 < i * 8 && (k = stream.readBits(14)) != 16383) {
            int i1;
            if (this.npcArray[k] == null) {
                this.npcArray[k] = new NPC();
            }
            NPC npc = this.npcArray[k];
            this.npcIndices[this.npcCount++] = k;
            npc.anInt1537 = loopCycle;
            int l = stream.readBits(5);
            if (l > 15) {
                l -= 32;
            }
            if ((i1 = stream.readBits(5)) > 15) {
                i1 -= 32;
            }
            int j1 = stream.readBits(1);
            npc.npcDefinition = NPCDefinition.forID(stream.readBits(18));
            int k1 = stream.readBits(1);
            if (k1 == 1) {
                this.anIntArray894[this.anInt893++] = k;
            }
            npc.tileSize = npc.npcDefinition.boundDim;
            npc.anInt1504 = npc.npcDefinition.anInt79;
            npc.walkAnim = npc.npcDefinition.walkAnim;
            npc.turn160DefAnim = npc.npcDefinition.anInt58;
            npc.turn90CWAnim = npc.npcDefinition.anInt83;
            npc.turn90CCAnim = npc.npcDefinition.anInt55;
            npc.standAnim = npc.npcDefinition.standAnim;
            npc.setPos(Client.myPlayer.pathX[0] + i1, Client.myPlayer.pathY[0] + l, j1 == 1);
        }
        stream.finishBitAccess();
    }

    public void method47(boolean flag) {
        if (Client.myPlayer.x >> 7 == this.destX && Client.myPlayer.y >> 7 == this.destY) {
            this.destX = 0;
        }
        int j = this.playerCount;
        if (flag) {
            j = 1;
        }
        int l = 0;
        while (l < j) {
            block8 : {
                int i1;
                Player player;
                block10 : {
                    int k1;
                    int j1;
                    block9 : {
                        if (flag) {
                            player = myPlayer;
                            i1 = this.myPlayerIndex << 14;
                        } else {
                            player = this.playerArray[this.playerIndices[l]];
                            i1 = this.playerIndices[l] << 14;
                        }
                        if (player == null || !player.isVisible()) break block8;
                        player.aBoolean1699 = (lowMem && this.playerCount > 50 || this.playerCount > 200) && !flag && player.anInt1517 == player.standAnim;
                        j1 = player.x >> 7;
                        k1 = player.y >> 7;
                        if (j1 < 0 || j1 >= 104 || k1 < 0 || k1 >= 104) break block8;
                        if (player.aModel_1714 == null || loopCycle < player.anInt1707 || loopCycle >= player.anInt1708) break block9;
                        player.aBoolean1699 = false;
                        player.anInt1709 = this.method42(this.plane, player.y, player.x);
                        this.worldController.method286(this.plane, player.y, player, player.anInt1552, player.anInt1722, player.x, player.anInt1709, player.anInt1719, player.anInt1721, i1, player.anInt1720);
                        break block8;
                    }
                    if ((player.x & 127) != 64 || (player.y & 127) != 64) break block10;
                    if (this.anIntArrayArray929[j1][k1] == this.anInt1265) break block8;
                    this.anIntArrayArray929[j1][k1] = this.anInt1265;
                }
                player.anInt1709 = this.method42(this.plane, player.y, player.x);
                this.worldController.method285(this.plane, player.anInt1552, player.anInt1709, i1, player.y, 60, player.x, player, player.aBoolean1541);
            }
            ++l;
        }
    }

    public void method49(Stream stream) {
        int j = 0;
        while (j < this.anInt893) {
            int k = this.anIntArray894[j];
            Player player = this.playerArray[k];
            int l = stream.readUnsignedByte();
            if ((l & 64) != 0) {
                l += stream.readUnsignedByte() << 8;
            }
            this.method107(l, k, stream, player);
            ++j;
        }
    }

    public void method50(int i, int k, int l, int i1, int j1) {
        int k1 = this.worldController.method300(j1, l, i);
        if (k1 != 0) {
            int l1 = this.worldController.getObjectConfig(j1, l, i, k1);
            int k2 = l1 >> 6 & 3;
            int i3 = l1 & 31;
            int k3 = k;
            if (k1 > 0) {
                k3 = i1;
            }
            int[] ai = this.miniMapImage.myPixels;
            int k4 = 24624 + l * 4 + (103 - i) * 512 * 4;
            int i5 = k1 >> 14 & 32767;
            ObjectDefinition class46_2 = ObjectDefinition.forID(i5);
            if (class46_2.anInt758 != -1) {
                Background background_2 = this.mapScenes[class46_2.anInt758];
                if (background_2 != null) {
                    int i6 = (class46_2.width * 4 - background_2.anInt1452) / 2;
                    int j6 = (class46_2.length * 4 - background_2.anInt1453) / 2;
                    background_2.drawBackground(48 + l * 4 + i6, 48 + (104 - i - class46_2.length) * 4 + j6);
                }
            } else {
                if (i3 == 0 || i3 == 2) {
                    if (k2 == 0) {
                        ai[k4] = k3;
                        ai[k4 + 512] = k3;
                        ai[k4 + 1024] = k3;
                        ai[k4 + 1536] = k3;
                    } else if (k2 == 1) {
                        ai[k4] = k3;
                        ai[k4 + 1] = k3;
                        ai[k4 + 2] = k3;
                        ai[k4 + 3] = k3;
                    } else if (k2 == 2) {
                        ai[k4 + 3] = k3;
                        ai[k4 + 3 + 512] = k3;
                        ai[k4 + 3 + 1024] = k3;
                        ai[k4 + 3 + 1536] = k3;
                    } else if (k2 == 3) {
                        ai[k4 + 1536] = k3;
                        ai[k4 + 1536 + 1] = k3;
                        ai[k4 + 1536 + 2] = k3;
                        ai[k4 + 1536 + 3] = k3;
                    }
                }
                if (i3 == 3) {
                    if (k2 == 0) {
                        ai[k4] = k3;
                    } else if (k2 == 1) {
                        ai[k4 + 3] = k3;
                    } else if (k2 == 2) {
                        ai[k4 + 3 + 1536] = k3;
                    } else if (k2 == 3) {
                        ai[k4 + 1536] = k3;
                    }
                }
                if (i3 == 2) {
                    if (k2 == 3) {
                        ai[k4] = k3;
                        ai[k4 + 512] = k3;
                        ai[k4 + 1024] = k3;
                        ai[k4 + 1536] = k3;
                    } else if (k2 == 0) {
                        ai[k4] = k3;
                        ai[k4 + 1] = k3;
                        ai[k4 + 2] = k3;
                        ai[k4 + 3] = k3;
                    } else if (k2 == 1) {
                        ai[k4 + 3] = k3;
                        ai[k4 + 3 + 512] = k3;
                        ai[k4 + 3 + 1024] = k3;
                        ai[k4 + 3 + 1536] = k3;
                    } else if (k2 == 2) {
                        ai[k4 + 1536] = k3;
                        ai[k4 + 1536 + 1] = k3;
                        ai[k4 + 1536 + 2] = k3;
                        ai[k4 + 1536 + 3] = k3;
                    }
                }
            }
        }
        if ((k1 = this.worldController.method302(j1, l, i)) != 0) {
            int i2 = this.worldController.getObjectConfig(j1, l, i, k1);
            int l2 = i2 >> 6 & 3;
            int j3 = i2 & 31;
            int l3 = k1 >> 14 & 32767;
            ObjectDefinition class46_1 = ObjectDefinition.forID(l3);
            if (class46_1.anInt758 != -1) {
                Background background_1 = this.mapScenes[class46_1.anInt758];
                if (background_1 != null) {
                    int j5 = (class46_1.width * 4 - background_1.anInt1452) / 2;
                    int k5 = (class46_1.length * 4 - background_1.anInt1453) / 2;
                    background_1.drawBackground(48 + l * 4 + j5, 48 + (104 - i - class46_1.length) * 4 + k5);
                }
            } else if (j3 == 9) {
                int l4 = 15658734;
                if (k1 > 0) {
                    l4 = 15597568;
                }
                int[] ai1 = this.miniMapImage.myPixels;
                int l5 = 24624 + l * 4 + (103 - i) * 512 * 4;
                if (l2 == 0 || l2 == 2) {
                    ai1[l5 + 1536] = l4;
                    ai1[l5 + 1024 + 1] = l4;
                    ai1[l5 + 512 + 2] = l4;
                    ai1[l5 + 3] = l4;
                } else {
                    ai1[l5] = l4;
                    ai1[l5 + 512 + 1] = l4;
                    ai1[l5 + 1024 + 2] = l4;
                    ai1[l5 + 1536 + 3] = l4;
                }
            }
        }
        if ((k1 = this.worldController.method303(j1, l, i)) == 0) return;
        int j2 = k1 >> 14 & 32767;
        ObjectDefinition class46 = ObjectDefinition.forID(j2);
        if (class46.anInt758 == -1) return;
        Background background = this.mapScenes[class46.anInt758];
        if (background == null) return;
        int i4 = (class46.width * 4 - background.anInt1452) / 2;
        int j4 = (class46.length * 4 - background.anInt1453) / 2;
        background.drawBackground(48 + l * 4 + i4, 48 + (104 - i - class46.length) * 4 + j4);
    }

    private int method54() {
        if (!this.floorMaps.equals((Object)"") || !this.objectMaps.equals((Object)"")) {
            this.floorMaps = "";
            this.objectMaps = "";
        }
        for (int i = 0; i < this.aByteArrayArray1183.length; ++i) {
            this.floorMaps = this.floorMaps + "  " + this.anIntArray1235[i];
            this.objectMaps = this.objectMaps + "  " + this.anIntArray1236[i];
            if (this.aByteArrayArray1183[i] == null && this.anIntArray1235[i] != -1) {
                return -1;
            }
            if (this.aByteArrayArray1247[i] != null || this.anIntArray1236[i] == -1) continue;
            return -2;
        }
        boolean flag = true;
        for (int j = 0; j < this.aByteArrayArray1183.length; ++j) {
            byte[] abyte0 = this.aByteArrayArray1247[j];
            if (abyte0 == null) continue;
            int k = (this.anIntArray1234[j] >> 8) * 64 - baseX;
            int l = (this.anIntArray1234[j] & 255) * 64 - baseY;
            if (this.aBoolean1159) {
                k = 10;
                l = 10;
            }
            flag &= MapRegion.method189(k, abyte0, l);
        }
        if (this.aBoolean1080) {
            return -4;
        }
        loadingStage = 2;
        MapRegion.anInt131 = this.plane;
        this.method22();
        this.stream.createFrame(121);
        return 0;
    }

    public void method55() {
        Animable_Sub4 class30_sub2_sub4_sub4 = (Animable_Sub4)this.aClass19_1013.reverseGetFirst();
        while (class30_sub2_sub4_sub4 != null) {
            if (class30_sub2_sub4_sub4.anInt1597 != this.plane || loopCycle > class30_sub2_sub4_sub4.anInt1572) {
                class30_sub2_sub4_sub4.unlink();
            } else if (loopCycle >= class30_sub2_sub4_sub4.anInt1571) {
                Player player;
                int j;
                NPC npc;
                if (class30_sub2_sub4_sub4.anInt1590 > 0 && (npc = this.npcArray[class30_sub2_sub4_sub4.anInt1590 - 1]) != null && npc.x >= 0 && npc.x < 13312 && npc.y >= 0 && npc.y < 13312) {
                    class30_sub2_sub4_sub4.method455(loopCycle, npc.y, this.method42(class30_sub2_sub4_sub4.anInt1597, npc.y, npc.x) - class30_sub2_sub4_sub4.anInt1583, npc.x);
                }
                if (class30_sub2_sub4_sub4.anInt1590 < 0 && (player = (j = - class30_sub2_sub4_sub4.anInt1590 - 1) == this.unknownInt10 ? myPlayer : this.playerArray[j]) != null && player.x >= 0 && player.x < 13312 && player.y >= 0 && player.y < 13312) {
                    class30_sub2_sub4_sub4.method455(loopCycle, player.y, this.method42(class30_sub2_sub4_sub4.anInt1597, player.y, player.x) - class30_sub2_sub4_sub4.anInt1583, player.x);
                }
                class30_sub2_sub4_sub4.method456(this.anInt945);
                this.worldController.method285(this.plane, class30_sub2_sub4_sub4.anInt1595, (int)class30_sub2_sub4_sub4.aDouble1587, -1, (int)class30_sub2_sub4_sub4.aDouble1586, 60, (int)class30_sub2_sub4_sub4.aDouble1585, class30_sub2_sub4_sub4, false);
            }
            class30_sub2_sub4_sub4 = (Animable_Sub4)this.aClass19_1013.reverseGetNext();
        }
    }

    public void method60(int i) {
        RSInterface class9 = RSInterface.interfaceCache[i];
        if (class9.children == null) {
            System.out.println("Interface children null: " + i);
            return;
        }
        int j = 0;
        while (j < class9.children.length) {
            if (class9.children[j] == -1) {
                return;
            }
            RSInterface class9_1 = RSInterface.interfaceCache[class9.children[j]];
            if (class9_1.type == 1) {
                this.method60(class9_1.id);
            }
            class9_1.animationLength = 0;
            class9_1.animationDelay = 0;
            ++j;
        }
    }

    public void method63() {
        Class30_Sub1 class30_sub1 = (Class30_Sub1)this.aClass19_1179.reverseGetFirst();
        while (class30_sub1 != null) {
            if (class30_sub1.anInt1294 == -1) {
                class30_sub1.anInt1302 = 0;
                this.method89(class30_sub1);
            } else {
                class30_sub1.unlink();
            }
            class30_sub1 = (Class30_Sub1)this.aClass19_1179.reverseGetNext();
        }
    }

    public void method65(int i, int j, int k, int l, RSInterface rsinterface, int i1, boolean flag, int j1) {
        int byte0 = this.aBoolean972 ? 32 : 0;
        this.aBoolean972 = false;
        if (k >= i && k < i + 16 && l >= i1 && l < i1 + 16) {
            rsinterface.scrollPosition -= this.anInt1213 * 4;
            if (!flag) return;
            needDrawTabArea = true;
            return;
        }
        if (k >= i && k < i + 16 && l >= i1 + j - 16 && l < i1 + j) {
            rsinterface.scrollPosition += this.anInt1213 * 4;
            if (!flag) return;
            needDrawTabArea = true;
            return;
        }
        if (k < i - byte0) return;
        if (k >= i + 16 + byte0) return;
        if (l < i1 + 16) return;
        if (l >= i1 + j - 16) return;
        if (this.anInt1213 <= 0) return;
        int k1 = (j - 32) * j / j1;
        if (k1 < 8) {
            k1 = 8;
        }
        int l1 = l - i1 - 16 - k1 / 2;
        int i2 = j - 32 - k1;
        rsinterface.scrollPosition = (j1 - j) * l1 / i2;
        if (flag) {
            needDrawTabArea = true;
        }
        this.aBoolean972 = true;
    }

    private boolean findPathToObject(int id, int y, int x) {
        int objectId = id >> 14 & 32767;
        int objectConfig = this.worldController.getObjectConfig(this.plane, x, y, id);
        if (objectConfig == -1) {
            return false;
        }
        int type = objectConfig & 31;
        int rotation = objectConfig >> 6 & 3;
        if (type == 10 || type == 11 || type == 22) {
            int sizeY;
            int sizeX;
            ObjectDefinition def = ObjectDefinition.forID(objectId);
            if (rotation == 0 || rotation == 2) {
                sizeX = def.width;
                sizeY = def.length;
            } else {
                sizeX = def.length;
                sizeY = def.width;
            }
            int mask = def.entryMask;
            if (rotation != 0) {
                mask = (mask << rotation & 15) + (mask >> 4 - rotation);
            }
            this.calculatePath(2, 0, sizeY, 0, Client.myPlayer.pathY[0], sizeX, mask, y, Client.myPlayer.pathX[0], false, x);
        } else {
            this.calculatePath(2, rotation, 0, type + 1, Client.myPlayer.pathY[0], 0, 0, y, Client.myPlayer.pathX[0], false, x);
        }
        this.crossX = this.saveClickX;
        this.crossY = this.saveClickY;
        this.crossType = 2;
        this.crossIndex = 0;
        return true;
    }

    public void method70() {
        this.anInt1251 = 0;
        int j = (Client.myPlayer.x >> 7) + baseX;
        int k = (Client.myPlayer.y >> 7) + baseY;
        if (j >= 3053 && j <= 3156 && k >= 3056 && k <= 3136) {
            this.anInt1251 = 1;
        }
        if (j >= 3072 && j <= 3118 && k >= 9492 && k <= 9535) {
            this.anInt1251 = 1;
        }
        if (this.anInt1251 != 1) return;
        if (j < 3139) return;
        if (j > 3199) return;
        if (k < 3008) return;
        if (k > 3062) return;
        this.anInt1251 = 0;
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public void method73() {
        block20 : do {
            block213 : {
                block211 : {
                    block212 : {
                        block210 : {
                            if ((j = this.readCharacter()) == -1) {
                                return;
                            }
                            try {
                                if (Configuration.itemModificationTool && this.anInt1284 == 3214 && this.itemSelected == 1) {
                                    inventoryWidget = RSInterface.interfaceCache[3214];
                                    if (inventoryWidget == null) return;
                                    if (inventoryWidget.inv == null) {
                                        return;
                                    }
                                    selectedItem = inventoryWidget.inv[this.itemSlotUsedOn] - 1;
                                    if (selectedItem == -1) {
                                        return;
                                    }
                                    itemDef = ItemDefinition.forID(selectedItem);
                                    if (itemDef == null) {
                                        return;
                                    }
                                    v0 = name = inventoryWidget.customName[this.itemSlotUsedOn] != null ? inventoryWidget.customName[this.itemSlotUsedOn] : itemDef.name;
                                    if (j == 52) {
                                        --itemDef.modelOffset1;
                                        return;
                                    }
                                    if (j == 56) {
                                        ++itemDef.modelOffset2;
                                        return;
                                    }
                                    if (j == 54) {
                                        ++itemDef.modelOffset1;
                                        return;
                                    }
                                    if (j == 50) {
                                        --itemDef.modelOffset2;
                                        return;
                                    }
                                    if (j == 55) {
                                        itemDef.modelRotation1 -= 5;
                                        if (itemDef.modelRotation1 >= 0) return;
                                        itemDef.modelRotation1 = 0;
                                        return;
                                    }
                                    if (j == 57) {
                                        itemDef.modelRotation1 += 5;
                                        return;
                                    }
                                    if (j == 49) {
                                        itemDef.modelRotation2 -= 5;
                                        if (itemDef.modelRotation2 >= 0) return;
                                        itemDef.modelRotation2 = 0;
                                        return;
                                    }
                                    if (j == 51) {
                                        itemDef.modelRotation2 += 5;
                                        return;
                                    }
                                    if (j == 45) {
                                        itemDef.modelZoom += 5;
                                        return;
                                    }
                                    if (j == 43) {
                                        itemDef.modelZoom -= 5;
                                        return;
                                    }
                                    if (j != 53) return;
                                    System.out.println("Inventory offset for item " + itemDef.id + ": " + name);
                                    System.out.println("==========");
                                    System.out.println("itemDef.modelZoom = " + itemDef.modelZoom + ";");
                                    System.out.println("itemDef.modelOffset1 = " + itemDef.modelOffset1 + ";");
                                    System.out.println("itemDef.modelOffset2 = " + itemDef.modelOffset2 + ";");
                                    System.out.println("itemDef.modelRotation1 = " + itemDef.modelRotation1 + ";");
                                    System.out.println("itemDef.modelRotation2 = " + itemDef.modelRotation2 + ";");
                                    System.out.println("==========");
                                    this.itemSelected = 0;
                                    ItemDefinition.mruNodes1.unlinkAll();
                                    return;
                                }
                            }
                            catch (Exception e) {
                                System.out.println("HA, Error BITCH");
                            }
                            if (Client.firstPersonMode && Client.enterToChat && (j == 119 || j == 115 || j == 100 || j == 97)) {
                                forward = Compass.getCurrentDirection(this.xCameraCurve);
                                backward = forward.opposite();
                                right = Compass.rotate(forward, false);
                                left = right.opposite();
                                switch (j) {
                                    case 119: {
                                        this.moveBy(forward);
                                        return;
                                    }
                                    case 97: {
                                        this.moveBy(left);
                                        return;
                                    }
                                    case 115: {
                                        this.moveBy(backward);
                                        return;
                                    }
                                    case 100: {
                                        this.moveBy(right);
                                    }
                                }
                                return;
                            }
                            if (Client.openInterfaceID != -1 && Client.openInterfaceID == this.reportAbuseInterfaceID) {
                                if (j == 8 && this.reportAbuseInput.length() > 0) {
                                    this.reportAbuseInput = this.reportAbuseInput.substring(0, this.reportAbuseInput.length() - 1);
                                }
                                if ((j >= 97 && j <= 122 || j >= 65 && j <= 90 || j >= 48 && j <= 57 || j == 32) && this.reportAbuseInput.length() < 12) {
                                    this.reportAbuseInput = this.reportAbuseInput + (char)j;
                                }
                            }
                            if (this.inputFieldSelected != null && (Client.openInterfaceID != -1 && RSInterface.interfaceCache[Client.openInterfaceID] != null && RSInterface.interfaceCache[Client.openInterfaceID].hasInputField || Client.tabInterfaceIDs[Client.tabID] != -1 && RSInterface.interfaceCache[Client.tabInterfaceIDs[Client.tabID]].hasInputField)) {
                                rsi = this.inputFieldSelected;
                                if (rsi.inputToggled) {
                                    if (j >= 32 && j <= 122 && rsi.rsFont.getTextWidth(rsi.inputText) < rsi.width - 20) {
                                        rsi.inputText = rsi.inputText + (char)j;
                                        Client.inputTaken = true;
                                        rsi.textInput.handleInput();
                                    }
                                    if (j == 8 && rsi.inputText.length() > 0) {
                                        rsi.inputText = rsi.inputText.substring(0, rsi.inputText.length() - 1);
                                        Client.inputTaken = true;
                                        rsi.textInput.handleInput();
                                    }
                                    if (j != 13) {
                                        if (j != 10) return;
                                    }
                                    rsi.inputToggled = false;
                                    Client.inputTaken = true;
                                    rsi.textInput.handleInput();
                                    if (rsi.inputText.equals((Object)"") == false) return;
                                    rsi.inputText = rsi.defaultText;
                                    return;
                                }
                            }
                            if (this.messagePromptRaised) {
                                if (j >= 32 && j <= 122 && this.promptInput.length() < 80) {
                                    this.promptInput = this.promptInput + (char)j;
                                    Client.inputTaken = true;
                                }
                                if (j == 8 && this.promptInput.length() > 0) {
                                    this.promptInput = this.promptInput.substring(0, this.promptInput.length() - 1);
                                    Client.inputTaken = true;
                                }
                                if (j != 13 && j != 10) continue;
                                this.messagePromptRaised = false;
                                Client.inputTaken = true;
                                if (this.friendsListAction == 1) {
                                    l = TextClass.longForName(this.promptInput);
                                    this.addFriend(l);
                                }
                                if (this.friendsListAction == 2 && this.friendsCount > 0) {
                                    l1 = TextClass.longForName(this.promptInput);
                                    this.delFriend(l1);
                                }
                                if (this.friendsListAction == 3 && this.promptInput.length() > 0) {
                                    this.stream.createFrame(126);
                                    this.stream.writeWordBigEndian(0);
                                    k = this.stream.currentOffset;
                                    this.stream.writeQWord(this.aLong953);
                                    TextInput.method526(this.promptInput, this.stream);
                                    this.stream.writeBytes(this.stream.currentOffset - k);
                                    this.promptInput = TextInput.processText(this.promptInput);
                                    this.pushMessage("", TextClass.fixName(TextClass.nameForLong(this.aLong953)), this.promptInput, ChatMessage.ChatType.SIX);
                                    if (this.privateChatMode == 2) {
                                        this.privateChatMode = 1;
                                        this.stream.createFrame(95);
                                        this.stream.writeWordBigEndian(this.publicChatMode);
                                        this.stream.writeWordBigEndian(this.privateChatMode);
                                        this.stream.writeWordBigEndian(this.tradeMode);
                                    }
                                }
                                if (this.friendsListAction == 4 && this.ignoreCount < 100) {
                                    l2 = TextClass.longForName(this.promptInput);
                                    this.addIgnore(l2);
                                }
                                if (this.interfaceButtonAction == 557 && this.promptInput.length() > 0) {
                                    if (this.promptInput.toLowerCase().contains((CharSequence)"k")) {
                                        this.promptInput = this.promptInput.replaceAll("k", "000");
                                    } else if (this.promptInput.toLowerCase().contains((CharSequence)"m")) {
                                        this.promptInput = this.promptInput.replaceAll("m", "000000");
                                    } else if (this.promptInput.toLowerCase().contains((CharSequence)"b")) {
                                        this.promptInput = this.promptInput.replaceAll("b", "000000000");
                                    }
                                    this.inputString = "::withdraw " + this.promptInput;
                                    this.sendPacket(103);
                                }
                                if (this.interfaceButtonAction == 788 && this.promptInput.length() > 0) {
                                    if (this.promptInput.toLowerCase().contains((CharSequence)"k")) {
                                        this.promptInput = this.promptInput.replaceAll("k", "000");
                                    } else if (this.promptInput.toLowerCase().contains((CharSequence)"m")) {
                                        this.promptInput = this.promptInput.replaceAll("m", "000000");
                                    } else if (this.promptInput.toLowerCase().contains((CharSequence)"b")) {
                                        this.promptInput = this.promptInput.replaceAll("b", "000000000");
                                    }
                                    this.inputString = "::pouch2tickets " + this.promptInput;
                                    this.sendPacket(103);
                                }
                                if (this.friendsListAction == 5 && this.ignoreCount > 0) {
                                    l3 = TextClass.longForName(this.promptInput);
                                    this.delIgnore(l3);
                                }
                                if (this.friendsListAction != 6) continue;
                                l3 = TextClass.longForName(this.promptInput);
                                this.chatJoin(l3);
                                continue;
                            }
                            if (this.inputDialogState != 1) break block210;
                            j = Character.toLowerCase((char)((char)j));
                            s = "" + (char)j;
                            if (this.amountOrNameInput.matches("(\\d+)?") && s.matches("[\\dkmb]") || this.amountOrNameInput.matches("\\d+[kmb]") && this.amountOrNameInput.matches("\\d")) {
                                this.amountOrNameInput = this.amountOrNameInput + (char)j;
                                Client.inputTaken = true;
                            }
                            if (j == 8 && this.amountOrNameInput.length() > 0) {
                                this.amountOrNameInput = this.amountOrNameInput.substring(0, this.amountOrNameInput.length() - 1);
                                Client.inputTaken = true;
                            }
                            if (j != 13 && j != 10) continue;
                            if (this.amountOrNameInput.length() <= 0) break block211;
                            amount = 0;
                            multiplier = 0;
                            break block212;
                        }
                        if (this.inputDialogState == 2) {
                            if (j >= 32 && j <= 122 && this.amountOrNameInput.length() < 12) {
                                this.amountOrNameInput = this.amountOrNameInput + (char)j;
                                Client.inputTaken = true;
                            }
                            if (j == 8 && this.amountOrNameInput.length() > 0) {
                                this.amountOrNameInput = this.amountOrNameInput.substring(0, this.amountOrNameInput.length() - 1);
                                Client.inputTaken = true;
                            }
                            if (j != 13 && j != 10) continue;
                            if (this.amountOrNameInput.length() > 0) {
                                this.stream.createFrame(60);
                                this.stream.writeQWord(TextClass.longForName(this.amountOrNameInput));
                            }
                            this.inputDialogState = 0;
                            Client.inputTaken = true;
                            continue;
                        }
                        if (this.inputDialogState == 3) {
                            if (j >= 32 && j <= 122 && this.amountOrNameInput.length() < 20) {
                                this.amountOrNameInput = this.amountOrNameInput + (char)j;
                                Client.inputTaken = true;
                            }
                            if (j == 8 && this.amountOrNameInput.length() > 0) {
                                this.amountOrNameInput = this.amountOrNameInput.substring(0, this.amountOrNameInput.length() - 1);
                                Client.inputTaken = true;
                            }
                            if (j != 13 && j != 10) continue;
                            if (this.amountOrNameInput.length() > 0) {
                                this.stream.createFrame(60);
                                this.stream.writeQWord(TextClass.longForName(this.amountOrNameInput));
                            }
                            this.inputDialogState = 0;
                            Client.inputTaken = true;
                            continue;
                        }
                        if (this.inputDialogState == 4) {
                            if (j >= 32 && j <= 122 && this.amountOrNameInput.length() < 25) {
                                this.amountOrNameInput = this.amountOrNameInput + (char)j;
                                Client.inputTaken = true;
                            }
                            if (j == 8 && this.amountOrNameInput.length() > 0) {
                                this.amountOrNameInput = this.amountOrNameInput.substring(0, this.amountOrNameInput.length() - 1);
                                Client.inputTaken = true;
                            }
                            if (j != 13 && j != 10) continue;
                            if (this.amountOrNameInput.length() > 0) {
                                this.stream.createFrame(60);
                                this.stream.writeQWord(TextClass.longForName(this.amountOrNameInput));
                            }
                            this.inputDialogState = 0;
                            Client.inputTaken = true;
                            continue;
                        }
                        if (this.backDialogID != -1) continue;
                        if (this.currentInputField != null) {
                            rsi = this.currentInputField;
                            clearFieldUpdate = false;
                            v1 = rsi.isNumbersOnly() ? (rsi.convertLettersToNumbers() ? j >= 48 && j <= 57 || j == 107 || j == 109 || j == 98 || j == 116 || j == 75 || j == 77 || j == 66 || j == 84 : j >= 48 && j <= 57) : (validChar = j >= 32 && j <= 122);
                            if (validChar && rsi.message.length() < rsi.getCharacterLimit()) {
                                if (rsi.getInputRegex().length() > 0) {
                                    regex = Pattern.compile((String)rsi.getInputRegex());
                                    match = regex.matcher((CharSequence)Character.toString((char)((char)j)));
                                    if (match.matches()) {
                                        rsi.message = rsi.convertLettersToNumbers() && rsi.message.length() + (j == 107 || j == 75 ? 2 : (j == 109 || j == 77 ? 5 : (j == 98 || j == 66 ? 8 : (j == 116 || j == 84 ? 11 : 0)))) < rsi.getCharacterLimit() ? (j == 107 || j == 75 ? rsi.message + "000" : (j == 109 || j == 77 ? rsi.message + "000000" : (j == 98 || j == 66 ? rsi.message + "000000000" : (j == 116 || j == 84 ? rsi.message + "000000000000" : rsi.message + (char)j)))) : rsi.message + (char)j;
                                        Client.inputTaken = true;
                                    }
                                } else {
                                    rsi.message = rsi.convertLettersToNumbers() && rsi.message.length() + (j == 107 || j == 75 ? 2 : (j == 109 || j == 77 ? 5 : (j == 98 || j == 66 ? 8 : (j == 116 || j == 84 ? 11 : 0)))) < rsi.getCharacterLimit() ? (j == 107 || j == 75 ? rsi.message + "000" : (j == 109 || j == 77 ? rsi.message + "000000" : (j == 98 || j == 66 ? rsi.message + "000000000" : (j == 116 || j == 84 ? rsi.message + "000000000000" : rsi.message + (char)j)))) : rsi.message + (char)j;
                                    Client.inputTaken = true;
                                }
                            }
                            if (j == 8 && rsi.message.length() > 0) {
                                rsi.message = rsi.message.substring(0, rsi.message.length() - 1);
                                Client.inputTaken = true;
                                clearFieldUpdate = true;
                            }
                            if (rsi.updatesEveryInput()) {
                                if (j == 10 || j == 13) {
                                    this.resetInputField();
                                    return;
                                }
                                if (j == 8 && rsi.message.length() == 0 && !clearFieldUpdate) {
                                    return;
                                }
                                this.updateInputField((InputFieldWidget)rsi);
                                return;
                            }
                            if (j != 10) {
                                if (j != 13) return;
                            }
                            if (rsi.message.length() <= 0) return;
                            this.updateInputField((InputFieldWidget)rsi);
                            this.resetInputField();
                            return;
                        }
                        if (j >= 32 && j <= 122 && this.inputString.length() < 80 && !Client.enterToChat) {
                            this.inputString = this.inputString + (char)j;
                            Client.inputTaken = true;
                        }
                        if (j == 8 && this.inputString.length() > 0 && !Client.enterToChat) {
                            this.inputString = this.inputString.substring(0, this.inputString.length() - 1);
                            Client.inputTaken = true;
                        }
                        if (j == (this.tabToReply != false ? 9 : 5)) {
                            this.tabToReplyPm();
                        }
                        if (this.inputString.equalsIgnoreCase("::searchbank")) {
                            this.searchBank();
                        }
                        if (j != 13 && j != 10 || this.inputString.length() <= 0) continue;
                        if (this.inputString.startsWith("::interface") && this.myPrivilege[0] == 8) {
                            try {
                                args = this.inputString.split(" ");
                                this.pushMessage("Opening interface " + args[1] + ".", ChatMessage.ChatType.ZERO);
                                Client.openInterfaceID = Integer.parseInt((String)args[1]);
                            }
                            catch (ArrayIndexOutOfBoundsException ex) {
                                this.pushMessage("please use as ::interface ID.", ChatMessage.ChatType.ZERO);
                            }
                        }
                        if (this.inputString.startsWith("::preload")) {
                            this.preloadModels();
                        }
                        if (this.inputString.startsWith("::pmsize")) {
                            if (this.inputString.length() < 9) {
                                this.pushMessage("Please enter a valid amount.", ChatMessage.ChatType.ZERO);
                            } else {
                                size = Integer.parseInt((String)this.inputString.substring(9));
                                if (size < 1) {
                                    size = 1;
                                } else if (size > 20) {
                                    size = 20;
                                }
                                this.pmChatSize = size;
                                this.pushMessage("Set PM chat size to " + size + ".");
                            }
                            this.inputString = "";
                            return;
                        }
                        if (!this.inputString.equals((Object)"::noclip")) ** GOTO lbl-1000
                        break block213;
                    }
                    for (i = 0; i < this.amountOrNameInput.length(); ++i) {
                        if (this.amountOrNameInput.charAt(i) == 'k') {
                            multiplier = 1000;
                        } else if (this.amountOrNameInput.charAt(i) == 'm') {
                            multiplier = 1000000;
                        } else if (this.amountOrNameInput.charAt(i) == 'b') {
                            multiplier = 1000000000;
                        }
                        if (multiplier != 0) break;
                    }
                    try {
                        amount = multiplier != 0 ? (multiplier == 1000000000 && Integer.parseInt((String)this.amountOrNameInput.replaceAll("[^0-9]", "")) >= 3 ? Integer.parseInt((String)"2147") * multiplier : Integer.parseInt((String)this.amountOrNameInput.replaceAll("[^0-9]", "")) * multiplier) : Integer.parseInt((String)this.amountOrNameInput);
                    }
                    catch (Exception i) {
                        // empty catch block
                    }
                    this.stream.createFrame(208);
                    this.stream.writeDWord(amount);
                }
                this.inputDialogState = 0;
                Client.inputTaken = true;
                continue;
            }
            k1 = 0;
            do {
                if (k1 < 4) {
                } else lbl-1000: // 2 sources:
                {
                    if (this.inputString.startsWith("::reloadint")) {
                        new Thread(new Runnable(){

                            public void run() {
                                Client.this.loadInterfaces();
                                Client.this.inputString = "";
                                try {
                                    Thread.sleep((long)3000L);
                                    return;
                                }
                                catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();
                        return;
                    }
                    if (this.inputString.startsWith("::repack")) {
                        this.repackCacheIndex(Integer.parseInt((String)this.inputString.substring(9)));
                    }
                    if (this.inputString.startsWith("::full") && this.myPrivilege[0] == 8) {
                        try {
                            args = this.inputString.split(" ");
                            id1 = Integer.parseInt((String)args[1]);
                            id2 = Integer.parseInt((String)args[2]);
                            this.fullscreenInterfaceID = id1;
                            Client.openInterfaceID = id2;
                            this.pushMessage("Opened Interface", ChatMessage.ChatType.ZERO);
                        }
                        catch (Exception e) {
                            this.pushMessage("Interface Failed to load", ChatMessage.ChatType.ZERO);
                        }
                    }
                    if (this.inputString.startsWith("::walkable")) {
                        try {
                            args = this.inputString.split(" ");
                            this.pushMessage("Opening interface " + args[1] + ".", ChatMessage.ChatType.ZERO);
                            this.walkableInterfaceID = Integer.parseInt((String)args[1]);
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {
                            this.pushMessage("please use as ::interface ID.", ChatMessage.ChatType.ZERO);
                        }
                    }
                    if (this.inputString.equals((Object)"::rel")) {
                        CustomObjects.init();
                        this.method22();
                        this.inputString = "";
                        return;
                    }
                    if (this.inputString.equalsIgnoreCase("::inc")) {
                        Client.getSettings().toggle(PlayerSettings.PlayerSetting.INCREASE_RENDER_DISTANCE, true);
                        this.inputString = "";
                        return;
                    }
                    if (this.inputString.startsWith("::buff") && this.myPrivilege[0] == 8) {
                        args = this.inputString.split(" ");
                        if (args.length < 3) {
                            return;
                        }
                        type = Integer.parseInt((String)args[1]);
                        time = Integer.parseInt((String)args[2]);
                        this.buffTimerHandler.add(time, type);
                    }
                    if (this.inputString.startsWith("::clearbuff") && this.myPrivilege[0] == 8) {
                        this.buffTimerHandler.reset();
                    }
                    if (this.inputString.equals((Object)"::donate")) {
                        Client.launchURL("http://Imagine-ps.com/store/");
                    }
                    if (this.inputString.equals((Object)"::forums")) {
                        Client.launchURL("http://Imagine-ps.com/community/");
                    }
                    if (this.inputString.equals((Object)"::forum")) {
                        Client.launchURL("http://Imagine-ps.com/community/");
                    }
                    if (this.inputString.equals((Object)"::site")) {
                        Client.launchURL("http://Imagine-ps.com");
                    }
                    if (this.inputString.equals((Object)"::website")) {
                        Client.launchURL("http://Imagine-ps.com");
                    }
                    if (this.inputString.equals((Object)"::donat")) {
                        Client.launchURL("http://Imagine-ps.com/store/");
                    }
                    if (this.inputString.equals((Object)"::vote")) {
                        Client.launchURL("http://Imagine-ps.com/vote/");
                    }
                    if (this.inputString.equals((Object)"::lastupdate")) {
                        Client.launchURL("http://imagine-ps.com/community/index.php?/forum/4-server-updates/");
                    }
                    if (this.inputString.equals((Object)"::vot")) {
                        Client.launchURL("http://Imagine-ps.com/vote/");
                    }
                    if (this.inputString.equals((Object)"::votee")) {
                        Client.launchURL("http://Imagine-ps.com/vote/");
                    }
                    if (this.inputString.equals((Object)"::VOTE")) {
                        Client.launchURL("http://Imagine-ps.com/vote/");
                    }
                    if (this.inputString.equals((Object)"::discord") || this.inputString.equals((Object)"::chat")) {
                        Client.launchURL("http://www.imagine-ps.com/discord.html");
                    }
                    if (this.inputString.equals((Object)"::record")) {
                        try {
                            this.pushMessage("Starting screen Recorder...");
                            System.out.println("Opening recorder...");
                            Runtime.getRuntime().exec("java -jar " + CacheType.DATA.getFullLocation() + "screen_recorder.jar");
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (this.inputString.startsWith("::back") && this.myPrivilege[0] == 8) {
                        try {
                            args = this.inputString.split(" ");
                            this.pushMessage("Opening interface " + args[1] + ".");
                            this.backDialogID = Integer.parseInt((String)args[1]);
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {
                            this.pushMessage("please use as ::interface ID.");
                        }
                    }
                    if (this.inputString.equals((Object)"::leftclick")) {
                        v2 = this.isOneClick = this.isOneClick == false;
                        if (this.isOneClick) {
                            this.pushMessage("You can now attack all monsters by left clicking.");
                        } else {
                            this.pushMessage("You can no longer attack all monsters by left clicking.");
                        }
                    }
                    if (this.inputString.equals((Object)"::tabtoreply")) {
                        v3 = this.tabToReply = this.tabToReply == false;
                        if (this.tabToReply) {
                            this.pushMessage("You can now respond by using the TAB key.");
                        } else {
                            this.pushMessage("You can now respond by using the CNTRL key.");
                        }
                    }
                    if (this.inputString.startsWith("//setspecto") && this.myPrivilege[0] == 8) {
                        this.anIntArray1045[300] = amt = Integer.parseInt((String)this.inputString.substring(12));
                        if (this.variousSettings[300] != amt) {
                            this.variousSettings[300] = amt;
                            this.method33(300);
                            Client.needDrawTabArea = true;
                            if (this.dialogID != -1) {
                                Client.inputTaken = true;
                            }
                        }
                    }
                    if (this.inputString.startsWith("::swat") && this.myPrivilege[0] == 8) {
                        for (i = 12535; i < 20072; ++i) {
                            System.out.println("i:" + i);
                            ItemDefinition.forID(i);
                        }
                        for (i = 0; i < 20072; ++i) {
                            System.out.println("e:" + i);
                            NPCDefinition.forID(i);
                        }
                    }
                    if (this.inputString.equals((Object)"::clientdrop") && this.myPrivilege[0] == 8) {
                        this.dropClient();
                    }
                    if (this.inputString.equals((Object)"::lag") && this.myPrivilege[0] == 8) {
                        this.printDebug();
                    }
                    if (this.inputString.equals((Object)"::prefetchmusic") && this.myPrivilege[0] == 8) {
                        for (j1 = 0; j1 < Client.onDemandFetcher.getVersionCount(2); ++j1) {
                            Client.onDemandFetcher.method563((byte)1, 2, j1);
                        }
                    }
                    if (this.inputString.equals((Object)"::firstperson")) {
                        Client.firstPersonMode = Client.firstPersonMode == false;
                        Client.enterToChat = Client.enterToChat == false;
                        this.switchToFullScreen(ScreenMode.RESIZABLE);
                    }
                    if (this.inputString.equals((Object)"::fixed")) {
                        // empty if block
                    }
                    if (this.inputString.equals((Object)"::resizable")) {
                        // empty if block
                    }
                    if (this.inputString.equals((Object)"::fullscreen")) {
                        // empty if block
                    }
                    if (this.inputString.equals((Object)"::newtabs")) {
                        v4 = Client.newTabs = Client.newTabs == false;
                    }
                    if (this.inputString.equals((Object)"::transchat")) {
                        v5 = Client.transparentChat = Client.transparentChat == false;
                    }
                    if (this.inputString.startsWith("::chatcolor")) {
                        args = this.inputString.split(" ");
                        if (args.length > 1) {
                            if (args[1].length() == 6) {
                                Client.chatColorHex = args[1];
                                return;
                            }
                            this.pushMessage("The hex code must be a 6-digit-number.");
                            return;
                        }
                        this.pushMessage("You must enter a 6-digit Hexidecimal");
                    }
                    if (this.inputString.equals((Object)"::fpson")) {
                        Client.fpsOn = true;
                    }
                    if (this.inputString.equals((Object)"::fpsoff")) {
                        Client.fpsOn = false;
                    }
                    if (this.inputString.equals((Object)"::dataon")) {
                        Client.clientData = true;
                    }
                    if (this.inputString.equals((Object)"::dataoff")) {
                        Client.clientData = false;
                    }
                    if (this.inputString.startsWith("::modelsitem") && (this.myPrivilege[0] == 8 || this.myPrivilege[0] == 7 || this.myPrivilege[0] == 6) && this.inputString.length() > 13) {
                        this.pushMessage(ItemDefinition.itemModels(Integer.parseInt((String)this.inputString.substring(13))));
                    }
                    if (this.inputString.equals((Object)"::minimap")) {
                        Client.hdMinimap = Client.hdMinimap == false;
                        this.method24(this.plane);
                    }
                    if (this.inputString.equals((Object)"::dump")) {
                        this.dumpItemImages(false);
                    }
                    if (this.inputString.startsWith("/")) {
                        this.inputString = "::" + this.inputString;
                    }
                    if (this.inputString.startsWith("::getcode")) {
                        this.inputString = "::getcode " + this.donatorPayment;
                    }
                    if (this.inputString.startsWith("::setcode")) {
                        this.openBOX = true;
                    } else if (this.inputString.startsWith("::")) {
                        this.stream.createFrame(103);
                        this.stream.writeWordBigEndian(this.inputString.length() - 1);
                        this.stream.writeString(this.inputString.substring(2));
                    } else {
                        s = this.inputString.toLowerCase();
                        j2 = 0;
                        if (s.startsWith("yellow:")) {
                            j2 = 0;
                            this.inputString = this.inputString.substring(7);
                        } else if (s.startsWith("red:")) {
                            j2 = 1;
                            this.inputString = this.inputString.substring(4);
                        } else if (s.startsWith("green:")) {
                            j2 = 2;
                            this.inputString = this.inputString.substring(6);
                        } else if (s.startsWith("cyan:")) {
                            j2 = 3;
                            this.inputString = this.inputString.substring(5);
                        } else if (s.startsWith("purple:")) {
                            j2 = 4;
                            this.inputString = this.inputString.substring(7);
                        } else if (s.startsWith("white:")) {
                            j2 = 5;
                            this.inputString = this.inputString.substring(6);
                        } else if (s.startsWith("flash1:")) {
                            j2 = 6;
                            this.inputString = this.inputString.substring(7);
                        } else if (s.startsWith("flash2:")) {
                            j2 = 7;
                            this.inputString = this.inputString.substring(7);
                        } else if (s.startsWith("flash3:")) {
                            j2 = 8;
                            this.inputString = this.inputString.substring(7);
                        } else if (s.startsWith("glow1:")) {
                            j2 = 9;
                            this.inputString = this.inputString.substring(6);
                        } else if (s.startsWith("glow2:")) {
                            j2 = 10;
                            this.inputString = this.inputString.substring(6);
                        } else if (s.startsWith("glow3:")) {
                            j2 = 11;
                            this.inputString = this.inputString.substring(6);
                        }
                        s = this.inputString.toLowerCase();
                        i3 = 0;
                        if (s.startsWith("wave:")) {
                            i3 = 1;
                            this.inputString = this.inputString.substring(5);
                        } else if (s.startsWith("wave2:")) {
                            i3 = 2;
                            this.inputString = this.inputString.substring(6);
                        } else if (s.startsWith("shake:")) {
                            i3 = 3;
                            this.inputString = this.inputString.substring(6);
                        } else if (s.startsWith("scroll:")) {
                            i3 = 4;
                            this.inputString = this.inputString.substring(7);
                        } else if (s.startsWith("slide:")) {
                            i3 = 5;
                            this.inputString = this.inputString.substring(6);
                        }
                        this.stream.createFrame(4);
                        this.stream.writeWordBigEndian(0);
                        j3 = this.stream.currentOffset;
                        this.stream.method425(i3);
                        this.stream.method425(j2);
                        this.aStream_834.currentOffset = 0;
                        TextInput.method526(this.inputString, this.aStream_834);
                        this.stream.method441(0, this.aStream_834.buffer, this.aStream_834.currentOffset);
                        this.stream.writeBytes(this.stream.currentOffset - j3);
                        Client.myPlayer.textSpoken = this.inputString = TextInput.processText(this.inputString);
                        Client.myPlayer.anInt1513 = j2;
                        Client.myPlayer.anInt1531 = i3;
                        Client.myPlayer.textCycle = 150;
                        if (Client.myPlayer.name != null) {
                            title = "<col=" + Client.myPlayer.titleColor() + ">" + Client.myPlayer.getRank() + "</col>";
                            if (this.myPrivilege[0] > 0) {
                                this.pushMessage(title + this.getCrownsForRights(this.myPrivilege), Client.myPlayer.name, Client.myPlayer.textSpoken, ChatMessage.ChatType.TWO);
                            } else {
                                this.pushMessage(title, Client.myPlayer.name, Client.myPlayer.textSpoken, ChatMessage.ChatType.TWO);
                            }
                        }
                        if (this.publicChatMode == 2) {
                            this.publicChatMode = 3;
                            this.stream.createFrame(95);
                            this.stream.writeWordBigEndian(this.publicChatMode);
                            this.stream.writeWordBigEndian(this.privateChatMode);
                            this.stream.writeWordBigEndian(this.tradeMode);
                        }
                    }
                    this.inputString = "";
                    Client.inputTaken = true;
                    continue block20;
                }
                for (i2 = 1; i2 < 103; ++i2) {
                    for (k2 = 1; k2 < 103; ++k2) {
                        this.collisionMaps[k1].clipData[i2][k2] = 0;
                    }
                }
                ++k1;
            } while (true);
            break;
        } while (true);
    }

    public int method83(int i, int j, int k) {
        int l = 256 - k;
        return ((i & 16711935) * l + (j & 16711935) * k & -16711936) + ((i & 65280) * l + (j & 65280) * k & 16711680) >> 8;
    }

    public void method86(Stream stream) {
        int j = 0;
        while (j < this.anInt893) {
            int icon;
            int focusNPC;
            int type;
            int damage;
            int k = this.anIntArray894[j];
            NPC npc = this.npcArray[k];
            int l = stream.readUnsignedByte();
            if ((l & 64) != 0) {
                l += stream.readUnsignedByte() << 8;
            }
            if ((l & 16) != 0) {
                int i1 = stream.method434();
                if (i1 == 65535) {
                    i1 = -1;
                }
                int i2 = stream.readUnsignedByte();
                if (i1 == npc.forcedAnimation && i1 != -1) {
                    int l2 = AnimationDefinition.getAnim((int)i1).anInt365;
                    if (l2 == 1) {
                        npc.displayedEmoteFrames = 0;
                        npc.emoteTimeRemaining = 0;
                        npc.animationDelay = i2;
                        npc.currentAnimationLoops = 0;
                    }
                    if (l2 == 2) {
                        npc.currentAnimationLoops = 0;
                    }
                } else if (i1 == -1 || npc.forcedAnimation == -1 || AnimationDefinition.getAnim((int)i1).priority >= AnimationDefinition.getAnim((int)npc.forcedAnimation).priority) {
                    npc.forcedAnimation = i1;
                    npc.displayedEmoteFrames = 0;
                    npc.emoteTimeRemaining = 0;
                    npc.animationDelay = i2;
                    npc.currentAnimationLoops = 0;
                    npc.anInt1542 = npc.pathLength;
                }
            }
            if ((l & 8) != 0) {
                damage = stream.readUnsignedWord();
                type = stream.method427();
                icon = stream.readUnsignedByte();
                focusNPC = stream.readUnsignedByte();
                npc.updateHitData(type, damage, loopCycle, icon, 0, focusNPC);
                npc.loopCycleStatus = loopCycle + 300;
                npc.currentHealth = stream.readDWord();
                npc.maxHealth = stream.readDWord();
            }
            if ((l & 128) != 0) {
                npc.graphic = stream.readUnsignedWord();
                int k1 = stream.readDWord();
                npc.anInt1524 = k1 >> 16;
                npc.graphicDelay = loopCycle + (k1 & 65535);
                npc.currentAnimation = 0;
                npc.anInt1522 = 0;
                if (npc.graphicDelay > loopCycle) {
                    npc.currentAnimation = -1;
                }
                if (npc.graphic == 65535) {
                    npc.graphic = -1;
                }
            }
            if ((l & 32) != 0) {
                npc.interactingEntity = stream.readUnsignedWord();
                if (npc.interactingEntity == 65535) {
                    npc.interactingEntity = -1;
                }
            }
            if ((l & 1) != 0) {
                npc.textSpoken = stream.readString();
                npc.textCycle = 100;
            }
            if ((l & 256) != 0) {
                damage = stream.readUnsignedWord();
                type = stream.method428();
                icon = stream.readUnsignedByte();
                focusNPC = stream.readUnsignedByte();
                npc.updateHitData(type, damage, loopCycle, icon, 0, focusNPC);
                npc.loopCycleStatus = loopCycle + 300;
                npc.currentHealth = stream.readDWord();
                npc.maxHealth = stream.readDWord();
            }
            if ((l & 2) != 0) {
                npc.npcDefinition = NPCDefinition.forID(stream.readUnsignedWord());
                npc.tileSize = npc.npcDefinition.boundDim;
                npc.anInt1504 = npc.npcDefinition.anInt79;
                npc.walkAnim = npc.npcDefinition.walkAnim;
                npc.turn160DefAnim = npc.npcDefinition.anInt58;
                npc.turn90CWAnim = npc.npcDefinition.anInt83;
                npc.turn90CCAnim = npc.npcDefinition.anInt55;
                npc.standAnim = npc.npcDefinition.standAnim;
            }
            if ((l & 4) != 0) {
                npc.anInt1538 = stream.method434();
                npc.anInt1539 = stream.method434();
            }
            if ((l & 512) != 0) {
                int icon2;
                npc.npcDefinition.headIcon = icon2 = stream.readUnsignedByte();
            }
            ++j;
        }
    }

    public void method89(Class30_Sub1 class30_sub1) {
        int i = 0;
        int j = -1;
        int k = 0;
        int l = 0;
        if (class30_sub1.anInt1296 == 0) {
            i = this.worldController.method300(class30_sub1.anInt1295, class30_sub1.anInt1297, class30_sub1.anInt1298);
        }
        if (class30_sub1.anInt1296 == 1) {
            i = this.worldController.method301(class30_sub1.anInt1295, class30_sub1.anInt1297, class30_sub1.anInt1298);
        }
        if (class30_sub1.anInt1296 == 2) {
            i = this.worldController.method302(class30_sub1.anInt1295, class30_sub1.anInt1297, class30_sub1.anInt1298);
        }
        if (class30_sub1.anInt1296 == 3) {
            i = this.worldController.method303(class30_sub1.anInt1295, class30_sub1.anInt1297, class30_sub1.anInt1298);
        }
        if (i != 0) {
            int i1 = this.worldController.getObjectConfig(class30_sub1.anInt1295, class30_sub1.anInt1297, class30_sub1.anInt1298, i);
            j = i >> 14 & 32767;
            k = i1 & 31;
            l = i1 >> 6;
        }
        class30_sub1.anInt1299 = j;
        class30_sub1.anInt1301 = k;
        class30_sub1.anInt1300 = l;
    }

    public void processSounds() {
        for (int i = 0; i < this.currentSound; ++i) {
            if (this.soundDelay[i] <= 0) {
                boolean flag1 = false;
                try {
                    if (this.soundIds[i] == this.anInt874 && this.soundType[i] == this.anInt1289) {
                        if (!this.replayWave()) {
                            flag1 = true;
                        }
                    } else {
                        Stream stream = Sounds.method241(this.soundType[i], this.soundIds[i]);
                        if (System.currentTimeMillis() + (long)(stream.currentOffset / 22) > this.aLong1172 + (long)(this.anInt1257 / 22)) {
                            this.anInt1257 = stream.currentOffset;
                            this.aLong1172 = System.currentTimeMillis();
                            if (this.saveWave(stream.buffer, stream.currentOffset)) {
                                this.anInt874 = this.soundIds[i];
                                this.anInt1289 = this.soundType[i];
                            } else {
                                flag1 = true;
                            }
                        }
                    }
                }
                catch (Exception stream) {
                    // empty catch block
                }
                if (!flag1 || this.soundDelay[i] == -5) {
                    --this.currentSound;
                    for (int j = i; j < this.currentSound; ++j) {
                        this.soundIds[j] = this.soundIds[j + 1];
                        this.soundType[j] = this.soundType[j + 1];
                        this.soundDelay[j] = this.soundDelay[j + 1];
                    }
                    --i;
                    continue;
                }
                this.soundDelay[i] = -5;
                continue;
            }
            int[] arrn = this.soundDelay;
            int n = i;
            arrn[n] = arrn[n] - 1;
        }
        if (this.prevSong <= 0) return;
        this.prevSong -= 20;
        if (this.prevSong < 0) {
            this.prevSong = 0;
        }
        if (this.prevSong != 0) return;
        if (!this.musicEnabled) return;
        if (lowMem) return;
        this.nextSong = this.currentSong;
        onDemandFetcher.loadMandatory(2, this.nextSong);
    }

    public void method91(Stream stream, int i) {
        int j;
        while (stream.bitPosition + 10 < i * 8 && (j = stream.readBits(11)) != 2047) {
            int j1;
            if (this.playerArray[j] == null) {
                this.playerArray[j] = new Player();
                if (this.aStreamArray895s[j] != null) {
                    this.playerArray[j].updatePlayer(this.aStreamArray895s[j]);
                }
            }
            this.playerIndices[this.playerCount++] = j;
            Player player = this.playerArray[j];
            player.anInt1537 = loopCycle;
            int k = stream.readBits(1);
            if (k == 1) {
                this.anIntArray894[this.anInt893++] = j;
            }
            int l = stream.readBits(1);
            int i1 = stream.readBits(5);
            if (i1 > 15) {
                i1 -= 32;
            }
            if ((j1 = stream.readBits(5)) > 15) {
                j1 -= 32;
            }
            player.setPos(Client.myPlayer.pathX[0] + j1, Client.myPlayer.pathY[0] + i1, l == 1);
        }
        stream.finishBitAccess();
    }

    public void method95() {
        int j = 0;
        while (j < this.npcCount) {
            int k = this.npcIndices[j];
            NPC npc = this.npcArray[k];
            if (npc != null) {
                this.method96(npc);
            }
            ++j;
        }
    }

    public void method96(Mobile entity) {
        if (entity.x < 128 || entity.y < 128 || entity.x >= 13184 || entity.y >= 13184) {
            entity.forcedAnimation = -1;
            entity.graphic = -1;
            entity.startForceMovement = 0;
            entity.endForceMovement = 0;
            entity.x = entity.pathX[0] * 128 + entity.tileSize * 64;
            entity.y = entity.pathY[0] * 128 + entity.tileSize * 64;
            entity.method446();
        }
        if (entity == myPlayer && (entity.x < 1536 || entity.y < 1536 || entity.x >= 11776 || entity.y >= 11776)) {
            entity.forcedAnimation = -1;
            entity.graphic = -1;
            entity.startForceMovement = 0;
            entity.endForceMovement = 0;
            entity.x = entity.pathX[0] * 128 + entity.tileSize * 64;
            entity.y = entity.pathY[0] * 128 + entity.tileSize * 64;
            entity.method446();
        }
        if (entity.startForceMovement > loopCycle) {
            this.method97(entity);
        } else if (entity.endForceMovement >= loopCycle) {
            this.method98(entity);
        } else {
            this.method99(entity);
        }
        this.method100(entity);
        this.updateAnimation(entity);
    }

    public void method97(Mobile entity) {
        int i = entity.startForceMovement - loopCycle;
        int j = entity.anInt1543 * 128 + entity.tileSize * 64;
        int k = entity.anInt1545 * 128 + entity.tileSize * 64;
        entity.x += (j - entity.x) / i;
        entity.y += (k - entity.y) / i;
        entity.anInt1503 = 0;
        if (entity.anInt1549 == 0) {
            entity.turnDirection = 1024;
        }
        if (entity.anInt1549 == 1) {
            entity.turnDirection = 1536;
        }
        if (entity.anInt1549 == 2) {
            entity.turnDirection = 0;
        }
        if (entity.anInt1549 != 3) return;
        entity.turnDirection = 512;
    }

    public void method98(Mobile entity) {
        if (entity.endForceMovement == loopCycle || entity.forcedAnimation == -1 || entity.animationDelay != 0 || entity.emoteTimeRemaining + 1 > AnimationDefinition.getAnim(entity.forcedAnimation).method258(entity.displayedEmoteFrames)) {
            int i = entity.endForceMovement - entity.startForceMovement;
            int j = loopCycle - entity.startForceMovement;
            int k = entity.anInt1543 * 128 + entity.tileSize * 64;
            int l = entity.anInt1545 * 128 + entity.tileSize * 64;
            int i1 = entity.anInt1544 * 128 + entity.tileSize * 64;
            int j1 = entity.anInt1546 * 128 + entity.tileSize * 64;
            entity.x = (k * (i - j) + i1 * j) / i;
            entity.y = (l * (i - j) + j1 * j) / i;
        }
        entity.anInt1503 = 0;
        if (entity.anInt1549 == 0) {
            entity.turnDirection = 1024;
        }
        if (entity.anInt1549 == 1) {
            entity.turnDirection = 1536;
        }
        if (entity.anInt1549 == 2) {
            entity.turnDirection = 0;
        }
        if (entity.anInt1549 == 3) {
            entity.turnDirection = 512;
        }
        entity.anInt1552 = entity.turnDirection;
    }

    public void method99(Mobile entity) {
        entity.anInt1517 = entity.standAnim;
        if (entity.pathLength == 0) {
            entity.anInt1503 = 0;
            return;
        }
        if (entity.forcedAnimation != -1 && entity.animationDelay == 0) {
            AnimationDefinition animation = AnimationDefinition.getAnim(entity.forcedAnimation);
            if (entity.anInt1542 > 0 && animation.anInt363 == 0) {
                ++entity.anInt1503;
                return;
            }
            if (entity.anInt1542 <= 0 && animation.walkingPrecedence == 0) {
                ++entity.anInt1503;
                return;
            }
        }
        int i = entity.x;
        int j = entity.y;
        int k = entity.pathX[entity.pathLength - 1] * 128 + entity.tileSize * 64;
        int l = entity.pathY[entity.pathLength - 1] * 128 + entity.tileSize * 64;
        if (k - i > 256 || k - i < -256 || l - j > 256 || l - j < -256) {
            entity.x = k;
            entity.y = l;
            return;
        }
        entity.turnDirection = i < k ? (j < l ? 1280 : (j > l ? 1792 : 1536)) : (i > k ? (j < l ? 768 : (j > l ? 256 : 512)) : (j < l ? 1024 : 0));
        int i1 = entity.turnDirection - entity.anInt1552 & 2047;
        if (i1 > 1024) {
            i1 -= 2048;
        }
        int j1 = entity.turn160DefAnim;
        if (i1 >= -256 && i1 <= 256) {
            j1 = entity.walkAnim;
        } else if (i1 >= 256 && i1 < 768) {
            j1 = entity.turn90CCAnim;
        } else if (i1 >= -768 && i1 <= -256) {
            j1 = entity.turn90CWAnim;
        }
        if (j1 == -1) {
            j1 = entity.walkAnim;
        }
        entity.anInt1517 = j1;
        int k1 = 4;
        if (entity.anInt1552 != entity.turnDirection && entity.interactingEntity == -1 && entity.anInt1504 != 0) {
            k1 = 2;
        }
        if (entity.pathLength > 2) {
            k1 = 6;
        }
        if (entity.pathLength > 3) {
            k1 = 8;
        }
        if (entity.anInt1503 > 0 && entity.pathLength > 1) {
            k1 = 8;
            --entity.anInt1503;
        }
        if (entity.pathRun[entity.pathLength - 1]) {
            k1 <<= 1;
        }
        if (k1 >= 8 && entity.anInt1517 == entity.walkAnim && entity.runAnim != -1) {
            entity.anInt1517 = entity.runAnim;
        }
        if (i < k) {
            entity.x += k1;
            if (entity.x > k) {
                entity.x = k;
            }
        } else if (i > k) {
            entity.x -= k1;
            if (entity.x < k) {
                entity.x = k;
            }
        }
        if (j < l) {
            entity.y += k1;
            if (entity.y > l) {
                entity.y = l;
            }
        } else if (j > l) {
            entity.y -= k1;
            if (entity.y < l) {
                entity.y = l;
            }
        }
        if (entity.x != k) return;
        if (entity.y != l) return;
        --entity.pathLength;
        if (entity.anInt1542 <= 0) return;
        --entity.anInt1542;
    }

    public int mixColors(Color color1, Color color2, float i) {
        float ratio = i / 100.0f;
        int red = (int)((float)color2.getRed() * ratio + (float)color1.getRed() * (1.0f - ratio));
        int green = (int)((float)color2.getGreen() * ratio + (float)color1.getGreen() * (1.0f - ratio));
        int blue = (int)((float)color2.getBlue() * ratio + (float)color1.getBlue() * (1.0f - ratio));
        return new Color(red, green, blue).getRGB();
    }

    @Override
    void mouseWheelDragged(int i, int j) {
        if (!this.mouseWheelDown) {
            return;
        }
        this.anInt1186 += i * 3;
        this.anInt1187 += j << 1;
    }

    public void moveBy(Compass direction) {
        this.moveBy(direction.x, direction.y);
    }

    public void moveBy(int x, int y) {
        this.calculatePath(2, 0, 1, 0, Client.myPlayer.pathY[0] + y, 1, 0, Client.myPlayer.pathY[0], Client.myPlayer.pathX[0], false, Client.myPlayer.pathX[0] + x);
    }

    public boolean newclickInRegion(int x1, int y1, Sprite drawnSprite) {
        if (this.saveClickX < x1) return false;
        if (this.saveClickX > x1 + drawnSprite.myWidth) return false;
        if (this.saveClickY < y1) return false;
        if (this.saveClickY > y1 + drawnSprite.myHeight) return false;
        return true;
    }

    public static String formatName(String name) {
        if (name.length() <= 0) return name;
        char first = name.charAt(0);
        StringBuilder fixed = new StringBuilder("" + Character.toUpperCase((char)first));
        int index = 1;
        while (index < name.length()) {
            char character = name.charAt(index);
            if (character == '_' || character == ' ') {
                character = ' ';
                fixed.append(character);
                if (index + 1 < name.length() && name.charAt(index + 1) >= 'a' && name.charAt(index + 1) <= 'z') {
                    fixed.append(Character.toUpperCase((char)name.charAt(index + 1)));
                    ++index;
                }
            } else {
                fixed.append(character);
            }
            ++index;
        }
        return fixed.toString();
    }

    public boolean newmouseInRegion(int x1, int y1, Sprite drawnSprite) {
        if (this.mouseX < x1) return false;
        if (this.mouseX > x1 + drawnSprite.myWidth) return false;
        if (this.mouseY < y1) return false;
        if (this.mouseY > y1 + drawnSprite.myHeight) return false;
        return true;
    }

    public void npcScreenPos(Mobile entity, int i) {
        this.calcEntityScreenPos(entity.x, i, entity.y);
    }

    public void nullLoader() {
        this.aBoolean831 = false;
        do {
            if (!this.drawingFlames) {
                this.anIntArray850 = null;
                this.anIntArray851 = null;
                this.anIntArray852 = null;
                this.anIntArray853 = null;
                this.anIntArray1190 = null;
                this.anIntArray1191 = null;
                this.anIntArray828 = null;
                this.anIntArray829 = null;
                this.aClass30_Sub2_Sub1_Sub1_1201 = null;
                this.aClass30_Sub2_Sub1_Sub1_1202 = null;
                return;
            }
            this.aBoolean831 = false;
            try {
                Thread.sleep((long)50L);
            }
            catch (Exception exception) {
            }
        } while (true);
    }

    public DataInputStream openJagGrabInputStream(String s) throws IOException {
        if (this.aSocket832 != null) {
            try {
                this.aSocket832.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.aSocket832 = null;
        }
        this.aSocket832 = this.openSocket(connectionStatus.getPort());
        this.aSocket832.setSoTimeout(10000);
        InputStream inputstream = this.aSocket832.getInputStream();
        OutputStream outputstream = this.aSocket832.getOutputStream();
        outputstream.write(("JAGGRAB /" + s + "\n\n").getBytes());
        return new DataInputStream(inputstream);
    }

    public Socket openSocket(int port) throws IOException {
        return new Socket(InetAddress.getByName((String)connectionStatus.getAddress()), port);
    }

    /*
     * Exception decompiling
     */
    public boolean parsePacket() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
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

    public void preloadModels() {
        File file = new File(CacheType.RAW.getFullLocation());
        if (!file.exists()) {
            return;
        }
        File[] listedFiles = file.listFiles();
        int i = 0;
        while (i < listedFiles.length) {
            String fileName = listedFiles[i].getName();
            byte[] abyte0 = FileOperations.readFile(CacheType.RAW.getFullLocation() + fileName);
            if (!Client.getFileNameWithoutExtension(fileName).equalsIgnoreCase("") && !fileName.equalsIgnoreCase("version.dat")) {
                try {
                    RevisionType revisionType = RevisionType.DEFAULT;
                    int modelId = Integer.parseInt((String)Client.getFileNameWithoutExtension(fileName));
                    for (int model : Configuration.PRELOADED_OSRS_MODELS) {
                        if (modelId != model) continue;
                        revisionType = RevisionType.OSRS;
                        break;
                    }
                    Model.method460(abyte0, modelId, revisionType);
                }
                catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            ++i;
        }
    }

    public void printDebug() {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.anInt1208);
        if (onDemandFetcher != null) {
            System.out.println("Od-cycle:" + Client.onDemandFetcher.onDemandCycle);
        }
        System.out.println("loop-cycle:" + loopCycle);
        System.out.println("draw-cycle:" + anInt1061);
        System.out.println("ptype:" + this.pktType);
        System.out.println("psize:" + this.pktSize);
        if (this.socketStream != null) {
            this.socketStream.printDebug();
        }
        this.shouldDebug = true;
    }

    public void processChatModeClick(int paddingX, int paddingY) {
        int mouseX = this.mouseX - paddingX;
        int mouseY = this.mouseY - paddingY;
        if (this.channelButtonHoverPosition > 0) {
            this.channelButtonHoverPosition = -1;
            inputTaken = true;
        }
        int xOffset = 1;
        int index = 0;
        while (index < CHANNEL_NAMES.length) {
            block4 : {
                block7 : {
                    block15 : {
                        block22 : {
                            block21 : {
                                block20 : {
                                    block19 : {
                                        block18 : {
                                            block17 : {
                                                block16 : {
                                                    block5 : {
                                                        block14 : {
                                                            block13 : {
                                                                block12 : {
                                                                    block11 : {
                                                                        block10 : {
                                                                            block9 : {
                                                                                block8 : {
                                                                                    block6 : {
                                                                                        Sprite toDraw = index == this.channelButtonClickPosition ? (this.channelButtonClickPosition == this.channelButtonHoverPosition ? this.chatAreaSprites[5] : this.chatAreaSprites[4]) : (index == this.channelButtonHoverPosition ? this.chatAreaSprites[index == 7 ? 7 : 3] : this.chatAreaSprites[index == 7 ? 6 : 2]);
                                                                                        if (mouseX < xOffset || mouseX > xOffset + toDraw.myWidth || mouseY < 480 || mouseY > 503) break block4;
                                                                                        if (this.clickMode3 != 1) break block5;
                                                                                        if (index != 7) {
                                                                                            this.channelButtonClickPosition = index;
                                                                                        }
                                                                                        if (index != 0) break block6;
                                                                                        this.chatTypeView = 0;
                                                                                        break block7;
                                                                                    }
                                                                                    if (index != 1) break block8;
                                                                                    this.chatTypeView = 5;
                                                                                    break block7;
                                                                                }
                                                                                if (index != 2) break block9;
                                                                                this.chatTypeView = 1;
                                                                                break block7;
                                                                            }
                                                                            if (index != 3) break block10;
                                                                            this.chatTypeView = 2;
                                                                            break block7;
                                                                        }
                                                                        if (index != 4) break block11;
                                                                        this.chatTypeView = 3;
                                                                        break block7;
                                                                    }
                                                                    if (index != 5) break block12;
                                                                    this.chatTypeView = 11;
                                                                    break block7;
                                                                }
                                                                if (index != 6) break block13;
                                                                this.chatTypeView = 12;
                                                                break block7;
                                                            }
                                                            if (index != 7) break block7;
                                                            if (openInterfaceID != -1 || this.myPrivilege[0] < 1) break block14;
                                                            this.clearTopInterfaces();
                                                            this.reportAbuseInput = "";
                                                            this.canMute = false;
                                                            break block15;
                                                        }
                                                        this.pushMessage("Staff Panel Is Disabled for you! Sorry :L", ChatMessage.ChatType.ZERO);
                                                        break block7;
                                                    }
                                                    this.channelButtonHoverPosition = index;
                                                    if (index != 0) break block16;
                                                    this.menuActionName[this.menuActionRow] = "View All";
                                                    this.menuActionID[this.menuActionRow] = 999;
                                                    ++this.menuActionRow;
                                                    break block7;
                                                }
                                                if (index != 1) break block17;
                                                this.menuActionName[this.menuActionRow] = "View Game";
                                                this.menuActionID[this.menuActionRow] = 998;
                                                ++this.menuActionRow;
                                                break block7;
                                            }
                                            if (index != 2) break block18;
                                            this.menuActionName[this.menuActionRow] = "Hide public";
                                            this.menuActionID[this.menuActionRow] = 997;
                                            ++this.menuActionRow;
                                            this.menuActionName[this.menuActionRow] = "Off public";
                                            this.menuActionID[this.menuActionRow] = 996;
                                            ++this.menuActionRow;
                                            this.menuActionName[this.menuActionRow] = "Friends public";
                                            this.menuActionID[this.menuActionRow] = 995;
                                            ++this.menuActionRow;
                                            this.menuActionName[this.menuActionRow] = "On public";
                                            this.menuActionID[this.menuActionRow] = 994;
                                            ++this.menuActionRow;
                                            this.menuActionName[this.menuActionRow] = "View public";
                                            this.menuActionID[this.menuActionRow] = 993;
                                            ++this.menuActionRow;
                                            break block7;
                                        }
                                        if (index != 3) break block19;
                                        this.menuActionName[this.menuActionRow] = "Off private";
                                        this.menuActionID[this.menuActionRow] = 992;
                                        ++this.menuActionRow;
                                        this.menuActionName[this.menuActionRow] = "Friends private";
                                        this.menuActionID[this.menuActionRow] = 991;
                                        ++this.menuActionRow;
                                        this.menuActionName[this.menuActionRow] = "On private";
                                        this.menuActionID[this.menuActionRow] = 990;
                                        ++this.menuActionRow;
                                        this.menuActionName[this.menuActionRow] = "View private";
                                        this.menuActionID[this.menuActionRow] = 989;
                                        ++this.menuActionRow;
                                        break block7;
                                    }
                                    if (index != 4) break block20;
                                    this.menuActionName[this.menuActionRow] = "Off trade";
                                    this.menuActionID[this.menuActionRow] = 987;
                                    ++this.menuActionRow;
                                    this.menuActionName[this.menuActionRow] = "Friends trade";
                                    this.menuActionID[this.menuActionRow] = 986;
                                    this.menuActionName[this.menuActionRow] = "On trade";
                                    this.menuActionID[this.menuActionRow] = 985;
                                    ++this.menuActionRow;
                                    this.menuActionName[this.menuActionRow] = "View trade";
                                    this.menuActionID[this.menuActionRow] = 984;
                                    ++this.menuActionRow;
                                    break block7;
                                }
                                if (index != 5) break block21;
                                this.menuActionName[this.menuActionRow] = "Off clan chat";
                                this.menuActionID[this.menuActionRow] = 1002;
                                ++this.menuActionRow;
                                this.menuActionName[this.menuActionRow] = "On clan chat";
                                this.menuActionID[this.menuActionRow] = 1001;
                                ++this.menuActionRow;
                                this.menuActionName[this.menuActionRow] = "View clan chat";
                                this.menuActionID[this.menuActionRow] = 1000;
                                ++this.menuActionRow;
                                break block7;
                            }
                            if (index != 6) break block22;
                            this.menuActionName[this.menuActionRow] = "Off yell messages";
                            this.menuActionID[this.menuActionRow] = 1005;
                            ++this.menuActionRow;
                            this.menuActionName[this.menuActionRow] = "On yell messages";
                            this.menuActionID[this.menuActionRow] = 1004;
                            ++this.menuActionRow;
                            this.menuActionName[this.menuActionRow] = "View yell messages";
                            this.menuActionID[this.menuActionRow] = 1003;
                            ++this.menuActionRow;
                            break block7;
                        }
                        if (index != 7) break block7;
                        this.menuActionName[this.menuActionRow] = "Staff Panel";
                        this.menuActionID[this.menuActionRow] = 606;
                        ++this.menuActionRow;
                        break block7;
                    }
                    for (int i = 0; i < RSInterface.interfaceCache.length; ++i) {
                        if (RSInterface.interfaceCache[i] == null || RSInterface.interfaceCache[i].contentType != 600) continue;
                        this.reportAbuseInterfaceID = Client.openInterfaceID = RSInterface.interfaceCache[i].parentID;
                        break;
                    }
                }
                inputTaken = true;
            }
            xOffset += toDraw.myWidth + 2;
            ++index;
        }
    }

    @Override
    public void processDrawing() {
        if (this.loadingError) {
            this.showErrorScreen();
            return;
        }
        if (Updater.isActive()) {
            return;
        }
        if (this.loginRenderer == null) {
            return;
        }
        ++anInt1061;
        if (!this.loggedIn) {
            this.loginRenderer.display();
        } else {
            this.drawGameScreen();
        }
        this.anInt1213 = 0;
    }

    @Override
    public void processGameLoop() {
        if (this.loadingError) {
            return;
        }
        ++loopCycle;
        if (Updater.isActive()) {
            return;
        }
        if (!this.loggedIn) {
            if (this.clientLoaded && this.loadingFlags[2]) {
                this.loginRenderer.click();
            }
        } else {
            this.mainGameProcessor();
        }
        if (onDemandFetcher != null) {
            this.processOnDemandQueue();
        }
        int width = this.getScreenWidth();
        int height = this.getScreenHeight();
        if (screenMode != ScreenMode.RESIZABLE) return;
        if (!this.isApplet) {
            if (clientWidth != width) {
                this.setResizing(true);
                this.myWidth = Client.clientWidth = width;
                this.updateScreen();
                this.setResizing(false);
            }
            if (clientHeight == height) return;
            this.setResizing(true);
            this.myHeight = Client.clientHeight = height;
            this.updateScreen();
            this.setResizing(false);
            return;
        }
        if (clientWidth != width) {
            this.setResizing(true);
            this.myWidth = Client.clientWidth = super.getWidth();
            this.updateScreen();
            this.setResizing(false);
        }
        if (clientHeight == height) return;
        this.setResizing(true);
        this.myHeight = Client.clientHeight = super.getHeight();
        this.updateScreen();
        this.setResizing(false);
    }

    public void processMenuClick() {
        if (this.activeInterfaceType != 0) {
            return;
        }
        int j = this.clickMode3;
        if (this.spellSelected == 1 && this.saveClickX >= clientWidth && this.saveClickY >= 160 && this.saveClickX <= clientHeight && this.saveClickY <= 205) {
            j = 0;
        }
        if (!this.menuOpen) return;
        if (j != 1) {
            int k = this.mouseX;
            int j1 = this.mouseY;
            if (this.menuScreenArea == 0) {
                k -= 4;
                j1 -= 4;
            }
            if (this.menuScreenArea == 1) {
                k -= 519;
                j1 -= 168;
            }
            if (this.menuScreenArea == 2) {
                k -= 5;
                j1 -= 338;
            }
            if (this.menuScreenArea == 3) {
                k -= 519;
                j1 += 0;
            }
            if (k < this.menuOffsetX - 10 || k > this.menuOffsetX + this.menuWidth + 10 || j1 < this.menuOffsetY - 10 || j1 > this.menuOffsetY + this.menuHeight + 10) {
                this.menuOpen = false;
                if (this.menuScreenArea == 1) {
                    needDrawTabArea = true;
                }
                if (this.menuScreenArea == 2) {
                    inputTaken = true;
                }
            }
        }
        if (j != 1) return;
        int l = this.menuOffsetX;
        int k1 = this.menuOffsetY;
        int i2 = this.menuWidth;
        int k2 = this.saveClickX;
        int l2 = this.saveClickY;
        if (this.menuScreenArea == 0) {
            k2 -= 4;
            l2 -= 4;
        }
        if (this.menuScreenArea == 1) {
            k2 -= 519;
            l2 -= 168;
        }
        if (this.menuScreenArea == 2) {
            k2 -= 5;
            l2 -= 338;
        }
        if (this.menuScreenArea == 3) {
            k2 -= 519;
            l2 += 0;
        }
        int i3 = -1;
        for (int j3 = 0; j3 < this.menuActionRow; ++j3) {
            int k3 = k1 + 31 + (this.menuActionRow - 1 - j3) * 15;
            if (k2 <= l || k2 >= l + i2 || l2 <= k3 - 13 || l2 >= k3 + 3) continue;
            i3 = j3;
        }
        this.menuOpen = false;
        if (this.menuScreenArea == 1) {
            needDrawTabArea = true;
        }
        if (this.menuScreenArea != 2) return;
        inputTaken = true;
    }

    public void processMinimapClick(int paddingX, int paddingY) {
        if (this.minimapCover != 0) {
            return;
        }
        if (this.clickMode3 != 1) return;
        if (this.isInArea(this.xPaddingmapBackImage + (!Client.isFixed() ? 155 : 207) + paddingX, -4 + paddingY, 21, 21)) return;
        if (this.isInArea(this.xPaddingmapBackImage + (!Client.isFixed() ? 176 : 228) + paddingX, -4 + paddingY, 21, 21)) {
            return;
        }
        int mapClickX = this.saveClickX - this.mapPaddingFromLeft - this.mapDrawAreaY - paddingX - 2;
        int mapClickY = this.saveClickY - this.mapPaddingFromTop - this.mapDrawAreaX - paddingY;
        if (mapClickX >= 0 && mapClickY >= 0 && mapClickX < this.mapInnerSizeWidth && mapClickY < this.mapInnerSizeHeight) {
            int k = this.compassRotation + this.mapAmtDiffRotation & 2047;
            int i1 = Rasterizer.anIntArray1470[k];
            int j1 = Rasterizer.anIntArray1471[k];
            int l1 = mapClickY * (j1 = j1 * (this.mapAmtDiffZoom + 256) >> 8) - mapClickX * (i1 = i1 * (this.mapAmtDiffZoom + 256) >> 8) >> 11;
            int j2 = Client.myPlayer.y - l1 >> 7;
            int k1 = (mapClickY -= 75) * i1 + (mapClickX -= 73) * j1 >> 11;
            int i2 = Client.myPlayer.x + k1 >> 7;
            boolean flag1 = this.calculatePath(1, 0, 0, 0, Client.myPlayer.pathY[0], 0, 0, j2, Client.myPlayer.pathX[0], true, i2);
            if (flag1) {
                this.stream.writeWordBigEndian(mapClickX);
                this.stream.writeWordBigEndian(mapClickY);
                this.stream.writeWord(this.compassRotation);
                this.stream.writeWordBigEndian(57);
                this.stream.writeWordBigEndian(this.mapAmtDiffRotation);
                this.stream.writeWordBigEndian(this.mapAmtDiffZoom);
                this.stream.writeWordBigEndian(89);
                this.stream.writeWord(Client.myPlayer.x);
                this.stream.writeWord(Client.myPlayer.y);
                this.stream.writeWordBigEndian(this.arbitraryDestination);
                this.stream.writeWordBigEndian(63);
            }
        }
        if (++anInt1117 <= 1151) return;
        anInt1117 = 0;
        this.stream.createFrame(246);
        this.stream.writeWordBigEndian(0);
        int l = this.stream.currentOffset;
        if ((int)(Math.random() * 2.0) == 0) {
            this.stream.writeWordBigEndian(101);
        }
        this.stream.writeWordBigEndian(197);
        this.stream.writeWord((int)(Math.random() * 65536.0));
        this.stream.writeWordBigEndian((int)(Math.random() * 256.0));
        this.stream.writeWordBigEndian(67);
        this.stream.writeWord(14214);
        if ((int)(Math.random() * 2.0) == 0) {
            this.stream.writeWord(29487);
        }
        this.stream.writeWord((int)(Math.random() * 65536.0));
        if ((int)(Math.random() * 2.0) == 0) {
            this.stream.writeWordBigEndian(220);
        }
        this.stream.writeWordBigEndian(180);
        this.stream.writeBytes(this.stream.currentOffset - l);
    }

    public void processOnDemandQueue() {
        do {
            block10 : {
                block8 : {
                    block16 : {
                        block15 : {
                            block14 : {
                                block13 : {
                                    block12 : {
                                        block11 : {
                                            block9 : {
                                                OnDemandData onDemandData;
                                                if ((onDemandData = onDemandFetcher.getNextNode()) == null) {
                                                    return;
                                                }
                                                if (onDemandData.dataType != 0) break block9;
                                                Model.method460(onDemandData.buffer, onDemandData.ID, RevisionType.DEFAULT);
                                                if (this.backDialogID == -1) break block10;
                                                inputTaken = true;
                                                break block10;
                                            }
                                            if (onDemandData.dataType != 1 || onDemandData.buffer == null) break block11;
                                            FrameReader.readCacheFile(onDemandData.buffer, onDemandData.ID, RevisionType.DEFAULT);
                                            break block10;
                                        }
                                        if (onDemandData.dataType != 2 || onDemandData.ID != this.nextSong || onDemandData.buffer == null) break block12;
                                        SoundProvider.getSingleton().playMIDI(onDemandData.buffer);
                                        break block10;
                                    }
                                    if (onDemandData.dataType != 3 || loadingStage != 1) break block13;
                                    try {
                                        Client.writeFile(onDemandData.buffer, "./maps/" + onDemandData.ID + ".dat");
                                        break block8;
                                    }
                                    catch (Exception exception) {
                                        // empty catch block
                                    }
                                    break block8;
                                }
                                if (onDemandData.dataType != 4) break block14;
                                Model.method460(onDemandData.buffer, onDemandData.ID, RevisionType.OSRS);
                                if (this.backDialogID == -1) break block10;
                                inputTaken = true;
                                break block10;
                            }
                            if (onDemandData.dataType != 5 || onDemandData.buffer == null) break block15;
                            FrameReader.readCacheFile(onDemandData.buffer, onDemandData.ID, RevisionType.OSRS);
                            break block10;
                        }
                        if (onDemandData.dataType != 6) break block16;
                        Model.method460(onDemandData.buffer, onDemandData.ID, RevisionType.PRE_EOC);
                        if (this.backDialogID == -1) break block10;
                        inputTaken = true;
                        break block10;
                    }
                    if (onDemandData.dataType != 7) break block10;
                    Model.method460(onDemandData.buffer, onDemandData.ID, RevisionType.CUSTOM_ITEM_MODELS);
                    if (this.backDialogID != -1) {
                        inputTaken = true;
                    }
                    break block10;
                }
                for (int i = 0; i < this.aByteArrayArray1183.length; ++i) {
                    if (this.anIntArray1235[i] == onDemandData.ID) {
                        this.aByteArrayArray1183[i] = onDemandData.buffer;
                        if (onDemandData.buffer != null) break;
                        this.anIntArray1235[i] = -1;
                        break;
                    }
                    if (this.anIntArray1236[i] != onDemandData.ID) {
                        continue;
                    }
                    this.aByteArrayArray1247[i] = onDemandData.buffer;
                    if (onDemandData.buffer != null) break;
                    this.anIntArray1236[i] = -1;
                    break;
                }
            }
            if (onDemandData.dataType != 93 || !onDemandFetcher.method564(onDemandData.ID)) continue;
            MapRegion.method173(new Stream(onDemandData.buffer), onDemandFetcher);
        } while (true);
    }

    public void processRightClick() {
        int height;
        if (this.activeInterfaceType != 0) {
            return;
        }
        this.menuActionName[0] = "Cancel";
        this.menuActionID[0] = 1107;
        this.menuActionRow = 1;
        if (this.fullscreenInterfaceID != -1) {
            this.hoverChildId = 0;
            this.hoverToggleChildId = 0;
            this.buildInterfaceMenu(Client.isFixed() ? 8 : this.getScreenWidth() / 2 - RSInterface.interfaceCache[this.fullscreenInterfaceID].width / 2, RSInterface.interfaceCache[this.fullscreenInterfaceID], this.mouseX, Client.isFixed() ? 8 : this.getScreenHeight() / 2 - RSInterface.interfaceCache[this.fullscreenInterfaceID].height / 2, this.mouseY, 0);
            if (this.hoverChildId != this.lastHoverChildId) {
                this.lastHoverChildId = this.hoverChildId;
            }
            if (this.hoverToggleChildId == this.lastHoverToggleChildId) return;
            this.lastHoverToggleChildId = this.hoverToggleChildId;
            return;
        }
        this.buildSplitPrivateChatMenu(0, this.getChatBackIncreaseY());
        this.hoverChildId = 0;
        this.hoverToggleChildId = 0;
        int width = !Client.isFixed() ? this.getScreenWidth() : 516;
        int n = height = !Client.isFixed() ? this.getScreenHeight() : 338;
        if (!(this.mouseX <= 0 || this.mouseY <= 0 || this.mouseX >= width || this.mouseY >= height || Client.isFixed() && this.mouseX > 519 + this.getTabIncreaseX() && this.mouseY > 168 + this.getTabIncreaseY() && this.mouseX < 765 + this.getTabIncreaseX() && this.mouseY < 503 + this.getTabIncreaseY() || !Client.isFixed() && focusTab != -1 && this.mouseX > 22 - (!newTabs ? 23 : 0) + this.xPaddingtabBack + this.getTabIncreaseX() && this.mouseY > -14 + this.yPaddingtabBack + this.getTabIncreaseY() && this.mouseX < 22 + (!newTabs ? 20 : 0) + this.xPaddingtabBack + this.getTabIncreaseX() + 204 && this.mouseY < 32 + (!newTabs ? 37 : 0) - 46 + this.yPaddingtabBack + this.getTabIncreaseY() + 275 || this.mouseX > 0 && this.mouseY > 338 + this.getChatBackIncreaseY() && this.mouseX < 517 && this.mouseY < 503 + this.getChatBackIncreaseY() || this.mouseX > this.xPaddingmapBackImage + this.getMapIncreaseX() + (!Client.isFixed() ? -25 : 0) && this.mouseY > 0 && this.mouseX < this.xPaddingmapBackImage + this.getMapIncreaseX() + 249 && this.mouseY < this.yPaddingmapBackImage + this.getMapIncreaseY() + 168)) {
            if (openInterfaceID != -1) {
                RSInterface rsInterface = RSInterface.interfaceCache[openInterfaceID];
                if (!Client.isFixed()) {
                    int interfaceWidth = !Client.isFixed() ? this.getScreenWidth() : 516;
                    int interfaceHeight = !Client.isFixed() ? this.getScreenHeight() : 338;
                    this.buildInterfaceMenu(this.gameScreenDrawX + (interfaceWidth - 765) / 2, rsInterface, this.mouseX, this.gameScreenDrawY + (interfaceHeight - 503) / 2, this.mouseY, 0);
                } else {
                    this.buildInterfaceMenu(4, rsInterface, this.mouseX, 4, this.mouseY, 0);
                }
            } else {
                this.build3dScreenMenu();
            }
        }
        if (this.hoverChildId != this.lastHoverChildId) {
            this.lastHoverChildId = this.hoverChildId;
        }
        if (this.hoverToggleChildId != this.lastHoverToggleChildId) {
            this.lastHoverToggleChildId = this.hoverToggleChildId;
        }
        this.hoverChildId = 0;
        this.hoverToggleChildId = 0;
        if (this.mouseX > 548 + this.getTabIncreaseX() && this.mouseY > 207 - (!Client.isFixed() ? 46 : 0) + this.getTabIncreaseY() && this.mouseX < 740 + this.getTabIncreaseX() && this.mouseY < 468 + this.getTabIncreaseY()) {
            if (this.invOverlayInterfaceID != -1) {
                this.buildInterfaceMenu(547 + this.getTabIncreaseX(), RSInterface.interfaceCache[this.invOverlayInterfaceID], this.mouseX, 205 - (!Client.isFixed() && newTabs ? 46 : 0) + this.getTabIncreaseY(), this.mouseY, 0);
            } else if (tabInterfaceIDs[tabID] != -1 && focusTab != -1) {
                this.buildInterfaceMenu(547 + this.getTabIncreaseX(), RSInterface.interfaceCache[tabInterfaceIDs[tabID]], this.mouseX, 205 - (!Client.isFixed() && newTabs ? 46 : 0) + this.getTabIncreaseY(), this.mouseY, 0);
            }
        }
        if (this.hoverChildId != this.anInt1048) {
            needDrawTabArea = true;
            tabAreaAltered = true;
            this.anInt1048 = this.hoverChildId;
        }
        if (this.hoverToggleChildId != this.anInt1044) {
            needDrawTabArea = true;
            tabAreaAltered = true;
            this.anInt1044 = this.hoverToggleChildId;
        }
        this.hoverChildId = 0;
        this.hoverToggleChildId = 0;
        if (this.mouseX > 0 && this.mouseY > 338 + this.getChatBackIncreaseY() && this.mouseX < 490 && this.mouseY < 503 + this.getChatBackIncreaseY()) {
            if (this.backDialogID != -1) {
                this.buildInterfaceMenu(20, RSInterface.interfaceCache[this.backDialogID], this.mouseX, 358 + this.getChatBackIncreaseY(), this.mouseY, 0);
            } else if (this.mouseY < 503 + this.getChatBackIncreaseY() && this.mouseX < 490 + this.getChatBackIncreaseY()) {
                this.buildChatAreaMenu(this.mouseY - (this.yPaddingchatBackImage + this.getChatBackIncreaseY()));
            }
        }
        if (this.backDialogID != -1 && this.hoverChildId != this.anInt1039) {
            inputTaken = true;
            this.anInt1039 = this.hoverChildId;
        }
        if (this.backDialogID != -1 && this.hoverToggleChildId != this.anInt1500) {
            inputTaken = true;
            this.anInt1500 = this.hoverToggleChildId;
        }
        this.rightClickMapArea(this.getMapIncreaseX(), this.getMapIncreaseY());
        this.processTabClick(this.getTabIncreaseX(), this.getTabIncreaseY());
        this.alertHandler.processMouse(this.mouseX, this.mouseY);
        boolean flag = false;
        if (flag) return;
        flag = true;
        int j = 0;
        while (j < this.menuActionRow - 1) {
            if (this.menuActionID[j] < 1000 && this.menuActionID[j + 1] > 1000) {
                String s = this.menuActionName[j];
                this.menuActionName[j] = this.menuActionName[j + 1];
                this.menuActionName[j + 1] = s;
                int k = this.menuActionID[j];
                this.menuActionID[j] = this.menuActionID[j + 1];
                this.menuActionID[j + 1] = k;
                k = this.menuActionCmd2[j];
                this.menuActionCmd2[j] = this.menuActionCmd2[j + 1];
                this.menuActionCmd2[j + 1] = k;
                k = this.menuActionCmd3[j];
                this.menuActionCmd3[j] = this.menuActionCmd3[j + 1];
                this.menuActionCmd3[j + 1] = k;
                k = this.menuActionCmd1[j];
                this.menuActionCmd1[j] = this.menuActionCmd1[j + 1];
                this.menuActionCmd1[j + 1] = k;
                flag = false;
            }
            ++j;
        }
    }

    public void processTabClick(int paddingX, int paddingY) {
        boolean newTabClick = !Client.isFixed() && newTabs;
        if (this.invOverlayInterfaceID != -1) return;
        if (this.mouseX >= 521 + paddingX && this.mouseX <= 550 + paddingX && this.mouseY >= 169 + (newTabClick ? 261 : 0) + paddingY && this.mouseY < 205 + (newTabClick ? 261 : 0) + paddingY && tabInterfaceIDs[0] != -1) {
            this.menuActionName[1] = "Combat Styles";
            this.menuActionID[1] = 1011;
            this.menuActionRow = 2;
            this.tabIDHover = 0;
            return;
        }
        if (this.mouseX >= 552 + paddingX && this.mouseX <= 581 + paddingX && this.mouseY >= 168 + (newTabClick ? 261 : 0) + paddingY && this.mouseY < 205 + (newTabClick ? 261 : 0) + paddingY && tabInterfaceIDs[14] != -1) {
            this.menuActionName[1] = "New Skills";
            this.menuActionID[1] = 1042;
            this.menuActionRow = 2;
            this.tabIDHover = 1;
            return;
        }
        if (this.mouseX >= 582 + paddingX && this.mouseX <= 611 + paddingX && this.mouseY >= 168 + (newTabClick ? 261 : 0) + paddingY && this.mouseY < 205 + (newTabClick ? 261 : 0) + paddingY && tabInterfaceIDs[1] != -1) {
            this.menuActionName[1] = "Stats";
            this.menuActionID[1] = 1012;
            this.menuActionRow = 2;
            this.tabIDHover = 2;
            return;
        }
        if (this.mouseX >= 612 + paddingX && this.mouseX <= 641 + paddingX && this.mouseY >= 168 + (newTabClick ? 261 : 0) + paddingY && this.mouseY < 203 + (newTabClick ? 261 : 0) + paddingY && tabInterfaceIDs[2] != -1) {
            this.menuActionName[1] = "Quest Journals";
            this.menuActionID[1] = 1013;
            this.menuActionRow = 2;
            this.tabIDHover = 3;
            return;
        }
        if (this.mouseX >= 642 + paddingX && this.mouseX <= 671 + paddingX && this.mouseY >= 168 + (newTabClick ? 261 : 0) + paddingY && this.mouseY < 205 + (newTabClick ? 261 : 0) + paddingY && tabInterfaceIDs[3] != -1) {
            this.menuActionName[1] = "Inventory";
            this.menuActionID[1] = 1014;
            this.menuActionRow = 2;
            this.tabIDHover = 4;
            return;
        }
        if (this.mouseX >= 672 + paddingX && this.mouseX <= 701 + paddingX && this.mouseY >= 168 + (newTabClick ? 261 : 0) + paddingY && this.mouseY < 205 + (newTabClick ? 261 : 0) + paddingY && tabInterfaceIDs[4] != -1) {
            this.menuActionName[1] = "Worn Equipment";
            this.menuActionID[1] = 1015;
            this.menuActionRow = 2;
            this.tabIDHover = 5;
            return;
        }
        if (this.mouseX >= 702 + paddingX && this.mouseX <= 731 + paddingX && this.mouseY >= 169 + (newTabClick ? 261 : 0) + paddingY && this.mouseY < 205 + (newTabClick ? 261 : 0) + paddingY && tabInterfaceIDs[5] != -1) {
            this.menuActionName[1] = "Prayer List";
            this.menuActionID[1] = 1016;
            this.menuActionRow = 2;
            this.tabIDHover = 6;
            return;
        }
        if (this.mouseX >= 732 + paddingX && this.mouseX <= 761 + paddingX && this.mouseY >= 169 + (newTabClick ? 261 : 0) + paddingY && this.mouseY < 205 + (newTabClick ? 261 : 0) + paddingY && tabInterfaceIDs[6] != -1) {
            this.menuActionName[1] = "Magic Spellbook";
            this.menuActionID[1] = 1017;
            this.menuActionRow = 2;
            this.tabIDHover = 7;
            return;
        }
        if (this.mouseX >= 522 + paddingX && this.mouseX <= 551 + paddingX && this.mouseY >= 466 + paddingY && this.mouseY < 503 + paddingY && tabInterfaceIDs[16] != -1) {
            this.menuActionName[1] = "Summoning";
            this.menuActionID[1] = 1043;
            this.menuActionRow = 2;
            this.tabIDHover = 14;
            return;
        }
        if (this.mouseX >= 552 + paddingX && this.mouseX <= 581 + paddingX && this.mouseY >= 466 + paddingY && this.mouseY < 503 + paddingY && tabInterfaceIDs[8] != -1) {
            this.menuActionName[1] = "Friends List";
            this.menuActionID[1] = 1019;
            this.menuActionRow = 2;
            this.tabIDHover = 8;
            return;
        }
        if (this.mouseX >= 582 + paddingX && this.mouseX <= 611 + paddingX && this.mouseY >= 466 + paddingY && this.mouseY < 503 + paddingY && tabInterfaceIDs[9] != -1) {
            this.menuActionName[1] = "Ignore List";
            this.menuActionID[1] = 1020;
            this.menuActionRow = 2;
            this.tabIDHover = 9;
            return;
        }
        if (this.mouseX >= 612 + paddingX && this.mouseX <= 641 + paddingX && this.mouseY >= 466 + paddingY && this.mouseY < 503 + paddingY && tabInterfaceIDs[7] != -1) {
            this.menuActionName[1] = "Clan Chat";
            this.menuActionID[1] = 1018;
            this.menuActionRow = 2;
            this.tabIDHover = 10;
            return;
        }
        if (this.mouseX >= 642 + paddingX && this.mouseX <= 671 + paddingX && this.mouseY >= 466 + paddingY && this.mouseY < 503 + paddingY && tabInterfaceIDs[11] != -1) {
            this.menuActionName[1] = "Options";
            this.menuActionID[1] = 1022;
            this.menuActionRow = 2;
            this.tabIDHover = 11;
            return;
        }
        if (this.mouseX >= 672 + paddingX && this.mouseX <= 701 + paddingX && this.mouseY >= 466 + paddingY && this.mouseY < 503 + paddingY && tabInterfaceIDs[12] != -1) {
            this.menuActionName[1] = "Emotes";
            this.menuActionID[1] = 1023;
            this.menuActionRow = 2;
            this.tabIDHover = 12;
            return;
        }
        if (this.mouseX >= 702 + paddingX && this.mouseX <= 731 + paddingX && this.mouseY >= 466 + paddingY && this.mouseY < 502 + paddingY && tabInterfaceIDs[13] != -1) {
            this.menuActionName[1] = "Construction";
            this.menuActionID[1] = 1024;
            this.menuActionRow = 2;
            this.tabIDHover = 13;
            return;
        }
        if (this.mouseX >= 732 + paddingX && this.mouseX <= 761 + paddingX && this.mouseY >= 466 + paddingY && this.mouseY < 502 + paddingY && tabInterfaceIDs[15] != -1) {
            this.menuActionName[1] = "Information";
            this.menuActionID[1] = 1044;
            this.menuActionRow = 2;
            this.tabIDHover = 15;
            return;
        }
        this.tabIDHover = -1;
        needDrawTabArea = true;
        tabAreaAltered = true;
    }

    public void processXPCounterClick(int paddingX, int paddingY) {
        if (!this.isOnXPCounter(paddingX, paddingY)) return;
        this.menuActionName[this.menuActionRow] = "Reset XP Total";
        this.menuActionID[this.menuActionRow] = 475;
        ++this.menuActionRow;
        this.menuActionName[this.menuActionRow] = "Toggle XP Total";
        this.menuActionID[this.menuActionRow] = 474;
        ++this.menuActionRow;
    }

    public boolean promptUserForInput(RSInterface class9) {
        int j = class9.contentType;
        if (this.anInt900 == 2) {
            if (j == 201) {
                inputTaken = true;
                this.inputDialogState = 0;
                this.messagePromptRaised = true;
                this.promptInput = "";
                this.friendsListAction = 1;
                this.aString1121 = "Enter name of friend to add to list";
            }
            if (j == 202) {
                inputTaken = true;
                this.inputDialogState = 0;
                this.messagePromptRaised = true;
                this.promptInput = "";
                this.friendsListAction = 2;
                this.aString1121 = "Enter name of friend to delete from list";
            }
        }
        if (j == 205) {
            this.anInt1011 = 250;
            return true;
        }
        if (j == 501) {
            inputTaken = true;
            this.inputDialogState = 0;
            this.messagePromptRaised = true;
            this.promptInput = "";
            this.friendsListAction = 4;
            this.aString1121 = "Enter name of player to add to list";
        }
        if (j == 502) {
            inputTaken = true;
            this.inputDialogState = 0;
            this.messagePromptRaised = true;
            this.promptInput = "";
            this.friendsListAction = 5;
            this.aString1121 = "Enter name of player to delete from list";
        }
        if (j == 550) {
            inputTaken = true;
            this.inputDialogState = 0;
            this.messagePromptRaised = true;
            this.promptInput = "";
            this.friendsListAction = 6;
            this.aString1121 = "Enter the name of the chat you wish to join";
        }
        if (j >= 300 && j <= 313) {
            int k = (j - 300) / 2;
            int j1 = j & 1;
            int i2 = this.anIntArray1065[k];
            if (i2 != -1) {
                do {
                    if (j1 == 0 && --i2 < 0) {
                        i2 = IDK.length - 1;
                    }
                    if (j1 != 1 || ++i2 < IDK.length) continue;
                    i2 = 0;
                } while (IDK.cache[i2].aBoolean662 || IDK.cache[i2].anInt657 != k + (this.aBoolean1047 ? 0 : 7));
                this.anIntArray1065[k] = i2;
                this.aBoolean1031 = true;
            }
        }
        if (j >= 314 && j <= 323) {
            int l = (j - 314) / 2;
            int k1 = j & 1;
            int j2 = this.anIntArray990[l];
            if (k1 == 0 && --j2 < 0) {
                j2 = equipmentColors[l].length - 1;
            }
            if (k1 == 1 && ++j2 >= equipmentColors[l].length) {
                j2 = 0;
            }
            this.anIntArray990[l] = j2;
            this.aBoolean1031 = true;
        }
        if (j == 324 && !this.aBoolean1047) {
            this.aBoolean1047 = true;
            this.method45();
        }
        if (j == 325 && this.aBoolean1047) {
            this.aBoolean1047 = false;
            this.method45();
        }
        if (j == 326) {
            this.stream.createFrame(101);
            this.stream.writeWordBigEndian(this.aBoolean1047 ? 0 : 1);
            for (int i1 = 0; i1 < 7; ++i1) {
                this.stream.writeWordBigEndian(this.anIntArray1065[i1]);
            }
            int l1 = 0;
            while (l1 < 5) {
                this.stream.writeWordBigEndian(this.anIntArray990[l1]);
                ++l1;
            }
            return true;
        }
        if (j == 612) {
            boolean bl = this.canMute = !this.canMute;
        }
        if (j == 613) {
            this.canBan = !this.canBan;
        }
        if (j < 602) return false;
        if (j > 616) return false;
        this.clearTopInterfaces();
        if (this.reportAbuseInput.length() <= 0) return false;
        if (this.myPrivilege[0] <= 0) return false;
        String[] commands = new String[]{"mute", "unmute", "jail", "unjail", "ban", "unban", "", "ipmute", "unipmute", "ipban", "unipban"};
        String inputString = "::" + commands[j - 602] + " " + this.reportAbuseInput;
        this.stream.createFrame(103);
        this.stream.writeWordBigEndian(inputString.length() - 1);
        this.stream.writeString(inputString.substring(2));
        return false;
    }

    private void pushMessage(ChatMessage chatMessage) {
        if (chatMessage == null) {
            return;
        }
        if (chatMessage.getType().getType() == 0 && this.dialogID != -1) {
            this.aString844 = chatMessage.getMessage();
            this.clickMode3 = 0;
        }
        if (this.backDialogID == -1) {
            inputTaken = true;
        }
        this.chatMessages.add(0, (Object)chatMessage);
        if (this.chatMessages.size() <= 500) return;
        this.chatMessages.remove(499);
    }

    private void pushMessage(String message) {
        this.pushMessage(message, ChatMessage.ChatType.ZERO);
    }

    private void pushMessage(String message, ChatMessage.ChatType type) {
        this.pushMessage(new ChatMessage(message, type));
    }

    private void pushMessage(String title, String name, String message, ChatMessage.ChatType type) {
        this.pushMessage(new ChatMessage(title, name, message, type));
    }

    @Override
    public void raiseWelcomeScreen() {
        this.welcomeScreenRaised = true;
    }

    public int random(int range) {
        return (int)(Math.random() * (double)range);
    }

    public void randomizeBackground(Background background) {
        int j = 256;
        for (int k = 0; k < this.anIntArray1190.length; ++k) {
            this.anIntArray1190[k] = 0;
        }
        for (int l = 0; l < 5000; ++l) {
            int i1 = (int)(Math.random() * 128.0 * (double)j);
            this.anIntArray1190[i1] = (int)(Math.random() * 256.0);
        }
        int j1 = 0;
        do {
            if (j1 >= 20) break;
            for (int k1 = 1; k1 < j - 1; ++k1) {
                for (int i2 = 1; i2 < 127; ++i2) {
                    int k2 = i2 + (k1 << 7);
                    this.anIntArray1191[k2] = (this.anIntArray1190[k2 - 1] + this.anIntArray1190[k2 + 1] + this.anIntArray1190[k2 - 128] + this.anIntArray1190[k2 + 128]) / 4;
                }
            }
            int[] ai = this.anIntArray1190;
            this.anIntArray1190 = this.anIntArray1191;
            this.anIntArray1191 = ai;
            ++j1;
        } while (true);
        if (background == null) return;
        int l1 = 0;
        int j2 = 0;
        while (j2 < background.anInt1453) {
            for (int l2 = 0; l2 < background.anInt1452; ++l2) {
                if (background.aByteArray1450[l1++] == 0) continue;
                int i3 = l2 + 16 + background.anInt1454;
                int j3 = j2 + 16 + background.anInt1455;
                int k3 = i3 + (j3 << 7);
                this.anIntArray1190[k3] = 0;
            }
            ++j2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public void readDetails() {
        block29 : {
            line = "";
            token = "";
            token2 = "";
            ReadMode = 0;
            EndOfFile = false;
            token3 = new String[30];
            details = null;
            try {
                details = new BufferedReader((Reader)new FileReader(Signlink.getDirectory() + "/saveuser.ini"));
                try {
                    line = details.readLine();
                }
                catch (IOException ioexception) {
                    System.out.println("Error reading saveuser.ini");
                }
            }
            catch (FileNotFoundException file) {
                System.out.println("Couldn't find saveuser.ini");
                break block29;
            }
            while (!EndOfFile && line != null) {
                spot = (line = line.trim()).indexOf("=");
                if (spot > -1) {
                    token = line.substring(0, spot);
                    token = token.trim();
                    token2 = line.substring(spot + 1);
                    token2 = token2.trim();
                    token3 = token2.split("\t");
                    switch (ReadMode) {
                        case 1: {
                            if (token.equals((Object)"username")) {
                                this.myUsername = token2;
                            }
                            if (token.equals((Object)"password")) {
                                this.myPassword = token2;
                            }
                            if (!token.equals((Object)"announcement")) ** break;
                            Client.announcement = token2.equals((Object)"0") == false;
                            ** break;
                        }
                        case 2: {
                            if (!token.equals((Object)"prayer")) ** break;
                            for (j = 0; j < token3.length; ++j) {
                                this.quickPrayers[j] = Integer.parseInt((String)token3[j]);
                            }
                            break;
                        }
                        case 3: {
                            if (!token.equals((Object)"curse")) ** break;
                            for (j = 0; j < token3.length; ++j) {
                                this.quickCurses[j] = Integer.parseInt((String)token3[j]);
                            }
                            break;
                        }
                        default: lbl-1000: // 5 sources:
                        {
                            break;
                        }
                    }
                } else {
                    if (line.equals((Object)"[ACCOUNT]")) {
                        ReadMode = 1;
                    } else if (line.equals((Object)"[PRAYERS]")) {
                        ReadMode = 2;
                    } else if (line.equals((Object)"[CURSES]")) {
                        ReadMode = 3;
                    }
                    if (line.equals((Object)"[EOF]")) {
                        try {
                            details.close();
                        }
                        catch (IOException ioexception) {
                            ioexception.printStackTrace();
                        }
                    }
                }
                try {
                    line = details.readLine();
                }
                catch (IOException ioexception1) {
                    EndOfFile = true;
                }
            }
        }
        try {
            if (details == null) return;
            details.close();
            return;
        }
        catch (NullPointerException ex) {
            ex.printStackTrace();
            return;
        }
        catch (IOException ioexception) {
            ioexception.printStackTrace();
        }
    }

    public void recreateClientFrame(boolean undecorative, int width, int height, boolean resizable, int displayMode, boolean toggle) {
        instance.recreateClientFrame(undecorative, width, height, resizable);
    }

    public void renderMapAndCompassHalfs() {
        int loopHeight = 0;
        do {
            int loopWidth;
            if (loopHeight >= 33) break;
            int k6 = 999;
            for (loopWidth = 0; loopWidth < 33; ++loopWidth) {
                if (this.mapBack[2].aByteArray1450[loopWidth + loopHeight * 33] == 0) {
                    if (k6 != 999) continue;
                    k6 = loopWidth;
                    continue;
                }
                if (k6 != 999) break;
            }
            this.compassPixelCutLeft[loopHeight] = k6;
            this.compassPixelCutRight[loopHeight] = loopWidth - k6;
            ++loopHeight;
        } while (true);
        loopHeight = 0;
        while (loopHeight < 152) {
            int j7 = 999;
            int finalWidth = 0;
            for (int loopWidth = 0; loopWidth < 152; ++loopWidth) {
                if (this.mapBack[1].aByteArray1450[loopWidth + loopHeight * 152] == 0) {
                    if (j7 != 999) continue;
                    j7 = loopWidth;
                    continue;
                }
                if (j7 == 999) continue;
                finalWidth = loopWidth;
                break;
            }
            this.mapImagePixelCutLeft[loopHeight - 0] = j7 - 0;
            if (finalWidth - j7 == 0) {
                finalWidth = 152;
                j7 = 0;
            }
            this.mapImagePixelCutRight[loopHeight - 0] = finalWidth - j7;
            ++loopHeight;
        }
    }

    public void repackCacheIndex(int cacheIndex) {
        System.out.println("Started repacking index " + cacheIndex + ".");
        int indexLength = new File(this.indexLocation(cacheIndex, -1)).listFiles().length;
        File[] file = new File(this.indexLocation(cacheIndex, -1)).listFiles();
        try {
            for (int index = 0; index < indexLength; ++index) {
                if (!file[index].getName().endsWith(".gz")) continue;
                int fileIndex = Integer.parseInt((String)Client.getFileNameWithoutExtension(file[index].toString()));
                byte[] data = this.fileToByteArray(cacheIndex, fileIndex);
                if (data != null && data.length > 0) {
                    this.decompressors[cacheIndex].put(fileIndex, data);
                    System.out.println("Repacked " + fileIndex + ".");
                    continue;
                }
                System.out.println("Unable to locate index " + fileIndex + ".");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error packing cache index " + cacheIndex + ".");
        }
        System.out.println("Finished repacking " + cacheIndex + ".");
    }

    public boolean replayWave() {
        return Signlink.wavereplay();
    }

    public void resetAllImageProducers() {
        if (this.fullGameScreen != null) {
            return;
        }
        this.chatBackImage = null;
        this.mapBackImage = null;
        this.sideTabArea = null;
        this.main3DArea = null;
        this.aGraphicsBuffer_1123 = null;
        this.aGraphicsBuffer_1124 = null;
        this.aGraphicsBuffer_1125 = null;
        this.aGraphicsBuffer_1107 = null;
        this.aGraphicsBuffer_1108 = null;
        loginScreenGraphicsBuffer = null;
        updateScreenGraphicsBuffer = null;
        this.updaterRenderer = null;
        this.aGraphicsBuffer_1110 = null;
        this.aGraphicsBuffer_1111 = null;
        this.aGraphicsBuffer_1112 = null;
        this.aGraphicsBuffer_1113 = null;
        this.aGraphicsBuffer_1114 = null;
        this.aGraphicsBuffer_1115 = null;
        this.fullGameScreen = Client.constructGraphicsBuffer(clientWidth, clientHeight, this.getGameComponent());
        this.welcomeScreenRaised = true;
    }

    public void resetImage() {
        DrawingArea.setAllPixelsToZero();
    }

    public void resetImageProducers() {
        if (this.aGraphicsBuffer_1107 != null) {
            return;
        }
        this.fullGameScreen = null;
        this.rightFrame = null;
        this.chatBackImage = null;
        this.mapBackImage = null;
        this.sideTabArea = null;
        this.main3DArea = null;
        this.aGraphicsBuffer_1123 = null;
        this.aGraphicsBuffer_1124 = null;
        this.aGraphicsBuffer_1125 = null;
        this.aGraphicsBuffer_1110 = Client.constructGraphicsBuffer(128, 265, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        this.aGraphicsBuffer_1111 = Client.constructGraphicsBuffer(128, 265, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        this.aGraphicsBuffer_1107 = Client.constructGraphicsBuffer(509, 171, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        this.aGraphicsBuffer_1108 = Client.constructGraphicsBuffer(360, 132, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        loginScreenGraphicsBuffer = Client.constructGraphicsBuffer(clientWidth, clientHeight, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        this.aGraphicsBuffer_1112 = Client.constructGraphicsBuffer(202, 238, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        this.aGraphicsBuffer_1113 = Client.constructGraphicsBuffer(203, 238, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        this.aGraphicsBuffer_1114 = Client.constructGraphicsBuffer(74, 94, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        this.aGraphicsBuffer_1115 = Client.constructGraphicsBuffer(75, 94, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        this.welcomeScreenRaised = true;
    }

    public void resetImageProducers2() {
        if (this.chatBackImage != null) {
            return;
        }
        this.nullLoader();
        this.rightFrame = null;
        this.fullGameScreen = null;
        this.aGraphicsBuffer_1107 = null;
        this.aGraphicsBuffer_1108 = null;
        loginScreenGraphicsBuffer = null;
        this.updaterRenderer = null;
        this.aGraphicsBuffer_1110 = null;
        this.aGraphicsBuffer_1111 = null;
        this.aGraphicsBuffer_1112 = null;
        this.aGraphicsBuffer_1113 = null;
        this.aGraphicsBuffer_1114 = null;
        this.aGraphicsBuffer_1115 = null;
        this.chatBackImage = Client.constructGraphicsBuffer(this.xPaddingtabBack, this.yPaddingtabBack, this.getGameComponent());
        this.mapBackImage = Client.constructGraphicsBuffer(this.miniMapWidth, this.miniMapHeight, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        if (Client.isFixed()) {
            this.mapBack[0].drawBackground(0, 0);
        }
        this.rightFrame = Client.constructGraphicsBuffer(3, 170, this.getGameComponent());
        this.sideTabArea = Client.constructGraphicsBuffer(246, 335, this.getGameComponent());
        this.main3DArea = Client.constructGraphicsBuffer(this.main3DAreaWidth, this.main3DAreaHeight, this.getGameComponent());
        DrawingArea.setAllPixelsToZero();
        this.aGraphicsBuffer_1123 = Client.constructGraphicsBuffer(496, 50, this.getGameComponent());
        this.aGraphicsBuffer_1124 = Client.constructGraphicsBuffer(269, 37, this.getGameComponent());
        this.aGraphicsBuffer_1125 = Client.constructGraphicsBuffer(249, 45, this.getGameComponent());
        this.welcomeScreenRaised = true;
    }

    public void resetInputField() {
        if (this.currentInputField == null) {
            return;
        }
        this.updateInputField(this.currentInputField);
        this.currentInputField.setInFocus(false);
        this.currentInputField = null;
    }

    public void resetLogout() {
        loginScreenGraphicsBuffer = null;
        updateScreenGraphicsBuffer = null;
        try {
            if (this.socketStream != null) {
                this.socketStream.close();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.socketStream = null;
        this.loggedIn = false;
        this.alertHandler.alert = null;
        if (Configuration.REMEMBER_ME) {
            AccountManager.add(this.myUsername, this.myPassword, this.myPrivilege[0], Client.myPlayer.gender == 1);
        }
        AccountManager.saveAccount();
        this.myUsername = "";
        this.myPassword = "";
        this.unlinkMRUNodes();
        this.worldController.initToNull();
        int i = 0;
        do {
            if (i >= 4) {
                System.runFinalization();
                System.gc();
                this.stopMidi();
                this.currentSong = -1;
                this.nextSong = -1;
                this.prevSong = 0;
                this.autocastId = 0;
                this.followPlayer = 0;
                this.followNPC = 0;
                this.followDistance = 1;
                this.autoCast = false;
                this.turnOffPrayers();
                this.resetImageProducers();
                this.clanChat.clear();
                this.orbToggle[1] = false;
                this.updateGraphics(true);
                this.resetInputField();
                Settings.save();
                super.setCursor(0);
                this.buffTimerHandler.reset();
                DrawingArea.setAllPixelsToZero();
                loginScreenGraphicsBuffer.initDrawingArea();
                this.loginRenderer.setScreen(new MainScreen());
                loginScreenGraphicsBuffer.drawGraphics(0, this.graphics, 0);
                return;
            }
            this.collisionMaps[i].build();
            ++i;
        } while (true);
    }

    public void rightClickMapArea(int paddingX, int paddingY) {
        if (this.inCircle(Client.isFixed() ? 511 : clientWidth - 82, Client.isFixed() ? 84 : 172, 18)) {
            this.menuActionName[4] = this.coinToggle ? "Toggle money pouch" : "Toggle money pouch";
            this.menuActionID[4] = 712;
            this.menuActionName[3] = "Withdraw money pouch";
            this.menuActionID[3] = 713;
            this.menuActionName[2] = "Withdraw as 1b tickets";
            this.menuActionID[2] = 715;
            this.menuActionName[1] = "Examine money pouch";
            this.menuActionID[1] = 714;
            this.menuActionRow = 5;
        }
        if (this.menuOpen) return;
        this.processXPCounterClick(this.getMapIncreaseX(), this.getMapIncreaseY());
        if (this.isInArea(this.xPaddingmapBackImage + (!Client.isFixed() ? 155 : 207) + paddingX, -4 + paddingY, 21, 21)) {
            this.menuActionName[this.menuActionRow] = "Advisor";
            this.menuActionID[this.menuActionRow] = 1051;
            ++this.menuActionRow;
            this.advisorHover = this.clickMode2 == 1 ? 2 : 1;
        } else {
            this.advisorHover = 0;
        }
        if (this.isInArea(this.xPaddingmapBackImage + (!Client.isFixed() ? 176 : 228) + paddingX, -4 + paddingY, 21, 21) && tabInterfaceIDs[10] != -1 && this.invOverlayInterfaceID == -1) {
            this.menuActionName[this.menuActionRow] = "Exit";
            this.menuActionID[this.menuActionRow] = 1021;
            ++this.menuActionRow;
            this.exitHover = this.clickMode2 == 1 ? 1 : 1;
        } else {
            this.exitHover = 0;
        }
        if (this.isInArea(this.xPaddingmapBackImage + (!Client.isFixed() ? -44 : 145) + this.mapMovedX + paddingX, this.yPaddingmapBackImage + (!Client.isFixed() ? 38 : 10) + this.mapMovedY + paddingY, 57, 34) && this.orbToggle[0]) {
            this.menuActionName[this.menuActionRow] = "Use cure (p)";
            this.menuActionID[this.menuActionRow] = 1052;
            ++this.menuActionRow;
            this.orbHover = 0;
        } else if (this.isInArea(this.xPaddingmapBackImage + (!Client.isFixed() ? -47 : 161) + this.mapMovedX + paddingX, this.yPaddingmapBackImage + (!Client.isFixed() ? 72 : 49) + this.mapMovedY + paddingY, 57, 34)) {
            String prayerType = this.prayerInterfaceType == 5608 ? "prayers" : "curses";
            boolean inProcess = tabInterfaceIDs[5] == 17200 || tabInterfaceIDs[5] == 17234;
            this.menuActionName[this.menuActionRow] = (inProcess ? "Finish" : "Select") + " quick " + prayerType + (inProcess ? " selection" : "");
            this.menuActionID[this.menuActionRow] = 1046;
            ++this.menuActionRow;
            this.menuActionName[this.menuActionRow] = "Turn quick " + prayerType + " " + (this.orbToggle[1] ? "off" : "on");
            this.menuActionID[this.menuActionRow] = 1045;
            ++this.menuActionRow;
            this.orbHover = 1;
        } else if (this.isInArea(this.xPaddingmapBackImage + (!Client.isFixed() ? -35 : 161) + this.mapMovedX + paddingX, this.yPaddingmapBackImage + (!Client.isFixed() ? 106 : 88) + this.mapMovedY + paddingY, 57, 34)) {
            this.menuActionName[this.menuActionRow] = "Rest";
            this.menuActionID[this.menuActionRow] = 1048;
            ++this.menuActionRow;
            this.menuActionName[this.menuActionRow] = "Turn run mode " + (this.orbToggle[2] ? "off" : "on");
            this.menuActionID[this.menuActionRow] = 1047;
            ++this.menuActionRow;
            this.orbHover = 2;
        } else if (this.isInArea(this.xPaddingmapBackImage + (!Client.isFixed() ? -12 : 145) + this.mapMovedX + paddingX, this.yPaddingmapBackImage + (!Client.isFixed() ? 135 : 127) + this.mapMovedY + paddingY, 57, 34)) {
            this.menuActionName[this.menuActionRow] = "Select left-click option";
            this.menuActionID[this.menuActionRow] = 1053;
            ++this.menuActionRow;
            this.menuActionName[this.menuActionRow] = "Call Follower";
            this.menuActionID[this.menuActionRow] = 1054;
            ++this.menuActionRow;
            this.menuActionName[this.menuActionRow] = "Dismiss";
            this.menuActionID[this.menuActionRow] = 1055;
            ++this.menuActionRow;
            this.menuActionName[this.menuActionRow] = "Take BoB";
            this.menuActionID[this.menuActionRow] = 1056;
            ++this.menuActionRow;
            this.menuActionName[this.menuActionRow] = "Renew Familiar";
            this.menuActionID[this.menuActionRow] = 1057;
            ++this.menuActionRow;
            this.menuActionName[this.menuActionRow] = "Attack";
            this.menuActionID[this.menuActionRow] = 1058;
            ++this.menuActionRow;
            this.menuActionName[this.menuActionRow] = "Follower Details";
            this.menuActionID[this.menuActionRow] = 1059;
            ++this.menuActionRow;
            this.orbHover = 3;
        } else if (this.orbHover != -1) {
            this.orbHover = -1;
        }
        if (this.inCircle(this.xPaddingmapBackImage + (!Client.isFixed() ? 30 : 11) + paddingX, this.yPaddingmapBackImage + (!Client.isFixed() ? 9 : 8) + paddingY, 17)) {
            this.menuActionName[this.menuActionRow] = "Face north";
            this.menuActionID[this.menuActionRow] = 1049;
            ++this.menuActionRow;
        }
        if (this.inCircle((!Client.isFixed() ? 670 : 526) + paddingX, !Client.isFixed() ? 138 : 124, 17)) {
            this.menuActionName[this.menuActionRow] = "World map";
            this.menuActionID[this.menuActionRow] = 1050;
            ++this.menuActionRow;
            this.mapHover = 1;
            return;
        }
        this.mapHover = 0;
    }

    @Override
    public void run() {
        if (this.drawFlames) {
            this.drawFlames();
            return;
        }
        super.run();
    }

    public void saveMidi(boolean flag, byte[] abyte0) {
        Signlink.midifade = flag ? 1 : 0;
        Signlink.midisave(abyte0, abyte0.length);
    }

    public void saveQuickSelection() {
        this.setDetails();
        Client.tabInterfaceIDs[5] = this.prayerInterfaceType;
    }

    public boolean saveWave(byte[] abyte0, int i) {
        if (abyte0 == null) return true;
        if (Signlink.wavesave(abyte0, i)) return true;
        return false;
    }

    public void sendData(String inputString) {
        this.stream.createFrame(103);
        this.stream.writeWordBigEndian(inputString.length() - 1);
        this.stream.writeString(inputString.substring(2));
    }

    public void sendFrame219() {
        if (this.invOverlayInterfaceID != -1) {
            this.invOverlayInterfaceID = -1;
            needDrawTabArea = true;
            tabAreaAltered = true;
        }
        if (this.backDialogID != -1) {
            this.backDialogID = -1;
            inputTaken = true;
        }
        if (this.inputDialogState != 0) {
            this.inputDialogState = 0;
            inputTaken = true;
        }
        openInterfaceID = -1;
        this.aBoolean1149 = false;
    }

    public void sendFrame248(int interfaceID, int sideInterfaceID) {
        if (this.backDialogID != -1) {
            this.backDialogID = -1;
            inputTaken = true;
        }
        if (this.inputDialogState != 0) {
            this.inputDialogState = 0;
            inputTaken = true;
        }
        openInterfaceID = interfaceID;
        this.invOverlayInterfaceID = sideInterfaceID;
        needDrawTabArea = true;
        tabAreaAltered = true;
        this.aBoolean1149 = false;
    }

    public void sendFrame36(int id, int state) {
        this.anIntArray1045[id] = state;
        if (this.variousSettings[id] == state) return;
        this.variousSettings[id] = state;
        this.method33(id);
        needDrawTabArea = true;
        if (this.dialogID == -1) return;
        inputTaken = true;
    }

    void sendPacket(int paramInt) {
        if (paramInt != 103) return;
        this.stream.createFrame(103);
        this.stream.writeWordBigEndian(this.inputString.length() - 1);
        this.stream.writeString(this.inputString.substring(2));
        this.inputString = "";
        this.promptInput = "";
        this.interfaceButtonAction = 0;
    }

    public void sendPacket185(int button, int toggle, int type) {
        if (button >= 33008 && button <= 33107) {
            RSInterface rsInterface = RSInterface.interfaceCache[button];
            this.stream.createFrame(232);
            this.stream.method432(rsInterface.npcId);
            return;
        }
        block0 : switch (type) {
            case 135: {
                RSInterface class9 = RSInterface.interfaceCache[button];
                boolean flag8 = true;
                if (class9.contentType <= 0 || (flag8 = this.promptUserForInput(class9))) {
                    if (button >= 17202 && button <= 17227) {
                        this.togglePrayerState(button);
                    }
                    switch (button) {
                        case 17231: {
                            this.saveQuickSelection();
                            break block0;
                        }
                        case 19144: {
                            this.sendFrame248(15106, 3213);
                            this.method60(15106);
                            inputTaken = true;
                            break block0;
                        }
                        case 22762: {
                            openInterfaceID = 23471;
                            break block0;
                        }
                        case 23475: {
                            openInterfaceID = 22760;
                            break block0;
                        }
                        case 60002: {
                            openInterfaceID = -1;
                            break block0;
                        }
                        case 60005: {
                            this.switchToFullScreen(ScreenMode.FIXED);
                            firstPersonMode = false;
                            enterToChat = false;
                            break block0;
                        }
                        case 60008: {
                            this.switchToFullScreen(ScreenMode.RESIZABLE);
                            firstPersonMode = false;
                            enterToChat = false;
                            break block0;
                        }
                        case 60011: {
                            this.switchToFullScreen(ScreenMode.FULLSCREEN);
                            firstPersonMode = false;
                            enterToChat = false;
                            break block0;
                        }
                        case 28295: {
                            Client client = instance;
                            client.sendData("::referredby " + RSInterface.interfaceCache[28299].inputText);
                            break block0;
                        }
                    }
                    this.stream.createFrame(185);
                    this.stream.writeWord(button);
                    break;
                }
                switch (button) {
                    case 60002: {
                        openInterfaceID = -1;
                        break block0;
                    }
                    case 60005: {
                        this.switchToFullScreen(ScreenMode.FIXED);
                        firstPersonMode = false;
                        enterToChat = false;
                        break block0;
                    }
                    case 60008: {
                        this.switchToFullScreen(ScreenMode.RESIZABLE);
                        firstPersonMode = false;
                        enterToChat = false;
                        break block0;
                    }
                    case 60011: {
                        this.switchToFullScreen(ScreenMode.FULLSCREEN);
                        firstPersonMode = false;
                        enterToChat = false;
                    }
                }
                break;
            }
            case 646: {
                this.stream.createFrame(185);
                this.stream.writeWord(button);
                RSInterface class9_2 = RSInterface.interfaceCache[button];
                if (class9_2.valueIndexArray == null || class9_2.valueIndexArray[0][0] != 5 || this.variousSettings[toggle = class9_2.valueIndexArray[0][1]] == class9_2.requiredValues[0]) break;
                this.variousSettings[toggle] = class9_2.requiredValues[0];
                this.method33(toggle);
                needDrawTabArea = true;
                switch (button) {
                    case 25823: {
                        renderDistance = 5;
                        break block0;
                    }
                    case 25824: {
                        renderDistance = 10;
                        break block0;
                    }
                    case 25825: {
                        renderDistance = 20;
                        break block0;
                    }
                    case 25826: {
                        renderDistance = 30;
                        break block0;
                    }
                    case 25827: {
                        renderDistance = 40;
                    }
                }
                break;
            }
            case 169: {
                this.stream.createFrame(185);
                this.stream.writeWord(button);
                RSInterface class9_3 = RSInterface.interfaceCache[button];
                if (class9_3.valueIndexArray == null || class9_3.valueIndexArray[0][0] != 5) break;
                toggle = class9_3.valueIndexArray[0][1];
                this.variousSettings[toggle] = 1 - this.variousSettings[toggle];
                this.method33(toggle);
                needDrawTabArea = true;
                if (button >= 25000 && button <= 25050) {
                    this.handePrayerCorrection(button);
                }
                switch (button) {
                    case 26019: {
                        announcement = !announcement;
                        this.setDetails();
                        break block0;
                    }
                    case 152: {
                        if (this.variousSettings[toggle] == 1) {
                            this.orbToggle[2] = true;
                            break block0;
                        }
                        this.orbToggle[2] = false;
                        break block0;
                    }
                    case 19136: {
                        if (toggle == 0) {
                            this.sendFrame36(173, toggle);
                        }
                        if (toggle != 1) break block0;
                        this.sendPacket185(153, 173, 646);
                        break block0;
                    }
                    case 25842: {
                        toggle = openInterfaceID == 60000 ? 0 : 1;
                        this.sendFrame36(175, toggle);
                        if (toggle == 1) {
                            openInterfaceID = 60000;
                            break block0;
                        }
                        openInterfaceID = -1;
                        break block0;
                    }
                    case 60002: {
                        openInterfaceID = -1;
                        break block0;
                    }
                    case 60005: {
                        this.switchToFullScreen(ScreenMode.FIXED);
                        firstPersonMode = false;
                        enterToChat = false;
                        break block0;
                    }
                    case 25837: 
                    case 26012: {
                        ScreenMode mode = screenMode == ScreenMode.FIXED ? ScreenMode.RESIZABLE : (screenMode == ScreenMode.RESIZABLE ? ScreenMode.FULLSCREEN : ScreenMode.FIXED);
                        this.switchToFullScreen(mode);
                        firstPersonMode = false;
                        enterToChat = false;
                    }
                }
            }
        }
        if (connectionStatus != ConnectionStatus.LOCAL) return;
        System.out.println("button: " + button + ", toggle: " + toggle + ", type: " + type);
    }

    boolean sequenceCheck(String s, int n) {
        s = s.toLowerCase();
        String sequence = n == 0 ? "abcdefghijklmnopqrstuvwxyz" : "0123456789";
        int b = 0;
        int e = 3;
        do {
            if (s.substring(b, e).equals((Object)"")) return false;
            Pattern pattern = Pattern.compile((String)s.substring(b, e));
            Matcher matcher = pattern.matcher((CharSequence)sequence);
            if (matcher.find()) {
                return true;
            }
            ++b;
        } while (++e <= s.length());
        return false;
    }

    public void setAutoCastOff() {
        this.autoCast = false;
        this.autocastId = 0;
        this.sendPacket185(6666, -1, 135);
        this.pushMessage("Autocast spell cleared.", ChatMessage.ChatType.ZERO);
    }

    public void setCameraPos(double j, int k, int l, int i1, int j1, int k1) {
        int l1 = 2048 - k & 2047;
        int i2 = 2048 - j1 & 2047;
        int j2 = 0;
        int k2 = 0;
        double l2 = j;
        if (l1 != 0) {
            int i3 = Model.modelIntArray1[l1];
            int k3 = Model.modelIntArray2[l1];
            int i4 = k2 * k3 - (int)(l2 * (double)i3) >> 16;
            l2 = k2 * i3 + (int)(l2 * (double)k3) >> 16;
            k2 = i4;
        }
        if (i2 != 0) {
            int j3 = Model.modelIntArray1[i2];
            int l3 = Model.modelIntArray2[i2];
            int j4 = (int)(l2 * (double)j3) + j2 * l3 >> 16;
            l2 = (int)(l2 * (double)l3) - j2 * j3 >> 16;
            j2 = j4;
        }
        this.xCameraPos = l - j2;
        this.zCameraPos = i1 - k2;
        this.yCameraPos = (int)((double)k1 - l2);
        this.yCameraCurve = k;
        this.xCameraCurve = j1;
        if (myPlayer == null) return;
        if (!firstPersonMode) return;
        this.xCameraPos = Client.myPlayer.x;
        this.yCameraPos = Client.myPlayer.y;
        this.zCameraPos = Client.myPlayer.anInt1709 - 220;
    }

    public void setDetails() {
        BufferedWriter details = null;
        try {
            int i;
            details = new BufferedWriter((Writer)new FileWriter(Signlink.getDirectory() + "/saveuser.ini"));
            Client.saveValue(details, "[ACCOUNT]", "nothing", false);
            Client.saveValue(details, "username", this.myUsername, false);
            Client.saveValue(details, "announcement", announcement ? "1" : "0", true);
            Client.saveValue(details, "[PRAYERS]", "nothing", false);
            String stringSave = "";
            for (i = 0; i < this.quickPrayers.length; ++i) {
                stringSave = stringSave + this.quickPrayers[i] + "\t";
            }
            Client.saveValue(details, "prayer", stringSave, true);
            Client.saveValue(details, "[CURSES]", "nothing", false);
            stringSave = "";
            i = 0;
            do {
                if (i >= this.quickCurses.length) {
                    Client.saveValue(details, "curse", stringSave, true);
                    details.newLine();
                    details.write("[EOF]", 0, 5);
                    details.newLine();
                    details.newLine();
                    details.close();
                    return;
                }
                stringSave = stringSave + this.quickCurses[i] + "\t";
                ++i;
            } while (true);
        }
        catch (IOException io) {
            new File(Signlink.getDirectory() + "/saveuser.ini").delete();
            System.out.println("Error while writing saveuser.ini");
        }
    }

    public void setLoadingText(String loadingText, double percent) {
        this.loadingText = loadingText;
        this.loadingPercent = percent;
    }

    public void setLoginMessage(String message) {
        this.loginMessage = message;
    }

    public void setNewInputField(InputFieldWidget inputField) {
        this.resetInputField();
        this.currentInputField = inputField;
        this.currentInputField.setInFocus(true);
    }

    public void setResizing(boolean resizing) {
        if (resizing) {
            this.resizing = true;
            if (this.loggedIn) {
                if (this.main3DArea == null) return;
                this.main3DArea.initDrawingArea();
                return;
            }
            if (loginScreenGraphicsBuffer == null) return;
            loginScreenGraphicsBuffer.initDrawingArea();
            return;
        }
        this.resizing = false;
        if (this.loggedIn) {
            if (this.main3DArea == null) return;
            this.main3DArea.drawGraphics(this.gameScreenDrawY, this.graphics, Client.isFixed() ? 4 : this.gameScreenDrawX);
            return;
        }
        if (loginScreenGraphicsBuffer == null) return;
        loginScreenGraphicsBuffer.drawGraphics(this.gameScreenDrawY, this.graphics, Client.isFixed() ? 4 : this.gameScreenDrawX);
    }

    public void setWaveVolume(int i) {
        Signlink.wavevol = i;
    }

    public Dialog showCaptcha(final BufferedImage image) {
        this.captchaAnswer = null;
        final Dialog d1 = new Dialog((Frame)this.gameFrame);
        d1.setUndecorated(true);
        d1.setOpacity(0.95f);
        d1.setLocationRelativeTo(null);
        d1.setSize(150, 120);
        Panel panel = new Panel();
        GridLayout layout = new GridLayout(3, 0);
        layout.setHgap(0);
        layout.setVgap(0);
        panel.setLayout((LayoutManager)layout);
        panel.add((Component)new Panel(){

            public void paint(Graphics g) {
                super.paint(g);
                g.drawImage((Image)image, 0, 0, (ImageObserver)this);
            }
        });
        final TextField t = new TextField();
        panel.add((Component)t);
        Button b = new Button("Answer");
        b.addActionListener(new ActionListener(){

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            public void actionPerformed(ActionEvent e) {
                try {
                    Client.this.captchaAnswer = t.getText();
                    Object object = Client.this.captchaLock;
                    synchronized (object) {
                        Client.this.captchaLock.notifyAll();
                    }
                }
                catch (Exception e32) {
                    return;
                }
                d1.dispose();
            }
        });
        t.addKeyListener(new KeyListener(){

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() != 10) return;
                try {
                    Client.this.captchaAnswer = t.getText();
                    Object object = Client.this.captchaLock;
                    synchronized (object) {
                        Client.this.captchaLock.notifyAll();
                    }
                }
                catch (Exception e32) {
                    return;
                }
                d1.dispose();
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyTyped(KeyEvent e) {
            }
        });
        panel.add((Component)b);
        d1.add((Component)panel);
        d1.setVisible(true);
        return d1;
    }

    public static void removeRecursive(Path path) throws IOException {
        Files.walkFileTree((Path)path, (FileVisitor)new SimpleFileVisitor<Path>(){

            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.delete((Path)file);
                return FileVisitResult.CONTINUE;
            }

            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                Files.delete((Path)file);
                return FileVisitResult.CONTINUE;
            }

            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                if (exc != null) throw exc;
                Files.delete((Path)dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    public void showErrorScreen() {
        Graphics g = this.getGameComponent().getGraphics();
        g.setColor(new Color(19, 44, 50));
        g.fillRect(0, 0, 765, 503);
        this.method4(1);
        if (this.loadingError && this.errorTime-- > 0) {
            this.aBoolean831 = false;
            g.setFont(new Font("Helvetica", 1, 16));
            g.setColor(Color.yellow);
            int k = 35;
            g.drawString("An error has occured while loading Imagine.", 30, k);
            g.setColor(Color.white);
            g.drawString("The client is performing an automated task to resolve the issue.", 30, k += 50);
            g.setColor(Color.white);
            g.setFont(new Font("Helvetica", 1, 12));
            g.drawString("The client will close in approximately " + this.errorTime + " seconds.", 30, k += 50);
            g.drawString("Once the client closes, load your launcher again.", 30, k += 30);
            g.drawString("If this issue persists contact us on the forums or via Discord in our #support channel.", 30, k += 30);
        }
        if (!this.loadingError) return;
        if (this.errorTime > 0) return;
        Runtime.getRuntime().addShutdownHook(new Thread(this.cleanup));
        System.exit((int)1);
    }

    public Dialog showSimpleCaptcha() {
        this.captchaAnswer = null;
        final Dialog d1 = new Dialog((Frame)this.gameFrame);
        d1.setTitle("Captcha Required");
        d1.setSize(120, 120);
        d1.setUndecorated(true);
        d1.setOpacity(0.95f);
        d1.setLocationRelativeTo(null);
        Panel panel = new Panel();
        GridLayout layout = new GridLayout(3, 0);
        layout.setHgap(10);
        layout.setVgap(10);
        panel.setLayout((LayoutManager)layout);
        panel.add((Component)new Label("What is " + this.num1 + " " + this.captchaId[this.cType] + " " + this.num2 + ":"));
        final TextField t = new TextField();
        panel.add((Component)t);
        Button b = new Button("Answer");
        b.addActionListener(new ActionListener(){

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            public void actionPerformed(ActionEvent e) {
                try {
                    Client.this.captchaAnswer = Integer.parseInt((String)t.getText());
                    Object object = Client.this.captchaLock;
                    synchronized (object) {
                        Client.this.captchaLock.notifyAll();
                    }
                }
                catch (Exception e32) {
                    return;
                }
                d1.dispose();
            }
        });
        t.addKeyListener(new KeyListener(){

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() != 10) return;
                try {
                    Client.this.captchaAnswer = Integer.parseInt((String)t.getText());
                    Object object = Client.this.captchaLock;
                    synchronized (object) {
                        Client.this.captchaLock.notifyAll();
                    }
                }
                catch (Exception e32) {
                    return;
                }
                d1.dispose();
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyTyped(KeyEvent e) {
            }
        });
        panel.add((Component)b);
        d1.add((Component)panel);
        d1.setVisible(true);
        return d1;
    }

    public void spawnGroundItem(int i, int j) {
        NodeList class19 = this.groundArray[this.plane][i][j];
        if (class19 == null) {
            this.worldController.method295(this.plane, i, j);
            return;
        }
        int k = -99999999;
        Item obj = null;
        Item item = (Item)class19.reverseGetFirst();
        while (item != null) {
            ItemDefinition itemDef = ItemDefinition.forID(item.ID);
            int l = itemDef.value;
            if (itemDef.stackable) {
                l *= item.amount + 1;
            }
            if (l > k) {
                k = l;
                obj = item;
            }
            item = (Item)class19.reverseGetNext();
        }
        class19.insertTail(obj);
        Item obj1 = null;
        Item obj2 = null;
        Item class30_sub2_sub4_sub2_1 = (Item)class19.reverseGetFirst();
        do {
            if (class30_sub2_sub4_sub2_1 == null) {
                int i1 = i + (j << 7) + 1610612736;
                this.worldController.addGroundTileItem(i, i1, obj1, this.method42(this.plane, j * 128 + 64, i * 128 + 64), obj2, obj, this.plane, j);
                return;
            }
            if (class30_sub2_sub4_sub2_1.ID != obj.ID && obj1 == null) {
                obj1 = class30_sub2_sub4_sub2_1;
            }
            if (class30_sub2_sub4_sub2_1.ID != obj.ID && class30_sub2_sub4_sub2_1.ID != obj1.ID && obj2 == null) {
                obj2 = class30_sub2_sub4_sub2_1;
            }
            class30_sub2_sub4_sub2_1 = (Item)class19.reverseGetNext();
        } while (true);
    }

    @Override
    public void startRunnable(Runnable runnable, int i) {
        if (i > 10) {
            i = 10;
        }
        if (Signlink.mainapp != null) {
            Signlink.startthread(runnable, i);
            return;
        }
        super.startRunnable(runnable, i);
    }

    @Override
    public void startUp() {
        try {
            int index;
            LoginScreen.loadImages();
            SpriteLoader.loadSprites();
            cacheSprite = SpriteLoader.sprites;
            AccountManager.loadAccount();
            this.initializeLoginScreen();
            this.drawSmoothLoading(0, "Initializing client resources");
            if (Signlink.cache_dat != null) {
                for (index = 0; index < this.decompressors.length; ++index) {
                    this.decompressors[index] = new Decompressor(index + 1, Signlink.cache_dat, Signlink.cache_idx[index], Integer.MAX_VALUE);
                }
            }
            for (index = 0; index < 25; ++index) {
                bubbles.add((Object)new Bubble());
            }
            this.titleStreamLoader = this.streamLoaderForName(1, "title screen", "title", this.expectedCRCs[1], 25);
            this.smallFont = new TextDrawingArea(false, "p11_full", this.titleStreamLoader);
            this.normalFont = new TextDrawingArea(false, "p12_full", this.titleStreamLoader);
            this.boldFont = new TextDrawingArea(false, "b12_full", this.titleStreamLoader);
            this.fancyFont = new TextDrawingArea(true, "q8_full", this.titleStreamLoader);
            this.bigHit = new TextDrawingArea(true, "critical_full", this.titleStreamLoader);
            newSmallFont = new RSFont(false, "p11_full", this.titleStreamLoader);
            newRegularFont = new RSFont(false, "p12_full", this.titleStreamLoader);
            this.newBoldFont = new RSFont(false, "b12_full", this.titleStreamLoader);
            this.newFancyFont = new RSFont(true, "q8_full", this.titleStreamLoader);
            newSmallFont.unpackChatImages(this.modIcons);
            newRegularFont.unpackChatImages(this.modIcons);
            this.newBoldFont.unpackChatImages(this.modIcons);
            this.newFancyFont.unpackChatImages(this.modIcons);
            StreamLoader streamLoader_6 = this.streamLoaderForName(5, "update list", "versionlist", this.expectedCRCs[5], 60);
            this.byteGroundArray = new byte[4][104][104];
            this.intGroundArray = new int[4][105][105];
            this.worldController = new WorldController(this.intGroundArray);
            int i = 0;
            do {
                if (i >= this.collisionMaps.length) {
                    this.miniMapImage = new Sprite(512, 512);
                    this.drawSmoothLoading(30, "Loading resources");
                    onDemandFetcher = new OnDemandFetcher();
                    onDemandFetcher.start(streamLoader_6, this);
                    Model.initialize(onDemandFetcher.getModelCount(), onDemandFetcher);
                    this.preloadModels();
                    Settings.load();
                    this.drawSmoothLoading(40, "Loading resources");
                    this.loadMediaIntoMemory();
                    this.drawSmoothLoading(60, "Loading resources");
                    this.loadTextures();
                    this.drawSmoothLoading(70, "Loading resources");
                    this.loadConfig();
                    ItemDefinition.isMembers = isMembers;
                    this.loadCensor();
                    this.drawSmoothLoading(80, "Loading resources");
                    this.loadInterfaces();
                    this.updateGameArea();
                    this.drawSmoothLoading(100, "Cleaning resources");
                    this.mouseDetection = new MouseDetection(this);
                    this.loginRenderer = new LoginRenderer(this);
                    this.startRunnable(this.mouseDetection, 10);
                    Animable_Sub5.clientInstance = this;
                    ObjectDefinition.clientInstance = this;
                    NPCDefinition.clientInstance = this;
                    CustomObjects.init();
                    this.clientLoaded = true;
                    System.gc();
                    return;
                }
                this.collisionMaps[i] = new CollisionMap();
                ++i;
            } while (true);
        }
        catch (Exception exception) {
            Signlink.reporterror("loaderror " + this.aString1049 + " " + this.anInt1079);
            exception.printStackTrace();
            this.loadingError = true;
            return;
        }
    }

    public void initializeLoginScreen() {
        if (gameScreenIP != null) {
            return;
        }
        this.fullGameScreen = null;
        gameScreenIP = null;
        loginScreenGraphicsBuffer = Client.constructGraphicsBuffer(765, 503, this.getGameComponent());
        updateScreenGraphicsBuffer = Client.constructGraphicsBuffer(765, 503, this.getGameComponent());
        Sprite background = LoginScreen.getImage("loading_screen");
        if (background != null) {
            background.drawTransparentSprite(this.getWidth() / 2 - background.myWidth / 2, this.getHeight() / 2 - background.myHeight / 2, 200);
        }
        DrawingArea.setAllPixelsToZero();
    }

    public void drawSmoothLoading(int value, String message) {
        float percent = this.LP;
        do {
            if (percent >= (float)value) {
                this.LP = value;
                return;
            }
            this.drawLoadingText((int)percent, message);
            percent = (float)((double)percent + 0.3);
        } while (true);
    }

    @Override
    void drawLoadingText(int i, String s) {
        if (this.titleStreamLoader == null) {
            super.drawLoadingText(i, s);
            return;
        }
        DrawingArea.setAllPixelsToZero();
        loginScreenGraphicsBuffer.initDrawingArea();
        Sprite background = LoginScreen.getImage("loading_screen");
        if (background != null) {
            background.drawTransparentSprite(this.getWidth() / 2 - background.myWidth / 2, this.getHeight() / 2 - background.myHeight / 2, 200);
        }
        this.newBoldFont.drawBasicString(s, 280, 250, 4679270, 0);
        this.newBoldFont.drawBasicString("" + i + "%", 424, 240, 9944261, 0);
        loginScreenGraphicsBuffer.drawGraphics(0, this.graphics, 0);
    }

    public void stopMidi() {
        if (SoundProvider.getSingleton().midiSequencer.isRunning()) {
            SoundProvider.getSingleton().midiSequencer.stop();
        }
        Signlink.midifade = 0;
        Signlink.midi = "stop";
    }

    public StreamLoader streamLoaderForName(int i, String s, String s1, int j, int k) {
        byte[] abyte0 = null;
        int l = 5;
        try {
            if (this.decompressors[0] != null) {
                abyte0 = this.decompressors[0].getBytes(i);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (abyte0 != null) {
            // empty if block
        }
        if (abyte0 != null) {
            return new StreamLoader(abyte0);
        }
        int j1 = 0;
        do {
            String s2;
            block30 : {
                if (abyte0 != null) {
                    return new StreamLoader(abyte0);
                }
                s2 = "Unknown error";
                this.drawLoadingText(k, "Requesting " + s);
                try {
                    int k1 = 0;
                    DataInputStream datainputstream = this.openJagGrabInputStream(s1 + j);
                    byte[] abyte1 = new byte[6];
                    datainputstream.readFully(abyte1, 0, 6);
                    Stream stream = new Stream(abyte1);
                    stream.currentOffset = 3;
                    int i2 = stream.read3Bytes() + 6;
                    int j2 = 6;
                    abyte0 = new byte[i2];
                    System.arraycopy((Object)abyte1, (int)0, (Object)abyte0, (int)0, (int)6);
                    while (j2 < i2) {
                        int j3;
                        int l2 = i2 - j2;
                        if (l2 > 1000) {
                            l2 = 1000;
                        }
                        if ((j3 = datainputstream.read(abyte0, j2, l2)) < 0) {
                            s2 = "Length error: " + j2 + "/" + i2;
                            throw new IOException("EOF");
                        }
                        int k3 = (j2 += j3) * 100 / i2;
                        if (k3 != k1) {
                            this.drawLoadingText(k, "Loading " + s + " - " + k3 + "%");
                        }
                        k1 = k3;
                    }
                    datainputstream.close();
                    try {
                        if (this.decompressors[0] != null) {
                            this.decompressors[0].put(i, abyte0);
                        }
                    }
                    catch (Exception _ex) {
                        this.decompressors[0] = null;
                    }
                }
                catch (IOException ioexception) {
                    if (s2.equals((Object)"Unknown error")) {
                        s2 = "Connection error";
                    }
                    abyte0 = null;
                }
                catch (NullPointerException _ex) {
                    s2 = "Null error";
                    abyte0 = null;
                    if (!Signlink.reporterror) {
                        return null;
                    }
                    break block30;
                }
                catch (ArrayIndexOutOfBoundsException _ex) {
                    s2 = "Bounds error";
                    abyte0 = null;
                    if (!Signlink.reporterror) {
                        return null;
                    }
                    break block30;
                }
                catch (Exception _ex) {
                    s2 = "Unexpected error";
                    abyte0 = null;
                    if (!Signlink.reporterror) {
                        return null;
                    }
                    break block30;
                }
                if (abyte0 != null) continue;
            }
            for (int l1 = l; l1 > 0; --l1) {
                if (j1 >= 3) {
                    this.drawLoadingText(k, "Game updated - please reload page");
                    l1 = 10;
                } else {
                    this.drawLoadingText(k, s2 + " - Retrying in " + l1);
                }
                try {
                    Thread.sleep((long)1000L);
                    continue;
                }
                catch (Exception datainputstream) {
                    // empty catch block
                }
            }
            if ((l *= 2) > 60) {
                l = 60;
            }
            this.aBoolean872 = !this.aBoolean872;
        } while (true);
    }

    public void switchToFullScreen(ScreenMode screenMode) {
        try {
            if (Client.screenMode == screenMode) {
                return;
            }
            this.sendFrame36(652, 0);
            Client.screenMode = screenMode;
            this.clickMode2 = 0;
            if (screenMode == ScreenMode.FIXED) {
                clientWidth = 765;
                this.forceWidth = 765;
                clientHeight = 503;
                this.forceHeight = 503;
                this.sendFrame36(652, 0);
                this.recreateClientFrame(false, 765, 503, false, 1, false);
                if (clientFrame != null) {
                    clientFrame.resize(screenMode);
                }
                this.welcomeScreenRaised = true;
            } else if (screenMode == ScreenMode.RESIZABLE) {
                this.forceHeight = -1;
                this.forceWidth = -1;
                this.sendFrame36(652, 2);
                this.recreateClientFrame(false, 790, 600, true, 0, true);
                if (clientFrame != null) {
                    clientFrame.resize(screenMode);
                }
            } else {
                this.sendFrame36(652, 1);
                Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
                clientWidth = size.width;
                clientHeight = size.height;
                this.recreateClientFrame(true, size.width, size.height, false, 0, true);
                this.forceHeight = -1;
                this.forceWidth = -1;
                this.myWidth = size.width;
                this.myHeight = size.height;
            }
            this.gameScreenDrawY = screenMode == ScreenMode.FIXED ? 4 : 0;
            this.gameScreenDrawX = this.gameScreenDrawY;
            if (!this.loggedIn) {
                this.resetImageProducers();
            } else {
                this.resetImageProducers2();
            }
            this.updateScreen();
            System.gc();
            System.runFinalization();
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tabToReplyPm() {
        String name = null;
        for (ChatMessage message : this.chatMessages) {
            int l;
            if (message == null || message.getName() == null || message.getName().isEmpty() || (l = message.getType().getType()) != 3 && l != 7) continue;
            name = message.getName();
            break;
        }
        if (name == null) {
            this.pushMessage("You haven't received any messages to which you can reply.", ChatMessage.ChatType.ZERO);
            return;
        }
        long nameAsLong = TextClass.longForName(name.trim());
        if (nameAsLong == -1L) return;
        inputTaken = true;
        this.inputDialogState = 0;
        this.messagePromptRaised = true;
        this.promptInput = "";
        this.friendsListAction = 3;
        this.aLong953 = nameAsLong;
        this.aString1121 = "Enter message to send to " + TextClass.fixName(TextClass.nameForLong(nameAsLong));
    }

    public void togglePrayerState(int button) {
        int[] types;
        int index = button - 17202;
        if (this.prayerInterfaceType == 5608) {
            if (this.getOrbValues(1, null)[1] < this.prayerLevelRequirements[index]) {
                this.pushMessage("You need a Prayer level of atleast " + this.prayerLevelRequirements[index] + " to use " + this.prayerName[index] + ".");
                return;
            }
            types = this.getPrayerTypeForIndex(index);
            if (types == null) {
                this.quickPrayers[index] = (this.quickPrayers[index] + 1) % 2;
                this.variousSettings[this.quickConfigIDs[index]] = this.quickPrayers[index];
                this.method33(this.quickConfigIDs[index]);
                needDrawTabArea = true;
                if (this.dialogID == -1) return;
                inputTaken = true;
                return;
            }
            for (int g = 0; g < this.rangeAndMagePray.length; ++g) {
                if (index != this.rangeAndMagePray[g]) continue;
                types = this.rangeAndMagePrayOff;
            }
        } else {
            if (this.prayerInterfaceType != 22500) return;
            if (this.getOrbValues(1, null)[1] < this.curseLevelRequirements[index]) {
                this.pushMessage("You need a Prayer level of atleast " + this.curseLevelRequirements[index] + " to use " + this.curseName[index] + ".");
                return;
            }
            int[] types2 = this.getCurseTypeForIndex(index);
            if (types2 != null) {
                for (int i = 0; i < types2.length; ++i) {
                    if (index == types2[i]) continue;
                    this.quickCurses[types2[i]] = 0;
                    this.variousSettings[this.quickConfigIDs[types2[i]]] = 0;
                    this.method33(this.quickConfigIDs[types2[i]]);
                    needDrawTabArea = true;
                    if (this.dialogID == -1) continue;
                    inputTaken = true;
                }
            }
            this.quickCurses[index] = (this.quickCurses[index] + 1) % 2;
            this.variousSettings[this.quickConfigIDs[index]] = this.quickCurses[index];
            this.method33(this.quickConfigIDs[index]);
            needDrawTabArea = true;
            if (this.dialogID == -1) return;
            inputTaken = true;
            return;
        }
        int i = 0;
        while (i < types.length) {
            if (index != types[i]) {
                if (index == 24 || index == 25) {
                    types = this.superiorPray;
                }
                this.quickPrayers[types[i]] = 0;
                this.variousSettings[this.quickConfigIDs[types[i]]] = 0;
                this.method33(this.quickConfigIDs[types[i]]);
                needDrawTabArea = true;
                if (this.dialogID != -1) {
                    inputTaken = true;
                }
            } else {
                this.quickPrayers[index] = (this.quickPrayers[index] + 1) % 2;
                this.variousSettings[this.quickConfigIDs[index]] = this.quickPrayers[index];
                this.method33(this.quickConfigIDs[index]);
                needDrawTabArea = true;
                if (this.dialogID != -1) {
                    inputTaken = true;
                }
            }
            ++i;
        }
    }

    public void toggleQuickAidsSelection() {
        boolean inProcess;
        boolean bl = inProcess = tabInterfaceIDs[5] == 17200 || tabInterfaceIDs[5] == 17234;
        if (inProcess) {
            this.saveQuickSelection();
            return;
        }
        if (this.prayerInterfaceType == 5608) {
            if (!inProcess) {
                Client.tabInterfaceIDs[5] = 17200;
                needDrawTabArea = true;
                tabAreaAltered = true;
            } else {
                Client.tabInterfaceIDs[5] = 5608;
                needDrawTabArea = true;
                tabAreaAltered = true;
            }
        } else if (this.prayerInterfaceType == 22500) {
            if (!inProcess) {
                Client.tabInterfaceIDs[5] = 17234;
                needDrawTabArea = true;
                tabAreaAltered = true;
            } else {
                Client.tabInterfaceIDs[5] = 22500;
                needDrawTabArea = true;
                tabAreaAltered = true;
            }
        }
        tabID = 5;
    }

    public void turnOffCurses() {
        int toggle = -1;
        int i = 0;
        while (i < this.quickCurses.length) {
            RSInterface rsInterface = RSInterface.interfaceCache[i * 2 + 22503];
            if (rsInterface.valueIndexArray != null && rsInterface.valueIndexArray[0][0] == 5 && this.variousSettings[toggle = rsInterface.valueIndexArray[0][1]] == 1) {
                this.sendPacket185(i * 2 + 22503, -1, 169);
            }
            ++i;
        }
    }

    public void turnOffPrayers() {
        int toggle = -1;
        int i = 0;
        while (i < this.quickPrayers.length) {
            RSInterface rsInterface = RSInterface.interfaceCache[i * 2 + 25000];
            if (rsInterface.valueIndexArray != null && rsInterface.valueIndexArray[0][0] == 5 && this.variousSettings[toggle = rsInterface.valueIndexArray[0][1]] == 1) {
                this.sendPacket185(i * 2 + 25000, -1, 169);
            }
            ++i;
        }
    }

    public void turnOffQuickTicks() {
        int toggle = -1;
        int i = 0;
        while (i < this.quickCurses.length) {
            RSInterface rsInterface = RSInterface.interfaceCache[17202 + i];
            if (rsInterface.valueIndexArray != null && rsInterface.valueIndexArray[0][0] == 5 && this.variousSettings[toggle = rsInterface.valueIndexArray[0][1]] == 1) {
                this.sendPacket185(17202 + i, -1, 169);
            }
            ++i;
        }
    }

    public void unlinkMRUNodes() {
        ObjectDefinition.mruNodes1.unlinkAll();
        ObjectDefinition.mruNodes2.unlinkAll();
        NPCDefinition.mruNodes.unlinkAll();
        ItemDefinition.mruNodes2.unlinkAll();
        ItemDefinition.mruNodes1.unlinkAll();
        Player.characterCache.unlinkAll();
        SpotAnim.aMRUNodes_415.unlinkAll();
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     */
    public void updateEntities() {
        block79 : {
            block80 : {
                try {
                    anInt974 = 0;
                    j = -1;
lbl4: // 2 sources:
                    if (j < this.playerCount + this.npcCount) {
                        if (j == -1) {
                            obj = Client.myPlayer;
                        } else if (j < this.playerCount) {
                            obj = this.playerArray[this.playerIndices[j]];
                        } else {
                            obj = this.npcArray[this.npcIndices[j - this.playerCount]];
                        }
                        if (obj == null || !((Mobile)obj).isVisible()) break block79;
                        if (obj instanceof NPC) {
                            entityDef = ((NPC)obj).npcDefinition;
                            if (entityDef.childrenIDs != null) {
                                entityDef = entityDef.method161();
                            }
                            if (entityDef == null) break block79;
                        }
                        if (j < this.playerCount) {
                            l = 30;
                            player = (Player)obj;
                            if (player.headIcon >= 0) {
                                this.npcScreenPos((Mobile)obj, ((Mobile)obj).height + 15);
                                if (this.spriteDrawX > -1) {
                                    if (player.skullIcon > 25 && player.skullIcon < 255) {
                                        crown = player.skullIcon - 26;
                                        this.modIcons[crown].drawSprite(this.spriteDrawX - 6, this.spriteDrawY - l);
                                    }
                                    if (player.skullIcon < 4) {
                                        this.skullIcons[player.skullIcon].drawSprite(this.spriteDrawX - 12, this.spriteDrawY - l);
                                        l += 25;
                                    }
                                    if (player.skullIcon > 3 && player.skullIcon < 19) {
                                        this.skullIcons[player.skullIcon].drawSprite(this.spriteDrawX - 6, this.spriteDrawY - l);
                                        l += 25;
                                    }
                                    if (player.headIcon < 18) {
                                        this.headIcons[player.headIcon].drawSprite(this.spriteDrawX - 12, this.spriteDrawY - l);
                                        l += 18;
                                    }
                                }
                            }
                            if (j >= 0 && this.hintType == 10 && this.hintArrowPlayerID == this.playerIndices[j]) {
                                this.npcScreenPos((Mobile)obj, ((Mobile)obj).height + 15);
                                if (this.spriteDrawX > -1) {
                                    this.headIconsHint[player.hintIcon].drawSprite(this.spriteDrawX - 12, this.spriteDrawY - l);
                                }
                            }
                        } else {
                            entityDef_1 = ((NPC)obj).npcDefinition;
                            if (entityDef_1.headIcon >= 0 && entityDef_1.headIcon < this.headIcons.length) {
                                this.npcScreenPos((Mobile)obj, ((Mobile)obj).height + 15);
                                if (this.spriteDrawX > -1) {
                                    this.headIcons[entityDef_1.headIcon].drawSprite(this.spriteDrawX - 12, this.spriteDrawY - 30);
                                }
                            }
                            if (this.hintType == 1 && this.hintArrowNPCID == this.npcIndices[j - this.playerCount] && Client.loopCycle % 20 < 10) {
                                this.npcScreenPos((Mobile)obj, ((Mobile)obj).height + 15);
                                if (this.spriteDrawX > -1) {
                                    this.headIconsHint[0].drawSprite(this.spriteDrawX - 12, this.spriteDrawY - 28);
                                }
                            }
                        }
                        if (((Mobile)obj).textSpoken != null && (j >= this.playerCount || this.publicChatMode == 0 || this.publicChatMode == 3 || this.publicChatMode == 1 && this.isFriendOrSelf(((Player)obj).name))) {
                            this.npcScreenPos((Mobile)obj, ((Mobile)obj).height);
                            if (this.spriteDrawX > -1 && anInt974 < this.anInt975) {
                                this.anIntArray979[anInt974] = this.boldFont.method384(((Mobile)obj).textSpoken) / 2;
                                this.anIntArray978[anInt974] = this.boldFont.anInt1497;
                                this.anIntArray976[anInt974] = this.spriteDrawX;
                                this.anIntArray977[anInt974] = this.spriteDrawY;
                                this.anIntArray980[anInt974] = ((Mobile)obj).anInt1513;
                                this.anIntArray981[anInt974] = ((Mobile)obj).anInt1531;
                                this.anIntArray982[anInt974] = ((Mobile)obj).textCycle;
                                this.aStringArray983[anInt974++] = ((Mobile)obj).textSpoken;
                                if (this.anInt1249 == 0 && ((Mobile)obj).anInt1531 >= 1 && ((Mobile)obj).anInt1531 <= 3) {
                                    v0 = this.anIntArray978;
                                    v1 = anInt974;
                                    v0[v1] = v0[v1] + 10;
                                    v2 = this.anIntArray977;
                                    v3 = anInt974;
                                    v2[v3] = v2[v3] + 5;
                                }
                                if (this.anInt1249 == 0 && ((Mobile)obj).anInt1531 == 4) {
                                    this.anIntArray979[anInt974] = 60;
                                }
                                if (this.anInt1249 == 0 && ((Mobile)obj).anInt1531 == 5) {
                                    v4 = this.anIntArray978;
                                    v5 = anInt974;
                                    v4[v5] = v4[v5] + 5;
                                }
                            }
                        }
                        if (((Mobile)obj).loopCycleStatus <= Client.loopCycle) break block80;
                        try {
                            this.npcScreenPos((Mobile)obj, ((Mobile)obj).height + 15);
                            if (this.spriteDrawX > -1) {
                                currentHealth = ((Mobile)obj).currentHealth;
                                maxHealth = ((Mobile)obj).maxHealth;
                                if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.NEW_HEALTH_BAR)) {
                                    amount = 56;
                                    j2 = currentHealth * amount / maxHealth;
                                    if (j2 > amount) {
                                        j2 = amount;
                                    }
                                    this.HPBarEmpty.drawSprite(this.spriteDrawX - 28, this.spriteDrawY - 3);
                                    this.HPBarFull = new Sprite("HITPOINTS_0", j2, 7);
                                    this.HPBarFull.drawSprite(this.spriteDrawX - 28, this.spriteDrawY - 3);
                                } else {
                                    i1 = currentHealth * 30 / maxHealth;
                                    if (i1 > 30) {
                                        i1 = 30;
                                    }
                                    DrawingArea.drawPixels(5, this.spriteDrawY - 3, this.spriteDrawX - 15, 65280, i1);
                                    DrawingArea.drawPixels(5, this.spriteDrawY - 3, this.spriteDrawX - 15 + i1, 16711680, 30 - i1);
                                }
                            }
                            break block80;
                        }
                        catch (Exception currentHealth) {
                            // empty catch block
                        }
                        break block80;
                    }
                    k = 0;
                    while (k < anInt974) {
                        k1 = this.anIntArray976[k];
                        l1 = this.anIntArray977[k];
                        j2 = this.anIntArray979[k];
                        k2 = this.anIntArray978[k];
                        flag = true;
                        if (flag) {
                            flag = false;
                            for (l2 = 0; l2 < k; ++l2) {
                                if (l1 + 2 <= this.anIntArray977[l2] - this.anIntArray978[l2] || l1 - k2 >= this.anIntArray977[l2] + 2 || k1 - j2 >= this.anIntArray976[l2] + this.anIntArray979[l2] || k1 + j2 <= this.anIntArray976[l2] - this.anIntArray979[l2] || this.anIntArray977[l2] - this.anIntArray978[l2] >= l1) continue;
                                l1 = this.anIntArray977[l2] - this.anIntArray978[l2];
                                flag = true;
                            }
                        }
                        this.spriteDrawX = this.anIntArray976[k];
                        this.spriteDrawY = this.anIntArray977[k] = l1;
                        s = this.aStringArray983[k];
                        if (this.anInt1249 == 0) {
                            i3 = 16776960;
                            if (this.anIntArray980[k] < 6) {
                                i3 = this.anIntArray965[this.anIntArray980[k]];
                            }
                            if (this.anIntArray980[k] == 6) {
                                v6 = i3 = this.anInt1265 % 20 >= 10 ? 16776960 : 16711680;
                            }
                            if (this.anIntArray980[k] == 7) {
                                v7 = i3 = this.anInt1265 % 20 >= 10 ? 65535 : 255;
                            }
                            if (this.anIntArray980[k] == 8) {
                                v8 = i3 = this.anInt1265 % 20 >= 10 ? 8454016 : 45056;
                            }
                            if (this.anIntArray980[k] == 9) {
                                j3 = 150 - this.anIntArray982[k];
                                if (j3 < 50) {
                                    i3 = 16711680 + 1280 * j3;
                                } else if (j3 < 100) {
                                    i3 = 16776960 - 327680 * (j3 - 50);
                                } else if (j3 < 150) {
                                    i3 = 65280 + 5 * (j3 - 100);
                                }
                            }
                            if (this.anIntArray980[k] == 10) {
                                k3 = 150 - this.anIntArray982[k];
                                if (k3 < 50) {
                                    i3 = 16711680 + 5 * k3;
                                } else if (k3 < 100) {
                                    i3 = 16711935 - 327680 * (k3 - 50);
                                } else if (k3 < 150) {
                                    i3 = 255 + 327680 * (k3 - 100) - 5 * (k3 - 100);
                                }
                            }
                            if (this.anIntArray980[k] == 11) {
                                l3 = 150 - this.anIntArray982[k];
                                if (l3 < 50) {
                                    i3 = 16777215 - 327685 * l3;
                                } else if (l3 < 100) {
                                    i3 = 65280 + 327685 * (l3 - 50);
                                } else if (l3 < 150) {
                                    i3 = 16777215 - 327680 * (l3 - 100);
                                }
                            }
                            if (this.anIntArray981[k] == 0) {
                                this.boldFont.drawText(0, s, this.spriteDrawY + 1, this.spriteDrawX);
                                this.boldFont.drawText(i3, s, this.spriteDrawY, this.spriteDrawX);
                            }
                            if (this.anIntArray981[k] == 1) {
                                this.boldFont.method386(0, s, this.spriteDrawX, this.anInt1265, this.spriteDrawY + 1);
                                this.boldFont.method386(i3, s, this.spriteDrawX, this.anInt1265, this.spriteDrawY);
                            }
                            if (this.anIntArray981[k] == 2) {
                                this.boldFont.method387(this.spriteDrawX, s, this.anInt1265, this.spriteDrawY + 1, 0);
                                this.boldFont.method387(this.spriteDrawX, s, this.anInt1265, this.spriteDrawY, i3);
                            }
                            if (this.anIntArray981[k] == 3) {
                                this.boldFont.method388(150 - this.anIntArray982[k], s, this.anInt1265, this.spriteDrawY + 1, this.spriteDrawX, 0);
                                this.boldFont.method388(150 - this.anIntArray982[k], s, this.anInt1265, this.spriteDrawY, this.spriteDrawX, i3);
                            }
                            if (this.anIntArray981[k] == 4) {
                                i4 = this.boldFont.method384(s);
                                k4 = (150 - this.anIntArray982[k]) * (i4 + 100) / 150;
                                DrawingArea.setDrawingArea(334, this.spriteDrawX - 50, this.spriteDrawX + 50, 0);
                                this.boldFont.method385(0, s, this.spriteDrawY + 1, this.spriteDrawX + 50 - k4);
                                this.boldFont.method385(i3, s, this.spriteDrawY, this.spriteDrawX + 50 - k4);
                                DrawingArea.defaultDrawingAreaSize();
                            }
                            if (this.anIntArray981[k] == 5) {
                                j4 = 150 - this.anIntArray982[k];
                                l4 = 0;
                                if (j4 < 25) {
                                    l4 = j4 - 25;
                                } else if (j4 > 125) {
                                    l4 = j4 - 125;
                                }
                                DrawingArea.setDrawingArea(this.spriteDrawY + 5, 0, 512, this.spriteDrawY - this.boldFont.anInt1497 - 1);
                                this.boldFont.drawText(0, s, this.spriteDrawY + 1 + l4, this.spriteDrawX);
                                this.boldFont.drawText(i3, s, this.spriteDrawY + l4, this.spriteDrawX);
                                DrawingArea.defaultDrawingAreaSize();
                            }
                        } else {
                            this.boldFont.drawText(0, s, this.spriteDrawY + 1, this.spriteDrawX);
                            this.boldFont.drawText(16776960, s, this.spriteDrawY, this.spriteDrawX);
                        }
                        ++k;
                    }
                    return;
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
            for (j1 = 0; j1 < 4; ++j1) {
                if (((Mobile)obj).hitsLoopCycle[j1] <= Client.loopCycle) continue;
                this.npcScreenPos((Mobile)obj, ((Mobile)obj).height / 2);
                if (this.spriteDrawX <= -1) continue;
                switch (j1) {
                    case 1: {
                        this.spriteDrawY += 20;
                        break;
                    }
                    case 2: {
                        this.spriteDrawY += 25;
                        break;
                    }
                    case 3: {
                        this.spriteDrawY += 45;
                    }
                }
                e = (Mobile)obj;
                if (e.hitmarkMove[j1] <= -30) continue;
                v9 = e.hitmarkMove;
                v10 = j1;
                v9[v10] = v9[v10] - 1;
                if (e.hitmarkTrans[j1] > 0) {
                    v11 = e.hitmarkTrans;
                    v12 = j1;
                    v11[v12] = v11[v12] - 5;
                }
                this.hitmarkDraw(e, String.valueOf((int)e.hitMarkDamage[j1]).length(), e.hitMarkTypes[j1], e.hitmarkIcon[j1], e.hitMarkDamage[j1], e.hitmarkMove[j1], e.hitmarkTrans[j1], e.hitMarkFocusPlayer[j1], e.hitMarkFocusNPC[j1]);
            }
        }
        ++j;
        ** GOTO lbl4
    }

    public void updateGameArea() {
        try {
            Rasterizer.method365(this.getScreenWidth(), this.getScreenHeight());
            this.fullScreenTextureArray = Rasterizer.anIntArray1472;
            Rasterizer.method365(!Client.isFixed() ? this.getScreenWidth() : 519, !Client.isFixed() ? this.getScreenHeight() : 165);
            this.anIntArray1180 = Rasterizer.anIntArray1472;
            Rasterizer.method365(!Client.isFixed() ? this.getScreenWidth() : 246, !Client.isFixed() ? this.getScreenHeight() : 335);
            this.anIntArray1181 = Rasterizer.anIntArray1472;
            Rasterizer.method365(this.main3DAreaWidth, this.main3DAreaHeight);
            this.anIntArray1182 = Rasterizer.anIntArray1472;
            int[] ai = new int[9];
            for (int i8 = 0; i8 < 9; ++i8) {
                int k8 = 128 + i8 * 32 + 15;
                int l8 = 600 + k8 * 3;
                int i9 = Rasterizer.anIntArray1470[k8];
                ai[i8] = l8 * i9 >> 16;
            }
            WorldController.method310(500, 800, !this.loggedIn ? this.getScreenWidth() : this.main3DAreaWidth, !this.loggedIn ? this.getScreenHeight() : this.main3DAreaHeight, ai);
            if (this.loggedIn) {
                this.main3DArea = Client.constructGraphicsBuffer(this.main3DAreaWidth, this.main3DAreaHeight, this.getGameComponent());
            }
            this.updateGraphics(true);
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateInputField(InputFieldWidget rsi) {
        rsi.handleInput(this);
    }

    public void updateNPCs(Stream stream, int i) {
        this.anInt839 = 0;
        this.anInt893 = 0;
        this.method139(stream);
        this.method46(i, stream);
        this.method86(stream);
        for (int k = 0; k < this.anInt839; ++k) {
            int l = this.anIntArray840[k];
            if (this.npcArray[l].anInt1537 == loopCycle) continue;
            this.npcArray[l].npcDefinition = null;
            this.npcArray[l] = null;
        }
        if (stream.currentOffset != i) {
            Signlink.reporterror(this.myUsername + " size mismatch in getnpcpos - pos:" + stream.currentOffset + " psize:" + i);
            throw new RuntimeException("eek");
        }
        int i1 = 0;
        while (i1 < this.npcCount) {
            if (this.npcArray[this.npcIndices[i1]] == null) {
                Signlink.reporterror(this.myUsername + " null entry in npc list - pos:" + i1 + " size:" + this.npcCount);
                throw new RuntimeException("eek");
            }
            ++i1;
        }
    }

    public void updatePlayers(int i, Stream stream) {
        this.anInt839 = 0;
        this.anInt893 = 0;
        this.method117(stream);
        this.method134(stream);
        this.method91(stream, i);
        this.method49(stream);
        for (int k = 0; k < this.anInt839; ++k) {
            int l = this.anIntArray840[k];
            if (this.playerArray[l].anInt1537 == loopCycle) continue;
            this.playerArray[l] = null;
        }
        if (stream.currentOffset != i) {
            Signlink.reporterror("Error packet size mismatch in getplayer pos:" + stream.currentOffset + " psize:" + i);
            throw new RuntimeException("eek");
        }
        int i1 = 0;
        while (i1 < this.playerCount) {
            if (this.playerArray[this.playerIndices[i1]] == null) {
                Signlink.reporterror(this.myUsername + " null entry in pl list - pos:" + i1 + " size:" + this.playerCount);
                throw new RuntimeException("eek");
            }
            ++i1;
        }
    }

    public void updateScreen() {
        this.main3DAreaWidth = Client.isFixed() ? 512 : this.getScreenWidth();
        int n = this.main3DAreaHeight = Client.isFixed() ? 334 : this.getScreenHeight();
        if (this.main3DArea == null || this.main3DArea.width != this.main3DAreaWidth || this.main3DArea.height != this.main3DAreaHeight) {
            this.main3DArea = Client.constructGraphicsBuffer(this.main3DAreaWidth, this.main3DAreaHeight, this.getGameComponent());
        }
        this.updateGameArea();
        this.updateGraphics(false);
    }

    public void updateSkill(int skillIndex) {
        SkillStringData data = SkillStringData.forId(skillIndex);
        if (data == null) {
            return;
        }
        int baseLevel = this.getLevelForXP(this.currentExp[skillIndex]);
        int remainder = this.getXPForLevel(baseLevel + 1) - this.currentExp[skillIndex];
        if (remainder < 0) {
            remainder = 0;
        }
        Client.sendFrame126("" + this.currentStats[skillIndex] + "", data.getLevel());
        Client.sendFrame126("" + baseLevel + "", data.getLevel() + 1);
        Client.sendFrame126("" + this.currentExp[skillIndex] + "", data.getExp());
        Client.sendFrame126("" + this.getXPForLevel(baseLevel + 1) + "", data.getExp() + 1);
        Client.sendFrame126("" + remainder + "", data.getDisplay());
        Client.sendFrame126("" + this.currentStats[skillIndex] + "/" + baseLevel, data.getDisplay() - 2);
    }

    public void updateStrings(String str, int i) {
        switch (i) {
            case 1675: {
                Client.sendFrame126(str, 17508);
                return;
            }
            case 1676: {
                Client.sendFrame126(str, 17509);
                return;
            }
            case 1677: {
                Client.sendFrame126(str, 17510);
                return;
            }
            case 1678: {
                Client.sendFrame126(str, 17511);
                return;
            }
            case 1679: {
                Client.sendFrame126(str, 17512);
                return;
            }
            case 1680: {
                Client.sendFrame126(str, 17513);
                return;
            }
            case 1681: {
                Client.sendFrame126(str, 17514);
                return;
            }
            case 1682: {
                Client.sendFrame126(str, 17515);
                return;
            }
            case 1683: {
                Client.sendFrame126(str, 17516);
                return;
            }
            case 1684: {
                Client.sendFrame126(str, 17517);
                return;
            }
            case 1686: {
                Client.sendFrame126(str, 17518);
                return;
            }
            case 1687: {
                Client.sendFrame126(str, 17519);
            }
        }
    }

    public boolean withinDistance(int x1, int y1, int x2, int y2, int dis) {
        int i = 0;
        while (i <= dis) {
            try {
                if (x1 + i == x2) {
                    if (y1 + i == y2) return true;
                    if (y1 - i == y2) return true;
                    if (y1 == y2) {
                        return true;
                    }
                }
                if (x1 - i == x2) {
                    if (x1 + i == y2) return true;
                    if (y1 - i == y2) return true;
                    if (y1 == y2) {
                        return true;
                    }
                }
                if (x1 == x2) {
                    if (x1 + i == y2) return true;
                    if (y1 - i == y2) return true;
                    if (y1 == y2) {
                        return true;
                    }
                }
            }
            catch (Exception ex) {
                System.out.println("Exception in following, method : WithingDistance");
            }
            ++i;
        }
        return false;
    }

    public static PlayerSettings getSettings() {
        return playerSettings;
    }

    static {
        System.setProperty((String)"java.net.preferIPv4Stack", (String)"true");
        betaOnly = false;
        screenMode = ScreenMode.FIXED;
        skinColor2 = new int[]{4540, 4529, 5674, 5667, 5785, 6802, 8072, 4562};
        clientHeight = 503;
        clientWidth = 765;
        renderDistance = 5;
        playerSettings = new PlayerSettings();
        chatIncreaseY = 0;
        chatIncreaseX = 0;
        bubbles = new ArrayList();
        hdMinimap = true;
        spellID = 0;
        enterToChat = false;
        firstPersonMode = false;
        totalRead = 0;
        wearingPumpkin = false;
        lala = 0;
        fadeStep = 1;
        CHANNEL_NAMES = new String[]{"All", "Game", "Public", "Private", "Trade", "Clan", "Yell", "Staff Panel"};
        displayZoomDuration = 0;
        displayAlertDuration = new int[5];
        alertTitle = new String[5];
        alertMessage = new String[5];
        announcement = true;
        chatColorHex = "FFFFFF";
        focusTab = 3;
        cameraZoom = 2.0;
        particleOffset = 0.0f;
        step = 1;
        excepSprite = new int[]{17};
        switching = false;
        autoFog = true;
        xlateTable = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '#', '+', '=', '\u00a3', '$', '%', '\"', '[', ']'};
        cursorInfo = new String[]{"Walk-to", "Take", "Use", "Talk-to", "Open", "Net", "Bait", "Cage", "Harpoon", "Chop", "Bury", "Pray-at", "Mine", "Eat", "Drink", "Wield", "Wear", "Remove", "Attack", "Enter", "Exit", "Climb-up", "Climb-down", "Search", "Steal", "Smelt", "Clean", "Back", "Deposit", "Inspect", "nothingbro", "Zoom", "Buy", "Settings", "Craft", "Mine", "Accept", "Decline", "Cast Ice Barrage on", "Cast Blood Barrage on", "Cast Shadow Barrage on", "Cast Smoke Barrage on", "Cast Ice Blitz on", "Cast Blood Blitz on", "Cast Shadow Blitz on", "Cast Smoke Blitz on", "Cast Ice Burst on", "Cast Blood Burst on", "Cast Shadow Burst on", "Cast Smoke Burst on", "Cast Ice Rush on", "Cast Blood Rush on", "Cast Shadow Rush on", "Cast Smoke Rush on", "Link", "Split Private", "Graphics", "Audio", "Read", "Cast Home Teleport", "Click", "Information", "Cast High level alchemy on", "Cast Low level alchemy on", "Value", "Select", "Craft-rune", "World Map", "Withdraw", "Slash", "Pull", "Build", "Light", "Use Tinderbox", "Toggle", "Donator"};
        nodeID = 10;
        isMembers = true;
        equipmentColors = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
        tabInterfaceIDs = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        anIntArray1204 = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
        enableMipMapping = true;
        log_view_dist = 9;
        transparentChat = false;
        newTabs = false;
        anIntArray1019 = new int[126];
        int points = 0;
        for (int j = 0; j <= 125; ++j) {
            int l = j + 1;
            int i1 = (int)((double)l + 300.0 * Math.pow((double)2.0, (double)((double)l / 7.0)));
            Client.anIntArray1019[j] = (points += i1) / 4;
        }
        anIntArray1232 = new int[32];
        points = 2;
        for (int k = 0; k < 32; points += points, ++k) {
            Client.anIntArray1232[k] = points - 1;
        }
        snowFlakes = new ArrayList();
        random = new Random();
        connectionStatus = betaOnly ? ConnectionStatus.BETA : ConnectionStatus.ECO;
        steps = 1;
        switchColor = false;
    }

}

