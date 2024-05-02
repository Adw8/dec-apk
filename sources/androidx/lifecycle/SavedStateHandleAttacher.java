package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements k3P {
    public final ahX R;

    public SavedStateHandleAttacher(ahX ahx) {
        this.R = ahx;
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        if (alx == alX.ON_CREATE) {
            nu_.O().v(this);
            ahX ahx = this.R;
            if (!ahx.f981R) {
                ahx.R = ahx.f980R.R("androidx.lifecycle.internal.SavedStateHandlesProvider");
                ahx.f981R = true;
                avO avo = (avO) ahx.f979R.getValue();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + alx).toString());
    }
}
