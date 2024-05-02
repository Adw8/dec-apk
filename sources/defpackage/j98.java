package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;

/* renamed from: j98  reason: default package */
/* loaded from: classes.dex */
public final class j98 extends ye implements bh7 {
    public static final j98 R = new j98(new Object[0]);

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f4840R;

    public j98(Object[] objArr) {
        this.f4840R = objArr;
    }

    @Override // defpackage.oOh
    public final oOh L(int i, Object obj) {
        ooA.P(i, this.f4840R.length);
        Object[] objArr = this.f4840R;
        if (i == objArr.length) {
            return m(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            P7.r(objArr, objArr2, 0, 0, i, 6);
            Object[] objArr3 = this.f4840R;
            System.arraycopy(objArr3, i, objArr2, i + 1, objArr3.length - i);
            objArr2[i] = obj;
            return new j98(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Object[] objArr4 = this.f4840R;
        System.arraycopy(objArr4, i, copyOf, i + 1, (objArr4.length - 1) - i);
        copyOf[i] = obj;
        Object[] objArr5 = this.f4840R;
        Object[] objArr6 = new Object[32];
        objArr6[0] = objArr5[31];
        return new lwB(copyOf, objArr6, objArr5.length + 1, 0);
    }

    @Override // defpackage.U1
    public final int R() {
        return this.f4840R.length;
    }

    @Override // defpackage.ye, defpackage.oOh
    public final oOh X(Collection collection) {
        if (collection.size() + this.f4840R.length <= 32) {
            Object[] objArr = this.f4840R;
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            int length = this.f4840R.length;
            for (Object obj : collection) {
                length++;
                copyOf[length] = obj;
            }
            return new j98(copyOf);
        }
        h3d j = j();
        j.addAll(collection);
        return j.c();
    }

    @Override // defpackage.oOh
    public final oOh Z(ld ldVar) {
        Object[] objArr = this.f4840R;
        int length = objArr.length;
        int length2 = objArr.length;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = this.f4840R[i];
            if (((Boolean) ldVar.x(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.f4840R;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                length++;
                objArr[length] = obj;
            }
        }
        if (length == this.f4840R.length) {
            return this;
        }
        if (length == 0) {
            return R;
        }
        gvP.j(length, objArr.length);
        return new j98(Arrays.copyOfRange(objArr, 0, length));
    }

    @Override // defpackage.oOh
    public final oOh g(int i) {
        ooA.N(i, R());
        if (R() == 1) {
            return R;
        }
        Object[] copyOf = Arrays.copyOf(this.f4840R, R() - 1);
        int i2 = i + 1;
        System.arraycopy(this.f4840R, i2, copyOf, i, R() - i2);
        return new j98(copyOf);
    }

    @Override // defpackage.Uk, java.util.List
    public final Object get(int i) {
        ooA.N(i, R());
        return this.f4840R[i];
    }

    @Override // defpackage.Uk, java.util.List
    public final int indexOf(Object obj) {
        return P7.l(this.f4840R, obj);
    }

    @Override // defpackage.oOh
    public final h3d j() {
        return new h3d(this, null, this.f4840R, 0);
    }

    @Override // defpackage.Uk, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f4840R;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (n3x.v(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    @Override // defpackage.Uk, java.util.List
    public final ListIterator listIterator(int i) {
        ooA.P(i, R());
        return new WY(i, R(), this.f4840R);
    }

    @Override // defpackage.oOh
    public final oOh m(Object obj) {
        Object[] objArr = this.f4840R;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[this.f4840R.length] = obj;
            return new j98(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new lwB(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.oOh
    public final oOh x(int i, Object obj) {
        ooA.N(i, R());
        Object[] objArr = this.f4840R;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new j98(copyOf);
    }
}
