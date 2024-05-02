package defpackage;

/* renamed from: bwp  reason: default package */
/* loaded from: classes.dex */
public final class bwp {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final long f1859R;
    public final float c;

    /* renamed from: c  reason: collision with other field name */
    public final long f1860c;
    public final float e;

    /* renamed from: e  reason: collision with other field name */
    public final long f1861e;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final long f1862v;

    static {
        int i = buB.R;
        dTl.m(0.0f, 0.0f, 0.0f, 0.0f, buB.f1848R);
    }

    public bwp(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.f1859R = j;
        this.f1862v = j2;
        this.f1860c = j3;
        this.f1861e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwp)) {
            return false;
        }
        bwp bwp = (bwp) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(bwp.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(bwp.v)) && n3x.v(Float.valueOf(this.c), Float.valueOf(bwp.c)) && n3x.v(Float.valueOf(this.e), Float.valueOf(bwp.e)) && buB.R(this.f1859R, bwp.f1859R) && buB.R(this.f1862v, bwp.f1862v) && buB.R(this.f1860c, bwp.f1860c) && buB.R(this.f1861e, bwp.f1861e);
    }

    public final int hashCode() {
        int c = jQ.c(this.e, jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31), 31);
        long j = this.f1859R;
        int i = buB.R;
        return Long.hashCode(this.f1861e) + opT.X(this.f1860c, opT.X(this.f1862v, opT.X(j, c, 31), 31), 31);
    }

    public final String toString() {
        long j = this.f1859R;
        long j2 = this.f1862v;
        long j3 = this.f1860c;
        long j4 = this.f1861e;
        String str = ooA.J(this.R) + ", " + ooA.J(this.v) + ", " + ooA.J(this.c) + ", " + ooA.J(this.e);
        if (!buB.R(j, j2) || !buB.R(j2, j3) || !buB.R(j3, j4)) {
            StringBuilder i = jQ.i("RoundRect(rect=", str, ", topLeft=");
            i.append((Object) buB.e(j));
            i.append(", topRight=");
            i.append((Object) buB.e(j2));
            i.append(", bottomRight=");
            i.append((Object) buB.e(j3));
            i.append(", bottomLeft=");
            i.append((Object) buB.e(j4));
            i.append(')');
            return i.toString();
        }
        if (buB.v(j) == buB.c(j)) {
            StringBuilder i2 = jQ.i("RoundRect(rect=", str, ", radius=");
            i2.append(ooA.J(buB.v(j)));
            i2.append(')');
            return i2.toString();
        }
        StringBuilder i3 = jQ.i("RoundRect(rect=", str, ", x=");
        i3.append(ooA.J(buB.v(j)));
        i3.append(", y=");
        i3.append(ooA.J(buB.c(j)));
        i3.append(')');
        return i3.toString();
    }
}
