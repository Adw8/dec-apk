package defpackage;

/* renamed from: fTk  reason: default package */
/* loaded from: classes.dex */
public final class fTk extends pbU {
    public final T8 R;

    /* renamed from: R  reason: collision with other field name */
    public final eac f3425R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f3426R;
    public final nfJ v;

    public fTk(nfJ nfj, eac eac, T8 t8, Object obj) {
        this.v = nfj;
        this.f3425R = eac;
        this.R = t8;
        this.f3426R = obj;
    }

    @Override // defpackage.pbU
    public final void h(Throwable th) {
        nfJ nfj = this.v;
        eac eac = this.f3425R;
        T8 t8 = this.R;
        Object obj = this.f3426R;
        nfj.getClass();
        T8 X4 = nfJ.X4(t8);
        if (X4 == null || !nfj.ZW(eac, X4, obj)) {
            nfj.y(nfj.Q(eac, obj));
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        h((Throwable) obj);
        return o8s.R;
    }
}
