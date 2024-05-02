package com.google.android.material.appbar;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class c extends G5 {
    public final /* synthetic */ AppBarLayout.BaseBehavior R;

    public c(AppBarLayout.BaseBehavior baseBehavior) {
        this.R = baseBehavior;
    }

    @Override // defpackage.G5
    public final void e(View view, jG jGVar) {
        ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
        jGVar.m(this.R.v);
        jGVar.L(ScrollView.class.getName());
    }
}
