package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: fv7  reason: default package */
/* loaded from: classes.dex */
public abstract class fv7 {
    public static WindowInsets R(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }

    public static WindowInsets v(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }
}
