package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.termux.view.TerminalView;

/* renamed from: evu  reason: default package */
/* loaded from: classes.dex */
public final class evu {
    public final GestureDetector R;

    /* renamed from: R  reason: collision with other field name */
    public final ScaleGestureDetector f3246R;

    /* renamed from: R  reason: collision with other field name */
    public final lTo f3247R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3248R;

    public evu(Context context, lTo lto) {
        this.f3247R = lto;
        GestureDetector gestureDetector = new GestureDetector(context, new j4D(this), null, true);
        this.R = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new avj(this));
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new nv5(this));
        this.f3246R = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    public final void R(MotionEvent motionEvent) {
        this.R.onTouchEvent(motionEvent);
        this.f3246R.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3248R = false;
        } else if (action == 1 && !this.f3248R) {
            lTo lto = this.f3247R;
            TerminalView terminalView = (TerminalView) lto.R;
            terminalView.f2434v = 0.0f;
            gje gje = terminalView.f2428R;
            if (gje == null || !gje.N() || motionEvent.isFromSource(8194) || ((TerminalView) lto.R).O() || lto.f5744R) {
                lto.f5744R = false;
                return;
            }
            ((TerminalView) lto.R).Z(motionEvent, 0, true);
            ((TerminalView) lto.R).Z(motionEvent, 0, false);
        }
    }
}
