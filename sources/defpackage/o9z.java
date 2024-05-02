package defpackage;

/* renamed from: o9z  reason: default package */
/* loaded from: classes.dex */
public final class o9z extends gX2 {
    public o9z(bAW baw, bAW baw2, bAW baw3, bAW baw4) {
        super(baw, baw2, baw3, baw4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9z)) {
            return false;
        }
        o9z o9z = (o9z) obj;
        return n3x.v(this.R, o9z.R) && n3x.v(this.v, o9z.v) && n3x.v(this.c, o9z.c) && n3x.v(this.e, o9z.e);
    }

    public final int hashCode() {
        int hashCode = this.v.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.e.hashCode() + ((hashCode2 + ((hashCode + (this.R.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("RoundedCornerShape(topStart = ");
        U.append(this.R);
        U.append(", topEnd = ");
        U.append(this.v);
        U.append(", bottomEnd = ");
        U.append(this.c);
        U.append(", bottomStart = ");
        U.append(this.e);
        U.append(')');
        return U.toString();
    }
}
