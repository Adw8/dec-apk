package defpackage;

import com.termux.view.TerminalView;

/* renamed from: j3x  reason: default package */
/* loaded from: classes.dex */
public final class j3x implements Runnable {
    public final /* synthetic */ TerminalView R;

    public j3x(TerminalView terminalView) {
        this.R = terminalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.R.getTextSelectionActionMode() != null) {
            this.R.getTextSelectionActionMode().hide(0);
        }
    }
}
