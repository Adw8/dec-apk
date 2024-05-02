package defpackage;

import java.util.NoSuchElementException;

/* renamed from: cVf  reason: default package */
/* loaded from: classes.dex */
public final class cVf extends nQ {
    public int O;
    public boolean R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f2112R;

    public cVf(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.O = i3;
        Object[] objArr2 = new Object[i3];
        this.f2112R = objArr2;
        boolean z = i == i2;
        this.R = z;
        objArr2[0] = objArr;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        v(i - i4, 1);
    }

    public final Object R() {
        return ((Object[]) this.f2112R[this.O - 1])[this.e & 31];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i;
        if (hasNext()) {
            Object R = R();
            int i2 = this.e + 1;
            this.e = i2;
            if (i2 == this.X) {
                this.R = true;
                return R;
            }
            int i3 = 0;
            while (true) {
                i = this.e;
                if (((i >> i3) & 31) != 0) {
                    break;
                }
                i3 += 5;
            }
            if (i3 > 0) {
                v(i, ((this.O - 1) - (i3 / 5)) + 1);
            }
            return R;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i;
        if (hasPrevious()) {
            this.e--;
            int i2 = 0;
            if (this.R) {
                this.R = false;
                return R();
            }
            while (true) {
                i = this.e;
                if (((i >> i2) & 31) != 31) {
                    break;
                }
                i2 += 5;
            }
            if (i2 > 0) {
                v(i, ((this.O - 1) - (i2 / 5)) + 1);
            }
            return R();
        }
        throw new NoSuchElementException();
    }

    public final void v(int i, int i2) {
        int i3 = (this.O - i2) * 5;
        while (i2 < this.O) {
            Object[] objArr = this.f2112R;
            objArr[i2] = objArr[i2 - 1][(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }
}
