package defpackage;

/* renamed from: mH3  reason: default package */
/* loaded from: classes.dex */
public final class mH3 extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ m5f f5997R;

    /* renamed from: R  reason: collision with other field name */
    public nWW f5998R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mH3(m5f m5f, aOO aoo) {
        super(aoo);
        this.f5997R = m5f;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return m5f.c(this.f5997R, this);
    }
}
