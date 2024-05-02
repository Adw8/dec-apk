package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n1P  reason: default package */
/* loaded from: classes.dex */
public abstract class n1P {

    /* renamed from: R  reason: collision with other field name */
    public static nUO f6269R;

    /* renamed from: R  reason: collision with other field name */
    public static final lmI f6268R = new lmI("CONDITION_FALSE");

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f6270R = {16842755, 16842960, 16842961};

    /* renamed from: v  reason: collision with other field name */
    public static final int[] f6271v = {16842755, 16842961};
    public static final int R = 9;
    public static final int v = 6;
    public static final int c = 10;
    public static final int e = 5;
    public static final int X = 15;

    public static String C(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb.append((CharSequence) ",");
            }
            if (obj != null) {
                z = obj instanceof CharSequence;
            }
            if (z) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final boolean H(phU phu) {
        return phu.f7176v && !phu.f7175R;
    }

    public static ncu J(ncu ncu, float f, n76 n76) {
        long j = nRb.R;
        return Float.compare(f, (float) 0) <= 0 ? ncu : mWb.R(ncu, msU.f(aff.R, new gZO(f, n76, false, j, j)));
    }

    public static final long K(phU phu, boolean z) {
        long O = aWo.O(phu.c, phu.X);
        if (z || !phu.v()) {
            return O;
        }
        int i = aWo.R;
        return aWo.v;
    }

    public static final long N(long j) {
        return aH9.N(nqW.e(j) / 2.0f, nqW.v(j) / 2.0f);
    }

    public static final void O(cXX cxx, phU phu) {
        if (m(phu)) {
            cxx.f2131R = phu.c;
            P7.G(cxx.f2132R, null);
        }
        long j = phu.X;
        List list = phu.f7173R;
        if (list == null) {
            list = fcD.R;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nHW nhw = (nHW) list.get(i);
            long O = aWo.O(nhw.v, j);
            j = nhw.v;
            long L = aWo.L(cxx.f2131R, O);
            cxx.f2131R = L;
            long j2 = nhw.R;
            int i2 = (cxx.R + 1) % 20;
            cxx.R = i2;
            cxx.f2132R[i2] = new Cfor(L, j2);
        }
        long L2 = aWo.L(cxx.f2131R, aWo.O(phu.c, j));
        cxx.f2131R = L2;
        long j3 = phu.v;
        int i3 = (cxx.R + 1) % 20;
        cxx.R = i3;
        cxx.f2132R[i3] = new Cfor(L2, j3);
    }

    public static final boolean P(phU phu, long j) {
        long j2 = phu.c;
        float e2 = aWo.e(j2);
        float X2 = aWo.X(j2);
        return e2 < 0.0f || e2 > ((float) ((int) (j >> 32))) || X2 < 0.0f || X2 > ((float) ltH.v(j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.cRR r16, defpackage.ncu r17, defpackage.gL6 r18, defpackage.iv7 r19, defpackage.m88 r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1P.R(cRR, ncu, gL6, iv7, m88, int, int):void");
    }

    public static final aoA U(Context context) {
        _2 _2 = _2.R;
        _2.R(context, 17170461);
        long R2 = _2.R(context, 17170462);
        long R3 = _2.R(context, 17170463);
        long R4 = _2.R(context, 17170464);
        _2.R(context, 17170465);
        _2.R(context, 17170466);
        _2.R(context, 17170467);
        _2.R(context, 17170468);
        _2.R(context, 17170469);
        _2.R(context, 17170470);
        long R5 = _2.R(context, 17170471);
        long R6 = _2.R(context, 17170472);
        _2.R(context, 17170473);
        _2.R(context, 17170474);
        _2.R(context, 17170475);
        _2.R(context, 17170476);
        long R7 = _2.R(context, 17170477);
        long R8 = _2.R(context, 17170478);
        _2.R(context, 17170479);
        long R9 = _2.R(context, 17170480);
        long R10 = _2.R(context, 17170481);
        _2.R(context, 17170482);
        long R11 = _2.R(context, 17170483);
        _2.R(context, 17170484);
        _2.R(context, 17170485);
        _2.R(context, 17170486);
        long R12 = _2.R(context, 17170487);
        _2.R(context, 17170488);
        _2.R(context, 17170489);
        long R13 = _2.R(context, 17170490);
        long R14 = _2.R(context, 17170491);
        _2.R(context, 17170492);
        _2.R(context, 17170493);
        _2.R(context, 17170494);
        long R15 = _2.R(context, 17170495);
        long R16 = _2.R(context, 17170496);
        long R17 = _2.R(context, 17170497);
        long R18 = _2.R(context, 17170498);
        _2.R(context, 17170499);
        long R19 = _2.R(context, 17170500);
        _2.R(context, 17170501);
        _2.R(context, 17170502);
        long R20 = _2.R(context, 17170503);
        long R21 = _2.R(context, 17170504);
        _2.R(context, 17170505);
        _2.R(context, 17170506);
        _2.R(context, 17170507);
        long R22 = _2.R(context, 17170508);
        long R23 = _2.R(context, 17170509);
        long R24 = _2.R(context, 17170510);
        long R25 = _2.R(context, 17170511);
        _2.R(context, 17170512);
        long R26 = _2.R(context, 17170513);
        _2.R(context, 17170514);
        _2.R(context, 17170515);
        long R27 = _2.R(context, 17170516);
        long R28 = _2.R(context, 17170517);
        _2.R(context, 17170518);
        _2.R(context, 17170519);
        _2.R(context, 17170520);
        long R29 = _2.R(context, 17170521);
        long R30 = _2.R(context, 17170522);
        long R31 = _2.R(context, 17170523);
        long R32 = _2.R(context, 17170524);
        _2.R(context, 17170525);
        return new aoA(R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, R21, R22, R23, R24, R25, R26, R27, R28, R29, R30, R31, R32);
    }

    public static final void X(boolean z, bSG bsg, fBS fbs, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-1344558920);
        Boolean valueOf = Boolean.valueOf(z);
        jr_.w(511388516);
        boolean O = jr_.O(valueOf) | jr_.O(fbs);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = new diY(fbs, z);
            jr_.ZW(I);
        }
        jr_.g(false);
        ojR ojr = (ojR) I;
        long m = fbs.m(z);
        boolean O2 = odN.O(fbs.x().R);
        ncu R2 = lCG.R(aff.R, ojr, new peo(ojr, null));
        int i2 = i << 3;
        g4x.Z(m, z, bsg, O2, R2, null, jr_, 196608 | (i2 & 112) | (i2 & 896));
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new oK0(z, bsg, fbs, i);
        }
    }

    public static final void Y(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final void c(m9D m9d, oey oey, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(3173830);
        if ((i & 14) == 0) {
            i2 = (jr_.O(m9d) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.O(oey) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && jr_.J()) {
            jr_.E();
        } else if (m9d.L() > 0) {
            oey.x(m9d);
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(m9d, oey, i, 1);
        }
    }

    public static final long e(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        int i = nqW.R;
        return floatToIntBits2;
    }

    public static final boolean g(fBS fbs, boolean z) {
        hjM hjm;
        kY5 ky5 = fbs.f3345R;
        if (ky5 == null || (hjm = ky5.f5338R) == null) {
            return false;
        }
        gIA C = ooA.C(hjm);
        long O = hjm.O(aH9.N(C.f3720R, C.v));
        long O2 = hjm.O(aH9.N(C.c, C.e));
        float e2 = aWo.e(O);
        float X2 = aWo.X(O);
        float e3 = aWo.e(O2);
        float X3 = aWo.X(O2);
        long m = fbs.m(z);
        float e4 = aWo.e(m);
        if (!(e2 <= e4 && e4 <= e3)) {
            return false;
        }
        float X4 = aWo.X(m);
        return (X2 > X4 ? 1 : (X2 == X4 ? 0 : -1)) <= 0 && (X4 > X3 ? 1 : (X4 == X3 ? 0 : -1)) <= 0;
    }

    public static final boolean j(phU phu, long j, long j2) {
        if (!(phu.R == 1)) {
            return P(phu, j);
        }
        long j3 = phu.c;
        float e2 = aWo.e(j3);
        float X2 = aWo.X(j3);
        return e2 < (-nqW.e(j2)) || e2 > nqW.e(j2) + ((float) ((int) (j >> 32))) || X2 < (-nqW.v(j2)) || X2 > nqW.v(j2) + ((float) ltH.v(j));
    }

    public static final boolean m(phU phu) {
        return !phu.f7176v && phu.f7175R;
    }

    public static final laH o(ArrayList arrayList, ArrayList arrayList2) {
        float f;
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        } else if (!arrayList.isEmpty()) {
            int i = 2;
            if (2 >= arrayList.size()) {
                i = arrayList.size() - 1;
            }
            ArrayList arrayList3 = new ArrayList(3);
            for (int i2 = 0; i2 < 3; i2++) {
                arrayList3.add(Float.valueOf(0.0f));
            }
            int size = arrayList.size();
            int i3 = i + 1;
            gL6 gl6 = new gL6(i3, size);
            int i4 = 0;
            while (true) {
                f = 1.0f;
                if (i4 >= size) {
                    break;
                }
                gl6.g(0, i4, 1.0f);
                for (int i5 = 1; i5 < i3; i5++) {
                    gl6.g(i5, i4, ((Number) arrayList.get(i4)).floatValue() * gl6.H(i5 - 1, i4));
                }
                i4++;
            }
            gL6 gl62 = new gL6(i3, size);
            gL6 gl63 = new gL6(i3, i3);
            int i6 = 0;
            while (i6 < i3) {
                for (int i7 = 0; i7 < size; i7++) {
                    gl62.g(i6, i7, gl6.H(i6, i7));
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    float e2 = gl62.N(i6).e(gl62.N(i8));
                    for (int i9 = 0; i9 < size; i9++) {
                        gl62.g(i6, i9, gl62.H(i6, i9) - (gl62.H(i8, i9) * e2));
                    }
                }
                c85 N = gl62.N(i6);
                float sqrt = (float) Math.sqrt((double) N.e(N));
                if (((double) sqrt) >= 1.0E-6d) {
                    float f2 = 1.0f / sqrt;
                    for (int i10 = 0; i10 < size; i10++) {
                        gl62.g(i6, i10, gl62.H(i6, i10) * f2);
                    }
                    int i11 = 0;
                    while (i11 < i3) {
                        gl63.g(i6, i11, i11 < i6 ? 0.0f : gl62.N(i6).e(gl6.N(i11)));
                        i11++;
                    }
                    i6++;
                } else {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
            }
            c85 c85 = new c85(size, 1);
            for (int i12 = 0; i12 < size; i12++) {
                ((Float[]) c85.R)[i12] = Float.valueOf(((Number) arrayList2.get(i12)).floatValue() * 1.0f);
            }
            int i13 = i3 - 1;
            for (int i14 = i13; -1 < i14; i14--) {
                arrayList3.set(i14, Float.valueOf(gl62.N(i14).e(c85)));
                int i15 = i14 + 1;
                if (i15 <= i13) {
                    int i16 = i13;
                    while (true) {
                        arrayList3.set(i14, Float.valueOf(((Number) arrayList3.get(i14)).floatValue() - (((Number) arrayList3.get(i16)).floatValue() * gl63.H(i14, i16))));
                        if (i16 != i15) {
                            i16--;
                        }
                    }
                }
                arrayList3.set(i14, Float.valueOf(((Number) arrayList3.get(i14)).floatValue() / gl63.H(i14, i14)));
            }
            float f3 = 0.0f;
            for (int i17 = 0; i17 < size; i17++) {
                f3 += ((Number) arrayList2.get(i17)).floatValue();
            }
            float f4 = f3 / ((float) size);
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i18 = 0; i18 < size; i18++) {
                float floatValue = ((Number) arrayList2.get(i18)).floatValue() - ((Number) arrayList3.get(0)).floatValue();
                float f7 = 1.0f;
                for (int i19 = 1; i19 < i3; i19++) {
                    f7 *= ((Number) arrayList.get(i18)).floatValue();
                    floatValue -= ((Number) arrayList3.get(i19)).floatValue() * f7;
                }
                f5 += floatValue * 1.0f * floatValue;
                float floatValue2 = ((Number) arrayList2.get(i18)).floatValue() - f4;
                f6 = (floatValue2 * 1.0f * floatValue2) + f6;
            }
            if (f6 > 1.0E-6f) {
                f = 1.0f - (f5 / f6);
            }
            return new laH(arrayList3, f);
        } else {
            throw new IllegalArgumentException("At least one point must be provided");
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x026b A[LOOP:0: B:160:0x0269->B:161:0x026b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02fa A[LOOP:1: B:173:0x02f8->B:174:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03cf A[LOOP:2: B:191:0x03cb->B:193:0x03cf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0495 A[LOOP:3: B:208:0x0493->B:209:0x0495, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0562 A[LOOP:4: B:236:0x0560->B:237:0x0562, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05df A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(defpackage.ncu r37, defpackage.oey r38, defpackage.ngd r39, boolean r40, boolean r41, defpackage.n4N r42, boolean r43, defpackage.vV r44, defpackage.C0 r45, defpackage.ky r46, defpackage.h8 r47, defpackage.kg9 r48, defpackage.m88 r49, int r50, int r51, int r52) {
        /*
        // Method dump skipped, instructions count: 1599
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1P.v(ncu, oey, ngd, boolean, boolean, n4N, boolean, vV, C0, ky, h8, kg9, m88, int, int, int):void");
    }

    public static final boolean x(phU phu) {
        return !phu.v() && phu.f7176v && !phu.f7175R;
    }

    public static final boolean y(m88 m88) {
        return (((Configuration) ((jr_) m88).x(ur.R)).uiMode & 48) == 32;
    }

    public void L(int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable(i) { // from class: ewb
            public final /* synthetic */ int e;

            {
                this.e = r2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n1P.this.t(this.e);
            }
        });
    }

    public abstract void V(Typeface typeface, boolean z);

    public void Z(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new hAh(this, 0, typeface));
    }

    public abstract void i(Typeface typeface);

    public abstract void t(int i);
}
