package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView R;

    public c(ClockFaceView clockFaceView) {
        this.R = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.R.isShown()) {
            return true;
        }
        this.R.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.R;
        int height = ((this.R.getHeight() / 2) - clockFaceView.f2392R.e) - clockFaceView.H;
        if (height != clockFaceView.x) {
            clockFaceView.x = height;
            clockFaceView.C();
            ClockHandView clockHandView = clockFaceView.f2392R;
            clockHandView.O = clockFaceView.x;
            clockHandView.invalidate();
        }
        return true;
    }
}
