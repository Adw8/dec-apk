package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* renamed from: oIS  reason: default package */
/* loaded from: classes.dex */
public final class oIS implements kEi {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final Jl f6729R;

    /* renamed from: R  reason: collision with other field name */
    public final NV f6730R;

    /* renamed from: R  reason: collision with other field name */
    public final atD f6731R;

    /* renamed from: R  reason: collision with other field name */
    public bd4 f6732R;

    /* renamed from: R  reason: collision with other field name */
    public final jFB f6733R;

    /* renamed from: R  reason: collision with other field name */
    public final nZz f6734R;

    public oIS(nZz nzz, jFB jfb, Jl jl, NV nv) {
        this.f6734R = nzz;
        this.f6733R = jfb;
        this.f6729R = jl;
        this.f6730R = nv;
        this.f6731R = new atD(jl);
    }

    public final void H(bd4 bd4, String str) {
        if (this.R == 0) {
            this.f6730R.w(str).w("\r\n");
            int length = bd4.R.length / 2;
            for (int i = 0; i < length; i++) {
                this.f6730R.w(bd4.v(i)).w(": ").w(bd4.H(i)).w("\r\n");
            }
            this.f6730R.w("\r\n");
            this.R = 1;
            return;
        }
        StringBuilder U = opT.U("state: ");
        U.append(this.R);
        throw new IllegalStateException(U.toString().toString());
    }

    @Override // defpackage.kEi
    public final void L() {
        this.f6730R.flush();
    }

    @Override // defpackage.kEi
    public final jFB O() {
        return this.f6733R;
    }

    @Override // defpackage.kEi
    public final void R() {
        this.f6730R.flush();
    }

    @Override // defpackage.kEi
    public final axx X(j0 j0Var, long j) {
        boolean z = true;
        if (iH_.Q("chunked", j0Var.Z("Transfer-Encoding"))) {
            if (this.R != 1) {
                z = false;
            }
            if (z) {
                this.R = 2;
                return new eBb(this);
            }
            StringBuilder U = opT.U("state: ");
            U.append(this.R);
            throw new IllegalStateException(U.toString().toString());
        } else if (j != -1) {
            if (this.R != 1) {
                z = false;
            }
            if (z) {
                this.R = 2;
                return new ib1(this);
            }
            StringBuilder U2 = opT.U("state: ");
            U2.append(this.R);
            throw new IllegalStateException(U2.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // defpackage.kEi
    public final eUn Z(boolean z) {
        int i = this.R;
        boolean z2 = true;
        if (!(i == 1 || i == 2 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                atD atd = this.f6731R;
                String _ = atd.f1482R._(atd.R);
                atd.R -= (long) _.length();
                lFn C = atb.C(_);
                eUn eun = new eUn();
                eun.f3118R = C.f5627R;
                eun.R = C.R;
                eun.f3116R = C.f5626R;
                eun.f3114R = this.f6731R.R().c();
                eun.f3113R = mY_.C;
                if (z && C.R == 100) {
                    return null;
                }
                if (C.R == 100) {
                    this.R = 3;
                    return eun;
                }
                this.R = 4;
                return eun;
            } catch (EOFException e) {
                throw new IOException(opT.H("unexpected end of stream on ", this.f6733R.Z().R.f3093R.L()), e);
            }
        } else {
            StringBuilder U = opT.U("state: ");
            U.append(this.R);
            throw new IllegalStateException(U.toString().toString());
        }
    }

    @Override // defpackage.kEi
    public final long c(dEt det) {
        if (!nIq.R(det)) {
            return 0;
        }
        if (iH_.Q("chunked", dEt.R(det, "Transfer-Encoding"))) {
            return -1;
        }
        return khE.e(det);
    }

    @Override // defpackage.kEi
    public final void cancel() {
        this.f6733R.cancel();
    }

    @Override // defpackage.kEi
    public final fGn e(dEt det) {
        if (!nIq.R(det)) {
            return x(0);
        }
        boolean z = true;
        if (iH_.Q("chunked", dEt.R(det, "Transfer-Encoding"))) {
            a7_ a7_ = (a7_) det.f2539R.f4786R;
            if (this.R != 4) {
                z = false;
            }
            if (z) {
                this.R = 5;
                return new ctg(this, a7_);
            }
            StringBuilder U = opT.U("state: ");
            U.append(this.R);
            throw new IllegalStateException(U.toString().toString());
        }
        long e = khE.e(det);
        if (e != -1) {
            return x(e);
        }
        if (this.R != 4) {
            z = false;
        }
        if (z) {
            this.R = 5;
            this.f6733R.c();
            return new bQ5(this);
        }
        StringBuilder U2 = opT.U("state: ");
        U2.append(this.R);
        throw new IllegalStateException(U2.toString().toString());
    }

    @Override // defpackage.kEi
    public final void m(j0 j0Var) {
        Proxy.Type type = this.f6733R.Z().f3585R.type();
        StringBuilder sb = new StringBuilder();
        sb.append((String) j0Var.v);
        sb.append(' ');
        Object obj = j0Var.f4786R;
        if (!((a7_) obj).f740R && type == Proxy.Type.HTTP) {
            sb.append((a7_) obj);
        } else {
            a7_ a7_ = (a7_) obj;
            String v = a7_.v();
            String e = a7_.e();
            if (e != null) {
                v = v + '?' + e;
            }
            sb.append(v);
        }
        sb.append(" HTTP/1.1");
        H((bd4) j0Var.c, sb.toString());
    }

    @Override // defpackage.kEi
    public final bd4 v() {
        if (this.R == 6) {
            bd4 bd4 = this.f6732R;
            return bd4 == null ? khE.R : bd4;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    public final bhS x(long j) {
        if (this.R == 4) {
            this.R = 5;
            return new bhS(this, j);
        }
        StringBuilder U = opT.U("state: ");
        U.append(this.R);
        throw new IllegalStateException(U.toString().toString());
    }
}
