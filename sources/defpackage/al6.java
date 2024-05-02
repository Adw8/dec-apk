package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: al6  reason: default package */
/* loaded from: classes.dex */
public abstract class al6 {
    public static Intent R(Activity activity) {
        return activity.getParentActivityIntent();
    }

    public static boolean c(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public static boolean v(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }
}
