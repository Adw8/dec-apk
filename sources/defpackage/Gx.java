package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: Gx  reason: default package */
/* loaded from: classes.dex */
public abstract class Gx {
    public static int R(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static AppOpsManager c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static String v(Context context) {
        return context.getOpPackageName();
    }
}
