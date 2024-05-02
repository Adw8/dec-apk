package defpackage;

/* renamed from: c2I  reason: default package */
/* loaded from: classes.dex */
public final class c2I implements bAW {
    public final float R;

    public c2I(float f) {
        this.R = f;
    }

    @Override // defpackage.bAW
    public final float R(long j, jJj jjj) {
        return jjj.mZ(this.R);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2I) && hoI.R(this.R, ((c2I) obj).R);
    }

    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    public final String toString() {
        StringBuilder U = opT.U("CornerSize(size = ");
        U.append(this.R);
        U.append(".dp)");
        return U.toString();
    }
}
