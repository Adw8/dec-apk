package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: p2l  reason: default package */
/* loaded from: classes.dex */
public abstract class p2l {
    public static OnBackInvokedCallback R(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new OnBackInvokedCallback(runnable) { // from class: gUA
            public final /* synthetic */ Runnable R;

            {
                this.R = r1;
            }

            public final void onBackInvoked() {
                this.R.run();
            }
        };
    }

    public static void c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static void v(Object obj, int i, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }
}
