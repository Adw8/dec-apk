package defpackage;

/* renamed from: n6  reason: default package */
/* loaded from: classes.dex */
public final class n6 extends k8G implements iv7 {
    public final /* synthetic */ h4f R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h5L f6298R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kIU f6299R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f6300R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f6301R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f6302R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public n6(h5L h5l, kg9 kg9, ncu ncu, kIU kiu, h4f h4f, lR3 lr3, int i) {
        super(2);
        this.f6298R = h5l;
        this.f6300R = kg9;
        this.f6302R = ncu;
        this.f6299R = kiu;
        this.R = h4f;
        this.f6301R = lr3;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dTl.R(this.f6298R, this.f6300R, this.f6302R, this.f6299R, this.R, this.f6301R, (m88) obj, this.X | 1);
        return o8s.R;
    }
}
