package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: g5l  reason: default package */
/* loaded from: classes.dex */
public final class g5l extends AnimatorListenerAdapter {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ View f3672R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ViewPropertyAnimator f3673R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ bbj f3674R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h9X f3675R;
    public final /* synthetic */ int v;

    public g5l(bbj bbj, h9X h9x, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3674R = bbj;
        this.f3675R = h9x;
        this.R = i;
        this.f3672R = view;
        this.v = i2;
        this.f3673R = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.R != 0) {
            this.f3672R.setTranslationX(0.0f);
        }
        if (this.v != 0) {
            this.f3672R.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3673R.setListener(null);
        this.f3674R.c(this.f3675R);
        this.f3674R.x.remove(this.f3675R);
        this.f3674R.x();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3674R.getClass();
    }
}
