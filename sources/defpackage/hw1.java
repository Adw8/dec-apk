package defpackage;

import android.os.LocaleList;
import android.text.method.KeyListener;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Magnifier;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: hw1  reason: default package */
/* loaded from: classes.dex */
public class hw1 implements aqk, ce7, cFS, l9F, e86, oFh, bi_, coB, cHc, c71, dkV, boB, iuk, jOW, jeO {
    public static final hw1 R = new hw1();
    public static final hw1 v = new hw1();
    public static final /* synthetic */ hw1 c = new hw1();
    public static final hw1 e = new hw1();
    public static final hw1 X = new hw1();
    public static final /* synthetic */ hw1 O = new hw1();
    public static final /* synthetic */ hw1 L = new hw1();
    public static final hw1 Z = new hw1();
    public static final hw1 m = new hw1();
    public static final hw1 x = new hw1();
    public static final hw1 H = new hw1();
    public static final hw1 U = new hw1();
    public static final hw1 C = new hw1();
    public static final hw1 N = new hw1();
    public static final hw1 P = new hw1();
    public static final /* synthetic */ hw1 j = new hw1();
    public static final /* synthetic */ hw1 g = new hw1();

    public /* synthetic */ hw1() {
    }

    public static void C(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(jQ.U("index: ", i, ", size: ", i2));
        }
    }

    public static void N(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder y = jQ.y("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            y.append(i3);
            throw new IndexOutOfBoundsException(y.toString());
        } else if (i > i2) {
            throw new IllegalArgumentException(jQ.U("fromIndex: ", i, " > toIndex: ", i2));
        }
    }

    public static iEm P(m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(885588574);
        long X2 = _1.X(opP.f6967v, jr_);
        long X3 = _1.X(20, jr_);
        long v2 = n3.v(_1.X(opP.f6964X, jr_), 0.38f);
        long X4 = _1.X(opP.f6966e, jr_);
        long v3 = n3.v(_1.X(opP.L, jr_), 0.38f);
        long z = aH9.z(n3.v(_1.X(14, jr_), 0.38f), ((E2) jr_.x(_1.R)).o());
        long v4 = n3.v(_1.X(14, jr_), 0.38f);
        int i = opP.O;
        iEm iem = new iEm(X2, X3, v2, X4, v3, z, v4, n3.v(_1.X(i, jr_), 0.38f), n3.v(_1.X(opP.f6963R, jr_), 0.12f), n3.v(_1.X(i, jr_), 0.38f));
        jr_.g(false);
        return iem;
    }

    public static void U(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(jQ.U("index: ", i, ", size: ", i2));
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x0030 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: javax.net.ssl.SSLSession */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.security.cert.Certificate[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v11 */
    public static mxv g(SSLSession sSLSession) {
        SSLSession sSLSession2;
        Object obj;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!(n3x.v(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : n3x.v(cipherSuite, "SSL_NULL_WITH_NULL_NULL"))) {
                C7 U2 = C7.f51R.U(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!n3x.v("NONE", protocol)) {
                    bcS L2 = atb.L(protocol);
                    try {
                        Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                        if (peerCertificates != null) {
                            obj = khE.X(Arrays.copyOf(peerCertificates, peerCertificates.length));
                            sSLSession2 = sSLSession;
                        } else {
                            obj = fcD.R;
                            sSLSession2 = sSLSession;
                        }
                    } catch (SSLPeerUnverifiedException unused) {
                        obj = fcD.R;
                        sSLSession2 = sSLSession;
                    }
                    sSLSession = sSLSession2.getLocalCertificates();
                    return new mxv(L2, U2, sSLSession != 0 ? khE.X(Arrays.copyOf((Object[]) sSLSession, sSLSession.length)) : fcD.R, new bBd(9, obj));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IOException(opT.H("cipherSuite == ", cipherSuite));
            }
        } else {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    public static iwX j(int i) {
        if (i == 0) {
            return mRo.R;
        }
        if (i == 1) {
            return bBw.R;
        }
        if (i == 2) {
            return fed.R;
        }
        throw new IllegalStateException(String.valueOf(i).toString());
    }

    public static d5E t() {
        LocaleList localeList = LocaleList.getDefault();
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new Vg(localeList.get(i)));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(new kA9((Vg) arrayList.get(i2)));
        }
        return new d5E(arrayList2);
    }

    public static nX1 y(String str) {
        nX1 nx1 = nX1.HTTP_1_0;
        if (!n3x.v(str, "http/1.0")) {
            nx1 = nX1.HTTP_1_1;
            if (!n3x.v(str, "http/1.1")) {
                nx1 = nX1.H2_PRIOR_KNOWLEDGE;
                if (!n3x.v(str, "h2_prior_knowledge")) {
                    nx1 = nX1.HTTP_2;
                    if (!n3x.v(str, "h2")) {
                        nx1 = nX1.SPDY_3;
                        if (!n3x.v(str, "spdy/3.1")) {
                            nx1 = nX1.QUIC;
                            if (!n3x.v(str, "quic")) {
                                nx1 = nX1.HTTP_3;
                                if (!iH_._(str, "h3", false)) {
                                    throw new IOException(opT.H("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
        }
        return nx1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016a, code lost:
        if (r31 != false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0195, code lost:
        if (r31 != false) goto L_0x019a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H(defpackage.fB8 r25, long r26, long r28, defpackage.lR3 r30, boolean r31, defpackage.mT2 r32, defpackage.m88 r33, int r34) {
        /*
        // Method dump skipped, instructions count: 913
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw1.H(fB8, long, long, lR3, boolean, mT2, m88, int):void");
    }

    public void J(boolean z) {
    }

    public void K(boolean z) {
    }

    @Override // defpackage.c71
    public int L(int i) {
        return i;
    }

    @Override // defpackage.dkV
    public jUs O(mk9 mk9, View view, jJj jjj, float f) {
        if (n3x.v(mk9, mk9.v)) {
            return new jya(new Magnifier(view));
        }
        long M = jjj.M(mk9.f6144R);
        float mZ = jjj.mZ(Float.NaN);
        float mZ2 = jjj.mZ(Float.NaN);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (M != nqW.c) {
            builder.setSize(mLz.t(nqW.e(M)), mLz.t(nqW.v(M)));
        }
        if (!Float.isNaN(mZ)) {
            builder.setCornerRadius(mZ);
        }
        if (!Float.isNaN(mZ2)) {
            builder.setElevation(mZ2);
        }
        if (!Float.isNaN(f)) {
            builder.setInitialZoom(f);
        }
        builder.setClippingEnabled(true);
        return new jya(builder.build());
    }

    @Override // defpackage.dkV
    public boolean R() {
        return true;
    }

    public InputConnection V(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    @Override // defpackage.l9F
    public Object X(Object obj) {
        arx arx = (arx) obj;
        try {
            ME me = new ME();
            arx.O().Q(me);
            return new eSv(arx.X(), arx.c(), me);
        } finally {
            arx.close();
        }
    }

    @Override // defpackage.c71
    public int Z(int i) {
        return i;
    }

    @Override // defpackage.jeO
    public void c(Exception exc) {
        j5V.R.x(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }

    @Override // defpackage.oFh
    public void cancel() {
    }

    @Override // defpackage.jOW
    public int e(int i) {
        return i;
    }

    public KeyListener i(KeyListener keyListener) {
        return keyListener;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x012c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(defpackage.p2E r18, defpackage.ncu r19, defpackage.iEm r20, boolean r21, long r22, defpackage.m88 r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 472
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw1.m(p2E, ncu, iEm, boolean, long, m88, int, int):void");
    }

    public void o(boolean z) {
    }

    @Override // defpackage.boB
    public f_c v(LG lg) {
        if (lg.isAttachedToWindow()) {
            nu_ s = aH9.s(lg);
            if (s != null) {
                return hDC.e(lg, s.O());
            }
            throw new IllegalStateException(("View tree for " + lg + " has no ViewTreeLifecycleOwner").toString());
        }
        nWW nww = new nWW();
        pyd pyd = new pyd(lg, nww, 0);
        lg.addOnAttachStateChangeListener(pyd);
        nww.R = new im(lg, 2, pyd);
        return new jXa(nww, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0112 A[LOOP:0: B:78:0x0110->B:79:0x0112, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(defpackage.cY9 r19, defpackage.ncu r20, defpackage.iEm r21, boolean r22, defpackage.m88 r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw1.x(cY9, ncu, iEm, boolean, m88, int, int):void");
    }

    public /* synthetic */ hw1(n7K n7k) {
        new pve(2);
    }
}
