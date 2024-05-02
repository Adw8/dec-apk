package defpackage;

import java.util.NoSuchElementException;

/* renamed from: WY  reason: default package */
/* loaded from: classes.dex */
public final class WY extends nQ {
    public final /* synthetic */ int O = 0;
    public final Object R;

    public WY(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.R = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.O) {
            case 0:
                if (hasNext()) {
                    int i = this.e;
                    this.e = i + 1;
                    return ((Object[]) this.R)[i];
                }
                throw new NoSuchElementException();
            default:
                if (hasNext()) {
                    this.e++;
                    return this.R;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.O) {
            case 0:
                if (hasPrevious()) {
                    int i = this.e - 1;
                    this.e = i;
                    return ((Object[]) this.R)[i];
                }
                throw new NoSuchElementException();
            default:
                if (hasPrevious()) {
                    this.e--;
                    return this.R;
                }
                throw new NoSuchElementException();
        }
    }

    public WY(int i, Object obj) {
        super(i, 1);
        this.R = obj;
    }
}
