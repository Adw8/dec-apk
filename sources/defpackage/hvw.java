package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* renamed from: hvw  reason: default package */
/* loaded from: classes.dex */
public abstract class hvw {
    public static OnBackInvokedDispatcher R(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
