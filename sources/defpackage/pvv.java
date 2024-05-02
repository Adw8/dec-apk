package defpackage;

/* renamed from: pvv  reason: default package */
/* loaded from: classes.dex */
public final class pvv extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mTv f7316R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pvv(mTv mtv, aOO aoo) {
        super(aoo);
        this.f7316R = mtv;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f7316R.R(null, this);
    }
}
