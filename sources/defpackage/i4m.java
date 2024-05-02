package defpackage;

/* renamed from: i4m  reason: default package */
/* loaded from: classes.dex */
public final class i4m implements hUt, nWQ, cjB {
    public final /* synthetic */ hUt R;

    public i4m(hUt hut) {
        this.R = hut;
    }

    @Override // defpackage.cjB
    public final nWQ X(nbD nbd, int i, h9 h9Var) {
        return (((i >= 0 && i < 2) || i == -2) && h9Var == h9.DROP_OLDEST) ? this : ((i == 0 || i == -3) && h9Var == h9.SUSPEND) ? this : new a7(i, nbd, h9Var, this);
    }

    @Override // defpackage.hUt
    public final Object getValue() {
        return this.R.getValue();
    }

    @Override // defpackage.g3G, defpackage.nWQ
    public final Object v(h2V h2v, aOO aoo) {
        return this.R.v(h2v, aoo);
    }
}
