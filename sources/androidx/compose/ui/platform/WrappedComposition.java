package androidx.compose.ui.platform;

import dev.kdrag0n.virtcontainer.R;

/* access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WrappedComposition implements fJK, k3P {
    public aLd R;

    /* renamed from: R  reason: collision with other field name */
    public final AndroidComposeView f1245R;

    /* renamed from: R  reason: collision with other field name */
    public final fJK f1246R;

    /* renamed from: R  reason: collision with other field name */
    public iv7 f1247R = gMf.R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1248R;

    public WrappedComposition(AndroidComposeView androidComposeView, hAe hae) {
        this.f1245R = androidComposeView;
        this.f1246R = hae;
    }

    @Override // defpackage.fJK
    public final void R() {
        if (!this.f1248R) {
            this.f1248R = true;
            this.f1245R.getView().setTag(R.id.wrapped_composition_tag, null);
            aLd ald = this.R;
            if (ald != null) {
                ald.v(this);
            }
        }
        this.f1246R.R();
    }

    @Override // defpackage.fJK
    public final boolean X() {
        return this.f1246R.X();
    }

    @Override // defpackage.fJK
    public final boolean c() {
        return this.f1246R.c();
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        if (alx == alX.ON_DESTROY) {
            R();
        } else if (alx == alX.ON_CREATE && !this.f1248R) {
            v(this.f1247R);
        }
    }

    @Override // defpackage.fJK
    public final void v(iv7 iv7) {
        this.f1245R.setOnViewTreeOwnersAvailable(new e(this, 0, iv7));
    }
}
