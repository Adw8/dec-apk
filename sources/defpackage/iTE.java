package defpackage;

/* renamed from: iTE  reason: default package */
/* loaded from: classes.dex */
public final class iTE extends plU {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public eJw f4600R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4601R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4602R;
    public int e;
    public final /* synthetic */ eJw v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iTE(eJw ejw, aOO aoo) {
        super(aoo);
        this.v = ejw;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4601R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.x(false, this);
    }
}
