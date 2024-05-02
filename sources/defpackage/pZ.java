package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: pZ  reason: default package */
/* loaded from: classes.dex */
public final class pZ implements axx {
    public final Object R;
    public final /* synthetic */ int e = 2;
    public final Object v;

    public pZ(pqF pqf, pZ pZVar) {
        this.R = pqf;
        this.v = pZVar;
    }

    @Override // defpackage.axx
    public final void K(ME me, long j) {
        boolean z;
        switch (this.e) {
            case 0:
                long j2 = j;
                do {
                    int read = me.read(((ByteBuffer) this.R).array(), ((ByteBuffer) this.R).position(), Integer.min(((ByteBuffer) this.R).remaining(), (int) j));
                    ByteBuffer byteBuffer = (ByteBuffer) this.R;
                    byteBuffer.position(byteBuffer.position() + read);
                    if (((ByteBuffer) this.R).remaining() == 0) {
                        flush();
                    }
                    j2 -= (long) read;
                    int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                    if (i != 0) {
                        if (i > 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                    } else {
                        return;
                    }
                } while (z);
                throw new IllegalStateException("Check failed.".toString());
            case 1:
                iTI.e(me.R, 0, j);
                while (j > 0) {
                    h11 h11 = me.f290R;
                    long j3 = 0;
                    while (true) {
                        if (j3 < 65536) {
                            j3 += (long) (h11.v - h11.R);
                            if (j3 >= j) {
                                j3 = j;
                            } else {
                                h11 = h11.f4016R;
                            }
                        }
                    }
                    kU kUVar = (kU) this.R;
                    axx axx = (axx) this.v;
                    kUVar.Z();
                    try {
                        axx.K(me, j3);
                        if (!kUVar.m()) {
                            j -= j3;
                        } else {
                            throw kUVar.x(null);
                        }
                    } catch (IOException e) {
                        if (kUVar.m()) {
                            throw kUVar.x(e);
                        }
                        throw e;
                    } finally {
                        kUVar.m();
                    }
                }
                return;
            default:
                iTI.e(me.R, 0, j);
                while (j > 0) {
                    ((hqj) this.v).O();
                    h11 h112 = me.f290R;
                    int min = (int) Math.min(j, (long) (h112.v - h112.R));
                    ((OutputStream) this.R).write(h112.f4018R, h112.R, min);
                    int i2 = h112.R + min;
                    h112.R = i2;
                    long j4 = (long) min;
                    j -= j4;
                    me.R -= j4;
                    if (i2 == h112.v) {
                        me.f290R = h112.R();
                        g_1.R(h112);
                    }
                }
                return;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0006 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kU] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kU] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.axx, java.io.Closeable, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r2 = this;
            int r0 = r2.e
            switch(r0) {
                case 0: goto L_0x0034;
                case 1: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0035
        L_0x0006:
            java.lang.Object r0 = r2.R
            kU r0 = (defpackage.kU) r0
            java.lang.Object r2 = r2.v
            axx r2 = (defpackage.axx) r2
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
            return
        L_0x0035:
            java.lang.Object r2 = r2.R
            java.io.OutputStream r2 = (java.io.OutputStream) r2
            r2.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pZ.close():void");
    }

    @Override // defpackage.axx
    public final hqj e() {
        switch (this.e) {
            case 0:
                return hqj.R;
            case 1:
                return (kU) this.R;
            default:
                return (hqj) this.v;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0006 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kU] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kU] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.axx, java.io.Flushable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void flush() {
        /*
            r7 = this;
            int r0 = r7.e
            switch(r0) {
                case 0: goto L_0x0034;
                case 1: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x005c
        L_0x0006:
            java.lang.Object r0 = r7.R
            kU r0 = (defpackage.kU) r0
            java.lang.Object r7 = r7.v
            axx r7 = (defpackage.axx) r7
            r0.Z()
            r7.flush()     // Catch: IOException -> 0x0023, all -> 0x0021
            boolean r7 = r0.m()
            if (r7 != 0) goto L_0x001b
            return
        L_0x001b:
            r7 = 0
            java.io.InterruptedIOException r7 = r0.x(r7)
            throw r7
        L_0x0021:
            r7 = move-exception
            goto L_0x0030
        L_0x0023:
            r7 = move-exception
            boolean r1 = r0.m()     // Catch: all -> 0x0021
            if (r1 != 0) goto L_0x002b
            goto L_0x002f
        L_0x002b:
            java.io.InterruptedIOException r7 = r0.x(r7)     // Catch: all -> 0x0021
        L_0x002f:
            throw r7     // Catch: all -> 0x0021
        L_0x0030:
            r0.m()
            throw r7
        L_0x0034:
            java.lang.Object r0 = r7.v
            w1 r0 = (defpackage.w1) r0
            wJ r1 = r0.f7446R
            int r3 = r0.X
            int r4 = r0.O
            java.lang.Object r0 = r7.R
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            byte[] r5 = r0.array()
            java.lang.Object r0 = r7.R
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r6 = r0.position()
            r2 = 1163154007(0x45545257, float:3397.1462)
            r1.R(r2, r3, r4, r5, r6)
            java.lang.Object r7 = r7.R
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            r7.clear()
            return
        L_0x005c:
            java.lang.Object r7 = r7.R
            java.io.OutputStream r7 = (java.io.OutputStream) r7
            r7.flush()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pZ.flush():void");
    }

    @Override // java.lang.Object
    public final String toString() {
        switch (this.e) {
            case 1:
                StringBuilder U = opT.U("AsyncTimeout.sink(");
                U.append((axx) this.v);
                U.append(')');
                return U.toString();
            case 2:
                StringBuilder U2 = opT.U("sink(");
                U2.append((OutputStream) this.R);
                U2.append(')');
                return U2.toString();
            default:
                return super.toString();
        }
    }

    public pZ(OutputStream outputStream, pqF pqf) {
        this.R = outputStream;
        this.v = pqf;
    }
}
