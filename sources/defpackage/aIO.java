package defpackage;

import java.io.IOException;

/* renamed from: aIO  reason: default package */
/* loaded from: classes.dex */
public final class aIO implements oaB {
    public final fve R;

    public aIO(fve fve) {
        this.R = fve;
    }

    @Override // defpackage.oaB
    public final ot7 R() {
        oCF v;
        IOException iOException = null;
        while (!this.R.f3628R.O) {
            try {
                v = this.R.v();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    l6.U(iOException, e);
                }
                if (!this.R.R(null)) {
                    throw iOException;
                }
            }
            if (!v.v()) {
                cMR X = v.X();
                if (X.v == null && X.R == null) {
                    X = v.e();
                }
                oCF ocf = X.v;
                Throwable th = X.R;
                if (th != null) {
                    throw th;
                } else if (ocf != null) {
                    this.R.f3627R.addFirst(ocf);
                }
            }
            return v.L();
        }
        throw new IOException("Canceled");
    }

    @Override // defpackage.oaB
    public final fve v() {
        return this.R;
    }
}
