package defpackage;

/* renamed from: emC  reason: default package */
/* loaded from: classes.dex */
public final class emC extends plU {
    public abJ R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3195R;
    public int e;
    public final /* synthetic */ abJ v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public emC(abJ abj, aOO aoo) {
        super(aoo);
        this.v = abj;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f3195R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.v(false, this);
    }
}
