package defpackage;

/* renamed from: oQo  reason: default package */
/* loaded from: classes.dex */
public final class oQo extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f6822R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iEm f6823R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f6824R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f6825R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f6826R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p6 f6827R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6828R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oQo(float f, kg9 kg9, ncu ncu, boolean z, p6 p6Var, int i, f_c f_c, iEm iem, p2E p2e, int i2, int i3) {
        super(2);
        this.R = f;
        this.f6824R = kg9;
        this.f6825R = ncu;
        this.f6828R = z;
        this.f6827R = p6Var;
        this.X = i;
        this.f6822R = f_c;
        this.f6823R = iem;
        this.f6826R = p2e;
        this.O = i2;
        this.L = i3;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dZT.v(this.R, this.f6824R, this.f6825R, this.f6828R, this.f6827R, this.X, this.f6822R, this.f6823R, this.f6826R, (m88) obj, this.O | 1, this.L);
        return o8s.R;
    }
}
