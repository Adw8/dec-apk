package defpackage;

/* renamed from: ctx  reason: default package */
/* loaded from: classes.dex */
public final class ctx extends plU {
    public int O;
    public aME R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2450R;

    /* renamed from: R  reason: collision with other field name */
    public String f2451R;
    public int X;
    public int e;
    public final /* synthetic */ aME v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ctx(aME ame, aOO aoo) {
        super(aoo);
        this.v = ame;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f2450R = obj;
        this.O |= Integer.MIN_VALUE;
        return this.v.Z(null, 0, 0, this);
    }
}
