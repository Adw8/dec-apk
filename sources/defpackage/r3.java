package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: r3  reason: default package */
/* loaded from: classes.dex */
public abstract class r3 {
    public static Drawable[] R(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static void c(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }

    public static void v(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
}
