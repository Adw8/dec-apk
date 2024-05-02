package defpackage;

/* renamed from: mRi  reason: default package */
/* loaded from: classes.dex */
public final class mRi {
    public static final mRi R = new mRi(gQc.S(0), gQc.S(0));

    /* renamed from: R  reason: collision with other field name */
    public final long f6045R;
    public final long v;

    public mRi(long j, long j2) {
        this.f6045R = j;
        this.v = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mRi)) {
            return false;
        }
        mRi mri = (mRi) obj;
        return eT9.R(this.f6045R, mri.f6045R) && eT9.R(this.v, mri.v);
    }

    public final int hashCode() {
        long j = this.f6045R;
        lqt[] lqtArr = eT9.R;
        return Long.hashCode(this.v) + (Long.hashCode(j) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("TextIndent(firstLine=");
        U.append((Object) eT9.e(this.f6045R));
        U.append(", restLine=");
        U.append((Object) eT9.e(this.v));
        U.append(')');
        return U.toString();
    }
}
