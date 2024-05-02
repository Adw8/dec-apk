package defpackage;

import java.io.IOException;

/* renamed from: fPH  reason: default package */
/* loaded from: classes.dex */
public final class fPH {
    public final kEi R;

    /* renamed from: R  reason: collision with other field name */
    public final lMx f3410R;

    /* renamed from: R  reason: collision with other field name */
    public final oaB f3411R;

    /* renamed from: R  reason: collision with other field name */
    public final ppN f3412R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3413R;
    public boolean v;

    public fPH(lMx lmx, ppN ppn, oaB oab, kEi kei) {
        this.f3410R = lmx;
        this.f3412R = ppn;
        this.f3411R = oab;
        this.R = kei;
    }

    public final IOException R(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            X(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f3412R.getClass();
            } else {
                this.f3412R.getClass();
            }
        }
        if (z) {
            if (iOException != null) {
                this.f3412R.getClass();
            } else {
                this.f3412R.getClass();
            }
        }
        return this.f3410R.m(this, z2, z, iOException);
    }

    public final void X(IOException iOException) {
        this.v = true;
        this.R.O().R(this.f3410R, iOException);
    }

    public final eSv c(dEt det) {
        try {
            String R = dEt.R(det, "Content-Type");
            long c = this.R.c(det);
            return new eSv(R, c, new oDA(new b7H(this, this.R.e(det), c)));
        } catch (IOException e) {
            this.f3412R.getClass();
            X(e);
            throw e;
        }
    }

    public final eUn e(boolean z) {
        try {
            eUn Z = this.R.Z(z);
            if (Z != null) {
                Z.f3112R = this;
                Z.f3113R = new bBd(10, this);
            }
            return Z;
        } catch (IOException e) {
            this.f3412R.getClass();
            X(e);
            throw e;
        }
    }

    public final ot7 v() {
        jFB O = this.R.O();
        ot7 ot7 = O instanceof ot7 ? (ot7) O : null;
        if (ot7 != null) {
            return ot7;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels".toString());
    }
}
