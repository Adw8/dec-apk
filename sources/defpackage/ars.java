package defpackage;

/* renamed from: ars  reason: default package */
/* loaded from: classes.dex */
public final class ars implements g79 {
    public final g79 R;

    /* renamed from: R  reason: collision with other field name */
    public final n7K f1479R;

    public ars(n7K n7k, g79 g79) {
        gvP.u(n7k, "SentryOptions is required.");
        this.f1479R = n7k;
        this.R = g79;
    }

    @Override // defpackage.g79
    public final void L(lXr lxr, String str, Throwable th) {
        if (this.R != null && R(lxr)) {
            this.R.L(lxr, str, th);
        }
    }

    public final boolean R(lXr lxr) {
        return lxr != null && this.f1479R.isDebug() && lxr.ordinal() >= this.f1479R.getDiagnosticLevel().ordinal();
    }

    @Override // defpackage.g79
    public final void x(lXr lxr, String str, Object... objArr) {
        if (this.R != null && R(lxr)) {
            this.R.x(lxr, str, objArr);
        }
    }
}
