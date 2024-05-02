package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class Y implements RL {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ CoordinatorLayout f2243R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f2244R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ AppBarLayout f2245R;
    public final /* synthetic */ int e;

    public Y(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f2244R = baseBehavior;
        this.f2243R = coordinatorLayout;
        this.f2245R = appBarLayout;
        this.R = view;
        this.e = i;
    }

    @Override // defpackage.RL
    public final boolean c(View view) {
        this.f2244R.h(this.f2243R, this.f2245R, this.R, this.e, new int[]{0, 0});
        return true;
    }
}
