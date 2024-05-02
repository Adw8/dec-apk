package defpackage;

/* renamed from: iO4  reason: default package */
/* loaded from: classes.dex */
public final class iO4 extends g6x {
    public final String R;

    public iO4(String str) {
        this.R = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iO4) && n3x.v(this.R, ((iO4) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        StringBuilder U = opT.U("VerbatimTtsAnnotation(verbatim=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
