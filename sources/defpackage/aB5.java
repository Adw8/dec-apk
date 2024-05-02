package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.util.List;

/* renamed from: aB5  reason: default package */
/* loaded from: classes.dex */
public final class aB5 extends k8G implements iv7 {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TerminalViewModel f775R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f776R;
    public final /* synthetic */ dH9 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ h0T f777v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aB5(h0T h0t, h0T h0t2, h0T h0t3, h0T h0t4, TerminalViewModel terminalViewModel) {
        super(2);
        this.f775R = terminalViewModel;
        this.R = h0t3;
        this.v = h0t4;
        this.f776R = h0t;
        this.f777v = h0t2;
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
        if ((!((List) this.R.getValue()).isEmpty()) && ((ihm) this.v.getValue()) != null) {
            int size = ((List) this.R.getValue()).size();
            aD8 ad8 = this.f775R.f2791R;
            float f = (float) 48;
            dH9 dh9 = this.R;
            jr_ jr_2 = (jr_) m88;
            jr_2.w(1157296644);
            boolean O = jr_2.O(dh9);
            Object I = jr_2.I();
            if (O || I == ppN.R) {
                I = new jb4(dh9, 7);
                jr_2.ZW(I);
            }
            jr_2.g(false);
            gQc.e(size, null, ad8, false, f, null, null, null, (kg9) I, false, aH9.I(jr_2, -1302822525, new o9J(this.f776R, this.f777v, this.R, this.v, this.f775R)), jr_2, 24576, 6, 746);
        }
        return o8s.R;
    }
}
