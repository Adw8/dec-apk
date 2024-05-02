package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f2246R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ AppBarLayout f2247R;

    public d(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f2246R = baseBehavior;
        this.R = coordinatorLayout;
        this.f2247R = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2246R.K(this.R, this.f2247R, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
