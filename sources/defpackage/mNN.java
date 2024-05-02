package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: mNN  reason: default package */
/* loaded from: classes.dex */
public final class mNN extends AnimatorListenerAdapter {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6026R;
    public final /* synthetic */ Object v;

    public mNN(boolean z, View view, View view2) {
        this.f6026R = z;
        this.R = view;
        this.v = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f6026R) {
            ((View) this.R).setVisibility(4);
            ((View) this.v).setAlpha(1.0f);
            ((View) this.v).setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f6026R) {
            ((View) this.R).setVisibility(0);
            ((View) this.v).setAlpha(0.0f);
            ((View) this.v).setVisibility(4);
        }
    }
}
