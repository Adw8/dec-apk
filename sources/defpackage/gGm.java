package defpackage;

/* renamed from: gGm  reason: default package */
/* loaded from: classes.dex */
public final class gGm {
    public final /* synthetic */ eJw R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWW f3701R;

    public gGm(eJw ejw, nWW nww) {
        this.R = ejw;
        this.f3701R = nww;
    }

    public final void R(L2 l2) {
        pby[] pbyArr = kxm.R;
        if (l2.v == 0) {
            this.R.f3057R.H(Boolean.TRUE);
        } else {
            this.R.f3057R.H(Boolean.FALSE);
            if (n3x.v(this.R.f3054R, this.f3701R.R)) {
                this.R.f3054R = null;
            }
        }
        try {
            this.R.v.c(null);
        } catch (IllegalStateException unused) {
            pby[] pbyArr2 = kxm.R;
        }
    }
}
