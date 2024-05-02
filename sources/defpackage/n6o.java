package defpackage;

/* renamed from: n6o  reason: default package */
/* loaded from: classes.dex */
public final class n6o extends g9z {
    public final g2m R;

    public n6o(g2m g2m) {
        this.R = g2m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n6o.class != obj.getClass()) {
            return false;
        }
        return this.R.equals(((n6o) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode() + (n6o.class.getName().hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Success {mOutputData=");
        U.append(this.R);
        U.append('}');
        return U.toString();
    }
}
