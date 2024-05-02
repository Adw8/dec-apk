package defpackage;

/* renamed from: ixU  reason: default package */
/* loaded from: classes.dex */
public final class ixU {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4778R;
    public final int X;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public final boolean f4779c;
    public final int e;

    /* renamed from: e  reason: collision with other field name */
    public final boolean f4780e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f4781v;

    public ixU(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.f4778R = z;
        this.f4781v = z2;
        this.R = i;
        this.f4779c = z3;
        this.f4780e = z4;
        this.v = i2;
        this.c = i3;
        this.e = i4;
        this.X = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n3x.v(ixU.class, obj.getClass())) {
            return false;
        }
        ixU ixu = (ixU) obj;
        if (this.f4778R == ixu.f4778R && this.f4781v == ixu.f4781v && this.R == ixu.R) {
            ixu.getClass();
            if (n3x.v(null, null) && this.f4779c == ixu.f4779c && this.f4780e == ixu.f4780e && this.v == ixu.v && this.c == ixu.c && this.e == ixu.e && this.X == ixu.X) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f4778R ? 1 : 0) * 31) + (this.f4781v ? 1 : 0)) * 31) + this.R) * 31) + 0) * 31) + (this.f4779c ? 1 : 0)) * 31) + (this.f4780e ? 1 : 0)) * 31) + this.v) * 31) + this.c) * 31) + this.e) * 31) + this.X;
    }
}
