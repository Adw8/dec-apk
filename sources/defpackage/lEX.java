package defpackage;

import android.graphics.Typeface;
import android.view.KeyEvent;
import com.termux.terminal.Y;
import com.termux.view.TerminalView;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: lEX  reason: default package */
/* loaded from: classes.dex */
public final class lEX extends k8G implements kg9 {
    public final /* synthetic */ Y R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f5621R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TerminalViewModel f5622R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f5623R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nu_ f5624R;
    public final /* synthetic */ int X;
    public final /* synthetic */ h0T c;
    public final /* synthetic */ h0T e;
    public final /* synthetic */ h0T v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lEX(h0T h0t, int i, Y y, TerminalViewModel terminalViewModel, nu_ nu_, h0T h0t2, h0T h0t3, h0T h0t4, h0T h0t5) {
        super(1);
        this.f5623R = h0t;
        this.X = i;
        this.R = y;
        this.f5622R = terminalViewModel;
        this.f5624R = nu_;
        this.v = h0t2;
        this.c = h0t3;
        this.f5621R = h0t4;
        this.e = h0t5;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        boolean z;
        TerminalView terminalView = (TerminalView) obj;
        this.f5623R.R(terminalView);
        int i = this.X;
        Y y = this.R;
        TerminalViewModel terminalViewModel = this.f5622R;
        nu_ nu_ = this.f5624R;
        h0T h0t = this.v;
        h0T h0t2 = this.c;
        dH9 dh9 = this.f5621R;
        h0T h0t3 = this.e;
        terminalView.setTextSize(i);
        terminalView.setTypeface((Typeface) dh9.getValue());
        int i2 = 0;
        if (y == terminalView.f2426R) {
            z = false;
        } else {
            terminalView.e = 0;
            terminalView.f2426R = y;
            terminalView.f2428R = null;
            terminalView.L = 0;
            terminalView.H();
            terminalView.setVerticalScrollBarEnabled(true);
            z = true;
        }
        if (z) {
            ng ngVar = new ng(terminalViewModel, terminalView, nu_);
            y.f2416R = ngVar;
            gje gje = y.f2413R;
            if (gje != null) {
                gje.f3897R = ngVar;
                gje.z();
                gje.f3908m = true;
            }
        }
        if (((Integer) h0t3.getValue()) != null) {
            int intValue = ((Integer) h0t3.getValue()).intValue();
            if (((Boolean) h0t.getValue()).booleanValue()) {
                i2 = 12288;
            }
            terminalView.onKeyDown(intValue, new KeyEvent(0, 0, 1, intValue, 0, ((Boolean) h0t2.getValue()).booleanValue() ? i2 | 2 | 16 : i2));
            h0t3.R(null);
            Boolean bool = Boolean.FALSE;
            h0t.R(bool);
            h0t2.R(bool);
        }
        return o8s.R;
    }
}
