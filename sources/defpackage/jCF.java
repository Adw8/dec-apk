package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalFragment;

/* renamed from: jCF  reason: default package */
/* loaded from: classes.dex */
public final class jCF extends aFk implements iv7 {
    public final /* synthetic */ TerminalFragment R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4855R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jCF(TerminalFragment terminalFragment, aOO aoo) {
        super(2, aoo);
        this.R = terminalFragment;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((jCF) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f4855R;
        TerminalFragment terminalFragment = this.R;
        int i = TerminalFragment.x;
        mxC.y(terminalFragment.a().v, jy_, new dPy(this.R, 0));
        mxC.y(this.R.a().f2796R, jy_, new dPy(this.R, 1));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        jCF jcf = new jCF(this.R, aoo);
        jcf.f4855R = obj;
        return jcf;
    }
}
