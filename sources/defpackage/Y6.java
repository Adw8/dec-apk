package defpackage;

/* renamed from: Y6  reason: default package */
/* loaded from: classes.dex */
public final class Y6 implements mz {
    public final float R;
    public final float v;

    public Y6(float f, float f2) {
        this.R = f;
        this.v = f2;
    }

    public final long R(long j, long j2, mdz mdz) {
        float f = ((float) (((int) (j2 >> 32)) - ((int) (j >> 32)))) / 2.0f;
        float v = ((float) (ltH.v(j2) - ltH.v(j))) / 2.0f;
        float f2 = (float) 1;
        return cU5.v(mLz.t(((mdz == mdz.Ltr ? this.R : ((float) -1) * this.R) + f2) * f), mLz.t((f2 + this.v) * v));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y6)) {
            return false;
        }
        Y6 y6 = (Y6) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(y6.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(y6.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("BiasAlignment(horizontalBias=");
        U.append(this.R);
        U.append(", verticalBias=");
        return jQ.N(U, this.v, ')');
    }
}
