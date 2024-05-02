package defpackage;

/* renamed from: _K  reason: default package */
/* loaded from: classes.dex */
public final class _K {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f693R = true;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f694R = new byte[4096];
    public int v;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (r8.f693R != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        r9 = r8.f694R.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r9 != r0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0020, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0021, code lost:
        r2 = r10.length;
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0024, code lost:
        if (r2 <= 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        r5 = r8.v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        if (r5 <= 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002a, code lost:
        r5 = java.lang.Math.min(r2, java.lang.Math.min(r9 - r8.R, r5));
        java.lang.System.arraycopy(r8.f694R, r8.R, r10, r4, r5);
        r6 = r8.R + r5;
        r8.R = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        if (r6 < r9) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        r8.R = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        r8.v -= r5;
        r2 = r2 - r5;
        r4 = r4 + r5;
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        if (r0 == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        notify();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int R(boolean r9, byte[] r10) {
        /*
            r8 = this;
            monitor-enter(r8)
        L_0x0001:
            int r0 = r8.v     // Catch: all -> 0x0056
            r1 = 0
            if (r0 != 0) goto L_0x0012
            boolean r2 = r8.f693R     // Catch: all -> 0x0056
            if (r2 == 0) goto L_0x0012
            if (r9 == 0) goto L_0x0010
            r8.wait()     // Catch: InterruptedException -> 0x0001, all -> 0x0056
            goto L_0x0001
        L_0x0010:
            monitor-exit(r8)
            return r1
        L_0x0012:
            boolean r9 = r8.f693R     // Catch: all -> 0x0056
            if (r9 != 0) goto L_0x0019
            r9 = -1
            monitor-exit(r8)
            return r9
        L_0x0019:
            byte[] r9 = r8.f694R     // Catch: all -> 0x0056
            int r9 = r9.length     // Catch: all -> 0x0056
            if (r9 != r0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            int r2 = r10.length     // Catch: all -> 0x0056
            r3 = r1
            r4 = r3
        L_0x0024:
            if (r2 <= 0) goto L_0x004f
            int r5 = r8.v     // Catch: all -> 0x0056
            if (r5 <= 0) goto L_0x004f
            int r6 = r8.R     // Catch: all -> 0x0056
            int r6 = r9 - r6
            int r5 = java.lang.Math.min(r6, r5)     // Catch: all -> 0x0056
            int r5 = java.lang.Math.min(r2, r5)     // Catch: all -> 0x0056
            byte[] r6 = r8.f694R     // Catch: all -> 0x0056
            int r7 = r8.R     // Catch: all -> 0x0056
            java.lang.System.arraycopy(r6, r7, r10, r4, r5)     // Catch: all -> 0x0056
            int r6 = r8.R     // Catch: all -> 0x0056
            int r6 = r6 + r5
            r8.R = r6     // Catch: all -> 0x0056
            if (r6 < r9) goto L_0x0046
            r8.R = r1     // Catch: all -> 0x0056
        L_0x0046:
            int r6 = r8.v     // Catch: all -> 0x0056
            int r6 = r6 - r5
            r8.v = r6     // Catch: all -> 0x0056
            int r2 = r2 - r5
            int r4 = r4 + r5
            int r3 = r3 + r5
            goto L_0x0024
        L_0x004f:
            if (r0 == 0) goto L_0x0054
            r8.notify()     // Catch: all -> 0x0056
        L_0x0054:
            monitor-exit(r8)
            return r3
        L_0x0056:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage._K.R(boolean, byte[]):int");
    }

    public final boolean v(byte[] bArr, int i) {
        int i2;
        int i3;
        if (i + 0 > bArr.length) {
            throw new IllegalArgumentException("length + offset > buffer.length");
        } else if (i > 0) {
            int length = this.f694R.length;
            synchronized (this) {
                int i4 = 0;
                while (true) {
                    boolean z = true;
                    if (i <= 0) {
                        return true;
                    }
                    while (true) {
                        try {
                            i2 = this.v;
                            if (length != i2 || !this.f693R) {
                                break;
                            }
                            try {
                                wait();
                            } catch (InterruptedException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!this.f693R) {
                        return false;
                    }
                    if (i2 != 0) {
                        z = false;
                    }
                    int min = Math.min(i, length - i2);
                    i -= min;
                    while (min > 0) {
                        int i5 = this.R;
                        int i6 = this.v + i5;
                        if (i6 >= length) {
                            i6 -= length;
                            i3 = i5 - i6;
                        } else {
                            i3 = length - i6;
                        }
                        int min2 = Math.min(i3, min);
                        System.arraycopy(bArr, i4, this.f694R, i6, min2);
                        i4 += min2;
                        min -= min2;
                        this.v += min2;
                    }
                    if (z) {
                        notify();
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("length <= 0");
        }
    }
}
