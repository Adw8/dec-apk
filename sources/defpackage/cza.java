package defpackage;

/* renamed from: cza  reason: default package */
/* loaded from: classes.dex */
public final class cza extends _L {
    public int e = -1;

    public cza() {
    }

    public cza(W w) {
        super(w);
    }

    public cza(boolean z, b[] bVarArr) {
        super(z, bVarArr);
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.i(49, z);
        oYJ Z = zz.Z();
        int length = ((_L) this).f696R.length;
        int i = 0;
        if (this.e >= 0 || length > 16) {
            zz.P(S());
            while (i < length) {
                Z.V(((_L) this).f696R[i].v());
                i++;
            }
            return;
        }
        O[] oArr = new O[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            O z2 = ((_L) this).f696R[i3].v().z();
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

    public final int S() {
        if (this.e < 0) {
            int length = ((_L) this).f696R.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += ((_L) this).f696R[i2].v().z().Y(true);
            }
            this.e = i;
        }
        return this.e;
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(S(), z);
    }

    @Override // defpackage._L, defpackage.O
    public final O z() {
        return this;
    }
}
