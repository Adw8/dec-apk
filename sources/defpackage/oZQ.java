package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* renamed from: oZQ  reason: default package */
/* loaded from: classes.dex */
public abstract class oZQ {
    public static ColorStateList R(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void e(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }

    public static PorterDuff.Mode v(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }
}
