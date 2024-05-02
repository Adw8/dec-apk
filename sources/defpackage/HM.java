package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: HM  reason: default package */
/* loaded from: classes.dex */
public abstract class HM {
    public static void R(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
