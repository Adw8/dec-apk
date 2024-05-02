package defpackage;

/* renamed from: cD5  reason: default package */
/* loaded from: classes.dex */
public final class cD5 extends plU {
    public aME R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2016R;
    public int e;
    public final /* synthetic */ aME v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cD5(aME ame, aOO aoo) {
        super(aoo);
        this.v = ame;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f2016R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.C(this);
    }
}
