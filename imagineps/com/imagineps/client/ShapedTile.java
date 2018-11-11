/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.imagineps.client;

final class ShapedTile {
    public int color61;
    public int color71;
    public int color81;
    public int color91;
    public int color62;
    public int color72;
    public int color82;
    public int color92;
    public boolean textured;
    final int[] originalVertexX;
    final int[] originalVertexY;
    final int[] originalVertexZ;
    final int[] triangleHSLA;
    final int[] triangleHSLB;
    final int[] triangleHSLC;
    final int[] triangleA;
    final int[] triangleB;
    final int[] triangleC;
    int[] triangleTexture;
    final boolean flat;
    final int shape;
    final int rotation;
    final int colorRGB;
    final int colorARGB;
    public static final int[] depthPoint = new int[6];
    static final int[] anIntArray688 = new int[6];
    static final int[] anIntArray689 = new int[6];
    static final int[] anIntArray690 = new int[6];
    static final int[] anIntArray691 = new int[6];
    static final int[] anIntArray692 = new int[6];
    private static final int[][] shapedTilePointData = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
    private static final int[][] shapedTileElementData = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};

    public ShapedTile(int y, int j, int k, int l, int texture, int j1, int rotation, int l1, int colorRGB, int j2, int k2, int l2, int i3, int shape, int k3, int l3, int i4, int x, int colorARGB, boolean tex) {
        this.color61 = l1;
        this.color71 = i4;
        this.color81 = j2;
        this.color91 = k;
        this.color62 = j;
        this.color72 = l3;
        this.color82 = j1;
        this.color92 = k3;
        this.textured = tex;
        this.flat = i3 == l2 && i3 == l && i3 == k2;
        this.shape = shape;
        this.rotation = rotation;
        this.colorRGB = colorRGB;
        this.colorARGB = colorARGB;
        int c = 128;
        int i5 = c / 2;
        int j5 = c / 4;
        int k5 = c * 3 / 4;
        int[] shapedTileMesh = shapedTilePointData[shape];
        int meshLength = shapedTileMesh.length;
        this.originalVertexX = new int[meshLength];
        this.originalVertexY = new int[meshLength];
        this.originalVertexZ = new int[meshLength];
        int[] tileShadow = new int[meshLength];
        int[] tileHSLShadow = new int[meshLength];
        int i6 = x * c;
        int j6 = y * c;
        for (int k6 = 0; k6 < meshLength; ++k6) {
            int vertexX;
            int vertexY;
            int vertexCOverlay;
            int vertexCUnderlay;
            int vertexZ;
            int vertexType = shapedTileMesh[k6];
            if ((vertexType & 1) == 0 && vertexType <= 8) {
                vertexType = (vertexType - rotation - rotation - 1 & 7) + 1;
            }
            if (vertexType > 8 && vertexType <= 12) {
                vertexType = (vertexType - 9 - rotation & 3) + 9;
            }
            if (vertexType > 12 && vertexType <= 16) {
                vertexType = (vertexType - 13 - rotation & 3) + 13;
            }
            if (vertexType == 1) {
                vertexX = i6;
                vertexZ = j6;
                vertexY = i3;
                vertexCOverlay = l1;
                vertexCUnderlay = j;
            } else if (vertexType == 2) {
                vertexX = i6 + i5;
                vertexZ = j6;
                vertexY = i3 + l2 >> 1;
                vertexCOverlay = l1 + i4 >> 1;
                vertexCUnderlay = j + l3 >> 1;
            } else if (vertexType == 3) {
                vertexX = i6 + c;
                vertexZ = j6;
                vertexY = l2;
                vertexCOverlay = i4;
                vertexCUnderlay = l3;
            } else if (vertexType == 4) {
                vertexX = i6 + c;
                vertexZ = j6 + i5;
                vertexY = l2 + l >> 1;
                vertexCOverlay = i4 + j2 >> 1;
                vertexCUnderlay = l3 + j1 >> 1;
            } else if (vertexType == 5) {
                vertexX = i6 + c;
                vertexZ = j6 + c;
                vertexY = l;
                vertexCOverlay = j2;
                vertexCUnderlay = j1;
            } else if (vertexType == 6) {
                vertexX = i6 + i5;
                vertexZ = j6 + c;
                vertexY = l + k2 >> 1;
                vertexCOverlay = j2 + k >> 1;
                vertexCUnderlay = j1 + k3 >> 1;
            } else if (vertexType == 7) {
                vertexX = i6;
                vertexZ = j6 + c;
                vertexY = k2;
                vertexCOverlay = k;
                vertexCUnderlay = k3;
            } else if (vertexType == 8) {
                vertexX = i6;
                vertexZ = j6 + i5;
                vertexY = k2 + i3 >> 1;
                vertexCOverlay = k + l1 >> 1;
                vertexCUnderlay = k3 + j >> 1;
            } else if (vertexType == 9) {
                vertexX = i6 + i5;
                vertexZ = j6 + j5;
                vertexY = i3 + l2 >> 1;
                vertexCOverlay = l1 + i4 >> 1;
                vertexCUnderlay = j + l3 >> 1;
            } else if (vertexType == 10) {
                vertexX = i6 + k5;
                vertexZ = j6 + i5;
                vertexY = l2 + l >> 1;
                vertexCOverlay = i4 + j2 >> 1;
                vertexCUnderlay = l3 + j1 >> 1;
            } else if (vertexType == 11) {
                vertexX = i6 + i5;
                vertexZ = j6 + k5;
                vertexY = l + k2 >> 1;
                vertexCOverlay = j2 + k >> 1;
                vertexCUnderlay = j1 + k3 >> 1;
            } else if (vertexType == 12) {
                vertexX = i6 + j5;
                vertexZ = j6 + i5;
                vertexY = k2 + i3 >> 1;
                vertexCOverlay = k + l1 >> 1;
                vertexCUnderlay = k3 + j >> 1;
            } else if (vertexType == 13) {
                vertexX = i6 + j5;
                vertexZ = j6 + j5;
                vertexY = i3;
                vertexCOverlay = l1;
                vertexCUnderlay = j;
            } else if (vertexType == 14) {
                vertexX = i6 + k5;
                vertexZ = j6 + j5;
                vertexY = l2;
                vertexCOverlay = i4;
                vertexCUnderlay = l3;
            } else if (vertexType == 15) {
                vertexX = i6 + k5;
                vertexZ = j6 + k5;
                vertexY = l;
                vertexCOverlay = j2;
                vertexCUnderlay = j1;
            } else {
                vertexX = i6 + j5;
                vertexZ = j6 + k5;
                vertexY = k2;
                vertexCOverlay = k;
                vertexCUnderlay = k3;
            }
            this.originalVertexX[k6] = vertexX;
            this.originalVertexY[k6] = vertexY;
            this.originalVertexZ[k6] = vertexZ;
            tileShadow[k6] = vertexCOverlay;
            tileHSLShadow[k6] = vertexCUnderlay;
        }
        int[] shapedTileElements = shapedTileElementData[shape];
        int vertexCount = shapedTileElements.length / 4;
        this.triangleA = new int[vertexCount];
        this.triangleB = new int[vertexCount];
        this.triangleC = new int[vertexCount];
        this.triangleHSLA = new int[vertexCount];
        this.triangleHSLB = new int[vertexCount];
        this.triangleHSLC = new int[vertexCount];
        if (texture != -1) {
            this.triangleTexture = new int[vertexCount];
        }
        this.textured = true;
        int offset = 0;
        for (int j8 = 0; j8 < vertexCount; ++j8) {
            int l8 = shapedTileElements[offset];
            int idxA = shapedTileElements[offset + 1];
            int idxB = shapedTileElements[offset + 2];
            int idxC = shapedTileElements[offset + 3];
            offset += 4;
            if (idxA < 4) {
                idxA = idxA - rotation & 3;
            }
            if (idxB < 4) {
                idxB = idxB - rotation & 3;
            }
            if (idxC < 4) {
                idxC = idxC - rotation & 3;
            }
            this.triangleA[j8] = idxA;
            this.triangleB[j8] = idxB;
            this.triangleC[j8] = idxC;
            if (l8 == 0) {
                this.triangleHSLA[j8] = tileShadow[idxA];
                this.triangleHSLB[j8] = tileShadow[idxB];
                this.triangleHSLC[j8] = tileShadow[idxC];
                if (this.triangleTexture == null) continue;
                this.triangleTexture[j8] = -1;
                continue;
            }
            this.triangleHSLA[j8] = tileHSLShadow[idxA];
            this.triangleHSLB[j8] = tileHSLShadow[idxB];
            this.triangleHSLC[j8] = tileHSLShadow[idxC];
            if (this.triangleTexture == null) continue;
            this.triangleTexture[j8] = texture;
        }
        int i9 = i3;
        int l9 = l2;
        if (l2 < i9) {
            i9 = l2;
        }
        if (l2 > l9) {
            l9 = l2;
        }
        if (l < i9) {
            i9 = l;
        }
        if (l > l9) {
            l9 = l;
        }
        if (k2 < i9) {
            i9 = k2;
        }
        if (k2 > l9) {
            l9 = k2;
        }
        i9 /= 14;
        l9 /= 14;
    }
}

