package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: Z3  reason: default package */
/* loaded from: classes.dex */
public final class Z3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ UU f658R;

    public /* synthetic */ Z3(UU uu, int i) {
        this.R = i;
        this.f658R = uu;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.R) {
            case 1:
                ((kst) this.f658R).f5455R.L(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.R) {
            case 0:
                ((kst) this.f658R).f5455R.L(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
