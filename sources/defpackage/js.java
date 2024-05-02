package defpackage;

/* renamed from: js  reason: default package */
/* loaded from: classes.dex */
public abstract class js {
    public static final float[] R;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float[] fArr = new float[101];
        R = fArr;
        float[] fArr2 = new float[101];
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        while (true) {
            float f13 = 1.0f;
            if (i < 100) {
                int i2 = i + 1;
                float f14 = ((float) i) / ((float) 100);
                float f15 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f15 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = f13 - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f16 = (((f2 * 0.35000002f) + (f4 * 0.175f)) * f5) + f6;
                    if (((double) Math.abs(f16 - f14)) < 1.0E-5d) {
                        break;
                    }
                    if (f16 > f14) {
                        f15 = f2;
                    } else {
                        f11 = f2;
                    }
                    i2 = i2;
                    f13 = 1.0f;
                }
                fArr[i] = (((f4 * 0.5f) + f2) * f5) + f6;
                float f17 = 1.0f;
                while (true) {
                    f7 = ((f17 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f7 * f3 * f8;
                    f10 = f7 * f7 * f7;
                    float f18 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (((double) Math.abs(f18 - f14)) < 1.0E-5d) {
                        break;
                    }
                    if (f18 > f14) {
                        f17 = f7;
                    } else {
                        f12 = f7;
                    }
                    f = 2.0f;
                    f3 = 3.0f;
                }
                fArr2[i] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
                i = i2;
            } else {
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public static pr R(float f) {
        float f2;
        float f3;
        float f4 = (float) 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = ((float) i) / f4;
            int i2 = i + 1;
            float f6 = ((float) i2) / f4;
            float[] fArr = R;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = jQ.v(f, f5, f3, f7);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new pr(f2, f3);
    }
}
