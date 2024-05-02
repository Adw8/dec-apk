package defpackage;

/* renamed from: mk9  reason: default package */
/* loaded from: classes.dex */
public final class mk9 {
    public static final mk9 R;
    public static final mk9 v;

    /* renamed from: R  reason: collision with other field name */
    public final long f6144R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6145R;

    static {
        long j = o2S.c;
        R = new mk9(false, j, Float.NaN, Float.NaN, true, false);
        v = new mk9(true, j, Float.NaN, Float.NaN, true, false);
    }

    public mk9(boolean z, long j, float f, float f2, boolean z2, boolean z3) {
        this.f6145R = z;
        this.f6144R = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk9)) {
            return false;
        }
        mk9 mk9 = (mk9) obj;
        if (this.f6145R != mk9.f6145R) {
            return false;
        }
        return ((this.f6144R > mk9.f6144R ? 1 : (this.f6144R == mk9.f6144R ? 0 : -1)) == 0) && hoI.R(Float.NaN, Float.NaN) && hoI.R(Float.NaN, Float.NaN);
    }

    public final int hashCode() {
        long j = this.f6144R;
        int i = o2S.R;
        int c = jQ.c(Float.NaN, jQ.c(Float.NaN, opT.X(j, Boolean.hashCode(this.f6145R) * 31, 31), 31), 31);
        return Boolean.hashCode(false) + ((Boolean.hashCode(true) + c) * 31);
    }

    public final String toString() {
        if (this.f6145R) {
            return "MagnifierStyle.TextDefault";
        }
        StringBuilder U = opT.U("MagnifierStyle(size=");
        U.append((Object) o2S.c(this.f6144R));
        U.append(", cornerRadius=");
        U.append((Object) hoI.v(Float.NaN));
        U.append(", elevation=");
        U.append((Object) hoI.v(Float.NaN));
        U.append(", clippingEnabled=");
        U.append(true);
        U.append(", fishEyeEnabled=");
        U.append(false);
        U.append(')');
        return U.toString();
    }
}
