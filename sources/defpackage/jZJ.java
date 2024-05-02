package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: jZJ  reason: default package */
/* loaded from: classes.dex */
public abstract class jZJ {
    public static ColorStateList R(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static void c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void e(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }

    public static PorterDuff.Mode v(ImageView imageView) {
        return imageView.getImageTintMode();
    }
}
