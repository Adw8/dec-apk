package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: fuY  reason: default package */
/* loaded from: classes.dex */
public final class fuY {
    public final eS R;

    /* renamed from: R  reason: collision with other field name */
    public final InetSocketAddress f3584R;

    /* renamed from: R  reason: collision with other field name */
    public final Proxy f3585R;

    public fuY(eS eSVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.R = eSVar;
        this.f3585R = proxy;
        this.f3584R = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fuY) {
            fuY fuy = (fuY) obj;
            if (n3x.v(fuy.R, this.R) && n3x.v(fuy.f3585R, this.f3585R) && n3x.v(fuy.f3584R, this.f3584R)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f3585R.hashCode();
        return this.f3584R.hashCode() + ((hashCode + ((this.R.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        String str = this.R.f3093R.e;
        InetAddress address = this.f3584R.getAddress();
        String V = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : n3x.V(hostAddress);
        if (iH_.h(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (this.R.f3093R.f737R != this.f3584R.getPort() || n3x.v(str, V)) {
            sb.append(":");
            sb.append(this.R.f3093R.f737R);
        }
        if (!n3x.v(str, V)) {
            if (n3x.v(this.f3585R, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (V == null) {
                sb.append("<unresolved>");
            } else if (iH_.h(V, ':')) {
                sb.append("[");
                sb.append(V);
                sb.append("]");
            } else {
                sb.append(V);
            }
            sb.append(":");
            sb.append(this.f3584R.getPort());
        }
        return sb.toString();
    }
}
