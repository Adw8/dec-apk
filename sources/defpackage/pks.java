package defpackage;

import android.transition.Transition;
import android.widget.PopupWindow;

/* renamed from: pks  reason: default package */
/* loaded from: classes.dex */
public abstract class pks {
    public static void R(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void v(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
