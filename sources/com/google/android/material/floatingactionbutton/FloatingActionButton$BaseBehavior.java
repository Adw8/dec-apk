package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends knf {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // defpackage.knf
    public final boolean R(View view) {
        jQ.h(view);
        throw null;
    }

    @Override // defpackage.knf
    public final boolean Z(CoordinatorLayout coordinatorLayout, View view, int i) {
        jQ.h(view);
        throw null;
    }

    @Override // defpackage.knf
    public final void c(aRL arl) {
        if (arl.O == 0) {
            arl.O = 80;
        }
    }

    @Override // defpackage.knf
    public final boolean e(View view, View view2) {
        jQ.h(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hDC.g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
