package defpackage;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: bDd  reason: default package */
/* loaded from: classes.dex */
public abstract class bDd {
    public static void R(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void v(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
