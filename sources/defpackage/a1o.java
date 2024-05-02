package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: a1o  reason: default package */
/* loaded from: classes.dex */
public final class a1o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ View f717R;
    public final /* synthetic */ float c;
    public final /* synthetic */ float e;
    public final /* synthetic */ float v;

    public a1o(View view, float f, float f2, float f3, float f4) {
        this.f717R = view;
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f717R;
        float f = this.R;
        float f2 = this.v;
        float f3 = this.c;
        float f4 = this.e;
        int i = otP.R;
        if (floatValue >= f3) {
            f = floatValue > f4 ? f2 : jQ.v(f2, f, (floatValue - f3) / (f4 - f3), f);
        }
        view.setAlpha(f);
    }
}
