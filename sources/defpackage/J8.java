package defpackage;

import java.io.InputStream;

/* renamed from: J8  reason: default package */
/* loaded from: classes.dex */
public final class J8 implements fGn {
    public final Object R;
    public final /* synthetic */ int e = 1;
    public final Object v;

    public J8(pqF pqf, J8 j8) {
        this.R = pqf;
        this.v = j8;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0006 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kU] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kU] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.fGn
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long Y(defpackage.ME r4, long r5) {
        /*
            r3 = this;
            int r0 = r3.e
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0035
        L_0x0006:
            java.lang.Object r0 = r3.R
            kU r0 = (defpackage.kU) r0
            java.lang.Object r3 = r3.v
            fGn r3 = (defpackage.fGn) r3
            r0.Z()
            long r3 = r3.Y(r4, r5)     // Catch: IOException -> 0x0024, all -> 0x0022
            boolean r5 = r0.m()
            if (r5 != 0) goto L_0x001c
            return r3
        L_0x001c:
            r3 = 0
            java.io.InterruptedIOException r3 = r0.x(r3)
            throw r3
        L_0x0022:
            r3 = move-exception
            goto L_0x0031
        L_0x0024:
            r3 = move-exception
            boolean r4 = r0.m()     // Catch: all -> 0x0022
            if (r4 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            java.io.InterruptedIOException r3 = r0.x(r3)     // Catch: all -> 0x0022
        L_0x0030:
            throw r3     // Catch: all -> 0x0022
        L_0x0031:
            r0.m()
            throw r3
        L_0x0035:
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x003c
            goto L_0x0085
        L_0x003c:
            r0 = 1
            if (r2 < 0) goto L_0x0041
            r1 = r0
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x0094
            java.lang.Object r1 = r3.v     // Catch: AssertionError -> 0x0086
            hqj r1 = (defpackage.hqj) r1     // Catch: AssertionError -> 0x0086
            r1.O()     // Catch: AssertionError -> 0x0086
            h11 r0 = r4.M(r0)     // Catch: AssertionError -> 0x0086
            int r1 = r0.v     // Catch: AssertionError -> 0x0086
            int r1 = 8192 - r1
            long r1 = (long) r1     // Catch: AssertionError -> 0x0086
            long r5 = java.lang.Math.min(r5, r1)     // Catch: AssertionError -> 0x0086
            int r5 = (int) r5     // Catch: AssertionError -> 0x0086
            java.lang.Object r3 = r3.R     // Catch: AssertionError -> 0x0086
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch: AssertionError -> 0x0086
            byte[] r6 = r0.f4018R     // Catch: AssertionError -> 0x0086
            int r1 = r0.v     // Catch: AssertionError -> 0x0086
            int r3 = r3.read(r6, r1, r5)     // Catch: AssertionError -> 0x0086
            r5 = -1
            if (r3 != r5) goto L_0x007a
            int r3 = r0.R     // Catch: AssertionError -> 0x0086
            int r5 = r0.v     // Catch: AssertionError -> 0x0086
            if (r3 != r5) goto L_0x0077
            h11 r3 = r0.R()     // Catch: AssertionError -> 0x0086
            r4.f290R = r3     // Catch: AssertionError -> 0x0086
            defpackage.g_1.R(r0)     // Catch: AssertionError -> 0x0086
        L_0x0077:
            r0 = -1
            goto L_0x0085
        L_0x007a:
            int r5 = r0.v     // Catch: AssertionError -> 0x0086
            int r5 = r5 + r3
            r0.v = r5     // Catch: AssertionError -> 0x0086
            long r5 = r4.R     // Catch: AssertionError -> 0x0086
            long r0 = (long) r3     // Catch: AssertionError -> 0x0086
            long r5 = r5 + r0
            r4.R = r5     // Catch: AssertionError -> 0x0086
        L_0x0085:
            return r0
        L_0x0086:
            r3 = move-exception
            boolean r4 = defpackage.mLz.m(r3)
            if (r4 == 0) goto L_0x0093
            java.io.IOException r4 = new java.io.IOException
            r4.<init>(r3)
            throw r4
        L_0x0093:
            throw r3
        L_0x0094:
            java.lang.String r3 = "byteCount < 0: "
            java.lang.String r3 = defpackage.opT.x(r3, r5)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.J8.Y(ME, long):long");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0006 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kU] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kU] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r2 = this;
            int r0 = r2.e
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0034
        L_0x0006:
            java.lang.Object r0 = r2.R
            kU r0 = (defpackage.kU) r0
            java.lang.Object r2 = r2.v
            fGn r2 = (defpackage.fGn) r2
            r0.Z()
            r2.close()     // Catch: IOException -> 0x0023, all -> 0x0021
            boolean r2 = r0.m()
            if (r2 != 0) goto L_0x001b
            return
        L_0x001b:
            r2 = 0
            java.io.InterruptedIOException r2 = r0.x(r2)
            throw r2
        L_0x0021:
            r2 = move-exception
            goto L_0x0030
        L_0x0023:
            r2 = move-exception
            boolean r1 = r0.m()     // Catch: all -> 0x0021
            if (r1 != 0) goto L_0x002b
            goto L_0x002f
        L_0x002b:
            java.io.InterruptedIOException r2 = r0.x(r2)     // Catch: all -> 0x0021
        L_0x002f:
            throw r2     // Catch: all -> 0x0021
        L_0x0030:
            r0.m()
            throw r2
        L_0x0034:
            java.lang.Object r2 = r2.R
            java.io.InputStream r2 = (java.io.InputStream) r2
            r2.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.J8.close():void");
    }

    @Override // defpackage.fGn
    public final hqj e() {
        switch (this.e) {
            case 0:
                return (kU) this.R;
            default:
                return (hqj) this.v;
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        switch (this.e) {
            case 0:
                StringBuilder U = opT.U("AsyncTimeout.source(");
                U.append((fGn) this.v);
                U.append(')');
                return U.toString();
            default:
                StringBuilder U2 = opT.U("source(");
                U2.append((InputStream) this.R);
                U2.append(')');
                return U2.toString();
        }
    }

    public J8(InputStream inputStream, hqj hqj) {
        this.R = inputStream;
        this.v = hqj;
    }
}
