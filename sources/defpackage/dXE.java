package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: dXE  reason: default package */
/* loaded from: classes.dex */
public final class dXE extends k8G implements f_c {
    public final /* synthetic */ TerminalViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f2657R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWW f2658R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dXE(nWW nww, jy_ jy_, TerminalViewModel terminalViewModel, int i) {
        super(0);
        this.X = i;
        this.f2658R = nww;
        this.f2657R = jy_;
        this.R = terminalViewModel;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                pd2 pd2 = (pd2) this.f2658R.R;
                if (pd2 != null) {
                    pd2.c(null);
                }
                this.f2658R.R = null;
                l6.z(this.f2657R, null, 0, new fyA(this.R, null), 3);
                return;
            default:
                pd2 pd22 = (pd2) this.f2658R.R;
                if (pd22 != null) {
                    pd22.c(null);
                }
                this.f2658R.R = null;
                l6.z(this.f2657R, null, 0, new e4s(this.R, null), 3);
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
