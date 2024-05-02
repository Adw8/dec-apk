package defpackage;

/* renamed from: p9  reason: default package */
/* loaded from: classes.dex */
public final class p9 extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ T_ R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f7065R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f7066R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f7067R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ngd f7068R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public p9(ncu ncu, String str, T_ t_, ngd ngd, f_c f_c, int i, int i2) {
        super(2);
        this.f7067R = ncu;
        this.f7066R = str;
        this.R = t_;
        this.f7068R = ngd;
        this.f7065R = f_c;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vd.c(this.f7067R, this.f7066R, this.R, this.f7068R, this.f7065R, (m88) obj, this.X | 1, this.O);
        return o8s.R;
    }
}
