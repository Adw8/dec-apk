package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: nDi  reason: default package */
/* loaded from: classes.dex */
public abstract class nDi {
    public static void L(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void O(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    public static Drawable[] R(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static void X(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void Z(View view, int i) {
        view.setTextDirection(i);
    }

    public static int c(View view) {
        return view.getTextDirection();
    }

    public static Locale e(TextView textView) {
        return textView.getTextLocale();
    }

    public static int v(View view) {
        return view.getLayoutDirection();
    }
}
