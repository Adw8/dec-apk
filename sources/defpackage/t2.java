package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: t2  reason: default package */
/* loaded from: classes.dex */
public abstract class t2 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        Th th = (Th) this;
        int i = th.e;
        if (i < th.X) {
            th.e = i + 1;
            return Byte.valueOf(th.R.P(i));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
