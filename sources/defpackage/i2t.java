package defpackage;

/* renamed from: i2t  reason: default package */
/* loaded from: classes.dex */
public final class i2t extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kPA f4441R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f4442R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f4443R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f4444R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4445R;
    public final /* synthetic */ int X;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public i2t(boolean z, kg9 kg9, ncu ncu, iv7 iv7, boolean z2, kPA kpa, p2E p2e, int i, int i2) {
        super(2);
        this.f4445R = z;
        this.f4442R = kg9;
        this.f4443R = ncu;
        this.R = iv7;
        this.v = z2;
        this.f4441R = kpa;
        this.f4444R = p2e;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        nP4.R(this.f4445R, this.f4442R, this.f4443R, this.R, this.v, this.f4441R, this.f4444R, (m88) obj, this.X | 1, this.O);
        return o8s.R;
    }
}
