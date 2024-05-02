package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: eVV  reason: default package */
/* loaded from: classes.dex */
public final class eVV extends k8G implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TerminalViewModel f3125R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f3126R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3127R;
    public final /* synthetic */ h0T c;
    public final /* synthetic */ h0T v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eVV(TerminalViewModel terminalViewModel, h0T h0t, h0T h0t2, boolean z, long j, h0T h0t3) {
        super(2);
        this.f3125R = terminalViewModel;
        this.f3126R = h0t;
        this.v = h0t2;
        this.f3127R = z;
        this.R = j;
        this.c = h0t3;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        m88 m88 = (m88) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        TerminalViewModel terminalViewModel = this.f3125R;
        h0T h0t = this.f3126R;
        h0T h0t2 = this.v;
        boolean z = this.f3127R;
        h0T h0t3 = this.c;
        float f = iqx.R;
        iqx.Z(terminalViewModel, h0t, h0t2, z, ((Boolean) h0t3.getValue()).booleanValue(), this.R, m88, 440);
        return o8s.R;
    }
}
