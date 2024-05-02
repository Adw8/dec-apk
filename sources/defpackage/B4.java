package defpackage;

/* renamed from: B4  reason: default package */
/* loaded from: classes.dex */
public final class B4 extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ T_ R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fO f6R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f7R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f8R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lf f9R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n76 f10R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f11R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ngd f12R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f13R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f14R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B4(f_c f_c, ncu ncu, boolean z, n76 n76, T_ t_, fO fOVar, lf lfVar, ngd ngd, p2E p2e, lR3 lr3, int i, int i2, int i3) {
        super(2);
        this.X = i3;
        this.f7R = f_c;
        this.f11R = ncu;
        this.f14R = z;
        this.f10R = n76;
        this.R = t_;
        this.f6R = fOVar;
        this.f9R = lfVar;
        this.f12R = ngd;
        this.f13R = p2e;
        this.f8R = lr3;
        this.O = i;
        this.L = i2;
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
                msU.R(this.f7R, this.f11R, this.f14R, this.f10R, this.R, this.f6R, this.f9R, this.f12R, this.f13R, this.f8R, m88, this.O | 1, this.L);
                return;
            case 1:
                msU.c(this.f7R, this.f11R, this.f14R, this.f10R, this.R, this.f6R, this.f9R, this.f12R, this.f13R, this.f8R, m88, this.O | 1, this.L);
                return;
            default:
                msU.O(this.f7R, this.f11R, this.f14R, this.f10R, this.R, this.f6R, this.f9R, this.f12R, this.f13R, this.f8R, m88, this.O | 1, this.L);
                return;
        }
    }
}
