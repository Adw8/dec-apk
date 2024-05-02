package defpackage;

import java.io.Closeable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: c1p  reason: default package */
/* loaded from: classes.dex */
public final class c1p implements Closeable {
    public dxP R;

    /* renamed from: R  reason: collision with other field name */
    public final String f1930R;

    /* renamed from: R  reason: collision with other field name */
    public Socket f1931R;

    /* renamed from: R  reason: collision with other field name */
    public oDA f1932R;
    public int X = -1;
    public final int e;

    public c1p(int i, String str) {
        this.e = i;
        this.f1930R = str;
        c();
    }

    public final Object O(int i, int i2, g5M g5m) {
        oDA oda = this.f1932R;
        if (oda == null) {
            oda = null;
        }
        short c = oda.c();
        int g = oda.g();
        boolean z = false;
        if (!(g <= 4096)) {
            throw new IllegalArgumentException(opT.Z("Payload size too big: ", g).toString());
        } else if (c != 1) {
            if (c == i) {
                if (i2 == -1 || g == i2) {
                    z = true;
                }
                if (z) {
                    pby[] pbyArr = kxm.R;
                    return g5m.x(oda);
                }
                throw new IllegalArgumentException(jQ.U("Invalid payload size ", g, ", expected ", i2).toString());
            }
            throw new IllegalArgumentException(jQ.U("Expected response ", i, ", got ", c).toString());
        } else {
            throw new j8f(oda.g());
        }
    }

    public final synchronized void R() {
        if (this.f1930R.length() == 64) {
            mox mox = new mox(13, this);
            dxP dxp = this.R;
            if (dxp == null) {
                dxp = null;
            }
            dxp.c(5);
            dxp.m(68);
            mox.x(dxp);
            pby[] pbyArr = kxm.R;
            dxp.flush();
            O(0, 0, g5M.H);
        } else {
            int length = this.f1930R.length();
            throw new IllegalArgumentException(("Invalid key size " + length).toString());
        }
    }

    public final synchronized void X(int i, String str) {
        byte[] z = iH_.z(str);
        int length = z.length + 4;
        mox mox = new mox(14, z);
        dxP dxp = this.R;
        if (dxp == null) {
            dxp = null;
        }
        dxp.c(i);
        dxp.m(length);
        mox.x(dxp);
        pby[] pbyArr = kxm.R;
        dxp.flush();
        O(0, 0, g5M.H);
    }

    public final synchronized void c() {
        if (this.f1931R != null) {
            close();
        }
        Socket socket = new Socket();
        this.f1931R = socket;
        socket.connect(new InetSocketAddress(InetAddress.getLoopbackAddress(), this.e), 1000);
        Socket socket2 = this.f1931R;
        Socket socket3 = null;
        if (socket2 == null) {
            socket2 = null;
        }
        socket2.setTcpNoDelay(true);
        Socket socket4 = this.f1931R;
        if (socket4 == null) {
            socket4 = null;
        }
        socket4.setSoTimeout(2000);
        Socket socket5 = this.f1931R;
        if (socket5 == null) {
            socket5 = null;
        }
        J8 V = mLz.V(socket5);
        hqj e = V.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e.L(2000, timeUnit);
        this.f1932R = new oDA(V);
        Socket socket6 = this.f1931R;
        if (socket6 != null) {
            socket3 = socket6;
        }
        pZ i = mLz.i(socket3);
        i.e().L(1000, timeUnit);
        this.R = new dxP(i);
        int intValue = ((Number) O(2, -1, g5M.x)).intValue();
        this.X = intValue;
        pby[] pbyArr = kxm.R;
        if (intValue == 1) {
            R();
        } else {
            throw new IllegalArgumentException("Unsupported server version " + this.X);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        dxP dxp = this.R;
        Socket socket = null;
        if (dxp == null) {
            dxp = null;
        }
        dxp.close();
        oDA oda = this.f1932R;
        if (oda == null) {
            oda = null;
        }
        oda.close();
        Socket socket2 = this.f1931R;
        if (socket2 != null) {
            socket = socket2;
        }
        socket.close();
    }
}
