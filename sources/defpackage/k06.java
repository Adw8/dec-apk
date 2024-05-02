package defpackage;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: k06  reason: default package */
/* loaded from: classes.dex */
public final class k06 extends oMv {
    public static final Integer R;

    /* renamed from: R  reason: collision with other field name */
    public static final boolean f5178R;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0.intValue() >= 9) goto L_0x0028;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r0 = defpackage.d6g.Y(r0)
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            defpackage.k06.R = r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001d
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L_0x0027
            goto L_0x0028
        L_0x001d:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x0027
            r0.getMethod(r3, r4)     // Catch: NoSuchMethodException -> 0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r2
        L_0x0028:
            defpackage.k06.f5178R = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k06.<clinit>():void");
    }

    @Override // defpackage.oMv
    public final SSLContext H() {
        Integer num = R;
        if (num != null && num.intValue() >= 9) {
            return SSLContext.getInstance("TLS");
        }
        try {
            return SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            return SSLContext.getInstance("TLS");
        }
    }

    @Override // defpackage.oMv
    public final String O(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
        } catch (UnsupportedOperationException unused) {
        }
        if (applicationProtocol == null ? true : n3x.v(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.oMv
    public final void e(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = atb.R(list).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
