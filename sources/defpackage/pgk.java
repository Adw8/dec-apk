package defpackage;

import java.util.Arrays;

/* renamed from: pgk  reason: default package */
/* loaded from: classes.dex */
public final class pgk {
    public static final pgk R = new pgk(0, 0, new Object[0], null);

    /* renamed from: R  reason: collision with other field name */
    public int f7159R;

    /* renamed from: R  reason: collision with other field name */
    public final ift f7160R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f7161R;
    public int v;

    public pgk(int i, int i2, Object[] objArr, ift ift) {
        this.f7159R = i;
        this.v = i2;
        this.f7160R = ift;
        this.f7161R = objArr;
    }

    public static pgk x(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, ift ift) {
        if (i3 > 30) {
            return new pgk(0, 0, new Object[]{obj, obj2, obj3, obj4}, ift);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 == i5) {
            return new pgk(0, 1 << i4, new Object[]{x(i, obj, obj2, i2, obj3, obj4, i3 + 5, ift)}, ift);
        }
        Object[] objArr = new Object[4];
        if (i4 < i5) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new pgk((1 << i4) | (1 << i5), 0, objArr, ift);
    }

    public final pgk C(pgk pgk, int i, gBy gby, mWd mwd) {
        Object[] objArr;
        int i2;
        pgk pgk2;
        if (this == pgk) {
            gby.R += v();
            return this;
        }
        int i3 = 0;
        if (i > 30) {
            ift ift = mwd.f6051R;
            Object[] objArr2 = this.f7161R;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + pgk.f7161R.length);
            int length = this.f7161R.length;
            ka_ i4 = caw.i(caw.V(0, pgk.f7161R.length), 2);
            int i5 = i4.e;
            int i6 = i4.X;
            int i7 = i4.O;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (!c(pgk.f7161R[i5])) {
                        Object[] objArr3 = pgk.f7161R;
                        copyOf[length] = objArr3[i5];
                        copyOf[length + 1] = objArr3[i5 + 1];
                        length += 2;
                    } else {
                        gby.R++;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            return length == this.f7161R.length ? this : length == pgk.f7161R.length ? pgk : length == copyOf.length ? new pgk(0, 0, copyOf, ift) : new pgk(0, 0, Arrays.copyOf(copyOf, length), ift);
        }
        int i8 = this.v | pgk.v;
        int i9 = this.f7159R;
        int i10 = pgk.f7159R;
        int i11 = (i9 ^ i10) & (~i8);
        int i12 = i9 & i10;
        while (i12 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i12);
            if (n3x.v(this.f7161R[O(lowestOneBit)], pgk.f7161R[pgk.O(lowestOneBit)])) {
                i11 |= lowestOneBit;
            } else {
                i8 |= lowestOneBit;
            }
            i12 ^= lowestOneBit;
        }
        if ((i8 & i11) == 0) {
            pgk pgk3 = (n3x.v(this.f7160R, mwd.f6051R) && this.f7159R == i11 && this.v == i8) ? this : new pgk(i11, i8, new Object[Integer.bitCount(i8) + (Integer.bitCount(i11) * 2)], null);
            int i13 = i8;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = pgk3.f7161R;
                int length2 = (objArr4.length - 1) - i14;
                if (m(lowestOneBit2)) {
                    pgk2 = t(i(lowestOneBit2));
                    if (pgk.m(lowestOneBit2)) {
                        pgk2 = pgk2.C(pgk.t(pgk.i(lowestOneBit2)), i + 5, gby, mwd);
                    } else if (pgk.Z(lowestOneBit2)) {
                        int O = pgk.O(lowestOneBit2);
                        Object obj = pgk.f7161R[O];
                        Object J = pgk.J(O);
                        int i15 = mwd.X;
                        if (obj != null) {
                            i3 = obj.hashCode();
                        }
                        objArr = objArr4;
                        i2 = lowestOneBit2;
                        pgk2 = pgk2.U(i3, obj, J, i + 5, mwd);
                        if (mwd.X == i15) {
                            gby.R++;
                        }
                    }
                    objArr = objArr4;
                    i2 = lowestOneBit2;
                } else {
                    objArr = objArr4;
                    i2 = lowestOneBit2;
                    if (pgk.m(i2)) {
                        pgk2 = pgk.t(pgk.i(i2));
                        if (Z(i2)) {
                            int O2 = O(i2);
                            Object obj2 = this.f7161R[O2];
                            int i16 = i + 5;
                            if (pgk2.e(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                gby.R++;
                            } else {
                                pgk2 = pgk2.U(obj2 != null ? obj2.hashCode() : 0, obj2, J(O2), i16, mwd);
                            }
                        }
                    } else {
                        int O3 = O(i2);
                        Object obj3 = this.f7161R[O3];
                        Object J2 = J(O3);
                        int O4 = pgk.O(i2);
                        Object obj4 = pgk.f7161R[O4];
                        pgk2 = x(obj3 != null ? obj3.hashCode() : 0, obj3, J2, obj4 != null ? obj4.hashCode() : 0, obj4, pgk.J(O4), i + 5, mwd.f6051R);
                    }
                }
                objArr[length2] = pgk2;
                i14++;
                i13 ^= i2;
                i3 = 0;
            }
            int i17 = 0;
            while (i11 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i11);
                int i18 = i17 * 2;
                if (!pgk.Z(lowestOneBit3)) {
                    int O5 = O(lowestOneBit3);
                    Object[] objArr5 = pgk3.f7161R;
                    objArr5[i18] = this.f7161R[O5];
                    objArr5[i18 + 1] = J(O5);
                } else {
                    int O6 = pgk.O(lowestOneBit3);
                    Object[] objArr6 = pgk3.f7161R;
                    objArr6[i18] = pgk.f7161R[O6];
                    objArr6[i18 + 1] = pgk.J(O6);
                    if (Z(lowestOneBit3)) {
                        gby.R++;
                    }
                }
                i17++;
                i11 ^= lowestOneBit3;
            }
            return X(pgk3) ? this : pgk.X(pgk3) ? pgk : pgk3;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final pgk H(int i, mWd mwd) {
        mwd.e(mwd.X - 1);
        mwd.f6052R = J(i);
        Object[] objArr = this.f7161R;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f7160R != mwd.f6051R) {
            return new pgk(0, 0, ooA.X(i, objArr), mwd.f6051R);
        }
        this.f7161R = ooA.X(i, objArr);
        return this;
    }

    public final Object J(int i) {
        return this.f7161R[i + 1];
    }

    public final pgk K(int i, int i2, pgk pgk) {
        Object[] objArr = pgk.f7161R;
        if (objArr.length != 2 || pgk.v != 0) {
            Object[] objArr2 = this.f7161R;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = pgk;
            return new pgk(this.f7159R, this.v, copyOf, null);
        } else if (this.f7161R.length == 1) {
            pgk.f7159R = this.v;
            return pgk;
        } else {
            int O = O(i2);
            Object[] objArr3 = this.f7161R;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
            int i3 = i + 1;
            System.arraycopy(copyOf2, i3, copyOf2, i + 2, objArr3.length - i3);
            System.arraycopy(copyOf2, O, copyOf2, O + 2, i - O);
            copyOf2[O] = obj;
            copyOf2[O + 1] = obj2;
            return new pgk(this.f7159R ^ i2, this.v ^ i2, copyOf2, null);
        }
    }

    public final Object L(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (Z(i3)) {
            int O = O(i3);
            if (n3x.v(obj, this.f7161R[O])) {
                return J(O);
            }
            return null;
        } else if (!m(i3)) {
            return null;
        } else {
            pgk t = t(i(i3));
            if (i2 != 30) {
                return t.L(i, i2 + 5, obj);
            }
            ka_ i4 = caw.i(caw.V(0, t.f7161R.length), 2);
            int i5 = i4.e;
            int i6 = i4.X;
            int i7 = i4.O;
            if ((i7 <= 0 || i5 > i6) && (i7 >= 0 || i6 > i5)) {
                return null;
            }
            while (!n3x.v(obj, t.f7161R[i5])) {
                if (i5 == i6) {
                    return null;
                }
                i5 += i7;
            }
            return t.J(i5);
        }
    }

    public final pgk N(int i, Object obj, int i2, mWd mwd) {
        pgk pgk;
        int i3 = 1 << ((i >> i2) & 31);
        if (Z(i3)) {
            int O = O(i3);
            return n3x.v(obj, this.f7161R[O]) ? j(O, i3, mwd) : this;
        } else if (!m(i3)) {
            return this;
        } else {
            int i4 = i(i3);
            pgk t = t(i4);
            if (i2 == 30) {
                ka_ i5 = caw.i(caw.V(0, t.f7161R.length), 2);
                int i6 = i5.e;
                int i7 = i5.X;
                int i8 = i5.O;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!n3x.v(obj, t.f7161R[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    pgk = t.H(i6, mwd);
                }
                pgk = t;
                return g(t, pgk, i4, i3, mwd.f6051R);
            }
            pgk = t.N(i, obj, i2 + 5, mwd);
            return g(t, pgk, i4, i3, mwd.f6051R);
        }
    }

    public final int O(int i) {
        return Integer.bitCount(this.f7159R & (i - 1)) * 2;
    }

    public final pgk P(int i, Object obj, Object obj2, int i2, mWd mwd) {
        pgk pgk;
        int i3 = 1 << ((i >> i2) & 31);
        if (Z(i3)) {
            int O = O(i3);
            return (!n3x.v(obj, this.f7161R[O]) || !n3x.v(obj2, J(O))) ? this : j(O, i3, mwd);
        } else if (!m(i3)) {
            return this;
        } else {
            int i4 = i(i3);
            pgk t = t(i4);
            if (i2 == 30) {
                ka_ i5 = caw.i(caw.V(0, t.f7161R.length), 2);
                int i6 = i5.e;
                int i7 = i5.X;
                int i8 = i5.O;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (true) {
                        if (!n3x.v(obj, t.f7161R[i6]) || !n3x.v(obj2, t.J(i6))) {
                            if (i6 == i7) {
                                break;
                            }
                            i6 += i8;
                        } else {
                            pgk = t.H(i6, mwd);
                            break;
                        }
                    }
                }
                pgk = t;
                return g(t, pgk, i4, i3, mwd.f6051R);
            }
            pgk = t.P(i, obj, obj2, i2 + 5, mwd);
            return g(t, pgk, i4, i3, mwd.f6051R);
        }
    }

    public final Object[] R(int i, int i2, int i3, Object obj, Object obj2, int i4, ift ift) {
        Object obj3 = this.f7161R[i];
        pgk x = x(obj3 != null ? obj3.hashCode() : 0, obj3, J(i), i3, obj, obj2, i4 + 5, ift);
        int i5 = i(i2) + 1;
        Object[] objArr = this.f7161R;
        int i6 = i5 - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        P7.r(objArr, objArr2, 0, 0, i, 6);
        int i7 = i + 2;
        System.arraycopy(objArr, i7, objArr2, i, i5 - i7);
        objArr2[i6] = x;
        System.arraycopy(objArr, i5, objArr2, i6 + 1, objArr.length - i5);
        return objArr2;
    }

    public final pgk U(int i, Object obj, Object obj2, int i2, mWd mwd) {
        pgk pgk;
        int i3 = 1 << ((i >> i2) & 31);
        if (Z(i3)) {
            int O = O(i3);
            if (n3x.v(obj, this.f7161R[O])) {
                mwd.f6052R = J(O);
                if (J(O) == obj2) {
                    return this;
                }
                if (this.f7160R == mwd.f6051R) {
                    this.f7161R[O + 1] = obj2;
                    return this;
                }
                mwd.e++;
                Object[] objArr = this.f7161R;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[O + 1] = obj2;
                return new pgk(this.f7159R, this.v, copyOf, mwd.f6051R);
            }
            mwd.e(mwd.X + 1);
            ift ift = mwd.f6051R;
            if (this.f7160R == ift) {
                this.f7161R = R(O, i3, i, obj, obj2, i2, ift);
                this.f7159R ^= i3;
                this.v |= i3;
                return this;
            }
            return new pgk(this.f7159R ^ i3, this.v | i3, R(O, i3, i, obj, obj2, i2, ift), ift);
        } else if (m(i3)) {
            int i4 = i(i3);
            pgk t = t(i4);
            if (i2 == 30) {
                ka_ i5 = caw.i(caw.V(0, t.f7161R.length), 2);
                int i6 = i5.e;
                int i7 = i5.X;
                int i8 = i5.O;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!n3x.v(obj, t.f7161R[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    mwd.f6052R = t.J(i6);
                    if (t.f7160R == mwd.f6051R) {
                        t.f7161R[i6 + 1] = obj2;
                        pgk = t;
                    } else {
                        mwd.e++;
                        Object[] objArr2 = t.f7161R;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i6 + 1] = obj2;
                        pgk = new pgk(0, 0, copyOf2, mwd.f6051R);
                    }
                }
                mwd.e(mwd.X + 1);
                pgk = new pgk(0, 0, ooA.e(t.f7161R, 0, obj, obj2), mwd.f6051R);
                break;
            }
            pgk = t.U(i, obj, obj2, i2 + 5, mwd);
            return t == pgk ? this : y(i4, pgk, mwd.f6051R);
        } else {
            mwd.e(mwd.X + 1);
            ift ift2 = mwd.f6051R;
            int O2 = O(i3);
            if (this.f7160R == ift2) {
                this.f7161R = ooA.e(this.f7161R, O2, obj, obj2);
                this.f7159R |= i3;
                return this;
            }
            return new pgk(this.f7159R | i3, this.v, ooA.e(this.f7161R, O2, obj, obj2), ift2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.c85 V(java.lang.Object r12, int r13, defpackage.ftv r14, int r15) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgk.V(java.lang.Object, int, ftv, int):c85");
    }

    public final boolean X(pgk pgk) {
        if (this == pgk) {
            return true;
        }
        if (!(this.v == pgk.v && this.f7159R == pgk.f7159R)) {
            return false;
        }
        int length = this.f7161R.length;
        for (int i = 0; i < length; i++) {
            if (this.f7161R[i] != pgk.f7161R[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean Z(int i) {
        return (this.f7159R & i) != 0;
    }

    public final boolean c(Object obj) {
        ka_ i = caw.i(caw.V(0, this.f7161R.length), 2);
        int i2 = i.e;
        int i3 = i.X;
        int i4 = i.O;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (!n3x.v(obj, this.f7161R[i2])) {
                if (i2 != i3) {
                    i2 += i4;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (Z(i3)) {
            return n3x.v(obj, this.f7161R[O(i3)]);
        } else if (!m(i3)) {
            return false;
        } else {
            pgk t = t(i(i3));
            return i2 == 30 ? t.c(obj) : t.e(i, i2 + 5, obj);
        }
    }

    public final pgk g(pgk pgk, pgk pgk2, int i, int i2, ift ift) {
        if (pgk2 != null) {
            return (this.f7160R == ift || pgk != pgk2) ? y(i, pgk2, ift) : this;
        }
        Object[] objArr = this.f7161R;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f7160R == ift) {
            this.f7161R = ooA.O(i, objArr);
            this.v ^= i2;
            return this;
        }
        return new pgk(this.f7159R, this.v ^ i2, ooA.O(i, objArr), ift);
    }

    public final int i(int i) {
        return (this.f7161R.length - 1) - Integer.bitCount(this.v & (i - 1));
    }

    public final pgk j(int i, int i2, mWd mwd) {
        mwd.e(mwd.X - 1);
        mwd.f6052R = J(i);
        Object[] objArr = this.f7161R;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f7160R == mwd.f6051R) {
            this.f7161R = ooA.X(i, objArr);
            this.f7159R ^= i2;
            return this;
        }
        return new pgk(i2 ^ this.f7159R, this.v, ooA.X(i, objArr), mwd.f6051R);
    }

    public final boolean m(int i) {
        return (this.v & i) != 0;
    }

    public final pgk o(int i, int i2, gL6 gl6) {
        pgk pgk;
        int i3 = 1 << ((i >> i2) & 31);
        if (Z(i3)) {
            int O = O(i3);
            if (!n3x.v(gl6, this.f7161R[O])) {
                return this;
            }
            Object[] objArr = this.f7161R;
            if (objArr.length == 2) {
                return null;
            }
            return new pgk(this.f7159R ^ i3, this.v, ooA.X(O, objArr), null);
        } else if (!m(i3)) {
            return this;
        } else {
            int i4 = i(i3);
            pgk t = t(i4);
            if (i2 == 30) {
                ka_ i5 = caw.i(caw.V(0, t.f7161R.length), 2);
                int i6 = i5.e;
                int i7 = i5.X;
                int i8 = i5.O;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!n3x.v(gl6, t.f7161R[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    Object[] objArr2 = t.f7161R;
                    pgk = objArr2.length == 2 ? null : new pgk(0, 0, ooA.X(i6, objArr2), null);
                }
                pgk = t;
                break;
            }
            pgk = t.o(i, i2 + 5, gl6);
            if (pgk != null) {
                return t != pgk ? K(i4, i3, pgk) : this;
            }
            Object[] objArr3 = this.f7161R;
            if (objArr3.length == 1) {
                return null;
            }
            return new pgk(this.f7159R, this.v ^ i3, ooA.O(i4, objArr3), null);
        }
    }

    public final pgk t(int i) {
        return (pgk) this.f7161R[i];
    }

    public final int v() {
        if (this.v == 0) {
            return this.f7161R.length / 2;
        }
        int bitCount = Integer.bitCount(this.f7159R);
        int length = this.f7161R.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += t(i).v();
        }
        return bitCount;
    }

    public final pgk y(int i, pgk pgk, ift ift) {
        Object[] objArr = this.f7161R;
        if (objArr.length == 1 && pgk.f7161R.length == 2 && pgk.v == 0) {
            pgk.f7159R = this.v;
            return pgk;
        } else if (this.f7160R == ift) {
            objArr[i] = pgk;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[i] = pgk;
            return new pgk(this.f7159R, this.v, copyOf, ift);
        }
    }
}
