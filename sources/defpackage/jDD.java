package defpackage;

/* renamed from: jDD  reason: default package */
/* loaded from: classes.dex */
public final class jDD extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mTv f4857R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jDD(mTv mtv, aOO aoo) {
        super(aoo);
        this.f4857R = mtv;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f4857R.R(null, this);
    }
}
