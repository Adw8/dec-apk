package defpackage;

import java.util.Iterator;

/* renamed from: lkQ  reason: default package */
/* loaded from: classes.dex */
public final class lkQ implements Iterator {
    public Iterator R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5809R;
    public int e = -1;

    public lkQ(fGq fgq) {
    }

    public final Iterator R() {
        if (this.R != null) {
            return this.R;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f5809R = true;
        this.e++;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f5809R) {
            this.f5809R = false;
            int i = fGq.e;
            throw null;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
