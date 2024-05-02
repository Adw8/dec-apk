package defpackage;

/* renamed from: fjW  reason: default package */
/* loaded from: classes.dex */
public final class fjW extends k8G implements iv7 {
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f3527R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ miv f3528R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f3529R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ngd f3530R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f3531R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3532R;
    public final /* synthetic */ int X;
    public final /* synthetic */ iv7 c;
    public final /* synthetic */ iv7 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fjW(iv7 iv7, f_c f_c, ncu ncu, iv7 iv72, iv7 iv73, boolean z, miv miv, ngd ngd, p2E p2e, int i) {
        super(2);
        this.f3527R = iv7;
        this.R = f_c;
        this.f3529R = ncu;
        this.v = iv72;
        this.c = iv73;
        this.f3532R = z;
        this.f3528R = miv;
        this.f3530R = ngd;
        this.f3531R = p2e;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a4b.v(this.f3527R, this.R, this.f3529R, this.v, this.c, this.f3532R, this.f3528R, this.f3530R, this.f3531R, (m88) obj, this.X | 1);
        return o8s.R;
    }
}
