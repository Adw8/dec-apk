package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: jEB  reason: default package */
/* loaded from: classes.dex */
public final class jEB implements oCF, jFB {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public dxP f4866R;

    /* renamed from: R  reason: collision with other field name */
    public final fuY f4867R;

    /* renamed from: R  reason: collision with other field name */
    public final fve f4868R;

    /* renamed from: R  reason: collision with other field name */
    public final j0 f4869R;

    /* renamed from: R  reason: collision with other field name */
    public Socket f4870R;

    /* renamed from: R  reason: collision with other field name */
    public final List f4871R;

    /* renamed from: R  reason: collision with other field name */
    public final lMx f4872R;

    /* renamed from: R  reason: collision with other field name */
    public mxv f4873R;

    /* renamed from: R  reason: collision with other field name */
    public nX1 f4874R;

    /* renamed from: R  reason: collision with other field name */
    public final nZz f4875R;

    /* renamed from: R  reason: collision with other field name */
    public oDA f4876R;

    /* renamed from: R  reason: collision with other field name */
    public ot7 f4877R;

    /* renamed from: R  reason: collision with other field name */
    public final ppN f4878R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4879R;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public Socket f4880v;

    /* renamed from: v  reason: collision with other field name */
    public volatile boolean f4881v;

    public jEB(nZz nzz, lMx lmx, fve fve, fuY fuy, List list, int i, j0 j0Var, int i2, boolean z) {
        this.f4875R = nzz;
        this.f4872R = lmx;
        this.f4868R = fve;
        this.f4867R = fuy;
        this.f4871R = list;
        this.R = i;
        this.f4869R = j0Var;
        this.v = i2;
        this.f4879R = z;
        this.f4878R = lmx.X;
    }

    public final jEB C(List list, SSLSocket sSLSocket) {
        if (this.v != -1) {
            return this;
        }
        jEB U = U(list, sSLSocket);
        if (U != null) {
            return U;
        }
        StringBuilder U2 = opT.U("Unable to find acceptable protocols. isFallback=");
        U2.append(this.f4879R);
        U2.append(", modes=");
        U2.append(list);
        U2.append(", supported protocols=");
        U2.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(U2.toString());
    }

    public final cMR H() {
        j0 j0Var = this.f4869R;
        a7_ a7_ = this.f4867R.R.f3093R;
        StringBuilder U = opT.U("CONNECT ");
        U.append(khE.Z(a7_, true));
        U.append(" HTTP/1.1");
        String sb = U.toString();
        oDA oda = this.f4876R;
        dxP dxp = this.f4866R;
        oIS ois = new oIS(null, this, oda, dxp);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oda.e().L((long) this.f4875R.c, timeUnit);
        dxp.e().L((long) this.f4875R.e, timeUnit);
        ois.H((bd4) j0Var.c, sb);
        ois.R();
        eUn Z = ois.Z(false);
        Z.f3115R = j0Var;
        dEt R = Z.R();
        long e = khE.e(R);
        if (e != -1) {
            bhS x = ois.x(e);
            khE.O(x, Integer.MAX_VALUE, timeUnit);
            x.close();
        }
        int i = R.e;
        if (i == 200) {
            return new cMR(this, (Throwable) null, 6);
        }
        if (i == 407) {
            this.f4867R.R.f3094R.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        StringBuilder U2 = opT.U("Unexpected response code for CONNECT: ");
        U2.append(R.e);
        throw new IOException(U2.toString());
    }

    @Override // defpackage.oCF
    public final ot7 L() {
        ppf ppf = this.f4872R.f5671R.f6451R;
        fuY fuy = this.f4867R;
        synchronized (ppf) {
            ppf.R.remove(fuy);
        }
        d95 e = this.f4868R.e(this, this.f4871R);
        if (e != null) {
            return e.R;
        }
        ot7 ot7 = this.f4877R;
        synchronized (ot7) {
            l_c l_c = (l_c) this.f4875R.f6437R.R;
            l_c.getClass();
            bd4 bd4 = khE.R;
            l_c.f5783R.add(ot7);
            l_c.f5782R.e(l_c.f5781R, 0);
            this.f4872R.e(ot7);
        }
        this.f4878R.getClass();
        return ot7;
    }

    @Override // defpackage.oCF
    public final oCF O() {
        return new jEB(this.f4875R, this.f4872R, this.f4868R, this.f4867R, this.f4871R, this.R, this.f4869R, this.v, this.f4879R);
    }

    @Override // defpackage.jFB
    public final void R(lMx lmx, IOException iOException) {
    }

    public final jEB U(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        int size = list.size();
        for (int i = this.v + 1; i < size; i++) {
            mMB mmb = (mMB) list.get(i);
            if (mmb.f6009R && ((strArr = mmb.f6012v) == null || asb.X(strArr, sSLSocket.getEnabledProtocols(), oww.R)) && ((strArr2 = mmb.f6010R) == null || asb.X(strArr2, sSLSocket.getEnabledCipherSuites(), C7.f49R))) {
                return new jEB(this.f4875R, this.f4872R, this.f4868R, this.f4867R, this.f4871R, this.R, this.f4869R, i, this.v != -1);
            }
        }
        return null;
    }

    @Override // defpackage.oCF
    public final cMR X() {
        Throwable th;
        Socket socket;
        IOException e;
        Socket socket2;
        boolean z = true;
        boolean z2 = false;
        if (this.f4870R == null) {
            try {
                this.f4872R.f5668R.add(this);
            } catch (Throwable th2) {
                th = th2;
                z2 = true;
            }
            try {
                ppN ppn = this.f4878R;
                InetSocketAddress inetSocketAddress = this.f4867R.f3584R;
                ppn.getClass();
                m();
                try {
                    cMR cmr = new cMR(this, (Throwable) null, 6);
                    this.f4872R.f5668R.remove(this);
                    return cmr;
                } catch (IOException e2) {
                    e = e2;
                    ppN ppn2 = this.f4878R;
                    InetSocketAddress inetSocketAddress2 = this.f4867R.f3584R;
                    ppn2.getClass();
                    cMR cmr2 = new cMR(this, e, 2);
                    this.f4872R.f5668R.remove(this);
                    if (!z && (socket2 = this.f4870R) != null) {
                        khE.v(socket2);
                    }
                    return cmr2;
                }
            } catch (IOException e3) {
                e = e3;
                z = false;
            } catch (Throwable th3) {
                th = th3;
                this.f4872R.f5668R.remove(this);
                if (!z2 && (socket = this.f4870R) != null) {
                    khE.v(socket);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("TCP already connected".toString());
        }
    }

    @Override // defpackage.jFB
    public final fuY Z() {
        return this.f4867R;
    }

    @Override // defpackage.jFB
    public final void c() {
    }

    @Override // defpackage.oCF
    public final void cancel() {
        this.f4881v = true;
        Socket socket = this.f4870R;
        if (socket != null) {
            khE.v(socket);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012b A[Catch: all -> 0x016e, TryCatch #4 {all -> 0x016e, blocks: (B:70:0x011c, B:72:0x012b, B:75:0x0130, B:78:0x0135, B:80:0x0139, B:83:0x0142, B:86:0x0147, B:93:0x0151), top: B:121:0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015f  */
    @Override // defpackage.oCF
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cMR e() {
        /*
        // Method dump skipped, instructions count: 416
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jEB.e():cMR");
    }

    public final void m() {
        Proxy.Type type = this.f4867R.f3585R.type();
        int i = type == null ? -1 : eZ_.R[type.ordinal()];
        Socket createSocket = (i == 1 || i == 2) ? this.f4867R.R.f3098R.createSocket() : new Socket(this.f4867R.f3585R);
        this.f4870R = createSocket;
        if (!this.f4881v) {
            createSocket.setSoTimeout(this.f4875R.c);
            try {
                oMv omv = oMv.f6773R;
                oMv.f6773R.X(createSocket, this.f4867R.f3584R, this.f4875R.v);
                try {
                    this.f4876R = new oDA(mLz.V(createSocket));
                    this.f4866R = new dxP(mLz.i(createSocket));
                } catch (NullPointerException e) {
                    if (n3x.v(e.getMessage(), "throw with null exception")) {
                        throw new IOException(e);
                    }
                }
            } catch (ConnectException e2) {
                StringBuilder U = opT.U("Failed to connect to ");
                U.append(this.f4867R.f3584R);
                ConnectException connectException = new ConnectException(U.toString());
                connectException.initCause(e2);
                throw connectException;
            }
        } else {
            throw new IOException("canceled");
        }
    }

    @Override // defpackage.oCF
    public final boolean v() {
        return this.f4874R != null;
    }

    public final void x(SSLSocket sSLSocket, mMB mmb) {
        eS eSVar = this.f4867R.R;
        try {
            if (mmb.f6011v) {
                oMv omv = oMv.f6773R;
                oMv.f6773R.e(sSLSocket, eSVar.f3093R.e, eSVar.f3097R);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            mxv g = hw1.g(session);
            String str = null;
            if (!eSVar.f3099R.verify(eSVar.f3093R.e, session)) {
                List R = g.R();
                if (!R.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) R.get(0);
                    StringBuilder sb = new StringBuilder();
                    sb.append("\n            |Hostname ");
                    sb.append(eSVar.f3093R.e);
                    sb.append(" not verified:\n            |    certificate: ");
                    SG sg = SG.R;
                    if (x509Certificate instanceof X509Certificate) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("sha256/");
                        F6 f6 = F6.R;
                        F6 O = kgV.O(x509Certificate.getPublicKey().getEncoded());
                        MessageDigest instance = MessageDigest.getInstance("SHA-256");
                        instance.update(O.f115R, 0, O.v());
                        sb2.append(g5O.R(instance.digest(), g5O.R));
                        sb.append(sb2.toString());
                        sb.append("\n            |    DN: ");
                        sb.append(x509Certificate.getSubjectDN().getName());
                        sb.append("\n            |    subjectAltNames: ");
                        sb.append(dF.cE(mdP.R(x509Certificate, 2), mdP.R(x509Certificate, 7)));
                        sb.append("\n            ");
                        throw new SSLPeerUnverifiedException(n3x.K(sb.toString()));
                    }
                    throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
                }
                throw new SSLPeerUnverifiedException("Hostname " + eSVar.f3093R.e + " not verified (no certificates)");
            }
            SG sg2 = eSVar.R;
            this.f4873R = new mxv(g.f6253R, g.R, g.f6254R, new h31(sg2, g, eSVar, 14));
            String str2 = eSVar.f3093R.e;
            Iterator it = sg2.f511R.iterator();
            if (!it.hasNext()) {
                if (mmb.f6011v) {
                    oMv omv2 = oMv.f6773R;
                    str = oMv.f6773R.O(sSLSocket);
                }
                this.f4880v = sSLSocket;
                this.f4876R = new oDA(mLz.V(sSLSocket));
                this.f4866R = new dxP(mLz.i(sSLSocket));
                this.f4874R = str != null ? hw1.y(str) : nX1.HTTP_1_1;
                oMv omv3 = oMv.f6773R;
                oMv.f6773R.R(sSLSocket);
                return;
            }
            jQ.Y(it.next());
            throw null;
        } catch (Throwable th) {
            oMv omv4 = oMv.f6773R;
            oMv.f6773R.R(sSLSocket);
            khE.v(sSLSocket);
            throw th;
        }
    }
}
