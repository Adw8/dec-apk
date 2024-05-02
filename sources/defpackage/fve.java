package defpackage;

import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.Iterator;
import java.util.List;

/* renamed from: fve  reason: default package */
/* loaded from: classes.dex */
public final class fve {
    public bAT R;

    /* renamed from: R  reason: collision with other field name */
    public bq4 f3624R;

    /* renamed from: R  reason: collision with other field name */
    public final eS f3625R;

    /* renamed from: R  reason: collision with other field name */
    public fuY f3626R;

    /* renamed from: R  reason: collision with other field name */
    public final il f3627R = new il();

    /* renamed from: R  reason: collision with other field name */
    public final lMx f3628R;

    /* renamed from: R  reason: collision with other field name */
    public final nZz f3629R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3630R;

    public fve(nZz nzz, eS eSVar, lMx lmx, ety ety) {
        this.f3629R = nzz;
        this.f3625R = eSVar;
        this.f3628R = lmx;
        this.f3630R = !n3x.v((String) ety.f3235R.v, "GET");
    }

    public final boolean R(ot7 ot7) {
        bAT bat;
        fuY fuy;
        if ((!this.f3627R.isEmpty()) || this.f3626R != null) {
            return true;
        }
        if (ot7 != null) {
            synchronized (ot7) {
                fuy = null;
                if (ot7.v == 0) {
                    if (ot7.f7006R) {
                        if (khE.R(ot7.f6999R.R.f3093R, this.f3625R.f3093R)) {
                            fuy = ot7.f6999R;
                        }
                    }
                }
            }
            if (fuy != null) {
                this.f3626R = fuy;
                return true;
            }
        }
        bq4 bq4 = this.f3624R;
        boolean z = false;
        if (bq4 != null) {
            if (bq4.R < bq4.f1822R.size()) {
                z = true;
            }
        }
        if (!z && (bat = this.R) != null) {
            return bat.R();
        }
        return true;
    }

    public final jEB c(fuY fuy, List list) {
        nX1 nx1 = nX1.H2_PRIOR_KNOWLEDGE;
        eS eSVar = fuy.R;
        if (eSVar.f3100R == null) {
            if (eSVar.v.contains(mMB.v)) {
                String str = fuy.R.f3093R.e;
                oMv omv = oMv.f6773R;
                if (!oMv.f6773R.Z(str)) {
                    throw new UnknownServiceException(jQ.C("CLEARTEXT communication to ", str, " not permitted by network security policy"));
                }
            } else {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
        } else if (eSVar.f3097R.contains(nx1)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        boolean z = false;
        if (fuy.f3585R.type() == Proxy.Type.HTTP) {
            eS eSVar2 = fuy.R;
            if (eSVar2.f3100R != null || eSVar2.f3097R.contains(nx1)) {
                z = true;
            }
        }
        j0 j0Var = null;
        if (z) {
            fmL fml = new fmL();
            fml.R = fuy.R.f3093R;
            fml.v("CONNECT", null);
            fml.f3557R.e("Host", khE.Z(fuy.R.f3093R, true));
            fml.f3557R.e("Proxy-Connection", "Keep-Alive");
            fml.f3557R.e("User-Agent", "okhttp/5.0.0-alpha.10");
            j0Var = new j0(fml);
            eUn eun = new eUn();
            eun.f3115R = j0Var;
            eun.f3118R = nX1.HTTP_1_1;
            eun.R = 407;
            eun.f3116R = "Preemptive Authenticate";
            eun.f3109R = -1;
            eun.v = -1;
            eun.f3114R.e("Proxy-Authenticate", "OkHttp-Preemptive");
            eun.R();
            fuy.R.f3094R.getClass();
        }
        return new jEB(this.f3629R, this.f3628R, this, fuy, list, 0, j0Var, -1, false);
    }

    public final d95 e(jEB jeb, List list) {
        ot7 ot7;
        boolean z;
        Socket U;
        l_c l_c = (l_c) this.f3629R.f6437R.R;
        boolean z2 = this.f3630R;
        eS eSVar = this.f3625R;
        lMx lmx = this.f3628R;
        boolean z3 = jeb != null && jeb.v();
        Iterator it = l_c.f5783R.iterator();
        while (true) {
            if (!it.hasNext()) {
                ot7 = null;
                break;
            }
            ot7 = (ot7) it.next();
            synchronized (ot7) {
                if (z3) {
                    if (!(ot7.f7003R != null)) {
                        z = false;
                    }
                }
                if (ot7.O(eSVar, list)) {
                    lmx.e(ot7);
                    z = true;
                }
                z = false;
            }
            if (z) {
                if (ot7.L(z2)) {
                    break;
                }
                synchronized (ot7) {
                    ot7.f7006R = true;
                    U = lmx.U();
                }
                if (U != null) {
                    khE.v(U);
                }
            }
        }
        if (ot7 == null) {
            return null;
        }
        if (jeb != null) {
            this.f3626R = jeb.f4867R;
            Socket socket = jeb.f4880v;
            if (socket != null) {
                khE.v(socket);
            }
        }
        this.f3628R.X.getClass();
        return new d95(ot7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.oCF v() {
        /*
        // Method dump skipped, instructions count: 868
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fve.v():oCF");
    }
}
