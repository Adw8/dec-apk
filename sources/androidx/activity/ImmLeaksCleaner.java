package androidx.activity;

import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements k3P {
    public static int e;

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        if (alx == alX.ON_DESTROY) {
            if (e == 0) {
                try {
                    e = 2;
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    e = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (e == 1) {
                throw null;
            }
        }
    }
}
