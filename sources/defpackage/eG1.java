package defpackage;

/* renamed from: eG1  reason: default package */
/* loaded from: classes.dex */
public final class eG1 {
    public final gX2 R;
    public final gX2 X;
    public final gX2 c;
    public final gX2 e;
    public final gX2 v;

    public eG1() {
        o9z o9z = n0a.R;
        o9z o9z2 = n0a.v;
        o9z o9z3 = n0a.c;
        o9z o9z4 = n0a.e;
        o9z o9z5 = n0a.X;
        this.R = o9z;
        this.v = o9z2;
        this.c = o9z3;
        this.e = o9z4;
        this.X = o9z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eG1)) {
            return false;
        }
        eG1 eg1 = (eG1) obj;
        return n3x.v(this.R, eg1.R) && n3x.v(this.v, eg1.v) && n3x.v(this.c, eg1.c) && n3x.v(this.e, eg1.e) && n3x.v(this.X, eg1.X);
    }

    public final int hashCode() {
        int hashCode = this.v.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.e.hashCode();
        return this.X.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.R.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Shapes(extraSmall=");
        U.append(this.R);
        U.append(", small=");
        U.append(this.v);
        U.append(", medium=");
        U.append(this.c);
        U.append(", large=");
        U.append(this.e);
        U.append(", extraLarge=");
        U.append(this.X);
        U.append(')');
        return U.toString();
    }
}
