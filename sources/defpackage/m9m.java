package defpackage;

/* renamed from: m9m  reason: default package */
/* loaded from: classes.dex */
public final class m9m implements i_c {
    public final boolean R;
    public final boolean v;

    public m9m(boolean z, boolean z2) {
        this.R = z;
        this.v = z2;
    }

    @Override // defpackage.i_c
    public final long H(int i, long j, long j2) {
        if (i == 2) {
            boolean z = this.R;
            boolean z2 = this.v;
            float f = 0.0f;
            float e = z ? aWo.e(j2) : 0.0f;
            if (z2) {
                f = aWo.X(j2);
            }
            return aH9.N(e, f);
        }
        int i2 = aWo.R;
        return aWo.v;
    }

    @Override // defpackage.i_c
    public final Object m(long j, long j2, aOO aoo) {
        boolean z = this.R;
        boolean z2 = this.v;
        float f = 0.0f;
        float v = z ? d_E.v(j2) : 0.0f;
        if (z2) {
            f = d_E.c(j2);
        }
        return new d_E(dtx.X(v, f));
    }
}
