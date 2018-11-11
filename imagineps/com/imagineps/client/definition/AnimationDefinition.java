/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.imagineps.client.definition;

import com.imagineps.client.FileOperations;
import com.imagineps.client.Stream;
import com.imagineps.client.StreamLoader;
import com.imagineps.client.cache.CacheType;
import com.imagineps.client.definition.FrameReader;
import com.imagineps.client.definition.RevisionType;
import com.imagineps.client.definition.custom.CustomAnimationDefinitions;
import java.io.PrintStream;

public final class AnimationDefinition {
    public static final int OSRS_ANIMATION_OFFSET = 20000;
    public static AnimationDefinition[] anims;
    public static AnimationDefinition[] osrsAnims;
    private static int animationsLength;
    private static int osrsAnimationsLength;
    public static int anInt367;
    public RevisionType revisionType = RevisionType.DEFAULT;
    public int frameCount;
    public int[] frame;
    public int[] anIntArray354;
    public int[] delay;
    public int anInt356 = -1;
    public int[] anIntArray357;
    public boolean aBoolean358 = false;
    public int priority = 5;
    public int leftHandEquip = -1;
    public int rightHandEquip = -1;
    public int anInt362 = 99;
    public int anInt363 = -1;
    public int walkingPrecedence = -1;
    public int anInt365 = 2;

    public static void copy(int newId, int copyId, int item) {
        AnimationDefinition c = anims[copyId];
        AnimationDefinition.anims[newId] = new AnimationDefinition();
        AnimationDefinition.anims[newId].frameCount = c.frameCount;
        AnimationDefinition.anims[newId].anInt363 = c.anInt363;
        AnimationDefinition.anims[newId].walkingPrecedence = c.walkingPrecedence;
        AnimationDefinition.anims[newId].delay = c.delay;
        AnimationDefinition.anims[newId].frame = c.frame;
        AnimationDefinition.anims[newId].rightHandEquip = item + 512;
    }

    public static void copyOSRS(int newId, int copyId) {
        AnimationDefinition c = osrsAnims[copyId];
        AnimationDefinition.anims[newId] = new AnimationDefinition();
        AnimationDefinition.anims[newId].anInt363 = c.anInt363;
        AnimationDefinition.anims[newId].walkingPrecedence = c.walkingPrecedence;
        AnimationDefinition.anims[newId].delay = c.delay;
    }

    public static AnimationDefinition getAnim(int animationId) {
        if (animationId >= 20000 && animationId <= 20000 + osrsAnimationsLength) {
            if (osrsAnims == null) return null;
            if (osrsAnims[animationId - 20000] == null) return null;
            return osrsAnims[animationId - 20000];
        }
        if (animationId > animationsLength + 5000) return null;
        if (anims == null) return null;
        if (anims[animationId] == null) return null;
        return anims[animationId];
    }

    public static void nullLoader() {
        anims = null;
        osrsAnims = null;
    }

    public static void unpackConfig(StreamLoader streamLoader) {
        Stream stream = new Stream(streamLoader.getDataForName("seq.dat"));
        animationsLength = stream.readUnsignedWord();
        if (anims == null) {
            anims = new AnimationDefinition[animationsLength + 25000];
        }
        for (int j = 0; j < animationsLength + 25000; ++j) {
            if (anims[j] == null) {
                AnimationDefinition.anims[j] = new AnimationDefinition();
            }
            anims[j].readValues(stream, RevisionType.DEFAULT);
            AnimationDefinition.anims[16758] = new AnimationDefinition();
            AnimationDefinition.anims[16758].frameCount = 36;
            AnimationDefinition.anims[16758].delay = new int[]{15, 14, 13, 14, 14, 14, 13, 13, 13, 15, 14, 13, 14, 14, 14, 13, 13, 13, 15, 14, 13, 14, 14, 14, 13, 13, 13, 15, 14, 13, 14, 14, 14, 13, 13, 13};
            AnimationDefinition.anims[16758].frame = new int[]{262930439, 262930449, 262930435, 262930438, 262930434, 262930447, 262930434, 262930438, 262930435, 262930439, 262930449, 262930444, 262930433, 262930448, 262930445, 262930446, 262930441, 262930440, 262930439, 262930449, 262930435, 262930438, 262930434, 262930447, 262930434, 262930438, 262930435, 262930439, 262930449, 262930435, 262930438, 262930434, 262930447, 262930434, 262930438, 262930435};
            AnimationDefinition.anims[16759] = new AnimationDefinition();
            AnimationDefinition.anims[16759].frameCount = 10;
            AnimationDefinition.anims[16759].delay = new int[]{17, 16, 15, 16, 16, 16, 15, 15, 15, 1};
            AnimationDefinition.anims[16759].frame = new int[]{262930443, 262930450, 262930436, 262930432, 262930442, 262930432, 262930436, 262930450, 262930437, 262930443};
            AnimationDefinition.anims[16715] = new AnimationDefinition();
            AnimationDefinition.anims[16715].frameCount = 48;
            AnimationDefinition.anims[16715].delay = new int[]{12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
            AnimationDefinition.anims[16715].frame = new int[]{262144166, 262144890, 262144129, 262144645, 262144200, 262144741, 262144290, 262144742, 262144339, 262144211, 262144968, 262144452, 262144769, 262144021, 262144030, 262144512, 262144166, 262144890, 262144129, 262144645, 262144200, 262144741, 262144290, 262144742, 262144339, 262144211, 262144968, 262144452, 262144769, 262144021, 262144030, 262144512, 262144166, 262144890, 262144129, 262144170, 262144956, 262144718, 262144957, 262144573, 262144850, 262144586, 262144968, 262144452, 262144769, 262144021, 262144030, 262144512};
            AnimationDefinition.anims[16716] = new AnimationDefinition();
            AnimationDefinition.anims[16716].frameCount = 48;
            AnimationDefinition.anims[16716].delay = new int[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
            AnimationDefinition.anims[16716].frame = new int[]{262144540, 262144332, 262144959, 262144391, 262144678, 262144531, 262144312, 262144403, 262144615, 262144347, 262144871, 262144233, 262144484, 262144331, 262144529, 262144132, 262144334, 262144360, 262144509, 262144681, 262144638, 262144318, 262144169, 262144808, 262144939, 262144713, 262144486, 262145009, 262144848, 262144584, 262144677, 262144872, 262144227, 262144831, 262144219, 262144449, 262144177, 262144656, 262144771, 262144379, 262144927, 262144149, 262144358, 262144621, 262144930, 262144639, 262144496, 262144976};
            AnimationDefinition.anims[16717] = new AnimationDefinition();
            AnimationDefinition.anims[16717].frameCount = 18;
            AnimationDefinition.anims[16717].walkingPrecedence = 6;
            AnimationDefinition.anims[16717].delay = new int[]{3, 4, 5, 5, 5, 5, 5, 4, 4, 6, 6, 6, 6, 6, 6, 6, 5, 3};
            AnimationDefinition.anims[16717].frame = new int[]{262144618, 262144260, 262144336, 262144669, 262144492, 262144680, 262144921, 262145015, 262144851, 262144413, 262144242, 262144984, 262144541, 262144801, 262144596, 262144343, 262144266, 262144618};
            AnimationDefinition.anims[16718] = new AnimationDefinition();
            AnimationDefinition.anims[16718].frameCount = 24;
            AnimationDefinition.anims[16718].walkingPrecedence = 6;
            AnimationDefinition.anims[16718].delay = new int[]{6, 7, 6, 6, 6, 6, 6, 5, 5, 5, 3, 3, 3, 4, 8, 8, 6, 3, 4, 4, 4, 4, 7, 1};
            AnimationDefinition.anims[16718].frame = new int[]{262144569, 262144870, 262144173, 262144048, 262144338, 262144766, 262144908, 262144671, 262144720, 262144453, 262144919, 262144038, 262144651, 262144180, 262144409, 262144244, 262144181, 262144372, 262144062, 262144232, 262144463, 262144459, 262144948, 262144569};
            AnimationDefinition.anims[16719] = new AnimationDefinition();
            AnimationDefinition.anims[16719].frameCount = 14;
            AnimationDefinition.anims[16719].walkingPrecedence = 6;
            AnimationDefinition.anims[16719].delay = new int[]{8, 8, 8, 8, 8, 8, 4, 3, 4, 7, 7, 8, 8, 1};
            AnimationDefinition.anims[16719].frame = new int[]{262144448, 262144888, 262144524, 262144592, 262145007, 262144041, 262144110, 262144478, 262144825, 262144311, 262144076, 262144988, 262144792, 262144448};
            AnimationDefinition.anims[16720] = new AnimationDefinition();
            AnimationDefinition.anims[16720].frameCount = 20;
            AnimationDefinition.anims[16720].walkingPrecedence = 6;
            AnimationDefinition.anims[16720].delay = new int[]{9, 9, 5, 5, 5, 7, 6, 6, 5, 6, 8, 7, 10, 9, 5, 5, 4, 4, 4, 1};
            AnimationDefinition.anims[16720].frame = new int[]{262144915, 262144300, 262144799, 262144435, 262144964, 262144955, 262144231, 262144345, 262144632, 262144125, 262144012, 262144498, 262144648, 262144351, 262144320, 262144943, 262144099, 262144285, 262144451, 262144915};
            AnimationDefinition.anims[16721] = new AnimationDefinition();
            AnimationDefinition.anims[16721].frameCount = 21;
            AnimationDefinition.anims[16721].walkingPrecedence = 6;
            AnimationDefinition.anims[16721].delay = new int[]{4, 4, 4, 3, 3, 3, 3, 3, 4, 4, 5, 5, 6, 7, 7, 4, 5, 4, 4, 7, 1};
            AnimationDefinition.anims[16721].frame = new int[]{262144239, 262145008, 262144102, 262144357, 262144421, 262144775, 262144942, 262144532, 262144151, 262144590, 262144936, 262144414, 262144017, 262144674, 262144832, 262145012, 262144237, 262144944, 262144859, 262144470, 262144239};
            AnimationDefinition.anims[16722] = new AnimationDefinition();
            AnimationDefinition.anims[16722].frameCount = 23;
            AnimationDefinition.anims[16722].anInt356 = 8;
            AnimationDefinition.anims[16722].delay = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
            AnimationDefinition.anims[16722].frame = new int[]{262144377, 262144202, 262144695, 262145010, 262144107, 262144655, 262144362, 262144817, 262144567, 262145017, 262144163, 262144547, 262144196, 262144310, 262144941, 262144036, 262144904, 262144646, 262144887, 262144469, 262144397, 262145000, 262144386};
            AnimationDefinition.anims[16723] = new AnimationDefinition();
            AnimationDefinition.anims[16723].frameCount = 13;
            AnimationDefinition.anims[16723].walkingPrecedence = 10;
            AnimationDefinition.anims[16723].delay = new int[]{4, 4, 3, 3, 3, 5, 6, 5, 5, 5, 5, 6, 6};
            AnimationDefinition.anims[16723].frame = new int[]{262144951, 262144734, 262144780, 262144782, 262144049, 262144923, 262144283, 262144485, 262144274, 262144785, 262144188, 262144620, 262144208};
            AnimationDefinition.anims[16730] = new AnimationDefinition();
            AnimationDefinition.anims[16730].frameCount = 5;
            AnimationDefinition.anims[16730].delay = new int[]{50, 50, 50, 50, 50};
            AnimationDefinition.anims[16730].frame = new int[]{262144406, 262144992, 262144644, 262144000, 262144989};
            AnimationDefinition.anims[16731] = new AnimationDefinition();
            AnimationDefinition.anims[16731].frameCount = 2;
            AnimationDefinition.anims[16731].delay = new int[]{50, 50};
            AnimationDefinition.anims[16731].frame = new int[]{262144518, 262144212};
            AnimationDefinition.anims[16732] = new AnimationDefinition();
            AnimationDefinition.anims[16732].frameCount = 79;
            AnimationDefinition.anims[16732].delay = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 5, 5, 5, 5, 5, 5, 8, 8, 8, 8, 8};
            AnimationDefinition.anims[16732].frame = new int[]{262144247, 262144327, 262144164, 262144795, 262144858, 262144328, 262144918, 262144905, 262144603, 262144628, 262144501, 262144251, 262144445, 262144156, 262144156, 262144445, 262144251, 262144501, 262144628, 262144603, 262144905, 262144918, 262144328, 262144858, 262144795, 262144164, 262144613, 262144504, 262144716, 262144796, 262144619, 262144301, 262144411, 262144392, 262144396, 262144699, 262144860, 262144668, 262144980, 262144763, 262144790, 262144161, 262144003, 262144162, 262144047, 262144280, 262144978, 262144560, 262144867, 262144097, 262144224, 262144727, 262144040, 262144005, 262144947, 262144876, 262144710, 262144220, 262144708, 262144471, 262144324, 262144722, 262144165, 262144118, 262144719, 262145005, 262144045, 262144787, 262144160, 262144993, 262144530, 262144209, 262144011, 262144376, 262144999, 262144913, 262144137, 262144493, 262144576};
            AnimationDefinition.anims[16738] = new AnimationDefinition();
            AnimationDefinition.anims[16738].frameCount = 29;
            AnimationDefinition.anims[16738].walkingPrecedence = 6;
            AnimationDefinition.anims[16738].delay = new int[]{4, 4, 3, 3, 3, 3, 3, 3, 4, 4, 3, 2, 2, 3, 4, 4, 4, 4, 5, 6, 6, 7, 5, 4, 4, 6, 7, 7, 3};
            AnimationDefinition.anims[16738].frame = new int[]{262144672, 262144098, 262144630, 262144623, 262144273, 262144080, 262144226, 262144885, 262144587, 262144781, 262144707, 262144580, 262144854, 262144491, 262144765, 262144152, 262144250, 262144691, 262144605, 262144891, 262144835, 262144864, 262144703, 262144869, 262145006, 262144609, 262144954, 262144982, 262144672};
            AnimationDefinition.anims[16739] = new AnimationDefinition();
            AnimationDefinition.anims[16739].frameCount = 31;
            AnimationDefinition.anims[16739].walkingPrecedence = 6;
            AnimationDefinition.anims[16739].delay = new int[]{8, 8, 8, 8, 6, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 3, 3, 4, 4, 4, 4, 4, 1};
            AnimationDefinition.anims[16739].frame = new int[]{262144897, 262144201, 262144704, 262144130, 262144544, 262144111, 262144673, 262144598, 262144183, 262144705, 262144275, 262144745, 262144550, 262144534, 262144115, 262144084, 262144025, 262144264, 262144712, 262144197, 262144591, 262144264, 262144712, 262144264, 262144712, 262144458, 262144175, 262144078, 262145002, 262144410, 262144897};
            AnimationDefinition.anims[16742] = new AnimationDefinition();
            AnimationDefinition.anims[16742].frameCount = 67;
            AnimationDefinition.anims[16742].delay = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 5, 5, 5, 5, 5, 5, 8, 8, 8, 8, 8};
            AnimationDefinition.anims[16742].frame = new int[]{262144880, 262144840, 262144340, 262144525, 262144506, 262144432, 262144806, 262144430, 262144031, 262144874, 262144952, 262144093, 262144830, 262144561, 262144487, 262144490, 262144676, 262144967, 262144685, 262144814, 262144762, 262144647, 262144029, 262144938, 262144527, 262144625, 262144061, 262144004, 262144616, 262144963, 262144468, 262144750, 262144060, 262144692, 262144393, 262144434, 262145003, 262144015, 262144539, 262144868, 262144519, 262144035, 262144588, 262144852, 262144997, 262144091, 262144010, 262144991, 262144554, 262144815, 262144316, 262144267, 262144935, 262144037, 262144533, 262144706, 262144499, 262144092, 262144987, 262144367, 262144382, 262144072, 262144352, 262144907, 262144774, 262144113, 262144911};
            AnimationDefinition.anims[16743] = new AnimationDefinition();
            AnimationDefinition.anims[16743].frameCount = 18;
            AnimationDefinition.anims[16743].walkingPrecedence = 6;
            AnimationDefinition.anims[16743].delay = new int[]{2, 5, 6, 6, 6, 6, 6, 4, 4, 6, 6, 6, 5, 5, 5, 5, 4, 3};
            AnimationDefinition.anims[16743].frame = new int[]{262144516, 262144248, 262144932, 262144135, 262144783, 262144255, 262144507, 262144241, 262144714, 262144511, 262144042, 262144724, 262144627, 262144679, 262144124, 262144322, 262144259, 262144516};
            AnimationDefinition.anims[16744] = new AnimationDefinition();
            AnimationDefinition.anims[16744].frameCount = 18;
            AnimationDefinition.anims[16744].walkingPrecedence = 6;
            AnimationDefinition.anims[16744].delay = new int[]{3, 4, 5, 5, 5, 5, 6, 4, 4, 6, 6, 5, 6, 6, 6, 6, 5, 3};
            AnimationDefinition.anims[16744].frame = new int[]{262144562, 262144635, 262144330, 262144661, 262144096, 262144768, 262144738, 262144240, 262144218, 262144395, 262144214, 262144522, 262144308, 262144624, 262144172, 262144839, 262144258, 262144562};
            AnimationDefinition.anims[16745] = new AnimationDefinition();
            AnimationDefinition.anims[16745].frameCount = 60;
            AnimationDefinition.anims[16745].walkingPrecedence = 6;
            AnimationDefinition.anims[16745].delay = new int[]{7, 6, 6, 5, 5, 5, 5, 5, 5, 5, 6, 5, 6, 6, 5, 5, 5, 5, 5, 4, 4, 4, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 8, 8, 4, 4, 4, 5, 6, 6, 1};
            AnimationDefinition.anims[16745].frame = new int[]{262144317, 262144994, 262144122, 262144088, 262144594, 262144341, 262144294, 262144433, 262144350, 262144192, 262144861, 262144886, 262144599, 262144536, 262144074, 262144972, 262144837, 262144142, 262144622, 262144437, 262144572, 262144995, 262144079, 262144521, 262144067, 262144818, 262144575, 262144743, 262144823, 262144407, 262145014, 262144777, 262144106, 262144949, 262144595, 262144269, 262144368, 262144217, 262144912, 262144924, 262144134, 262144514, 262144836, 262144399, 262144346, 262144958, 262144917, 262144546, 262144793, 262144849, 262144213, 262144323, 262144204, 262144381, 262144057, 262144893, 262144601, 262144663, 262144901, 262144317};
            AnimationDefinition.anims[16746] = new AnimationDefinition();
            AnimationDefinition.anims[16746].frameCount = 31;
            AnimationDefinition.anims[16746].walkingPrecedence = 6;
            AnimationDefinition.anims[16746].delay = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 14};
            AnimationDefinition.anims[16746].frame = new int[]{262144602, 262144865, 262144105, 262144306, 262144523, 262144363, 262144555, 262144436, 262144342, 262144271, 262144143, 262144385, 262144028, 262144717, 262144121, 262144374, 262144112, 262144059, 262144425, 262144772, 262144171, 262144063, 262144926, 262144813, 262144082, 262144315, 262144023, 262144827, 262144402, 262144262, 262144552};
            AnimationDefinition.anims[16747] = new AnimationDefinition();
            AnimationDefinition.anims[16747].frameCount = 8;
            AnimationDefinition.anims[16747].anInt356 = 8;
            AnimationDefinition.anims[16747].walkingPrecedence = 6;
            AnimationDefinition.anims[16747].delay = new int[]{5, 5, 5, 5, 5, 5, 5, 5};
            AnimationDefinition.anims[16747].frame = new int[]{262144934, 262144464, 262144735, 262144725, 262144408, 262144263, 262144711, 262144740};
            AnimationDefinition.anims[16748] = new AnimationDefinition();
            AnimationDefinition.anims[16748].frameCount = 12;
            AnimationDefinition.anims[16748].walkingPrecedence = 6;
            AnimationDefinition.anims[16748].delay = new int[]{5, 3, 2, 3, 3, 6, 6, 5, 5, 6, 5, 11};
            AnimationDefinition.anims[16748].frame = new int[]{262144144, 262144441, 262144077, 262144289, 262144033, 262144634, 262144103, 262144797, 262144566, 262144863, 262144291, 262144689};
            AnimationDefinition.anims[15448] = new AnimationDefinition();
            AnimationDefinition.anims[15448].frameCount = 60;
            AnimationDefinition.anims[15448].priority = 6;
            AnimationDefinition.anims[15448].anInt363 = 2;
            AnimationDefinition.anims[15448].walkingPrecedence = 1;
            AnimationDefinition.anims[15448].delay = new int[]{1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4, 3};
            AnimationDefinition.anims[15448].frame = new int[]{852053, 852207, 852152, 852151, 852072, 852107, 852142, 852176, 852058, 852116, 852104, 852070, 852007, 852165, 852140, 852164, 852051, 852195, 851983, 852242, 852189, 852047, 852113, 852200, 851976, 852035, 852114, 852112, 852126, 852046, 852040, 852004, 852218, 852054, 852132, 852083, 852236, 852228, 852182, 852052, 852156, 851989, 852111, 852124, 852031, 852108, 852171, 852010, 852133, 852023, 852069, 852224, 852139, 852062, 852059, 852038, 852138, 852000, 852146, 852053};
            AnimationDefinition.anims[15449] = new AnimationDefinition();
            AnimationDefinition.anims[15449].frameCount = 19;
            AnimationDefinition.anims[15449].priority = 6;
            AnimationDefinition.anims[15449].anInt363 = 2;
            AnimationDefinition.anims[15449].walkingPrecedence = 1;
            AnimationDefinition.anims[15449].delay = new int[]{15, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 7, 13, 5, 3};
            AnimationDefinition.anims[15449].frame = new int[]{250872027, 250871886, 250871895, 250872017, 250871909, 250871892, 250871963, 250871953, 250871905, 250871823, 250871882, 250872046, 250872050, 250871913, 250871939, 250871844, 250871877, 250871858, 250871964};
            AnimationDefinition.anims[15450] = new AnimationDefinition();
            AnimationDefinition.anims[15450].frameCount = 10;
            AnimationDefinition.anims[15450].delay = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
            AnimationDefinition.anims[15450].frame = new int[]{250871880, 250871926, 250871936, 250871945, 250871941, 250871994, 250871873, 250871809, 250871821, 250871850};
            AnimationDefinition.anims[15451] = new AnimationDefinition();
            AnimationDefinition.anims[15451].frameCount = 18;
            AnimationDefinition.anims[15451].delay = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 6, 12, 4, 1, 1};
            AnimationDefinition.anims[15451].delay = new int[]{250871894, 250871885, 250871954, 250871891, 250871878, 250872021, 250872053, 250872016, 250871957, 250871974, 250872032, 250871985, 250871903, 250871908, 250872024, 250871890, 250871983, 250871912};
            AnimationDefinition.anims[15069] = new AnimationDefinition();
            AnimationDefinition.anims[15069].frameCount = 24;
            AnimationDefinition.anims[15069].delay = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
            AnimationDefinition.anims[15069].frame = new int[]{227803309, 227803140, 227803217, 227803251, 227803297, 227803222, 227803158, 227803280, 227803266, 227803224, 227803268, 227803288, 227803218, 227803157, 227803187, 227803152, 227803286, 227803179, 227803168, 227803229, 227803248, 227803213, 227803180, 227803284};
            AnimationDefinition.anims[15069].anInt363 = 0;
            AnimationDefinition.anims[15069].walkingPrecedence = 0;
            AnimationDefinition.anims[15070] = new AnimationDefinition();
            AnimationDefinition.anims[15070].frameCount = 24;
            AnimationDefinition.anims[15070].delay = new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
            AnimationDefinition.anims[15070].frame = new int[]{227803277, 227803235, 227803154, 227803141, 227803238, 227803321, 227803151, 227803203, 227803205, 227803299, 227803137, 227803262, 227803245, 227803174, 227803242, 227803139, 227803305, 227803317, 227803254, 227803167, 227803185, 227803267, 227803257, 227803265};
            AnimationDefinition.anims[15070].anInt363 = 0;
            AnimationDefinition.anims[15070].walkingPrecedence = 0;
            AnimationDefinition.anims[15071] = new AnimationDefinition();
            AnimationDefinition.anims[15071].frameCount = 16;
            AnimationDefinition.anims[15071].delay = new int[]{4, 3, 3, 4, 4, 3, 2, 2, 1, 1, 2, 2, 3, 3, 3, 1};
            AnimationDefinition.anims[15071].frame = new int[]{227803302, 227803143, 227803240, 227803163, 227803159, 227803155, 227803323, 227803183, 227803276, 227803287, 227803285, 227803219, 227803210, 227803147, 227803204, 227803302};
            AnimationDefinition.anims[15071].priority = 6;
            AnimationDefinition.anims[15071].anInt362 = 1;
            AnimationDefinition.anims[15071].anInt363 = 2;
            AnimationDefinition.anims[15071].walkingPrecedence = 2;
            AnimationDefinition.anims[15072] = new AnimationDefinition();
            AnimationDefinition.anims[15072].frameCount = 23;
            AnimationDefinition.anims[15072].delay = new int[]{3, 4, 4, 3, 4, 2, 2, 1, 1, 1, 1, 1, 3, 3, 3, 2, 2, 2, 3, 3, 3, 4, 1};
            AnimationDefinition.anims[15072].frame = new int[]{227803212, 227803308, 227803199, 227803292, 227803227, 227803241, 227803271, 227803327, 227803296, 227803173, 227803314, 227803247, 227803263, 227803237, 227803243, 227803156, 227803138, 227803190, 227803198, 227803231, 227803304, 227803233, 227803212};
            AnimationDefinition.anims[15072].priority = 6;
            AnimationDefinition.anims[15072].anInt362 = 1;
            AnimationDefinition.anims[15072].anInt363 = 2;
            AnimationDefinition.anims[15072].walkingPrecedence = 2;
            AnimationDefinition.anims[15073] = new AnimationDefinition();
            AnimationDefinition.anims[15073].frameCount = 16;
            AnimationDefinition.anims[15073].delay = new int[]{3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2};
            AnimationDefinition.anims[15073].frame = new int[]{227803319, 227803320, 227803223, 227803197, 227803177, 227803259, 227803211, 227803145, 227803312, 227803252, 227803279, 227803209, 227803166, 227803176, 227803207, 227803261};
            AnimationDefinition.anims[15073].anInt363 = 2;
            AnimationDefinition.anims[15073].walkingPrecedence = 2;
            AnimationDefinition.anims[15074] = new AnimationDefinition();
            AnimationDefinition.anims[15074].frameCount = 17;
            AnimationDefinition.anims[15074].delay = new int[]{1, 2, 2, 2, 3, 3, 3, 4, 2, 1, 3, 1, 2, 2, 1, 1, 1};
            AnimationDefinition.anims[15074].frame = new int[]{227803221, 227803322, 227803275, 227803256, 227803283, 227803272, 227803293, 227803318, 227803303, 227803206, 227803164, 227803146, 227803289, 227803255, 227803225, 227803169, 227803221};
            AnimationDefinition.anims[15074].anInt362 = 1;
            AnimationDefinition.anims[15074].anInt363 = 2;
            AnimationDefinition.anims[15074].walkingPrecedence = 2;
            AnimationDefinition.anims[15075] = new AnimationDefinition();
            AnimationDefinition.anims[15075].frameCount = 16;
            AnimationDefinition.anims[15075].delay = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
            AnimationDefinition.anims[15075].frame = new int[]{227803194, 227803226, 227803171, 227803228, 227803232, 227803136, 227803253, 227803175, 227803316, 227803162, 227803186, 227803192, 227803294, 227803144, 227803189, 227803282};
            AnimationDefinition.anims[15075].anInt363 = 0;
            AnimationDefinition.anims[15075].walkingPrecedence = 0;
            AnimationDefinition.anims[15076] = new AnimationDefinition();
            AnimationDefinition.anims[15076].frameCount = 16;
            AnimationDefinition.anims[15076].delay = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
            AnimationDefinition.anims[15076].frame = new int[]{227803193, 227803298, 227803201, 227803234, 227803216, 227803160, 227803315, 227803306, 227803325, 227803220, 227803182, 227803149, 227803150, 227803313, 227803208, 227803258};
            AnimationDefinition.anims[15076].anInt363 = 0;
            AnimationDefinition.anims[15076].walkingPrecedence = 0;
            AnimationDefinition.anims[15077] = new AnimationDefinition();
            AnimationDefinition.anims[15077].frameCount = 16;
            AnimationDefinition.anims[15077].delay = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
            AnimationDefinition.anims[15077].frame = new int[]{227803148, 227803326, 227803290, 227803270, 227803202, 227803269, 227803244, 227803307, 227803260, 227803153, 227803250, 227803196, 227803278, 227803246, 227803236, 227803195};
            AnimationDefinition.anims[15077].anInt363 = 0;
            AnimationDefinition.anims[15077].walkingPrecedence = 0;
            AnimationDefinition.anims[j] = CustomAnimationDefinitions.load(j, anims[j]);
        }
        AnimationDefinition.copy(13026, 1576, 21010);
        Stream osrsStream = new Stream(FileOperations.readFile(CacheType.DATA.getFullLocation() + "/osrs/seq.dat"));
        osrsAnimationsLength = osrsStream.readUnsignedWord();
        if (osrsAnims == null) {
            osrsAnims = new AnimationDefinition[osrsAnimationsLength];
        }
        int index = 0;
        do {
            if (index >= osrsAnims.length) {
                AnimationDefinition.anims[6561] = new AnimationDefinition();
                AnimationDefinition.anims[6583] = new AnimationDefinition();
                AnimationDefinition.anims[6561] = osrsAnims[4484];
                AnimationDefinition.anims[6583] = osrsAnims[4488];
                System.out.println("Total regular animations: " + animationsLength + ", osrs animations: " + osrsAnimationsLength);
                return;
            }
            if (osrsAnims[index] == null) {
                AnimationDefinition.osrsAnims[index] = new AnimationDefinition();
            }
            osrsAnims[index].readValues(osrsStream, RevisionType.OSRS);
            AnimationDefinition.osrsAnims[index].revisionType = RevisionType.OSRS;
            ++index;
        } while (true);
    }

    public int method258(int i) {
        FrameReader class36;
        int j = this.delay[i];
        if (j == 0 && (class36 = FrameReader.forId(this.frame[i], this.revisionType)) != null) {
            j = this.delay[i] = class36.anInt636;
        }
        if (j != 0) return j;
        return 1;
    }

    public void readValues(Stream stream, RevisionType revisionType) {
        try {
            block21 : {
                block2 : do {
                    int i;
                    if ((i = stream.readUnsignedByte()) == 0) {
                        if (this.frameCount == 0) {
                            break;
                        }
                        break block21;
                    }
                    if (i == 1) {
                        int i_;
                        this.frameCount = stream.readUnsignedWord();
                        this.frame = new int[this.frameCount];
                        this.anIntArray354 = new int[this.frameCount];
                        this.delay = new int[this.frameCount];
                        for (i_ = 0; i_ < this.frameCount; ++i_) {
                            this.frame[i_] = stream.readDWord();
                            this.anIntArray354[i_] = -1;
                        }
                        i_ = 0;
                        do {
                            if (i_ >= this.frameCount) continue block2;
                            this.delay[i_] = stream.readUnsignedByte();
                            ++i_;
                        } while (true);
                    }
                    if (i == 2) {
                        this.anInt356 = stream.readUnsignedWord();
                        continue;
                    }
                    if (i == 3) {
                        int k = stream.readUnsignedByte();
                        this.anIntArray357 = new int[k + 1];
                        for (int l = 0; l < k; ++l) {
                            this.anIntArray357[l] = stream.readUnsignedByte();
                        }
                        this.anIntArray357[k] = 9999999;
                        continue;
                    }
                    if (i == 4) {
                        this.aBoolean358 = true;
                        continue;
                    }
                    if (i == 5) {
                        this.priority = stream.readUnsignedByte();
                        continue;
                    }
                    if (i == 6) {
                        this.leftHandEquip = stream.readUnsignedWord() + (revisionType == RevisionType.OSRS ? 25000 : 0);
                        continue;
                    }
                    if (i == 7) {
                        this.rightHandEquip = stream.readUnsignedWord() + (revisionType == RevisionType.OSRS ? 25000 : 0);
                        continue;
                    }
                    if (i == 8) {
                        this.anInt362 = stream.readUnsignedByte();
                        continue;
                    }
                    if (i == 9) {
                        this.anInt363 = stream.readUnsignedByte();
                        continue;
                    }
                    if (i == 10) {
                        this.walkingPrecedence = stream.readUnsignedByte();
                        continue;
                    }
                    if (i == 11) {
                        this.anInt365 = stream.readUnsignedByte();
                        continue;
                    }
                    System.out.println("Unrecognized seq.dat config code: " + i);
                } while (true);
                this.frameCount = 1;
                this.frame = new int[1];
                this.frame[0] = -1;
                this.anIntArray354 = new int[1];
                this.anIntArray354[0] = -1;
                this.delay = new int[1];
                this.delay[0] = -1;
            }
            if (this.anInt363 == -1) {
                this.anInt363 = this.anIntArray357 != null ? 2 : 0;
            }
            if (this.walkingPrecedence != -1) return;
            if (this.anIntArray357 != null) {
                this.walkingPrecedence = 2;
                return;
            }
            this.walkingPrecedence = 0;
            return;
        }
        catch (Exception i) {
            // empty catch block
        }
    }
}

