package io.sentry.android.core;

import java.util.TimerTask;

/* loaded from: classes.dex */
public final class d extends TimerTask {
    public final /* synthetic */ LifecycleWatcher R;

    public d(LifecycleWatcher lifecycleWatcher) {
        this.R = lifecycleWatcher;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        LifecycleWatcher lifecycleWatcher = this.R;
        lifecycleWatcher.getClass();
        new H4().R("end", "state");
        lXr lxr = lXr.INFO;
        lifecycleWatcher.getClass();
        throw null;
    }
}
