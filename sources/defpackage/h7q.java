package defpackage;

/* renamed from: h7q  reason: default package */
/* loaded from: classes.dex */
public final class h7q extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kI4 f4084R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public h7q(kI4 ki4, aOO aoo) {
        super(aoo);
        this.f4084R = ki4;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f4084R.R(null, this);
    }
}
