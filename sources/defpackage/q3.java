package defpackage;

/* renamed from: q3  reason: default package */
/* loaded from: classes.dex */
public final class q3 extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ aAC f7348R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f7349R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(long j, Object obj, aAC aac, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = j;
        this.f7349R = obj;
        this.f7348R = aac;
        this.O = i;
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
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                iq.R(this.R, (ncu) this.f7349R, (iv7) this.f7348R, m88, this.O | 1);
                return;
            case 1:
                g4x.c(this.R, (n3U) this.f7349R, (iv7) this.f7348R, m88, this.O | 1);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                l6.R(new bkv[]{kft.R.v(new n3(this.R))}, aH9.I(m88, 1582292974, new ff((ngd) this.f7349R, (lR3) this.f7348R, this.O, 1)), m88, 56);
                return;
        }
    }
}
