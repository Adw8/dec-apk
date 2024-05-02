package defpackage;

/* renamed from: O8  reason: default package */
/* loaded from: classes.dex */
public final class O8 extends plU {
    public final /* synthetic */ TL R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f326R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public O8(TL tl, aOO aoo) {
        super(aoo);
        this.R = tl;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f326R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.R(null, this);
    }
}
