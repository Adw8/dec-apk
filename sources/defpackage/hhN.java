package defpackage;

/* renamed from: hhN  reason: default package */
/* loaded from: classes.dex */
public final class hhN extends c2D {
    public ets R;

    public hhN(ets ets) {
        this.R = ets;
    }

    @Override // defpackage.c2D, defpackage.lpP
    public final void X(hFt hft) {
        ets ets = this.R;
        if (!ets.e) {
            ets.s();
            this.R.e = true;
        }
    }

    @Override // defpackage.lpP
    public final void c(hFt hft) {
        ets ets = this.R;
        int i = ets.X - 1;
        ets.X = i;
        if (i == 0) {
            ets.e = false;
            ets.g();
        }
        hft.h(this);
    }
}
