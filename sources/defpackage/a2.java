package defpackage;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: a2  reason: default package */
/* loaded from: classes.dex */
public final class a2 extends oMv {
    public static final atb R = new atb(12, 0);

    /* renamed from: R  reason: collision with other field name */
    public static final boolean f718R;

    /* renamed from: R  reason: collision with other field name */
    public final Provider f719R = new BouncyCastleJsseProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, atb.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f718R = z;
    }

    @Override // defpackage.oMv
    public final X509TrustManager C() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    @Override // defpackage.oMv
    public final SSLContext H() {
        return SSLContext.getInstance("TLS", this.f719R);
    }

    @Override // defpackage.oMv
    public final String O(SSLSocket sSLSocket) {
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (!(applicationProtocol == null ? true : n3x.v(applicationProtocol, ""))) {
                return applicationProtocol;
            }
        }
        return null;
    }

    @Override // defpackage.oMv
    public final void e(SSLSocket sSLSocket, String str, List list) {
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = atb.R(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
