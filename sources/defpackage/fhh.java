package defpackage;

import java.util.Arrays;

/* renamed from: fhh  reason: default package */
/* loaded from: classes.dex */
public final class fhh {
    public static int Z = 1000;
    public static boolean c = false;

    /* renamed from: R  reason: collision with other field name */
    public Wz f3510R;

    /* renamed from: R  reason: collision with other field name */
    public j_m f3511R;

    /* renamed from: R  reason: collision with other field name */
    public final piu f3512R;

    /* renamed from: R  reason: collision with other field name */
    public Wz[] f3514R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3513R = false;
    public int R = 0;
    public int v = 32;

    /* renamed from: c  reason: collision with other field name */
    public int f3517c = 32;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3518v = false;

    /* renamed from: R  reason: collision with other field name */
    public boolean[] f3516R = new boolean[32];
    public int e = 1;
    public int X = 0;
    public int O = 32;

    /* renamed from: R  reason: collision with other field name */
    public aLq[] f3515R = new aLq[Z];
    public int L = 0;

    public fhh() {
        this.f3514R = null;
        this.f3514R = new Wz[32];
        t();
        piu piu = new piu(2);
        this.f3512R = piu;
        this.f3511R = new j_m(piu);
        this.f3510R = new Wz(piu);
    }

    public static int N(iP5 ip5) {
        aLq alq = ip5.f4580R;
        if (alq != null) {
            return (int) (alq.R + 0.5f);
        }
        return 0;
    }

    public final aLq C() {
        if (this.e + 1 >= this.f3517c) {
            P();
        }
        aLq R = R(3);
        int i = this.R + 1;
        this.R = i;
        this.e++;
        R.e = i;
        ((aLq[]) this.f3512R.e)[i] = R;
        return R;
    }

    public final aLq H(Object obj) {
        aLq alq = null;
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.f3517c) {
            P();
        }
        if (obj instanceof iP5) {
            iP5 ip5 = (iP5) obj;
            alq = ip5.f4580R;
            if (alq == null) {
                ip5.Z();
                alq = ip5.f4580R;
            }
            int i = alq.e;
            if (i == -1 || i > this.R || ((aLq[]) this.f3512R.e)[i] == null) {
                if (i != -1) {
                    alq.c();
                }
                int i2 = this.R + 1;
                this.R = i2;
                this.e++;
                alq.e = i2;
                alq.L = 1;
                ((aLq[]) this.f3512R.e)[i2] = alq;
            }
        }
        return alq;
    }

    public final void L(aLq alq, aLq alq2, int i, int i2) {
        Wz U = U();
        aLq C = C();
        C.O = 0;
        U.c(alq, alq2, C, i);
        if (i2 != 8) {
            U.f612R.Z(x(i2), (float) ((int) (U.f612R.X(C) * -1.0f)));
        }
        c(U);
    }

    public final void O(aLq alq, aLq alq2, int i, int i2) {
        Wz U = U();
        aLq C = C();
        C.O = 0;
        U.v(alq, alq2, C, i);
        if (i2 != 8) {
            U.f612R.Z(x(i2), (float) ((int) (U.f612R.X(C) * -1.0f)));
        }
        c(U);
    }

    public final void P() {
        int i = this.v * 2;
        this.v = i;
        this.f3514R = (Wz[]) Arrays.copyOf(this.f3514R, i);
        piu piu = this.f3512R;
        piu.e = (aLq[]) Arrays.copyOf((aLq[]) piu.e, this.v);
        int i2 = this.v;
        this.f3516R = new boolean[i2];
        this.f3517c = i2;
        this.O = i2;
    }

    public final aLq R(int i) {
        aLq alq = (aLq) ((mRM) this.f3512R.c).R();
        if (alq == null) {
            alq = new aLq(i);
            alq.L = i;
        } else {
            alq.c();
            alq.L = i;
        }
        int i2 = this.L;
        int i3 = Z;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            Z = i4;
            this.f3515R = (aLq[]) Arrays.copyOf(this.f3515R, i4);
        }
        aLq[] alqArr = this.f3515R;
        int i5 = this.L;
        this.L = i5 + 1;
        alqArr[i5] = alq;
        return alq;
    }

    public final Wz U() {
        Wz wz = (Wz) ((mRM) this.f3512R.f7203v).R();
        if (wz == null) {
            return new Wz(this.f3512R);
        }
        wz.f610R = null;
        wz.f612R.clear();
        wz.R = 0.0f;
        wz.f613R = false;
        return wz;
    }

    public final void X(aLq alq, aLq alq2, int i, int i2) {
        if (i2 == 8 && alq2.v && alq.X == -1) {
            alq.e(this, alq2.R + ((float) i));
            return;
        }
        Wz U = U();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            U.R = (float) i;
        }
        if (!z) {
            U.f612R.Z(alq, -1.0f);
            U.f612R.Z(alq2, 1.0f);
        } else {
            U.f612R.Z(alq, 1.0f);
            U.f612R.Z(alq2, -1.0f);
        }
        if (i2 != 8) {
            U.R(this, i2);
        }
        c(U);
    }

    public final void Z(Wz wz) {
        int i;
        if (wz.f613R) {
            wz.f610R.e(this, wz.R);
        } else {
            Wz[] wzArr = this.f3514R;
            int i2 = this.X;
            wzArr[i2] = wz;
            aLq alq = wz.f610R;
            alq.X = i2;
            this.X = i2 + 1;
            alq.X(this, wz);
        }
        if (this.f3513R) {
            int i3 = 0;
            while (i3 < this.X) {
                if (this.f3514R[i3] == null) {
                    System.out.println("WTF");
                }
                Wz wz2 = this.f3514R[i3];
                if (wz2 != null && wz2.f613R) {
                    wz2.f610R.e(this, wz2.R);
                    ((mRM) this.f3512R.f7203v).v(wz2);
                    this.f3514R[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.X;
                        if (i4 >= i) {
                            break;
                        }
                        Wz[] wzArr2 = this.f3514R;
                        int i6 = i4 - 1;
                        Wz wz3 = wzArr2[i4];
                        wzArr2[i6] = wz3;
                        aLq alq2 = wz3.f610R;
                        if (alq2.X == i4) {
                            alq2.X = i6;
                        }
                        i4++;
                        i5 = i4;
                    }
                    if (i5 < i) {
                        this.f3514R[i5] = null;
                    }
                    this.X = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3513R = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bf, code lost:
        if (r4.m <= 1) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c8, code lost:
        if (r4.m <= 1) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e6, code lost:
        if (r4.m <= 1) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ef, code lost:
        if (r4.m <= 1) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f2, code lost:
        r14 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.Wz r17) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhh.c(Wz):void");
    }

    public final void e(aLq alq, int i) {
        int i2 = alq.X;
        if (i2 == -1) {
            alq.e(this, (float) i);
            for (int i3 = 0; i3 < this.R + 1; i3++) {
                aLq alq2 = ((aLq[]) this.f3512R.e)[i3];
            }
        } else if (i2 != -1) {
            Wz wz = this.f3514R[i2];
            if (wz.f613R) {
                wz.R = (float) i;
            } else if (wz.f612R.c() == 0) {
                wz.f613R = true;
                wz.R = (float) i;
            } else {
                Wz U = U();
                if (i < 0) {
                    U.R = (float) (i * -1);
                    U.f612R.Z(alq, 1.0f);
                } else {
                    U.R = (float) i;
                    U.f612R.Z(alq, -1.0f);
                }
                c(U);
            }
        } else {
            Wz U2 = U();
            U2.f610R = alq;
            float f = (float) i;
            alq.R = f;
            U2.R = f;
            U2.f613R = true;
            c(U2);
        }
    }

    public final void g(j_m j_m) {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.X) {
                z = false;
                break;
            }
            Wz wz = this.f3514R[i2];
            if (wz.f610R.L != 1 && wz.R < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.X) {
                    Wz wz2 = this.f3514R[i6];
                    if (wz2.f610R.L != i && !wz2.f613R && wz2.R < f) {
                        int c2 = wz2.f612R.c();
                        int i8 = 0;
                        while (i8 < c2) {
                            aLq v = wz2.f612R.v(i8);
                            float X = wz2.f612R.X(v);
                            if (X > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = v.f844R[i9] / X;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i5 = v.e;
                                        i7 = i9;
                                        f2 = f3;
                                        i4 = i6;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                    i = 1;
                }
                if (i4 != -1) {
                    Wz wz3 = this.f3514R[i4];
                    wz3.f610R.X = -1;
                    wz3.L(((aLq[]) this.f3512R.e)[i5]);
                    aLq alq = wz3.f610R;
                    alq.X = i4;
                    alq.X(this, wz3);
                } else {
                    z2 = true;
                }
                if (i3 > this.e / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        y(j_m);
        m();
    }

    public final void i() {
        piu piu;
        int i = 0;
        while (true) {
            piu = this.f3512R;
            aLq[] alqArr = (aLq[]) piu.e;
            if (i >= alqArr.length) {
                break;
            }
            aLq alq = alqArr[i];
            if (alq != null) {
                alq.c();
            }
            i++;
        }
        mRM mrm = (mRM) piu.c;
        aLq[] alqArr2 = this.f3515R;
        int i2 = this.L;
        mrm.getClass();
        if (i2 > alqArr2.length) {
            i2 = alqArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            aLq alq2 = alqArr2[i3];
            int i4 = mrm.v;
            Object[] objArr = mrm.f6044R;
            if (i4 < objArr.length) {
                objArr[i4] = alq2;
                mrm.v = i4 + 1;
            }
        }
        this.L = 0;
        Arrays.fill((aLq[]) this.f3512R.e, (Object) null);
        this.R = 0;
        j_m j_m = this.f3511R;
        j_m.R = 0;
        ((Wz) j_m).R = 0.0f;
        this.e = 1;
        for (int i5 = 0; i5 < this.X; i5++) {
            Wz wz = this.f3514R[i5];
        }
        t();
        this.X = 0;
        this.f3510R = new Wz(this.f3512R);
    }

    public final void j() {
        if (this.f3511R.X()) {
            m();
        } else if (this.f3518v) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.X) {
                    z = true;
                    break;
                } else if (!this.f3514R[i].f613R) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                g(this.f3511R);
            } else {
                m();
            }
        } else {
            g(this.f3511R);
        }
    }

    public final void m() {
        for (int i = 0; i < this.X; i++) {
            Wz wz = this.f3514R[i];
            wz.f610R.R = wz.R;
        }
    }

    public final void t() {
        for (int i = 0; i < this.X; i++) {
            Wz wz = this.f3514R[i];
            if (wz != null) {
                ((mRM) this.f3512R.f7203v).v(wz);
            }
            this.f3514R[i] = null;
        }
    }

    public final void v(aLq alq, aLq alq2, int i, float f, aLq alq3, aLq alq4, int i2, int i3) {
        Wz U = U();
        if (alq2 == alq3) {
            U.f612R.Z(alq, 1.0f);
            U.f612R.Z(alq4, 1.0f);
            U.f612R.Z(alq2, -2.0f);
        } else if (f == 0.5f) {
            U.f612R.Z(alq, 1.0f);
            U.f612R.Z(alq2, -1.0f);
            U.f612R.Z(alq3, -1.0f);
            U.f612R.Z(alq4, 1.0f);
            if (i > 0 || i2 > 0) {
                U.R = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            U.f612R.Z(alq, -1.0f);
            U.f612R.Z(alq2, 1.0f);
            U.R = (float) i;
        } else if (f >= 1.0f) {
            U.f612R.Z(alq4, -1.0f);
            U.f612R.Z(alq3, 1.0f);
            U.R = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            U.f612R.Z(alq, f2 * 1.0f);
            U.f612R.Z(alq2, f2 * -1.0f);
            U.f612R.Z(alq3, -1.0f * f);
            U.f612R.Z(alq4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                U.R = (((float) i2) * f) + (((float) (-i)) * f2);
            }
        }
        if (i3 != 8) {
            U.R(this, i3);
        }
        c(U);
    }

    public final aLq x(int i) {
        if (this.e + 1 >= this.f3517c) {
            P();
        }
        aLq R = R(4);
        int i2 = this.R + 1;
        this.R = i2;
        this.e++;
        R.e = i2;
        R.O = i;
        ((aLq[]) this.f3512R.e)[i2] = R;
        j_m j_m = this.f3511R;
        j_m.f4968R.f59R = R;
        Arrays.fill(R.f846v, 0.0f);
        R.f846v[R.O] = 1.0f;
        j_m.x(R);
        return R;
    }

    public final void y(Wz wz) {
        for (int i = 0; i < this.e; i++) {
            this.f3516R[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 < this.e * 2) {
                aLq alq = wz.f610R;
                if (alq != null) {
                    this.f3516R[alq.e] = true;
                }
                aLq e = wz.e(this.f3516R);
                if (e != null) {
                    boolean[] zArr = this.f3516R;
                    int i3 = e.e;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                    } else {
                        return;
                    }
                }
                if (e != null) {
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    for (int i5 = 0; i5 < this.X; i5++) {
                        Wz wz2 = this.f3514R[i5];
                        if (wz2.f610R.L != 1 && !wz2.f613R && wz2.f612R.H(e)) {
                            float X = wz2.f612R.X(e);
                            if (X < 0.0f) {
                                float f2 = (-wz2.R) / X;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (i4 > -1) {
                        Wz wz3 = this.f3514R[i4];
                        wz3.f610R.X = -1;
                        wz3.L(e);
                        aLq alq2 = wz3.f610R;
                        alq2.X = i4;
                        alq2.X(this, wz3);
                    }
                } else {
                    z = true;
                }
            } else {
                return;
            }
        }
    }
}
