package defpackage;

/* renamed from: c3  reason: default package */
/* loaded from: classes.dex */
public abstract class c3 {
    public static final float R;
    public static final float v;

    static {
        float f = (float) 4;
        R = f;
        v = ((float) 16) - f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.iv7 r31, defpackage.ncu r32, defpackage.iv7 r33, defpackage.lR3 r34, defpackage.iUy r35, defpackage.fQ2 r36, defpackage.lPv r37, defpackage.m88 r38, int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 555
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3.R(iv7, ncu, iv7, lR3, iUy, fQ2, lPv, m88, int, int):void");
    }

    public static final void c(ncu ncu, float f, long j, long j2, long j3, iv7 iv7, kMk kmk, float f2, C0 c0, h8 h8Var, int i, boolean z, iv7 iv72, iv7 iv73, m88 m88, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        fme fme;
        jr_ jr_ = (jr_) m88;
        jr_.q(-6794037);
        int i6 = 4;
        if ((i2 & 14) == 0) {
            i4 = i2 | (jr_.O(ncu) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i7 = 32;
        if ((i2 & 112) == 0) {
            i4 |= jr_.c(f) ? 32 : 16;
        }
        int i8 = 256;
        if ((i2 & 896) == 0) {
            i4 |= jr_.X(j) ? 256 : 128;
        }
        int i9 = 2048;
        if ((i2 & 7168) == 0) {
            i4 |= jr_.X(j2) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i4 |= jr_.X(j3) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 |= jr_.O(iv7) ? 131072 : 65536;
        }
        if ((i2 & 3670016) == 0) {
            i4 |= jr_.O(kmk) ? 1048576 : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i4 |= jr_.c(f2) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i4 |= jr_.O(c0) ? 67108864 : 33554432;
        }
        if ((1879048192 & i2) == 0) {
            i4 |= jr_.O(h8Var) ? 536870912 : 268435456;
        }
        if ((i3 & 14) == 0) {
            if (!jr_.e(i)) {
                i6 = 2;
            }
            i5 = i3 | i6;
        } else {
            i5 = i3;
        }
        if ((i3 & 112) == 0) {
            if (!jr_.L(z)) {
                i7 = 16;
            }
            i5 |= i7;
        }
        if ((i3 & 896) == 0) {
            if (!jr_.O(iv72)) {
                i8 = 128;
            }
            i5 |= i8;
        }
        if ((i3 & 7168) == 0) {
            if (!jr_.O(iv73)) {
                i9 = 1024;
            }
            i5 |= i9;
        }
        if ((i4 & 1533916891) == 306783378 && (i5 & 5851) == 1170 && jr_.J()) {
            jr_.E();
        } else {
            Kd kd = new Kd(f, h8Var, c0, i);
            jr_.w(-1323940314);
            owM owm = lnF.X;
            jJj jjj = (jJj) jr_.x(owm);
            owM owm2 = lnF.H;
            mdz mdz = (mdz) jr_.x(owm2);
            owM owm3 = lnF.P;
            bUo buo = (bUo) jr_.x(owm3);
            h1U.R.getClass();
            fme fme2 = igT.R;
            dNH b = aH9.b(ncu);
            int i10 = ((((i4 << 3) & 112) << 9) & 7168) | 6;
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme2);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                ky1 ky1 = igT.c;
                l6.p(jr_, kd, ky1);
                ky1 ky12 = igT.v;
                l6.p(jr_, jjj, ky12);
                ky1 ky13 = igT.e;
                l6.p(jr_, mdz, ky13);
                ky1 ky14 = igT.X;
                b.y(jQ.m(jr_, buo, ky14, jr_), jr_, Integer.valueOf((i10 >> 3) & 112));
                jr_.w(2058660585);
                jr_.w(1688650562);
                if (((i10 >> 9) & 14 & 11) != 2 || !jr_.J()) {
                    ncu ncu2 = aff.R;
                    okZ okz = new okZ("navigationIcon");
                    float f3 = R;
                    ncu zw = aH9.zw(okz, f3, 0.0f, 0.0f, 0.0f, 14);
                    jr_.w(733328855);
                    Y6 y6 = dq.R;
                    bF9 e = PO.e(y6, false, jr_);
                    jr_.w(-1323940314);
                    jJj jjj2 = (jJj) jr_.x(owm);
                    mdz mdz2 = (mdz) jr_.x(owm2);
                    bUo buo2 = (bUo) jr_.x(owm3);
                    dNH b2 = aH9.b(zw);
                    if (jr_.f5052R instanceof Su) {
                        jr_.mL();
                        if (jr_.f5050L) {
                            jr_.H(fme2);
                        } else {
                            jr_.BF();
                        }
                        jr_.f5078e = false;
                        jQ.o(0, b2, jQ.Z(jr_, e, ky1, jr_, jjj2, ky12, jr_, mdz2, ky13, jr_, buo2, ky14, jr_), jr_, 2058660585, -2137368960);
                        jr_.w(1034743112);
                        kPU kpu = kft.R;
                        l6.R(new bkv[]{kpu.v(new n3(j))}, iv72, jr_, ((i5 >> 3) & 112) | 8);
                        jr_.g(false);
                        jr_.g(false);
                        jr_.g(false);
                        jr_.g(true);
                        jr_.g(false);
                        jr_.g(false);
                        ncu X4 = aH9.X4(new okZ("title"), f3, 0.0f, 2);
                        if (z) {
                            z4 = false;
                            ncu2 = new b2X(false, true, Vh.R, lBz.Y);
                        } else {
                            z4 = false;
                        }
                        ncu I = X4.I(ncu2);
                        jr_.w(733328855);
                        bF9 e2 = PO.e(y6, z4, jr_);
                        jr_.w(-1323940314);
                        jJj jjj3 = (jJj) jr_.x(owm);
                        mdz mdz3 = (mdz) jr_.x(owm2);
                        bUo buo3 = (bUo) jr_.x(owm3);
                        dNH b3 = aH9.b(I);
                        if (jr_.f5052R instanceof Su) {
                            jr_.mL();
                            if (jr_.f5050L) {
                                fme = fme2;
                                jr_.H(fme);
                            } else {
                                fme = fme2;
                                jr_.BF();
                            }
                            jr_.f5078e = false;
                            jQ.o(0, b3, jQ.Z(jr_, e2, ky1, jr_, jjj3, ky12, jr_, mdz3, ky13, jr_, buo3, ky14, jr_), jr_, 2058660585, -2137368960);
                            jr_.w(-280006401);
                            g1c.R(kmk, aH9.I(jr_, 824316656, new a5(j2, f2, iv7, i4)), jr_, ((i4 >> 18) & 14) | 48);
                            jr_.g(false);
                            jr_.g(false);
                            jr_.g(false);
                            jr_.g(true);
                            jr_.g(false);
                            jr_.g(false);
                            ncu zw2 = aH9.zw(new okZ("actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11);
                            jr_.w(733328855);
                            bF9 e3 = PO.e(y6, false, jr_);
                            jr_.w(-1323940314);
                            jJj jjj4 = (jJj) jr_.x(owm);
                            mdz mdz4 = (mdz) jr_.x(owm2);
                            bUo buo4 = (bUo) jr_.x(owm3);
                            dNH b4 = aH9.b(zw2);
                            if (jr_.f5052R instanceof Su) {
                                jr_.mL();
                                if (jr_.f5050L) {
                                    jr_.H(fme);
                                } else {
                                    jr_.BF();
                                }
                                jr_.f5078e = false;
                                jQ.o(0, b4, jQ.Z(jr_, e3, ky1, jr_, jjj4, ky12, jr_, mdz4, ky13, jr_, buo4, ky14, jr_), jr_, 2058660585, -2137368960);
                                jr_.w(1192272192);
                                l6.R(new bkv[]{kpu.v(new n3(j3))}, iv73, jr_, ((i5 >> 6) & 112) | 8);
                                jr_.g(false);
                                jr_.g(false);
                                jr_.g(false);
                                z2 = true;
                                jr_.g(true);
                                jr_.g(false);
                                jr_.g(false);
                                z3 = false;
                            } else {
                                l6.u();
                                throw null;
                            }
                        } else {
                            l6.u();
                            throw null;
                        }
                    } else {
                        l6.u();
                        throw null;
                    }
                } else {
                    jr_.E();
                    z3 = false;
                    z2 = true;
                }
                jQ.K(jr_, z3, z3, z2, z3);
            } else {
                l6.u();
                throw null;
            }
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new CZ(ncu, f, j, j2, j3, iv7, kmk, f2, c0, h8Var, i, z, iv72, iv73, i2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(defpackage.ncu r25, defpackage.iv7 r26, defpackage.kMk r27, boolean r28, defpackage.iv7 r29, defpackage.lR3 r30, defpackage.iUy r31, defpackage.fQ2 r32, defpackage.lPv r33, defpackage.m88 r34, int r35, int r36) {
        /*
        // Method dump skipped, instructions count: 618
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3.v(ncu, iv7, kMk, boolean, iv7, lR3, iUy, fQ2, lPv, m88, int, int):void");
    }
}
