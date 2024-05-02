package defpackage;

/* renamed from: W4  reason: default package */
/* loaded from: classes.dex */
public final class W4 extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ long f589R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f590R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n76 f591R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f592R;
    public final /* synthetic */ int X;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ iv7 f593X;
    public final /* synthetic */ long c;

    /* renamed from: c  reason: collision with other field name */
    public final /* synthetic */ iv7 f594c;
    public final /* synthetic */ long e;

    /* renamed from: e  reason: collision with other field name */
    public final /* synthetic */ iv7 f595e;
    public final /* synthetic */ long v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ iv7 f596v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public W4(ncu ncu, iv7 iv7, iv7 iv72, iv7 iv73, n76 n76, long j, float f, long j2, long j3, long j4, int i, int i2, iv7 iv74, iv7 iv75) {
        super(2);
        this.f592R = ncu;
        this.f590R = iv7;
        this.f596v = iv72;
        this.f594c = iv73;
        this.f591R = n76;
        this.f589R = j;
        this.R = f;
        this.v = j2;
        this.c = j3;
        this.e = j4;
        this.X = i;
        this.O = i2;
        this.f595e = iv74;
        this.f593X = iv75;
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
        String d = gQc.d(7, m88);
        dNH I = aH9.I(m88, 2094788745, new zu(this.f595e, this.X, this.f593X, 1));
        ncu ncu = this.f592R;
        aff aff = aff.R;
        jr_ jr_2 = (jr_) m88;
        jr_2.w(1157296644);
        boolean O = jr_2.O(d);
        Object I2 = jr_2.I();
        if (O || I2 == ppN.R) {
            I2 = new oF_(d, 1);
            jr_2.ZW(I2);
        }
        jr_2.g(false);
        ncu I3 = ncu.I(cU5.N(aff, false, (kg9) I2));
        iv7 iv7 = this.f590R;
        iv7 iv72 = this.f596v;
        iv7 iv73 = this.f594c;
        n76 n76 = this.f591R;
        long j = this.f589R;
        float f = this.R;
        float f2 = mcX.R;
        long X = _1.X(20, m88);
        long j2 = this.v;
        long j3 = this.c;
        long j4 = this.e;
        int i = this.X;
        int i2 = i >> 6;
        int i3 = this.O;
        ll.R(I, I3, iv7, iv72, iv73, n76, j, f, X, j2, j3, j4, m88, (i2 & 3670016) | (i2 & 896) | 6 | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (29360128 & (i3 << 15)) | (i & 1879048192), (i3 & 14) | (i3 & 112), 0);
        return o8s.R;
    }
}
