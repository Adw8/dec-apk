package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: cE0  reason: default package */
/* loaded from: classes.dex */
public class cE0 {
    public static int O;
    public static int X;
    public static Object[] c;
    public static Object[] v;
    public int[] R = vd.R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f2018R = vd.f7444R;
    public int e = 0;

    private void R(int i) {
        if (i == 8) {
            synchronized (cE0.class) {
                Object[] objArr = c;
                if (objArr != null) {
                    this.f2018R = objArr;
                    c = (Object[]) objArr[0];
                    this.R = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    O--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cE0.class) {
                Object[] objArr2 = v;
                if (objArr2 != null) {
                    this.f2018R = objArr2;
                    v = (Object[]) objArr2[0];
                    this.R = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    X--;
                    return;
                }
            }
        }
        this.R = new int[i];
        this.f2018R = new Object[i << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (cE0.class) {
                if (O < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    c = objArr;
                    O++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cE0.class) {
                if (X < 10) {
                    objArr[0] = v;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    v = objArr;
                    X++;
                }
            }
        }
    }

    public final int L(Object obj) {
        int i = this.e * 2;
        Object[] objArr = this.f2018R;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int O() {
        int i = this.e;
        if (i == 0) {
            return -1;
        }
        try {
            int H = vd.H(i, 0, this.R);
            if (H < 0 || this.f2018R[H << 1] == null) {
                return H;
            }
            int i2 = H + 1;
            while (i2 < i && this.R[i2] == 0) {
                if (this.f2018R[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = H - 1;
            while (i3 >= 0 && this.R[i3] == 0) {
                if (this.f2018R[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int X(Object obj) {
        return obj == null ? O() : e(obj.hashCode(), obj);
    }

    public final Object Z(int i) {
        return this.f2018R[i << 1];
    }

    public final void clear() {
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.R;
            Object[] objArr = this.f2018R;
            this.R = vd.R;
            this.f2018R = vd.f7444R;
            this.e = 0;
            c(iArr, objArr, i);
        }
        if (this.e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return X(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return L(obj) >= 0;
    }

    public final int e(int i, Object obj) {
        int i2 = this.e;
        if (i2 == 0) {
            return -1;
        }
        try {
            int H = vd.H(i2, i, this.R);
            if (H < 0 || obj.equals(this.f2018R[H << 1])) {
                return H;
            }
            int i3 = H + 1;
            while (i3 < i2 && this.R[i3] == i) {
                if (obj.equals(this.f2018R[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = H - 1;
            while (i4 >= 0 && this.R[i4] == i) {
                if (obj.equals(this.f2018R[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cE0) {
            cE0 ce0 = (cE0) obj;
            if (this.e != ce0.e) {
                return false;
            }
            for (int i = 0; i < this.e; i++) {
                try {
                    Object Z = Z(i);
                    Object x = x(i);
                    Object orDefault = ce0.getOrDefault(Z, null);
                    if (x == null) {
                        if (orDefault != null || !ce0.containsKey(Z)) {
                            return false;
                        }
                    } else if (!x.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.e != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.e; i2++) {
                try {
                    Object Z2 = Z(i2);
                    Object x2 = x(i2);
                    Object obj2 = map.get(Z2);
                    if (x2 == null) {
                        if (obj2 != null || !map.containsKey(Z2)) {
                            return false;
                        }
                    } else if (!x2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int X2 = X(obj);
        return X2 >= 0 ? this.f2018R[(X2 << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.R;
        Object[] objArr = this.f2018R;
        int i = this.e;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.e <= 0;
    }

    public final Object m(int i) {
        Object[] objArr = this.f2018R;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.e;
        int i4 = 0;
        if (i3 <= 1) {
            c(this.R, objArr, i3);
            this.R = vd.R;
            this.f2018R = vd.f7444R;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.R;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f2018R;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f2018R;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                R(i6);
                if (i3 == this.e) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.R, 0, i);
                        System.arraycopy(objArr, 0, this.f2018R, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.R, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.f2018R, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.e) {
            this.e = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.e;
        if (obj == null) {
            i2 = O();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = e(hashCode, obj);
            i = hashCode;
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.f2018R;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~i2;
        int[] iArr = this.R;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f2018R;
            R(i6);
            if (i3 == this.e) {
                int[] iArr2 = this.R;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f2018R, 0, objArr2.length);
                }
                c(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.R;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f2018R;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.e - i5) << 1);
        }
        int i8 = this.e;
        if (i3 == i8) {
            int[] iArr4 = this.R;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f2018R;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.e = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int X2 = X(obj);
        if (X2 >= 0) {
            return m(X2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int X2 = X(obj);
        if (X2 < 0) {
            return null;
        }
        int i = (X2 << 1) + 1;
        Object[] objArr = this.f2018R;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final int size() {
        return this.e;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object Z = Z(i);
            if (Z != this) {
                sb.append(Z);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object x = x(i);
            if (x != this) {
                sb.append(x);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void v(int i) {
        int i2 = this.e;
        int[] iArr = this.R;
        if (iArr.length < i) {
            Object[] objArr = this.f2018R;
            R(i);
            if (this.e > 0) {
                System.arraycopy(iArr, 0, this.R, 0, i2);
                System.arraycopy(objArr, 0, this.f2018R, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.e != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object x(int i) {
        return this.f2018R[(i << 1) + 1];
    }

    public final boolean remove(Object obj, Object obj2) {
        int X2 = X(obj);
        if (X2 < 0) {
            return false;
        }
        Object x = x(X2);
        if (obj2 != x && (obj2 == null || !obj2.equals(x))) {
            return false;
        }
        m(X2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int X2 = X(obj);
        if (X2 < 0) {
            return false;
        }
        Object x = x(X2);
        if (x != obj2 && (obj2 == null || !obj2.equals(x))) {
            return false;
        }
        int i = (X2 << 1) + 1;
        Object[] objArr = this.f2018R;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }
}
