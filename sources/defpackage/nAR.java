package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: nAR  reason: default package */
/* loaded from: classes.dex */
public final class nAR extends aFk implements iv7 {
    public final /* synthetic */ TerminalViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6336R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f6337R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public nAR(jy_ jy_, TerminalViewModel terminalViewModel, aOO aoo) {
        super(2, aoo);
        this.f6337R = jy_;
        this.R = terminalViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((nAR) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nWW nww = new nWW();
            bLS R = pip.R(0, 0, null, 7);
            jy_ jy_ = this.f6337R;
            TerminalViewModel terminalViewModel = this.R;
            ar arVar = new ar(nww, jy_, terminalViewModel, R, 7);
            dXE dxe = new dXE(nww, jy_, terminalViewModel, 0);
            dXE dxe2 = new dXE(nww, jy_, terminalViewModel, 1);
            azM azm = new azM(jy_, 16, R);
            this.X = 1;
            dgP dgp = iVu.f4622R;
            Object y = ooA.y((ck3) this.f6336R, new iOj(null, dxe, dxe2, arVar, azm), this);
            if (y != obj2) {
                y = o8s.R;
            }
            if (y == obj2) {
                return obj2;
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
        nAR nar = new nAR(this.f6337R, this.R, aoo);
        nar.f6336R = obj;
        return nar;
    }
}
