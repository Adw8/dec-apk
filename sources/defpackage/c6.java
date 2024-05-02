package defpackage;

/* renamed from: c6  reason: default package */
/* loaded from: classes.dex */
public final class c6 extends plU {
    public D5 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1970R;
    public int e;
    public final /* synthetic */ D5 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public c6(D5 d5, aOO aoo) {
        super(aoo);
        this.v = d5;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f1970R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.v(0, this);
    }
}
