package defpackage;

/* renamed from: hzK  reason: default package */
/* loaded from: classes.dex */
public final class hzK implements nWQ {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f4432R;
    public final /* synthetic */ int e;

    public /* synthetic */ hzK(nWQ nwq, iv7 iv7, int i) {
        this.e = i;
        this.f4432R = nwq;
        this.R = iv7;
    }

    @Override // defpackage.nWQ
    public final Object v(h2V h2v, aOO aoo) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        switch (this.e) {
            case 0:
                Object v = this.f4432R.v(new dig(new oJx(), h2v, this.R), aoo);
                return v == bgr ? v : o8s.R;
            default:
                Object v2 = this.f4432R.v(new aLH(h2v, 9, this.R), aoo);
                return v2 == bgr ? v2 : o8s.R;
        }
    }
}
