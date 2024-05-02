package defpackage;

/* renamed from: ciU  reason: default package */
/* loaded from: classes.dex */
public final class ciU extends aFk implements iv7 {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f2182R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2183R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f2184R;
    public int X;
    public Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ciU(aOO aoo, kg9 kg9, iv7 iv7) {
        super(2, aoo);
        this.f2184R = kg9;
        this.f2182R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ciU) X(obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x000a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[PHI: r1 r2 r3 r5 r6 r7 r15 
      PHI: (r1v8 ??) = (r1v21 ??), (r1v22 ??) binds: [B:15:0x005a, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v9 int) = (r2v10 int), (r2v0 int) binds: [B:15:0x005a, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v7 long) = (r3v8 long), (r3v0 long) binds: [B:15:0x005a, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v5 int) = (r5v6 int), (r5v0 int) binds: [B:15:0x005a, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v7 int) = (r6v8 int), (r6v0 int) binds: [B:15:0x005a, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v7 int) = (r7v8 int), (r7v0 int) binds: [B:15:0x005a, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v19 java.lang.Object) = (r15v21 java.lang.Object), (r15v0 java.lang.Object) binds: [B:15:0x005a, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r15) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciU.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        ciU ciu = new ciU(aoo, this.f2184R, this.f2182R);
        ciu.f2183R = obj;
        return ciu;
    }
}
