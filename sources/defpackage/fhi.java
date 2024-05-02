package defpackage;

import android.view.WindowInsets;

/* renamed from: fhi  reason: default package */
/* loaded from: classes.dex */
public abstract class fhi extends ibz {
    public final WindowInsets R;

    /* renamed from: R  reason: collision with other field name */
    public ojk f3519R = null;

    public fhi(gWM gwm, WindowInsets windowInsets) {
        super(gwm);
        this.R = windowInsets;
    }

    @Override // defpackage.ibz
    public void N(ojk[] ojkArr) {
    }

    @Override // defpackage.ibz
    public void P(gWM gwm) {
    }

    @Override // defpackage.ibz
    public boolean U() {
        return this.R.isRound();
    }

    @Override // defpackage.ibz
    public final ojk m() {
        if (this.f3519R == null) {
            this.f3519R = ojk.v(this.R.getSystemWindowInsetLeft(), this.R.getSystemWindowInsetTop(), this.R.getSystemWindowInsetRight(), this.R.getSystemWindowInsetBottom());
        }
        return this.f3519R;
    }
}
