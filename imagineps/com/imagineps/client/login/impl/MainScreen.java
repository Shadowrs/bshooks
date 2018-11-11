/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.awt.Graphics
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.imagineps.client.login.impl;

import com.imagineps.client.AccountData;
import com.imagineps.client.Client;
import com.imagineps.client.Configuration;
import com.imagineps.client.RSFont;
import com.imagineps.client.TextClass;
import com.imagineps.client.TextDrawingArea;
import com.imagineps.client.Utility;
import com.imagineps.client.graphics.DrawingArea;
import com.imagineps.client.graphics.GraphicsBuffer;
import com.imagineps.client.graphics.Rasterizer;
import com.imagineps.client.graphics.Sprite;
import com.imagineps.client.login.LoginComponent;
import com.imagineps.client.login.LoginRenderer;
import com.imagineps.client.login.ScreenType;
import com.imagineps.client.login.impl.AccountScreen;
import com.imagineps.client.login.impl.ConfirmationScreen;
import com.imagineps.client.login.impl.MessageScreen;
import com.imagineps.content.AccountManager;
import com.imagineps.content.Settings;
import com.imagineps.content.login_screen.LoginScreen;
import java.awt.Graphics;
import java.util.List;

public class MainScreen
extends LoginComponent {
    @Override
    public void render(Client client) {
        Sprite information;
        Sprite loginButton;
        Sprite background;
        int centerX = this.getX();
        int centerY = this.getY();
        this.refresh(client);
        this.load(client, 10);
        if (client.loginMessage.length() > 0) {
            client.loginRenderer.setScreen(new MessageScreen());
        }
        if ((background = LoginScreen.getImage("main_screen")) != null) {
            background.drawTransparentSprite(centerX - background.myWidth / 2, centerY - background.myHeight / 2, client.loginTick);
        }
        if (client.mouseInRegion(centerX - 33, centerY + 66, centerX + 208, centerY + 107)) {
            loginButton = LoginScreen.getImage("login_button");
            if (loginButton != null) {
                loginButton.drawTransparentSprite(centerX - 33, centerY + 66, client.loginTick);
            }
        } else {
            loginButton = LoginScreen.getImage("login_button");
            if (loginButton != null) {
                loginButton.drawTransparentSprite(centerX - 33, centerY + 66, client.loginTick - 30);
            }
        }
        client.smallFont.drawCenteredText(1803417, centerX + 13, "Save Account?", centerY + 42, false);
        if (Configuration.REMEMBER_ME) {
            Sprite saveAccountSelected = LoginScreen.getImage("save_account_selected");
            if (saveAccountSelected != null) {
                saveAccountSelected.drawTransparentSprite(centerX + 53, centerY + 33, client.loginTick);
            }
        } else {
            Sprite saveAccountUnselected = LoginScreen.getImage("save_account_unselected");
            if (saveAccountUnselected != null) {
                saveAccountUnselected.drawTransparentSprite(centerX + 53, centerY + 33, client.loginTick);
            }
        }
        if (client.mouseInRegion(centerX - 26, centerY - 81, centerX + 198, centerY - 48) && (information = LoginScreen.getImage("information")) != null) {
            information.drawTransparentSprite(centerX - 29, centerY - 74, 15);
        }
        if (client.mouseInRegion(centerX - 26, centerY - 6, centerX + 198, centerY + 24) && (information = LoginScreen.getImage("information")) != null) {
            information.drawTransparentSprite(centerX - 29, centerY - 2, 15);
        }
        client.newBoldFont.drawBasicString(TextClass.fixName(client.myUsername) + (client.loginScreenCursorPos == 0 & Client.loopCycle % 40 < 20 ? "|" : ""), centerX - 28, centerY - 55, 9944261, 0);
        client.newBoldFont.drawBasicString("" + TextClass.passwordAsterisks(client.myPassword) + (client.loginScreenCursorPos == 1 & Client.loopCycle % 40 < 20 ? "|" : ""), centerX - 28, centerY + 18, 9944261, 0);
        if (client.mouseInRegion(centerX + 25, centerY + 116, centerX + 139, centerY + 124)) {
            client.smallFont.drawCenteredText(1142143, centerX + 80, "Forgot your password?", centerY + 124, false);
        } else {
            client.smallFont.drawCenteredText(1803417, centerX + 80, "Forgot your password?", centerY + 124, false);
        }
        if (client.mouseInRegion(centerX + 55, centerY + 134, centerX + 118, centerY + 146)) {
            client.smallFont.drawCenteredText(1142143, centerX + 80, "Need help?", centerY + 146, false);
        } else {
            client.smallFont.drawCenteredText(1803417, centerX + 80, "Need help?", centerY + 146, false);
        }
        this.drawAccount(client);
        this.drawWorldSelect(client);
        if (Configuration.DEBUG_MODE) {
            client.smallFont.drawCenteredText(16777215, centerX + 300, "MouseX: " + client.mouseX + " Mouse Y: " + client.mouseY, centerY - 225, true);
        }
        Client.loginScreenGraphicsBuffer.drawGraphics(0, client.getGraphics(), 0);
        DrawingArea.setAllPixelsToZero();
    }

    @Override
    public void click(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 26, centerY - 81, centerX + 203, centerY - 49)) {
            client.loginScreenCursorPos = 0;
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 26, centerY - 6, centerX + 203, centerY + 23)) {
            client.loginScreenCursorPos = 1;
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX + 25, centerY + 116, centerX + 139, centerY + 124)) {
            Client.launchURL("https://imagine-ps.com/community/index.php?/forum/22-support/");
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX + 55, centerY + 134, centerX + 118, centerY + 146)) {
            Client.launchURL("https://imagine-ps.com/community/index.php?/forum/22-support/");
        }
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 27, centerY + 27, centerX + 61, centerY + 46)) {
            Configuration.REMEMBER_ME = !Configuration.REMEMBER_ME;
            Settings.save();
        }
        int yPos = centerY - 70;
        if (AccountManager.ACCOUNTS != null) {
            for (int index = 0; index < AccountManager.ACCOUNTS.size(); ++index, yPos += 105) {
                AccountData accountData = (AccountData)AccountManager.ACCOUNTS.get(index);
                if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 230, yPos - 84, centerX - 63, yPos - 5)) {
                    client.lastAccount = accountData;
                    client.myUsername = Utility.formatName(accountData.username.toLowerCase());
                    client.myPassword = accountData.password;
                    client.attemptLogin(accountData.username, accountData.password, false);
                    if (client.loggedIn) {
                        return;
                    }
                }
                if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 230, yPos - 2, centerX - 85, yPos + 26)) {
                    if (client.lastAccount == null) {
                        client.loginMessage = "There was an issue loading your account.";
                        return;
                    }
                    client.lastAccount = accountData;
                    client.loginRenderer.setScreen(new AccountScreen());
                    return;
                }
                if (client.clickMode3 != 1 || !client.mouseInRegion(centerX - 83, yPos, centerX - 17 - 45, yPos + 20)) continue;
                client.accountToRemove = accountData;
                client.loginRenderer.setScreen(new ConfirmationScreen());
            }
        }
        this.worldSelectButton(client);
        if (client.clickMode3 == 1 && client.mouseInRegion(centerX - 33, centerY + 66, centerX + 208, centerY + 107) && !client.loggedIn) {
            client.attemptLogin(client.myUsername, client.myPassword, false);
        }
        this.handleWriting(client);
    }

    private void drawAccount(Client client) {
        int centerX = this.getX();
        int centerY = this.getY();
        int yPos = centerY - 70;
        Rasterizer.drawFilledPixels(centerX - 233, centerY - 152, 167, 316, 1531500, 100);
        int index = 0;
        while (index < 3) {
            Sprite emptyAccount;
            Sprite accountNameHover;
            AccountData accountData = AccountManager.get(index);
            if (accountData == null) {
                emptyAccount = LoginScreen.getImage("empty_account");
                if (emptyAccount != null) {
                    emptyAccount.drawARGBSprite(centerX - 183, yPos - 70);
                }
                if ((accountNameHover = LoginScreen.getImage("account_name_hover")) != null) {
                    accountNameHover.drawARGBSprite(centerX - 230, yPos - 2);
                }
            } else {
                emptyAccount = LoginScreen.getImage("empty_account");
                if (emptyAccount != null) {
                    emptyAccount.drawARGBSprite(centerX - 183, yPos - 70);
                }
                if (client.mouseInRegion(centerX - 83, yPos, centerX - 17 - 45, yPos + 20)) {
                    Sprite deleteAccountHover = LoginScreen.getImage("delete_account_hover");
                    if (deleteAccountHover != null) {
                        deleteAccountHover.drawARGBSprite(centerX - 83, yPos);
                    }
                    this.addTooltip("Delete profile");
                } else {
                    Sprite deleteAccount = LoginScreen.getImage("delete_account");
                    if (deleteAccount != null) {
                        deleteAccount.drawARGBSprite(centerX - 83, yPos);
                    }
                }
                accountNameHover = LoginScreen.getImage("account_name_hover");
                if (accountNameHover != null) {
                    accountNameHover.drawARGBSprite(centerX - 230, yPos - 2);
                }
                int rank = accountData.rank - 1;
                String name = accountData.username;
                if (rank <= -1) {
                    client.newBoldFont.drawCenteredString("<col=97bcc5>" + Utility.formatName(name.toLowerCase()), centerX - 160, yPos + 16);
                } else {
                    client.newBoldFont.drawCenteredString("<img=" + rank + "> <col=97bcc5>" + Utility.formatName(name.toLowerCase()), centerX - 160, yPos + 16);
                }
                if (client.mouseInRegion(centerX - 233, yPos - 2, centerX - 85, yPos + 26)) {
                    Rasterizer.drawRectangle(centerX - 233, yPos - 2, 146, 26, 1390397);
                    Rasterizer.drawFilledPixels(centerX - 233, yPos - 2, 146, 26, 1803417, 50);
                    this.addTooltip("Profile details");
                }
                if (client.mouseInRegion(centerX - 233, yPos - 84, centerX - 63, yPos - 5)) {
                    Rasterizer.drawRectangle(centerX - 233, yPos - 81, 167, 80, 1390397);
                    Rasterizer.drawFilledPixels(centerX - 233, yPos - 81, 167, 80, 1803417, 50);
                    this.addTooltip("Log into game with profile");
                }
            }
            ++index;
            yPos += 105;
        }
    }

    private void handleWriting(Client client) {
        int keyChar;
        while ((keyChar = client.readChar(-796)) != -1) {
            boolean flag1 = false;
            for (int i2 = 0; i2 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++i2) {
                if (keyChar != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(i2)) {
                    continue;
                }
                flag1 = true;
                break;
            }
            if (client.loginScreenCursorPos == 0) {
                if (keyChar == 8 && client.myUsername.length() > 0) {
                    client.myUsername = client.myUsername.substring(0, client.myUsername.length() - 1);
                }
                if (keyChar == 9 || keyChar == 10 || keyChar == 13) {
                    client.loginScreenCursorPos = 1;
                }
                if (flag1) {
                    client.myUsername = client.myUsername + (char)keyChar;
                }
                if (client.myUsername.length() <= 12) continue;
                client.myUsername = client.myUsername.substring(0, 12);
                continue;
            }
            if (client.loginScreenCursorPos == 1) {
                if (keyChar == 8 && client.myPassword.length() > 0) {
                    client.myPassword = client.myPassword.substring(0, client.myPassword.length() - 1);
                }
                if (keyChar == 9 || keyChar == 10 || keyChar == 13) {
                    if (client.loginScreenCursorPos == 0) {
                        client.loginScreenCursorPos = 1;
                    } else if (client.loginScreenCursorPos == 1 && client.myUsername.length() < 1) {
                        client.loginScreenCursorPos = 0;
                    } else if (client.loginScreenCursorPos == 1 && client.myPassword.length() < 5) {
                        client.loginMessage = "";
                    } else {
                        if (!client.loggedIn) {
                            client.login(client.myUsername, client.myPassword, false, false);
                        }
                        client.loginScreenCursorPos = 0;
                    }
                    if (client.myUsername.length() < 0) {
                        client.login(client.myUsername, client.myPassword, false, false);
                    } else {
                        client.loginScreenCursorPos = 0;
                    }
                }
                if (flag1) {
                    client.myPassword = client.myPassword + (char)keyChar;
                }
                if (client.myPassword.length() <= 20) continue;
                client.myPassword = client.myPassword.substring(0, 20);
                continue;
            }
            if (client.loginScreenCursorPos != 2) continue;
            if (flag1) {
                client.myEmail = client.myEmail + (char)keyChar;
            }
            if (keyChar != 9 && keyChar != 10 && keyChar != 13) continue;
            client.loginScreenCursorPos = 0;
        }
        return;
    }

    @Override
    public ScreenType type() {
        return ScreenType.MAIN;
    }
}

