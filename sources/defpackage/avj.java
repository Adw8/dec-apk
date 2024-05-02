package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.termux.view.TerminalView;

/* renamed from: avj  reason: default package */
/* loaded from: classes.dex */
public final class avj implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ evu R;

    public avj(evu evu) {
        this.R = evu;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.R.f3247R.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        lTo lto = this.R.f3247R;
        TerminalView terminalView = (TerminalView) lto.R;
        if (terminalView.f2428R == null) {
            return true;
        }
        if (terminalView.O()) {
            ((TerminalView) lto.R).m();
            return true;
        }
        ((TerminalView) lto.R).requestFocus();
        lV4 lv4 = (lV4) ((TerminalView) lto.R).f2430R;
        if (lv4.f5758R.f2428R.N()) {
            return true;
        }
        lv4.f5758R.requestFocus();
        lv4.R.showSoftInput(lv4.f5758R, 0);
        return true;
    }
}
