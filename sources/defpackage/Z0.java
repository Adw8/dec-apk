package defpackage;

/* renamed from: Z0  reason: default package */
/* loaded from: classes.dex */
public final class Z0 extends plU {
    public final /* synthetic */ gh R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f657R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(gh ghVar, aOO aoo) {
        super(aoo);
        this.R = ghVar;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f657R = obj;
        this.e |= Integer.MIN_VALUE;
        Object X = this.R.X(false, this);
        return X == bGR.COROUTINE_SUSPENDED ? X : new mwl(X);
    }
}
