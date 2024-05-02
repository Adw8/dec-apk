package defpackage;

/* renamed from: o5  reason: default package */
/* loaded from: classes.dex */
public final class o5 implements o3t {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final qD f6667R;

    public o5(qD qDVar, float f) {
        this.f6667R = qDVar;
        this.R = f;
    }

    @Override // defpackage.o3t
    public final a1 R() {
        return this.f6667R;
    }

    @Override // defpackage.o3t
    public final long c() {
        int i = n3.R;
        return n3.O;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return n3x.v(this.f6667R, o5Var.f6667R) && n3x.v(Float.valueOf(this.R), Float.valueOf(o5Var.R));
    }

    public final int hashCode() {
        return Float.hashCode(this.R) + (this.f6667R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("BrushStyle(value=");
        U.append(this.f6667R);
        U.append(", alpha=");
        return jQ.N(U, this.R, ')');
    }

    @Override // defpackage.o3t
    public final float v() {
        return this.R;
    }
}
