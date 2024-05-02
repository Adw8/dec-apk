package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: oMv  reason: default package */
/* loaded from: classes.dex */
public class oMv {
    public static final Logger R;

    /* renamed from: R  reason: collision with other field name */
    public static volatile oMv f6773R;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        if (r0 != null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b9, code lost:
        if (r0 != null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        if (r0 != null) goto L_0x0095;
     */
    static {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oMv.<clinit>():void");
    }

    public static void m(int i, String str, Throwable th) {
        R.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public X509TrustManager C() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder U = opT.U("Unexpected default trust managers: ");
        U.append(Arrays.toString(trustManagers));
        throw new IllegalStateException(U.toString().toString());
    }

    public SSLContext H() {
        return SSLContext.getInstance("TLS");
    }

    public Object L() {
        if (R.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public String O(SSLSocket sSLSocket) {
        return null;
    }

    public void R(SSLSocket sSLSocket) {
    }

    public SSLSocketFactory U(X509TrustManager x509TrustManager) {
        try {
            SSLContext H = H();
            H.init(null, new TrustManager[]{x509TrustManager}, null);
            return H.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public void X(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public boolean Z(String str) {
        return true;
    }

    public irJ c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new Qb((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public gQc v(X509TrustManager x509TrustManager) {
        return new ds(c(x509TrustManager));
    }

    public void x(Object obj, String str) {
        if (obj == null) {
            str = opT.H(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m(5, str, (Throwable) obj);
    }
}
