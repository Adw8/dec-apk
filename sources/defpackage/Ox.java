package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: Ox  reason: default package */
/* loaded from: classes.dex */
public abstract class Ox {
    public static void R(AccessibilityRecord accessibilityRecord, View view, int i) {
        accessibilityRecord.setSource(view, i);
    }
}
