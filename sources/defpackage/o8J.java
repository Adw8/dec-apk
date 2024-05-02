package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* renamed from: o8J  reason: default package */
/* loaded from: classes.dex */
public abstract class o8J {
    public static void L(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void O(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static int R(TextView textView) {
        return textView.getBreakStrategy();
    }

    public static void X(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    public static void Z(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }

    public static PorterDuff.Mode c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    public static int e(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    public static ColorStateList v(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }
}
