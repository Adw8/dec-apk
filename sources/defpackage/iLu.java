package defpackage;

/* renamed from: iLu  reason: default package */
/* loaded from: classes.dex */
public final class iLu extends plU {
    public int O;
    public aME R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4546R;

    /* renamed from: R  reason: collision with other field name */
    public String f4547R;
    public int X;
    public int e;
    public final /* synthetic */ aME v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iLu(aME ame, aOO aoo) {
        super(aoo);
        this.v = ame;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4546R = obj;
        this.O |= Integer.MIN_VALUE;
        return this.v.R(null, 0, 0, this);
    }
}
