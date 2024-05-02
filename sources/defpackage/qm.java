package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: qm  reason: default package */
/* loaded from: classes.dex */
public abstract class qm {
    public static <T> T R(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static int c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static String e(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static int v(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }
}
