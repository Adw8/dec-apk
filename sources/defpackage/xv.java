package defpackage;

/* renamed from: xv  reason: default package */
/* loaded from: classes.dex */
public final class xv implements eXP {
    public final nvJ R;

    public xv(nvJ nvj) {
        this.R = nvj;
    }

    @Override // defpackage.eXP
    public final dEt R(ety ety) {
        arx arx;
        j0 j0Var = ety.f3235R;
        j0Var.getClass();
        fmL fml = new fmL(j0Var);
        h7U h7u = (h7U) j0Var.e;
        if (h7u != null) {
            oFB v = h7u.v();
            if (v != null) {
                fml.R("Content-Type", v.R);
            }
            long R = h7u.R();
            if (R != -1) {
                fml.R("Content-Length", String.valueOf(R));
                fml.c("Transfer-Encoding");
            } else {
                fml.R("Transfer-Encoding", "chunked");
                fml.c("Content-Length");
            }
        }
        boolean z = false;
        if (j0Var.Z("Host") == null) {
            fml.R("Host", khE.Z((a7_) j0Var.f4786R, false));
        }
        if (j0Var.Z("Connection") == null) {
            fml.R("Connection", "Keep-Alive");
        }
        z = true;
        if (j0Var.Z("Accept-Encoding") == null && j0Var.Z("Range") == null) {
            fml.R("Accept-Encoding", "gzip");
        }
        this.R.getClass();
        if (j0Var.Z("User-Agent") == null) {
            fml.R("User-Agent", "okhttp/5.0.0-alpha.10");
        }
        j0 j0Var2 = new j0(fml);
        dEt v2 = ety.v(j0Var2);
        nIq.v(this.R, (a7_) j0Var2.f4786R, v2.f2535R);
        eUn eun = new eUn(v2);
        eun.f3115R = j0Var2;
        if (z && iH_.Q("gzip", dEt.R(v2, "Content-Encoding")) && nIq.R(v2) && (arx = v2.f2534R) != null) {
            bsF bsf = new bsF(arx.O());
            iRl c = v2.f2535R.c();
            c.c("Content-Encoding");
            c.c("Content-Length");
            eun.f3114R = c.v().c();
            eun.f3110R = new eSv(dEt.R(v2, "Content-Type"), -1, new oDA(bsf));
        }
        return eun.R();
    }
}
