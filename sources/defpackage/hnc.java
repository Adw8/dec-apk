package defpackage;

/* renamed from: hnc  reason: default package */
/* loaded from: classes.dex */
public final class hnc extends aFk implements iv7 {
    public final /* synthetic */ int L;
    public int O;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ aB_ f4383R;

    /* renamed from: R  reason: collision with other field name */
    public blo f4384R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4385R;

    /* renamed from: R  reason: collision with other field name */
    public nWW f4386R;

    /* renamed from: R  reason: collision with other field name */
    public oJx f4387R;
    public int X;
    public final /* synthetic */ int Z;
    public float v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hnc(int i, int i2, aB_ ab_, aOO aoo) {
        super(2, aoo);
        this.L = i;
        this.f4383R = ab_;
        this.Z = i2;
    }

    public static final boolean Z(boolean z, aB_ ab_, int i, int i2) {
        return !z ? !(ab_.R() >= i && (ab_.R() != i || ((Number) ab_.R.f6878R.v.getValue()).intValue() >= i2)) : !(ab_.R() <= i && (ab_.R() != i || ((Number) ab_.R.f6878R.v.getValue()).intValue() <= i2));
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((hnc) X((gAN) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5 A[Catch: hXr -> 0x01cd, TryCatch #3 {hXr -> 0x01cd, blocks: (B:26:0x00b1, B:28:0x00b5, B:30:0x00c3, B:32:0x00dc, B:33:0x00ec, B:39:0x011c, B:46:0x0155, B:50:0x0162), top: B:90:0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00dc A[Catch: hXr -> 0x01cd, LOOP:0: B:31:0x00da->B:32:0x00dc, LOOP_END, TryCatch #3 {hXr -> 0x01cd, blocks: (B:26:0x00b1, B:28:0x00b5, B:30:0x00c3, B:32:0x00dc, B:33:0x00ec, B:39:0x011c, B:46:0x0155, B:50:0x0162), top: B:90:0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0233 A[RETURN] */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r27) {
        /*
        // Method dump skipped, instructions count: 610
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnc.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        hnc hnc = new hnc(this.L, this.Z, this.f4383R, aoo);
        hnc.f4385R = obj;
        return hnc;
    }
}
