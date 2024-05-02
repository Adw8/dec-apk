package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: dP9  reason: default package */
/* loaded from: classes.dex */
public final class dP9 extends AnimatorListenerAdapter {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ View f2601R;
    public final /* synthetic */ float v;

    public dP9(View view, float f, float f2) {
        this.f2601R = view;
        this.R = f;
        this.v = f2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2601R.setScaleX(this.R);
        this.f2601R.setScaleY(this.v);
    }
}
