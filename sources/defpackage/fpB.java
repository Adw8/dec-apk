package defpackage;

/* renamed from: fpB  reason: default package */
/* loaded from: classes.dex */
public abstract class fpB implements Runnable, Comparable, jZi {
    public long R;
    private volatile Object _heap;
    public int e = -1;

    public fpB(long j) {
        this.R = j;
    }

    @Override // defpackage.jZi
    public final synchronized void R() {
        Object obj = this._heap;
        lmI lmi = brQ.f1825R;
        if (obj != lmi) {
            mr0 mr0 = obj instanceof mr0 ? (mr0) obj : null;
            if (mr0 != null) {
                synchronized (mr0) {
                    if (c() != null) {
                        mr0.c(this.e);
                    }
                }
            }
            this._heap = lmi;
        }
    }

    public final void X(mr0 mr0) {
        if (this._heap != brQ.f1825R) {
            this._heap = mr0;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final iXx c() {
        Object obj = this._heap;
        if (obj instanceof iXx) {
            return (iXx) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = ((this.R - ((fpB) obj).R) > 0 ? 1 : ((this.R - ((fpB) obj).R) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    public final synchronized int e(long j, mr0 mr0, gwK gwk) {
        if (this._heap == brQ.f1825R) {
            return 2;
        }
        synchronized (mr0) {
            fpB[] fpbArr = ((iXx) mr0).R;
            fpB fpb = fpbArr != null ? fpbArr[0] : null;
            if (gwK.BF(gwk)) {
                return 1;
            }
            if (fpb == null) {
                mr0.R = j;
            } else {
                long j2 = fpb.R;
                if (j2 - j < 0) {
                    j = j2;
                }
                if (j - mr0.R > 0) {
                    mr0.R = j;
                }
            }
            long j3 = this.R;
            long j4 = mr0.R;
            if (j3 - j4 < 0) {
                this.R = j4;
            }
            mr0.R(this);
            return 0;
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder U = opT.U("Delayed[nanos=");
        U.append(this.R);
        U.append(']');
        return U.toString();
    }
}
