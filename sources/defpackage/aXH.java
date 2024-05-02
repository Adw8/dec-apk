package defpackage;

import android.transition.Transition;

/* renamed from: aXH  reason: default package */
/* loaded from: classes.dex */
public final class aXH implements Transition.TransitionListener {
    public final /* synthetic */ Runnable R;

    public aXH(dX dXVar) {
        this.R = dXVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.R.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
