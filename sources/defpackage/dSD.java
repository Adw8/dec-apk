package defpackage;

/* renamed from: dSD  reason: default package */
/* loaded from: classes.dex */
public final class dSD extends u_ {
    public static final float[] R;
    public static final float[] c;
    public static final float[] e;
    public static final float[] v;

    static {
        float[] X4 = msU.X4(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, msU.K(Ws.R.f609R, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        R = X4;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        v = fArr;
        c = msU.F(X4);
        e = msU.F(fArr);
    }

    public dSD() {
        super("Oklab", q2.c, 17);
    }

    @Override // defpackage.u_
    public final float[] R(float[] fArr) {
        msU.vl(R, fArr);
        double d = (double) 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow((double) Math.abs(fArr[0]), d));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow((double) Math.abs(fArr[1]), d));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow((double) Math.abs(fArr[2]), d));
        msU.vl(v, fArr);
        return fArr;
    }

    @Override // defpackage.u_
    public final float[] X(float[] fArr) {
        fArr[0] = caw.m(fArr[0], 0.0f, 1.0f);
        fArr[1] = caw.m(fArr[1], -0.5f, 0.5f);
        fArr[2] = caw.m(fArr[2], -0.5f, 0.5f);
        msU.vl(e, fArr);
        float f = fArr[0];
        fArr[0] = f * f * f;
        float f2 = fArr[1];
        fArr[1] = f2 * f2 * f2;
        float f3 = fArr[2];
        fArr[2] = f3 * f3 * f3;
        msU.vl(c, fArr);
        return fArr;
    }

    @Override // defpackage.u_
    public final float c(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // defpackage.u_
    public final float v(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }
}
