package defpackage;

/* renamed from: g2o  reason: default package */
/* loaded from: classes.dex */
public final class g2o {
    public final int R;
    public final int c;
    public final int e;
    public final int v;

    public g2o(int i, int i2, int i3, int i4) {
        this.R = i;
        this.v = i2;
        this.c = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2o)) {
            return false;
        }
        g2o g2o = (g2o) obj;
        return this.R == g2o.R && this.v == g2o.v && this.c == g2o.c && this.e == g2o.e;
    }

    public final int hashCode() {
        return (((((this.R * 31) + this.v) * 31) + this.c) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder U = opT.U("InsetsValues(left=");
        U.append(this.R);
        U.append(", top=");
        U.append(this.v);
        U.append(", right=");
        U.append(this.c);
        U.append(", bottom=");
        return jQ.P(U, this.e, ')');
    }
}
