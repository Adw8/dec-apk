package defpackage;

/* renamed from: heR  reason: default package */
/* loaded from: classes.dex */
public final class heR extends otO {
    public final hYk R;

    /* renamed from: R  reason: collision with other field name */
    public final kfP f4337R = new kfP(this);

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l_W f4338R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public heR(l_W l_w, h89 h89, hYk hyk) {
        super(l_w, h89);
        this.f4338R = l_w;
        this.R = hyk;
    }

    @Override // defpackage.pc0
    public final l0f L(long j) {
        hYk hyk = this.R;
        l_W l_w = this.f4338R;
        np(j);
        otO oto = ((poS) l_w).f7280R.f7279R;
        oto.L(j);
        oto.c0().e();
        oto.c0().c();
        ((kpF) ((e7) hyk).R).pG();
        otO.S9(this, this.f4337R);
        return this;
    }

    @Override // defpackage.emQ
    public final int PN(XI xi) {
        int H = msU.H(this, xi);
        ((otO) this).v.put(xi, Integer.valueOf(H));
        return H;
    }
}
