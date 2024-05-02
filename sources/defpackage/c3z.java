package defpackage;

/* renamed from: c3z  reason: default package */
/* loaded from: classes.dex */
public final class c3z extends plU {
    public aME R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1953R;

    /* renamed from: R  reason: collision with other field name */
    public String f1954R;
    public int e;
    public final /* synthetic */ aME v;

    /* renamed from: v  reason: collision with other field name */
    public String f1955v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public c3z(aME ame, aOO aoo) {
        super(aoo);
        this.v = ame;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f1953R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.v(null, null, this);
    }
}
