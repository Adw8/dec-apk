package defpackage;

import java.util.Iterator;

/* renamed from: d6i  reason: default package */
/* loaded from: classes.dex */
public final class d6i implements Iterator, dsi {
    public final Iterator R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ k0v f2490R;

    public d6i(k0v k0v) {
        this.f2490R = k0v;
        this.R = ((pvc) k0v.f5179R).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.R.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f2490R.f5180R.x(this.R.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
