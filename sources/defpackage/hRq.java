package defpackage;

/* renamed from: hRq  reason: default package */
/* loaded from: classes.dex */
public final class hRq extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f4257R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f4258R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f4259R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f4260R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f4261R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p6 f4262R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4263R;
    public final /* synthetic */ int X;
    public final /* synthetic */ lR3 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hRq(ncu ncu, boolean z, p2E p2e, kg9 kg9, f_c f_c, int i, float f, p6 p6Var, lR3 lr3, lR3 lr32, int i2) {
        super(2);
        this.f4260R = ncu;
        this.f4263R = z;
        this.f4261R = p2e;
        this.f4258R = kg9;
        this.f4257R = f_c;
        this.X = i;
        this.R = f;
        this.f4262R = p6Var;
        this.f4259R = lr3;
        this.v = lr32;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dZT.c(this.f4260R, this.f4263R, this.f4261R, this.f4258R, this.f4257R, this.X, this.R, this.f4262R, this.f4259R, this.v, (m88) obj, this.O | 1);
        return o8s.R;
    }
}
