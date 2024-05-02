package defpackage;

/* renamed from: gjA  reason: default package */
/* loaded from: classes.dex */
public abstract class gjA {
    public static final float R = 0.5f;
    public static final float v = -1.0f;
    public static final float c = 1.0f;

    static {
        R(0.0f);
        R(0.5f);
        R(-1.0f);
        R(1.0f);
    }

    public static void R(float f) {
        boolean z = true;
        if (!(0.0f <= f && f <= 1.0f)) {
            if (!(f == -1.0f)) {
                z = false;
            }
        }
        if (!z) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }
}
