package defpackage;

/* renamed from: c4M  reason: default package */
/* loaded from: classes.dex */
public final class c4M extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f1958R;
    public final /* synthetic */ int X;
    public final /* synthetic */ String v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public c4M(String str, int i, String str2, iv7 iv7) {
        super(2);
        this.X = 0;
        this.f1958R = str;
        this.L = i;
        this.v = str2;
        this.R = iv7;
        this.O = 0;
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
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                if ((this.O & 14 & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                dTl.e(null, null, null, null, null, aH9.I(m88, 1680349129, new e0_(this.f1958R, this.L, this.v, this.R)), m88, 196608, 31);
                return;
            default:
                vd.e(this.f1958R, this.v, this.R, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public c4M(String str, String str2, iv7 iv7, int i, int i2) {
        super(2);
        this.X = 1;
        this.f1958R = str;
        this.v = str2;
        this.R = iv7;
        this.O = i;
        this.L = i2;
    }
}
