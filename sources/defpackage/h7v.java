package defpackage;

/* renamed from: h7v  reason: default package */
/* loaded from: classes.dex */
public final class h7v extends plU {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public dq7 f4085R;

    /* renamed from: R  reason: collision with other field name */
    public gAN f4086R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4087R;
    public int X;
    public int e;
    public final /* synthetic */ dq7 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public h7v(dq7 dq7, aOO aoo) {
        super(aoo);
        this.v = dq7;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4087R = obj;
        this.X |= Integer.MIN_VALUE;
        return this.v.e(null, 0, 0.0f, this);
    }
}
