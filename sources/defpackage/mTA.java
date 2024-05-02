package defpackage;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: mTA  reason: default package */
/* loaded from: classes.dex */
public abstract class mTA {
    public static final Rect R = new Rect();

    public static Rect R(Drawable drawable) {
        Insets R2 = oGN.R(drawable);
        return new Rect(R2.left, R2.top, R2.right, R2.bottom);
    }

    public static PorterDuff.Mode v(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
