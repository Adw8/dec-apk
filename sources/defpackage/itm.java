package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: itm  reason: default package */
/* loaded from: classes.dex */
public abstract class itm {
    public static int R(PopupWindow popupWindow, View view, int i, boolean z) {
        return popupWindow.getMaxAvailableHeight(view, i, z);
    }
}
