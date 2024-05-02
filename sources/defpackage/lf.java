package defpackage;

/* renamed from: lf  reason: default package */
/* loaded from: classes.dex */
public final class lf {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final a1 f5797R;

    public lf(float f, oSW osw) {
        this.R = f;
        this.f5797R = osw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj;
        return hoI.R(this.R, lfVar.R) && n3x.v(this.f5797R, lfVar.f5797R);
    }

    public final int hashCode() {
        return this.f5797R.hashCode() + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("BorderStroke(width=");
        U.append((Object) hoI.v(this.R));
        U.append(", brush=");
        U.append(this.f5797R);
        U.append(')');
        return U.toString();
    }
}
