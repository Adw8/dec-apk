package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: eWZ  reason: default package */
/* loaded from: classes.dex */
public abstract class eWZ implements ListIterator, Iterator {
    public final void R() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        R();
        throw null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
