package defpackage;

/* renamed from: l7  reason: default package */
/* loaded from: classes.dex */
public final class l7 extends _F {
    public final lR3 R;

    public l7(lR3 lr3, nWQ nwq, nbD nbd, int i, h9 h9Var) {
        super(i, nbd, h9Var, nwq);
        this.R = lr3;
    }

    @Override // defpackage.YX
    public final YX L(nbD nbd, int i, h9 h9Var) {
        return new l7(this.R, ((_F) this).R, nbd, i, h9Var);
    }

    @Override // defpackage._F
    public final Object x(h2V h2v, aOO aoo) {
        Object L = jjU.L(new Gt(this, h2v, null), aoo);
        return L == bGR.COROUTINE_SUSPENDED ? L : o8s.R;
    }
}
