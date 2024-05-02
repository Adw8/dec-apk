package defpackage;

/* renamed from: h8A  reason: default package */
/* loaded from: classes.dex */
public final class h8A {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final F6 f4088R;
    public final F6 v;
    public static final F6 c = kgV.e(":");
    public static final F6 e = kgV.e(":status");
    public static final F6 X = kgV.e(":method");
    public static final F6 O = kgV.e(":path");
    public static final F6 L = kgV.e(":scheme");
    public static final F6 Z = kgV.e(":authority");

    static {
        F6 f6 = F6.R;
    }

    public h8A(F6 f6, F6 f62) {
        this.f4088R = f6;
        this.v = f62;
        this.R = f62.v() + f6.v() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8A)) {
            return false;
        }
        h8A h8a = (h8A) obj;
        return n3x.v(this.f4088R, h8a.f4088R) && n3x.v(this.v, h8a.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + (this.f4088R.hashCode() * 31);
    }

    public final String toString() {
        return this.f4088R.m() + ": " + this.v.m();
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public h8A(String str, String str2) {
        this(kgV.e(str), kgV.e(str2));
        F6 f6 = F6.R;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public h8A(String str, F6 f6) {
        this(f6, kgV.e(str));
        F6 f62 = F6.R;
    }
}
