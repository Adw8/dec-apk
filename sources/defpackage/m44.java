package defpackage;

import android.widget.PopupWindow;

/* renamed from: m44  reason: default package */
/* loaded from: classes.dex */
public abstract class m44 {
    public static boolean R(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static void c(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void e(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    public static int v(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }
}
