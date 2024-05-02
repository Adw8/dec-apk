package defpackage;

/* renamed from: aI5  reason: default package */
/* loaded from: classes.dex */
public final class aI5 extends plU {
    public final /* synthetic */ iHI R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f822R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aI5(iHI ihi, aOO aoo) {
        super(aoo);
        this.R = ihi;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f822R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.v(this);
    }
}
