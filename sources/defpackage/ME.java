package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: ME  reason: default package */
/* loaded from: classes.dex */
public final class ME implements Jl, NV, Cloneable, ByteChannel {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public h11 f290R;

    @Override // defpackage.NV
    public final /* bridge */ /* synthetic */ NV A(long j) {
        q(j);
        return this;
    }

    public final String B(long j) {
        return k(j, O1.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4 A[EDGE_INSN: B:42:0x00b4->B:37:0x00b4 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.Jl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long D() {
        /*
            r15 = this;
            long r0 = r15.R
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00bb
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        L_0x000c:
            h11 r7 = r15.f290R
            byte[] r8 = r7.f4018R
            int r9 = r7.R
            int r10 = r7.v
        L_0x0014:
            r11 = 1
            if (r9 >= r10) goto L_0x00a0
            byte r12 = r8[r9]
            r13 = 48
            byte r13 = (byte) r13
            if (r12 < r13) goto L_0x0026
            r14 = 57
            byte r14 = (byte) r14
            if (r12 > r14) goto L_0x0026
            int r11 = r12 - r13
            goto L_0x003f
        L_0x0026:
            r13 = 97
            byte r13 = (byte) r13
            if (r12 < r13) goto L_0x0031
            r14 = 102(0x66, float:1.43E-43)
            byte r14 = (byte) r14
            if (r12 > r14) goto L_0x0031
            goto L_0x003b
        L_0x0031:
            r13 = 65
            byte r13 = (byte) r13
            if (r12 < r13) goto L_0x0071
            r14 = 70
            byte r14 = (byte) r14
            if (r12 > r14) goto L_0x0071
        L_0x003b:
            int r11 = r12 - r13
            int r11 = r11 + 10
        L_0x003f:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x004f
            r12 = 4
            long r4 = r4 << r12
            long r11 = (long) r11
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L_0x0014
        L_0x004f:
            ME r15 = new ME
            r15.<init>()
            r15.q(r4)
            r15.a(r12)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Number too large: "
            java.lang.StringBuilder r1 = defpackage.opT.U(r1)
            java.lang.String r15 = r15.G()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x0071:
            if (r1 == 0) goto L_0x0075
            r6 = r11
            goto L_0x00a0
        L_0x0075:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = defpackage.opT.U(r1)
            r2 = 2
            char[] r2 = new char[r2]
            char[] r3 = defpackage.me6.f6099R
            int r4 = r12 >> 4
            r4 = r4 & 15
            char r4 = r3[r4]
            r2[r0] = r4
            r0 = r12 & 15
            char r0 = r3[r0]
            r2[r11] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L_0x00a0:
            if (r9 != r10) goto L_0x00ac
            h11 r8 = r7.R()
            r15.f290R = r8
            defpackage.g_1.R(r7)
            goto L_0x00ae
        L_0x00ac:
            r7.R = r9
        L_0x00ae:
            if (r6 != 0) goto L_0x00b4
            h11 r7 = r15.f290R
            if (r7 != 0) goto L_0x000c
        L_0x00b4:
            long r2 = r15.R
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.R = r2
            return r4
        L_0x00bb:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ME.D():long");
    }

    @Override // defpackage.Jl
    public final String E() {
        return _(Long.MAX_VALUE);
    }

    @Override // defpackage.NV
    public final NV F(String str, Charset charset) {
        return zw(str, 0, str.length(), charset);
    }

    public final String G() {
        return k(this.R, O1.R);
    }

    @Override // defpackage.NV
    public final /* bridge */ /* synthetic */ NV I(int i) {
        a(i);
        return this;
    }

    @Override // defpackage.Jl
    public final void J(long j) {
        while (j > 0) {
            h11 h11 = this.f290R;
            if (h11 != null) {
                int min = (int) Math.min(j, (long) (h11.v - h11.R));
                long j2 = (long) min;
                this.R -= j2;
                j -= j2;
                int i = h11.R + min;
                h11.R = i;
                if (i == h11.v) {
                    this.f290R = h11.R();
                    g_1.R(h11);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.axx
    public final void K(ME me, long j) {
        h11 h11;
        if (me != this) {
            iTI.e(me.R, 0, j);
            while (j > 0) {
                h11 h112 = me.f290R;
                int i = h112.v - h112.R;
                if (j < ((long) i)) {
                    h11 h113 = this.f290R;
                    h11 h114 = h113 != null ? h113.f4019v : null;
                    if (h114 != null && h114.f4020v) {
                        if ((((long) h114.v) + j) - ((long) (h114.f4017R ? 0 : h114.R)) <= 8192) {
                            h112.e(h114, (int) j);
                            me.R -= j;
                            this.R += j;
                            return;
                        }
                    }
                    int i2 = (int) j;
                    if (i2 > 0 && i2 <= i) {
                        if (i2 >= 1024) {
                            h11 = h112.c();
                        } else {
                            h11 = g_1.v();
                            byte[] bArr = h112.f4018R;
                            byte[] bArr2 = h11.f4018R;
                            int i3 = h112.R;
                            P7.s(bArr, bArr2, 0, i3, i3 + i2, 2);
                        }
                        h11.v = h11.R + i2;
                        h112.R += i2;
                        h112.f4019v.v(h11);
                        me.f290R = h11;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                h11 h115 = me.f290R;
                long j2 = (long) (h115.v - h115.R);
                me.f290R = h115.R();
                h11 h116 = this.f290R;
                if (h116 == null) {
                    this.f290R = h115;
                    h115.f4019v = h115;
                    h115.f4016R = h115;
                } else {
                    h116.f4019v.v(h115);
                    h11 h117 = h115.f4019v;
                    if (!(h117 != h115)) {
                        throw new IllegalStateException("cannot compact".toString());
                    } else if (h117.f4020v) {
                        int i4 = h115.v - h115.R;
                        if (i4 <= (8192 - h117.v) + (h117.f4017R ? 0 : h117.R)) {
                            h115.e(h117, i4);
                            h115.R();
                            g_1.R(h115);
                        }
                    }
                }
                me.R -= j2;
                this.R += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final h11 M(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            h11 h11 = this.f290R;
            if (h11 == null) {
                h11 v = g_1.v();
                this.f290R = v;
                v.f4019v = v;
                v.f4016R = v;
                return v;
            }
            h11 h112 = h11.f4019v;
            if (h112.v + i <= 8192 && h112.f4020v) {
                return h112;
            }
            h11 v2 = g_1.v();
            h112.v(v2);
            return v2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // defpackage.Jl
    public final byte[] N(long j) {
        int i = 0;
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(opT.x("byteCount: ", j).toString());
        } else if (this.R >= j) {
            int i2 = (int) j;
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read = read(bArr, i, i2 - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final long O() {
        long j = this.R;
        if (j == 0) {
            return 0;
        }
        h11 h11 = this.f290R.f4019v;
        int i = h11.v;
        if (i < 8192 && h11.f4020v) {
            j -= (long) (i - h11.R);
        }
        return j;
    }

    @Override // defpackage.Jl
    public final void P(long j) {
        if (this.R < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.Jl
    public final long Q(ME me) {
        long j = this.R;
        if (j > 0) {
            me.K(this, j);
        }
        return j;
    }

    @Override // defpackage.Jl
    public final F6 S(long j) {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(opT.x("byteCount: ", j).toString());
        } else if (this.R < j) {
            throw new EOFException();
        } else if (j < 4096) {
            return new F6(N(j));
        } else {
            F6 l = l((int) j);
            J(j);
            return l;
        }
    }

    @Override // defpackage.Jl
    public final long T(F6 f6) {
        return o(0, f6);
    }

    @Override // defpackage.Jl
    public final boolean U(F6 f6) {
        byte[] bArr = f6.f115R;
        int length = bArr.length;
        if (length < 0 || this.R - 0 < ((long) length) || bArr.length - 0 < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (j(((long) i) + 0) != f6.f115R[0 + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.NV
    public final /* bridge */ /* synthetic */ NV V(int i) {
        X4(i);
        return this;
    }

    public final short W() {
        int readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final void X() {
        J(this.R);
    }

    public final void X4(int i) {
        h11 M = M(2);
        byte[] bArr = M.f4018R;
        int i2 = M.v;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        M.v = i3 + 1;
        this.R += 2;
    }

    @Override // defpackage.fGn
    public final long Y(ME me, long j) {
        if (j >= 0) {
            long j2 = this.R;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            me.K(this, j);
            return j;
        }
        throw new IllegalArgumentException(opT.x("byteCount < 0: ", j).toString());
    }

    public final void Z(ME me, long j, long j2) {
        iTI.e(this.R, j, j2);
        if (j2 != 0) {
            me.R += j2;
            h11 h11 = this.f290R;
            while (true) {
                long j3 = (long) (h11.v - h11.R);
                if (j >= j3) {
                    j -= j3;
                    h11 = h11.f4016R;
                }
            }
            while (j2 > 0) {
                h11 c = h11.c();
                int i = c.R + ((int) j);
                c.R = i;
                c.v = Math.min(i + ((int) j2), c.v);
                h11 h112 = me.f290R;
                if (h112 == null) {
                    c.f4019v = c;
                    c.f4016R = c;
                    me.f290R = c;
                } else {
                    h112.f4019v.v(c);
                }
                j2 -= (long) (c.v - c.R);
                h11 = h11.f4016R;
                j = 0;
            }
        }
    }

    @Override // defpackage.Jl
    public final String _(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long t = t(b, 0, j2);
            if (t != -1) {
                return kn1.v(this, t);
            }
            if (j2 < this.R && j(j2 - 1) == ((byte) 13) && j(j2) == b) {
                return kn1.v(this, j2);
            }
            ME me = new ME();
            Z(me, 0, Math.min((long) 32, this.R));
            StringBuilder U = opT.U("\\n not found: limit=");
            U.append(Math.min(this.R, j));
            U.append(" content=");
            U.append(me.h().c());
            U.append((char) 8230);
            throw new EOFException(U.toString());
        }
        throw new IllegalArgumentException(opT.x("limit < 0: ", j).toString());
    }

    public final void a(int i) {
        h11 M = M(1);
        byte[] bArr = M.f4018R;
        int i2 = M.v;
        M.v = i2 + 1;
        bArr[i2] = (byte) i;
        this.R++;
    }

    @Override // defpackage.Jl
    public final byte[] b() {
        return N(this.R);
    }

    @Override // java.lang.Object
    public final Object clone() {
        ME me = new ME();
        if (this.R != 0) {
            h11 h11 = this.f290R;
            h11 c = h11.c();
            me.f290R = c;
            c.f4019v = c;
            c.f4016R = c;
            for (h11 h112 = h11.f4016R; h112 != h11; h112 = h112.f4016R) {
                c.f4019v.v(h112.c());
            }
            me.R = this.R;
        }
        return me;
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void cr(int i) {
        String str;
        if (i < 128) {
            a(i);
        } else if (i < 2048) {
            h11 M = M(2);
            byte[] bArr = M.f4018R;
            int i2 = M.v;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            M.v = i2 + 2;
            this.R += 2;
        } else {
            int i3 = 0;
            if (55296 <= i && i < 57344) {
                a(63);
            } else if (i < 65536) {
                h11 M2 = M(3);
                byte[] bArr2 = M2.f4018R;
                int i4 = M2.v;
                bArr2[i4] = (byte) ((i >> 12) | 224);
                bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i4 + 2] = (byte) ((i & 63) | 128);
                M2.v = i4 + 3;
                this.R += 3;
            } else if (i <= 1114111) {
                h11 M3 = M(4);
                byte[] bArr3 = M3.f4018R;
                int i5 = M3.v;
                bArr3[i5] = (byte) ((i >> 18) | 240);
                bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i5 + 3] = (byte) ((i & 63) | 128);
                M3.v = i5 + 4;
                this.R += 4;
            } else {
                StringBuilder U = opT.U("Unexpected code point: 0x");
                if (i != 0) {
                    char[] cArr = me6.f6099R;
                    char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                    while (i3 < 8 && cArr2[i3] == '0') {
                        i3++;
                    }
                    if (i3 < 0) {
                        StringBuilder y = jQ.y("startIndex: ", i3, ", endIndex: ", 8, ", size: ");
                        y.append(8);
                        throw new IndexOutOfBoundsException(y.toString());
                    } else if (i3 <= 8) {
                        str = new String(cArr2, i3, 8 - i3);
                    } else {
                        throw new IllegalArgumentException(jQ.U("startIndex: ", i3, " > endIndex: ", 8));
                    }
                } else {
                    str = "0";
                }
                U.append(str);
                throw new IllegalArgumentException(U.toString());
            }
        }
    }

    public final long d(long j, F6 f6) {
        int i;
        int i2;
        int i3;
        int i4;
        long j2 = 0;
        if (j >= 0) {
            h11 h11 = this.f290R;
            if (h11 == null) {
                return -1;
            }
            long j3 = this.R;
            if (j3 - j < j) {
                while (j3 > j) {
                    h11 = h11.f4019v;
                    j3 -= (long) (h11.v - h11.R);
                }
                byte[] bArr = f6.f115R;
                if (bArr.length == 2) {
                    byte b = bArr[0];
                    byte b2 = bArr[1];
                    while (j3 < this.R) {
                        byte[] bArr2 = h11.f4018R;
                        i3 = (int) ((((long) h11.R) + j) - j3);
                        int i5 = h11.v;
                        while (i3 < i5) {
                            byte b3 = bArr2[i3];
                            if (b3 == b || b3 == b2) {
                                i4 = h11.R;
                            } else {
                                i3++;
                            }
                        }
                        j3 += (long) (h11.v - h11.R);
                        h11 = h11.f4016R;
                        j = j3;
                    }
                    return -1;
                }
                while (j3 < this.R) {
                    byte[] bArr3 = h11.f4018R;
                    i3 = (int) ((((long) h11.R) + j) - j3);
                    int i6 = h11.v;
                    while (i3 < i6) {
                        byte b4 = bArr3[i3];
                        for (byte b5 : bArr) {
                            if (b4 == b5) {
                                i4 = h11.R;
                            }
                        }
                        i3++;
                    }
                    j3 += (long) (h11.v - h11.R);
                    h11 = h11.f4016R;
                    j = j3;
                }
                return -1;
                return ((long) (i3 - i4)) + j3;
            }
            while (true) {
                long j4 = ((long) (h11.v - h11.R)) + j2;
                if (j4 > j) {
                    break;
                }
                h11 = h11.f4016R;
                j2 = j4;
            }
            byte[] bArr4 = f6.f115R;
            if (bArr4.length == 2) {
                byte b6 = bArr4[0];
                byte b7 = bArr4[1];
                while (j2 < this.R) {
                    byte[] bArr5 = h11.f4018R;
                    i = (int) ((((long) h11.R) + j) - j2);
                    int i7 = h11.v;
                    while (i < i7) {
                        byte b8 = bArr5[i];
                        if (b8 == b6 || b8 == b7) {
                            i2 = h11.R;
                        } else {
                            i++;
                        }
                    }
                    j2 += (long) (h11.v - h11.R);
                    h11 = h11.f4016R;
                    j = j2;
                }
                return -1;
            }
            while (j2 < this.R) {
                byte[] bArr6 = h11.f4018R;
                i = (int) ((((long) h11.R) + j) - j2);
                int i8 = h11.v;
                while (i < i8) {
                    byte b9 = bArr6[i];
                    for (byte b10 : bArr4) {
                        if (b9 == b10) {
                            i2 = h11.R;
                        }
                    }
                    i++;
                }
                j2 += (long) (h11.v - h11.R);
                h11 = h11.f4016R;
                j = j2;
            }
            return -1;
            return ((long) (i - i2)) + j2;
        }
        throw new IllegalArgumentException(opT.x("fromIndex < 0: ", j).toString());
    }

    @Override // defpackage.fGn
    public final hqj e() {
        return hqj.R;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ME)) {
                return false;
            }
            long j = this.R;
            ME me = (ME) obj;
            if (j != me.R) {
                return false;
            }
            if (j != 0) {
                h11 h11 = this.f290R;
                h11 h112 = me.f290R;
                int i = h11.R;
                int i2 = h112.R;
                long j2 = 0;
                while (j2 < this.R) {
                    long min = (long) Math.min(h11.v - i, h112.v - i2);
                    for (long j3 = 0; j3 < min; j3++) {
                        i++;
                        i2++;
                        if (h11.f4018R[i] != h112.f4018R[i2]) {
                            return false;
                        }
                    }
                    if (i == h11.v) {
                        h11 = h11.f4016R;
                        i = h11.R;
                    }
                    if (i2 == h112.v) {
                        h112 = h112.f4016R;
                        i2 = h112.R;
                    }
                    j2 += min;
                }
            }
        }
        return true;
    }

    public final void f(fGn fgn) {
        do {
        } while (fgn.Y(this, 8192) != -1);
    }

    @Override // defpackage.NV, defpackage.axx, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.Jl
    public final int g() {
        int readInt = readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // defpackage.Jl
    public final F6 h() {
        return S(this.R);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        h11 h11 = this.f290R;
        if (h11 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = h11.v;
            for (int i3 = h11.R; i3 < i2; i3++) {
                i = (i * 31) + h11.f4018R[i3];
            }
            h11 = h11.f4016R;
        } while (h11 != this.f290R);
        return i;
    }

    @Override // defpackage.NV
    public final NV i(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte j(long j) {
        iTI.e(this.R, j, 1);
        h11 h11 = this.f290R;
        h11.getClass();
        long j2 = this.R;
        if (j2 - j < j) {
            while (j2 > j) {
                h11 = h11.f4019v;
                j2 -= (long) (h11.v - h11.R);
            }
            return h11.f4018R[(int) ((((long) h11.R) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = h11.v;
            int i2 = h11.R;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return h11.f4018R[(int) ((((long) i2) + j) - j3)];
            }
            h11 = h11.f4016R;
            j3 = j4;
        }
    }

    public final String k(long j, Charset charset) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(opT.x("byteCount: ", j).toString());
        } else if (this.R < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            h11 h11 = this.f290R;
            int i2 = h11.R;
            if (((long) i2) + j > ((long) h11.v)) {
                return new String(N(j), charset);
            }
            int i3 = (int) j;
            String str = new String(h11.f4018R, i2, i3, charset);
            int i4 = h11.R + i3;
            h11.R = i4;
            this.R -= j;
            if (i4 == h11.v) {
                this.f290R = h11.R();
                g_1.R(h11);
            }
            return str;
        }
    }

    public final F6 l(int i) {
        if (i == 0) {
            return F6.R;
        }
        iTI.e(this.R, 0, (long) i);
        h11 h11 = this.f290R;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = h11.v;
            int i6 = h11.R;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                h11 = h11.f4016R;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        h11 h112 = this.f290R;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = h112.f4018R;
            i2 += h112.v - h112.R;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = h112.R;
            h112.f4017R = true;
            i7++;
            h112 = h112.f4016R;
        }
        return new m62(bArr, iArr);
    }

    @Override // defpackage.NV
    public final NV m(int i) {
        mL(((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
        return this;
    }

    public final void mL(int i) {
        h11 M = M(4);
        byte[] bArr = M.f4018R;
        int i2 = M.v;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        M.v = i5 + 1;
        this.R += 4;
    }

    @Override // defpackage.Jl
    public final boolean n(long j) {
        return this.R >= j;
    }

    public final long o(long j, F6 f6) {
        boolean z = true;
        if (f6.f115R.length > 0) {
            long j2 = 0;
            if (j < 0) {
                z = false;
            }
            if (z) {
                h11 h11 = this.f290R;
                if (h11 != null) {
                    long j3 = this.R;
                    if (j3 - j < j) {
                        while (j3 > j) {
                            h11 = h11.f4019v;
                            j3 -= (long) (h11.v - h11.R);
                        }
                        byte[] bArr = f6.f115R;
                        byte b = bArr[0];
                        int length = bArr.length;
                        long j4 = (this.R - ((long) length)) + 1;
                        while (j3 < j4) {
                            byte[] bArr2 = h11.f4018R;
                            int min = (int) Math.min((long) h11.v, (((long) h11.R) + j4) - j3);
                            for (int i = (int) ((((long) h11.R) + j) - j3); i < min; i++) {
                                if (bArr2[i] == b && kn1.R(h11, i + 1, bArr, length)) {
                                    return ((long) (i - h11.R)) + j3;
                                }
                            }
                            j3 += (long) (h11.v - h11.R);
                            h11 = h11.f4016R;
                            j = j3;
                        }
                    } else {
                        while (true) {
                            long j5 = ((long) (h11.v - h11.R)) + j2;
                            if (j5 > j) {
                                break;
                            }
                            h11 = h11.f4016R;
                            j2 = j5;
                        }
                        byte[] bArr3 = f6.f115R;
                        byte b2 = bArr3[0];
                        int length2 = bArr3.length;
                        long j6 = (this.R - ((long) length2)) + 1;
                        while (j2 < j6) {
                            byte[] bArr4 = h11.f4018R;
                            int min2 = (int) Math.min((long) h11.v, (((long) h11.R) + j6) - j2);
                            for (int i2 = (int) ((((long) h11.R) + j) - j2); i2 < min2; i2++) {
                                if (bArr4[i2] == b2 && kn1.R(h11, i2 + 1, bArr3, length2)) {
                                    return ((long) (i2 - h11.R)) + j2;
                                }
                            }
                            j2 += (long) (h11.v - h11.R);
                            h11 = h11.f4016R;
                            j = j2;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(opT.x("fromIndex < 0: ", j).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // defpackage.Jl
    public final int p(paU pau) {
        int c = kn1.c(this, pau, false);
        if (c == -1) {
            return -1;
        }
        J((long) pau.f7099R[c].v());
        return c;
    }

    public final ME q(long j) {
        if (j == 0) {
            a(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            h11 M = M(i);
            byte[] bArr = M.f4018R;
            int i2 = M.v;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = kn1.R[(int) (15 & j)];
                j >>>= 4;
            }
            M.v += i;
            this.R += (long) i;
        }
        return this;
    }

    @Override // defpackage.Jl
    public final boolean r() {
        return this.R == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        h11 h11 = this.f290R;
        if (h11 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), h11.v - h11.R);
        byteBuffer.put(h11.f4018R, h11.R, min);
        int i = h11.R + min;
        h11.R = i;
        this.R -= (long) min;
        if (i == h11.v) {
            this.f290R = h11.R();
            g_1.R(h11);
        }
        return min;
    }

    @Override // defpackage.Jl
    public final byte readByte() {
        long j = this.R;
        if (j != 0) {
            h11 h11 = this.f290R;
            int i = h11.R;
            int i2 = h11.v;
            int i3 = i + 1;
            byte b = h11.f4018R[i];
            this.R = j - 1;
            if (i3 == i2) {
                this.f290R = h11.R();
                g_1.R(h11);
            } else {
                h11.R = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // defpackage.Jl
    public final int readInt() {
        long j = this.R;
        if (j >= 4) {
            h11 h11 = this.f290R;
            int i = h11.R;
            int i2 = h11.v;
            if (((long) (i2 - i)) < 4) {
                return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
            }
            byte[] bArr = h11.f4018R;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.R = j - 4;
            if (i8 == i2) {
                this.f290R = h11.R();
                g_1.R(h11);
            } else {
                h11.R = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override // defpackage.Jl
    public final short readShort() {
        long j = this.R;
        if (j >= 2) {
            h11 h11 = this.f290R;
            int i = h11.R;
            int i2 = h11.v;
            if (i2 - i < 2) {
                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
            }
            byte[] bArr = h11.f4018R;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.R = j - 2;
            if (i4 == i2) {
                this.f290R = h11.R();
                g_1.R(h11);
            } else {
                h11.R = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @Override // defpackage.NV
    public final /* bridge */ /* synthetic */ NV s(int i, int i2, String str) {
        vl(i, i2, str);
        return this;
    }

    public final long t(byte b, long j, long j2) {
        h11 h11;
        long j3 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (z) {
            long j4 = this.R;
            if (j2 > j4) {
                j2 = j4;
            }
            if (!(j == j2 || (h11 = this.f290R) == null)) {
                if (j4 - j < j) {
                    while (j4 > j) {
                        h11 = h11.f4019v;
                        j4 -= (long) (h11.v - h11.R);
                    }
                    while (j4 < j2) {
                        byte[] bArr = h11.f4018R;
                        int min = (int) Math.min((long) h11.v, (((long) h11.R) + j2) - j4);
                        for (int i = (int) ((((long) h11.R) + j) - j4); i < min; i++) {
                            if (bArr[i] == b) {
                                return ((long) (i - h11.R)) + j4;
                            }
                        }
                        j4 += (long) (h11.v - h11.R);
                        h11 = h11.f4016R;
                        j = j4;
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (h11.v - h11.R)) + j3;
                        if (j5 <= j) {
                            h11 = h11.f4016R;
                            j3 = j5;
                        }
                    }
                    while (j3 < j2) {
                        byte[] bArr2 = h11.f4018R;
                        int min2 = (int) Math.min((long) h11.v, (((long) h11.R) + j2) - j3);
                        for (int i2 = (int) ((((long) h11.R) + j) - j3); i2 < min2; i2++) {
                            if (bArr2[i2] == b) {
                                return ((long) (i2 - h11.R)) + j3;
                            }
                        }
                        j3 += (long) (h11.v - h11.R);
                        h11 = h11.f4016R;
                        j = j3;
                    }
                }
            }
            return -1;
        }
        StringBuilder U = opT.U("size=");
        U.append(this.R);
        U.append(" fromIndex=");
        U.append(j);
        U.append(" toIndex=");
        U.append(j2);
        throw new IllegalArgumentException(U.toString().toString());
    }

    @Override // java.lang.Object
    public final String toString() {
        long j = this.R;
        if (j <= 2147483647L) {
            return l((int) j).toString();
        }
        StringBuilder U = opT.U("size > Int.MAX_VALUE: ");
        U.append(this.R);
        throw new IllegalStateException(U.toString().toString());
    }

    @Override // defpackage.Jl
    public final long u(F6 f6) {
        return d(0, f6);
    }

    @Override // defpackage.Jl, defpackage.NV
    public final ME v() {
        return this;
    }

    public final void vl(int i, int i2, String str) {
        char charAt;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            h11 M = M(1);
                            byte[] bArr = M.f4018R;
                            int i3 = M.v - i;
                            int min = Math.min(i2, 8192 - i3);
                            i++;
                            bArr[i + i3] = (byte) charAt2;
                            while (i < min && (charAt = str.charAt(i)) < 128) {
                                i++;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i4 = M.v;
                            int i5 = (i3 + i) - i4;
                            M.v = i4 + i5;
                            this.R += (long) i5;
                        } else {
                            if (charAt2 < 2048) {
                                h11 M2 = M(2);
                                byte[] bArr2 = M2.f4018R;
                                int i6 = M2.v;
                                bArr2[i6] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i6 + 1] = (byte) ((charAt2 & '?') | 128);
                                M2.v = i6 + 2;
                                this.R += 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                h11 M3 = M(3);
                                byte[] bArr3 = M3.f4018R;
                                int i7 = M3.v;
                                bArr3[i7] = (byte) ((charAt2 >> '\f') | 224);
                                bArr3[i7 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i7 + 2] = (byte) ((charAt2 & '?') | 128);
                                M3.v = i7 + 3;
                                this.R += 3;
                            } else {
                                int i8 = i + 1;
                                char charAt3 = i8 < i2 ? str.charAt(i8) : 0;
                                if (charAt2 <= 56319) {
                                    if (56320 <= charAt3 && charAt3 < 57344) {
                                        int i9 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                                        h11 M4 = M(4);
                                        byte[] bArr4 = M4.f4018R;
                                        int i10 = M4.v;
                                        bArr4[i10] = (byte) ((i9 >> 18) | 240);
                                        bArr4[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                        bArr4[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                        bArr4[i10 + 3] = (byte) ((i9 & 63) | 128);
                                        M4.v = i10 + 4;
                                        this.R += 4;
                                        i += 2;
                                    }
                                }
                                a(63);
                                i = i8;
                            }
                            i++;
                        }
                    }
                    return;
                }
                StringBuilder C = opT.C("endIndex > string.length: ", i2, " > ");
                C.append(str.length());
                throw new IllegalArgumentException(C.toString().toString());
            }
            throw new IllegalArgumentException(jQ.U("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(opT.Z("beginIndex < 0: ", i).toString());
    }

    public final void vr(String str) {
        vl(0, str.length(), str);
    }

    @Override // defpackage.NV
    public final /* bridge */ /* synthetic */ NV w(String str) {
        vr(str);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            h11 M = M(1);
            int min = Math.min(i, 8192 - M.v);
            byteBuffer.get(M.f4018R, M.v, min);
            i -= min;
            M.v += min;
        }
        this.R += (long) remaining;
        return remaining;
    }

    @Override // defpackage.NV
    public final /* bridge */ /* synthetic */ NV x(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
        return this;
    }

    @Override // defpackage.NV
    public final NV y(F6 f6) {
        f6.x(this, f6.v());
        return this;
    }

    @Override // defpackage.NV
    public final /* bridge */ /* synthetic */ NV z(int i) {
        mL(i);
        return this;
    }

    public final ME zw(String str, int i, int i2, Charset charset) {
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    StringBuilder C = opT.C("endIndex > string.length: ", i2, " > ");
                    C.append(str.length());
                    throw new IllegalArgumentException(C.toString().toString());
                } else if (n3x.v(charset, O1.R)) {
                    vl(i, i2, str);
                    return this;
                } else {
                    byte[] bytes = str.substring(i, i2).getBytes(charset);
                    write(bytes, 0, bytes.length);
                    return this;
                }
            } else {
                throw new IllegalArgumentException(jQ.U("endIndex < beginIndex: ", i2, " < ", i).toString());
            }
        } else {
            throw new IllegalArgumentException(opT.Z("beginIndex < 0: ", i).toString());
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = (long) i2;
        iTI.e((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            h11 M = M(1);
            int min = Math.min(i3 - i, 8192 - M.v);
            int i4 = i + min;
            System.arraycopy(bArr, i, M.f4018R, M.v, i4 - i);
            M.v += min;
            i = i4;
        }
        this.R += j;
    }

    public final int read(byte[] bArr, int i, int i2) {
        iTI.e((long) bArr.length, (long) i, (long) i2);
        h11 h11 = this.f290R;
        if (h11 == null) {
            return -1;
        }
        int min = Math.min(i2, h11.v - h11.R);
        byte[] bArr2 = h11.f4018R;
        int i3 = h11.R;
        System.arraycopy(bArr2, i3, bArr, i, (i3 + min) - i3);
        int i4 = h11.R + min;
        h11.R = i4;
        this.R -= (long) min;
        if (i4 == h11.v) {
            this.f290R = h11.R();
            g_1.R(h11);
        }
        return min;
    }
}
