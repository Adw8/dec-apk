package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.termux.view.TerminalView;

/* renamed from: gcC  reason: default package */
/* loaded from: classes.dex */
public final class gcC implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ InputMethodManager f3801R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TerminalView f3802R;

    public gcC(TerminalView terminalView, TerminalView terminalView2, InputMethodManager inputMethodManager) {
        this.R = terminalView;
        this.f3802R = terminalView2;
        this.f3801R = inputMethodManager;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.R.removeOnAttachStateChangeListener(this);
        this.f3802R.requestFocus();
        this.f3801R.showSoftInput(this.f3802R, 0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
