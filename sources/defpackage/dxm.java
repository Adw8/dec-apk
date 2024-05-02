package defpackage;

/* renamed from: dxm  reason: default package */
/* loaded from: classes.dex */
public final class dxm extends plU {
    public final /* synthetic */ aLH R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2927R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dxm(aLH alh, aOO aoo) {
        super(aoo);
        this.R = alh;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f2927R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.v(0, this);
    }
}
