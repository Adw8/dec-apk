package defpackage;

/* renamed from: diY  reason: default package */
/* loaded from: classes.dex */
public final class diY implements ojR {
    public final /* synthetic */ fBS R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f2831R;

    public diY(fBS fbs, boolean z) {
        this.R = fbs;
        this.f2831R = z;
    }

    @Override // defpackage.ojR
    public final void R() {
        fBS.v(this.R, null);
        fBS.R(this.R, null);
    }

    @Override // defpackage.ojR
    public final void X(long j) {
        mjp c;
        iRR irr;
        int i;
        fBS fbs = this.R;
        fbs.v = aWo.L(fbs.v, j);
        kY5 ky5 = this.R.f3345R;
        if (!(ky5 == null || (c = ky5.c()) == null || (irr = c.f6140R) == null)) {
            fBS fbs2 = this.R;
            boolean z = this.f2831R;
            fbs2.e.R(new aWo(aWo.L(fbs2.R, fbs2.v)));
            if (z) {
                i = irr.U(((aWo) fbs2.e.getValue()).f906R);
            } else {
                c71 c71 = fbs2.f3338R;
                long j2 = fbs2.x().R;
                int i2 = odN.R;
                i = c71.Z((int) (j2 >> 32));
            }
            fBS.c(fbs2, fbs2.x(), i, z ? fbs2.f3338R.Z(odN.c(fbs2.x().R)) : irr.U(((aWo) fbs2.e.getValue()).f906R), z, dq.f2884c);
        }
        kY5 ky52 = this.R.f3345R;
        if (ky52 != null) {
            ky52.f5342R = false;
        }
    }

    @Override // defpackage.ojR
    public final void c() {
        fBS.v(this.R, this.f2831R ? c_c.SelectionStart : c_c.SelectionEnd);
        fBS fbs = this.R;
        fbs.e.R(new aWo(nwJ.R(fbs.m(this.f2831R))));
    }

    @Override // defpackage.ojR
    public final void e() {
        fBS.v(this.R, null);
        fBS.R(this.R, null);
        fBS fbs = this.R;
        kY5 ky5 = fbs.f3345R;
        if (ky5 != null) {
            ky5.f5342R = true;
        }
        lI8 li8 = fbs.f3347R;
        if ((li8 != null ? ((wK) li8).R : 0) == 2) {
            fbs.N();
        }
    }

    @Override // defpackage.ojR
    public final void onCancel() {
    }

    @Override // defpackage.ojR
    public final void v(long j) {
        fBS fbs = this.R;
        fbs.R = nwJ.R(fbs.m(this.f2831R));
        fBS fbs2 = this.R;
        fbs2.e.R(new aWo(fbs2.R));
        fBS fbs3 = this.R;
        fbs3.v = aWo.v;
        fbs3.c.R(this.f2831R ? c_c.SelectionStart : c_c.SelectionEnd);
        kY5 ky5 = this.R.f3345R;
        if (ky5 != null) {
            ky5.f5342R = false;
        }
    }
}
