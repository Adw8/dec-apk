package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: pvq  reason: default package */
/* loaded from: classes.dex */
public final class pvq extends vB implements RandomAccess {
    public static final pvq R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f7315R;
    public int e;

    static {
        pvq pvq = new pvq(0, new Object[0]);
        R = pvq;
        ((vB) pvq).R = false;
    }

    public pvq(int i, Object[] objArr) {
        this.f7315R = objArr;
        this.e = i;
    }

    @Override // defpackage.vB, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        R();
        int i = this.e;
        Object[] objArr = this.f7315R;
        if (i == objArr.length) {
            this.f7315R = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7315R;
        int i2 = this.e;
        this.e = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.e) {
            StringBuilder C = opT.C("Index:", i, ", Size:");
            C.append(this.e);
            throw new IndexOutOfBoundsException(C.toString());
        }
    }

    @Override // defpackage.aFq
    public final aFq e(int i) {
        if (i >= this.e) {
            return new pvq(this.e, Arrays.copyOf(this.f7315R, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f7315R[i];
    }

    @Override // defpackage.vB, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        R();
        c(i);
        Object[] objArr = this.f7315R;
        Object obj = objArr[i];
        int i2 = this.e;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.e--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        R();
        c(i);
        Object[] objArr = this.f7315R;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        R();
        if (i < 0 || i > (i2 = this.e)) {
            StringBuilder C = opT.C("Index:", i, ", Size:");
            C.append(this.e);
            throw new IndexOutOfBoundsException(C.toString());
        }
        Object[] objArr = this.f7315R;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f7315R, i, objArr2, i + 1, this.e - i);
            this.f7315R = objArr2;
        }
        this.f7315R[i] = obj;
        this.e++;
        ((AbstractList) this).modCount++;
    }
}
