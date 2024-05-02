package defpackage;

/* renamed from: oK0  reason: default package */
/* loaded from: classes.dex */
public final class oK0 extends k8G implements iv7 {
    public final /* synthetic */ bSG R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fBS f6744R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6745R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oK0(boolean z, bSG bsg, fBS fbs, int i) {
        super(2);
        this.f6745R = z;
        this.R = bsg;
        this.f6744R = fbs;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        n1P.X(this.f6745R, this.R, this.f6744R, (m88) obj, this.X | 1);
        return o8s.R;
    }
}
