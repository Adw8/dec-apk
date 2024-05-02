package defpackage;

import android.graphics.BlendMode;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: g4x  reason: default package */
/* loaded from: classes.dex */
public abstract class g4x {
    public static j58 R;

    /* renamed from: R  reason: collision with other field name */
    public static boolean[] f3670R = new boolean[3];

    /* renamed from: R  reason: collision with other field name */
    public static final lmI f3669R = new lmI("NONE");
    public static final lmI v = new lmI("PENDING");

    public static final int C(long j) {
        int i = 32;
        if ((4294967295L & j) == 0) {
            j >>= 32;
        } else {
            i = 0;
        }
        if ((65535 & j) == 0) {
            i += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i;
        }
        if ((2 & j) != 0) {
            return i + 1;
        }
        if ((4 & j) != 0) {
            return i + 2;
        }
        if ((j & 8) != 0) {
            return i + 3;
        }
        return -1;
    }

    public static final boolean H(oIb oib) {
        return gvP.i(oib.O(), dwC.m) == null;
    }

    public static final ncu I(m88 m88, ncu ncu) {
        if (ncu.v(nqF.x)) {
            return ncu;
        }
        jr_ jr_ = (jr_) m88;
        jr_.w(1219399079);
        int i = ncu.c;
        ncu ncu2 = (ncu) ncu.O(aff.R, new bkx(4, m88));
        jr_.g(false);
        return ncu2;
    }

    public static final fue J(fue fue, lBz lbz) {
        for (fue N = fue.N(); N != null; N = N.N()) {
            if (((Boolean) lbz.x(N)).booleanValue()) {
                return N;
            }
        }
        return null;
    }

    public static final gqK K(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((gqK) arrayList.get(i2)).e == i) {
                return (gqK) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final dm L() {
        return new dm(new Path());
    }

    public static final int N(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else if (i >= i4) {
                return i3;
            } else {
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final ivW O(Object obj) {
        if (obj == null) {
            obj = aJV.f827R;
        }
        return new ivW(obj);
    }

    public static void P(m_b m_b, fhh fhh, kwo kwo) {
        kwo.f5507c = -1;
        kwo.f5511e = -1;
        if (((kwo) m_b).f5510c[0] != 2 && kwo.f5510c[0] == 4) {
            int i = kwo.f5491R.v;
            int P = m_b.P() - kwo.f5508c.v;
            iP5 ip5 = kwo.f5491R;
            ip5.f4580R = fhh.H(ip5);
            iP5 ip52 = kwo.f5508c;
            ip52.f4580R = fhh.H(ip52);
            fhh.e(kwo.f5491R.f4580R, i);
            fhh.e(kwo.f5508c.f4580R, P);
            kwo.f5507c = 2;
            kwo.y = i;
            int i2 = P - i;
            kwo.P = i2;
            int i3 = kwo.V;
            if (i2 < i3) {
                kwo.P = i3;
            }
        }
        if (((kwo) m_b).f5510c[1] != 2 && kwo.f5510c[1] == 4) {
            int i4 = kwo.f5516v.v;
            int m = m_b.m() - kwo.f5512e.v;
            iP5 ip53 = kwo.f5516v;
            ip53.f4580R = fhh.H(ip53);
            iP5 ip54 = kwo.f5512e;
            ip54.f4580R = fhh.H(ip54);
            fhh.e(kwo.f5516v.f4580R, i4);
            fhh.e(kwo.f5512e.f4580R, m);
            if (kwo.i > 0 || kwo.K == 8) {
                iP5 ip55 = kwo.f5504X;
                ip55.f4580R = fhh.H(ip55);
                fhh.e(kwo.f5504X.f4580R, kwo.i + i4);
            }
            kwo.f5511e = 2;
            kwo.t = i4;
            int i5 = m - i4;
            kwo.j = i5;
            int i6 = kwo.o;
            if (i5 < i6) {
                kwo.j = i6;
            }
        }
    }

    public static final long R(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        int i = buB.R;
        return floatToIntBits2;
    }

    public static final boolean U(oIb oib) {
        kEW h;
        if (!h(oib) || n3x.v(gvP.i(oib.f6738R, dwC.H), Boolean.TRUE)) {
            fue J = J(oib.f6736R, lBz.o);
            if (J == null) {
                return false;
            }
            hUv l = aH9.l(J);
            if ((l == null || (h = msU.h(l)) == null) ? false : n3x.v(gvP.i(h, dwC.H), Boolean.TRUE)) {
                return false;
            }
        }
        return true;
    }

    public static final ncu V(ncu ncu, j__ j__, kg9 kg9, nLK nlk, boolean z, p2E p2e, f_c f_c, lR3 lr3, lR3 lr32, boolean z2) {
        return g(ncu, lBz.Y, new m0Y(j__, nlk, p2e, f_c, kg9, lr3, lr32, z, z2));
    }

    public static final void X(gL6 gl6, f53 f53, n67 n67, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(1113453182);
        View view = (View) jr_.x(ur.X);
        jr_.w(1618982084);
        boolean O = jr_.O(n67) | jr_.O(gl6) | jr_.O(view);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            jr_.ZW(new g7C(gl6, n67, f53, view));
        }
        jr_.g(false);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new dR(gl6, f53, n67, i, 1);
        }
    }

    public static final void Y(Region region, oIb oib, LinkedHashMap linkedHashMap, oIb oib2) {
        hUv huv;
        gIA gia;
        fue fue;
        fue fue2 = oib2.f6736R;
        boolean z = true;
        boolean z2 = !fue2.f3608X || !fue2.K();
        if (region.isEmpty() && oib2.R != oib.R) {
            return;
        }
        if (!z2 || oib2.v) {
            if (oib2.f6738R.f5221R) {
                huv = aH9.B(oib2.f6736R);
                if (huv == null) {
                    huv = oib2.f6737R;
                }
            } else {
                huv = oib2.f6737R;
            }
            if (!((j28) huv).R.f4792R) {
                gia = gIA.R;
            } else if (gvP.i(huv.e(), jGN.v) != null) {
                poS ZW = msU.ZW(huv, 8);
                if (ZW.p()) {
                    hjM g = ooA.g(ZW);
                    aG9 ag9 = ZW.f7270R;
                    if (ag9 == null) {
                        ag9 = new aG9();
                        ZW.f7270R = ag9;
                    }
                    long ec = ZW.ec(ZW.lU());
                    ag9.R = -nqW.e(ec);
                    ag9.v = -nqW.v(ec);
                    ag9.c = nqW.e(ec) + ((float) ZW.mh());
                    ag9.e = nqW.v(ec) + ((float) ZW.JD());
                    while (true) {
                        if (ZW == g) {
                            gia = new gIA(ag9.R, ag9.v, ag9.c, ag9.e);
                            break;
                        }
                        ZW.CD(ag9, false, true);
                        if (ag9.v()) {
                            gia = gIA.R;
                            break;
                        }
                        ZW = ZW.f7284v;
                    }
                } else {
                    gia = gIA.R;
                }
            } else {
                poS ZW2 = msU.ZW(huv, 8);
                gia = ooA.g(ZW2).j(ZW2, true);
            }
            Rect o = ooA.o(gia);
            Region region2 = new Region();
            region2.set(o);
            int i = oib2.R;
            if (i == oib.R) {
                i = -1;
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                linkedHashMap.put(Integer.valueOf(i), new bNN(oib2, region2.getBounds()));
                List X = oib2.X(false);
                for (int size = X.size() - 1; -1 < size; size--) {
                    Y(region, oib, linkedHashMap, (oIb) X.get(size));
                }
                region.op(o, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (oib2.v) {
                oIb L = oib2.L();
                if (L == null || (fue = L.f6736R) == null || !fue.f3608X) {
                    z = false;
                }
                linkedHashMap.put(Integer.valueOf(i), new bNN(oib2, ooA.o(z ? L.e() : new gIA(0.0f, 0.0f, 10.0f, 10.0f))));
            } else if (i == -1) {
                linkedHashMap.put(Integer.valueOf(i), new bNN(oib2, region2.getBounds()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        if (r22 == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a1, code lost:
        if (r22 != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00af, code lost:
        if (((r21 == r1 && !r22) || (r21 == r0 && r22)) == false) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Z(long r18, boolean r20, defpackage.bSG r21, boolean r22, defpackage.ncu r23, defpackage.iv7 r24, defpackage.m88 r25, int r26) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4x.Z(long, boolean, bSG, boolean, ncu, iv7, m88, int):void");
    }

    public static final void c(long j, n3U n3u, iv7 iv7, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1409050158);
        if ((i & 14) == 0) {
            i2 = (jr_.X(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.O(n3u) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= jr_.O(iv7) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !jr_.J()) {
            long v2 = cU5.v(mLz.t(aWo.e(j)), mLz.t(aWo.X(j)));
            dU5 du5 = new dU5(v2);
            jr_.w(511388516);
            boolean O = jr_.O(du5) | jr_.O(n3u);
            Object I = jr_.I();
            if (O || I == ppN.R) {
                I = new btu(n3u, v2);
                jr_.ZW(I);
            }
            jr_.g(false);
            Gm.R((btu) I, null, new cvV(false, true, 15), iv7, jr_, (i2 << 3) & 7168, 2);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new q3(j, n3u, iv7, i, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(defpackage.f_c r25, defpackage.ncu r26, boolean r27, defpackage.iTW r28, defpackage.p2E r29, defpackage.iv7 r30, defpackage.m88 r31, int r32, int r33) {
        /*
        // Method dump skipped, instructions count: 647
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4x.e(f_c, ncu, boolean, iTW, p2E, iv7, m88, int, int):void");
    }

    public static final ncu g(ncu ncu, kg9 kg9, lR3 lr3) {
        return ncu.I(new o9B(kg9, lr3));
    }

    public static final boolean h(oIb oib) {
        kEW kew = oib.f6738R;
        b_t b_t = jGN.R;
        return kew.R(jGN.Z);
    }

    public static final Object i(ck3 ck3, ojR ojr, aOO aoo) {
        c55 c55 = new c55(ojr, 0);
        kTm ktm = new kTm(ojr, 0);
        kTm ktm2 = new kTm(ojr, 1);
        kCa kca = new kCa(ojr, 0);
        dgP dgp = iVu.f4622R;
        Object y = ooA.y(ck3, new aRK(null, ktm2, ktm, c55, kca), aoo);
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (y != bgr) {
            y = o8s.R;
        }
        return y == bgr ? y : o8s.R;
    }

    public static final h0T j(j4B j4b, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        Object x = jQ.x(jr_, -1692965168, -492369756);
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
            I = new kK2(j4b, h0t, null);
            jr_.ZW(I);
        }
        jr_.g(false);
        caw.e(j4b, (iv7) I, jr_);
        jr_.g(false);
        return h0t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02be A[ORIG_RETURN, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable m(defpackage.lAs r19, defpackage.dH9 r20, defpackage.dH9 r21, defpackage.cXX r22, defpackage.nLK r23, defpackage.aOO r24) {
        /*
        // Method dump skipped, instructions count: 721
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4x.m(lAs, dH9, dH9, cXX, nLK, aOO):java.io.Serializable");
    }

    public static final BlendMode n(int i) {
        int i2 = An.v;
        boolean z = false;
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        if (i == 28) {
            z = true;
        }
        return z ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final boolean o(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r1 > r6.R()) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.lC t(defpackage.SD r21, float r22) {
        /*
            r0 = r21
            r3 = r22
            double r1 = (double) r3
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r1 = r1 * 2
            aCQ r2 = defpackage.vC.f7432R
            Gp r4 = defpackage.vC.f7431R
            FC r5 = defpackage.vC.R
            if (r2 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0026
            r6 = r2
            lC r6 = (defpackage.lC) r6
            int r7 = r6.v()
            if (r1 > r7) goto L_0x0026
            int r6 = r6.R()
            if (r1 <= r6) goto L_0x0043
        L_0x0026:
            r2 = 1
            r4 = 24
            lC r2 = defpackage.dTl.L(r1, r1, r2, r4)
            defpackage.vC.f7432R = r2
            android.graphics.Canvas r1 = defpackage.dO.R
            W3 r4 = new W3
            r4.<init>()
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r6 = defpackage.gQc.P(r2)
            r1.<init>(r6)
            r4.R = r1
            defpackage.vC.f7431R = r4
        L_0x0043:
            r7 = r4
            if (r5 != 0) goto L_0x004d
            FC r5 = new FC
            r5.<init>()
            defpackage.vC.R = r5
        L_0x004d:
            r6 = r5
            J2 r1 = r0.R
            mdz r1 = r1.getLayoutDirection()
            r16 = r2
            lC r16 = (defpackage.lC) r16
            int r2 = r16.v()
            float r2 = (float) r2
            int r4 = r16.R()
            float r4 = (float) r4
            long r4 = defpackage.n1P.e(r2, r4)
            lE r2 = r6.f118R
            jJj r15 = r2.f5619R
            mdz r13 = r2.f5620R
            Gp r14 = r2.f5618R
            long r11 = r2.R
            r2.f5619R = r0
            r2.f5620R = r1
            r2.f5618R = r7
            r2.R = r4
            r7.y()
            long r9 = defpackage.n3.v
            r0 = 0
            long r4 = r6.c()
            r2 = 58
            r8 = r6
            r17 = r11
            r11 = r0
            r1 = r13
            r0 = r14
            r13 = r4
            r4 = r15
            r15 = r2
            defpackage.fiv.H(r8, r9, r11, r13, r15)
            r19 = 4278190080(0xff000000, double:2.113706745E-314)
            long r9 = defpackage.aH9.O(r19)
            long r11 = defpackage.aWo.v
            long r13 = defpackage.n1P.e(r3, r3)
            r15 = 120(0x78, float:1.68E-43)
            defpackage.fiv.H(r8, r9, r11, r13, r15)
            long r8 = defpackage.aH9.O(r19)
            long r10 = defpackage.aH9.N(r3, r3)
            r12 = 120(0x78, float:1.68E-43)
            r13 = r0
            r0 = r6
            r14 = r1
            r1 = r8
            r3 = r22
            r8 = r4
            r4 = r10
            r9 = r6
            r6 = r12
            defpackage.fiv.X4(r0, r1, r3, r4, r6)
            r7.j()
            lE r0 = r9.f118R
            r0.f5619R = r8
            r0.f5620R = r14
            r0.f5618R = r13
            r1 = r17
            r0.R = r1
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4x.t(SD, float):lC");
    }

    public static final ncu u(ncu ncu, kg9 kg9) {
        return ncu.I(new cN4(kg9));
    }

    public static final void v(ncu ncu, boolean z, bSG bsg, boolean z2, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(47957398);
        if ((i & 14) == 0) {
            i2 = (jr_.O(ncu) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.L(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= jr_.O(bsg) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= jr_.L(z2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !jr_.J()) {
            dTl.x(y(adU.m(ncu, nwJ.R, nwJ.v), new M1(z, bsg, z2)), jr_, 0);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new OH(ncu, z, bsg, z2, i);
        }
    }

    public static final Object x(lAs las, phU phu, long j, cXX cxx, gn gnVar, boolean z, nLK nlk, lxL lxl) {
        gnVar.e(new jvU(aWo.O(phu.c, aH9.N(aWo.e(j) * Math.signum(aWo.e(phu.c)), aWo.X(j) * Math.signum(aWo.X(phu.c))))));
        if (z) {
            j = aWo.Z(-1.0f, j);
        }
        gnVar.e(new hGa(j));
        cCR ccr = new cCR(cxx, gnVar, z);
        return nlk == nLK.Vertical ? iVu.Z(las, phu.f7171R, ccr, lxl) : iVu.X(las, phu.f7171R, ccr, lxl);
    }

    public static /* synthetic */ ncu y(ncu ncu, lR3 lr3) {
        return g(ncu, lBz.Y, lr3);
    }

    public static final nW z(m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-1031410916);
        View view = (View) jr_.x(ur.X);
        jr_.w(1157296644);
        boolean O = jr_.O(view);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = new nW(view);
            jr_.ZW(I);
        }
        jr_.g(false);
        nW nWVar = (nW) I;
        jr_.g(false);
        return nWVar;
    }
}
