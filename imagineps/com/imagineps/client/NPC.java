/*
 * Decompiled with CFR 0_125.
 */
package com.imagineps.client;

import com.imagineps.client.Client;
import com.imagineps.client.Mobile;
import com.imagineps.client.Model;
import com.imagineps.client.PlayerSettings;
import com.imagineps.client.definition.AnimationDefinition;
import com.imagineps.client.definition.FrameReader;
import com.imagineps.client.definition.NPCDefinition;
import com.imagineps.client.definition.RevisionType;
import com.imagineps.client.definition.SpotAnim;

public final class NPC
extends Mobile {
    public NPCDefinition npcDefinition;

    private Model method450() {
        int currAnim = -1;
        int nextAnim = -1;
        int currCycle = -1;
        int nextCycle = -1;
        if (this.forcedAnimation >= 0 && this.animationDelay == 0) {
            AnimationDefinition seq = null;
            seq = this.forcedAnimation > 20000 ? AnimationDefinition.osrsAnims[this.forcedAnimation - 20000] : AnimationDefinition.anims[this.forcedAnimation];
            if (Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING) && this.nextAnimFrame != -1) {
                nextAnim = seq.frame[this.nextAnimFrame];
                currCycle = seq.delay[this.displayedEmoteFrames];
                nextCycle = this.emoteTimeRemaining;
            }
            currAnim = seq.frame[this.displayedEmoteFrames];
            int idleAnim = -1;
            if (this.anInt1517 < 0) return this.npcDefinition.method164(idleAnim, currAnim, nextAnim, currCycle, nextCycle, AnimationDefinition.anims[this.forcedAnimation].anIntArray357);
            if (this.anInt1517 == this.standAnim) return this.npcDefinition.method164(idleAnim, currAnim, nextAnim, currCycle, nextCycle, AnimationDefinition.anims[this.forcedAnimation].anIntArray357);
            AnimationDefinition idle = null;
            idle = this.anInt1517 > 20000 ? AnimationDefinition.osrsAnims[this.anInt1517 - 20000] : AnimationDefinition.anims[this.anInt1517];
            idleAnim = idle.frame[this.anInt1518];
            return this.npcDefinition.method164(idleAnim, currAnim, nextAnim, currCycle, nextCycle, AnimationDefinition.anims[this.forcedAnimation].anIntArray357);
        }
        if (this.anInt1517 < 0) return this.npcDefinition.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
        AnimationDefinition seq = null;
        seq = this.anInt1517 > 20000 ? AnimationDefinition.osrsAnims[this.anInt1517 - 20000] : AnimationDefinition.anims[this.anInt1517];
        currAnim = seq.frame[this.anInt1518];
        if (!Client.getSettings().isEnabled(PlayerSettings.PlayerSetting.TWEENING)) return this.npcDefinition.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
        if (this.nextIdleFrame == -1) return this.npcDefinition.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
        nextAnim = seq.frame[this.nextIdleFrame];
        currCycle = seq.delay[this.anInt1518];
        nextCycle = this.anInt1519;
        return this.npcDefinition.method164(-1, currAnim, nextAnim, currCycle, nextCycle, null);
    }

    @Override
    public Model getModel() {
        Model model_1;
        SpotAnim spotAnim;
        if (this.npcDefinition == null) {
            return null;
        }
        Model model = this.method450();
        if (model == null) {
            return null;
        }
        this.height = model.modelHeight;
        if (this.graphic != -1 && this.currentAnimation != -1 && (model_1 = (spotAnim = SpotAnim.forId(this.graphic)).getModel()) != null) {
            AnimationDefinition anim = spotAnim.aAnimation_407;
            int animationFrame = anim.frame[this.currentAnimation];
            Model model_2 = new Model(true, FrameReader.method532(animationFrame), false, model_1);
            model_2.method475(0, - this.anInt1524, 0);
            model_2.method469();
            model_2.method470(animationFrame, anim.revisionType);
            model_2.anIntArrayArray1658 = null;
            model_2.anIntArrayArray1657 = null;
            if (spotAnim.anInt410 != 128 || spotAnim.anInt411 != 128) {
                model_2.method478(spotAnim.anInt410, spotAnim.anInt410, spotAnim.anInt411);
            }
            model_2.light(64 + spotAnim.anInt413, 850 + spotAnim.anInt414, -30, -50, -30, true);
            Model[] aModel = new Model[]{model, model_2};
            model = new Model(aModel);
        }
        if (this.npcDefinition.boundDim != 1) return model;
        model.aBoolean1659 = true;
        return model;
    }

    @Override
    public boolean isVisible() {
        if (this.npcDefinition == null) return false;
        return true;
    }

    NPC() {
    }
}

