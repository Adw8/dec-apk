package defpackage;

import android.os.Trace;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.List;

/* renamed from: fue  reason: default package */
/* loaded from: classes.dex */
public final class fue implements owG, oFl, h1U, dpd {
    public int C;
    public int H;
    public int L;

    /* renamed from: L  reason: collision with other field name */
    public boolean f3588L;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f3589O;

    /* renamed from: R  reason: collision with other field name */
    public float f3590R;

    /* renamed from: R  reason: collision with other field name */
    public bF9 f3591R;

    /* renamed from: R  reason: collision with other field name */
    public bUo f3592R;

    /* renamed from: R  reason: collision with other field name */
    public biT f3593R;

    /* renamed from: R  reason: collision with other field name */
    public fue f3594R;

    /* renamed from: R  reason: collision with other field name */
    public gzG f3595R;

    /* renamed from: R  reason: collision with other field name */
    public final h5 f3596R;

    /* renamed from: R  reason: collision with other field name */
    public h89 f3597R;

    /* renamed from: R  reason: collision with other field name */
    public final i6M f3598R;

    /* renamed from: R  reason: collision with other field name */
    public jJj f3599R;

    /* renamed from: R  reason: collision with other field name */
    public final jal f3600R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f3601R;

    /* renamed from: R  reason: collision with other field name */
    public lGT f3602R;

    /* renamed from: R  reason: collision with other field name */
    public mdz f3603R;

    /* renamed from: R  reason: collision with other field name */
    public ncu f3604R;

    /* renamed from: R  reason: collision with other field name */
    public poS f3605R;

    /* renamed from: R  reason: collision with other field name */
    public final pso f3606R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3607R;
    public int U;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f3608X;
    public int Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f3609Z;
    public boolean c;
    public final int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f3610e;
    public int m;

    /* renamed from: m  reason: collision with other field name */
    public boolean f3611m;
    public final biT v;

    /* renamed from: v  reason: collision with other field name */
    public kg9 f3612v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3613v;
    public int x;

    /* renamed from: R  reason: collision with other field name */
    public static final jxi f3587R = new jxi();
    public static final bTm R = new bTm();

    /* renamed from: R  reason: collision with other field name */
    public static final e5s f3586R = new e5s(0);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fue(int r2, boolean r3, int r4) {
        /*
            r1 = this;
            r4 = r2 & 1
            r0 = 0
            if (r4 == 0) goto L_0x0006
            r3 = r0
        L_0x0006:
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0011
            java.util.concurrent.atomic.AtomicInteger r2 = defpackage.b2X.R
            r4 = 1
            int r0 = r2.addAndGet(r4)
        L_0x0011:
            r1.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fue.<init>(int, boolean, int):void");
    }

    public static void k(fue fue) {
        if (d4u.R[jQ.I(fue.f3606R.R)] == 1) {
            pso pso = fue.f3606R;
            if (pso.f7299R) {
                fue.r(true);
            } else if (pso.f7300v) {
                fue.T(true);
            } else if (pso.e) {
                fue.s(true);
            } else if (pso.X) {
                fue.W(true);
            }
        } else {
            StringBuilder U = opT.U("Unexpected state ");
            U.append(opT.y(fue.f3606R.R));
            throw new IllegalStateException(U.toString());
        }
    }

    public final void A() {
        int i;
        h5 h5Var = this.f3596R;
        switch (h5Var.e) {
            case 7:
                i = ((biT) h5Var.R).e;
                break;
            default:
                h5Var.Z();
                i = ((biT) h5Var.R).e;
                break;
        }
        for (int i2 = i - 1; -1 < i2; i2--) {
            z((fue) ((biT) this.f3596R.R).f1772R[i2]);
        }
        h5 h5Var2 = this.f3596R;
        ((biT) h5Var2.R).L();
        ((f_c) h5Var2.v).g();
    }

    public final void B(bF9 bf9) {
        if (!n3x.v(this.f3591R, bf9)) {
            this.f3591R = bf9;
            this.f3598R.f4461R.R(bf9);
            V();
        }
    }

    public final poS C() {
        return (poS) this.f3600R.v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r6 = this;
            int r0 = r6.X
            if (r0 <= 0) goto L_0x0050
            boolean r0 = r6.f3613v
            if (r0 == 0) goto L_0x0050
            r0 = 0
            r6.f3613v = r0
            biT r1 = r6.f3593R
            if (r1 != 0) goto L_0x001b
            r1 = 16
            biT r2 = new biT
            fue[] r1 = new defpackage.fue[r1]
            r2.<init>(r1)
            r6.f3593R = r2
            r1 = r2
        L_0x001b:
            r1.L()
            h5 r2 = r6.f3596R
            java.lang.Object r2 = r2.R
            biT r2 = (defpackage.biT) r2
            int r3 = r2.e
            if (r3 <= 0) goto L_0x0043
            java.lang.Object[] r2 = r2.f1772R
        L_0x002a:
            r4 = r2[r0]
            fue r4 = (defpackage.fue) r4
            boolean r5 = r4.f3607R
            if (r5 == 0) goto L_0x003c
            biT r4 = r4.j()
            int r5 = r1.e
            r1.c(r5, r4)
            goto L_0x003f
        L_0x003c:
            r1.v(r4)
        L_0x003f:
            int r0 = r0 + 1
            if (r0 < r3) goto L_0x002a
        L_0x0043:
            pso r6 = r6.f3606R
            cRM r0 = r6.f7296R
            r1 = 1
            r0.e = r1
            lGL r6 = r6.f7298R
            if (r6 == 0) goto L_0x0050
            r6.X = r1
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fue.E():void");
    }

    public final void G(jJj jjj) {
        if (!n3x.v(this.f3599R, jjj)) {
            this.f3599R = jjj;
            V();
            fue N = N();
            if (N != null) {
                N.t();
            }
            i();
        }
    }

    public final List H() {
        return j().O();
    }

    public final void I() {
        if (this.f3608X) {
            int i = 0;
            this.f3608X = false;
            biT j = j();
            int i2 = j.e;
            if (i2 > 0) {
                Object[] objArr = j.f1772R;
                do {
                    ((fue) objArr[i]).I();
                    i++;
                } while (i < i2);
            }
        }
    }

    public final Boolean J() {
        lGL lgl = this.f3606R.f7298R;
        if (lgl != null) {
            return Boolean.valueOf(lgl.f5634c);
        }
        return null;
    }

    public final boolean K() {
        return this.f3595R != null;
    }

    public final void L() {
        k5m k5m;
        gzG gzg = this.f3595R;
        String str = null;
        if (gzg == null) {
            StringBuilder U = opT.U("Cannot detach node that is already detached!  Tree: ");
            fue N = N();
            if (N != null) {
                str = N.O(0);
            }
            U.append(str);
            throw new IllegalStateException(U.toString().toString());
        }
        fue N2 = N();
        if (N2 != null) {
            N2.t();
            N2.V();
            this.x = 3;
        }
        pso pso = this.f3606R;
        k5m k5m2 = pso.f7296R.f2092R;
        ((lt) k5m2).f5851R = true;
        ((lt) k5m2).f5852v = false;
        k5m2.e = false;
        k5m2.c = false;
        k5m2.X = false;
        k5m2.O = false;
        ((lt) k5m2).v = null;
        lGL lgl = pso.f7298R;
        if (!(lgl == null || (k5m = lgl.f5630R) == null)) {
            ((lt) k5m).f5851R = true;
            ((lt) k5m).f5852v = false;
            k5m.e = false;
            k5m.c = false;
            k5m.X = false;
            k5m.O = false;
            ((lt) k5m).v = null;
        }
        kg9 kg9 = this.f3612v;
        if (kg9 != null) {
            kg9.x(gzg);
        }
        poS C = C();
        poS pos = ((poS) this.f3600R.f4974R).f7280R;
        while (!n3x.v(C, pos) && C != null) {
            C.uv(C.f7275R);
            fue N3 = C.f7272R.N();
            if (N3 != null) {
                N3.t();
            }
            C = C.f7280R;
        }
        if (aH9.l(this) != null) {
            ((AndroidComposeView) gzg).j();
        }
        for (j28 j28 = (j28) this.f3600R.c; j28 != null; j28 = j28.v) {
            if (j28.f4792R) {
                j28.X();
            }
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) gzg;
        androidComposeView.f1209R.f4941R.v(this);
        androidComposeView.f1233c = true;
        this.f3595R = null;
        this.O = 0;
        biT bit = (biT) this.f3596R.R;
        int i = bit.e;
        if (i > 0) {
            Object[] objArr = bit.f1772R;
            int i2 = 0;
            do {
                ((fue) objArr[i2]).L();
                i2++;
            } while (i2 < i);
            this.L = Integer.MAX_VALUE;
            this.Z = Integer.MAX_VALUE;
            this.f3608X = false;
        }
        this.L = Integer.MAX_VALUE;
        this.Z = Integer.MAX_VALUE;
        this.f3608X = false;
    }

    public final boolean M() {
        Object obj = this.f3600R.e;
        if ((((j28) obj).X & 4) != 0) {
            if (!((((j28) obj).X & 2) != 0)) {
                return true;
            }
        }
        for (j28 j28 = (j28) obj; j28 != null; j28 = j28.c) {
            if (((j28.e & 2) != 0) && (j28 instanceof mGu) && msU.ZW(j28, 2).f7276R != null) {
                return false;
            }
            if ((j28.e & 4) != 0) {
                return true;
            }
        }
        return true;
    }

    public final fue N() {
        fue fue = this.f3594R;
        boolean z = true;
        z = false;
        if (fue == null || !fue.f3607R) {
        }
        if (!z) {
            return fue;
        }
        if (fue != null) {
            return fue.N();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String O(int r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r1
        L_0x0007:
            if (r2 >= r7) goto L_0x0011
            java.lang.String r3 = "  "
            r0.append(r3)
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0011:
            java.lang.String r2 = "|-"
            r0.append(r2)
            java.lang.String r2 = r6.toString()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            biT r6 = r6.j()
            int r2 = r6.e
            if (r2 <= 0) goto L_0x003e
            java.lang.Object[] r6 = r6.f1772R
            r3 = r1
        L_0x002d:
            r4 = r6[r3]
            fue r4 = (defpackage.fue) r4
            int r5 = r7 + 1
            java.lang.String r4 = r4.O(r5)
            r0.append(r4)
            int r3 = r3 + 1
            if (r3 < r2) goto L_0x002d
        L_0x003e:
            java.lang.String r6 = r0.toString()
            if (r7 != 0) goto L_0x004e
            int r7 = r6.length()
            int r7 = r7 + -1
            java.lang.String r6 = r6.substring(r1, r7)
        L_0x004e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fue.O(int):java.lang.String");
    }

    public final biT P() {
        if (this.f3610e) {
            this.v.L();
            biT bit = this.v;
            bit.c(bit.e, j());
            biT bit2 = this.v;
            Arrays.sort(bit2.f1772R, 0, bit2.e, f3586R);
            this.f3610e = false;
        }
        return this.v;
    }

    public final boolean Q(oys oys) {
        if (oys == null) {
            return false;
        }
        if (this.U == 3) {
            e();
        }
        return this.f3606R.f7296R.Ry(oys.f7046R);
    }

    @Override // defpackage.owG
    public final void R() {
        r(false);
        cRM crm = this.f3606R.f7296R;
        oys oys = crm.f2095R ? new oys(((l0f) crm).v) : null;
        if (oys != null) {
            gzG gzg = this.f3595R;
            if (gzg != null) {
                long j = oys.f7046R;
                AndroidComposeView androidComposeView = (AndroidComposeView) gzg;
                Trace.beginSection("AndroidOwner:measureAndLayout");
                try {
                    androidComposeView.f1209R.L(this, j);
                    androidComposeView.f1209R.R(false);
                } finally {
                    Trace.endSection();
                }
            }
        } else {
            gzG gzg2 = this.f3595R;
            if (gzg2 != null) {
                gzG.R(gzg2);
            }
        }
    }

    public final void S(int i, int i2) {
        if (i2 >= 0) {
            int i3 = (i2 + i) - 1;
            if (i <= i3) {
                while (true) {
                    h5 h5Var = this.f3596R;
                    Object N = ((biT) h5Var.R).N(i3);
                    ((f_c) h5Var.v).g();
                    z((fue) N);
                    if (i3 != i) {
                        i3--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(opT.m("count (", i2, ") must be greater than 0").toString());
        }
    }

    public final void T(boolean z) {
        gzG gzg;
        if (!this.f3607R && (gzg = this.f3595R) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) gzg;
            if (androidComposeView.f1209R.N(this, z)) {
                androidComposeView.t(null);
            }
        }
    }

    public final List U() {
        return ((biT) this.f3596R.R).O();
    }

    public final void V() {
        if (this.f3597R != null) {
            s(false);
        } else {
            r(false);
        }
    }

    public final void W(boolean z) {
        gzG gzg;
        if (!this.f3607R && (gzg = this.f3595R) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) gzg;
            if (androidComposeView.f1209R.U(this, z)) {
                androidComposeView.t(null);
            }
        }
    }

    public final void X() {
        this.C = this.U;
        this.U = 3;
        biT j = j();
        int i = j.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = j.f1772R;
            do {
                fue fue = (fue) objArr[i2];
                if (fue.U == 2) {
                    fue.X();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void Y() {
        if (this.U == 3) {
            X();
        }
        lGL lgl = this.f3606R.f7298R;
        if (lgl.v) {
            lgl.KZ(lgl.c, 0.0f, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void Z(Gp gp) {
        C().rz(gp);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.gzG r9) {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fue.c(gzG):void");
    }

    public final void d() {
        if (this.U == 3) {
            X();
        }
        try {
            this.f3611m = true;
            cRM crm = this.f3606R.f7296R;
            if (crm.v) {
                crm.MG(crm.c, crm.R, crm.f2093R);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } finally {
            this.f3611m = false;
        }
    }

    public final void e() {
        this.C = this.U;
        this.U = 3;
        biT j = j();
        int i = j.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = j.f1772R;
            do {
                fue fue = (fue) objArr[i2];
                if (fue.U != 3) {
                    fue.e();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void g(long j, pfJ pfj, boolean z, boolean z2) {
        C().A5(poS.f7267R, C().jp(j), pfj, z, z2);
    }

    public final void h() {
        boolean z = this.f3608X;
        this.f3608X = true;
        if (!z) {
            pso pso = this.f3606R;
            if (pso.f7299R) {
                r(true);
            } else if (pso.e) {
                s(true);
            }
        }
        poS C = C();
        poS pos = ((poS) this.f3600R.f4974R).f7280R;
        while (!n3x.v(C, pos) && C != null) {
            if (C.e) {
                C.FP();
            }
            C = C.f7280R;
        }
        biT j = j();
        int i = j.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = j.f1772R;
            do {
                fue fue = (fue) objArr[i2];
                if (fue.L != Integer.MAX_VALUE) {
                    fue.h();
                    k(fue);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void i() {
        poS C = C();
        jP7 jp7 = this.f3600R.f4974R;
        while (C != jp7) {
            l_W l_w = (l_W) C;
            lYW lyw = ((poS) l_w).f7276R;
            if (lyw != null) {
                lyw.invalidate();
            }
            C = ((poS) l_w).f7280R;
        }
        lYW lyw2 = ((poS) this.f3600R.f4974R).f7276R;
        if (lyw2 != null) {
            lyw2.invalidate();
        }
    }

    @Override // defpackage.oFl
    public final boolean isValid() {
        return K();
    }

    public final biT j() {
        E();
        return this.X == 0 ? (biT) this.f3596R.R : this.f3593R;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0285, code lost:
        if (r5 == true) goto L_0x0289;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.ncu r15) {
        /*
        // Method dump skipped, instructions count: 769
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fue.l(ncu):void");
    }

    public final List m() {
        lGL lgl = this.f3606R.f7298R;
        lgl.f5632R.f7297R.H();
        if (!lgl.X) {
            return lgl.R.O();
        }
        msU.N(lgl.f5632R.f7297R, lgl.R, nqF.h);
        lgl.X = false;
        return lgl.R.O();
    }

    public final void n() {
        if (this.f3607R) {
            fue N = N();
            if (N != null) {
                N.n();
                return;
            }
            return;
        }
        this.f3610e = true;
    }

    public final void o() {
        fue N;
        if (this.X > 0) {
            this.f3613v = true;
        }
        if (this.f3607R && (N = N()) != null) {
            N.f3613v = true;
        }
    }

    public final void p() {
        biT j = j();
        int i = j.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = j.f1772R;
            do {
                fue fue = (fue) objArr[i2];
                int i3 = fue.C;
                fue.U = i3;
                if (i3 != 3) {
                    fue.p();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void r(boolean z) {
        gzG gzg;
        fue N;
        if (!this.c && !this.f3607R && (gzg = this.f3595R) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) gzg;
            if (androidComposeView.f1209R.P(this, z)) {
                androidComposeView.t(this);
            }
            cRM crm = this.f3606R.f7296R;
            fue N2 = crm.f2094R.f7297R.N();
            int i = crm.f2094R.f7297R.U;
            if (N2 != null && i != 3) {
                while (N2.U == i && (N = N2.N()) != null) {
                    N2 = N;
                }
                int I = jQ.I(i);
                if (I == 0) {
                    N2.r(z);
                } else if (I == 1) {
                    N2.T(z);
                } else {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
            }
        }
    }

    public final void s(boolean z) {
        fue N;
        if (this.f3597R != null) {
            gzG gzg = this.f3595R;
            if (gzg != null && !this.c && !this.f3607R) {
                AndroidComposeView androidComposeView = (AndroidComposeView) gzg;
                if (androidComposeView.f1209R.C(this, z)) {
                    androidComposeView.t(this);
                }
                lGL lgl = this.f3606R.f7298R;
                fue N2 = lgl.f5632R.f7297R.N();
                int i = lgl.f5632R.f7297R.U;
                if (N2 != null && i != 3) {
                    while (N2.U == i && (N = N2.N()) != null) {
                        N2 = N;
                    }
                    int I = jQ.I(i);
                    if (I == 0) {
                        N2.s(z);
                    } else if (I == 1) {
                        N2.W(z);
                    } else {
                        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                    }
                }
            }
        } else {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
        }
    }

    public final void t() {
        if (this.f3588L) {
            poS pos = this.f3600R.f4974R;
            poS pos2 = C().f7284v;
            this.f3605R = null;
            while (true) {
                if (n3x.v(pos, pos2)) {
                    break;
                }
                if ((pos != null ? pos.f7276R : null) != null) {
                    this.f3605R = pos;
                    break;
                }
                pos = pos != null ? pos.f7284v : null;
            }
        }
        poS pos3 = this.f3605R;
        if (pos3 != null && pos3.f7276R == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (pos3 != null) {
            pos3.FP();
        } else {
            fue N = N();
            if (N != null) {
                N.t();
            }
        }
    }

    public final String toString() {
        return iTI.o(this) + " children: " + H().size() + " measurePolicy: " + this.f3591R;
    }

    public final void u(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i > i2 ? i + i4 : i;
                int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
                h5 h5Var = this.f3596R;
                Object N = ((biT) h5Var.R).N(i5);
                ((f_c) h5Var.v).g();
                h5 h5Var2 = this.f3596R;
                ((biT) h5Var2.R).R(i6, (fue) N);
                ((f_c) h5Var2.v).g();
            }
            n();
            o();
            V();
        }
    }

    @Override // defpackage.dpd
    public final void v() {
        j28 j28;
        jP7 jp7 = this.f3600R.f4974R;
        boolean l = msU.l(128);
        if (l) {
            j28 = jp7.f4923R;
        } else {
            j28 = jp7.f4923R.v;
            if (j28 == null) {
                return;
            }
        }
        h7_ h7_ = poS.R;
        j28 ky = jp7.ky(l);
        while (ky != null && (ky.X & 128) != 0) {
            if ((ky.e & 128) != 0 && (ky instanceof jo5)) {
                jP7 jp72 = this.f3600R.f4974R;
                e7 e7Var = (e7) ((jo5) ky);
                e7Var.f2979R = jp72;
                eo1 eo1 = e7Var.R;
                if (eo1 instanceof mij) {
                    ((mij) eo1).j(jp72);
                }
            }
            if (ky != j28) {
                ky = ky.c;
            } else {
                return;
            }
        }
    }

    public final List x() {
        cRM crm = this.f3606R.f7296R;
        crm.f2094R.f7297R.E();
        if (!crm.e) {
            return crm.f2090R.O();
        }
        msU.N(crm.f2094R.f7297R, crm.f2090R, lBz.c);
        crm.e = false;
        return crm.f2090R.O();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(int r7, defpackage.fue r8) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fue.y(int, fue):void");
    }

    public final void z(fue fue) {
        if (fue.f3606R.v > 0) {
            pso pso = this.f3606R;
            pso.c(pso.v - 1);
        }
        if (this.f3595R != null) {
            fue.L();
        }
        fue.f3594R = null;
        fue.C().f7284v = null;
        if (fue.f3607R) {
            this.X--;
            biT bit = (biT) fue.f3596R.R;
            int i = bit.e;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = bit.f1772R;
                do {
                    ((fue) objArr[i2]).C().f7284v = null;
                    i2++;
                } while (i2 < i);
            }
        }
        o();
        n();
    }

    public fue(int i, boolean z) {
        this.f3607R = z;
        this.e = i;
        this.f3596R = new h5(new biT(new fue[16]), new q4(13, this));
        this.v = new biT(new fue[16]);
        this.f3610e = true;
        this.f3591R = f3587R;
        this.f3598R = new i6M(this);
        this.f3599R = new i4B(1.0f, 1.0f);
        this.f3603R = mdz.Ltr;
        this.f3592R = R;
        this.L = Integer.MAX_VALUE;
        this.Z = Integer.MAX_VALUE;
        this.x = 3;
        this.H = 3;
        this.U = 3;
        this.C = 3;
        this.f3600R = new jal(this);
        this.f3606R = new pso(this);
        this.f3588L = true;
        this.f3604R = aff.R;
    }
}
