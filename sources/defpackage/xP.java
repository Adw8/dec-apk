package defpackage;

/* renamed from: xP  reason: default package */
/* loaded from: classes.dex */
public final class xP extends lGG {
    public int z = 0;
    public boolean Z = true;
    public int n = 0;
    public boolean m = false;

    public final int B() {
        int i = this.z;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final boolean G() {
        int i;
        int i2;
        int i3;
        icY icy = icY.BOTTOM;
        icY icy2 = icY.TOP;
        icY icy3 = icY.RIGHT;
        icY icy4 = icY.LEFT;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.u;
            if (i4 >= i) {
                break;
            }
            kwo kwo = ((lGG) this).c[i4];
            if ((this.Z || kwo.c()) && ((((i2 = this.z) == 0 || i2 == 1) && !kwo.Y()) || (((i3 = this.z) == 2 || i3 == 3) && !kwo.h()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.u; i6++) {
            kwo kwo2 = ((lGG) this).c[i6];
            if (this.Z || kwo2.c()) {
                if (!z2) {
                    int i7 = this.z;
                    if (i7 == 0) {
                        i5 = kwo2.L(icy4).c();
                    } else if (i7 == 1) {
                        i5 = kwo2.L(icy3).c();
                    } else if (i7 == 2) {
                        i5 = kwo2.L(icy2).c();
                    } else if (i7 == 3) {
                        i5 = kwo2.L(icy).c();
                    }
                    z2 = true;
                }
                int i8 = this.z;
                if (i8 == 0) {
                    i5 = Math.min(i5, kwo2.L(icy4).c());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, kwo2.L(icy3).c());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, kwo2.L(icy2).c());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, kwo2.L(icy).c());
                }
            }
        }
        int i9 = i5 + this.n;
        int i10 = this.z;
        if (i10 == 0 || i10 == 1) {
            A(i9, i9);
        } else {
            S(i9, i9);
        }
        this.m = true;
        return true;
    }

    @Override // defpackage.kwo
    public final boolean Y() {
        return this.m;
    }

    @Override // defpackage.kwo
    public final boolean c() {
        return true;
    }

    @Override // defpackage.kwo
    public final boolean h() {
        return this.m;
    }

    @Override // defpackage.kwo
    public final String toString() {
        String g = jQ.g(opT.U("[Barrier] "), ((kwo) this).f5517v, " {");
        for (int i = 0; i < this.u; i++) {
            kwo kwo = ((lGG) this).c[i];
            if (i > 0) {
                g = opT.H(g, ", ");
            }
            StringBuilder U = opT.U(g);
            U.append(kwo.f5517v);
            g = U.toString();
        }
        return opT.H(g, "}");
    }

    @Override // defpackage.kwo
    public final void v(fhh fhh, boolean z) {
        iP5[] ip5Arr;
        boolean z2;
        int i;
        int i2;
        iP5[] ip5Arr2 = ((kwo) this).f5500R;
        ip5Arr2[0] = ((kwo) this).f5491R;
        ip5Arr2[2] = ((kwo) this).f5516v;
        ip5Arr2[1] = ((kwo) this).f5508c;
        ip5Arr2[3] = ((kwo) this).f5512e;
        int i3 = 0;
        while (true) {
            ip5Arr = ((kwo) this).f5500R;
            if (i3 >= ip5Arr.length) {
                break;
            }
            iP5 ip5 = ip5Arr[i3];
            ip5.f4580R = fhh.H(ip5);
            i3++;
        }
        int i4 = this.z;
        if (i4 >= 0 && i4 < 4) {
            iP5 ip52 = ip5Arr[i4];
            if (!this.m) {
                G();
            }
            if (this.m) {
                this.m = false;
                int i5 = this.z;
                if (i5 == 0 || i5 == 1) {
                    fhh.e(((kwo) this).f5491R.f4580R, this.y);
                    fhh.e(((kwo) this).f5508c.f4580R, this.y);
                } else if (i5 == 2 || i5 == 3) {
                    fhh.e(((kwo) this).f5516v.f4580R, this.t);
                    fhh.e(((kwo) this).f5512e.f4580R, this.t);
                }
            } else {
                for (int i6 = 0; i6 < this.u; i6++) {
                    kwo kwo = ((lGG) this).c[i6];
                    if ((this.Z || kwo.c()) && ((((i2 = this.z) == 0 || i2 == 1) && kwo.f5510c[0] == 3 && kwo.f5491R.f4581R != null && kwo.f5508c.f4581R != null) || ((i2 == 2 || i2 == 3) && kwo.f5510c[1] == 3 && kwo.f5516v.f4581R != null && kwo.f5512e.f4581R != null))) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                boolean z3 = ((kwo) this).f5491R.X() || ((kwo) this).f5508c.X();
                boolean z4 = ((kwo) this).f5516v.X() || ((kwo) this).f5512e.X();
                boolean z5 = !z2 && (((i = this.z) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
                int i7 = 5;
                if (!z5) {
                    i7 = 4;
                }
                for (int i8 = 0; i8 < this.u; i8++) {
                    kwo kwo2 = ((lGG) this).c[i8];
                    if (this.Z || kwo2.c()) {
                        aLq H = fhh.H(kwo2.f5500R[this.z]);
                        iP5[] ip5Arr3 = kwo2.f5500R;
                        int i9 = this.z;
                        iP5 ip53 = ip5Arr3[i9];
                        ip53.f4580R = H;
                        iP5 ip54 = ip53.f4581R;
                        int i10 = (ip54 == null || ip54.f4584R != this) ? 0 : ip53.v + 0;
                        if (i9 == 0 || i9 == 2) {
                            Wz U = fhh.U();
                            aLq C = fhh.C();
                            C.O = 0;
                            U.c(ip52.f4580R, H, C, this.n - i10);
                            fhh.c(U);
                        } else {
                            Wz U2 = fhh.U();
                            aLq C2 = fhh.C();
                            C2.O = 0;
                            U2.v(ip52.f4580R, H, C2, this.n + i10);
                            fhh.c(U2);
                        }
                        fhh.X(ip52.f4580R, H, this.n + i10, i7);
                    }
                }
                int i11 = this.z;
                if (i11 == 0) {
                    fhh.X(((kwo) this).f5508c.f4580R, ((kwo) this).f5491R.f4580R, 0, 8);
                    fhh.X(((kwo) this).f5491R.f4580R, ((kwo) this).f5495R.f5508c.f4580R, 0, 4);
                    fhh.X(((kwo) this).f5491R.f4580R, ((kwo) this).f5495R.f5491R.f4580R, 0, 0);
                } else if (i11 == 1) {
                    fhh.X(((kwo) this).f5491R.f4580R, ((kwo) this).f5508c.f4580R, 0, 8);
                    fhh.X(((kwo) this).f5491R.f4580R, ((kwo) this).f5495R.f5491R.f4580R, 0, 4);
                    fhh.X(((kwo) this).f5491R.f4580R, ((kwo) this).f5495R.f5508c.f4580R, 0, 0);
                } else if (i11 == 2) {
                    fhh.X(((kwo) this).f5512e.f4580R, ((kwo) this).f5516v.f4580R, 0, 8);
                    fhh.X(((kwo) this).f5516v.f4580R, ((kwo) this).f5495R.f5512e.f4580R, 0, 4);
                    fhh.X(((kwo) this).f5516v.f4580R, ((kwo) this).f5495R.f5516v.f4580R, 0, 0);
                } else if (i11 == 3) {
                    fhh.X(((kwo) this).f5516v.f4580R, ((kwo) this).f5512e.f4580R, 0, 8);
                    fhh.X(((kwo) this).f5516v.f4580R, ((kwo) this).f5495R.f5516v.f4580R, 0, 4);
                    fhh.X(((kwo) this).f5516v.f4580R, ((kwo) this).f5495R.f5512e.f4580R, 0, 0);
                }
            }
        }
    }
}
