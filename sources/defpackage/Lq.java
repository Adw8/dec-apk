package defpackage;

/* renamed from: Lq  reason: default package */
/* loaded from: classes.dex */
public final class Lq {
    public final float R;
    public final float X;
    public final float c;
    public final float e;
    public final float v;

    public Lq(float f, float f2, float f3, float f4, float f5, float f6) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.X = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Lq)) {
            return false;
        }
        Lq lq = (Lq) obj;
        return hoI.R(this.R, lq.R) && hoI.R(this.v, lq.v) && hoI.R(this.c, lq.c) && hoI.R(this.e, lq.e) && hoI.R(this.X, lq.X);
    }

    public final int hashCode() {
        return Float.hashCode(this.X) + jQ.c(this.e, jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31), 31);
    }
}
