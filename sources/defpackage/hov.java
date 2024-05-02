package defpackage;

/* renamed from: hov  reason: default package */
/* loaded from: classes.dex */
public final class hov {
    public final String R;

    public hov(String str) {
        this.R = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hov) && n3x.v(this.R, ((hov) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        StringBuilder U = opT.U("UrlAnnotation(url=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
