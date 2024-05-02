package defpackage;

/* renamed from: bBM  reason: default package */
/* loaded from: classes.dex */
public final class bBM extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f1550R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n4N f1551R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f1552R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ngd f1553R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ oey f1554R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f1555R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f1556v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bBM(ncu ncu, oey oey, ngd ngd, boolean z, Object obj, Object obj2, n4N n4n, boolean z2, kg9 kg9, int i, int i2, int i3) {
        super(2);
        this.X = i3;
        this.f1552R = ncu;
        this.f1554R = oey;
        this.f1553R = ngd;
        this.f1555R = z;
        this.R = obj;
        this.v = obj2;
        this.f1551R = n4n;
        this.f1556v = z2;
        this.f1550R = kg9;
        this.O = i;
        this.L = i2;
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
                aH9.H(this.f1552R, this.f1554R, this.f1553R, this.f1555R, (C0) this.R, (vV) this.v, this.f1551R, this.f1556v, this.f1550R, m88, this.O | 1, this.L);
                return;
            default:
                aH9.U(this.f1552R, this.f1554R, this.f1553R, this.f1555R, (h8) this.R, (ky) this.v, this.f1551R, this.f1556v, this.f1550R, m88, this.O | 1, this.L);
                return;
        }
    }
}
