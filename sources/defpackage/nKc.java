package defpackage;

import java.util.Iterator;

/* renamed from: nKc  reason: default package */
/* loaded from: classes.dex */
public final class nKc extends oYW {
    public final transient gMq R;
    public final transient aOn v;

    public nKc(gMq gmq, nQ9 nq9) {
        this.R = gmq;
        this.v = nq9;
    }

    @Override // defpackage.oYW, defpackage.dNA
    public final aOn H() {
        return this.v;
    }

    @Override // defpackage.dNA
    public final int R(Object[] objArr) {
        return this.v.R(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.R.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.v.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((fjX) this.R).e;
    }
}
