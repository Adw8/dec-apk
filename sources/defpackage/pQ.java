package defpackage;

/* renamed from: pQ  reason: default package */
/* loaded from: classes.dex */
public final class pQ extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ a1 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ eIr f7077R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iuk f7078R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f7079R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kMk f7080R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f7081R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f7082R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f7083R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f7084R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f7085R;
    public final /* synthetic */ int X = 1;
    public final /* synthetic */ int Z;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ kg9 f7086v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f7087v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pQ(d5M d5m, kg9 kg9, ncu ncu, kMk kmk, iuk iuk, kg9 kg92, p2E p2e, a1 a1Var, boolean z, int i, djV djv, eIr eir, boolean z2, boolean z3, lR3 lr3, int i2, int i3, int i4) {
        super(2);
        this.f7079R = d5m;
        this.f7081R = kg9;
        this.f7083R = ncu;
        this.f7080R = kmk;
        this.f7078R = iuk;
        this.f7086v = kg92;
        this.f7084R = p2e;
        this.R = a1Var;
        this.f7085R = z;
        this.O = i;
        this.v = djv;
        this.f7077R = eir;
        this.f7087v = z2;
        this.c = z3;
        this.f7082R = lr3;
        this.L = i2;
        this.Z = i3;
        this.m = i4;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
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
                gQc.R((String) this.f7079R, this.f7081R, this.f7083R, this.f7085R, this.f7087v, this.f7080R, (abA) this.v, this.f7077R, this.c, this.O, this.f7078R, this.f7086v, this.f7084R, this.R, this.f7082R, m88, this.L | 1, this.Z, this.m);
                return;
            default:
                dTl.X((d5M) this.f7079R, this.f7081R, this.f7083R, this.f7080R, this.f7078R, this.f7086v, this.f7084R, this.R, this.f7085R, this.O, (djV) this.v, this.f7077R, this.f7087v, this.c, this.f7082R, m88, this.L | 1, this.Z, this.m);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pQ(String str, kg9 kg9, ncu ncu, boolean z, boolean z2, kMk kmk, abA aba, eIr eir, boolean z3, int i, iuk iuk, kg9 kg92, p2E p2e, a1 a1Var, lR3 lr3, int i2, int i3, int i4) {
        super(2);
        this.f7079R = str;
        this.f7081R = kg9;
        this.f7083R = ncu;
        this.f7085R = z;
        this.f7087v = z2;
        this.f7080R = kmk;
        this.v = aba;
        this.f7077R = eir;
        this.c = z3;
        this.O = i;
        this.f7078R = iuk;
        this.f7086v = kg92;
        this.f7084R = p2e;
        this.R = a1Var;
        this.f7082R = lr3;
        this.L = i2;
        this.Z = i3;
        this.m = i4;
    }
}
