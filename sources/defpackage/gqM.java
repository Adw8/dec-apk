package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: gqM  reason: default package */
/* loaded from: classes.dex */
public final class gqM extends AnimatorListenerAdapter {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ View f3956R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ViewPropertyAnimator f3957R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ bbj f3958R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lh7 f3959R;

    public /* synthetic */ gqM(bbj bbj, lh7 lh7, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.R = i;
        this.f3958R = bbj;
        this.f3959R = lh7;
        this.f3957R = viewPropertyAnimator;
        this.f3956R = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.R) {
            case 0:
                this.f3957R.setListener(null);
                this.f3956R.setAlpha(1.0f);
                this.f3956R.setTranslationX(0.0f);
                this.f3956R.setTranslationY(0.0f);
                this.f3958R.c(this.f3959R.f5801R);
                this.f3958R.U.remove(this.f3959R.f5801R);
                this.f3958R.x();
                return;
            default:
                this.f3957R.setListener(null);
                this.f3956R.setAlpha(1.0f);
                this.f3956R.setTranslationX(0.0f);
                this.f3956R.setTranslationY(0.0f);
                this.f3958R.c(this.f3959R.f5802v);
                this.f3958R.U.remove(this.f3959R.f5802v);
                this.f3958R.x();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.R) {
            case 0:
                bbj bbj = this.f3958R;
                h9X h9x = this.f3959R.f5801R;
                bbj.getClass();
                return;
            default:
                bbj bbj2 = this.f3958R;
                h9X h9x2 = this.f3959R.f5802v;
                bbj2.getClass();
                return;
        }
    }
}
