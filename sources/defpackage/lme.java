package defpackage;

/* renamed from: lme  reason: default package */
/* loaded from: classes.dex */
public final class lme extends _L {
    public int e = -1;

    public lme(iuV iuv) {
        super(iuv);
    }

    public lme(b[] bVarArr) {
        super(bVarArr);
    }

    public lme(b[] bVarArr, int i) {
        super(true, bVarArr);
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.i(49, z);
        fTU L = zz.L();
        int length = ((_L) this).f696R.length;
        int i = 0;
        if (this.e >= 0 || length > 16) {
            zz.P(S());
            while (i < length) {
                ((_L) this).f696R[i].v().u().K(L, true);
                i++;
            }
            return;
        }
        O[] oArr = new O[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            O u = ((_L) this).f696R[i3].v().u();
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

    public final int S() {
        if (this.e < 0) {
            int length = ((_L) this).f696R.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += ((_L) this).f696R[i2].v().u().Y(true);
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
    public final O u() {
        return ((_L) this).f695R ? this : super.u();
    }

    @Override // defpackage._L, defpackage.O
    public final O z() {
        return this;
    }
}
