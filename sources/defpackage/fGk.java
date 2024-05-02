package defpackage;

import android.view.View;

/* renamed from: fGk  reason: default package */
/* loaded from: classes.dex */
public final class fGk extends bKZ {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3368R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3369R;
    public int v;

    public fGk(hYl hyl) {
        this.R = 0;
        this.f3368R = hyl;
        this.f3369R = false;
        this.v = 0;
    }

    @Override // defpackage.eIH
    public final void R() {
        switch (this.R) {
            case 0:
                int i = this.v + 1;
                this.v = i;
                if (i == ((hYl) this.f3368R).f4300R.size()) {
                    eIH eih = ((hYl) this.f3368R).f4298R;
                    if (eih != null) {
                        eih.R();
                    }
                    this.v = 0;
                    this.f3369R = false;
                    ((hYl) this.f3368R).f4301R = false;
                    return;
                }
                return;
            default:
                if (!this.f3369R) {
                    ((muY) this.f3368R).f6229R.setVisibility(this.v);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.bKZ, defpackage.eIH
    public final void c(View view) {
        switch (this.R) {
            case 1:
                this.f3369R = true;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.bKZ, defpackage.eIH
    public final void v() {
        switch (this.R) {
            case 0:
                if (!this.f3369R) {
                    this.f3369R = true;
                    eIH eih = ((hYl) this.f3368R).f4298R;
                    if (eih != null) {
                        eih.v();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((muY) this.f3368R).f6229R.setVisibility(0);
                return;
        }
    }

    public fGk(muY muy, int i) {
        this.R = 1;
        this.f3368R = muy;
        this.v = i;
        this.f3369R = false;
    }
}
