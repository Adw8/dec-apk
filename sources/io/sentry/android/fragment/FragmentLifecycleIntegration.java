package io.sentry.android.fragment;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, fwF, Closeable {
    public final Application R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4731R;
    public final boolean v;

    public FragmentLifecycleIntegration(Application application, boolean z, boolean z2) {
        this.R = application;
        this.f4731R = z;
        this.v = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.R.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        hAW haw;
        hm9 hm9 = activity instanceof hm9 ? (hm9) activity : null;
        if (hm9 != null && (haw = ((eAj) hm9.R.R).f3006R) != null) {
            haw.f4111R.f1001R.add(new kPe(new e9r(null, this.f4731R, this.v)));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public FragmentLifecycleIntegration(Application application) {
        this(application, true, false);
    }
}
