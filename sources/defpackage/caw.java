package defpackage;

import java.util.Arrays;

/* renamed from: caw  reason: default package */
/* loaded from: classes.dex */
public abstract class caw {

    /* renamed from: R  reason: collision with other field name */
    public static final byte[] f2155R = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] v = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    public static final byte[] c = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    public static final dlc R = new dlc();

    /* renamed from: R  reason: collision with other field name */
    public static final n2G f2154R = new n2G(16, null);

    public static final long H(long j, long j2) {
        if (0 > j2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j2 + " is less than minimum 0.");
        } else if (j < 0) {
            return 0;
        } else {
            return j > j2 ? j2 : j;
        }
    }

    public static final void L(f_c f_c, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-1288466761);
        jr_.W(new n3l(0, f_c));
        jr_.g(false);
    }

    public static final m3D N(m88 m88) {
        aIH aih = aIH.R;
        hw1 hw1 = hw1.O;
        nbD O = ((jr_) m88).f5057R.O();
        return jjU.v(O.M(new peS((pd2) O.O(hw1))).M(aih));
    }

    public static final void O(Object[] objArr, iv7 iv7, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-139560008);
        nbD O = jr_.f5057R.O();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        jr_.w(-568225417);
        boolean z = false;
        for (Object obj : copyOf) {
            z |= jr_.O(obj);
        }
        Object I = jr_.I();
        if (z || I == ppN.R) {
            jr_.ZW(new pbZ(O, iv7));
        }
        jr_.g(false);
        jr_.g(false);
    }

    public static byte[] P(String str) {
        byte[] bytes = str.getBytes();
        return j(bytes, bytes.length, v);
    }

    public static final void R(e9w e9w, String str, kg9 kg9, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1429097729);
        jr_.w(511388516);
        boolean O = jr_.O(e9w) | jr_.O(str);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            jr_.ZW(new kgd(kg9));
        }
        jr_.g(false);
        jr_.g(false);
    }

    public static final Comparable U(Comparable comparable, p6 p6Var) {
        if (!(p6Var.R > p6Var.v)) {
            return (!p6.c(comparable, p6Var.v()) || p6.c(p6Var.v(), comparable)) ? (!p6.c(p6Var.R(), comparable) || p6.c(comparable, p6Var.R())) ? comparable : p6Var.R() : p6Var.v();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + p6Var + '.');
    }

    public static final heu V(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new heu(i, i2 - 1);
        }
        heu heu = heu.R;
        return heu.R;
    }

    public static final void X(Object obj, Object obj2, iv7 iv7, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(590241125);
        nbD O = jr_.f5057R.O();
        jr_.w(511388516);
        boolean O2 = jr_.O(obj) | jr_.O(obj2);
        Object I = jr_.I();
        if (O2 || I == ppN.R) {
            jr_.ZW(new pbZ(O, iv7));
        }
        jr_.g(false);
        jr_.g(false);
    }

    public static final double Z(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final void c(jJj jjj, Object obj, Object obj2, iv7 iv7, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-54093371);
        nbD O = jr_.f5057R.O();
        jr_.w(1618982084);
        boolean O2 = jr_.O(jjj) | jr_.O(obj) | jr_.O(obj2);
        Object I = jr_.I();
        if (O2 || I == ppN.R) {
            jr_.ZW(new pbZ(O, iv7));
        }
        jr_.g(false);
        jr_.g(false);
    }

    public static final void e(Object obj, iv7 iv7, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1179185413);
        nbD O = jr_.f5057R.O();
        jr_.w(1157296644);
        boolean O2 = jr_.O(obj);
        Object I = jr_.I();
        if (O2 || I == ppN.R) {
            jr_.ZW(new pbZ(O, iv7));
        }
        jr_.g(false);
        jr_.g(false);
    }

    public static int g(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        byte b = bArr[2];
        if (b == 61) {
            bArr2[i] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b2 = bArr[3];
        if (b2 == 61) {
            int i2 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b] << 24) >>> 18);
            bArr2[i] = (byte) (i2 >>> 16);
            bArr2[i + 1] = (byte) (i2 >>> 8);
            return 2;
        }
        int i3 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b] << 24) >>> 18) | ((bArr3[b2] << 24) >>> 24);
        bArr2[i] = (byte) (i3 >> 16);
        bArr2[i + 1] = (byte) (i3 >> 8);
        bArr2[i + 2] = (byte) i3;
        return 3;
    }

    public static final ka_ i(heu heu, int i) {
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            int i2 = heu.e;
            int i3 = heu.X;
            if (heu.O <= 0) {
                i = -i;
            }
            return new ka_(i2, i3, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static byte[] j(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[((i * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            int i5 = i2 + 0;
            byte b = (byte) (bArr[i5] & Byte.MAX_VALUE);
            byte b2 = bArr2[b];
            if (b2 >= -5) {
                if (b2 >= -1) {
                    if (b == 61) {
                        int i6 = i - i2;
                        byte b3 = (byte) (bArr[(i - 1) + 0] & Byte.MAX_VALUE);
                        if (i3 == 0 || i3 == 1) {
                            throw new Z4(afN.R(-80607973069708L) + i2);
                        } else if ((i3 == 3 && i6 > 2) || (i3 == 4 && i6 > 1)) {
                            throw new Z4(afN.R(-80784066728844L) + i2);
                        } else if (b3 != 61 && b3 != 10) {
                            throw new Z4(afN.R(-81063239603084L));
                        }
                    } else {
                        int i7 = i3 + 1;
                        bArr4[i3] = b;
                        if (i7 == 4) {
                            i4 += g(bArr4, bArr3, i4, bArr2);
                            i3 = 0;
                        } else {
                            i3 = i7;
                        }
                    }
                }
                i2++;
            } else {
                throw new Z4(afN.R(-81235038294924L) + i2 + afN.R(-81368182281100L) + ((int) bArr[i5]) + afN.R(-81381067182988L));
            }
        }
        if (i3 != 0) {
            if (i3 != 1) {
                bArr4[i3] = 61;
                i4 += g(bArr4, bArr3, i4, bArr2);
            } else {
                throw new Z4(afN.R(-81424016855948L) + (i - 1));
            }
        }
        byte[] bArr5 = new byte[i4];
        System.arraycopy(bArr3, 0, bArr5, 0, i4);
        return bArr5;
    }

    public static final float m(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final void v(Object obj, kg9 kg9, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-1371986847);
        jr_.w(1157296644);
        boolean O = jr_.O(obj);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            jr_.ZW(new kgd(kg9));
        }
        jr_.g(false);
        jr_.g(false);
    }

    public static final int x(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static byte[] y(String str) {
        byte[] bytes = str.getBytes();
        return j(bytes, bytes.length, c);
    }

    public abstract boolean C(bsy bsy);

    public abstract Object t(bsy bsy);
}
