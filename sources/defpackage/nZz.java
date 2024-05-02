package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: nZz  reason: default package */
/* loaded from: classes.dex */
public final class nZz implements Lh {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f6434R;

    /* renamed from: R  reason: collision with other field name */
    public final SG f6435R;

    /* renamed from: R  reason: collision with other field name */
    public final d2 f6436R;

    /* renamed from: R  reason: collision with other field name */
    public final ezN f6437R;

    /* renamed from: R  reason: collision with other field name */
    public final gQc f6438R;

    /* renamed from: R  reason: collision with other field name */
    public final i97 f6439R;

    /* renamed from: R  reason: collision with other field name */
    public final Proxy f6440R;

    /* renamed from: R  reason: collision with other field name */
    public final ProxySelector f6441R;

    /* renamed from: R  reason: collision with other field name */
    public final List f6442R;

    /* renamed from: R  reason: collision with other field name */
    public final SocketFactory f6443R;

    /* renamed from: R  reason: collision with other field name */
    public final HostnameVerifier f6444R;

    /* renamed from: R  reason: collision with other field name */
    public final SSLSocketFactory f6445R;

    /* renamed from: R  reason: collision with other field name */
    public final X509TrustManager f6446R;

    /* renamed from: R  reason: collision with other field name */
    public final lLp f6447R;

    /* renamed from: R  reason: collision with other field name */
    public final nvJ f6448R;

    /* renamed from: R  reason: collision with other field name */
    public final nxC f6449R;

    /* renamed from: R  reason: collision with other field name */
    public final orq f6450R;

    /* renamed from: R  reason: collision with other field name */
    public final ppf f6451R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6452R;

    /* renamed from: X  reason: collision with other field name */
    public final int f6453X;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public final List f6454c;

    /* renamed from: c  reason: collision with other field name */
    public final boolean f6455c;
    public final int e;

    /* renamed from: e  reason: collision with other field name */
    public final List f6456e;

    /* renamed from: e  reason: collision with other field name */
    public final boolean f6457e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final d2 f6458v;

    /* renamed from: v  reason: collision with other field name */
    public final List f6459v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f6460v;
    public static final List X = khE.X(nX1.HTTP_2, nX1.HTTP_1_1);
    public static final List O = khE.X(mMB.R, mMB.v);

    public nZz(jwR jwr) {
        ProxySelector proxySelector;
        boolean z;
        boolean z2;
        this.f6447R = jwr.f5135R;
        this.f6437R = jwr.f5124R;
        this.f6442R = khE.m(jwr.f5129R);
        this.f6459v = khE.m(jwr.f5144v);
        this.f6449R = jwr.f5137R;
        this.f6452R = jwr.f5140R;
        this.f6460v = jwr.f5146v;
        this.f6436R = jwr.f5123R;
        this.f6455c = jwr.f5141c;
        this.f6457e = jwr.f5142e;
        this.f6448R = jwr.f5136R;
        this.f6450R = jwr.f5138R;
        Proxy proxy = jwr.f5127R;
        this.f6440R = proxy;
        if (proxy != null) {
            proxySelector = fR0.R;
        } else {
            proxySelector = jwr.f5128R;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = fR0.R;
            }
        }
        this.f6441R = proxySelector;
        this.f6458v = jwr.f5143v;
        this.f6443R = jwr.f5131R;
        List<mMB> list = jwr.f5130R;
        this.f6454c = list;
        this.f6456e = jwr.f5145v;
        this.f6444R = jwr.f5132R;
        this.R = jwr.R;
        this.v = jwr.v;
        this.c = jwr.c;
        this.e = jwr.e;
        this.f6453X = jwr.X;
        this.f6434R = jwr.f5121R;
        ppf ppf = jwr.f5139R;
        this.f6451R = ppf == null ? new ppf() : ppf;
        i97 i97 = jwr.f5126R;
        this.f6439R = i97 == null ? i97.R : i97;
        boolean z3 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (mMB mmb : list) {
                if (mmb.f6009R) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            this.f6445R = null;
            this.f6438R = null;
            this.f6446R = null;
            this.f6435R = SG.R;
        } else {
            SSLSocketFactory sSLSocketFactory = jwr.f5133R;
            if (sSLSocketFactory != null) {
                this.f6445R = sSLSocketFactory;
                gQc gqc = jwr.f5125R;
                this.f6438R = gqc;
                this.f6446R = jwr.f5134R;
                SG sg = jwr.f5122R;
                this.f6435R = !n3x.v(sg.f510R, gqc) ? new SG(sg.f511R, gqc) : sg;
            } else {
                oMv omv = oMv.f6773R;
                X509TrustManager C = oMv.f6773R.C();
                this.f6446R = C;
                this.f6445R = oMv.f6773R.U(C);
                gQc v = oMv.f6773R.v(C);
                this.f6438R = v;
                SG sg2 = jwr.f5122R;
                this.f6435R = !n3x.v(sg2.f510R, v) ? new SG(sg2.f511R, v) : sg2;
            }
        }
        if (!(!this.f6442R.contains(null))) {
            StringBuilder U = opT.U("Null interceptor: ");
            U.append(this.f6442R);
            throw new IllegalStateException(U.toString().toString());
        } else if (!this.f6459v.contains(null)) {
            List<mMB> list2 = this.f6454c;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (mMB mmb2 : list2) {
                    if (mmb2.f6009R) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                if (!(this.f6445R == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!(this.f6438R == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!(this.f6446R == null ? true : z3)) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!n3x.v(this.f6435R, SG.R)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else if (this.f6445R == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            } else if (this.f6438R == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            } else if (this.f6446R == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
        } else {
            StringBuilder U2 = opT.U("Null network interceptor: ");
            U2.append(this.f6459v);
            throw new IllegalStateException(U2.toString().toString());
        }
    }

    public final jwR R() {
        jwR jwr = new jwR();
        jwr.f5135R = this.f6447R;
        jwr.f5124R = this.f6437R;
        s3.E(this.f6442R, jwr.f5129R);
        s3.E(this.f6459v, jwr.f5144v);
        jwr.f5137R = this.f6449R;
        jwr.f5140R = this.f6452R;
        jwr.f5146v = this.f6460v;
        jwr.f5123R = this.f6436R;
        jwr.f5141c = this.f6455c;
        jwr.f5142e = this.f6457e;
        jwr.f5136R = this.f6448R;
        jwr.f5138R = this.f6450R;
        jwr.f5127R = this.f6440R;
        jwr.f5128R = this.f6441R;
        jwr.f5143v = this.f6458v;
        jwr.f5131R = this.f6443R;
        jwr.f5133R = this.f6445R;
        jwr.f5134R = this.f6446R;
        jwr.f5130R = this.f6454c;
        jwr.f5145v = this.f6456e;
        jwr.f5132R = this.f6444R;
        jwr.f5122R = this.f6435R;
        jwr.f5125R = this.f6438R;
        jwr.R = this.R;
        jwr.v = this.v;
        jwr.c = this.c;
        jwr.e = this.e;
        jwr.X = this.f6453X;
        jwr.f5121R = this.f6434R;
        jwr.f5139R = this.f6451R;
        jwr.f5126R = this.f6439R;
        return jwr;
    }
}
