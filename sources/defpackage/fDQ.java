package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: fDQ  reason: default package */
/* loaded from: classes.dex */
public abstract class fDQ {
    public static Drawable R(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static Drawable v(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }
}
