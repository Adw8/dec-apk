package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* renamed from: iep  reason: default package */
/* loaded from: classes.dex */
public abstract class iep {
    public static int R(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static void X(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static Drawable c(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    public static boolean e(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static Drawable v(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }
}
