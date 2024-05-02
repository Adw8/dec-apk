package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: n_E  reason: default package */
/* loaded from: classes.dex */
public final class n_E extends AbstractCollection implements oOL {
    public final mWd R;

    public n_E(mWd mwd) {
        this.R = mwd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.R.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.R.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new j0O(1, this.R);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.R.X;
    }
}
