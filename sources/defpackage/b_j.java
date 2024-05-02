package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b_j  reason: default package */
/* loaded from: classes.dex */
public final class b_j extends AnimatorListenerAdapter implements lpP {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final View f1747R;

    /* renamed from: R  reason: collision with other field name */
    public final ViewGroup f1748R;
    public boolean v;
    public boolean c = false;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1749R = true;

    public b_j(View view, int i) {
        this.f1747R = view;
        this.R = i;
        this.f1748R = (ViewGroup) view.getParent();
        O(true);
    }

    public final void O(boolean z) {
        ViewGroup viewGroup;
        if (this.f1749R && this.v != z && (viewGroup = this.f1748R) != null) {
            this.v = z;
            viewGroup.suppressLayout(z);
        }
    }

    @Override // defpackage.lpP
    public final void R() {
    }

    @Override // defpackage.lpP
    public final void X(hFt hft) {
    }

    @Override // defpackage.lpP
    public final void c(hFt hft) {
        if (!this.c) {
            View view = this.f1747R;
            int i = this.R;
            mZP mzp = kkY.R;
            view.setTransitionVisibility(i);
            ViewGroup viewGroup = this.f1748R;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        O(false);
        hft.h(this);
    }

    @Override // defpackage.lpP
    public final void e() {
        O(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.c) {
            View view = this.f1747R;
            int i = this.R;
            mZP mzp = kkY.R;
            view.setTransitionVisibility(i);
            ViewGroup viewGroup = this.f1748R;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        O(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.c) {
            View view = this.f1747R;
            int i = this.R;
            mZP mzp = kkY.R;
            view.setTransitionVisibility(i);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.c) {
            View view = this.f1747R;
            mZP mzp = kkY.R;
            view.setTransitionVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // defpackage.lpP
    public final void v() {
        O(false);
    }
}
