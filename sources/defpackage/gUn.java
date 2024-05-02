package defpackage;

/* renamed from: gUn  reason: default package */
/* loaded from: classes.dex */
public final class gUn implements nWQ {
    public final iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f3766R;

    /* renamed from: R  reason: collision with other field name */
    public final nWQ f3767R;

    public gUn(nWQ nwq) {
        g5M g5m = g5M.u;
        go2 go2 = go2.y;
        this.f3767R = nwq;
        this.f3766R = g5m;
        this.R = go2;
    }

    @Override // defpackage.nWQ
    public final Object v(h2V h2v, aOO aoo) {
        nWW nww = new nWW();
        nww.R = aJV.f827R;
        Object v = this.f3767R.v(new kI4(this, nww, h2v), aoo);
        return v == bGR.COROUTINE_SUSPENDED ? v : o8s.R;
    }
}
