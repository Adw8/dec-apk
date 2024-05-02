package androidx.lifecycle;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl implements k3P, jy_ {
    public final aLd R;

    /* renamed from: R  reason: collision with other field name */
    public final nbD f1322R;

    public LifecycleCoroutineScopeImpl(aLd ald, nbD nbd) {
        this.R = ald;
        this.f1322R = nbd;
        if (((m4i) ald).f5900R == iMP.DESTROYED) {
            dTl.j(nbd, null);
        }
    }

    @Override // defpackage.jy_
    public final nbD C() {
        return this.f1322R;
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        if (((m4i) this.R).f5900R.compareTo(iMP.DESTROYED) <= 0) {
            this.R.v(this);
            dTl.j(this.f1322R, null);
        }
    }
}
