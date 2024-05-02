package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: iEh  reason: default package */
/* loaded from: classes.dex */
public final class iEh extends aFk implements iv7 {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TerminalViewModel f4505R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4506R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iEh(TerminalViewModel terminalViewModel, dH9 dh9, aOO aoo) {
        super(2, aoo);
        this.f4505R = terminalViewModel;
        this.R = dh9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((iEh) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f4506R;
        TerminalViewModel terminalViewModel = this.f4505R;
        if (terminalViewModel.f2791R == null) {
            return o8s.R;
        }
        mxC.y(l6.l(new bBd(6, terminalViewModel)), jy_, new aLH(this.f4505R, 8, this.R));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        iEh ieh = new iEh(this.f4505R, this.R, aoo);
        ieh.f4506R = obj;
        return ieh;
    }
}
