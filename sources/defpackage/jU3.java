package defpackage;

import java.util.Arrays;

/* renamed from: jU3  reason: default package */
/* loaded from: classes.dex */
public final class jU3 {

    /* renamed from: R  reason: collision with other field name */
    public final fue f4940R;

    /* renamed from: R  reason: collision with other field name */
    public oys f4942R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4943R;

    /* renamed from: R  reason: collision with other field name */
    public final hP9 f4941R = new hP9(0);

    /* renamed from: R  reason: collision with other field name */
    public final cSW f4939R = new cSW();

    /* renamed from: R  reason: collision with other field name */
    public final biT f4938R = new biT(new dpd[16]);
    public long R = 1;
    public final biT v = new biT(new kBJ[16]);

    public jU3(fue fue) {
        this.f4940R = fue;
    }

    public static boolean X(fue fue) {
        k5m k5m;
        pso pso = fue.f3606R;
        if (pso.X) {
            if (fue.H == 1) {
                return true;
            }
            lGL lgl = pso.f7298R;
            if ((lgl == null || (k5m = lgl.f5630R) == null || !k5m.e()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public final boolean C(fue fue, boolean z) {
        if (fue.f3597R != null) {
            int I = jQ.I(fue.f3606R.R);
            if (I != 0) {
                if (I != 1) {
                    if (!(I == 2 || I == 3)) {
                        if (I == 4) {
                            pso pso = fue.f3606R;
                            if (!pso.e || z) {
                                pso.e = true;
                                pso.f7299R = true;
                                if (n3x.v(fue.J(), Boolean.TRUE) || X(fue)) {
                                    fue N = fue.N();
                                    if (!(N != null && N.f3606R.e)) {
                                        this.f4941R.R(fue);
                                    }
                                }
                                if (!this.f4943R) {
                                    return true;
                                }
                            }
                        } else {
                            throw new j8f((Object) null);
                        }
                    }
                }
                return false;
            }
            this.v.v(new kBJ(fue, true, z));
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }

    public final void H(fue fue) {
        pso pso = fue.f3606R;
        if (pso.f7299R || pso.e) {
            oys oys = fue == this.f4940R ? this.f4942R : null;
            if (pso.e) {
                v(fue, oys);
            }
            c(fue, oys);
        }
    }

    public final void L(fue fue, long j) {
        int i;
        if (!(!n3x.v(fue, this.f4940R))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f4940R.K()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f4940R.f3608X) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f4943R) {
            boolean z = false;
            if (this.f4942R != null) {
                this.f4943R = true;
                try {
                    this.f4941R.v(fue);
                    boolean v = v(fue, new oys(j));
                    c(fue, new oys(j));
                    if ((v || fue.f3606R.X) && n3x.v(fue.J(), Boolean.TRUE)) {
                        fue.Y();
                    }
                    if (fue.f3606R.f7300v && fue.f3608X) {
                        fue.d();
                        this.f4939R.R.v(fue);
                        fue.f3609Z = true;
                    }
                } finally {
                    this.f4943R = false;
                }
            }
            biT bit = this.f4938R;
            int i2 = bit.e;
            if (i2 > 0) {
                Object[] objArr = bit.f1772R;
                do {
                    ((dpd) objArr[z ? 1 : 0]).v();
                    i = (z ? 1 : 0) + 1;
                    z = i;
                } while (i < i2);
                this.f4938R.L();
            }
            this.f4938R.L();
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        if (r6.f7300v == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean N(defpackage.fue r5, boolean r6) {
        /*
            r4 = this;
            pso r0 = r5.f3606R
            int r0 = r0.R
            int r0 = defpackage.jQ.I(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005d
            if (r0 == r1) goto L_0x005d
            r3 = 2
            if (r0 == r3) goto L_0x005d
            r3 = 3
            if (r0 == r3) goto L_0x005d
            r3 = 4
            if (r0 != r3) goto L_0x0056
            if (r6 != 0) goto L_0x0024
            pso r6 = r5.f3606R
            boolean r0 = r6.f7299R
            if (r0 != 0) goto L_0x005d
            boolean r6 = r6.f7300v
            if (r6 == 0) goto L_0x0024
            goto L_0x005d
        L_0x0024:
            pso r6 = r5.f3606R
            r6.f7300v = r1
            r6.c = r1
            boolean r6 = r5.f3608X
            if (r6 == 0) goto L_0x0051
            fue r6 = r5.N()
            if (r6 == 0) goto L_0x003c
            pso r0 = r6.f3606R
            boolean r0 = r0.f7300v
            if (r0 != r1) goto L_0x003c
            r0 = r1
            goto L_0x003d
        L_0x003c:
            r0 = r2
        L_0x003d:
            if (r0 != 0) goto L_0x0051
            if (r6 == 0) goto L_0x0049
            pso r6 = r6.f3606R
            boolean r6 = r6.f7299R
            if (r6 != r1) goto L_0x0049
            r6 = r1
            goto L_0x004a
        L_0x0049:
            r6 = r2
        L_0x004a:
            if (r6 != 0) goto L_0x0051
            hP9 r6 = r4.f4941R
            r6.R(r5)
        L_0x0051:
            boolean r4 = r4.f4943R
            if (r4 != 0) goto L_0x005d
            goto L_0x005e
        L_0x0056:
            j8f r4 = new j8f
            r5 = 0
            r4.<init>(r5)
            throw r4
        L_0x005d:
            r1 = r2
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jU3.N(fue, boolean):boolean");
    }

    public final boolean O(q4 q4Var) {
        boolean z;
        int i;
        if (!this.f4940R.K()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f4940R.f3608X) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f4943R) {
            boolean z2 = false;
            if (this.f4942R != null) {
                this.f4943R = true;
                try {
                    if (!((mYQ) this.f4941R.f4227R).isEmpty()) {
                        hP9 hp9 = this.f4941R;
                        z = false;
                        while (!((mYQ) hp9.f4227R).isEmpty()) {
                            fue fue = (fue) ((mYQ) hp9.f4227R).first();
                            hp9.v(fue);
                            boolean x = x(fue);
                            if (fue == this.f4940R && x) {
                                z = true;
                            }
                        }
                        if (q4Var != null) {
                            q4Var.g();
                        }
                    } else {
                        z = false;
                    }
                } finally {
                    this.f4943R = false;
                }
            } else {
                z = false;
            }
            biT bit = this.f4938R;
            int i2 = bit.e;
            if (i2 > 0) {
                Object[] objArr = bit.f1772R;
                do {
                    ((dpd) objArr[z2 ? 1 : 0]).v();
                    i = (z2 ? 1 : 0) + 1;
                    z2 = i;
                } while (i < i2);
                this.f4938R.L();
                return z;
            }
            this.f4938R.L();
            return z;
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if ((r5.x == 1 || r0.f7296R.f2092R.e()) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean P(defpackage.fue r5, boolean r6) {
        /*
            r4 = this;
            pso r0 = r5.f3606R
            int r0 = r0.R
            int r0 = defpackage.jQ.I(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x006c
            if (r0 == r2) goto L_0x006c
            r3 = 2
            if (r0 == r3) goto L_0x0062
            r3 = 3
            if (r0 == r3) goto L_0x0062
            r3 = 4
            if (r0 != r3) goto L_0x005b
            pso r0 = r5.f3606R
            boolean r3 = r0.f7299R
            if (r3 == 0) goto L_0x0020
            if (r6 != 0) goto L_0x0020
            goto L_0x006c
        L_0x0020:
            r0.f7299R = r2
            boolean r6 = r5.f3608X
            if (r6 != 0) goto L_0x003f
            int r6 = r5.x
            if (r6 == r2) goto L_0x0037
            cRM r6 = r0.f7296R
            k5m r6 = r6.f2092R
            boolean r6 = r6.e()
            if (r6 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r6 = r1
            goto L_0x0038
        L_0x0037:
            r6 = r2
        L_0x0038:
            if (r6 == 0) goto L_0x003c
            r6 = r2
            goto L_0x003d
        L_0x003c:
            r6 = r1
        L_0x003d:
            if (r6 == 0) goto L_0x0055
        L_0x003f:
            fue r6 = r5.N()
            if (r6 == 0) goto L_0x004d
            pso r6 = r6.f3606R
            boolean r6 = r6.f7299R
            if (r6 != r2) goto L_0x004d
            r6 = r2
            goto L_0x004e
        L_0x004d:
            r6 = r1
        L_0x004e:
            if (r6 != 0) goto L_0x0055
            hP9 r6 = r4.f4941R
            r6.R(r5)
        L_0x0055:
            boolean r4 = r4.f4943R
            if (r4 != 0) goto L_0x006c
            r1 = r2
            goto L_0x006c
        L_0x005b:
            j8f r4 = new j8f
            r5 = 0
            r4.<init>(r5)
            throw r4
        L_0x0062:
            biT r4 = r4.v
            kBJ r0 = new kBJ
            r0.<init>(r5, r1, r6)
            r4.v(r0)
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jU3.P(fue, boolean):boolean");
    }

    public final void R(boolean z) {
        if (z) {
            cSW csw = this.f4939R;
            fue fue = this.f4940R;
            csw.R.L();
            csw.R.v(fue);
            fue.f3609Z = true;
        }
        cSW csw2 = this.f4939R;
        biT bit = csw2.R;
        Arrays.sort(bit.f1772R, 0, bit.e, dFp.R);
        biT bit2 = csw2.R;
        int i = bit2.e;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bit2.f1772R;
            do {
                fue fue2 = (fue) objArr[i2];
                if (fue2.f3609Z) {
                    cSW.R(fue2);
                }
                i2--;
            } while (i2 >= 0);
            csw2.R.L();
        }
        csw2.R.L();
    }

    public final boolean U(fue fue, boolean z) {
        int I = jQ.I(fue.f3606R.R);
        if (I != 0) {
            if (I != 1) {
                if (I != 2) {
                    if (I != 3) {
                        if (I != 4) {
                            throw new j8f((Object) null);
                        }
                    }
                }
            }
            return false;
        }
        pso pso = fue.f3606R;
        if ((!pso.e && !pso.X) || z) {
            pso.X = true;
            pso.O = true;
            pso.f7300v = true;
            pso.c = true;
            if (n3x.v(fue.J(), Boolean.TRUE)) {
                fue N = fue.N();
                if (!(N != null && N.f3606R.e)) {
                    if (!(N != null && N.f3606R.X)) {
                        this.f4941R.R(fue);
                    }
                }
            }
            if (!this.f4943R) {
                return true;
            }
        }
        return false;
    }

    public final void Z() {
        if (this.f4940R.K()) {
            fue fue = this.f4940R;
            if (!fue.f3608X) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (!(!this.f4943R)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (this.f4942R != null) {
                this.f4943R = true;
                try {
                    m(fue);
                } finally {
                    this.f4943R = false;
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final boolean c(fue fue, oys oys) {
        boolean z;
        if (oys != null) {
            z = fue.Q(oys);
        } else {
            cRM crm = fue.f3606R.f7296R;
            z = fue.Q(crm.f2095R ? new oys(((l0f) crm).v) : null);
        }
        fue N = fue.N();
        if (z && N != null) {
            int i = fue.x;
            if (i == 1) {
                P(N, false);
            } else if (i == 2) {
                N(N, false);
            }
        }
        return z;
    }

    public final void e(fue fue) {
        if (!((mYQ) this.f4941R.f4227R).isEmpty()) {
            if (!this.f4943R) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!fue.f3606R.f7299R) {
                biT j = fue.j();
                int i = j.e;
                if (i > 0) {
                    int i2 = 0;
                    Object[] objArr = j.f1772R;
                    do {
                        fue fue2 = (fue) objArr[i2];
                        if (fue2.f3606R.f7299R && this.f4941R.v(fue2)) {
                            x(fue2);
                        }
                        if (!fue2.f3606R.f7299R) {
                            e(fue2);
                        }
                        i2++;
                    } while (i2 < i);
                    if (fue.f3606R.f7299R && this.f4941R.v(fue)) {
                        x(fue);
                    }
                } else if (fue.f3606R.f7299R) {
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    public final void j(long j) {
        oys oys = this.f4942R;
        if (oys == null ? false : oys.v(oys.f7046R, j)) {
            return;
        }
        if (!this.f4943R) {
            this.f4942R = new oys(j);
            fue fue = this.f4940R;
            fue.f3606R.f7299R = true;
            this.f4941R.R(fue);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void m(fue fue) {
        H(fue);
        biT j = fue.j();
        int i = j.e;
        if (i > 0) {
            Object[] objArr = j.f1772R;
            int i2 = 0;
            do {
                fue fue2 = (fue) objArr[i2];
                boolean z = true;
                if (fue2.x != 1 && !fue2.f3606R.f7296R.f2092R.e()) {
                    z = false;
                }
                if (z) {
                    m(fue2);
                }
                i2++;
            } while (i2 < i);
            H(fue);
        }
        H(fue);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(defpackage.fue r5, defpackage.oys r6) {
        /*
            r4 = this;
            h89 r0 = r5.f3597R
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 0
            if (r6 == 0) goto L_0x0018
            if (r0 == 0) goto L_0x0016
            pso r0 = r5.f3606R
            lGL r0 = r0.f7298R
            long r2 = r6.f7046R
            boolean r6 = r0.Ry(r2)
            goto L_0x002a
        L_0x0016:
            r6 = r1
            goto L_0x002a
        L_0x0018:
            pso r6 = r5.f3606R
            lGL r6 = r6.f7298R
            if (r6 == 0) goto L_0x0020
            oys r2 = r6.f5631R
        L_0x0020:
            if (r2 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0016
            long r2 = r2.f7046R
            boolean r6 = r6.Ry(r2)
        L_0x002a:
            fue r0 = r5.N()
            if (r6 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0049
            h89 r2 = r0.f3597R
            if (r2 != 0) goto L_0x003a
            r4.P(r0, r1)
            goto L_0x0049
        L_0x003a:
            int r5 = r5.H
            r2 = 1
            if (r5 != r2) goto L_0x0043
            r4.C(r0, r1)
            goto L_0x0049
        L_0x0043:
            r2 = 2
            if (r5 != r2) goto L_0x0049
            r4.U(r0, r1)
        L_0x0049:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jU3.v(fue, oys):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(defpackage.fue r11) {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jU3.x(fue):boolean");
    }
}
