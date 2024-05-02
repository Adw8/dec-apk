package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: dAg  reason: default package */
/* loaded from: classes.dex */
public final class dAg extends AnimatorListenerAdapter {
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object v;

    public /* synthetic */ dAg(Object obj, FK fk) {
        this.v = obj;
        this.R = fk;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((FK) this.R).remove(animator);
        ((hFt) this.v).X.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ((hFt) this.v).X.add(animator);
    }
}
