package defpackage;

/* renamed from: jfT  reason: default package */
/* loaded from: classes.dex */
public final class jfT extends u_ {
    public jfT() {
        super("Generic XYZ", q2.v, 14);
    }

    public static float O(float f) {
        return caw.m(f, -2.0f, 2.0f);
    }

    @Override // defpackage.u_
    public final float[] R(float[] fArr) {
        fArr[0] = O(fArr[0]);
        fArr[1] = O(fArr[1]);
        fArr[2] = O(fArr[2]);
        return fArr;
    }

    @Override // defpackage.u_
    public final float[] X(float[] fArr) {
        fArr[0] = O(fArr[0]);
        fArr[1] = O(fArr[1]);
        fArr[2] = O(fArr[2]);
        return fArr;
    }

    @Override // defpackage.u_
    public final float c(int i) {
        return -2.0f;
    }

    @Override // defpackage.u_
    public final float v(int i) {
        return 2.0f;
    }
}
