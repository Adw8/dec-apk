package defpackage;

/* renamed from: jiB  reason: default package */
/* loaded from: classes.dex */
public final class jiB extends aFk implements iv7 {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gn f5003R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j__ f5004R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5005R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nLK f5006R;

    /* renamed from: R  reason: collision with other field name */
    public nWW f5007R;
    public int X;
    public nWW v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jiB(gn gnVar, j__ j__, dH9 dh9, nLK nlk, aOO aoo) {
        super(2, aoo);
        this.f5003R = gnVar;
        this.f5004R = j__;
        this.R = dh9;
        this.f5006R = nlk;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jiB) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:27|28|(1:30)|12|50|31|(2:36|(2:38|(1:40)))(2:33|(1:35))) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6 A[Catch: CancellationException -> 0x00d8, TryCatch #0 {CancellationException -> 0x00d8, blocks: (B:31:0x00a8, B:33:0x00b6, B:36:0x00c6, B:38:0x00ca), top: B:50:0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6 A[Catch: CancellationException -> 0x00d8, TryCatch #0 {CancellationException -> 0x00d8, blocks: (B:31:0x00a8, B:33:0x00b6, B:36:0x00c6, B:38:0x00ca), top: B:50:0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ef A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r8) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jiB.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        jiB jib = new jiB(this.f5003R, this.f5004R, this.R, this.f5006R, aoo);
        jib.f5005R = obj;
        return jib;
    }
}
