package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: mMB  reason: default package */
/* loaded from: classes.dex */
public final class mMB {
    public static final mMB R;
    public static final mMB v = new mMB(false, false, null, null);

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6009R;

    /* renamed from: R  reason: collision with other field name */
    public final String[] f6010R;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f6011v;

    /* renamed from: v  reason: collision with other field name */
    public final String[] f6012v;

    static {
        C7 c7 = C7.N;
        C7 c72 = C7.P;
        C7 c73 = C7.j;
        C7 c74 = C7.Z;
        C7 c75 = C7.x;
        C7 c76 = C7.m;
        C7 c77 = C7.H;
        C7 c78 = C7.C;
        C7 c79 = C7.U;
        C7[] c7Arr = {c7, c72, c73, c74, c75, c76, c77, c78, c79};
        C7[] c7Arr2 = {c7, c72, c73, c74, c75, c76, c77, c78, c79, C7.O, C7.L, C7.e, C7.X, C7.v, C7.c, C7.R};
        fd9 fd9 = new fd9();
        fd9.v((C7[]) Arrays.copyOf(c7Arr, 9));
        bcS bcs = bcS.TLS_1_3;
        bcS bcs2 = bcS.TLS_1_2;
        fd9.X(bcs, bcs2);
        fd9.e();
        fd9.R();
        fd9 fd92 = new fd9();
        fd92.v((C7[]) Arrays.copyOf(c7Arr2, 16));
        fd92.X(bcs, bcs2);
        fd92.e();
        R = fd92.R();
        fd9 fd93 = new fd9();
        fd93.v((C7[]) Arrays.copyOf(c7Arr2, 16));
        fd93.X(bcs, bcs2, bcS.TLS_1_1, bcS.TLS_1_0);
        fd93.e();
        fd93.R();
    }

    public mMB(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f6009R = z;
        this.f6011v = z2;
        this.f6010R = strArr;
        this.f6012v = strArr2;
    }

    public final void R(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        String[] strArr = this.f6010R;
        if (strArr != null) {
            enabledCipherSuites = asb.m(enabledCipherSuites, strArr, C7.f49R);
        }
        String[] m = this.f6012v != null ? asb.m(sSLSocket.getEnabledProtocols(), this.f6012v, oww.R) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        gvk gvk = C7.f49R;
        byte[] bArr = asb.f1481R;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (gvk.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        fd9 fd9 = new fd9(this);
        fd9.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        fd9.O((String[]) Arrays.copyOf(m, m.length));
        mMB R2 = fd9.R();
        if (R2.c() != null) {
            sSLSocket.setEnabledProtocols(R2.f6012v);
        }
        if (R2.v() != null) {
            sSLSocket.setEnabledCipherSuites(R2.f6010R);
        }
    }

    public final List c() {
        String[] strArr = this.f6012v;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(atb.L(str));
        }
        return dF.pG(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mMB)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f6009R;
        mMB mmb = (mMB) obj;
        if (z != mmb.f6009R) {
            return false;
        }
        return !z || (Arrays.equals(this.f6010R, mmb.f6010R) && Arrays.equals(this.f6012v, mmb.f6012v) && this.f6011v == mmb.f6011v);
    }

    public final int hashCode() {
        if (!this.f6009R) {
            return 17;
        }
        String[] strArr = this.f6010R;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f6012v;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (!this.f6011v ? 1 : 0);
    }

    public final String toString() {
        if (!this.f6009R) {
            return "ConnectionSpec()";
        }
        StringBuilder U = opT.U("ConnectionSpec(cipherSuites=");
        U.append(Objects.toString(v(), "[all enabled]"));
        U.append(", tlsVersions=");
        U.append(Objects.toString(c(), "[all enabled]"));
        U.append(", supportsTlsExtensions=");
        U.append(this.f6011v);
        U.append(')');
        return U.toString();
    }

    public final List v() {
        String[] strArr = this.f6010R;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C7.f51R.U(str));
        }
        return dF.pG(arrayList);
    }
}
