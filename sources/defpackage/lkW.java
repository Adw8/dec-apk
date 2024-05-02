package defpackage;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* renamed from: lkW  reason: default package */
/* loaded from: classes.dex */
public final class lkW extends oMv {
    public static final boolean R;

    /* renamed from: R  reason: collision with other field name */
    public final Provider f5810R = Conscrypt.newProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, e23.class.getClassLoader());
            z = true;
            if (Conscrypt.isAvailable()) {
                if (e23.R()) {
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        R = z;
    }

    @Override // defpackage.oMv
    public final X509TrustManager C() {
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
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, ikf.R);
                return x509TrustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder U = opT.U("Unexpected default trust managers: ");
        U.append(Arrays.toString(trustManagers));
        throw new IllegalStateException(U.toString().toString());
    }

    @Override // defpackage.oMv
    public final SSLContext H() {
        return SSLContext.getInstance("TLS", this.f5810R);
    }

    @Override // defpackage.oMv
    public final String O(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.oMv
    public final SSLSocketFactory U(X509TrustManager x509TrustManager) {
        SSLContext H = H();
        H.init(null, new TrustManager[]{x509TrustManager}, null);
        return H.getSocketFactory();
    }

    @Override // defpackage.oMv
    public final void e(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = atb.R(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
