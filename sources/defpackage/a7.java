package defpackage;

/* renamed from: a7  reason: default package */
/* loaded from: classes.dex */
public final class a7 extends _F {
    public a7(nWQ nwq, lsf lsf, int i, h9 h9Var, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? aIH.R : lsf, (i2 & 8) != 0 ? h9.SUSPEND : h9Var, nwq);
    }

    @Override // defpackage.YX
    public final YX L(nbD nbd, int i, h9 h9Var) {
        return new a7(i, nbd, h9Var, ((_F) this).R);
    }

    @Override // defpackage.YX
    public final nWQ Z() {
        return ((_F) this).R;
    }

    @Override // defpackage._F
    public final Object x(h2V h2v, aOO aoo) {
        Object v = ((_F) this).R.v(h2v, aoo);
        return v == bGR.COROUTINE_SUSPENDED ? v : o8s.R;
    }

    public a7(int i, nbD nbd, h9 h9Var, nWQ nwq) {
        super(i, nbd, h9Var, nwq);
    }
}
