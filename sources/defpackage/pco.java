package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: pco  reason: default package */
/* loaded from: classes.dex */
public abstract class pco {
    public static Rect R(View view) {
        return view.getClipBounds();
    }

    public static void c(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static boolean v(View view) {
        return view.isInLayout();
    }
}
