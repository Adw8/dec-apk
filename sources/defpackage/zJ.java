package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: zJ  reason: default package */
/* loaded from: classes.dex */
public final class zJ implements Iterator {
    public final Object[] R;
    public int e = 0;

    public zJ(Object[] objArr) {
        this.R = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.R.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object[] objArr = this.R;
        if (i != objArr.length) {
            this.e = i + 1;
            return objArr[i];
        }
        StringBuilder U = opT.U("Out of elements: ");
        U.append(this.e);
        throw new NoSuchElementException(U.toString());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}
