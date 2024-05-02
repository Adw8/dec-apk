package defpackage;

/* renamed from: cvo  reason: default package */
/* loaded from: classes.dex */
public final class cvo {
    public static final cvo R;
    public final float L;
    public final float O;

    /* renamed from: R  reason: collision with other field name */
    public final float f2457R;

    /* renamed from: R  reason: collision with other field name */
    public final float[] f2458R;
    public final float X;
    public final float Z;
    public final float c;
    public final float e;
    public final float m;
    public final float v;

    static {
        float[] fArr = mLz.f6003R;
        float I = (float) ((((double) mLz.I()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = mLz.f6005R;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr[1];
        float f3 = fArr3[1] * f2;
        float f4 = fArr[2];
        float f5 = (fArr3[2] * f4) + f3 + (fArr3[0] * f);
        float[] fArr4 = fArr2[1];
        float f6 = (fArr4[2] * f4) + (fArr4[1] * f2) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f7 = (f4 * fArr5[2]) + (f2 * fArr5[1]) + (f * fArr5[0]);
        float f8 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp((double) (((-I) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d = (double) exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * I) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(((double) I) * 5.0d))) + (f10 * I);
        float I2 = mLz.I() / fArr[1];
        double d2 = (double) I2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f7)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f5)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f6)) / 100.0d, 0.42d), pow2};
        float f12 = fArr7[0];
        float f13 = fArr7[1];
        R = new cvo(I2, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f12 * 400.0f) / (f12 + 27.13f)) * 2.0f) + ((f13 * 400.0f) / (f13 + 27.13f))) * pow, pow, pow, f8, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public cvo(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.O = f;
        this.f2457R = f2;
        this.v = f3;
        this.c = f4;
        this.e = f5;
        this.X = f6;
        this.f2458R = fArr;
        this.L = f7;
        this.Z = f8;
        this.m = f9;
    }
}
