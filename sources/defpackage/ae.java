package defpackage;

/* renamed from: ae  reason: default package */
/* loaded from: classes.dex */
public final class ae extends plU {
    public Ir R;

    /* renamed from: R  reason: collision with other field name */
    public Object f949R;
    public int e;
    public final /* synthetic */ Ir v;

    /* renamed from: v  reason: collision with other field name */
    public /* synthetic */ Object f950v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ae(Ir ir, aOO aoo) {
        super(aoo);
        this.v = ir;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f950v = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.R(null, this);
    }
}
