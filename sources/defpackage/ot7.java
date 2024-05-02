package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ot7  reason: default package */
/* loaded from: classes.dex */
public final class ot7 extends bqM implements jFB {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public Jl f6997R;

    /* renamed from: R  reason: collision with other field name */
    public NV f6998R;

    /* renamed from: R  reason: collision with other field name */
    public final fuY f6999R;

    /* renamed from: R  reason: collision with other field name */
    public final i97 f7000R;

    /* renamed from: R  reason: collision with other field name */
    public Socket f7001R;

    /* renamed from: R  reason: collision with other field name */
    public jr5 f7003R;

    /* renamed from: R  reason: collision with other field name */
    public mxv f7004R;

    /* renamed from: R  reason: collision with other field name */
    public nX1 f7005R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7006R;
    public int c;
    public int e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public Socket f7007v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f7008v;
    public int X = 1;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f7002R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public long f6996R = Long.MAX_VALUE;

    public ot7(i97 i97, fuY fuy, Socket socket, Socket socket2, mxv mxv, nX1 nx1, oDA oda, dxP dxp, int i) {
        this.f7000R = i97;
        this.f6999R = fuy;
        this.f7001R = socket;
        this.f7007v = socket2;
        this.f7004R = mxv;
        this.f7005R = nx1;
        this.f6997R = oda;
        this.f6998R = dxp;
        this.R = i;
    }

    public static void X(nZz nzz, fuY fuy, IOException iOException) {
        if (fuy.f3585R.type() != Proxy.Type.DIRECT) {
            eS eSVar = fuy.R;
            eSVar.f3096R.connectFailed(eSVar.f3093R.Z(), fuy.f3585R.address(), iOException);
        }
        ppf ppf = nzz.f6451R;
        synchronized (ppf) {
            ppf.R.add(fuy);
        }
    }

    public final boolean L(boolean z) {
        long j;
        bd4 bd4 = khE.R;
        long nanoTime = System.nanoTime();
        Socket socket = this.f7001R;
        Socket socket2 = this.f7007v;
        Jl jl = this.f6997R;
        boolean z2 = false;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        jr5 jr5 = this.f7003R;
        if (jr5 != null) {
            synchronized (jr5) {
                if (jr5.f5049v) {
                    return false;
                }
                if (jr5.f5045e < jr5.f5043c) {
                    if (nanoTime >= jr5.f5042X) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.f6996R;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            socket2.setSoTimeout(1);
            z2 = !jl.r();
            socket2.setSoTimeout(soTimeout);
            return z2;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return z2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (((r0.isEmpty() ^ true) && defpackage.mdP.v(r7.e, (java.security.cert.X509Certificate) r0.get(0))) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean O(defpackage.eS r6, java.util.List r7) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot7.O(eS, java.util.List):boolean");
    }

    @Override // defpackage.jFB
    public final synchronized void R(lMx lmx, IOException iOException) {
        if (!(iOException instanceof aXf)) {
            if (!(this.f7003R != null) || (iOException instanceof iJY)) {
                this.f7006R = true;
                if (this.c == 0) {
                    if (iOException != null) {
                        X(lmx.f5671R, this.f6999R, iOException);
                    }
                    this.v++;
                }
            }
        } else if (((aXf) iOException).R == gtp.REFUSED_STREAM) {
            int i = this.e + 1;
            this.e = i;
            if (i > 1) {
                this.f7006R = true;
                this.v++;
            }
        } else if (((aXf) iOException).R != gtp.CANCEL || !lmx.O) {
            this.f7006R = true;
            this.v++;
        }
    }

    @Override // defpackage.jFB
    public final fuY Z() {
        return this.f6999R;
    }

    @Override // defpackage.jFB
    public final synchronized void c() {
        this.f7006R = true;
    }

    @Override // defpackage.jFB
    public final void cancel() {
        Socket socket = this.f7001R;
        if (socket != null) {
            khE.v(socket);
        }
    }

    @Override // defpackage.bqM
    public final void e(dj8 dj8) {
        dj8.c(gtp.REFUSED_STREAM, null);
    }

    public final void m() {
        this.f6996R = System.nanoTime();
        nX1 nx1 = this.f7005R;
        if (nx1 == nX1.HTTP_2 || nx1 == nX1.H2_PRIOR_KNOWLEDGE) {
            Socket socket = this.f7007v;
            Jl jl = this.f6997R;
            NV nv = this.f6998R;
            socket.setSoTimeout(0);
            gMd gmd = new gMd(this.f7000R);
            String str = this.f6999R.R.f3093R.e;
            gmd.f3741R = socket;
            gmd.f3740R = khE.f5394R + ' ' + str;
            gmd.f3736R = jl;
            gmd.f3737R = nv;
            gmd.f3738R = this;
            gmd.R = this.R;
            jr5 jr5 = new jr5(gmd);
            this.f7003R = jr5;
            oWQ owq = jr5.c;
            this.X = (owq.R & 16) != 0 ? owq.f6840R[4] : Integer.MAX_VALUE;
            gtV gtv = jr5.f5032R;
            synchronized (gtv) {
                if (gtv.v) {
                    throw new IOException("closed");
                } else if (gtv.f3968R) {
                    Logger logger = gtV.R;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(khE.c(">> CONNECTION " + dDc.R.c(), new Object[0]));
                    }
                    gtv.f3966R.y(dDc.R);
                    gtv.f3966R.flush();
                }
            }
            gtV gtv2 = jr5.f5032R;
            oWQ owq2 = jr5.f5040R;
            synchronized (gtv2) {
                if (!gtv2.v) {
                    gtv2.X(0, Integer.bitCount(owq2.R) * 6, 4, 0);
                    int i = 0;
                    while (i < 10) {
                        boolean z = true;
                        if (((1 << i) & owq2.R) == 0) {
                            z = false;
                        }
                        if (z) {
                            gtv2.f3966R.V(i != 4 ? i != 7 ? i : 4 : 3);
                            gtv2.f3966R.z(owq2.f6840R[i]);
                        }
                        i++;
                    }
                    gtv2.f3966R.flush();
                } else {
                    throw new IOException("closed");
                }
            }
            int R = jr5.f5040R.R();
            if (R != 65535) {
                jr5.f5032R.C((long) (R - 65535), 0);
            }
            hiT.c(jr5.f5034R.O(), jr5.f5035R, jr5.f5039R);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder U = opT.U("Connection{");
        U.append(this.f6999R.R.f3093R.e);
        U.append(':');
        U.append(this.f6999R.R.f3093R.f737R);
        U.append(", proxy=");
        U.append(this.f6999R.f3585R);
        U.append(" hostAddress=");
        U.append(this.f6999R.f3584R);
        U.append(" cipherSuite=");
        mxv mxv = this.f7004R;
        if (mxv == null || (obj = mxv.R) == null) {
            obj = "none";
        }
        U.append(obj);
        U.append(" protocol=");
        U.append(this.f7005R);
        U.append('}');
        return U.toString();
    }

    @Override // defpackage.bqM
    public final synchronized void v(oWQ owq) {
        this.X = (owq.R & 16) != 0 ? owq.f6840R[4] : Integer.MAX_VALUE;
    }
}
