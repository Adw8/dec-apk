package defpackage;

/* renamed from: fgz  reason: default package */
/* loaded from: classes.dex */
public final class fgz extends g9z {
    public final g2m R = g2m.R;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fgz.class != obj.getClass()) {
            return false;
        }
        return this.R.equals(((fgz) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode() + (fgz.class.getName().hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Failure {mOutputData=");
        U.append(this.R);
        U.append('}');
        return U.toString();
    }
}
