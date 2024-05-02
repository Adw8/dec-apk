package dev.kdrag0n.virt.vm;

import android.os.ParcelFileDescriptor;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public final class VmNativeCallback {
    public static final int $stable = 8;
    private final gkP portForwarder;
    private final iHI vmClient;

    public VmNativeCallback(iHI ihi, gkP gkp) {
        this.vmClient = ihi;
        this.portForwarder = gkp;
    }

    @Keep
    public final int connectVsock(int i) {
        try {
            return ((ParcelFileDescriptor) l6.T(aIH.R, new fjb(this, i, null))).detachFd();
        } catch (Exception e) {
            kxm.v("virtc/vmNative", 6, "Failed to connect vsock: " + e, null);
            return -1;
        }
    }

    @Keep
    public final void reportPortForwardFd(int i, int i2, boolean z) {
        gkP gkp = this.portForwarder;
        gkp.getClass();
        pby[] pbyArr = kxm.R;
        if (z) {
            gkp.v.put(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        gkp.f3920R.put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
