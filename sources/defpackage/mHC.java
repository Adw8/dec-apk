package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: mHC  reason: default package */
/* loaded from: classes.dex */
public abstract class mHC {
    public static void C(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void H(View view) {
        view.postInvalidateOnAnimation();
    }

    public static int L(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void N(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static ViewParent O(View view) {
        return view.getParentForAccessibility();
    }

    public static void P(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static AccessibilityNodeProvider R(View view) {
        return view.getAccessibilityNodeProvider();
    }

    public static void U(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    public static int X(View view) {
        return view.getMinimumWidth();
    }

    public static boolean Z(View view) {
        return view.hasOverlappingRendering();
    }

    public static int c(View view) {
        return view.getImportantForAccessibility();
    }

    public static int e(View view) {
        return view.getMinimumHeight();
    }

    public static void g(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void j(View view) {
        view.requestFitSystemWindows();
    }

    public static boolean m(View view) {
        return view.hasTransientState();
    }

    public static void t(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static boolean v(View view) {
        return view.getFitsSystemWindows();
    }

    public static boolean x(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static void y(View view, boolean z) {
        view.setHasTransientState(z);
    }
}
