package defpackage;

/* renamed from: gyl  reason: default package */
/* loaded from: classes.dex */
public final class gyl implements nRn {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f4003R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f4004R;

    public /* synthetic */ gyl(h0T h0t, p2E p2e, int i) {
        this.R = i;
        this.f4003R = h0t;
        this.f4004R = p2e;
    }

    @Override // defpackage.nRn
    public final void R() {
        switch (this.R) {
            case 0:
                k4G k4g = (k4G) this.f4003R.getValue();
                if (k4g != null) {
                    ktE kte = new ktE(k4g);
                    p2E p2e = this.f4004R;
                    if (p2e != null) {
                        p2e.v(kte);
                    }
                    this.f4003R.R(null);
                    return;
                }
                return;
            case 1:
                h0T h0t = this.f4003R;
                p2E p2e2 = this.f4004R;
                a07 a07 = (a07) h0t.getValue();
                if (a07 != null) {
                    p2e2.v(new bNQ(a07));
                    h0t.R(null);
                    return;
                }
                return;
            case 2:
                c03 c03 = (c03) this.f4003R.getValue();
                if (c03 != null) {
                    p2E p2e3 = this.f4004R;
                    if (p2e3 != null) {
                        p2e3.v(new p1v(c03));
                    }
                    this.f4003R.R(null);
                    return;
                }
                return;
            default:
                oDO odo = (oDO) this.f4003R.getValue();
                if (odo != null) {
                    hPn hpn = new hPn(odo);
                    p2E p2e4 = this.f4004R;
                    if (p2e4 != null) {
                        p2e4.v(hpn);
                    }
                    this.f4003R.R(null);
                    return;
                }
                return;
        }
    }
}
