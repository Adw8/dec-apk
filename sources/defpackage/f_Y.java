package defpackage;

import java.util.NoSuchElementException;

/* renamed from: f_Y  reason: default package */
/* loaded from: classes.dex */
public final class f_Y extends nQ {
    public final cVf R;

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f3446R;

    public f_Y(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.f3446R = objArr2;
        int i4 = (i2 - 1) & -32;
        this.R = new cVf(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        } else if (this.R.hasNext()) {
            this.e++;
            return this.R.next();
        } else {
            Object[] objArr = this.f3446R;
            int i = this.e;
            this.e = i + 1;
            return objArr[i - this.R.X];
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.e;
            cVf cvf = this.R;
            int i2 = cvf.X;
            if (i > i2) {
                Object[] objArr = this.f3446R;
                int i3 = i - 1;
                this.e = i3;
                return objArr[i3 - i2];
            }
            this.e = i - 1;
            return cvf.previous();
        }
        throw new NoSuchElementException();
    }
}
