package defpackage;

/* renamed from: oU  reason: default package */
/* loaded from: classes.dex */
public final class oU extends Vz {
    public final /* synthetic */ int L;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oU(int i, int i2, int i3, b bVar, int i4) {
        super(i, i2, i3, bVar);
        this.L = i4;
    }

    @Override // defpackage.Vz
    public final q A(O o) {
        switch (this.L) {
            case 0:
                return new d7(o);
            case 1:
                return new iuV(o);
            default:
                return new fSU(o);
        }
    }

    @Override // defpackage.O
    public final boolean J() {
        switch (this.L) {
            case 0:
                return Q() || this.R.v().J();
            case 1:
                return Q() || this.R.v().u().J();
            default:
                return Q() || this.R.v().z().J();
        }
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        switch (this.L) {
            case 0:
                O v = this.R.v();
                boolean Q = Q();
                if (z) {
                    int i = this.X;
                    if (Q || v.J()) {
                        i |= 32;
                    }
                    zz.t(i, this.O);
                }
                if (Q) {
                    zz.C(128);
                    v.K(zz, true);
                    zz.C(0);
                    zz.C(0);
                    return;
                }
                v.K(zz, false);
                return;
            case 1:
                O u = this.R.v().u();
                boolean Q2 = Q();
                if (z) {
                    int i2 = this.X;
                    if (Q2 || u.J()) {
                        i2 |= 32;
                    }
                    zz.t(i2, this.O);
                }
                if (Q2) {
                    zz.P(u.Y(true));
                }
                u.K(zz.L(), Q2);
                return;
            default:
                O z2 = this.R.v().z();
                boolean Q3 = Q();
                if (z) {
                    int i3 = this.X;
                    if (Q3 || z2.J()) {
                        i3 |= 32;
                    }
                    zz.t(i3, this.O);
                }
                if (Q3) {
                    zz.P(z2.Y(true));
                }
                z2.K(zz.Z(), Q3);
                return;
        }
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        int i = 2;
        int i2 = 1;
        i2 = 0;
        switch (this.L) {
            case 0:
                O v = this.R.v();
                boolean Q = Q();
                int Y = v.Y(Q);
                if (Q) {
                    Y += 3;
                }
                if (z) {
                    int i3 = this.O;
                    if (i3 >= 31) {
                        while (true) {
                            i3 >>>= 7;
                            if (i3 != 0) {
                                i++;
                            } else {
                                i2 = i;
                            }
                        }
                    }
                }
                return Y + i2;
            case 1:
                O u = this.R.v().u();
                boolean Q2 = Q();
                int Y2 = u.Y(Q2);
                if (Q2) {
                    Y2 += Zz.m(Y2);
                }
                if (z) {
                    int i4 = this.O;
                    if (i4 >= 31) {
                        while (true) {
                            i4 >>>= 7;
                            if (i4 != 0) {
                                i++;
                            } else {
                                i2 = i;
                            }
                        }
                    }
                }
                return Y2 + i2;
            default:
                O z2 = this.R.v().z();
                boolean Q3 = Q();
                int Y3 = z2.Y(Q3);
                if (Q3) {
                    Y3 += Zz.m(Y3);
                }
                if (z) {
                    int i5 = this.O;
                    if (i5 >= 31) {
                        while (true) {
                            i5 >>>= 7;
                            if (i5 != 0) {
                                i++;
                            } else {
                                i2 = i;
                            }
                        }
                    }
                }
                return Y3 + i2;
        }
    }

    @Override // defpackage.Vz, defpackage.O
    public final O u() {
        switch (this.L) {
            case 1:
                return this;
            default:
                return new oU(this.e, this.X, this.O, this.R, 1);
        }
    }

    @Override // defpackage.Vz, defpackage.O
    public final O z() {
        switch (this.L) {
            case 1:
            case 2:
                return this;
            default:
                return new oU(this.e, this.X, this.O, this.R, 2);
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oU(int i, int i2, t tVar, boolean z) {
        super(z ? 1 : 2, 128, i, tVar);
        this.L = i2;
    }
}
