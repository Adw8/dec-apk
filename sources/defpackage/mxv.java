package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mxv  reason: default package */
/* loaded from: classes.dex */
public final class mxv {
    public final C7 R;

    /* renamed from: R  reason: collision with other field name */
    public final bV5 f6252R;

    /* renamed from: R  reason: collision with other field name */
    public final bcS f6253R;

    /* renamed from: R  reason: collision with other field name */
    public final List f6254R;

    public mxv(bcS bcs, C7 c7, List list, f_c f_c) {
        this.f6253R = bcs;
        this.R = c7;
        this.f6254R = list;
        this.f6252R = new bV5(new _d(f_c, 19));
    }

    public final List R() {
        return (List) this.f6252R.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mxv) {
            mxv mxv = (mxv) obj;
            if (mxv.f6253R == this.f6253R && n3x.v(mxv.R, this.R) && n3x.v(mxv.R(), R()) && n3x.v(mxv.f6254R, this.f6254R)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.R.hashCode();
        int hashCode2 = R().hashCode();
        return this.f6254R.hashCode() + ((hashCode2 + ((hashCode + ((this.f6253R.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> R = R();
        ArrayList arrayList = new ArrayList(a6.B(R, 10));
        for (Certificate certificate : R) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String obj = arrayList.toString();
        StringBuilder U = opT.U("Handshake{tlsVersion=");
        U.append(this.f6253R);
        U.append(" cipherSuite=");
        U.append(this.R);
        U.append(" peerCertificates=");
        U.append(obj);
        U.append(" localCertificates=");
        List<Certificate> list = this.f6254R;
        ArrayList arrayList2 = new ArrayList(a6.B(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        U.append(arrayList2);
        U.append('}');
        return U.toString();
    }
}
