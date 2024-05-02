package defpackage;

/* renamed from: Of  reason: default package */
/* loaded from: classes.dex */
public final class Of {
    public final pa3 R;

    public Of(pa3 pa3) {
        this.R = pa3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Of) && n3x.v(this.R, ((Of) obj).R) && n3x.v(null, null);
    }

    public final int hashCode() {
        return (this.R.hashCode() * 31) + 0;
    }

    public final String toString() {
        StringBuilder U = opT.U("Key(font=");
        U.append(this.R);
        U.append(", loaderKey=");
        U.append((Object) null);
        U.append(')');
        return U.toString();
    }
}
