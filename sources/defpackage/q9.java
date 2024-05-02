package defpackage;

import android.view.ViewGroup;

/* renamed from: q9  reason: default package */
/* loaded from: classes.dex */
public final class q9 extends c2D {
    public final /* synthetic */ ViewGroup R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7352R = false;

    public q9(ViewGroup viewGroup) {
        this.R = viewGroup;
    }

    @Override // defpackage.c2D, defpackage.lpP
    public final void R() {
        this.R.suppressLayout(false);
        this.f7352R = true;
    }

    @Override // defpackage.lpP
    public final void c(hFt hft) {
        if (!this.f7352R) {
            this.R.suppressLayout(false);
        }
        hft.h(this);
    }

    @Override // defpackage.c2D, defpackage.lpP
    public final void e() {
        this.R.suppressLayout(true);
    }

    @Override // defpackage.c2D, defpackage.lpP
    public final void v() {
        this.R.suppressLayout(false);
    }
}
