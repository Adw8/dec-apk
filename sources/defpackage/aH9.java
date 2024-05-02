package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aH9  reason: default package */
/* loaded from: classes.dex */
public abstract class aH9 {
    public static final int[] R = {R.attr.colorPrimary};
    public static final int[] v = {R.attr.colorPrimaryVariant};

    public static int A(btj btj, g2N g2n, View view, View view2, kds kds, boolean z) {
        if (kds.o() == 0 || btj.v() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return btj.v();
        }
        return (int) ((((float) (g2n.v(view2) - g2n.e(view))) / ((float) (Math.abs(kds.n(view) - kds.n(view2)) + 1))) * ((float) btj.v()));
    }

    public static final hUv B(fue fue) {
        j28 j28;
        Object obj = fue.f3600R.e;
        if ((((j28) obj).X & 8) != 0) {
            j28 = (j28) obj;
            while (j28 != null) {
                if ((j28.e & 8) == 0 || !(j28 instanceof hUv) || !((hUv) j28).e().f5221R) {
                    if ((j28.X & 8) == 0) {
                        break;
                    }
                    j28 = j28.c;
                } else {
                    break;
                }
            }
        }
        j28 = null;
        return (hUv) j28;
    }

    public static final String BF(aOO aoo) {
        Object obj;
        if (aoo instanceof na6) {
            return aoo.toString();
        }
        try {
            obj = aoo + '@' + G(aoo);
        } catch (Throwable th) {
            obj = new bvw(th);
        }
        if (mwl.R(obj) != null) {
            obj = aoo.getClass().getName() + '@' + G(aoo);
        }
        return (String) obj;
    }

    public static final void C(lR3 lr3, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(674185128);
        if ((i & 14) == 0) {
            i2 = (jr_.O(lr3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !jr_.J()) {
            owM owm = hcN.R;
            e9w e9w = (e9w) jr_.x(owm);
            iJF ijf = iJF.i;
            a9k a9k = new a9k(e9w, 1);
            k_s k_s = e29.R;
            gx6 gx6 = (gx6) cpc.T(new Object[]{e9w}, new k_s(ijf, a9k), new q4(1, e9w), jr_, 4);
            l6.R(new bkv[]{owm.v(gx6)}, I(jr_, 1863926504, new _a(gx6, lr3, i2, 2)), jr_, 56);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new hhc(lr3, i, 0);
        }
    }

    public static final float D(long j) {
        u_ O = n3.O(j);
        if (q2.R(O.f7426R, q2.f7347R)) {
            lEB leb = ((dHi) O).f2555v;
            double doubleValue = ((Number) leb.x(Double.valueOf((double) n3.Z(j)))).doubleValue();
            double doubleValue2 = ((Number) leb.x(Double.valueOf((double) n3.X(j)))).doubleValue() * 0.0722d;
            float doubleValue3 = (float) (doubleValue2 + (((Number) leb.x(Double.valueOf((double) n3.L(j)))).doubleValue() * 0.7152d) + (doubleValue * 0.2126d));
            if (doubleValue3 <= 0.0f) {
                return 0.0f;
            }
            if (doubleValue3 >= 1.0f) {
                return 1.0f;
            }
            return doubleValue3;
        }
        StringBuilder U = opT.U("The specified color must be encoded in an RGB color space. The supplied color space is ");
        U.append((Object) q2.v(O.f7426R));
        throw new IllegalArgumentException(U.toString().toString());
    }

    public static final boolean E(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 == 0.0f) {
            return false;
        }
        float f30 = 1.0f / f29;
        fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
        fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
        fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
        fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
        fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
        float f32 = -f13;
        fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
        fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
        fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
        fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
        fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
        fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
        fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
        fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
        fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
        fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        return true;
    }

    public static final long F(long j, long j2, float f) {
        dSD dsd = K6.f227R;
        long R2 = n3.R(j, dsd);
        long R3 = n3.R(j2, dsd);
        float e = n3.e(R2);
        float Z = n3.Z(R2);
        float L = n3.L(R2);
        float X = n3.X(R2);
        float e2 = n3.e(R3);
        float Z2 = n3.Z(R3);
        float L2 = n3.L(R3);
        float X2 = n3.X(R3);
        return n3.R(e(hDC.z(Z, Z2, f), hDC.z(L, L2, f), hDC.z(X, X2, f), hDC.z(e, e2, f), dsd), n3.O(j2));
    }

    public static final String G(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void H(defpackage.ncu r29, defpackage.oey r30, defpackage.ngd r31, boolean r32, defpackage.C0 r33, defpackage.vV r34, defpackage.n4N r35, boolean r36, defpackage.kg9 r37, defpackage.m88 r38, int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 582
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aH9.H(ncu, oey, ngd, boolean, C0, vV, n4N, boolean, kg9, m88, int, int):void");
    }

    public static final dNH I(m88 m88, int i, k8G k8g) {
        dNH dnh;
        jr_ jr_ = (jr_) m88;
        jr_.w(i);
        Object I = jr_.I();
        if (I == ppN.R) {
            dnh = new dNH(i, true);
            jr_.ZW(dnh);
        } else {
            dnh = (dNH) I;
        }
        dnh.O(k8g);
        jr_.g(false);
        return dnh;
    }

    public static void J(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hDC.G, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                h(context, v, "Theme.MaterialComponents");
            }
        }
        h(context, R, "Theme.AppCompat");
    }

    public static final float K(ngd ngd, mdz mdz) {
        return mdz == mdz.Ltr ? ngd.e(mdz) : ngd.c(mdz);
    }

    public static long L(int i, int i2, int i3) {
        return X(((i & 255) << 16) | -16777216 | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final eXo M(View view) {
        eXo exo = (eXo) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (exo != null) {
            return exo;
        }
        eXo exo2 = new eXo();
        view.setTag(R.id.pooling_container_listener_holder_tag, exo2);
        return exo2;
    }

    public static final long N(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        int i = aWo.R;
        return floatToIntBits2;
    }

    public static final long O(long j) {
        long j2 = (j & 4294967295L) << 32;
        int i = n3.R;
        return j2;
    }

    public static nhj P(float f) {
        return new nhj((float) 0, (float) 0, (float) 0, f);
    }

    public static int Q(btj btj, g2N g2n, View view, View view2, kds kds, boolean z, boolean z2) {
        if (kds.o() == 0 || btj.v() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (btj.v() - Math.max(kds.n(view), kds.n(view2))) - 1) : Math.max(0, Math.min(kds.n(view), kds.n(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(g2n.v(view2) - g2n.e(view))) / ((float) (Math.abs(kds.n(view) - kds.n(view2)) + 1)))) + ((float) (g2n.Z() - g2n.e(view))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x01f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.bz r24, defpackage.ncu r25, defpackage.kMk r26, defpackage.kg9 r27, int r28, boolean r29, int r30, java.util.Map r31, defpackage.m88 r32, int r33, int r34) {
        /*
        // Method dump skipped, instructions count: 978
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aH9.R(bz, ncu, kMk, kg9, int, boolean, int, java.util.Map, m88, int, int):void");
    }

    public static final ncu S(ncu ncu, kg9 kg9) {
        return ncu.I(new lnt(kg9));
    }

    public static final adL T(View view) {
        bQO bqo = new bQO(new g_R(new k0v(a6.l(view, g5M.X), g5M.O, 2), false, g5M.J));
        return (adL) (!bqo.hasNext() ? null : bqo.next());
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void U(defpackage.ncu r29, defpackage.oey r30, defpackage.ngd r31, boolean r32, defpackage.h8 r33, defpackage.ky r34, defpackage.n4N r35, boolean r36, defpackage.kg9 r37, defpackage.m88 r38, int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 583
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aH9.U(ncu, oey, ngd, boolean, h8, ky, n4N, boolean, kg9, m88, int, int):void");
    }

    public static final int V(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final void W(fue fue, List list) {
        biT P = fue.P();
        int i = P.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = P.f1772R;
            do {
                fue fue2 = (fue) objArr[i2];
                hUv l = l(fue2);
                if (l != null) {
                    list.add(l);
                } else {
                    W(fue2, list);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final long X(int i) {
        long j = ((long) i) << 32;
        int i2 = n3.R;
        return j;
    }

    public static ncu X4(ncu ncu, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = (float) 0;
        }
        if ((i & 2) != 0) {
            f2 = (float) 0;
        }
        return ncu.I(new mP0(f, f2, f, f2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Y(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = defpackage.hDC.G
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0012
            r0.recycle()
            return
        L_0x0012:
            r1 = -1
            int r3 = r9.length
            if (r3 != 0) goto L_0x001d
            int r4 = r0.getResourceId(r2, r1)
            if (r4 == r1) goto L_0x0038
            goto L_0x0037
        L_0x001d:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L_0x0023:
            if (r6 >= r5) goto L_0x0034
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L_0x0031
            r4.recycle()
            goto L_0x0038
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0034:
            r4.recycle()
        L_0x0037:
            r2 = 1
        L_0x0038:
            r0.recycle()
            if (r2 == 0) goto L_0x003e
            return
        L_0x003e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aH9.Y(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Z(boolean r21, defpackage.f_c r22, defpackage.ncu r23, long r24, defpackage.cvV r26, defpackage.lR3 r27, defpackage.m88 r28, int r29, int r30) {
        /*
        // Method dump skipped, instructions count: 497
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aH9.Z(boolean, f_c, ncu, long, cvV, lR3, m88, int, int):void");
    }

    public static void ZW(Drawable drawable, PorterDuff.Mode mode) {
        cAO.m(drawable, mode);
    }

    public static final ncu _(ncu ncu, ngd ngd) {
        return ncu.I(new btN(ngd));
    }

    public static final long a(long j, long j2, float f) {
        return N(hDC.z(aWo.e(j), aWo.e(j2), f), hDC.z(aWo.X(j), aWo.X(j2), f));
    }

    public static final dNH b(ncu ncu) {
        return u(new x9(6, ncu), true, -1586257396);
    }

    public static final void c(ncu ncu, kg9 kg9, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-932836462);
        if ((i & 14) == 0) {
            i2 = (jr_.O(ncu) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.O(kg9) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !jr_.J()) {
            dTl.x(S(ncu, kg9), jr_, 0);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(ncu, kg9, i, 0);
        }
    }

    public static final void cE(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final void cr(View view, adL adl) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, adl);
    }

    public static final void d(pm5 pm5, Gp gp, a1 a1Var, float f, hpO hpo, ari ari) {
        ArrayList arrayList = pm5.f7261v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pps pps = (pps) arrayList.get(i);
            lz.O(pps.f7288R, gp, a1Var, f, hpo, ari);
            gp.g(0.0f, pps.f7288R.v());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long e(float r10, float r11, float r12, float r13, defpackage.u_ r14) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aH9.e(float, float, float, float, u_):long");
    }

    public static final boolean f(long j) {
        int i = aWo.R;
        return j != aWo.e;
    }

    public static final void g(n67 n67, ncu ncu, iv7 iv7, m88 m88, int i, int i2) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-511989831);
        if ((i2 & 2) != 0) {
            ncu = aff.R;
        }
        ngM W = l6.W(jr_);
        ncu I = g4x.I(jr_, ncu);
        jJj jjj = (jJj) jr_.x(lnF.X);
        mdz mdz = (mdz) jr_.x(lnF.H);
        bUo buo = (bUo) jr_.x(lnF.P);
        fme fme = fme.O;
        jr_.w(1886828752);
        if (jr_.f5052R instanceof Su) {
            jr_.D();
            if (jr_.f5050L) {
                jr_.H(new _d(fme, 5));
            } else {
                jr_.BF();
            }
            l6.p(jr_, n67, n67.f6304R);
            l6.p(jr_, W, n67.v);
            l6.p(jr_, iv7, n67.c);
            h1U.R.getClass();
            l6.p(jr_, jjj, igT.v);
            l6.p(jr_, mdz, igT.e);
            l6.p(jr_, buo, igT.X);
            l6.p(jr_, I, igT.f4693R);
            jr_.g(true);
            jr_.g(false);
            jr_.w(-607848778);
            if (!jr_.J()) {
                caw.L(new q4(11, n67), jr_);
            }
            jr_.g(false);
            h0T s = l6.s(n67, jr_);
            o8s o8s = o8s.R;
            jr_.w(1157296644);
            boolean O = jr_.O(s);
            Object I2 = jr_.I();
            if (O || I2 == ppN.R) {
                I2 = new jb4(s, 5);
                jr_.ZW(I2);
            }
            jr_.g(false);
            caw.v(o8s, (kg9) I2, jr_);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new iW6(n67, ncu, iv7, i, i2, 1);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static void h(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(jQ.C("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static void iE(Drawable drawable, int i) {
        cAO.L(drawable, i);
    }

    public static final void j(ncu ncu, iv7 iv7, m88 m88, int i, int i2) {
        int i3;
        ncu ncu2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (jr_.O(ncu) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= jr_.O(iv7) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !jr_.J()) {
            ncu2 = i4 != 0 ? aff.R : ncu;
            jr_.w(-492369756);
            Object I = jr_.I();
            if (I == ppN.R) {
                I = new n67(dq.m);
                jr_.ZW(I);
            }
            jr_.g(false);
            int i5 = i3 << 3;
            g((n67) I, ncu2, iv7, jr_, (i5 & 112) | 8 | (i5 & 896), 0);
        } else {
            jr_.E();
            ncu2 = ncu;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new mX1(ncu2, iv7, i, i2, 1);
        }
    }

    public static final float[] k(long j) {
        return new float[]{n3.Z(j), n3.L(j), n3.X(j), n3.e(j)};
    }

    public static final hUv l(fue fue) {
        j28 j28;
        Object obj = fue.f3600R.e;
        if ((((j28) obj).X & 8) != 0) {
            j28 = (j28) obj;
            while (j28 != null) {
                if ((j28.e & 8) == 0 || !(j28 instanceof hUv)) {
                    if ((j28.X & 8) == 0) {
                        break;
                    }
                    j28 = j28.c;
                } else {
                    break;
                }
            }
        }
        j28 = null;
        return (hUv) j28;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(defpackage.iv7 r34, defpackage.f_c r35, defpackage.ncu r36, defpackage.iv7 r37, defpackage.iv7 r38, boolean r39, defpackage.miv r40, defpackage.ngd r41, defpackage.p2E r42, defpackage.m88 r43, int r44, int r45) {
        /*
        // Method dump skipped, instructions count: 573
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aH9.m(iv7, f_c, ncu, iv7, iv7, boolean, miv, ngd, p2E, m88, int, int):void");
    }

    public static final ncu mL(ncu ncu, float f) {
        return ncu.I(new mP0(f, f, f, f));
    }

    public static int n(btj btj, g2N g2n, View view, View view2, kds kds, boolean z) {
        if (kds.o() == 0 || btj.v() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(kds.n(view) - kds.n(view2)) + 1;
        }
        return Math.min(g2n.m(), g2n.v(view2) - g2n.e(view));
    }

    public static final float o(ngd ngd, mdz mdz) {
        return mdz == mdz.Ltr ? ngd.c(mdz) : ngd.e(mdz);
    }

    public static Drawable p(Context context, int i) {
        return gNS.c().X(context, i);
    }

    public static void q(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static final Rect r(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 + -1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    oHF.R(textPaint2, charSequence, i3, nextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        oHF.R(textPaint, charSequence, i3, i2, rect3);
        return rect3;
    }

    public static nu_ s(View view) {
        nu_ nu_ = (nu_) view.getTag(R.id.view_tree_lifecycle_owner);
        if (nu_ != null) {
            return nu_;
        }
        ViewParent parent = view.getParent();
        while (nu_ == null && (parent instanceof View)) {
            View view2 = (View) parent;
            nu_ = (nu_) view2.getTag(R.id.view_tree_lifecycle_owner);
            parent = view2.getParent();
        }
        return nu_;
    }

    public static final fue t(fue fue, lBz lbz) {
        for (fue N = fue.N(); N != null; N = N.N()) {
            if (((Boolean) lbz.x(N)).booleanValue()) {
                return N;
            }
        }
        return null;
    }

    public static final dNH u(k8G k8g, boolean z, int i) {
        dNH dnh = new dNH(i, z);
        dnh.O(k8g);
        return dnh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01ea, code lost:
        if (r5.f2509R == r12) goto L_0x020a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(java.lang.String r27, defpackage.ncu r28, defpackage.kMk r29, defpackage.kg9 r30, int r31, boolean r32, int r33, defpackage.m88 r34, int r35, int r36) {
        /*
        // Method dump skipped, instructions count: 756
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aH9.v(java.lang.String, ncu, kMk, kg9, int, boolean, int, m88, int, int):void");
    }

    public static final boolean vl(dYh dyh, dYh dyh2) {
        boolean z;
        if (dyh != null) {
            if (dyh.f2665R != null) {
                WB wb = dyh.f2663R;
                if (wb != null ? wb.R() : false) {
                    z = true;
                    if (z && !n3x.v(dyh, dyh2) && !n3x.v(dyh.f2663R, dyh2.f2663R)) {
                        return false;
                    }
                }
            }
            z = false;
            if (z) {
                return false;
            }
        }
        return true;
    }

    public static void vr(View view, nu_ nu_) {
        view.setTag(R.id.view_tree_lifecycle_owner, nu_);
    }

    public static final int vz(long j) {
        u_ O = n3.O(j);
        if (O.e()) {
            return (int) (j >>> 32);
        }
        float[] k = k(j);
        msU.n(O, null, 3).R(k);
        return ((int) ((k[2] * 255.0f) + 0.5f)) | (((int) ((k[3] * 255.0f) + 0.5f)) << 24) | (((int) ((k[0] * 255.0f) + 0.5f)) << 16) | (((int) ((k[1] * 255.0f) + 0.5f)) << 8);
    }

    public static TypedArray w(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        J(context, attributeSet, i, i2);
        Y(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static final long x(int i) {
        long j = (((long) i) << 32) | (((long) 0) & 4294967295L);
        int i2 = nQJ.R;
        return j;
    }

    public static void xN(Drawable drawable, ColorStateList colorStateList) {
        cAO.Z(drawable, colorStateList);
    }

    public static final long y(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        int i = b3a.R;
        return floatToIntBits2;
    }

    public static final long z(long j, long j2) {
        long R2 = n3.R(j, n3.O(j2));
        float e = n3.e(j2);
        float e2 = n3.e(R2);
        float f = 1.0f - e2;
        float f2 = (e * f) + e2;
        float f3 = 0.0f;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        boolean z = true;
        float Z = i == 0 ? 0.0f : (((n3.Z(j2) * e) * f) + (n3.Z(R2) * e2)) / f2;
        float L = i == 0 ? 0.0f : (((n3.L(j2) * e) * f) + (n3.L(R2) * e2)) / f2;
        float X = n3.X(R2);
        float X2 = n3.X(j2);
        if (i != 0) {
            z = false;
        }
        if (!z) {
            f3 = (((X2 * e) * f) + (X * e2)) / f2;
        }
        return e(Z, L, f3, f2, n3.O(j2));
    }

    public static ncu zw(ncu ncu, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = (float) 0;
        }
        if ((i & 2) != 0) {
            f2 = (float) 0;
        }
        if ((i & 4) != 0) {
            f3 = (float) 0;
        }
        if ((i & 8) != 0) {
            f4 = (float) 0;
        }
        return ncu.I(new mP0(f, f2, f3, f4));
    }

    public abstract int i(int i, mdz mdz);
}
