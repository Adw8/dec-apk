package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: Ni  reason: default package */
/* loaded from: classes.dex */
public final class Ni extends h6s {
    public final /* synthetic */ RR R;
    public final /* synthetic */ int e = 0;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Ni(RR rr, Context context, lRG lrg, JJ jj) {
        super(context, lrg, jj, true);
        this.R = rr;
        this.c = 8388613;
        h89 h89 = rr.f488R;
        ((h6s) this).f4071R = h89;
        fkQ fkq = ((h6s) this).f4068R;
        if (fkq != null) {
            fkq.L(h89);
        }
    }

    @Override // defpackage.h6s
    public final void c() {
        switch (this.e) {
            case 0:
                this.R.v = null;
                super.c();
                return;
            default:
                lRG lrg = this.R.f489R;
                if (lrg != null) {
                    lrg.c(true);
                }
                this.R.f481R = null;
                super.c();
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Ni(RR rr, Context context, go1 go1, View view) {
        super(context, go1, view, false);
        this.R = rr;
        if (!go1.v.Z()) {
            View view2 = rr.R;
            ((h6s) this).f4066R = view2 == null ? (View) rr.f487R : view2;
        }
        h89 h89 = rr.f488R;
        ((h6s) this).f4071R = h89;
        fkQ fkq = ((h6s) this).f4068R;
        if (fkq != null) {
            fkq.L(h89);
        }
    }
}
