package defpackage;

import android.view.ViewConfiguration;

/* renamed from: pqq  reason: default package */
/* loaded from: classes.dex */
public abstract class pqq {
    public static int R(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static boolean v(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
