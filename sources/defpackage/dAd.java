package defpackage;

import java.util.NoSuchElementException;

/* renamed from: dAd  reason: default package */
/* loaded from: classes.dex */
public final class dAd {
    public final biT R = new biT(new i4C[16]);

    public final int R() {
        biT bit = this.R;
        if (!bit.x()) {
            int i = 0;
            int i2 = ((i4C) bit.f1772R[0]).v;
            biT bit2 = this.R;
            int i3 = bit2.e;
            if (i3 <= 0) {
                return i2;
            }
            Object[] objArr = bit2.f1772R;
            do {
                int i4 = ((i4C) objArr[i]).v;
                if (i4 > i2) {
                    i2 = i4;
                }
                i++;
            } while (i < i3);
            return i2;
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v() {
        /*
            r5 = this;
            biT r0 = r5.R
            boolean r1 = r0.x()
            if (r1 != 0) goto L_0x0039
            java.lang.Object[] r0 = r0.f1772R
            r1 = 0
            r0 = r0[r1]
            i4C r0 = (defpackage.i4C) r0
            int r0 = r0.R
            biT r5 = r5.R
            int r2 = r5.e
            if (r2 <= 0) goto L_0x0027
            java.lang.Object[] r5 = r5.f1772R
            r3 = r1
        L_0x001a:
            r4 = r5[r3]
            i4C r4 = (defpackage.i4C) r4
            int r4 = r4.R
            if (r4 >= r0) goto L_0x0023
            r0 = r4
        L_0x0023:
            int r3 = r3 + 1
            if (r3 < r2) goto L_0x001a
        L_0x0027:
            if (r0 < 0) goto L_0x002a
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x002d
            return r0
        L_0x002d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0039:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r0 = "MutableVector is empty."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dAd.v():int");
    }
}
