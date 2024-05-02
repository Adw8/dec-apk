package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: kkY  reason: default package */
/* loaded from: classes.dex */
public abstract class kkY {
    public static final mZP R = new mZP(Float.class, "translationAlpha", 6);

    static {
        new jWX();
        new mZP(Rect.class, "clipBounds", 7);
    }

    public static void R(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
