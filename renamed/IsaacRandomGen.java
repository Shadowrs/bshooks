import java.io.IOException;

public final class IsaacRandomGen {

	static RSByteBuffer js5WorkBuffer;
	static byte js5EncryptionKey = 0;
	static Js5Request activeJs5Job;
	static RSByteBuffer js5buffer = new RSByteBuffer(8);
	static boolean isUrgentRequest;
	int anInt736;
	int[] anIntArray739 = new int[256];
	int anInt741;
	int[] anIntArray742 = new int[256];
	int anInt743;
	int anInt744;
	static RSInterface aClass108_Sub17_745;
	static CacheIndex soundEffectsIndex_3;


	static void method725(int var0, int var1) {
		if (Client.loginLoadingStage * 1315883169 != var0) {
			if (Client.loginLoadingStage * 1315883169 == 0) {
				Class56.method744(2110408057);
			}

			if (20 == var0 || var0 == 40 || var0 == 45) {
				Client.loginStage = 0;
				Client.anInt2739 = 0;
				Client.anInt2740 = 0;
			}

			if (20 != var0 && 40 != var0 && Class16.aConnection_Session_211 != null) {
				Class16.aConnection_Session_211.disconnect();
				Class16.aConnection_Session_211 = null;
			}

			if (25 == Client.loginLoadingStage * 1315883169) {
				Client.anInt2943 = 0;
				Client.anInt2759 = 0;
				Client.anInt2830 = -1023731525;
				Client.anInt2761 = 0;
				Client.anInt2762 = -1236326003;
			}

			if (5 != var0 && var0 != 10) {
				if (20 == var0) {
					LoginHandler.setupLoginScreen(ContextMenuRow.aCanvas3, HuffmanEncoding.huffmanIndex, Class23.spriteIndex, true, 11 == Client.loginLoadingStage * 1315883169 ? 4 : 0, 2042385368);
				} else if (11 != var0) {
					if (PlayerLoginDetails.aBool58) {
						PlayerLoginDetails.titleBox = null;
						PlayerLoginDetails.titleButton = null;
						Class5.fireRuneSprites = null;
						PlayerLoginDetails.clientBackgroundLeft = null;
						Class41.clientBackgroundRight = null;
						IndexTable.clientLogo = null;
						MouseCapturer.musicMuteButton = null;
						PlayerLoginDetails.radioButtonOptions = null;
						GroundItem.radioButtonOptions_2 = null;
						World.worldBackSprites = null;
						World.worldFlagSprites = null;
						RuntimeException_Sub1.worldSortArrowSprites = null;
						KeyFocusListener.worldTypeSprites = null;
						World.switchWorldSprite = null;
						MouseCapturer.anIntArray382 = null;
						Class56.anIntArray757 = null;
						Client.anIntArray2966 = null;
						Class108_Sub10.anIntArray1655 = null;
						Class56.anIntArray755 = null;
						Class16.anIntArray204 = null;
						Class65.anIntArray860 = null;
						World.anIntArray565 = null;
						SoundEffectWorker.method288(2, 1795393564);
						ClientScriptMap.method2171(true, -1384693053);
						PlayerLoginDetails.aBool58 = false;
					}
				} else {
					LoginHandler.setupLoginScreen(ContextMenuRow.aCanvas3, HuffmanEncoding.huffmanIndex, Class23.spriteIndex, false, 4, 1576119496);
				}
			} else {
				LoginHandler.setupLoginScreen(ContextMenuRow.aCanvas3, HuffmanEncoding.huffmanIndex, Class23.spriteIndex, true, 0, 1877519495);
			}

			Client.loginLoadingStage = var0 * 985471841;
		}
	}

	final void method726(byte var1) {
		this.anInt736 += (this.anInt741 += 2044681187) * 1078660849;

		for (int var2 = 0; var2 < 256; ++var2) {
			int var3 = this.anIntArray739[var2];
			if (0 == (var2 & 2)) {
				if (0 != (var2 & 1)) {
					this.anInt744 = (this.anInt744 * -195929705 ^ this.anInt744 * -195929705 >>> 6) * -1128942041;
				} else {
					this.anInt744 = (this.anInt744 * -195929705 ^ this.anInt744 * -195929705 << 13) * -1128942041;
				}
			} else if ((var2 & 1) == 0) {
				this.anInt744 = (this.anInt744 * -195929705 ^ this.anInt744 * -195929705 << 2) * -1128942041;
			} else {
				this.anInt744 = (this.anInt744 * -195929705 ^ this.anInt744 * -195929705 >>> 16) * -1128942041;
			}

			this.anInt744 += this.anIntArray739[var2 + 128 & 255] * -1128942041;
			int var4;
			this.anIntArray739[var2] = var4 = this.anIntArray739[(var3 & 1020) >> 2] + this.anInt744 * -195929705 + this.anInt736 * -1768565637;
			this.anIntArray742[var2] = (this.anInt736 = (this.anIntArray739[(var4 >> 8 & 1020) >> 2] + var3) * -1647514957) * -1768565637;
		}

	}

	final void method727(int var1) {
		int var2 = -1640531527;
		int var9 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var6 = -1640531527;
		int var7 = -1640531527;
		int var10 = -1640531527;
		int var8 = -1640531527;

		int var3;
		for (var3 = 0; var3 < 4; ++var3) {
			var8 ^= var10 << 11;
			var6 += var8;
			var10 += var7;
			var10 ^= var7 >>> 2;
			var4 += var10;
			var7 += var6;
			var7 ^= var6 << 8;
			var5 += var7;
			var6 += var4;
			var6 ^= var4 >>> 16;
			var9 += var6;
			var4 += var5;
			var4 ^= var5 << 10;
			var2 += var4;
			var5 += var9;
			var5 ^= var9 >>> 4;
			var8 += var5;
			var9 += var2;
			var9 ^= var2 << 8;
			var10 += var9;
			var2 += var8;
			var2 ^= var8 >>> 9;
			var7 += var2;
			var8 += var10;
		}

		for (var3 = 0; var3 < 256; var3 += 8) {
			var8 += this.anIntArray742[var3];
			var10 += this.anIntArray742[1 + var3];
			var7 += this.anIntArray742[var3 + 2];
			var6 += this.anIntArray742[3 + var3];
			var4 += this.anIntArray742[4 + var3];
			var5 += this.anIntArray742[var3 + 5];
			var9 += this.anIntArray742[var3 + 6];
			var2 += this.anIntArray742[var3 + 7];
			var8 ^= var10 << 11;
			var6 += var8;
			var10 += var7;
			var10 ^= var7 >>> 2;
			var4 += var10;
			var7 += var6;
			var7 ^= var6 << 8;
			var5 += var7;
			var6 += var4;
			var6 ^= var4 >>> 16;
			var9 += var6;
			var4 += var5;
			var4 ^= var5 << 10;
			var2 += var4;
			var5 += var9;
			var5 ^= var9 >>> 4;
			var8 += var5;
			var9 += var2;
			var9 ^= var2 << 8;
			var10 += var9;
			var2 += var8;
			var2 ^= var8 >>> 9;
			var7 += var2;
			var8 += var10;
			this.anIntArray739[var3] = var8;
			this.anIntArray739[var3 + 1] = var10;
			this.anIntArray739[var3 + 2] = var7;
			this.anIntArray739[var3 + 3] = var6;
			this.anIntArray739[4 + var3] = var4;
			this.anIntArray739[var3 + 5] = var5;
			this.anIntArray739[6 + var3] = var9;
			this.anIntArray739[var3 + 7] = var2;
		}

		for (var3 = 0; var3 < 256; var3 += 8) {
			var8 += this.anIntArray739[var3];
			var10 += this.anIntArray739[1 + var3];
			var7 += this.anIntArray739[var3 + 2];
			var6 += this.anIntArray739[3 + var3];
			var4 += this.anIntArray739[var3 + 4];
			var5 += this.anIntArray739[5 + var3];
			var9 += this.anIntArray739[var3 + 6];
			var2 += this.anIntArray739[7 + var3];
			var8 ^= var10 << 11;
			var6 += var8;
			var10 += var7;
			var10 ^= var7 >>> 2;
			var4 += var10;
			var7 += var6;
			var7 ^= var6 << 8;
			var5 += var7;
			var6 += var4;
			var6 ^= var4 >>> 16;
			var9 += var6;
			var4 += var5;
			var4 ^= var5 << 10;
			var2 += var4;
			var5 += var9;
			var5 ^= var9 >>> 4;
			var8 += var5;
			var9 += var2;
			var9 ^= var2 << 8;
			var10 += var9;
			var2 += var8;
			var2 ^= var8 >>> 9;
			var7 += var2;
			var8 += var10;
			this.anIntArray739[var3] = var8;
			this.anIntArray739[1 + var3] = var10;
			this.anIntArray739[var3 + 2] = var7;
			this.anIntArray739[var3 + 3] = var6;
			this.anIntArray739[4 + var3] = var4;
			this.anIntArray739[5 + var3] = var5;
			this.anIntArray739[6 + var3] = var9;
			this.anIntArray739[7 + var3] = var2;
		}

		this.method726((byte) 31);
		this.anInt743 = 1105035520;
	}

	IsaacRandomGen(int[] var1) {
		for (int var2 = 0; var2 < var1.length; ++var2) {
			this.anIntArray742[var2] = var1[var2];
		}

		this.method727(1135145292);
	}

	public static boolean method734(int var0) {
		long var1 = Timer.getCurrentTimeMillis(849846164);
		int var3 = (int) (var1 - Class78.aLong1225 * -8021066364014913945L);
		Class78.aLong1225 = var1 * 347508540560254295L;
		if (var3 > 200) {
			var3 = 200;
		}

		Class78.anInt1212 += var3 * 1810130545;
		if (0 == Class78.delayableRequestsSubmitted * -374476139 && Class78.priorityRequestsSubmitted * 1577549363 == 0 && 0 == Class78.anInt1221 * 416352625 && 0 == Class78.anInt1216 * 1668849075) {
			return true;
		} else if (null == Class78.connection) {
			return false;
		} else {
			try {
				if (Class78.anInt1212 * -1826448751 > 30000) {
					throw new IOException();
				} else {
					Js5Request js5Request;
					RSByteBuffer buffer;
					while (Class78.priorityRequestsSubmitted * 1577549363 < 20 && Class78.anInt1216 * 1668849075 > 0) {
						js5Request = (Js5Request) Class78.priorityRequestQueue.method1304();
						buffer = new RSByteBuffer(4);
						buffer.writeByte(1);
						buffer.writeTriByte((int) js5Request.key);
						Class78.connection.writeBytes(buffer.buf, 0, 4);
						Class78.urgentJs5Requests.put(js5Request, js5Request.key);
						Class78.anInt1216 += 1906091653;
						Class78.priorityRequestsSubmitted += 2075110651;
					}

					while (Class78.delayableRequestsSubmitted * -374476139 < 20 && Class78.anInt1221 * 416352625 > 0) {
						js5Request = (Js5Request) Class78.delayableRequestQueue.method1295();
						buffer = new RSByteBuffer(4);
						buffer.writeByte(0);
						buffer.writeTriByte((int) js5Request.key);
						Class78.connection.writeBytes(buffer.buf, 0, 4);
						js5Request.method1982();
						Class78.regularJs5Requests.put(js5Request, js5Request.key);
						Class78.anInt1221 -= 831035281;
						Class78.delayableRequestsSubmitted += 1752320189;
					}

					for (int attempt = 0; attempt < 100; ++attempt) {
						int available = Class78.connection.available();
						if (available < 0) {
							throw new IOException();
						}

						if (0 == available) {
							break;
						}

						Class78.anInt1212 = 0;
						byte minNeeded = 0;
						if (null == activeJs5Job) {
							minNeeded = 8;
						} else if (Class78.anInt1223 * 1512529505 == 0) {
							minNeeded = 1;
						}

						int totalread;
						int p;
						int var9;
						if (minNeeded > 0) {
							totalread = minNeeded - js5buffer.position * 798331555;
							if (totalread > available) {
								totalread = available;
							}

							Class78.connection.read(js5buffer.buf, js5buffer.position * 798331555, totalread);
							if (js5EncryptionKey != 0) {
								for (p = 0; p < totalread; p++) {
									js5buffer.buf[p + js5buffer.position * 798331555] ^= js5EncryptionKey;
								}
							}

							js5buffer.position += totalread * 537964811;
							if (js5buffer.position * 798331555 < minNeeded) {
								break;
							}

							if (activeJs5Job == null) {
								js5buffer.position = 0;
								int index = js5buffer.readUByte();
								int container = js5buffer.readUShort(-276867365);
								int compression = js5buffer.readUByte();
								int size = js5buffer.readInt();
								long key = (long) ((index << 16) + container);
								Js5Request request = (Js5Request) Class78.urgentJs5Requests.get(key);
								isUrgentRequest = true;

								if (request == null) {
									request = (Js5Request) Class78.regularJs5Requests.get(key);
									isUrgentRequest = false;
								}

								if (request == null) {
									throw new IOException();
								}

								int sizeSize = compression == 0 ? 5 : 9;
								activeJs5Job = request;
								js5WorkBuffer = new RSByteBuffer(activeJs5Job.aByte2299 + sizeSize + size);
								js5WorkBuffer.writeByte(compression);
								js5WorkBuffer.writeInt(size);
								Class78.anInt1223 = -1511117560;
								js5buffer.position = 0;
							} else if (0 == Class78.anInt1223 * 1512529505) {
								if (js5buffer.buf[0] == -1) {
									Class78.anInt1223 = -725760607;
									js5buffer.position = 0;
								} else {
									activeJs5Job = null;
								}
							}
						} else {
							totalread = js5WorkBuffer.buf.length - activeJs5Job.aByte2299;
							p = 512 - Class78.anInt1223 * 1512529505;
							if (p > totalread - js5WorkBuffer.position * 798331555) {
								p = totalread - js5WorkBuffer.position * 798331555;
							}

							if (p > available) {
								p = available;
							}

							Class78.connection.read(js5WorkBuffer.buf, js5WorkBuffer.position * 798331555, p);
							if (js5EncryptionKey != 0) {
								for (var9 = 0; var9 < p; ++var9) {
									js5WorkBuffer.buf[var9 + js5WorkBuffer.position * 798331555] ^= js5EncryptionKey;
								}
							}

							js5WorkBuffer.position += p * 537964811;
							Class78.anInt1223 += p * -725760607;
							if (totalread == js5WorkBuffer.position * 798331555) {
								if (activeJs5Job.key == 0xff00ffL) { /* Index 255, container 255 */
									Class50.aClass108_Sub14_693 = js5WorkBuffer;

									for (int idx = 0; idx < 256; ++idx) {
										CacheIndex index = Class78.aClass74_Sub1Array1214[idx];
										if (index != null) {
											Class50.aClass108_Sub14_693.position = idx * 8751192 - 1605143241;
											int crc = Class50.aClass108_Sub14_693.readInt();
											int revision = Class50.aClass108_Sub14_693.readInt();
											index.setInformation(crc, revision, 1627815458);
										}
									}
								} else {
									Class78.crc32.reset();
									Class78.crc32.update(js5WorkBuffer.buf, 0, totalread);
									int crc = (int) Class78.crc32.getValue();

									if (activeJs5Job.assumedCRC * 192256567 != crc) {
										try {
											Class78.connection.disconnect();
										} catch (Exception var18) {
											;
										}

										Class78.failedJs5Attempts += 1540718053;
										Class78.connection = null;
										js5EncryptionKey = (byte) ((int) (Math.random() * 255.0D + 1.0D));
										return false;
									}

									Class78.failedJs5Attempts = 0;
									Class78.anInt1230 = 0;
									activeJs5Job.aClass74_Sub1_2300.pushCacheIndexRequest((int) (activeJs5Job.key & 65535L), js5WorkBuffer.buf, (activeJs5Job.key & 16711680L) == 16711680L, isUrgentRequest, 418822511);
								}

								activeJs5Job.unlink();
								if (isUrgentRequest) {
									Class78.priorityRequestsSubmitted -= 2075110651;
								} else {
									Class78.delayableRequestsSubmitted -= 1752320189;
								}

								Class78.anInt1223 = 0;
								activeJs5Job = null;
								js5WorkBuffer = null;
							} else {
								if (Class78.anInt1223 * 1512529505 != 512) {
									break;
								}

								Class78.anInt1223 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var19) {
				var19.printStackTrace();
				try {
					Class78.connection.disconnect();
				} catch (Exception var17) {
					;
				}

				Class78.anInt1230 += 1249054009;
				Class78.connection = null;
				return false;
			}
		}
	}

	final int method736(byte var1) {
		 if (Loader.local)
		   return 0;
		if (0 == (this.anInt743 += 968761983) * 1812226689 + 1) {
			this.method726((byte) 10);
			this.anInt743 = 2073797503;
		}

		return this.anIntArray742[this.anInt743 * 1812226689];
	}
}
