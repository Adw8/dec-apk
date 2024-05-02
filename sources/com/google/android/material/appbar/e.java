package com.google.android.material.appbar;

import android.view.View;

/* loaded from: classes.dex */
public final class e implements RL {
    public final /* synthetic */ AppBarLayout R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f2248R;

    public e(AppBarLayout appBarLayout, boolean z) {
        this.R = appBarLayout;
        this.f2248R = z;
    }

    @Override // defpackage.RL
    public final boolean c(View view) {
        this.R.setExpanded(this.f2248R);
        return true;
    }
}
