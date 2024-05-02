package defpackage;

/* renamed from: hSq  reason: default package */
/* loaded from: classes.dex */
public final class hSq implements oNK {
    public final hGS R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f4267R;

    public hSq(hGS hgs, Object obj) {
        this.R = hgs;
        this.f4267R = obj;
    }

    @Override // defpackage.oNK
    public final void R(Object obj, icv icv, Object obj2) {
        ((n1) this.R).R((p1w) obj, icv, obj2);
    }

    public final Object v(Object obj, icv icv) {
        p1w p1w = (p1w) obj;
        return !p1w.R().contains(((n1) this.R).v()) ? this.f4267R : ((n1) this.R).c(p1w, icv);
    }
}
