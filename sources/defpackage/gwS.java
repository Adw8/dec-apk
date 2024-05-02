package defpackage;

/* renamed from: gwS  reason: default package */
/* loaded from: classes.dex */
public final class gwS extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ aAC R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3993R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f3994R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3995R;
    public final /* synthetic */ int X = 1;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gwS(ncu ncu, String str, boolean z, f_c f_c, int i, int i2) {
        super(2);
        this.f3994R = ncu;
        this.f3993R = str;
        this.f3995R = z;
        this.R = f_c;
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
                jyF.R(this.f3995R, (kg9) this.f3993R, this.f3994R, (lR3) this.R, m88, this.O | 1, this.L);
                return;
            default:
                vd.R(this.f3994R, (String) this.f3993R, this.f3995R, (f_c) this.R, m88, this.O | 1, this.L);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gwS(boolean z, kg9 kg9, ncu ncu, lR3 lr3, int i, int i2) {
        super(2);
        this.f3995R = z;
        this.f3993R = kg9;
        this.f3994R = ncu;
        this.R = lr3;
        this.O = i;
        this.L = i2;
    }
}
