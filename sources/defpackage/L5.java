package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: L5  reason: default package */
/* loaded from: classes.dex */
public final class L5 implements Collection, Set {
    public static int O;
    public static int X;
    public static Object[] c;
    public static Object[] e;
    public static final int[] v = new int[0];

    /* renamed from: v  reason: collision with other field name */
    public static final Object[] f270v = new Object[0];
    public Gl R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f271R = v;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f272R = f270v;

    /* renamed from: e  reason: collision with other field name */
    public int f273e = 0;

    public static void v(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (L5.class) {
                if (O < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    e = objArr;
                    O++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (L5.class) {
                if (X < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    c = objArr;
                    X++;
                }
            }
        }
    }

    public final void C(int i) {
        Object[] objArr = this.f272R;
        Object obj = objArr[i];
        int i2 = this.f273e;
        if (i2 <= 1) {
            v(this.f271R, objArr, i2);
            this.f271R = v;
            this.f272R = f270v;
            this.f273e = 0;
            return;
        }
        int[] iArr = this.f271R;
        int i3 = 8;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i4 = i2 - 1;
            this.f273e = i4;
            if (i < i4) {
                int i5 = i + 1;
                System.arraycopy(iArr, i5, iArr, i, i4 - i);
                Object[] objArr2 = this.f272R;
                System.arraycopy(objArr2, i5, objArr2, i, this.f273e - i);
            }
            this.f272R[this.f273e] = null;
            return;
        }
        if (i2 > 8) {
            i3 = i2 + (i2 >> 1);
        }
        R(i3);
        this.f273e--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f271R, 0, i);
            System.arraycopy(objArr, 0, this.f272R, 0, i);
        }
        int i6 = this.f273e;
        if (i < i6) {
            int i7 = i + 1;
            System.arraycopy(iArr, i7, this.f271R, i, i6 - i);
            System.arraycopy(objArr, i7, this.f272R, i, this.f273e - i);
        }
    }

    public final int H() {
        int i = this.f273e;
        if (i == 0) {
            return -1;
        }
        int H = vd.H(i, 0, this.f271R);
        if (H < 0 || this.f272R[H] == null) {
            return H;
        }
        int i2 = H + 1;
        while (i2 < i && this.f271R[i2] == 0) {
            if (this.f272R[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = H - 1;
        while (i3 >= 0 && this.f271R[i3] == 0) {
            if (this.f272R[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public final void R(int i) {
        if (i == 8) {
            synchronized (L5.class) {
                Object[] objArr = e;
                if (objArr != null) {
                    this.f272R = objArr;
                    e = (Object[]) objArr[0];
                    this.f271R = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    O--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (L5.class) {
                Object[] objArr2 = c;
                if (objArr2 != null) {
                    this.f272R = objArr2;
                    c = (Object[]) objArr2[0];
                    this.f271R = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    X--;
                    return;
                }
            }
        }
        this.f271R = new int[i];
        this.f272R = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int i2;
        if (obj == null) {
            i2 = H();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = c(hashCode, obj);
            i = hashCode;
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f273e;
        int[] iArr = this.f271R;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f272R;
            R(i5);
            int[] iArr2 = this.f271R;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f272R, 0, objArr.length);
            }
            v(iArr, objArr, this.f273e);
        }
        int i6 = this.f273e;
        if (i3 < i6) {
            int[] iArr3 = this.f271R;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f272R;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f273e - i3);
        }
        this.f271R[i3] = i;
        this.f272R[i3] = obj;
        this.f273e++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f273e;
        int[] iArr = this.f271R;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f272R;
            R(size);
            int i = this.f273e;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f271R, 0, i);
                System.arraycopy(objArr, 0, this.f272R, 0, this.f273e);
            }
            v(iArr, objArr, this.f273e);
        }
        for (Object obj : collection) {
            z |= add(obj);
        }
        return z;
    }

    public final int c(int i, Object obj) {
        int i2 = this.f273e;
        if (i2 == 0) {
            return -1;
        }
        int H = vd.H(i2, i, this.f271R);
        if (H < 0 || obj.equals(this.f272R[H])) {
            return H;
        }
        int i3 = H + 1;
        while (i3 < i2 && this.f271R[i3] == i) {
            if (obj.equals(this.f272R[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = H - 1;
        while (i4 >= 0 && this.f271R[i4] == i) {
            if (obj.equals(this.f272R[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f273e;
        if (i != 0) {
            v(this.f271R, this.f272R, i);
            this.f271R = v;
            this.f272R = f270v;
            this.f273e = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f273e != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f273e; i++) {
                try {
                    if (!set.contains(this.f272R[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f271R;
        int i = this.f273e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        return obj == null ? H() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f273e <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.R == null) {
            this.R = new Gl(1, this);
        }
        Gl gl = this.R;
        if (((ox_) gl.v) == null) {
            gl.v = new ox_(gl, 1);
        }
        return ((ox_) gl.v).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        C(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f273e - 1; i >= 0; i--) {
            if (!collection.contains(this.f272R[i])) {
                C(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f273e;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f273e;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f272R, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.lang.Object
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f273e * 14);
        sb.append('{');
        for (int i = 0; i < this.f273e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f272R[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f273e) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f273e);
        }
        System.arraycopy(this.f272R, 0, objArr, 0, this.f273e);
        int length = objArr.length;
        int i = this.f273e;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
