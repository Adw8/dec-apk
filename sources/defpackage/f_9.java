package defpackage;

/* renamed from: f_9  reason: default package */
/* loaded from: classes.dex */
public final class f_9 implements nWQ {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f3445R;
    public final /* synthetic */ int e;

    public /* synthetic */ f_9(nWQ nwq, Object obj, int i) {
        this.e = i;
        this.f3445R = nwq;
        this.R = obj;
    }

    @Override // defpackage.nWQ
    public final Object v(h2V h2v, aOO aoo) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        switch (this.e) {
            case 0:
                Object v = this.f3445R.v(new aLH(h2v, 2, (bf5) this.R), aoo);
                return v == bgr ? v : o8s.R;
            default:
                Object v2 = this.f3445R.v(new aLH(h2v, 4, (kg9) this.R), aoo);
                return v2 == bgr ? v2 : o8s.R;
        }
    }
}
