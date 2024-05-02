package defpackage;

/* renamed from: j9k  reason: default package */
/* loaded from: classes.dex */
public final class j9k {

    /* renamed from: R  reason: collision with other field name */
    public boolean f4848R;
    public double c;
    public double e;
    public double v;

    /* renamed from: R  reason: collision with other field name */
    public float f4847R = 1.0f;
    public double R = Math.sqrt(50.0d);

    /* renamed from: v  reason: collision with other field name */
    public float f4849v = 1.0f;

    public final long R(float f, float f2, long j) {
        double d;
        double d2;
        boolean z = false;
        if (!this.f4848R) {
            if (!(this.f4847R == Float.MAX_VALUE)) {
                float f3 = this.f4849v;
                double d3 = (double) f3;
                double d4 = d3 * d3;
                if (f3 > 1.0f) {
                    double d5 = this.R;
                    double d6 = d4 - ((double) 1);
                    this.v = (Math.sqrt(d6) * d5) + (((double) (-f3)) * d5);
                    double d7 = this.R;
                    this.c = (((double) (-this.f4849v)) * d7) - (Math.sqrt(d6) * d7);
                } else if (f3 >= 0.0f && f3 < 1.0f) {
                    this.e = Math.sqrt(((double) 1) - d4) * this.R;
                }
                this.f4848R = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f4 = f - this.f4847R;
        double d8 = ((double) j) / 1000.0d;
        float f5 = this.f4849v;
        if (f5 > 1.0f) {
            double d9 = (double) f4;
            double d10 = this.c;
            double d11 = (double) f2;
            double d12 = this.v;
            double d13 = d9 - (((d10 * d9) - d11) / (d10 - d12));
            double d14 = ((d9 * d10) - d11) / (d10 - d12);
            d = (Math.exp(this.v * d8) * d14) + (Math.exp(d10 * d8) * d13);
            double d15 = this.c;
            double exp = Math.exp(d15 * d8) * d13 * d15;
            double d16 = this.v;
            d2 = (Math.exp(d16 * d8) * d14 * d16) + exp;
        } else {
            if (f5 == 1.0f) {
                z = true;
            }
            if (z) {
                double d17 = this.R;
                double d18 = (double) f4;
                double d19 = (d17 * d18) + ((double) f2);
                double d20 = (d19 * d8) + d18;
                d = Math.exp((-d17) * d8) * d20;
                double exp2 = Math.exp((-this.R) * d8) * d20;
                double d21 = this.R;
                d2 = (Math.exp((-d21) * d8) * d19) + (exp2 * (-d21));
            } else {
                double d22 = ((double) 1) / this.e;
                double d23 = this.R;
                double d24 = (double) f4;
                double d25 = ((((double) f5) * d23 * d24) + ((double) f2)) * d22;
                double exp3 = Math.exp(((double) (-f5)) * d23 * d8) * ((Math.sin(this.e * d8) * d25) + (Math.cos(this.e * d8) * d24));
                double d26 = this.R;
                float f6 = this.f4849v;
                double d27 = (-d26) * exp3 * ((double) f6);
                double exp4 = Math.exp(((double) (-f6)) * d26 * d8);
                double d28 = this.e;
                double d29 = this.e;
                d2 = (((Math.cos(d29 * d8) * d25 * d29) + (Math.sin(d28 * d8) * (-d28) * d24)) * exp4) + d27;
                d = exp3;
            }
        }
        return (((long) Float.floatToIntBits((float) d2)) & 4294967295L) | (((long) Float.floatToIntBits((float) (d + ((double) this.f4847R)))) << 32);
    }
}
