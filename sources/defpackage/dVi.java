package defpackage;

/* renamed from: dVi  reason: default package */
/* loaded from: classes.dex */
public final class dVi extends e7L {
    public final float R;

    public dVi(float f) {
        super(false, false, 3);
        this.R = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dVi) && n3x.v(Float.valueOf(this.R), Float.valueOf(((dVi) obj).R));
    }

    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    public final String toString() {
        return jQ.N(opT.U("RelativeVerticalTo(dy="), this.R, ')');
    }
}
