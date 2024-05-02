package defpackage;

/* renamed from: U4  reason: default package */
/* loaded from: classes.dex */
public final class U4 extends aFk implements iv7 {
    public int L;
    public int O;
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public gn f544R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h2V f545R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f546R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f547R;

    /* renamed from: R  reason: collision with other field name */
    public byte[] f548R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ[] f549R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public U4(aOO aoo, f_c f_c, lR3 lr3, h2V h2v, nWQ[] nwqArr) {
        super(2, aoo);
        this.f549R = nwqArr;
        this.R = f_c;
        this.f547R = lr3;
        this.f545R = h2v;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((U4) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad A[LOOP:1: B:32:0x00ad->B:41:0x00cf, LOOP_START, PHI: r6 r11 
      PHI: (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:29:0x00a8, B:41:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v5 lKU) = (r11v4 lKU), (r11v15 lKU) binds: [B:29:0x00a8, B:41:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r22) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.U4.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        U4 u4 = new U4(aoo, this.R, this.f547R, this.f545R, this.f549R);
        u4.f546R = obj;
        return u4;
    }
}
