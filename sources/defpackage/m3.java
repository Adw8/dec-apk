package defpackage;

/* renamed from: m3  reason: default package */
/* loaded from: classes.dex */
public final class m3 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f5897R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5898R;
    public final int v;

    public m3(Object obj, int i, int i2, String str) {
        this.f5897R = obj;
        this.R = i;
        this.v = i2;
        this.f5898R = str;
        if (!(i <= i2)) {
            throw new IllegalArgumentException("Reversed range is not supported".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return n3x.v(this.f5897R, m3Var.f5897R) && this.R == m3Var.R && this.v == m3Var.v && n3x.v(this.f5898R, m3Var.f5898R);
    }

    public final int hashCode() {
        Object obj = this.f5897R;
        return this.f5898R.hashCode() + opT.e(this.v, opT.e(this.R, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Range(item=");
        U.append(this.f5897R);
        U.append(", start=");
        U.append(this.R);
        U.append(", end=");
        U.append(this.v);
        U.append(", tag=");
        U.append(this.f5898R);
        U.append(')');
        return U.toString();
    }

    public m3(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
