package defpackage;

/* renamed from: lr7  reason: default package */
/* loaded from: classes.dex */
public final class lr7 extends plU {
    public int O;
    public iHI R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5847R;

    /* renamed from: R  reason: collision with other field name */
    public lR3 f5848R;
    public int X;
    public int e;
    public final /* synthetic */ iHI v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lr7(iHI ihi, aOO aoo) {
        super(aoo);
        this.v = ihi;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f5847R = obj;
        this.O |= Integer.MIN_VALUE;
        return this.v.L(0, null, this);
    }
}
