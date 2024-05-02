package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: k24  reason: default package */
/* loaded from: classes.dex */
public final class k24 implements eXP {
    public final nZz R;

    public k24(nZz nzz) {
        this.R = nzz;
    }

    public static int e(dEt det, int i) {
        String R = dEt.R(det, "Retry-After");
        if (R == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(R).matches()) {
            return Integer.valueOf(R).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.eXP
    public final dEt R(ety ety) {
        dEt det;
        int i;
        List<Exception> list;
        fPH fph;
        SG sg;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        j0 j0Var = ety.f3235R;
        lMx lmx = ety.f3237R;
        List list2 = fcD.R;
        boolean z = true;
        dEt det2 = null;
        int i2 = 0;
        boolean z2 = true;
        while (true) {
            if (lmx.R == null ? z : false) {
                synchronized (lmx) {
                    if (!(lmx.e ^ z)) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    } else if (!(lmx.c ^ z)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                if (z2) {
                    nZz nzz = lmx.f5671R;
                    a7_ a7_ = (a7_) j0Var.f4786R;
                    if (a7_.f740R) {
                        SSLSocketFactory sSLSocketFactory2 = nzz.f6445R;
                        if (sSLSocketFactory2 != null) {
                            hostnameVerifier = nzz.f6444R;
                            sg = nzz.f6435R;
                            sSLSocketFactory = sSLSocketFactory2;
                        } else {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                    } else {
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        sg = null;
                    }
                    list = list2;
                    i = i2;
                    det = det2;
                    fve fve = new fve(nzz, new eS(a7_.e, a7_.f737R, nzz.f6450R, nzz.f6443R, sSLSocketFactory, hostnameVerifier, sg, nzz.f6458v, nzz.f6440R, nzz.f6456e, nzz.f6454c, nzz.f6441R), lmx, ety);
                    nZz nzz2 = lmx.f5671R;
                    lmx.f5672R = nzz2.f6460v ? new mzJ(fve, nzz2.f6439R) : new aIO(fve);
                } else {
                    list = list2;
                    det = det2;
                    i = i2;
                }
                try {
                    if (!lmx.O) {
                        try {
                            eUn eun = new eUn(ety.v(j0Var));
                            eun.f3115R = j0Var;
                            eun.c = det != null ? pdD.s(det) : null;
                            det2 = eun.R();
                            fph = lmx.R;
                            j0Var = v(det2, fph);
                        } catch (IOException e) {
                            if (!c(e, lmx, j0Var, !(e instanceof iJY))) {
                                for (Exception exc : list) {
                                    l6.U(e, exc);
                                }
                                throw e;
                            }
                            list2 = dF.iE(list, e);
                            lmx.L(true);
                            z2 = false;
                            z = true;
                            i2 = i;
                            det2 = det;
                        }
                        if (j0Var == null) {
                            if (fph != null && fph.f3413R) {
                                if (!lmx.f5677v) {
                                    lmx.f5677v = true;
                                    lmx.f5674R.m();
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            }
                            lmx.L(false);
                            return det2;
                        }
                        asb.v(det2.f2534R);
                        i2 = i + 1;
                        if (i2 <= 20) {
                            lmx.L(true);
                            list2 = list;
                            z2 = true;
                            z = true;
                        } else {
                            throw new ProtocolException("Too many follow-up requests: " + i2);
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (Throwable th) {
                    lmx.L(true);
                    throw th;
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0060 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(java.io.IOException r2, defpackage.lMx r3, defpackage.j0 r4, boolean r5) {
        /*
            r1 = this;
            nZz r1 = r1.R
            boolean r1 = r1.f6452R
            r4 = 0
            if (r1 != 0) goto L_0x0008
            return r4
        L_0x0008:
            if (r5 == 0) goto L_0x000f
            boolean r1 = r2 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L_0x000f
            return r4
        L_0x000f:
            boolean r1 = r2 instanceof java.net.ProtocolException
            r0 = 1
            if (r1 == 0) goto L_0x0015
            goto L_0x0031
        L_0x0015:
            boolean r1 = r2 instanceof java.io.InterruptedIOException
            if (r1 == 0) goto L_0x0020
            boolean r1 = r2 instanceof java.net.SocketTimeoutException
            if (r1 == 0) goto L_0x0031
            if (r5 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0020:
            boolean r1 = r2 instanceof javax.net.ssl.SSLHandshakeException
            if (r1 == 0) goto L_0x002d
            java.lang.Throwable r1 = r2.getCause()
            boolean r1 = r1 instanceof java.security.cert.CertificateException
            if (r1 == 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            boolean r1 = r2 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r1 == 0) goto L_0x0033
        L_0x0031:
            r1 = r4
            goto L_0x0034
        L_0x0033:
            r1 = r0
        L_0x0034:
            if (r1 != 0) goto L_0x0037
            return r4
        L_0x0037:
            fPH r1 = r3.v
            if (r1 == 0) goto L_0x0041
            boolean r1 = r1.v
            if (r1 != r0) goto L_0x0041
            r1 = r0
            goto L_0x0042
        L_0x0041:
            r1 = r4
        L_0x0042:
            if (r1 == 0) goto L_0x005c
            oaB r1 = r3.f5672R
            fve r1 = r1.v()
            fPH r2 = r3.v
            if (r2 == 0) goto L_0x0053
            ot7 r2 = r2.v()
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            boolean r1 = r1.R(r2)
            if (r1 == 0) goto L_0x005c
            r1 = r0
            goto L_0x005d
        L_0x005c:
            r1 = r4
        L_0x005d:
            if (r1 != 0) goto L_0x0060
            return r4
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k24.c(java.io.IOException, lMx, j0, boolean):boolean");
    }

    public final j0 v(dEt det, fPH fph) {
        String R;
        hro hro;
        h7U h7u = null;
        fuY fuy = fph != null ? fph.v().f6999R : null;
        int i = det.e;
        String str = (String) det.f2539R.v;
        boolean z = false;
        if (!(i == 307 || i == 308)) {
            if (i == 401) {
                this.R.f6436R.getClass();
                return null;
            } else if (i != 421) {
                if (i == 503) {
                    dEt det2 = det.c;
                    if ((det2 == null || det2.e != 503) && e(det, Integer.MAX_VALUE) == 0) {
                        return det.f2539R;
                    }
                    return null;
                } else if (i != 407) {
                    if (i != 408) {
                        switch (i) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.R.f6452R) {
                        return null;
                    } else {
                        dEt det3 = det.c;
                        if ((det3 == null || det3.e != 408) && e(det, 0) <= 0) {
                            return det.f2539R;
                        }
                        return null;
                    }
                } else if (fuy.f3585R.type() == Proxy.Type.HTTP) {
                    this.R.f6458v.getClass();
                    return null;
                } else {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            } else if (fph == null || !(!n3x.v(fph.f3411R.v().f3625R.f3093R.e, fph.R.O().Z().R.f3093R.e))) {
                return null;
            } else {
                ot7 v = fph.v();
                synchronized (v) {
                    v.f7008v = true;
                }
                return det.f2539R;
            }
        }
        if (!this.R.f6455c || (R = dEt.R(det, "Location")) == null) {
            return null;
        }
        a7_ a7_ = (a7_) det.f2539R.f4786R;
        a7_.getClass();
        try {
            hro = new hro();
            hro.X(a7_, R);
        } catch (IllegalArgumentException unused) {
            hro = null;
        }
        a7_ v2 = hro != null ? hro.v() : null;
        if (v2 == null) {
            return null;
        }
        if (!n3x.v(v2.f738R, ((a7_) det.f2539R.f4786R).f738R) && !this.R.f6457e) {
            return null;
        }
        j0 j0Var = det.f2539R;
        j0Var.getClass();
        fmL fml = new fmL(j0Var);
        if (l6.S(str)) {
            int i2 = det.e;
            if (n3x.v(str, "PROPFIND") || i2 == 308 || i2 == 307) {
                z = true;
            }
            if (!(!n3x.v(str, "PROPFIND")) || i2 == 308 || i2 == 307) {
                if (z) {
                    h7u = (h7U) det.f2539R.e;
                }
                fml.v(str, h7u);
            } else {
                fml.v("GET", null);
            }
            if (!z) {
                fml.c("Transfer-Encoding");
                fml.c("Content-Length");
                fml.c("Content-Type");
            }
        }
        if (!khE.R((a7_) det.f2539R.f4786R, v2)) {
            fml.c("Authorization");
        }
        fml.R = v2;
        return new j0(fml);
    }
}
