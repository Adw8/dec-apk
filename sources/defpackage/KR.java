package defpackage;

import android.view.accessibility.AccessibilityRecord;

/* renamed from: KR  reason: default package */
/* loaded from: classes.dex */
public abstract class KR {
    public static int R(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static void c(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    public static void e(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    public static int v(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }
}
