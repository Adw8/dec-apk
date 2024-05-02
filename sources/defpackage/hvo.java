package defpackage;

/* renamed from: hvo  reason: default package */
/* loaded from: classes.dex */
public final class hvo extends plU {
    public final /* synthetic */ bLN R;

    /* renamed from: R  reason: collision with other field name */
    public h2V f4420R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4421R;
    public int e;
    public bLN v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hvo(bLN bln, aOO aoo) {
        super(aoo);
        this.R = bln;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4421R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.v(null, this);
    }
}
