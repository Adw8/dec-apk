package defpackage;

/* renamed from: gOm  reason: default package */
/* loaded from: classes.dex */
public final class gOm extends kwo {

    /* renamed from: Z  reason: collision with other field name */
    public boolean f3757Z;
    public float Z = -1.0f;
    public int u = -1;
    public int z = -1;
    public iP5 m = ((kwo) this).f5516v;
    public int n = 0;

    public gOm() {
        ((kwo) this).f5494R.clear();
        ((kwo) this).f5494R.add(this.m);
        int length = ((kwo) this).f5500R.length;
        for (int i = 0; i < length; i++) {
            ((kwo) this).f5500R[i] = this.m;
        }
    }

    public final void G(int i) {
        if (this.n != i) {
            this.n = i;
            ((kwo) this).f5494R.clear();
            if (this.n == 1) {
                this.m = ((kwo) this).f5491R;
            } else {
                this.m = ((kwo) this).f5516v;
            }
            ((kwo) this).f5494R.add(this.m);
            int length = ((kwo) this).f5500R.length;
            for (int i2 = 0; i2 < length; i2++) {
                ((kwo) this).f5500R[i2] = this.m;
            }
        }
    }

    @Override // defpackage.kwo
    public final iP5 L(icY icy) {
        int ordinal = icy.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.n == 0) {
                return this.m;
            }
            return null;
        }
        if (this.n == 1) {
            return this.m;
        }
        return null;
    }

    @Override // defpackage.kwo
    public final boolean Y() {
        return this.f3757Z;
    }

    @Override // defpackage.kwo
    public final boolean c() {
        return true;
    }

    @Override // defpackage.kwo
    public final boolean h() {
        return this.f3757Z;
    }

    @Override // defpackage.kwo
    public final void k(fhh fhh, boolean z) {
        if (((kwo) this).f5495R != null) {
            iP5 ip5 = this.m;
            fhh.getClass();
            int N = fhh.N(ip5);
            if (this.n == 1) {
                this.y = N;
                this.t = 0;
                d(((kwo) this).f5495R.m());
                T(0);
                return;
            }
            this.y = 0;
            this.t = N;
            T(((kwo) this).f5495R.P());
            d(0);
        }
    }

    public final void p(int i) {
        this.m.m(i);
        this.f3757Z = true;
    }

    @Override // defpackage.kwo
    public final void v(fhh fhh, boolean z) {
        m_b m_b = (m_b) ((kwo) this).f5495R;
        if (m_b != null) {
            Object L = m_b.L(icY.LEFT);
            Object L2 = m_b.L(icY.RIGHT);
            kwo kwo = ((kwo) this).f5495R;
            boolean z2 = true;
            z2 = kwo != null && kwo.f5510c[0] == 2;
            if (this.n == 0) {
                L = m_b.L(icY.TOP);
                L2 = m_b.L(icY.BOTTOM);
                kwo kwo2 = ((kwo) this).f5495R;
                if (kwo2 == null || kwo2.f5510c[1] != 2) {
                    z2 = false;
                }
            }
            if (this.f3757Z) {
                iP5 ip5 = this.m;
                if (ip5.f4585R) {
                    aLq H = fhh.H(ip5);
                    fhh.e(H, this.m.c());
                    if (this.u != -1) {
                        if (z2) {
                            fhh.O(fhh.H(L2), H, 0, 5);
                        }
                    } else if (this.z != -1 && z2) {
                        aLq H2 = fhh.H(L2);
                        fhh.O(H, fhh.H(L), 0, 5);
                        fhh.O(H2, H, 0, 5);
                    }
                    this.f3757Z = false;
                    return;
                }
            }
            if (this.u != -1) {
                aLq H3 = fhh.H(this.m);
                fhh.X(H3, fhh.H(L), this.u, 8);
                if (z2) {
                    fhh.O(fhh.H(L2), H3, 0, 5);
                }
            } else if (this.z != -1) {
                aLq H4 = fhh.H(this.m);
                aLq H5 = fhh.H(L2);
                fhh.X(H4, H5, -this.z, 8);
                if (z2) {
                    fhh.O(H4, fhh.H(L), 0, 5);
                    fhh.O(H5, H4, 0, 5);
                }
            } else if (this.Z != -1.0f) {
                aLq H6 = fhh.H(this.m);
                aLq H7 = fhh.H(L2);
                float f = this.Z;
                Wz U = fhh.U();
                U.f612R.Z(H6, -1.0f);
                U.f612R.Z(H7, f);
                fhh.c(U);
            }
        }
    }
}
