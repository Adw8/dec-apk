package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: e_N  reason: default package */
/* loaded from: classes.dex */
public final class e_N extends k8G implements lR3 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TerminalViewModel f3148R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f3149R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3150R;
    public final /* synthetic */ h0T c;
    public final /* synthetic */ h0T v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public e_N(TerminalViewModel terminalViewModel, h0T h0t, h0T h0t2, boolean z, long j, h0T h0t3) {
        super(3);
        this.f3148R = terminalViewModel;
        this.f3149R = h0t;
        this.v = h0t2;
        this.f3150R = z;
        this.R = j;
        this.c = h0t3;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        w0 w0Var = (w0) obj;
        m88 m88 = (m88) obj2;
        ((Number) obj3).intValue();
        owM owm = lnF.P;
        jr_ jr_ = (jr_) m88;
        bUo buo = (bUo) jr_.x(owm);
        jr_.w(1157296644);
        boolean O = jr_.O(buo);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = new fp8(buo);
            jr_.ZW(I);
        }
        jr_.g(false);
        l6.R(new bkv[]{owm.v((fp8) I)}, aH9.I(m88, 472606133, new eVV(this.f3148R, this.f3149R, this.v, this.f3150R, this.R, this.c)), m88, 56);
        return o8s.R;
    }
}
