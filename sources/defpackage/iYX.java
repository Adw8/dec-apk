package defpackage;

import java.util.Iterator;

/* renamed from: iYX  reason: default package */
/* loaded from: classes.dex */
public final class iYX implements Iterator {
    public Iterator R;

    public iYX(efZ efz) {
        this.R = efz.R.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.R.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.R.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
