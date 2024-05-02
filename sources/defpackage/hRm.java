package defpackage;

/* renamed from: hRm  reason: default package */
/* loaded from: classes.dex */
public final class hRm extends k8G implements iv7 {
    public final /* synthetic */ int L;

    /* renamed from: L  reason: collision with other field name */
    public final /* synthetic */ iv7 f4245L;
    public final /* synthetic */ int O;

    /* renamed from: O  reason: collision with other field name */
    public final /* synthetic */ iv7 f4246O;
    public final /* synthetic */ fVb R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iuk f4247R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f4248R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f4249R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f4250R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f4251R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ngd f4252R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4253R;
    public final /* synthetic */ int X = 1;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ iv7 f4254X;
    public final /* synthetic */ int Z;
    public final /* synthetic */ iv7 c;

    /* renamed from: c  reason: collision with other field name */
    public final /* synthetic */ boolean f4255c;
    public final /* synthetic */ iv7 e;
    public final /* synthetic */ iv7 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f4256v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hRm(mIy miy, String str, iv7 iv7, boolean z, boolean z2, iuk iuk, j4B j4b, boolean z3, iv7 iv72, iv7 iv73, iv7 iv74, iv7 iv75, iv7 iv76, fVb fvb, ngd ngd, iv7 iv77, int i, int i2, int i3) {
        super(2);
        this.f4250R = miy;
        this.f4251R = str;
        this.f4248R = iv7;
        this.f4253R = z;
        this.f4256v = z2;
        this.f4247R = iuk;
        this.f4249R = j4b;
        this.f4255c = z3;
        this.v = iv72;
        this.c = iv73;
        this.e = iv74;
        this.f4254X = iv75;
        this.f4246O = iv76;
        this.R = fvb;
        this.f4252R = ngd;
        this.f4245L = iv77;
        this.O = i;
        this.L = i2;
        this.Z = i3;
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
                ((mIy) this.f4250R).c(this.f4251R, this.f4248R, this.f4253R, this.f4256v, this.f4247R, this.f4249R, this.f4255c, this.v, this.c, this.e, this.f4254X, this.f4246O, this.R, this.f4252R, this.f4245L, m88, this.O | 1, this.L, this.Z);
                return;
            default:
                c5p.R((att) this.f4250R, this.f4251R, this.f4248R, this.f4247R, this.v, this.c, this.e, this.f4254X, this.f4246O, this.f4253R, this.f4256v, this.f4255c, this.f4249R, this.f4252R, this.R, this.f4245L, m88, this.O | 1, this.L, this.Z);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hRm(att att, String str, iv7 iv7, iuk iuk, iv7 iv72, iv7 iv73, iv7 iv74, iv7 iv75, iv7 iv76, boolean z, boolean z2, boolean z3, j4B j4b, ngd ngd, fVb fvb, iv7 iv77, int i, int i2, int i3) {
        super(2);
        this.f4250R = att;
        this.f4251R = str;
        this.f4248R = iv7;
        this.f4247R = iuk;
        this.v = iv72;
        this.c = iv73;
        this.e = iv74;
        this.f4254X = iv75;
        this.f4246O = iv76;
        this.f4253R = z;
        this.f4256v = z2;
        this.f4255c = z3;
        this.f4249R = j4b;
        this.f4252R = ngd;
        this.R = fvb;
        this.f4245L = iv77;
        this.O = i;
        this.L = i2;
        this.Z = i3;
    }
}
