package defpackage;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: nmQ  reason: default package */
/* loaded from: classes.dex */
public final class nmQ extends lNC {
    public final /* synthetic */ ProcessLifecycleOwner this$0;

    public nmQ(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // defpackage.lNC, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.lNC, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.X - 1;
        processLifecycleOwner.X = i;
        if (i == 0) {
            processLifecycleOwner.f1323R.postDelayed(processLifecycleOwner.f1324R, 700);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        eje.R(activity, new i4u(this));
    }

    @Override // defpackage.lNC, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.e - 1;
        processLifecycleOwner.e = i;
        if (i == 0 && processLifecycleOwner.f1326R) {
            processLifecycleOwner.f1325R.X(alX.ON_STOP);
            processLifecycleOwner.v = true;
        }
    }
}
