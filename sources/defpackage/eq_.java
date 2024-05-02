package defpackage;

/* renamed from: eq_  reason: default package */
/* loaded from: classes.dex */
public final class eq_ implements giw {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final izz f3214R;
    public final int v;

    public eq_(int i, int i2, oUk ouk) {
        this.R = i;
        this.v = i2;
        this.f3214R = new izz(new kmx(i, i2, ouk));
    }

    @Override // defpackage.giw
    public final int L() {
        return this.v;
    }

    @Override // defpackage.giw
    public final int O() {
        return this.R;
    }

    @Override // defpackage.iHW
    public final boolean R() {
        return false;
    }

    @Override // defpackage.iHW
    public final long X(Pc pc, Pc pc2, Pc pc3) {
        return ((long) (O() + L())) * 1000000;
    }

    @Override // defpackage.iHW
    public final Pc c(long j, Pc pc, Pc pc2, Pc pc3) {
        return this.f3214R.c(j, pc, pc2, pc3);
    }

    @Override // defpackage.iHW
    public final Pc e(Pc pc, Pc pc2, Pc pc3) {
        return o02.P(this, pc, pc2, pc3);
    }

    @Override // defpackage.iHW
    public final Pc v(long j, Pc pc, Pc pc2, Pc pc3) {
        return this.f3214R.v(j, pc, pc2, pc3);
    }
}
