package androidx.lifecycle;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements k3P {
    public final DefaultLifecycleObserver R;

    /* renamed from: R  reason: collision with other field name */
    public final k3P f1320R;

    public FullLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, k3P k3p) {
        this.R = defaultLifecycleObserver;
        this.f1320R = k3p;
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        switch (bQZ.R[alx.ordinal()]) {
            case 1:
                this.R.onCreate(nu_);
                break;
            case 2:
                this.R.onStart(nu_);
                break;
            case 3:
                this.R.onResume(nu_);
                break;
            case 4:
                this.R.onPause(nu_);
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                this.R.onStop(nu_);
                break;
            case 6:
                this.R.onDestroy(nu_);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        k3P k3p = this.f1320R;
        if (k3p != null) {
            k3p.e(nu_, alx);
        }
    }
}
