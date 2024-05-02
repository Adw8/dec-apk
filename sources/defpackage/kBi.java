package defpackage;

/* renamed from: kBi  reason: default package */
/* loaded from: classes.dex */
public final class kBi extends plU {
    public final /* synthetic */ aME R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5207R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kBi(aME ame, aOO aoo) {
        super(aoo);
        this.R = ame;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f5207R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.H(null, this);
    }
}
