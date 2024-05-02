package defpackage;

/* renamed from: bC6  reason: default package */
/* loaded from: classes.dex */
public final class bC6 extends plU {
    public final /* synthetic */ aLH R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1565R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bC6(aLH alh, aOO aoo) {
        super(aoo);
        this.R = alh;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f1565R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.R(null, this);
    }
}
