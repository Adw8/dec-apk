package defpackage;

/* renamed from: O2  reason: default package */
/* loaded from: classes.dex */
public final class O2 extends Pc {
    public float R;

    public O2(float f) {
        this.R = f;
    }

    @Override // defpackage.Pc
    public final float R(int i) {
        if (i == 0) {
            return this.R;
        }
        return 0.0f;
    }

    @Override // defpackage.Pc
    public final void X(int i, float f) {
        if (i == 0) {
            this.R = f;
        }
    }

    @Override // defpackage.Pc
    public final Pc c() {
        return new O2(0.0f);
    }

    @Override // defpackage.Pc
    public final void e() {
        this.R = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O2) {
            if (((O2) obj).R == this.R) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.R);
    }

    public final String toString() {
        return n3x.i(Float.valueOf(this.R), "AnimationVector1D: value = ");
    }

    @Override // defpackage.Pc
    public final int v() {
        return 1;
    }
}
