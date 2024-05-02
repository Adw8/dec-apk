package defpackage;

/* renamed from: pdA  reason: default package */
/* loaded from: classes.dex */
public final class pdA extends e7L {
    public final float R;
    public final float v;

    public pdA(float f, float f2) {
        super(false, true, 1);
        this.R = f;
        this.v = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdA)) {
            return false;
        }
        pdA pda = (pdA) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(pda.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(pda.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("RelativeReflectiveQuadTo(dx=");
        U.append(this.R);
        U.append(", dy=");
        return jQ.N(U, this.v, ')');
    }
}
