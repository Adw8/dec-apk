package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: e0h  reason: default package */
/* loaded from: classes.dex */
public final class e0h extends aFk implements iv7 {
    public final /* synthetic */ TerminalViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f2935R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2936R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f2937R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public e0h(boolean z, TerminalViewModel terminalViewModel, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.f2937R = z;
        this.R = terminalViewModel;
        this.f2935R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((e0h) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f2936R;
        if (!this.f2937R) {
            return o8s.R;
        }
        mxC.y(this.R.f2794R, jy_, new tD(this.f2935R, 2));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        e0h e0h = new e0h(this.f2937R, this.R, this.f2935R, aoo);
        e0h.f2936R = obj;
        return e0h;
    }
}
