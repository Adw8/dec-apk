package defpackage;

import android.app.Activity;
import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: i4u  reason: default package */
/* loaded from: classes.dex */
public final class i4u extends lNC {
    public final /* synthetic */ nmQ this$1;

    public i4u(nmQ nmq) {
        this.this$1 = nmq;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        this.this$1.this$0.R();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        ProcessLifecycleOwner processLifecycleOwner = this.this$1.this$0;
        int i = processLifecycleOwner.e + 1;
        processLifecycleOwner.e = i;
        if (i == 1 && processLifecycleOwner.v) {
            processLifecycleOwner.f1325R.X(alX.ON_START);
            processLifecycleOwner.v = false;
        }
    }
}
