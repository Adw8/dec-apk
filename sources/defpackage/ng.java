package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.termux.terminal.Y;
import com.termux.view.TerminalView;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: ng  reason: default package */
/* loaded from: classes.dex */
public final class ng extends cpc {
    public final ClipboardManager R;

    /* renamed from: R  reason: collision with other field name */
    public final TerminalView f6500R;

    /* renamed from: R  reason: collision with other field name */
    public final TerminalViewModel f6501R;

    /* renamed from: R  reason: collision with other field name */
    public final nu_ f6502R;

    public ng(TerminalViewModel terminalViewModel, TerminalView terminalView, nu_ nu_) {
        this.f6501R = terminalViewModel;
        this.f6500R = terminalView;
        this.f6502R = nu_;
        Context context = terminalView.getContext();
        Object obj = C1.R;
        this.R = (ClipboardManager) dmD.v(context, ClipboardManager.class);
    }

    @Override // defpackage.nAq
    public final void L() {
        if (this.f6502R.O().f5900R.R(iMP.STARTED)) {
            this.f6500R.L();
        }
    }

    @Override // defpackage.nAq
    public final void O() {
        this.f6500R.performHapticFeedback(17);
    }

    @Override // defpackage.nAq
    public final Integer R() {
        return 0;
    }

    @Override // defpackage.nAq
    public final void X() {
        ClipData primaryClip = this.R.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            boolean z = false;
            CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f6500R.getContext());
            if (coerceToText != null) {
                if (coerceToText.length() > 0) {
                    z = true;
                }
                if (z) {
                    this.f6500R.f2428R.y(coerceToText.toString());
                }
            }
        }
    }

    @Override // defpackage.nAq
    public final void Z() {
    }

    @Override // defpackage.nAq
    public final void c(Y y) {
        gje gje = y.f2413R;
        String str = gje == null ? null : gje.f3893R;
        if (str != null) {
            this.f6501R.f2799R.c(y.f2415R, str);
        }
    }

    @Override // defpackage.nAq
    public final void e(boolean z) {
        if (this.f6502R.O().f5900R.R(iMP.STARTED)) {
            TerminalView terminalView = this.f6500R;
            synchronized (terminalView) {
                gje gje = terminalView.f2428R;
                if (gje != null) {
                    gje.f3904Z = false;
                    if (!z) {
                    }
                }
            }
        }
    }

    @Override // defpackage.nAq
    public final void m(String str) {
        if (str != null) {
            this.R.setPrimaryClip(ClipData.newPlainText("text", str));
        }
    }

    @Override // defpackage.nAq
    public final void v(Y y) {
        l6.z(gQc.Q(this.f6502R), null, 0, new cs(this, y, null), 3);
    }

    @Override // defpackage.nAq
    public final void x() {
    }
}
