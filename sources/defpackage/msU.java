package defpackage;

import android.view.MotionEvent;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: msU  reason: default package */
/* loaded from: classes.dex */
public abstract class msU {

    /* renamed from: R  reason: collision with other field name */
    public static final i4B f6214R = new i4B(1.0f, 1.0f);
    public static final aYa R = new aYa(16);

    public static final pi1 A(pi1 pi1) {
        int ordinal = pi1.f7192R.ordinal();
        if (ordinal == 0) {
            return pi1;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return pi1;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new j8f((Object) null);
                    }
                }
            }
            return null;
        }
        pi1 pi12 = pi1.f7197v;
        if (pi12 != null) {
            return A(pi12);
        }
        return null;
    }

    public static final int B(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final gzG BF(kTd ktd) {
        return vz(ktd).f3595R;
    }

    public static final j28 C(kTd ktd, int i) {
        j28 j28 = ((j28) ktd).R.c;
        if (j28 != null && (j28.X & i) != 0) {
            while (j28 != null) {
                int i2 = j28.e;
                if ((i2 & 2) != 0) {
                    break;
                } else if ((i2 & i) != 0) {
                    return j28;
                } else {
                    j28 = j28.c;
                }
            }
        }
        return null;
    }

    public static final boolean D(oSr osr) {
        return ((j28) osr).R.f4792R;
    }

    public static final void E(pi1 pi1) {
        mgi mgi;
        int ordinal = pi1.f7192R.ordinal();
        if (!(ordinal == 0 || ordinal == 1)) {
            if (ordinal == 2) {
                mgi = mgi.Captured;
                pi1.U(mgi);
            } else if (ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            } else if (ordinal != 5) {
                throw new j8f((Object) null);
            }
        }
        mgi = mgi.Active;
        pi1.U(mgi);
    }

    public static final float[] F(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final oG1 G(cxM cxm) {
        Object R2 = cxm.R();
        if (R2 instanceof oG1) {
            return (oG1) R2;
        }
        return null;
    }

    public static final int H(emQ emq, XI xi) {
        int i;
        emQ hi = emq.hi();
        if (!(hi != null)) {
            throw new IllegalStateException(("Child of " + emq + " cannot be null when calculating alignment line").toString());
        } else if (emq.c0().R().containsKey(xi)) {
            Integer num = (Integer) emq.c0().R().get(xi);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        } else {
            int P = hi.P(xi);
            if (P == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            hi.R = true;
            emq.v = true;
            emq.k8();
            hi.R = false;
            emq.v = false;
            if (xi instanceof fcC) {
                i = dU5.v(hi.wW());
            } else {
                long wW = hi.wW();
                int i2 = dU5.R;
                i = (int) (wW >> 32);
            }
            return i + P;
        }
    }

    public static final h0T I(j4B j4b, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        Object x = jQ.x(jr_, -1805515472, -492369756);
        f1A f1a = ppN.R;
        if (x == f1a) {
            x = l6.n(Boolean.FALSE);
            jr_.ZW(x);
        }
        jr_.g(false);
        h0T h0t = (h0T) x;
        jr_.w(511388516);
        boolean O = jr_.O(j4b) | jr_.O(h0t);
        Object I = jr_.I();
        if (O || I == f1a) {
            I = new feB(j4b, h0t, null);
            jr_.ZW(I);
        }
        jr_.g(false);
        caw.e(j4b, (iv7) I, jr_);
        jr_.g(false);
        return h0t;
    }

    public static final boolean J(pi1 pi1) {
        pi1 pi12 = pi1.f7197v;
        if (pi12 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (!Y(pi12, false)) {
            return false;
        } else {
            pi1.f7197v = null;
            return true;
        }
    }

    public static final float[] K(float[] fArr, float[] fArr2, float[] fArr3) {
        vl(fArr, fArr2);
        vl(fArr, fArr3);
        return X4(F(fArr), zw(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final gzG Kl(fue fue) {
        gzG gzg = fue.f3595R;
        if (gzg != null) {
            return gzg;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }

    public static final long L(float f, boolean z) {
        return ((z ? 1 : 0) & 4294967295L) | (((long) Float.floatToIntBits(f)) << 32);
    }

    public static final float M(oG1 og1) {
        if (og1 != null) {
            return og1.R;
        }
        return 0.0f;
    }

    public static final void N(fue fue, biT bit, kg9 kg9) {
        biT j = fue.j();
        int i = j.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = j.f1772R;
            do {
                fue fue2 = (fue) objArr[i2];
                if (bit.e <= i2) {
                    bit.v(kg9.x(fue2));
                } else {
                    Object x = kg9.x(fue2);
                    Object[] objArr2 = bit.f1772R;
                    Object obj = objArr2[i2];
                    objArr2[i2] = x;
                }
                i2++;
            } while (i2 < i);
            bit.P(fue.H().size(), bit.e);
        }
        bit.P(fue.H().size(), bit.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void O(defpackage.f_c r31, defpackage.ncu r32, boolean r33, defpackage.n76 r34, defpackage.T_ r35, defpackage.fO r36, defpackage.lf r37, defpackage.ngd r38, defpackage.p2E r39, defpackage.lR3 r40, defpackage.m88 r41, int r42, int r43) {
        /*
        // Method dump skipped, instructions count: 631
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msU.O(f_c, ncu, boolean, n76, T_, fO, lf, ngd, p2E, lR3, m88, int, int):void");
    }

    public static final biT P(pi1 pi1) {
        boolean z;
        biT bit = pi1.f7186R;
        int i = bit.e;
        if (i <= 0) {
            z = false;
            break;
        }
        Object[] objArr = bit.f1772R;
        int i2 = 0;
        while (!((pi1) objArr[i2]).f7192R.R()) {
            i2++;
            if (i2 >= i) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            return pi1.f7186R;
        }
        biT bit2 = new biT(new pi1[16]);
        biT bit3 = pi1.f7186R;
        int i3 = bit3.e;
        if (i3 <= 0) {
            return bit2;
        }
        Object[] objArr2 = bit3.f1772R;
        int i4 = 0;
        do {
            pi1 pi12 = (pi1) objArr2[i4];
            if (!pi12.f7192R.R()) {
                bit2.v(pi12);
            } else {
                jzQ jzq = (jzQ) pi12.f7188R.f2124R.x(new jnj(7));
                if (n3x.v(jzq, jzQ.v)) {
                    return new biT(new pi1[16]);
                }
                if (n3x.v(jzq, jzQ.R)) {
                    bit2.c(bit2.e, P(pi12));
                } else {
                    biT bit4 = jzq.f5170R;
                    int i5 = bit4.e;
                    if (i5 > 0) {
                        Object[] objArr3 = bit4.f1772R;
                        int i6 = 0;
                        do {
                            pi1 x = ((mkt) objArr3[i6]).x();
                            if (x != null) {
                                bit2.v(x);
                            }
                            i6++;
                        } while (i6 < i5);
                    }
                }
            }
            i4++;
        } while (i4 < i3);
        return bit2;
    }

    public static final void Q(pi1 pi1) {
        fue fue;
        gzG gzg;
        cjR focusManager;
        mgi mgi = mgi.Deactivated;
        int ordinal = pi1.f7192R.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                pi1.U(mgi.DeactivatedParent);
                return;
            } else if (ordinal != 2) {
                if (ordinal == 5) {
                    pi1.U(mgi);
                    return;
                }
                return;
            }
        }
        poS pos = pi1.f7195R;
        if (!(pos == null || (fue = pos.f7272R) == null || (gzg = fue.f3595R) == null || (focusManager = gzg.getFocusManager()) == null)) {
            ((o3Z) focusManager).R(true);
        }
        pi1.U(mgi);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.f_c r29, defpackage.ncu r30, boolean r31, defpackage.n76 r32, defpackage.T_ r33, defpackage.fO r34, defpackage.lf r35, defpackage.ngd r36, defpackage.p2E r37, defpackage.lR3 r38, defpackage.m88 r39, int r40, int r41) {
        /*
        // Method dump skipped, instructions count: 892
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msU.R(f_c, ncu, boolean, n76, T_, fO, lf, ngd, p2E, lR3, m88, int, int):void");
    }

    public static final pi1 S(pi1 pi1) {
        pi1 S;
        int ordinal = pi1.f7192R.ordinal();
        if (ordinal == 0) {
            return pi1;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return pi1;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new j8f((Object) null);
                    }
                }
            }
            return null;
        }
        pi1 pi12 = pi1.f7197v;
        if (pi12 != null && (S = S(pi12)) != null) {
            return S;
        }
        throw new IllegalStateException("no child".toString());
    }

    public static final gIA T(pi1 pi1) {
        gIA j;
        poS pos = pi1.f7195R;
        if (pos != null && (j = ooA.g(pos).j(pos, false)) != null) {
            return j;
        }
        gIA gia = gIA.R;
        return gIA.R;
    }

    public static final int U(List list, iJF ijf, iJF ijf2, int i, int i2, cEt cet, cEt cet2) {
        boolean z = true;
        if (cet == cet2) {
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            float f = 0.0f;
            for (int i5 = 0; i5 < size; i5++) {
                cxM cxm = (cxM) list.get(i5);
                float M = M(G(cxm));
                int intValue = ((Number) ijf.J(cxm, Integer.valueOf(i))).intValue();
                if (M == 0.0f) {
                    i4 += intValue;
                } else if (M > 0.0f) {
                    f += M;
                    i3 = Math.max(i3, mLz.t(((float) intValue) / M));
                }
            }
            return ((list.size() - 1) * i2) + mLz.t(((float) i3) * f) + i4;
        }
        int min = Math.min((list.size() - 1) * i2, i);
        int size2 = list.size();
        int i6 = 0;
        float f2 = 0.0f;
        for (int i7 = 0; i7 < size2; i7++) {
            cxM cxm2 = (cxM) list.get(i7);
            float M2 = M(G(cxm2));
            if (M2 == 0.0f) {
                int min2 = Math.min(((Number) ijf2.J(cxm2, Integer.MAX_VALUE)).intValue(), i - min);
                min += min2;
                i6 = Math.max(i6, ((Number) ijf.J(cxm2, Integer.valueOf(min2))).intValue());
            } else if (M2 > 0.0f) {
                f2 += M2;
            }
        }
        if (f2 != 0.0f) {
            z = false;
        }
        int t = z ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : mLz.t(((float) Math.max(i - min, 0)) / f2);
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            cxM cxm3 = (cxM) list.get(i8);
            float M3 = M(G(cxm3));
            if (M3 > 0.0f) {
                i6 = Math.max(i6, ((Number) ijf.J(cxm3, Integer.valueOf(t != Integer.MAX_VALUE ? mLz.t(((float) t) * M3) : Integer.MAX_VALUE))).intValue());
            }
        }
        return i6;
    }

    public static final int V(float f) {
        return mLz.t((float) Math.ceil((double) f));
    }

    public static final pi1 W(biT bit, gIA gia, int i) {
        gIA gia2;
        if (i == 3) {
            gia2 = gia.c((gia.c - gia.f3720R) + ((float) 1), 0.0f);
        } else {
            if (i == 4) {
                gia2 = gia.c(-((gia.c - gia.f3720R) + ((float) 1)), 0.0f);
            } else {
                if (i == 5) {
                    gia2 = gia.c(0.0f, (gia.e - gia.v) + ((float) 1));
                } else {
                    if (i == 6) {
                        gia2 = gia.c(0.0f, -((gia.e - gia.v) + ((float) 1)));
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        pi1 pi1 = null;
        int i2 = bit.e;
        if (i2 <= 0) {
            return pi1;
        }
        Object[] objArr = bit.f1772R;
        int i3 = 0;
        do {
            pi1 pi12 = (pi1) objArr[i3];
            if (q(pi12)) {
                gIA T = T(pi12);
                if (b(i, T, gia) && (!b(i, gia2, gia) || y(gia, T, gia2, i) || (!y(gia, gia2, T, i) && w(i, gia, T) < w(i, gia, gia2)))) {
                    pi1 = pi12;
                    gia2 = T;
                }
            }
            i3++;
        } while (i3 < i2);
        return pi1;
    }

    public static final boolean WD(pi1 pi1, int i, _0 _0) {
        int ordinal = pi1.f7192R.ordinal();
        if (ordinal != 0) {
            boolean z = false;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return false;
                    }
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return ((Boolean) _0.x(pi1)).booleanValue();
                        }
                        throw new j8f((Object) null);
                    }
                }
            }
            pi1 pi12 = pi1.f7197v;
            if (pi12 != null) {
                int ordinal2 = pi12.f7192R.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    if (ordinal2 != 5) {
                                        throw new j8f((Object) null);
                                    }
                                }
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    }
                    if (WD(pi12, i, _0)) {
                        return true;
                    }
                    Boolean R2 = ((jzQ) pi12.f7188R.f2126v.x(new jnj(i))).R(_0);
                    if (R2 != null) {
                        return R2.booleanValue();
                    }
                    mgi mgi = pi12.f7192R;
                    if (mgi == mgi.ActiveParent || mgi == mgi.DeactivatedParent) {
                        z = true;
                    }
                    if (z) {
                        pi1 A = A(pi12);
                        if (A != null) {
                            return k(pi1, A, i, _0);
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                return k(pi1, pi12, i, _0);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        return s(pi1, i, _0);
    }

    public static final void X(ncu ncu, iv7 iv7, m88 m88, int i, int i2) {
        int i3;
        ncu ncu2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-2105228848);
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
            h2U h2u = h2U.R;
            jr_.w(-1323940314);
            jJj jjj = (jJj) jr_.x(lnF.X);
            mdz mdz = (mdz) jr_.x(lnF.H);
            bUo buo = (bUo) jr_.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(ncu2);
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                l6.p(jr_, h2u, igT.c);
                l6.p(jr_, jjj, igT.v);
                l6.p(jr_, mdz, igT.e);
                b.y(jQ.m(jr_, buo, igT.X, jr_), jr_, Integer.valueOf((i5 >> 3) & 112));
                jr_.w(2058660585);
                iv7.J(jr_, Integer.valueOf((i5 >> 9) & 14));
                jr_.g(false);
                jr_.g(true);
                jr_.g(false);
            } else {
                l6.u();
                throw null;
            }
        } else {
            jr_.E();
            ncu2 = ncu;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new mX1(ncu2, iv7, i, i2, 0);
        }
    }

    public static final float[] X4(float[] fArr, float[] fArr2) {
        float f = fArr[3];
        float f2 = fArr2[1];
        float f3 = f * f2;
        float f4 = fArr[6];
        float f5 = fArr2[2];
        float f6 = f4 * f5;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = f2 * f9;
        float f11 = fArr[7];
        float f12 = f11 * f5;
        float f13 = fArr[5];
        float f14 = fArr2[1] * f13;
        float f15 = fArr[8];
        float f16 = f5 * f15;
        float f17 = fArr[0];
        float f18 = fArr2[4];
        float f19 = (f * f18) + (fArr2[3] * f17);
        float f20 = fArr2[5];
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        float f24 = fArr[2];
        float f25 = f13 * fArr2[4];
        float f26 = f17 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        float f31 = fArr2[6];
        return new float[]{f6 + f3 + (fArr[0] * fArr2[0]), f12 + f10 + (f7 * f8), f16 + f14 + (fArr[2] * f8), (f4 * f20) + f19, (f11 * f20) + f23 + (f21 * f22), (f20 * f15) + f25 + (f22 * f24), (f4 * f30) + f29, (f11 * f30) + (fArr[4] * f28) + (f21 * f31), (f15 * f30) + (fArr[5] * fArr2[7]) + (f24 * f31)};
    }

    public static final boolean Y(pi1 pi1, boolean z) {
        mgi mgi = mgi.Inactive;
        int ordinal = pi1.f7192R.ordinal();
        if (ordinal == 0) {
            pi1.U(mgi);
        } else if (ordinal == 1) {
            if (J(pi1)) {
                pi1.U(mgi);
            }
            return false;
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    if (J(pi1)) {
                        pi1.U(mgi.Deactivated);
                    }
                    return false;
                } else if (ordinal != 5) {
                    throw new j8f((Object) null);
                }
            }
        } else if (!z) {
            return z;
        } else {
            pi1.U(mgi);
            return z;
        }
        return true;
    }

    public static final void Z(biT bit, j28 j28) {
        biT j = vz(j28).j();
        int i = j.e;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = j.f1772R;
            do {
                bit.v((j28) ((fue) objArr[i2]).f3600R.e);
                i2--;
            } while (i2 >= 0);
        }
    }

    public static final poS ZW(kTd ktd, int i) {
        poS pos = ((j28) ktd).R.f4791R;
        return (pos.ax() == ktd && l(i)) ? pos.f7280R : pos;
    }

    public static final boolean _(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }

    public static ncu a(ncu ncu, float f, float f2, n76 n76, boolean z, int i) {
        float f3 = 0.0f;
        float f4 = (i & 1) != 0 ? 1.0f : 0.0f;
        float f5 = (i & 2) != 0 ? 1.0f : 0.0f;
        float f6 = (i & 4) != 0 ? 1.0f : f;
        float f7 = (i & 256) != 0 ? 0.0f : f2;
        if ((i & 512) != 0) {
            f3 = 8.0f;
        }
        return ncu.I(new lZs(f4, f5, f6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f7, f3, (i & 1024) != 0 ? b3a.v : 0, (i & 2048) != 0 ? cUF.f2104R : n76, (i & 4096) != 0 ? false : z, (i & 16384) != 0 ? nRb.R : 0, (i & 32768) != 0 ? nRb.R : 0));
    }

    public static final boolean b(int i, gIA gia, gIA gia2) {
        if (i == 3) {
            float f = gia2.c;
            float f2 = gia.c;
            if ((f > f2 || gia2.f3720R >= f2) && gia2.f3720R > gia.f3720R) {
                return true;
            }
        } else {
            if (i == 4) {
                float f3 = gia2.f3720R;
                float f4 = gia.f3720R;
                if ((f3 < f4 || gia2.c <= f4) && gia2.c < gia.c) {
                    return true;
                }
            } else {
                if (i == 5) {
                    float f5 = gia2.e;
                    float f6 = gia.e;
                    if ((f5 > f6 || gia2.v >= f6) && gia2.v > gia.v) {
                        return true;
                    }
                } else {
                    if (i == 6) {
                        float f7 = gia2.v;
                        float f8 = gia.v;
                        if ((f7 < f8 || gia2.e <= f8) && gia2.e < gia.e) {
                            return true;
                        }
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(defpackage.f_c r29, defpackage.ncu r30, boolean r31, defpackage.n76 r32, defpackage.T_ r33, defpackage.fO r34, defpackage.lf r35, defpackage.ngd r36, defpackage.p2E r37, defpackage.lR3 r38, defpackage.m88 r39, int r40, int r41) {
        /*
        // Method dump skipped, instructions count: 630
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msU.c(f_c, ncu, boolean, n76, T_, fO, lf, ngd, p2E, lR3, m88, int, int):void");
    }

    public static final void cE(pi1 pi1) {
        fue fue;
        poS pos = pi1.f7195R;
        if (((pos == null || (fue = pos.f7272R) == null) ? null : fue.f3595R) == null) {
            pi1.f7196R = true;
            return;
        }
        int ordinal = pi1.f7192R.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3 || ordinal == 4) {
                        s(pi1, 7, nqF.g);
                        return;
                    } else if (ordinal == 5) {
                        pi1 pi12 = pi1.f7194R;
                        if (pi12 != null) {
                            iE(pi12, pi1);
                            return;
                        } else if (xN(pi1)) {
                            E(pi1);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (J(pi1)) {
                E(pi1);
                return;
            } else {
                return;
            }
        }
        dhh dhh = pi1.f7190R;
        if (dhh != null) {
            dhh.x();
        }
    }

    public static final boolean cr(pi1 pi1, kg9 kg9) {
        biT bit = pi1.f7186R;
        Arrays.sort(bit.f1772R, 0, bit.e, iKt.R);
        biT bit2 = pi1.f7186R;
        int i = bit2.e;
        if (i <= 0) {
            return false;
        }
        int i2 = i - 1;
        Object[] objArr = bit2.f1772R;
        do {
            pi1 pi12 = (pi1) objArr[i2];
            if (q(pi12) && g(pi12, kg9)) {
                return true;
            }
            i2--;
        } while (i2 >= 0);
        return false;
    }

    public static final pi1 d(pi1 pi1) {
        pi1 pi12 = pi1.f7194R;
        if (pi12 == null) {
            return null;
        }
        int ordinal = pi1.f7192R.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (!(ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                    throw new j8f((Object) null);
                }
            }
            return pi1;
        }
        pi1 = d(pi12);
        return pi1;
    }

    public static final gIA e(long j, long j2) {
        return new gIA(aWo.e(j), aWo.X(j), nqW.e(j2) + aWo.e(j), nqW.v(j2) + aWo.X(j));
    }

    public static final ncu f(ncu ncu, kg9 kg9) {
        return ncu.I(new Hn(kg9));
    }

    public static final boolean g(pi1 pi1, kg9 kg9) {
        int ordinal = pi1.f7192R.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (!(ordinal == 2 || ordinal == 3)) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return cr(pi1, kg9) || ((Boolean) kg9.x(pi1)).booleanValue();
                        }
                        throw new j8f((Object) null);
                    }
                }
            }
            pi1 pi12 = pi1.f7197v;
            if (pi12 != null) {
                int ordinal2 = pi12.f7192R.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    if (ordinal2 != 5) {
                                        throw new j8f((Object) null);
                                    }
                                } else if (g(pi12, kg9) || p(pi1, pi12, 2, kg9)) {
                                    return true;
                                }
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    } else if (g(pi12, kg9) || ((Boolean) kg9.x(pi12)).booleanValue()) {
                        return true;
                    }
                }
                return p(pi1, pi12, 2, kg9);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        return cr(pi1, kg9);
    }

    public static final kEW h(hUv huv) {
        j28 j28 = ((j28) huv).R.c;
        hUv huv2 = null;
        if (!(j28 == null || (j28.X & 8) == 0)) {
            while (j28 != null) {
                if ((j28.e & 8) != 0) {
                    break;
                }
                j28 = j28.c;
            }
        }
        j28 = null;
        if (j28 instanceof hUv) {
            huv2 = j28;
        }
        hUv huv3 = huv2;
        if (huv3 == null || huv.e().v) {
            return huv.e();
        }
        kEW e = huv.e();
        e.getClass();
        kEW kew = new kEW();
        kew.f5221R = e.f5221R;
        kew.v = e.v;
        kew.R.putAll(e.R);
        kEW h = h(huv3);
        if (h.f5221R) {
            kew.f5221R = true;
        }
        if (h.v) {
            kew.v = true;
        }
        for (Map.Entry entry : h.R.entrySet()) {
            b_t b_t = (b_t) entry.getKey();
            Object value = entry.getValue();
            if (!kew.R.containsKey(b_t)) {
                kew.R.put(b_t, value);
            } else if (value instanceof Tp) {
                Tp tp = (Tp) kew.R.get(b_t);
                LinkedHashMap linkedHashMap = kew.R;
                String str = tp.f537R;
                if (str == null) {
                    str = ((Tp) value).f537R;
                }
                aAC aac = tp.R;
                if (aac == null) {
                    aac = ((Tp) value).R;
                }
                linkedHashMap.put(b_t, new Tp(str, aac));
            }
        }
        return kew;
    }

    public static final int i(eo1 eo1) {
        int i = eo1 instanceof gl4 ? 3 : 1;
        if (eo1 instanceof g4j) {
            i |= 4;
        }
        if (eo1 instanceof ed5) {
            i |= 8;
        }
        if (eo1 instanceof h_4) {
            i |= 16;
        }
        if ((eo1 instanceof lHr) || (eo1 instanceof bpk)) {
            i |= 32;
        }
        if (eo1 instanceof cIc) {
            i |= 256;
        }
        if (eo1 instanceof cNa) {
            i |= 64;
        }
        return ((eo1 instanceof mij) || (eo1 instanceof kES)) ? i | 128 : i;
    }

    public static final boolean iE(pi1 pi1, pi1 pi12) {
        mgi mgi = mgi.ActiveParent;
        if (pi1.f7186R.Z(pi12)) {
            int ordinal = pi1.f7192R.ordinal();
            if (ordinal == 0) {
                pi1.U(mgi);
                pi1.f7197v = pi12;
                E(pi12);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    return false;
                }
                if (ordinal == 3) {
                    int ordinal2 = pi1.f7192R.ordinal();
                    if (ordinal2 == 3) {
                        pi1.U(mgi.Inactive);
                    } else if (ordinal2 == 4) {
                        pi1.U(mgi);
                    }
                    boolean iE = iE(pi1, pi12);
                    Q(pi1);
                    return iE;
                } else if (ordinal != 4) {
                    if (ordinal == 5) {
                        pi1 pi13 = pi1.f7194R;
                        if (pi13 == null && xN(pi1)) {
                            pi1.U(mgi.Active);
                            return iE(pi1, pi12);
                        } else if (pi13 == null || !iE(pi13, pi1)) {
                            return false;
                        } else {
                            return iE(pi1, pi12);
                        }
                    } else {
                        throw new j8f((Object) null);
                    }
                } else if (pi1.f7197v == null) {
                    pi1.f7197v = pi12;
                    E(pi12);
                } else if (!J(pi1)) {
                    return false;
                } else {
                    pi1.f7197v = pi12;
                    E(pi12);
                }
            } else if (!J(pi1)) {
                return false;
            } else {
                pi1.f7197v = pi12;
                E(pi12);
            }
            return true;
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    public static u_ j(u_ u_Var) {
        bSx bsx = iWF.v;
        u2 u2Var = Ws.R;
        if (!q2.R(u_Var.f7426R, q2.f7347R)) {
            return u_Var;
        }
        dHi dhi = (dHi) u_Var;
        if (u(dhi.f2548R, bsx)) {
            return u_Var;
        }
        return new dHi(((u_) dhi).f7427R, dhi.f2553R, bsx, X4(K(u2Var.f609R, dhi.f2548R.R(), bsx.R()), dhi.f2556v), dhi.f2549R, dhi.f2554v, dhi.R, dhi.v, dhi.f2551R, -1);
    }

    public static final boolean k(pi1 pi1, pi1 pi12, int i, kg9 kg9) {
        if (pG(pi1, pi12, i, kg9)) {
            return true;
        }
        Boolean bool = (Boolean) mZ(pi1, i, new jNr(pi1, pi12, i, kg9, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean l(int i) {
        return (i & 128) != 0;
    }

    public static final h0T m(boolean z, boolean z2, j4B j4b, fVb fvb, float f, float f2, m88 m88, int i) {
        dH9 dh9;
        dH9 dh92;
        jr_ jr_ = (jr_) m88;
        jr_.w(-1633063017);
        h0T I = I(j4b, jr_, (i >> 6) & 14);
        fvb.getClass();
        jr_.w(-1877482635);
        long j = !z ? fvb.m : z2 ? fvb.Z : ((Boolean) I(j4b, jr_, (((i & 7168) | (((i & 14) | (i & 112)) | (i & 896))) >> 6) & 14).getValue()).booleanValue() ? fvb.O : fvb.L;
        if (z) {
            jr_.w(715730990);
            dh9 = lLc.R(j, o02.t(150, 0, null, 6), jr_, 48, 4);
            jr_.g(false);
        } else {
            jr_.w(715731095);
            dh9 = l6.s(new n3(j), jr_);
            jr_.g(false);
        }
        jr_.g(false);
        if (!((Boolean) I.getValue()).booleanValue()) {
            f = f2;
        }
        if (z) {
            jr_.w(-1927801001);
            o3h t = o02.t(150, 0, null, 6);
            int i2 = GO.R;
            jr_.w(-1364859110);
            dh92 = GO.R(new hoI(f), kYZ.c, t, null, jr_, 384);
            jr_.g(false);
            jr_.g(false);
        } else {
            jr_.w(-1927800903);
            dh92 = l6.s(new hoI(f2), jr_);
            jr_.g(false);
        }
        h0T s = l6.s(new lf(((hoI) dh92.getValue()).R, new oSW(((n3) dh9.getValue()).f6279R)), jr_);
        jr_.g(false);
        return s;
    }

    public static final k_s mL(iv7 iv7, kg9 kg9) {
        gEQ geq = new gEQ(iv7);
        gvP.L(1, kg9);
        k_s k_s = e29.R;
        return new k_s(geq, kg9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a0, code lost:
        if (r13.f4854R != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ac, code lost:
        if (r13.f4854R != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c3, code lost:
        if (r13.f4854R != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c8, code lost:
        if (r13.f4854R != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00df, code lost:
        if (r13.f4854R != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00e4, code lost:
        if (r13.f4854R != false) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0116 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object mZ(defpackage.pi1 r13, int r14, defpackage.jNr r15) {
        /*
        // Method dump skipped, instructions count: 341
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msU.mZ(pi1, int, jNr):java.lang.Object");
    }

    public static nMl n(u_ u_Var, u_ u_Var2, int i) {
        if ((i & 1) != 0) {
            u_Var2 = K6.R;
        }
        if (u_Var == u_Var2) {
            return new lBb(u_Var);
        }
        long j = u_Var.f7426R;
        long j2 = q2.f7347R;
        return (!q2.R(j, j2) || !q2.R(u_Var2.f7426R, j2)) ? new nMl(u_Var, u_Var2, 0) : new jE7((dHi) u_Var, (dHi) u_Var2, 0);
    }

    public static final void o(long j, nLK nlk) {
        boolean z = true;
        if (nlk == nLK.Vertical) {
            if (oys.L(j) == Integer.MAX_VALUE) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
            return;
        }
        if (oys.Z(j) == Integer.MAX_VALUE) {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }

    public static final boolean p(pi1 pi1, pi1 pi12, int i, kg9 kg9) {
        if (yG(pi1, pi12, i, kg9)) {
            return true;
        }
        Boolean bool = (Boolean) mZ(pi1, i, new jNr(pi1, pi12, i, kg9, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean pG(pi1 pi1, pi1 pi12, int i, kg9 kg9) {
        pi1 W;
        biT bit = pi1.f7186R;
        biT bit2 = new biT(new pi1[bit.e]);
        bit2.c(bit2.e, bit);
        while (bit2.H() && (W = W(bit2, T(pi12), i)) != null) {
            if (!W.f7192R.R()) {
                return ((Boolean) kg9.x(W)).booleanValue();
            }
            Boolean R2 = ((jzQ) W.f7188R.f2124R.x(new jnj(i))).R(kg9);
            if (R2 != null) {
                return R2.booleanValue();
            }
            if (k(W, pi12, i, kg9)) {
                return true;
            }
            bit2.U(W);
        }
        return false;
    }

    public static final boolean q(pi1 pi1) {
        fue fue;
        fue fue2;
        poS pos = pi1.f7195R;
        if ((pos == null || (fue2 = pos.f7272R) == null || !fue2.f3608X) ? false : true) {
            if ((pos == null || (fue = pos.f7272R) == null || !fue.K()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public static final boolean r(pi1 pi1, kg9 kg9) {
        int ordinal = pi1.f7192R.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (!(ordinal == 2 || ordinal == 3)) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return ((Boolean) kg9.x(pi1)).booleanValue();
                        }
                        throw new j8f((Object) null);
                    }
                }
            }
            pi1 pi12 = pi1.f7197v;
            if (pi12 != null) {
                if (r(pi12, kg9) || p(pi1, pi12, 1, kg9)) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        biT bit = pi1.f7186R;
        Arrays.sort(bit.f1772R, 0, bit.e, iKt.R);
        biT bit2 = pi1.f7186R;
        int i = bit2.e;
        if (i > 0) {
            Object[] objArr = bit2.f1772R;
            int i2 = 0;
            do {
                pi1 pi13 = (pi1) objArr[i2];
                if (q(pi13) && r(pi13, kg9)) {
                    return true;
                }
                i2++;
            } while (i2 < i);
        }
        return false;
    }

    public static final boolean s(pi1 pi1, int i, kg9 kg9) {
        gIA gia;
        Boolean R2 = ((jzQ) pi1.f7188R.f2124R.x(new jnj(i))).R(kg9);
        if (R2 != null) {
            return R2.booleanValue();
        }
        biT P = P(pi1);
        boolean z = true;
        if (P.e <= 1) {
            pi1 pi12 = (pi1) (P.x() ? null : P.f1772R[0]);
            if (pi12 != null) {
                return ((Boolean) kg9.x(pi12)).booleanValue();
            }
            return false;
        }
        if (i == 7) {
            i = 3;
        }
        if ((i == 4) || i == 6) {
            gIA T = T(pi1);
            float f = T.f3720R;
            float f2 = T.v;
            gia = new gIA(f, f2, f, f2);
        } else {
            if (!(i == 3) && i != 5) {
                z = false;
            }
            if (z) {
                gIA T2 = T(pi1);
                float f3 = T2.c;
                float f4 = T2.e;
                gia = new gIA(f3, f4, f3, f4);
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        pi1 W = W(P, gia, i);
        if (W != null) {
            return ((Boolean) kg9.x(W)).booleanValue();
        }
        return false;
    }

    public static final boolean t(int i, gIA gia, gIA gia2) {
        if (!((i == 3) || i == 4)) {
            if (!((i == 5) || i == 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else if (gia.c <= gia2.f3720R || gia.f3720R >= gia2.c) {
                return false;
            }
        } else if (gia.e <= gia2.v || gia.v >= gia2.e) {
            return false;
        }
        return true;
    }

    public static final boolean u(bSx bsx, bSx bsx2) {
        if (bsx == bsx2) {
            return true;
        }
        return Math.abs(bsx.R - bsx2.R) < 0.001f && Math.abs(bsx.v - bsx2.v) < 0.001f;
    }

    public static final void v(fBS fbs, iv7 iv7, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1985516685);
        if ((i & 112) == 0) {
            i2 = (jr_.O(iv7) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !jr_.J()) {
            iv7.J(jr_, Integer.valueOf((i2 >> 3) & 14));
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(fbs, iv7, i, 4);
        }
    }

    public static final void vl(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f4 = fArr[2] * f;
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + f4;
    }

    public static ncu vr(ncu ncu, jww jww, mz mzVar, cZB czb, float f, Iw iw, int i) {
        boolean z = (i & 2) != 0;
        if ((i & 4) != 0) {
            mzVar = dq.X;
        }
        if ((i & 8) != 0) {
            czb = dq.f2890v;
        }
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        if ((i & 32) != 0) {
            iw = null;
        }
        return ncu.I(new mbj(jww, z, mzVar, czb, f, iw));
    }

    public static final fue vz(kTd ktd) {
        return ((j28) ktd).R.f4791R.f7272R;
    }

    public static final long w(int i, gIA gia, gIA gia2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z = false;
        z = true;
        if (i == 3) {
            f2 = gia.f3720R;
            f = gia2.c;
        } else {
            if (i == 4) {
                f2 = gia2.f3720R;
                f = gia.c;
            } else {
                if (i == 5) {
                    f2 = gia.v;
                    f = gia2.e;
                } else {
                    if (i == 6) {
                        f2 = gia2.v;
                        f = gia.e;
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        long abs = (long) Math.abs(Math.max(0.0f, f2 - f));
        if ((i == 3) || i == 4) {
            float f7 = gia.v;
            f6 = (float) 2;
            f4 = ((gia.e - f7) / f6) + f7;
            f5 = gia2.v;
            f3 = gia2.e;
        } else {
            if (!(i == 5)) {
                if (i == 6) {
                    z = true;
                }
            }
            if (z) {
                float f8 = gia.f3720R;
                f6 = (float) 2;
                f4 = ((gia.c - f8) / f6) + f8;
                f5 = gia2.f3720R;
                f3 = gia2.c;
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        long abs2 = (long) Math.abs(f4 - (((f3 - f5) / f6) + f5));
        return (abs2 * abs2) + (((long) 13) * abs * abs);
    }

    public static final void wm(pdm pdm, long j, kg9 kg9, boolean z) {
        MotionEvent R2 = pdm.R();
        if (R2 != null) {
            int action = R2.getAction();
            if (z) {
                R2.setAction(3);
            }
            R2.offsetLocation(-aWo.e(j), -aWo.X(j));
            kg9.x(R2);
            R2.offsetLocation(aWo.e(j), aWo.X(j));
            R2.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }

    public static final int x(int i, biT bit) {
        int i2 = bit.e - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = bit.f1772R;
            int i5 = ((jt1) objArr[i4]).R;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((jt1) objArr[i3]).R) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final boolean xN(pi1 pi1) {
        fue fue;
        gzG gzg;
        poS pos = pi1.f7195R;
        if (pos != null && (fue = pos.f7272R) != null && (gzg = fue.f3595R) != null) {
            return gzg.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r10.f3720R >= r12.c) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r10.c <= r12.f3720R) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r10.v >= r12.e) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        if (r10.e <= r12.v) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0057, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean y(defpackage.gIA r10, defpackage.gIA r11, defpackage.gIA r12, int r13) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msU.y(gIA, gIA, gIA, int):boolean");
    }

    public static final boolean yG(pi1 pi1, pi1 pi12, int i, kg9 kg9) {
        mgi mgi = mgi.DeactivatedParent;
        mgi mgi2 = pi1.f7192R;
        boolean z = true;
        if (mgi2 == mgi.ActiveParent || mgi2 == mgi) {
            biT bit = pi1.f7186R;
            Arrays.sort(bit.f1772R, 0, bit.e, iKt.R);
            if (i == 1) {
                biT bit2 = pi1.f7186R;
                int i2 = new heu(0, bit2.e - 1).X;
                if (i2 >= 0) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (true) {
                        if (z2) {
                            pi1 pi13 = (pi1) bit2.f1772R[i3];
                            if (q(pi13) && r(pi13, kg9)) {
                                return true;
                            }
                        }
                        if (n3x.v(bit2.f1772R[i3], pi12)) {
                            z2 = true;
                        }
                        if (i3 == i2) {
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                if (i == 2) {
                    biT bit3 = pi1.f7186R;
                    int i4 = new heu(0, bit3.e - 1).X;
                    if (i4 >= 0) {
                        boolean z3 = false;
                        while (true) {
                            if (z3) {
                                pi1 pi14 = (pi1) bit3.f1772R[i4];
                                if (q(pi14) && g(pi14, kg9)) {
                                    return true;
                                }
                            }
                            if (n3x.v(bit3.f1772R[i4], pi12)) {
                                z3 = true;
                            }
                            if (i4 == 0) {
                                break;
                            }
                            i4--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
            }
            if (!(i == 1) && pi1.f7192R != mgi) {
                if (pi1.f7194R != null) {
                    z = false;
                }
                if (!z) {
                    return ((Boolean) kg9.x(pi1)).booleanValue();
                }
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }

    public static final void yf(pi1 pi1) {
        hcI.R(pi1);
        biT bit = pi1.f7186R;
        int i = bit.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = bit.f1772R;
            do {
                yf((pi1) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    public static final int z(long j, long j2) {
        boolean _ = _(j);
        return _ != _(j2) ? _ ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public static final float[] zw(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }
}
