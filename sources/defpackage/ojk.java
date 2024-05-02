package defpackage;

import android.graphics.Insets;

/* renamed from: ojk  reason: default package */
/* loaded from: classes.dex */
public final class ojk {
    public static final ojk R = new ojk(0, 0, 0, 0);

    /* renamed from: R  reason: collision with other field name */
    public final int f6899R;
    public final int c;
    public final int e;
    public final int v;

    public ojk(int i, int i2, int i3, int i4) {
        this.f6899R = i;
        this.v = i2;
        this.c = i3;
        this.e = i4;
    }

    public static ojk R(ojk ojk, ojk ojk2) {
        return v(Math.max(ojk.f6899R, ojk2.f6899R), Math.max(ojk.v, ojk2.v), Math.max(ojk.c, ojk2.c), Math.max(ojk.e, ojk2.e));
    }

    public static ojk c(Insets insets) {
        return v(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static ojk v(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? R : new ojk(i, i2, i3, i4);
    }

    public final Insets e() {
        return ivy.R(this.f6899R, this.v, this.c, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ojk.class != obj.getClass()) {
            return false;
        }
        ojk ojk = (ojk) obj;
        return this.e == ojk.e && this.f6899R == ojk.f6899R && this.c == ojk.c && this.v == ojk.v;
    }

    public final int hashCode() {
        return (((((this.f6899R * 31) + this.v) * 31) + this.c) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder U = opT.U("Insets{left=");
        U.append(this.f6899R);
        U.append(", top=");
        U.append(this.v);
        U.append(", right=");
        U.append(this.c);
        U.append(", bottom=");
        return jQ.P(U, this.e, '}');
    }
}
