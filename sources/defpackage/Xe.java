package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: Xe  reason: default package */
/* loaded from: classes.dex */
public final class Xe extends oMv {
    public static final kgV R = new kgV(11, 0);

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f621R;

    static {
        atb.Z();
    }

    public Xe() {
        asQ asq;
        gOQ[] goqArr = new gOQ[4];
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            asq = new asQ(cls);
        } catch (Exception e) {
            oMv.f6773R.getClass();
            oMv.m(5, "unable to load android socket classes", e);
            asq = null;
        }
        goqArr[0] = asq;
        goqArr[1] = new k6G(S5.R);
        goqArr[2] = new k6G(fPz.R);
        goqArr[3] = new k6G(fQ.R);
        ArrayList B = P7.B(goqArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = B.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((gOQ) next).c()) {
                arrayList.add(next);
            }
        }
        this.f621R = arrayList;
    }

    @Override // defpackage.oMv
    public final String O(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f621R.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((gOQ) obj).R(sSLSocket)) {
                break;
            }
        }
        gOQ goq = (gOQ) obj;
        if (goq != null) {
            return goq.e(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.oMv
    public final void X(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            throw e;
        }
    }

    @Override // defpackage.oMv
    public final boolean Z(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.oMv
    public final irJ c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new Ac(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.oMv
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.f621R.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((gOQ) obj).R(sSLSocket)) {
                break;
            }
        }
        gOQ goq = (gOQ) obj;
        if (goq != null) {
            goq.v(sSLSocket, str, list);
        }
    }

    @Override // defpackage.oMv
    public final gQc v(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        ZP zp = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            zp = new ZP(x509TrustManager, x509TrustManagerExtensions);
        }
        return zp != null ? zp : super.v(x509TrustManager);
    }
}
