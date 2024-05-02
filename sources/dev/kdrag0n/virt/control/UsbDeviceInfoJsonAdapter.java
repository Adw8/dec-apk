package dev.kdrag0n.virt.control;

/* loaded from: classes.dex */
public final class UsbDeviceInfoJsonAdapter extends k49 {
    public final jsT R = jsT.v("busId", "vid", "pid");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2729R;

    public UsbDeviceInfoJsonAdapter(k_Z k_z) {
        this.f2729R = k_z.c(String.class, lsA.R, "busId");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        UsbDeviceInfo usbDeviceInfo = (UsbDeviceInfo) obj;
        if (usbDeviceInfo != null) {
            mot.c();
            mot.Z("busId");
            this.f2729R.O(mot, usbDeviceInfo.R);
            mot.Z("vid");
            this.f2729R.O(mot, usbDeviceInfo.v);
            mot.Z("pid");
            this.f2729R.O(mot, usbDeviceInfo.c);
            mot.X();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        csz.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (csz.H()) {
            int G = csz.G(this.R);
            if (G == -1) {
                csz.B();
                csz.l();
            } else if (G == 0) {
                str = (String) this.f2729R.R(csz);
                if (str == null) {
                    throw mzK.H("busId", "busId", csz);
                }
            } else if (G == 1) {
                str2 = (String) this.f2729R.R(csz);
                if (str2 == null) {
                    throw mzK.H("vid", "vid", csz);
                }
            } else if (G == 2 && (str3 = (String) this.f2729R.R(csz)) == null) {
                throw mzK.H("pid", "pid", csz);
            }
        }
        csz.O();
        if (str == null) {
            throw mzK.X("busId", "busId", csz);
        } else if (str2 == null) {
            throw mzK.X("vid", "vid", csz);
        } else if (str3 != null) {
            return new UsbDeviceInfo(str, str2, str3);
        } else {
            throw mzK.X("pid", "pid", csz);
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UsbDeviceInfo)";
    }
}
