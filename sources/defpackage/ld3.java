package defpackage;

/* renamed from: ld3  reason: default package */
/* loaded from: classes.dex */
public final class ld3 extends e7L {
    public final float R;
    public final float X;
    public final float c;

    /* renamed from: c  reason: collision with other field name */
    public final boolean f5794c;
    public final float e;

    /* renamed from: e  reason: collision with other field name */
    public final boolean f5795e;
    public final float v;

    public ld3(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(false, false, 3);
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.f5794c = z;
        this.f5795e = z2;
        this.e = f4;
        this.X = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld3)) {
            return false;
        }
        ld3 ld3 = (ld3) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(ld3.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(ld3.v)) && n3x.v(Float.valueOf(this.c), Float.valueOf(ld3.c)) && this.f5794c == ld3.f5794c && this.f5795e == ld3.f5795e && n3x.v(Float.valueOf(this.e), Float.valueOf(ld3.e)) && n3x.v(Float.valueOf(this.X), Float.valueOf(ld3.X));
    }

    public final int hashCode() {
        int c = jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31);
        boolean z = this.f5794c;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (c + i2) * 31;
        boolean z2 = this.f5795e;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return Float.hashCode(this.X) + jQ.c(this.e, (i5 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("RelativeArcTo(horizontalEllipseRadius=");
        U.append(this.R);
        U.append(", verticalEllipseRadius=");
        U.append(this.v);
        U.append(", theta=");
        U.append(this.c);
        U.append(", isMoreThanHalf=");
        U.append(this.f5794c);
        U.append(", isPositiveArc=");
        U.append(this.f5795e);
        U.append(", arcStartDx=");
        U.append(this.e);
        U.append(", arcStartDy=");
        return jQ.N(U, this.X, ')');
    }
}
