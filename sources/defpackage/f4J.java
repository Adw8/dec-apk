package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: f4J  reason: default package */
/* loaded from: classes.dex */
public abstract class f4J {
    public static int R(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static boolean v(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }
}
