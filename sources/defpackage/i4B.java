package defpackage;

/* renamed from: i4B  reason: default package */
/* loaded from: classes.dex */
public final class i4B implements jJj {
    public final float R;
    public final float v;

    public i4B(float f, float f2) {
        this.R = f;
        this.v = f2;
    }

    @Override // defpackage.jJj
    public final float D() {
        return this.R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4B)) {
            return false;
        }
        i4B i4b = (i4B) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(i4b.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(i4b.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("DensityImpl(density=");
        U.append(this.R);
        U.append(", fontScale=");
        return jQ.N(U, this.v, ')');
    }

    @Override // defpackage.jJj
    public final float vr() {
        return this.v;
    }
}
