package defpackage;

/* renamed from: n6J  reason: default package */
/* loaded from: classes.dex */
public final class n6J extends plU {
    public int O;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public aD8 f6307R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6308R;
    public int X;
    public int e;
    public final /* synthetic */ aD8 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public n6J(aD8 ad8, aOO aoo) {
        super(aoo);
        this.v = ad8;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f6308R = obj;
        this.O |= Integer.MIN_VALUE;
        return this.v.X(0, 0.0f, this);
    }
}
