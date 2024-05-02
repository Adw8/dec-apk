package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: ye  reason: default package */
/* loaded from: classes.dex */
public abstract class ye extends Uk implements oOh {
    @Override // defpackage.oOh
    public oOh X(Collection collection) {
        h3d j = j();
        j.addAll(collection);
        return j.c();
    }

    @Override // defpackage.U1, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.U1, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.Uk, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.Uk, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.Uk, java.util.List
    public final List subList(int i, int i2) {
        return new gOJ(this, i, i2);
    }
}
