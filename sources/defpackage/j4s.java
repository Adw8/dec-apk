package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;

/* renamed from: j4s  reason: default package */
/* loaded from: classes.dex */
public abstract class j4s {
    public static DisplayCutout R(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
        return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
    }

    public static Insets v(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }
}
