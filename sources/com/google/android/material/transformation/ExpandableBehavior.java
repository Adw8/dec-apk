package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends knf {
    public int R = 0;

    public ExpandableBehavior() {
    }

    @Override // defpackage.knf
    public final boolean Z(CoordinatorLayout coordinatorLayout, View view, int i) {
        fdL fdl;
        int i2;
        WeakHashMap weakHashMap = of5.f6887R;
        if (!d6y.c(view)) {
            ArrayList x = coordinatorLayout.x(view);
            int size = x.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    fdl = null;
                    break;
                }
                View view2 = (View) x.get(i3);
                if (v(view, view2)) {
                    fdl = (fdL) view2;
                    break;
                }
                i3++;
            }
            if (fdl != null) {
                int i4 = 2;
                if (!fdl.R() ? this.R == 1 : (i2 = this.R) == 0 || i2 == 2) {
                    if (fdl.R()) {
                        i4 = 1;
                    }
                    this.R = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new kxU(this, view, i4, fdl));
                }
            }
        }
        return false;
    }

    @Override // defpackage.knf
    public final boolean e(View view, View view2) {
        int i;
        fdL fdl = (fdL) view2;
        int i2 = 2;
        if (!(!fdl.R() ? this.R == 1 : (i = this.R) == 0 || i == 2)) {
            return false;
        }
        if (fdl.R()) {
            i2 = 1;
        }
        this.R = i2;
        t((View) fdl, view, fdl.R(), true);
        return true;
    }

    public abstract void t(View view, View view2, boolean z, boolean z2);

    @Override // defpackage.knf
    public abstract boolean v(View view, View view2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}
