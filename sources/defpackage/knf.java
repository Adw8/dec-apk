package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: knf  reason: default package */
/* loaded from: classes.dex */
public abstract class knf {
    public knf() {
    }

    public boolean C(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public void H(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    public boolean L(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void N(View view, Parcelable parcelable) {
    }

    public void O() {
    }

    public Parcelable P(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean R(View view) {
        return false;
    }

    public void U(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public void X(CoordinatorLayout coordinatorLayout, View view) {
    }

    public abstract boolean Z(CoordinatorLayout coordinatorLayout, View view, int i);

    public void c(aRL arl) {
    }

    public boolean e(View view, View view2) {
        return false;
    }

    public void g(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean v(View view, View view2) {
        return false;
    }

    public boolean x(View view) {
        return false;
    }

    public boolean y(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public knf(int i) {
    }
}
