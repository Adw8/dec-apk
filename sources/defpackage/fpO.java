package defpackage;

/* renamed from: fpO  reason: default package */
/* loaded from: classes.dex */
public final class fpO extends plU {
    public eJw R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3566R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3567R;
    public int e;
    public final /* synthetic */ eJw v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fpO(eJw ejw, aOO aoo) {
        super(aoo);
        this.v = ejw;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f3566R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.v(false, this);
    }
}
