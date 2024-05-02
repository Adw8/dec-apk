package defpackage;

/* renamed from: fxR  reason: default package */
/* loaded from: classes.dex */
public final class fxR extends plU {
    public fG0 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3640R;

    /* renamed from: R  reason: collision with other field name */
    public m5f f3641R;
    public int e;
    public final /* synthetic */ m5f v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fxR(m5f m5f, aOO aoo) {
        super(aoo);
        this.v = m5f;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f3640R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.m(0, null, this);
    }
}
