package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.termux.view.TerminalView;

/* renamed from: j4D  reason: default package */
/* loaded from: classes.dex */
public final class j4D extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ evu R;

    public j4D(evu evu) {
        this.R = evu;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        lTo lto = this.R.f3247R;
        motionEvent.getX();
        motionEvent.getY();
        lto.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        lTo lto = this.R.f3247R;
        TerminalView terminalView = (TerminalView) lto.R;
        if (terminalView.f2428R == null || !terminalView.f2424R.isFinished()) {
            return true;
        }
        boolean N = ((TerminalView) lto.R).f2428R.N();
        if (N) {
            TerminalView terminalView2 = (TerminalView) lto.R;
            int i = terminalView2.f2428R.c;
            terminalView2.f2424R.fling(0, 0, 0, -((int) (f2 * 0.25f)), 0, 0, (-i) / 2, i / 2);
        } else {
            TerminalView terminalView3 = (TerminalView) lto.R;
            terminalView3.f2424R.fling(0, terminalView3.e, 0, -((int) (f2 * 0.25f)), 0, 0, -terminalView3.f2428R.f3905c.e, 0);
        }
        ((TerminalView) lto.R).post(new nS_(lto, N, motionEvent2));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        lTo lto = this.R.f3247R;
        if (!((TerminalView) lto.R).f2427R.f3246R.isInProgress()) {
            ((TerminalView) lto.R).f2430R.getClass();
            if (!((TerminalView) lto.R).O()) {
                ((TerminalView) lto.R).performHapticFeedback(0);
                TerminalView terminalView = (TerminalView) lto.R;
                if (terminalView.requestFocus()) {
                    c8A textSelectionCursorController = terminalView.getTextSelectionCursorController();
                    int[] c = textSelectionCursorController.f1973R.c(motionEvent, true);
                    int i = c[0];
                    textSelectionCursorController.O = i;
                    textSelectionCursorController.X = i;
                    int i2 = c[1];
                    textSelectionCursorController.Z = i2;
                    textSelectionCursorController.L = i2;
                    idE ide = textSelectionCursorController.f1973R.f2428R.f3905c;
                    if (!" ".equals(ide.L(i, i2, i, i2))) {
                        while (true) {
                            int i3 = textSelectionCursorController.X;
                            if (i3 <= 0) {
                                break;
                            }
                            int i4 = i3 - 1;
                            int i5 = textSelectionCursorController.L;
                            if ("".equals(ide.L(i4, i5, i4, i5))) {
                                break;
                            }
                            textSelectionCursorController.X--;
                        }
                        while (true) {
                            int i6 = textSelectionCursorController.O;
                            if (i6 >= textSelectionCursorController.f1973R.f2428R.e - 1) {
                                break;
                            }
                            int i7 = i6 + 1;
                            int i8 = textSelectionCursorController.L;
                            if ("".equals(ide.L(i7, i8, i7, i8))) {
                                break;
                            }
                            textSelectionCursorController.O++;
                        }
                    }
                    textSelectionCursorController.f1975R.c(textSelectionCursorController.X, textSelectionCursorController.L, true);
                    textSelectionCursorController.v.c(textSelectionCursorController.O + 1, textSelectionCursorController.Z, true);
                    textSelectionCursorController.f1972R = textSelectionCursorController.f1973R.startActionMode(new mop(textSelectionCursorController, new biC(textSelectionCursorController)), 1);
                    textSelectionCursorController.R = System.currentTimeMillis();
                    textSelectionCursorController.f1976R = true;
                    mT0 mt0 = terminalView.f2430R;
                    terminalView.O();
                    mt0.getClass();
                    terminalView.invalidate();
                }
            }
        }
        this.R.f3248R = true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        lTo lto = this.R.f3247R;
        gje gje = ((TerminalView) lto.R).f2428R;
        if (gje != null) {
            if (!gje.N() || !motionEvent2.isFromSource(8194)) {
                lto.f5744R = true;
                TerminalView terminalView = (TerminalView) lto.R;
                float f3 = f2 + terminalView.f2434v;
                int i = terminalView.f2431R.v;
                int i2 = (int) (f3 / ((float) i));
                terminalView.f2434v = f3 - ((float) (i * i2));
                terminalView.v(motionEvent2, i2);
            } else {
                ((TerminalView) lto.R).Z(motionEvent2, 32, true);
            }
        }
        return true;
    }
}
