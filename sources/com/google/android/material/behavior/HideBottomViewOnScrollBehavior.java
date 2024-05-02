package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends knf {

    /* renamed from: R  reason: collision with other field name */
    public ViewPropertyAnimator f2250R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f2251R = new LinkedHashSet();
    public int R = 0;
    public int v = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.knf
    public final void U(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        boolean z = false;
        if (i > 0) {
            if (!(this.v == 1)) {
                ViewPropertyAnimator viewPropertyAnimator = this.f2250R;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.v = 1;
                Iterator it = this.f2251R.iterator();
                while (it.hasNext()) {
                    ((mN1) it.next()).R();
                }
                t(view, this.R + 0, 175, My.R);
            }
        } else if (i < 0) {
            if (this.v == 2) {
                z = true;
            }
            if (!z) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f2250R;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.v = 2;
                Iterator it2 = this.f2251R.iterator();
                while (it2.hasNext()) {
                    ((mN1) it2.next()).R();
                }
                t(view, 0, 225, My.f299R);
            }
        }
    }

    @Override // defpackage.knf
    public boolean Z(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.R = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // defpackage.knf
    public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void t(View view, int i, long j, hBK hbk) {
        this.f2250R = view.animate().translationY((float) i).setInterpolator(hbk).setDuration(j).setListener(new XM(3, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}
