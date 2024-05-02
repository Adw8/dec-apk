package defpackage;

/* renamed from: iF1  reason: default package */
/* loaded from: classes.dex */
public final class iF1 extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ iUy R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f4510R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f4511R;
    public final /* synthetic */ int X;
    public final /* synthetic */ iv7 c;
    public final /* synthetic */ iv7 e;
    public final /* synthetic */ iv7 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iF1(int i, iv7 iv7, lR3 lr3, iv7 iv72, iv7 iv73, iUy iuy, iv7 iv74, int i2, int i3) {
        super(2);
        this.X = i3;
        this.O = i;
        this.f4510R = iv7;
        this.f4511R = lr3;
        this.v = iv72;
        this.c = iv73;
        this.R = iuy;
        this.e = iv74;
        this.L = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 1:
                c2J c2j = (c2J) obj;
                long j = ((oys) obj2).f7046R;
                int Z = oys.Z(j);
                int L = oys.L(j);
                return c2j.f(Z, L, iia.R, new o7N(c2j, this.f4510R, this.v, this.c, this.O, Z, this.R, oys.R(j, 0, 0, 0, 0, 10), this.e, this.L, this.f4511R, L));
            default:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
        }
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
                int i2 = this.O;
                iv7 iv7 = this.f4510R;
                lR3 lr3 = this.f4511R;
                iv7 iv72 = this.v;
                iv7 iv73 = this.c;
                iUy iuy = this.R;
                iv7 iv74 = this.e;
                int i3 = this.L;
                fky.v(i2, iv7, lr3, iv72, iv73, iuy, iv74, m88, ((i3 >> 15) & 14) | (i3 & 112) | ((i3 >> 21) & 896) | (i3 & 7168) | (57344 & i3) | (458752 & (i3 >> 9)) | ((i3 << 12) & 3670016));
                return;
            default:
                fky.v(this.O, this.f4510R, this.f4511R, this.v, this.c, this.R, this.e, m88, this.L | 1);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iF1(iv7 iv7, iv7 iv72, iv7 iv73, int i, iUy iuy, iv7 iv74, int i2, lR3 lr3) {
        super(2);
        this.X = 1;
        this.f4510R = iv7;
        this.v = iv72;
        this.c = iv73;
        this.O = i;
        this.R = iuy;
        this.e = iv74;
        this.L = i2;
        this.f4511R = lr3;
    }
}
