package defpackage;

/* renamed from: aX4  reason: default package */
/* loaded from: classes.dex */
public final class aX4 {
    public final iB8 R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f907R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f908R;
    public final boolean v;

    public aX4(iB8 ib8, boolean z, Object obj, boolean z2) {
        boolean z3 = false;
        if (ib8.f4484R || !z) {
            if ((z || !z2 || obj != null) ? true : z3) {
                this.R = ib8;
                this.f908R = z;
                this.f907R = obj;
                this.v = z2;
                return;
            }
            StringBuilder U = opT.U("Argument with type ");
            U.append(ib8.v());
            U.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(U.toString().toString());
        }
        throw new IllegalArgumentException((ib8.v() + " does not allow nullable values").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n3x.v(aX4.class, obj.getClass())) {
            return false;
        }
        aX4 ax4 = (aX4) obj;
        if (this.f908R != ax4.f908R || this.v != ax4.v || !n3x.v(this.R, ax4.R)) {
            return false;
        }
        Object obj2 = this.f907R;
        return obj2 != null ? n3x.v(obj2, ax4.f907R) : ax4.f907R == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.R.hashCode() * 31) + (this.f908R ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31;
        Object obj = this.f907R;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(aX4.class.getSimpleName());
        sb.append(" Type: " + this.R);
        sb.append(" Nullable: " + this.f908R);
        if (this.v) {
            StringBuilder U = opT.U(" DefaultValue: ");
            U.append(this.f907R);
            sb.append(U.toString());
        }
        return sb.toString();
    }
}
