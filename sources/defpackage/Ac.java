package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: Ac  reason: default package */
/* loaded from: classes.dex */
public final class Ac implements irJ {
    public final Method R;

    /* renamed from: R  reason: collision with other field name */
    public final X509TrustManager f3R;

    public Ac(X509TrustManager x509TrustManager, Method method) {
        this.f3R = x509TrustManager;
        this.R = method;
    }

    @Override // defpackage.irJ
    public final X509Certificate R(X509Certificate x509Certificate) {
        try {
            Object invoke = this.R.invoke(this.f3R, x509Certificate);
            if (invoke != null) {
                return ((TrustAnchor) invoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ac)) {
            return false;
        }
        Ac ac = (Ac) obj;
        return n3x.v(this.f3R, ac.f3R) && n3x.v(this.R, ac.R);
    }

    public final int hashCode() {
        return this.R.hashCode() + (this.f3R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("CustomTrustRootIndex(trustManager=");
        U.append(this.f3R);
        U.append(", findByIssuerAndSignatureMethod=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
