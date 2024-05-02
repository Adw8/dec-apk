package defpackage;

import java.util.NoSuchElementException;

/* renamed from: m3m  reason: default package */
/* loaded from: classes.dex */
public final class m3m extends eWZ {
    public final aOn R;
    public int X;
    public final int e;

    public m3m(aOn aon, int i) {
        int size = aon.size();
        hDC.D(i, size);
        this.e = size;
        this.X = i;
        this.R = aon;
    }

    /* renamed from: X */
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.X - 1;
            this.X = i;
            return this.R.get(i);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    public final boolean hasPrevious() {
        return this.X > 0;
    }

    /* renamed from: e */
    public final Object next() {
        if (hasNext()) {
            int i = this.X;
            this.X = i + 1;
            return this.R.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.X;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.X - 1;
    }

    /* renamed from: v */
    public final boolean hasNext() {
        return this.X < this.e;
    }
}
