package defpackage;

/* renamed from: yK  reason: default package */
/* loaded from: classes.dex */
public final class yK extends plU {
    public final /* synthetic */ gh R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f7487R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public yK(gh ghVar, aOO aoo) {
        super(aoo);
        this.R = ghVar;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f7487R = obj;
        this.e |= Integer.MIN_VALUE;
        Object e = this.R.e(null, this);
        return e == bGR.COROUTINE_SUSPENDED ? e : new mwl(e);
    }
}
