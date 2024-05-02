package dev.kdrag0n.app.arch;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;

/* loaded from: classes.dex */
public final class ProcessLifecycleEvents implements DefaultLifecycleObserver {
    public final iyL R = new iyL();
    public final iyL v = new iyL();
    public final iyL c = new iyL();
    public final iyL e = new iyL();
    public final iyL X = new iyL();
    public final iyL O = new iyL();

    public ProcessLifecycleEvents() {
        ProcessLifecycleOwner.R.f1325R.R(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(nu_ nu_) {
        l6.z(mxC.N(), null, 0, new iwP(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(nu_ nu_) {
        l6.z(mxC.N(), null, 0, new g1U(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(nu_ nu_) {
        l6.z(mxC.N(), null, 0, new jPT(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(nu_ nu_) {
        l6.z(mxC.N(), null, 0, new cp4(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(nu_ nu_) {
        l6.z(mxC.N(), null, 0, new mIC(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(nu_ nu_) {
        l6.z(mxC.N(), null, 0, new dpS(this, null), 3);
    }
}
