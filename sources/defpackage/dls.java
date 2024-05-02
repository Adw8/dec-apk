package defpackage;

/* renamed from: dls  reason: default package */
/* loaded from: classes.dex */
public final class dls implements pc0 {
    public final cxM R;

    /* renamed from: R  reason: collision with other field name */
    public final Enum f2855R;
    public final /* synthetic */ int e = 1;
    public final Enum v;

    public dls(cxM cxm, ei4 ei4, eKS eks) {
        this.R = cxm;
        this.f2855R = ei4;
        this.v = eks;
    }

    @Override // defpackage.pc0
    public final l0f L(long j) {
        switch (this.e) {
            case 0:
                or1 or1 = or1.Max;
                if (((nmM) this.v) == nmM.Width) {
                    return new dhm(((or1) this.f2855R) == or1 ? this.R.k(oys.L(j)) : this.R.ZW(oys.L(j)), oys.L(j), 0);
                }
                return new dhm(oys.Z(j), ((or1) this.f2855R) == or1 ? this.R.Z(oys.Z(j)) : this.R.zw(oys.Z(j)), 0);
            default:
                ei4 ei4 = ei4.Max;
                if (((eKS) this.v) == eKS.Width) {
                    return new dhm(((ei4) this.f2855R) == ei4 ? this.R.k(oys.L(j)) : this.R.ZW(oys.L(j)), oys.L(j), 1);
                }
                return new dhm(oys.Z(j), ((ei4) this.f2855R) == ei4 ? this.R.Z(oys.Z(j)) : this.R.zw(oys.Z(j)), 1);
        }
    }

    @Override // defpackage.cxM
    public final Object R() {
        switch (this.e) {
            case 0:
                return this.R.R();
            default:
                return this.R.R();
        }
    }

    @Override // defpackage.cxM
    public final int Z(int i) {
        switch (this.e) {
            case 0:
                return this.R.Z(i);
            default:
                return this.R.Z(i);
        }
    }

    @Override // defpackage.cxM
    public final int ZW(int i) {
        switch (this.e) {
            case 0:
                return this.R.ZW(i);
            default:
                return this.R.ZW(i);
        }
    }

    @Override // defpackage.cxM
    public final int k(int i) {
        switch (this.e) {
            case 0:
                return this.R.k(i);
            default:
                return this.R.k(i);
        }
    }

    @Override // defpackage.cxM
    public final int zw(int i) {
        switch (this.e) {
            case 0:
                return this.R.zw(i);
            default:
                return this.R.zw(i);
        }
    }

    public dls(cxM cxm, or1 or1, nmM nmm) {
        this.R = cxm;
        this.f2855R = or1;
        this.v = nmm;
    }
}
