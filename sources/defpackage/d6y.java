package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: d6y  reason: default package */
/* loaded from: classes.dex */
public abstract class d6y {
    public static void L(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    public static void O(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static int R(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static void X(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    public static boolean c(View view) {
        return view.isLaidOut();
    }

    public static boolean e(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static boolean v(View view) {
        return view.isAttachedToWindow();
    }
}
