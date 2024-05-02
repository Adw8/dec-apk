package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final h89 R = new h89(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.knf
    public final boolean L(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.R.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (piu.v == null) {
                    piu.v = new piu(8);
                }
                piu piu = piu.v;
                synchronized (piu.f7202R) {
                    jQ.Y(piu.c);
                }
            }
        } else if (coordinatorLayout.P(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (piu.v == null) {
                piu.v = new piu(8);
            }
            piu piu2 = piu.v;
            synchronized (piu2.f7202R) {
                jQ.Y(piu2.c);
            }
        }
        return super.L(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean t(View view) {
        this.R.getClass();
        return view instanceof o0;
    }
}
