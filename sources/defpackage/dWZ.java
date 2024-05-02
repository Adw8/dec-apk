package defpackage;

/* renamed from: dWZ  reason: default package */
/* loaded from: classes.dex */
public final class dWZ {
    public final by5 R;

    /* renamed from: R  reason: collision with other field name */
    public final gvH f2656R;

    public dWZ(by5 by5, gvH gvh) {
        this.R = by5;
        this.f2656R = gvh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dWZ)) {
            return false;
        }
        dWZ dwz = (dWZ) obj;
        return n3x.v(this.f2656R, dwz.f2656R) && n3x.v(this.R, dwz.R);
    }

    public final int hashCode() {
        by5 by5 = this.R;
        int i = 0;
        int hashCode = (by5 != null ? by5.hashCode() : 0) * 31;
        gvH gvh = this.f2656R;
        if (gvh != null) {
            i = gvh.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder U = opT.U("PlatformTextStyle(spanStyle=");
        U.append(this.R);
        U.append(", paragraphSyle=");
        U.append(this.f2656R);
        U.append(')');
        return U.toString();
    }
}
