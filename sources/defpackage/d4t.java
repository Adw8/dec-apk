package defpackage;

/* renamed from: d4t  reason: default package */
/* loaded from: classes.dex */
public final class d4t extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mTv f2480R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public d4t(mTv mtv, aOO aoo) {
        super(aoo);
        this.f2480R = mtv;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f2480R.R(null, this);
    }
}
