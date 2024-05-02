package defpackage;

/* renamed from: gz2  reason: default package */
/* loaded from: classes.dex */
public final class gz2 extends plU {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public dOC f4007R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4008R;
    public int e;
    public final /* synthetic */ dOC v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gz2(dOC doc, aOO aoo) {
        super(aoo);
        this.v = doc;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4008R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.m(0, 0, this);
    }
}
