package dev.kdrag0n.virt.vm;

import android.os.ParcelFileDescriptor;
import androidx.annotation.Keep;

@Keep
public final class VmNativeCallback {
    private final VmClient vmClient;
    private final PortForwarder portForwarder;

    public VmNativeCallback(VmClient vmClient, PortForwarder portForwarder) {
        this.vmClient = vmClient;
        this.portForwarder = portForwarder;
    }

    @Keep
    public final int connectVsock(int port) {
        try {
            return ((ParcelFileDescriptor) Executor.INSTANCE.execute(() -> vmClient.connectVsock(port))).detachFd();
        } catch (Exception e) {
            Log.e("VmNativeCallback", "Failed to connect vsock: " + e);
            return -1;
        }
    }

    @Keep
    public final void reportPortForwardFd(int vmPort, int hostPort, boolean isTcp) {
        if (isTcp) {
            portForwarder.tcpPorts.put(vmPort, hostPort);
        } else {
            portForwarder.udpPorts.put(vmPort, hostPort);
        }
    }
}
