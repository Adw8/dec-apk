package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.util.List;

/* renamed from: o9J  reason: default package */
/* loaded from: classes.dex */
public final class o9J extends k8G implements bBk {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TerminalViewModel f6690R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f6691R;
    public final /* synthetic */ dH9 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ h0T f6692v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public o9J(h0T h0t, h0T h0t2, dH9 dh9, dH9 dh92, TerminalViewModel terminalViewModel) {
        super(4);
        this.f6690R = terminalViewModel;
        this.f6691R = h0t;
        this.f6692v = h0t2;
        this.R = dh9;
        this.v = dh92;
    }

    @Override // defpackage.bBk
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        mBF mbf = (mBF) obj;
        int intValue = ((Number) obj2).intValue();
        m88 m88 = (m88) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 112) == 0) {
            intValue2 |= ((jr_) m88).e(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) == 144) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        dH9 dh9 = this.R;
        float f = iqx.R;
        ihm ihm = (ihm) dF.q(intValue, (List) dh9.getValue());
        if (ihm != null) {
            iqx.L(this.f6690R, ihm, (ihm) this.v.getValue(), this.f6691R, this.f6692v, m88, 28232);
        }
        return o8s.R;
    }
}
