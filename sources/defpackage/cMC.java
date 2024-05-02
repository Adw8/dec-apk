package defpackage;

/* renamed from: cMC  reason: default package */
/* loaded from: classes.dex */
public final class cMC implements nWQ {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ cMC(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // defpackage.nWQ
    public final Object v(h2V h2v, aOO aoo) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        switch (this.e) {
            case 0:
                Object v = ((nWQ) this.R).v(new mTv(h2v, 0), aoo);
                return v == bgr ? v : o8s.R;
            case 1:
                Object v2 = ((nWQ) this.R).v(new mTv(h2v, 1), aoo);
                return v2 == bgr ? v2 : o8s.R;
            case 2:
                Object v3 = ((nWQ) this.R).v(new mTv(h2v, 2), aoo);
                return v3 == bgr ? v3 : o8s.R;
            case 3:
                Object v4 = ((nWQ) this.R).v(new mTv(h2v, 3), aoo);
                return v4 == bgr ? v4 : o8s.R;
            case 4:
                Object v5 = ((nWQ) this.R).v(new mTv(h2v, 4), aoo);
                return v5 == bgr ? v5 : o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                Object v6 = ((nWQ) this.R).v(new mTv(h2v, 5), aoo);
                return v6 == bgr ? v6 : o8s.R;
            case 6:
                Object v7 = ((nWQ) this.R).v(new mTv(h2v, 6), aoo);
                return v7 == bgr ? v7 : o8s.R;
            default:
                Object R = h2v.R(this.R, aoo);
                return R == bgr ? R : o8s.R;
        }
    }
}
