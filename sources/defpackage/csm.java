package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: csm  reason: default package */
/* loaded from: classes.dex */
public final class csm extends k8G implements f_c {
    public final /* synthetic */ pm2 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ csm(int i, pm2 pm2) {
        super(0);
        this.X = i;
        this.R = pm2;
    }

    public final pm2 R() {
        switch (this.X) {
            case 3:
                return this.R;
            case 4:
                return this.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 6:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                return this.R;
            case 7:
                return this.R;
            case VmNativeCallback.$stable /* 8 */:
                return this.R;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return this.R;
            case 16:
                return this.R;
            case 17:
                return this.R;
            case 18:
                return this.R;
            case 19:
                return this.R;
            case 20:
                return this.R;
            case 21:
                return this.R;
        }
    }

    public final ns8 c() {
        switch (this.X) {
            case 1:
                return this.R.r().e();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return this.R.r().e();
            case 9:
                return this.R.r().e();
            case 12:
                return this.R.r().e();
            default:
                return this.R.r().e();
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                return v();
            case 1:
                return c();
            case 2:
                return v();
            case 3:
                return R();
            case 4:
                return R();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return c();
            case 6:
                return v();
            case 7:
                return R();
            case VmNativeCallback.$stable /* 8 */:
                return R();
            case 9:
                return c();
            case 10:
                return v();
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return R();
            case 12:
                return c();
            case 13:
                return v();
            case 14:
                return c();
            case 15:
                return v();
            case 16:
                return R();
            case 17:
                return R();
            case 18:
                return R();
            case 19:
                return R();
            case 20:
                return R();
            case 21:
                return R();
            default:
                return R();
        }
    }

    public final hv5 v() {
        switch (this.X) {
            case 0:
                return this.R.L();
            case 2:
                return this.R.r().L();
            case 6:
                return this.R.r().L();
            case 10:
                return this.R.r().L();
            case 13:
                return this.R.r().L();
            default:
                return this.R.r().L();
        }
    }
}
