package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbFragment;

/* renamed from: bTd  reason: default package */
/* loaded from: classes.dex */
public final class bTd extends BroadcastReceiver {
    public final /* synthetic */ UsbFragment R;

    public bTd(UsbFragment usbFragment) {
        this.R = usbFragment;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        UsbDevice usbDevice;
        pby[] pbyArr = kxm.R;
        if (n3x.v(intent.getAction(), "dev.kdrag0n.virtcontainer.USB_PERMISSION_RESULT") && (usbDevice = (UsbDevice) intent.getParcelableExtra("device", UsbDevice.class)) != null) {
            if (intent.getBooleanExtra("permission", false)) {
                kxm.v(cUF.v(this), 4, "Permission granted", null);
                this.R.D().e(usbDevice);
            } else {
                kxm.v(cUF.v(this), 4, "Permission denied: " + usbDevice, null);
            }
            this.R.k().unregisterReceiver(this);
            this.R.t = false;
        }
    }
}
