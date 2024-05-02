package dev.kdrag0n.virt.control;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class UsbDeviceAttach {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final UsbDeviceInfo f2727R;

    public UsbDeviceAttach(UsbDeviceInfo usbDeviceInfo, int i) {
        this.f2727R = usbDeviceInfo;
        this.R = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsbDeviceAttach)) {
            return false;
        }
        UsbDeviceAttach usbDeviceAttach = (UsbDeviceAttach) obj;
        return n3x.v(this.f2727R, usbDeviceAttach.f2727R) && this.R == usbDeviceAttach.R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R) + (this.f2727R.hashCode() * 31);
    }

    public final String toString() {
        UsbDeviceInfo usbDeviceInfo = this.f2727R;
        int i = this.R;
        return "UsbDeviceAttach(device=" + usbDeviceInfo + ", vsockPort=" + i + ")";
    }
}
