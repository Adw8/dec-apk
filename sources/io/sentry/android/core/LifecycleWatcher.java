package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;

/* loaded from: classes.dex */
final class LifecycleWatcher implements DefaultLifecycleObserver {
    public d R;

    public final void R(String str) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(nu_ nu_) {
        R("foreground");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(nu_ nu_) {
        R("background");
    }
}
