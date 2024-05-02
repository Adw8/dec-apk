package defpackage;

/* renamed from: bVE  reason: default package */
/* loaded from: classes.dex */
public final class bVE extends k8G implements f_c {
    public final /* synthetic */ fBS R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bVE(fBS fbs, int i) {
        super(0);
        this.X = i;
        this.R = fbs;
    }

    public final Boolean R() {
        switch (this.X) {
            case 0:
                this.R.Z();
                return Boolean.TRUE;
            case 1:
                this.R.e(true);
                return Boolean.TRUE;
            case 2:
                this.R.O();
                return Boolean.TRUE;
            default:
                this.R.U();
                return Boolean.TRUE;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                return R();
            case 1:
                return R();
            case 2:
                return R();
            case 3:
                return R();
            case 4:
                v();
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                v();
                break;
            case 6:
                v();
                break;
            default:
                v();
                break;
        }
        return o8s.R;
    }

    public final void v() {
        switch (this.X) {
            case 4:
                this.R.e(true);
                this.R.H();
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                this.R.O();
                this.R.H();
                return;
            case 6:
                this.R.U();
                this.R.H();
                return;
            default:
                fBS fbs = this.R;
                d5M X = fBS.X(fbs.x().f2488R, dtx.e(0, fbs.x().f2488R.R.length()));
                fbs.f3346R.x(X);
                fbs.f3340R = d5M.R(fbs.f3340R, null, X.R, 5);
                kY5 ky5 = fbs.f3345R;
                if (ky5 != null) {
                    ky5.f5342R = true;
                    return;
                }
                return;
        }
    }
}
