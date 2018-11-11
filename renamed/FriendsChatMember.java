
public class FriendsChatMember extends Node {

   static FriendsChatMember[] friendsChatList;
   byte rank;
   String username;
   int anInt1663;
   public static short[] aShortArray1668;
   public static boolean aBool1669;
   String aString1670;


   static final void method1684(int var0, int var1, int localX, int var3, int localY, byte var5) {
      if(Friend.anInt620 * 687278457 == var0 && var1 == BuildType.anInt1238 * -365008633) {
         if(Client.anInt2890 * -158871381 == localX) {
            return;
         }

         if(!Client.lowMemory) {
            return;
         }
      }

      Friend.anInt620 = var0 * -964554551;
      BuildType.anInt1238 = var1 * -1482246985;
      Client.anInt2890 = localX * -1987728893;
      if(!Client.lowMemory) {
         Client.anInt2890 = 0;
      }

      IsaacRandomGen.method725(25, 1943042855);
      GameDefinition.method1107(StringUtilities.LOADING_PLEASE_WAIT, true, 488043270);
      int var10 = Class100.anInt1388 * 263051377;
      int var9 = SoundEffectWorker.anInt201 * -1743142671;
      Class100.anInt1388 = (var0 - 6) * -870890360;
      SoundEffectWorker.anInt201 = (var1 - 6) * 527007880;
      int var11 = Class100.anInt1388 * 263051377 - var10;
      int var7 = SoundEffectWorker.anInt201 * -1743142671 - var9;
      var10 = Class100.anInt1388 * 263051377;
      var9 = SoundEffectWorker.anInt201 * -1743142671;

      int entityIndex;
      int var13;
      for(entityIndex = 0; entityIndex < '\u8000'; ++entityIndex) {
         NPC var12 = Client.localNPCs[entityIndex];
         if(null != var12) {
            for(var13 = 0; var13 < 10; ++var13) {
               var12.anIntArray2391[var13] -= var11;
               var12.anIntArray2392[var13] -= var7;
            }

            var12.anInt2394 -= var11 * 1650389376;
            var12.anInt2339 -= var7 * 511765632;
         }
      }

      for(entityIndex = 0; entityIndex < 2048; ++entityIndex) {
         Player player = Client.localPlayers[entityIndex];
         if(null != player) {
            for(var13 = 0; var13 < 10; ++var13) {
               player.anIntArray2391[var13] -= var11;
               player.anIntArray2392[var13] -= var7;
            }

            player.anInt2394 -= var11 * 1650389376;
            player.anInt2339 -= var7 * 511765632;
         }
      }

      VarpBit.plane = localX * 1039304467;
      Player.myPlayer.method2720(var3, localY, false, 1160284584);
      byte var22 = 0;
      byte var24 = 104;
      byte var25 = 1;
      if(var11 < 0) {
         var22 = 103;
         var24 = -1;
         var25 = -1;
      }

      byte var18 = 0;
      byte var19 = 104;
      byte var20 = 1;
      if(var7 < 0) {
         var18 = 103;
         var19 = -1;
         var20 = -1;
      }

      for(int x = var22; var24 != x; x += var25) {
         for(int y = var18; y != var19; y += var20) {
            int offX = var11 + x;
            int offY = var7 + y;

            for(int plane = 0; plane < 4; ++plane) {
               if(offX >= 0 && offY >= 0 && offX < 104 && offY < 104) {
                  Client.groundItemArray[plane][x][y] = Client.groundItemArray[plane][offX][offY];
               } else {
                  Client.groundItemArray[plane][x][y] = null;
               }
            }
         }
      }

      for(Class108_Sub13 var21 = (Class108_Sub13) Client.aClass105_2939.getFront(); var21 != null; var21 = (Class108_Sub13) Client.aClass105_2939.getNext()) {
         var21.anInt1692 -= var11 * 341929743;
         var21.anInt1681 -= var7 * 1934863019;
         if(var21.anInt1692 * -1711169553 < 0 || var21.anInt1681 * -233897981 < 0 || var21.anInt1692 * -1711169553 >= 104 || var21.anInt1681 * -233897981 >= 104) {
            var21.unlink();
         }
      }

      if(0 != Client.anInt2933 * -1708054643) {
         Client.anInt2933 -= var11 * -18058427;
         Client.anInt2894 -= var7 * 1849977017;
      }

      Client.anInt2895 = 0;
      Client.aBool2886 = false;
      Client.lastKnownPlane = 1405183137;
      Client.aClass105_2928.method1333();
      Client.projectileDeque.method1333();
   }

   static final void method1685(Class108_Sub13 var0, byte var1) {
      int hash = 0;
      int objectID = -1;
      int var3 = 0;
      int var6 = 0;
      if(0 == var0.anInt1679 * -1012881333) {
         hash = Scene.gameScene.fetchWallObjectHash(var0.anInt1694 * -1237003511, var0.anInt1692 * -1711169553, var0.anInt1681 * -233897981);
      }

      if(var0.anInt1679 * -1012881333 == 1) {
         hash = Scene.gameScene.fetchWallDecorationHash(var0.anInt1694 * -1237003511, var0.anInt1692 * -1711169553, var0.anInt1681 * -233897981);
      }

      if(2 == var0.anInt1679 * -1012881333) {
         hash = Scene.gameScene.fetchTileInteractableHash(var0.anInt1694 * -1237003511, var0.anInt1692 * -1711169553, var0.anInt1681 * -233897981);
      }

      if(var0.anInt1679 * -1012881333 == 3) {
         hash = Scene.gameScene.fetchGroundTileDecorationHash(var0.anInt1694 * -1237003511, var0.anInt1692 * -1711169553, var0.anInt1681 * -233897981);
      }

      if(0 != hash) {
         int var5 = Scene.gameScene.method431(var0.anInt1694 * -1237003511, var0.anInt1692 * -1711169553, var0.anInt1681 * -233897981, hash);
         objectID = hash >> 14 & 32767;
         var3 = var5 & 31;
         var6 = var5 >> 6 & 3;
      }

      var0.anInt1683 = objectID * -1278197465;
      var0.anInt1685 = var3 * -1306998411;
      var0.anInt1684 = var6 * 634911733;
   }

}
