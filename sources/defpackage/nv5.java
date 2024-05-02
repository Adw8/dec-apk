package defpackage;

import android.view.ScaleGestureDetector;
import com.termux.view.TerminalView;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: nv5  reason: default package */
/* loaded from: classes.dex */
public final class nv5 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ evu R;

    public nv5(evu evu) {
        this.R = evu;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        lTo lto = this.R.f3247R;
        scaleGestureDetector.getFocusX();
        scaleGestureDetector.getFocusY();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        TerminalView terminalView = (TerminalView) lto.R;
        if (terminalView.f2428R == null || terminalView.O()) {
            return true;
        }
        TerminalView terminalView2 = (TerminalView) lto.R;
        float f = terminalView2.R * scaleFactor;
        terminalView2.R = f;
        TerminalViewModel terminalViewModel = ((lV4) terminalView2.f2430R).f5759R;
        terminalViewModel.c.H(Float.valueOf(caw.m(((Number) terminalViewModel.c.getValue()).floatValue() * f, 4.5f, 42.0f)));
        terminalView2.R = 1.0f;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }
}
