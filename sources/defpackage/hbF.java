package defpackage;

/* renamed from: hbF  reason: default package */
/* loaded from: classes.dex */
public final class hbF extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mTv f4317R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hbF(mTv mtv, aOO aoo) {
        super(aoo);
        this.f4317R = mtv;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f4317R.R(null, this);
    }
}
