package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: KT  reason: default package */
/* loaded from: classes.dex */
public final class KT extends oMv {
    public static final atb R = new atb(11, 0);

    /* renamed from: R  reason: collision with other field name */
    public static final boolean f260R = atb.Z();

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f261R;

    public KT() {
        gOQ[] goqArr = new gOQ[4];
        goqArr[0] = MB.R.X() ? new MB() : null;
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
        this.f261R = arrayList;
    }

    @Override // defpackage.oMv
    public final Object L() {
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // defpackage.oMv
    public final String O(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f261R.iterator();
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
    public final boolean Z(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.oMv
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.f261R.iterator();
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

    @Override // defpackage.oMv
    public final void x(Object obj, String str) {
        if (obj != null) {
            ((CloseGuard) obj).warnIfOpen();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.util.CloseGuard");
    }
}
