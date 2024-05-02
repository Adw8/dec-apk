package defpackage;

/* renamed from: djV  reason: default package */
/* loaded from: classes.dex */
public final class djV {
    public static final djV R = new djV(false, 0, true, 1, 1);

    /* renamed from: R  reason: collision with other field name */
    public final int f2844R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2845R;
    public final int c;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f2846v;

    public djV(boolean z, int i, boolean z2, int i2, int i3) {
        this.f2845R = z;
        this.f2844R = i;
        this.f2846v = z2;
        this.v = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djV)) {
            return false;
        }
        djV djv = (djV) obj;
        if (this.f2845R != djv.f2845R) {
            return false;
        }
        if (!(this.f2844R == djv.f2844R) || this.f2846v != djv.f2846v) {
            return false;
        }
        if (!(this.v == djv.v)) {
            return false;
        }
        return this.c == djv.c;
    }

    public final int hashCode() {
        int e = opT.e(this.f2844R, Boolean.hashCode(this.f2845R) * 31, 31);
        return Integer.hashCode(this.c) + opT.e(this.v, (Boolean.hashCode(this.f2846v) + e) * 31, 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("ImeOptions(singleLine=");
        U.append(this.f2845R);
        U.append(", capitalization=");
        U.append((Object) hDC.M(this.f2844R));
        U.append(", autoCorrect=");
        U.append(this.f2846v);
        U.append(", keyboardType=");
        U.append((Object) dxh.H(this.v));
        U.append(", imeAction=");
        U.append((Object) j8k.R(this.c));
        U.append(')');
        return U.toString();
    }
}
