package defpackage;

/* renamed from: vV  reason: default package */
/* loaded from: classes.dex */
public final class vV {
    public final float R;

    public vV(float f) {
        this.R = f;
    }

    public final int R(int i, int i2, mdz mdz) {
        float f;
        float f2 = ((float) (i2 - i)) / 2.0f;
        if (mdz == mdz.Ltr) {
            f = this.R;
        } else {
            f = this.R * ((float) -1);
        }
        return mLz.t((((float) 1) + f) * f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vV) && n3x.v(Float.valueOf(this.R), Float.valueOf(((vV) obj).R));
    }

    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    public final String toString() {
        return jQ.N(opT.U("Horizontal(bias="), this.R, ')');
    }
}
