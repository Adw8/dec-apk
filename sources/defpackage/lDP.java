package defpackage;

/* renamed from: lDP  reason: default package */
/* loaded from: classes.dex */
public final class lDP extends xx {
    public final nfJ R;

    public lDP(aOO aoo, nfJ nfj) {
        super(1, aoo);
        this.R = nfj;
    }

    @Override // defpackage.xx
    public final String K() {
        return "AwaitContinuation";
    }

    @Override // defpackage.xx
    public final Throwable N(nfJ nfj) {
        Throwable v;
        Object E = this.R.E();
        return (!(E instanceof eac) || (v = ((eac) E).v()) == null) ? E instanceof pag ? ((pag) E).f7100R : nfj.Z() : v;
    }
}
