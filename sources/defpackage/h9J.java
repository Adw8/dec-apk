package defpackage;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: h9J  reason: default package */
/* loaded from: classes.dex */
public final class h9J implements View.OnTouchListener {
    public final Dialog R;
    public final int X;
    public final int e;

    public h9J(Dialog dialog, Rect rect) {
        this.R = dialog;
        this.e = rect.left;
        this.X = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.e;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.X;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.R.onTouchEvent(obtain);
    }
}
