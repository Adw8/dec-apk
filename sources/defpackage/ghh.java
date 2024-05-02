package defpackage;

/* renamed from: ghh  reason: default package */
/* loaded from: classes.dex */
public final class ghh implements ojR {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fBS f3875R;

    public /* synthetic */ ghh(fBS fbs, int i) {
        this.R = i;
        this.f3875R = fbs;
    }

    @Override // defpackage.ojR
    public final void R() {
        switch (this.R) {
            case 0:
                fBS.v(this.f3875R, null);
                fBS.R(this.f3875R, null);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ojR
    public final void X(long j) {
        mjp c;
        mjp c2;
        iRR irr;
        switch (this.R) {
            case 0:
                fBS fbs = this.f3875R;
                fbs.v = aWo.L(fbs.v, j);
                kY5 ky5 = this.f3875R.f3345R;
                if (ky5 != null && (c2 = ky5.c()) != null && (irr = c2.f6140R) != null) {
                    fBS fbs2 = this.f3875R;
                    fbs2.e.R(new aWo(aWo.L(fbs2.R, fbs2.v)));
                    int L = fbs2.f3338R.L(irr.U(((aWo) fbs2.e.getValue()).f906R));
                    long e = dtx.e(L, L);
                    if (!odN.R(e, fbs2.x().R)) {
                        jlt jlt = fbs2.f3343R;
                        if (jlt != null) {
                            ((l_5) jlt).R();
                        }
                        fbs2.f3346R.x(fBS.X(fbs2.x().f2488R, e));
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!(this.f3875R.x().f2488R.R.length() == 0)) {
                    fBS fbs3 = this.f3875R;
                    fbs3.v = aWo.L(fbs3.v, j);
                    kY5 ky52 = this.f3875R.f3345R;
                    if (!(ky52 == null || (c = ky52.c()) == null)) {
                        fBS fbs4 = this.f3875R;
                        fbs4.e.R(new aWo(aWo.L(fbs4.R, fbs4.v)));
                        Integer num = fbs4.f3342R;
                        fBS.c(fbs4, fbs4.x(), num != null ? num.intValue() : c.v(fbs4.R, false), c.v(((aWo) fbs4.e.getValue()).f906R, false), false, dq.f2888e);
                    }
                    kY5 ky53 = this.f3875R.f3345R;
                    if (ky53 != null) {
                        ky53.f5342R = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.ojR
    public final void c() {
        switch (this.R) {
            case 0:
                fBS.v(this.f3875R, c_c.Cursor);
                fBS fbs = this.f3875R;
                fbs.e.R(new aWo(nwJ.R(fbs.m(true))));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ojR
    public final void e() {
        switch (this.R) {
            case 0:
                fBS.v(this.f3875R, null);
                fBS.R(this.f3875R, null);
                return;
            default:
                fBS.v(this.f3875R, null);
                fBS.R(this.f3875R, null);
                fBS fbs = this.f3875R;
                kY5 ky5 = fbs.f3345R;
                if (ky5 != null) {
                    ky5.f5342R = true;
                }
                lI8 li8 = fbs.f3347R;
                if ((li8 != null ? ((wK) li8).R : 0) == 2) {
                    fbs.N();
                }
                this.f3875R.f3342R = null;
                return;
        }
    }

    @Override // defpackage.ojR
    public final void onCancel() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ojR
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(long r10) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghh.v(long):void");
    }
}
