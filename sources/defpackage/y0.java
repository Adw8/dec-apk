package defpackage;

/* renamed from: y0  reason: default package */
/* loaded from: classes.dex */
public final class y0 extends fd {
    public static y0 R;

    public final boolean O(int i) {
        return e().charAt(i) != '\n' && (i == 0 || e().charAt(i - 1) == '\n');
    }

    @Override // defpackage.qe
    public final int[] R(int i) {
        int length = e().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0) {
            int i2 = i - 1;
            if (e().charAt(i2) != '\n' || X(i)) {
                break;
            }
            i = i2;
        }
        if (i <= 0) {
            return null;
        }
        int i3 = i - 1;
        while (i3 > 0 && !O(i3)) {
            i3--;
        }
        return c(i3, i);
    }

    public final boolean X(int i) {
        return i > 0 && e().charAt(i + -1) != '\n' && (i == e().length() || e().charAt(i) == '\n');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return null;
     */
    @Override // defpackage.qe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] v(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.e()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L_0x000c
            return r1
        L_0x000c:
            if (r5 < r0) goto L_0x000f
            return r1
        L_0x000f:
            if (r5 >= 0) goto L_0x0012
            r5 = 0
        L_0x0012:
            if (r5 >= r0) goto L_0x0029
            java.lang.String r2 = r4.e()
            char r2 = r2.charAt(r5)
            r3 = 10
            if (r2 != r3) goto L_0x0029
            boolean r2 = r4.O(r5)
            if (r2 != 0) goto L_0x0029
            int r5 = r5 + 1
            goto L_0x0012
        L_0x0029:
            if (r5 < r0) goto L_0x002c
            return r1
        L_0x002c:
            int r1 = r5 + 1
        L_0x002e:
            if (r1 >= r0) goto L_0x0039
            boolean r2 = r4.X(r1)
            if (r2 != 0) goto L_0x0039
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0039:
            int[] r4 = r4.c(r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0.v(int):int[]");
    }
}
