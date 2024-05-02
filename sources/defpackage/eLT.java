package defpackage;

/* renamed from: eLT  reason: default package */
/* loaded from: classes.dex */
public final class eLT extends aFk implements iv7 {
    public final /* synthetic */ fLL R;

    /* renamed from: R  reason: collision with other field name */
    public fbt f3065R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3066R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kJx f3067R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f3068R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eLT(fLL fll, lR3 lr3, kJx kjx, aOO aoo) {
        super(2, aoo);
        this.R = fll;
        this.f3068R = lr3;
        this.f3067R = kjx;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((eLT) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r15) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eLT.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        eLT elt = new eLT(this.R, this.f3068R, this.f3067R, aoo);
        elt.f3066R = obj;
        return elt;
    }
}
