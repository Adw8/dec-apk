package defpackage;

/* renamed from: df0  reason: default package */
/* loaded from: classes.dex */
public final class df0 {
    public final float R;
    public final float v;

    public df0(float f, jJj jjj) {
        this.R = f;
        float D = jjj.D();
        float f2 = ldu.R;
        this.v = D * 386.0878f * 160.0f * 0.84f;
    }

    public final c2L R(float f) {
        double v = v(f);
        double d = (double) ldu.R;
        double d2 = d - 1.0d;
        return new c2L(f, (float) (Math.exp((d / d2) * v) * ((double) (this.R * this.v))), (long) (Math.exp(v / d2) * 1000.0d));
    }

    public final double v(float f) {
        float[] fArr = js.R;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.R * this.v)));
    }
}
