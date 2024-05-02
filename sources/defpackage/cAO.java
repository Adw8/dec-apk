package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: cAO  reason: default package */
/* loaded from: classes.dex */
public abstract class cAO {
    public static void L(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void O(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void R(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static void X(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void Z(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static ColorFilter c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void e(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void m(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static boolean v(Drawable drawable) {
        return drawable.canApplyTheme();
    }
}
