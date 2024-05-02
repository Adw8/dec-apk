package defpackage;

/* renamed from: Qk  reason: default package */
/* loaded from: classes.dex */
public final class Qk extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f472R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f473R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f474R;
    public final /* synthetic */ int X = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Qk(hw1 hw1, p2E p2e, ncu ncu, iEm iem, boolean z, long j, int i, int i2) {
        super(2);
        this.f472R = hw1;
        this.v = p2e;
        this.f473R = ncu;
        this.c = iem;
        this.f474R = z;
        this.R = j;
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
                aH9.Z(this.f474R, (f_c) this.f472R, this.f473R, this.R, (cvV) this.v, (lR3) this.c, m88, this.O | 1, this.L);
                return;
            default:
                ((hw1) this.f472R).m((p2E) this.v, this.f473R, (iEm) this.c, this.f474R, this.R, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Qk(boolean z, f_c f_c, ncu ncu, long j, cvV cvv, lR3 lr3, int i, int i2) {
        super(2);
        this.f474R = z;
        this.f472R = f_c;
        this.f473R = ncu;
        this.R = j;
        this.v = cvv;
        this.c = lr3;
        this.O = i;
        this.L = i2;
    }
}
