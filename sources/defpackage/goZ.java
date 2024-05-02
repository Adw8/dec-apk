package defpackage;

/* renamed from: goZ  reason: default package */
/* loaded from: classes.dex */
public final class goZ {
    public final aLd R;

    /* renamed from: R  reason: collision with other field name */
    public final hyi f3938R;

    /* renamed from: R  reason: collision with other field name */
    public final iMP f3939R;

    /* renamed from: R  reason: collision with other field name */
    public final kvQ f3940R;

    public goZ(aLd ald, iMP imp, hyi hyi, pd2 pd2) {
        this.R = ald;
        this.f3939R = imp;
        this.f3938R = hyi;
        kvQ kvq = new kvQ(this, pd2);
        this.f3940R = kvq;
        if (((m4i) ald).f5900R == iMP.DESTROYED) {
            pd2.c(null);
            R();
            return;
        }
        ald.R(kvq);
    }

    public final void R() {
        this.R.v(this.f3940R);
        hyi hyi = this.f3938R;
        hyi.v = true;
        hyi.R();
    }
}
