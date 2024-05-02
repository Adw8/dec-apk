package defpackage;

import android.animation.ValueAnimator;

/* renamed from: oSC  reason: default package */
/* loaded from: classes.dex */
public final class oSC implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ f6m R;

    public oSC(f6m f6m) {
        this.R = f6m;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.R.f3312R.setAlpha(floatValue);
        this.R.f3311R.setAlpha(floatValue);
        this.R.f3313R.invalidate();
    }
}
