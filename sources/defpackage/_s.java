package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: _s  reason: default package */
/* loaded from: classes.dex */
public final class _s extends eTk {
    public final /* synthetic */ HI R;

    public _s(HI hi) {
        this.R = hi;
    }

    public final void L(int i, int i2, String str) {
        StringBuilder y = jQ.y("onError: cid=", i, " errorCode=", i2, " message=");
        y.append(str);
        kxm.v("virtc/AvfVm", 6, y.toString(), null);
        l6.z(mxC.N(), null, 0, new I_(this.R, i2, null), 3);
    }

    public final void O(int i, int i2) {
        String str;
        switch (i2) {
            case 0:
                str = "INFRASTRUCTURE_ERROR";
                break;
            case 1:
                str = "KILLED";
                break;
            case 2:
            default:
                str = "UNKNOWN";
                break;
            case 3:
                str = "SHUTDOWN";
                break;
            case 4:
                str = "ERROR";
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                str = "REBOOT";
                break;
            case 6:
                str = "CRASH";
                break;
            case 7:
                str = "PVM_FIRMWARE_PUBLIC_KEY_MISMATCH";
                break;
            case VmNativeCallback.$stable /* 8 */:
                str = "PVM_FIRMWARE_INSTANCE_IMAGE_CHANGED";
                break;
            case 9:
                str = "BOOTLOADER_PUBLIC_KEY_MISMATCH";
                break;
            case 10:
                str = "BOOTLOADER_INSTANCE_IMAGE_CHANGED";
                break;
        }
        kxm.v("virtc/AvfVm", 6, jQ.g(jQ.y("onDied: cid=", i, " reason=", i2, " ("), str, ")"), null);
        if (n3x.v(str, "SHUTDOWN") || n3x.v(str, "REBOOT")) {
            l6.z(mxC.N(), null, 0, new YZ(this.R, null), 3);
        } else {
            l6.z(mxC.N(), null, 0, new ha(this.R, str, null), 3);
        }
    }
}
