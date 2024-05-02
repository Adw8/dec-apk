package defpackage;

/* renamed from: bjp  reason: default package */
/* loaded from: classes.dex */
public final class bjp extends aFk implements iv7 {
    public final /* synthetic */ int O;
    public f21 R;

    /* renamed from: R  reason: collision with other field name */
    public Object f1781R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f1782R;

    /* renamed from: R  reason: collision with other field name */
    public oDD f1783R;
    public int X;
    public /* synthetic */ Object v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ oDD f1784v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bjp(int i, oDD odd, kg9 kg9, aOO aoo) {
        super(2, aoo);
        this.O = i;
        this.f1784v = odd;
        this.f1782R = kg9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((bjp) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r9) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjp.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        bjp bjp = new bjp(this.O, this.f1784v, this.f1782R, aoo);
        bjp.v = obj;
        return bjp;
    }
}
