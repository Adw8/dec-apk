package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: jUJ  reason: default package */
/* loaded from: classes.dex */
public abstract class jUJ {
    public static gWM R(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        gWM Z = gWM.Z(null, rootWindowInsets);
        Z.f3779R.P(Z);
        Z.f3779R.e(view.getRootView());
        return Z;
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void e(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static int v(View view) {
        return view.getScrollIndicators();
    }
}
