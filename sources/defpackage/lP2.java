package defpackage;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import dev.kdrag0n.virt.NativeLib;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: lP2  reason: default package */
/* loaded from: classes.dex */
public final class lP2 {
    public final aME R;

    /* renamed from: R  reason: collision with other field name */
    public final UsbManager f5713R;

    /* renamed from: R  reason: collision with other field name */
    public final iHI f5715R;

    /* renamed from: R  reason: collision with other field name */
    public final j2f f5717R;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f5716R = g4x.O(fcD.R);

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f5718R = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final hgO f5714R = mxC.c();

    public lP2(Context context, iHI ihi, j2f j2f, aME ame) {
        this.f5715R = ihi;
        this.f5717R = j2f;
        this.R = ame;
        Object obj = C1.R;
        this.f5713R = (UsbManager) dmD.v(context, UsbManager.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0170 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(android.hardware.usb.UsbDevice r28, defpackage.aOO r29) {
        /*
        // Method dump skipped, instructions count: 389
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lP2.R(android.hardware.usb.UsbDevice, aOO):java.lang.Object");
    }

    public final o8s v(UsbDevice usbDevice) {
        kxm.v(cUF.v(this), 4, "Remove device: " + usbDevice, null);
        if (!((List) this.f5716R.getValue()).contains(usbDevice)) {
            kxm.v(cUF.v(this), 5, "Device not attached", null);
            return o8s.R;
        }
        int deviceId = usbDevice.getDeviceId();
        int vendorId = usbDevice.getVendorId();
        jjU.X(16);
        String G = iH_.G(Integer.toString(vendorId, 16));
        int productId = usbDevice.getProductId();
        jjU.X(16);
        String G2 = iH_.G(Integer.toString(productId, 16));
        kxm.v("virtc/usbman", 4, "Detach device: vid-pid " + G + ":" + G2 + ", id " + ((deviceId / 1000) + "-" + (deviceId % 1000)) + ", port " + (deviceId + 1000000), null);
        dp dpVar = (dp) this.f5718R.get(usbDevice);
        if (dpVar != null) {
            int i = dpVar.R;
            if (i != -1) {
                NativeLib.h(i);
            }
            dpVar.f2875R.close();
        }
        this.f5718R.remove(usbDevice);
        ivW ivw = this.f5716R;
        ivw.H(dF.cr((Iterable) ivw.getValue(), usbDevice));
        return o8s.R;
    }
}
