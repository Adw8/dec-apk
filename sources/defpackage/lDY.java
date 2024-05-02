package defpackage;

/* renamed from: lDY  reason: default package */
/* loaded from: classes.dex */
public final class lDY extends plU {
    public final /* synthetic */ aLH R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5617R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lDY(aLH alh, aOO aoo) {
        super(aoo);
        this.R = alh;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f5617R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.R(null, this);
    }
}
