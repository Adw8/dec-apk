package defpackage;

import android.graphics.Shader;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: l1r  reason: default package */
/* loaded from: classes.dex */
public abstract class l1r {
    public static nUO R;

    /* renamed from: R  reason: collision with other field name */
    public static String[] f5542R = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f5541R = {16842755};
    public static final int[] v = {16842755};
    public static final int[] c = {R.attr.defaultNavHost};

    public static void O(float[] fArr, float f, float f2) {
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = fArr[3] * f;
        float f7 = fArr[11] * 0.0f;
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f7 + (fArr[7] * f2) + f6 + fArr[15];
    }

    public static float[] R() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final void X(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    public static final void c(float[] fArr, aG9 ag9) {
        long v2 = v(fArr, aH9.N(ag9.R, ag9.v));
        long v3 = v(fArr, aH9.N(ag9.R, ag9.e));
        long v4 = v(fArr, aH9.N(ag9.c, ag9.v));
        long v5 = v(fArr, aH9.N(ag9.c, ag9.e));
        ag9.R = Math.min(Math.min(aWo.e(v2), aWo.e(v3)), Math.min(aWo.e(v4), aWo.e(v5)));
        ag9.v = Math.min(Math.min(aWo.X(v2), aWo.X(v3)), Math.min(aWo.X(v4), aWo.X(v5)));
        ag9.c = Math.max(Math.max(aWo.e(v2), aWo.e(v3)), Math.max(aWo.e(v4), aWo.e(v5)));
        ag9.e = Math.max(Math.max(aWo.X(v2), aWo.X(v3)), Math.max(aWo.X(v4), aWo.X(v5)));
    }

    public static final a1 e(mAv mav) {
        Object obj = mav.f5962R;
        boolean z = true;
        if (!(((Shader) obj) != null) && mav.R == 0) {
            z = false;
        }
        if (!z) {
            return null;
        }
        Shader shader = (Shader) obj;
        return shader != null ? new qD(shader) : new oSW(aH9.X(mav.R));
    }

    public static final long v(float[] fArr, long j) {
        float e = aWo.e(j);
        float X = aWo.X(j);
        float f = ((float) 1) / (((fArr[7] * X) + (fArr[3] * e)) + fArr[15]);
        if (!(!Float.isInfinite(f) && !Float.isNaN(f))) {
            f = 0.0f;
        }
        return aH9.N(((fArr[4] * X) + (fArr[0] * e) + fArr[12]) * f, ((fArr[5] * X) + (fArr[1] * e) + fArr[13]) * f);
    }
}
