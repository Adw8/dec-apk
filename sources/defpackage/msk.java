package defpackage;

/* renamed from: msk  reason: default package */
/* loaded from: classes.dex */
public final class msk {
    public X R;

    /* renamed from: R  reason: collision with other field name */
    public fXV f6215R;

    /* renamed from: R  reason: collision with other field name */
    public hMN f6216R;

    /* renamed from: R  reason: collision with other field name */
    public iJ3 f6217R;

    /* renamed from: R  reason: collision with other field name */
    public oU f6218R = new oU(0, 1, new X(2), true);

    /* renamed from: R  reason: collision with other field name */
    public plH f6219R;

    /* renamed from: R  reason: collision with other field name */
    public wa f6220R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6221R;
    public fXV v;

    /* renamed from: v  reason: collision with other field name */
    public plH f6222v;

    public final isV R() {
        if (this.R == null || this.f6220R == null || this.f6219R == null || this.f6215R == null || this.v == null || ((this.f6222v == null && !this.f6221R) || this.f6216R == null)) {
            throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
        }
        W w = new W(10);
        w.R(this.f6218R);
        w.R(this.R);
        w.R(this.f6220R);
        w.R(this.f6219R);
        W w2 = new W(2);
        w2.R(this.f6215R);
        w2.R(this.v);
        w.R(new iuV(w2));
        b bVar = this.f6222v;
        if (bVar == null) {
            bVar = new iuV();
        }
        w.R(bVar);
        w.R(this.f6216R);
        iJ3 ij3 = this.f6217R;
        if (ij3 != null) {
            w.R(new oU(3, 1, ij3, true));
        }
        iuV iuv = new iuV(w);
        return iuv instanceof isV ? (isV) iuv : new isV(q.A(iuv));
    }
}
