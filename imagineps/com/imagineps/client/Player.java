/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.MRUNodes;
import com.imagineps.client.Mobile;
import com.imagineps.client.Model;
import com.imagineps.client.NodeSub;
import com.imagineps.client.PlayerSettings;
import com.imagineps.client.Stream;
import com.imagineps.client.TextClass;
import com.imagineps.client.definition.AnimationDefinition;
import com.imagineps.client.definition.FrameReader;
import com.imagineps.client.definition.IDK;
import com.imagineps.client.definition.ItemDefinition;
import com.imagineps.client.definition.NPCDefinition;
import com.imagineps.client.definition.RevisionType;
import com.imagineps.client.definition.SpotAnim;

public final class Player
extends Mobile {
    public static int offsetX = 5;
    public static int offsetY = -10;
    public static int offsetZ = 5;
    public boolean[] loaded = new boolean[50000];
    public int[] privelage;
    public int playerWidth = 128;
    public int scalePlayerY = 128;
    public int scalePlayerHeight = 128;
    private long playerIdentifierEmoting = -1L;
    public NPCDefinition desc;
    boolean aBoolean1699 = false;
    public final int[] lookColors = new int[5];
    public int team;
    public int gender;
    public String name;
    static MRUNodes characterCache = new MRUNodes(260);
    public int combatLevel;
    public int headIcon;
    public int skullIcon;
    public int hintIcon;
    public int anInt1707;
    int anInt1708;
    int anInt1709;
    boolean visible = false;
    int anInt1711;
    int anInt1712;
    int anInt1713;
    Model aModel_1714;
    public final int[] equipment = new int[12];
    private long playerIdentifier;
    int anInt1719;
    int anInt1720;
    int anInt1721;
    int anInt1722;
    int skill;
    private String contextColor;
    private String rank;
    private String titleColor;

    @Override
    public Model getModel() {
        Model spotAnimModel;
        SpotAnim spotAnim;
        if (!this.visible) {
            return null;
        }
        Model model = this.method452();
        if (model == null) {
            return null;
        }
        this.height = model.modelHeight;
        model.aBoolean1659 = true;
        if (this.aBoolean1699) {
            return model;
        }
        if (this.graphic != -1 && this.currentAnimation != -1 && (spotAnimModel = (spotAnim = SpotAnim.forId(this.graphic)).getModel()) != null) {
            Model model_3 = new Model(true, FrameReader.method532(this.currentAnimation), false, spotAnimModel);
            model_3.method475(0, - this.anInt1524, 0);
            model_3.method469();
            model_3.method470(spotAnim.aAnimation_407.frame[this.currentAnimation], spotAnim.aAnimation_407.revisionType);
            model_3.anIntArrayArray1658 = null;
            model_3.anIntArrayArray1657 = null;
            if (spotAnim.anInt410 != 128 || spotAnim.anInt411 != 128) {
                model_3.method478(spotAnim.anInt410, spotAnim.anInt410, spotAnim.anInt411);
            }
            model_3.light(64 + spotAnim.anInt413, 850 + spotAnim.anInt414, -30, -50, -30, true);
            Model[] aclass30_sub2_sub4_sub6_1s = new Model[]{model, model_3};
            model = new Model(aclass30_sub2_sub4_sub6_1s);
        }
        if (this.aModel_1714 != null) {
            Client.getSingleton();
            if (Client.loopCycle >= this.anInt1708) {
                this.aModel_1714 = null;
            }
            Client.getSingleton();
            if (Client.loopCycle >= this.anInt1707) {
                Client.getSingleton();
                if (Client.loopCycle < this.anInt1708) {
                    Model model_1 = this.aModel_1714;
                    model_1.method475(this.anInt1711 - this.x, this.anInt1712 - this.anInt1709, this.anInt1713 - this.y);
                    if (this.turnDirection == 512) {
                        model_1.method473();
                        model_1.method473();
                        model_1.method473();
                    } else if (this.turnDirection == 1024) {
                        model_1.method473();
                        model_1.method473();
                    } else if (this.turnDirection == 1536) {
                        model_1.method473();
                    }
                    Model[] aclass30_sub2_sub4_sub6s = new Model[]{model, model_1};
                    model = new Model(aclass30_sub2_sub4_sub6s);
                    if (this.turnDirection == 512) {
                        model_1.method473();
                    } else if (this.turnDirection == 1024) {
                        model_1.method473();
                        model_1.method473();
                    } else if (this.turnDirection == 1536) {
                        model_1.method473();
                        model_1.method473();
                        model_1.method473();
                    }
                    model_1.method475(this.x - this.anInt1711, this.anInt1709 - this.anInt1712, this.y - this.anInt1713);
                }
            }
        }
        model.aBoolean1659 = true;
        return model;
    }

    public void updatePlayer(Stream stream) {
        stream.currentOffset = 0;
        this.gender = stream.readUnsignedByte();
        this.headIcon = stream.readUnsignedByte();
        this.skullIcon = stream.readUnsignedByte();
        this.desc = null;
        this.team = 0;
        for (int j = 0; j < 12; ++j) {
            int k = stream.readUnsignedByte();
            if (k == 0) {
                this.equipment[j] = 0;
                continue;
            }
            int i1 = stream.readUnsignedByte();
            this.equipment[j] = (k << 8) + i1;
            if (j == 0 && this.equipment[0] == 65535) {
                this.desc = NPCDefinition.forID(stream.readUnsignedWord());
                break;
            }
            if (this.equipment[j] >= 512 && this.equipment[j] - 512 < ItemDefinition.totalItems) continue;
        }
        for (int l = 0; l < 5; ++l) {
            int j1 = stream.readUnsignedByte();
            if (j1 < 0 || j1 >= Client.equipmentColors[l].length) {
                j1 = 0;
            }
            this.lookColors[l] = j1;
        }
        this.standAnim = stream.readUnsignedWord();
        if (this.standAnim == 65535) {
            this.standAnim = -1;
        }
        this.standTurnAnim = stream.readUnsignedWord();
        if (this.standTurnAnim == 65535) {
            this.standTurnAnim = -1;
        }
        this.walkAnim = stream.readUnsignedWord();
        if (this.walkAnim == 65535) {
            this.walkAnim = -1;
        }
        this.turn160DefAnim = stream.readUnsignedWord();
        if (this.turn160DefAnim == 65535) {
            this.turn160DefAnim = -1;
        }
        this.turn90CWAnim = stream.readUnsignedWord();
        if (this.turn90CWAnim == 65535) {
            this.turn90CWAnim = -1;
        }
        this.turn90CCAnim = stream.readUnsignedWord();
        if (this.turn90CCAnim == 65535) {
            this.turn90CCAnim = -1;
        }
        this.runAnim = stream.readUnsignedWord();
        if (this.runAnim == 65535) {
            this.runAnim = -1;
        }
        this.name = TextClass.fixName(TextClass.nameForLong(stream.readQWord()));
        this.combatLevel = stream.readUnsignedByte();
        this.rank = stream.readString();
        this.contextColor = stream.readString();
        this.titleColor = stream.readString();
        this.visible = true;
        this.playerIdentifier = 0L;
        if (this.desc != null) {
            this.combatLevel = this.desc.combatLevel;
            this.standAnim = this.desc.standAnim;
            this.standTurnAnim = this.desc.standAnim;
            this.walkAnim = this.desc.walkAnim;
            this.turn160DefAnim = this.desc.standAnim;
            this.turn90CWAnim = this.desc.walkAnim;
            this.turn90CCAnim = this.desc.walkAnim;
            this.runAnim = this.desc.walkAnim;
        }
        for (int k1 = 0; k1 < 12; ++k1) {
            this.playerIdentifier <<= 4;
            if (this.equipment[k1] < 256) continue;
            this.playerIdentifier += (long)(this.equipment[k1] - 256);
        }
        if (this.equipment[0] >= 256) {
            this.playerIdentifier += (long)(this.equipment[0] - 256 >> 4);
        }
        if (this.equipment[1] >= 256) {
            this.playerIdentifier += (long)(this.equipment[1] - 256 >> 8);
        }
        int i2 = 0;
        do {
            if (i2 >= 5) {
                this.playerIdentifier <<= 1;
                this.playerIdentifier += (long)this.gender;
                return;
            }
            this.playerIdentifier <<= 3;
            this.playerIdentifier += (long)this.lookColors[i2];
            ++i2;
        } while (true);
    }

    public Model method452() {
        long identifier = this.playerIdentifier;
        int i1 = -1;
        int j1 = -1;
        int k1 = -1;
        int currAnim = -1;
        int nextAnim = -1;
        int currCycle = -1;
        int nextCycle = -1;
        if (this.desc != null) {
            AnimationDefinition seq;
            if (this.forcedAnimation >= 0 && this.animationDelay == 0) {
                seq = null;
                seq = this.forcedAnimation > 20000 ? AnimationDefinition.osrsAnims[this.forcedAnimation - 20000] : AnimationDefinition.anims[this.forcedAnimation];
                currAnim = seq.frame[this.displayedEmoteFrames];
                if (!Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) return this.desc.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
                if (this.nextAnimFrame == -1) return this.desc.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
                nextAnim = seq.frame[this.displayedEmoteFrames];
                currCycle = seq.delay[this.displayedEmoteFrames];
                nextCycle = this.emoteTimeRemaining;
                return this.desc.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
            } else {
                if (this.anInt1517 < 0) return this.desc.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
                seq = null;
                seq = this.anInt1517 > 20000 ? AnimationDefinition.osrsAnims[this.anInt1517 - 20000] : AnimationDefinition.anims[this.anInt1517];
                currAnim = seq.frame[this.anInt1518];
                if (!Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) return this.desc.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
                if (this.nextIdleFrame == -1) return this.desc.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
                nextAnim = seq.frame[this.nextIdleFrame];
                currCycle = seq.delay[this.anInt1518];
                nextCycle = this.anInt1519;
            }
            return this.desc.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
        }
        RevisionType revision = RevisionType.DEFAULT;
        if (this.forcedAnimation >= 0 && this.animationDelay == 0) {
            AnimationDefinition animation = null;
            if (this.forcedAnimation > 20000) {
                revision = RevisionType.OSRS;
                animation = AnimationDefinition.osrsAnims[this.forcedAnimation - 20000];
            } else {
                animation = AnimationDefinition.anims[this.forcedAnimation];
            }
            currAnim = animation.frame[this.displayedEmoteFrames];
            if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING) && this.nextAnimFrame != -1) {
                nextAnim = animation.frame[this.nextAnimFrame];
                currCycle = animation.delay[this.displayedEmoteFrames];
                nextCycle = this.emoteTimeRemaining;
            }
            if (this.anInt1517 >= 0 && this.anInt1517 != this.standAnim) {
                i1 = AnimationDefinition.anims[this.anInt1517].frame[this.anInt1518];
            }
            if (animation.leftHandEquip >= 0) {
                j1 = animation.leftHandEquip;
                identifier += (long)(j1 - this.equipment[5] << 40);
            }
            if (animation.rightHandEquip >= 0) {
                k1 = animation.rightHandEquip;
                identifier += (long)(k1 - this.equipment[3] << 48);
            }
        } else if (this.anInt1517 >= 0) {
            AnimationDefinition seq = null;
            if (this.anInt1517 > 20000) {
                revision = RevisionType.OSRS;
                seq = AnimationDefinition.osrsAnims[this.anInt1517 - 20000];
            } else {
                seq = AnimationDefinition.anims[this.anInt1517];
            }
            currAnim = seq.frame[this.anInt1518];
            if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING) && this.nextIdleFrame != -1) {
                nextAnim = seq.frame[this.nextIdleFrame];
                currCycle = seq.delay[this.anInt1518];
                nextCycle = this.anInt1519;
            }
        }
        Model charModel = (Model)characterCache.insertFromCache(identifier);
        if (charModel == null) {
            boolean modelLoading = false;
            for (int i2 = 0; i2 < 12; ++i2) {
                int equipment = this.equipment[i2];
                if (k1 >= 0 && i2 == 3) {
                    equipment = k1;
                }
                if (j1 >= 0 && i2 == 5) {
                    equipment = j1;
                }
                if (equipment >= 256 && equipment < 512 && !IDK.cache[equipment - 256].method537()) {
                    modelLoading = true;
                }
                if (equipment < 512 || ItemDefinition.forID(equipment - 512).modelsLoaded(this.gender)) continue;
                modelLoading = true;
            }
        }
        if (charModel == null) {
            Model[] models = new Model[12];
            int j2 = 0;
            for (int l2 = 0; l2 < 12; ++l2) {
                Model model_3;
                int i3 = this.equipment[l2];
                if (k1 >= 0 && l2 == 3) {
                    i3 = k1;
                }
                if (j1 >= 0 && l2 == 5) {
                    i3 = j1;
                }
                if (i3 >= 256 && i3 < 512 && (model_3 = IDK.cache[i3 - 256].method538()) != null) {
                    models[j2++] = model_3;
                }
                if (i3 < 512) continue;
                Model model_4 = ItemDefinition.forID(i3 - 512).method196(this.gender);
                if (this.gender == 1 && l2 == 3) {
                    model_4.method475(offsetX, offsetY, offsetZ);
                }
                if (model_4 == null) continue;
                models[j2++] = model_4;
            }
            charModel = new Model(j2, models);
            for (int j3 = 0; j3 < 5; ++j3) {
                if (this.lookColors[j3] == 0) continue;
                charModel.reColor(Client.equipmentColors[j3][0], Client.equipmentColors[j3][this.lookColors[j3]]);
                if (j3 == 1) {
                    charModel.reColor(Client.anIntArray1204[0], Client.anIntArray1204[this.lookColors[j3]]);
                }
                if (j3 != 4) continue;
                charModel.reColor(Client.skinColor2[0], Client.skinColor2[this.lookColors[j3]]);
            }
            charModel.method469();
            charModel.light(84, 1000, -90, -580, -90, true);
            if (this.playerWidth != 128 || this.scalePlayerY != 128 || this.scalePlayerHeight != 128) {
                charModel.method478(this.playerWidth, this.scalePlayerY, this.scalePlayerHeight);
            }
            characterCache.removeFromCache(charModel, identifier);
            this.playerIdentifierEmoting = identifier;
        }
        if (this.aBoolean1699) {
            return charModel;
        }
        Model model_2 = Model.EMPTY_MODEL;
        model_2.method464(charModel, FrameReader.method532(currAnim) & FrameReader.method532(i1));
        if (currAnim != -1 && i1 != -1) {
            model_2.method471(AnimationDefinition.anims[this.standAnim].anIntArray357, i1, currAnim, revision);
        } else if (currAnim != -1) {
            if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) {
                model_2.interpolateFrames(currAnim, nextAnim, nextCycle, currCycle);
            } else {
                model_2.method470(currAnim);
            }
        }
        model_2.method466();
        model_2.anIntArrayArray1658 = null;
        model_2.anIntArrayArray1657 = null;
        return model_2;
    }

    @Override
    public boolean isVisible() {
        return this.visible;
    }

    public Model getChatHeadModel() {
        if (!this.visible) {
            return null;
        }
        if (this.desc != null) {
            return this.desc.getChatHeadModel();
        }
        boolean notYetLoaded = false;
        for (int i = 0; i < 12; ++i) {
            int item = this.equipment[i];
            if (item >= 256 && item < 512 && !IDK.cache[item - 256].method539()) {
                notYetLoaded = true;
            }
            if (item < 512 || ItemDefinition.forID(item - 512).method192(this.gender)) continue;
            notYetLoaded = true;
        }
        Model[] models = new Model[12];
        int k = 0;
        for (int l = 0; l < 12; ++l) {
            int item2 = this.equipment[l];
            if (item2 >= 256 && item2 < 512) {
                Model model_1 = IDK.cache[item2 - 256].method540();
                model_1 = IDK.cache[item2 - 256].method540();
                if (model_1 != null) {
                    models[k++] = model_1;
                }
            }
            if (item2 < 512) continue;
            Model model_2 = ItemDefinition.forID(item2 - 512).method194(this.gender);
            if (this.gender == 1 && l == 3) {
                model_2.method475(offsetX, offsetY, offsetZ);
            }
            if (model_2 == null) continue;
            models[k++] = model_2;
        }
        Model model = new Model(k, models);
        int j1 = 0;
        while (j1 < 5) {
            if (this.lookColors[j1] != 0) {
                model.reColor(Client.equipmentColors[j1][0], Client.equipmentColors[j1][this.lookColors[j1]]);
                if (j1 == 1) {
                    model.reColor(Client.anIntArray1204[0], Client.anIntArray1204[this.lookColors[j1]]);
                }
            }
            ++j1;
        }
        return model;
    }

    Player() {
    }

    public String contextColor() {
        return this.contextColor;
    }

    public String getRank() {
        return this.rank;
    }

    public String titleColor() {
        return this.titleColor;
    }
}

