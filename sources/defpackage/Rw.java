package defpackage;

import android.view.accessibility.AccessibilityManager;

/* renamed from: Rw  reason: default package */
/* loaded from: classes.dex */
public abstract class Rw {
    public static boolean R(AccessibilityManager accessibilityManager, P_ p_) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new MD(p_));
    }

    public static boolean v(AccessibilityManager accessibilityManager, P_ p_) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new MD(p_));
    }
}
