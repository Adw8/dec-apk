package defpackage;

/* renamed from: kmx  reason: default package */
/* loaded from: classes.dex */
public final class kmx implements lDA {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final oUk f5420R;
    public final int v;

    public kmx(int i, int i2, oUk ouk) {
        this.R = i;
        this.v = i2;
        this.f5420R = ouk;
    }

    @Override // defpackage.lDA
    public final float R(float f, float f2, float f3) {
        return v(X(f, f2, f3), f, f2, f3);
    }

    @Override // defpackage.lDA
    public final long X(float f, float f2, float f3) {
        return ((long) (this.v + this.R)) * 1000000;
    }

    @Override // defpackage.jM
    public final iHW c(oHg ohg) {
        return new izz(this);
    }

    @Override // defpackage.lDA
    public final float e(long j, float f, float f2, float f3) {
        long H = caw.H((j / 1000000) - ((long) this.v), (long) this.R);
        int i = this.R;
        float R = this.f5420R.R(caw.m(i == 0 ? 1.0f : ((float) H) / ((float) i), 0.0f, 1.0f));
        oHg ohg = kYZ.R;
        return (f2 * R) + ((((float) 1) - R) * f);
    }

    @Override // defpackage.lDA
    public final float v(long j, float f, float f2, float f3) {
        long H = caw.H((j / 1000000) - ((long) this.v), (long) this.R);
        int i = (H > 0 ? 1 : (H == 0 ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (e(H * 1000000, f, f2, f3) - e((H - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }
}
