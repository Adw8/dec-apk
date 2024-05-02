package defpackage;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: p4y  reason: default package */
/* loaded from: classes.dex */
public final class p4y implements Transition.TransitionListener {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ArrayList f7064R;

    public p4y(View view, ArrayList arrayList) {
        this.R = view;
        this.f7064R = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.R.setVisibility(8);
        int size = this.f7064R.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f7064R.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
