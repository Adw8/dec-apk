package defpackage;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: LJ  reason: default package */
/* loaded from: classes.dex */
public abstract class LJ {
    public static void R(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void v(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }
}
