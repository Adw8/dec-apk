package defpackage;

/* renamed from: npe  reason: default package */
/* loaded from: classes.dex */
public final class npe extends u_ {
    public npe() {
        super("Generic L*a*b*", q2.c, 15);
    }

    @Override // defpackage.u_
    public final float[] R(float[] fArr) {
        float f = fArr[0];
        float[] fArr2 = iWF.f4626R;
        float f2 = f / fArr2[0];
        float f3 = fArr[1] / fArr2[1];
        float f4 = fArr[2] / fArr2[2];
        float pow = f2 > 0.008856452f ? (float) Math.pow((double) f2, (double) 0.33333334f) : (f2 * 7.787037f) + 0.13793103f;
        float pow2 = f3 > 0.008856452f ? (float) Math.pow((double) f3, (double) 0.33333334f) : (f3 * 7.787037f) + 0.13793103f;
        float pow3 = f4 > 0.008856452f ? (float) Math.pow((double) f4, (double) 0.33333334f) : (f4 * 7.787037f) + 0.13793103f;
        fArr[0] = caw.m((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = caw.m((pow - pow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = caw.m((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // defpackage.u_
    public final float[] X(float[] fArr) {
        fArr[0] = caw.m(fArr[0], 0.0f, 100.0f);
        fArr[1] = caw.m(fArr[1], -128.0f, 128.0f);
        float m = caw.m(fArr[2], -128.0f, 128.0f);
        fArr[2] = m;
        float f = (fArr[0] + 16.0f) / 116.0f;
        float f2 = (fArr[1] * 0.002f) + f;
        float f3 = f - (m * 0.005f);
        float f4 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f5 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = iWF.f4626R;
        fArr[0] = f4 * fArr2[0];
        fArr[1] = f5 * fArr2[1];
        fArr[2] = f6 * fArr2[2];
        return fArr;
    }

    @Override // defpackage.u_
    public final float c(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // defpackage.u_
    public final float v(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }
}
