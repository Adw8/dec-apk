package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: bf5  reason: default package */
/* loaded from: classes.dex */
public final class bf5 {
    public static final boolean R(bf5 bf5, int i) {
        boolean z;
        bf5.getClass();
        byte[] array = ByteBuffer.allocate(4).order(ByteOrder.nativeOrder()).putInt(i).array();
        Iterator it = a6.G(new dZs(NetworkInterface.getNetworkInterfaces())).iterator();
        do {
            z = false;
            if (it.hasNext()) {
                Iterator it2 = a6.G(new dZs(((NetworkInterface) it.next()).getInetAddresses())).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Arrays.equals(array, ((InetAddress) it2.next()).getAddress())) {
                            z = true;
                            continue;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    public static boolean v(int i) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(InetAddress.getLoopbackAddress(), i), 1);
            dTl.V(serverSocket, null);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }
}
