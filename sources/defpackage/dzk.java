package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: dzk  reason: default package */
/* loaded from: classes.dex */
public final class dzk implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector R;

    public dzk(GestureDetector gestureDetector) {
        this.R = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.R.onTouchEvent(motionEvent);
        }
        return false;
    }
}
