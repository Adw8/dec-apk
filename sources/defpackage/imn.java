package defpackage;

/* renamed from: imn  reason: default package */
/* loaded from: classes.dex */
public final class imn extends plU {
    public final /* synthetic */ igQ R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4725R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public imn(igQ igq, aOO aoo) {
        super(aoo);
        this.R = igq;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4725R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.v(null, this);
    }
}
