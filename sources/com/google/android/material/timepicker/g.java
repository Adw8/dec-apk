package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class g extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView R;

    public g(TimePickerView timePickerView) {
        this.R = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.R;
        int i = TimePickerView.x;
        timePickerView.getClass();
        return false;
    }
}
