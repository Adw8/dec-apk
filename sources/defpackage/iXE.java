package defpackage;

/* renamed from: iXE  reason: default package */
/* loaded from: classes.dex */
public final class iXE extends k8G implements lR3 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ fVb R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iuk f4630R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f4631R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f4632R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n76 f4633R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f4634R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4635R;
    public final /* synthetic */ int X = 0;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ iv7 f4636X;
    public final /* synthetic */ iv7 c;

    /* renamed from: c  reason: collision with other field name */
    public final /* synthetic */ boolean f4637c;
    public final /* synthetic */ iv7 e;
    public final /* synthetic */ iv7 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f4638v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iXE(String str, boolean z, boolean z2, iuk iuk, p2E p2e, boolean z3, iv7 iv7, iv7 iv72, iv7 iv73, iv7 iv74, iv7 iv75, n76 n76, fVb fvb, int i, int i2) {
        super(3);
        this.f4632R = str;
        this.f4635R = z;
        this.f4638v = z2;
        this.f4630R = iuk;
        this.f4634R = p2e;
        this.f4637c = z3;
        this.f4631R = iv7;
        this.v = iv72;
        this.c = iv73;
        this.e = iv74;
        this.f4636X = iv75;
        this.f4633R = n76;
        this.R = fvb;
        this.O = i;
        this.L = i2;
    }

    public final void R(iv7 iv7, m88 m88, int i) {
        int i2;
        int i3;
        int i4 = 4;
        switch (this.X) {
            case 0:
                if ((i & 14) == 0) {
                    if (!((jr_) m88).O(iv7)) {
                        i4 = 2;
                    }
                    i3 = i | i4;
                } else {
                    i3 = i;
                }
                if ((i3 & 91) == 18) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                mIy miy = mIy.f6001R;
                String str = this.f4632R;
                boolean z = this.f4635R;
                boolean z2 = this.f4638v;
                iuk iuk = this.f4630R;
                p2E p2e = this.f4634R;
                boolean z3 = this.f4637c;
                iv7 iv72 = this.f4631R;
                iv7 iv73 = this.v;
                iv7 iv74 = this.c;
                iv7 iv75 = this.e;
                iv7 iv76 = this.f4636X;
                fVb fvb = this.R;
                dNH I = aH9.I(m88, -839984881, new ml2(z, z3, p2e, fvb, this.f4633R, this.O, this.L, 0));
                int i5 = this.O;
                int i6 = this.L;
                int i7 = i6 >> 6;
                int i8 = (i5 & 14) | ((i3 << 3) & 112) | ((i5 >> 3) & 896) | (i7 & 7168) | ((i6 << 6) & 57344) | (i7 & 458752) | ((i6 << 15) & 3670016);
                int i9 = i5 << 3;
                miy.c(str, iv7, z, z2, iuk, p2e, z3, iv72, iv73, iv74, iv75, iv76, fvb, null, I, m88, i8 | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), ((i5 >> 27) & 14) | 221184 | ((i6 << 3) & 112) | ((i6 >> 21) & 896), 8192);
                return;
            default:
                if ((i & 14) == 0) {
                    if (!((jr_) m88).O(iv7)) {
                        i4 = 2;
                    }
                    i2 = i | i4;
                } else {
                    i2 = i;
                }
                if ((i2 & 91) == 18) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                mIy miy2 = mIy.f6001R;
                String str2 = this.f4632R;
                boolean z4 = this.f4635R;
                boolean z5 = this.f4638v;
                iuk iuk2 = this.f4630R;
                p2E p2e2 = this.f4634R;
                boolean z6 = this.f4637c;
                iv7 iv77 = this.f4631R;
                iv7 iv78 = this.v;
                iv7 iv79 = this.c;
                iv7 iv710 = this.e;
                iv7 iv711 = this.f4636X;
                n76 n76 = this.f4633R;
                fVb fvb2 = this.R;
                int i10 = this.O;
                int i11 = this.L;
                int i12 = i11 >> 6;
                int i13 = (i10 & 14) | ((i2 << 3) & 112) | ((i10 >> 3) & 896) | (i12 & 7168) | ((i11 << 6) & 57344) | (i12 & 458752) | ((i11 << 15) & 3670016);
                int i14 = i10 << 3;
                int i15 = i11 >> 18;
                miy2.e(str2, iv7, z4, z5, iuk2, p2e2, z6, iv77, iv78, iv79, iv710, iv711, n76, fvb2, null, null, m88, i13 | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192), 1572864 | ((i10 >> 27) & 14) | ((i11 << 3) & 112) | (i15 & 896) | (i15 & 7168), 49152);
                return;
        }
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                R((iv7) obj, (m88) obj2, ((Number) obj3).intValue());
                break;
            default:
                R((iv7) obj, (m88) obj2, ((Number) obj3).intValue());
                break;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iXE(String str, boolean z, boolean z2, iuk iuk, p2E p2e, boolean z3, iv7 iv7, iv7 iv72, iv7 iv73, iv7 iv74, iv7 iv75, fVb fvb, int i, int i2, n76 n76) {
        super(3);
        this.f4632R = str;
        this.f4635R = z;
        this.f4638v = z2;
        this.f4630R = iuk;
        this.f4634R = p2e;
        this.f4637c = z3;
        this.f4631R = iv7;
        this.v = iv72;
        this.c = iv73;
        this.e = iv74;
        this.f4636X = iv75;
        this.R = fvb;
        this.O = i;
        this.L = i2;
        this.f4633R = n76;
    }
}
