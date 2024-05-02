package defpackage;

/* renamed from: g_J  reason: default package */
/* loaded from: classes.dex */
public final class g_J implements oUk {
    public final float R;
    public final float v;

    public g_J(float f, float f2) {
        this.R = f;
        this.v = f2;
    }

    @Override // defpackage.oUk
    public final float R(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float f2 = 0.0f;
        float f3 = 1.0f;
        while (true) {
            float f4 = (f2 + f3) / ((float) 2);
            float f5 = (float) 3;
            float f6 = ((float) 1) - f4;
            float f7 = (this.v * f5 * f6 * f4 * f4) + (this.R * f5 * f6 * f6 * f4);
            float f8 = f4 * f4 * f4;
            float f9 = f7 + f8;
            if (Math.abs(f - f9) < 0.001f) {
                return (f5 * 1.0f * f6 * f4 * f4) + (0.0f * f5 * f6 * f6 * f4) + f8;
            } else if (f9 < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g_J) {
            g_J g_j = (g_J) obj;
            if (this.R == g_j.R) {
                if (this.v == g_j.v) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + jQ.c(this.v, jQ.c(0.0f, Float.hashCode(this.R) * 31, 31), 31);
    }
}
