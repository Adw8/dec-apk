package defpackage;

/* renamed from: dG1  reason: default package */
/* loaded from: classes.dex */
public final class dG1 extends plU {
    public final /* synthetic */ iyL R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2546R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dG1(iyL iyl, aOO aoo) {
        super(aoo);
        this.R = iyl;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f2546R = obj;
        this.e |= Integer.MIN_VALUE;
        this.R.O(null, this);
        return bGR.COROUTINE_SUSPENDED;
    }
}
