package defpackage;

/* renamed from: K2  reason: default package */
/* loaded from: classes.dex */
public final class K2 extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nJ f216R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public K2(nJ nJVar, aOO aoo) {
        super(aoo);
        this.f216R = nJVar;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        Object L = this.f216R.L(this);
        return L == bGR.COROUTINE_SUSPENDED ? L : new wC(L);
    }
}
