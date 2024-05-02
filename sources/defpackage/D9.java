package defpackage;

/* renamed from: D9  reason: default package */
/* loaded from: classes.dex */
public final class D9 extends _L {
    public D9(W w) {
        super(w);
    }

    public D9(b[] bVarArr) {
        super(false, bVarArr);
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.y(z, 49, ((_L) this).f696R);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        int i = z ? 4 : 3;
        int length = ((_L) this).f696R.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += ((_L) this).f696R[i2].v().Y(true);
        }
        return i;
    }
}
