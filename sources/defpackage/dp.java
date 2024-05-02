package defpackage;

import android.hardware.usb.UsbDeviceConnection;

/* renamed from: dp  reason: default package */
/* loaded from: classes.dex */
public final class dp {
    public int R = -1;

    /* renamed from: R  reason: collision with other field name */
    public final UsbDeviceConnection f2875R;

    public dp(UsbDeviceConnection usbDeviceConnection) {
        this.f2875R = usbDeviceConnection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        return n3x.v(this.f2875R, dpVar.f2875R) && this.R == dpVar.R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R) + (this.f2875R.hashCode() * 31);
    }

    public final String toString() {
        UsbDeviceConnection usbDeviceConnection = this.f2875R;
        int i = this.R;
        return "AttachedDevice(connection=" + usbDeviceConnection + ", vsockFd=" + i + ")";
    }
}
