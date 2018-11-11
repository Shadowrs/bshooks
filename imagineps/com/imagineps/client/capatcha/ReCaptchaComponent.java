/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Component
 *  java.awt.Desktop
 *  java.awt.Dimension
 *  java.awt.Font
 *  java.awt.Graphics
 *  java.awt.Graphics2D
 *  java.awt.Image
 *  java.awt.LayoutManager
 *  java.awt.event.ActionEvent
 *  java.awt.event.ActionListener
 *  java.awt.event.MouseAdapter
 *  java.awt.event.MouseEvent
 *  java.awt.event.MouseListener
 *  java.awt.event.WindowAdapter
 *  java.awt.event.WindowEvent
 *  java.awt.event.WindowListener
 *  java.awt.image.ImageObserver
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.URI
 *  java.net.URISyntaxException
 *  java.net.URL
 *  javax.imageio.ImageIO
 *  javax.swing.FocusManager
 *  javax.swing.JButton
 *  javax.swing.JComponent
 *  javax.swing.JFrame
 *  javax.swing.JLabel
 *  javax.swing.JTextField
 *  javax.swing.SpringLayout
 *  javax.xml.namespace.QName
 *  javax.xml.parsers.DocumentBuilder
 *  javax.xml.parsers.DocumentBuilderFactory
 *  javax.xml.xpath.XPath
 *  javax.xml.xpath.XPathConstants
 *  javax.xml.xpath.XPathExpression
 *  javax.xml.xpath.XPathFactory
 *  org.w3c.dom.Document
 *  org.xml.sax.InputSource
 */
package com.imagineps.client.capatcha;

import com.imagineps.client.Client;
import com.imagineps.client.capatcha.Button;
import com.imagineps.client.capatcha.Theme;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.FocusManager;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.tidy.Node;
import org.w3c.tidy.Tidy;
import org.xml.sax.InputSource;

public class ReCaptchaComponent
extends JComponent {
    private static final long serialVersionUID = 1L;
    private static XPathExpression expression;
    private static Tidy tidy;
    private static DocumentBuilder builder;
    private String publicKey;
    private String challengeField;
    private Image image;
    private Theme theme;
    private JButton refresh;
    private JButton textChallenge;
    private JButton audioChallenge;
    private JButton help;
    public JTextField input;
    private JLabel privacyAndTerms;
    SpringLayout layout;

    public ReCaptchaComponent(String publicKey) {
        this(publicKey, Theme.RED);
    }

    public ReCaptchaComponent(String publicKey, Theme theme) {
        this.refresh = new Button(){
            private static final long serialVersionUID = 1L;

            @Override
            public Image getImage() {
                return ReCaptchaComponent.this.theme.getReloadButton();
            }
        };
        this.textChallenge = new Button(){
            private static final long serialVersionUID = 1L;

            @Override
            public Image getImage() {
                return ReCaptchaComponent.this.theme.getTextChallenge();
            }
        };
        this.audioChallenge = new Button(){
            private static final long serialVersionUID = 1L;

            @Override
            public Image getImage() {
                return ReCaptchaComponent.this.theme.getAudioChallenge();
            }
        };
        this.help = new Button(){
            private static final long serialVersionUID = 1L;

            @Override
            public Image getImage() {
                return ReCaptchaComponent.this.theme.getHelpButton();
            }
        };
        this.input = new JTextField(){
            private static final long serialVersionUID = 1L;

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (!this.getText().isEmpty()) return;
                if (FocusManager.getCurrentKeyboardFocusManager().getFocusOwner() == this) return;
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setBackground(Color.gray);
                g2.drawString("Type the text", 5, 12);
                g2.dispose();
            }
        };
        this.privacyAndTerms = new JLabel("Privacy & Terms");
        this.publicKey = publicKey;
        this.refresh();
        this.setMinimumSize(new Dimension(318, 129));
        this.setMaximumSize(new Dimension(318, 129));
        this.setPreferredSize(new Dimension(318, 129));
        this.setSize(new Dimension(318, 129));
        this.setTheme(theme);
        this.layout = new SpringLayout();
        this.setLayout((LayoutManager)this.layout);
        this.layout.putConstraint("North", (Component)this.refresh, 72, "North", (Component)this);
        this.layout.putConstraint("West", (Component)this.refresh, 187, "West", (Component)this);
        this.add((Component)this.refresh);
        this.refresh.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent actionEvent) {
                ReCaptchaComponent.this.refresh();
            }
        });
        this.layout.putConstraint("North", (Component)this.audioChallenge, 0, "South", (Component)this.refresh);
        this.layout.putConstraint("West", (Component)this.audioChallenge, 0, "West", (Component)this.refresh);
        this.add((Component)this.audioChallenge);
        this.audioChallenge.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent actionEvent) {
                ReCaptchaComponent.this.layout.putConstraint("North", (Component)ReCaptchaComponent.this.textChallenge, 0, "South", (Component)ReCaptchaComponent.this.refresh);
                ReCaptchaComponent.this.layout.putConstraint("West", (Component)ReCaptchaComponent.this.textChallenge, 0, "West", (Component)ReCaptchaComponent.this.refresh);
                ReCaptchaComponent.this.layout.putConstraint("North", (Component)ReCaptchaComponent.this.help, -1, "South", (Component)ReCaptchaComponent.this.textChallenge);
                ReCaptchaComponent.this.layout.putConstraint("West", (Component)ReCaptchaComponent.this.help, 0, "West", (Component)ReCaptchaComponent.this.textChallenge);
                ReCaptchaComponent.this.remove((Component)ReCaptchaComponent.this.audioChallenge);
                ReCaptchaComponent.this.add((Component)ReCaptchaComponent.this.textChallenge);
                ReCaptchaComponent.this.validate();
            }
        });
        this.textChallenge.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent actionEvent) {
                ReCaptchaComponent.this.remove((Component)ReCaptchaComponent.this.textChallenge);
                ReCaptchaComponent.this.layout.putConstraint("North", (Component)ReCaptchaComponent.this.audioChallenge, 0, "South", (Component)ReCaptchaComponent.this.refresh);
                ReCaptchaComponent.this.layout.putConstraint("West", (Component)ReCaptchaComponent.this.audioChallenge, 0, "West", (Component)ReCaptchaComponent.this.refresh);
                ReCaptchaComponent.this.layout.putConstraint("North", (Component)ReCaptchaComponent.this.help, -1, "South", (Component)ReCaptchaComponent.this.audioChallenge);
                ReCaptchaComponent.this.layout.putConstraint("West", (Component)ReCaptchaComponent.this.help, 0, "West", (Component)ReCaptchaComponent.this.audioChallenge);
                ReCaptchaComponent.this.add((Component)ReCaptchaComponent.this.audioChallenge);
                ReCaptchaComponent.this.validate();
            }
        });
        this.layout.putConstraint("North", (Component)this.help, -1, "South", (Component)this.audioChallenge);
        this.layout.putConstraint("West", (Component)this.help, 0, "West", (Component)this.audioChallenge);
        this.add((Component)this.help);
        this.help.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.google.com/recaptcha/help"));
                    return;
                }
                catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
                catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });
        this.input.setPreferredSize(new Dimension(153, 18));
        this.layout.putConstraint("North", (Component)this.input, 83, "North", (Component)this);
        this.layout.putConstraint("West", (Component)this.input, 16, "West", (Component)this);
        this.add((Component)this.input);
        this.layout.putConstraint("North", (Component)this.privacyAndTerms, 3, "South", (Component)this.input);
        this.layout.putConstraint("East", (Component)this.privacyAndTerms, 0, "East", (Component)this.input);
        this.privacyAndTerms.setFont(this.privacyAndTerms.getFont().deriveFont(9.0f));
        this.privacyAndTerms.setForeground(Color.BLUE);
        this.privacyAndTerms.addMouseListener((MouseListener)new MouseAdapter(){

            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.google.com/intl/en/policies/"));
                    return;
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                    return;
                }
                catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
        this.add((Component)this.privacyAndTerms);
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public synchronized void refresh() {
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            tidy.parse(new URL("http://www.google.com/recaptcha/api/noscript?k=" + this.publicKey).openStream(), (OutputStream)buffer);
            String tidied = new String(buffer.toByteArray());
            Document document = builder.parse(new InputSource((Reader)new StringReader(tidied)));
            this.challengeField = (String)expression.evaluate((Object)document, XPathConstants.STRING);
            this.image = ImageIO.read((URL)new URL("http://www.google.com/recaptcha/api/image?c=" + this.challengeField));
            this.input.setText("");
            this.repaint();
            return;
        }
        catch (Exception e) {
            throw new IllegalArgumentException((Throwable)e);
        }
    }

    public void paint(Graphics graphics) {
        graphics.drawImage(this.theme.getBack(), 0, 0, null);
        graphics.drawImage(this.image, 9, 9, null);
        super.paint(graphics);
    }

    public String getChallengeField() {
        return this.challengeField;
    }

    public String getText() {
        return this.input.getText();
    }

    public static ReCaptchaComponent main() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(2);
        frame.setResizable(false);
        frame.setSize(318, 170);
        final ReCaptchaComponent component = new ReCaptchaComponent("6LcGpyIUAAAAAIqxcSusXvBHT-ddiJIprtYKOyME", Theme.BLACKGLASS);
        frame.add((Component)component);
        frame.setVisible(false);
        frame.addWindowListener((WindowListener)new WindowAdapter(){

            public void windowClosing(WindowEvent winEvt) {
                Client.reCaptcha.setVisible(false);
            }
        });
        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                if (component.getText().isEmpty()) {
                    return;
                }
                Client.reCaptcha.setVisible(false);
            }
        });
        frame.add((Component)submit, (Object)"South");
        return component;
    }

    static {
        try {
            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            expression = xpath.compile("//*[@id=\"recaptcha_challenge_field\"]/@value");
        }
        catch (Exception e) {
            e.printStackTrace();
            expression = null;
        }
        tidy = new Tidy();
        tidy.setQuiet(true);
        tidy.setShowErrors(0);
        tidy.setShowWarnings(false);
        tidy.setXmlOut(true);
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
            builder = null;
        }
    }

}

