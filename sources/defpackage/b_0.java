package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b_0  reason: default package */
/* loaded from: classes.dex */
public final class b_0 implements lx3 {
    public static ValueAnimator c(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a1o(view, f, f2, f3, f4));
        ofFloat.addListener(new oDR(view, f5, 0));
        return ofFloat;
    }

    @Override // defpackage.lx3
    public final Animator R(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.35f, 1.0f, alpha);
    }

    @Override // defpackage.lx3
    public final Animator v(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, 0.35f, alpha);
    }
}
