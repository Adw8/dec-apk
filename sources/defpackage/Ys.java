package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: Ys  reason: default package */
/* loaded from: classes.dex */
public final class Ys extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f642R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f643R;
    public final /* synthetic */ int X = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f644v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Ys(long j, boolean z, bSG bsg, boolean z2, ncu ncu, iv7 iv7, int i) {
        super(2);
        this.R = j;
        this.f643R = z;
        this.f642R = bsg;
        this.f644v = z2;
        this.v = ncu;
        this.c = iv7;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 1:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                if (((iv7) this.c) == null) {
                    jr_ jr_2 = (jr_) m88;
                    jr_2.w(386443790);
                    ncu ncu = (ncu) this.v;
                    Boolean valueOf = Boolean.valueOf(this.f643R);
                    aWo awo = new aWo(this.R);
                    boolean z = this.f643R;
                    long j = this.R;
                    jr_2.w(511388516);
                    boolean O = jr_2.O(valueOf) | jr_2.O(awo);
                    Object I = jr_2.I();
                    if (O || I == ppN.R) {
                        I = new UL(j, z);
                        jr_2.ZW(I);
                    }
                    jr_2.g(false);
                    boolean z2 = this.f644v;
                    int i2 = this.O;
                    g4x.v(cU5.N(ncu, false, (kg9) I), this.f643R, (bSG) this.f642R, z2, m88, (i2 & 112) | (i2 & 896) | (i2 & 7168));
                    jr_2.g(false);
                    return;
                }
                jr_ jr_3 = (jr_) m88;
                jr_3.w(386444465);
                ((iv7) this.c).J(m88, Integer.valueOf((this.O >> 15) & 14));
                jr_3.g(false);
                return;
            case 1:
                g4x.Z(this.R, this.f643R, (bSG) this.f642R, this.f644v, (ncu) this.v, (iv7) this.c, m88, this.O | 1);
                return;
            default:
                iqx.Z((TerminalViewModel) this.c, (h0T) this.v, (h0T) this.f642R, this.f643R, this.f644v, this.R, m88, this.O | 1);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Ys(iv7 iv7, ncu ncu, boolean z, long j, int i, bSG bsg, boolean z2) {
        super(2);
        this.c = iv7;
        this.v = ncu;
        this.f643R = z;
        this.R = j;
        this.O = i;
        this.f642R = bsg;
        this.f644v = z2;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Ys(TerminalViewModel terminalViewModel, h0T h0t, h0T h0t2, boolean z, boolean z2, long j, int i) {
        super(2);
        this.c = terminalViewModel;
        this.v = h0t;
        this.f642R = h0t2;
        this.f643R = z;
        this.f644v = z2;
        this.R = j;
        this.O = i;
    }
}
