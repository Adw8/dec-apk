package defpackage;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* renamed from: eHQ  reason: default package */
/* loaded from: classes.dex */
public abstract class eHQ {
    public static void H(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static boolean L(View view) {
        return view.isPaddingRelative();
    }

    public static int O(View view) {
        return view.getPaddingStart();
    }

    public static int R() {
        return View.generateViewId();
    }

    public static int X(View view) {
        return view.getPaddingEnd();
    }

    public static void Z(View view, int i) {
        view.setLabelFor(i);
    }

    public static int c(View view) {
        return view.getLabelFor();
    }

    public static int e(View view) {
        return view.getLayoutDirection();
    }

    public static void m(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    public static Display v(View view) {
        return view.getDisplay();
    }

    public static void x(View view, int i) {
        view.setLayoutDirection(i);
    }
}
