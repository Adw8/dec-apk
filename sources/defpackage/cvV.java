package defpackage;

/* renamed from: cvV  reason: default package */
/* loaded from: classes.dex */
public final class cvV {
    public final axi R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2456R;
    public final boolean X;
    public final boolean c;
    public final boolean e;
    public final boolean v;

    public cvV(boolean z, boolean z2, int i) {
        boolean z3 = false;
        z = (i & 1) != 0 ? false : z;
        boolean z4 = (i & 2) != 0;
        boolean z5 = (i & 4) != 0;
        axi axi = (i & 8) != 0 ? axi.Inherit : null;
        z2 = (i & 16) != 0 ? true : z2;
        z3 = (i & 32) != 0 ? true : z3;
        this.f2456R = z;
        this.v = z4;
        this.c = z5;
        this.R = axi;
        this.e = z2;
        this.X = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvV)) {
            return false;
        }
        cvV cvv = (cvV) obj;
        return this.f2456R == cvv.f2456R && this.v == cvv.v && this.c == cvv.c && this.R == cvv.R && this.e == cvv.e && this.X == cvv.X;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f2456R);
        int hashCode2 = Boolean.hashCode(this.v);
        int hashCode3 = Boolean.hashCode(this.c);
        int hashCode4 = this.R.hashCode();
        int hashCode5 = Boolean.hashCode(this.e);
        int hashCode6 = Boolean.hashCode(this.X);
        return Boolean.hashCode(false) + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Boolean.hashCode(this.v) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
