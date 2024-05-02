package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: lsR  reason: default package */
/* loaded from: classes.dex */
public abstract class lsR extends Drawable {
    public static final double R = Math.cos(Math.toRadians(45.0d));

    public static float R(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - R) * ((double) f2)) + ((double) f));
    }

    public static float v(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - R) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
