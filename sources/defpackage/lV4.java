package defpackage;

import android.view.inputmethod.InputMethodManager;
import com.termux.view.TerminalView;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: lV4  reason: default package */
/* loaded from: classes.dex */
public final class lV4 implements mT0 {
    public final /* synthetic */ InputMethodManager R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TerminalView f5758R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TerminalViewModel f5759R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f5760R;
    public final /* synthetic */ h0T v;

    public lV4(TerminalViewModel terminalViewModel, TerminalView terminalView, InputMethodManager inputMethodManager, h0T h0t, h0T h0t2) {
        this.f5759R = terminalViewModel;
        this.f5758R = terminalView;
        this.R = inputMethodManager;
        this.f5760R = h0t;
        this.v = h0t2;
    }

    public final void R(String str) {
        if (str == null) {
            str = "";
        }
        kxm.v("TerminalView", 4, str, null);
    }
}
