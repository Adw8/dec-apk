package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.create.CreateViewModel;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: lTs  reason: default package */
/* loaded from: classes.dex */
public abstract class lTs {

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f5745R = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] v = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] e = {16842755, 16843781};
    public static M_ R = new M_();
    public static final int[] X = {R.attr.keylines, R.attr.statusBarBackground};
    public static final int[] O = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: R  reason: collision with other field name */
    public static final int[][] f5746R = {new int[]{768, 879}, new int[]{1155, 1161}, new int[]{1425, 1469}, new int[]{1471, 1471}, new int[]{1473, 1474}, new int[]{1476, 1477}, new int[]{1479, 1479}, new int[]{1552, 1562}, new int[]{1611, 1631}, new int[]{1648, 1648}, new int[]{1750, 1756}, new int[]{1759, 1764}, new int[]{1767, 1768}, new int[]{1770, 1773}, new int[]{1809, 1809}, new int[]{1840, 1866}, new int[]{1958, 1968}, new int[]{2027, 2035}, new int[]{2045, 2045}, new int[]{2070, 2073}, new int[]{2075, 2083}, new int[]{2085, 2087}, new int[]{2089, 2093}, new int[]{2137, 2139}, new int[]{2259, 2273}, new int[]{2275, 2306}, new int[]{2362, 2362}, new int[]{2364, 2364}, new int[]{2369, 2376}, new int[]{2381, 2381}, new int[]{2385, 2391}, new int[]{2402, 2403}, new int[]{2433, 2433}, new int[]{2492, 2492}, new int[]{2497, 2500}, new int[]{2509, 2509}, new int[]{2530, 2531}, new int[]{2558, 2558}, new int[]{2561, 2562}, new int[]{2620, 2620}, new int[]{2625, 2626}, new int[]{2631, 2632}, new int[]{2635, 2637}, new int[]{2641, 2641}, new int[]{2672, 2673}, new int[]{2677, 2677}, new int[]{2689, 2690}, new int[]{2748, 2748}, new int[]{2753, 2757}, new int[]{2759, 2760}, new int[]{2765, 2765}, new int[]{2786, 2787}, new int[]{2810, 2815}, new int[]{2817, 2817}, new int[]{2876, 2876}, new int[]{2879, 2879}, new int[]{2881, 2884}, new int[]{2893, 2893}, new int[]{2901, 2902}, new int[]{2914, 2915}, new int[]{2946, 2946}, new int[]{3008, 3008}, new int[]{3021, 3021}, new int[]{3072, 3072}, new int[]{3076, 3076}, new int[]{3134, 3136}, new int[]{3142, 3144}, new int[]{3146, 3149}, new int[]{3157, 3158}, new int[]{3170, 3171}, new int[]{3201, 3201}, new int[]{3260, 3260}, new int[]{3263, 3263}, new int[]{3270, 3270}, new int[]{3276, 3277}, new int[]{3298, 3299}, new int[]{3328, 3329}, new int[]{3387, 3388}, new int[]{3393, 3396}, new int[]{3405, 3405}, new int[]{3426, 3427}, new int[]{3457, 3457}, new int[]{3530, 3530}, new int[]{3538, 3540}, new int[]{3542, 3542}, new int[]{3633, 3633}, new int[]{3636, 3642}, new int[]{3655, 3662}, new int[]{3761, 3761}, new int[]{3764, 3772}, new int[]{3784, 3789}, new int[]{3864, 3865}, new int[]{3893, 3893}, new int[]{3895, 3895}, new int[]{3897, 3897}, new int[]{3953, 3966}, new int[]{3968, 3972}, new int[]{3974, 3975}, new int[]{3981, 3991}, new int[]{3993, 4028}, new int[]{4038, 4038}, new int[]{4141, 4144}, new int[]{4146, 4151}, new int[]{4153, 4154}, new int[]{4157, 4158}, new int[]{4184, 4185}, new int[]{4190, 4192}, new int[]{4209, 4212}, new int[]{4226, 4226}, new int[]{4229, 4230}, new int[]{4237, 4237}, new int[]{4253, 4253}, new int[]{4957, 4959}, new int[]{5906, 5908}, new int[]{5938, 5940}, new int[]{5970, 5971}, new int[]{6002, 6003}, new int[]{6068, 6069}, new int[]{6071, 6077}, new int[]{6086, 6086}, new int[]{6089, 6099}, new int[]{6109, 6109}, new int[]{6155, 6157}, new int[]{6277, 6278}, new int[]{6313, 6313}, new int[]{6432, 6434}, new int[]{6439, 6440}, new int[]{6450, 6450}, new int[]{6457, 6459}, new int[]{6679, 6680}, new int[]{6683, 6683}, new int[]{6742, 6742}, new int[]{6744, 6750}, new int[]{6752, 6752}, new int[]{6754, 6754}, new int[]{6757, 6764}, new int[]{6771, 6780}, new int[]{6783, 6783}, new int[]{6832, 6848}, new int[]{6912, 6915}, new int[]{6964, 6964}, new int[]{6966, 6970}, new int[]{6972, 6972}, new int[]{6978, 6978}, new int[]{7019, 7027}, new int[]{7040, 7041}, new int[]{7074, 7077}, new int[]{7080, 7081}, new int[]{7083, 7085}, new int[]{7142, 7142}, new int[]{7144, 7145}, new int[]{7149, 7149}, new int[]{7151, 7153}, new int[]{7212, 7219}, new int[]{7222, 7223}, new int[]{7376, 7378}, new int[]{7380, 7392}, new int[]{7394, 7400}, new int[]{7405, 7405}, new int[]{7412, 7412}, new int[]{7416, 7417}, new int[]{7616, 7673}, new int[]{7675, 7679}, new int[]{8400, 8432}, new int[]{11503, 11505}, new int[]{11647, 11647}, new int[]{11744, 11775}, new int[]{12330, 12333}, new int[]{12441, 12442}, new int[]{42607, 42610}, new int[]{42612, 42621}, new int[]{42654, 42655}, new int[]{42736, 42737}, new int[]{43010, 43010}, new int[]{43014, 43014}, new int[]{43019, 43019}, new int[]{43045, 43046}, new int[]{43052, 43052}, new int[]{43204, 43205}, new int[]{43232, 43249}, new int[]{43263, 43263}, new int[]{43302, 43309}, new int[]{43335, 43345}, new int[]{43392, 43394}, new int[]{43443, 43443}, new int[]{43446, 43449}, new int[]{43452, 43453}, new int[]{43493, 43493}, new int[]{43561, 43566}, new int[]{43569, 43570}, new int[]{43573, 43574}, new int[]{43587, 43587}, new int[]{43596, 43596}, new int[]{43644, 43644}, new int[]{43696, 43696}, new int[]{43698, 43700}, new int[]{43703, 43704}, new int[]{43710, 43711}, new int[]{43713, 43713}, new int[]{43756, 43757}, new int[]{43766, 43766}, new int[]{44005, 44005}, new int[]{44008, 44008}, new int[]{44013, 44013}, new int[]{64286, 64286}, new int[]{65024, 65039}, new int[]{65056, 65071}, new int[]{66045, 66045}, new int[]{66272, 66272}, new int[]{66422, 66426}, new int[]{68097, 68099}, new int[]{68101, 68102}, new int[]{68108, 68111}, new int[]{68152, 68154}, new int[]{68159, 68159}, new int[]{68325, 68326}, new int[]{68900, 68903}, new int[]{69291, 69292}, new int[]{69446, 69456}, new int[]{69633, 69633}, new int[]{69688, 69702}, new int[]{69759, 69761}, new int[]{69811, 69814}, new int[]{69817, 69818}, new int[]{69888, 69890}, new int[]{69927, 69931}, new int[]{69933, 69940}, new int[]{70003, 70003}, new int[]{70016, 70017}, new int[]{70070, 70078}, new int[]{70089, 70092}, new int[]{70095, 70095}, new int[]{70191, 70193}, new int[]{70196, 70196}, new int[]{70198, 70199}, new int[]{70206, 70206}, new int[]{70367, 70367}, new int[]{70371, 70378}, new int[]{70400, 70401}, new int[]{70459, 70460}, new int[]{70464, 70464}, new int[]{70502, 70508}, new int[]{70512, 70516}, new int[]{70712, 70719}, new int[]{70722, 70724}, new int[]{70726, 70726}, new int[]{70750, 70750}, new int[]{70835, 70840}, new int[]{70842, 70842}, new int[]{70847, 70848}, new int[]{70850, 70851}, new int[]{71090, 71093}, new int[]{71100, 71101}, new int[]{71103, 71104}, new int[]{71132, 71133}, new int[]{71219, 71226}, new int[]{71229, 71229}, new int[]{71231, 71232}, new int[]{71339, 71339}, new int[]{71341, 71341}, new int[]{71344, 71349}, new int[]{71351, 71351}, new int[]{71453, 71455}, new int[]{71458, 71461}, new int[]{71463, 71467}, new int[]{71727, 71735}, new int[]{71737, 71738}, new int[]{71995, 71996}, new int[]{71998, 71998}, new int[]{72003, 72003}, new int[]{72148, 72151}, new int[]{72154, 72155}, new int[]{72160, 72160}, new int[]{72193, 72202}, new int[]{72243, 72248}, new int[]{72251, 72254}, new int[]{72263, 72263}, new int[]{72273, 72278}, new int[]{72281, 72283}, new int[]{72330, 72342}, new int[]{72344, 72345}, new int[]{72752, 72758}, new int[]{72760, 72765}, new int[]{72767, 72767}, new int[]{72850, 72871}, new int[]{72874, 72880}, new int[]{72882, 72883}, new int[]{72885, 72886}, new int[]{73009, 73014}, new int[]{73018, 73018}, new int[]{73020, 73021}, new int[]{73023, 73029}, new int[]{73031, 73031}, new int[]{73104, 73105}, new int[]{73109, 73109}, new int[]{73111, 73111}, new int[]{73459, 73460}, new int[]{92912, 92916}, new int[]{92976, 92982}, new int[]{94031, 94031}, new int[]{94095, 94098}, new int[]{94180, 94180}, new int[]{113821, 113822}, new int[]{119143, 119145}, new int[]{119163, 119170}, new int[]{119173, 119179}, new int[]{119210, 119213}, new int[]{119362, 119364}, new int[]{121344, 121398}, new int[]{121403, 121452}, new int[]{121461, 121461}, new int[]{121476, 121476}, new int[]{121499, 121503}, new int[]{121505, 121519}, new int[]{122880, 122886}, new int[]{122888, 122904}, new int[]{122907, 122913}, new int[]{122915, 122916}, new int[]{122918, 122922}, new int[]{123184, 123190}, new int[]{123628, 123631}, new int[]{125136, 125142}, new int[]{125252, 125258}, new int[]{917760, 917999}};

    /* renamed from: v  reason: collision with other field name */
    public static final int[][] f5747v = {new int[]{4352, 4447}, new int[]{8986, 8987}, new int[]{9001, 9002}, new int[]{9193, 9196}, new int[]{9200, 9200}, new int[]{9203, 9203}, new int[]{9725, 9726}, new int[]{9748, 9749}, new int[]{9800, 9811}, new int[]{9855, 9855}, new int[]{9875, 9875}, new int[]{9889, 9889}, new int[]{9898, 9899}, new int[]{9917, 9918}, new int[]{9924, 9925}, new int[]{9934, 9934}, new int[]{9940, 9940}, new int[]{9962, 9962}, new int[]{9970, 9971}, new int[]{9973, 9973}, new int[]{9978, 9978}, new int[]{9981, 9981}, new int[]{9989, 9989}, new int[]{9994, 9995}, new int[]{10024, 10024}, new int[]{10060, 10060}, new int[]{10062, 10062}, new int[]{10067, 10069}, new int[]{10071, 10071}, new int[]{10133, 10135}, new int[]{10160, 10160}, new int[]{10175, 10175}, new int[]{11035, 11036}, new int[]{11088, 11088}, new int[]{11093, 11093}, new int[]{11904, 11929}, new int[]{11931, 12019}, new int[]{12032, 12245}, new int[]{12272, 12283}, new int[]{12288, 12350}, new int[]{12353, 12438}, new int[]{12441, 12543}, new int[]{12549, 12591}, new int[]{12593, 12686}, new int[]{12688, 12771}, new int[]{12784, 12830}, new int[]{12832, 12871}, new int[]{12880, 19903}, new int[]{19968, 42124}, new int[]{42128, 42182}, new int[]{43360, 43388}, new int[]{44032, 55203}, new int[]{63744, 64255}, new int[]{65040, 65049}, new int[]{65072, 65106}, new int[]{65108, 65126}, new int[]{65128, 65131}, new int[]{65281, 65376}, new int[]{65504, 65510}, new int[]{94176, 94180}, new int[]{94192, 94193}, new int[]{94208, 100343}, new int[]{100352, 101589}, new int[]{101632, 101640}, new int[]{110592, 110878}, new int[]{110928, 110930}, new int[]{110948, 110951}, new int[]{110960, 111355}, new int[]{126980, 126980}, new int[]{127183, 127183}, new int[]{127374, 127374}, new int[]{127377, 127386}, new int[]{127488, 127490}, new int[]{127504, 127547}, new int[]{127552, 127560}, new int[]{127568, 127569}, new int[]{127584, 127589}, new int[]{127744, 127776}, new int[]{127789, 127797}, new int[]{127799, 127868}, new int[]{127870, 127891}, new int[]{127904, 127946}, new int[]{127951, 127955}, new int[]{127968, 127984}, new int[]{127988, 127988}, new int[]{127992, 128062}, new int[]{128064, 128064}, new int[]{128066, 128252}, new int[]{128255, 128317}, new int[]{128331, 128334}, new int[]{128336, 128359}, new int[]{128378, 128378}, new int[]{128405, 128406}, new int[]{128420, 128420}, new int[]{128507, 128591}, new int[]{128640, 128709}, new int[]{128716, 128716}, new int[]{128720, 128722}, new int[]{128725, 128727}, new int[]{128747, 128748}, new int[]{128756, 128764}, new int[]{128992, 129003}, new int[]{129292, 129338}, new int[]{129340, 129349}, new int[]{129351, 129400}, new int[]{129402, 129483}, new int[]{129485, 129535}, new int[]{129648, 129652}, new int[]{129656, 129658}, new int[]{129664, 129670}, new int[]{129680, 129704}, new int[]{129712, 129718}, new int[]{129728, 129730}, new int[]{129744, 129750}, new int[]{131072, 196605}, new int[]{196608, 262141}};

    public static boolean C(int[][] iArr, int i) {
        if (i < iArr[0][0]) {
            return false;
        }
        int length = iArr.length - 1;
        int i2 = 0;
        while (length >= i2) {
            int i3 = (i2 + length) / 2;
            int[] iArr2 = iArr[i3];
            if (iArr2[1] < i) {
                i2 = i3 + 1;
            } else if (iArr2[0] <= i) {
                return true;
            } else {
                length = i3 - 1;
            }
        }
        return false;
    }

    public static String H(Exception exc) {
        String str = null;
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            exc.printStackTrace(printWriter);
            printWriter.close();
            str = stringWriter.toString();
            stringWriter.close();
            return str;
        } catch (IOException e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static final nE I(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new j8f("Not a printable ASCII character: " + charAt, 0);
            }
            bArr[i] = (byte) charAt;
        }
        return nE.R(bArr);
    }

    public static void J(int i, kwo kwo, kQB kqb) {
        float f = kwo.L;
        int c2 = kwo.f5516v.f4581R.c();
        int c3 = kwo.f5512e.f4581R.c();
        c2 = kwo.f5516v.e() + c2;
        c3 -= kwo.f5512e.e();
        if (c2 == c3) {
            f = 0.5f;
        }
        int m = kwo.m();
        int i2 = (c3 - c2) - m;
        if (c2 > c3) {
            i2 = (c2 - c3) - m;
        }
        int i3 = (int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2));
        int i4 = c2 + i3;
        int i5 = i4 + m;
        if (c2 > c3) {
            i4 = c2 - i3;
            i5 = i4 - m;
        }
        kwo.S(i4, i5);
        u(i + 1, kwo, kqb);
    }

    public static void K(int i, kwo kwo, kQB kqb, kwo kwo2, boolean z) {
        float f = kwo2.O;
        int e2 = kwo2.f5491R.e() + kwo2.f5491R.f4581R.c();
        int c2 = kwo2.f5508c.f4581R.c() - kwo2.f5508c.e();
        if (c2 >= e2) {
            int P = kwo2.P();
            if (kwo2.K != 8) {
                int i2 = kwo2.f5485O;
                if (i2 == 2) {
                    P = (int) (kwo2.O * 0.5f * ((float) (kwo instanceof m_b ? kwo.P() : kwo.f5495R.P())));
                } else if (i2 == 0) {
                    P = c2 - e2;
                }
                P = Math.max(kwo2.Z, P);
                int i3 = kwo2.m;
                if (i3 > 0) {
                    P = Math.min(i3, P);
                }
            }
            int i4 = e2 + ((int) ((f * ((float) ((c2 - e2) - P))) + 0.5f));
            kwo2.A(i4, P + i4);
            U(i + 1, kwo2, kqb, z);
        }
    }

    public static String L(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static boolean N(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static byte[] O(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static boolean P(Context context) {
        ((fMX) ((ah6) cpc.u(context, ah6.class))).getClass();
        Set emptySet = Collections.emptySet();
        hDC.L(emptySet.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (emptySet.isEmpty()) {
            return true;
        }
        return ((Boolean) emptySet.iterator().next()).booleanValue();
    }

    public static final void R(CreateViewModel createViewModel, dM_ dm_, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-254886357);
        aff aff = aff.R;
        float f = (float) 12;
        float f2 = (float) 24;
        ncu I = adU.X(dTl.i(aff, false, new _c(createViewModel, 20, dm_), 7)).I(new mP0(f2, f, f2, f));
        ky kyVar = dq.f2891v;
        jr_.w(693286680);
        bF9 R2 = ktl.R(nA.R, kyVar, jr_);
        jr_.w(-1323940314);
        jJj jjj = (jJj) jr_.x(lnF.X);
        mdz mdz = (mdz) jr_.x(lnF.H);
        bUo buo = (bUo) jr_.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(I);
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(fme);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            l6.p(jr_, R2, igT.c);
            l6.p(jr_, jjj, igT.v);
            l6.p(jr_, mdz, igT.e);
            jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -678309503);
            if (dm_.R == 0) {
                jr_.w(-1149889495);
                dTl.x(adU.Z(aff, (float) 32), jr_, 6);
                jr_.g(false);
            } else {
                jr_.w(-1149889426);
                gQc.X(iTI.g(dm_.R, jr_), null, adU.Z(aff, (float) 32), null, null, 0.0f, null, jr_, 440, 120);
                jr_.g(false);
            }
            dTl.x(adU.H(aff, (float) 16), jr_, 6);
            g1c.c(dm_.v, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, jr_, 0, 0, 65534);
            jQ.K(jr_, false, false, true, false);
            jr_.g(false);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new _a(createViewModel, dm_, i, 15);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static void U(int i, kwo kwo, kQB kqb, boolean z) {
        iP5 ip5;
        iP5 ip52;
        iP5 ip53;
        iP5 ip54;
        if (!kwo.f5505X) {
            if (!(kwo instanceof m_b) && kwo.J() && X(kwo)) {
                m_b.M(kwo, kqb, new M_());
            }
            iP5 L = kwo.L(icY.LEFT);
            iP5 L2 = kwo.L(icY.RIGHT);
            int c2 = L.c();
            int c3 = L2.c();
            HashSet hashSet = L.f4583R;
            if (hashSet != null && L.f4585R) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    iP5 ip55 = (iP5) it.next();
                    kwo kwo2 = ip55.f4584R;
                    int i2 = i + 1;
                    boolean X2 = X(kwo2);
                    if (kwo2.J() && X2) {
                        m_b.M(kwo2, kqb, new M_());
                    }
                    iP5 ip56 = kwo2.f5491R;
                    boolean z2 = (ip55 == ip56 && (ip54 = kwo2.f5508c.f4581R) != null && ip54.f4585R) || (ip55 == kwo2.f5508c && (ip53 = ip56.f4581R) != null && ip53.f4585R);
                    int i3 = kwo2.f5510c[0];
                    if (i3 != 3 || X2) {
                        if (!kwo2.J()) {
                            iP5 ip57 = kwo2.f5491R;
                            if (ip55 == ip57 && kwo2.f5508c.f4581R == null) {
                                int e2 = ip57.e() + c2;
                                kwo2.A(e2, kwo2.P() + e2);
                                U(i2, kwo2, kqb, z);
                            } else {
                                iP5 ip58 = kwo2.f5508c;
                                if (ip55 == ip58 && ip57.f4581R == null) {
                                    int e3 = c2 - ip58.e();
                                    kwo2.A(e3 - kwo2.P(), e3);
                                    U(i2, kwo2, kqb, z);
                                } else if (z2 && !kwo2.o()) {
                                    o(i2, kwo2, kqb, z);
                                }
                            }
                        }
                    } else if (i3 == 3 && kwo2.m >= 0 && kwo2.Z >= 0 && (kwo2.K == 8 || (kwo2.f5485O == 0 && kwo2.X == 0.0f))) {
                        if (!kwo2.o() && z2 && !kwo2.o()) {
                            K(i2, kwo, kqb, kwo2, z);
                        }
                    }
                }
            }
            if (!(kwo instanceof gOm)) {
                HashSet hashSet2 = L2.f4583R;
                if (hashSet2 != null && L2.f4585R) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        iP5 ip59 = (iP5) it2.next();
                        kwo kwo3 = ip59.f4584R;
                        int i4 = i + 1;
                        boolean X3 = X(kwo3);
                        if (kwo3.J() && X3) {
                            m_b.M(kwo3, kqb, new M_());
                        }
                        iP5 ip510 = kwo3.f5491R;
                        boolean z3 = (ip59 == ip510 && (ip52 = kwo3.f5508c.f4581R) != null && ip52.f4585R) || (ip59 == kwo3.f5508c && (ip5 = ip510.f4581R) != null && ip5.f4585R);
                        int i5 = kwo3.f5510c[0];
                        if (i5 != 3 || X3) {
                            if (!kwo3.J()) {
                                iP5 ip511 = kwo3.f5491R;
                                if (ip59 == ip511 && kwo3.f5508c.f4581R == null) {
                                    int e4 = ip511.e() + c3;
                                    kwo3.A(e4, kwo3.P() + e4);
                                    U(i4, kwo3, kqb, z);
                                } else {
                                    iP5 ip512 = kwo3.f5508c;
                                    if (ip59 == ip512 && ip511.f4581R == null) {
                                        int e5 = c3 - ip512.e();
                                        kwo3.A(e5 - kwo3.P(), e5);
                                        U(i4, kwo3, kqb, z);
                                    } else if (z3 && !kwo3.o()) {
                                        o(i4, kwo3, kqb, z);
                                    }
                                }
                            }
                        } else if (i5 == 3 && kwo3.m >= 0 && kwo3.Z >= 0) {
                            if (kwo3.K != 8) {
                                if (kwo3.f5485O == 0) {
                                    if (kwo3.X == 0.0f) {
                                    }
                                }
                            }
                            if (!kwo3.o() && z3 && !kwo3.o()) {
                                K(i4, kwo, kqb, kwo3, z);
                            }
                        }
                    }
                }
                kwo.f5505X = true;
            }
        }
    }

    public static int V() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public static boolean X(kwo kwo) {
        int[] iArr = kwo.f5510c;
        int i = iArr[0];
        int i2 = iArr[1];
        kwo kwo2 = kwo.f5495R;
        m_b m_b = kwo2 != null ? (m_b) kwo2 : null;
        if (m_b != null) {
            int i3 = ((kwo) m_b).f5510c[0];
        }
        if (m_b != null) {
            int i4 = ((kwo) m_b).f5510c[1];
        }
        boolean z = i == 1 || kwo.Y() || i == 2 || (i == 3 && kwo.f5485O == 0 && kwo.X == 0.0f && kwo.y(0)) || (i == 3 && kwo.f5485O == 1 && kwo.t(0, kwo.P()));
        boolean z2 = i2 == 1 || kwo.h() || i2 == 2 || (i2 == 3 && kwo.f5482L == 0 && kwo.X == 0.0f && kwo.y(1)) || (i2 == 3 && kwo.f5482L == 1 && kwo.t(1, kwo.m()));
        if (kwo.X <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    public static void Y(int i, kwo kwo, kQB kqb, kwo kwo2) {
        float f = kwo2.L;
        int e2 = kwo2.f5516v.e() + kwo2.f5516v.f4581R.c();
        int c2 = kwo2.f5512e.f4581R.c() - kwo2.f5512e.e();
        if (c2 >= e2) {
            int m = kwo2.m();
            if (kwo2.K != 8) {
                int i2 = kwo2.f5482L;
                if (i2 == 2) {
                    m = (int) (f * 0.5f * ((float) (kwo instanceof m_b ? kwo.m() : kwo.f5495R.m())));
                } else if (i2 == 0) {
                    m = c2 - e2;
                }
                m = Math.max(kwo2.x, m);
                int i3 = kwo2.H;
                if (i3 > 0) {
                    m = Math.min(i3, m);
                }
            }
            int i4 = e2 + ((int) ((f * ((float) ((c2 - e2) - m))) + 0.5f));
            kwo2.S(i4, m + i4);
            u(i + 1, kwo2, kqb);
        }
    }

    public static ColorStateList Z(Context context, CV cv, int i) {
        int y;
        ColorStateList v2;
        return (!cv.o(i) || (y = cv.y(i, 0)) == 0 || (v2 = C1.v(context, y)) == null) ? cv.m(i) : v2;
    }

    public static final void c(CreateViewModel createViewModel, List list, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(794176454);
        h0T h0t = (h0T) cpc.T(new Object[0], null, b5X.R, jr_, 6);
        ncu B = dTl.B(aff.R, dTl.s(jr_));
        vV vVVar = dq.f2893v;
        jr_.w(-483455358);
        bF9 R2 = VA.R(nA.f6330R, vVVar, jr_);
        jr_.w(-1323940314);
        jJj jjj = (jJj) jr_.x(lnF.X);
        mdz mdz = (mdz) jr_.x(lnF.H);
        bUo buo = (bUo) jr_.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(B);
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(fme);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            l6.p(jr_, R2, igT.c);
            l6.p(jr_, jjj, igT.v);
            l6.p(jr_, mdz, igT.e);
            jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -1163856341);
            _n _nVar = _n.R;
            jr_.w(-1473702159);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!d7V.f2503R.contains((dM_) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                R(createViewModel, (dM_) it.next(), jr_, 8);
            }
            jr_.g(false);
            dTl.v(_nVar, !((Boolean) h0t.getValue()).booleanValue(), null, null, null, null, aH9.I(jr_, -1422242668, new x9(8, h0t)), jr_, 1572870, 30);
            dTl.v(_nVar, ((Boolean) h0t.getValue()).booleanValue(), null, null, null, null, aH9.I(jr_, -1054273269, new fB0(list, 12, createViewModel)), jr_, 1572870, 30);
            jQ.K(jr_, false, false, true, false);
            jr_.g(false);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new _a(createViewModel, list, i, 16);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static final void e(CreateViewModel createViewModel, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-953366947);
        h0T m = biy.m(createViewModel.e, jr_);
        oI9.R(null, 0, 0.0f, jr_, 0, 7);
        ncu zw = aH9.zw(adU.f942R, 0.0f, (float) 32, 0.0f, 0.0f, 13);
        jr_.w(1157296644);
        boolean O2 = jr_.O(m);
        Object I = jr_.I();
        if (O2 || I == ppN.R) {
            I = new jb4(m, 6);
            jr_.ZW(I);
        }
        jr_.g(false);
        aH9.H(zw, null, null, true, null, null, null, false, (kg9) I, jr_, 3078, 246);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new m2w(i, 8, createViewModel);
        }
    }

    public static void g(nAq naq, String str, String str2) {
        if (naq != null) {
            if (str2 == null) {
                str2 = "";
            }
            kxm.v(str, 6, str2, null);
            return;
        }
        Log.e(str, str2);
    }

    public static final bz h(Spanned spanned) {
        _w _wVar = new _w();
        _wVar.R.append(spanned.toString());
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    _wVar.R(new eBF(0, 0, lIe.O, (ned) null, (hqI) null, (deI) null, (String) null, 0, (L0) null, (h5a) null, (d5E) null, 0, (ari) null, (hpO) null, 16379), spanStart, spanEnd);
                } else if (style == 2) {
                    _wVar.R(new eBF(0, 0, (lIe) null, new ned(1), (hqI) null, (deI) null, (String) null, 0, (L0) null, (h5a) null, (d5E) null, 0, (ari) null, (hpO) null, 16375), spanStart, spanEnd);
                } else if (style == 3) {
                    _wVar.R(new eBF(0, 0, lIe.O, new ned(1), (hqI) null, (deI) null, (String) null, 0, (L0) null, (h5a) null, (d5E) null, 0, (ari) null, (hpO) null, 16371), spanStart, spanEnd);
                }
            } else if (obj instanceof UnderlineSpan) {
                _wVar.R(new eBF(0, 0, (lIe) null, (ned) null, (hqI) null, (deI) null, (String) null, 0, (L0) null, (h5a) null, (d5E) null, 0, ari.v, (hpO) null, 12287), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                _wVar.R(new eBF(aH9.X(((ForegroundColorSpan) obj).getForegroundColor()), 0, (lIe) null, (ned) null, (hqI) null, (deI) null, (String) null, 0, (L0) null, (h5a) null, (d5E) null, 0, (ari) null, (hpO) null, 16382), spanStart, spanEnd);
            }
        }
        return _wVar.c();
    }

    public static lkt i(afC afc) {
        EOFException e2;
        boolean z;
        try {
            try {
                afc.a();
                z = false;
            } catch (EOFException e3) {
                e2 = e3;
                z = true;
            }
            try {
                return (lkt) n0h.R.O(afc);
            } catch (EOFException e4) {
                e2 = e4;
                if (z) {
                    return jQR.R;
                }
                throw new gnq(e2);
            }
        } catch (bXa e5) {
            throw new gnq(e5);
        } catch (IOException e6) {
            throw new gnq(e6);
        } catch (NumberFormatException e7) {
            throw new gnq(e7);
        }
    }

    public static final fmJ j() {
        return new fmJ(5, null);
    }

    public static ColorStateList m(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList v2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (v2 = C1.v(context, resourceId)) == null) ? typedArray.getColorStateList(i) : v2;
    }

    public static String n(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder i3 = jQ.i("<", str2, " threw ");
                    i3.append(e2.getClass().getName());
                    i3.append(">");
                    sb = i3.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i4, indexOf);
            i++;
            sb2.append(objArr[i]);
            i4 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i4, str.length());
        if (i < length2) {
            sb2.append(" [");
            int i5 = i + 1;
            sb2.append(objArr[i]);
            while (i5 < objArr.length) {
                sb2.append(", ");
                i5++;
                sb2.append(objArr[i5]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void o(int i, kwo kwo, kQB kqb, boolean z) {
        float f = kwo.O;
        int c2 = kwo.f5491R.f4581R.c();
        int c3 = kwo.f5508c.f4581R.c();
        c2 = kwo.f5491R.e() + c2;
        c3 -= kwo.f5508c.e();
        if (c2 == c3) {
            f = 0.5f;
        }
        int P = kwo.P();
        int i2 = (c3 - c2) - P;
        if (c2 > c3) {
            i2 = (c2 - c3) - P;
        }
        int i3 = ((int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2))) + c2;
        int i4 = i3 + P;
        if (c2 > c3) {
            i4 = i3 - P;
        }
        kwo.A(i3, i4);
        U(i + 1, kwo, kqb, z);
    }

    public static void t(nAq naq, String str) {
        if (naq != null) {
            if (str == null) {
                str = "";
            }
            kxm.v("TerminalEmulator", 5, str, null);
            return;
        }
        Log.w("TerminalEmulator", str);
    }

    public static void u(int i, kwo kwo, kQB kqb) {
        iP5 ip5;
        iP5 ip52;
        iP5 ip53;
        iP5 ip54;
        if (!kwo.f5487O) {
            if (!(kwo instanceof m_b) && kwo.J() && X(kwo)) {
                m_b.M(kwo, kqb, new M_());
            }
            iP5 L = kwo.L(icY.TOP);
            iP5 L2 = kwo.L(icY.BOTTOM);
            int c2 = L.c();
            int c3 = L2.c();
            HashSet hashSet = L.f4583R;
            if (hashSet != null && L.f4585R) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    iP5 ip55 = (iP5) it.next();
                    kwo kwo2 = ip55.f4584R;
                    int i2 = i + 1;
                    boolean X2 = X(kwo2);
                    if (kwo2.J() && X2) {
                        m_b.M(kwo2, kqb, new M_());
                    }
                    iP5 ip56 = kwo2.f5516v;
                    boolean z = (ip55 == ip56 && (ip54 = kwo2.f5512e.f4581R) != null && ip54.f4585R) || (ip55 == kwo2.f5512e && (ip53 = ip56.f4581R) != null && ip53.f4585R);
                    int i3 = kwo2.f5510c[1];
                    if (i3 != 3 || X2) {
                        if (!kwo2.J()) {
                            iP5 ip57 = kwo2.f5516v;
                            if (ip55 == ip57 && kwo2.f5512e.f4581R == null) {
                                int e2 = ip57.e() + c2;
                                kwo2.S(e2, kwo2.m() + e2);
                                u(i2, kwo2, kqb);
                            } else {
                                iP5 ip58 = kwo2.f5512e;
                                if (ip55 == ip58 && ip57.f4581R == null) {
                                    int e3 = c2 - ip58.e();
                                    kwo2.S(e3 - kwo2.m(), e3);
                                    u(i2, kwo2, kqb);
                                } else if (z && !kwo2.K()) {
                                    J(i2, kwo2, kqb);
                                }
                            }
                        }
                    } else if (i3 == 3 && kwo2.H >= 0 && kwo2.x >= 0 && (kwo2.K == 8 || (kwo2.f5482L == 0 && kwo2.X == 0.0f))) {
                        if (!kwo2.K() && z && !kwo2.K()) {
                            Y(i2, kwo, kqb, kwo2);
                        }
                    }
                }
            }
            if (!(kwo instanceof gOm)) {
                HashSet hashSet2 = L2.f4583R;
                if (hashSet2 != null && L2.f4585R) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        iP5 ip59 = (iP5) it2.next();
                        kwo kwo3 = ip59.f4584R;
                        int i4 = i + 1;
                        boolean X3 = X(kwo3);
                        if (kwo3.J() && X3) {
                            m_b.M(kwo3, kqb, new M_());
                        }
                        iP5 ip510 = kwo3.f5516v;
                        boolean z2 = (ip59 == ip510 && (ip52 = kwo3.f5512e.f4581R) != null && ip52.f4585R) || (ip59 == kwo3.f5512e && (ip5 = ip510.f4581R) != null && ip5.f4585R);
                        int i5 = kwo3.f5510c[1];
                        if (i5 != 3 || X3) {
                            if (!kwo3.J()) {
                                iP5 ip511 = kwo3.f5516v;
                                if (ip59 == ip511 && kwo3.f5512e.f4581R == null) {
                                    int e4 = ip511.e() + c3;
                                    kwo3.S(e4, kwo3.m() + e4);
                                    u(i4, kwo3, kqb);
                                } else {
                                    iP5 ip512 = kwo3.f5512e;
                                    if (ip59 == ip512 && ip511.f4581R == null) {
                                        int e5 = c3 - ip512.e();
                                        kwo3.S(e5 - kwo3.m(), e5);
                                        u(i4, kwo3, kqb);
                                    } else if (z2 && !kwo3.K()) {
                                        J(i4, kwo3, kqb);
                                    }
                                }
                            }
                        } else if (i5 == 3 && kwo3.H >= 0 && kwo3.x >= 0 && (kwo3.K == 8 || (kwo3.f5482L == 0 && kwo3.X == 0.0f))) {
                            if (!kwo3.K() && z2 && !kwo3.K()) {
                                Y(i4, kwo, kqb, kwo3);
                            }
                        }
                    }
                }
                iP5 L3 = kwo.L(icY.BASELINE);
                if (L3.f4583R != null && L3.f4585R) {
                    int c4 = L3.c();
                    Iterator it3 = L3.f4583R.iterator();
                    while (it3.hasNext()) {
                        iP5 ip513 = (iP5) it3.next();
                        kwo kwo4 = ip513.f4584R;
                        int i6 = i + 1;
                        boolean X4 = X(kwo4);
                        if (kwo4.J() && X4) {
                            m_b.M(kwo4, kqb, new M_());
                        }
                        if (kwo4.f5510c[1] != 3 || X4) {
                            if (!kwo4.J() && ip513 == kwo4.f5504X) {
                                int e6 = ip513.e() + c4;
                                if (kwo4.f5484L) {
                                    int i7 = e6 - kwo4.i;
                                    int i8 = kwo4.j + i7;
                                    kwo4.t = i7;
                                    kwo4.f5516v.m(i7);
                                    kwo4.f5512e.m(i8);
                                    kwo4.f5504X.m(e6);
                                    kwo4.f5513e = true;
                                }
                                u(i6, kwo4, kqb);
                            }
                        }
                    }
                }
                kwo.f5487O = true;
            }
        }
    }

    public static final void v(CreateViewModel createViewModel, mpr mpr, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-306900341);
        hDC.v("Add distro", mpr, null, null, null, aH9.I(jr_, -2046151969, new jkU(createViewModel, biy.m(createViewModel.c, jr_), biy.m(createViewModel.f2746R, jr_), biy.m(createViewModel.f2748v, jr_), 2)), jr_, 196678, 28);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(createViewModel, mpr, i, 14);
        }
    }

    public static Drawable x(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable p;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (p = aH9.p(context, resourceId)) == null) ? typedArray.getDrawable(i) : p;
    }

    public static void y(nAq naq, String str, String str2, Exception exc) {
        String str3;
        if (str2 != null) {
            StringBuilder t = jQ.t(str2, ":\n");
            t.append(H(exc));
            str3 = t.toString();
        } else {
            str3 = H(exc);
        }
        g(naq, str, str3);
    }

    public static int z(int i) {
        if (i == 0 || i == 847 || ((8203 <= i && i <= 8207) || i == 8232 || i == 8233 || ((8234 <= i && i <= 8238) || ((8288 <= i && i <= 8291) || i < 32 || ((127 <= i && i < 160) || C(f5746R, i)))))) {
            return 0;
        }
        return C(f5747v, i) ? 2 : 1;
    }
}
