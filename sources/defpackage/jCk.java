package defpackage;

/* renamed from: jCk  reason: default package */
/* loaded from: classes.dex */
public final class jCk {
    public final Object R;
    public final Object v;

    public jCk(Integer num, Object obj) {
        this.R = num;
        this.v = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jCk)) {
            return false;
        }
        jCk jck = (jCk) obj;
        return n3x.v(this.R, jck.R) && n3x.v(this.v, jck.v);
    }

    public final int hashCode() {
        Object obj = this.R;
        int i = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.v;
        if (obj2 instanceof Enum) {
            i = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i + ordinal;
    }

    public final String toString() {
        StringBuilder U = opT.U("JoinedKey(left=");
        U.append(this.R);
        U.append(", right=");
        U.append(this.v);
        U.append(')');
        return U.toString();
    }
}
