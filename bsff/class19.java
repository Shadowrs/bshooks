import java.util.Comparator;

final class class19 implements Comparator {
   static class263 field311;

   int method157(class14 var1, class14 var2, byte var3) {
      return var1.field278 < var2.field278 ? -1 : (var2.field278 == var1.field278 ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method157((class14)var1, (class14)var2, (byte)-78);
   }

   static void method168(int var0, int var1) {
      if (var0 == -3) {
         class33.method385("Connection timed out.", "Please try using a different world.", "", -817096677);
      } else if (var0 == -2) {
         class33.method385("", "Error connecting to server.", "", 1674287367);
      } else if (var0 == -1) {
         class33.method385("No response from server.", "Please try using a different world.", "", 1344321050);
      } else if (var0 == 3) {
         class90.field1355 = 3;
      } else if (var0 == 4) {
         class33.method385("Your account has been disabled.", "Please check your message-centre for details.", "", -46761388);
      } else if (var0 == 5) {
         class33.method385("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.", -1896407039);
      } else if (var0 == 6) {
         class33.method385("RuneScape has been updated!", "Please reload this page.", "", 1880069905);
      } else if (var0 == 7) {
         class33.method385("This world is full.", "Please use a different world.", "", -392306279);
      } else if (var0 == 8) {
         class33.method385("Unable to connect.", "Login server offline.", "", 1345411404);
      } else if (var0 == 9) {
         class33.method385("Login limit exceeded.", "Too many connections from your address.", "", 303011862);
      } else if (var0 == 10) {
         class33.method385("Unable to connect.", "Bad session id.", "", 324831109);
      } else if (var0 == 11) {
         class33.method385("We suspect someone knows your password.", "Press 'change your password' on front page.", "", -1149219305);
      } else if (var0 == 12) {
         class33.method385("You need a members account to login to this world.", "Please subscribe, or use a different world.", "", 1357190677);
      } else if (var0 == 13) {
         class33.method385("Could not complete login.", "Please try using a different world.", "", -1344821130);
      } else if (var0 == 14) {
         class33.method385("The server is being updated.", "Please wait 1 minute and try again.", "", 44800541);
      } else if (var0 == 16) {
         class33.method385("Too many login attempts.", "Please wait a few minutes before trying again.", "", 227557543);
      } else if (var0 == 17) {
         class33.method385("You are standing in a members-only area.", "To play on this world move to a free area first", "", 616781134);
      } else if (var0 == 18) {
         class33.method385("Account locked as we suspect it has been stolen.", "Press 'recover a locked account' on front page.", "", 1976563733);
      } else if (var0 == 19) {
         class33.method385("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.", 31898257);
      } else if (var0 == 20) {
         class33.method385("Invalid loginserver requested.", "Please try using a different world.", "", -1184764995);
      } else if (var0 == 22) {
         class33.method385("Malformed login packet.", "Please try again.", "", 950057078);
      } else if (var0 == 23) {
         class33.method385("No reply from loginserver.", "Please wait 1 minute and try again.", "", -788267446);
      } else if (var0 == 24) {
         class33.method385("Error loading your profile.", "Please contact customer support.", "", -61120108);
      } else if (var0 == 25) {
         class33.method385("Unexpected loginserver response.", "Please try using a different world.", "", -1458225068);
      } else if (var0 == 26) {
         class33.method385("This computers address has been blocked", "as it was used to break our rules.", "", 224121077);
      } else if (var0 == 27) {
         class33.method385("", "Service unavailable.", "", -1694436427);
      } else if (var0 == 31) {
         class33.method385("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.", 1135706516);
      } else if (var0 == 32) {
         class33.method385("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.", -1645027326);
      } else if (var0 == 37) {
         class33.method385("Your account is currently inaccessible.", "Please try again in a few minutes.", "", 1425307828);
      } else if (var0 == 38) {
         class33.method385("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!", -1812218889);
      } else if (var0 == 55) {
         class33.method385("Sorry, but your account is not eligible to", "play this version of the game.  Please try", "playing the main game instead!", -1712121943);
      } else {
         if (var0 == 56) {
            class33.method385("Enter the 6-digit code generated by your", "authenticator app.", "", -800967565);
            class48.method748(11, 1263875606);
            return;
         }

         if (var0 == 57) {
            class33.method385("The code you entered was incorrect.", "Please try again.", "", 923351885);
            class48.method748(11, -680875319);
            return;
         }

         class33.method385("Unexpected server response", "Please try using a different world.", "", 1575398635);
      }

      class48.method748(10, -1235124711);
   }

   static void method166(int var0) {
      if (client.field982 >= 0 && client.field971[client.field982] != null) {
         class37.method523(client.field971[client.field982], false, (byte)95);
      }

   }

   static int method158(int var0, class96 var1, boolean var2, int var3) {
      class242 var4 = class3.method2(class81.field1272[--class135.field1964], 2094398968);
      if (var0 == 2500) {
         class81.field1272[++class135.field1964 - 1] = var4.field2947;
         return 1;
      } else if (var0 == 2501) {
         class81.field1272[++class135.field1964 - 1] = var4.field2828;
         return 1;
      } else if (var0 == 2502) {
         class81.field1272[++class135.field1964 - 1] = var4.field2826;
         return 1;
      } else if (var0 == 2503) {
         class81.field1272[++class135.field1964 - 1] = var4.field2887;
         return 1;
      } else if (var0 == 2504) {
         class81.field1272[++class135.field1964 - 1] = var4.field2834 ? 1 : 0;
         return 1;
      } else if (var0 == 2505) {
         class81.field1272[++class135.field1964 - 1] = var4.field2885;
         return 1;
      } else {
         return 2;
      }
   }
}
