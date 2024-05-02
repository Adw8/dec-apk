package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: ZP  reason: default package */
/* loaded from: classes.dex */
public final class ZP extends gQc {
    public final X509TrustManagerExtensions R;

    /* renamed from: R  reason: collision with other field name */
    public final X509TrustManager f664R;

    public ZP(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f664R = x509TrustManager;
        this.R = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ZP) && ((ZP) obj).f664R == this.f664R;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f664R);
    }

    @Override // defpackage.gQc
    public final List j(String str, List list) {
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                return this.R.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
