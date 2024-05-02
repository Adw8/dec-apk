package defpackage;

/* renamed from: jjm  reason: default package */
/* loaded from: classes.dex */
public final class jjm {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final nUO f5011R;

    public jjm(nUO nuo, int i) {
        this.f5011R = nuo;
        this.R = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjm)) {
            return false;
        }
        jjm jjm = (jjm) obj;
        return n3x.v(this.f5011R, jjm.f5011R) && this.R == jjm.R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R) + (this.f5011R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("ImageVectorEntry(imageVector=");
        U.append(this.f5011R);
        U.append(", configFlags=");
        return jQ.P(U, this.R, ')');
    }
}
