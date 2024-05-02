package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: gVU  reason: default package */
/* loaded from: classes.dex */
public final class gVU extends k8G implements f_c {
    public final /* synthetic */ mpr R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gVU(mpr mpr, int i) {
        super(0);
        this.X = i;
        this.R = mpr;
    }

    public final void R() {
        switch (this.X) {
            case 1:
                this.R.N();
                return;
            case 2:
                this.R.H(R.id.create, null, null);
                return;
            case 3:
                this.R.H(R.id.settings_root, null, null);
                return;
            case 4:
                this.R.H(R.id.create, null, null);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                this.R.H(R.id.settings_port_forward_create, null, null);
                return;
            case 6:
                this.R.H(R.id.settings_port_forward_create, null, null);
                return;
            case 7:
                this.R.H(R.id.settings_port_forward, null, null);
                return;
            case VmNativeCallback.$stable:
                this.R.H(R.id.settings_usb, null, null);
                return;
            default:
                this.R.H(R.id.about, null, null);
                return;
        }
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                this.R.getClass();
                mpr mpr = this.R;
                return new nt9(mpr.f6176R, mpr.f6183R);
            case 1:
                R();
                break;
            case 2:
                R();
                break;
            case 3:
                R();
                break;
            case 4:
                R();
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                R();
                break;
            case 6:
                R();
                break;
            case 7:
                R();
                break;
            case VmNativeCallback.$stable:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
