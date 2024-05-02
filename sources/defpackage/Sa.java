package defpackage;

/* renamed from: Sa  reason: default package */
/* loaded from: classes.dex */
public final class Sa extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f519R;
    public final /* synthetic */ int X = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f520v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Sa(mIy miy, boolean z, boolean z2, j4B j4b, fVb fvb, n76 n76, int i, int i2) {
        super(2);
        this.R = miy;
        this.f519R = z;
        this.f520v = z2;
        this.v = j4b;
        this.c = fvb;
        this.e = n76;
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
                l1.R(this.f519R, (kg9) this.R, (ncu) this.v, this.f520v, (FP) this.c, (p2E) this.e, m88, this.O | 1, this.L);
                return;
            default:
                ((mIy) this.R).R(this.f519R, this.f520v, (j4B) this.v, (fVb) this.c, (n76) this.e, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Sa(boolean z, kg9 kg9, ncu ncu, boolean z2, FP fp, p2E p2e, int i, int i2) {
        super(2);
        this.f519R = z;
        this.R = kg9;
        this.v = ncu;
        this.f520v = z2;
        this.c = fp;
        this.e = p2e;
        this.O = i;
        this.L = i2;
    }
}
