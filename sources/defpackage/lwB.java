package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* renamed from: lwB  reason: default package */
/* loaded from: classes.dex */
public final class lwB extends ye {
    public final Object[] R;
    public final int X;
    public final int e;
    public final Object[] v;

    public lwB(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.R = objArr;
        this.v = objArr2;
        this.e = i;
        this.X = i2;
        if (!(R() > 32)) {
            StringBuilder U = opT.U("Trie-based persistent vector should have at least 33 elements, got ");
            U.append(R());
            throw new IllegalArgumentException(U.toString().toString());
        }
    }

    public static Object[] K(int i, int i2, Object obj, Object[] objArr) {
        int i3 = (i2 >> i) & 31;
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[i3] = obj;
        } else {
            copyOf[i3] = K(i - 5, i2, obj, (Object[]) copyOf[i3]);
        }
        return copyOf;
    }

    public final Object[] C(Object[] objArr, int i, int i2, Zz zz) {
        Object[] objArr2;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            zz.R = objArr[i3];
            objArr2 = null;
        } else {
            objArr2 = C((Object[]) objArr[i3], i - 5, i2, zz);
        }
        if (objArr2 == null && i3 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[i3] = objArr2;
        return copyOf;
    }

    public final lwB H(int i, Object obj, Object[] objArr) {
        int o = this.e - o();
        Object[] copyOf = Arrays.copyOf(this.v, 32);
        if (o < 32) {
            System.arraycopy(this.v, i, copyOf, i + 1, o - i);
            copyOf[i] = obj;
            return new lwB(objArr, copyOf, this.e + 1, this.X);
        }
        Object[] objArr2 = this.v;
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, copyOf, i + 1, (o - 1) - i);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return P(objArr, copyOf, objArr3);
    }

    @Override // defpackage.oOh
    public final oOh L(int i, Object obj) {
        ooA.P(i, R());
        if (i == R()) {
            return m(obj);
        }
        int o = o();
        if (i >= o) {
            return H(i - o, obj, this.R);
        }
        Zz zz = new Zz(null);
        return H(0, zz.R, c(this.R, this.X, i, obj, zz));
    }

    public final lwB P(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.e >> 5;
        int i2 = this.X;
        if (i <= (1 << i2)) {
            return new lwB(t(i2, objArr, objArr2), objArr3, this.e + 1, this.X);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i3 = i2 + 5;
        return new lwB(t(i3, objArr4, objArr2), objArr3, this.e + 1, i3);
    }

    @Override // defpackage.U1
    public final int R() {
        return this.e;
    }

    public final ye V(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.e - i;
        if (i4 != 1) {
            Object[] copyOf = Arrays.copyOf(this.v, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                int i6 = i3 + 1;
                System.arraycopy(this.v, i6, copyOf, i3, i4 - i6);
            }
            copyOf[i5] = null;
            return new lwB(objArr, copyOf, (i + i4) - 1, i2);
        } else if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new j98(objArr);
        } else {
            Zz zz = new Zz(null);
            Object[] C = C(objArr, i2, i - 1, zz);
            Object[] objArr2 = (Object[]) zz.R;
            return C[1] == null ? new lwB((Object[]) C[0], objArr2, i, i2 - 5) : new lwB(C, objArr2, i, i2);
        }
    }

    @Override // defpackage.oOh
    public final oOh Z(ld ldVar) {
        h3d v = j();
        v.s(ldVar);
        return v.c();
    }

    public final Object[] c(Object[] objArr, int i, int i2, Object obj, Zz zz) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            Object[] copyOf = i3 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            System.arraycopy(objArr, i3, copyOf, i3 + 1, 31 - i3);
            zz.R = objArr[31];
            copyOf[i3] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        copyOf2[i3] = c((Object[]) objArr[i3], i4, i2, obj, zz);
        while (true) {
            i3++;
            if (i3 >= 32 || copyOf2[i3] == null) {
                break;
            }
            copyOf2[i3] = c((Object[]) objArr[i3], i4, 0, zz.R, zz);
        }
        return copyOf2;
    }

    @Override // defpackage.oOh
    public final oOh g(int i) {
        ooA.N(i, this.e);
        int o = o();
        return i >= o ? V(this.R, o, this.X, i - o) : V(i(this.R, this.X, i, new Zz(this.v[0])), o, this.X, 0);
    }

    @Override // defpackage.Uk, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ooA.N(i, R());
        if (o() <= i) {
            objArr = this.v;
        } else {
            Object[] objArr2 = this.R;
            for (int i2 = this.X; i2 > 0; i2 -= 5) {
                objArr2 = (Object[]) objArr2[(i >> i2) & 31];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] i(Object[] objArr, int i, int i2, Zz zz) {
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            Object[] copyOf = i4 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            int i5 = i4 + 1;
            System.arraycopy(objArr, i5, copyOf, i4, 32 - i5);
            copyOf[31] = zz.R;
            zz.R = objArr[i4];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((o() - 1) >> i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i6 = i - 5;
        int i7 = i4 + 1;
        if (i7 <= i3) {
            while (true) {
                copyOf2[i3] = i((Object[]) copyOf2[i3], i6, 0, zz);
                if (i3 == i7) {
                    break;
                }
                i3--;
            }
        }
        copyOf2[i4] = i((Object[]) copyOf2[i4], i6, i2, zz);
        return copyOf2;
    }

    @Override // defpackage.Uk, java.util.List
    public final ListIterator listIterator(int i) {
        ooA.P(i, R());
        return new f_Y(this.R, this.v, i, R(), (this.X / 5) + 1);
    }

    @Override // defpackage.oOh
    public final oOh m(Object obj) {
        int o = this.e - o();
        if (o < 32) {
            Object[] copyOf = Arrays.copyOf(this.v, 32);
            copyOf[o] = obj;
            return new lwB(this.R, copyOf, this.e + 1, this.X);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return P(this.R, this.v, objArr);
    }

    public final int o() {
        return (R() - 1) & -32;
    }

    public final Object[] t(int i, Object[] objArr, Object[] objArr2) {
        int R = ((R() - 1) >> i) & 31;
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[R] = objArr2;
        } else {
            copyOf[R] = t(i - 5, (Object[]) copyOf[R], objArr2);
        }
        return copyOf;
    }

    /* renamed from: v */
    public final h3d j() {
        return new h3d(this, this.R, this.v, this.X);
    }

    @Override // defpackage.oOh
    public final oOh x(int i, Object obj) {
        ooA.N(i, this.e);
        if (o() <= i) {
            Object[] copyOf = Arrays.copyOf(this.v, 32);
            copyOf[i & 31] = obj;
            return new lwB(this.R, copyOf, this.e, this.X);
        }
        return new lwB(K(this.X, i, obj, this.R), this.v, this.e, this.X);
    }
}
