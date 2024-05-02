package defpackage;

/* renamed from: gXD  reason: default package */
/* loaded from: classes.dex */
public final class gXD extends az {
    public final boolean H(nA8 na8) {
        CJ cj;
        na8.getClass();
        Object obj = ((az) this).f1497R;
        if (obj == null) {
            if (na8.isDone()) {
                if (!az.f1494R.P(this, null, az.O(na8))) {
                    return false;
                }
                az.c(this);
            } else {
                jx jxVar = new jx(this, na8);
                if (az.f1494R.P(this, null, jxVar)) {
                    try {
                        na8.R(jxVar, ctQ.R);
                    } catch (Throwable th) {
                        try {
                            cj = new CJ(th);
                        } catch (Throwable unused) {
                            cj = CJ.R;
                        }
                        az.f1494R.P(this, jxVar, cj);
                    }
                } else {
                    obj = ((az) this).f1497R;
                }
            }
            return true;
        }
        if (!(obj instanceof Rf)) {
            return false;
        }
        na8.cancel(((Rf) obj).f497R);
        return false;
    }

    public final boolean m(Object obj) {
        if (obj == null) {
            obj = az.v;
        }
        if (!az.f1494R.P(this, null, obj)) {
            return false;
        }
        az.c(this);
        return true;
    }

    public final boolean x(Throwable th) {
        th.getClass();
        if (!az.f1494R.P(this, null, new CJ(th))) {
            return false;
        }
        az.c(this);
        return true;
    }
}
