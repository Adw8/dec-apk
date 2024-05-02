package defpackage;

/* renamed from: i4C  reason: default package */
/* loaded from: classes.dex */
public final class i4C {
    public final int R;
    public final int v;

    public i4C(int i, int i2) {
        this.R = i;
        this.v = i2;
        boolean z = true;
        if (i >= 0) {
            if (!(i2 < i ? false : z)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4C)) {
            return false;
        }
        i4C i4c = (i4C) obj;
        return this.R == i4c.R && this.v == i4c.v;
    }

    public final int hashCode() {
        return Integer.hashCode(this.v) + (Integer.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Interval(start=");
        U.append(this.R);
        U.append(", end=");
        return jQ.P(U, this.v, ')');
    }
}
