package defpackage;

import androidx.activity.d;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: j4w  reason: default package */
/* loaded from: classes.dex */
public final class j4w extends k8G implements f_c {
    public final /* synthetic */ d R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4w(d dVar, int i) {
        super(0);
        this.X = i;
        this.R = dVar;
    }

    public final hv5 R() {
        switch (this.X) {
            case 0:
                return this.R.L();
            case 1:
            case 3:
            default:
                return this.R.L();
            case 2:
                return this.R.L();
            case 4:
                return this.R.L();
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                return R();
            case 1:
                return v();
            case 2:
                return R();
            case 3:
                return v();
            case 4:
                return R();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return v();
            case 6:
            case 7:
            default:
                return v();
            case VmNativeCallback.$stable:
                return R();
        }
    }

    public final ns8 v() {
        switch (this.X) {
            case 1:
                return this.R.e();
            case 2:
            case 4:
            default:
                return this.R.e();
            case 3:
                return this.R.e();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return this.R.e();
        }
    }
}
