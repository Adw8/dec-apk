package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: j9n  reason: default package */
/* loaded from: classes.dex */
public abstract class j9n {
    static {
        kfk.P("ProcessUtils");
    }

    public static boolean R(Context context, l_s l_s) {
        String processName = Application.getProcessName();
        l_s.getClass();
        return !TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
