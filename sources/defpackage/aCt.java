package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: aCt  reason: default package */
/* loaded from: classes.dex */
public abstract class aCt {
    public static void R(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    public static void v(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
