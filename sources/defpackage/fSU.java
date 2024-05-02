package defpackage;

/* renamed from: fSU  reason: default package */
/* loaded from: classes.dex */
public final class fSU extends q {
    public int e = -1;

    public fSU() {
    }

    public fSU(W w) {
        super(w);
    }

    public fSU(b bVar) {
        super(bVar);
    }

    public fSU(b[] bVarArr) {
        super(bVarArr, 0);
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.i(48, z);
        oYJ Z = zz.Z();
        int length = this.f7346R.length;
        int i = 0;
        if (this.e >= 0 || length > 16) {
            zz.P(r());
            while (i < length) {
                Z.V(this.f7346R[i].v());
                i++;
            }
            return;
        }
        O[] oArr = new O[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            O z2 = this.f7346R[i3].v().z();
            oArr[i3] = z2;
            i2 += z2.Y(true);
        }
        this.e = i2;
        zz.P(i2);
        while (i < length) {
            Z.V(oArr[i]);
            i++;
        }
    }

    @Override // defpackage.q
    public final _L T() {
        return new cza(false, this.f7346R);
    }

    @Override // defpackage.q
    public final e W() {
        return new o7z(a9.A(n()));
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(r(), z);
    }

    public final Z k() {
        return new k2F(this, 1);
    }

    public final int r() {
        if (this.e < 0) {
            int length = this.f7346R.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f7346R[i2].v().z().Y(true);
            }
            this.e = i;
        }
        return this.e;
    }

    @Override // defpackage.q
    public final F s() {
        return new nP9(CB.Q(Q()));
    }

    @Override // defpackage.q, defpackage.O
    public final O z() {
        return this;
    }
}
