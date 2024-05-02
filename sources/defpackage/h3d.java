package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: h3d  reason: default package */
/* loaded from: classes.dex */
public final class h3d extends k7 implements oOL {
    public ift R = new ift(19);

    /* renamed from: R  reason: collision with other field name */
    public oOh f4031R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f4032R;
    public int X;
    public Object[] c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public Object[] f4033e;
    public Object[] v;

    public h3d(oOh ooh, Object[] objArr, Object[] objArr2, int i) {
        this.f4031R = ooh;
        this.f4032R = objArr;
        this.v = objArr2;
        this.e = i;
        this.c = objArr;
        this.f4033e = objArr2;
        this.X = ((U1) ooh).R();
    }

    public static void H(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            i++;
            objArr[i] = it.next();
        }
    }

    public final void A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.X;
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 > (1 << i3)) {
            this.c = S(this.e + 5, h(objArr), objArr2);
            this.f4033e = objArr3;
            this.e += 5;
            this.X++;
        } else if (objArr == null) {
            this.c = objArr2;
            this.f4033e = objArr3;
            this.X = i + 1;
        } else {
            this.c = S(i3, objArr, objArr2);
            this.f4033e = objArr3;
            this.X++;
        }
    }

    public final int B() {
        int i = this.X;
        return i <= 32 ? i : i - ((i - 1) & -32);
    }

    public final int C() {
        return ((AbstractList) this).modCount;
    }

    public final void G(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArr4;
        if (i3 >= 1) {
            Object[] K = K(objArr);
            objArr2[0] = K;
            int i4 = i & 31;
            int size = ((collection.size() + i) - 1) & 31;
            int i5 = i2 - i4;
            int i6 = size + i5;
            if (i6 < 32) {
                System.arraycopy(K, i4, objArr3, size + 1, i5);
            } else {
                int i7 = (i6 - 32) + 1;
                if (i3 == 1) {
                    objArr4 = K;
                } else {
                    objArr4 = Y();
                    i3--;
                    objArr2[i3] = objArr4;
                }
                int i8 = i2 - i7;
                System.arraycopy(K, i8, objArr3, 0, i2 - i8);
                System.arraycopy(K, i4, objArr4, size + 1, i8 - i4);
                objArr3 = objArr4;
            }
            Iterator it = collection.iterator();
            H(K, i4, it);
            for (int i9 = 1; i9 < i3; i9++) {
                Object[] Y = Y();
                H(Y, 0, it);
                objArr2[i9] = Y;
            }
            H(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object[] I(int i, int i2, Object[] objArr) {
        if (!(i2 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i2 == 0) {
            return objArr;
        } else {
            int i3 = (i >> i2) & 31;
            Object I = I(i, i2 - 5, (Object[]) objArr[i3]);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (V(objArr)) {
                        Arrays.fill(objArr, i4, 32, (Object) null);
                    }
                    Object[] Y = Y();
                    System.arraycopy(objArr, 0, Y, 0, i4 - 0);
                    objArr = Y;
                }
            }
            if (I == objArr[i3]) {
                return objArr;
            }
            Object[] K = K(objArr);
            K[i3] = I;
            return K;
        }
    }

    public final Object[] J(int i, Object[] objArr) {
        if (V(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, (32 - i) - 0);
            return objArr;
        }
        Object[] Y = Y();
        System.arraycopy(objArr, 0, Y, i, (32 - i) - 0);
        return Y;
    }

    public final Object[] K(Object[] objArr) {
        if (objArr == null) {
            return Y();
        }
        if (V(objArr)) {
            return objArr;
        }
        Object[] Y = Y();
        int length = objArr.length;
        P7.r(objArr, Y, 0, 0, length > 32 ? 32 : length, 6);
        return Y;
    }

    public final void P(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.c != null) {
            int i4 = i >> 5;
            nQ o = o(k() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (o.e - 1 != i4) {
                Object[] objArr4 = (Object[]) o.previous();
                int i6 = 32 - i2;
                System.arraycopy(objArr4, i6, objArr3, 0, 32 - i6);
                objArr3 = J(i2, objArr4);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) o.previous();
            int k = i3 - (((k() >> 5) - 1) - i4);
            if (k < i3) {
                objArr2 = objArr[k];
            }
            G(collection, i, objArr5, 32, objArr, k, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Object[] Q(Object[] objArr, int i, Object[][] objArr2) {
        o7s o7s = new o7s(objArr2);
        int i2 = i >> 5;
        int i3 = this.e;
        Object[] n = i2 < (1 << i3) ? n(objArr, i, i3, o7s) : K(objArr);
        while (o7s.hasNext()) {
            this.e += 5;
            n = h(n);
            int i4 = this.e;
            n(n, 1 << i4, i4, o7s);
        }
        return n;
    }

    @Override // defpackage.k7
    public final int R() {
        return this.X;
    }

    public final Object[] S(int i, Object[] objArr, Object[] objArr2) {
        int R = ((R() - 1) >> i) & 31;
        Object[] K = K(objArr);
        if (i == 5) {
            K[R] = objArr2;
        } else {
            K[R] = S(i - 5, (Object[]) K[R], objArr2);
        }
        return K;
    }

    public final Object[] T(Object[] objArr, int i, int i2, Zz zz) {
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i4];
            Object[] K = K(objArr);
            int i5 = i4 + 1;
            System.arraycopy(objArr, i5, K, i4, 32 - i5);
            K[31] = zz.R;
            zz.R = obj;
            return K;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((k() - 1) >> i);
        }
        Object[] K2 = K(objArr);
        int i6 = i - 5;
        int i7 = i4 + 1;
        if (i7 <= i3) {
            while (true) {
                K2[i3] = T((Object[]) K2[i3], i6, 0, zz);
                if (i3 == i7) {
                    break;
                }
                i3--;
            }
        }
        K2[i4] = T((Object[]) K2[i4], i6, i2, zz);
        return K2;
    }

    public final boolean V(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.R;
    }

    public final int W(ld ldVar, Object[] objArr, int i, Zz zz) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) ldVar.x(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = K(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                i2++;
                objArr2[i2] = obj;
            }
        }
        zz.R = objArr2;
        return i2;
    }

    public final Object[] Y() {
        Object[] objArr = new Object[33];
        objArr[32] = this.R;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ooA.P(i, R());
        if (i == R()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int k = k();
        if (i >= k) {
            i(i - k, obj, this.c);
            return;
        }
        Zz zz = new Zz(null);
        i(0, zz.R, t(this.c, this.e, i, obj, zz));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Object[] objArr;
        ooA.P(i, this.X);
        if (i == this.X) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.X - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            Object[] objArr2 = this.f4033e;
            Object[] K = K(objArr2);
            System.arraycopy(objArr2, i3, K, (((collection.size() + i) - 1) & 31) + 1, B() - i3);
            H(K, i3, collection.iterator());
            this.f4033e = K;
            this.X = collection.size() + this.X;
            return true;
        }
        Object[][] objArr3 = new Object[size];
        int B = B();
        int size2 = collection.size() + this.X;
        if (size2 > 32) {
            size2 -= (size2 - 1) & -32;
        }
        if (i >= k()) {
            objArr = Y();
            G(collection, i, this.f4033e, B, objArr3, size, objArr);
        } else if (size2 > B) {
            int i4 = size2 - B;
            objArr = J(i4, this.f4033e);
            P(collection, i, i4, objArr3, size, objArr);
        } else {
            Object[] objArr4 = this.f4033e;
            objArr = Y();
            int i5 = B - size2;
            System.arraycopy(objArr4, i5, objArr, 0, B - i5);
            int i6 = 32 - i5;
            Object[] J = J(i6, this.f4033e);
            int i7 = size - 1;
            objArr3[i7] = J;
            P(collection, i, i6, objArr3, i7, J);
        }
        this.c = Q(this.c, i2, objArr3);
        this.f4033e = objArr;
        this.X = collection.size() + this.X;
        return true;
    }

    public final oOh c() {
        oOh ooh;
        Object[] objArr = this.c;
        if (objArr == this.f4032R && this.f4033e == this.v) {
            ooh = this.f4031R;
        } else {
            this.R = new ift(19);
            this.f4032R = objArr;
            Object[] objArr2 = this.f4033e;
            this.v = objArr2;
            if (objArr == null) {
                ooh = objArr2.length == 0 ? j98.R : new j98(Arrays.copyOf(this.f4033e, R()));
            } else {
                ooh = new lwB(objArr, objArr2, R(), this.e);
            }
        }
        this.f4031R = ooh;
        return ooh;
    }

    public final int d(ld ldVar, Object[] objArr, int i, int i2, Zz zz, ArrayList arrayList, ArrayList arrayList2) {
        if (V(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) zz.R;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) ldVar.x(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = arrayList.isEmpty() ^ true ? (Object[]) arrayList.remove(arrayList.size() - 1) : Y();
                    i2 = 0;
                }
                i2++;
                objArr3[i2] = obj;
            }
        }
        zz.R = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ooA.N(i, R());
        if (k() <= i) {
            objArr = this.f4033e;
        } else {
            Object[] objArr2 = this.c;
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                objArr2 = (Object[]) objArr2[(i >> i2) & 31];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.R;
        return objArr;
    }

    public final void i(int i, Object obj, Object[] objArr) {
        int B = B();
        Object[] K = K(this.f4033e);
        if (B < 32) {
            System.arraycopy(this.f4033e, i, K, i + 1, B - i);
            K[i] = obj;
            this.c = objArr;
            this.f4033e = K;
            this.X = R() + 1;
            return;
        }
        Object[] objArr2 = this.f4033e;
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, K, i + 1, 31 - i);
        K[i] = obj;
        A(objArr, K, h(obj2));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int k() {
        if (R() <= 32) {
            return 0;
        }
        return (R() - 1) & -32;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ooA.P(i, R());
        return new ik4(this, i);
    }

    public final Object[] n(Object[] objArr, int i, int i2, Iterator it) {
        if (it.hasNext()) {
            if (!(i2 >= 0)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (i2 == 0) {
                return (Object[]) it.next();
            } else {
                Object[] K = K(objArr);
                int i3 = (i >> i2) & 31;
                int i4 = i2 - 5;
                K[i3] = n((Object[]) K[i3], i, i4, it);
                while (true) {
                    i3++;
                    if (i3 >= 32 || !it.hasNext()) {
                        break;
                    }
                    K[i3] = n((Object[]) K[i3], 0, i4, it);
                }
                return K;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final nQ o(int i) {
        if (this.c != null) {
            int k = k() >> 5;
            ooA.P(i, k);
            int i2 = this.e;
            if (i2 == 0) {
                return new WY(i, this.c);
            }
            return new cVf(this.c, i, k, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Object[] p(Object[] objArr, int i, int i2, Object obj, Zz zz) {
        int i3 = (i2 >> i) & 31;
        Object[] K = K(objArr);
        if (i == 0) {
            if (K != objArr) {
                ((AbstractList) this).modCount++;
            }
            zz.R = K[i3];
            K[i3] = obj;
            return K;
        }
        K[i3] = p((Object[]) K[i3], i - 5, i2, obj, zz);
        return K;
    }

    public final Object r(Object[] objArr, int i, int i2, int i3) {
        int R = R() - i;
        if (R == 1) {
            Object obj = this.f4033e[0];
            z(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.f4033e;
        Object obj2 = objArr2[i3];
        Object[] K = K(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, K, i3, R - i4);
        K[R - 1] = null;
        this.c = objArr;
        this.f4033e = K;
        this.X = (i + R) - 1;
        this.e = i2;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return s(new ld(1, collection));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r0 != r10) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r0 != r10) goto L_0x010b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean s(defpackage.ld r19) {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h3d.s(ld):boolean");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ooA.N(i, R());
        if (k() <= i) {
            Object[] K = K(this.f4033e);
            if (K != this.f4033e) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            Object obj2 = K[i2];
            K[i2] = obj;
            this.f4033e = K;
            return obj2;
        }
        Zz zz = new Zz(null);
        this.c = p(this.c, this.e, i, obj, zz);
        return zz.R;
    }

    public final Object[] t(Object[] objArr, int i, int i2, Object obj, Zz zz) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            zz.R = objArr[31];
            Object[] K = K(objArr);
            System.arraycopy(objArr, i3, K, i3 + 1, 31 - i3);
            K[i3] = obj;
            return K;
        }
        Object[] K2 = K(objArr);
        int i4 = i - 5;
        K2[i3] = t((Object[]) K2[i3], i4, i2, obj, zz);
        while (true) {
            i3++;
            if (i3 >= 32 || (obj2 = K2[i3]) == null) {
                break;
            }
            K2[i3] = t((Object[]) obj2, i4, 0, zz.R, zz);
        }
        return K2;
    }

    public final Object[] u(Object[] objArr, int i, int i2, Zz zz) {
        Object[] objArr2;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            zz.R = objArr[i3];
            objArr2 = null;
        } else {
            objArr2 = u((Object[]) objArr[i3], i - 5, i2, zz);
        }
        if (objArr2 == null && i3 == 0) {
            return null;
        }
        Object[] K = K(objArr);
        K[i3] = objArr2;
        return K;
    }

    @Override // defpackage.k7
    public final Object v(int i) {
        ooA.N(i, R());
        ((AbstractList) this).modCount++;
        int k = k();
        if (i >= k) {
            return r(this.c, k, this.e, i - k);
        }
        Zz zz = new Zz(this.f4033e[0]);
        r(T(this.c, this.e, i, zz), k, this.e, 0);
        return zz.R;
    }

    public final void z(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.c = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f4033e = objArr;
            this.X = i;
            this.e = i2;
            return;
        }
        Zz zz = new Zz(null);
        Object[] u = u(objArr, i2, i, zz);
        this.f4033e = (Object[]) zz.R;
        this.X = i;
        if (u[1] == null) {
            this.c = (Object[]) u[0];
            this.e = i2 - 5;
            return;
        }
        this.c = u;
        this.e = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int B = B();
        if (B < 32) {
            Object[] K = K(this.f4033e);
            K[B] = obj;
            this.f4033e = K;
            this.X = R() + 1;
        } else {
            A(this.c, this.f4033e, h(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int B = B();
        Iterator it = collection.iterator();
        if (32 - B >= collection.size()) {
            Object[] K = K(this.f4033e);
            H(K, B, it);
            this.f4033e = K;
            this.X = collection.size() + this.X;
        } else {
            int size = ((collection.size() + B) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] K2 = K(this.f4033e);
            H(K2, B, it);
            objArr[0] = K2;
            for (int i = 1; i < size; i++) {
                Object[] Y = Y();
                H(Y, 0, it);
                objArr[i] = Y;
            }
            this.c = Q(this.c, k(), objArr);
            Object[] Y2 = Y();
            H(Y2, 0, it);
            this.f4033e = Y2;
            this.X = collection.size() + this.X;
        }
        return true;
    }
}
