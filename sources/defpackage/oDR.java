package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: oDR  reason: default package */
/* loaded from: classes.dex */
public final class oDR extends AnimatorListenerAdapter {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ int f6709R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ View f6710R;

    public /* synthetic */ oDR(View view, float f, int i) {
        this.f6709R = i;
        this.f6710R = view;
        this.R = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6709R) {
            case 0:
                this.f6710R.setAlpha(this.R);
                return;
            case 1:
                this.f6710R.setTranslationX(this.R);
                return;
            default:
                this.f6710R.setTranslationY(this.R);
                return;
        }
    }
}
