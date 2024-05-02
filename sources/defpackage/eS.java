package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: eS  reason: default package */
/* loaded from: classes.dex */
public final class eS {
    public final SG R;

    /* renamed from: R  reason: collision with other field name */
    public final a7_ f3093R;

    /* renamed from: R  reason: collision with other field name */
    public final d2 f3094R;

    /* renamed from: R  reason: collision with other field name */
    public final Proxy f3095R;

    /* renamed from: R  reason: collision with other field name */
    public final ProxySelector f3096R;

    /* renamed from: R  reason: collision with other field name */
    public final List f3097R;

    /* renamed from: R  reason: collision with other field name */
    public final SocketFactory f3098R;

    /* renamed from: R  reason: collision with other field name */
    public final HostnameVerifier f3099R;

    /* renamed from: R  reason: collision with other field name */
    public final SSLSocketFactory f3100R;

    /* renamed from: R  reason: collision with other field name */
    public final orq f3101R;
    public final List v;

    public eS(String str, int i, orq orq, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, SG sg, d2 d2Var, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        this.f3101R = orq;
        this.f3098R = socketFactory;
        this.f3100R = sSLSocketFactory;
        this.f3099R = hostnameVerifier;
        this.R = sg;
        this.f3094R = d2Var;
        this.f3095R = proxy;
        this.f3096R = proxySelector;
        hro hro = new hro();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        boolean z = true;
        if (iH_.Q(str2, "http")) {
            hro.f4404R = "http";
        } else if (iH_.Q(str2, "https")) {
            hro.f4404R = "https";
        } else {
            throw new IllegalArgumentException(opT.H("unexpected scheme: ", str2));
        }
        String V = n3x.V(ppN.g(str, 0, 0, false, 7));
        if (V != null) {
            hro.e = V;
            if ((1 > i || i >= 65536) ? false : z) {
                hro.R = i;
                this.f3093R = hro.v();
                this.f3097R = khE.m(list);
                this.v = khE.m(list2);
                return;
            }
            throw new IllegalArgumentException(opT.Z("unexpected port: ", i).toString());
        }
        throw new IllegalArgumentException(opT.H("unexpected host: ", str));
    }

    public final boolean R(eS eSVar) {
        return n3x.v(this.f3101R, eSVar.f3101R) && n3x.v(this.f3094R, eSVar.f3094R) && n3x.v(this.f3097R, eSVar.f3097R) && n3x.v(this.v, eSVar.v) && n3x.v(this.f3096R, eSVar.f3096R) && n3x.v(this.f3095R, eSVar.f3095R) && n3x.v(this.f3100R, eSVar.f3100R) && n3x.v(this.f3099R, eSVar.f3099R) && n3x.v(this.R, eSVar.R) && this.f3093R.f737R == eSVar.f3093R.f737R;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eS) {
            eS eSVar = (eS) obj;
            if (n3x.v(this.f3093R, eSVar.f3093R) && R(eSVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f3101R.hashCode();
        int hashCode2 = this.f3094R.hashCode();
        int hashCode3 = this.f3097R.hashCode();
        int hashCode4 = this.v.hashCode();
        int hashCode5 = this.f3096R.hashCode();
        int hashCode6 = Objects.hashCode(this.f3095R);
        int hashCode7 = Objects.hashCode(this.f3100R);
        int hashCode8 = Objects.hashCode(this.f3099R);
        return Objects.hashCode(this.R) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f3093R.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder U = opT.U("Address{");
        U.append(this.f3093R.e);
        U.append(':');
        U.append(this.f3093R.f737R);
        U.append(", ");
        if (this.f3095R != null) {
            sb = opT.U("proxy=");
            obj = this.f3095R;
        } else {
            sb = opT.U("proxySelector=");
            obj = this.f3096R;
        }
        sb.append(obj);
        U.append(sb.toString());
        U.append('}');
        return U.toString();
    }
}
