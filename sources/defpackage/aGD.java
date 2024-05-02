package defpackage;

/* renamed from: aGD  reason: default package */
/* loaded from: classes.dex */
public final class aGD implements nWQ {
    public final /* synthetic */ lR3 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f813R;
    public final /* synthetic */ nWQ v;

    public aGD(nWQ nwq, nWQ nwq2, _m _mVar) {
        this.f813R = nwq;
        this.v = nwq2;
        this.R = _mVar;
    }

    @Override // defpackage.nWQ
    public final Object v(h2V h2v, aOO aoo) {
        U4 u4 = new U4(null, mY_.H, new i1U(this.R, (aOO) null, 2), h2v, new nWQ[]{this.f813R, this.v});
        ggz ggz = new ggz(aoo, aoo.v());
        Object t = n3x.t(ggz, ggz, u4);
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (t != bgr) {
            t = o8s.R;
        }
        return t == bgr ? t : o8s.R;
    }
}
