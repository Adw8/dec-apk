package defpackage;

/* renamed from: gOK  reason: default package */
/* loaded from: classes.dex */
public final class gOK extends k8G implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fB8 f3752R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hw1 f3753R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f3754R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mT2 f3755R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3756R;
    public final /* synthetic */ int X;
    public final /* synthetic */ long v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gOK(hw1 hw1, fB8 fb8, long j, long j2, lR3 lr3, boolean z, mT2 mt2, int i) {
        super(2);
        this.f3753R = hw1;
        this.f3752R = fb8;
        this.R = j;
        this.v = j2;
        this.f3754R = lr3;
        this.f3756R = z;
        this.f3755R = mt2;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f3753R.H(this.f3752R, this.R, this.v, this.f3754R, this.f3756R, this.f3755R, (m88) obj, this.X | 1);
        return o8s.R;
    }
}
