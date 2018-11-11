/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.imagineps.client;

final class CollisionMap {
    private final int offsetX = 0;
    private final int offsetY = 0;
    private final int sizeX = 104;
    private final int sizeY = 104;
    final int[][] clipData = new int[104][104];

    CollisionMap() {
        this.build();
    }

    void build() {
        int x = 0;
        while (x < 104) {
            for (int y = 0; y < 104; ++y) {
                this.clipData[x][y] = x == 0 || y == 0 || x == 103 || y == 103 ? 16777215 : 16777216;
            }
            ++x;
        }
    }

    void method211(int y, int direction, int x, int type, boolean flag) {
        x += 0;
        y += 0;
        if (type == 0) {
            if (direction == 0) {
                this.clipTable(x, y, 128);
                this.clipTable(x - 1, y, 8);
            }
            if (direction == 1) {
                this.clipTable(x, y, 2);
                this.clipTable(x, y + 1, 32);
            }
            if (direction == 2) {
                this.clipTable(x, y, 8);
                this.clipTable(x + 1, y, 128);
            }
            if (direction == 3) {
                this.clipTable(x, y, 32);
                this.clipTable(x, y - 1, 2);
            }
        }
        if (type == 1 || type == 3) {
            if (direction == 0) {
                this.clipTable(x, y, 1);
                this.clipTable(x - 1, y + 1, 16);
            }
            if (direction == 1) {
                this.clipTable(x, y, 4);
                this.clipTable(x + 1, y + 1, 64);
            }
            if (direction == 2) {
                this.clipTable(x, y, 16);
                this.clipTable(x + 1, y - 1, 1);
            }
            if (direction == 3) {
                this.clipTable(x, y, 64);
                this.clipTable(x - 1, y - 1, 4);
            }
        }
        if (type == 2) {
            if (direction == 0) {
                this.clipTable(x, y, 130);
                this.clipTable(x - 1, y, 8);
                this.clipTable(x, y + 1, 32);
            }
            if (direction == 1) {
                this.clipTable(x, y, 10);
                this.clipTable(x, y + 1, 32);
                this.clipTable(x + 1, y, 128);
            }
            if (direction == 2) {
                this.clipTable(x, y, 40);
                this.clipTable(x + 1, y, 128);
                this.clipTable(x, y - 1, 2);
            }
            if (direction == 3) {
                this.clipTable(x, y, 160);
                this.clipTable(x, y - 1, 2);
                this.clipTable(x - 1, y, 8);
            }
        }
        if (!flag) return;
        if (type == 0) {
            if (direction == 0) {
                this.clipTable(x, y, 65536);
                this.clipTable(x - 1, y, 4096);
            }
            if (direction == 1) {
                this.clipTable(x, y, 1024);
                this.clipTable(x, y + 1, 16384);
            }
            if (direction == 2) {
                this.clipTable(x, y, 4096);
                this.clipTable(x + 1, y, 65536);
            }
            if (direction == 3) {
                this.clipTable(x, y, 16384);
                this.clipTable(x, y - 1, 1024);
            }
        }
        if (type == 1 || type == 3) {
            if (direction == 0) {
                this.clipTable(x, y, 512);
                this.clipTable(x - 1, y + 1, 8192);
            }
            if (direction == 1) {
                this.clipTable(x, y, 2048);
                this.clipTable(x + 1, y + 1, 32768);
            }
            if (direction == 2) {
                this.clipTable(x, y, 8192);
                this.clipTable(x + 1, y - 1, 512);
            }
            if (direction == 3) {
                this.clipTable(x, y, 32768);
                this.clipTable(x - 1, y - 1, 2048);
            }
        }
        if (type != 2) return;
        if (direction == 0) {
            this.clipTable(x, y, 66560);
            this.clipTable(x - 1, y, 4096);
            this.clipTable(x, y + 1, 16384);
        }
        if (direction == 1) {
            this.clipTable(x, y, 5120);
            this.clipTable(x, y + 1, 16384);
            this.clipTable(x + 1, y, 65536);
        }
        if (direction == 2) {
            this.clipTable(x, y, 20480);
            this.clipTable(x + 1, y, 65536);
            this.clipTable(x, y - 1, 1024);
        }
        if (direction != 3) return;
        this.clipTable(x, y, 81920);
        this.clipTable(x, y - 1, 1024);
        this.clipTable(x - 1, y, 4096);
    }

    void method212(boolean flag, int tileSizeX, int tileSizeY, int x, int y, int direction) {
        int k1 = 256;
        if (flag) {
            k1 += 131072;
        }
        x += 0;
        y += 0;
        if (direction == 1 || direction == 3) {
            int l1 = tileSizeX;
            tileSizeX = tileSizeY;
            tileSizeY = l1;
        }
        int i2 = x;
        while (i2 < x + tileSizeX) {
            if (i2 >= 0 && i2 < 104) {
                for (int j2 = y; j2 < y + tileSizeY; ++j2) {
                    if (j2 < 0 || j2 >= 104) continue;
                    this.clipTable(i2, j2, k1);
                }
            }
            ++i2;
        }
    }

    void clipTableSet(int y, int x) {
        int[] arrn = this.clipData[x += 0];
        int n = y += 0;
        arrn[n] = arrn[n] | 2097152;
    }

    private void clipTable(int x, int y, int k) {
        int[] arrn = this.clipData[x];
        int n = y;
        arrn[n] = arrn[n] | k;
    }

    void method215(int i, int j, boolean flag, int k, int l) {
        k += 0;
        l += 0;
        if (j == 0) {
            if (i == 0) {
                this.method217(128, k, l);
                this.method217(8, k - 1, l);
            }
            if (i == 1) {
                this.method217(2, k, l);
                this.method217(32, k, l + 1);
            }
            if (i == 2) {
                this.method217(8, k, l);
                this.method217(128, k + 1, l);
            }
            if (i == 3) {
                this.method217(32, k, l);
                this.method217(2, k, l - 1);
            }
        }
        if (j == 1 || j == 3) {
            if (i == 0) {
                this.method217(1, k, l);
                this.method217(16, k - 1, l + 1);
            }
            if (i == 1) {
                this.method217(4, k, l);
                this.method217(64, k + 1, l + 1);
            }
            if (i == 2) {
                this.method217(16, k, l);
                this.method217(1, k + 1, l - 1);
            }
            if (i == 3) {
                this.method217(64, k, l);
                this.method217(4, k - 1, l - 1);
            }
        }
        if (j == 2) {
            if (i == 0) {
                this.method217(130, k, l);
                this.method217(8, k - 1, l);
                this.method217(32, k, l + 1);
            }
            if (i == 1) {
                this.method217(10, k, l);
                this.method217(32, k, l + 1);
                this.method217(128, k + 1, l);
            }
            if (i == 2) {
                this.method217(40, k, l);
                this.method217(128, k + 1, l);
                this.method217(2, k, l - 1);
            }
            if (i == 3) {
                this.method217(160, k, l);
                this.method217(2, k, l - 1);
                this.method217(8, k - 1, l);
            }
        }
        if (!flag) return;
        if (j == 0) {
            if (i == 0) {
                this.method217(65536, k, l);
                this.method217(4096, k - 1, l);
            }
            if (i == 1) {
                this.method217(1024, k, l);
                this.method217(16384, k, l + 1);
            }
            if (i == 2) {
                this.method217(4096, k, l);
                this.method217(65536, k + 1, l);
            }
            if (i == 3) {
                this.method217(16384, k, l);
                this.method217(1024, k, l - 1);
            }
        }
        if (j == 1 || j == 3) {
            if (i == 0) {
                this.method217(512, k, l);
                this.method217(8192, k - 1, l + 1);
            }
            if (i == 1) {
                this.method217(2048, k, l);
                this.method217(32768, k + 1, l + 1);
            }
            if (i == 2) {
                this.method217(8192, k, l);
                this.method217(512, k + 1, l - 1);
            }
            if (i == 3) {
                this.method217(32768, k, l);
                this.method217(2048, k - 1, l - 1);
            }
        }
        if (j != 2) return;
        if (i == 0) {
            this.method217(66560, k, l);
            this.method217(4096, k - 1, l);
            this.method217(16384, k, l + 1);
        }
        if (i == 1) {
            this.method217(5120, k, l);
            this.method217(16384, k, l + 1);
            this.method217(65536, k + 1, l);
        }
        if (i == 2) {
            this.method217(20480, k, l);
            this.method217(65536, k + 1, l);
            this.method217(1024, k, l - 1);
        }
        if (i != 3) return;
        this.method217(81920, k, l);
        this.method217(1024, k, l - 1);
        this.method217(4096, k - 1, l);
    }

    void method216(int i, int j, int k, int l, int i1, boolean flag) {
        int j1 = 256;
        if (flag) {
            j1 += 131072;
        }
        k += 0;
        l += 0;
        if (i == 1 || i == 3) {
            int k1 = j;
            j = i1;
            i1 = k1;
        }
        int l1 = k;
        while (l1 < k + j) {
            if (l1 >= 0 && l1 < 104) {
                for (int i2 = l; i2 < l + i1; ++i2) {
                    if (i2 < 0 || i2 >= 104) continue;
                    this.method217(j1, l1, i2);
                }
            }
            ++l1;
        }
    }

    private void method217(int i, int j, int k) {
        int[] arrn = this.clipData[j];
        int n = k;
        arrn[n] = arrn[n] & 16777215 - i;
    }

    void method218(int y, int x) {
        int[] arrn = this.clipData[x += 0];
        int n = y += 0;
        arrn[n] = arrn[n] & 14680063;
    }

    boolean reachedWall(int i, int j, int k, int direction, int type, int k1) {
        if (j == i && k == k1) {
            return true;
        }
        j += 0;
        k += 0;
        i += 0;
        k1 += 0;
        if (type == 0) {
            if (direction == 0) {
                if (j == i - 1 && k == k1) {
                    return true;
                }
                if (j == i && k == k1 + 1 && (this.clipData[j][k] & 19398944) == 0) {
                    return true;
                }
                if (j == i && k == k1 - 1 && (this.clipData[j][k] & 19398914) == 0) {
                    return true;
                }
            } else if (direction == 1) {
                if (j == i && k == k1 + 1) {
                    return true;
                }
                if (j == i - 1 && k == k1 && (this.clipData[j][k] & 19398920) == 0) {
                    return true;
                }
                if (j == i + 1 && k == k1 && (this.clipData[j][k] & 19399040) == 0) {
                    return true;
                }
            } else if (direction == 2) {
                if (j == i + 1 && k == k1) {
                    return true;
                }
                if (j == i && k == k1 + 1 && (this.clipData[j][k] & 19398944) == 0) {
                    return true;
                }
                if (j == i && k == k1 - 1 && (this.clipData[j][k] & 19398914) == 0) {
                    return true;
                }
            } else if (direction == 3) {
                if (j == i && k == k1 - 1) {
                    return true;
                }
                if (j == i - 1 && k == k1 && (this.clipData[j][k] & 19398920) == 0) {
                    return true;
                }
                if (j == i + 1 && k == k1 && (this.clipData[j][k] & 19399040) == 0) {
                    return true;
                }
            }
        }
        if (type == 2) {
            if (direction == 0) {
                if (j == i - 1 && k == k1) {
                    return true;
                }
                if (j == i && k == k1 + 1) {
                    return true;
                }
                if (j == i + 1 && k == k1 && (this.clipData[j][k] & 19399040) == 0) {
                    return true;
                }
                if (j == i && k == k1 - 1 && (this.clipData[j][k] & 19398914) == 0) {
                    return true;
                }
            } else if (direction == 1) {
                if (j == i - 1 && k == k1 && (this.clipData[j][k] & 19398920) == 0) {
                    return true;
                }
                if (j == i && k == k1 + 1) {
                    return true;
                }
                if (j == i + 1 && k == k1) {
                    return true;
                }
                if (j == i && k == k1 - 1 && (this.clipData[j][k] & 19398914) == 0) {
                    return true;
                }
            } else if (direction == 2) {
                if (j == i - 1 && k == k1 && (this.clipData[j][k] & 19398920) == 0) {
                    return true;
                }
                if (j == i && k == k1 + 1 && (this.clipData[j][k] & 19398944) == 0) {
                    return true;
                }
                if (j == i + 1 && k == k1) {
                    return true;
                }
                if (j == i && k == k1 - 1) {
                    return true;
                }
            } else if (direction == 3) {
                if (j == i - 1 && k == k1) {
                    return true;
                }
                if (j == i && k == k1 + 1 && (this.clipData[j][k] & 19398944) == 0) {
                    return true;
                }
                if (j == i + 1 && k == k1 && (this.clipData[j][k] & 19399040) == 0) {
                    return true;
                }
                if (j == i && k == k1 - 1) {
                    return true;
                }
            }
        }
        if (type != 9) return false;
        if (j == i && k == k1 + 1 && (this.clipData[j][k] & 32) == 0) {
            return true;
        }
        if (j == i && k == k1 - 1 && (this.clipData[j][k] & 2) == 0) {
            return true;
        }
        if (j == i - 1 && k == k1 && (this.clipData[j][k] & 8) == 0) {
            return true;
        }
        if (j != i + 1) return false;
        if (k != k1) return false;
        if ((this.clipData[j][k] & 128) != 0) return false;
        return true;
    }

    boolean reachedDecoration(int i, int j, int k, int l, int i1, int j1) {
        if (j1 == i && k == j) {
            return true;
        }
        j1 += 0;
        k += 0;
        i += 0;
        j += 0;
        if (l == 6 || l == 7) {
            if (l == 7) {
                i1 = i1 + 2 & 3;
            }
            if (i1 == 0) {
                if (j1 == i + 1 && k == j && (this.clipData[j1][k] & 128) == 0) {
                    return true;
                }
                if (j1 == i && k == j - 1 && (this.clipData[j1][k] & 2) == 0) {
                    return true;
                }
            } else if (i1 == 1) {
                if (j1 == i - 1 && k == j && (this.clipData[j1][k] & 8) == 0) {
                    return true;
                }
                if (j1 == i && k == j - 1 && (this.clipData[j1][k] & 2) == 0) {
                    return true;
                }
            } else if (i1 == 2) {
                if (j1 == i - 1 && k == j && (this.clipData[j1][k] & 8) == 0) {
                    return true;
                }
                if (j1 == i && k == j + 1 && (this.clipData[j1][k] & 32) == 0) {
                    return true;
                }
            } else if (i1 == 3) {
                if (j1 == i + 1 && k == j && (this.clipData[j1][k] & 128) == 0) {
                    return true;
                }
                if (j1 == i && k == j + 1 && (this.clipData[j1][k] & 32) == 0) {
                    return true;
                }
            }
        }
        if (l != 8) return false;
        if (j1 == i && k == j + 1 && (this.clipData[j1][k] & 32) == 0) {
            return true;
        }
        if (j1 == i && k == j - 1 && (this.clipData[j1][k] & 2) == 0) {
            return true;
        }
        if (j1 == i - 1 && k == j && (this.clipData[j1][k] & 8) == 0) {
            return true;
        }
        if (j1 != i + 1) return false;
        if (k != j) return false;
        if ((this.clipData[j1][k] & 128) != 0) return false;
        return true;
    }

    boolean reachedFacingObject(int i, int j, int k, int l, int i1, int j1, int k1) {
        int l1 = j + j1 - 1;
        int i2 = i + l - 1;
        if (k >= j && k <= l1 && k1 >= i && k1 <= i2) {
            return true;
        }
        if (k == j - 1 && k1 >= i && k1 <= i2 && (this.clipData[k - 0][k1 - 0] & 8) == 0 && (i1 & 8) == 0) {
            return true;
        }
        if (k == l1 + 1 && k1 >= i && k1 <= i2 && (this.clipData[k - 0][k1 - 0] & 128) == 0 && (i1 & 2) == 0) {
            return true;
        }
        if (k1 == i - 1 && k >= j && k <= l1 && (this.clipData[k - 0][k1 - 0] & 2) == 0) {
            if ((i1 & 4) == 0) return true;
        }
        if (k1 != i2 + 1) return false;
        if (k < j) return false;
        if (k > l1) return false;
        if ((this.clipData[k - 0][k1 - 0] & 32) != 0) return false;
        if ((i1 & 1) != 0) return false;
        return true;
    }
}

