package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: efZ  reason: default package */
/* loaded from: classes.dex */
public final class efZ extends AbstractList implements c1n, RandomAccess {
    public final c1n R;

    public efZ(c1n c1n) {
        this.R = c1n;
    }

    @Override // defpackage.c1n
    public final c1n N() {
        return this;
    }

    @Override // defpackage.c1n
    public final void O(MH mh) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.c1n
    public final Object U(int i) {
        return this.R.U(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.R.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new iYX(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new hAY(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.R.size();
    }

    @Override // defpackage.c1n
    public final List y() {
        return this.R.y();
    }
}
