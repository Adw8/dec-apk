package defpackage;

/* renamed from: gJ  reason: default package */
/* loaded from: classes.dex */
public final class gJ extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ aAC R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f3721R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3722R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f3723R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3724R;
    public final /* synthetic */ int X = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ iv7 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ Object f3725v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gJ(iv7 iv7, f_c f_c, ncu ncu, iv7 iv72, iv7 iv73, boolean z, miv miv, ngd ngd, p2E p2e, int i, int i2) {
        super(2);
        this.f3721R = iv7;
        this.R = f_c;
        this.f3723R = ncu;
        this.v = iv72;
        this.f3722R = iv73;
        this.f3724R = z;
        this.f3725v = miv;
        this.c = ngd;
        this.e = p2e;
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
                aH9.m(this.f3721R, (f_c) this.R, this.f3723R, this.v, (iv7) this.f3722R, this.f3724R, (miv) this.f3725v, (ngd) this.c, (p2E) this.e, m88, this.O | 1, this.L);
                return;
            default:
                c3.v(this.f3723R, this.f3721R, (kMk) this.f3722R, this.f3724R, this.v, (lR3) this.R, (iUy) this.f3725v, (fQ2) this.c, (lPv) this.e, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gJ(ncu ncu, iv7 iv7, kMk kmk, boolean z, iv7 iv72, lR3 lr3, iUy iuy, fQ2 fq2, lPv lpv, int i, int i2) {
        super(2);
        this.f3723R = ncu;
        this.f3721R = iv7;
        this.f3722R = kmk;
        this.f3724R = z;
        this.v = iv72;
        this.R = lr3;
        this.f3725v = iuy;
        this.c = fq2;
        this.e = lpv;
        this.O = i;
        this.L = i2;
    }
}
