package defpackage;

/* renamed from: b5  reason: default package */
/* loaded from: classes.dex */
public final class b5 {
    public int L = Integer.MAX_VALUE;
    public int O;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public ma7 f1524R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f1525R;
    public int X;
    public int c;
    public int e;
    public int v;

    public b5(byte[] bArr, int i, int i2, boolean z) {
        this.f1525R = bArr;
        this.v = i2 + i;
        this.e = i;
        this.X = i;
    }

    public static int R(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long v(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public final int H() {
        if (c()) {
            this.O = 0;
            return 0;
        }
        int Z = Z();
        this.O = Z;
        if ((Z >>> 3) != 0) {
            return Z;
        }
        throw new b7b("Protocol message contained an invalid tag (zero).");
    }

    public final long L() {
        int i = this.e;
        if (this.v - i >= 8) {
            byte[] bArr = this.f1525R;
            this.e = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw b7b.O();
    }

    public final int O() {
        int i = this.e;
        if (this.v - i >= 4) {
            byte[] bArr = this.f1525R;
            this.e = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }
        throw b7b.O();
    }

    public final boolean X() {
        return m() != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r2[r3] < 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Z() {
        /*
            r5 = this;
            int r0 = r5.e
            int r1 = r5.v
            if (r1 != r0) goto L_0x0007
            goto L_0x006a
        L_0x0007:
            byte[] r2 = r5.f1525R
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.e = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0018
            goto L_0x006a
        L_0x0018:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0070
        L_0x0024:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r1 = r3
            goto L_0x0070
        L_0x0031:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0070
        L_0x003f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0070
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0070
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0070
        L_0x006a:
            long r0 = r5.x()
            int r5 = (int) r0
            return r5
        L_0x0070:
            r5.e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5.Z():int");
    }

    public final boolean c() {
        return this.e == this.v;
    }

    public final int e(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.X;
            int i4 = (i2 - i3) + i;
            if (i4 >= 0) {
                int i5 = this.L;
                if (i4 <= i5) {
                    this.L = i4;
                    int i6 = this.v + this.c;
                    this.v = i6;
                    int i7 = i6 - i3;
                    if (i7 > i4) {
                        int i8 = i7 - i4;
                        this.c = i8;
                        this.v = i6 - i8;
                    } else {
                        this.c = 0;
                    }
                    return i5;
                }
                throw b7b.O();
            }
            throw b7b.X();
        }
        throw b7b.e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m() {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5.m():long");
    }

    public final long x() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.e;
            if (i2 != this.v) {
                byte[] bArr = this.f1525R;
                this.e = i2 + 1;
                byte b = bArr[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            } else {
                throw b7b.O();
            }
        }
        throw b7b.c();
    }
}
