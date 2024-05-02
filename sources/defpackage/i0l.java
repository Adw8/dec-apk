package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: i0l  reason: default package */
/* loaded from: classes.dex */
public final class i0l extends AnimatorListenerAdapter {
    public final /* synthetic */ int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ View f4434R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ViewPropertyAnimator f4435R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ bbj f4436R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h9X f4437R;

    public i0l(bbj bbj, h9X h9x, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4436R = bbj;
        this.f4437R = h9x;
        this.f4435R = viewPropertyAnimator;
        this.f4434R = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.R) {
            case 1:
                this.f4434R.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.R) {
            case 0:
                this.f4435R.setListener(null);
                this.f4434R.setAlpha(1.0f);
                this.f4436R.c(this.f4437R);
                this.f4436R.H.remove(this.f4437R);
                this.f4436R.x();
                return;
            default:
                this.f4435R.setListener(null);
                this.f4436R.c(this.f4437R);
                this.f4436R.m.remove(this.f4437R);
                this.f4436R.x();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.R) {
            case 0:
                this.f4436R.getClass();
                return;
            default:
                this.f4436R.getClass();
                return;
        }
    }

    public i0l(bbj bbj, h9X h9x, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4436R = bbj;
        this.f4437R = h9x;
        this.f4434R = view;
        this.f4435R = viewPropertyAnimator;
    }
}
