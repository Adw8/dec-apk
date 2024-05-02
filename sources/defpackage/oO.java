package defpackage;

/* renamed from: oO  reason: default package */
/* loaded from: classes.dex */
public final class oO extends Pc {
    public float R;
    public float c;
    public float e;
    public float v;

    public oO(float f, float f2, float f3, float f4) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
    }

    @Override // defpackage.Pc
    public final float R(int i) {
        if (i == 0) {
            return this.R;
        }
        if (i == 1) {
            return this.v;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.e;
    }

    @Override // defpackage.Pc
    public final void X(int i, float f) {
        if (i == 0) {
            this.R = f;
        } else if (i == 1) {
            this.v = f;
        } else if (i == 2) {
            this.c = f;
        } else if (i == 3) {
            this.e = f;
        }
    }

    @Override // defpackage.Pc
    public final Pc c() {
        return new oO(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.Pc
    public final void e() {
        this.R = 0.0f;
        this.v = 0.0f;
        this.c = 0.0f;
        this.e = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oO) {
            oO oOVar = (oO) obj;
            if (oOVar.R == this.R) {
                if (oOVar.v == this.v) {
                    if (oOVar.c == this.c) {
                        if (oOVar.e == this.e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("AnimationVector4D: v1 = ");
        U.append(this.R);
        U.append(", v2 = ");
        U.append(this.v);
        U.append(", v3 = ");
        U.append(this.c);
        U.append(", v4 = ");
        U.append(this.e);
        return U.toString();
    }

    @Override // defpackage.Pc
    public final int v() {
        return 4;
    }
}
