package defpackage;

import android.animation.ValueAnimator;

/* renamed from: P8  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class P8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kst f383R;

    public /* synthetic */ P8(kst kst, int i) {
        this.R = i;
        this.f383R = kst;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.R) {
            case 0:
                UU uu = (UU) this.f383R;
                uu.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((kst) uu).f5453R.setScaleX(floatValue);
                ((kst) uu).f5453R.setScaleY(floatValue);
                return;
            case 1:
                UU uu2 = (UU) this.f383R;
                uu2.getClass();
                ((kst) uu2).f5453R.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                heD hed = (heD) this.f383R;
                hed.getClass();
                ((kst) hed).f5453R.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
