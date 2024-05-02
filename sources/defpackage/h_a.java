package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: h_a  reason: default package */
/* loaded from: classes.dex */
public final class h_a extends AnimatorListenerAdapter {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4310R;

    public h_a(boolean z, View view) {
        this.f4310R = z;
        this.R = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f4310R) {
            this.R.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f4310R) {
            this.R.setVisibility(0);
        }
    }
}
