package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: bnG  reason: default package */
/* loaded from: classes.dex */
public abstract class bnG {
    public static MenuItem C(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }

    public static MenuItem H(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    public static MenuItem L(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    public static CharSequence O(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    public static int R(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    public static MenuItem U(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    public static int X(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    public static MenuItem Z(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    public static ColorStateList c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    public static PorterDuff.Mode e(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    public static MenuItem m(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    public static CharSequence v(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    public static MenuItem x(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }
}
