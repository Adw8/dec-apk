package defpackage;

/* renamed from: a80  reason: default package */
/* loaded from: classes.dex */
public final class a80 {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final nKE f742R;

    public a80(float f, nKE nke) {
        this.R = f;
        this.f742R = nke;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a80)) {
            return false;
        }
        a80 a80 = (a80) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(a80.R)) && n3x.v(this.f742R, a80.f742R);
    }

    public final int hashCode() {
        return this.f742R.hashCode() + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Fade(alpha=");
        U.append(this.R);
        U.append(", animationSpec=");
        U.append(this.f742R);
        U.append(')');
        return U.toString();
    }
}
