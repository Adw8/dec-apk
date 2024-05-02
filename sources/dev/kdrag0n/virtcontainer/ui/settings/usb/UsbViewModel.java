package dev.kdrag0n.virtcontainer.ui.settings.usb;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;

/* loaded from: classes.dex */
public final class UsbViewModel extends kvj {
    public final UsbManager R;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f2789R = g4x.O(fcD.R);

    /* renamed from: R  reason: collision with other field name */
    public final lP2 f2790R;
    public final ivW v;

    public UsbViewModel(lP2 lp2) {
        this.f2790R = lp2;
        this.R = lp2.f5713R;
        this.v = lp2.f5716R;
    }

    public final void e(UsbDevice usbDevice) {
        l6.z(gvP.o(this), iFn.f4518R, 0, new jvM(this, usbDevice, null), 2);
    }
}
