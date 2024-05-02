package defpackage;

/* renamed from: erU  reason: default package */
/* loaded from: classes.dex */
public final class erU extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ m5f f3219R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public erU(m5f m5f, aOO aoo) {
        super(aoo);
        this.f3219R = m5f;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return m5f.v(this.f3219R, this);
    }
}
