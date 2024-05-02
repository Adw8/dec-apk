package defpackage;

import android.graphics.Typeface;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: ciP  reason: default package */
/* loaded from: classes.dex */
public final class ciP extends aFk implements iv7 {
    public final /* synthetic */ TerminalViewModel R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ciP(TerminalViewModel terminalViewModel, aOO aoo) {
        super(2, aoo);
        this.R = terminalViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((ciP) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        TerminalViewModel terminalViewModel = this.R;
        terminalViewModel.X.H(Typeface.createFromAsset(terminalViewModel.f2793R.getAssets(), "fonts/CascadiaCode-Regular.otf"));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new ciP(this.R, aoo);
    }
}
