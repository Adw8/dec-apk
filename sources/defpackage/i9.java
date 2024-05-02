package defpackage;

/* renamed from: i9  reason: default package */
/* loaded from: classes.dex */
public final class i9 extends plU {
    public g3 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4468R;

    /* renamed from: R  reason: collision with other field name */
    public pa3 f4469R;
    public int e;
    public final /* synthetic */ g3 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public i9(g3 g3Var, aOO aoo) {
        super(aoo);
        this.v = g3Var;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4468R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.R(null, this);
    }
}
