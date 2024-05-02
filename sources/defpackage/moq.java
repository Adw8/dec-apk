package defpackage;

import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* renamed from: moq  reason: default package */
/* loaded from: classes.dex */
public final class moq extends oMv {
    public static final kgV R = new kgV(13, 0);

    /* renamed from: R  reason: collision with other field name */
    public static final boolean f6165R;

    /* renamed from: R  reason: collision with other field name */
    public final Provider f6166R = new OpenJSSE();

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, kgV.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f6165R = z;
    }

    @Override // defpackage.oMv
    public final X509TrustManager C() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f6166R);
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
        return SSLContext.getInstance("TLSv1.3", this.f6166R);
    }

    @Override // defpackage.oMv
    public final String O(SSLSocket sSLSocket) {
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (!(applicationProtocol == null ? true : n3x.v(applicationProtocol, ""))) {
                return applicationProtocol;
            }
        }
        return null;
    }

    @Override // defpackage.oMv
    public final void e(SSLSocket sSLSocket, String str, List list) {
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                ArrayList R2 = atb.R(list);
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = R2.toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
    }
}
