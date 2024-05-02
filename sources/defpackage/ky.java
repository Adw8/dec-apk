package defpackage;

/* renamed from: ky  reason: default package */
/* loaded from: classes.dex */
public final class ky {
    public final float R;

    public ky(float f) {
        this.R = f;
    }

    public final int R(int i, int i2) {
        return mLz.t((((float) 1) + this.R) * (((float) (i2 - i)) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ky) && n3x.v(Float.valueOf(this.R), Float.valueOf(((ky) obj).R));
    }

    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    public final String toString() {
        return jQ.N(opT.U("Vertical(bias="), this.R, ')');
    }
}
