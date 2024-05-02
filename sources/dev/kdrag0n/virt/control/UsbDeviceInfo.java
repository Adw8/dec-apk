package dev.kdrag0n.virt.control;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class UsbDeviceInfo {
    public final String R;
    public final String c;
    public final String v;

    public UsbDeviceInfo(String str, String str2, String str3) {
        this.R = str;
        this.v = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsbDeviceInfo)) {
            return false;
        }
        UsbDeviceInfo usbDeviceInfo = (UsbDeviceInfo) obj;
        return n3x.v(this.R, usbDeviceInfo.R) && n3x.v(this.v, usbDeviceInfo.v) && n3x.v(this.c, usbDeviceInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + opT.O(this.v, this.R.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.R;
        String str2 = this.v;
        String str3 = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append("UsbDeviceInfo(busId=");
        sb.append(str);
        sb.append(", vid=");
        sb.append(str2);
        sb.append(", pid=");
        return jQ.g(sb, str3, ")");
    }
}
