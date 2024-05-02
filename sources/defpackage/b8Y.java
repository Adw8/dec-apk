package defpackage;

/* renamed from: b8Y  reason: default package */
/* loaded from: classes.dex */
public final class b8Y implements pa3 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final aKW f1539R;

    /* renamed from: R  reason: collision with other field name */
    public final lIe f1540R;
    public final int c;
    public final int v;

    public b8Y(int i, lIe lie, int i2, aKW akw, int i3) {
        this.R = i;
        this.f1540R = lie;
        this.v = i2;
        this.f1539R = akw;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8Y)) {
            return false;
        }
        b8Y b8y = (b8Y) obj;
        if (this.R != b8y.R || !n3x.v(this.f1540R, b8y.f1540R)) {
            return false;
        }
        if (!(this.v == b8y.v) || !n3x.v(this.f1539R, b8y.f1539R)) {
            return false;
        }
        return this.c == b8y.c;
    }

    public final int hashCode() {
        return this.f1539R.hashCode() + opT.e(this.c, opT.e(this.v, ((this.R * 31) + this.f1540R.f5651e) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("ResourceFont(resId=");
        U.append(this.R);
        U.append(", weight=");
        U.append(this.f1540R);
        U.append(", style=");
        U.append((Object) ned.R(this.v));
        U.append(", loadingStrategy=");
        U.append((Object) pip.c(this.c));
        U.append(')');
        return U.toString();
    }
}
