package defpackage;

/* renamed from: iQz  reason: default package */
/* loaded from: classes.dex */
public final class iQz extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ aAC R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f4586R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iQz(hRH hrh, h0T h0t, ncu ncu, lR3 lr3, int i, int i2) {
        super(2);
        this.X = 2;
        this.f4586R = hrh;
        this.c = h0t;
        this.v = ncu;
        this.R = lr3;
        this.O = i;
        this.L = i2;
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
            case 3:
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
                n1P.R((cRR) this.f4586R, (ncu) this.v, (gL6) this.c, (iv7) this.R, m88, this.O | 1, this.L);
                return;
            case 1:
                o02.c((E2) this.f4586R, (eG1) this.v, (c_P) this.c, (iv7) this.R, m88, this.O | 1, this.L);
                return;
            case 2:
                a4b.R((hRH) this.f4586R, (h0T) this.c, (ncu) this.v, (lR3) this.R, m88, this.O | 1, this.L);
                return;
            case 3:
                Gm.R((fDb) this.f4586R, (f_c) this.v, (cvV) this.c, (iv7) this.R, m88, this.O | 1, this.L);
                return;
            default:
                biy.e((kun) this.f4586R, (String) this.v, (lR3) this.c, (lR3) this.R, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iQz(Object obj, Object obj2, Object obj3, aAC aac, int i, int i2, int i3) {
        super(2);
        this.X = i3;
        this.f4586R = obj;
        this.v = obj2;
        this.c = obj3;
        this.R = aac;
        this.O = i;
        this.L = i2;
    }
}
