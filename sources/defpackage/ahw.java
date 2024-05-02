package defpackage;

import android.view.WindowInsets;

/* renamed from: ahw  reason: default package */
/* loaded from: classes.dex */
public abstract class ahw extends isJ {
    public final WindowInsets.Builder R;

    public ahw() {
        this.R = new WindowInsets.Builder();
    }

    @Override // defpackage.isJ
    public void L(ojk ojk) {
        this.R.setTappableElementInsets(ojk.e());
    }

    @Override // defpackage.isJ
    public void O(ojk ojk) {
        this.R.setSystemWindowInsets(ojk.e());
    }

    @Override // defpackage.isJ
    public void X(ojk ojk) {
        this.R.setSystemGestureInsets(ojk.e());
    }

    @Override // defpackage.isJ
    public void c(ojk ojk) {
        this.R.setMandatorySystemGestureInsets(ojk.e());
    }

    @Override // defpackage.isJ
    public void e(ojk ojk) {
        this.R.setStableInsets(ojk.e());
    }

    @Override // defpackage.isJ
    public gWM v() {
        R();
        gWM Z = gWM.Z(null, this.R.build());
        Z.f3779R.N(null);
        return Z;
    }

    public ahw(gWM gwm) {
        super(gwm);
        WindowInsets.Builder builder;
        WindowInsets L = gwm.L();
        if (L != null) {
            builder = new WindowInsets.Builder(L);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.R = builder;
    }
}
