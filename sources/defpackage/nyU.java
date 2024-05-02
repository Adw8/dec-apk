package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: nyU  reason: default package */
/* loaded from: classes.dex */
public final class nyU extends AnimatorListenerAdapter {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f6644R;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    public /* synthetic */ nyU(Object obj, Object obj2, Object obj3, int i) {
        this.R = i;
        this.c = obj;
        this.v = obj2;
        this.f6644R = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.R) {
            case 0:
                ((eIH) this.v).c((View) this.f6644R);
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
                ((eIH) this.v).R();
                return;
            default:
                ((oyr) this.v).R.z(1.0f);
                j_v.I((View) this.f6644R, (oyr) this.v);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.R) {
            case 0:
                ((eIH) this.v).v();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
