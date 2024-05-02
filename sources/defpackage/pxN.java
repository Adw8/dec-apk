package defpackage;

/* renamed from: pxN  reason: default package */
/* loaded from: classes.dex */
public final class pxN extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mTv f7326R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pxN(mTv mtv, aOO aoo) {
        super(aoo);
        this.f7326R = mtv;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f7326R.R(null, this);
    }
}
