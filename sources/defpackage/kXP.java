package defpackage;

import android.view.inputmethod.InputMethodManager;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: kXP  reason: default package */
/* loaded from: classes.dex */
public final class kXP extends aFk implements iv7 {
    public final /* synthetic */ InputMethodManager R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TerminalViewModel f5327R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f5328R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5329R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5330R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kXP(boolean z, TerminalViewModel terminalViewModel, h0T h0t, InputMethodManager inputMethodManager, aOO aoo) {
        super(2, aoo);
        this.f5330R = z;
        this.f5327R = terminalViewModel;
        this.f5328R = h0t;
        this.R = inputMethodManager;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((kXP) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f5329R;
        if (!this.f5330R) {
            return o8s.R;
        }
        mxC.y(this.f5327R.f2797R, jy_, new aLH(this.f5328R, 7, this.R));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        kXP kxp = new kXP(this.f5330R, this.f5327R, this.f5328R, this.R, aoo);
        kxp.f5329R = obj;
        return kxp;
    }
}
