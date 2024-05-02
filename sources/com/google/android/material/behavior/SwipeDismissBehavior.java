package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends knf {

    /* renamed from: R  reason: collision with other field name */
    public fen f2253R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2255R;

    /* renamed from: R  reason: collision with other field name */
    public int f2252R = 2;
    public float R = 0.5f;
    public float v = 0.0f;
    public float c = 0.5f;

    /* renamed from: R  reason: collision with other field name */
    public final nfK f2254R = new nfK(this);

    @Override // defpackage.knf
    public boolean L(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f2255R;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.P(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2255R = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2255R = false;
        }
        if (!z) {
            return false;
        }
        if (this.f2253R == null) {
            this.f2253R = new fen(coordinatorLayout.getContext(), coordinatorLayout, this.f2254R);
        }
        return this.f2253R.y(motionEvent);
    }

    @Override // defpackage.knf
    public final boolean Z(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = of5.f6887R;
        if (mHC.c(view) == 0) {
            mHC.t(view, 1);
            of5.e(view, 1048576);
            of5.c(view, 0);
            if (t(view)) {
                of5.X(view, Ex.Z, new h89(19, this));
            }
        }
        return false;
    }

    public boolean t(View view) {
        return true;
    }

    @Override // defpackage.knf
    public final boolean y(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        fen fen = this.f2253R;
        if (fen == null) {
            return false;
        }
        fen.H(motionEvent);
        return true;
    }
}
