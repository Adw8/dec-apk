package defpackage;

import android.util.SparseIntArray;

/* renamed from: epC  reason: default package */
/* loaded from: classes.dex */
public final class epC {
    public Object R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3212R;
    public Object v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3213v;

    public /* synthetic */ epC(int i) {
    }

    public final int R(int i, int i2) {
        if (!this.f3213v) {
            return c(i, i2);
        }
        int i3 = ((SparseIntArray) this.v).get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int c = c(i, i2);
        ((SparseIntArray) this.v).put(i, c);
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f3213v
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r8.v
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = r1
        L_0x0011:
            if (r5 > r3) goto L_0x0022
            int r6 = r5 + r3
            int r6 = r6 >>> r2
            int r7 = r0.keyAt(r6)
            if (r7 >= r9) goto L_0x001f
            int r5 = r6 + 1
            goto L_0x0011
        L_0x001f:
            int r3 = r6 + -1
            goto L_0x0011
        L_0x0022:
            int r5 = r5 + r4
            if (r5 < 0) goto L_0x0030
            int r3 = r0.size()
            if (r5 >= r3) goto L_0x0030
            int r0 = r0.keyAt(r5)
            goto L_0x0031
        L_0x0030:
            r0 = r4
        L_0x0031:
            if (r0 == r4) goto L_0x0048
            java.lang.Object r3 = r8.v
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r8 = r8.v(r0, r10)
            int r8 = r8 + r2
            if (r8 != r10) goto L_0x004b
            int r3 = r3 + 1
            r8 = r1
            goto L_0x004b
        L_0x0048:
            r8 = r1
            r3 = r8
            r4 = r3
        L_0x004b:
            if (r4 >= r9) goto L_0x005d
            int r8 = r8 + 1
            if (r8 != r10) goto L_0x0055
            int r3 = r3 + 1
            r8 = r1
            goto L_0x005a
        L_0x0055:
            if (r8 <= r10) goto L_0x005a
            int r3 = r3 + 1
            r8 = r2
        L_0x005a:
            int r4 = r4 + 1
            goto L_0x004b
        L_0x005d:
            int r8 = r8 + r2
            if (r8 <= r10) goto L_0x0062
            int r3 = r3 + 1
        L_0x0062:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epC.c(int, int):int");
    }

    public final void e() {
        ((SparseIntArray) this.R).clear();
    }

    public final int v(int i, int i2) {
        if (!this.f3212R) {
            return i % i2;
        }
        int i3 = ((SparseIntArray) this.R).get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = i % i2;
        ((SparseIntArray) this.R).put(i, i4);
        return i4;
    }

    public epC() {
        this.R = new SparseIntArray();
        this.v = new SparseIntArray();
        this.f3212R = false;
        this.f3213v = false;
    }
}
