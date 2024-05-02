package defpackage;

/* renamed from: n2T  reason: default package */
/* loaded from: classes.dex */
public final class n2T extends plU {
    public final /* synthetic */ aLH R;

    /* renamed from: R  reason: collision with other field name */
    public h2V f6277R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6278R;
    public int e;
    public Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public n2T(aLH alh, aOO aoo) {
        super(aoo);
        this.R = alh;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f6278R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.R(null, this);
    }
}
