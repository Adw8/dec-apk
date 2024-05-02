package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;

/* renamed from: bgV  reason: default package */
/* loaded from: classes.dex */
public final class bgV extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ Object f1765X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bgV(lR3 lr3, lkd lkd, int i, String str, iv7 iv7, mpr mpr) {
        super(2);
        this.X = 2;
        this.f1765X = lr3;
        this.R = lkd;
        this.O = i;
        this.v = str;
        this.c = iv7;
        this.e = mpr;
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
            case 2:
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
                cKA cka = (cKA) this.c;
                jJj jjj = cka.f2061R;
                h0T h0t = cka.f2065v;
                h0T h0t2 = cka.f2060R;
                float f = jyF.R;
                a4b.R((hRH) this.R, (h0T) this.v, adU.H(adU.L((ncu) this.e, 0.0f, jjj.l(((Number) h0t.getValue()).intValue()), 1), jjj.l(((Number) h0t2.getValue()).intValue())), (lR3) this.f1765X, m88, (this.O & 7168) | 48, 0);
                return;
            case 1:
                ((dNH) this.R).e(this.v, this.c, this.e, this.f1765X, m88, this.O | 1);
                return;
            case 2:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                c3.R(aH9.I(m88, 1366615805, new cMF((String) this.v, this.O, 3)), null, aH9.I(m88, -339513797, new _a((iv7) this.c, this.O, (mpr) this.e)), (lR3) this.f1765X, null, null, (lPv) this.R, m88, (this.O & 7168) | 390, 50);
                return;
            default:
                iqx.L((TerminalViewModel) this.R, (ihm) this.c, (ihm) this.e, (h0T) this.v, (h0T) this.f1765X, m88, this.O | 1);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bgV(TerminalViewModel terminalViewModel, ihm ihm, ihm ihm2, h0T h0t, h0T h0t2, int i) {
        super(2);
        this.X = 3;
        this.R = terminalViewModel;
        this.c = ihm;
        this.e = ihm2;
        this.v = h0t;
        this.f1765X = h0t2;
        this.O = i;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bgV(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f1765X = obj5;
        this.O = i;
    }
}
