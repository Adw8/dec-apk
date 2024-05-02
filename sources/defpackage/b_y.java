package defpackage;

/* renamed from: b_y  reason: default package */
/* loaded from: classes.dex */
public final class b_y {
    public boolean R;
    public boolean c;
    public boolean e;
    public boolean v;

    public b_y(boolean z, boolean z2, boolean z3, boolean z4) {
        this.R = z;
        this.v = z2;
        this.c = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b_y)) {
            return false;
        }
        b_y b_y = (b_y) obj;
        return this.R == b_y.R && this.v == b_y.v && this.c == b_y.c && this.e == b_y.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r2 = this;
            boolean r0 = r2.R
            boolean r1 = r2.v
            if (r1 == 0) goto L_0x0008
            int r0 = r0 + 16
        L_0x0008:
            boolean r1 = r2.c
            if (r1 == 0) goto L_0x000e
            int r0 = r0 + 256
        L_0x000e:
            boolean r2 = r2.e
            if (r2 == 0) goto L_0x0014
            int r0 = r0 + 4096
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b_y.hashCode():int");
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.R), Boolean.valueOf(this.v), Boolean.valueOf(this.c), Boolean.valueOf(this.e));
    }
}
