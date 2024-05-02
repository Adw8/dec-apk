package defpackage;

/* renamed from: h0c  reason: default package */
/* loaded from: classes.dex */
public final class h0c {
    public Long R;

    /* renamed from: R  reason: collision with other field name */
    public String f4011R;

    public h0c(String str, long j) {
        this.f4011R = str;
        this.R = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0c)) {
            return false;
        }
        h0c h0c = (h0c) obj;
        if (!this.f4011R.equals(h0c.f4011R)) {
            return false;
        }
        Long l = this.R;
        return l != null ? l.equals(h0c.R) : h0c.R == null;
    }

    public final int hashCode() {
        int hashCode = this.f4011R.hashCode() * 31;
        Long l = this.R;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
