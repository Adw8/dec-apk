package defpackage;

/* renamed from: bAR  reason: default package */
/* loaded from: classes.dex */
public final class bAR implements iHW {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f1542R;

    /* renamed from: R  reason: collision with other field name */
    public final giw f1543R;
    public final long v;

    public bAR(giw giw, int i, long j) {
        this.f1543R = giw;
        this.R = i;
        this.f1542R = ((long) (giw.O() + giw.L())) * 1000000;
        this.v = j * 1000000;
    }

    @Override // defpackage.iHW
    public final boolean R() {
        return true;
    }

    @Override // defpackage.iHW
    public final long X(Pc pc, Pc pc2, Pc pc3) {
        return Long.MAX_VALUE;
    }

    public final long Z(long j) {
        long j2 = j + this.v;
        if (j2 <= 0) {
            return 0;
        }
        long j3 = this.f1542R;
        long j4 = j2 / j3;
        return (this.R == 1 || j4 % ((long) 2) == 0) ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    @Override // defpackage.iHW
    public final Pc c(long j, Pc pc, Pc pc2, Pc pc3) {
        giw giw = this.f1543R;
        long Z = Z(j);
        long j2 = this.v;
        long j3 = this.f1542R;
        return giw.c(Z, pc, pc2, j + j2 > j3 ? c(j3 - j2, pc, pc3, pc2) : pc3);
    }

    @Override // defpackage.iHW
    public final Pc e(Pc pc, Pc pc2, Pc pc3) {
        return o02.P(this, pc, pc2, pc3);
    }

    @Override // defpackage.iHW
    public final Pc v(long j, Pc pc, Pc pc2, Pc pc3) {
        giw giw = this.f1543R;
        long Z = Z(j);
        long j2 = this.v;
        long j3 = this.f1542R;
        return giw.v(Z, pc, pc2, j + j2 > j3 ? c(j3 - j2, pc, pc3, pc2) : pc3);
    }
}
