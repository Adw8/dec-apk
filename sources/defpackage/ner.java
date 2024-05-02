package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: ner  reason: default package */
/* loaded from: classes.dex */
public final class ner extends AnimatorListenerAdapter {

    /* renamed from: R  reason: collision with other field name */
    public final Object f6496R;
    public final /* synthetic */ int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6497R = false;

    public ner(View view) {
        this.f6496R = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.R) {
            case 0:
                this.f6497R = true;
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
                if (this.f6497R) {
                    this.f6497R = false;
                    return;
                } else if (((Float) ((f6m) this.f6496R).f3310R.getAnimatedValue()).floatValue() == 0.0f) {
                    f6m f6m = (f6m) this.f6496R;
                    f6m.P = 0;
                    f6m.X(0);
                    return;
                } else {
                    f6m f6m2 = (f6m) this.f6496R;
                    f6m2.P = 2;
                    f6m2.f3313R.invalidate();
                    return;
                }
            default:
                mZP mzp = kkY.R;
                ((View) this.f6496R).setTransitionAlpha(1.0f);
                if (this.f6497R) {
                    ((View) this.f6496R).setLayerType(0, null);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.R) {
            case 1:
                WeakHashMap weakHashMap = of5.f6887R;
                if (mHC.Z((View) this.f6496R) && ((View) this.f6496R).getLayerType() == 0) {
                    this.f6497R = true;
                    ((View) this.f6496R).setLayerType(2, null);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ner(f6m f6m) {
        this.f6496R = f6m;
    }
}
