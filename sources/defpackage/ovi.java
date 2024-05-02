package defpackage;

/* renamed from: ovi  reason: default package */
/* loaded from: classes.dex */
public final class ovi {
    public final float R;
    public final float c;
    public final float e;
    public final float v;

    public ovi(float f, float f2, float f3, float f4) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovi)) {
            return false;
        }
        ovi ovi = (ovi) obj;
        if (!(this.R == ovi.R)) {
            return false;
        }
        if (!(this.v == ovi.v)) {
            return false;
        }
        if (!(this.c == ovi.c)) {
            return false;
        }
        return (this.e > ovi.e ? 1 : (this.e == ovi.e ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("RippleAlpha(draggedAlpha=");
        U.append(this.R);
        U.append(", focusedAlpha=");
        U.append(this.v);
        U.append(", hoveredAlpha=");
        U.append(this.c);
        U.append(", pressedAlpha=");
        return jQ.N(U, this.e, ')');
    }
}
