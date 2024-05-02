package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: k16  reason: default package */
/* loaded from: classes.dex */
public abstract class k16 {
    public static final ThreadLocal R = new ThreadLocal();
    public static final ThreadLocal v = new ThreadLocal();

    public static void R(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            R(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
