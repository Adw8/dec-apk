package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: il  reason: default package */
/* loaded from: classes.dex */
public final class il extends k7 {
    public static final Object[] v = new Object[0];
    public Object[] R;
    public int X;
    public int e;

    public il(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = v;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(opT.Z("Illegal Capacity: ", i));
        }
        this.R = objArr;
    }

    public final Object C() {
        if (isEmpty()) {
            return null;
        }
        return this.R[P(pdD.i(this) + this.e)];
    }

    public final void H(int i) {
        if (i >= 0) {
            Object[] objArr = this.R;
            if (i > objArr.length) {
                if (objArr == v) {
                    if (i < 10) {
                        i = 10;
                    }
                    this.R = new Object[i];
                    return;
                }
                int length = objArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i < 0) {
                    i2 = i;
                }
                if (i2 - 2147483639 > 0) {
                    i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                Object[] objArr2 = new Object[i2];
                int i3 = this.e;
                System.arraycopy(objArr, i3, objArr2, 0, objArr.length - i3);
                Object[] objArr3 = this.R;
                int length2 = objArr3.length;
                int i4 = this.e;
                System.arraycopy(objArr3, 0, objArr2, length2 - i4, i4 - 0);
                this.e = 0;
                this.R = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int P(int i) {
        Object[] objArr = this.R;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // defpackage.k7
    public final int R() {
        return this.X;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        hw1.C(i, this.X);
        int i2 = this.X;
        if (i == i2) {
            addLast(obj);
        } else if (i == 0) {
            addFirst(obj);
        } else {
            H(i2 + 1);
            int P = P(this.e + i);
            int i3 = this.X;
            if (i < ((i3 + 1) >> 1)) {
                int length = P == 0 ? this.R.length - 1 : P - 1;
                int i4 = this.e;
                int length2 = i4 == 0 ? this.R.length - 1 : i4 - 1;
                if (length >= i4) {
                    Object[] objArr = this.R;
                    objArr[length2] = objArr[i4];
                    int i5 = i4 + 1;
                    System.arraycopy(objArr, i5, objArr, i4, (length + 1) - i5);
                } else {
                    Object[] objArr2 = this.R;
                    System.arraycopy(objArr2, i4, objArr2, i4 - 1, objArr2.length - i4);
                    Object[] objArr3 = this.R;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    System.arraycopy(objArr3, 1, objArr3, 0, (length + 1) - 1);
                }
                this.R[length] = obj;
                this.e = length2;
            } else {
                int P2 = P(i3 + this.e);
                if (P < P2) {
                    Object[] objArr4 = this.R;
                    System.arraycopy(objArr4, P, objArr4, P + 1, P2 - P);
                } else {
                    Object[] objArr5 = this.R;
                    System.arraycopy(objArr5, 0, objArr5, 1, P2 - 0);
                    Object[] objArr6 = this.R;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    System.arraycopy(objArr6, P, objArr6, P + 1, (objArr6.length - 1) - P);
                }
                this.R[P] = obj;
            }
            this.X++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        hw1.C(i, this.X);
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.X;
        if (i == i2) {
            return addAll(collection);
        }
        H(collection.size() + i2);
        int P = P(this.X + this.e);
        int P2 = P(this.e + i);
        int size = collection.size();
        if (i < ((this.X + 1) >> 1)) {
            int i3 = this.e;
            int i4 = i3 - size;
            if (P2 < i3) {
                Object[] objArr = this.R;
                System.arraycopy(objArr, i3, objArr, i4, objArr.length - i3);
                if (size >= P2) {
                    Object[] objArr2 = this.R;
                    System.arraycopy(objArr2, 0, objArr2, objArr2.length - size, P2 + 0);
                } else {
                    Object[] objArr3 = this.R;
                    System.arraycopy(objArr3, 0, objArr3, objArr3.length - size, size + 0);
                    Object[] objArr4 = this.R;
                    System.arraycopy(objArr4, size, objArr4, 0, P2 - size);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.R;
                System.arraycopy(objArr5, i3, objArr5, i4, P2 - i3);
            } else {
                Object[] objArr6 = this.R;
                i4 += objArr6.length;
                int i5 = P2 - i3;
                int length = objArr6.length - i4;
                if (length >= i5) {
                    System.arraycopy(objArr6, i3, objArr6, i4, i5);
                } else {
                    System.arraycopy(objArr6, i3, objArr6, i4, (i3 + length) - i3);
                    Object[] objArr7 = this.R;
                    int i6 = this.e + length;
                    System.arraycopy(objArr7, i6, objArr7, 0, P2 - i6);
                }
            }
            this.e = i4;
            int i7 = P2 - size;
            if (i7 < 0) {
                i7 += this.R.length;
            }
            c(i7, collection);
        } else {
            int i8 = P2 + size;
            if (P2 < P) {
                int i9 = size + P;
                Object[] objArr8 = this.R;
                if (i9 <= objArr8.length) {
                    System.arraycopy(objArr8, P2, objArr8, i8, P - P2);
                } else if (i8 >= objArr8.length) {
                    System.arraycopy(objArr8, P2, objArr8, i8 - objArr8.length, P - P2);
                } else {
                    int length2 = P - (i9 - objArr8.length);
                    System.arraycopy(objArr8, length2, objArr8, 0, P - length2);
                    Object[] objArr9 = this.R;
                    System.arraycopy(objArr9, P2, objArr9, i8, length2 - P2);
                }
            } else {
                Object[] objArr10 = this.R;
                System.arraycopy(objArr10, 0, objArr10, size, P - 0);
                Object[] objArr11 = this.R;
                if (i8 >= objArr11.length) {
                    System.arraycopy(objArr11, P2, objArr11, i8 - objArr11.length, objArr11.length - P2);
                } else {
                    int length3 = objArr11.length - size;
                    System.arraycopy(objArr11, length3, objArr11, 0, objArr11.length - length3);
                    Object[] objArr12 = this.R;
                    System.arraycopy(objArr12, P2, objArr12, i8, (objArr12.length - size) - P2);
                }
            }
            c(P2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        H(this.X + 1);
        int i = this.e;
        if (i == 0) {
            i = this.R.length;
        }
        int i2 = i - 1;
        this.e = i2;
        this.R[i2] = obj;
        this.X++;
    }

    public final void addLast(Object obj) {
        H(R() + 1);
        this.R[P(R() + this.e)] = obj;
        this.X = R() + 1;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.R.length;
        while (i < length && it.hasNext()) {
            this.R[i] = it.next();
            i++;
        }
        int i2 = this.e;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.R[i3] = it.next();
        }
        this.X = collection.size() + R();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final void clear() {
        int P = P(R() + this.e);
        int i = this.e;
        if (i < P) {
            Arrays.fill(this.R, i, P, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.R;
            Arrays.fill(objArr, this.e, objArr.length, (Object) null);
            Arrays.fill(this.R, 0, P, (Object) null);
        }
        this.e = 0;
        this.X = 0;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.R[this.e];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        hw1.U(i, this.X);
        return this.R[P(this.e + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int P = P(R() + this.e);
        int i2 = this.e;
        if (i2 < P) {
            while (i2 < P) {
                if (n3x.v(obj, this.R[i2])) {
                    i = this.e;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < P) {
            return -1;
        } else {
            int length = this.R.length;
            while (true) {
                if (i2 >= length) {
                    for (int i3 = 0; i3 < P; i3++) {
                        if (n3x.v(obj, this.R[i3])) {
                            i2 = i3 + this.R.length;
                            i = this.e;
                        }
                    }
                    return -1;
                } else if (n3x.v(obj, this.R[i2])) {
                    i = this.e;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return R() == 0;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.R[P(pdD.i(this) + this.e)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int P = P(R() + this.e);
        int i2 = this.e;
        if (i2 < P) {
            length = P - 1;
            if (i2 <= length) {
                while (!n3x.v(obj, this.R[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.e;
                return length - i;
            }
            return -1;
        }
        if (i2 > P) {
            int i3 = P - 1;
            while (true) {
                if (-1 >= i3) {
                    length = this.R.length - 1;
                    int i4 = this.e;
                    if (i4 <= length) {
                        while (!n3x.v(obj, this.R[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.e;
                    }
                } else if (n3x.v(obj, this.R[i3])) {
                    length = i3 + this.R.length;
                    i = this.e;
                    break;
                } else {
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        v(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        boolean z = false;
        if (!isEmpty()) {
            if (!(this.R.length == 0)) {
                int P = P(this.X + this.e);
                int i2 = this.e;
                if (i2 < P) {
                    i = i2;
                    while (i2 < P) {
                        Object obj = this.R[i2];
                        if (!collection.contains(obj)) {
                            i++;
                            this.R[i] = obj;
                        } else {
                            z = true;
                        }
                        i2++;
                    }
                    Arrays.fill(this.R, i, P, (Object) null);
                } else {
                    int length = this.R.length;
                    boolean z2 = false;
                    int i3 = i2;
                    while (i2 < length) {
                        Object[] objArr = this.R;
                        Object obj2 = objArr[i2];
                        objArr[i2] = null;
                        if (!collection.contains(obj2)) {
                            i3++;
                            this.R[i3] = obj2;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    i = P(i3);
                    for (int i4 = 0; i4 < P; i4++) {
                        Object[] objArr2 = this.R;
                        Object obj3 = objArr2[i4];
                        objArr2[i4] = null;
                        if (!collection.contains(obj3)) {
                            Object[] objArr3 = this.R;
                            objArr3[i] = obj3;
                            i = i == objArr3.length + -1 ? 0 : i + 1;
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    int i5 = i - this.e;
                    if (i5 < 0) {
                        i5 += this.R.length;
                    }
                    this.X = i5;
                }
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.R;
            int i = this.e;
            Object obj = objArr[i];
            objArr[i] = null;
            this.e = i == objArr.length + -1 ? 0 : i + 1;
            this.X--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            int P = P(pdD.i(this) + this.e);
            Object[] objArr = this.R;
            Object obj = objArr[P];
            objArr[P] = null;
            this.X = R() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        boolean z = false;
        if (!isEmpty()) {
            if (!(this.R.length == 0)) {
                int P = P(this.X + this.e);
                int i2 = this.e;
                if (i2 < P) {
                    i = i2;
                    while (i2 < P) {
                        Object obj = this.R[i2];
                        if (collection.contains(obj)) {
                            i++;
                            this.R[i] = obj;
                        } else {
                            z = true;
                        }
                        i2++;
                    }
                    Arrays.fill(this.R, i, P, (Object) null);
                } else {
                    int length = this.R.length;
                    boolean z2 = false;
                    int i3 = i2;
                    while (i2 < length) {
                        Object[] objArr = this.R;
                        Object obj2 = objArr[i2];
                        objArr[i2] = null;
                        if (collection.contains(obj2)) {
                            i3++;
                            this.R[i3] = obj2;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    i = P(i3);
                    for (int i4 = 0; i4 < P; i4++) {
                        Object[] objArr2 = this.R;
                        Object obj3 = objArr2[i4];
                        objArr2[i4] = null;
                        if (collection.contains(obj3)) {
                            Object[] objArr3 = this.R;
                            objArr3[i] = obj3;
                            i = i == objArr3.length + -1 ? 0 : i + 1;
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    int i5 = i - this.e;
                    if (i5 < 0) {
                        i5 += this.R.length;
                    }
                    this.X = i5;
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        hw1.U(i, this.X);
        int P = P(this.e + i);
        Object[] objArr = this.R;
        Object obj2 = objArr[P];
        objArr[P] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[R()]);
    }

    @Override // defpackage.k7
    public final Object v(int i) {
        hw1.U(i, this.X);
        if (i == pdD.i(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int P = P(this.e + i);
        Object[] objArr = this.R;
        Object obj = objArr[P];
        int i2 = 0;
        if (i < (this.X >> 1)) {
            int i3 = this.e;
            if (P >= i3) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, P - i3);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, P - 0);
                Object[] objArr2 = this.R;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.e;
                System.arraycopy(objArr2, i4, objArr2, i4 + 1, (objArr2.length - 1) - i4);
            }
            Object[] objArr3 = this.R;
            int i5 = this.e;
            objArr3[i5] = null;
            if (i5 != objArr3.length - 1) {
                i2 = i5 + 1;
            }
            this.e = i2;
        } else {
            int P2 = P(pdD.i(this) + this.e);
            if (P <= P2) {
                Object[] objArr4 = this.R;
                int i6 = P + 1;
                System.arraycopy(objArr4, i6, objArr4, P, (P2 + 1) - i6);
            } else {
                Object[] objArr5 = this.R;
                int i7 = P + 1;
                System.arraycopy(objArr5, i7, objArr5, P, objArr5.length - i7);
                Object[] objArr6 = this.R;
                objArr6[objArr6.length - 1] = objArr6[0];
                System.arraycopy(objArr6, 1, objArr6, 0, (P2 + 1) - 1);
            }
            this.R[P2] = null;
        }
        this.X--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.X;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int P = P(this.X + this.e);
        int i2 = this.e;
        if (i2 < P) {
            P7.r(this.R, objArr, 0, i2, P, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.R;
            int i3 = this.e;
            System.arraycopy(objArr2, i3, objArr, 0, objArr2.length - i3);
            Object[] objArr3 = this.R;
            System.arraycopy(objArr3, 0, objArr, objArr3.length - this.e, P - 0);
        }
        int length2 = objArr.length;
        int i4 = this.X;
        if (length2 > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    public il() {
        this.R = v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        H(collection.size() + R());
        c(P(R() + this.e), collection);
        return true;
    }
}
