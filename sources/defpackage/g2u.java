package defpackage;

/* renamed from: g2u  reason: default package */
/* loaded from: classes.dex */
public final class g2u implements bAW {
    public final float R;

    public g2u(float f) {
        this.R = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.bAW
    public final float R(long j, jJj jjj) {
        return (this.R / 100.0f) * nqW.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2u) && n3x.v(Float.valueOf(this.R), Float.valueOf(((g2u) obj).R));
    }

    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    public final String toString() {
        StringBuilder U = opT.U("CornerSize(size = ");
        U.append(this.R);
        U.append("%)");
        return U.toString();
    }
}
