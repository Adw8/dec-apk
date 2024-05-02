package defpackage;

/* renamed from: p6  reason: default package */
/* loaded from: classes.dex */
public final class p6 {
    public final float R;
    public final float v;

    public p6(float f, float f2) {
        this.R = f;
        this.v = f2;
    }

    public static boolean c(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final Comparable R() {
        return Float.valueOf(this.v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if ((r3.R > r3.v) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.p6
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003c
            float r0 = r5.R
            float r5 = r5.v
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r1
        L_0x0011:
            if (r3 == 0) goto L_0x0023
            r3 = r6
            p6 r3 = (defpackage.p6) r3
            float r4 = r3.R
            float r3 = r3.v
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0020
            r3 = r2
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 != 0) goto L_0x003b
        L_0x0023:
            p6 r6 = (defpackage.p6) r6
            float r3 = r6.R
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
            r0 = r2
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            if (r0 == 0) goto L_0x003c
            float r6 = r6.v
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0038
            r5 = r2
            goto L_0x0039
        L_0x0038:
            r5 = r1
        L_0x0039:
            if (r5 == 0) goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        float f = this.R;
        if (f > this.v) {
            return -1;
        }
        return Float.valueOf(this.v).hashCode() + (Float.valueOf(f).hashCode() * 31);
    }

    public final String toString() {
        return this.R + ".." + this.v;
    }

    public final Comparable v() {
        return Float.valueOf(this.R);
    }
}
