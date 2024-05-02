package defpackage;

/* renamed from: hk_  reason: default package */
/* loaded from: classes.dex */
public final class hk_ extends aFk implements iv7 {
    public final /* synthetic */ f11 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f4369R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f4370R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f4371R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hk_(f11 f11, nWQ nwq, nhg nhg, Object obj, aOO aoo) {
        super(2, aoo);
        this.R = f11;
        this.f4370R = nwq;
        this.f4371R = nhg;
        this.f4369R = obj;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((hk_) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c A[RETURN] */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r14) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk_.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new hk_(this.R, this.f4370R, this.f4371R, this.f4369R, aoo);
    }
}
