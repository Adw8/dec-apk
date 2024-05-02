package defpackage;

/* renamed from: K8  reason: default package */
/* loaded from: classes.dex */
public final class K8 extends aFk implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f233R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f234R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f235R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l3X f236R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f237R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f238R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public K8(l3X l3x, long j, p2E p2e, h0T h0t, dH9 dh9, aOO aoo) {
        super(2, aoo);
        this.f236R = l3x;
        this.R = j;
        this.f237R = p2e;
        this.f234R = h0t;
        this.f233R = dh9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((K8) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5 A[RETURN] */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r18) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K8.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        K8 k8 = new K8(this.f236R, this.R, this.f237R, this.f234R, this.f233R, aoo);
        k8.f235R = obj;
        return k8;
    }
}
