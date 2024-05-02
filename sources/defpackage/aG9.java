package defpackage;

/* renamed from: aG9  reason: default package */
/* loaded from: classes.dex */
public final class aG9 {
    public float R = 0.0f;
    public float v = 0.0f;
    public float c = 0.0f;
    public float e = 0.0f;

    public final void R(float f, float f2, float f3, float f4) {
        this.R = Math.max(f, this.R);
        this.v = Math.max(f2, this.v);
        this.c = Math.min(f3, this.c);
        this.e = Math.min(f4, this.e);
    }

    public final String toString() {
        StringBuilder U = opT.U("MutableRect(");
        U.append(ooA.J(this.R));
        U.append(", ");
        U.append(ooA.J(this.v));
        U.append(", ");
        U.append(ooA.J(this.c));
        U.append(", ");
        U.append(ooA.J(this.e));
        U.append(')');
        return U.toString();
    }

    public final boolean v() {
        return this.R >= this.c || this.v >= this.e;
    }
}
