package defpackage;

/* renamed from: a4b  reason: default package */
/* loaded from: classes.dex */
public abstract class a4b {
    public static final float R = (float) 48;
    public static final float v = (float) 12;
    public static final float c = (float) 8;
    public static final float e = (float) 112;
    public static final float X = (float) 280;

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.hRH r19, defpackage.h0T r20, defpackage.ncu r21, defpackage.lR3 r22, defpackage.m88 r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 616
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4b.R(hRH, h0T, ncu, lR3, m88, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long c(defpackage.oOe r6, defpackage.oOe r7) {
        /*
            int r0 = r7.R
            int r1 = r6.c
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x000b
        L_0x0009:
            r1 = r3
            goto L_0x002f
        L_0x000b:
            int r1 = r7.c
            int r4 = r6.R
            if (r1 > r4) goto L_0x0013
            r1 = r2
            goto L_0x002f
        L_0x0013:
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0017
            goto L_0x0009
        L_0x0017:
            int r0 = java.lang.Math.max(r4, r0)
            int r1 = r6.c
            int r4 = r7.c
            int r1 = java.lang.Math.min(r1, r4)
            int r1 = r1 + r0
            int r1 = r1 / 2
            int r0 = r7.R
            int r1 = r1 - r0
            float r1 = (float) r1
            int r4 = r7.c
            int r4 = r4 - r0
            float r0 = (float) r4
            float r1 = r1 / r0
        L_0x002f:
            int r0 = r7.v
            int r4 = r6.e
            if (r0 < r4) goto L_0x0037
        L_0x0035:
            r2 = r3
            goto L_0x005b
        L_0x0037:
            int r4 = r7.e
            int r5 = r6.v
            if (r4 > r5) goto L_0x003e
            goto L_0x005b
        L_0x003e:
            int r4 = r4 - r0
            if (r4 != 0) goto L_0x0042
            goto L_0x0035
        L_0x0042:
            int r0 = java.lang.Math.max(r5, r0)
            int r6 = r6.e
            int r2 = r7.e
            int r6 = java.lang.Math.min(r6, r2)
            int r6 = r6 + r0
            int r6 = r6 / 2
            int r0 = r7.v
            int r6 = r6 - r0
            float r6 = (float) r6
            int r7 = r7.e
            int r7 = r7 - r0
            float r7 = (float) r7
            float r2 = r6 / r7
        L_0x005b:
            long r6 = defpackage.aH9.y(r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4b.c(oOe, oOe):long");
    }

    public static final void v(iv7 iv7, f_c f_c, ncu ncu, iv7 iv72, iv7 iv73, boolean z, miv miv, ngd ngd, p2E p2e, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1564716777);
        if ((i & 14) == 0) {
            i2 = (jr_.O(iv7) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.O(f_c) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= jr_.O(ncu) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= jr_.O(iv72) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= jr_.O(iv73) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= jr_.L(z) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= jr_.O(miv) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= jr_.O(ngd) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= jr_.O(p2e) ? 67108864 : 33554432;
        }
        if ((i2 & 191739611) != 38347922 || !jr_.J()) {
            ncu _ = aH9._(adU.x(adU.X(dTl.t(ncu, p2e, ek_.R(true, 0.0f, jr_, 6, 6), z, null, f_c, 24)), e, im1.v, X, 8), ngd);
            ky kyVar = dq.f2891v;
            jr_.w(693286680);
            bF9 R2 = ktl.R(nA.R, kyVar, jr_);
            jr_.w(-1323940314);
            jJj jjj = (jJj) jr_.x(lnF.X);
            mdz mdz = (mdz) jr_.x(lnF.H);
            bUo buo = (bUo) jr_.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(_);
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
                jr_.w(-837672837);
                g1c.R(dB8.R((c_P) jr_.x(dB8.R), im1.f4718e), aH9.I(jr_, 1065051884, new fO4(iv72, miv, z, i2, iv73, iv7)), jr_, 48);
                jr_.g(false);
                jr_.g(false);
                jr_.g(false);
                jr_.g(true);
                jr_.g(false);
                jr_.g(false);
            } else {
                l6.u();
                throw null;
            }
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new fjW(iv7, f_c, ncu, iv72, iv73, z, miv, ngd, p2e, i);
        }
    }
}
