package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: erC  reason: default package */
/* loaded from: classes.dex */
public final class erC extends aFk implements iv7 {
    public final /* synthetic */ TerminalViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f3217R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public erC(TerminalViewModel terminalViewModel, nhg nhg, aOO aoo) {
        super(2, aoo);
        this.R = terminalViewModel;
        this.f3217R = nhg;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((erC) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            aD8 ad8 = this.R.f2791R;
            if (ad8 != null) {
                gRY gry = gRY.UserInput;
                ghL ghl = new ghL(this.f3217R, null);
                this.X = 1;
                if (ad8.R(gry, ghl, this) == bgr) {
                    return bgr;
                }
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new erC(this.R, this.f3217R, aoo);
    }
}
