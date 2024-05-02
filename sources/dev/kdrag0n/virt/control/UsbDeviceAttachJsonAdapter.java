package dev.kdrag0n.virt.control;

/* loaded from: classes.dex */
public final class UsbDeviceAttachJsonAdapter extends k49 {
    public final jsT R = jsT.v("device", "vsockPort");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2728R;
    public final k49 v;

    public UsbDeviceAttachJsonAdapter(k_Z k_z) {
        lsA lsa = lsA.R;
        this.f2728R = k_z.c(UsbDeviceInfo.class, lsa, "device");
        this.v = k_z.c(Integer.TYPE, lsa, "vsockPort");
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        UsbDeviceAttach usbDeviceAttach = (UsbDeviceAttach) obj;
        if (usbDeviceAttach != null) {
            mot.c();
            mot.Z("device");
            this.f2728R.O(mot, usbDeviceAttach.f2727R);
            mot.Z("vsockPort");
            this.v.O(mot, Integer.valueOf(usbDeviceAttach.R));
            mot.X();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        csz.c();
        UsbDeviceInfo usbDeviceInfo = null;
        Integer num = null;
        while (csz.H()) {
            int G = csz.G(this.R);
            if (G == -1) {
                csz.B();
                csz.l();
            } else if (G == 0) {
                usbDeviceInfo = (UsbDeviceInfo) this.f2728R.R(csz);
                if (usbDeviceInfo == null) {
                    throw mzK.H("device", "device", csz);
                }
            } else if (G == 1 && (num = (Integer) this.v.R(csz)) == null) {
                throw mzK.H("vsockPort", "vsockPort", csz);
            }
        }
        csz.O();
        if (usbDeviceInfo == null) {
            throw mzK.X("device", "device", csz);
        } else if (num != null) {
            return new UsbDeviceAttach(usbDeviceInfo, num.intValue());
        } else {
            throw mzK.X("vsockPort", "vsockPort", csz);
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UsbDeviceAttach)";
    }
}
