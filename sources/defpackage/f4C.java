package defpackage;

/* renamed from: f4C  reason: default package */
/* loaded from: classes.dex */
public final class f4C extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mTv f3285R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public f4C(mTv mtv, aOO aoo) {
        super(aoo);
        this.f3285R = mtv;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f3285R.R(null, this);
    }
}
