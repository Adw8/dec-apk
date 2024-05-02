package defpackage;

/* renamed from: iuV  reason: default package */
/* loaded from: classes.dex */
public final class iuV extends q {
    public static final /* synthetic */ int X = 0;
    public int e = -1;

    public iuV() {
    }

    public iuV(W w) {
        super(w);
    }

    public iuV(b bVar) {
        super(bVar);
    }

    public iuV(b[] bVarArr) {
        super(bVarArr);
    }

    public iuV(b[] bVarArr, int i) {
        super(bVarArr, 0);
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.i(48, z);
        fTU L = zz.L();
        int length = this.f7346R.length;
        int i = 0;
        if (this.e >= 0 || length > 16) {
            zz.P(r());
            while (i < length) {
                this.f7346R[i].v().u().K(L, true);
                i++;
            }
            return;
        }
        O[] oArr = new O[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            O u = this.f7346R[i3].v().u();
            oArr[i3] = u;
            i2 += u.Y(true);
        }
        this.e = i2;
        zz.P(i2);
        while (i < length) {
            oArr[i].K(L, true);
            i++;
        }
    }

    @Override // defpackage.q
    public final _L T() {
        return new cza(false, this.f7346R);
    }

    @Override // defpackage.q
    public final e W() {
        return new f9y(false, a9.A(n()));
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(r(), z);
    }

    public final int r() {
        if (this.e < 0) {
            int length = this.f7346R.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f7346R[i2].v().u().Y(true);
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
    public final O u() {
        return this;
    }

    @Override // defpackage.q, defpackage.O
    public final O z() {
        return this;
    }
}
