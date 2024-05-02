package defpackage;

import android.app.Activity;
import android.app.Application;

/* renamed from: eje  reason: default package */
/* loaded from: classes.dex */
public abstract class eje {
    public static void R(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
