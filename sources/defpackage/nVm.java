package defpackage;

/* renamed from: nVm  reason: default package */
/* loaded from: classes.dex */
public final class nVm extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public m5f f6421R;
    public int e;
    public final /* synthetic */ m5f v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public nVm(m5f m5f, aOO aoo) {
        super(aoo);
        this.v = m5f;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return m5f.R(this.v, this);
    }
}
