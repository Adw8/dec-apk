package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Tf  reason: default package */
/* loaded from: classes.dex */
public abstract class Tf {
    public static final bz R = new bz("", null, 6);

    public static final ArrayList R(int i, int i2, List list) {
        if (i <= i2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                m3 m3Var = (m3) obj;
                if (v(i, i2, m3Var.R, m3Var.v)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                m3 m3Var2 = (m3) arrayList.get(i4);
                arrayList2.add(new m3(m3Var2.f5897R, Math.max(i, m3Var2.R) - i, Math.min(i2, m3Var2.v) - i, m3Var2.f5898R));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if ((r6 == r7) == (r4 == r5)) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        if ((r4 == r5) == (r6 == r7)) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean v(int r4, int r5, int r6, int r7) {
        /*
            int r0 = java.lang.Math.max(r4, r6)
            int r1 = java.lang.Math.min(r5, r7)
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L_0x003a
            if (r4 > r6) goto L_0x0020
            if (r7 > r5) goto L_0x0020
            if (r5 != r7) goto L_0x001e
            if (r6 != r7) goto L_0x0016
            r0 = r3
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r4 != r5) goto L_0x001b
            r1 = r3
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            if (r0 != r1) goto L_0x0020
        L_0x001e:
            r0 = r3
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            if (r0 != 0) goto L_0x003a
            if (r6 > r4) goto L_0x0037
            if (r5 > r7) goto L_0x0037
            if (r7 != r5) goto L_0x0035
            if (r4 != r5) goto L_0x002d
            r4 = r3
            goto L_0x002e
        L_0x002d:
            r4 = r2
        L_0x002e:
            if (r6 != r7) goto L_0x0032
            r5 = r3
            goto L_0x0033
        L_0x0032:
            r5 = r2
        L_0x0033:
            if (r4 != r5) goto L_0x0037
        L_0x0035:
            r4 = r3
            goto L_0x0038
        L_0x0037:
            r4 = r2
        L_0x0038:
            if (r4 == 0) goto L_0x003b
        L_0x003a:
            r2 = r3
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Tf.v(int, int, int, int):boolean");
    }
}
