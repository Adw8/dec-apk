package defpackage;

/* renamed from: u6  reason: default package */
/* loaded from: classes.dex */
public final class u6 extends k8G implements iv7 {
    public final /* synthetic */ FP R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ aJk f7423R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f7424R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f7425R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public u6(boolean z, aJk ajk, ncu ncu, FP fp, int i) {
        super(2);
        this.f7425R = z;
        this.f7423R = ajk;
        this.f7424R = ncu;
        this.R = fp;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        l1.v(this.f7425R, this.f7423R, this.f7424R, this.R, (m88) obj, this.X | 1);
        return o8s.R;
    }
}
