package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: fZs  reason: default package */
/* loaded from: classes.dex */
public final class fZs extends vB implements c1n, RandomAccess {
    public final ArrayList R;

    static {
        ((vB) new fZs(10)).R = false;
    }

    public fZs(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.c1n
    public final c1n N() {
        return super.R ? new efZ(this) : this;
    }

    @Override // defpackage.c1n
    public final void O(MH mh) {
        R();
        this.R.add(mh);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.c1n
    public final Object U(int i) {
        return this.R.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        R();
        this.R.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.vB, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.vB, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final void clear() {
        R();
        this.R.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.aFq
    public final aFq e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.R);
            return new fZs(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        Object obj = this.R.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            str = b0Var.i();
            MH mh = (MH) b0Var;
            int V = mh.V();
            if (d_A.X(mh.R, V, mh.size() + V)) {
                this.R.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, ibk.v);
            boolean z = false;
            if (d_A.R.e(0, bArr.length, bArr) == 0) {
                z = true;
            }
            if (z) {
                this.R.set(i, str);
            }
        }
        return str;
    }

    @Override // defpackage.vB, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        R();
        Object remove = this.R.remove(i);
        ((AbstractList) this).modCount++;
        return remove instanceof String ? (String) remove : remove instanceof b0 ? ((b0) remove).i() : new String((byte[]) remove, ibk.v);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        R();
        Object obj2 = this.R.set(i, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof b0 ? ((b0) obj2).i() : new String((byte[]) obj2, ibk.v);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.R.size();
    }

    @Override // defpackage.c1n
    public final List y() {
        return Collections.unmodifiableList(this.R);
    }

    public fZs(ArrayList arrayList) {
        this.R = arrayList;
    }

    @Override // defpackage.vB, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        R();
        if (collection instanceof c1n) {
            collection = ((c1n) collection).y();
        }
        boolean addAll = this.R.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
