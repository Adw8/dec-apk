package defpackage;

/* renamed from: nP4  reason: default package */
/* loaded from: classes.dex */
public abstract class nP4 {
    public static final float R;
    public static final float X;
    public static final float c;
    public static final float e;
    public static final float v = d3m.L;

    /* renamed from: R  reason: collision with other field name */
    public static final o3h f6385R = new o3h(100, (oUk) null, 6);

    static {
        float f = d3m.v;
        R = f;
        float f2 = d3m.O;
        c = f2;
        float f3 = d3m.e;
        e = f3;
        X = (f2 - f) - ((f3 - f) / ((float) 2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(boolean r49, defpackage.kg9 r50, defpackage.ncu r51, defpackage.iv7 r52, boolean r53, defpackage.kPA r54, defpackage.p2E r55, defpackage.m88 r56, int r57, int r58) {
        /*
        // Method dump skipped, instructions count: 1081
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nP4.R(boolean, kg9, ncu, iv7, boolean, kPA, p2E, m88, int, int):void");
    }

    public static final void v(QX qx, boolean z, boolean z2, kPA kpa, dH9 dh9, iv7 iv7, j4B j4b, n76 n76, float f, float f2, float f3, m88 m88, int i, int i2) {
        int i3;
        int i4;
        float f4;
        boolean z3;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1968109941);
        if ((i & 14) == 0) {
            i3 = (jr_.O(qx) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= jr_.L(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= jr_.L(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= jr_.O(kpa) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i3 |= jr_.O(dh9) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i3 |= jr_.O(iv7) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i3 |= jr_.O(j4b) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= jr_.O(n76) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i3 |= jr_.c(f) ? 67108864 : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i3 |= jr_.c(f2) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (jr_.c(f3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((1533916891 & i3) == 306783378 && (i4 & 11) == 2 && jr_.J()) {
            jr_.E();
        } else {
            kpa.getClass();
            jr_.w(961511844);
            h0T s = l6.s(new n3(z2 ? z ? kpa.v : kpa.O : z ? kpa.x : kpa.N), jr_);
            jr_.g(false);
            h0T j = g4x.j(j4b, jr_, (i3 >> 18) & 14);
            owM owm = lnF.X;
            float q = ((Boolean) j.getValue()).booleanValue() ? d3m.R : (((((jJj) jr_.x(owm)).q(((Number) dh9.getValue()).floatValue()) - f2) / (f3 - f2)) * (R - f)) + f;
            jr_.w(-993794194);
            if (((Boolean) j.getValue()).booleanValue()) {
                f4 = ((jJj) jr_.x(owm)).mZ(z ? X - d3m.X : d3m.X);
            } else {
                f4 = ((Number) dh9.getValue()).floatValue();
            }
            jr_.g(false);
            float f5 = d3m.R;
            n76 R2 = gs8.R(5, jr_);
            Y6 y6 = dq.X;
            ((lv) qx).getClass();
            ncu O = adU.O(adU.H(new Z1(y6), c), e);
            float f6 = d3m.X;
            jr_.w(462653665);
            h0T s2 = l6.s(new n3(z2 ? z ? kpa.c : kpa.L : z ? kpa.H : kpa.P), jr_);
            jr_.g(false);
            oSW osw = new oSW(((n3) s2.getValue()).f6279R);
            lBz lbz = lBz.Y;
            ncu m = ooA.m(g4x.g(O, lbz, new kV(f6, R2, osw)), ((n3) s.getValue()).f6279R, R2);
            jr_.w(733328855);
            bF9 e2 = PO.e(dq.R, false, jr_);
            jr_.w(-1323940314);
            jJj jjj = (jJj) jr_.x(owm);
            owM owm2 = lnF.H;
            mdz mdz = (mdz) jr_.x(owm2);
            owM owm3 = lnF.P;
            bUo buo = (bUo) jr_.x(owm3);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(m);
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                ky1 ky1 = igT.c;
                l6.p(jr_, e2, ky1);
                ky1 ky12 = igT.v;
                l6.p(jr_, jjj, ky12);
                ky1 ky13 = igT.e;
                l6.p(jr_, mdz, ky13);
                ky1 ky14 = igT.X;
                jQ.o(0, b, jQ.m(jr_, buo, ky14, jr_), jr_, 2058660585, -2137368960);
                jr_.w(968687813);
                jr_.w(-1539933265);
                h0T s3 = l6.s(new n3(z2 ? z ? kpa.R : kpa.X : z ? kpa.m : kpa.C), jr_);
                jr_.g(false);
                long j2 = ((n3) s3.getValue()).f6279R;
                Z1 z1 = new Z1(dq.e);
                Float valueOf = Float.valueOf(f4);
                jr_.w(1157296644);
                boolean O2 = jr_.O(valueOf);
                Object I = jr_.I();
                if (O2 || I == ppN.R) {
                    I = new dio(10, f4);
                    jr_.ZW(I);
                }
                jr_.g(false);
                ncu I2 = z1.I(new i1b((kg9) I));
                iWA R3 = ek_.R(false, d3m.c / ((float) 2), jr_, 54, 4);
                owM owm4 = pbX.R;
                ncu m2 = ooA.m(g4x.g(I2, lbz, new fB0(R3, 0, j4b)).I(new mu5(q, q, q, q, false)), j2, n76);
                jr_.w(733328855);
                bF9 e3 = PO.e(y6, false, jr_);
                jr_.w(-1323940314);
                jJj jjj2 = (jJj) jr_.x(owm);
                mdz mdz2 = (mdz) jr_.x(owm2);
                bUo buo2 = (bUo) jr_.x(owm3);
                dNH b2 = aH9.b(m2);
                if (jr_.f5052R instanceof Su) {
                    jr_.mL();
                    if (jr_.f5050L) {
                        jr_.H(fme);
                    } else {
                        jr_.BF();
                    }
                    jr_.f5078e = false;
                    jQ.o(0, b2, jQ.Z(jr_, e3, ky1, jr_, jjj2, ky12, jr_, mdz2, ky13, jr_, buo2, ky14, jr_), jr_, 2058660585, -2137368960);
                    jr_.w(881862015);
                    if (iv7 != null) {
                        jr_.w(-153383122);
                        h0T s4 = l6.s(new n3(z2 ? z ? kpa.e : kpa.Z : z ? kpa.U : kpa.j), jr_);
                        z3 = false;
                        jr_.g(false);
                        l6.R(new bkv[]{kft.R.v(s4.getValue())}, iv7, jr_, ((i3 >> 12) & 112) | 8);
                    } else {
                        z3 = false;
                    }
                    jQ.K(jr_, z3, z3, z3, true);
                    jQ.K(jr_, z3, z3, z3, z3);
                    jQ.K(jr_, z3, true, z3, z3);
                } else {
                    l6.u();
                    throw null;
                }
            } else {
                l6.u();
                throw null;
            }
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new cBE(qx, z, z2, kpa, dh9, iv7, j4b, n76, f, f2, f3, i, i2);
        }
    }
}
