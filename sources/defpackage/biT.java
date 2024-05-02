package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: biT  reason: default package */
/* loaded from: classes.dex */
public final class biT implements RandomAccess {
    public bTV R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f1772R;
    public int e = 0;

    public biT(Object[] objArr) {
        this.f1772R = objArr;
    }

    public final void C(biT bit) {
        int i = bit.e - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                U(bit.f1772R[i2]);
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean H() {
        return this.e != 0;
    }

    public final void L() {
        Object[] objArr = this.f1772R;
        int i = this.e;
        while (true) {
            i--;
            if (-1 < i) {
                objArr[i] = null;
            } else {
                this.e = 0;
                return;
            }
        }
    }

    public final Object N(int i) {
        Object[] objArr = this.f1772R;
        Object obj = objArr[i];
        int i2 = this.e;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.e - 1;
        this.e = i4;
        objArr[i4] = null;
        return obj;
    }

    public final List O() {
        bTV btv = this.R;
        if (btv != null) {
            return btv;
        }
        bTV btv2 = new bTV(this);
        this.R = btv2;
        return btv2;
    }

    public final void P(int i, int i2) {
        if (i2 > i) {
            int i3 = this.e;
            if (i2 < i3) {
                Object[] objArr = this.f1772R;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.e;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f1772R[i7] = null;
                    if (i7 == i6) {
                        break;
                    }
                    i7++;
                }
            }
            this.e = i5;
        }
    }

    public final void R(int i, Object obj) {
        m(this.e + 1);
        Object[] objArr = this.f1772R;
        int i2 = this.e;
        if (i != i2) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        }
        objArr[i] = obj;
        this.e++;
    }

    public final boolean U(Object obj) {
        int i;
        int i2 = this.e;
        if (i2 <= 0) {
            i = -1;
            break;
        }
        Object[] objArr = this.f1772R;
        i = 0;
        while (!n3x.v(obj, objArr[i])) {
            i++;
            if (i >= i2) {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        N(i);
        return true;
    }

    public final boolean X(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        m(collection.size() + this.e);
        Object[] objArr = this.f1772R;
        if (i != this.e) {
            System.arraycopy(objArr, i, objArr, collection.size() + i, this.e - i);
        }
        for (Object obj : collection) {
            i2++;
            if (i2 >= 0) {
                objArr[i2 + i] = obj;
            } else {
                pdD.k();
                throw null;
            }
        }
        this.e = collection.size() + this.e;
        return true;
    }

    public final boolean Z(Object obj) {
        int i = this.e - 1;
        if (i >= 0) {
            for (int i2 = 0; !n3x.v(this.f1772R[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void c(int i, biT bit) {
        if (!bit.x()) {
            m(this.e + bit.e);
            Object[] objArr = this.f1772R;
            int i2 = this.e;
            if (i != i2) {
                System.arraycopy(objArr, i, objArr, bit.e + i, i2 - i);
            }
            System.arraycopy(bit.f1772R, 0, objArr, i, bit.e - 0);
            this.e += bit.e;
        }
    }

    public final void m(int i) {
        Object[] objArr = this.f1772R;
        if (objArr.length < i) {
            this.f1772R = Arrays.copyOf(objArr, Math.max(i, objArr.length * 2));
        }
    }

    public final void v(Object obj) {
        m(this.e + 1);
        Object[] objArr = this.f1772R;
        int i = this.e;
        objArr[i] = obj;
        this.e = i + 1;
    }

    public final boolean x() {
        return this.e == 0;
    }
}
