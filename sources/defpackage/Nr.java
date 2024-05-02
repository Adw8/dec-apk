package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: Nr  reason: default package */
/* loaded from: classes.dex */
public abstract class Nr {
    public static int R(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void v(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
