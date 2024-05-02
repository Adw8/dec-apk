package defpackage;

/* renamed from: Fu  reason: default package */
/* loaded from: classes.dex */
public final class Fu extends plU {
    public BW R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f149R;
    public int e;
    public final /* synthetic */ BW v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Fu(BW bw, aOO aoo) {
        super(aoo);
        this.v = bw;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f149R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.v(0, this);
    }
}
