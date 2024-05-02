package defpackage;

import java.util.Iterator;

/* renamed from: ppg  reason: default package */
/* loaded from: classes.dex */
public final class ppg implements Iterator, dsi {
    public final /* synthetic */ mdh R;
    public final /* synthetic */ int X;
    public int e;

    public ppg(int i, int i2, mdh mdh) {
        this.X = i2;
        this.R = mdh;
        this.e = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.X;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            return null;
        }
        mdh mdh = this.R;
        Object[] objArr = mdh.f6093R;
        int i = this.e;
        this.e = i + 1;
        return objArr[mdh.Z(i)];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
