package defpackage;

/* renamed from: ct  reason: default package */
/* loaded from: classes.dex */
public final class ct extends Pc {
    public float R;
    public float v;

    public ct(float f, float f2) {
        this.R = f;
        this.v = f2;
    }

    @Override // defpackage.Pc
    public final float R(int i) {
        if (i == 0) {
            return this.R;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.v;
    }

    @Override // defpackage.Pc
    public final void X(int i, float f) {
        if (i == 0) {
            this.R = f;
        } else if (i == 1) {
            this.v = f;
        }
    }

    @Override // defpackage.Pc
    public final Pc c() {
        return new ct(0.0f, 0.0f);
    }

    @Override // defpackage.Pc
    public final void e() {
        this.R = 0.0f;
        this.v = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ct) {
            ct ctVar = (ct) obj;
            if (ctVar.R == this.R) {
                if (ctVar.v == this.v) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("AnimationVector2D: v1 = ");
        U.append(this.R);
        U.append(", v2 = ");
        U.append(this.v);
        return U.toString();
    }

    @Override // defpackage.Pc
    public final int v() {
        return 2;
    }
}
