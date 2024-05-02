package defpackage;

/* renamed from: cMR  reason: default package */
/* loaded from: classes.dex */
public final class cMR {
    public final Throwable R;

    /* renamed from: R  reason: collision with other field name */
    public final oCF f2077R;
    public final oCF v;

    public cMR(oCF ocf, oCF ocf2, Throwable th) {
        this.f2077R = ocf;
        this.v = ocf2;
        this.R = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cMR)) {
            return false;
        }
        cMR cmr = (cMR) obj;
        return n3x.v(this.f2077R, cmr.f2077R) && n3x.v(this.v, cmr.v) && n3x.v(this.R, cmr.R);
    }

    public final int hashCode() {
        int hashCode = this.f2077R.hashCode() * 31;
        oCF ocf = this.v;
        int i = 0;
        int hashCode2 = (hashCode + (ocf == null ? 0 : ocf.hashCode())) * 31;
        Throwable th = this.R;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder U = opT.U("ConnectResult(plan=");
        U.append(this.f2077R);
        U.append(", nextPlan=");
        U.append(this.v);
        U.append(", throwable=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }

    public /* synthetic */ cMR(oCF ocf, Throwable th, int i) {
        this(ocf, (oCF) null, (i & 4) != 0 ? null : th);
    }
}
