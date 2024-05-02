package defpackage;

/* renamed from: f3L  reason: default package */
/* loaded from: classes.dex */
public final class f3L {
    public final String R;

    public f3L(String str) {
        this.R = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3L) && n3x.v(this.R, ((f3L) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        StringBuilder U = opT.U("OpaqueKey(key=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
