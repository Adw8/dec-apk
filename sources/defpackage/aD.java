package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: aD  reason: default package */
/* loaded from: classes.dex */
public abstract class aD {
    public static final void R(AccessibilityEvent accessibilityEvent, int i, int i2) {
        accessibilityEvent.setScrollDeltaX(i);
        accessibilityEvent.setScrollDeltaY(i2);
    }
}
