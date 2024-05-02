package defpackage;

/* renamed from: l69  reason: default package */
/* loaded from: classes.dex */
public final class l69 {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final Long f5583R;

    public l69(long j, Long l) {
        this.R = j;
        this.f5583R = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l69)) {
            return false;
        }
        l69 l69 = (l69) obj;
        return this.R == l69.R && n3x.v(this.f5583R, l69.f5583R);
    }

    public final int hashCode() {
        long j = this.R;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.f5583R;
        return i + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder U = opT.U("KronosTime(posixTimeMs=");
        U.append(this.R);
        U.append(", timeSinceLastNtpSyncMs=");
        U.append(this.f5583R);
        U.append(")");
        return U.toString();
    }
}
