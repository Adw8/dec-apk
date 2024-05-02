package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: d3  reason: default package */
/* loaded from: classes.dex */
public final class d3 extends brQ {
    public static final Logger R = Logger.getLogger(d3.class.getName());

    /* renamed from: R  reason: collision with other field name */
    public static final boolean f2472R = hU3.v;

    /* renamed from: R  reason: collision with other field name */
    public final int f2473R;

    /* renamed from: R  reason: collision with other field name */
    public gL6 f2474R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f2475R;
    public int v;

    public d3(byte[] bArr, int i) {
        int i2 = 0 + i;
        if ((0 | i | (bArr.length - i2)) >= 0) {
            this.f2475R = bArr;
            this.v = 0;
            this.f2473R = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
    }

    public static int C(int i) {
        return t(i) + 4;
    }

    public static int H(int i) {
        if (i >= 0) {
            return V(i);
        }
        return 10;
    }

    public static int K(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int L(int i) {
        return t(i) + 8;
    }

    public static int N(int i) {
        return t(i) + 8;
    }

    public static int O(int i) {
        return t(i) + 4;
    }

    public static int P(int i, int i2) {
        return V((i2 >> 31) ^ (i2 << 1)) + t(i);
    }

    public static int U(long j, int i) {
        return K(j) + t(i);
    }

    public static int V(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int X(int i, int i2) {
        return H(i2) + t(i);
    }

    public static int Z(int i) {
        return t(i) + 4;
    }

    public static int c(int i, b0 b0Var) {
        int t = t(i);
        int size = b0Var.size();
        return V(size) + size + t;
    }

    public static int e(int i) {
        return t(i) + 8;
    }

    public static int g(int i, String str) {
        return y(str) + t(i);
    }

    public static int i(int i, int i2) {
        return V(i2) + t(i);
    }

    public static int j(long j, int i) {
        return K((j >> 63) ^ (j << 1)) + t(i);
    }

    public static int m(int i, qN qNVar, bvr bvr) {
        return qNVar.v(bvr) + (t(i) * 2);
    }

    public static int o(long j, int i) {
        return K(j) + t(i);
    }

    public static int t(int i) {
        return V((i << 3) | 0);
    }

    public static int v(int i) {
        return t(i) + 1;
    }

    public static int x(int i, int i2) {
        return H(i2) + t(i);
    }

    public static int y(String str) {
        int i;
        try {
            i = d_A.v(str);
        } catch (cXo unused) {
            i = str.getBytes(ibk.v).length;
        }
        return V(i) + i;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0002 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: d3 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [byte[]] */
    public final void A(String str) {
        int i = this.v;
        try {
            int V = V(str.length() * 3);
            int V2 = V(str.length());
            if (V2 == V) {
                int i2 = i + V2;
                this.v = i2;
                int c = d_A.R.c(str, this.f2475R, i2, this.f2473R - i2);
                this.v = i;
                d((c - i) - V2);
                this.v = c;
                return;
            }
            d(d_A.v(str));
            byte[] bArr = this.f2475R;
            int i3 = this.v;
            this.v = d_A.R.c(str, bArr, i3, this.f2473R - i3);
        } catch (cXo e) {
            while (true) {
                this.v = i;
                R.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                str = str.getBytes(ibk.v);
                try {
                    d(str.length);
                    i = 0;
                    Y(str, 0, str.length);
                    return;
                } catch (T7 e2) {
                    throw e2;
                } catch (IndexOutOfBoundsException e3) {
                    throw new T7(e3);
                }
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new T7(e4);
        }
    }

    public final void I(int i, int i2) {
        S(i, 5);
        u(i2);
    }

    public final void J(byte b) {
        try {
            byte[] bArr = this.f2475R;
            int i = this.v;
            this.v = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new T7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.f2473R), 1), e);
        }
    }

    public final void Q(int i) {
        if (i >= 0) {
            d(i);
        } else {
            s((long) i);
        }
    }

    public final void S(int i, int i2) {
        d((i << 3) | i2);
    }

    public final void W(long j, int i) {
        S(i, 0);
        s(j);
    }

    public final void Y(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f2475R, this.v, i2);
            this.v += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new T7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.f2473R), Integer.valueOf(i2)), e);
        }
    }

    public final void d(int i) {
        if (f2472R && !Om.R()) {
            int i2 = this.f2473R;
            int i3 = this.v;
            if (i2 - i3 >= 5) {
                if ((i & -128) == 0) {
                    byte[] bArr = this.f2475R;
                    this.v = i3 + 1;
                    hU3.y(bArr, (long) i3, (byte) i);
                    return;
                }
                byte[] bArr2 = this.f2475R;
                this.v = i3 + 1;
                hU3.y(bArr2, (long) i3, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & -128) == 0) {
                    byte[] bArr3 = this.f2475R;
                    int i5 = this.v;
                    this.v = i5 + 1;
                    hU3.y(bArr3, (long) i5, (byte) i4);
                    return;
                }
                byte[] bArr4 = this.f2475R;
                int i6 = this.v;
                this.v = i6 + 1;
                hU3.y(bArr4, (long) i6, (byte) (i4 | 128));
                int i7 = i4 >>> 7;
                if ((i7 & -128) == 0) {
                    byte[] bArr5 = this.f2475R;
                    int i8 = this.v;
                    this.v = i8 + 1;
                    hU3.y(bArr5, (long) i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f2475R;
                int i9 = this.v;
                this.v = i9 + 1;
                hU3.y(bArr6, (long) i9, (byte) (i7 | 128));
                int i10 = i7 >>> 7;
                if ((i10 & -128) == 0) {
                    byte[] bArr7 = this.f2475R;
                    int i11 = this.v;
                    this.v = i11 + 1;
                    hU3.y(bArr7, (long) i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f2475R;
                int i12 = this.v;
                this.v = i12 + 1;
                hU3.y(bArr8, (long) i12, (byte) (i10 | 128));
                byte[] bArr9 = this.f2475R;
                int i13 = this.v;
                this.v = i13 + 1;
                hU3.y(bArr9, (long) i13, (byte) (i10 >>> 7));
                return;
            }
        }
        while ((i & -128) != 0) {
            try {
                byte[] bArr10 = this.f2475R;
                int i14 = this.v;
                this.v = i14 + 1;
                bArr10[i14] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new T7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.f2473R), 1), e);
            }
        }
        byte[] bArr11 = this.f2475R;
        int i15 = this.v;
        this.v = i15 + 1;
        bArr11[i15] = (byte) i;
    }

    public final void h(b0 b0Var) {
        d(b0Var.size());
        MH mh = (MH) b0Var;
        Y(mh.R, mh.V(), mh.size());
    }

    public final void n(long j) {
        try {
            byte[] bArr = this.f2475R;
            int i = this.v;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.v = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new T7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.f2473R), 1), e);
        }
    }

    public final void s(long j) {
        if (!f2472R || this.f2473R - this.v < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.f2475R;
                    int i = this.v;
                    this.v = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new T7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.f2473R), 1), e);
                }
            }
            byte[] bArr2 = this.f2475R;
            int i2 = this.v;
            this.v = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f2475R;
            int i3 = this.v;
            this.v = i3 + 1;
            hU3.y(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.f2475R;
        int i4 = this.v;
        this.v = i4 + 1;
        hU3.y(bArr4, (long) i4, (byte) ((int) j));
    }

    public final void u(int i) {
        try {
            byte[] bArr = this.f2475R;
            int i2 = this.v;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.v = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new T7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.v), Integer.valueOf(this.f2473R), 1), e);
        }
    }

    public final void z(long j, int i) {
        S(i, 1);
        n(j);
    }
}
