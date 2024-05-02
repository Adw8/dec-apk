package defpackage;

/* renamed from: OH  reason: default package */
/* loaded from: classes.dex */
public final class OH extends k8G implements iv7 {
    public final /* synthetic */ bSG R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f328R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f329R;
    public final /* synthetic */ int X;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public OH(ncu ncu, boolean z, bSG bsg, boolean z2, int i) {
        super(2);
        this.f328R = ncu;
        this.f329R = z;
        this.R = bsg;
        this.v = z2;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        g4x.v(this.f328R, this.f329R, this.R, this.v, (m88) obj, this.X | 1);
        return o8s.R;
    }
}
